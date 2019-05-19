#Comment the baselines

@AdministrationConsoleAccessible
Feature: RCS SaaS AdministrationConsoleAccessible_WC features



@VerifyAdministrationConsole
Scenario: VerifyAdministrationConsole
Given User enters the following WC URL - https://rcswhmuat.rcsoncloud.com/manager
Then  User verifies the WC url is entered successfully
Then  User verifies administration console running on the web server is not accessible. 