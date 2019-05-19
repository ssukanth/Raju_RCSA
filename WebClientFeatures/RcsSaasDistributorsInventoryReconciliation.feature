#Run the Pre-requisites  - @Organisation, @InventoryLocations,
#There should be no open stock load displayed in any of the distributors tab


@DistributorsInventoryReconciliation
Feature: RCS SaaS Distributors_InventoryReconciliation_WC features


@RCS_SaaS_Creation_Of_InventoryReconciliation_WC
Scenario: RCS_SaaS_Creation_Of_InventoryReconciliation_WC
Given Login to the WebClient
When  User Provides the valid parent credentials
Then  The User should be successfully logged into the Application
Then  User clicks on the 'Distributors' tab
Then  User selects the 'Inventory reconciliaiton' tab and navigates to the inventory reconciliation screen
Then  User clicks on the 'Create Inventory reconciliation'
And   User verifies the Inventory reconciliation with 'Open' status is created and all the SKU is displayed in the details
Then  User verifies the following Inventory Reconciliation Header Details - Inventory reconciliation number, Date, Status
Then  User verifies the following Inventory Reconciliation Product Details - SKU name, Saleable qty, Unsaleable qty
Then  User enters the saleable and unsaleable qty against each SKU
Then  User clicks on 'Compute' button & navigates to the variance screen
Then  User verifies the 'Product' - SKU Name is displayed
Then  User verifies the 'Saleable qty' is displayed which is entered during reconcilaition 
Then  User verifies the 'Saleable system qty' is displayed from the user inventory levels
Then  User verifies the 'Difference' is displayed - difference between the Saleable qty and saleable system qty
Then  User verifies the 'Variance flag' is displayed - If any difference found then the variance flag is checked
Then  User selects the 'Variance reason' - If variance flag is checked then the variance reason is selected for that SKU
Then  User verifies the 'Unsaleable qty' is displayed which is entered during reconcilaition 
Then  User verifies the 'Unsaleable system qty' is displayed from the user inventory levels
Then  User verifies the 'Unsaleable Difference' is displayed - difference between the unsaleable qty and unsaleable system qty
Then  User verifies the 'Unsaleable Variance flag' is displayed - If any unsaleable difference found then the variance flag is checked
Then  User selects the 'Unsaleable Variance reason' - If Unsaleable variance flag is checked then the variance reason is selected for that SKU
Then  User clicks on the 'Commit' button & verifies the Inventory reconciliation completed successfully message is displayed
Then  User verifies the Inventory levels is updated with the latest saleable and unsaleable quantities.
 



@RCS_SaaS_Verify_Commited_InventoryReconciliation_WC
Scenario: RCS_SaaS_Verify_Commited_InventoryReconciliation_WC
Then  User selects the status to 'Commited' from the dropdown & navigates to the inventory reconciliation screen
And   User verifies the Start and end date fields gets enabled & then user selects a different date range & clicks on show button
Then  User verifies the Reconciliation records for the selected date range is displayed
Then  User navigates to the Inventory levels screen & searches for the inventory for whom the Inventory reconciliation has been performed
And   User verifies the Saleable and Unsaleable qty of the inventory is displayed as per the previous inventory reconciliation records.



