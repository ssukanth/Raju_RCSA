@DistributorsInventoryLevels
Feature: RCS SaaS Distributors_InventoryLevels_WC features


@RCS_SaaS_Creation_Of_InventoryLevels_WC
Scenario: RCS_SaaS_Creation_Of_InventoryLevels_WC
Given Login to the WebClient
When  User Provides the valid depo user credentials
Then  The User should be successfully logged into the Application
Then  User clicks on the 'Distributors' tab
Then  User selects the ' InventoryLevels' tab and navigates to the inventory levels screen
Then  User verifies the 'Inventory location data' is displayed for the users reporting to the logged in user
Then  User verifies the 'Inventory Levels' displays the following Inventory details - Product, Unit of measure, Total Stock, Saleable quantity, UnSaleable quantity, Saleable stock in transit, Saleable lost in transit, unsaleable stock in transit & unsaleable lost in transit 
Then  User verifies the 'Stock load header' displays the following stock load records - Stock load number, Stock load date, Status
Then  User verifies the 'Stock load' displays the following details - Product, Quantity, Unit of measure, Commit
Then  User clicks on 'Add' button & navigates to the 'Add inventory locations' Screen. 
Then  User creates an new inventory location
Then  User clicks on 'Update inventory' button & verifies the Depo user inventory is updated with the transactions.


