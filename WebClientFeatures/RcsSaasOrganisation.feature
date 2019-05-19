#Pre-Requisite - Execute Territory


@Organisation
Feature: RCS SaaS Organisation_WC features



#Add Organisation
@RCS_SaaS_Add_Organisation_WC
Scenario: RCS_SaaS_Organisation_WC
Given Login to the WebClient
When  User Provides the valid Admin credentials
Then  The User should be successfully logged into the Application
Then  User clicks on Configuration 
Then  The User should be navigated to configuration screen successfully
Then  User clicks on Organisation and navigates to the Organisation Screen
Then  User clicks on the 'Add' button and navigates to the 'Add Organisation Details' screen
Then  User enters the 'First Name' in the Add Organisation Details page
Then  User enters the 'Last Name' in the Add Organisation Details page
Then  User selects the 'Position' in the Add Organisation Details page
Then  User selects the 'Territory' in the Add Organisation Details page
Then  User selects the 'Parent Position' in the Add Organisation Details page
Then  User selects the 'Parent' in the Add Organisation Details page
Then  User selects the 'Parent Position 1' in the Add Organisation Details page.
Then  User selects the 'Parent 1' in the Add Organisation Details page.
Then  User verifies the 'Trade Approach' is auto populated
Then  User selects the 'Status' in the Add Organisation Details page
Then  User selects the 'Free Field 1' in the Add Organisation Details page
Then  User selects the 'Free Field 2' in the Add Organisation Details page.
Then  User enters the 'Employee ID' in the Add Organisation Details page
Then  User enters the 'User Name' in the Add Organisation Details page
Then  User enters the 'Email ID' in the Add Organisation Details page
Then  User selects the 'Role' in the Add Organisation Details page
Then  User selects the 'Logging' checkbox
Then  User enters the 'Address' in the textfield
Then  User clicks on the save button and verifies the Organisation record is saved successfully.




#Edit Organisation
@RCS_SaaS_Edit_Organisation_WC
Scenario: RCS_SaaS_Organisation_WC
Then  User search with the username in the List of Organisation section and clicks on first name link
Then  User selects 'Position' dropdown
Then  User selects 'Parent Position' dropdown
Then  User selects 'Parent' dropdown
Then  User selects 'Parent Position1' dropdown
Then  User selects 'Parent1' dropdown
Then  User selects 'Status' dropdown
Then  User selects Free Field 1 dropdown
Then  User selects Free Field 2 dropdowns
Then  The Created employee or user details should be saved successfully
And   The user created should get an OTP for the e-mail ID provided while creating the User.
And   The User should be successfully logged out from the web client page.

