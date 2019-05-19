#Run ---> @Territory, @Contract


@DataEntry
Feature: RCS SaaS Authorization_WC features


@RCS_SaaS_DataEntry_Navigation_WC
Scenario: RCS_SaaS_DataEntry_Navigation_WC
Given Login to the WebClient
When  User Provides the valid Admin credentials
Then  The User should be successfully logged into the Application
Then  User navigates to the Search screen
Then  User provides a query for an Outlet/provides specific condition & clicks on Search button
And   User navigates to the Profile screen successfully
Then  User should be able to see the - Profile tab
Then  User should be able to see the - Address tab
Then  User should be able to see the - Attachments tab
Then  User should be able to see the - Contacts tab
Then  User should be able to see the - Outlet Times tab
Then  User should be able to see the - Assessments tab
Then  User should be able to see the - Suppliers tab
Then  User should be able to see the - Merchandising tab
Then  User should be able to see the - Retail Audit tab
Then  User should be able to see the - Contract tab
Then  User should be able to see the - Territory tab
Then  User should be able to see the - Sales tab
Then  User should be able to see the - FOC Orders tab
Then  User should be able to see the - Planogram tab
Then  User should be able to see the - Group Messages tab
Then  User should be able to see the - Service Requests tab
Then  User should be able to see the - Customer Sales Target tab




@RCS_SaaS_DataEntry_Profile_WC
Scenario: RCS_SaaS_DataEntry_Profile_WC
Then  User verifies the Search Results screen displaying the following column - Customer No.
Then  User verifies the Search Results screen displaying the following column - Account Name 
Then  User verifies the Search Results screen displaying the following column - City 
Then  User verifies the Search Results screen displaying the following column - Phone Number  
Then  User verifies the Search Results screen displaying the following column - Shopper Channel
Then  User verifies the Search Results screen displaying the following column - Outlet Type 
Then  User verifies the Search Results screen displaying the following column - Outlet Sub Type




@RCS_SaaS_DataEntry_Export_Verification_WC
Scenario: RCS_SaaS_DataEntry_Export_Verification_WC
Then  User clicks on the EXPORT IN CSV button
And   EXPORT IN CSV should export the results for the searched criteria in CSV format displaying - Customer ID, Customer No, Account Name
Then  User clicks on the EXPORT IN EXCEL button
And   EXPORT IN EXCEL should export the results for the searched criteria in Excel format displaying - Customer ID, Customer No, Account Name
Then  User clicks on the EXPORT TRADING TERMS DATA button
And   EXPORT TRADING TERMS DATA should export the Trading Terms results for the searched criteria in CSV format displaying - Customer ID, Customer No, Account Name




@RCS_SaaS_DataEntry_Profile_Grid_Verification_WC
Scenario: RCS_SaaS_DataEntry_Profile_Grid_Verification_WC
Then  User verifies the following grid - General Information is available under the Profile tab
Then  User verifies the following grid - Customer Address is available under the Profile tab
Then  User verifies the following grid - Customer Classification is available under the Profile tab
Then  User verifies the following grid - Trading Terms is available under the Profile tab
Then  User verifies the following grid - Additional Information is available under the Profile tab
Then  User verifies the following grid - Notes is available under the Profile tab




@RCS_SaaS_Profile_DataEntry_WC
Scenario: RCS_SaaS_Profile_DataEntry_WC
Then  User verifies the 'General information' section displays the Customer's General Information with Mandatory fields as - Customer No, Customer Name, Outlet Type, Outlet Sub Type, Shopper Channel, Customer Type, Status, Global Customer Number.
Then  User verifies the 'Customer Address' section displays the Customer's Primary Address, Bill To Address, Ship To Address & GPS Coordinates
Then  User verifies the 'Customer Classification' section displays the Customer's Classification details
Then  User verifies the 'Trading Terms' section displays the Customer's Trading Terms with Mandatory field as Collection Type information
Then  User verifies the 'Additional Information' section displays the Customer's Additional Information details
Then  User verifies the 'Notes' section displays the Customer's Notes
Then  User clicks on the 'Add Notes' button
Then  User enters the 'Date' in the 'Notes' section and it should be a Date picker & mandatory field
Then  User selects the 'Type' dropdown in the 'Notes' section
And   User enters the text in the 'Note text' field
Then  User clicks on 'Save Notes' button and the 'Notes' should be saved successfully
Then  User clicks on delete icon and the 'Notes' should be deleted successfully
Then  User clicks on the save button and verifies the message displayed as 'Customer Name - Customer updated successfully'.




