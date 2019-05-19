@Assessment
Feature: RCS SaaS Assessment_WC features



@RCS_SaaS_Add_Assessment_Template_WC
Scenario: RCS_SaaS_Add_Assessment_Template_WC
Given Login to the WebClient
When  User Provides the valid Admin credentials
Then  The User should be successfully logged into the Application
Then  User clicks on Configuration 
Then  The User should be navigated to configuration screen successfully
Then  User clicks on the 'Assessment' tab and navigates to the Assessment screen successfully
Then  User selects the template from the dropdown
Then  User clicks on the 'Add' button and navigates to the 'Add assessment template' screen
Then  User verifies the field - 'Template code' displays the template code and the version of the template
Then  User enters the field - 'Attribute' in the Add assessment template screen
Then  User enters the field - 'Attribute translation' in the Add assessment template screen
Then  User enters the field - 'Weight' in the Add assessment template screen
Then  User selects the Control type as either 'Date/Numeric/Dropdown/text' value from the dropdown
Then  User selects the 'Free LOV1' dropdown in the Add assessment template screen
Then  User selects the 'Free LOV2' dropdown in the Add assessment template Screen
Then  User enters the 'Free Text Field1' in the Add assessment template screen
Then  User enters the 'Free Text Field2' in the Add assessment template Screen
And   User clicks on save button and verifies the changes is saved successfully and the New assessment attribute is created.




@RCS_SaaS_Edit_Assessment_Template_WC
Scenario: RCS_SaaS_Edit_Assessment_Template_WC
Then  User selects a attribute which needs to be edited and clicks on the hypelink which is available in the attribute field of the template
Then  The User should be navigated to 'Edit assessment template' screen successfully
Then  User verifies the field - 'Template code' displays the template code and the version of the Template
Then  User enters the field - 'Attribute' in the Edit assessment template screen
Then  User enters the field - 'Attribute translation' in the Edit assessment template screen
Then  User enters the field - 'Weight' in the Edit assessment template screen
Then  User verifies the 'Control type' is displayed as read-only field
Then  User selects the 'Free LOV1' dropdown in the Edit assessment template screen
Then  User selects the 'Free LOV2' dropdown in the Edit assessment template Screen
Then  User enters the 'Free Text Field1' in the Edit assessment template screen
Then  User enters the 'Free Text Field2' in the Edit assessment template Screen
And   User clicks on the save button and the verifies the Changes is saved successfully and the Assessment attribute is modified.




@RCS_SaaS_Add_Responses_To_Attributes_WC
Scenario: RCS_SaaS_Add_Responses_To_Attributes_WC
Then  User selects the attribute and clicks on the 'Add' button in the responses section
Then  The User navigates to the 'Add responses' screen successfully
Then  User verifies the field - 'Template code' displays the Template Code and the version of the template
Then  User verifies that the 'Assessment template' displays the selected attribute name
Then  User enters the field - 'Response' in the Add responses screen
Then  User enters the field - 'Response translation' in the Add responses screen
Then  User enters the field - 'Score' in the Add responses screen
Then  User enters the field - 'Indicator' in the Add responses screen
Then  User selects the 'Free LOV1' dropdown in the Add responses screen
Then  User selects the 'Free LOV2' dropdown in the Add responses Screen
Then  User enters the 'Free Text Field1' in the Add responses screen
Then  User enters the 'Free Text Field2' in the Add responses Screen
And   User clicks on the save button and verifies the Responses is saved successfully.




@Rcs_Saas_Copy_Common_Responses_To_The_Attributes
Scenario: Rcs_Saas_Copy_Common_Responses_To_The_Attributes
Then  User selects the attribute and clicks on the 'Copy common responses' button in the response section
Then  User verifies the response created with the message 'Total records, Added, Duplicate' count records is displayed
And   User verifies all the Responses created in Pre-requiste are copied to the selected attribute.




@Rcs_Saas_Freeze_Unfreeze_Assessment_Template
Scenario: Rcs_Saas_Freeze_Unfreeze_Assessment_Template
Then  User selects the template which has to be freezed or unfreezed
And   User verifies that the template is selected successfully
Then  User clicks on the button 'Freeze/Unfreeze' present next to the template dropdown
And   User verifies that the template is freezed or unfreezed successfully.




















