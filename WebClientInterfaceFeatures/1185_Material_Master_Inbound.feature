@1185_Material_Master_Inbound
Feature: 1185_Material_Master_Inbound_WC features


@1185_ECC_Mandatory_Fields_Validation
Scenario: 1185_ECC_Mandatory_Fields_Validation
Given Login to the RestClient
Then  User verifies the RestClient screen is successfully displayed
Then  User provides the valid 'Material Master Inbound' link in the Request URL field
Then  User selects the request type as 'POST' in the RestClient screen
Then  User selects the 'Content- Type' as 'application/xml' under the 'HEADER' field 
Then  User provides the 'Material Master Inbound XML' under the 'BODY' field
And   User verifies the mandatory fields for 1185 Material Master Inbound details is entered successfully in the RestClient screen




@1185_ECC_Update_MaterialMaster
Scenario: 1185_ECC_Update_MaterialMaster 
Then  User updates 'Product Name' in the Material Master Inbound XML
Then  User updates 'Start Date' in the Material Master Inbound XML
Then  User updates 'End Date' in the Material Master Inbound XML
And   User verifies the above following Material Master Inbound details are updated successfully
Then  User clicks on the send button in the RestClient & verifies the Material Master is created successfully in the ECC tool.




@1185_ECC_Verify_Job
Scenario: 1185_ECC_Verify_Job
Then  User logins to the WC application as admin
Then  User clicks on the 'Utilities' tab and verifies the Utilities screen is displayed successfully
Then  User selects the 'Inbound' tab under the 'Utilities'
And   User verifies the '1185 Material Master' job status is updated successfully in the 'Inbound' screen
Then  User clicks on Configuration 
Then  The User should be navigated to configuration screen successfully
Then  User clicks on the 'Products' tab and navigates to the Products screen
And   User verifies the 'Products' Inbound record is created in the RCS8 application successfully.