@RCS_SaaS_Address_Creation_WC
Scenario: RCS_SaaS_Address_Creation_WC
Then  User clicks on the 'Address Tab' and navigates to the Address screen successfully
Then  User clicks on the 'Add Address' button
And   Add Customer Address page should be displayed successfully
Then  User enters the 'Street Info' in the Customer Address page
Then  User enters the 'Street Number' in the Customer Address page
Then  User enters the 'Street Name' in the Customer Address page
Then  User selects the 'Country' dropdown in the Customer Address page
Then  User selects the 'County' dropdown in the Customer Address page
Then  User selects the 'City' dropdown in the Customer Address page
Then  User selects the 'Suburb' dropdown in the Customer Address page
Then  User enters the 'Postal Code' in the Customer Address page
Then  User clicks on save button and the Address record should be added & displayed under the Address list successfully
Then  User verifies by default the newly added address does not have all three Flags checked - Primary Address, Bill To Address, Ship To Address
Then  User verifies that the system should allow to select any of these 3 Flags or all 3 Flags for an Address record
Then  User verifies that the system should not allow to select any of these 3 Flags or all 3 Flags for all the Address records.




@RCS_SaaS_Address_Deletion_WC
Scenario: RCS_SaaS_Address_Deletion_WC
Then  User selects an Address record for which the Primary Address is checked & clicks on the Delete icon
And   The System should prompt a message 'Primary address cannot be deleted'
Then  User selects an Address record for which the Primary Address is Unchecked, Bill To & Ship To Address are Checked and clicks on the Delete icon
And   The Address record should be deleted successfully.




@RCS_SaaS_Contacts_Creation_WC
Scenario: RCS_SaaS_Contacts_Creation_WC
Then  User clicks on the 'Contacts Tab' and navigates to the Contacts screen successfully
Then  User clicks on the 'Add New' button and the 'Add Customer Contact' page should be displayed successfully
Then  User enters the following mandatory fields - 'First & Last name'
Then  User enters the 'Mobile Number'
Then  User enters the 'Land Phone Number'
Then  User enters the 'Fax'
Then  User enters the valid 'Email Address'
Then  User sets the field 'Key Contact' to YES to make this as a KEY CONTACT
Then  User enters/selects the data in all the other fields
Then  User clicks on save button and the Contact should be created successfully & displayed under the Contact list
Then  User clicks on the 'First Name' and edits the contact records and clicks on the save button
And   User verifies the Contact record is edited & saved without any errors.




@RCS_SaaS_Contacts_Navigation_WC
Scenario: RCS_SaaS_Contacts_Navigation_WC
Then  User verifies the following fields are available in the contacts list screen - Title, First Name, LAST Name, Mobile Number, Land Phone Number
Then  User verifies the following fields are available in the contacts list screen - Fax, Email Address, Job Title, Brand Smoked, Nationality
Then  User verifies the following fields are available in the contacts list screen - Language, Key Contact, Free LOV, Free LOV 2, Free Text 1, Free Text 2
Then  User verifies the 'Copy Contact icon' is present in front of the Title field
Then  User verifies the 'Delete icon' is present in front of the Copy Contact icon




