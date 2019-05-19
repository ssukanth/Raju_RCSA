@SalesModule
Feature: RCS SaaS SalesModule_WC features



@RCS_SaaS_SalesModule_Navigation_WC
Scenario: RCS_SaaS_SalesModule_Navigation_WC
Given Login to the WebClient
When  User Provides the valid Admin credentials
Then  The User should be successfully logged into the Application
Then  User clicks on 'Sales Module' Tab 
Then  The User should be navigated to Sales Module screen successfully
And   User verifies by default Start of Day screen should appear under Sales Module successfully




@RCS_SaaS_Verify_SalesModule_WC
Scenario: RCS_SaaS_Verify_SalesModule_WC
Then  User verifies the 'Start of Day' tab is available under Sales Module
Then  User verifies the 'Message' tab is available under Start of Day tab
Then  User verifies the 'Opening Mileage' tab is available under Start of Day tab
Then  User verifies the 'My Inventory' tab is available under Start of Day tab
Then  User verifies the 'Journey Plan' tab is available under Start of Day tab
Then  User verifies the 'Sales Target' tab is available under Start of Day tab
Then  User verifies the 'End of Day' tab is available under Sales Module
Then  User verifies the 'Cash Reconciliation' tab is available under End of Day tab
Then  User verifies the 'Stock Reconciliation' tab is available under End of Day tab
Then  User verifies the 'Sales Target' tab is available under End of Day tab
Then  User verifies the 'Sales History' tab is available under End of Day tab
Then  User verifies the 'Closing Mileage' tab is available under End of Day tab
Then  User verifies the 'Reports' tab is available under Sales Module
Then  User verifies the 'Daily Sales Report' tab is available under Reports tab
Then  User verifies the 'Credit Report' tab is available under Reports tab




@RCS_SaaS_Verify_StartOfDay_WC
Scenario: RCS_SaaS_Verify_StartOfDay_WC
Then  User verifies the 'Message' and 'Group' sections present under the Message tab
Then  User verifies the Date, Time, Mileage, Comments sections present under the Opening Mileage tab
Then  User verifies the 'Stock Load for Rep Inventory' and 'Stock Load for SKU/Product Details' displayed under the My Inventory tab
Then  User verifies the Stock Load Number, Reference, Date, Status, and Create Stock Load button present under the Stock Load for Rep Inventory section
Then  User verifies the Product Name, Qty, Commit All button and Print button present under the Stock Load for SKU/Product section
Then  User verifies the system current 'Journey Date' is displayed under the Journey Plan tab
Then  User verifies the Account Name and Account Number sections present under the Journey Plan tab
Then  User verifies the Product, Sales Target, Time Period and Remarks sections present under the Sales Target tab



	
@RCS_SaaS_Verify_EndOfDay_WC
Scenario: RCS_SaaS_Verify_EndOfDay_WC
Then  User verifies the system current 'Payment Date' is displayed under the Cash Reconciliation tab 
Then  User verifies the Customer Number, Customer Name, Payment Number and Payment Amount sections present under the Cash Reconciliation tab
Then  User verifies the Total Amt Cash, Total Amt Cheque, No of Cheques, Total GTN Value, No.of GTNs records present under the Cash Reconciliation tab
Then  User verifies the Total Amt Credit Memo, Total EFT amount, No.of EFTs, Total MMP Amount, No.of MMPs & Grand Total records present under the Cash Reconciliation tab
Then  User verifes by default the status is displayed as 'Open/Committed' under Stock Reconciliation tab 
Then  User selects the status as 'Committed'
Then  User selects the 'From date' and 'To date'
And   User clicks on 'Show' button and verifies the Stock Reconciliation details
Then  User verifies the Stock Reconciliation Number, Date and Time, Status, User & Inventory Name sections present under the Stock Reconciliation tab
#Then  User verifies the Product, Actual Quantity, System Quantity, Difference, Variance Flag, Variance Reason, Unsaleble Quantity & Unsaleable Variance Reason sections present under the Stock Reconciliation tab 
#Then  User verifies the Print button, Carry Fwd Stock & Off-load Van buttons available under the Stock Reconciliation tab




