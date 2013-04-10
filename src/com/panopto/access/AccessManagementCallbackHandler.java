
/**
 * AccessManagementCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package com.panopto.access;

    /**
     *  AccessManagementCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class AccessManagementCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public AccessManagementCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public AccessManagementCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for updateSessionInheritViewerAccess method
            * override this method for handling normal response from updateSessionInheritViewerAccess operation
            */
           public void receiveResultupdateSessionInheritViewerAccess(
                    com.panopto.access.AccessManagementStub.UpdateSessionInheritViewerAccessResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from updateSessionInheritViewerAccess operation
           */
            public void receiveErrorupdateSessionInheritViewerAccess(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for grantGroupViewerAccessToSession method
            * override this method for handling normal response from grantGroupViewerAccessToSession operation
            */
           public void receiveResultgrantGroupViewerAccessToSession(
                    com.panopto.access.AccessManagementStub.GrantGroupViewerAccessToSessionResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from grantGroupViewerAccessToSession operation
           */
            public void receiveErrorgrantGroupViewerAccessToSession(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for updateFolderIsPublic method
            * override this method for handling normal response from updateFolderIsPublic operation
            */
           public void receiveResultupdateFolderIsPublic(
                    com.panopto.access.AccessManagementStub.UpdateFolderIsPublicResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from updateFolderIsPublic operation
           */
            public void receiveErrorupdateFolderIsPublic(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getSessionAccessDetails method
            * override this method for handling normal response from getSessionAccessDetails operation
            */
           public void receiveResultgetSessionAccessDetails(
                    com.panopto.access.AccessManagementStub.GetSessionAccessDetailsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getSessionAccessDetails operation
           */
            public void receiveErrorgetSessionAccessDetails(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for revokeGroupViewerAccessFromSession method
            * override this method for handling normal response from revokeGroupViewerAccessFromSession operation
            */
           public void receiveResultrevokeGroupViewerAccessFromSession(
                    com.panopto.access.AccessManagementStub.RevokeGroupViewerAccessFromSessionResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from revokeGroupViewerAccessFromSession operation
           */
            public void receiveErrorrevokeGroupViewerAccessFromSession(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getSelfUserAccessDetails method
            * override this method for handling normal response from getSelfUserAccessDetails operation
            */
           public void receiveResultgetSelfUserAccessDetails(
                    com.panopto.access.AccessManagementStub.GetSelfUserAccessDetailsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getSelfUserAccessDetails operation
           */
            public void receiveErrorgetSelfUserAccessDetails(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for revokeUsersAccessFromFolder method
            * override this method for handling normal response from revokeUsersAccessFromFolder operation
            */
           public void receiveResultrevokeUsersAccessFromFolder(
                    com.panopto.access.AccessManagementStub.RevokeUsersAccessFromFolderResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from revokeUsersAccessFromFolder operation
           */
            public void receiveErrorrevokeUsersAccessFromFolder(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for grantUsersAccessToFolder method
            * override this method for handling normal response from grantUsersAccessToFolder operation
            */
           public void receiveResultgrantUsersAccessToFolder(
                    com.panopto.access.AccessManagementStub.GrantUsersAccessToFolderResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from grantUsersAccessToFolder operation
           */
            public void receiveErrorgrantUsersAccessToFolder(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for revokeUsersViewerAccessFromSession method
            * override this method for handling normal response from revokeUsersViewerAccessFromSession operation
            */
           public void receiveResultrevokeUsersViewerAccessFromSession(
                    com.panopto.access.AccessManagementStub.RevokeUsersViewerAccessFromSessionResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from revokeUsersViewerAccessFromSession operation
           */
            public void receiveErrorrevokeUsersViewerAccessFromSession(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getUserAccessDetails method
            * override this method for handling normal response from getUserAccessDetails operation
            */
           public void receiveResultgetUserAccessDetails(
                    com.panopto.access.AccessManagementStub.GetUserAccessDetailsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getUserAccessDetails operation
           */
            public void receiveErrorgetUserAccessDetails(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for updateSessionIsPublic method
            * override this method for handling normal response from updateSessionIsPublic operation
            */
           public void receiveResultupdateSessionIsPublic(
                    com.panopto.access.AccessManagementStub.UpdateSessionIsPublicResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from updateSessionIsPublic operation
           */
            public void receiveErrorupdateSessionIsPublic(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for grantGroupAccessToFolder method
            * override this method for handling normal response from grantGroupAccessToFolder operation
            */
           public void receiveResultgrantGroupAccessToFolder(
                    com.panopto.access.AccessManagementStub.GrantGroupAccessToFolderResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from grantGroupAccessToFolder operation
           */
            public void receiveErrorgrantGroupAccessToFolder(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for grantUsersViewerAccessToSession method
            * override this method for handling normal response from grantUsersViewerAccessToSession operation
            */
           public void receiveResultgrantUsersViewerAccessToSession(
                    com.panopto.access.AccessManagementStub.GrantUsersViewerAccessToSessionResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from grantUsersViewerAccessToSession operation
           */
            public void receiveErrorgrantUsersViewerAccessToSession(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for revokeGroupAccessFromFolder method
            * override this method for handling normal response from revokeGroupAccessFromFolder operation
            */
           public void receiveResultrevokeGroupAccessFromFolder(
                    com.panopto.access.AccessManagementStub.RevokeGroupAccessFromFolderResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from revokeGroupAccessFromFolder operation
           */
            public void receiveErrorrevokeGroupAccessFromFolder(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getGroupAccessDetails method
            * override this method for handling normal response from getGroupAccessDetails operation
            */
           public void receiveResultgetGroupAccessDetails(
                    com.panopto.access.AccessManagementStub.GetGroupAccessDetailsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getGroupAccessDetails operation
           */
            public void receiveErrorgetGroupAccessDetails(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getFolderAccessDetails method
            * override this method for handling normal response from getFolderAccessDetails operation
            */
           public void receiveResultgetFolderAccessDetails(
                    com.panopto.access.AccessManagementStub.GetFolderAccessDetailsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getFolderAccessDetails operation
           */
            public void receiveErrorgetFolderAccessDetails(java.lang.Exception e) {
            }
                


    }
    