@RCS_SaaS_Add_Exisiting_Contact_WC
Scenario: RCS_SaaS_Add_Exisiting_Contact_WC
Then  User clicks on the 'Add Existing Contact' button
Then  User verifies 'Add Existing Contact' page displayed & by default system should display all the contacts
Then  User selects the Territory dropdown & clicks on the icon in front the Title field for the record to be added
Then  User verifies the selected contact is added to the contacts list successfully.




@RCS_SaaS_Copy_Contact_WC
Scenario: RCS_SaaS_Copy_Contact_WC
Then  User clicks on the Copy Contact icon in front the Title field for the record to be copied
And   User verifies the 'Copy Customer Contact' page displayed successfully
Then  User edits the record and clicks on save button
Then  User verifies the New Record is edited and saved without any errors successfully.




@RCS_SaaS_Contacts_Deletion_WC
Scenario: RCS_SaaS_Contacts_Deletion_WC
Then  User selects the contact record & clicks on the Delete icon
And   User verifies the selected contact record is deleted successfully.




@RCS_SaaS_Outlets_Times_Navigation_WC
Scenario: RCS_SaaS_Outlets_Times_Navigation_WC
Then  User clicks on the 'Outlet Times' tab and navigates to the Outlet Times screen
Then  User clicks on the 'Add' button and the 'Add Customer Outlet Times' page should be displayed successfully
Then  User selects the 'Week Day' dropdown
Then  User selects the 'Rep Type' dropdown
Then  User selects the 'Season1' dropdown
Then  User verifies the Start Date is a greyed out field and by default Start date defined for the Season-1 should popup
Then  User verifies the End Date is a greyed out field and by default End date defined for the Season-1 should popup
Then  User enters the Start Time in Hours & Minutes fields in 2 digits
Then  User enters the End Time in Hours & Minutes fields in 2 digits
Then  User selects the 'Season2' dropdown.
Then  User verifies the Start Date is a greyed out field and by default Start date defined for the Season-2 should popup.
Then  User verifies the End Date is a greyed out field and by default End date defined for the Season-2 should popup.
Then  User enters the Start Time in Hours & Minutes fields in 2 digits.
Then  User enters the End Time in Hours & Minutes fields in 2 digits. 
Then  User enters the 'Remarks' in the text field
Then  User selects the Free Field 1 dropdown in the Customer Outlet Times screen
Then  User selects the Free Field 2 dropdown in the Customer Outlet Times screen.
Then  User enters the  Free Text 1 in the Customer Outlet Times screen
Then  User enters the  Free Text 2 in the Customer Outlet Times screen.
Then  User clicks on save button and verifies the data entered/selected is saved successfully.
Then  User edits the record & clicks on save button and verifies that the record is saved without any errors successfully.




@RCS_SaaS_Copy_Outlet_Times_WC
Scenario: RCS_SaaS_Copy_Outlet_Times_WC
Then  User clicks on the 'Copy OUTLET TIMES' icon in front of the Week Day field for the record to be copied
Then  User verifies the Copy Outlet Times page displayed successfully
Then  User edits the record and clicks on save button in the Copy Outlet Times screen
And   User verifies that the record is saved without any errors successfully.




@RCS_SaaS_Outlet_Times_Deletion_WC
Scenario: RCS_SaaS_Outlet_Times_Deletion_WC
Then  User selects an OUTLET TIMES record & clicks on the Delete icon
And   User verifies that the selected OUTLET TIMES record deleted successfully.




@RCS_SaaS_Suppliers_WC
Scenario: RCS_SaaS_Suppliers_WC
Then  User clicks on the 'Suppliers' tab and navigates to the Suppliers screen
Then  User clicks on the 'Add' button and the 'Add Customer Suppliers' page should be displayed successfully
Then  User selects the 'Supplier Name' dropdown which displays all the Supplier records available in the application
Then  User enters the 'Supplier Customer Ref #'
Then  User enters the 'BAT% of Supply'
Then  User enters the 'Total Volume Supply%'
Then  User selects the Free Lov 1 dropdown in the Suppliers screen
Then  User selects the Free Lov 2 dropdown in the Suppliers screen.
Then  User enters the  Free Text 1 in the Suppliers screen
Then  User enters the  Free Text 2 in the Suppliers screen.
Then  User clicks on save button and verifies the supplier record is listed under Suppliers list.
Then  User clicks on the supplier name & edits the record & clicks on save button and verifies that the record is saved without any errors successfully.




