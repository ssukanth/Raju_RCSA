#Execute Retail Audit import scenario manually


@AssortmentPlan_CustomerGroup
Feature: RCS SaaS AssortmentPlan_CustomerGroup_WC features



@RCS_SaaS_AssortmentPlan_Navigation_WC
Scenario: RCS_SaaS_AssortmentPlan_Navigation_WC
Given Login to the WebClient
When  User Provides the valid Admin credentials
Then  The User should be successfully logged into the Application
Then  User clicks on Configuration 
Then  The User should be navigated to configuration screen successfully
Then  User clicks on AssortmentPlan and navigates to the Assortment Plan Screen
Then  User verifies the AssortmentPlan dropdown as the following LOVs - Customer SKU Assortment, Depot Assortment
Then  User verifies the AssortmentPlan page as the following sections - Assortment Plan List, Assortment Detail, Customer Group




@RCS_SaaS_AssortmentPlan_Header_Detail_Section_WC
Scenario: RCS_SaaS_AssortmentPlan_Header_Detail_Section_WC
Then  User selects the Depot Assortment Plan from the Assortment Type dropdown
Then  User verifies the following fields are present in 'Assortment Plan' header section - Name, Code, Start Date, End Date, Description, Depot Assortment, Parent Assortment, Status, Default 
Then  User verifies the following fields are present in 'Assortment Plan' detail section - SKU Name, SKU Code, Sequence, Target, Drive Brand, SC
Then  User verifies the following fields are present in 'Inventory Location Section' - Inv Loc Name, Inv Loc Code, Parent Location, Employee, Type, Depot Flag.




@RCS_SaaS_Creation_of_AssortmentPlan_Header_WC
Scenario: RCS_SaaS_Creation_of_AssortmentPlan_Header_WC
Then  User selects the 'Depot Assortment Plan' from the Assortment Type dropdown & verifies the Assortment page is displayed
Then  User clicks on the 'ADD' button in Assortment Plan List section & verifies the Assortment screen is displayed
Then  User enters the 'Name' which is the Mandatory field in the Assortment page
Then  User enters the 'Code' which is the Mandatory field in the Assortment page
Then  User selects the 'Start Date' which is the Mandatory field in the Assortment page
Then  User selects the 'End Date' which is the Mandatory field in the Assortment page
Then  User enters the 'Description' in the Assortment page
Then  User verifies the 'Depot Assortment' Checkbox is Defaulted to True
Then  User selects the 'Parent Assortment' value from the dropdown which populates all the depot assortment plans
Then  User verifies the 'Status' defaults to Draft
Then  User verifies the 'Default' Checkbox is Defaulted to False
Then  User clicks on 'Save' button to save the Assortment Plan header
Then  User verifies the Assortment header is saved with all the mandatory fields successfully.




@RCS_SaaS_AssortmentPlan_Date_Validation_WC
Scenario: RCS_SaaS_AssortmentPlan_Date_Validation_WC
Then  User creates a Assortment Plan Header with End Date lesser than Start Date and saves it
And   User verifies the Application doesnt accept the End Date lesser than Start Date & displays the error message as 'Start Date Should not be Greater Than End Date'
Then  User creates the Assortment Plan Header with End date and Start Date as Past date and saves it
And   User verifies the system not allowing the user to select past dates.




@RCS_SaaS_Creation_of_AssortmentPlan_Details_WC
Scenario: RCS_SaaS_Creation_of_AssortmentPlan_Details_WC
Then  In Assortment Plan screen, User selects the created Assortment Plan header and clicks on 'Add' button to create the assortment details
Then  User selects the 'SKU name' which is a Mandatory field which lists all the active BAT SKUs
Then  User verifies the 'SKU Code' is auto populated on selecting SKU name
Then  User verifies the 'Sequence' field is auto populated on selecting SKU name
Then  User enters the 'Target' which is a Editable Numeric field
Then  User verifies the 'Drive Brand' checkbox is defaulted to N
Then  User verifies the 'SC' field is auto populated on selecting SKU name
Then  User clicks on save button & verifies the Assortment details is saved with all the mandatory fields successfully.




@RCS_SaaS_CustomerGroup_Navigation_WC
Scenario: RCS_SaaS_CustomerGroup_Navigation_WC
Then  User clicks on the 'Customer Group' tab & navigates to the 'Customer Group' screen successfully
Then  User verifies the following tabs are available in Customer Group - Group Settings, Retail Audit Settings
Then  User navigates to the 'Group Settings' tab & verifies the following sections are present - Group Settings, Customer Group, Assortment Plan
Then  User verifies the following dropdown options are present under 'Group Settings' - Assortment Group, Discount Group




