#Run @Territory, @Organisation, @NewOutletCreation, @Routes
@Routes
Feature: RCS SaaS Routes_WC features



@RCS_SaaS_Routes_Navigation_WC
Scenario: RCS_SaaS_Routes_Navigation_WC
Given Login to the WebClient
When  User Provides the valid Admin credentials
Then  The User should be successfully logged into the Application
Then  User clicks on Route tab 
Then  The User should be navigated to Setup tab under the Route screen successfully
Then  User selects the 'Trade Approach' from the dropdown
Then  User selects the 'Territory' for which the new Route to be selected
Then  User clicks on 'Add' button and navigates to the 'Add New Route page'




@RCS_SaaS_New_Route_Addition_WC
Scenario: RCS_SaaS_New_Route_Addition_WC
And   User verifies the 'Territory Name' is auto displayed based on the Territory selected
And   User verifies the 'Trade Approach' is auto displayed based on the Trade Approach selected
Then  User selects the 'Route' from the dropdown based on the Route created
Then  User selects the 'Status' in the Add New Route page
Then  User selects the 'Free LOV 1' in the Add New Route page
Then  User selects the 'Free LOV 2' in the Add New Route page.
Then  User enters the 'Free Text 1' in the Add New Route page
Then  User enters the 'Free Text 2' in the Add New Route page.
Then  User clicks on save button and verifies the selected Route is added successfully for the selected territory.




@RCS_SaaS_New_Assign_Outlet_WC
Scenario: RCS_SaaS_New_Assign_Outlet_WC
Then  User navigates to the 'Assign Outlet' tab under the Route screen
Then  User selects the same Trade Approach in the 'Assign Outlets to Routes' grid from the dropdown
Then  User selects the same Territory in 'Territories' grid
Then  User selects the Route in 'Routes' grid created and verifies that no outlets were assigned to this route if it is a new route




@RCS_SaaS_Assign_Outlet_WC
Scenario: RCS_SaaS_Assign_Outlet_WC
Then  User clicks on the icon present in front of required Outlet from 'Available Outlets in Territory' grid
And   User verifies the same Outlet is added successfully in the 'Route Assignment' grid
Then  User assigns the Order number for the Outlets & clicks on 'Refresh Order' button and verifies the outlets are displayed based on the order number
Then  User clicks on the export button and verifies the outlet export file contains the following Trade Approach, Territory, Customer ID, Customer Number, Order, Customer Name & Route information.




@RCS_SaaS_AssignDates_WC
Scenario: RCS_SaaS_AssignDates_WC
Then  User navigates to the 'Assign Dates' tab under the Route screen
Then  User selects the same Trade Approach in the 'Assign Dates to Routes' grid from the dropdown
Then  User selects the same Territory in 'Territories' grid.
Then  User selects the Route in 'Routes' grid created and verifies that no outlets were assigned to this route if it is a new route.




@RCS_SaaS_Assign_Dates_WC
Scenario: RCS_SaaS_Assign_Dates_WC
Then  From the 'Date Assignment' grid user selects the Start Day from which the Outlets to be assigned to the Route
Then  User selects the Start Date from which the Outlets to be assigned to the Route
Then  User enters the data in Repetitions for how many times the Outlet to be assigned to the Route
Then  User enters the data in Frequency(days) for how frequently the Outlet to be assigned to the Route
Then  User clicks on the 'Assign' button and verifies the Start Day & Start Date is displayed under the 'Assigned Dates for Route' grid
Then  User selects the Date from which the Outlets to be assigned to the Routes in FROM & TO date picker & clicks on SHOW button
And   User verifies the system displaying the Start Day & Start Date under the 'Assigned Dates for Route' grid.




@RCS_SaaS_Calendar_WC
Scenario: RCS_SaaS_Calendar_WC
Then  User navigates to the 'Calendar' tab under the Route screen
Then  User selects the same Trade Approach in the 'Route Calendar' grid from the dropdown
Then  User selects the same Territory in 'Territories' grid in the Calendar page
Then  User selects the Route from the Routes dropdown & clicks on the SHOW button
Then  User verifies the system by default displaying the Routes for Days for the whole month
Then  User verifies the created Route is displayed for the Start Day & Start Date for which it is assigned
Then  User clicks on the export button and verifies the exported file displaying the following Trade Approach, Territory, Route Start Date & Route Name.











