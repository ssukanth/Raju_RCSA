#Comment the baselines

@OutdatedSoftwareApp03_Part1
Feature: RCS SaaS OutdatedSoftwareApp03_Part1_WC features



@Tomcat_Server_Version_Verification
Scenario: Tomcat_Server_Version_Verification
Given User enters the latest WC URL
Then  User verifies the RCS8 WC application login page is displayed successfully
Then  User removes the extra characters from the WC url & updates the url to 'https://rcswhmuat.rcsoncloud.com'
Then  User clicks on the enter button from the keyboard
Then  User verifies the 'Welcome to RCS SaaS' Message is displayed with a 'ReCaptcha' text icon to be selected to verify if your not a robot
Then  Once the 'Captcha' verification is completed, then user verifies the 'Error 404: Not found :( I have no idea where that file is, sorry. Are you sure you typed in the correct URL?' error Message is displayed.
And   User verifies the application is upgraded with latest tomcat version '9.0.14'.