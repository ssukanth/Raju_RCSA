#Comment the baselines

@MaliciousFileUploadPossible
Feature: RCS SaaS MaliciousFileUploadPossible_WC features



@Attachment
Scenario: Attachment
Given Login to the WebClient
When  User Provides the valid Admin credentials
Then  The User should be successfully logged into the Application
Then  User searches for the customer in the search screen
Then  User navigates to the Data entry module & verifies the data entry screen is displayed successfully
Then  User verifies the following tabs are available in the data entry screen - Profile, Address, Attachments, Contacts, Outlet Times, Assessments
Then  User verifies the following tabs are available in the data entry screen - Suppliers, Merchandising, Retail Audit, Contract, Territory, Sales
Then  User verifies the following tabs are available in the data entry screen - FOC Orders, Planogram, Group Messages, Service Requests, Customer Sales Target




@UploadingFile
Scenario: UploadingFile
Then  User clicks on the 'Attachments' tab & verifies the attachment screen is displayed successfully
Then  User clicks on the 'Add Attachment' button & verifies the Uploading files is done through Add attachment button
Then  User verifies validation filters should be enabled in order to avoid undesired  files uploaded to the server
And   User verifies the files which are about to get uploaded should be scanned with the anti-virus to avoid malicious files uploading to the server
Then  User verifies the file upload size should be limited to 1MB and the file types supported should be excel, pdf and word.