@RCS_SaaS_Copy_Supplier_WC
Scenario: RCS_SaaS_Copy_Supplier_WC
Then  User clicks on the copy supplier icon in front the Supplier Name field for the record to be copied
Then  User verifies the copy customer supplier page is displayed successfully
Then  User edits the record and changes the supplier name & clicks on the save button
Then  User verifies that the record is saved without any errors successfully in the suppliers screen.




@RCS_SaaS_Supplier_Deletion_WC
Scenario: RCS_SaaS_Supplier_Deletion_WC
Then  User selects an supplier record & clicks on the Delete icon
And   User verifies that the selected supplier record deleted successfully.




@RCS_SaaS_Add_Merchandising_WC
Scenario: RCS_SaaS_Add_Merchandising_WC
Then  User clicks on the 'Merchandising' tab and navigates to the Merchandising screen
Then  User clicks on the 'Add' button and the 'Add Merchandise for Customer page' should be displayed successfully
Then  User selects the 'Merchandise Name' dropdown which displays all the Active Merchandise records available in the application
Then  User enters the 'No of Column'
Then  User verifies the 'Quantity' by default displayed as 1 in the quantity textbox field
Then  User verifies the 'Brand' textbox field is greyed out and by selecting the Merchandise name, this field should be auto-populated
Then  User selects the 'Execution' dropdown
Then  User selects the 'Execution Status'
Then  User selects the 'Location'
Then  User selects the 'Installation Date'
Then  User selects the 'Condition'
Then  User selects the 'Touch Point'
Then  User selects the 'Hot Spot Indicator'
Then  User selects the 'Company' dropdown
Then  User verifies the 'Asset No.' textbox field is greyed out
Then  User selects the 'Removal Date' 
Then  User selects the Free Field 1 dropdown in the merchandising screen
Then  User selects the Free Field 2 dropdown in the merchandising screen.
Then  User enters the Free Text 1 in the merchandising screen
Then  User enters the Free Text 2 in the merchandising screen.
Then  User clicks on save button and verifies the Merchandise record is listed under Merchandise list.
Then  User clicks on the Merchandise name & edits the record & clicks on save button and verifies that the record is saved without any errors successfully.




@RCS_SaaS_Copy_Merchandise_WC
Scenario: RCS_SaaS_Copy_Merchandise_WC
Then  User clicks on the Copy Merchandise icon in front the Merchandise Name field for the record to be copied
Then  User verifies the Copy Merchandise for Customer page is displayed successfully
Then  User edits the record & clicks on the save button
Then  User verifies that the record is saved without any errors successfully in the Merchandise screen.




@RCS_SaaS_Merchandising_Data_Validation_WC
Scenario: RCS_SaaS_Merchandising_Data_Validation_WC
Then  User creates a Merchandise record where the Removal date is lesser than the Installation Date & saves the record
Then  User verifies that the system should prompt a message 'Removal Date should be greater than Installation Date'.




@RCS_SaaS_Merchandising_Deletion_WC
Scenario: RCS_SaaS_Merchandising_Deletion_WC
Then  User selects an Merchandise record & clicks on the Delete icon
And   User verifies that the selected Merchandise record is deleted successfully.




