@ConfigurationUsers
Feature: RCS SaaS Configuration_WC features


@RCS_SaaS_Configuration_WC
Scenario: RCS_SaaS_Configuration_WC
Given Login to the WebClient
When  User Provides the valid Admin credentials
Then  The User should be successfully logged into the Application
Then  User clicks on Configuration 
Then  The User should be navigated to configuration screen successfully
Then  User clicks on 'Users' tab and navigates to Users screen                        
Then  User clicks on Add button and navigate to Add New User screen                             
Then  User enters the 'Employee ID'
Then  User enters the 'First Name'
Then  User enters the 'Last Name'
Then  User enters the 'User Name'
Then  User selects the 'Role' dropDown
Then  User selects the 'Status' dropDown
Then  User enters the 'Address'
Then  User enters the 'Valid Email'                                                  
Then  User clicks on Save button and the data should be saved successfully and the user should be able to get the Email/OTP.

