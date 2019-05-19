@ConfigurationDistributors
Feature: RCS SaaS Configuration_Distributors_WC features



@RCS_SaaS_Add_Distributors_WC
Scenario: RCS_SaaS_Add_Distributors_WC
Given Login to the WebClient
When  User Provides the valid Admin credentials
Then  The User should be successfully logged into the Application
Then  User clicks on Configuration 
Then  The User should be navigated to configuration screen successfully
Then  User clicks on Distributors and navigates to Distributors Screen
Then  User clicks on the 'Add' button and Add Distributor screen should get displayed successfully
Then  User enters the 'Name' in the Distributor screen
Then  User enters the Address Line 1 in the Distributor screen
Then  User enters the Address Line 2 in the Distributor screen.
Then  User enters the 'City' in the Distributor screen
Then  User enters the 'Telephone No.' in the Distributor screen
Then  User enters the 'Mobile No.' in the Distributor screen
Then  User enters the 'Fax' in the Distributor screen
Then  User enters the 'VAT' in the Distributor screen
Then  User enters the 'PIN' in the Distributor screen
Then  User enters the 'E-Mail ID' in the Distributor screen
Then  User enters the Free Text 1 in the Distributor screen
Then  User enters the Free Text 2 in the Distributor screen.
And   User clicks on save button and verifies the New Distributor record is created successfully.




@RCS_SaaS_Create_Distributors_WC
Scenario: RCS_SaaS_Create_Distributors_WC
Then  User creates the Multiple Distributors with the name which already exists in Distributor List & saves it.
And   User verifies that the system displaying a error message as 'Distributor name already exists. Please enter another name'




@RCS_SaaS_Delete_Distributors_WC
Scenario: RCS_SaaS_Delete_Distributors_WC
Then  User Deletes the Distributor record by clicking on the Delete icon in front of the Distributor Name
Then  User verifies that the selected Distributor record is deleted successfully.


