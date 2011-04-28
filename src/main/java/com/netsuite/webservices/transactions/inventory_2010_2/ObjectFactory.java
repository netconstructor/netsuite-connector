/**
 * Mule NetSuite Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */


package com.netsuite.webservices.transactions.inventory_2010_2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.netsuite.webservices.transactions.inventory_2010_2 package. 
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

    private final static QName _AssemblyUnbuild_QNAME = new QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "assemblyUnbuild");
    private final static QName _InventoryAdjustment_QNAME = new QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "InventoryAdjustment");
    private final static QName _InterCompanyTransferOrder_QNAME = new QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "interCompanyTransferOrder");
    private final static QName _TransferOrder_QNAME = new QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "transferOrder");
    private final static QName _AssemblyBuild_QNAME = new QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "assemblyBuild");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.netsuite.webservices.transactions.inventory_2010_2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AssemblyUnbuild }
     * 
     */
    public AssemblyUnbuild createAssemblyUnbuild() {
        return new AssemblyUnbuild();
    }

    /**
     * Create an instance of {@link AssemblyBuild }
     * 
     */
    public AssemblyBuild createAssemblyBuild() {
        return new AssemblyBuild();
    }

    /**
     * Create an instance of {@link InterCompanyTransferOrderItem }
     * 
     */
    public InterCompanyTransferOrderItem createInterCompanyTransferOrderItem() {
        return new InterCompanyTransferOrderItem();
    }

    /**
     * Create an instance of {@link AssemblyComponent }
     * 
     */
    public AssemblyComponent createAssemblyComponent() {
        return new AssemblyComponent();
    }

    /**
     * Create an instance of {@link InterCompanyTransferOrderItemList }
     * 
     */
    public InterCompanyTransferOrderItemList createInterCompanyTransferOrderItemList() {
        return new InterCompanyTransferOrderItemList();
    }

    /**
     * Create an instance of {@link InterCompanyTransferOrder }
     * 
     */
    public InterCompanyTransferOrder createInterCompanyTransferOrder() {
        return new InterCompanyTransferOrder();
    }

    /**
     * Create an instance of {@link AssemblyComponentList }
     * 
     */
    public AssemblyComponentList createAssemblyComponentList() {
        return new AssemblyComponentList();
    }

    /**
     * Create an instance of {@link TransferOrder }
     * 
     */
    public TransferOrder createTransferOrder() {
        return new TransferOrder();
    }

    /**
     * Create an instance of {@link TransferOrderItemList }
     * 
     */
    public TransferOrderItemList createTransferOrderItemList() {
        return new TransferOrderItemList();
    }

    /**
     * Create an instance of {@link InventoryAdjustment }
     * 
     */
    public InventoryAdjustment createInventoryAdjustment() {
        return new InventoryAdjustment();
    }

    /**
     * Create an instance of {@link InventoryAdjustmentInventoryList }
     * 
     */
    public InventoryAdjustmentInventoryList createInventoryAdjustmentInventoryList() {
        return new InventoryAdjustmentInventoryList();
    }

    /**
     * Create an instance of {@link InventoryAdjustmentInventory }
     * 
     */
    public InventoryAdjustmentInventory createInventoryAdjustmentInventory() {
        return new InventoryAdjustmentInventory();
    }

    /**
     * Create an instance of {@link TransferOrderItem }
     * 
     */
    public TransferOrderItem createTransferOrderItem() {
        return new TransferOrderItem();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssemblyUnbuild }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:inventory_2010_2.transactions.webservices.netsuite.com", name = "assemblyUnbuild")
    public JAXBElement<AssemblyUnbuild> createAssemblyUnbuild(AssemblyUnbuild value) {
        return new JAXBElement<AssemblyUnbuild>(_AssemblyUnbuild_QNAME, AssemblyUnbuild.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InventoryAdjustment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:inventory_2010_2.transactions.webservices.netsuite.com", name = "InventoryAdjustment")
    public JAXBElement<InventoryAdjustment> createInventoryAdjustment(InventoryAdjustment value) {
        return new JAXBElement<InventoryAdjustment>(_InventoryAdjustment_QNAME, InventoryAdjustment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterCompanyTransferOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:inventory_2010_2.transactions.webservices.netsuite.com", name = "interCompanyTransferOrder")
    public JAXBElement<InterCompanyTransferOrder> createInterCompanyTransferOrder(InterCompanyTransferOrder value) {
        return new JAXBElement<InterCompanyTransferOrder>(_InterCompanyTransferOrder_QNAME, InterCompanyTransferOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransferOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:inventory_2010_2.transactions.webservices.netsuite.com", name = "transferOrder")
    public JAXBElement<TransferOrder> createTransferOrder(TransferOrder value) {
        return new JAXBElement<TransferOrder>(_TransferOrder_QNAME, TransferOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssemblyBuild }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:inventory_2010_2.transactions.webservices.netsuite.com", name = "assemblyBuild")
    public JAXBElement<AssemblyBuild> createAssemblyBuild(AssemblyBuild value) {
        return new JAXBElement<AssemblyBuild>(_AssemblyBuild_QNAME, AssemblyBuild.class, null, value);
    }

}
