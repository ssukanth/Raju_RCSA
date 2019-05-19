#Run @AssortmentPlan_CustomerGroup

@DiscountPlan
Feature: RCS SaaS Configuration_Discount_Plan_WC features




@RCS_SaaS_Configuration_Discount_Plan_WC
Scenario: RCS_SaaS_Configuration_Discount_Plan_WC
Given Login to the WebClient
When  User Provides the valid Admin credentials
Then  The User should be successfully logged into the Application
Then  User clicks on Configuration 
Then  The User should be navigated to configuration screen successfully
Then  User clicks on the Discount Plan and navigates to the Discount Plan screen
Then  User verifies the Discount Plan list section is available in Discount Plan screen
Then  User verifies the Discount Rules section is available in Discount Plan screen
Then  User verifies the Customer Groups section is available in Discount Plan screen




@RCS_SaaS_Creation_of_Discount_Plan
Scenario: RCS_SaaS_Creation_of_Discount_Plan
Then  In the Discount Plan section user navigates to Add/Create a new Discount Plan by clicking on the 'Create Discount Plan' Button
And   The Create Discount Plan page should be opened successfully
Then  User enters the 'NAME' - Discount Plan Name should be Unique
Then  User enters the 'CODE'
Then  User enters the 'Description'
Then  User selects the 'Status' dropdown - By default, DRAFT should be populated while creation
Then  User selects 'Start date' for Discount Plan
Then  User selects 'End date' for Discount Plan
And   User clicks on save button and verifies the New Discount Plan is created with all the required fields populated, One discount plan should be associated only one discount Group




@RCS_SaaS_Start_End_Date_Modification
Scenario: RCS_SaaS_Start_End_Date_Modification
Then  User searches for the New Discount Plan created and opens the link
And   User tries to modify the Start and End Dates of the Discount Group
And   User ensures that there is no overlapping period with other Discount Plans associated to the Customer Groups




@RCS_SaaS_Adding_Discount_Rules_Category_Order
Scenario: RCS_SaaS_Adding_Discount_Rules_Category_Order
Then  In the Discount Plan section user navigates to Discount Rules section, and clicks on 'Add' button
And   The Add Rule Details page should be opened successfully
Then  User selects the 'Category' dropdown - By default, 'ORDER' should be displayed else user can select 'Category' as 'SKU'
Then  User selects the 'Rule Base' dropdown - By default, QUANTITY should be displayed else user can select 'Value' 
Then  User selects the 'TCI Bucket' dropdown - used to specify the cost centre code for the Discount rule
Then  User enters the 'Rule Description'
Then  User clicks on next button
Then  User enters the 'MIN' value to avail the discount - Min value should be greater than value '0'
Then  User enters the 'MAX' value to avail the discount - Max value should be greater than 'Min' Value
Then  User clicks on next button
Then  If 'Category' is 'ORDER' then user can select the 'Offer Type' as 'Percent/Value'
And   If 'Category' is 'SKU' then user can select the 'Offer Type' as 'Percent/Value/FPIT/FPET' 
Then  User enters the 'Offer Value' - if 'Offer Type' is 'Value'
And   User selects 'Compn sku' and enters the 'Compn Qty' - if 'Offer Type' is 'FPET/FPIT'	 
Then  User verifies if Offer type is selected as 'Percent' then 'Calc Base' is defaulted to 'Flat'
Then  User verifies if Offer type is selected as 'Value' then 'Calc Base' dropdown is displayed with default value as 'Flat'
And   User verifies if 'Calc Base' is selected as 'Threshold' then user enters the 'Threshold' value - Threshold value should be greater than '0'
Then  User verifies if 'Calc base' is selected as 'Flat' CAP is not applicable else user enters the 'CAP' value if 'Calc base' is selected as 'Threshold' 
Then  User selects 'Rep Decide' checkbox - If it is Set to 'TRUE' then Rep can decide whether the Discount has to be applied for the respective customer or not
Then  User selects 'Apply once' checkbox - 'Apply once' checkbox should be applied only once for the targeted
Then  User verifies 'CAP for Period' checkbox is enabled/disabled - selects if checkbox is enabled 
Then  User selects 'Start Date' range for the discount rule
Then  User selects 'End Date' range for the discount rule
Then  User selects the 'Status' for the discount rule
Then  User clicks on save button and all the Discount rules should be saved successfully
And   User verifies if 'Rule Base' dropdown is selected as 'Value' then Offer type cannot be selected as 'Percent' - error message displays




@RCS_SaaS_Adding_Discount_Rules_Category_Customer_group
Scenario: RCS_SaaS_Adding_Discount_Rules_Category_Customer_group
Then  User clicks on the Customer Group and navigates to the Customer Group screen
Then  User selects the 'Group Settings' and clicks on the add button
Then  User enters all the mandatory fields for customer group and clicks on save button
Then  User clicks on add button in the 'Customer Group' section
Then  User searches for the customer and adds the selected customer to the 'Customer Group'
Then  User clicks on 'Associate Discount Plan' and selects the 'Discount Plan' 
And   User clicks on save button and the Customer Group association should be added successfully
Then  User navigates to search screen and searches for the customer
Then  User navigates to the 'Trading Terms' tab and verifies the 'Discount Plan field' displayed.




@RCS_SaaS_Adding_Discount_Rules_Category_Customer_group_Duplicate
Scenario: RCS_SaaS_Adding_Discount_Rules_Category_Customer_group_Duplicate
Then  User clicks on the Customer Group and navigates to the Customer Group screen
Then  User tries to add one more Discount Plan which has the same Date range
Then  User navigates to the 'Customer Group' screen and clicks on 'Associate Discount Plan' and selects the 'Discount Plan' of same date range 
And   when user tries to save the 'Associate Discount Plan' system should throw the error message as "Given Date Range Already Exist".




@RCS_SaaS_Copy_Discount_Plan
Scenario: RCS_SaaS_Copy_Discount_Plan
Then  User clicks on the Discount Plan and navigates to the Discount Plan screen
Then  In the Discount Plan section user navigates to Create a new Discount Plan by Clicking on 'Copy Discount Plan' button
And   User verifies a copy of the selected Discount Plan with all the Rules will be displayed
Then  User specifies the values for all mandatory fields for the New Discount plan
And   User verifies that Discount Plan header Details will not be copied in the 'Copy Discount Plan' screen.




@RCS_SaaS_Copy_Discount_Rule
Scenario: RCS_SaaS_Copy_Discount_Rule
Then  User clicks on the Discount Plan and navigates to the Discount Plan screen
Then  In the Discount Plan section user navigates to Create a new Discount rule by Clicking on 'Copy Discount Rule'
And   User selects a 'Discount Rule' for which the Copy of the selected Discount rule should be created
Then  User specifies the required values for the New Discount rule which is created through 'Copy Discount Rule'
And   User verifies that 'Min' and 'Max' values not copied through 'Copy Discount Rule'




@RCS_SaaS_Discount_Plan_Group_Name
Scenario: RCS_SaaS_Discount_Plan_Group_Name
Then  User clicks on the Discount Plan and navigates to the Discount Plan screen
And   User verifies the 'Group Name' field in 'Customer Group' section is a Hyperlink
Then  User clicks on the hyperlink and navigates to Customer group details screen
Then  User should be able to add/delete the customers in the group.



