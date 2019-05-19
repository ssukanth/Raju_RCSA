@NewUser
Feature: RCS SaaS Configuration_WC features


@RCS_SaaS_Verify_New_User_WC
Scenario: RCS_SaaS_Verify_New_User_WC
Given User enters the URL which was received through mail  
Then  User enters the User name and password which was received through mail & clicks on the Login button
Then  User navigates to the welcome screen & verifies the message is displayed as 'You password has expired Click here to change your password'
Then  User clicks on the link & navigates to the Change Password screen      
Then  User verifies that the 'User name' is auto populated
Then  User enters the Old Password which was received through mail   
Then  User enters the New Password and Confirms the New Password fields     
And   User clicks on save button & verifies that the new user details is saved successfully 
Then  User verifies that the 'Welcome to RCS8 Data Entry Module' screen is displayed successfully
Then  User enters the valid URL and enters the newly created Username and Password & then clicks on Login
Then  User verifies that the 'Welcome to RCS8 Data Entry Module' screen is displayed successfully.       