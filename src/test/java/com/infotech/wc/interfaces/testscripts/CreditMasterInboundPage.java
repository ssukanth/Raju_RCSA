package com.infotech.wc.interfaces.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.infotech.Excel.ExcelApiFile;
import com.infotech.basepage.CallObject;
import com.infotech.basepage.LocatorsPath;
import com.infotech.basepage.PageObjects;
import com.infotech.testrunner.TestRunnerWebClient;
import com.infotech.wc.ui.testscripts.RcsSaasNewOutletCreationPage;

import cucumber.api.java.en.Then;

public class CreditMasterInboundPage extends TestRunnerWebClient{
	
	public CreditMasterInboundPage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
	ExcelApiFile file4 = new ExcelApiFile("TestData4.xlsx");
	ExcelApiFile file = new ExcelApiFile("TestData.xlsx");
	WebDriverWait wait = new WebDriverWait(driver, LocatorsPath.MAX_TIME);
	Actions actions = new Actions(driver);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	RcsSaasNewOutletCreationPage newOutletCreationPage = new RcsSaasNewOutletCreationPage();
	CustomerMasterInboundPage masterInboundPage = new CustomerMasterInboundPage();
	
	
	
	
	/**----------------------1184_ECC_Mandatory_Fields_Validation--------------------------**/
	
	
	
	
	@Then("^User provides the valid 'Credit Master Inbound' link in the Request URL field$")
	public void user_provides_the_valid_Credit_Master_Inbound_link_in_the_Request_URL_field() throws Throwable {
	    
		System.out.println("Attempt: provide the valid 'Credit Master Inbound' "
				+ "link in the Request URL field");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.CREDIT_MASTER_URL, LocatorsPath.MAX_TIME, 
				file4.getCellData("CreditMasterInbound", "Request URL", 2));
		System.out.println("Success: The valid 'Credit Master Inbound' link in the "
				+ "Request URL field provided successfully");
	}
	

	@Then("^User provides the 'Credit Master Inbound XML' under the 'BODY' field$")
	public void user_provides_the_Credit_Master_Inbound_XML_under_the_BODY_field() throws Throwable {
	   
		System.out.println("Attempt: provide the 'Credit Master Inbound XML' "
				+ "under the 'BODY' field");
		try {
			WebElement xml = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.BODY_CONTENT))));
			actions.moveToElement(xml).click().build().perform();
			CallObject.block(2000);
			actions.moveToElement(xml).sendKeys(
					file4.getCellData("CreditMasterInbound", "Body Content", 2)).perform();
		}catch (StaleElementReferenceException StaleElementReferenceException) {
			System.out.println("Trying to recover from stale element" + StaleElementReferenceException);
		}
		System.out.println("Success: The 'Credit Master Inbound XML' under "
				+ "the 'BODY' field provided successsfully");
	}
	

	@Then("^User verifies the mandatory fields for (\\d+) Credit Master Inbound details is entered successfully in the RestClient screen$")
	public void user_verifies_the_mandatory_fields_for_Credit_Master_Inbound_details_is_entered_successfully_in_the_RestClient_screen(int arg1) throws Throwable {
	    
		System.out.println("User verifies the mandatory fields for (\\d+) Credit Master "
				+ "Inbound details is entered successfully in the RestClient screen");
	}
	

	
	
	/**----------------------1184_ECC_Update_CreditMaster--------------------------**/
	
	
	
	
	@Then("^User updates 'Payment Method' as 'Credit' in the Credit Master Inbound XML$")
	public void user_updates_Payment_Method_as_Credit_in_the_Credit_Master_Inbound_XML() throws Throwable {
	    
		System.out.println("User updates 'Payment Method' as 'Credit' in the Credit Master Inbound XML");
	}
	

	@Then("^User updates 'Credit Limit' as '(\\d+)' in the Credit Master Inbound XML$")
	public void user_updates_Credit_Limit_as_in_the_Credit_Master_Inbound_XML(int arg1) throws Throwable {
	   
		System.out.println("User updates 'Credit Limit' as '(\\d+)' in the Credit Master Inbound XML");
	}
	

	@Then("^User updates 'Bad Debt' as 'No' in the Credit Master Inbound XML$")
	public void user_updates_Bad_Debt_as_No_in_the_Credit_Master_Inbound_XML() throws Throwable {
	 
		System.out.println("User updates 'Bad Debt' as 'No' in the Credit Master Inbound XML");
	}
	

	@Then("^User updates 'Payment Central' as 'No' in the Credit Master Inbound XML$")
	public void user_updates_Payment_Central_as_No_in_the_Credit_Master_Inbound_XML() throws Throwable {
	    
		System.out.println("User updates 'Payment Central' as 'No' in the Credit Master Inbound XML");
	}
	

	@Then("^User updates 'Tobacco License Start Date' in the Credit Master Inbound XML$")
	public void user_updates_Tobacco_License_Start_Date_in_the_Credit_Master_Inbound_XML() throws Throwable {
	    
		System.out.println("User updates 'Tobacco License Start Date' in the Credit Master Inbound XML");
	}
	

	@Then("^User updates 'Tobacco License Exp Date' in the Credit Master Inbound XML$")
	public void user_updates_Tobacco_License_Exp_Date_in_the_Credit_Master_Inbound_XML() throws Throwable {
	 
		System.out.println("User updates 'Tobacco License Exp Date' in the Credit Master Inbound XML");
	}
	

	@Then("^User updates 'Contract Start Date' in the Credit Master Inbound XML$")
	public void user_updates_Contract_Start_Date_in_the_Credit_Master_Inbound_XML() throws Throwable {
	 
		System.out.println("User updates 'Contract Start Date' in the Credit Master Inbound XML");
	}
	

	@Then("^User updates 'Contract Exp Date' in the Credit Master Inbound XML$")
	public void user_updates_Contract_Exp_Date_in_the_Credit_Master_Inbound_XML() throws Throwable {
	    
		System.out.println("User updates 'Contract Exp Date' in the Credit Master Inbound XML");
	}
	

	@Then("^User verifies the above following Customer Trading terms details are updated successfully$")
	public void user_verifies_the_above_following_Customer_Trading_terms_details_are_updated_successfully() throws Throwable {
	    
		System.out.println("User verifies the above following Customer Trading terms details are updated successfully");
	}
	

	@Then("^User clicks on the send button in the RestClient & verifies the Credit Master is created successfully in the ECC tool\\.$")
	public void user_clicks_on_the_send_button_in_the_RestClient_verifies_the_Credit_Master_is_created_successfully_in_the_ECC_tool() throws Throwable {
	  
		System.out.println("Attempt: click on the send button in the RestCliet & "
				+ "verify the Credit Master is created successfully in the ECC tool");
		WebElement send = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SEND))));
		if(send.isEnabled()) {
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.SEND, LocatorsPath.MAX_TIME);
			WebElement response = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.RESPONSE_HISTORY))));
			Assert.assertEquals("200", response.getAttribute("title"));
		}else {
			Assert.fail("response is failed, please check the xml content....");
		}
		System.out.println("Success: clicked on the send button in the RestCliet & "
				+ "verified the Credit Master is created successfully in the ECC tool");
	}
	

	
	
	/**----------------------1184_ECC_Verify_Job--------------------------**/
	
	
	
	
	@Then("^User verifies the '(\\d+) Credit Master' job status is updated successfully in the 'Inbound' screen$")
	public void user_verifies_the_Credit_Master_job_status_is_updated_successfully_in_the_Inbound_screen(int arg1) throws Throwable {
	    
		System.out.println("Attempt: verify the Credit Master' job "
				+ "status is updated successfully in the 'Inbound' screen");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.GO, LocatorsPath.MAX_TIME);
		
		WebElement successRow = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SUCCESS_TABLE_ROW))));
		if(successRow.isDisplayed()) {
			WebElement messageID = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.SUCCESS_TABLE))));
			Assert.assertEquals(file4.getCellData("CreditMasterInbound", "MessageID", 2), 
					messageID.getText());
			
			WebElement interfaceName = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.INTERFACE_NAME))));
			Assert.assertEquals("CustomerTradingTermService", interfaceName.getText());
			
			WebElement entityNumber = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.ENTITY_NUMBER))));
			Assert.assertEquals(file4.getCellData("CreditMasterInbound", "Customer No", 2), 
					entityNumber.getText());
		}
		System.out.println("Success: verified the Credit Master' job "
				+ "status is updated successfully in the 'Inbound' screen");
	}
	

	@Then("^User clicks on the 'Search' tab and verifies the search screen is displayed successfully$")
	public void user_clicks_on_the_Search_tab_and_verifies_the_search_screen_is_displayed_successfully() throws Throwable {

		newOutletCreationPage.user_clicks_on_Search_tab();
	}
	

	@Then("^User enters the 'Customer Number' and clicks on the search button & verifies the customer profile screen is displayed$")
	public void user_enters_the_Customer_Number_and_clicks_on_the_search_button_verifies_the_customer_profile_screen_is_displayed() throws Throwable {
	    
		System.out.println("Attempt: enter the 'Customer Number' and click on the "
				+ "search button & verify the customer profile screen is displayed");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.CUSTOMER_NUM, LocatorsPath.MAX_TIME, 
				file4.getCellData("CreditMasterInbound", "Customer No", 2));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.INBOUND_SEARCH, LocatorsPath.MAX_TIME);
		System.out.println("Success: entered the 'Customer Number' and clicked on the "
				+ "search button & verified the customer profile screen is displayed\");");
	}
	

	@Then("^User scrolls down to the 'Customer Trading Terms' section & verifies the 'Customer Trading Terms details' is updated successfully in RCS(\\d+) app\\.$")
	public void user_scrolls_down_to_the_Customer_Trading_Terms_section_verifies_the_Customer_Trading_Terms_details_is_updated_successfully_in_RCS_app(int arg1) throws Throwable {
	 
		System.out.println("Attempt: Scroll down to the 'Customer Trading Terms' section & "
				+ "Verify the 'Customer Trading Terms details' is updated successfully in RCS8 app");
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(
						By.xpath(LocatorsPath.INBOUND_TRADING_TERMS)));
		PageObjects.SelectByXpath(
				driver, LocatorsPath.INBOUND_TRADING_TERMS, LocatorsPath.MAX_TIME);
		
		WebElement paymentMethod = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INBOUND_PAYMENT_METHOD))));
		Select select = new Select(paymentMethod);
		WebElement credit = select.getFirstSelectedOption();
		Assert.assertEquals(file4.getCellData("CreditMasterInbound", "Payment Method", 2), 
				credit.getText());
		
		WebElement creditLimit = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.CREDIT_LIMIT))));
		Assert.assertEquals((int)Double.parseDouble(file4.getCellData("CreditMasterInbound", "Credit Limit", 2)), 
				(int)Double.parseDouble(creditLimit.getAttribute("value")));
		
		WebElement availableLimit = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.AVAILABLE_LIMIT))));
		Assert.assertEquals((int)Double.parseDouble(file4.getCellData("CreditMasterInbound", "Available Credit", 2)), 
				(int)Double.parseDouble(availableLimit.getAttribute("value")));
		System.out.println("Success: Successfully scrolled down to the 'Customer Trading Terms' "
				+ "section & Verified the 'Customer Trading Terms details' in RCS8 app\");");
	}
	
	

	
	/**----------------------1184_ECC_Update_Payment_Method_1--------------------------**/
	
	
	
	
	@Then("^User navigates to the RestClient app$")
	public void user_navigates_to_the_RestClient_app() throws Throwable {
	    
		masterInboundPage.login_to_the_RestClent();
		masterInboundPage.user_verifies_the_RestClient_screen_is_successfully_displayed();
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.RESET, LocatorsPath.MAX_TIME);
		CallObject.block(1000);
		user_provides_the_valid_Credit_Master_Inbound_link_in_the_Request_URL_field();
		masterInboundPage.user_selects_the_request_type_as_POST_in_the_RestClient_screen();
		masterInboundPage.user_selects_the_Content_Type_as_application_xml_under_the_HEADER_field();
	}
	

	@Then("^User updates the 'Credit Limit' as '(\\d+)' in the Credit Master Inbound xml$")
	public void user_updates_the_Credit_Limit_as_in_the_Credit_Master_Inbound_xml(int arg1) throws Throwable {
	   
		System.out.println("Attempt: provide the 'Credit Master Inbound XML' "
				+ "under the 'BODY' field");
		try {
			WebElement xml = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.BODY_CONTENT))));
			actions.moveToElement(xml).click().build().perform();
			CallObject.block(2000);
			actions.moveToElement(xml).sendKeys(
					file4.getCellData("CreditMasterInbound", "Body Content", 3)).perform();
		}catch (StaleElementReferenceException StaleElementReferenceException) {
			System.out.println("Trying to recover from stale element" + StaleElementReferenceException);
		}
		System.out.println("Success: The 'Credit Master Inbound XML' under "
				+ "the 'BODY' field provided successsfully");
	}
	

	@Then("^User updates the 'Payment Method' from 'Credit' to 'Cash' in the Credit Master Inbound xml$")
	public void user_updates_the_Payment_Method_from_Credit_to_Cash_in_the_Credit_Master_Inbound_xml() throws Throwable {
	   
		System.out.println("User updates the 'Payment Method' from 'Credit' to 'Cash' in the Credit Master Inbound xml");
	}
	

	@Then("^User clicks on the send button in the RestClient & verifies the 'Payment Method' is not changed from 'Credit' to 'Cash' if the 'Credit Limit is > (\\d+)' in the RCS(\\d+) app\\.$")
	public void user_clicks_on_the_send_button_in_the_RestClient_verifies_the_Payment_Method_is_not_changed_from_Credit_to_Cash_if_the_Credit_Limit_is_in_the_RCS_app(int arg1, int arg2) throws Throwable {
	    
		user_clicks_on_the_send_button_in_the_RestClient_verifies_the_Credit_Master_is_created_successfully_in_the_ECC_tool();
		masterInboundPage.user_logins_to_the_WC_application_as_admin();
		newOutletCreationPage.user_clicks_on_Search_tab();
		user_enters_the_Customer_Number_and_clicks_on_the_search_button_verifies_the_customer_profile_screen_is_displayed();
		user_scrolls_down_to_the_Customer_Trading_Terms_section_verifies_the_Customer_Trading_Terms_details_is_updated_successfully_in_RCS_app(0);
	}
	

	
	
	/**----------------------1184_ECC_Update_Payment_Method_2--------------------------**/
	
	
	
	
	@Then("^User updates the 'Credit Limit' as '(\\d+)' in the Credit master Inbound xml$")
	public void user_updates_the_Credit_Limit_as_in_the_Credit_master_Inbound_xml(int arg1) throws Throwable {
	    
		System.out.println("Attempt: provide the 'Credit Master Inbound XML' "
				+ "under the 'BODY' field");
		try {
			WebElement xml = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.BODY_CONTENT))));
			actions.moveToElement(xml).click().build().perform();
			CallObject.block(2000);
			actions.moveToElement(xml).sendKeys(
					file4.getCellData("CreditMasterInbound", "Body Content", 4)).perform();
		}catch (StaleElementReferenceException StaleElementReferenceException) {
			System.out.println("Trying to recover from stale element" + StaleElementReferenceException);
		}
		System.out.println("Success: The 'Credit Master Inbound XML' under "
				+ "the 'BODY' field provided successsfully");
	}
	

	@Then("^User clicks on the send button in the RestClient & verifies the 'Payment Method' is changed from 'Credit' to 'Cash' if the 'Credit Limit = (\\d+)' in the RCS(\\d+) app\\.$")
	public void user_clicks_on_the_send_button_in_the_RestClient_verifies_the_Payment_Method_is_changed_from_Credit_to_Cash_if_the_Credit_Limit_in_the_RCS_app(int arg1, int arg2) throws Throwable {
	    
		user_clicks_on_the_send_button_in_the_RestClient_verifies_the_Credit_Master_is_created_successfully_in_the_ECC_tool();
		masterInboundPage.user_logins_to_the_WC_application_as_admin();
		newOutletCreationPage.user_clicks_on_Search_tab();
		user_enters_the_Customer_Number_and_clicks_on_the_search_button_verifies_the_customer_profile_screen_is_displayed();
		
		System.out.println("Attempt: Scroll down to the 'Customer Trading Terms' section & "
				+ "Verify the 'Customer Trading Terms details' is updated successfully in RCS8 app");
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(
						By.xpath(LocatorsPath.INBOUND_TRADING_TERMS)));
		PageObjects.SelectByXpath(
				driver, LocatorsPath.INBOUND_TRADING_TERMS, LocatorsPath.MAX_TIME);
		
		WebElement paymentMethod = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INBOUND_PAYMENT_METHOD))));
		Select select = new Select(paymentMethod);
		WebElement cash = select.getFirstSelectedOption();
		Assert.assertEquals(file4.getCellData("CreditMasterInbound", "Payment Method", 3), 
				cash.getText());
		
		WebElement creditLimit = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.CREDIT_LIMIT))));
		Assert.assertEquals((int)Double.parseDouble(file4.getCellData("CreditMasterInbound", "Credit Limit", 3)), 
				(int)Double.parseDouble(creditLimit.getAttribute("value")));
		
		WebElement availableLimit = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.AVAILABLE_LIMIT))));
		Assert.assertEquals((int)Double.parseDouble(file4.getCellData("CreditMasterInbound", "Available Credit", 3)), 
				(int)Double.parseDouble(availableLimit.getAttribute("value")));
		System.out.println("Success: Successfully scrolled down to the 'Customer Trading Terms' "
				+ "section & Verified the 'Customer Trading Terms details' in RCS8 app\");");
	}
	
	
	public void logOut() throws Exception {
		
		System.out.println("Attempt: User should successfully "
				+ "logout from the web client page");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.LOGOUT, LocatorsPath.MAX_TIME);
        CallObject.switchToAlert(driver);
		System.out.println("Success: Logout successful");
}
}
