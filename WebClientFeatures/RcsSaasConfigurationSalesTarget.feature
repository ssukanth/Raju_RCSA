@SalesTarget
Feature: RCS SaaS Configuration_SalesTarget_WC features



@RCS_SaaS_Configuration_SalesTarget_WC
Scenario: RCS_SaaS_Configuration_SalesTarget_WC
Given Login to the WebClient
When  User Provides the valid Admin credentials
Then  The User should be successfully logged into the Application
Then  User clicks on Configuration 
Then  The User should be navigated to configuration screen successfully
Then  User clicks on Sales Target and navigates to Sales Target Screen
Then  User clicks on Add button and verifies the ADD SALES TARGET screen is displayed
Then  User selects the 'Employee' dropdown - Employee Names should be listed
Then  User selects the 'SKU' dropdown - Active SKU names should be displayed
Then  User enters the 'Sales Target'
Then  User selects the 'Start Date' for Sales Target
Then  User selects the 'End Date' for Sales Target
And   User verifies 'Achieved' is a Read only field
Then  User verifies '% Achieved' is a Read only field
Then  User verifies 'Remaining Volume' is a Read only field
Then  User enters the 'Remarks'
Then  User enters the data in all mandatory fields & click on Save button
And   User verifies the SKU Sales Target for the Employee created successfully.




@RCS_SaaS_Configuration_Employee_Sales_Target
Scenario: RCS_SaaS_Configuration_Employee_Sales_Target
Then  User clicks on 'Employee Sales Target' button and the system should export all the Employee Sales Target in the excel format
Then  User verifies the 'Employee' column is available in the 'Employees Sales Target' sheet
Then  User verifies the 'Product name' column is available in the 'Employees Sales Target' sheet
Then  User verifies the 'Sales Target' column is available in the 'Employees Sales Target' sheet
Then  User verifies the 'Remarks' column is available in the 'Employees Sales Target' sheet
Then  User verifies the 'Start Date' column is available in the 'Employees Sales Target' sheet
Then  User verifies the 'End Date' column is available in the 'Employees Sales Target' sheet
Then  User verifies the 'Sales Achieved' column is available in the 'Employees Sales Target' sheet
Then  User verifies the 'Sale Percent Achieved' column is available in the 'Employees Sales Target' sheet
Then  User verifies the 'Sale Remaining Volume' column is available in the 'Employees Sales Target' sheet




@RCS_SaaS_Configuration_SalesTarget_WC_Validation_1
Scenario: RCS_SaaS_Configuration_SalesTarget_WC - Validation 1
Then  User clicks on Add button and verifies the ADD SALES TARGET screen is displayed
Then  User enters the 'Start Date' greater than the 'End Date' for the Sales Target
Then  User enters the data in all mandatory fields & click on Save button
And   User verifies the Error message displayed as 'Start Date cannot be greater than End Date'.




@RCS_SaaS_Configuration_SalesTarget_WC_Validation_2
Scenario: RCS_SaaS_Configuration_SalesTarget_WC - Validation 2y
Then  User clicks on Sales Target and navigates to Sales Target Screen
Then  User clicks on Add button and verifies the ADD SALES TARGET screen is displayed
Then  User Adds one more sales target for the same SKU, same Employee, same date range & clicks on save button
Then  User verifies the Error message displayed as 'Sales Target dates are overlapping for the SKU'




@RCS_SaaS_Configuration_SalesTarget_Deletion
Scenario: RCS_SaaS_Configuration_SalesTarget_Deletion
Then  User clicks on Sales Target and navigates to Sales Target Screen
Then  User selects an Sales Target record & clicks on the Delete icon present before the Employee name
And   User verifies that selected Sales Target record deleted successfully.






