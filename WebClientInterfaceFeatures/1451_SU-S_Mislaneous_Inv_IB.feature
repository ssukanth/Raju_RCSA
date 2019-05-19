@1451_SUS_Mislaneous_Inv_IB
Feature: 1451_SUS_Mislaneous_Inv_IB features


@1451_Create_Data_RCS
Scenario: 1451_Create_Data_RCS
Given Login to the RCS8 SaaS MC as Rep
Then  User verifies the MC login screen is displayed successfully
Then  User selects the Credit customer RCS which has ERP number and makes a note of the Available Credit
Then  User Creates the following sales data - SalesOrder -> Invoice1, Invoice2
And   User verifies the Sales data is created in RCS8 and the Available Credit is verified successfully.




@1451_ECC_Mandatory_Fields_Validation
Scenario: 1451_ECC_Mandatory_Fields_Validation
Then  User logins to the RestClient
Then  User verifies the RestClient screen is displayed successfully
Then  User provides the valid 'Customer Clearance Inbound' link in the Request URL field
Then  User selects the request type as 'POST' in the RestClient screen
Then  User selects the 'Content- Type' as 'application/xml' under the 'HEADER' field 
Then  User provides the '1451 Customer Clearance SU-S XML' under the 'BODY' field
Then  User updates the following invoice details for Sales orders in XML - Invoice, Invoice Amount, Invoice Date, Dispute and Promise to Pay  
And   User verifies all the mandatory fields for 1451 Customer Clearance SU-S Inbound details as been updated successfully in the RestClient screen
Then  User clicks on the send button in the RestClient & verifies the Customer Clearance SU-S Inbound is created successfully in the ECC tool.




@1451_CustomerClearanceService_Job
Scenario: 1451_CustomerClearanceService_Job
Then  User logins to the WC application as admin
Then  User clicks on the 'Utilities' tab and verifies the Utilities screen is displayed successfully
Then  User selects the 'Inbound' tab under the 'Utilities'
And   User verifies the '1451_CustomerClearanceService' job status is updated successfully in the 'Inbound' screen.




@1451_CustomerClearanceService_Job
Scenario: 1451_CustomerClearanceService_Job
Then  User logins to the MC
And   User verifies the Invoice data in RCS8 is updated successfully.



