@1184CreditMasterInbound
Feature: 1184_Credit_Master_Inbound_WC features


@1184_ECC_Mandatory_Fields_Validation
Scenario: 1184_ECC_Mandatory_Fields_Validation
Given Login to the RestClient
Then  User verifies the RestClient screen is successfully displayed
Then  User provides the valid 'Credit Master Inbound' link in the Request URL field
Then  User selects the request type as 'POST' in the RestClient screen
Then  User selects the 'Content- Type' as 'application/xml' under the 'HEADER' field 
Then  User provides the 'Credit Master Inbound XML' under the 'BODY' field
And   User verifies the mandatory fields for 1184 Credit Master Inbound details is entered successfully in the RestClient screen




@1184_ECC_Update_CreditMaster
Scenario: 1184_ECC_Update_CreditMaster 
Then  User updates 'Payment Method' as 'Credit' in the Credit Master Inbound XML
Then  User updates 'Credit Limit' as '50000' in the Credit Master Inbound XML
Then  User updates 'Bad Debt' as 'No' in the Credit Master Inbound XML
Then  User updates 'Payment Central' as 'No' in the Credit Master Inbound XML
Then  User updates 'Tobacco License Start Date' in the Credit Master Inbound XML
Then  User updates 'Tobacco License Exp Date' in the Credit Master Inbound XML
Then  User updates 'Contract Start Date' in the Credit Master Inbound XML
Then  User updates 'Contract Exp Date' in the Credit Master Inbound XML
And   User verifies the above following Customer Trading terms details are updated successfully
Then  User clicks on the send button in the RestClient & verifies the Credit Master is created successfully in the ECC tool.




@1184_ECC_Verify_Job
Scenario: 1184_ECC_Verify_Job
Then  User logins to the WC application as admin
Then  User clicks on the 'Utilities' tab and verifies the Utilities screen is displayed successfully
Then  User selects the 'Inbound' tab under the 'Utilities'
And   User verifies the '1184 Credit Master' job status is updated successfully in the 'Inbound' screen
Then  User clicks on the 'Search' tab and verifies the search screen is displayed successfully
Then  User enters the 'Customer Number' and clicks on the search button & verifies the customer profile screen is displayed
Then  User scrolls down to the 'Customer Trading Terms' section & verifies the 'Customer Trading Terms details' is updated successfully in RCS8 app. 




@1184_ECC_Update_Payment_Method_1
Scenario: 1184_ECC_Update_Payment_Method_1
Then  User navigates to the RestClient app
Then  User updates the 'Credit Limit' as '5000' in the Credit Master Inbound xml
Then  User updates the 'Payment Method' from 'Credit' to 'Cash' in the Credit Master Inbound xml
Then  User clicks on the send button in the RestClient & verifies the 'Payment Method' is not changed from 'Credit' to 'Cash' if the 'Credit Limit is > 0' in the RCS8 app.




@1184_ECC_Update_Payment_Method_2
Scenario: 1184_ECC_Update_Payment_Method_2
Then  User navigates to the RestClient app
Then  User updates the 'Credit Limit' as '0' in the Credit master Inbound xml
Then  User updates the 'Payment Method' from 'Credit' to 'Cash' in the Credit Master Inbound xml
Then  User clicks on the send button in the RestClient & verifies the 'Payment Method' is changed from 'Credit' to 'Cash' if the 'Credit Limit = 0' in the RCS8 app.