@RCS_SaaS_Retail_Audit_WC
Scenario: RCS_SaaS_Retail_Audit_WC
Then  User clicks on the 'Retail Audit' tab and navigates to the Facings Check screen
Then  User clicks on the 'Create New Facings Check' button
Then  User verifies the 'Facings Check record' created with Header "AUDIT DATE" & Details page is displayed with all Products 
Then  User verifies all the active Product records are available in the application
Then  User verifies the 'Product Number' is auto populated from the Product Master
Then  User enters the data in the 'Face-On' textbox 
Then  User enters the data in the 'End-On' textbox 
Then  User enters the data in the 'Side-On' textbox
Then  User selects the 'Availability' dropdown
Then  User enters the 'Table Count'
Then  User selects the Free Field 1 dropdown in the Facings Check screen
Then  User selects the Free Field 2 dropdown in the Facings Check screen.
Then  User enters the Free Text 1 in the Facings Check screen
Then  User enters the Free Text 2 in the Facings Check screen.
Then  User verifies the 'Product Status' is displayed in Green color if it is Active
Then  User verifies the 'Audit Date' with Date Picker & 'Product Name Filter' with Search button is displayed
Then  User clicks on the save button and verifies the product records is saved without any errors
Then  User clicks on the ADD button & enters/selects the data in all the fields for rest of the Products
Then  User clicks on the save button and verifies the rest of the product records is saved without any errors
Then  User enters the 'Product name' in 'PRODUCT NAME FILTER' search box & clicks on Search button.
Then  User verifies the Queried product is displayed successfully
Then  User edits the record and clicks on save button in the Facings Check screen
And   User verifies the record is saved without any errors and the system displays a prompt message as 'Product saved successfully'.




@RCS_SaaS_Retail_Audit_Product_Deletion_WC
Scenario: RCS_SaaS_Retail_Audit_Product_Deletion_WC
Then  User selects an Product record & clicks on the Delete icon
And   User verifies that the selected Product record is deleted successfully.




@RCS_SaaS_Stock_Count_WC
Scenario: RCS_SaaS_Retail_Audit_WC
Then  User clicks on the 'Switch to Stock Count' button and navigates to the Stock Count screen
Then  User verifies the 'Stock Count' record is created with Header "AUDIT DATE" & Details page with all SKU's is displayed with all Products 
Then  User verifies all the active product SKU records are available in the application
Then  User verifies the 'Product Number' is auto populated from the Product Master in the Stock Count screen
Then  User enters the data in the 'Good Quantity' textbox
Then  User enters the 'Price'
Then  User enters the data in the 'Deliveries' textbox
Then  User enters the data in the 'Third Party Deliveries' textbox
Then  User enters the data in the 'Bad Quantity' textbox
Then  User selects the Free Field 1 dropdown in the Stock Count screen
Then  User selects the Free Field 2 dropdown in the Stock Count screen.
Then  User enters the Free Text 1 in the Stock Count screen
Then  User enters the Free Text 2 in the Stock Count screen.
Then  User verifies the 'Product SKU Status' is displayed in Green color if it is Active
Then  User verifies the 'Audit Date' with Date Picker & 'Product Name Filter' with Search button is displayed in the Stock Count screen
Then  User clicks on the save button and verifies the product records is saved without any errors
Then  User clicks on the ADD button & enters/selects the data in all the fields for rest of the Products in Stock Count screen
Then  User clicks on the save button and verifies the rest of the product records is saved without any errors
Then  User enters the 'Product name' in 'PRODUCT NAME FILTER' search box & clicks on Search button in Stock Count screen
Then  User verifies the Queried SKU is displayed successfully
Then  User edits the record and clicks on save button in the Stock Count screen
And   User verifies the record is saved without any errors and the system displays a prompt message as 'Product saved successfully'.




@RCS_SaaS_Retail_Audit_SKU_Deletion_WC
Scenario: RCS_SaaS_Retail_Audit_SKU_Deletion_WC
Then  User selects an SKU record & clicks on the Delete icon
And   User verifies that the selected SKU record is deleted successfully.




