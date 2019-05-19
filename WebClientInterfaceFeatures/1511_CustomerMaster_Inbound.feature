@1511CustomerMasterInbound
Feature: 1511_CustomerMaster_Inbound_WC features


@1511_ECC_Mandatory_Fields_Validation
Scenario: 1511_ECC_Mandatory_Fields_Validation
Given Login to the RestClient
Then  User verifies the RestClient screen is successfully displayed
Then  User provides the valid 'Customer Master Inbound' link in the Request URL field
Then  User selects the request type as 'POST' in the RestClient screen
Then  User selects the 'Content- Type' as 'application/xml' under the 'HEADER' field 
Then  User provides the 'Customer Master Inbound XML' under the 'BODY' field
And   User verifies the mandatory fields for 1511 Customer Master Inbound details is entered successfully in the RestClient screen.




@1511_ECC_Update_Customer
Scenario: 1511_ECC_Update_Customer
Then  User updates the following 'Customer Address details' in the ECC - Country, County, Suburb, Street Name 
Then  User updates 'Contract Num' under the 'Trading Terms' section
Then  User updates 'Contract Start Date' under the 'Trading Terms' section
Then  User updates 'Contract End Date' under the 'Trading Terms' section
Then  User updates 'Tobacco License Num' under the 'Trading Terms' section
Then  User updates 'Tobacco License Start Date' under the 'Trading Terms' section
Then  User updates 'Tobacco License End Date' under the 'Trading Terms' section
And   User verifies the above following Customer details is updated successfully in the ECC
Then  User clicks on the send button in the RestClient & verifies the Customer Master Inbound details is created successfully in the ECC tool.



@1511_ECC_Verify_Job
Scenario: 1511_ECC_Verify_Job
Then  User logins to the WC application as admin
Then  User clicks on the 'Utilities' tab and verifies the Utilities screen is displayed successfully
Then  User selects the 'Inbound' tab under the 'Utilities'
And   User verifies the '1511 CustomerMaster' job status is updated successfully in the 'Inbound' screen.




@1511_ECC_Verify_Customer_Updated_Data_RCS
Scenario: 1511_ECC_Verify_Customer_Updated_Data_RCS
Then  User clicks on the 'Data Entry' tab and verifies the Data Entry screen is displayed successfully
Then  User scrolls down to the 'General Information' section & verifies the 'ERP No.' is displayed in RCS8
Then  User scrolls down to the 'Customer Address' section & verifies the following 'Customer Address details' displayed in RCS8 - Country, County, Suburb, Street Name 
Then  User scrolls down to the 'Trading Terms' section & verifies the following 'Trading Terms details' displayed in RCS8 - Contract Num, Contract Start & End Date, Tobacco License Num, Tobacco License Start & End Date.