@RCS_SaaS_Creation_CustomerGroup_Assortment_WC
Scenario: RCS_SaaS_Creation_CustomerGroup_Assortment_WC
Then  User clicks on the Add button to create Customer Group
Then  User enters the following mandatory fields - Name, Group Code & Group Type 
And   User verifies the 'Group Type' by default is displayed as 'Assortment Group'
Then  User clicks on save button & verifies the record is saved successfully.




@RCS_SaaS_Creation_Add_Customers_WC
Scenario: RCS_SaaS_Creation_Add_Customers_WC
Then  User clicks on the Add button in the 2nd frame to add customer/customers & verifies the Advanced search screen is displayed
Then  User selects the various fields and clicks on Search button
Then  User verifies the list of customers is displayed who belongs to the search criteria & User selects the required data
Then  User selects the customers and clicks on ADD button & user verifies the selected customers is displayed in the detail section of Customer Group screen.




@RCS_SaaS_AssortmentPlan_Exports_WC
Scenario: RCS_SaaS_AssortmentPlan_Exports_WC
Then  User clicks on the 'EXPORT IN CSV' button without selecting any Customers
And   User verifies all the customers associated to the Customer Group were exported in CSV format with following fields - Customer ID, Customer No, Account Name
Then  User clicks on the 'EXPORT' button without selecting any Customers
And   User verifies the system displaying the error message as - Select at least one check box to export'
Then  User clicks on the 'EXPORT' button by selecting few/all Customers & also by selecting the Export format as - CSV or TXT
Then  User verifies the zip file is created which contains .csv file with following fields - Customer ID, Customer No, Account Name




@RCS_SaaS_AssortmentPlan_Imports_WC
Scenario: RCS_SaaS_AssortmentPlan_Imports_WC
Then  User clicks on the Import button & selects the option 'Add customers to group' and selects the file
And   User verifies the Import is successful & All the customers in the file were added to the detail section of Customer Group screen
Then  User clicks on the Import button & selects the option 'Associate Customers' and selects the file
And   User verifies the Import is successful & All the customers in the file were added to the detail section of Customer Group screen. 




@RCS_SaaS_Creation_DiscountGroups_WC
Scenario: RCS_SaaS_Creation_DiscountGroups_WC
Then  User selects the Group Type as 'DISCOUNT GROUP' & clicks on the Add button to create Customer Group
Then  User enters the following mandatory fields - Name, Group Code & selects the Group Type as 'DISCOUNT GROUP' & clicks on Save button
And   User verifies the record is saved successfully.




@RCS_SaaS_Creation_Add_Customers_CG_WC
Scenario: RCS_SaaS_Creation_Add_Customers_CG_WC
Then  User clicks on the Add button in the 2nd Frame to add customer/customers & verifies the Advanced search screen is displayed
Then  User selects the various fields and clicks on search button
Then  User verifies the list of customers is displayed who belongs to the search criteria & user selects the required data
Then  User selects the customers and clicks on ADD button & verifies the selected customers is displayed in the detail section of Customer Group screen.




@RCS_SaaS_AssortmentPlan_Exports_CG_WC
Scenario: RCS_SaaS_AssortmentPlan_Exports_CG_WC
Then  User clicks on the 'EXPORT IN CSV' button without selecting any customers
And   User verifies all the Customers associated to the Customer Group were exported in CSV format with following fields - Customer ID, Customer No, Account Name
Then  User clicks on the 'EXPORT' button without selecting any customers
And   User verifies the system displaying the Error message as - Select at least one check box to export'
Then  User clicks on the 'EXPORT' button by selecting few/all customers & also by selecting the Export format as - CSV or TXT
Then  User verifies the Zip file is created which contains .csv file with following fields - Customer ID, Customer No, Account Name




@RCS_SaaS_AssortmentPlan_Imports_CG_WC
Scenario: RCS_SaaS_AssortmentPlan_Imports_CG_WC
Then  User clicks on the Import button & selects the option as 'Add customers to group' and selects the file
And   User verifies the Import is successful & all the customers in the file were added to the detail section of Customer Group screen
Then  User clicks on the Import button & Selects the option 'Associate Customers' and selects the file
And   User verifies the Import is successful & all the customers in the file were added to the detail section of Customer Group screen. 




@RCS_SaaS_CreateCG1_AssociationAssortmentPlan_WC
Scenario: RCS_SaaS_CreateCG1_AssociationAssortmentPlan_WC
Then  User clicks on the Associate Discount Plan button & verifies the Associate Discount Plan page is displayed which contains all the Active Customer SKU Assortment Plan
Then  User selects a Discount Plan & Clicks on Save button & verifies the Discount Plan is selected, associated and available in the 3rd frame Discount Plan section.




