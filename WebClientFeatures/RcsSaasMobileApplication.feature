@MobileApplication
Feature: RCS SaaS Mobile Application_WC features



@RCS_SaaS_Mobile_Application
Scenario: RCS_SaaS_Mobile_Application
Given Login to the WebClient
When  User Provides the valid Admin credentials
Then  The User should be successfully logged into the Application
Then  User clicks on Configuration 
Then  The User should be navigated to configuration screen successfully
Then  User clicks on Mobile Application under the Module priviliges and navigates to Mobile Application Screen
And   User selects the Access type for the respective screen and role
And   User clicks on the save button
And   User verifies all the changes were saved successfully.