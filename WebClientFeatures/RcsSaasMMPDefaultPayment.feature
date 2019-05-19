#MMP Export sheet should be updated Manually & Run the Automation script

@MMPDefaultPayment
Feature: RCS SaaS MMP_Default_Payment_WC features



@Preferred_Payment_Method
Scenario: Preferred_Payment_Method
Given Login to the WebClient
When  User Provides the valid Admin credentials
Then  The User should be successfully logged into the Application
Then  User clicks on Configuration 
Then  The User should be navigated to configuration screen successfully
Then  User navigates to the 'LOV' tab & selects the LOV type as 'User'
And   User verifies when the Set Code for the LOV is entered as 'PPM' then the Set Name is displayed as 'Preferred Payment Method'.
Then  User clicks on the set code 'PPM'
And   User verifies the following values are defined under the new LOV - Cash, Cheque, MMP, EFT




@Verify_Preferred_Payment_Method
Scenario: Verify_Preferred_Payment_Method
Then  User clicks on the Data Entry & selects any available customer where Customer type = Outlet & navigates to the profile tab
Then  User navigates to the 'Trading Terms' section
And   User verifies the dropdown field named 'Preferred Payment Mode' is displayed
Then  User selects the Collection Type as 'Cash' & verifies the Preferred Payment Mode dropdown field auto-populates the following values as 'Cash' & 'MMP'
Then  User selects the Collection Type as 'Cheque' only & verifies the Preferred Payment Mode dropdown field auto-populates the following value as 'Cheque'
Then  User selects the Collection Type as 'Cash & Cheque' & verifies the Preferred Payment Mode dropdown field auto-populates the following values as 'Cash', 'Cheque' & 'MMP'
Then  User selects the Collection Type as 'Deferred Cheque' & verifies the Preferred Payment Mode dropdown field auto-populates the following values as 'Cash', 'Cheque', 'MMP' & 'EFT'.




@Preferred_Payment_Method_Export
Scenario: Preferred_Payment_Method_Export
Then  User clicks on the 'Data Entry' tab
Then  User clicks on the 'Export Trading Term Data' button
Then  User verifies the 'Export Trading Term Data' is downloaded successfully
And   User verifies the 'Preferred Payment Method' column is added to the right of the 'Payment Method' Column in the Export file.




#@Preferred_Payment_Method_Import
#Scenario: Preferred_Payment_Method_Import
#Then  User clicks on the 'Import' tab & navigates to the Data Import utility screen
#Then  User selects the Import type as 'Customer Trading Terms Data'
#Then  User clicks on the 'Customer Trading Terms Data' button & uploads the template
#And   User verifies the 'Customer Trading Terms Data' template is uploaded successfully.


 


