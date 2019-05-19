#First Run @Contract Scenario


@TradePayments
Feature: RCS SaaS Configuration_TradePayments_WC features



@RCS_SaaS_Configuration_TradePayments_WC
Scenario: RCS_SaaS_Configuration_TradePayments_WC
Given Login to the WebClient
When  User Provides the valid Admin credentials
Then  The User should be successfully logged into the Application
Then  User clicks on Configuration 
Then  The User should be navigated to configuration screen successfully
Then  User clicks on Trade Payments and navigates to Trade Payments Screen
Then  User selects 'Depot' dropdown - defaulted to All
Then  User selects 'Territory' - Defaulted to All
Then  User selects 'Valid from' - defaulted to 1st of current month
Then  User selects 'Valid to' - Defaulted to last date of current month
Then  User selects 'Status' - Defaulted to All
Then  User selects 'Contract' - Defaulted to All
Then  User selects 'Type' - Defaulted to All
Then  User directly clicks on Show button or selects the different values in filter and then clicks on 'Show' button.
And   Selection of Filter conditions should be successful
And   All the trade payment records pertaining to the selection criteria is displayed successfully




@RCS_SaaS_Configuration_Creation_New_Trade_Payment_WC
Scenario: RCS_SaaS_Configuration_Creation_New_Trade_Payment_WC
Then  User clicks on 'Add' button to create a new Trade Payment
Then  User enters/selects the 'Customer number/Customer name/Territory' and clicks on search button
And   The screen should be displayed consisting following fields - 'Customer name, Customer number and territory'
Then  User selects a customer and clicks on 'Add' button
Then  On selecting a customer, user should be navigated to trade Payment screen with the selected customer name & number prepopulated
Then  User selects the 'Contract name' - Mandatory field
Then  User enters the 'Amount' - Mandatory field
Then  User selects 'Valid From date'- Mandatory field
Then  User selects 'Valid Upto date' - Mandatory field
Then  User selects the 'Status' - Mandatory field
Then  User verifies 'Rep Apply' checkbox defaults to 'N'
Then  User selects the 'Type' - Mandatory field
Then  User selects the 'Reason code'- Mandatory field
Then  User enters the 'Invoice Reference' - Invoice Reference should be displayed the Invoice number on which the trade applied, Populated once the rebate is applied
Then  User selects the 'TCIB'- Mandatory field
Then  User enters the 'Remarks' - remarks given here will be displayed on clicking the 'i' icon on Order header level while creating order
Then  User selects the 'Free field1- LOV Field'
Then  User enters the 'Free Text1'
And   User clicks on save button and details entered should be saved and new trade payment is created successfully.




@RCS_SaaS_Configuration_Trade_Payment_Export_WC
Scenario: RCS_SaaS_Configuration_Trade_Payment_Export_WC
Then  User selects the Trade Payment or selects all the Trade Payments 
Then  User clicks on Export button
And   User verifies that the selected Trade Payment exported without any errors.




@RCS_SaaS_Configuration_Trade_Payment_Import_WC
Scenario: RCS_SaaS_Configuration_Trade_Payment_Import_WC
Then  User updates the Trade Payments Export file which as been downloaded
Then  User clicks on Import Trade Payments button
And   The Pop up window should get opened for the selection of Import Template
Then  User selects the Import template to be uploaded and the selected Template should be imported successfully.

