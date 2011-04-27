
package com.netsuite.webservices.platform_2010_2;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.3.0
 * Tue Apr 26 17:35:33 ART 2011
 * Generated source version: 2.3.0
 * 
 */

@WebFault(name = "exceededRequestSizeFault", targetNamespace = "urn:faults_2010_2.platform.webservices.netsuite.com")
public class ExceededRequestSizeFault extends Exception {
    public static final long serialVersionUID = 20110426173533L;
    
    private com.netsuite.webservices.platform.faults_2010_2.ExceededRequestSizeFault exceededRequestSizeFault;

    public ExceededRequestSizeFault() {
        super();
    }
    
    public ExceededRequestSizeFault(String message) {
        super(message);
    }
    
    public ExceededRequestSizeFault(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceededRequestSizeFault(String message, com.netsuite.webservices.platform.faults_2010_2.ExceededRequestSizeFault exceededRequestSizeFault) {
        super(message);
        this.exceededRequestSizeFault = exceededRequestSizeFault;
    }

    public ExceededRequestSizeFault(String message, com.netsuite.webservices.platform.faults_2010_2.ExceededRequestSizeFault exceededRequestSizeFault, Throwable cause) {
        super(message, cause);
        this.exceededRequestSizeFault = exceededRequestSizeFault;
    }

    public com.netsuite.webservices.platform.faults_2010_2.ExceededRequestSizeFault getFaultInfo() {
        return this.exceededRequestSizeFault;
    }
}
