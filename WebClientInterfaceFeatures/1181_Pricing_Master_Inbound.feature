@1181PricingMasterInbound
Feature: 1181_PricingMaster_Inbound_WC features


@1181_ECC_Mandatory_Fields_Validation
Scenario: 1181_ECC_Mandatory_Fields_Validation
Given Login to the RestClient
Then  User verifies the RestClient screen is successfully displayed
Then  User provides the valid 'Pricing Master Inbound' link in the Request URL field
Then  User selects the request type as 'POST' in the RestClient screen
Then  User selects the 'Content- Type' as 'application/xml' under the 'HEADER' field 
Then  User provides the 'Pricing Master Inbound XML' under the 'BODY' field
And   User verifies the mandatory fields for 1181 Pricing Master Inbound details is entered successfully in the RestClient screen.




@1181_ECC_Update_PricingMaster
Scenario: 1181_ECC_Update_PricingMaster 
Then  User updates 'PriceList Name' in the Pricing Master Inbound XML
Then  User updates 'List Price' in the Pricing Master Inbound XML
Then  User updates 'Start or End Date' in the Pricing Master Inbound XML
And   User verifies the above following Pricing details are updated successfully
Then  User clicks on the send button in the RestClient & verifies the PriceList is created successfully in the ECC tool.




@1181_ECC_Verify_Job
Scenario: 1181_ECC_Verify_Job
Then  User logins to the WC application as admin
Then  User clicks on the 'Utilities' tab and verifies the Utilities screen is displayed successfully
Then  User selects the 'Inbound' tab under the 'Utilities'
And   User verifies the '1181 Pricing Master' job status is updated successfully in the 'Inbound' screen
Then  User clicks on Configuration
Then  The User should be navigated to configuration screen successfully
Then  User clicks on the 'PriceList' tab and navigates to the pricelist screen
And   User verifies the 'PriceList' Inbound record is created in the RCS8 application successfully.



