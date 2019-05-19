#Run the Pre-requisites  - @Organisation, @InventoryLocations

@DistributorsSLO
Feature: RCS SaaS Distributors_SLO_WC features


@RCS_SaaS_Creation_Of_SLO_WC
Scenario: RCS_SaaS_Creation_Of_SLO_WC
Given Login to the WebClient
When  User Provides the valid Admin credentials
Then  The User should be successfully logged into the Application
Then  User verifies the pre-requisite - Inventory location for supplier associated with employee is present in the system
Then  User verifies the pre-requisite - Full access to Distributor module is provided
Then  User verifies the inventory levels and note downs the inventory data
And   User verifies the above pre-requisites as been executed successfully
Then  User clicks on the 'Distributors' tab
Then  User selects the 'Stock lifting order' tab and navigates to the Stock lifting order screen
Then  User clicks on the 'create stock lifting order' and verifies the Stock lifting order is created successfully with 'Open' status
Then  User verifies the Stock lifting order Header displays the following fields - Order number, Order date, Order status, Order value, Order to supplier, Supplier name, Shipped to & Source of order. 
Then  User scrolls down to the stock lifting details and verifies the following fields - Product, Target, Quantity, Unit of measure, unit price, Remarks, Free field3 & Free field4.
Then  User enters the Qty for an SKU and clicks on save button
Then  User clicks on the order number hyperlink to select the supplier name
Then  User selects the supplier name from the supplier dropdown & clicks on save button
Then  User verifies the stock lifting Order is saved successfully & the stock lifting details displays only the SKU for which the qty is entered
Then  User verifies the Supplier name is visible in the stock lifting Order section
Then  User clicks on the 'BOOK' button & verifies the stock lifting Order is booked and stock lifting order status is displayed as 'BOOK'.




@RCS_SaaS_Receive_the_SLO_WC
Scenario: RCS_SaaS_Receive_the_SLO_WC
Then  User selects the 'Received Stock' tab and navigates to the Received Stock screen
Then  User clicks on the 'Add' button & navigates to the 'add inventory locations' screen
Then  User selects the Supplier name from the 'Receive From Supplier' dropdown
Then  User selects the 'Order Number' from the dropdown
Then  User clicks on the save button & verifies the received stock with 'Open' status is created
Then  User enters the batch number for an SKU in received stock details section
Then  User clicks on save button & clicks on 'Commit' & verifies the received stock status is changed to 'COMMIT'
Then  User verifies the SLO order status is displayed as 'RECEIVE'
Then  User clicks on the inventory Level button & navigates to the inventory level of the user section
And   User verifies the Stock load record is created for the order quantity and Inventory is increased with the SLO order qty.




@RCS_SaaS_Export_Orders_WC
Scenario: RCS_SaaS_Export_Orders_WC
Then  User selects the Source and Ship to party from the dropdown in the Stock Lifting Order screen
Then  User clicks on the Export orders in Excel/CSV button
Then  User verifies the 'Export order' file is downloaded in Excel/CSV format
Then  User verifies the SLO orders created for the selected 'Source and Ship to party' is displayed in the export report
And   User verifies the data in the file that is downloaded contains - Order number, Order date, Order Status, Ship to, Source of order, Order to supplier, Supplier inventory location.




@RCS_SaaS_Export_SLO_Orders_WC
Scenario: RCS_SaaS_Export_SLO_Orders_WC
Then  User clicks on 'Download LO detail in CSV/Excel' button
Then  User verifies the 'Download stock lifting order details info template' file is downloaded in CSV/Excel format
Then  User verifies the SLO orders details created for the selected order is displayed in the export report
And   User verifies the data in the file that is downloaded contains - Product, Quantity, Order number, Drive brand.




@RCS_SaaS_Export_Stock_lifting_header_WC
Scenario: RCS_SaaS_Export_Stock_lifting_header_WC
Then  User clicks on Export Stock lifting header button
Then  User verifies the Export Stock lifting Header file is downloaded in .csv format
And   User verifies the data in the file that is downloaded contains - Order number, Order date, Order Status, Ship to, Source of order.