@RCS_SaaS_Corporate_Contracts_WC
Scenario: RCS_SaaS_Corporate_Contracts_WC
Then  User clicks on the 'Contracts' tab and navigates to the Contracts screen
Then  User verifies the following grids Contract List, Driver list and Trade Payment for the Contract are avaialble
Then  User clicks on the 'Add Corporate Contract' button and navigates to the 'Add Customer Corporate Contract' page
Then  User selects the 'Contract Name' which displays all the active Corporate Contracts records available in the application 
Then  User verifies the 'Contract Type' textfield is greyed out and auto populated to Corporate
Then  User verifies the 'Contract Company' textfield is greyed out and auto populated based on the Contract selected
Then  User selects the 'Contract Inactive' in the Add Customer Corporate Contract page
Then  User selects the 'Check Frequency' in the Add Customer Corporate Contract page
Then  User selects the 'Start Date' in the Add Customer Corporate Contract page
Then  User selects the 'End Date' in the Add Customer Corporate Contract page
Then  User selects the 'Actual End Date' in the Add Customer Corporate Contract page
Then  User selects the 'Contract Agreed' in the Add Customer Corporate Contract page
Then  User selects the 'Free Field 1' dropdown in the Add Customer Corporate Contract page
Then  User selects the 'Free Field 2' dropdown in the Add Customer Corporate Contract page.
Then  User enters the 'Free Text 1' in the Add Customer Corporate Contract page
Then  User enters the 'Free Text 2' in the Add Customer Corporate Contract page.
Then  User clicks on the save button and verifies the Add Customer Corporate Contract page record is saved without any errors
Then  User edits the record and clicks on save button and verifies the Add Customer Corporate Contract page record is saved without any errors




@RCS_SaaS_Same_Contract_Adding_WC
Scenario: RCS_SaaS_Same_Contract_Adding_WC
Then  User adds the Corporate Contract for the same Start & End Date which is already associated to the Customer
And   User verifies the system displaying a prompt error message 'Contract & Start Date should be identical'




@RCS_SaaS_Contract_Deletion_WC
Scenario: RCS_SaaS_Contract_Deletion_WC
Then  User selects a Contract record & clicks on the Delete icon
Then  User verifies the selected Contract cannot be deleted if it is locked
Then  User verifies the selected Contract record is deleted successfully if it is not locked




@RCS_SaaS_Discretionary_Contracts_WC
Scenario: RCS_SaaS_Discretionary_Contracts_WC
Then  User clicks on the 'Add Discretionary Contract' button and navigates to the 'Add Customer Discretionary Contract' page
Then  User enters the 'Contract Name' in the Add Customer Discretionary Contract page
Then  User verifies the 'Contract Type' is greyed out & auto populated to discretionary
Then  User selects the 'Contract Company' in the Add Customer Discretionary Contract page
Then  User selects the 'Contract Inactive' in the Add Customer Discretionary Contract page
Then  User selects the 'Check Frequency' in the Add Customer Discretionary Contract page
Then  User selects the 'Start Date' in the Add Customer Discretionary Contract page
Then  User selects the 'End Date' in the Add Customer Discretionary Contract page
Then  User selects the 'Actual End Date' in the Add Customer Discretionary Contract page
Then  User selects the 'Contract Agreed' in the Add Customer Discretionary Contract page
Then  User selects the 'Free Field 1' dropdown in the Add Customer Discretionary Contract page
Then  User selects the 'Free Field 2' dropdown in the Add Customer Discretionary Contract page.
Then  User enters the 'Free Text 1' in the Add Customer Discretionary Contract page
Then  User enters the 'Free Text 2' in the Add Customer Discretionary Contract page.
Then  User clicks on the save button and verifies the Add Customer Discretionary Contract page record is saved without any errors
Then  User edits the record and clicks on save button and verifies the Add Customer Discretionary Contract page record is saved without any errors




