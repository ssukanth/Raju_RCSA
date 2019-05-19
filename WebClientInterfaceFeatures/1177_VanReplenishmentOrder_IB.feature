@1177VanReplenishmentOrder
Feature: 1177_VanReplenishment_Order_IB_WC features


@1177_ECC_Mandatory_Fields_Validation
Scenario: 1177_ECC_Mandatory_Fields_Validation
Given Login to the RestClient
Then  User verifies the RestClient screen is successfully displayed
Then  User provides the valid 'Van Replenishment Order Inbound' link in the Request URL field
Then  User selects the request type as 'POST' in the RestClient screen
Then  User selects the 'Content- Type' as 'application/xml' under the 'HEADER' field 
Then  User provides the 'Van Replenishment Order Inbound XML' under the 'BODY' field
And   User verifies the mandatory fields for 1177 Van Replenishment Order Inbound details is entered successfully in the RestClient screen
Then  User clicks on the send button in the RestClient & verifies the Van Replenishment Order is created successfully in the ECC tool.




@1177_ECC_Verify_Job_Admin
Scenario: 1177_ECC_Verify_Job_Admin
Then  User logins to the WC application as admin
Then  User clicks on the 'Utilities' tab and verifies the Utilities screen is displayed successfully
Then  User selects the 'Inbound' tab under the 'Utilities'
And   User verifies the '1177 Van Replenishment Order' job status is updated successfully in the 'Inbound' screen.




@1177_ECC_Verify_Job_Rep
Scenario: 1177_ECC_Verify_Job_Rep
Then  User logins to the WC application as Rep
Then  User clicks on the 'Sales Module' and navigates to the 'Start of Day' tab
Then  User clicks on the 'My Inventory' tab & verifies the navigation is successful
And   User verifies the Stockload is created with 'Open' status in the stockload screen.  