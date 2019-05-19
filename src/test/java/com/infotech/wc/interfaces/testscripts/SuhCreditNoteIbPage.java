package com.infotech.wc.interfaces.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.infotech.Excel.ExcelApiFile;
import com.infotech.basepage.CallObject;
import com.infotech.basepage.LocatorsPath;
import com.infotech.basepage.PageObjects;
import com.infotech.testrunner.TestRunnerWebClient;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SuhCreditNoteIbPage extends TestRunnerWebClient{
	
	public SuhCreditNoteIbPage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
	ExcelApiFile file4 = new ExcelApiFile("TestData4.xlsx");
	ExcelApiFile file = new ExcelApiFile("TestData.xlsx");
	WebDriverWait wait = new WebDriverWait(driver, LocatorsPath.MAX_TIME);
	Actions actions = new Actions(driver);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	CustomerMasterInboundPage masterInboundPage = new CustomerMasterInboundPage();
	CustomerMasterInboundPage customerMasterInboundPage = new CustomerMasterInboundPage();
	
	

	
	/**----------------------1451_RCS_Credit_Customer--------------------------**/
	
	
	
	
	@Given("^Login to the WebClient app$")
	public void login_to_the_WebClient_app() throws Throwable {
	   
		customerMasterInboundPage.user_logins_to_the_WC_application_as_admin();
	}

	
	@When("^User Provides the valid admin credentials$")
	public void user_Provides_the_valid_admin_credentials() throws Throwable {

		System.out.println("User Provides the valid admin credentials");
	}
	
	
	@Then("^User enters the 'Credit Customer Number' and clicks on the search button & verifies the customer profile screen is displayed$")
	public void user_enters_the_Credit_Customer_Number_and_clicks_on_the_search_button_verifies_the_customer_profile_screen_is_displayed() throws Throwable {
	 
		System.out.println("Attempt: enter the 'Credit Customer Number' and click on the "
				+ "search button & verify the customer profile screen is displayed");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.CUSTOMER_NUM, LocatorsPath.MAX_TIME, 
				file4.getCellData("CreditMasterInbound", "Customer No", 2));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.INBOUND_SEARCH, LocatorsPath.MAX_TIME);
		System.out.println("Success: entered the 'Credit Customer Number' and clicked on the "
				+ "search button & verified the customer profile screen is displayed\");");
	}
	

	@Then("^User scrolls down to the 'Customer Trading Terms' section & makes a note of Available Credit\\.$")
	public void user_scrolls_down_to_the_Customer_Trading_Terms_section_makes_a_note_of_Available_Credit() throws Throwable {
	    
		System.out.println("Attempt: scroll down to the 'Customer Trading Terms' "
				+ "section & make a note of Available Credit");
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(
						By.xpath(LocatorsPath.INBOUND_TRADING_TERMS)));
		PageObjects.SelectByXpath(
				driver, LocatorsPath.INBOUND_TRADING_TERMS, LocatorsPath.MAX_TIME);
		
		WebElement availableLimit = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.AVAILABLE_LIMIT))));
		file4.setCellData("CustomerClearanceInbound", "Available Credit", 2, 
				availableLimit.getAttribute("value"));
		System.out.println("Success: Successfully scrolled down to the 'Customer Trading Terms' "
				+ "section & made a note of Available Credit");
	}
	

	
	
	/**----------------------1451_ECC_Mandatory_Fields_Validation--------------------------**/
	
	
	
	
	@Then("^User logins to the RestClient$")
	public void user_logins_to_the_RestClient() throws Throwable {
	    
		masterInboundPage.login_to_the_RestClent();
	}
	

	@Then("^User provides the valid 'Customer Clearance' link in the Request URL field$")
	public void user_provides_the_valid_Customer_Clearance_link_in_the_Request_URL_field() throws Throwable {
	    
		System.out.println("Attempt: provide the valid 'Customer Clearance' "
				+ "link in the Request URL field");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.CUSTOMER_CLEARANCE_URL, LocatorsPath.MAX_TIME, 
				file4.getCellData("CustomerClearanceInbound", "Request URL", 2));
		System.out.println("Success: The valid 'Customer Clearance' link in the "
				+ "Request URL field provided successfully");
	}
	

	@Then("^User provides the 'Customer Clearance XML' under the 'BODY' field$")
	public void user_provides_the_Customer_Clearance_XML_under_the_BODY_field() throws Throwable {
	    
		System.out.println("Attempt: provide the 'Customer Clearance XML' "
				+ "under the 'BODY' field");
		try {
			WebElement xml = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.BODY_CONTENT))));
			actions.moveToElement(xml).click().build().perform();
			CallObject.block(2000);
			actions.moveToElement(xml).sendKeys(
					file4.getCellData("CustomerClearanceInbound", "Body Content", 2)).perform();
		}catch (StaleElementReferenceException StaleElementReferenceException) {
			System.out.println("Trying to recover from stale element" + StaleElementReferenceException);
		}
		System.out.println("Success: The 'Customer Clearance XML' under "
				+ "the 'BODY' field provided successsfully");
	}
	

	@Then("^User verifies the mandatory fields for (\\d+) SUH Credit Note details is entered successfully in the RestClient screen$")
	public void user_verifies_the_mandatory_fields_for_SUH_Credit_Note_details_is_entered_successfully_in_the_RestClient_screen(int arg1) throws Throwable {
	    
		System.out.println("User verifies the mandatory fields for (\\d+) SUH Credit "
				+ "Note details is entered successfully in the RestClient screen");
	}
	

	@Then("^User clicks on the send button in the RestClient & verifies the SUH Credit Note details is created successfully in the ECC tool\\.$")
	public void user_clicks_on_the_send_button_in_the_RestClient_verifies_the_SUH_Credit_Note_details_is_created_successfully_in_the_ECC_tool() throws Throwable {
	 
		System.out.println("Attempt: click on the send button in the RestCliet & "
				+ "verify the SUH Credit Note details is created successfully in the ECC tool");
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
				+ "verified the SUH Credit Note details is created successfully in the ECC tool");
	}
	

	
	
	/**----------------------1451_Customer_Clearance_Service_Job--------------------------**/
	
	
	
	
	@Then("^User verifies the '(\\d+) SUH Credit Note' job status is updated successfully in the 'Inbound' screen$")
	public void user_verifies_the_SUH_Credit_Note_job_status_is_updated_successfully_in_the_Inbound_screen(int arg1) throws Throwable {
	   
		System.out.println("Attempt: verify the SUH Credit Note' job "
				+ "status is updated successfully in the 'Inbound' screen");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.GO, LocatorsPath.MAX_TIME);
		
		WebElement successRow = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SUCCESS_TABLE_ROW))));
		if(successRow.isDisplayed()) {
			WebElement messageID = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.SUCCESS_TABLE))));
			Assert.assertEquals(file4.getCellData("CustomerClearanceInbound", "MessageID", 2), 
					messageID.getText());
			
			WebElement interfaceName = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.INTERFACE_NAME))));
			Assert.assertEquals("CustomerClearance", interfaceName.getText());
			
			WebElement entityNumber = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.ENTITY_NUMBER))));
			Assert.assertEquals(file4.getCellData("CustomerClearanceInbound", "Payment Number", 2), 
					entityNumber.getText());
		}
		System.out.println("Success: verified the SUH Credit Note' job "
				+ "status is updated successfully in the 'Inbound' screen");
	}
	

	@Then("^User scrolls down to the 'Customer Trading Terms' section$")
	public void user_scrolls_down_to_the_Customer_Trading_Terms_section() throws Throwable {
	    
		System.out.println("Attempt: scroll down to the 'Customer Trading Terms' section");
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(
						By.xpath(LocatorsPath.INBOUND_TRADING_TERMS)));
		PageObjects.SelectByXpath(
				driver, LocatorsPath.INBOUND_TRADING_TERMS, LocatorsPath.MAX_TIME);
		System.out.println("Success: Successfully scrolled down to the 'Customer Trading Terms' section");
	}
	

	@Then("^User verifies the 'Available Credit' field is updated & displayed with the combination of 'Available Credit = Available Credit \\+ Credit Note amount/CRM'\\.$")
	public void user_verifies_the_Available_Credit_field_is_updated_displayed_with_the_combination_of_Available_Credit_Available_Credit_Credit_Note_amount_CRM() throws Throwable {
	    
		System.out.println("Attempt: verify the 'Available Credit' field is updated & "
				+ "displayed with the combination of 'Available Credit = Available Credit \\+ Credit Note amount/CRM'");
		WebElement availableLimit = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.AVAILABLE_LIMIT))));
		Assert.assertEquals((int)Double.parseDouble(file4.getCellData("CustomerClearanceInbound", "Available Credit", 2)) + 
				(int)Double.parseDouble(file4.getCellData("CustomerClearanceInbound", "Payment Amount", 2)), 
				(int)Double.parseDouble(availableLimit.getAttribute("value")));
		System.out.println("Success: verified the 'Available Credit' field is updated & "
				+ "displayed with the combination of 'Available Credit = Available Credit \\+ Credit Note amount/CRM'");
	}
}