@RCS_SaaS_Add_Driver_Discretionary_WC
Scenario: RCS_SaaS_Add_Driver_Discretionary_WC
Then  User clicks on the ADD DRIVER button in the Driver section & enters the data in all fields. 
Then  User clicks on the save button & verifies the record is saved without any errors in the Add Customer Driver Details screen
And   User verifies the Trade Payment cannot be created for a Discretionary contract




@RCS_SaaS_Contract_Validation_WC
Scenario: RCS_SaaS_Contract_Validation_WC
Then  User creates a Discretionary contract for the same Start & End Date & saves the record
And   User verifies the system displaying a prompt error message 'End Date and Start Date are same. Please enter valid dates'
Then  User creates a driver for the same Start & End Date & saves the record
And   User verifies the system displaying a prompt error message 'End Date and Start Date are same. Please enter valid dates'.




@RCS_SaaS_Delete_Driver_Contract_WC
Scenario: RCS_SaaS_Delete_Driver_Contract_WC
Then  User selects a Driver record & clicks on the Delete icon
And   User verifies the selected Driver record is deleted successfully.




@RCS_SaaS_Discretionary_Contract_Deletion_WC
Scenario: RCS_SaaS_Discretionary_Contract_Deletion_WC
Then  User selects a Discretionary Contract record & clicks on the Delete icon
And   User verifies the selected Discretionary Contract record is deleted successfully.




@RCS_SaaS_Add_Territory_WC
Scenario: RCS_SaaS_Add_Territory_WC
Then  User clicks on the 'Territory' tab and navigates to the Territory screen
Then  User clicks on the Add button and navigates to the Add Customer Territory page
Then  User selects the 'Trade Approach' which displays all the Trade Approaches available in the application
Then  User enters the 'Visit Frequency'
Then  User enters the 'Call Rate'
Then  User selects the 'Free Field 01' in the Add Customer Territory page
Then  User selects the 'Free Field 02' in the Add Customer Territory page.
Then  User enters the 'Free Text Field 1' in the Add Customer Territory page
Then  User enters the 'Free Text Field 2' in the Add Customer Territory page.
Then  User selects the 'Territory Name' which displays all the Territories available in the application
Then  User clicks on the save button and verifies the Territory record is saved without any errors
Then  User clicks on the 'Territory Name' edits the record and clicks on the save button
And   User verifies the record is edited & saved without any errors.




@RCS_SaaS_Territory_Validation_WC
Scenario: RCS_SaaS_Territory_Validation_WC
Then  User adds a Territory & assign the same Customer to the same Trade Approach and saves the record
And   User verifies the system displaying a error message as 'Selected Trade Approach already exists for this customer'




@RCS_SaaS_Copy_Territory_WC
Scenario: RCS_SaaS_Copy_Territory_WC
Then  User clicks on the Copy Territory icon in front of the Territory Name field for the record to be copied
And   User verifies the 'Copy Customer Territory' page is displayed
Then  User edits the record and clicks on the save button
Then  User verifies the New Territory Record is edited & saved without any errors.




@RCS_SaaS_Territory_Deletion_WC
Scenario: RCS_SaaS_Territory_Deletion_WC
Then  User selects a Territory record & clicks on the Delete icon.
Then  User verifies the selected Territory record is deleted successfully.




@RCS_SaaS_Group_Messages_WC
Scenario: RCS_SaaS_Group_Messages_WC
Then  User clicks on the 'Group Messages' tab and and navigates to the Group Messages screen
And   User verifies that all the Group messages assigned to the Customer is displayed successfully




@RCS_SaaS_Service_Request_WC
Scenario: RCS_SaaS_Service_Request_WC
Then  User clicks on the 'Service Request' tab and navigates to the Service Request screen
Then  User verifies all the Service Request header & details assigned to the Customer displayed successfully