@RCS_SaaS_Verify_EndOfDay1_WC
Scenario: RCS_SaaS_Verify_EndOfDay1_WC
Then  User verifies the 'Sales Target' tab is present under the End of day tab
Then  User verifies the product, Sales Target, Time Period, Remarks & Actual fields are present under the 'Sales Target' tab
Then  User verifies the 'Sales History' tab is present under the End of day tab
Then  User verifies the 'Sales Order' tab is present under the Sales History tab   
Then  User selects the status as either Open/Closed/Billed under the Sales Order tab 
Then  User selects the From & To Order Date under the Sales Order
And   User clicks on Show button under the Sales Order
Then  User verifies the Name of the Outlet, Date, Payment Amount & Discount % sections displayed under the Sales Order
Then  User navigates to the Pre Sales Order tab 
And   User verifies the Pre Sales Order, Pre Sales Order List & Sales Data sections displayed under the Sales History tab
Then  User selects the status under Pre Sales Order
Then  User selects the From & To Order Date under the Pre Sales Order
And   User clicks on Show button under the Pre Sales Order
Then  User verifies the Customer Name, Customer Number, Order Number, Order Date, Amount Payable, Disc on Bill, Total Quantity, Order Status, Delivery Date & Remarks fields displayed under Pre Sales Order List section
Then  User verifies the Product, Product Number, Quantity, Bonus Quantity, SOQ, Unit Price, GST %, PL Discount, Net Price, Gross Price, Free Field 1, Free Field 2, Free Text Field 1 & Free Text Field 2 fields displayed under Sales Data section
Then  User navigates to the Invoices tab  
Then  User selects the status under Invoices tab
Then  User selects the From & To Order Date under the Invoices tab
And   User clicks on Show button under the Invoices tab
Then  User verifies the Customer Name, Sales Order Number, Discount, Invoice Number, Invoice Date, Amount Payable, Payment Date,Payment Amount & Payment Number fields displayed under Invoices section
Then  User navigates to the 'Closing Mileage' tab under the End of day tab
And   User verifies the Add button is available under Mileage section
Then  User verifies the Date, Time, Mileage & Comments fields displayed under Mileage section





@RCS_SaaS_Verify_Reports_WC
Scenario: RCS_SaaS_Verify_Reports_WC
Then  User navigates to the 'Reports tab' under the Sale Module 
Then  User verifies the Daily Sales Report & Credit Report available under the Reports tab
Then  User verifies the system current 'Date' is displayed under the Daily Sales Report section 
Then  User clicks on 'Go' button & verifies the START OF DAILY SALES REPORT
Then  User verifies the Sales Rep Name & Date is displayed under the Daily Sales Report section  
Then  User verifies the 'Start of Daily Sales Report' header label is displayed 
Then  User verifies the Product Name, Retail, Wholesale & Grand Total fields are displayed under START OF DAILY SALES REPORT
Then  User verifies the Total Number of Invoice, Sales Rep Signature, Manager Signature & End of Daily Sales Report fields were displayed under START OF DAILY SALES REPORT
And   User verifies the 'Print' button is present under the Daily Sales Report section 




#@RCS_SaaS_Verify_Reports1_WC
#Scenario: RCS_SaaS_Verify_Reports1_WC
#Then  User navigates to the 'Credit Report' under the Reports tab
#Then  User verifies the Sales Rep Name, Date & Time under the credit report
#Then  User verifies the 'Start of Credit Report' header label is displayed 
#Then  User verifies the Customer, Customer Type, Credit Limit, Available Credit, Outstanding Credit & BAD Debt Check are displayed under the 'Start of Credit Report' header
#Then  User verifies the Sales Rep Signature & Manager Signature present under the 'Start of Credit Report' header 
#Then  User verifies the 'End of Daily Sales Report' header label is displayed 
#And   User verifies the 'Print' button is present under 'Start of Credit Report' header.




