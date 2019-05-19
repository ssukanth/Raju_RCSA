$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("RcsSaasMMPDefaultPayment.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#MMP Export sheet should be updated Manually \u0026 Run the Automation script"
    }
  ],
  "line": 4,
  "name": "RCS SaaS MMP_Default_Payment_WC features",
  "description": "",
  "id": "rcs-saas-mmp-default-payment-wc-features",
  "keyword": "Feature",
  "tags": [
    {
      "line": 3,
      "name": "@MMPDefaultPayment"
    }
  ]
});
formatter.scenario({
  "line": 9,
  "name": "Preferred_Payment_Method",
  "description": "",
  "id": "rcs-saas-mmp-default-payment-wc-features;preferred-payment-method",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@Preferred_Payment_Method"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "Login to the WebClient",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User Provides the valid Admin credentials",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "The User should be successfully logged into the Application",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User clicks on Configuration",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "The User should be navigated to configuration screen successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "User navigates to the \u0027LOV\u0027 tab \u0026 selects the LOV type as \u0027User\u0027",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "User verifies when the Set Code for the LOV is entered as \u0027PPM\u0027 then the Set Name is displayed as \u0027Preferred Payment Method\u0027.",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User clicks on the set code \u0027PPM\u0027",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "User verifies the following values are defined under the new LOV - Cash, Cheque, MMP, EFT",
  "keyword": "And "
});
formatter.match({
  "location": "RcsSaasConfigurationUsersPage.i_Login_to_the_WC()"
});
formatter.result({
  "duration": 454749789,
  "status": "passed"
});
formatter.match({
  "location": "RcsSaasConfigurationUsersPage.i_provide_valid_Admin_credentials()"
});
formatter.result({
  "duration": 87040,
  "status": "passed"
});
formatter.match({
  "location": "RcsSaasConfigurationUsersPage.the_User_should_be_successfully_logged_into_the_Application()"
});
formatter.result({
  "duration": 89600,
  "status": "passed"
});
formatter.match({
  "location": "RcsSaasConfigurationUsersPage.i_Click_on_Configiuration()"
});
formatter.result({
  "duration": 2487652944,
  "status": "passed"
});
formatter.match({
  "location": "RcsSaasConfigurationUsersPage.the_User_should_be_navigated_to_configuration_screen_successfully()"
});
formatter.result({
  "duration": 78933,
  "status": "passed"
});
formatter.match({
  "location": "RcsSaasPreferredPaymentMethodPage.user_navigates_to_the_LOV_tab_selects_the_LOV_type_as_User()"
});
formatter.result({
  "duration": 7242717142,
  "status": "passed"
});
formatter.match({
  "location": "RcsSaasPreferredPaymentMethodPage.user_verifies_when_the_Set_Code_for_the_LOV_is_entered_as_PPM_then_the_Set_Name_is_displayed_as_Preferred_Payment_Method()"
});
formatter.result({
  "duration": 6347757468,
  "status": "passed"
});
formatter.match({
  "location": "RcsSaasPreferredPaymentMethodPage.user_clicks_on_the_set_code_PPM()"
});
formatter.result({
  "duration": 3936704189,
  "status": "passed"
});
formatter.match({
  "location": "RcsSaasPreferredPaymentMethodPage.user_verifies_the_following_values_are_defined_under_the_new_LOV_Cash_Cheque_MMP_EFT()"
});
formatter.result({
  "duration": 24338059364,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Verify_Preferred_Payment_Method",
  "description": "",
  "id": "rcs-saas-mmp-default-payment-wc-features;verify-preferred-payment-method",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 23,
      "name": "@Verify_Preferred_Payment_Method"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "User clicks on the Data Entry \u0026 selects any available customer where Customer type \u003d Outlet \u0026 navigates to the profile tab",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "User navigates to the \u0027Trading Terms\u0027 section",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "User verifies the dropdown field named \u0027Preferred Payment Mode\u0027 is displayed",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "User selects the Collection Type as \u0027Cash\u0027 \u0026 verifies the Preferred Payment Mode dropdown field auto-populates the following values as \u0027Cash\u0027 \u0026 \u0027MMP\u0027",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "User selects the Collection Type as \u0027Cheque\u0027 only \u0026 verifies the Preferred Payment Mode dropdown field auto-populates the following value as \u0027Cheque\u0027",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "User selects the Collection Type as \u0027Cash \u0026 Cheque\u0027 \u0026 verifies the Preferred Payment Mode dropdown field auto-populates the following values as \u0027Cash\u0027, \u0027Cheque\u0027 \u0026 \u0027MMP\u0027",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "User selects the Collection Type as \u0027Deferred Cheque\u0027 \u0026 verifies the Preferred Payment Mode dropdown field auto-populates the following values as \u0027Cash\u0027, \u0027Cheque\u0027, \u0027MMP\u0027 \u0026 \u0027EFT\u0027.",
  "keyword": "Then "
});
formatter.match({
  "location": "RcsSaasPreferredPaymentMethodPage.user_clicks_on_the_Data_Entry_selects_any_available_customer_where_Customer_type_Outlet_navigates_to_the_profile_tab()"
});
formatter.result({
  "duration": 10096486965,
  "status": "passed"
});
formatter.match({
  "location": "RcsSaasPreferredPaymentMethodPage.user_navigates_to_the_Trading_Terms_section()"
});
formatter.result({
  "duration": 1159455524,
  "status": "passed"
});
formatter.match({
  "location": "RcsSaasPreferredPaymentMethodPage.user_verifies_the_dropdown_field_named_Preferred_Payment_Mode_is_displayed()"
});
formatter.result({
  "duration": 101003645,
  "status": "passed"
});
formatter.match({
  "location": "RcsSaasPreferredPaymentMethodPage.user_selects_the_Collection_Type_as_Cash_verifies_the_Preferred_Payment_Mode_dropdown_field_auto_populates_the_following_values_as_Cash_MMP()"
});
formatter.result({
  "duration": 7714142293,
  "status": "passed"
});
formatter.match({
  "location": "RcsSaasPreferredPaymentMethodPage.user_selects_the_Collection_Type_as_Cheque_only_verifies_the_Preferred_Payment_Mode_dropdown_field_auto_populates_the_following_value_as_Cheque()"
});
formatter.result({
  "duration": 6384524931,
  "status": "passed"
});
formatter.match({
  "location": "RcsSaasPreferredPaymentMethodPage.user_selects_the_Collection_Type_as_Cash_Cheque_verifies_the_Preferred_Payment_Mode_dropdown_field_auto_populates_the_following_values_as_Cash_Cheque_MMP()"
});
formatter.result({
  "duration": 6441145136,
  "status": "passed"
});
formatter.match({
  "location": "RcsSaasPreferredPaymentMethodPage.user_selects_the_Collection_Type_as_Deferred_Cheque_verifies_the_Preferred_Payment_Mode_dropdown_field_auto_populates_the_following_values_as_Cash_Cheque_MMP_EFT()"
});
formatter.result({
  "duration": 6497497394,
  "status": "passed"
});
formatter.scenario({
  "line": 37,
  "name": "Preferred_Payment_Method_Export",
  "description": "",
  "id": "rcs-saas-mmp-default-payment-wc-features;preferred-payment-method-export",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 36,
      "name": "@Preferred_Payment_Method_Export"
    }
  ]
});
formatter.step({
  "line": 38,
  "name": "User clicks on the \u0027Data Entry\u0027 tab",
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "User clicks on the \u0027Export Trading Term Data\u0027 button",
  "keyword": "Then "
});
formatter.step({
  "line": 40,
  "name": "User verifies the \u0027Export Trading Term Data\u0027 is downloaded successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 41,
  "name": "User verifies the \u0027Preferred Payment Method\u0027 column is added to the right of the \u0027Payment Method\u0027 Column in the Export file.",
  "keyword": "And "
});
formatter.match({
  "location": "RcsSaasPreferredPaymentMethodPage.user_clicks_on_the_Data_Entry_tab()"
});
formatter.result({
  "duration": 60718741747,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d73.0.3683.103)\n  (Driver info: chromedriver\u003d2.36.540470 (e522d04694c7ebea4ba8821272dbef4f9b818c91),platform\u003dWindows NT 10.0.16299 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 19 milliseconds\nBuild info: version: \u00272.53.0\u0027, revision: \u002735ae25b1534ae328c771e0856c93e187490ca824\u0027, time: \u00272016-03-15 10:43:46\u0027\nSystem info: host: \u0027BLRTRIFWN30955\u0027, ip: \u002710.6.139.239\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.36.540470 (e522d04694c7ebea4ba8821272dbef4f9b818c91), userDataDir\u003dC:\\Users\\30955\\AppData\\Local\\Temp\\scoped_dir14112_18324}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d73.0.3683.103, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dfalse, acceptInsecureCerts\u003dfalse, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: f01c85ebe467433dace534979661289f\n*** Element info: {Using\u003dcss selector, value\u003ddiv:nth-child(2) [role\u003d\u0027tabpanel\u0027] tr:nth-child(1) [type\u003d\u0027text\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByCssSelector(RemoteWebDriver.java:492)\r\n\tat org.openqa.selenium.By$ByCssSelector.findElement(By.java:430)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat com.infotech.basepage.PageObjects.SelectByCSSSelectorWithSendKeys(PageObjects.java:216)\r\n\tat com.infotech.wc.ui.testscripts.RcsSaasNewOutletCreationPage.user_enters_Customer_name_in_the_Customer_Name_text_box(RcsSaasNewOutletCreationPage.java:120)\r\n\tat com.infotech.wc.ui.testscripts.RcsSaasConfigurationContractPage.user_enters_the_customer_number(RcsSaasConfigurationContractPage.java:615)\r\n\tat com.infotech.wc.ui.testscripts.RcsSaasPreferredPaymentMethodPage.user_clicks_on_the_Data_Entry_tab(RcsSaasPreferredPaymentMethodPage.java:636)\r\n\tat ✽.Then User clicks on the \u0027Data Entry\u0027 tab(RcsSaasMMPDefaultPayment.feature:38)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "RcsSaasPreferredPaymentMethodPage.user_clicks_on_the_Export_Trading_Term_Data_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "RcsSaasPreferredPaymentMethodPage.user_verifies_the_Export_Trading_Term_Data_is_downloaded_successfully()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "RcsSaasPreferredPaymentMethodPage.user_verifies_the_Preferred_Payment_Method_column_is_added_to_the_right_of_the_Payment_Method_Column_in_the_Export_file()"
});
formatter.result({
  "status": "skipped"
});
});