@RCS_SaaS_Add_Service_Request_WC
Scenario: RCS_SaaS_Add_Service_Request_WC
Then  User clicks on the 'Add Service Request' tab and navigates to the Add Service Request page
Then  User verifies the 'Creation Date' defaulted to the current date & the textfield is greyed out
Then  User verifies the 'Status' defaulted to 'Open' and the textfield is disabled
Then  User selects the 'Category' in the service request page
Then  User selects the 'Item' in the service request page
Then  User verifies the 'Cost' textfield is greyed out and Auto populates the value after selecting the Merchandise Type
Then  User selects the 'Action' in the service request page
Then  User enters the 'Description' in the service request page
Then  User selects the 'Required Date' in the service request page
Then  User clicks on the save button and verifies the service request record is saved without any errors
Then  User clicks on the 'Service Request Name' & edits the record & clicks on the save button
And   User verifies the 'Service Request' record is edited and saved without errors.




@RCS_SaaS_Add_Notes_WC
Scenario: RCS_SaaS_Add_Notes_WC
Then  User clicks on the 'Add Notes' button and navigates to the 'Add Service Request Notes' page
Then  User verifies the 'Note Date' defaulted to the current date & the textfield is greyed out 
Then  User verifies the 'User Name' textfield displays the 'User name' who creates the notes & the textfield is greyed out 
Then  User enters the 'Notes' in the Add Service Request Notes page
Then  User selects the 'Free Field 1' in the Add Service Request Notes page
Then  User selects the 'Free Field 2' in the Add Service Request Notes page.
Then  User enters the 'Free Text 1' in the Add Service Request Notes page
Then  User enters the 'Free Text 2' in the Add Service Request Notes page.
Then  User clicks on the save button and verifies the Add Service Request Notes record is saved without any errors
Then  User clicks on the 'Notes Name' & edits the record & clicks on the save button
And   User verifies the 'Service Request Notes' record is edited and saved without errors.
Then  User clicks on the Delete icon & Deletes the Notes record.
And   User verifies the Notes record is deleted without any errors.




@RCS_SaaS_Service_Request_Deletion_WC
Scenario: RCS_SaaS_Service_Request_Deletion_WC
Then  User selects an Service Request record & clicks on the Delete icon
And   User verifies the selected Service Request record is deleted successfully.




@RCS_SaaS_Customer_Sales_Target_WC
Scenario: RCS_SaaS_Customer_Sales_Target_WC
Then  User clicks on the 'Customer Sales Target' tab and navigates to the 'Customer Sales Target' screen
Then  User clicks on the 'Add Sales Target' button and navigates to the Add Sales Target page
Then  User selects the 'Product Name' which displays all the SKU which are part of Depot Assortment Plan
Then  User enters the 'Target' in the Customer Sales Target page
Then  User selects the 'Start Date' in the Customer Sales Target page
Then  User selects the 'End Date' in the Customer Sales Target page
Then  User verifies the 'Achieved' textfield is greyed out
Then  User verifies the '% Achieved' textfield is greyed out
Then  User verifies the 'Remaining - Volume' textfield is greyed out
Then  User enters the 'Remarks' in the Customer Sales Target page
Then  User selects the 'Free Field 1' in the Customer Sales Target page
Then  User selects the 'Free Field 2' in the Customer Sales Target page.
Then  User enters the 'Free Text 1' in the Customer Sales Target page
Then  User enters the 'Free Text 2' in the Customer Sales Target page.
Then  User clicks on the save button and verifies the Customer Sales Target record is saved without any errors
Then  User clicks on the 'Product Name' & edits the record & clicks on the save button
And   User verifies the 'Customer Sales Target' record is edited and saved without any errors.
Then  User Tries to add the SKU which is already part of the list for the same date range
And   User verifies that the system displays a error message as 'Sales Target dates overlapping for the SKU'.




@RCS_SaaS_Customer_Sales_Target_SKU_Deletion_WC
Scenario: RCS_SaaS_Customer_Sales_Target_SKU_Deletion_WC
Then  User selects a SKU record & clicks on the Delete icon.
Then  User verifies that the selected SKU record is deleted successfully




