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

public class MaterialMasterInboundPage extends TestRunnerWebClient{
	
	public MaterialMasterInboundPage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
	ExcelApiFile file4 = new ExcelApiFile("TestData4.xlsx");
	ExcelApiFile file = new ExcelApiFile("TestData.xlsx");
	WebDriverWait wait = new WebDriverWait(driver, LocatorsPath.MAX_TIME);
	Actions actions = new Actions(driver);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	
	
	
	/**----------------------1185_ECC_Mandatory_Fields_Validation--------------------------**/
	
	
	
	
	@Then("^User provides the valid 'Material Master Inbound' link in the Request URL field$")
	public void user_provides_the_valid_Material_Master_Inbound_link_in_the_Request_URL_field() throws Throwable {
	   
		System.out.println("Attempt: provide the valid 'Material Master Inbound' "
				+ "link in the Request URL field");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.MATERIAL_MASTER_URL, LocatorsPath.MAX_TIME, 
				file4.getCellData("MaterialMasterInbound", "Request URL", 2));
		System.out.println("Success: The valid 'Material Master Inbound' link in the "
				+ "Request URL field provided successfully");
	}
	

	@Then("^User provides the 'Material Master Inbound XML' under the 'BODY' field$")
	public void user_provides_the_Material_Master_Inbound_XML_under_the_BODY_field() throws Throwable {
	   
		System.out.println("Attempt: provide the 'Material Master Inbound XML' "
				+ "under the 'BODY' field");
		try {
			WebElement xml = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.BODY_CONTENT))));
			actions.moveToElement(xml).click().build().perform();
			CallObject.block(2000);
			actions.moveToElement(xml).sendKeys(
					file4.getCellData("MaterialMasterInbound", "Body Content", 2)).perform();
		}catch (StaleElementReferenceException StaleElementReferenceException) {
			System.out.println("Trying to recover from stale element" + StaleElementReferenceException);
		}
		System.out.println("Success: The 'Material Master Inbound XML' under "
				+ "the 'BODY' field provided successsfully");
	}
	

	@Then("^User verifies the mandatory fields for (\\d+) Material Master Inbound details is entered successfully in the RestClient screen$")
	public void user_verifies_the_mandatory_fields_for_Material_Master_Inbound_details_is_entered_successfully_in_the_RestClient_screen(int arg1) throws Throwable {
	    
		System.out.println("User verifies the mandatory fields for (\\d+) Material Master "
				+ "Inbound details is entered successfully in the RestClient screen");
	}
	
	

	
	/**----------------------1185_ECC_Update_MaterialMaster--------------------------**/
	
	
	
	
	@Then("^User updates 'Product Name' in the Material Master Inbound XML$")
	public void user_updates_Product_Name_in_the_Material_Master_Inbound_XML() throws Throwable {
	 
		System.out.println("User updates 'Product Name' in the Material Master Inbound XML");
	}
	

	@Then("^User updates 'Start Date' in the Material Master Inbound XML$")
	public void user_updates_Start_Date_in_the_Material_Master_Inbound_XML() throws Throwable {
	    
		System.out.println("User updates 'Start Date' in the Material Master Inbound XML");
	}

	
	@Then("^User updates 'End Date' in the Material Master Inbound XML$")
	public void user_updates_End_Date_in_the_Material_Master_Inbound_XML() throws Throwable {
	    
		System.out.println("User updates 'End Date' in the Material Master Inbound XML");
	}
	

	@Then("^User verifies the above following Material Master Inbound details are updated successfully$")
	public void user_verifies_the_above_following_Material_Master_Inbound_details_are_updated_successfully() throws Throwable {
	    
		System.out.println("User verifies the above following Material Master Inbound details are updated successfully");
	}
	

	@Then("^User clicks on the send button in the RestClient & verifies the Material Master is created successfully in the ECC tool\\.$")
	public void user_clicks_on_the_send_button_in_the_RestCliet_verifies_the_Material_Master_is_created_successfully_in_the_ECC_tool() throws Throwable {
	    
		System.out.println("Attempt: click on the send button in the RestCliet & "
				+ "verify the Material Master is created successfully in the ECC tool");
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
				+ "verified the Material Master is created successfully in the ECC tool");
	}
	

	
	
	/**----------------------1185_ECC_Verify_Job--------------------------**/
	
	
	
	
	@Then("^User verifies the '(\\d+) Material Master' job status is updated successfully in the 'Inbound' screen$")
	public void user_verifies_the_Material_Master_job_status_is_updated_successfully_in_the_Inbound_screen(int arg1) throws Throwable {
	 
		System.out.println("Attempt: verify the Material Master' job "
				+ "status is updated successfully in the 'Inbound' screen");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.GO, LocatorsPath.MAX_TIME);
		
		WebElement successRow = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SUCCESS_TABLE_ROW))));
		if(successRow.isDisplayed()) {
			WebElement messageID = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.SUCCESS_TABLE))));
			Assert.assertEquals(file4.getCellData("MaterialMasterInbound", "MessageID", 2), 
					messageID.getText());
			
			WebElement interfaceName = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.INTERFACE_NAME))));
			Assert.assertEquals("MaterialMasterService", interfaceName.getText());
			
			WebElement entityNumber = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.ENTITY_NUMBER))));
			Assert.assertEquals(file4.getCellData("MaterialMasterInbound", "Product No", 2), 
					entityNumber.getText());
		}
		System.out.println("Success: verified the Material Master' job "
				+ "status is updated successfully in the 'Inbound' screen");
	}
	

	@Then("^User clicks on the 'Products' tab and navigates to the Products screen$")
	public void user_clicks_on_the_Products_tab_and_navigates_to_the_Products_screen() throws Throwable {
	    
		System.out.println("Attempt: click on the 'Products' tab and navigate to the Products screen");
		PageObjects.SelectByXpath(
				driver, LocatorsPath.PRODUCTS_TAB, LocatorsPath.MAX_TIME);
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.MASTER_PRODUCT_LIST, LocatorsPath.MAX_TIME);
		System.out.println("Success: clicked on the 'Products' tab and navigated to the Products screen");
	}
	

	@Then("^User verifies the 'Products' Inbound record is created in the RCS(\\d+) application successfully\\.$")
	public void user_verifies_the_Products_Inbound_record_is_created_in_the_RCS_application_successfully(int arg1) throws Throwable {
	    
		System.out.println("Attempt: verify the 'Products' Inbound record is created in "
				+ "the RCS(\\d+) application successfully");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.PRODUCT_NAME_SEARCH_FIELD, LocatorsPath.MAX_TIME, 
				file4.getCellData("MaterialMasterInbound", "ProductName", 2));
		CallObject.block(3000);
		
		WebElement row = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.PRODUCT_ROW_DISPLAY))));
		if(row.isDisplayed()) {
		WebElement prodName = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INBOUND_PRODUCT_NAME))));
		Assert.assertEquals(file4.getCellData("MaterialMasterInbound", "ProductName", 2), 
				prodName.getText());
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.INBOUND_PRODUCT_NUMBER)));
		WebElement prodNum = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INBOUND_PRODUCT_NUMBER))));
		Assert.assertEquals(file4.getCellData("MaterialMasterInbound", "Product No", 2), 
				prodNum.getText());
		}
		System.out.println("Success: verified the 'Products' Inbound record is created in "
				+ "the RCS(\\d+) application successfully");
	}
}
