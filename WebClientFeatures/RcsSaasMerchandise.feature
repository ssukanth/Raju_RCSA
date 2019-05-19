@Merchandise
Feature: RCS SaaS Merchandise_WC features



@RCS_SaaS_Merchandise_WC_Create
Scenario: RCS_SaaS_Merchandise_WC - Create a Merchandise
Given Login to the WebClient
When  User Provides the valid Admin credentials
Then  The User should be successfully logged into the Application
Then  User clicks on Configuration 
Then  The User should be navigated to configuration screen successfully
Then  User clicks on Merchandising and navigates to Merchandising Screen
Then  User clicks on Add button and verifies the Add Merchandise screen is displayed
And   User verifies all the fields were displayed in 'Add Merchandise' screen
Then  User enters the 'Merchandise name'
Then  User selects the 'Brand name' dropdown which displays the Brand data from the products
Then  User selects the 'Merchandise type' dropdown which displays the data from LOV > USER > MT
Then  User enters the 'Asset No.'
Then  User enters the 'Cost'
Then  User selects the 'Status' dropdown for Merchandise
Then  User selects the 'Start Date' for Merchandise
Then  User selects the 'End Date' for Merchandise
Then  User selects the 'Remove Date'
Then  User selects the 'Inform capability' dropdown
Then  User selects the 'Switch capability' dropdown
Then  User selects the 'Retain capability' dropdown
Then  User selects Free Field 1 dropdown which displays the data from LOV > USER > MFL1
Then  User selects Free Field 2 dropdowns which displays the data from LOV > USER > MFL2
Then  User enters the 'Free Text Field1'
Then  User enters the 'Merch. Short Name'
And   User clicks on save button and verifies the Merchandise records saved successfully




@RCS_SaaS_Merchandise_WC_Edit
Scenario: RCS_SaaS_Merchandise_WC - Edit Merchandise
Then  User clicks on 'Merchandise name' hyperlink and navigates to the "Edit merchandise" screen
And   User verifies that the user is allowed to edit and enter the values in the required fields
And   User clicks on save button and verifies the Changes are saved successfully
Then  User clicks on Signout and clicks on 'OK' button and verifies the admin as been logged out successfully.


