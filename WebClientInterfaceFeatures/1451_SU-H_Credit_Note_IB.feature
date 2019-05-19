@1451_SUH_Credit_Note_IB
Feature: 1451_SUH_Credit_Note_IB_WC features



@1451_RCS_Credit_Customer
Scenario: 1451_RCS_Credit_Customer
Given Login to the WebClient app
When  User Provides the valid admin credentials
Then  User clicks on the 'Search' tab and verifies the search screen is displayed successfully
Then  User enters the 'Credit Customer Number' and clicks on the search button & verifies the customer profile screen is displayed
Then  User scrolls down to the 'Customer Trading Terms' section & makes a note of Available Credit.




@1451_ECC_Mandatory_Fields_Validation
Scenario: 1451_ECC_Mandatory_Fields_Validation
Then  User logins to the RestClient
Then  User verifies the RestClient screen is successfully displayed
Then  User provides the valid 'Customer Clearance' link in the Request URL field
Then  User selects the request type as 'POST' in the RestClient screen
Then  User selects the 'Content- Type' as 'application/xml' under the 'HEADER' field 
Then  User provides the 'Customer Clearance XML' under the 'BODY' field
And   User verifies the mandatory fields for 1451 SUH Credit Note details is entered successfully in the RestClient screen
Then  User clicks on the send button in the RestClient & verifies the SUH Credit Note details is created successfully in the ECC tool.




@1451_Customer_Clearance_Service_Job
Scenario: 1451_Customer_Clearance_Service_Job
Then  User logins to the WC application as admin
Then  User clicks on the 'Utilities' tab and verifies the Utilities screen is displayed successfully
Then  User selects the 'Inbound' tab under the 'Utilities'
And   User verifies the '1451 SUH Credit Note' job status is updated successfully in the 'Inbound' screen
Then  User clicks on the 'Search' tab and verifies the search screen is displayed successfully
Then  User enters the 'Credit Customer Number' and clicks on the search button & verifies the customer profile screen is displayed
Then  User scrolls down to the 'Customer Trading Terms' section
And   User verifies the 'Available Credit' field is updated & displayed with the combination of 'Available Credit = Available Credit + Credit Note amount/CRM'. 




