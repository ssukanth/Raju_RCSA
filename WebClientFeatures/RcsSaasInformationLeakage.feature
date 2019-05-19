#Comment the baselines

@InformationLeakage
Feature: RCS SaaS InformationLeakage_WC features



@WC_URL_Verification
Scenario: WC_URL_Verification
Given User enters the WC URL
Then  User verifies the WC URL is entered successfully
Then  User replaces the RCS URL with some other words 
And   User verifies the changes were updated successfully in the URL
Then  User clicks on the enter button from the keyboard 
And   User verifies the error message is displayed saying that this is not a valid application URL.




@Error_Message_Verification
Scenario: Error_Message_Verification
Then  User verifies a error message like 'Error 404: Not found :( I have no idea where that file is, sorry. Are you sure you typed in the correct URL?' should be displayed on the screen
Then  User also verifies that any information related to application internal server should not be displayed on the screen.