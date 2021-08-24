/**
 * SoapPublisherService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gpcoder.ws;

public interface SoapPublisherService extends javax.xml.rpc.Service {
    public java.lang.String getSoapPublisherAddress();

    public com.gpcoder.ws.SoapPublisher getSoapPublisher() throws javax.xml.rpc.ServiceException;

    public com.gpcoder.ws.SoapPublisher getSoapPublisher(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
