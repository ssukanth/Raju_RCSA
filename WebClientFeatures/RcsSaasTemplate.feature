@Template
Feature: RCS SaaS Template_WC features



@RCS_View_Template_WC
Scenario: RCS_View_Template_WC
Given Login to the WebClient
When  User Provides the valid Admin credentials
Then  The User should be successfully logged into the Application
Then  User clicks on Configuration 
Then  The User should be navigated to configuration screen successfully
Then  User clicks on Template and navigates to the template screen successfully
Then  User selects the 'Choose Template Type' section & verifies the following dropdowns are available - BAT Authority Assessment, BAT Volume Assessment, Custom Assessment, RCM Shopper Channel, RCM Communication opportunity
Then  User verifies all the existing Templates displayed successfully and the user selects any Template Type from the dropdown.




@RCS_Create_New_Assessment_Template_WC
Scenario: RCS_Create_New_Assessment_Template_WC
Then  User clicks on the 'Add' button to create a New Assessment Template & navigates to the Add template screen successfully
Then  User enters the field - 'Template code' - which is mandatory
Then  User enters the field - 'Description' which is a mandatory field, any value can be entered in Description
Then  User selects the 'template type' for which the Template has to be created
Then  User selects the 'Calculate Score' Checkbox - the Assessment score will be calculated after it is performed
Then  User selects the 'Enable Baseline' Checkbox for Setting up the template as baseline template
Then  User selects the status as 'Active/Inactive' to create the new Assessment Template 
Then  User selects the 'Free LOV 1' dropdown in the Add template screen 
Then  User selects the 'Free LOV 2' dropdown in the add template screen 
Then  User enters the first field - 'FreeText 1' in the Add template screen 
Then  User enters the second field - 'FreeText 2' in the add template screen
And   User clicks on save button and verifies the Template is saved successfully.




@RCS_Edit_Existing_Template_WC
Scenario: RCS_Edit_Existing_Template_WC
Then  User selects the template which needs to be edited and clicks on the hypelink available in the description field of the template
Then  User should be navigated to the Edit template screen
Then  User makes required changes in the template and clicks on save button
And   User verifies the changes as been saved & the user is navigated to the Template screen successfully.




@RCS_Copy_Existing_Template_WC
Scenario: RCS_Copy_Existing_Template_WC
Then  User selects a template which needs to be copied and clicks on the 'Copy' icon
Then  User should be navigated to the 'New version template' screen
Then  User makes required changes in the template and Clicks on save button
And   User verifies the changes as been saved & the New copy of template is created with different version successfully.




@RCS_Delete_Template_WC
Scenario: RCS_Delete_Template_WC
Then  User selects a template which needs to be deleted and Clicks on the 'delete' icon
And   User verifies the selected template is deleted successfully.




@RCS_Add_Common_Responses_Template_WC
Scenario: RCS_Add_Common_Responses_Template_WC
Then  User clicks on 'Add' button in the Common responses section
Then  User should be navigated to 'Add common responses' screen
Then  User verifies the 'Template code' field displays the template code and version of the template
Then  User enters the field - 'Response' in the 'Add common responses' screen
Then  User enters the field - 'Response translation' in the 'Add common responses' screen
Then  User enters the field - 'Score' in the 'Add common responses' screen
Then  User enters the field - 'Indicator' in the 'Add common responses' screen
Then  User selects the 'Free LOV1' dropdown in the 'Add common responses' screen
Then  User selects the 'Free LOV2' dropdown in the 'Add common responses' Screen
Then  User enters the 'Free text field1' in the 'Add common responses' screen
Then  User enters the 'Free text field2' in the 'Add common responses' Screen
And   User clicks on save button and verifies the Common responses record is added successfully.




@RCS_Delete_Common_Responses_Template_WC
Scenario: RCS_Delete_Common_Responses_Template_WC
Then  User clicks on 'delete' button in the Common responses section
And   User verifies the Common responses record is deleted successfully.




@RCS_Verify_Assessment_Attributes_WC
Scenario: RCS_Verify_Assessment_Attributes_WC
Then  User selects the template and clicks on 'Assessment attributes'
And   User navigates to the Assessment screen under Configuration for the selected template & verifies the behaviour.




@RCS_Import_Customer_Assessment_WC
Scenario: RCS_Import_Customer_Assessment_WC
Then  User selects the template and clicks on the 'Import customer assessment'
And   User verifies the Import is successful.



