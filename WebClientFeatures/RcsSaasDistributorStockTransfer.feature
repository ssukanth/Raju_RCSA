#Run the Pre-requisites  - @Organisation, @InventoryLocations

@DistributorsStockTransfer
Feature: RCS SaaS Distributors_StockTransfer_WC features


#src- country, dst-supplier
@RCS_SaaS_Creation_Of_StockTransfer_SalesFlag_Checked_WC
Scenario: RCS_SaaS_Creation_Of_StockTransfer_SalesFlag_Checked_WC
Given Login to the WebClient
When  User Provides the valid Admin credentials
Then  The User should be successfully logged into the Application
Then  User clicks on the 'Distributors' tab
Then  User selects the 'Stock transfer' tab and navigates to the Stock transfer screen successfully
Then  User selects the Sales flag as checked & verifies the destination Inventory Location displays all the external suppliers
Then  User selects the Source inventory location & verifies the Source inventory location displays the logged in user inventory location
Then  User selects the destination inventory location & verifies the destination inventory location displays all the external suppliers
Then  User enters the quantity in Transferred quantity section and verifies the entered Qty is available in the inventory
Then  User clicks on transfer button & verifies the Stock transfer header and details is created successfully with open status
Then  User clicks on the commit button in the stock transfer details section & verifies the Stock transfer order status is changed to 'COMMIT'
And   User verifies the following Stock transfer Header fields - Source Inventory location, Destination inventory location, Stock transfer number, Transfer date & Status
And   User verifies the following Stock transfer details - Product, Transferred quantity, Unit of measure
Then  User navigates to the inventory level & verifies the Source inventory is deducted by the stock transfer order quantity.



#src- country, dst-area
@RCS_SaaS_Creation_Of_StockTransfer_SalesFlag_UnChecked_WC
Scenario: RCS_SaaS_Creation_Of_StockTransfer_SalesFlag_UnChecked_WC
Then  User clicks on the 'Distributors' tab
Then  User selects the 'Stock transfer' tab and navigates to the Stock transfer screen successfully.
Then  User selects the Sales flag as Unchecked & verifies the destination Inventory Location displays only the part of employees hierarchy
Then  User selects the Source inventory location & verifies the Source inventory location displays the logged in user inventory location
Then  User selects the destination inventory location & verifies the destination inventory location displays only the part of employees hierarchy
Then  User enters the quantity in Transferred quantity section and verifies the entered Qty is available in the inventory
Then  User clicks on transfer button & verifies the Stock transfer header and details is created successfully with open status
Then  User clicks on the commit button in the stock transfer details section & verifies the Stock transfer order status is changed to 'COMMIT'
And   User verifies the following Stock transfer Header fields - Source Inventory location, Destination inventory location, Stock transfer number, Transfer date & Status
And   User verifies the following Stock transfer details - Product, Transferred quantity, Unit of measure
Then  User navigates to the inventory level & verifies the Source inventory is deducted by the stock transfer order quantity.
Then  User navigates to the destination inventory level & verifies the Destination inventory is increased by the stock transfer order quantity.






