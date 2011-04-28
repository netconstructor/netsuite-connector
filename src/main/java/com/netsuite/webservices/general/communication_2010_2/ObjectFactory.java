/**
 * Mule NetSuite Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */


package com.netsuite.webservices.general.communication_2010_2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.netsuite.webservices.general.communication_2010_2 package. 
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

    private final static QName _Note_QNAME = new QName("urn:communication_2010_2.general.webservices.netsuite.com", "Note");
    private final static QName _Message_QNAME = new QName("urn:communication_2010_2.general.webservices.netsuite.com", "Message");
    private final static QName _NoteSearch_QNAME = new QName("urn:communication_2010_2.general.webservices.netsuite.com", "noteSearch");
    private final static QName _MessageSearch_QNAME = new QName("urn:communication_2010_2.general.webservices.netsuite.com", "messageSearch");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.netsuite.webservices.general.communication_2010_2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MessageSearch }
     * 
     */
    public MessageSearch createMessageSearch() {
        return new MessageSearch();
    }

    /**
     * Create an instance of {@link Message }
     * 
     */
    public Message createMessage() {
        return new Message();
    }

    /**
     * Create an instance of {@link MessageSearchAdvanced }
     * 
     */
    public MessageSearchAdvanced createMessageSearchAdvanced() {
        return new MessageSearchAdvanced();
    }

    /**
     * Create an instance of {@link Note }
     * 
     */
    public Note createNote() {
        return new Note();
    }

    /**
     * Create an instance of {@link MessageSearchRow }
     * 
     */
    public MessageSearchRow createMessageSearchRow() {
        return new MessageSearchRow();
    }

    /**
     * Create an instance of {@link NoteSearchRow }
     * 
     */
    public NoteSearchRow createNoteSearchRow() {
        return new NoteSearchRow();
    }

    /**
     * Create an instance of {@link MessageMediaItemList }
     * 
     */
    public MessageMediaItemList createMessageMediaItemList() {
        return new MessageMediaItemList();
    }

    /**
     * Create an instance of {@link NoteSearch }
     * 
     */
    public NoteSearch createNoteSearch() {
        return new NoteSearch();
    }

    /**
     * Create an instance of {@link NoteSearchAdvanced }
     * 
     */
    public NoteSearchAdvanced createNoteSearchAdvanced() {
        return new NoteSearchAdvanced();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Note }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:communication_2010_2.general.webservices.netsuite.com", name = "Note")
    public JAXBElement<Note> createNote(Note value) {
        return new JAXBElement<Note>(_Note_QNAME, Note.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Message }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:communication_2010_2.general.webservices.netsuite.com", name = "Message")
    public JAXBElement<Message> createMessage(Message value) {
        return new JAXBElement<Message>(_Message_QNAME, Message.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoteSearch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:communication_2010_2.general.webservices.netsuite.com", name = "noteSearch")
    public JAXBElement<NoteSearch> createNoteSearch(NoteSearch value) {
        return new JAXBElement<NoteSearch>(_NoteSearch_QNAME, NoteSearch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageSearch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:communication_2010_2.general.webservices.netsuite.com", name = "messageSearch")
    public JAXBElement<MessageSearch> createMessageSearch(MessageSearch value) {
        return new JAXBElement<MessageSearch>(_MessageSearch_QNAME, MessageSearch.class, null, value);
    }

}