@RCS_SaaS_Creation_Retail_Audit_Group_WC
Scenario: RCS_SaaS_Creation_Retail_Audit_Group_WC
Then  User clicks on the Customer Group & navigates to the 'Retail Audit Settings' tab
And   User verifies the Retail Audit Settings screen displays the Retail Audit Group as 1st section & SKU's to be added to the Retail Audit group as 2nd section
Then  User clicks on the Add button to create Retail Audit Group & verifies the 'Add Retail Audit Group' screen is displayed
Then  User enters the following Mandatory fields - Name, Group Code & Group Type 
And   User verifies the 'Group Type' by Default is displayed as 'Assortment Group'
Then  User clicks on Save button & verifies the record is saved successfully
Then  User clicks on the Add button in 2nd frame to add SKUs & verifies the 'Add Retail Audit Settings' page is displayed
Then  User selects the 'SKU name' which is a Mandatory field which lists all the Active BAT SKUs
Then  User verifies the 'SKU Code' is Auto populated on selecting SKU name
Then  User selects the 'SC' checkbox - If checked, selected SKU will be made mandatory in Stock Count screen
Then  User clicks on the save button & verifies the SKUs is added to the Retail Audit Group under the 2nd Frame.




@RCS_SaaS_Retail_Audit_Group_Exports_WC
Scenario: RCS_SaaS_Retail_Audit_Group_Exports_WC
Then  User clicks on the 'EXPORT IN CSV' button without selecting any Retail Audit Group
And   User verifies all the Retail Audit Groups and the associated SKUs were exported in CSV format with following fields - Customer Group Name, Group Code, SKU Name, SKU Code, SC
Then  User Verifies without selecting any Retail Audit Group the EXPORT button is disabled
Then  User clicks on the EXPORT button by selecting few/all Retail Audit Group & also by selecting the Export format as - CSV or TXT
And   User verifies the selected Retail Audit Groups exported in CSV format with following fields - Customer Group Name, Group Code, SKU Name, SKU Code, SC




#@RCS_SaaS_Retail_Audit_Group_Imports_WC
#Scenario: RCS_SaaS_Retail_Audit_Group_Imports_WC
#Then  User clicks on the Import button and selects the Retail Audit Group Imports file
#And   User verifies the Import is successful & all the SKUs in the file is added to the detail section of Retail Audit Group.




@RCS_SaaS_Creation_Customer_Assortment_Header_WC
Scenario: RCS_SaaS_Creation_Customer_Assortment_Header_WC
Then  User selects the 'Customer Assortment Plan' in 'Assortment Type'
Then  User creates Customer Assortment Plan header with all the following required details - Name, Code, Start Date, End Date, Description, Parent Assortment
And   User verifies the status by Default is displayed as 'Draft'
Then  User clicks on save button & verifies the Customer Assortment Plan Header is saved successfully.




@RCS_SaaS_Creation_Customer_Assortment_Details_WC
Scenario: RCS_SaaS_Creation_Customer_Assortment_Details_WC
Then  User clicks on 'ADD' button in details section to Add the SKUs to the header
Then  User verifies the Adding SKU screen is displayed successfully with below fields
Then  User selects the 'SKU name' from the dropdown - All the SKUs associated to the selected Parent Assortment plan gets displayed
Then  User verifies the 'SKU code' is auto populated on selecting the 'SKU name' from the dropdown
Then  User verifies the 'Sequence value' is auto populated from the Product Master
Then  User enters the 'Target' value in the SKUs screen
Then  User selects the 'Drive Brand' in the SKUs screen
Then  User clicks on 'save' button & verifies all the SKUs for that Customer Assortment plan is saved successfully.




@RCS_SaaS_Customer_Assortment_Date_Validation_WC
Scenario: RCS_SaaS_Customer_Assortment_Date_Validation_WC
Then  User creates a Customer Assortment Plan Header with End Date lesser than Start Date and saves it
And   User verifies the Application not accepting End Date lesser than Start Date & displays error message as 'Start Date Should not be Greater Than End Date'
Then  User creates the Customer Assortment Plan Header with End date and Start Date as Past date and saves it
Then  User verifies the system not allowing user to select past dates.




@RCS_SaaS_Verification_Association_NewParentAssortmentPlan_WC
Scenario: RCS_SaaS_Verification_Association_NewParentAssortmentPlan_WC
Then  User verifies that once Customer SKUs Assortment plan is saved, changing Parent Assortment will delete Current Assortment details and copy details from the modified Parent Assortment plan
And   User verifies Customer Assortment Plan and Depot Assortment Plan is associated successfully
Then  User verifies when Parent Assortment is modified from PDAP to XDAP, Current Assortment details is deleted and copies details from the modified Parent Assortment plan XDAP.




