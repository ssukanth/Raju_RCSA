#First Run ConfigurationUsers

@InventoryLocation
Feature: RCS SaaS Inventory Location_WC features


@RCS_SaaS_Add_InventoryLocation_WC
Scenario: RCS_SaaS_Add_InventoryLocation_WC
Given Login to the WebClient
When  User Provides the valid Admin credentials
Then  The User should be successfully logged into the Application
Then  User clicks on Configuration 
Then  The User should be navigated to configuration screen successfully
Then  User clicks on Inventory location
And   The User Navigates to 'Inventory location' screen and the existing Inventory locations should be displayed successfully
Then  User verifies the add button is enabed successfully
Then  User clicks on the add button
And   User verifies the Add Inventory Location screen as been displayed successfully
Then  User enters the field - 'Inventory name'
Then  User enters the field - 'Route/Territory Code'
Then  User selects the 'Employee - LOV' dropdown
Then  User clicks on the Depot checkbox - should be checked only for Warehouse
Then  User clicks on the 'Integrated to ERP' checkbox - should be enabled only if the inventory location is a depot
Then  User selects the 'Type' as either - Van/Stock Point/ Supplier from the dropdown
Then  User clicks on the 'Uses RCS8' checkbox
Then  User selects the Parent Location dropdown - Mandatory for Van and Stock Point
Then  User selects the 'Assortment plan' dropdown
Then  User selects the 'Distributor Name This is mandatory for Rep' dropdown 
Then  User selects the 'Status' dropdown for Inventory Location
Then  User enters the field - 'Address Line 1'
Then  User enters the field - 'Address Line 2' - Optional
Then  User selects the 'Country' dropdown for Inventory Location screen
Then  User selects the 'County' dropdown
Then  User selects the 'City' dropdown
Then  User selects the 'Suburb' dropdown
Then  User enters the field - 'Phone No.'
Then  User enters the field - 'Mobile No.'
Then  User enters the field - 'Fax'
Then  User enters the field - 'PIN'
Then  User enters the field - 'E-mail'
And   User clicks on Save button and verifies that the New Inventory Location is added successfully in the list




@RCS_SaaS_Delete_InventoryLocation_WC
Scenario: RCS_SaaS_Delete_InventoryLocation_WC
And   The User Navigates to 'Inventory location' screen and the existing Inventory locations should be displayed successfully
Then  User verifies that selecting Cancel button, user should exit from the screen without the new Inventory Location created.




@RCS_SaaS_Edit_InventoryLocation_WC
Scenario: RCS_SaaS_Edit_InventoryLocation_WC
And   The User Navigates to 'Inventory location' screen and the existing Inventory locations should be displayed successfully
Then  User navigates to 'Inventory location' screen and verifies that the hyperlink of 'Name' is available
Then  User clicks on the Hyper Link of 'Name' field and verifies that the 'Edit Inventory location' screen is displayed
Then  User updates few fields
And   User clicks on save button and verifies 'Inventory location' details updated successfully in the list. 




@RCS_SaaS_Navigation_InventoryLocation_WC
Scenario: RCS_SaaS_Navigation_InventoryLocation_WC
And   The User Navigates to 'Inventory location' screen and the existing Inventory locations should be displayed successfully
Then  User navigates to 'Inventory location' screen and selects an inventory location from the top grid
Then  User verifies the Inventory Levels of the selected location displayed in the bottom grid.




@RCS_SaaS_Verification_InventoryLocation_WC
Scenario: RCS_SaaS_Verification_InventoryLocation_WC
And   The User Navigates to 'Inventory location' screen and the existing Inventory locations should be displayed successfully
Then  User Verifies the following Column - Product is present in the Inventory Levels
Then  User Verifies the following Column - Unit of measure is present in the Inventory Levels
Then  User Verifies the following Column - Total stock is present in the Inventory Levels
Then  User Verifies the following Column - Saleable Quanty is present in the Inventory Levels
Then  User Verifies the following Column - Unsaleable Quantity is present in the Inventory Levels
Then  User Verifies the following Column - Saleable Stock in Transit is present in the Inventory Levels
Then  User Verifies the following Column - Saleable Lost in Transit is present in the Inventory Levels
Then  User Verifies the following Column - Unsaleable stock in Transit is present in the Inventory Levels
Then  User Verifies the following Column - Unsaleable lost in transit is present in the Inventory Levels




@RCS_SaaS_Create_InventoryLocation_External_Supplier
Scenario: RCS_SaaS_Create_InventoryLocation_External_Supplier
And   The User Navigates to 'Inventory location' screen and the existing Inventory locations should be displayed successfully
Then  User clicks on the 'Add' button at the  bottom of  the 'Inventory Locations' grid
And   User verifies the 'Add Inventory Location' screen displayed successfully
Then  User enters the 'Inventory name' field as 'ExternalSupplier_INV'
Then  User selects the 'Employee - LOV' dropdown as 'Null'
Then  User selects the 'Depot' as Unchecked
Then  User selects the Parent Location dropdown as 'Null'
Then  User selects the 'Status' dropdown as 'Active'
Then  User selects the 'Type' as 'Supplier' from the dropdown
And   User clicks on Save button and verifies that the admin is successfully navigated to 'Inventory Locations' screen and the record is visible in the view.

