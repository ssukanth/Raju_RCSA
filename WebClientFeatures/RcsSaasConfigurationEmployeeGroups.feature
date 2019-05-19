@EmployeeGroups
Feature: RCS SaaS Configuration_EmployeeGroups_WC features



@RCS_SaaS_EmployeeGroups_WC
Scenario: RCS_SaaS_EmployeeGroups_WC
Given Login to the WebClient
When  User Provides the valid Admin credentials
Then  The User should be successfully logged into the Application
Then  User clicks on Configuration 
Then  The User should be navigated to configuration screen successfully
Then  User clicks on Employee Groups and navigates to Employee Groups Screen
Then  User clicks on 'ADD GROUP' button in Employee Groups List grid and Add New Group screen should open successfully
Then  User enters the 'Group name' - mandatory Text field
Then  User enters the 'Group Description' - Non mandatory Text field
Then  User clicks on save button and the record should get saved & displayed under Employee Groups List
Then  User clicks on the Group Name hyperlink for which the data to be edited
Then  User should be navigated to Edit Group List
And   The data should be edited & saved without any errors




@RCS_SaaS_EmployeeGroups_AssignEmployees_WC
Scenario: RCS_SaaS_EmployeeGroups_AssignEmployees_WC
Then  User clicks on Configuration 
Then  The User should be navigated to configuration screen successfully
Then  User clicks on Employee Groups and navigates to Employee Groups Screen
Then  User clicks on 'ASSIGN EMPLOYEES' button and Assign Employees screen should get displayed successfully
Then  User selects the 'Employee Group' - Which displays all the Employee Groups available in the system
Then  User verifies that all the Active Employees from the 'Available Employees' system are present in the left side
Then  User selects all the required 'Available Employees' to the right side of 'Assign Employees' system by clicking on the right arrow button
Then  User clicks on save button and verfies the message 'Employees assigned to Group successfully' under Employee Groups List




@RCS_SaaS_EmployeeGroups_GroupMessages_WC
Scenario: RCS_SaaS_EmployeeGroups_GroupMessages_WC
Then  User clicks on Configuration 
Then  The User should be navigated to configuration screen successfully
Then  User clicks on Employee Groups and navigates to Employee Groups Screen
Then  User clicks on 'Group Messages' button and the Group Message List screen should get displayed successfully
Then  User verifies the 'Group name', 'Message', 'Expiry Date', 'Delete icon' present in the Group Message List screen
Then  User clicks on 'Add Message' button and Add New Message screen should get displayed successfully
Then  User selects the 'Employee Group' from the dropDown
Then  User enters the 'Message' inside the Text field
Then  User selects the 'Expiry Date'
Then  User clicks on save button and the Message should be saved successfully and displayed under Group Messages list
Then  User clicks on the Group Name hyperlink for which the message to be edited and navigates to Edit Group Message page
Then  User Edits the Message and clicks on save button and the data should be saved without any errors




@RCS_SaaS_EmployeeGroups_Delete_WC
Scenario: RCS_SaaS_EmployeeGroups_Delete_WC
Then  User clicks on Configuration 
Then  The User should be navigated to configuration screen successfully
Then  User clicks on Employee Groups and navigates to Employee Groups Screen
Then  User clicks on 'Group Messages' button and the Group Message List screen should get displayed successfully
Then  User clicks on the Delete icon for the Group message and Group Message should be deleted successfully
Then  User clicks on the Delete icon for which the Employee Group to be deleted
Then  The system should prompt an message 'Group cannot be deleted as Employees are associated with this group'
Then  User clicks on 'ASSIGN EMPLOYEES' button and Assign Employees screen should get displayed successfully 
Then  User selects the Employee group for which the Employs to be disassociated and clicks on the Left icon
Then  User clicks on the save button and the System should display a message '0 Employees assigned to group successfully'
Then  User clicks on the Delete icon and the Employee Group should be deleted successfully from the application.




@RCS_SaaS_EmployeeGroups_Duplicate_WC
Scenario: RCS_SaaS_EmployeeGroups_Duplicate_WC
Then  User clicks on Configuration 
Then  The User should be navigated to configuration screen successfully
Then  User clicks on Employee Groups and navigates to Employee Groups Screen
Then  User creates a another Employee Group with the same Group name & same Group Description which already exists in the application
And   User verifies application not allowing to create a Employee Group with the same name.




