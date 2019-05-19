#Run the Pre-requisites  - @Organisation, @InventoryLocations,
#Change -------> Login with child Credentials

@DistributorsReturnOrder
Feature: RCS SaaS Distributors_ReturnOrder_WC features


@RCS_SaaS_Creation_Of_ReturnOrder_WC
Scenario: RCS_SaaS_Creation_Of_ReturnOrder_WC
Given Login to the WebClient
When  User Provides the valid child credentials
Then  The User should be successfully logged into the Application
Then  User clicks on the 'Distributors' tab
Then  User selects the 'Return order' tab and navigates to the Return order screen successfully
Then  User verifies the child user inventory name is displayed in 'Source inventory location' and Parent user inventory name is displayed in 'Destination inventory location'
Then  User clicks on the 'Create Return order' & verifies the 'Return order created' message is displayed
Then  User verifies the Return  order is created successfully with 'Open' status
And   User verifies the following Return Order Header fields - Order number, Return order date, Order status, Return order quantity




@RCS_SaaS_ReturnOrder_Details_WC
Scenario: RCS_SaaS_ReturnOrder_Details_WC
Then  User verifies the following Return Order Details - Product, Saleable quantity, Return for reason, Saleable dispatch quantity, Unsaleable quantity, Return for reason, Unsaleable dispatch quantity, Unit of measure, Batch number, Free text field 3 & Free text field 4  
Then  User enters saleable & unsaleable Quantities for an SKU & selects the 'Reason for Return' values from the dropdown
Then  User enters the 'Batch Number' for the saleable & unsaleable Qty's
Then  User clicks on save button & verifies the Order is saved successfully & displays only the SKU for which the qty is entered
Then  User clicks on the 'Book' button & verifies the Return order status is displayed as 'BOOK'
Then  User navigates to the child inventory level 
Then  User verifies the 'Saleable & Unsaleable stock in transit' displaying the SKU qty's which is entered in 'Return Order Details' section
Then  User verifies the same qty is deducted from Saleable & Unsaleable quantity column




@RCS_SaaS_Return_Stock_Received_WC
Scenario: RCS_SaaS_Return_Stock_Received_WC
Then  User login to the RCS WebApplication with Parent credentials
Then  User clicks on the 'Distributors' tab  
Then  User selects the 'Received Stock' tab and then selects the 'Return Stock Received' under Received Stock tab & navigates to the Received Stock screen successfully
Then  User verifies the Return order created is displayed with 'OPEN' status
Then  User enters the 'Batch Number' for the saleable & unsaleable Qty's in the Received Stock screen
Then  User clicks on the save button & then clicks on the commit button in the Received Stock screen
Then  User verifies the Order status is changed to 'COMMIT' in 'Received stock' screen
Then  User navigates to the parent inventory level & verifies the Stock load record is created for the order quantity 
And   User verifies the Saleable & Unsaleable quantities is increased by the order qty Commited in the parent inventory level
And   User verifes the Total stock should be the sum of saleable and unsaleable quantities
Then  User navigates to the child inventory level & verifies the Saleable & unsaleable stock in transit is decreased by the order quantities.





