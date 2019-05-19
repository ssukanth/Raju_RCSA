@ProductConfig
Feature: RCS SaaS ProductConfig_WC features


@RCS_SaaS_ProductConfig_WC
Scenario: RCS_SaaS_ProductConfig_WC
Given Login to the WebClient
When  User Provides the valid Admin credentials
Then  The User should be successfully logged into the Application
Then  User clicks on Configuration 
Then  The User should be navigated to configuration screen successfully
Then  User selects 'LOV' tab 
Then  Selects 'LOV' type as 'SYSTEM'
Then  User searches for 'BATCFG' in Lookup sets table
Then  User searches for 'EPM' in Lookups Bat configuration table
Then  User selects 'EPM' and updates the Description field as 'N'
Then  User clicks on save button and refreshes the cache
Then  User clicks on 'Products' tab and navigates to Product screen                        
Then  User verifies add button is not available in the product master 
Then  User selects any Product name from the list
And   Product details page is displayed and user should not be able to edit any of the fields for that product




@RCS_SaaS_Example_ProductConfig_WC_Add_Product
Scenario: RCS_SaaS_ProductConfig_WC - Add Product
Then  User clicks on Configuration 
Then  The User should be navigated to configuration screen successfully
Then  User selects 'LOV' tab 
Then  Selects 'LOV' type as 'SYSTEM'
Then  User searches for 'BATCFG' in Lookup sets table
Then  User searches for 'EPM' in Lookups Bat configuration table
Then  User selects 'EPM' and updates the Description field as 'Y'
Then  User clicks on save button and refreshes the cache
Then  User clicks on 'Products' tab and navigates to Product screen 
Then  User clicks on the Add button and the 'Add new Products' screen should open
Then  User enters the 'Product name'
Then  User enters the 'Product Number'
Then  User enters the 'Tar'
Then  User enters the 'Nicotine'
Then  User selects 'Item Type' as 'Product'
Then  User selects 'Manufacturer' as 'BAT'
Then  User selects 'Parent product Code'
Then  User enters the 'Product Sequence'
Then  User selects 'Product Type'
Then  User selects 'Status'
Then  User selects 'Brand Segment'
Then  User selects 'Flavor Segment'
Then  User selects 'Strategic Mix'
Then  User selects 'Price Segment'     
Then  User selects 'Product free field three'     
Then  User selects 'Blend segment' 
Then  User selects 'Product free field four' 
Then  User selects 'Filter type' 
Then  User selects 'Product free field five' 
Then  User enters the 'Unit of measure' 
Then  User selects 'SC/FC'  
Then  User selects 'Start date' 
Then  User selects 'End date' 
Then  User selects 'Pack type' 
Then  User selects 'Pack size' 
Then  User enters the 'Weight in grams'  
Then  User enters the 'Packs in Carton' 
Then  User enters the 'Unit Price'          
Then  User enters the 'Shelf Life'     
Then  User clicks on Save button and Product Record should be saved successfully




@RCS_SaaS_ProductConfig_WC_Modify_Product
Scenario: RCS_SaaS_ProductConfig_WC - Modify Product
Then  User selects the Product which is to be modified
Then  User drills down to the link of the 'Product Name'
Then  User verifies the 'Edit The Products' screen displayed
And   User Edits any of the field values required to be modified
Then  User clicks against the 'Save' button and Product should be updated successfully 




@RCS_SaaS_ProductConfig_WC_Activate_Product
Scenario: RCS_SaaS_ProductConfig_WC - Activate Product
Then  User selects the Product which is to be modified
Then  User drills down to the link of the 'Product Name'
Then  User verifies the 'Edit The Products' screen displayed
Then  User changes the field value for STATUS to ACTIVE
Then  User clicks against the 'Save' button and Product should be updated successfully 
And   User verifies the STATUS field value for the Product under 'Master Product List Setup' as ACTIVE




@RCS_SaaS_ProductConfig_WC_Cancel_Product
Scenario: RCS_SaaS_ProductConfig_WC - Cancel Product
Then  User clicks on the Add button and the 'Add new Products' screen should open
And   User enters the required field values
Then  User clicks on the cancel button and the screen should exit without adding any Products


 

@RCS_SaaS_ProductConfig_WC_Brand_Product
Scenario: RCS_SaaS_ProductConfig_WC - Brand Product
Then  User clicks on the Add button and the 'Add new Products' screen should open
Then  User enters the name and other mandatory fields for Brand selection
And   User selects the Item Type as 'Brand' 
Then  User clicks on 'Save' button and a new Brand should be created successfully and should be present in the Product list




@RCS_SaaS_ProductConfig_WC_Variant_Product
Scenario: RCS_SaaS_ProductConfig_WC - Variant Product
Then  User clicks on the Add button and the 'Add new Products' screen should open
Then  User enters the name and other mandatory fields for Variant selection
And   User selects the Item Type as 'Variant' 
Then  User clicks on 'Save' button and a new Variant should be created successfully and should be present in the Product list




@RCS_SaaS_ProductConfig_WC_PRODUCT_Product
Scenario: RCS_SaaS_ProductConfig_WC - PRODUCT Product
Then  User clicks on the Add button and the 'Add new Products' screen should open
Then  User enters the name and other mandatory fields for Product selection
And   User selects the Item Type as 'Product' 
Then  User clicks on 'Save' button and a new product should be created successfully and should be present in the Product list




@RCS_SaaS_ProductConfig_WC_SKU_Product
Scenario: RCS_SaaS_ProductConfig_WC - SKU Product
Then  User clicks on the Add button and the 'Add new Products' screen should open
Then  User enters the name and other mandatory fields for SKU selection
And   User selects the Item Type as 'SKU' 
Then  User clicks on 'Save' button and a new sku should be created successfully and should be present in the Product list




@RCS_SaaS_ProductConfig_WC_Bundle_Product
Scenario: RCS_SaaS_ProductConfig_WC - Bundle Product
Then  User clicks on the Add button and the 'Add new Products' screen should open
Then  User enters the name and other mandatory fields for Bundle selection
And   User selects the Item Type as 'Bundle' 
Then  User clicks on 'Save' button and a new bundle should be created successfully and should be present in the Product list




@RCS_SaaS_ProductConfig_WC_Product_Bundle
Scenario: RCS_SaaS_ProductConfig_WC - Bundle Product
Then  User selects the Product Bundle
And   The bottom grid that displays the SKUs in the bundle should open but with no records
Then  User clicks on the 'Add' button in the bottom grid and Add Sku screen should open
Then  User selects the required SKU name and enters the quantity and clicks on 'Save'
Then  The selected SKU with the quantity should be added to the bundle successfully and must be displayed in the bottom grid


