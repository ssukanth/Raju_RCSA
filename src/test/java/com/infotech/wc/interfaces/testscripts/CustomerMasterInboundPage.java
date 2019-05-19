package com.infotech.wc.interfaces.testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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
import com.infotech.wc.ui.testscripts.RcsSaasNewOutletCreationPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CustomerMasterInboundPage extends TestRunnerWebClient{
	
	public CustomerMasterInboundPage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
	ExcelApiFile file4 = new ExcelApiFile("TestData4.xlsx");
	ExcelApiFile file = new ExcelApiFile("TestData.xlsx");
	WebDriverWait wait = new WebDriverWait(driver, LocatorsPath.MAX_TIME);
	Actions actions = new Actions(driver);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	RcsSaasNewOutletCreationPage newOutletCreationPage = new RcsSaasNewOutletCreationPage();
	
	
	
	
	/**----------------------1511_ECC_Mandatory_Fields_Validation--------------------------**/
	
	
	
	
	@Given("^Login to the RestClient$")
	public void login_to_the_RestClent() throws Throwable {
	    
		System.out.println("Attempt: Login to the RestClent");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get(file4.getCellData("CustomerMasterInbound", "Rest Client URL", 2));
		System.out.println("Success: Able to Login to the RestClent successfully");
	}
	

	@Then("^User verifies the RestClient screen is successfully displayed$")
	public void user_verifies_the_RestClient_screen_is_successfully_displayed() throws Throwable {
	 
		System.out.println("Attempt: verify the RestClient screen is displayed");
		PageObjects.SelectByCSSSelectorWithoutClick(
				driver, LocatorsPath.REST_CLIENT_DISP, LocatorsPath.MAX_TIME);
		System.out.println("Success: The RestClient screen is displayed successfully");
	}
	

	@Then("^User provides the valid 'Customer Master Inbound' link in the Request URL field$")
	public void user_provides_the_valid_Customer_Master_Inbound_link_in_the_Request_URL_field() throws Throwable {
	    
		System.out.println("Attempt: provide the valid 'Customer Master Inbound' "
				+ "link in the Request URL field");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.CUSTOMER_MASTER_URL, LocatorsPath.MAX_TIME, 
				file4.getCellData("CustomerMasterInbound", "Request URL", 2));
		System.out.println("Success: The valid 'Customer Master Inbound' link in the "
				+ "Request URL field provided successfully");
	}
	

	@Then("^User selects the request type as 'POST' in the RestClient screen$")
	public void user_selects_the_request_type_as_POST_in_the_RestClient_screen() throws Throwable {
	 
		System.out.println("Attempt: select the request type as 'POST' in the RestClient screen");
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.REQUEST_TYPE)))).sendKeys(
						Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		CallObject.block(1000);
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.REQUEST_TYPE, LocatorsPath.MAX_TIME, 
				file4.getCellData("CustomerMasterInbound", "Request Type", 2));
		CallObject.block(1000);
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.REQUEST_TYPE)))).sendKeys(Keys.ENTER);
		System.out.println("Success: The request type as 'POST' in the RestClient screen selected successfully");
	}
	

	@Then("^User selects the 'Content- Type' as 'application/xml' under the 'HEADER' field$")
	public void user_selects_the_Content_Type_as_application_xml_under_the_HEADER_field() throws Throwable {
	   
		System.out.println("Attempt: select the 'Content- Type' as 'application/xml' under the 'HEADER' field");
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.CONTENT_TYPE)))).sendKeys(
						Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		CallObject.block(1000);
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.CONTENT_TYPE, LocatorsPath.MAX_TIME, 
				file4.getCellData("CustomerMasterInbound", "Content Type", 2));
		CallObject.block(1000);
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.CONTENT_TYPE)))).sendKeys(Keys.ENTER);
		System.out.println("Success: selected the 'Content- Type' as 'application/xml' under the 'HEADER' field");
	}
	

	@Then("^User provides the 'Customer Master Inbound XML' under the 'BODY' field$")
	public void user_provides_the_Customer_Master_Inbound_XML_under_the_BODY_field() throws Throwable {
	    
		System.out.println("Attempt: provide the 'Customer Master Inbound XML' "
				+ "under the 'BODY' field");
		try {
			WebElement xml = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.BODY_CONTENT))));
			actions.moveToElement(xml).click().build().perform();
			CallObject.block(2000);
			actions.moveToElement(xml).sendKeys(
					file4.getCellData("CustomerMasterInbound", "Body Content", 2)).perform();
		}catch (StaleElementReferenceException StaleElementReferenceException) {
			System.out.println("Trying to recover from stale element" + StaleElementReferenceException);
		}
		System.out.println("Success: The 'Customer Master Inbound XML' under "
				+ "the 'BODY' field provided successsfully");
	}
	

	@Then("^User verifies the mandatory fields for (\\d+) Customer Master Inbound details is entered successfully in the RestClient screen\\.$")
	public void user_verifies_the_mandatory_fields_for_Customer_Master_Inbound_details_is_entered_successfully_in_the_RestClient_screen(int arg1) throws Throwable {
	
		System.out.println("User verifies the mandatory fields for (\\d+) Customer Master "
				+ "Inbound details is entered successfully in the RestClient screen");
	}
	

	
	
	/**----------------------1511_ECC_Update_Customer--------------------------**/
	
	
	
	
	@Then("^User updates the following 'Customer Address details' in the ECC - Country, County, Suburb, Street Name$")
	public void user_updates_the_following_Customer_Address_details_in_the_ECC_Country_County_Suburb_Street_Name() throws Throwable {
	 
		System.out.println("User updates the following 'Customer Address details' "
				+ "in the ECC - Country, County, Suburb, Street Name");
	}
	

	@Then("^User updates 'Contract Num' under the 'Trading Terms' section$")
	public void user_updates_Contract_Num_under_the_Trading_Terms_section() throws Throwable {
	    
		System.out.println("User updates 'Contract Num' under the 'Trading Terms' section");
	}
	

	@Then("^User updates 'Contract Start Date' under the 'Trading Terms' section$")
	public void user_updates_Contract_Start_Date_under_the_Trading_Terms_section() throws Throwable {
	 
		System.out.println("User updates 'Contract Start Date' under the 'Trading Terms' section");
	}
	

	@Then("^User updates 'Contract End Date' under the 'Trading Terms' section$")
	public void user_updates_Contract_End_Date_under_the_Trading_Terms_section() throws Throwable {
	    
		System.out.println("User updates 'Contract End Date' under the 'Trading Terms' section");
	}
	

	@Then("^User updates 'Tobacco License Num' under the 'Trading Terms' section$")
	public void user_updates_Tobacco_License_Num_under_the_Trading_Terms_section() throws Throwable {
	   
		System.out.println("User updates 'Tobacco License Num' under the 'Trading Terms' section");
	}
	

	@Then("^User updates 'Tobacco License Start Date' under the 'Trading Terms' section$")
	public void user_updates_Tobacco_License_Start_Date_under_the_Trading_Terms_section() throws Throwable {
	    
		System.out.println("User updates 'Tobacco License Start Date' under the 'Trading Terms' section");
	}
	

	@Then("^User updates 'Tobacco License End Date' under the 'Trading Terms' section$")
	public void user_updates_Tobacco_License_End_Date_under_the_Trading_Terms_section() throws Throwable {
	 
		System.out.println("User updates 'Tobacco License End Date' under the 'Trading Terms' section");
	}
	

	@Then("^User verifies the above following Customer details is updated successfully in the ECC$")
	public void user_verifies_the_above_following_Customer_details_is_updated_successfully_in_the_ECC() throws Throwable {
	    
		System.out.println("User verifies the above following Customer details is updated successfully in the ECC");
	}

	
	@Then("^User clicks on the send button in the RestClient & verifies the Customer Master Inbound details is created successfully in the ECC tool\\.$")
	public void user_clicks_on_the_send_button_in_the_RestCliet_verifies_the_Customer_Master_Inbound_details_is_created_successfully_in_the_ECC_tool() throws Throwable {
	    
		System.out.println("Attempt: click on the send button in the RestCliet & "
				+ "verify the Customer Master Inbound details is created successfully in the ECC tool");
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
				+ "verified the Customer Master Inbound details is created successfully in the ECC tool");
	}
	

	
	
	/**----------------------1511_ECC_Verify_Job--------------------------**/
	
	
	
	
	@Then("^User logins to the WC application as admin$")
	public void user_logins_to_the_WC_application_as_admin() throws Throwable {
	 
		System.out.println("Attempt: login to the WC application as admin");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get(file.getCellData("Login", "URL", 2));
		
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.LOGIN_USERNAME, LocatorsPath.MAX_TIME, 
				file.getCellData("Login", "FijiLoginUserName", 2));
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.LOGIN_PASSWORD, LocatorsPath.MAX_TIME, 
				file.getCellData("Login", "LoginPassword", 2));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.LOGIN, LocatorsPath.MAX_TIME);
		System.out.println("Success: logged into the WC application as admin");
	}
	

	@Then("^User clicks on the 'Utilities' tab and verifies the Utilities screen is displayed successfully$")
	public void user_clicks_on_the_Utilities_tab_and_verifies_the_Utilities_screen_is_displayed_successfully() throws Throwable {
	    
		System.out.println("Attempt: click on the 'Utilities' tab and "
				+ "verify the Utilities screen is displayed");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.UTILITIES, LocatorsPath.MAX_TIME);
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.UTILITY_DISP, LocatorsPath.MAX_TIME);
		System.out.println("Success: clicked on the 'Utilities' tab and "
				+ "verified the Utilities screen is displayed");
	}
	

	@Then("^User selects the 'Inbound' tab under the 'Utilities'$")
	public void user_selects_the_Inbound_tab_under_the_Utilities() throws Throwable {
	 
		System.out.println("Attempt: select the 'Inbound' tab under the 'Utilities'");
		PageObjects.SelectByXpath(
				driver, LocatorsPath.INBOUND_OUTBOUND, LocatorsPath.MAX_TIME);
		System.out.println("Success: selected the 'Inbound' tab under the 'Utilities'");
	}
	

	@Then("^User verifies the '(\\d+) CustomerMaster' job status is updated successfully in the 'Inbound' screen\\.$")
	public void user_verifies_the_CustomerMaster_job_status_is_updated_successfully_in_the_Inbound_screen(int arg1) throws Throwable {
	    
		System.out.println("Attempt: verify the CustomerMaster' job status is updated successfully in the 'Inbound' screen");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.GO, LocatorsPath.MAX_TIME);
		
		WebElement successRow = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SUCCESS_TABLE_ROW))));
		if(successRow.isDisplayed()) {
			WebElement successRecord = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.SUCCESS_TABLE))));
			Assert.assertEquals(file4.getCellData("CustomerMasterInbound", "Customer No", 2), 
					successRecord.getText());
		}
		System.out.println("Success: verified the CustomerMaster' job status is updated successfully in the 'Inbound' screen");
	}
	

	
	
	/**----------------------1511_ECC_Verify_Customer_Updated_Data_RCS--------------------------**/
	
	
	
	
	@Then("^User clicks on the 'Data Entry' tab and verifies the Data Entry screen is displayed successfully$")
	public void user_clicks_on_the_Data_Entry_tab_and_verifies_the_Data_Entry_screen_is_displayed_successfully() throws Throwable {
	    
		System.out.println("Attempt: click on the 'Data Entry' tab and "
				+ "verify the Data Entry screen is displayed");
		newOutletCreationPage.user_clicks_on_Search_tab();
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.CUSTOMER_NUM, LocatorsPath.MAX_TIME, 
				file4.getCellData("CustomerMasterInbound", "Customer No", 2));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.INBOUND_SEARCH, LocatorsPath.MAX_TIME);
		System.out.println("Success: clicked on the 'Data Entry' tab and "
				+ "verified the Data Entry screen is displayed");
	}
	

	@Then("^User scrolls down to the 'General Information' section & verifies the 'ERP No\\.' is displayed in RCS(\\d+)$")
	public void user_scrolls_down_to_the_General_Information_section_verifies_the_ERP_No_is_displayed_in_RCS(int arg1) throws Throwable {
	    
		System.out.println("Attempt: scroll down to the 'General Information' section & "
				+ "verify the 'ERP No\\.' is displayed in RCS8");
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(
						By.xpath(LocatorsPath.GENERAL_INFORMATION)));
		WebElement erpNo = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ERP_NUM))));
		Assert.assertEquals(file4.getCellData("CustomerMasterInbound", "ERP Num", 2), 
				erpNo.getAttribute("value"));
		System.out.println("Success: successfully scrolled down to the 'General Information' section & "
				+ "verified the 'ERP No\\.' is displayed in RCS8");
	}
	

	@Then("^User scrolls down to the 'Customer Address' section & verifies the following 'Customer Address details' displayed in RCS(\\d+) - Country, County, Suburb, Street Name$")
	public void user_scrolls_down_to_the_Customer_Address_section_verifies_the_following_Customer_Address_details_displayed_in_RCS_Country_County_Suburb_Street_Name(int arg1) throws Throwable {
	  
		System.out.println("Attempt: scroll down to the 'Customer Address' section & "
				+ "verify the following 'Customer Address details' displayed in RCS(\\d+) - Country, County, Suburb, Street Name");
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(
						By.xpath(LocatorsPath.CUSTOMER_ADDRESS)));
		PageObjects.SelectByXpath(
				driver, LocatorsPath.CUSTOMER_ADDRESS, LocatorsPath.MAX_TIME);
		System.out.println("Success: successfully scrolled down to the 'Customer Address' section "
				+ "& verified the following 'Customer Address details' displayed in RCS(\\d+) - Country, County, Suburb, Street Name");
	}
	

	@Then("^User scrolls down to the 'Trading Terms' section & verifies the following 'Trading Terms details' displayed in RCS(\\d+) - Contract Num, Contract Start & End Date, Tobacco License Num, Tobacco License Start & End Date\\.$")
	public void user_scrolls_down_to_the_Trading_Terms_section_verifies_the_following_Trading_Terms_details_displayed_in_RCS_Contract_Num_Contract_Start_End_Date_Tobacco_License_Num_Tobacco_License_Start_End_Date(int arg1) throws Throwable {
	    
		System.out.println("Attempt: scroll down to the 'Trading Terms' section & "
				+ "verify the following 'Trading Terms details' displayed in RCS(\\d+) - "
				+ "Contract Num, Contract Start & End Date, Tobacco License Num, Tobacco License Start & End Date");
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(
						By.xpath(LocatorsPath.INBOUND_TRADING_TERMS)));
		PageObjects.SelectByXpath(
				driver, LocatorsPath.INBOUND_TRADING_TERMS, LocatorsPath.MAX_TIME);
		System.out.println("Success: successfully scrolled down to the 'Trading Terms' section "
				+ "& verified the following 'Trading Terms details' displayed in RCS(\\d+) - "
				+ "Contract Num, Contract Start & End Date, Tobacco License Num, Tobacco License Start & End Date");
	}
}
