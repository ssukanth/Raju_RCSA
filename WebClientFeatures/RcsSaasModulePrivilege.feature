@ModulePrivilege
Feature: RCS SaaS Module Privilege_WC features



@RCS_SaaS_Module_Privilege
Scenario: RCS_SaaS_Module_Privilege
Given Login to the WebClient
When  User Provides the valid Admin credentials
Then  The User should be successfully logged into the Application
Then  User clicks on Configuration 
Then  The User should be navigated to configuration screen successfully
Then  User clicks on Module priviliges and navigates to Module priviliges Screen
Then  The user or the admin should be able to select a specific role from the dropdown
Then  User selects the module name from the dropdown for which the access has to be provided
Then  User validates the List of screens present under the selected module
Then  User selects the 'Access type' - User can select 'Read-only access' or 'Full access'
Then  User clicks on the 'Add all' arrow button
Then  User validates whether all the screens provided with the access type 'Privilege' selected
Then  User verifies the display of sub-module and screen details with access type 'Full access or read only access' checked. 