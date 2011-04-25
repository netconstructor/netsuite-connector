/**
 * NetSuiteBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class NetSuiteBindingStub extends org.apache.axis.client.Stub implements org.mule.module.netsuite.api.internal.NetSuitePortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[41];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("login");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "passport"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "Passport"), org.mule.module.netsuite.api.internal.Passport.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "SessionResponse"));
        oper.setReturnClass(org.mule.module.netsuite.api.internal.SessionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "sessionResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidVersionFault"),
                      "org.mule.module.netsuite.api.internal.InvalidVersionFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidVersionFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidCredentialsFault"),
                      "org.mule.module.netsuite.api.internal.InvalidCredentialsFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidCredentialsFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "insufficientPermissionFault"),
                      "org.mule.module.netsuite.api.internal.InsufficientPermissionFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InsufficientPermissionFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestLimitFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestLimitFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "unexpectedErrorFault"),
                      "org.mule.module.netsuite.api.internal.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidAccountFault"),
                      "org.mule.module.netsuite.api.internal.InvalidAccountFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidAccountFault"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ssoLogin");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "ssoPassport"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SsoPassport"), org.mule.module.netsuite.api.internal.SsoPassport.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "SessionResponse"));
        oper.setReturnClass(org.mule.module.netsuite.api.internal.SessionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "sessionResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidVersionFault"),
                      "org.mule.module.netsuite.api.internal.InvalidVersionFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidVersionFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidCredentialsFault"),
                      "org.mule.module.netsuite.api.internal.InvalidCredentialsFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidCredentialsFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "insufficientPermissionFault"),
                      "org.mule.module.netsuite.api.internal.InsufficientPermissionFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InsufficientPermissionFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestLimitFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestLimitFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "unexpectedErrorFault"),
                      "org.mule.module.netsuite.api.internal.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidAccountFault"),
                      "org.mule.module.netsuite.api.internal.InvalidAccountFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidAccountFault"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("mapSso");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "ssoCredentials"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SsoCredentials"), org.mule.module.netsuite.api.internal.SsoCredentials.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "SessionResponse"));
        oper.setReturnClass(org.mule.module.netsuite.api.internal.SessionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "sessionResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidVersionFault"),
                      "org.mule.module.netsuite.api.internal.InvalidVersionFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidVersionFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidCredentialsFault"),
                      "org.mule.module.netsuite.api.internal.InvalidCredentialsFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidCredentialsFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "insufficientPermissionFault"),
                      "org.mule.module.netsuite.api.internal.InsufficientPermissionFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InsufficientPermissionFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestLimitFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestLimitFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "unexpectedErrorFault"),
                      "org.mule.module.netsuite.api.internal.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidAccountFault"),
                      "org.mule.module.netsuite.api.internal.InvalidAccountFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidAccountFault"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("changePasswordOrEmail");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "changePasswordOrEmailCredentials"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "ChangePasswordOrEmailCredentials"), org.mule.module.netsuite.api.internal.ChangePasswordOrEmailCredentials.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "SessionResponse"));
        oper.setReturnClass(org.mule.module.netsuite.api.internal.SessionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "sessionResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidVersionFault"),
                      "org.mule.module.netsuite.api.internal.InvalidVersionFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidVersionFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidCredentialsFault"),
                      "org.mule.module.netsuite.api.internal.InvalidCredentialsFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidCredentialsFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "insufficientPermissionFault"),
                      "org.mule.module.netsuite.api.internal.InsufficientPermissionFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InsufficientPermissionFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestLimitFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestLimitFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "unexpectedErrorFault"),
                      "org.mule.module.netsuite.api.internal.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidAccountFault"),
                      "org.mule.module.netsuite.api.internal.InvalidAccountFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidAccountFault"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("logout");
        oper.setReturnType(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "SessionResponse"));
        oper.setReturnClass(org.mule.module.netsuite.api.internal.SessionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "sessionResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestLimitFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestLimitFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "unexpectedErrorFault"),
                      "org.mule.module.netsuite.api.internal.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidSessionFault"),
                      "org.mule.module.netsuite.api.internal.InvalidSessionFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidSessionFault"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("add");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "record"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "Record"), org.mule.module.netsuite.api.internal.Record.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "WriteResponse"));
        oper.setReturnClass(org.mule.module.netsuite.api.internal.WriteResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "writeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestSizeFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestSizeFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestSizeFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidCredentialsFault"),
                      "org.mule.module.netsuite.api.internal.InvalidCredentialsFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidCredentialsFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededUsageLimitFault"),
                      "org.mule.module.netsuite.api.internal.ExceededUsageLimitFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededUsageLimitFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestLimitFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestLimitFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRecordCountFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRecordCountFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRecordCountFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "unexpectedErrorFault"),
                      "org.mule.module.netsuite.api.internal.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidSessionFault"),
                      "org.mule.module.netsuite.api.internal.InvalidSessionFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidSessionFault"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("delete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "baseRef"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "BaseRef"), org.mule.module.netsuite.api.internal.BaseRef.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "WriteResponse"));
        oper.setReturnClass(org.mule.module.netsuite.api.internal.WriteResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "writeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestSizeFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestSizeFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestSizeFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidCredentialsFault"),
                      "org.mule.module.netsuite.api.internal.InvalidCredentialsFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidCredentialsFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededUsageLimitFault"),
                      "org.mule.module.netsuite.api.internal.ExceededUsageLimitFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededUsageLimitFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestLimitFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestLimitFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRecordCountFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRecordCountFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRecordCountFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "unexpectedErrorFault"),
                      "org.mule.module.netsuite.api.internal.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidSessionFault"),
                      "org.mule.module.netsuite.api.internal.InvalidSessionFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidSessionFault"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("search");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "searchRecord"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchRecord"), org.mule.module.netsuite.api.internal.SearchRecord.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchResult"));
        oper.setReturnClass(org.mule.module.netsuite.api.internal.SearchResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "searchResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestSizeFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestSizeFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestSizeFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidCredentialsFault"),
                      "org.mule.module.netsuite.api.internal.InvalidCredentialsFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidCredentialsFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededUsageLimitFault"),
                      "org.mule.module.netsuite.api.internal.ExceededUsageLimitFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededUsageLimitFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestLimitFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestLimitFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRecordCountFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRecordCountFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRecordCountFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "unexpectedErrorFault"),
                      "org.mule.module.netsuite.api.internal.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidSessionFault"),
                      "org.mule.module.netsuite.api.internal.InvalidSessionFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidSessionFault"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchMore");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "pageIndex"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchResult"));
        oper.setReturnClass(org.mule.module.netsuite.api.internal.SearchResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "searchResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestSizeFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestSizeFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestSizeFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededUsageLimitFault"),
                      "org.mule.module.netsuite.api.internal.ExceededUsageLimitFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededUsageLimitFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestLimitFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestLimitFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRecordCountFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRecordCountFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRecordCountFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "unexpectedErrorFault"),
                      "org.mule.module.netsuite.api.internal.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidSessionFault"),
                      "org.mule.module.netsuite.api.internal.InvalidSessionFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidSessionFault"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchMoreWithId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "searchId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "pageIndex"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchResult"));
        oper.setReturnClass(org.mule.module.netsuite.api.internal.SearchResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "searchResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestSizeFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestSizeFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestSizeFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidCredentialsFault"),
                      "org.mule.module.netsuite.api.internal.InvalidCredentialsFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidCredentialsFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededUsageLimitFault"),
                      "org.mule.module.netsuite.api.internal.ExceededUsageLimitFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededUsageLimitFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestLimitFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestLimitFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRecordCountFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRecordCountFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRecordCountFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "unexpectedErrorFault"),
                      "org.mule.module.netsuite.api.internal.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidSessionFault"),
                      "org.mule.module.netsuite.api.internal.InvalidSessionFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidSessionFault"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchNext");
        oper.setReturnType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchResult"));
        oper.setReturnClass(org.mule.module.netsuite.api.internal.SearchResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "searchResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestSizeFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestSizeFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestSizeFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededUsageLimitFault"),
                      "org.mule.module.netsuite.api.internal.ExceededUsageLimitFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededUsageLimitFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestLimitFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestLimitFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRecordCountFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRecordCountFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRecordCountFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "unexpectedErrorFault"),
                      "org.mule.module.netsuite.api.internal.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidSessionFault"),
                      "org.mule.module.netsuite.api.internal.InvalidSessionFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidSessionFault"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("update");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "record"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "Record"), org.mule.module.netsuite.api.internal.Record.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "WriteResponse"));
        oper.setReturnClass(org.mule.module.netsuite.api.internal.WriteResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "writeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestSizeFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestSizeFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestSizeFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidCredentialsFault"),
                      "org.mule.module.netsuite.api.internal.InvalidCredentialsFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidCredentialsFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededUsageLimitFault"),
                      "org.mule.module.netsuite.api.internal.ExceededUsageLimitFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededUsageLimitFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestLimitFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestLimitFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRecordCountFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRecordCountFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRecordCountFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "unexpectedErrorFault"),
                      "org.mule.module.netsuite.api.internal.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidSessionFault"),
                      "org.mule.module.netsuite.api.internal.InvalidSessionFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidSessionFault"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "record"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "Record"), org.mule.module.netsuite.api.internal.Record[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "WriteResponseList"));
        oper.setReturnClass(org.mule.module.netsuite.api.internal.WriteResponseList.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "writeResponseList"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestSizeFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestSizeFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestSizeFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidCredentialsFault"),
                      "org.mule.module.netsuite.api.internal.InvalidCredentialsFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidCredentialsFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededUsageLimitFault"),
                      "org.mule.module.netsuite.api.internal.ExceededUsageLimitFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededUsageLimitFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestLimitFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestLimitFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRecordCountFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRecordCountFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRecordCountFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "unexpectedErrorFault"),
                      "org.mule.module.netsuite.api.internal.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidSessionFault"),
                      "org.mule.module.netsuite.api.internal.InvalidSessionFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidSessionFault"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "baseRef"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "BaseRef"), org.mule.module.netsuite.api.internal.BaseRef[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "WriteResponseList"));
        oper.setReturnClass(org.mule.module.netsuite.api.internal.WriteResponseList.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "writeResponseList"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestSizeFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestSizeFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestSizeFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidCredentialsFault"),
                      "org.mule.module.netsuite.api.internal.InvalidCredentialsFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidCredentialsFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededUsageLimitFault"),
                      "org.mule.module.netsuite.api.internal.ExceededUsageLimitFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededUsageLimitFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestLimitFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestLimitFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRecordCountFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRecordCountFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRecordCountFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "unexpectedErrorFault"),
                      "org.mule.module.netsuite.api.internal.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidSessionFault"),
                      "org.mule.module.netsuite.api.internal.InvalidSessionFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidSessionFault"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "record"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "Record"), org.mule.module.netsuite.api.internal.Record[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "WriteResponseList"));
        oper.setReturnClass(org.mule.module.netsuite.api.internal.WriteResponseList.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "writeResponseList"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestSizeFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestSizeFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestSizeFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidCredentialsFault"),
                      "org.mule.module.netsuite.api.internal.InvalidCredentialsFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidCredentialsFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededUsageLimitFault"),
                      "org.mule.module.netsuite.api.internal.ExceededUsageLimitFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededUsageLimitFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestLimitFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestLimitFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRecordCountFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRecordCountFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRecordCountFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "unexpectedErrorFault"),
                      "org.mule.module.netsuite.api.internal.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidSessionFault"),
                      "org.mule.module.netsuite.api.internal.InvalidSessionFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidSessionFault"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "baseRef"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "BaseRef"), org.mule.module.netsuite.api.internal.BaseRef.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "ReadResponse"));
        oper.setReturnClass(org.mule.module.netsuite.api.internal.ReadResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "readResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestSizeFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestSizeFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestSizeFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidCredentialsFault"),
                      "org.mule.module.netsuite.api.internal.InvalidCredentialsFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidCredentialsFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededUsageLimitFault"),
                      "org.mule.module.netsuite.api.internal.ExceededUsageLimitFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededUsageLimitFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestLimitFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestLimitFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRecordCountFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRecordCountFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRecordCountFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "unexpectedErrorFault"),
                      "org.mule.module.netsuite.api.internal.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidSessionFault"),
                      "org.mule.module.netsuite.api.internal.InvalidSessionFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidSessionFault"), 
                      true
                     ));
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "baseRef"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "BaseRef"), org.mule.module.netsuite.api.internal.BaseRef[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "ReadResponseList"));
        oper.setReturnClass(org.mule.module.netsuite.api.internal.ReadResponseList.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "readResponseList"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestSizeFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestSizeFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestSizeFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidCredentialsFault"),
                      "org.mule.module.netsuite.api.internal.InvalidCredentialsFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidCredentialsFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededUsageLimitFault"),
                      "org.mule.module.netsuite.api.internal.ExceededUsageLimitFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededUsageLimitFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestLimitFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestLimitFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRecordCountFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRecordCountFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRecordCountFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "unexpectedErrorFault"),
                      "org.mule.module.netsuite.api.internal.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidSessionFault"),
                      "org.mule.module.netsuite.api.internal.InvalidSessionFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidSessionFault"), 
                      true
                     ));
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAll");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "record"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "GetAllRecord"), org.mule.module.netsuite.api.internal.GetAllRecord.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "GetAllResult"));
        oper.setReturnClass(org.mule.module.netsuite.api.internal.GetAllResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "getAllResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestSizeFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestSizeFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestSizeFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidCredentialsFault"),
                      "org.mule.module.netsuite.api.internal.InvalidCredentialsFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidCredentialsFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededUsageLimitFault"),
                      "org.mule.module.netsuite.api.internal.ExceededUsageLimitFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededUsageLimitFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestLimitFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestLimitFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRecordCountFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRecordCountFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRecordCountFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "unexpectedErrorFault"),
                      "org.mule.module.netsuite.api.internal.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidSessionFault"),
                      "org.mule.module.netsuite.api.internal.InvalidSessionFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidSessionFault"), 
                      true
                     ));
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSavedSearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "record"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "GetSavedSearchRecord"), org.mule.module.netsuite.api.internal.GetSavedSearchRecord.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "GetSavedSearchResult"));
        oper.setReturnClass(org.mule.module.netsuite.api.internal.GetSavedSearchResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "getSavedSearchResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestSizeFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestSizeFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestSizeFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidCredentialsFault"),
                      "org.mule.module.netsuite.api.internal.InvalidCredentialsFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidCredentialsFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededUsageLimitFault"),
                      "org.mule.module.netsuite.api.internal.ExceededUsageLimitFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededUsageLimitFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestLimitFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestLimitFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRecordCountFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRecordCountFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRecordCountFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "unexpectedErrorFault"),
                      "org.mule.module.netsuite.api.internal.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidSessionFault"),
                      "org.mule.module.netsuite.api.internal.InvalidSessionFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidSessionFault"), 
                      true
                     ));
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCustomizationId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "customizationType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "CustomizationType"), org.mule.module.netsuite.api.internal.CustomizationType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "includeInactives"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "GetCustomizationIdResult"));
        oper.setReturnClass(org.mule.module.netsuite.api.internal.GetCustomizationIdResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "getCustomizationIdResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestSizeFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestSizeFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestSizeFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidCredentialsFault"),
                      "org.mule.module.netsuite.api.internal.InvalidCredentialsFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidCredentialsFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededUsageLimitFault"),
                      "org.mule.module.netsuite.api.internal.ExceededUsageLimitFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededUsageLimitFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestLimitFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestLimitFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRecordCountFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRecordCountFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRecordCountFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "unexpectedErrorFault"),
                      "org.mule.module.netsuite.api.internal.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidSessionFault"),
                      "org.mule.module.netsuite.api.internal.InvalidSessionFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidSessionFault"), 
                      true
                     ));
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("initialize");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "initializeRecord"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "InitializeRecord"), org.mule.module.netsuite.api.internal.InitializeRecord.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "ReadResponse"));
        oper.setReturnClass(org.mule.module.netsuite.api.internal.ReadResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "readResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestSizeFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestSizeFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestSizeFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidCredentialsFault"),
                      "org.mule.module.netsuite.api.internal.InvalidCredentialsFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidCredentialsFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededUsageLimitFault"),
                      "org.mule.module.netsuite.api.internal.ExceededUsageLimitFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededUsageLimitFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestLimitFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestLimitFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRecordCountFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRecordCountFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRecordCountFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "unexpectedErrorFault"),
                      "org.mule.module.netsuite.api.internal.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidSessionFault"),
                      "org.mule.module.netsuite.api.internal.InvalidSessionFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidSessionFault"), 
                      true
                     ));
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("initializeList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "initializeRecord"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "InitializeRecord"), org.mule.module.netsuite.api.internal.InitializeRecord[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "ReadResponseList"));
        oper.setReturnClass(org.mule.module.netsuite.api.internal.ReadResponseList.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "readResponseList"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestSizeFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestSizeFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestSizeFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidCredentialsFault"),
                      "org.mule.module.netsuite.api.internal.InvalidCredentialsFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidCredentialsFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededUsageLimitFault"),
                      "org.mule.module.netsuite.api.internal.ExceededUsageLimitFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededUsageLimitFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestLimitFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestLimitFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRecordCountFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRecordCountFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRecordCountFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "unexpectedErrorFault"),
                      "org.mule.module.netsuite.api.internal.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidSessionFault"),
                      "org.mule.module.netsuite.api.internal.InvalidSessionFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidSessionFault"), 
                      true
                     ));
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSelectValue");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "fieldDescription"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "GetSelectValueFieldDescription"), org.mule.module.netsuite.api.internal.GetSelectValueFieldDescription.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "pageIndex"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "GetSelectValueResult"));
        oper.setReturnClass(org.mule.module.netsuite.api.internal.GetSelectValueResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "getSelectValueResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestSizeFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestSizeFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestSizeFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidCredentialsFault"),
                      "org.mule.module.netsuite.api.internal.InvalidCredentialsFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidCredentialsFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededUsageLimitFault"),
                      "org.mule.module.netsuite.api.internal.ExceededUsageLimitFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededUsageLimitFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestLimitFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestLimitFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRecordCountFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRecordCountFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRecordCountFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "unexpectedErrorFault"),
                      "org.mule.module.netsuite.api.internal.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidSessionFault"),
                      "org.mule.module.netsuite.api.internal.InvalidSessionFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidSessionFault"), 
                      true
                     ));
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getItemAvailability");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "itemAvailabilityFilter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "ItemAvailabilityFilter"), org.mule.module.netsuite.api.internal.ItemAvailabilityFilter.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "GetItemAvailabilityResult"));
        oper.setReturnClass(org.mule.module.netsuite.api.internal.GetItemAvailabilityResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "getItemAvailabilityResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestSizeFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestSizeFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestSizeFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidCredentialsFault"),
                      "org.mule.module.netsuite.api.internal.InvalidCredentialsFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidCredentialsFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededUsageLimitFault"),
                      "org.mule.module.netsuite.api.internal.ExceededUsageLimitFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededUsageLimitFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestLimitFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestLimitFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRecordCountFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRecordCountFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRecordCountFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "unexpectedErrorFault"),
                      "org.mule.module.netsuite.api.internal.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidSessionFault"),
                      "org.mule.module.netsuite.api.internal.InvalidSessionFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidSessionFault"), 
                      true
                     ));
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getBudgetExchangeRate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "budgetExchangeRateFilter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "BudgetExchangeRateFilter"), org.mule.module.netsuite.api.internal.BudgetExchangeRateFilter.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "GetBudgetExchangeRateResult"));
        oper.setReturnClass(org.mule.module.netsuite.api.internal.GetBudgetExchangeRateResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "getBudgetExchangeRateResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestSizeFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestSizeFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestSizeFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidCredentialsFault"),
                      "org.mule.module.netsuite.api.internal.InvalidCredentialsFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidCredentialsFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededUsageLimitFault"),
                      "org.mule.module.netsuite.api.internal.ExceededUsageLimitFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededUsageLimitFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestLimitFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestLimitFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRecordCountFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRecordCountFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRecordCountFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "unexpectedErrorFault"),
                      "org.mule.module.netsuite.api.internal.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidSessionFault"),
                      "org.mule.module.netsuite.api.internal.InvalidSessionFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidSessionFault"), 
                      true
                     ));
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getConsolidatedExchangeRate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "consolidatedExchangeRateFilter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "ConsolidatedExchangeRateFilter"), org.mule.module.netsuite.api.internal.ConsolidatedExchangeRateFilter.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "GetConsolidatedExchangeRateResult"));
        oper.setReturnClass(org.mule.module.netsuite.api.internal.GetConsolidatedExchangeRateResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "getConsolidatedExchangeRateResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestSizeFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestSizeFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestSizeFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidCredentialsFault"),
                      "org.mule.module.netsuite.api.internal.InvalidCredentialsFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidCredentialsFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededUsageLimitFault"),
                      "org.mule.module.netsuite.api.internal.ExceededUsageLimitFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededUsageLimitFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestLimitFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestLimitFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRecordCountFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRecordCountFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRecordCountFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "unexpectedErrorFault"),
                      "org.mule.module.netsuite.api.internal.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidSessionFault"),
                      "org.mule.module.netsuite.api.internal.InvalidSessionFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidSessionFault"), 
                      true
                     ));
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPostingTransactionSummary");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "fields"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "PostingTransactionSummaryField"), org.mule.module.netsuite.api.internal.PostingTransactionSummaryField.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "filters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "PostingTransactionSummaryFilter"), org.mule.module.netsuite.api.internal.PostingTransactionSummaryFilter.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "pageIndex"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "GetPostingTransactionSummaryResult"));
        oper.setReturnClass(org.mule.module.netsuite.api.internal.GetPostingTransactionSummaryResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "getPostingTransactionSummaryResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestSizeFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestSizeFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestSizeFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidCredentialsFault"),
                      "org.mule.module.netsuite.api.internal.InvalidCredentialsFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidCredentialsFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededUsageLimitFault"),
                      "org.mule.module.netsuite.api.internal.ExceededUsageLimitFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededUsageLimitFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestLimitFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestLimitFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRecordCountFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRecordCountFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRecordCountFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "unexpectedErrorFault"),
                      "org.mule.module.netsuite.api.internal.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidSessionFault"),
                      "org.mule.module.netsuite.api.internal.InvalidSessionFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidSessionFault"), 
                      true
                     ));
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getServerTime");
        oper.setReturnType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "GetServerTimeResult"));
        oper.setReturnClass(org.mule.module.netsuite.api.internal.GetServerTimeResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "getServerTimeResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidCredentialsFault"),
                      "org.mule.module.netsuite.api.internal.InvalidCredentialsFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidCredentialsFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededUsageLimitFault"),
                      "org.mule.module.netsuite.api.internal.ExceededUsageLimitFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededUsageLimitFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestLimitFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestLimitFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "unexpectedErrorFault"),
                      "org.mule.module.netsuite.api.internal.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidSessionFault"),
                      "org.mule.module.netsuite.api.internal.InvalidSessionFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidSessionFault"), 
                      true
                     ));
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("attach");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "attachReference"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "AttachReference"), org.mule.module.netsuite.api.internal.AttachReference.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "WriteResponse"));
        oper.setReturnClass(org.mule.module.netsuite.api.internal.WriteResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "writeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestSizeFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestSizeFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestSizeFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidCredentialsFault"),
                      "org.mule.module.netsuite.api.internal.InvalidCredentialsFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidCredentialsFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededUsageLimitFault"),
                      "org.mule.module.netsuite.api.internal.ExceededUsageLimitFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededUsageLimitFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestLimitFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestLimitFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRecordCountFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRecordCountFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRecordCountFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "unexpectedErrorFault"),
                      "org.mule.module.netsuite.api.internal.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidSessionFault"),
                      "org.mule.module.netsuite.api.internal.InvalidSessionFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidSessionFault"), 
                      true
                     ));
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("detach");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "detachReference"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "DetachReference"), org.mule.module.netsuite.api.internal.DetachReference.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "WriteResponse"));
        oper.setReturnClass(org.mule.module.netsuite.api.internal.WriteResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "writeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestSizeFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestSizeFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestSizeFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidCredentialsFault"),
                      "org.mule.module.netsuite.api.internal.InvalidCredentialsFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidCredentialsFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededUsageLimitFault"),
                      "org.mule.module.netsuite.api.internal.ExceededUsageLimitFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededUsageLimitFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestLimitFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestLimitFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRecordCountFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRecordCountFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRecordCountFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "unexpectedErrorFault"),
                      "org.mule.module.netsuite.api.internal.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidSessionFault"),
                      "org.mule.module.netsuite.api.internal.InvalidSessionFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidSessionFault"), 
                      true
                     ));
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateInviteeStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "updateInviteeStatusReference"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "UpdateInviteeStatusReference"), org.mule.module.netsuite.api.internal.UpdateInviteeStatusReference.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "WriteResponse"));
        oper.setReturnClass(org.mule.module.netsuite.api.internal.WriteResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "writeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestSizeFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestSizeFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestSizeFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidCredentialsFault"),
                      "org.mule.module.netsuite.api.internal.InvalidCredentialsFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidCredentialsFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededUsageLimitFault"),
                      "org.mule.module.netsuite.api.internal.ExceededUsageLimitFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededUsageLimitFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestLimitFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestLimitFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRecordCountFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRecordCountFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRecordCountFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "unexpectedErrorFault"),
                      "org.mule.module.netsuite.api.internal.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidSessionFault"),
                      "org.mule.module.netsuite.api.internal.InvalidSessionFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidSessionFault"), 
                      true
                     ));
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateInviteeStatusList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "updateInviteeStatusReference"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "UpdateInviteeStatusReference"), org.mule.module.netsuite.api.internal.UpdateInviteeStatusReference[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "WriteResponseList"));
        oper.setReturnClass(org.mule.module.netsuite.api.internal.WriteResponseList.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "writeResponseList"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestSizeFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestSizeFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestSizeFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidCredentialsFault"),
                      "org.mule.module.netsuite.api.internal.InvalidCredentialsFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidCredentialsFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededUsageLimitFault"),
                      "org.mule.module.netsuite.api.internal.ExceededUsageLimitFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededUsageLimitFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestLimitFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestLimitFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRecordCountFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRecordCountFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRecordCountFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "unexpectedErrorFault"),
                      "org.mule.module.netsuite.api.internal.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidSessionFault"),
                      "org.mule.module.netsuite.api.internal.InvalidSessionFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidSessionFault"), 
                      true
                     ));
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("asyncAddList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "record"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "Record"), org.mule.module.netsuite.api.internal.Record[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "AsyncStatusResult"));
        oper.setReturnClass(org.mule.module.netsuite.api.internal.AsyncStatusResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "asyncStatusResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestSizeFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestSizeFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestSizeFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidCredentialsFault"),
                      "org.mule.module.netsuite.api.internal.InvalidCredentialsFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidCredentialsFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestLimitFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestLimitFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRecordCountFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRecordCountFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRecordCountFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "unexpectedErrorFault"),
                      "org.mule.module.netsuite.api.internal.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidSessionFault"),
                      "org.mule.module.netsuite.api.internal.InvalidSessionFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidSessionFault"), 
                      true
                     ));
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("asyncUpdateList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "record"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "Record"), org.mule.module.netsuite.api.internal.Record[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "AsyncStatusResult"));
        oper.setReturnClass(org.mule.module.netsuite.api.internal.AsyncStatusResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "asyncStatusResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestSizeFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestSizeFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestSizeFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidCredentialsFault"),
                      "org.mule.module.netsuite.api.internal.InvalidCredentialsFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidCredentialsFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestLimitFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestLimitFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRecordCountFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRecordCountFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRecordCountFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "unexpectedErrorFault"),
                      "org.mule.module.netsuite.api.internal.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidSessionFault"),
                      "org.mule.module.netsuite.api.internal.InvalidSessionFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidSessionFault"), 
                      true
                     ));
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("asyncDeleteList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "baseRef"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "BaseRef"), org.mule.module.netsuite.api.internal.BaseRef[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "AsyncStatusResult"));
        oper.setReturnClass(org.mule.module.netsuite.api.internal.AsyncStatusResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "asyncStatusResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestSizeFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestSizeFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestSizeFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidCredentialsFault"),
                      "org.mule.module.netsuite.api.internal.InvalidCredentialsFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidCredentialsFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestLimitFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestLimitFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRecordCountFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRecordCountFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRecordCountFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "unexpectedErrorFault"),
                      "org.mule.module.netsuite.api.internal.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidSessionFault"),
                      "org.mule.module.netsuite.api.internal.InvalidSessionFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidSessionFault"), 
                      true
                     ));
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("asyncGetList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "baseRef"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "BaseRef"), org.mule.module.netsuite.api.internal.BaseRef[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "AsyncStatusResult"));
        oper.setReturnClass(org.mule.module.netsuite.api.internal.AsyncStatusResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "asyncStatusResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestSizeFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestSizeFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestSizeFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidCredentialsFault"),
                      "org.mule.module.netsuite.api.internal.InvalidCredentialsFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidCredentialsFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestLimitFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestLimitFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRecordCountFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRecordCountFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRecordCountFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "unexpectedErrorFault"),
                      "org.mule.module.netsuite.api.internal.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidSessionFault"),
                      "org.mule.module.netsuite.api.internal.InvalidSessionFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidSessionFault"), 
                      true
                     ));
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("asyncInitializeList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "initializeRecord"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "InitializeRecord"), org.mule.module.netsuite.api.internal.InitializeRecord[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "AsyncStatusResult"));
        oper.setReturnClass(org.mule.module.netsuite.api.internal.AsyncStatusResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "asyncStatusResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestSizeFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestSizeFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestSizeFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidCredentialsFault"),
                      "org.mule.module.netsuite.api.internal.InvalidCredentialsFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidCredentialsFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededUsageLimitFault"),
                      "org.mule.module.netsuite.api.internal.ExceededUsageLimitFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededUsageLimitFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestLimitFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestLimitFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRecordCountFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRecordCountFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRecordCountFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "unexpectedErrorFault"),
                      "org.mule.module.netsuite.api.internal.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidSessionFault"),
                      "org.mule.module.netsuite.api.internal.InvalidSessionFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidSessionFault"), 
                      true
                     ));
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("asyncSearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "searchRecord"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchRecord"), org.mule.module.netsuite.api.internal.SearchRecord.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "AsyncStatusResult"));
        oper.setReturnClass(org.mule.module.netsuite.api.internal.AsyncStatusResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "asyncStatusResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestSizeFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestSizeFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestSizeFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidCredentialsFault"),
                      "org.mule.module.netsuite.api.internal.InvalidCredentialsFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidCredentialsFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestLimitFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestLimitFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRecordCountFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRecordCountFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRecordCountFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "unexpectedErrorFault"),
                      "org.mule.module.netsuite.api.internal.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidSessionFault"),
                      "org.mule.module.netsuite.api.internal.InvalidSessionFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidSessionFault"), 
                      true
                     ));
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAsyncResult");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "jobId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "pageIndex"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "AsyncResult"));
        oper.setReturnClass(org.mule.module.netsuite.api.internal.AsyncResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "asyncResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestSizeFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestSizeFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestSizeFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidCredentialsFault"),
                      "org.mule.module.netsuite.api.internal.InvalidCredentialsFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidCredentialsFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededUsageLimitFault"),
                      "org.mule.module.netsuite.api.internal.ExceededUsageLimitFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededUsageLimitFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestLimitFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestLimitFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRecordCountFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRecordCountFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRecordCountFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "unexpectedErrorFault"),
                      "org.mule.module.netsuite.api.internal.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidSessionFault"),
                      "org.mule.module.netsuite.api.internal.InvalidSessionFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidSessionFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "asyncFault"),
                      "org.mule.module.netsuite.api.internal.AsyncFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "AsyncFault"), 
                      true
                     ));
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("checkAsyncStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "jobId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "AsyncStatusResult"));
        oper.setReturnClass(org.mule.module.netsuite.api.internal.AsyncStatusResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "asyncStatusResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidCredentialsFault"),
                      "org.mule.module.netsuite.api.internal.InvalidCredentialsFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidCredentialsFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestLimitFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestLimitFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "unexpectedErrorFault"),
                      "org.mule.module.netsuite.api.internal.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidSessionFault"),
                      "org.mule.module.netsuite.api.internal.InvalidSessionFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidSessionFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "asyncFault"),
                      "org.mule.module.netsuite.api.internal.AsyncFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "AsyncFault"), 
                      true
                     ));
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDeleted");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "getDeletedFilter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "GetDeletedFilter"), org.mule.module.netsuite.api.internal.GetDeletedFilter.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "GetDeletedResult"));
        oper.setReturnClass(org.mule.module.netsuite.api.internal.GetDeletedResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "getDeletedResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestSizeFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestSizeFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestSizeFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidCredentialsFault"),
                      "org.mule.module.netsuite.api.internal.InvalidCredentialsFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidCredentialsFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededUsageLimitFault"),
                      "org.mule.module.netsuite.api.internal.ExceededUsageLimitFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededUsageLimitFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRequestLimitFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRequestLimitFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "exceededRecordCountFault"),
                      "org.mule.module.netsuite.api.internal.ExceededRecordCountFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRecordCountFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "unexpectedErrorFault"),
                      "org.mule.module.netsuite.api.internal.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "invalidSessionFault"),
                      "org.mule.module.netsuite.api.internal.InvalidSessionFault",
                      new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidSessionFault"), 
                      true
                     ));
        _operations[40] = oper;

    }

    public NetSuiteBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public NetSuiteBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public NetSuiteBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.1");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
        addBindings2();
        addBindings3();
        addBindings4();
        addBindings5();
        addBindings6();
        addBindings7();
        addBindings8();
        addBindings9();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "Account");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.Account.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "AccountingPeriod");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.AccountingPeriod.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "AccountingPeriodSearch");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.AccountingPeriodSearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "AccountingPeriodSearchAdvanced");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.AccountingPeriodSearchAdvanced.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "AccountingPeriodSearchRow");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.AccountingPeriodSearchRow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "AccountSearch");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.AccountSearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "AccountSearchAdvanced");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.AccountSearchAdvanced.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "AccountSearchRow");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.AccountSearchRow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "AccountTranslationList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.AccountTranslationList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "AssemblyItem");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.AssemblyItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "BillingRates");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.BillingRates.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "BillingRatesMatrix");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.BillingRatesMatrix.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "Bin");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.Bin.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "BinSearch");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.BinSearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "BinSearchAdvanced");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.BinSearchAdvanced.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "BinSearchRow");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.BinSearchRow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "BudgetCategory");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.BudgetCategory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "Classification");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.Classification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "ClassificationSearch");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ClassificationSearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "ClassificationSearchAdvanced");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ClassificationSearchAdvanced.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "ClassificationSearchRow");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ClassificationSearchRow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "ClassTranslation");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ClassTranslation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "ClassTranslationList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ClassTranslationList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "ContactCategory");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ContactCategory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "ContactCategorySearch");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ContactCategorySearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "ContactCategorySearchAdvanced");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ContactCategorySearchAdvanced.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "ContactCategorySearchRow");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ContactCategorySearchRow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "ContactRole");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ContactRole.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "ContactRoleSearch");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ContactRoleSearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "ContactRoleSearchAdvanced");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ContactRoleSearchAdvanced.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "ContactRoleSearchRow");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ContactRoleSearchRow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "Currency");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.Currency.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "CustomerCategory");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomerCategory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "CustomerCategorySearch");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomerCategorySearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "CustomerCategorySearchAdvanced");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomerCategorySearchAdvanced.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "CustomerCategorySearchRow");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomerCategorySearchRow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "Department");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.Department.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "DepartmentSearch");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.DepartmentSearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "DepartmentSearchAdvanced");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.DepartmentSearchAdvanced.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "DepartmentSearchRow");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.DepartmentSearchRow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "DescriptionItem");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.DescriptionItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "DiscountItem");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.DiscountItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "DownloadItem");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.DownloadItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "ExpenseCategory");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ExpenseCategory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "ExpenseCategorySearch");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ExpenseCategorySearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "ExpenseCategorySearchAdvanced");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ExpenseCategorySearchAdvanced.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "ExpenseCategorySearchRow");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ExpenseCategorySearchRow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "GiftCertificate");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.GiftCertificate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "GiftCertificateItem");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.GiftCertificateItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "GiftCertificateItemAuthCodes");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.GiftCertificateItemAuthCodes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "GiftCertificateItemAuthCodesList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.GiftCertificateItemAuthCodesList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "GiftCertificateSearch");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.GiftCertificateSearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "GiftCertificateSearchAdvanced");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.GiftCertificateSearchAdvanced.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "GiftCertificateSearchRow");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.GiftCertificateSearchRow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "InventoryItem");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.InventoryItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "InventoryItemBinNumber");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.InventoryItemBinNumber.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "InventoryItemBinNumberList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.InventoryItemBinNumberList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "InventoryItemLocations");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.InventoryItemLocations.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "InventoryItemLocationsList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.InventoryItemLocationsList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "ItemMember");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ItemMember.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "ItemMemberList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ItemMemberList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "ItemOptionsList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ItemOptionsList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "ItemSearch");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ItemSearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "ItemSearchAdvanced");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ItemSearchAdvanced.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "ItemSearchRow");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ItemSearchRow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "ItemVendor");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ItemVendor.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "ItemVendorList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ItemVendorList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "KitItem");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.KitItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "LeadSource");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.LeadSource.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "Location");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.Location.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "LocationSearch");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.LocationSearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "LocationSearchAdvanced");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.LocationSearchAdvanced.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "LocationSearchRow");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.LocationSearchRow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "LotNumberedAssemblyItem");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.LotNumberedAssemblyItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "LotNumberedInventoryItem");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.LotNumberedInventoryItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "LotNumberedInventoryItemLocations");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.LotNumberedInventoryItemLocations.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "LotNumberedInventoryItemLocationsList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.LotNumberedInventoryItemLocationsList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "LotNumberedInventoryItemNumbers");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.LotNumberedInventoryItemNumbers.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "LotNumberedInventoryItemNumbersList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.LotNumberedInventoryItemNumbersList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "MarkupItem");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.MarkupItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "MatrixOptionList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.MatrixOptionList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "NonInventoryPurchaseItem");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.NonInventoryPurchaseItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "NonInventoryResaleItem");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.NonInventoryResaleItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "NonInventorySaleItem");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.NonInventorySaleItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "NoteType");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.NoteType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "NoteTypeSearch");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.NoteTypeSearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "NoteTypeSearchAdvanced");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.NoteTypeSearchAdvanced.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "NoteTypeSearchRow");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.NoteTypeSearchRow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "OtherChargePurchaseItem");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.OtherChargePurchaseItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "OtherChargeResaleItem");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.OtherChargeResaleItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "OtherChargeSaleItem");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.OtherChargeSaleItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "PartnerCategory");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.PartnerCategory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "PartnerCategorySearch");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.PartnerCategorySearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "PartnerCategorySearchAdvanced");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.PartnerCategorySearchAdvanced.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "PartnerCategorySearchRow");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.PartnerCategorySearchRow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "PaymentItem");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.PaymentItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "PaymentMethod");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.PaymentMethod.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "PaymentMethodSearch");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.PaymentMethodSearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "PaymentMethodSearchAdvanced");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.PaymentMethodSearchAdvanced.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "PaymentMethodSearchRow");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.PaymentMethodSearchRow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "PresentationItemList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.PresentationItemList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "Price");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.Price.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "PriceLevel");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.PriceLevel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "PriceLevelSearch");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.PriceLevelSearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "PriceLevelSearchAdvanced");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.PriceLevelSearchAdvanced.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "PriceLevelSearchRow");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.PriceLevelSearchRow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "PriceList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.PriceList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "Pricing");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.Pricing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "PricingMatrix");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.PricingMatrix.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "ProductFeedList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ProductFeedList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "Rate");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.Rate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "RateList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.RateList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "SalesRole");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SalesRole.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "SalesRoleSearch");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SalesRoleSearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "SalesRoleSearchAdvanced");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SalesRoleSearchAdvanced.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "SalesRoleSearchRow");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SalesRoleSearchRow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "SalesTaxItem");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SalesTaxItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "SerializedAssemblyItem");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SerializedAssemblyItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "SerializedInventoryItem");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SerializedInventoryItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "SerializedInventoryItemLocations");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SerializedInventoryItemLocations.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "SerializedInventoryItemLocationsList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SerializedInventoryItemLocationsList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "SerializedInventoryItemNumbers");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SerializedInventoryItemNumbers.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "SerializedInventoryItemNumbersList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SerializedInventoryItemNumbersList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "ServiceItemTaskTemplates");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ServiceItemTaskTemplates.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "ServiceItemTaskTemplatesList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ServiceItemTaskTemplatesList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "ServicePurchaseItem");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ServicePurchaseItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "ServiceResaleItem");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ServiceResaleItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "ServiceSaleItem");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ServiceSaleItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "SiteCategory");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SiteCategory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "SiteCategoryList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SiteCategoryList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "State");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.State.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "Subsidiary");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.Subsidiary.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "SubsidiaryNexus");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SubsidiaryNexus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "SubsidiaryNexusList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SubsidiaryNexusList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "SubsidiarySearch");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SubsidiarySearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "SubsidiarySearchAdvanced");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SubsidiarySearchAdvanced.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "SubsidiarySearchRow");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SubsidiarySearchRow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "SubtotalItem");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SubtotalItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "TaxGroup");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.TaxGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "TaxGroupTaxItem");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.TaxGroupTaxItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "TaxGroupTaxItemList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.TaxGroupTaxItemList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "TaxType");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.TaxType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "TaxTypeNexusesTax");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.TaxTypeNexusesTax.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "TaxTypeNexusesTaxList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.TaxTypeNexusesTaxList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "Term");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.Term.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "TermSearch");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.TermSearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "TermSearchAdvanced");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.TermSearchAdvanced.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "TermSearchRow");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.TermSearchRow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "Translation");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.Translation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "TranslationList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.TranslationList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "UnitsType");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.UnitsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "UnitsTypeSearch");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.UnitsTypeSearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "UnitsTypeSearchAdvanced");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.UnitsTypeSearchAdvanced.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "UnitsTypeSearchRow");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.UnitsTypeSearchRow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "UnitsTypeUom");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.UnitsTypeUom.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "UnitsTypeUomList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.UnitsTypeUomList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "VendorCategory");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.VendorCategory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "VendorCategorySearch");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.VendorCategorySearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "VendorCategorySearchAdvanced");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.VendorCategorySearchAdvanced.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "VendorCategorySearchRow");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.VendorCategorySearchRow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "WinLossReason");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.WinLossReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "WinLossReasonSearch");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.WinLossReasonSearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "WinLossReasonSearchAdvanced");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.WinLossReasonSearchAdvanced.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "WinLossReasonSearchRow");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.WinLossReasonSearchRow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:bank_2010_2.transactions.webservices.netsuite.com", "Check");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.Check.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:bank_2010_2.transactions.webservices.netsuite.com", "CheckExpense");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CheckExpense.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:bank_2010_2.transactions.webservices.netsuite.com", "CheckExpenseList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CheckExpenseList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:bank_2010_2.transactions.webservices.netsuite.com", "CheckItem");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CheckItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:bank_2010_2.transactions.webservices.netsuite.com", "CheckItemList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CheckItemList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:bank_2010_2.transactions.webservices.netsuite.com", "CheckLandedCostList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CheckLandedCostList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "AccountingPeriodSearchBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.AccountingPeriodSearchBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "AccountingPeriodSearchRowBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.AccountingPeriodSearchRowBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "AccountSearchBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.AccountSearchBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "AccountSearchRowBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.AccountSearchRowBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "BillAddress");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.BillAddress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "BinSearchBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.BinSearchBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "BinSearchRowBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.BinSearchRowBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "BudgetSearchBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.BudgetSearchBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "BudgetSearchRowBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.BudgetSearchRowBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "CalendarEventSearchBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CalendarEventSearchBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "CalendarEventSearchRowBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CalendarEventSearchRowBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "CampaignSearchBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CampaignSearchBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "CampaignSearchRowBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CampaignSearchRowBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "ClassificationSearchBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ClassificationSearchBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "ClassificationSearchRowBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ClassificationSearchRowBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "ContactCategorySearchBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ContactCategorySearchBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "ContactCategorySearchRowBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ContactCategorySearchRowBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "ContactRoleSearchBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ContactRoleSearchBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "ContactRoleSearchRowBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ContactRoleSearchRowBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "ContactSearchBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ContactSearchBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "ContactSearchRowBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ContactSearchRowBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "CustomerCategorySearchBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomerCategorySearchBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "CustomerCategorySearchRowBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomerCategorySearchRowBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "CustomerSearchBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomerSearchBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "CustomerSearchRowBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomerSearchRowBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "CustomerStatusSearchBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomerStatusSearchBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "CustomListSearchBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomListSearchBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "CustomListSearchRowBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomListSearchRowBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "CustomRecordSearchBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomRecordSearchBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "CustomRecordSearchRowBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomRecordSearchRowBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings2() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "DepartmentSearchBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.DepartmentSearchBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "DepartmentSearchRowBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.DepartmentSearchRowBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "EmployeeSearchBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.EmployeeSearchBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "EmployeeSearchRowBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.EmployeeSearchRowBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "EntityGroupSearchBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.EntityGroupSearchBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "EntitySearchBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.EntitySearchBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "EntitySearchRowBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.EntitySearchRowBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "ExpenseCategorySearchBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ExpenseCategorySearchBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "ExpenseCategorySearchRowBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ExpenseCategorySearchRowBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "FileSearchBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.FileSearchBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "FileSearchRowBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.FileSearchRowBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "FolderSearchBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.FolderSearchBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "FolderSearchRowBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.FolderSearchRowBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "GiftCertificateSearchBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.GiftCertificateSearchBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "GiftCertificateSearchRowBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.GiftCertificateSearchRowBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "GroupMemberSearchBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.GroupMemberSearchBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "IssueSearchBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.IssueSearchBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "IssueSearchRowBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.IssueSearchRowBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "ItemSearchBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ItemSearchBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "ItemSearchRowBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ItemSearchRowBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "JobSearchBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.JobSearchBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "JobSearchRowBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.JobSearchRowBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "JobStatusSearchBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.JobStatusSearchBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "JobTypeSearchBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.JobTypeSearchBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "LandedCost");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.LandedCost.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "LocationSearchBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.LocationSearchBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "LocationSearchRowBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.LocationSearchRowBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "MessageSearchBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.MessageSearchBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "MessageSearchRowBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.MessageSearchRowBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "NoteSearchBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.NoteSearchBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "NoteSearchRowBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.NoteSearchRowBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "NoteTypeSearchBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.NoteTypeSearchBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "NoteTypeSearchRowBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.NoteTypeSearchRowBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "OpportunitySearchBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.OpportunitySearchBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "OpportunitySearchRowBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.OpportunitySearchRowBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "OriginatingLeadSearchBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.OriginatingLeadSearchBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "OriginatingLeadSearchRowBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.OriginatingLeadSearchRowBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "PartnerCategorySearchBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.PartnerCategorySearchBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "PartnerCategorySearchRowBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.PartnerCategorySearchRowBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "Partners");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.Partners.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "PartnerSearchBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.PartnerSearchBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "PartnerSearchRowBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.PartnerSearchRowBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "PaymentMethodSearchBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.PaymentMethodSearchBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "PaymentMethodSearchRowBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.PaymentMethodSearchRowBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "PhoneCallSearchBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.PhoneCallSearchBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "PhoneCallSearchRowBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.PhoneCallSearchRowBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "PresentationItem");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.PresentationItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "PriceLevelSearchBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.PriceLevelSearchBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "PriceLevelSearchRowBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.PriceLevelSearchRowBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "ProjectTaskAssignmentSearchBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ProjectTaskAssignmentSearchBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "ProjectTaskAssignmentSearchRowBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ProjectTaskAssignmentSearchRowBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "ProjectTaskSearchBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ProjectTaskSearchBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "ProjectTaskSearchRowBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ProjectTaskSearchRowBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "PromotionCodeSearchBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.PromotionCodeSearchBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "PromotionCodeSearchRowBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.PromotionCodeSearchRowBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "SalesRoleSearchBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SalesRoleSearchBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "SalesRoleSearchRowBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SalesRoleSearchRowBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "ShipAddress");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ShipAddress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "SiteCategorySearchBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SiteCategorySearchBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "SolutionSearchBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SolutionSearchBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "SolutionSearchRowBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SolutionSearchRowBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "SubsidiarySearchBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SubsidiarySearchBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "SubsidiarySearchRowBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SubsidiarySearchRowBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "SupportCaseSearchBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SupportCaseSearchBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "SupportCaseSearchRowBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SupportCaseSearchRowBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "TaskSearchBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.TaskSearchBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "TaskSearchRowBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.TaskSearchRowBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "TermSearchBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.TermSearchBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "TermSearchRowBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.TermSearchRowBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "TimeBillSearchBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.TimeBillSearchBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "TimeBillSearchRowBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.TimeBillSearchRowBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "TopicSearchBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.TopicSearchBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "TopicSearchRowBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.TopicSearchRowBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "TransactionSearchBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.TransactionSearchBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "TransactionSearchRowBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.TransactionSearchRowBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "UnitsTypeSearchBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.UnitsTypeSearchBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "UnitsTypeSearchRowBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.UnitsTypeSearchRowBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "VendorCategorySearchBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.VendorCategorySearchBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "VendorCategorySearchRowBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.VendorCategorySearchRowBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "VendorSearchBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.VendorSearchBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "VendorSearchRowBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.VendorSearchRowBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "WinLossReasonSearchBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.WinLossReasonSearchBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "WinLossReasonSearchRowBasic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.WinLossReasonSearchRowBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:communication_2010_2.general.webservices.netsuite.com", "Message");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.Message.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:communication_2010_2.general.webservices.netsuite.com", "MessageMediaItemList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.MessageMediaItemList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:communication_2010_2.general.webservices.netsuite.com", "MessageSearch");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.MessageSearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:communication_2010_2.general.webservices.netsuite.com", "MessageSearchAdvanced");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.MessageSearchAdvanced.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:communication_2010_2.general.webservices.netsuite.com", "MessageSearchRow");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.MessageSearchRow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:communication_2010_2.general.webservices.netsuite.com", "Note");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.Note.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:communication_2010_2.general.webservices.netsuite.com", "NoteSearch");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.NoteSearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:communication_2010_2.general.webservices.netsuite.com", "NoteSearchAdvanced");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.NoteSearchAdvanced.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:communication_2010_2.general.webservices.netsuite.com", "NoteSearchRow");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.NoteSearchRow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "AsyncStatusResult");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.AsyncStatusResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "AttachBasicReference");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.AttachBasicReference.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "AttachContactReference");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.AttachContactReference.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "AttachReference");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.AttachReference.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "BaseRef");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.BaseRef.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "BaseRefList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.BaseRefList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "BooleanCustomFieldRef");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.BooleanCustomFieldRef.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "BudgetExchangeRate");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.BudgetExchangeRate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings3() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "BudgetExchangeRateFilter");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.BudgetExchangeRateFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "BudgetExchangeRateList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.BudgetExchangeRateList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "ChangePasswordOrEmailCredentials");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ChangePasswordOrEmailCredentials.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "ConsolidatedExchangeRate");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ConsolidatedExchangeRate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "ConsolidatedExchangeRateFilter");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ConsolidatedExchangeRateFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "ConsolidatedExchangeRateList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ConsolidatedExchangeRateList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "CustomFieldList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomFieldList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "CustomFieldRef");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomFieldRef.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "CustomizationRef");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomizationRef.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "CustomizationRefList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomizationRefList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "CustomizationType");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomizationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "CustomRecordRef");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomRecordRef.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "DateCustomFieldRef");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.DateCustomFieldRef.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "DeletedRecord");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.DeletedRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "DeletedRecordList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.DeletedRecordList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "DetachBasicReference");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.DetachBasicReference.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "DetachReference");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.DetachReference.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "DoubleCustomFieldRef");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.DoubleCustomFieldRef.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "Duration");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.Duration.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "GetAllRecord");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.GetAllRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "GetAllResult");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.GetAllResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "GetBudgetExchangeRateResult");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.GetBudgetExchangeRateResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "GetConsolidatedExchangeRateResult");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.GetConsolidatedExchangeRateResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "GetCustomizationIdResult");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.GetCustomizationIdResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "GetDeletedFilter");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.GetDeletedFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "GetDeletedResult");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.GetDeletedResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "GetItemAvailabilityResult");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.GetItemAvailabilityResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "GetPostingTransactionSummaryResult");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.GetPostingTransactionSummaryResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "GetSavedSearchRecord");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.GetSavedSearchRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "GetSavedSearchResult");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.GetSavedSearchResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "GetSelectFilterByFieldValue");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.GetSelectFilterByFieldValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "GetSelectFilterByFieldValueList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.GetSelectFilterByFieldValueList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "GetSelectValueFieldDescription");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.GetSelectValueFieldDescription.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "GetSelectValueFilter");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.GetSelectValueFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "GetSelectValueResult");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.GetSelectValueResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "GetServerTimeResult");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.GetServerTimeResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "InitializeAuxRef");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.InitializeAuxRef.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "InitializeRecord");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.InitializeRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "InitializeRef");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.InitializeRef.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "ItemAvailability");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ItemAvailability.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "ItemAvailabilityFilter");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ItemAvailabilityFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "ItemAvailabilityList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ItemAvailabilityList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "ListOrRecordRef");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ListOrRecordRef.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "LongCustomFieldRef");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.LongCustomFieldRef.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "MultiSelectCustomFieldRef");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.MultiSelectCustomFieldRef.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "NullField");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.NullField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "Passport");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.Passport.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "PostingTransactionSummary");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.PostingTransactionSummary.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "PostingTransactionSummaryField");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.PostingTransactionSummaryField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "PostingTransactionSummaryFilter");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.PostingTransactionSummaryFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "PostingTransactionSummaryList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.PostingTransactionSummaryList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "Record");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.Record.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.RecordList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.RecordRef.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRefList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.RecordRefList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanCustomField");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SearchBooleanCustomField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SearchBooleanField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanCustomField");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SearchColumnBooleanCustomField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SearchColumnBooleanField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnCustomField");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SearchColumnCustomField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnCustomFieldList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SearchColumnCustomFieldList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateCustomField");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SearchColumnDateCustomField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SearchColumnDateField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleCustomField");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SearchColumnDoubleCustomField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SearchColumnDoubleField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnEnumMultiSelectCustomField");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SearchColumnEnumMultiSelectCustomField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnEnumSelectField");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnField");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SearchColumnField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnLongCustomField");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SearchColumnLongCustomField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnLongField");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SearchColumnLongField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnMultiSelectCustomField");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SearchColumnMultiSelectCustomField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectCustomField");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SearchColumnSelectCustomField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SearchColumnSelectField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringCustomField");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SearchColumnStringCustomField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SearchColumnStringField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnTextNumberField");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SearchColumnTextNumberField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchCustomField");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SearchCustomField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchCustomFieldList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SearchCustomFieldList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateCustomField");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SearchDateCustomField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SearchDateField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleCustomField");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SearchDoubleCustomField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SearchDoubleField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchEnumMultiSelectCustomField");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SearchEnumMultiSelectCustomField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchEnumMultiSelectField");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchLongCustomField");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SearchLongCustomField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchLongField");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SearchLongField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectCustomField");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SearchMultiSelectCustomField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SearchMultiSelectField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchRecord");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SearchRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchResult");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SearchResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchRow");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SearchRow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchRowList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SearchRowList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringCustomField");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SearchStringCustomField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SearchStringField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchTextNumberField");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SearchTextNumberField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SelectCustomFieldRef");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SelectCustomFieldRef.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SsoCredentials");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SsoCredentials.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SsoPassport");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SsoPassport.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "Status");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.Status.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "StatusDetail");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.StatusDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings4() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "StringCustomFieldRef");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.StringCustomFieldRef.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "UpdateInviteeStatusReference");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.UpdateInviteeStatusReference.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "WsRole");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.WsRole.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "WsRoleList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.WsRoleList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "CashRefund");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CashRefund.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "CashRefundItem");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CashRefundItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "CashRefundItemList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CashRefundItemList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "CashRefundPartnersList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CashRefundPartnersList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "CashRefundSalesTeam");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CashRefundSalesTeam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "CashRefundSalesTeamList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CashRefundSalesTeamList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "CreditMemo");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CreditMemo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "CreditMemoApply");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CreditMemoApply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "CreditMemoApplyList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CreditMemoApplyList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "CreditMemoItem");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CreditMemoItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "CreditMemoItemList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CreditMemoItemList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "CreditMemoPartnersList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CreditMemoPartnersList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "CreditMemoSalesTeam");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CreditMemoSalesTeam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "CreditMemoSalesTeamList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CreditMemoSalesTeamList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "CustomerDeposit");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomerDeposit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "CustomerDepositApply");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomerDepositApply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "CustomerDepositApplyList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomerDepositApplyList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "CustomerPayment");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomerPayment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "CustomerPaymentApply");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomerPaymentApply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "CustomerPaymentApplyList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomerPaymentApplyList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "CustomerPaymentCredit");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomerPaymentCredit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "CustomerPaymentCreditList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomerPaymentCreditList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "CustomerPaymentDeposit");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomerPaymentDeposit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "CustomerPaymentDepositList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomerPaymentDepositList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "CustomerRefund");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomerRefund.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "CustomerRefundApply");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomerRefundApply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "CustomerRefundApplyList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomerRefundApplyList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "CustomerRefundDeposit");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomerRefundDeposit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "CustomerRefundDepositList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomerRefundDepositList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "DepositApplication");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.DepositApplication.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "DepositApplicationApply");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.DepositApplicationApply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "DepositApplicationApplyList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.DepositApplicationApplyList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "ReturnAuthorization");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ReturnAuthorization.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "ReturnAuthorizationItem");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ReturnAuthorizationItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "ReturnAuthorizationItemList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ReturnAuthorizationItemList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "ReturnAuthorizationPartnersList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ReturnAuthorizationPartnersList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "ReturnAuthorizationSalesTeam");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ReturnAuthorizationSalesTeam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "ReturnAuthorizationSalesTeamList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ReturnAuthorizationSalesTeamList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CrmCustomField");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CrmCustomField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CrmCustomFieldFilter");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CrmCustomFieldFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CrmCustomFieldFilterList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CrmCustomFieldFilterList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomFieldDepartmentAccess");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomFieldDepartmentAccess.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomFieldDepartmentAccessList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomFieldDepartmentAccessList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomFieldRoleAccess");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomFieldRoleAccess.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomFieldRoleAccessList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomFieldRoleAccessList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomFieldSubAccess");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomFieldSubAccess.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomFieldSubAccessList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomFieldSubAccessList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomFieldTranslations");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomFieldTranslations.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomFieldTranslationsList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomFieldTranslationsList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomListCustomValue");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomListCustomValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomListCustomValueList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomListCustomValueList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomListSearch");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomListSearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomListSearchRow");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomListSearchRow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomListTranslations");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomListTranslations.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomListTranslationsList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomListTranslationsList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomRecord");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomRecordCustomField");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomRecordCustomField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomRecordCustomFieldFilter");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomRecordCustomFieldFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomRecordCustomFieldFilterList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomRecordCustomFieldFilterList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomRecordSearch");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomRecordSearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomRecordSearchAdvanced");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomRecordSearchAdvanced.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomRecordSearchRow");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomRecordSearchRow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomRecordType");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomRecordType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomRecordTypeChildren");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomRecordTypeChildren.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomRecordTypeChildrenList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomRecordTypeChildrenList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomRecordTypeFieldList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomRecordTypeFieldList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomRecordTypeForms");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomRecordTypeForms.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomRecordTypeFormsList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomRecordTypeFormsList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomRecordTypeLinks");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomRecordTypeLinks.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomRecordTypeLinksList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomRecordTypeLinksList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomRecordTypeManagers");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomRecordTypeManagers.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomRecordTypeManagersList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomRecordTypeManagersList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomRecordTypeOnlineForms");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomRecordTypeOnlineForms.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomRecordTypeOnlineFormsList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomRecordTypeOnlineFormsList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomRecordTypeParents");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomRecordTypeParents.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomRecordTypeParentsList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomRecordTypeParentsList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomRecordTypePermissions");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomRecordTypePermissions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomRecordTypePermissionsList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomRecordTypePermissionsList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomRecordTypeSublists");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomRecordTypeSublists.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomRecordTypeSublistsList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomRecordTypeSublistsList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomRecordTypeTabs");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomRecordTypeTabs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomRecordTypeTabsList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomRecordTypeTabsList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomRecordTypeTranslations");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomRecordTypeTranslations.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomRecordTypeTranslationsList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomRecordTypeTranslationsList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "EntityCustomField");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.EntityCustomField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "EntityCustomFieldFilter");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.EntityCustomFieldFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "EntityCustomFieldFilterList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.EntityCustomFieldFilterList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "FldFilterSelList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.FldFilterSelList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "ItemCustomField");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ItemCustomField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "ItemCustomFieldFilter");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ItemCustomFieldFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "ItemCustomFieldFilterList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ItemCustomFieldFilterList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "ItemNumberCustomField");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ItemNumberCustomField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "ItemNumberCustomFieldFilter");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ItemNumberCustomFieldFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "ItemNumberCustomFieldFilterList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ItemNumberCustomFieldFilterList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "ItemOptionCustomField");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ItemOptionCustomField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings5() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "ItemOptionCustomFieldFilter");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ItemOptionCustomFieldFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "ItemOptionCustomFieldFilterList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ItemOptionCustomFieldFilterList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "ItemsList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ItemsList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "LanguageValue");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.LanguageValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "LanguageValueList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.LanguageValueList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "OtherCustomField");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.OtherCustomField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "OtherCustomFieldFilter");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.OtherCustomFieldFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "OtherCustomFieldFilterList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.OtherCustomFieldFilterList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "TransactionBodyCustomField");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.TransactionBodyCustomField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "TransactionBodyCustomFieldFilter");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.TransactionBodyCustomFieldFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "TransactionBodyCustomFieldFilterList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.TransactionBodyCustomFieldFilterList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "TransactionColumnCustomField");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.TransactionColumnCustomField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "TransactionColumnCustomFieldFilter");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.TransactionColumnCustomFieldFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "TransactionColumnCustomFieldFilterList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.TransactionColumnCustomFieldFilterList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:employees_2010_2.lists.webservices.netsuite.com", "Employee");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.Employee.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:employees_2010_2.lists.webservices.netsuite.com", "EmployeeAddressbook");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.EmployeeAddressbook.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:employees_2010_2.lists.webservices.netsuite.com", "EmployeeAddressbookList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.EmployeeAddressbookList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:employees_2010_2.lists.webservices.netsuite.com", "EmployeeEmergencyContact");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.EmployeeEmergencyContact.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:employees_2010_2.lists.webservices.netsuite.com", "EmployeeEmergencyContactList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.EmployeeEmergencyContactList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:employees_2010_2.lists.webservices.netsuite.com", "EmployeeHrEducation");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.EmployeeHrEducation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:employees_2010_2.lists.webservices.netsuite.com", "EmployeeHrEducationList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.EmployeeHrEducationList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:employees_2010_2.lists.webservices.netsuite.com", "EmployeeRoles");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.EmployeeRoles.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:employees_2010_2.lists.webservices.netsuite.com", "EmployeeRolesList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.EmployeeRolesList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:employees_2010_2.lists.webservices.netsuite.com", "EmployeeSearch");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.EmployeeSearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:employees_2010_2.lists.webservices.netsuite.com", "EmployeeSearchAdvanced");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.EmployeeSearchAdvanced.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:employees_2010_2.lists.webservices.netsuite.com", "EmployeeSearchRow");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.EmployeeSearchRow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:employees_2010_2.lists.webservices.netsuite.com", "EmployeeSubscriptions");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.EmployeeSubscriptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:employees_2010_2.lists.webservices.netsuite.com", "EmployeeSubscriptionsList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.EmployeeSubscriptionsList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:employees_2010_2.transactions.webservices.netsuite.com", "ExpenseReport");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ExpenseReport.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:employees_2010_2.transactions.webservices.netsuite.com", "ExpenseReportExpense");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ExpenseReportExpense.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:employees_2010_2.transactions.webservices.netsuite.com", "ExpenseReportExpenseList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ExpenseReportExpenseList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:employees_2010_2.transactions.webservices.netsuite.com", "TimeBill");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.TimeBill.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:employees_2010_2.transactions.webservices.netsuite.com", "TimeBillSearch");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.TimeBillSearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:employees_2010_2.transactions.webservices.netsuite.com", "TimeBillSearchAdvanced");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.TimeBillSearchAdvanced.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:employees_2010_2.transactions.webservices.netsuite.com", "TimeBillSearchRow");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.TimeBillSearchRow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "AsyncFault");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.AsyncFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRecordCountFault");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ExceededRecordCountFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestLimitFault");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ExceededRequestLimitFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededRequestSizeFault");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ExceededRequestSizeFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "ExceededUsageLimitFault");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ExceededUsageLimitFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InsufficientPermissionFault");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.InsufficientPermissionFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidAccountFault");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.InvalidAccountFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidCredentialsFault");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.InvalidCredentialsFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidSessionFault");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.InvalidSessionFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "InvalidVersionFault");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.InvalidVersionFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "SoapFault");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SoapFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:faults_2010_2.platform.webservices.netsuite.com", "UnexpectedErrorFault");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.UnexpectedErrorFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:filecabinet_2010_2.documents.webservices.netsuite.com", "File");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.File.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:filecabinet_2010_2.documents.webservices.netsuite.com", "FileSearch");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.FileSearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:filecabinet_2010_2.documents.webservices.netsuite.com", "FileSearchAdvanced");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.FileSearchAdvanced.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:filecabinet_2010_2.documents.webservices.netsuite.com", "FileSearchRow");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.FileSearchRow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:filecabinet_2010_2.documents.webservices.netsuite.com", "FileSiteCategory");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.FileSiteCategory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:filecabinet_2010_2.documents.webservices.netsuite.com", "FileSiteCategoryList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.FileSiteCategoryList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:filecabinet_2010_2.documents.webservices.netsuite.com", "Folder");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.Folder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:filecabinet_2010_2.documents.webservices.netsuite.com", "FolderSearch");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.FolderSearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:filecabinet_2010_2.documents.webservices.netsuite.com", "FolderSearchAdvanced");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.FolderSearchAdvanced.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:filecabinet_2010_2.documents.webservices.netsuite.com", "FolderSearchRow");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.FolderSearchRow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:financial_2010_2.transactions.webservices.netsuite.com", "Budget");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.Budget.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:financial_2010_2.transactions.webservices.netsuite.com", "BudgetSearch");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.BudgetSearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:financial_2010_2.transactions.webservices.netsuite.com", "BudgetSearchAdvanced");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.BudgetSearchAdvanced.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:financial_2010_2.transactions.webservices.netsuite.com", "BudgetSearchRow");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.BudgetSearchRow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:general_2010_2.transactions.webservices.netsuite.com", "InterCompanyJournalEntry");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.InterCompanyJournalEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:general_2010_2.transactions.webservices.netsuite.com", "InterCompanyJournalEntryLine");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.InterCompanyJournalEntryLine.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:general_2010_2.transactions.webservices.netsuite.com", "InterCompanyJournalEntryLineList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.InterCompanyJournalEntryLineList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:general_2010_2.transactions.webservices.netsuite.com", "JournalEntry");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.JournalEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:general_2010_2.transactions.webservices.netsuite.com", "JournalEntryLine");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.JournalEntryLine.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:general_2010_2.transactions.webservices.netsuite.com", "JournalEntryLineList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.JournalEntryLineList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "AssemblyBuild");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.AssemblyBuild.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "AssemblyComponent");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.AssemblyComponent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "AssemblyComponentList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.AssemblyComponentList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "AssemblyUnbuild");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.AssemblyUnbuild.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "InterCompanyTransferOrder");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.InterCompanyTransferOrder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "InterCompanyTransferOrderItem");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.InterCompanyTransferOrderItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "InterCompanyTransferOrderItemList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.InterCompanyTransferOrderItemList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "InventoryAdjustment");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.InventoryAdjustment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "InventoryAdjustmentInventory");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.InventoryAdjustmentInventory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "InventoryAdjustmentInventoryList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.InventoryAdjustmentInventoryList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "TransferOrder");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.TransferOrder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "TransferOrderItem");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.TransferOrderItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "TransferOrderItemList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.TransferOrderItemList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "Campaign");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.Campaign.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "CampaignAudience");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CampaignAudience.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "CampaignCategory");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CampaignCategory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "CampaignChannel");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CampaignChannel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "CampaignDirectMail");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CampaignDirectMail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "CampaignDirectMailList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CampaignDirectMailList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "CampaignEmail");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CampaignEmail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "CampaignEmailList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CampaignEmailList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "CampaignEvent");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CampaignEvent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "CampaignEventList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CampaignEventList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "CampaignEventResponse");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CampaignEventResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "CampaignEventResponseList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CampaignEventResponseList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "CampaignFamily");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CampaignFamily.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "CampaignOffer");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CampaignOffer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "CampaignResponse");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CampaignResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "CampaignResponseResponses");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CampaignResponseResponses.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "CampaignResponseResponsesList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CampaignResponseResponsesList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "CampaignSearch");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CampaignSearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "CampaignSearchAdvanced");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CampaignSearchAdvanced.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "CampaignSearchEngine");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CampaignSearchEngine.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings6() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "CampaignSearchRow");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CampaignSearchRow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "CampaignSubscription");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CampaignSubscription.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "CampaignVertical");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CampaignVertical.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "PromotionCode");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.PromotionCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "PromotionCodeCurrency");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.PromotionCodeCurrency.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "PromotionCodeCurrencyList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.PromotionCodeCurrencyList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "PromotionCodeItems");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.PromotionCodeItems.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "PromotionCodeItemsList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.PromotionCodeItemsList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "PromotionCodePartners");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.PromotionCodePartners.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "PromotionCodePartnersList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.PromotionCodePartnersList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "PromotionCodeSearch");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.PromotionCodeSearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "PromotionCodeSearchAdvanced");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.PromotionCodeSearchAdvanced.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "PromotionCodeSearchRow");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.PromotionCodeSearchRow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "AsyncAddListResult");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.AsyncAddListResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "AsyncDeleteListResult");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.AsyncDeleteListResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "AsyncGetListResult");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.AsyncGetListResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "AsyncInitializeListResult");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.AsyncInitializeListResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "AsyncResult");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.AsyncResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "AsyncSearchResult");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.AsyncSearchResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "AsyncUpdateListResult");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.AsyncUpdateListResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "ReadResponse");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ReadResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "ReadResponseList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ReadResponseList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "SessionResponse");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SessionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "WriteResponse");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.WriteResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "WriteResponseList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.WriteResponseList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:purchases_2010_2.transactions.webservices.netsuite.com", "ItemReceipt");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ItemReceipt.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:purchases_2010_2.transactions.webservices.netsuite.com", "ItemReceiptExpense");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ItemReceiptExpense.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:purchases_2010_2.transactions.webservices.netsuite.com", "ItemReceiptExpenseList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ItemReceiptExpenseList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:purchases_2010_2.transactions.webservices.netsuite.com", "ItemReceiptItem");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ItemReceiptItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:purchases_2010_2.transactions.webservices.netsuite.com", "ItemReceiptItemList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ItemReceiptItemList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:purchases_2010_2.transactions.webservices.netsuite.com", "PurchaseOrder");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.PurchaseOrder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:purchases_2010_2.transactions.webservices.netsuite.com", "PurchaseOrderExpense");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.PurchaseOrderExpense.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:purchases_2010_2.transactions.webservices.netsuite.com", "PurchaseOrderExpenseList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.PurchaseOrderExpenseList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:purchases_2010_2.transactions.webservices.netsuite.com", "PurchaseOrderItem");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.PurchaseOrderItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:purchases_2010_2.transactions.webservices.netsuite.com", "PurchaseOrderItemList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.PurchaseOrderItemList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:purchases_2010_2.transactions.webservices.netsuite.com", "PurchLandedCostList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.PurchLandedCostList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:purchases_2010_2.transactions.webservices.netsuite.com", "VendorBill");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.VendorBill.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:purchases_2010_2.transactions.webservices.netsuite.com", "VendorBillExpense");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.VendorBillExpense.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:purchases_2010_2.transactions.webservices.netsuite.com", "VendorBillExpenseList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.VendorBillExpenseList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:purchases_2010_2.transactions.webservices.netsuite.com", "VendorBillItem");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.VendorBillItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:purchases_2010_2.transactions.webservices.netsuite.com", "VendorBillItemList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.VendorBillItemList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:purchases_2010_2.transactions.webservices.netsuite.com", "VendorPayment");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.VendorPayment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:purchases_2010_2.transactions.webservices.netsuite.com", "VendorPaymentApply");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.VendorPaymentApply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:purchases_2010_2.transactions.webservices.netsuite.com", "VendorPaymentApplyList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.VendorPaymentApplyList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:purchases_2010_2.transactions.webservices.netsuite.com", "VendorPaymentCredit");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.VendorPaymentCredit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:purchases_2010_2.transactions.webservices.netsuite.com", "VendorPaymentCreditList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.VendorPaymentCreditList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "CashSale");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CashSale.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "CashSaleExpCost");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CashSaleExpCost.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "CashSaleExpCostList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CashSaleExpCostList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "CashSaleItem");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CashSaleItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "CashSaleItemCost");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CashSaleItemCost.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "CashSaleItemCostList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CashSaleItemCostList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "CashSaleItemList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CashSaleItemList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "CashSalePartnersList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CashSalePartnersList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "CashSaleSalesTeam");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CashSaleSalesTeam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "CashSaleSalesTeamList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CashSaleSalesTeamList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "CashSaleShipGroupList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CashSaleShipGroupList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "CashSaleTime");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CashSaleTime.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "CashSaleTimeList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CashSaleTimeList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "Estimate");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.Estimate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "EstimateItem");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.EstimateItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "EstimateItemList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.EstimateItemList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "EstimatePartnersList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.EstimatePartnersList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "EstimateSalesTeam");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.EstimateSalesTeam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "EstimateSalesTeamList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.EstimateSalesTeamList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "EstimateShipGroupList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.EstimateShipGroupList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "GiftCertRedemption");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.GiftCertRedemption.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "GiftCertRedemptionList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.GiftCertRedemptionList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "Invoice");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.Invoice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "InvoiceExpCost");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.InvoiceExpCost.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "InvoiceExpCostList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.InvoiceExpCostList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "InvoiceItem");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.InvoiceItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "InvoiceItemCost");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.InvoiceItemCost.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "InvoiceItemCostList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.InvoiceItemCostList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "InvoiceItemList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.InvoiceItemList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "InvoicePartnersList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.InvoicePartnersList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "InvoiceSalesTeam");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.InvoiceSalesTeam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "InvoiceSalesTeamList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.InvoiceSalesTeamList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "InvoiceShipGroupList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.InvoiceShipGroupList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "InvoiceTime");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.InvoiceTime.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "InvoiceTimeList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.InvoiceTimeList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "ItemFulfillment");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ItemFulfillment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "ItemFulfillmentItem");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ItemFulfillmentItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "ItemFulfillmentItemList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ItemFulfillmentItemList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "ItemFulfillmentPackage");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ItemFulfillmentPackage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "ItemFulfillmentPackageFedEx");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ItemFulfillmentPackageFedEx.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "ItemFulfillmentPackageFedExList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ItemFulfillmentPackageFedExList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "ItemFulfillmentPackageList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ItemFulfillmentPackageList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "ItemFulfillmentPackageUps");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ItemFulfillmentPackageUps.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "ItemFulfillmentPackageUpsList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ItemFulfillmentPackageUpsList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "ItemFulfillmentPackageUsps");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ItemFulfillmentPackageUsps.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "ItemFulfillmentPackageUspsList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ItemFulfillmentPackageUspsList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "ItemFulfillmentShipGroupList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ItemFulfillmentShipGroupList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "Opportunity");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.Opportunity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "OpportunityCompetitors");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.OpportunityCompetitors.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "OpportunityCompetitorsList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.OpportunityCompetitorsList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "OpportunityItem");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.OpportunityItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "OpportunityItemList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.OpportunityItemList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "OpportunityPartnersList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.OpportunityPartnersList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "OpportunitySalesTeam");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.OpportunitySalesTeam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings7() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "OpportunitySalesTeamList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.OpportunitySalesTeamList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "OpportunitySearch");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.OpportunitySearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "OpportunitySearchAdvanced");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.OpportunitySearchAdvanced.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "OpportunitySearchRow");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.OpportunitySearchRow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "SalesOrder");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SalesOrder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "SalesOrderItem");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SalesOrderItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "SalesOrderItemList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SalesOrderItemList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "SalesOrderPartnersList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SalesOrderPartnersList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "SalesOrderSalesTeam");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SalesOrderSalesTeam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "SalesOrderSalesTeamList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SalesOrderSalesTeamList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "SalesOrderShipGroupList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SalesOrderShipGroupList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "TransactionSearch");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.TransactionSearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "TransactionSearchAdvanced");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.TransactionSearchAdvanced.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "TransactionSearchRow");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.TransactionSearchRow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "TransactionShipGroup");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.TransactionShipGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "CalendarEvent");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CalendarEvent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "CalendarEventAttendee");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CalendarEventAttendee.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "CalendarEventAttendeeList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CalendarEventAttendeeList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "CalendarEventResource");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CalendarEventResource.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "CalendarEventResourceList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CalendarEventResourceList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "CalendarEventSearch");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CalendarEventSearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "CalendarEventSearchAdvanced");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CalendarEventSearchAdvanced.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "CalendarEventSearchRow");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CalendarEventSearchRow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "ExclusionDateList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ExclusionDateList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "PhoneCall");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.PhoneCall.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "PhoneCallContact");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.PhoneCallContact.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "PhoneCallContactList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.PhoneCallContactList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "PhoneCallSearch");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.PhoneCallSearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "PhoneCallSearchAdvanced");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.PhoneCallSearchAdvanced.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "PhoneCallSearchRow");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.PhoneCallSearchRow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "ProjectTask");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ProjectTask.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "ProjectTaskAssignee");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ProjectTaskAssignee.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "ProjectTaskAssigneeList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ProjectTaskAssigneeList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "ProjectTaskPredecessor");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ProjectTaskPredecessor.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "ProjectTaskPredecessorList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ProjectTaskPredecessorList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "ProjectTaskSearch");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ProjectTaskSearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "ProjectTaskSearchAdvanced");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ProjectTaskSearchAdvanced.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "ProjectTaskSearchRow");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ProjectTaskSearchRow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "RecurrenceDowMaskList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.RecurrenceDowMaskList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "Task");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.Task.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "TaskContact");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.TaskContact.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "TaskContactList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.TaskContactList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "TaskSearch");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.TaskSearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "TaskSearchAdvanced");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.TaskSearchAdvanced.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "TaskSearchRow");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.TaskSearchRow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "EmailEmployeesList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.EmailEmployeesList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "Issue");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.Issue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "IssueSearch");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.IssueSearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "IssueSearchAdvanced");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.IssueSearchAdvanced.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "IssueSearchRow");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.IssueSearchRow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "IssueVersion");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.IssueVersion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "IssueVersionList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.IssueVersionList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "Solution");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.Solution.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "Solutions");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.Solutions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "SolutionSearch");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SolutionSearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "SolutionSearchAdvanced");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SolutionSearchAdvanced.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "SolutionSearchRow");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SolutionSearchRow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "SolutionsList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SolutionsList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "SolutionTopics");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SolutionTopics.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "SolutionTopicsList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SolutionTopicsList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "SupportCase");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SupportCase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "SupportCaseEscalateTo");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SupportCaseEscalateTo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "SupportCaseEscalateToList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SupportCaseEscalateToList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "SupportCaseIssue");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SupportCaseIssue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "SupportCaseOrigin");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SupportCaseOrigin.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "SupportCasePriority");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SupportCasePriority.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "SupportCaseSearch");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SupportCaseSearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "SupportCaseSearchAdvanced");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SupportCaseSearchAdvanced.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "SupportCaseSearchRow");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SupportCaseSearchRow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "SupportCaseSolutions");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SupportCaseSolutions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "SupportCaseSolutionsList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SupportCaseSolutionsList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "SupportCaseStatus");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SupportCaseStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "SupportCaseType");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SupportCaseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "Topic");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.Topic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "TopicSearch");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.TopicSearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "TopicSearchAdvanced");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.TopicSearchAdvanced.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "TopicSearchRow");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.TopicSearchRow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "TopicSolution");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.TopicSolution.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "TopicSolutionList");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.TopicSolutionList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:types.accounting_2010_2.lists.webservices.netsuite.com", "AccountType");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.AccountType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.accounting_2010_2.lists.webservices.netsuite.com", "ConsolidatedRate");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ConsolidatedRate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.accounting_2010_2.lists.webservices.netsuite.com", "CurrencyCurrencyPrecision");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CurrencyCurrencyPrecision.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.accounting_2010_2.lists.webservices.netsuite.com", "CurrencyFxRateUpdateTimezone");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CurrencyFxRateUpdateTimezone.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.accounting_2010_2.lists.webservices.netsuite.com", "CurrencyLocale");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CurrencyLocale.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.accounting_2010_2.lists.webservices.netsuite.com", "ItemCostingMethod");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ItemCostingMethod.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.accounting_2010_2.lists.webservices.netsuite.com", "ItemMatrixType");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ItemMatrixType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.accounting_2010_2.lists.webservices.netsuite.com", "ItemOutOfStockBehavior");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ItemOutOfStockBehavior.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.accounting_2010_2.lists.webservices.netsuite.com", "ItemOverallQuantityPricingType");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ItemOverallQuantityPricingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.accounting_2010_2.lists.webservices.netsuite.com", "ItemPreferenceCriterion");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ItemPreferenceCriterion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.accounting_2010_2.lists.webservices.netsuite.com", "ItemProductFeed");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ItemProductFeed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.accounting_2010_2.lists.webservices.netsuite.com", "ItemSubType");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ItemSubType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.accounting_2010_2.lists.webservices.netsuite.com", "ItemType");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ItemType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.accounting_2010_2.lists.webservices.netsuite.com", "ItemWeightUnit");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ItemWeightUnit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.accounting_2010_2.lists.webservices.netsuite.com", "SalesTaxItemAvailable");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SalesTaxItemAvailable.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.accounting_2010_2.lists.webservices.netsuite.com", "ScheduleBCode");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ScheduleBCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.common_2010_2.platform.webservices.netsuite.com", "AvsMatchCode");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.AvsMatchCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.common_2010_2.platform.webservices.netsuite.com", "Country");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.Country.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.common_2010_2.platform.webservices.netsuite.com", "GlobalSubscriptionStatus");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.GlobalSubscriptionStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.common_2010_2.platform.webservices.netsuite.com", "ItemCostEstimateType");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ItemCostEstimateType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.common_2010_2.platform.webservices.netsuite.com", "LandedCostMethod");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.LandedCostMethod.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

    }
    private void addBindings8() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:types.common_2010_2.platform.webservices.netsuite.com", "LandedCostSource");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.LandedCostSource.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.common_2010_2.platform.webservices.netsuite.com", "Language");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.Language.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.common_2010_2.platform.webservices.netsuite.com", "PostingPeriodDate");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.PostingPeriodDate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.common_2010_2.platform.webservices.netsuite.com", "PresentationItemType");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.PresentationItemType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.common_2010_2.platform.webservices.netsuite.com", "RevenueCommitStatus");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.RevenueCommitStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.common_2010_2.platform.webservices.netsuite.com", "RevenueStatus");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.RevenueStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.common_2010_2.platform.webservices.netsuite.com", "SitemapPriority");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SitemapPriority.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.common_2010_2.platform.webservices.netsuite.com", "VsoeDeferral");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.VsoeDeferral.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.common_2010_2.platform.webservices.netsuite.com", "VsoePermitDiscount");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.VsoePermitDiscount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.communication_2010_2.general.webservices.netsuite.com", "NoteDirection");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.NoteDirection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.core_2010_2.platform.webservices.netsuite.com", "AsyncStatusType");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.AsyncStatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.core_2010_2.platform.webservices.netsuite.com", "CalendarEventAttendeeResponse");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CalendarEventAttendeeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.core_2010_2.platform.webservices.netsuite.com", "DurationUnit");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.DurationUnit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.core_2010_2.platform.webservices.netsuite.com", "GetAllRecordType");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.GetAllRecordType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.core_2010_2.platform.webservices.netsuite.com", "GetCustomizationType");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.GetCustomizationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.core_2010_2.platform.webservices.netsuite.com", "GetSelectValueFilterOperator");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.GetSelectValueFilterOperator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.core_2010_2.platform.webservices.netsuite.com", "InitializeAuxRefType");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.InitializeAuxRefType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.core_2010_2.platform.webservices.netsuite.com", "InitializeRefType");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.InitializeRefType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.core_2010_2.platform.webservices.netsuite.com", "InitializeType");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.InitializeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.core_2010_2.platform.webservices.netsuite.com", "RecordType");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.RecordType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.core_2010_2.platform.webservices.netsuite.com", "SearchDate");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SearchDate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.core_2010_2.platform.webservices.netsuite.com", "SearchDateFieldOperator");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SearchDateFieldOperator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.core_2010_2.platform.webservices.netsuite.com", "SearchDoubleFieldOperator");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SearchDoubleFieldOperator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.core_2010_2.platform.webservices.netsuite.com", "SearchEnumMultiSelectFieldOperator");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SearchEnumMultiSelectFieldOperator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.core_2010_2.platform.webservices.netsuite.com", "SearchLongFieldOperator");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SearchLongFieldOperator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectFieldOperator");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SearchMultiSelectFieldOperator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.core_2010_2.platform.webservices.netsuite.com", "SearchRecordType");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SearchRecordType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.core_2010_2.platform.webservices.netsuite.com", "SearchStringFieldOperator");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SearchStringFieldOperator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.core_2010_2.platform.webservices.netsuite.com", "SearchTextNumberFieldOperator");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SearchTextNumberFieldOperator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.customers_2010_2.transactions.webservices.netsuite.com", "ReturnAuthorizationOrderStatus");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ReturnAuthorizationOrderStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.customization_2010_2.setup.webservices.netsuite.com", "CustomizationAccessLevel");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomizationAccessLevel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.customization_2010_2.setup.webservices.netsuite.com", "CustomizationDisplayType");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomizationDisplayType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.customization_2010_2.setup.webservices.netsuite.com", "CustomizationDynamicDefault");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomizationDynamicDefault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.customization_2010_2.setup.webservices.netsuite.com", "CustomizationFieldType");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomizationFieldType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.customization_2010_2.setup.webservices.netsuite.com", "CustomizationFilterCompareType");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomizationFilterCompareType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.customization_2010_2.setup.webservices.netsuite.com", "CustomizationSearchLevel");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomizationSearchLevel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.customization_2010_2.setup.webservices.netsuite.com", "CustomRecordTypePermissionsPermittedLevel");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomRecordTypePermissionsPermittedLevel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.customization_2010_2.setup.webservices.netsuite.com", "CustomRecordTypePermissionsRestriction");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CustomRecordTypePermissionsRestriction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.customization_2010_2.setup.webservices.netsuite.com", "ItemCustomFieldItemSubType");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ItemCustomFieldItemSubType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.employees_2010_2.lists.webservices.netsuite.com", "EmployeeCommissionPaymentPreference");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.EmployeeCommissionPaymentPreference.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.employees_2010_2.lists.webservices.netsuite.com", "EmployeePayFrequency");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.EmployeePayFrequency.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.employees_2010_2.lists.webservices.netsuite.com", "EmployeeUseTimeData");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.EmployeeUseTimeData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.employees_2010_2.lists.webservices.netsuite.com", "Gender");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.Gender.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.employees_2010_2.transactions.webservices.netsuite.com", "TimeBillTimeType");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.TimeBillTimeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.faults_2010_2.platform.webservices.netsuite.com", "FaultCodeType");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.FaultCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.faults_2010_2.platform.webservices.netsuite.com", "StatusDetailCodeType");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.StatusDetailCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.faults_2010_2.platform.webservices.netsuite.com", "StatusDetailType");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.StatusDetailType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.filecabinet_2010_2.documents.webservices.netsuite.com", "FileAttachFrom");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.FileAttachFrom.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.filecabinet_2010_2.documents.webservices.netsuite.com", "FileEncoding");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.FileEncoding.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.filecabinet_2010_2.documents.webservices.netsuite.com", "MediaType");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.MediaType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.filecabinet_2010_2.documents.webservices.netsuite.com", "TextFileEncoding");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.TextFileEncoding.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.financial_2010_2.transactions.webservices.netsuite.com", "BudgetBudgetType");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.BudgetBudgetType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.inventory_2010_2.transactions.webservices.netsuite.com", "TransferOrderItemCommitInventory");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.TransferOrderItemCommitInventory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.inventory_2010_2.transactions.webservices.netsuite.com", "TransferOrderOrderStatus");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.TransferOrderOrderStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.marketing_2010_2.lists.webservices.netsuite.com", "CampaignCampaignDirectMailStatus");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CampaignCampaignDirectMailStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.marketing_2010_2.lists.webservices.netsuite.com", "CampaignCampaignEmailStatus");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CampaignCampaignEmailStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.marketing_2010_2.lists.webservices.netsuite.com", "CampaignCampaignEventStatus");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CampaignCampaignEventStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.marketing_2010_2.lists.webservices.netsuite.com", "CampaignChannelEventType");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CampaignChannelEventType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.marketing_2010_2.lists.webservices.netsuite.com", "CampaignResponseResponse");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CampaignResponseResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.marketing_2010_2.lists.webservices.netsuite.com", "PromotionCodeApplyDiscountTo");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.PromotionCodeApplyDiscountTo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.purchases_2010_2.transactions.webservices.netsuite.com", "PurchaseOrderOrderStatus");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.PurchaseOrderOrderStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.purchases_2010_2.transactions.webservices.netsuite.com", "TransactionBillVarianceStatus");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.TransactionBillVarianceStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.sales_2010_2.transactions.webservices.netsuite.com", "ItemFulfillmentB13AFilingOptionFedEx");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ItemFulfillmentB13AFilingOptionFedEx.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.sales_2010_2.transactions.webservices.netsuite.com", "ItemFulfillmentExportTypeUps");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ItemFulfillmentExportTypeUps.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.sales_2010_2.transactions.webservices.netsuite.com", "ItemFulfillmentHomeDeliveryTypeFedEx");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ItemFulfillmentHomeDeliveryTypeFedEx.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.sales_2010_2.transactions.webservices.netsuite.com", "ItemFulfillmentLicenseExceptionUps");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ItemFulfillmentLicenseExceptionUps.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.sales_2010_2.transactions.webservices.netsuite.com", "ItemFulfillmentMethodOfTransportUps");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ItemFulfillmentMethodOfTransportUps.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.sales_2010_2.transactions.webservices.netsuite.com", "ItemFulfillmentPackageFedExAdmPackageTypeFedEx");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ItemFulfillmentPackageFedExAdmPackageTypeFedEx.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.sales_2010_2.transactions.webservices.netsuite.com", "ItemFulfillmentPackageFedExCodFreightTypeFedEx");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ItemFulfillmentPackageFedExCodFreightTypeFedEx.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.sales_2010_2.transactions.webservices.netsuite.com", "ItemFulfillmentPackageFedExCodMethodFedEx");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ItemFulfillmentPackageFedExCodMethodFedEx.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.sales_2010_2.transactions.webservices.netsuite.com", "ItemFulfillmentPackageFedExDeliveryConfFedEx");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ItemFulfillmentPackageFedExDeliveryConfFedEx.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.sales_2010_2.transactions.webservices.netsuite.com", "ItemFulfillmentPackageFedExPackagingFedEx");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ItemFulfillmentPackageFedExPackagingFedEx.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.sales_2010_2.transactions.webservices.netsuite.com", "ItemFulfillmentPackageFedExSignatureOptionsFedEx");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ItemFulfillmentPackageFedExSignatureOptionsFedEx.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.sales_2010_2.transactions.webservices.netsuite.com", "ItemFulfillmentPackageUpsCodMethodUps");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ItemFulfillmentPackageUpsCodMethodUps.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.sales_2010_2.transactions.webservices.netsuite.com", "ItemFulfillmentPackageUpsDeliveryConfUps");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ItemFulfillmentPackageUpsDeliveryConfUps.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.sales_2010_2.transactions.webservices.netsuite.com", "ItemFulfillmentPackageUpsPackagingUps");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ItemFulfillmentPackageUpsPackagingUps.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.sales_2010_2.transactions.webservices.netsuite.com", "ItemFulfillmentPackageUspsDeliveryConfUsps");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ItemFulfillmentPackageUspsDeliveryConfUsps.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.sales_2010_2.transactions.webservices.netsuite.com", "ItemFulfillmentPackageUspsPackagingUsps");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ItemFulfillmentPackageUspsPackagingUsps.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.sales_2010_2.transactions.webservices.netsuite.com", "ItemFulfillmentShipStatus");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ItemFulfillmentShipStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.sales_2010_2.transactions.webservices.netsuite.com", "ItemFulfillmentTermsOfSaleFedEx");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ItemFulfillmentTermsOfSaleFedEx.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.sales_2010_2.transactions.webservices.netsuite.com", "ItemFulfillmentThirdPartyTypeFedEx");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ItemFulfillmentThirdPartyTypeFedEx.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.sales_2010_2.transactions.webservices.netsuite.com", "ItemFulfillmentThirdPartyTypeUps");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ItemFulfillmentThirdPartyTypeUps.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.sales_2010_2.transactions.webservices.netsuite.com", "SalesOrderItemCommitInventory");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SalesOrderItemCommitInventory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.sales_2010_2.transactions.webservices.netsuite.com", "SalesOrderItemCreatePo");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SalesOrderItemCreatePo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.sales_2010_2.transactions.webservices.netsuite.com", "SalesOrderOrderStatus");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SalesOrderOrderStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.sales_2010_2.transactions.webservices.netsuite.com", "TransactionPaymentEventHoldReason");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.TransactionPaymentEventHoldReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.sales_2010_2.transactions.webservices.netsuite.com", "TransactionPaymentEventResult");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.TransactionPaymentEventResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.sales_2010_2.transactions.webservices.netsuite.com", "TransactionPaymentEventType");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.TransactionPaymentEventType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.scheduling_2010_2.activities.webservices.netsuite.com", "CalendarEventAccessLevel");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CalendarEventAccessLevel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.scheduling_2010_2.activities.webservices.netsuite.com", "CalendarEventAttendeeAttendance");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CalendarEventAttendeeAttendance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.scheduling_2010_2.activities.webservices.netsuite.com", "CalendarEventDow");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CalendarEventDow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.scheduling_2010_2.activities.webservices.netsuite.com", "CalendarEventDowim");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CalendarEventDowim.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.scheduling_2010_2.activities.webservices.netsuite.com", "CalendarEventFrequency");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CalendarEventFrequency.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.scheduling_2010_2.activities.webservices.netsuite.com", "CalendarEventReminderMinutes");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CalendarEventReminderMinutes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.scheduling_2010_2.activities.webservices.netsuite.com", "CalendarEventReminderType");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CalendarEventReminderType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.scheduling_2010_2.activities.webservices.netsuite.com", "CalendarEventStatus");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.CalendarEventStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.scheduling_2010_2.activities.webservices.netsuite.com", "PhoneCallPriority");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.PhoneCallPriority.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.scheduling_2010_2.activities.webservices.netsuite.com", "PhoneCallReminderMinutes");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.PhoneCallReminderMinutes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.scheduling_2010_2.activities.webservices.netsuite.com", "PhoneCallReminderType");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.PhoneCallReminderType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.scheduling_2010_2.activities.webservices.netsuite.com", "PhoneCallStatus");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.PhoneCallStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

    }
    private void addBindings9() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:types.scheduling_2010_2.activities.webservices.netsuite.com", "ProjectTaskConstraintType");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ProjectTaskConstraintType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.scheduling_2010_2.activities.webservices.netsuite.com", "ProjectTaskPredecessorPredecessorType");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ProjectTaskPredecessorPredecessorType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.scheduling_2010_2.activities.webservices.netsuite.com", "ProjectTaskStatus");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.ProjectTaskStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.scheduling_2010_2.activities.webservices.netsuite.com", "TaskPriority");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.TaskPriority.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.scheduling_2010_2.activities.webservices.netsuite.com", "TaskReminderMinutes");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.TaskReminderMinutes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.scheduling_2010_2.activities.webservices.netsuite.com", "TaskReminderType");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.TaskReminderType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.scheduling_2010_2.activities.webservices.netsuite.com", "TaskStatus");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.TaskStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.support_2010_2.lists.webservices.netsuite.com", "IssueTrackCode");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.IssueTrackCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.support_2010_2.lists.webservices.netsuite.com", "SolutionStatus");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SolutionStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:types.support_2010_2.lists.webservices.netsuite.com", "SupportCaseStatusStage");
            cachedSerQNames.add(qName);
            cls = org.mule.module.netsuite.api.internal.SupportCaseStatusStage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public org.mule.module.netsuite.api.internal.SessionResponse login(org.mule.module.netsuite.api.internal.Passport passport) throws java.rmi.RemoteException, org.mule.module.netsuite.api.internal.InvalidVersionFault, org.mule.module.netsuite.api.internal.InvalidCredentialsFault, org.mule.module.netsuite.api.internal.InsufficientPermissionFault, org.mule.module.netsuite.api.internal.ExceededRequestLimitFault, org.mule.module.netsuite.api.internal.UnexpectedErrorFault, org.mule.module.netsuite.api.internal.InvalidAccountFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("login");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "login"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {passport});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.mule.module.netsuite.api.internal.SessionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.mule.module.netsuite.api.internal.SessionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.mule.module.netsuite.api.internal.SessionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidVersionFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidVersionFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidCredentialsFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidCredentialsFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InsufficientPermissionFault) {
              throw (org.mule.module.netsuite.api.internal.InsufficientPermissionFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.UnexpectedErrorFault) {
              throw (org.mule.module.netsuite.api.internal.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidAccountFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidAccountFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.mule.module.netsuite.api.internal.SessionResponse ssoLogin(org.mule.module.netsuite.api.internal.SsoPassport ssoPassport) throws java.rmi.RemoteException, org.mule.module.netsuite.api.internal.InvalidVersionFault, org.mule.module.netsuite.api.internal.InvalidCredentialsFault, org.mule.module.netsuite.api.internal.InsufficientPermissionFault, org.mule.module.netsuite.api.internal.ExceededRequestLimitFault, org.mule.module.netsuite.api.internal.UnexpectedErrorFault, org.mule.module.netsuite.api.internal.InvalidAccountFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ssoLogin");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "ssoLogin"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ssoPassport});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.mule.module.netsuite.api.internal.SessionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.mule.module.netsuite.api.internal.SessionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.mule.module.netsuite.api.internal.SessionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidVersionFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidVersionFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidCredentialsFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidCredentialsFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InsufficientPermissionFault) {
              throw (org.mule.module.netsuite.api.internal.InsufficientPermissionFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.UnexpectedErrorFault) {
              throw (org.mule.module.netsuite.api.internal.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidAccountFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidAccountFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.mule.module.netsuite.api.internal.SessionResponse mapSso(org.mule.module.netsuite.api.internal.SsoCredentials ssoCredentials) throws java.rmi.RemoteException, org.mule.module.netsuite.api.internal.InvalidVersionFault, org.mule.module.netsuite.api.internal.InvalidCredentialsFault, org.mule.module.netsuite.api.internal.InsufficientPermissionFault, org.mule.module.netsuite.api.internal.ExceededRequestLimitFault, org.mule.module.netsuite.api.internal.UnexpectedErrorFault, org.mule.module.netsuite.api.internal.InvalidAccountFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("mapSso");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "mapSso"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ssoCredentials});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.mule.module.netsuite.api.internal.SessionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.mule.module.netsuite.api.internal.SessionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.mule.module.netsuite.api.internal.SessionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidVersionFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidVersionFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidCredentialsFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidCredentialsFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InsufficientPermissionFault) {
              throw (org.mule.module.netsuite.api.internal.InsufficientPermissionFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.UnexpectedErrorFault) {
              throw (org.mule.module.netsuite.api.internal.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidAccountFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidAccountFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.mule.module.netsuite.api.internal.SessionResponse changePasswordOrEmail(org.mule.module.netsuite.api.internal.ChangePasswordOrEmailCredentials changePasswordOrEmailCredentials) throws java.rmi.RemoteException, org.mule.module.netsuite.api.internal.InvalidVersionFault, org.mule.module.netsuite.api.internal.InvalidCredentialsFault, org.mule.module.netsuite.api.internal.InsufficientPermissionFault, org.mule.module.netsuite.api.internal.ExceededRequestLimitFault, org.mule.module.netsuite.api.internal.UnexpectedErrorFault, org.mule.module.netsuite.api.internal.InvalidAccountFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("changePasswordOrEmail");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "changePasswordOrEmail"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {changePasswordOrEmailCredentials});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.mule.module.netsuite.api.internal.SessionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.mule.module.netsuite.api.internal.SessionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.mule.module.netsuite.api.internal.SessionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidVersionFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidVersionFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidCredentialsFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidCredentialsFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InsufficientPermissionFault) {
              throw (org.mule.module.netsuite.api.internal.InsufficientPermissionFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.UnexpectedErrorFault) {
              throw (org.mule.module.netsuite.api.internal.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidAccountFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidAccountFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.mule.module.netsuite.api.internal.SessionResponse logout() throws java.rmi.RemoteException, org.mule.module.netsuite.api.internal.ExceededRequestLimitFault, org.mule.module.netsuite.api.internal.UnexpectedErrorFault, org.mule.module.netsuite.api.internal.InvalidSessionFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("logout");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "logout"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.mule.module.netsuite.api.internal.SessionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.mule.module.netsuite.api.internal.SessionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.mule.module.netsuite.api.internal.SessionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.UnexpectedErrorFault) {
              throw (org.mule.module.netsuite.api.internal.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidSessionFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidSessionFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.mule.module.netsuite.api.internal.WriteResponse add(org.mule.module.netsuite.api.internal.Record record) throws java.rmi.RemoteException, org.mule.module.netsuite.api.internal.ExceededRequestSizeFault, org.mule.module.netsuite.api.internal.InvalidCredentialsFault, org.mule.module.netsuite.api.internal.ExceededUsageLimitFault, org.mule.module.netsuite.api.internal.ExceededRequestLimitFault, org.mule.module.netsuite.api.internal.ExceededRecordCountFault, org.mule.module.netsuite.api.internal.UnexpectedErrorFault, org.mule.module.netsuite.api.internal.InvalidSessionFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("add");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "add"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {record});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.mule.module.netsuite.api.internal.WriteResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.mule.module.netsuite.api.internal.WriteResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.mule.module.netsuite.api.internal.WriteResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestSizeFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestSizeFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidCredentialsFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidCredentialsFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededUsageLimitFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededUsageLimitFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRecordCountFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRecordCountFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.UnexpectedErrorFault) {
              throw (org.mule.module.netsuite.api.internal.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidSessionFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidSessionFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.mule.module.netsuite.api.internal.WriteResponse delete(org.mule.module.netsuite.api.internal.BaseRef baseRef) throws java.rmi.RemoteException, org.mule.module.netsuite.api.internal.ExceededRequestSizeFault, org.mule.module.netsuite.api.internal.InvalidCredentialsFault, org.mule.module.netsuite.api.internal.ExceededUsageLimitFault, org.mule.module.netsuite.api.internal.ExceededRequestLimitFault, org.mule.module.netsuite.api.internal.ExceededRecordCountFault, org.mule.module.netsuite.api.internal.UnexpectedErrorFault, org.mule.module.netsuite.api.internal.InvalidSessionFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("delete");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "delete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {baseRef});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.mule.module.netsuite.api.internal.WriteResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.mule.module.netsuite.api.internal.WriteResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.mule.module.netsuite.api.internal.WriteResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestSizeFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestSizeFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidCredentialsFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidCredentialsFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededUsageLimitFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededUsageLimitFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRecordCountFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRecordCountFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.UnexpectedErrorFault) {
              throw (org.mule.module.netsuite.api.internal.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidSessionFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidSessionFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.mule.module.netsuite.api.internal.SearchResult search(org.mule.module.netsuite.api.internal.SearchRecord searchRecord) throws java.rmi.RemoteException, org.mule.module.netsuite.api.internal.ExceededRequestSizeFault, org.mule.module.netsuite.api.internal.InvalidCredentialsFault, org.mule.module.netsuite.api.internal.ExceededUsageLimitFault, org.mule.module.netsuite.api.internal.ExceededRequestLimitFault, org.mule.module.netsuite.api.internal.ExceededRecordCountFault, org.mule.module.netsuite.api.internal.UnexpectedErrorFault, org.mule.module.netsuite.api.internal.InvalidSessionFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("search");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "search"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {searchRecord});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.mule.module.netsuite.api.internal.SearchResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.mule.module.netsuite.api.internal.SearchResult) org.apache.axis.utils.JavaUtils.convert(_resp, org.mule.module.netsuite.api.internal.SearchResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestSizeFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestSizeFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidCredentialsFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidCredentialsFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededUsageLimitFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededUsageLimitFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRecordCountFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRecordCountFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.UnexpectedErrorFault) {
              throw (org.mule.module.netsuite.api.internal.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidSessionFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidSessionFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.mule.module.netsuite.api.internal.SearchResult searchMore(int pageIndex) throws java.rmi.RemoteException, org.mule.module.netsuite.api.internal.ExceededRequestSizeFault, org.mule.module.netsuite.api.internal.ExceededUsageLimitFault, org.mule.module.netsuite.api.internal.ExceededRequestLimitFault, org.mule.module.netsuite.api.internal.ExceededRecordCountFault, org.mule.module.netsuite.api.internal.UnexpectedErrorFault, org.mule.module.netsuite.api.internal.InvalidSessionFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("searchMore");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "searchMore"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(pageIndex)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.mule.module.netsuite.api.internal.SearchResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.mule.module.netsuite.api.internal.SearchResult) org.apache.axis.utils.JavaUtils.convert(_resp, org.mule.module.netsuite.api.internal.SearchResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestSizeFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestSizeFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededUsageLimitFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededUsageLimitFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRecordCountFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRecordCountFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.UnexpectedErrorFault) {
              throw (org.mule.module.netsuite.api.internal.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidSessionFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidSessionFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.mule.module.netsuite.api.internal.SearchResult searchMoreWithId(java.lang.String searchId, int pageIndex) throws java.rmi.RemoteException, org.mule.module.netsuite.api.internal.ExceededRequestSizeFault, org.mule.module.netsuite.api.internal.InvalidCredentialsFault, org.mule.module.netsuite.api.internal.ExceededUsageLimitFault, org.mule.module.netsuite.api.internal.ExceededRequestLimitFault, org.mule.module.netsuite.api.internal.ExceededRecordCountFault, org.mule.module.netsuite.api.internal.UnexpectedErrorFault, org.mule.module.netsuite.api.internal.InvalidSessionFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("searchMoreWithId");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "searchMoreWithId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {searchId, new java.lang.Integer(pageIndex)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.mule.module.netsuite.api.internal.SearchResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.mule.module.netsuite.api.internal.SearchResult) org.apache.axis.utils.JavaUtils.convert(_resp, org.mule.module.netsuite.api.internal.SearchResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestSizeFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestSizeFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidCredentialsFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidCredentialsFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededUsageLimitFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededUsageLimitFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRecordCountFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRecordCountFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.UnexpectedErrorFault) {
              throw (org.mule.module.netsuite.api.internal.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidSessionFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidSessionFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.mule.module.netsuite.api.internal.SearchResult searchNext() throws java.rmi.RemoteException, org.mule.module.netsuite.api.internal.ExceededRequestSizeFault, org.mule.module.netsuite.api.internal.ExceededUsageLimitFault, org.mule.module.netsuite.api.internal.ExceededRequestLimitFault, org.mule.module.netsuite.api.internal.ExceededRecordCountFault, org.mule.module.netsuite.api.internal.UnexpectedErrorFault, org.mule.module.netsuite.api.internal.InvalidSessionFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("searchNext");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "searchNext"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.mule.module.netsuite.api.internal.SearchResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.mule.module.netsuite.api.internal.SearchResult) org.apache.axis.utils.JavaUtils.convert(_resp, org.mule.module.netsuite.api.internal.SearchResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestSizeFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestSizeFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededUsageLimitFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededUsageLimitFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRecordCountFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRecordCountFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.UnexpectedErrorFault) {
              throw (org.mule.module.netsuite.api.internal.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidSessionFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidSessionFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.mule.module.netsuite.api.internal.WriteResponse update(org.mule.module.netsuite.api.internal.Record record) throws java.rmi.RemoteException, org.mule.module.netsuite.api.internal.ExceededRequestSizeFault, org.mule.module.netsuite.api.internal.InvalidCredentialsFault, org.mule.module.netsuite.api.internal.ExceededUsageLimitFault, org.mule.module.netsuite.api.internal.ExceededRequestLimitFault, org.mule.module.netsuite.api.internal.ExceededRecordCountFault, org.mule.module.netsuite.api.internal.UnexpectedErrorFault, org.mule.module.netsuite.api.internal.InvalidSessionFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("update");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "update"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {record});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.mule.module.netsuite.api.internal.WriteResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.mule.module.netsuite.api.internal.WriteResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.mule.module.netsuite.api.internal.WriteResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestSizeFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestSizeFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidCredentialsFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidCredentialsFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededUsageLimitFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededUsageLimitFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRecordCountFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRecordCountFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.UnexpectedErrorFault) {
              throw (org.mule.module.netsuite.api.internal.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidSessionFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidSessionFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.mule.module.netsuite.api.internal.WriteResponseList addList(org.mule.module.netsuite.api.internal.Record[] record) throws java.rmi.RemoteException, org.mule.module.netsuite.api.internal.ExceededRequestSizeFault, org.mule.module.netsuite.api.internal.InvalidCredentialsFault, org.mule.module.netsuite.api.internal.ExceededUsageLimitFault, org.mule.module.netsuite.api.internal.ExceededRequestLimitFault, org.mule.module.netsuite.api.internal.ExceededRecordCountFault, org.mule.module.netsuite.api.internal.UnexpectedErrorFault, org.mule.module.netsuite.api.internal.InvalidSessionFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("addList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "addList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {record});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.mule.module.netsuite.api.internal.WriteResponseList) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.mule.module.netsuite.api.internal.WriteResponseList) org.apache.axis.utils.JavaUtils.convert(_resp, org.mule.module.netsuite.api.internal.WriteResponseList.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestSizeFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestSizeFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidCredentialsFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidCredentialsFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededUsageLimitFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededUsageLimitFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRecordCountFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRecordCountFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.UnexpectedErrorFault) {
              throw (org.mule.module.netsuite.api.internal.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidSessionFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidSessionFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.mule.module.netsuite.api.internal.WriteResponseList deleteList(org.mule.module.netsuite.api.internal.BaseRef[] baseRef) throws java.rmi.RemoteException, org.mule.module.netsuite.api.internal.ExceededRequestSizeFault, org.mule.module.netsuite.api.internal.InvalidCredentialsFault, org.mule.module.netsuite.api.internal.ExceededUsageLimitFault, org.mule.module.netsuite.api.internal.ExceededRequestLimitFault, org.mule.module.netsuite.api.internal.ExceededRecordCountFault, org.mule.module.netsuite.api.internal.UnexpectedErrorFault, org.mule.module.netsuite.api.internal.InvalidSessionFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("deleteList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "deleteList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {baseRef});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.mule.module.netsuite.api.internal.WriteResponseList) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.mule.module.netsuite.api.internal.WriteResponseList) org.apache.axis.utils.JavaUtils.convert(_resp, org.mule.module.netsuite.api.internal.WriteResponseList.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestSizeFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestSizeFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidCredentialsFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidCredentialsFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededUsageLimitFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededUsageLimitFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRecordCountFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRecordCountFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.UnexpectedErrorFault) {
              throw (org.mule.module.netsuite.api.internal.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidSessionFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidSessionFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.mule.module.netsuite.api.internal.WriteResponseList updateList(org.mule.module.netsuite.api.internal.Record[] record) throws java.rmi.RemoteException, org.mule.module.netsuite.api.internal.ExceededRequestSizeFault, org.mule.module.netsuite.api.internal.InvalidCredentialsFault, org.mule.module.netsuite.api.internal.ExceededUsageLimitFault, org.mule.module.netsuite.api.internal.ExceededRequestLimitFault, org.mule.module.netsuite.api.internal.ExceededRecordCountFault, org.mule.module.netsuite.api.internal.UnexpectedErrorFault, org.mule.module.netsuite.api.internal.InvalidSessionFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("updateList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "updateList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {record});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.mule.module.netsuite.api.internal.WriteResponseList) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.mule.module.netsuite.api.internal.WriteResponseList) org.apache.axis.utils.JavaUtils.convert(_resp, org.mule.module.netsuite.api.internal.WriteResponseList.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestSizeFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestSizeFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidCredentialsFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidCredentialsFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededUsageLimitFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededUsageLimitFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRecordCountFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRecordCountFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.UnexpectedErrorFault) {
              throw (org.mule.module.netsuite.api.internal.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidSessionFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidSessionFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.mule.module.netsuite.api.internal.ReadResponse get(org.mule.module.netsuite.api.internal.BaseRef baseRef) throws java.rmi.RemoteException, org.mule.module.netsuite.api.internal.ExceededRequestSizeFault, org.mule.module.netsuite.api.internal.InvalidCredentialsFault, org.mule.module.netsuite.api.internal.ExceededUsageLimitFault, org.mule.module.netsuite.api.internal.ExceededRequestLimitFault, org.mule.module.netsuite.api.internal.ExceededRecordCountFault, org.mule.module.netsuite.api.internal.UnexpectedErrorFault, org.mule.module.netsuite.api.internal.InvalidSessionFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("get");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "get"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {baseRef});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.mule.module.netsuite.api.internal.ReadResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.mule.module.netsuite.api.internal.ReadResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.mule.module.netsuite.api.internal.ReadResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestSizeFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestSizeFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidCredentialsFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidCredentialsFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededUsageLimitFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededUsageLimitFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRecordCountFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRecordCountFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.UnexpectedErrorFault) {
              throw (org.mule.module.netsuite.api.internal.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidSessionFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidSessionFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.mule.module.netsuite.api.internal.ReadResponseList getList(org.mule.module.netsuite.api.internal.BaseRef[] baseRef) throws java.rmi.RemoteException, org.mule.module.netsuite.api.internal.ExceededRequestSizeFault, org.mule.module.netsuite.api.internal.InvalidCredentialsFault, org.mule.module.netsuite.api.internal.ExceededUsageLimitFault, org.mule.module.netsuite.api.internal.ExceededRequestLimitFault, org.mule.module.netsuite.api.internal.ExceededRecordCountFault, org.mule.module.netsuite.api.internal.UnexpectedErrorFault, org.mule.module.netsuite.api.internal.InvalidSessionFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "getList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {baseRef});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.mule.module.netsuite.api.internal.ReadResponseList) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.mule.module.netsuite.api.internal.ReadResponseList) org.apache.axis.utils.JavaUtils.convert(_resp, org.mule.module.netsuite.api.internal.ReadResponseList.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestSizeFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestSizeFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidCredentialsFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidCredentialsFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededUsageLimitFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededUsageLimitFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRecordCountFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRecordCountFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.UnexpectedErrorFault) {
              throw (org.mule.module.netsuite.api.internal.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidSessionFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidSessionFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.mule.module.netsuite.api.internal.GetAllResult getAll(org.mule.module.netsuite.api.internal.GetAllRecord record) throws java.rmi.RemoteException, org.mule.module.netsuite.api.internal.ExceededRequestSizeFault, org.mule.module.netsuite.api.internal.InvalidCredentialsFault, org.mule.module.netsuite.api.internal.ExceededUsageLimitFault, org.mule.module.netsuite.api.internal.ExceededRequestLimitFault, org.mule.module.netsuite.api.internal.ExceededRecordCountFault, org.mule.module.netsuite.api.internal.UnexpectedErrorFault, org.mule.module.netsuite.api.internal.InvalidSessionFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getAll");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "getAll"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {record});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.mule.module.netsuite.api.internal.GetAllResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.mule.module.netsuite.api.internal.GetAllResult) org.apache.axis.utils.JavaUtils.convert(_resp, org.mule.module.netsuite.api.internal.GetAllResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestSizeFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestSizeFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidCredentialsFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidCredentialsFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededUsageLimitFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededUsageLimitFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRecordCountFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRecordCountFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.UnexpectedErrorFault) {
              throw (org.mule.module.netsuite.api.internal.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidSessionFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidSessionFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.mule.module.netsuite.api.internal.GetSavedSearchResult getSavedSearch(org.mule.module.netsuite.api.internal.GetSavedSearchRecord record) throws java.rmi.RemoteException, org.mule.module.netsuite.api.internal.ExceededRequestSizeFault, org.mule.module.netsuite.api.internal.InvalidCredentialsFault, org.mule.module.netsuite.api.internal.ExceededUsageLimitFault, org.mule.module.netsuite.api.internal.ExceededRequestLimitFault, org.mule.module.netsuite.api.internal.ExceededRecordCountFault, org.mule.module.netsuite.api.internal.UnexpectedErrorFault, org.mule.module.netsuite.api.internal.InvalidSessionFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getSavedSearch");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "getSavedSearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {record});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.mule.module.netsuite.api.internal.GetSavedSearchResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.mule.module.netsuite.api.internal.GetSavedSearchResult) org.apache.axis.utils.JavaUtils.convert(_resp, org.mule.module.netsuite.api.internal.GetSavedSearchResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestSizeFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestSizeFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidCredentialsFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidCredentialsFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededUsageLimitFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededUsageLimitFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRecordCountFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRecordCountFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.UnexpectedErrorFault) {
              throw (org.mule.module.netsuite.api.internal.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidSessionFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidSessionFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.mule.module.netsuite.api.internal.GetCustomizationIdResult getCustomizationId(org.mule.module.netsuite.api.internal.CustomizationType customizationType, boolean includeInactives) throws java.rmi.RemoteException, org.mule.module.netsuite.api.internal.ExceededRequestSizeFault, org.mule.module.netsuite.api.internal.InvalidCredentialsFault, org.mule.module.netsuite.api.internal.ExceededUsageLimitFault, org.mule.module.netsuite.api.internal.ExceededRequestLimitFault, org.mule.module.netsuite.api.internal.ExceededRecordCountFault, org.mule.module.netsuite.api.internal.UnexpectedErrorFault, org.mule.module.netsuite.api.internal.InvalidSessionFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getCustomizationId");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "getCustomizationId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {customizationType, new java.lang.Boolean(includeInactives)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.mule.module.netsuite.api.internal.GetCustomizationIdResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.mule.module.netsuite.api.internal.GetCustomizationIdResult) org.apache.axis.utils.JavaUtils.convert(_resp, org.mule.module.netsuite.api.internal.GetCustomizationIdResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestSizeFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestSizeFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidCredentialsFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidCredentialsFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededUsageLimitFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededUsageLimitFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRecordCountFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRecordCountFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.UnexpectedErrorFault) {
              throw (org.mule.module.netsuite.api.internal.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidSessionFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidSessionFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.mule.module.netsuite.api.internal.ReadResponse initialize(org.mule.module.netsuite.api.internal.InitializeRecord initializeRecord) throws java.rmi.RemoteException, org.mule.module.netsuite.api.internal.ExceededRequestSizeFault, org.mule.module.netsuite.api.internal.InvalidCredentialsFault, org.mule.module.netsuite.api.internal.ExceededUsageLimitFault, org.mule.module.netsuite.api.internal.ExceededRequestLimitFault, org.mule.module.netsuite.api.internal.ExceededRecordCountFault, org.mule.module.netsuite.api.internal.UnexpectedErrorFault, org.mule.module.netsuite.api.internal.InvalidSessionFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("initialize");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "initialize"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {initializeRecord});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.mule.module.netsuite.api.internal.ReadResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.mule.module.netsuite.api.internal.ReadResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.mule.module.netsuite.api.internal.ReadResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestSizeFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestSizeFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidCredentialsFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidCredentialsFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededUsageLimitFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededUsageLimitFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRecordCountFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRecordCountFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.UnexpectedErrorFault) {
              throw (org.mule.module.netsuite.api.internal.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidSessionFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidSessionFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.mule.module.netsuite.api.internal.ReadResponseList initializeList(org.mule.module.netsuite.api.internal.InitializeRecord[] initializeRecord) throws java.rmi.RemoteException, org.mule.module.netsuite.api.internal.ExceededRequestSizeFault, org.mule.module.netsuite.api.internal.InvalidCredentialsFault, org.mule.module.netsuite.api.internal.ExceededUsageLimitFault, org.mule.module.netsuite.api.internal.ExceededRequestLimitFault, org.mule.module.netsuite.api.internal.ExceededRecordCountFault, org.mule.module.netsuite.api.internal.UnexpectedErrorFault, org.mule.module.netsuite.api.internal.InvalidSessionFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("initializeList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "initializeList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {initializeRecord});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.mule.module.netsuite.api.internal.ReadResponseList) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.mule.module.netsuite.api.internal.ReadResponseList) org.apache.axis.utils.JavaUtils.convert(_resp, org.mule.module.netsuite.api.internal.ReadResponseList.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestSizeFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestSizeFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidCredentialsFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidCredentialsFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededUsageLimitFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededUsageLimitFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRecordCountFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRecordCountFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.UnexpectedErrorFault) {
              throw (org.mule.module.netsuite.api.internal.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidSessionFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidSessionFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.mule.module.netsuite.api.internal.GetSelectValueResult getSelectValue(org.mule.module.netsuite.api.internal.GetSelectValueFieldDescription fieldDescription, int pageIndex) throws java.rmi.RemoteException, org.mule.module.netsuite.api.internal.ExceededRequestSizeFault, org.mule.module.netsuite.api.internal.InvalidCredentialsFault, org.mule.module.netsuite.api.internal.ExceededUsageLimitFault, org.mule.module.netsuite.api.internal.ExceededRequestLimitFault, org.mule.module.netsuite.api.internal.ExceededRecordCountFault, org.mule.module.netsuite.api.internal.UnexpectedErrorFault, org.mule.module.netsuite.api.internal.InvalidSessionFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getSelectValue");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "getSelectValue"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fieldDescription, new java.lang.Integer(pageIndex)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.mule.module.netsuite.api.internal.GetSelectValueResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.mule.module.netsuite.api.internal.GetSelectValueResult) org.apache.axis.utils.JavaUtils.convert(_resp, org.mule.module.netsuite.api.internal.GetSelectValueResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestSizeFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestSizeFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidCredentialsFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidCredentialsFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededUsageLimitFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededUsageLimitFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRecordCountFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRecordCountFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.UnexpectedErrorFault) {
              throw (org.mule.module.netsuite.api.internal.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidSessionFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidSessionFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.mule.module.netsuite.api.internal.GetItemAvailabilityResult getItemAvailability(org.mule.module.netsuite.api.internal.ItemAvailabilityFilter itemAvailabilityFilter) throws java.rmi.RemoteException, org.mule.module.netsuite.api.internal.ExceededRequestSizeFault, org.mule.module.netsuite.api.internal.InvalidCredentialsFault, org.mule.module.netsuite.api.internal.ExceededUsageLimitFault, org.mule.module.netsuite.api.internal.ExceededRequestLimitFault, org.mule.module.netsuite.api.internal.ExceededRecordCountFault, org.mule.module.netsuite.api.internal.UnexpectedErrorFault, org.mule.module.netsuite.api.internal.InvalidSessionFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getItemAvailability");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "getItemAvailability"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {itemAvailabilityFilter});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.mule.module.netsuite.api.internal.GetItemAvailabilityResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.mule.module.netsuite.api.internal.GetItemAvailabilityResult) org.apache.axis.utils.JavaUtils.convert(_resp, org.mule.module.netsuite.api.internal.GetItemAvailabilityResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestSizeFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestSizeFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidCredentialsFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidCredentialsFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededUsageLimitFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededUsageLimitFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRecordCountFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRecordCountFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.UnexpectedErrorFault) {
              throw (org.mule.module.netsuite.api.internal.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidSessionFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidSessionFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.mule.module.netsuite.api.internal.GetBudgetExchangeRateResult getBudgetExchangeRate(org.mule.module.netsuite.api.internal.BudgetExchangeRateFilter budgetExchangeRateFilter) throws java.rmi.RemoteException, org.mule.module.netsuite.api.internal.ExceededRequestSizeFault, org.mule.module.netsuite.api.internal.InvalidCredentialsFault, org.mule.module.netsuite.api.internal.ExceededUsageLimitFault, org.mule.module.netsuite.api.internal.ExceededRequestLimitFault, org.mule.module.netsuite.api.internal.ExceededRecordCountFault, org.mule.module.netsuite.api.internal.UnexpectedErrorFault, org.mule.module.netsuite.api.internal.InvalidSessionFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getBudgetExchangeRate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "getBudgetExchangeRate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {budgetExchangeRateFilter});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.mule.module.netsuite.api.internal.GetBudgetExchangeRateResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.mule.module.netsuite.api.internal.GetBudgetExchangeRateResult) org.apache.axis.utils.JavaUtils.convert(_resp, org.mule.module.netsuite.api.internal.GetBudgetExchangeRateResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestSizeFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestSizeFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidCredentialsFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidCredentialsFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededUsageLimitFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededUsageLimitFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRecordCountFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRecordCountFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.UnexpectedErrorFault) {
              throw (org.mule.module.netsuite.api.internal.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidSessionFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidSessionFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.mule.module.netsuite.api.internal.GetConsolidatedExchangeRateResult getConsolidatedExchangeRate(org.mule.module.netsuite.api.internal.ConsolidatedExchangeRateFilter consolidatedExchangeRateFilter) throws java.rmi.RemoteException, org.mule.module.netsuite.api.internal.ExceededRequestSizeFault, org.mule.module.netsuite.api.internal.InvalidCredentialsFault, org.mule.module.netsuite.api.internal.ExceededUsageLimitFault, org.mule.module.netsuite.api.internal.ExceededRequestLimitFault, org.mule.module.netsuite.api.internal.ExceededRecordCountFault, org.mule.module.netsuite.api.internal.UnexpectedErrorFault, org.mule.module.netsuite.api.internal.InvalidSessionFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getConsolidatedExchangeRate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "getConsolidatedExchangeRate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {consolidatedExchangeRateFilter});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.mule.module.netsuite.api.internal.GetConsolidatedExchangeRateResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.mule.module.netsuite.api.internal.GetConsolidatedExchangeRateResult) org.apache.axis.utils.JavaUtils.convert(_resp, org.mule.module.netsuite.api.internal.GetConsolidatedExchangeRateResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestSizeFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestSizeFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidCredentialsFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidCredentialsFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededUsageLimitFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededUsageLimitFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRecordCountFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRecordCountFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.UnexpectedErrorFault) {
              throw (org.mule.module.netsuite.api.internal.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidSessionFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidSessionFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.mule.module.netsuite.api.internal.GetPostingTransactionSummaryResult getPostingTransactionSummary(org.mule.module.netsuite.api.internal.PostingTransactionSummaryField fields, org.mule.module.netsuite.api.internal.PostingTransactionSummaryFilter filters, int pageIndex) throws java.rmi.RemoteException, org.mule.module.netsuite.api.internal.ExceededRequestSizeFault, org.mule.module.netsuite.api.internal.InvalidCredentialsFault, org.mule.module.netsuite.api.internal.ExceededUsageLimitFault, org.mule.module.netsuite.api.internal.ExceededRequestLimitFault, org.mule.module.netsuite.api.internal.ExceededRecordCountFault, org.mule.module.netsuite.api.internal.UnexpectedErrorFault, org.mule.module.netsuite.api.internal.InvalidSessionFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getPostingTransactionSummary");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "getPostingTransactionSummary"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fields, filters, new java.lang.Integer(pageIndex)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.mule.module.netsuite.api.internal.GetPostingTransactionSummaryResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.mule.module.netsuite.api.internal.GetPostingTransactionSummaryResult) org.apache.axis.utils.JavaUtils.convert(_resp, org.mule.module.netsuite.api.internal.GetPostingTransactionSummaryResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestSizeFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestSizeFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidCredentialsFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidCredentialsFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededUsageLimitFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededUsageLimitFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRecordCountFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRecordCountFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.UnexpectedErrorFault) {
              throw (org.mule.module.netsuite.api.internal.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidSessionFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidSessionFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.mule.module.netsuite.api.internal.GetServerTimeResult getServerTime() throws java.rmi.RemoteException, org.mule.module.netsuite.api.internal.InvalidCredentialsFault, org.mule.module.netsuite.api.internal.ExceededUsageLimitFault, org.mule.module.netsuite.api.internal.ExceededRequestLimitFault, org.mule.module.netsuite.api.internal.UnexpectedErrorFault, org.mule.module.netsuite.api.internal.InvalidSessionFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getServerTime");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "getServerTime"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.mule.module.netsuite.api.internal.GetServerTimeResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.mule.module.netsuite.api.internal.GetServerTimeResult) org.apache.axis.utils.JavaUtils.convert(_resp, org.mule.module.netsuite.api.internal.GetServerTimeResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidCredentialsFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidCredentialsFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededUsageLimitFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededUsageLimitFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.UnexpectedErrorFault) {
              throw (org.mule.module.netsuite.api.internal.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidSessionFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidSessionFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.mule.module.netsuite.api.internal.WriteResponse attach(org.mule.module.netsuite.api.internal.AttachReference attachReference) throws java.rmi.RemoteException, org.mule.module.netsuite.api.internal.ExceededRequestSizeFault, org.mule.module.netsuite.api.internal.InvalidCredentialsFault, org.mule.module.netsuite.api.internal.ExceededUsageLimitFault, org.mule.module.netsuite.api.internal.ExceededRequestLimitFault, org.mule.module.netsuite.api.internal.ExceededRecordCountFault, org.mule.module.netsuite.api.internal.UnexpectedErrorFault, org.mule.module.netsuite.api.internal.InvalidSessionFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("attach");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "attach"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {attachReference});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.mule.module.netsuite.api.internal.WriteResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.mule.module.netsuite.api.internal.WriteResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.mule.module.netsuite.api.internal.WriteResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestSizeFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestSizeFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidCredentialsFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidCredentialsFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededUsageLimitFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededUsageLimitFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRecordCountFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRecordCountFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.UnexpectedErrorFault) {
              throw (org.mule.module.netsuite.api.internal.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidSessionFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidSessionFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.mule.module.netsuite.api.internal.WriteResponse detach(org.mule.module.netsuite.api.internal.DetachReference detachReference) throws java.rmi.RemoteException, org.mule.module.netsuite.api.internal.ExceededRequestSizeFault, org.mule.module.netsuite.api.internal.InvalidCredentialsFault, org.mule.module.netsuite.api.internal.ExceededUsageLimitFault, org.mule.module.netsuite.api.internal.ExceededRequestLimitFault, org.mule.module.netsuite.api.internal.ExceededRecordCountFault, org.mule.module.netsuite.api.internal.UnexpectedErrorFault, org.mule.module.netsuite.api.internal.InvalidSessionFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("detach");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "detach"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {detachReference});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.mule.module.netsuite.api.internal.WriteResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.mule.module.netsuite.api.internal.WriteResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.mule.module.netsuite.api.internal.WriteResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestSizeFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestSizeFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidCredentialsFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidCredentialsFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededUsageLimitFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededUsageLimitFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRecordCountFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRecordCountFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.UnexpectedErrorFault) {
              throw (org.mule.module.netsuite.api.internal.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidSessionFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidSessionFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.mule.module.netsuite.api.internal.WriteResponse updateInviteeStatus(org.mule.module.netsuite.api.internal.UpdateInviteeStatusReference updateInviteeStatusReference) throws java.rmi.RemoteException, org.mule.module.netsuite.api.internal.ExceededRequestSizeFault, org.mule.module.netsuite.api.internal.InvalidCredentialsFault, org.mule.module.netsuite.api.internal.ExceededUsageLimitFault, org.mule.module.netsuite.api.internal.ExceededRequestLimitFault, org.mule.module.netsuite.api.internal.ExceededRecordCountFault, org.mule.module.netsuite.api.internal.UnexpectedErrorFault, org.mule.module.netsuite.api.internal.InvalidSessionFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("updateInviteeStatus");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "updateInviteeStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {updateInviteeStatusReference});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.mule.module.netsuite.api.internal.WriteResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.mule.module.netsuite.api.internal.WriteResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.mule.module.netsuite.api.internal.WriteResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestSizeFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestSizeFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidCredentialsFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidCredentialsFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededUsageLimitFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededUsageLimitFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRecordCountFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRecordCountFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.UnexpectedErrorFault) {
              throw (org.mule.module.netsuite.api.internal.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidSessionFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidSessionFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.mule.module.netsuite.api.internal.WriteResponseList updateInviteeStatusList(org.mule.module.netsuite.api.internal.UpdateInviteeStatusReference[] updateInviteeStatusReference) throws java.rmi.RemoteException, org.mule.module.netsuite.api.internal.ExceededRequestSizeFault, org.mule.module.netsuite.api.internal.InvalidCredentialsFault, org.mule.module.netsuite.api.internal.ExceededUsageLimitFault, org.mule.module.netsuite.api.internal.ExceededRequestLimitFault, org.mule.module.netsuite.api.internal.ExceededRecordCountFault, org.mule.module.netsuite.api.internal.UnexpectedErrorFault, org.mule.module.netsuite.api.internal.InvalidSessionFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("updateInviteeStatusList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "updateInviteeStatusList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {updateInviteeStatusReference});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.mule.module.netsuite.api.internal.WriteResponseList) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.mule.module.netsuite.api.internal.WriteResponseList) org.apache.axis.utils.JavaUtils.convert(_resp, org.mule.module.netsuite.api.internal.WriteResponseList.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestSizeFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestSizeFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidCredentialsFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidCredentialsFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededUsageLimitFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededUsageLimitFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRecordCountFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRecordCountFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.UnexpectedErrorFault) {
              throw (org.mule.module.netsuite.api.internal.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidSessionFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidSessionFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.mule.module.netsuite.api.internal.AsyncStatusResult asyncAddList(org.mule.module.netsuite.api.internal.Record[] record) throws java.rmi.RemoteException, org.mule.module.netsuite.api.internal.ExceededRequestSizeFault, org.mule.module.netsuite.api.internal.InvalidCredentialsFault, org.mule.module.netsuite.api.internal.ExceededRequestLimitFault, org.mule.module.netsuite.api.internal.ExceededRecordCountFault, org.mule.module.netsuite.api.internal.UnexpectedErrorFault, org.mule.module.netsuite.api.internal.InvalidSessionFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("asyncAddList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "asyncAddList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {record});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.mule.module.netsuite.api.internal.AsyncStatusResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.mule.module.netsuite.api.internal.AsyncStatusResult) org.apache.axis.utils.JavaUtils.convert(_resp, org.mule.module.netsuite.api.internal.AsyncStatusResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestSizeFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestSizeFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidCredentialsFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidCredentialsFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRecordCountFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRecordCountFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.UnexpectedErrorFault) {
              throw (org.mule.module.netsuite.api.internal.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidSessionFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidSessionFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.mule.module.netsuite.api.internal.AsyncStatusResult asyncUpdateList(org.mule.module.netsuite.api.internal.Record[] record) throws java.rmi.RemoteException, org.mule.module.netsuite.api.internal.ExceededRequestSizeFault, org.mule.module.netsuite.api.internal.InvalidCredentialsFault, org.mule.module.netsuite.api.internal.ExceededRequestLimitFault, org.mule.module.netsuite.api.internal.ExceededRecordCountFault, org.mule.module.netsuite.api.internal.UnexpectedErrorFault, org.mule.module.netsuite.api.internal.InvalidSessionFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("asyncUpdateList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "asyncUpdateList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {record});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.mule.module.netsuite.api.internal.AsyncStatusResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.mule.module.netsuite.api.internal.AsyncStatusResult) org.apache.axis.utils.JavaUtils.convert(_resp, org.mule.module.netsuite.api.internal.AsyncStatusResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestSizeFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestSizeFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidCredentialsFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidCredentialsFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRecordCountFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRecordCountFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.UnexpectedErrorFault) {
              throw (org.mule.module.netsuite.api.internal.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidSessionFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidSessionFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.mule.module.netsuite.api.internal.AsyncStatusResult asyncDeleteList(org.mule.module.netsuite.api.internal.BaseRef[] baseRef) throws java.rmi.RemoteException, org.mule.module.netsuite.api.internal.ExceededRequestSizeFault, org.mule.module.netsuite.api.internal.InvalidCredentialsFault, org.mule.module.netsuite.api.internal.ExceededRequestLimitFault, org.mule.module.netsuite.api.internal.ExceededRecordCountFault, org.mule.module.netsuite.api.internal.UnexpectedErrorFault, org.mule.module.netsuite.api.internal.InvalidSessionFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("asyncDeleteList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "asyncDeleteList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {baseRef});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.mule.module.netsuite.api.internal.AsyncStatusResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.mule.module.netsuite.api.internal.AsyncStatusResult) org.apache.axis.utils.JavaUtils.convert(_resp, org.mule.module.netsuite.api.internal.AsyncStatusResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestSizeFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestSizeFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidCredentialsFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidCredentialsFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRecordCountFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRecordCountFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.UnexpectedErrorFault) {
              throw (org.mule.module.netsuite.api.internal.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidSessionFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidSessionFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.mule.module.netsuite.api.internal.AsyncStatusResult asyncGetList(org.mule.module.netsuite.api.internal.BaseRef[] baseRef) throws java.rmi.RemoteException, org.mule.module.netsuite.api.internal.ExceededRequestSizeFault, org.mule.module.netsuite.api.internal.InvalidCredentialsFault, org.mule.module.netsuite.api.internal.ExceededRequestLimitFault, org.mule.module.netsuite.api.internal.ExceededRecordCountFault, org.mule.module.netsuite.api.internal.UnexpectedErrorFault, org.mule.module.netsuite.api.internal.InvalidSessionFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("asyncGetList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "asyncGetList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {baseRef});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.mule.module.netsuite.api.internal.AsyncStatusResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.mule.module.netsuite.api.internal.AsyncStatusResult) org.apache.axis.utils.JavaUtils.convert(_resp, org.mule.module.netsuite.api.internal.AsyncStatusResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestSizeFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestSizeFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidCredentialsFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidCredentialsFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRecordCountFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRecordCountFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.UnexpectedErrorFault) {
              throw (org.mule.module.netsuite.api.internal.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidSessionFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidSessionFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.mule.module.netsuite.api.internal.AsyncStatusResult asyncInitializeList(org.mule.module.netsuite.api.internal.InitializeRecord[] initializeRecord) throws java.rmi.RemoteException, org.mule.module.netsuite.api.internal.ExceededRequestSizeFault, org.mule.module.netsuite.api.internal.InvalidCredentialsFault, org.mule.module.netsuite.api.internal.ExceededUsageLimitFault, org.mule.module.netsuite.api.internal.ExceededRequestLimitFault, org.mule.module.netsuite.api.internal.ExceededRecordCountFault, org.mule.module.netsuite.api.internal.UnexpectedErrorFault, org.mule.module.netsuite.api.internal.InvalidSessionFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("asyncInitializeList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "asyncInitializeList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {initializeRecord});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.mule.module.netsuite.api.internal.AsyncStatusResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.mule.module.netsuite.api.internal.AsyncStatusResult) org.apache.axis.utils.JavaUtils.convert(_resp, org.mule.module.netsuite.api.internal.AsyncStatusResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestSizeFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestSizeFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidCredentialsFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidCredentialsFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededUsageLimitFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededUsageLimitFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRecordCountFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRecordCountFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.UnexpectedErrorFault) {
              throw (org.mule.module.netsuite.api.internal.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidSessionFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidSessionFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.mule.module.netsuite.api.internal.AsyncStatusResult asyncSearch(org.mule.module.netsuite.api.internal.SearchRecord searchRecord) throws java.rmi.RemoteException, org.mule.module.netsuite.api.internal.ExceededRequestSizeFault, org.mule.module.netsuite.api.internal.InvalidCredentialsFault, org.mule.module.netsuite.api.internal.ExceededRequestLimitFault, org.mule.module.netsuite.api.internal.ExceededRecordCountFault, org.mule.module.netsuite.api.internal.UnexpectedErrorFault, org.mule.module.netsuite.api.internal.InvalidSessionFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("asyncSearch");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "asyncSearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {searchRecord});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.mule.module.netsuite.api.internal.AsyncStatusResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.mule.module.netsuite.api.internal.AsyncStatusResult) org.apache.axis.utils.JavaUtils.convert(_resp, org.mule.module.netsuite.api.internal.AsyncStatusResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestSizeFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestSizeFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidCredentialsFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidCredentialsFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRecordCountFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRecordCountFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.UnexpectedErrorFault) {
              throw (org.mule.module.netsuite.api.internal.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidSessionFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidSessionFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.mule.module.netsuite.api.internal.AsyncResult getAsyncResult(java.lang.String jobId, int pageIndex) throws java.rmi.RemoteException, org.mule.module.netsuite.api.internal.ExceededRequestSizeFault, org.mule.module.netsuite.api.internal.InvalidCredentialsFault, org.mule.module.netsuite.api.internal.ExceededUsageLimitFault, org.mule.module.netsuite.api.internal.ExceededRequestLimitFault, org.mule.module.netsuite.api.internal.ExceededRecordCountFault, org.mule.module.netsuite.api.internal.UnexpectedErrorFault, org.mule.module.netsuite.api.internal.InvalidSessionFault, org.mule.module.netsuite.api.internal.AsyncFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getAsyncResult");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "getAsyncResult"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {jobId, new java.lang.Integer(pageIndex)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.mule.module.netsuite.api.internal.AsyncResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.mule.module.netsuite.api.internal.AsyncResult) org.apache.axis.utils.JavaUtils.convert(_resp, org.mule.module.netsuite.api.internal.AsyncResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestSizeFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestSizeFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidCredentialsFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidCredentialsFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededUsageLimitFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededUsageLimitFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRecordCountFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRecordCountFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.UnexpectedErrorFault) {
              throw (org.mule.module.netsuite.api.internal.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidSessionFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidSessionFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.AsyncFault) {
              throw (org.mule.module.netsuite.api.internal.AsyncFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.mule.module.netsuite.api.internal.AsyncStatusResult checkAsyncStatus(java.lang.String jobId) throws java.rmi.RemoteException, org.mule.module.netsuite.api.internal.InvalidCredentialsFault, org.mule.module.netsuite.api.internal.ExceededRequestLimitFault, org.mule.module.netsuite.api.internal.UnexpectedErrorFault, org.mule.module.netsuite.api.internal.InvalidSessionFault, org.mule.module.netsuite.api.internal.AsyncFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("checkAsyncStatus");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "checkAsyncStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {jobId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.mule.module.netsuite.api.internal.AsyncStatusResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.mule.module.netsuite.api.internal.AsyncStatusResult) org.apache.axis.utils.JavaUtils.convert(_resp, org.mule.module.netsuite.api.internal.AsyncStatusResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidCredentialsFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidCredentialsFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.UnexpectedErrorFault) {
              throw (org.mule.module.netsuite.api.internal.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidSessionFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidSessionFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.AsyncFault) {
              throw (org.mule.module.netsuite.api.internal.AsyncFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.mule.module.netsuite.api.internal.GetDeletedResult getDeleted(org.mule.module.netsuite.api.internal.GetDeletedFilter getDeletedFilter) throws java.rmi.RemoteException, org.mule.module.netsuite.api.internal.ExceededRequestSizeFault, org.mule.module.netsuite.api.internal.InvalidCredentialsFault, org.mule.module.netsuite.api.internal.ExceededUsageLimitFault, org.mule.module.netsuite.api.internal.ExceededRequestLimitFault, org.mule.module.netsuite.api.internal.ExceededRecordCountFault, org.mule.module.netsuite.api.internal.UnexpectedErrorFault, org.mule.module.netsuite.api.internal.InvalidSessionFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getDeleted");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "getDeleted"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getDeletedFilter});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.mule.module.netsuite.api.internal.GetDeletedResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.mule.module.netsuite.api.internal.GetDeletedResult) org.apache.axis.utils.JavaUtils.convert(_resp, org.mule.module.netsuite.api.internal.GetDeletedResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestSizeFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestSizeFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidCredentialsFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidCredentialsFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededUsageLimitFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededUsageLimitFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRequestLimitFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.ExceededRecordCountFault) {
              throw (org.mule.module.netsuite.api.internal.ExceededRecordCountFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.UnexpectedErrorFault) {
              throw (org.mule.module.netsuite.api.internal.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.mule.module.netsuite.api.internal.InvalidSessionFault) {
              throw (org.mule.module.netsuite.api.internal.InvalidSessionFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
