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
import com.infotech.wc.ui.testscripts.RcsSaasPriceListConfigPage;

import cucumber.api.java.en.Then;

public class PricingMasterInboundPage extends TestRunnerWebClient{
	
	public PricingMasterInboundPage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
	ExcelApiFile file4 = new ExcelApiFile("TestData4.xlsx");
	ExcelApiFile file = new ExcelApiFile("TestData.xlsx");
	WebDriverWait wait = new WebDriverWait(driver, LocatorsPath.MAX_TIME);
	Actions actions = new Actions(driver);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	RcsSaasPriceListConfigPage priceListConfigPage = new RcsSaasPriceListConfigPage();
	
	
	
	
	/**----------------------1181_ECC_Mandatory_Fields_Validation--------------------------**/
	
	
	
	
	@Then("^User provides the valid 'Pricing Master Inbound' link in the Request URL field$")
	public void user_provides_the_valid_Pricing_Master_Inbound_link_in_the_Request_URL_field() throws Throwable {
	   
		System.out.println("Attempt: provide the valid 'Pricing Master Inbound' "
				+ "link in the Request URL field");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.PRICING_MASTER_URL, LocatorsPath.MAX_TIME, 
				file4.getCellData("PricingMasterInbound", "Request URL", 2));
		System.out.println("Success: The valid 'Pricing Master Inbound' link in the "
				+ "Request URL field provided successfully");
	}
	

	@Then("^User provides the 'Pricing Master Inbound XML' under the 'BODY' field$")
	public void user_provides_the_Pricing_Master_Inbound_XML_under_the_BODY_field() throws Throwable {
	    
		System.out.println("Attempt: provide the 'Customer Master Inbound XML' "
				+ "under the 'BODY' field");
		try {
			WebElement xml = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.BODY_CONTENT))));
			actions.moveToElement(xml).click().build().perform();
			CallObject.block(2000);
			actions.moveToElement(xml).sendKeys(
					file4.getCellData("PricingMasterInbound", "Body Content", 2)).perform();
		}catch (StaleElementReferenceException StaleElementReferenceException) {
			System.out.println("Trying to recover from stale element" + StaleElementReferenceException);
		}
		System.out.println("Success: The 'Customer Master Inbound XML' under "
				+ "the 'BODY' field provided successsfully");
	}
	

	@Then("^User verifies the mandatory fields for (\\d+) Pricing Master Inbound details is entered successfully in the RestClient screen\\.$")
	public void user_verifies_the_mandatory_fields_for_Pricing_Master_Inbound_details_is_entered_successfully_in_the_RestClient_screen(int arg1) throws Throwable {
	    
		System.out.println("User verifies the mandatory fields for (\\d+) Pricing Master "
				+ "Inbound details is entered successfully in the RestClient screen");
	}
	

	
	
	/**----------------------1181_ECC_Update_PricingMaster--------------------------**/
	
	
	
	
	@Then("^User updates 'PriceList Name' in the Pricing Master Inbound XML$")
	public void user_updates_PriceList_Name_in_the_Pricing_Master_Inbound_XML() throws Throwable {
	   
		System.out.println("User updates 'PriceList Name' in the Pricing Master Inbound XML");
	}
	

	@Then("^User updates 'List Price' in the Pricing Master Inbound XML$")
	public void user_updates_List_Price_in_the_Pricing_Master_Inbound_XML() throws Throwable {
	    
		System.out.println("User updates 'List Price' in the Pricing Master Inbound XML");
	}
	

	@Then("^User updates 'Start or End Date' in the Pricing Master Inbound XML$")
	public void user_updates_Start_or_End_Date_in_the_Pricing_Master_Inbound_XML() throws Throwable {
	    
		System.out.println("User updates 'Start or End Date' in the Pricing Master Inbound XML");
	}

	
	@Then("^User verifies the above following Pricing details are updated successfully$")
	public void user_verifies_the_above_following_Pricing_details_are_updated_successfully() throws Throwable {
	    
		System.out.println("User verifies the above following Pricing details are updated successfully");
	}
	

	@Then("^User clicks on the send button in the RestClient & verifies the PriceList is created successfully in the ECC tool\\.$")
	public void user_clicks_on_the_send_button_in_the_RestCliet_verifies_the_PriceList_is_created_successfully_in_the_ECC_tool() throws Throwable {
	    
		System.out.println("Attempt: click on the send button in the RestCliet & "
				+ "verify the PriceList is created successfully in the ECC tool");
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
				+ "verified the PriceList is created successfully in the ECC tool");
	}
	

	
	
	/**----------------------1181_ECC_Verify_Job--------------------------**/
	
	
	
	
	@Then("^User verifies the '(\\d+) Pricing Master' job status is updated successfully in the 'Inbound' screen$")
	public void user_verifies_the_Pricing_Master_job_status_is_updated_successfully_in_the_Inbound_screen(int arg1) throws Throwable {
	 
		System.out.println("Attempt: verify the CustomerMaster' job status is updated successfully in the 'Inbound' screen");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.GO, LocatorsPath.MAX_TIME);
		
		WebElement successRow = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SUCCESS_TABLE_ROW))));
		if(successRow.isDisplayed()) {
			WebElement successRecord = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.PRICING_SUCCESS_TABLE))));
			Assert.assertEquals(file4.getCellData("PricingMasterInbound", "PriceList Entity Num", 2).concat(" Price List"), 
					successRecord.getText());
			file4.setCellData("PricingMasterInbound", "PriceList Entity Num", 3, 
					successRecord.getText());
		}
		System.out.println("Success: verified the CustomerMaster' job status is updated successfully in the 'Inbound' screen");
	}
	

	@Then("^User clicks on Configuration$")
	public void i_Click_on_Configiuration() throws Throwable {
	   
		System.out.println("Attempt: Click on Configiuration");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.CONFIGURATION, LocatorsPath.MAX_TIME);
		System.out.println("Success: Configiuration is selected successfully");
	}

	
	@Then("^The User should be navigated to configuration screen successfully$")
	public void the_User_should_be_navigated_to_configuration_screen_successfully() throws Throwable {
	   
		System.out.println("User should be navigated "
				+ "to configuration screen successfully");
	}
	
	
	@Then("^User clicks on the 'PriceList' tab and navigates to the pricelist screen$")
	public void user_clicks_on_the_PriceList_tab_and_navigates_to_the_pricelist_screen() throws Throwable {
	    
		priceListConfigPage.user_clicks_on_Price_List_tab_and_navigates_to_Price_List_screen();
	}
	

	@Then("^User verifies the 'PriceList' Inbound record is created in the RCS(\\d+) application successfully\\.$")
	public void user_verifies_the_PriceList_Inbound_record_is_created_in_the_RCS_application_successfully(int arg1) throws Throwable {
	    
		System.out.println("Attempt: verify the 'PriceList' Inbound record is created in the RCS(\\d+) application successfully");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.SEARCH_PRICE_LIST_NAME, LocatorsPath.MAX_TIME, 
				file4.getCellData("PricingMasterInbound", "PriceList Entity Num", 3));
		CallObject.block(3000);
		WebElement pricelistRow = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.PRICELIST_ROW_DISP))));
		if(pricelistRow.isDisplayed()) {
			WebElement record = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.PRICELIST_RECORD))));
			Assert.assertEquals(file4.getCellData("PricingMasterInbound", "PriceList Entity Num", 3),
					record.getText());
		}
		
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.REFRESH_PRICE_LIST_NAME, LocatorsPath.MAX_TIME);
		CallObject.block(3000);
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(
						By.cssSelector(LocatorsPath.PRICELIST_PROD_ROW_DISP)));
		WebElement pricelistProdRow = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.PRICELIST_PROD_ROW_DISP))));
		if(pricelistProdRow.isDisplayed()) {
			WebElement record = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.PRICELIST_PROD_NUM))));
			js.executeScript("arguments[0].scrollIntoView();", 
					driver.findElement(
							By.cssSelector(LocatorsPath.PRICELIST_PROD_NUM)));
			Assert.assertEquals(file4.getCellData("PricingMasterInbound", "PriceList Prod Num", 2), 
					record.getText());
		}
		System.out.println("Success: verified the 'PriceList' Inbound record is created in the RCS(\\d+) application successfully");
	}
}
