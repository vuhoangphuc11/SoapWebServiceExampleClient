package com.gpcoder.ws;

public class SoapPublisherProxy implements com.gpcoder.ws.SoapPublisher {
  private String _endpoint = null;
  private com.gpcoder.ws.SoapPublisher soapPublisher = null;
  
  public SoapPublisherProxy() {
    _initSoapPublisherProxy();
  }
  
  public SoapPublisherProxy(String endpoint) {
    _endpoint = endpoint;
    _initSoapPublisherProxy();
  }
  
  private void _initSoapPublisherProxy() {
    try {
      soapPublisher = (new com.gpcoder.ws.SoapPublisherServiceLocator()).getSoapPublisher();
      if (soapPublisher != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)soapPublisher)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)soapPublisher)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (soapPublisher != null)
      ((javax.xml.rpc.Stub)soapPublisher)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.gpcoder.ws.SoapPublisher getSoapPublisher() {
    if (soapPublisher == null)
      _initSoapPublisherProxy();
    return soapPublisher;
  }
  
  public void main(java.lang.String[] args) throws java.rmi.RemoteException{
    if (soapPublisher == null)
      _initSoapPublisherProxy();
    soapPublisher.main(args);
  }
  
  
}