@Authorization
Feature: RCS SaaS Authorization_WC features


@RCS_SaaS_Authorization_WC
Scenario: RCS_SaaS_Authorization_WC
Given Login to the WebClient
When  User Provides the valid Admin credentials
Then  The User should be successfully logged into the Application
Then  User clicks on Authorization 
Then  The User should be navigated to Authorization screen successfully
Then  User enters the 'Transaction Number'
Then  User selects the 'Transaction Type'
Then  User clicks on 'Generate' button
And   User verifies that the 'Authentication Code' is generated in the Authorization screen