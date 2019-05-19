@Contract
Feature: RCS SaaS Configuration_Contract_WC features




@RCS_SaaS_Create_Corporate_Contract
Scenario: RCS_SaaS_Create_Corporate_Contract
Given Login to the WebClient
When  User Provides the valid Admin credentials
Then  The User should be successfully logged into the Application
Then  User clicks on Configuration 
Then  The User should be navigated to configuration screen successfully
Then  User clicks on 'Contract' tab and navigates to the Contract screen
Then  User clicks on 'Add Corporate Contract' button   
And   The User should be navigated to 'Add Corporate Contract screen'
Then  User enters the 'Contract name' which is a mandatory field
Then  User verifies the 'Contract type' is 'Corporate' by default & it is displayed as read only field
Then  User selects the 'Contract company' dropdown
Then  User selects the 'Contract Inactive' checkbox
Then  User selects the 'Check Frequency' dropdown
Then  User selects the 'Start Date' for the Contract
Then  User selects the 'End Date' for the Contract
Then  User selects the 'Actual end date' for the Contract
Then  User selects the 'Contract Locked' - Contract cannot be locked without drivers created for the contract
Then  User selects the 'In Field Association' checkbox
Then  User selects the 'Free field 1' for Contract
Then  User selects the 'Free field 2' for contract
Then  User enters the 'Free text field 1' for Contract
Then  User enters the 'Free text field 2' for contract
And   The User clicks on save button and verifies the contract records is created successfully with 'Active' status.




@RCS_SaaS_Create_Driver_Contract
Scenario: RCS_SaaS_Create_Driver_Contract
Then  User scrolls down and clicks on the 'Add driver' button
And   User should be navigated to 'Add contract driver details' screen
Then  The User verifies the selected 'Contract name' display
Then  User selects the 'Fixed payment' from the Category dropdown
Then  User selects the 'Availability' from the Driver dropdown 
Then  User selects the 'Cash' from the Compensation type dropdown
Then  User verifies 'SKU' field is disabled - read only field
Then  User verifies 'Threshold value' is displayed as read only field
Then  User verifies 'Compensation SKU' is displayed as read only field
Then  User verifies 'Compensation qty' is displayed as read only field
Then  User enters the 'Amount' for the contract
Then  User verifies the 'Disc%' is displayed as read only field
Then  User enters the 'Disc value' for the contract
Then  User selects 'TCI Bucket' dropdown
Then  User selects the 'Start Date' for Contract driver
Then  User selects the 'End Date' for Contract driver
Then  User selects the 'Status' for Contract driver  
Then  User selects the 'Apply once' checkbox for Contract driver
Then  User selects the 'Free field 1' for Contract driver
Then  User selects the 'Free field 2' for contract driver
Then  User enters the 'Free text field 1' for Contract driver
Then  User enters the 'Free text field 2' for contract driver
And   The User clicks on save button and verifies the Driver record is created successfully with 'Active' status.




@RCS_SaaS_Lock_Contract
Scenario: RCS_SaaS_Lock_Contract
Then  User selects the contract which has to be locked by clicking on the checkbox next to the contract name
Then  User selects the Contract which has to be locked
Then  User clicks on the Lock/Unlock button
And   User verifies the Contract is locked successfully




@RCS_SaaS_Associate_Customer_Contract
Scenario: RCS_SaaS_Associate_Customer_Contract
Then  User selects the customer for whom the contract has to be associated
Then  User navigates to the search module 
Then  User enters the customer number 
Then  User clicks on the search button 
Then  User clicks on 'Export in CSV' button
Then  User verifies the following pre-requisite is executed successfully
Then  User selects the contract for which the customer has to be associated and then clicks on the associate customers button
Then  User verifies the popup window to import the file is opened successfully
Then  User selects the file and imports it
Then  User searches for the Customer selected in the Import File in search screen
Then  User navigates to the 'Data Entry' and selects the 'Contract' 
Then  User verifies the Customer is associated with the selected 'Contract' successfully.




@RCS_SaaS_Exporting_Corporate_Contract
Scenario: RCS_SaaS_Exporting_Corporate_Contract
Then  User selects the contracts which needs to be exported by selecting the Checkbox corresponding to the contract
Then  User Clicks on the export button
And   User verifies the zip file gets downloaded having 3 csv files - Contract details, Contract customers, Contract drivers




@RCS_SaaS_Exporting_Outlet_Details
Scenario: RCS_SaaS_Exporting_Outlet_Details
Then  User selects the outlets which needs to be exported by selecting the Check box corresponding to the outlet
Then  User Clicks on the export for outlet
And   User verifies the zip file gets downloaded having Contract customers details.




