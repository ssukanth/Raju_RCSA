@DistributorsImports
Feature: RCS SaaS Distributors_Imports_WC features


@RCS_SaaS_Distributors_Imports_WC
Scenario: RCS_SaaS_Distributors_Imports_WC
Given Login to the WebClient
When  User Provides the valid depo user credentials
Then  The User should be successfully logged into the Application
Then  User verifies the Pre-requisite 1 - SLO header and details template is created with data
Then  User verifies the Pre-requisite 1 - SRO header and details template is created with data
Then  User clicks on the 'Distributors' tab
Then  User selects the 'Imports' tab and navigates to the imports screen
Then  User selects the 'SLO header and details' import type from the dropdown
And   User imports the file which is created with the SLO header and details template & verifies the import is successful
Then  User selects the 'SRO header and details' import type from the dropdown
And   User imports the file which is created with the SRO header and details template & verifies the import is successful.