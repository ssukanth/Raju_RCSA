@UtilitiesExports
Feature: RCS SaaS Utilities_Exports_WC features



@RCS_SaaS_Utilities_Exports_WC
Scenario: RCS_SaaS_Utilities_Exports_WC
Given Login to the WebClient
When  User Provides the valid Admin credentials
Then  The User should be successfully logged into the Application
Then  User clicks on Utilities 
Then  The User should be navigated to Utilities screen successfully
Then  User clicks on 'Exports' tab and navigates to the 'Data Export Utility' page
Then  User verifies the 'Select Export Type' dropdown is available in the 'Data Export Utility' section
Then  User verifies the 'Export Criteria' section is available in the export screen




@RCS_SaaS_Export_Criteria_WC
Scenario: RCS_SaaS_Export_Criteria_WC
Then  User verifies the 'Export Outlet Data' is available in the 'Select Export Type' dropdown
Then  User verifies the 'Export Sales Order' is available in the 'Select Export Type' dropdown
Then  User verifies the 'Export Pre Sales Order data' is available in the 'Select Export Type' dropdown
Then  User verifies the 'Export Invoices' is available in the 'Select Export Type' dropdown
Then  User verifies the 'Exports Payments' is available in the 'Select Export Type' dropdown
Then  User verifies the 'Export Retail Audit' is available in the 'Select Export Type' dropdown
Then  User verifies the 'Export Contracts' is available in the 'Select Export Type' dropdown
Then  User verifies the '1191-Export Key Contact' is available in the 'Select Export Type' dropdown
Then  User verifies the '1178 - Sales Order' is available in the 'Select Export Type' dropdown
Then  User verifies the '1183-Customer Master' is available in the 'Select Export Type' dropdown
Then  User verifies the '1184R-Customer Trading Terms' is available in the 'Select Export Type' dropdown
Then  User verifies the '1178 Sales Export to ECC' is available in the 'Select Export Type' dropdown




@RCS_SaaS_Verify_Export_Validation_WC
Scenario: RCS_SaaS_Verify_Export_Validation_WC
Then  User verifies the Time Duration of start & End date for 'Export Outlet data' is 1 week
Then  User verifies the Time Duration of start & End date for 'Export Sales Order' is 1 week
Then  User verifies the Time Duration of start & End date for 'Export Pre Sales Order' is 1 week
Then  User verifies the Time Duration of start & End date for 'Export Invoices' is 1 week
Then  User verifies the Time Duration of start & End date for 'Exports Payments' is 1 week
Then  User verifies the Time Duration of start & End date for 'Export Retail Audit' is 1 week
Then  User verifies the Time Duration of start & End date for 'Export Contracts' is 1 week

  


@RCS_SaaS_Export_Outlet_Data_WC
Scenario: RCS_SaaS_Export_Outlet_Data_WC
Then  User selects the 'Export Outlet Data' from the 'Select Export Type' dropdown
Then  User selects the 'Customer Type' in the export criteria section
Then  User selects the 'Territory' in the export criteria section
Then  User selects the 'Shoppers Channel' in the export criteria section
Then  User selects the 'Tag Value' in the export criteria section
Then  User selects the 'Customer Type' in the export criteria section
Then  User enters the 'Customer Number' in the export criteria section
Then  User enters the 'Customer Name' in the export criteria section
Then  User selects the 'Start & End Date' in the export criteria section
Then  User verifies the Export criteria for Outlet data is entered successfully
Then  User clicks on the 'Export in CSV or Export in Excel' button
And   User verifies the Outlet Data is exported successfully and verifies the data.           




@RCS_SaaS_Export_Sales_Order_WC
Scenario: RCS_SaaS_Export_Sales_Order_WC
Then  User selects the 'Export Sales Order' from the 'Select Export Type' dropdown
Then  User selects the 'Start & End Date' in the Export Sales Order section
Then  User selects the Export format as 'CSV or TEXT' in the Export Sales Order section
Then  User verifies the export criteria for Sales Order data is entered successfully.
Then  User clicks on the 'Export' button and verifies the Sales Order data is exported and validated successfully.




@RCS_SaaS_Export_Pre_Sales_Order_WC
Scenario: RCS_SaaS_Export_Pre_Sales_Order_WC
Then  User selects the 'Export Pre Sales Order data' from the 'Select Export Type' dropdown
Then  User selects the 'Date Selection' dropdown in the Export Pre Sales Order data section
Then  User selects the 'Start & End Date' in the Export Pre Sales Order data section
Then  User selects the Export format as 'CSV or TEXT' in the Export Pre Sales Order data section
Then  User verifies the export criteria for Pre Sales Order data is entered successfully.
Then  User clicks on the 'Export' button and verifies the Pre Sales Order data is exported and validated successfully.




@RCS_SaaS_Export_Invoices_WC
Scenario: RCS_SaaS_Export_Invoices_WC
Then  User selects the 'Export Invoices' from the 'Select Export Type' dropdown
Then  User selects the 'Start & End Date' in the Export Invoice data section
Then  User selects the Export format as 'CSV or TEXT' in the Export Invoice data section
Then  User verifies the export criteria for Invoices is entered successfully.
Then  User clicks on the 'Export' button and verifies the Invoice data is exported and validated successfully.




@RCS_SaaS_Export_Payments_WC
Scenario: RCS_SaaS_Export_Payments_WC
Then  User selects the 'Exports Payments' from the 'Select Export Type' dropdown
Then  User selects the 'Start & End Date' in the Export Payments data section
Then  User verifies the Export criteria for Payments is entered successfully
Then  User clicks on either 'Export in CSV or Export in Excel' button
Then  User verifies the Payments data is exported and validated successfully.




@RCS_SaaS_Export_Retail_Audit_WC
Scenario: RCS_SaaS_Export_Retail_Audit_WC
Then  User selects the 'Export Retail Audit' from the 'Select Export Type' dropdown
Then  User selects the 'Start & End Date' in the Export Retail Audit data section
Then  User selects the Export format as 'CSV or TEXT' in the Export Retail Audit data section
Then  User verifies the Export criteria for Retail Audit is entered successfully
Then  User clicks on the 'Export' button and verifies the Retail Audit data is exported and validated successfully.




@RCS_SaaS_Export_Contracts_WC
Scenario: RCS_SaaS_Export_Contracts_WC
Then  User selects the 'Export Contracts' from the 'Select Export Type' dropdown
Then  User selects the 'Export Type' in the Export Contracts data section 
Then  User selects the 'Start & End Date' in the Export Contracts data section
Then  User verifies the Export criteria for Contracts is entered successfully
Then  User clicks on either 'Contracts Data in CSV or Contracts Data in XLS' button
Then  User verifies the Contract data is exported and validated successfully.






