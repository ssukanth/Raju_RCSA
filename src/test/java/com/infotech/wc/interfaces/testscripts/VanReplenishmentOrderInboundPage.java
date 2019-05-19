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

import cucumber.api.java.en.Then;

public class VanReplenishmentOrderInboundPage extends TestRunnerWebClient{
	
	public VanReplenishmentOrderInboundPage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
	ExcelApiFile file4 = new ExcelApiFile("TestData4.xlsx");
	ExcelApiFile file = new ExcelApiFile("TestData.xlsx");
	WebDriverWait wait = new WebDriverWait(driver, LocatorsPath.MAX_TIME);
	Actions actions = new Actions(driver);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	
	
	
	/**----------------------1177_ECC_Verify_Job_Rep--------------------------**/
	
	
	
	
	@Then("^User provides the valid 'Van Replenishment Order Inbound' link in the Request URL field$")
	public void user_provides_the_valid_Van_Replenishment_Order_Inbound_link_in_the_Request_URL_field() throws Throwable {
	    
		System.out.println("Attempt: provide the valid 'Van Replenishment Order Inbound' "
				+ "link in the Request URL field");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.VAN_REPLENISHMENT_ORDER_URL, LocatorsPath.MAX_TIME, 
				file4.getCellData("VanReplenishmentOrder", "Request URL", 2));
		System.out.println("Success: The valid 'Van Replenishment Order Inbound' link in the "
				+ "Request URL field provided successfully");
	}
	

	@Then("^User provides the 'Van Replenishment Order Inbound XML' under the 'BODY' field$")
	public void user_provides_the_Van_Replenishment_Order_Inbound_XML_under_the_BODY_field() throws Throwable {
	    
		System.out.println("Attempt: provide the 'Van Replenishment Order Inbound XML' "
				+ "under the 'BODY' field");
		try {
			WebElement xml = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.BODY_CONTENT))));
			actions.moveToElement(xml).click().build().perform();
			CallObject.block(2000);
			actions.moveToElement(xml).sendKeys(
					file4.getCellData("VanReplenishmentOrder", "Body Content", 2)).perform();
		}catch (StaleElementReferenceException StaleElementReferenceException) {
			System.out.println("Trying to recover from stale element" + StaleElementReferenceException);
		}
		System.out.println("Success: The 'Van Replenishment Order Inbound XML' under "
				+ "the 'BODY' field provided successsfully");
	}
	

	@Then("^User verifies the mandatory fields for (\\d+) Van Replenishment Order Inbound details is entered successfully in the RestClient screen$")
	public void user_verifies_the_mandatory_fields_for_Van_Replenishment_Order_Inbound_details_is_entered_successfully_in_the_RestClient_screen(int arg1) throws Throwable {
	    
		System.out.println("User verifies the mandatory fields for (\\d+) Van Replenishment "
				+ "Order Inbound details is entered successfully in the RestClient screen");
	}
	

	@Then("^User clicks on the send button in the RestClient & verifies the Van Replenishment Order is created successfully in the ECC tool\\.$")
	public void user_clicks_on_the_send_button_in_the_RestCliet_verifies_the_Van_Replenishment_Order_is_created_successfully_in_the_ECC_tool() throws Throwable {

		System.out.println("Attempt: click on the send button in the RestCliet & "
				+ "verify the Replenishment Order is created successfully in the ECC tool");
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
				+ "verified the Replenishment Order is created successfully in the ECC tool");
	}
	

	
	
	/**----------------------1177_ECC_Verify_Job_Admin--------------------------**/
	
	
	
	
	@Then("^User verifies the '(\\d+) Van Replenishment Order' job status is updated successfully in the 'Inbound' screen\\.$")
	public void user_verifies_the_Van_Replenishment_Order_job_status_is_updated_successfully_in_the_Inbound_screen(int arg1) throws Throwable {
	    
		System.out.println("Attempt: verify the Van Replenishment Order' job "
				+ "status is updated successfully in the 'Inbound' screen");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.GO, LocatorsPath.MAX_TIME);
		
		WebElement successRow = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SUCCESS_TABLE_ROW))));
		if(successRow.isDisplayed()) {
			WebElement successRecord = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.SUCCESS_TABLE))));
			Assert.assertEquals(file4.getCellData("VanReplenishmentOrder", "MessageID", 2), 
					successRecord.getText());
			
			WebElement interfaceName = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.INTERFACE_NAME))));
			Assert.assertEquals("VanStockReplenishmentService", interfaceName.getText());
			
			WebElement entityNumber = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.ENTITY_NUMBER))));
			file4.setCellData("VanReplenishmentOrder", "Entity Number", 2, 
					entityNumber.getText());
		}
		System.out.println("Success: verified the Van Replenishment Order' job "
				+ "status is updated successfully in the 'Inbound' screen");
	}
	
	
	
	
	/**----------------------1177_ECC_Verify_Job_Admin--------------------------**/
	
	
	
	
	@Then("^User logins to the WC application as Rep$")
	public void user_logins_to_the_WC_application_as_Rep() throws Throwable {
	    
		System.out.println("Attempt: login to the WC application as Rep");
		logOut();
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.LOGIN_USERNAME, LocatorsPath.MAX_TIME, 
				file4.getCellData("VanReplenishmentOrder", "Fiji Rep User", 2));
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.LOGIN_PASSWORD, LocatorsPath.MAX_TIME, 
				file.getCellData("Login", "LoginPassword", 2));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.LOGIN, LocatorsPath.MAX_TIME);
		System.out.println("Success: successfully logged into the WC application as Rep");
	}
	

	@Then("^User clicks on the 'Sales Module' and navigates to the 'Start of Day' tab$")
	public void user_clicks_on_the_Sales_Module_and_navigates_to_the_Start_of_Day_tab() throws Throwable {
	 
		System.out.println("Attempt: click on the 'Sales Module' "
				+ "and navigate to the 'Start of Day' tab");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.SALES_MODULE, LocatorsPath.MAX_TIME);
		System.out.println("Success: clicked on the 'Sales Module' "
				+ "and navigated to the 'Start of Day' tab");
	}
	

	@Then("^User clicks on the 'My Inventory' tab & verifies the navigation is successful$")
	public void user_clicks_on_the_My_Inventory_tab_verifies_the_navigation_is_successful() throws Throwable {
	    
		System.out.println("Attempt: click on the 'My Inventory' tab & "
				+ "verify the navigation is successful");
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.START_OF_DAY, LocatorsPath.MAX_TIME);
		PageObjects.SelectByXpath(
				driver, LocatorsPath.MY_INVENTORY, LocatorsPath.MAX_TIME);
		System.out.println("Success: clicked on the 'My Inventory' tab & "
				+ "verified the navigation is successful");
	}
	

	@Then("^User verifies the Stockload is created with 'Open' status in the stockload screen\\.$")
	public void user_verifies_the_Stockload_is_created_with_Open_status_in_the_stockload_screen() throws Throwable {
	   
		System.out.println("Attempt: verify the Stockload is created with 'Open' status in the stockload screen");
		WebElement stockRecord = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INBOUND_STOCK_LOAD_RECORD_1))));
		if(stockRecord.isDisplayed()) {
			WebElement stockLoadNum = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.INBOUND_STOCK_LOAD_NUMBER))));
			Assert.assertEquals(file4.getCellData("VanReplenishmentOrder", "Entity Number", 2), 
					stockLoadNum.getText());
			
			WebElement status = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.INBOUND_STOCK_LOAD_STATUS))));
			Assert.assertEquals("1- OPEN", status.getText());
		}else {
			Assert.fail("Stock Load record1 is not displayed");
		}
		
		WebElement stockrecord = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INBOUND_STOCK_LOAD_RECORD_2))));
		if(stockrecord.isDisplayed()) {
			WebElement stockLoadQty = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.INBOUND_STOCK_LOAD_QTY))));
			Assert.assertEquals((int)Double.parseDouble(file4.getCellData("VanReplenishmentOrder", "Quantity", 2)), 
					(int)Double.parseDouble(stockLoadQty.getAttribute("value")));
		}else {
			Assert.fail("Stock Load record2 is not displayed");
		}
		System.out.println("Success: verified the Stockload is created with 'Open' status in the stockload screen");
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
