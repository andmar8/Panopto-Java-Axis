
/**
 * AuthCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package com.panopto.auth;

    /**
     *  AuthCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class AuthCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public AuthCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public AuthCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for getServerVersion method
            * override this method for handling normal response from getServerVersion operation
            */
           public void receiveResultgetServerVersion(
                    com.panopto.auth.AuthStub.GetServerVersionResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getServerVersion operation
           */
            public void receiveErrorgetServerVersion(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for logOnWithExternalProvider method
            * override this method for handling normal response from logOnWithExternalProvider operation
            */
           public void receiveResultlogOnWithExternalProvider(
                    com.panopto.auth.AuthStub.LogOnWithExternalProviderResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from logOnWithExternalProvider operation
           */
            public void receiveErrorlogOnWithExternalProvider(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for logOnWithPassword method
            * override this method for handling normal response from logOnWithPassword operation
            */
           public void receiveResultlogOnWithPassword(
                    com.panopto.auth.AuthStub.LogOnWithPasswordResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from logOnWithPassword operation
           */
            public void receiveErrorlogOnWithPassword(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getAuthenticatedUrl method
            * override this method for handling normal response from getAuthenticatedUrl operation
            */
           public void receiveResultgetAuthenticatedUrl(
                    com.panopto.auth.AuthStub.GetAuthenticatedUrlResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getAuthenticatedUrl operation
           */
            public void receiveErrorgetAuthenticatedUrl(java.lang.Exception e) {
            }
                


    }
    