@Territory
Feature: RCS SaaS Territory_WC features


@Login_And_Navigation_Territory
Scenario: Login_And_Navigation_Territory
Given Login to the WebClient
When  User Provides the valid Admin credentials
Then  The User should be successfully logged into the Application
Then  User clicks on Configuration 
Then  The User should be navigated to configuration screen successfully
Then  User clicks on the Territory Menu and navigates to the Territory Screen




@Creation_Of_New_Territory
Scenario: RCS_SaaS_Territory_WC
Then  User clicks on 'Add' button to add a Territory
And   The 'Add Territory' screen should be displayed successfully
Then  User enters the 'Territory code'
Then  User enters the 'Territory name'
Then  User selects 'Trade Approach' dropdown
Then  User selects the 'Status' as 'Active by default'
Then  User selects the 'Level' dropdown
Then  User selects the 'Country' dropdown
Then  User selects the 'Start Date' 
Then  User selects the 'End Date'
Then  User clicks on Save button and Territory details should be saved successfully




#@Association_Of_Outlets_To_Territory
#Scenario: Association_Of_Outlets_To_Territory
#Then  User clicks on the 'Associate Customers' button in the Territory Screen
#And   User verifies the Popup window should be displayed to choose the local file
#Then  User selects the file 'Outlet Import' and clicks on 'Open' button to associate Outlets to the territory
#And   User verifies the Association of Outlets to the territory should be successful




@Edit_Territory
Scenario: Edit_Territory
Then  User clicks on the Territory code hyperlink to Edit Territory details
And   User verifies the Edit Territory page is displayed successfully
Then  User edits the Territory details and clicks on Save button
And   User verifies the Territory details is updated successfully.


