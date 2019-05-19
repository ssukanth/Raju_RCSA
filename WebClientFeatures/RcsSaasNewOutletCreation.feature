@NewOutletCreation
Feature: RCS SaaS New_Outlet_Creation_WC features


@RCS_SaaS_New_Outlet_Creation_WC
Scenario: RCS_SaaS_New_Outlet_Creation_WC features
Given Login to the WebClient
When  User Provides the valid Admin credentials
Then  The User should be successfully logged into the Application
Then  User clicks on Search tab 
Then  The User should be navigated to customer search screen successfully
Then  User clicks on Create new customer button
And   The Add new customer screen should be visible to the admin 
Then  The user selects 'Customer type' from the drop down
Then  User selects 'Status' from drop down
Then  User selects 'Shopper channel' from dropdown
Then  User enters 'Customer name' in the Customer Name text box
Then  User selects 'Outlet type' from outlet type dropdown
Then  User selects 'Outlet subtype' from outlet subtype dropdown
Then  User selects 'Territory' from Territory dropdown
Then  User navigates to Customer Classification section
And   User Enter/Selects the required data in Customer Classification Section
Then  User navigates to Additional Information section
And   User Enter/Selects the required data in Additional Information Section
Then  User clicks on save button and the customer should be created successfully
Then  User navigates to the Search results screen
Then  User navigates to the Trading Terms section
Then  User selects the 'Price List' dropdown
Then  User selects the 'Payment type' dropdown
Then  User selects the 'Collection type' dropdown and other required fields
Then  User clicks on save button and the customer should be saved