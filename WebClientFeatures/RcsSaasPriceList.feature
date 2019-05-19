@PriceList
Feature: RCS SaaS PriceList_WC features


@RCS_SaaS_PriceList_WC
Scenario: RCS_SaaS_PriceList_WC
Given Login to the WebClient
When  User Provides the valid Admin credentials
Then  The User should be successfully logged into the Application
Then  User clicks on Configuration 
Then  User selects 'LOV' tab 
Then  Selects 'LOV' type as 'SYSTEM'
Then  User searches for 'BATCFG' in Lookup sets table
Then  User searches for 'EPL' in Lookups Bat configuration table
Then  User selects 'EPL' and updates the Description field as 'N'
Then  User clicks on save button and refreshes the cache
Then  User clicks on 'Price List' tab and navigates to Price List screen                        
Then  User verifies add button is not available in the price list view screen 
Then  User selects any Pricelist Name from the list
And   Pricelist details page is displayed and user should not be able to edit any of the fields for that pricelist




@RCS_SaaS_PriceList_WC_PriceList_Header_Creation
Scenario: RCS_SaaS_PriceList_WC_PriceList_Header_Creation
Then  User clicks on Configuration 
Then  The User should be navigated to configuration screen successfully
Then  User selects 'LOV' tab 
Then  Selects 'LOV' type as 'SYSTEM'
Then  User searches for 'BATCFG' in Lookup sets table
Then  User searches for 'EPL' in Lookups Bat configuration table
Then  User selects 'EPL' and updates the Description field as 'Y'
Then  User clicks on save button and refreshes the cache
Then  User clicks on 'Price List' tab and navigates to Price List screen 
Then  User clicks on the Add button and the 'Add Price List Header' screen should open
Then  User enters the 'Price List Name'
Then  User selects 'Customer Code'
Then  User selects 'Status' for Price List
Then  User selects 'Start date' for Price List
Then  User selects 'End date' for Price List
Then  User enters the Free Field one for Price List
Then  User enters the Free Field two for Price List
Then  User selects Free Field three for Price List
Then  User clicks on save button and the Pricelist Header should be created accurately with the respective fields populated.




@RCS_SaaS_PriceList_WC_PriceList_Details_Creation
Scenario: RCS_SaaS_PriceList_WC_PriceList_Details_Creation
Then  User searches for the Price List Name in the search field and clicks on refresh button
Then  User clicks on the Add button in the 'PriceList Line Items' grid table
Then  User navigates to the PriceList Details page successfully
Then  User selects 'SKU' for Price List
Then  User enters the 'Unit Price VN'
Then  User enters the 'Excise'
Then  User enters the 'GST%'
Then  User enters the 'Consumer Price VN'
Then  User selects 'Start date' for Price List Details
Then  User selects 'End date' for Price List Details
Then  User enters the Free Field one for Price List
Then  User enters the Free Field two for Price List
Then  User selects the Free Field three for Price List
Then  User selects the Free Field four for Price List
Then  User clicks on save button and the Pricelist Details should be created accurately with the respective fields populated.




@RCS_SaaS_PriceList_WC_PriceList_Duplicate_Customer
Scenario: RCS_SaaS_PriceList_WC_PriceList_Duplicate_Customer
Then  User clicks on the Add button and the 'Add Price List Header' screen should open
Then  User creates a price list with customer code and other mandatory details
And   Price list should be created successfully
Then  User tries to create another price list with same customer code as the first one
And   The system shouldn't allow to create new pricelist with existing customer code which is allocated to other price list




@RCS_SaaS_PriceList_WC_PriceList_Duplicate_Line_Item
Scenario: RCS_SaaS_PriceList_WC_PriceList_Duplicate_Line_Item
Then  User clicks on 'Price List' tab and navigates to Price List screen 
Then  User searches for the Price List Name in the search field and clicks on Refresh button
Then  User clicks on the Add button in the 'PriceList Line Items' grid table
Then  User navigates to the PriceList Details page successfully
Then  Add same SKU's with overlapping time period to the same price list
And   The system shouldn't allow to add same SKU with overlapping time period to the same price list.




@RCS_SaaS_PriceList_WC_PriceList_Associate_Customers_Price_List
Scenario: RCS_SaaS_PriceList_WC_PriceList_Associate_Customers_Price_List
Then  User clicks on the 'Associate Customers' button
Then  User selects an Import File, having customer ID, customer number and account name which has to be associated to the price list created 
Then  User drills down to the Data Entry and navigates to the Search view screen
Then  User should be able to search & find the customer
Then  User drills down to the Customer and navigate to 'Trading Terms' tab
And   The 'Price List' field value should be displayed as selected during pricelist header creation




@RCS_SaaS_PriceList_WC_PriceList_Export
Scenario: RCS_SaaS_PriceList_WC_Price_List_Export
Then  User clicks on Configuration 
Then  The User should be navigated to configuration screen successfully
Then  User clicks on 'Price List' tab and navigates to Price List screen 
Then  User selects one or more Pricelists from the checkbox
Then  User selects the specified format TXT and CSV in which the Pricelist Details are to be exported
Then  User clicks on the Export button for Pricelist.



