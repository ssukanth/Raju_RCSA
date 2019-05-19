@ConfigurationPositiveSteps
Feature: RCS SaaS Configuration_PositiveSteps_WC features



@RCS_SaaS_Objective_Activities_Selection_WC
Scenario: RCS_SaaS_Objective_Activities_Selection_WC
Given Login to the WebClient
When  User Provides the valid Admin credentials
Then  The User should be successfully logged into the Application
Then  User clicks on Configuration 
Then  The User should be navigated to configuration screen successfully
Then  User clicks on Positive Steps/Activities and navigates to the Positive Steps/Activities Screen
Then  User selects the Objective - 'Pre-Call Activities', 'Selling Ideas', 'Implement and Impact', 'Post-Call Activities' in the 'Positive Steps' grid for which the Activities to be assigned
Then  User selects the Activities as - Profile, Address, Attachment, Contacts, Outlet Times, Territory, Sales, Assessments, Retail Audit, Contracts, Special Orders, Planogram, Merchandising, Service Request, Suppliers to be assigned based on the Objective




@RCS_SaaS_Add_Activity_WC
Scenario: RCS_SaaS_Add_Activity_WC
Then  User clicks on Add Activity in the 'Activities' grid
And   User verifies the 'Add Activity screen' is displayed successfully
Then  User verifies the system displaying the Objective name based on the Objective selected in the previous step
Then  User selects the 'Activity Name' in the Add Activity page
Then  User enters the 'Description' in the Add Activity page
Then  User selects the 'Start Date' in the Add Activity page
Then  User selects the 'End Date' in the Add Activity page
Then  User selects the 'Touch Point' for which the Activity to be assigned
Then  User selects the 'Required' checkbox to make an activity mandatory for execution between the Start & End Date
Then  User selects the 'Recurrent' checkbox to make an activity recurrent for execution between the Start & End Date.
Then  User selects the 'Status' to make the Activity Active/Inactive
Then  User enters the 'Comments' in the Text field
Then  User selects the 'Free Field 1' in the Add Activity page
Then  User enters the 'Free Text Field 1' in the Add Activity page
Then  User enters the 'Free Text Field 2' in the Add Activity page.
Then  User clicks on save button and verifies the Activity record is saved without any errors
Then  User edits the record and modifies the data and clicks on save button
And   User verifies the edited activity record is saved without any errors.
Then  User repeats the above steps by adding multiple activities




@RCS_SaaS_Delete_Activities_WC
Scenario: RCS_SaaS_Delete_Activities_WC
Then  User clicks on the Delete icon for the activity to be deleted
And   User verifies the Activity is deleted without any errors.




@RCS_SaaS_Associate_Customers_WC
Scenario: RCS_SaaS_Associate_Customers_WC
Then  User assigns the Outlets to the Activity on clicking 'Associate Customers' button
Then  User clicks on the export button
And   User verifies the Outlets associated to the selected Activity is exported successfully
Then  User verifies the export file contains Customer ID, Customer Number, Account Name, Activity Name & Activity Number.




@RCS_SaaS_PositiveActivities_Validation1_WC
Scenario: RCS_SaaS_PositiveActivities_Validation1_WC
Then  User creates an activity for the current date & associate Outlets
Then  User clicks on the delete icon to delete the activity
And   User verifies the system not allowing to delete the activity as it has been already started & verifies the error message displayed as 'Activity already started, cannot delete this activity'




@RCS_SaaS_PositiveActivities_Validation2_WC
Scenario: RCS_SaaS_PositiveActivities_Validation2_WC
Then  User creates an activity for the current date as Start Date & End Date & associate Outlets & saves the record.
Then  User tries to change the Start Date as future date & saves it.
Then  User verifies the system not allowing to modify the start Date & displays the error message as 'Start Date cannot be greater than End Date'.



