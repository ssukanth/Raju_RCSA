@IdealStock&VRO
Feature: RCS SaaS IdealStock_VRO_WC features



@RCS_SaaS_IdealStockUI_WC
Scenario: RCS_SaaS_IdealStockUI_WC
Given Login to the WebClient
When  User Provides the valid Admin credentials
Then  The User should be successfully logged into the Application
Then  User clicks on Configuration 
Then  The User should be navigated to configuration screen successfully
Then  User clicks on Ideal Stock and navigates to the Ideal Stock Screen
Then  User selects the Trade Approach from the dropdown & verifies the Trade Approach is selected successfully 
Then  User selects the Territory from the list for which the Ideal Stock to be created & verifies the Territory is selected without any error
Then  User selects the Route from the list for which Ideal Stock to be created & verifies the Route is selected successfully




@RCS_SaaS_IdealStock_ExportTemplate_WC
Scenario: RCS_SaaS_IdealStock_ExportTemplate_WC
Then  User clicks on the 'EXPORT TEMPLATE' button & verifies the Ideal Stock exported template as all the SKUs which are part of Depot Assortment Plan
Then  User verifies the exported template as the following columns displayed - Route Name, Product, Territory Name 
#Then  User enters the required data in the EXPORT TEMPLATE file & verifies the Export file is saved with modified data.




@RCS_SaaS_IdealStock_Import_WC
Scenario: RCS_SaaS_IdealStock_Import_WC
Then  User clicks on the Import button & verifies the file explorer is opened
Then  User selects the Saved import file and clicks on 'Open' button & verifies the selected file is imported successfully
Then  User clicks on the 'Show' button & verifies the imported data is displayed on the screen and the quantity field is editable
Then  User selects the checkbox for the records to be modified and clicks on 'Save' button & verifies the selected Records is modified & saved without any errors, quantity field is displayed as Read-Only.
Then  User clicks on the 'Export in CSV/EXCEL' button & verifies all the SKUs is exported in CSV/excel format.




@RCS_SaaS_IdealStock_Delete_WC
Scenario: RCS_SaaS_IdealStock_Delete_WC
Then  User clicks on the DELETE button Without selecting any record & verifies the system displaying prompt alert message as 'Select atleast one checkbox to delete'
Then  User clicks on the SAVE button Without selecting any record & verifies the system displaying prompt alert message as 'Select atleast one checkbox to update quantity'.
Then  User selects the checkbox for the records to be deleted and clicks on 'DELETE' button & verifies the record is deleted successfully









 



 