#Run the Pre-requisites  - @Organisation, @InventoryLocations

@DistributorsSRO
Feature: RCS SaaS Distributors_SRO_WC features


@RCS_SaaS_Creation_Of_SRO_WC
Scenario: RCS_SaaS_Creation_Of_SLO_WC
Given Login to the WebClient
When  User Provides the valid Admin credentials
Then  The User should be successfully logged into the Application
Then  User clicks on the 'Distributors' tab
Then  User selects the 'Stock requisition order' tab and navigates to the Stock requisition order screen
Then  User clicks on the 'create stock requisition order' and verifies the Stock requisition order is created successfully with 'Open' order status
Then  User verifies the 'Order header created' message is displayed
Then  User verifies the Stock requisition order Header displays the following fields - Order number, Order date, Order status, Order value, Order to supplier, Supplier name, Shipped to & Source of order.
Then  User scrolls down to the stock requisition details and verifies the following fields - Product, Target, Quantity, Unit of measure, unit price, Remarks, Free field3 & Free field4.
Then  User enters the Qty for an SKU and clicks on Save button
Then  User verifies the Order is saved successfully & details displays only the SKU for which the qty is entered
Then  User clicks on the 'BOOK' button & verifies the stock requisition Order is booked and stock requisition order status is displayed as 'BOOK'.




@RCS_SaaS_Approve_SRO_WC
Scenario: RCS_SaaS_Approve_SRO_WC
Then  User login to the RCS WebApplication with Parent credentials & verifies the Parent user login is successful
Then  User clicks on the 'Distributors' tab
Then  User selects the 'Stock lifting order' tab and navigates to the Stock lifting Order screen
Then  User selects the 'Approve Stock requisition order' and navigates to 'Approve stock requisition order' screen 
Then  User verifies the order created in 'Stock requisition order' is displayed with 'Book' status in 'Approve stock requisition order' screen 
Then  User selects the checkbox present next to the order & clicks on Approve
Then  User verifies the Order status changes to 'TRANSIT' in 'Approve stock requisition order' screen
Then  User navigates to the Parent inventory level
And   User verifies the 'Saleable stock in transit' displays the SKU qty Which is apporved in 'Approve stock requisition order' screen
And   User verifies the existing 'Saleable qty' is reduced by SKU qty which was approved in 'Approve stock requisition order' screen




@RCS_SaaS_Verify_SRO_Status_WC
Scenario: RCS_SaaS_Verify_SRO_Status_WC
Then  User login to the RCS WebApplication with child credentials & verifies the child user login is successful
Then  User clicks on the 'Distributors' tab
Then  User selects the 'Stock Requisition Order' tab and navigates to the Stock requisition order screen
Then  User clicks on the 'create stock requisition order' and verifies the Stock requisition order is created successfully with 'TRANSIT' order status




@RCS_SaaS_Receive_SRO_WC
Scenario: RCS_SaaS_Receive_SRO_WC
Then  User clicks on the 'Received Stock' & navigates to the 'Received Stock' screen successfully
Then  User verifies the 'Received stock' with open status is displayed after the SRO approved
Then  User enters the batch number for an SKU & clicks on 'Save' button & clicks on 'COMMIT' button in the Received stock details
Then  User verifies the 'Received stock' order status changes to 'COMMIT'
Then  User verifies the 'SRO' order status changes to 'RECEIVE'
Then  User verifies the Stock load record is created for the order quantity and Inventory should be Increased with the SRO order qty in the child inventory level
Then  User verifies the Parent inventory is decreased by the SRO order qty.




@RCS_SaaS_SRO_Export_Order_deatils_WC
Scenario: RCS_SaaS_SRO_Export_Order_deatils_WC
Then  User selects the Ship to party from the dropdown in the Stock requisition Order screen
Then  User clicks on the Export Orders in Excel/CSV button
Then  User verifies the 'Export Order' file is downloaded in Excel/CSV format
Then  User verifies the SRO orders created for the selected 'Ship to party' is displayed in the export report
And   User verifies the data in the File that is downloaded contains - Order number, Order date, Order Status, Ship to, Source of order, Order to supplier, Supplier inventory location.




@RCS_SaaS_Export_SRO_Orders_WC
Scenario: RCS_SaaS_Export_SRO_Orders_WC
Then  User clicks on 'Download Requisition Order Detail in CSV/Excel' button
Then  User verifies the 'Download stock requisition order details info template' file is downloaded in CSV/Excel format
Then  User verifies the SRO orders details created for the selected order is displayed in the export report
And   User verifies the data in the file that is downloaded contains - Product, Quantity, Order number, Drive Brand.




@RCS_SaaS_Export_Stock_Requisition_header_WC
Scenario: RCS_SaaS_Export_Stock_Requisition_header_WC
Then  User clicks on Download Stock requisition order header button
Then  User verifies the Export Stock requisition Header file is downloaded in .csv format
And   User verifies the data in the file that is downloaded contains - Order number, Order date, Order Status, Ship to, Source of Order.








