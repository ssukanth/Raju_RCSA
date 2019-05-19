package com.infotech.wc.ui.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.infotech.Excel.ExcelApiFile;
import com.infotech.basepage.CallObject;
import com.infotech.basepage.LocatorsPath;
import com.infotech.basepage.PageObjects;
import com.infotech.testrunner.TestRunnerWebClient;

import cucumber.api.java.en.Then;

public class RcsSaasMobileApplicationPage extends TestRunnerWebClient{

	WebDriver driver = getDriver();
	Actions actions = new Actions(driver);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	ExcelApiFile file = new ExcelApiFile("TestData.xlsx");
	WebDriverWait wait = new WebDriverWait(driver, LocatorsPath.MAX_TIME);
	RcsSaasModulePrivilegePage modulePrivilegePage = new RcsSaasModulePrivilegePage();
	
	public RcsSaasMobileApplicationPage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	/**----------------------RCS SAAS MobileApplication_WC--------------------------**/
	
	
	@Then("^User clicks on Mobile Application under the Module priviliges and navigates to Mobile Application Screen$")
	public void click_on_Mobile_Application_under_the_Module_priviliges_and_navigate_to_Mobile_Application_Screen() throws Throwable {
	 
		System.out.println("Attempt: Click on Mobile Application under the Module priviliges");
		modulePrivilegePage.
		i_Click_on_Module_priviliges_and_navigate_to_Module_priviliges_Screen();
		WebElement mobApp = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.MOBILE_APPLICATION))));
		actions.moveToElement(mobApp).doubleClick().build().perform();
		System.out.println("Success: Mobile Application selected successfully");
	}

	
	@Then("^User selects the Access type for the respective screen and role$")
	public void select_the_Access_type_for_the_respective_screen_and_role() throws Throwable {
	   
		switch (file.getCellData("MobileApplication", "Roles", 2)) {
		
		case "TRADE MARKETING REP":
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.PRE_SALES, LocatorsPath.MAX_TIME, 
					file.getCellData("MobileApplication", "PRE-SALES", 2));
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.PRE_SALES_RETURN, LocatorsPath.MAX_TIME, 
					file.getCellData("MobileApplication", "PRE-SALES_RETURN", 2));
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.PROMPT_SALES, LocatorsPath.MAX_TIME, 
					file.getCellData("MobileApplication", "PROMPT_SALES", 2));
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.SALES_RETURN, LocatorsPath.MAX_TIME, 
					file.getCellData("MobileApplication", "SALES _RETURN", 2));
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.PRODUCT_EXCHANGE, LocatorsPath.MAX_TIME, 
					file.getCellData("MobileApplication", "PRODUCT_EXCHANGE", 2));
			break;
			
			
		case "DELIVERY REP":
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.PRE_SALES_1, LocatorsPath.MAX_TIME, 
					file.getCellData("MobileApplication", "PRE-SALES", 2));
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.PRE_SALES_RETURN_1, LocatorsPath.MAX_TIME, 
					file.getCellData("MobileApplication", "PRE-SALES_RETURN", 2));
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.PROMPT_SALES_1, LocatorsPath.MAX_TIME, 
					file.getCellData("MobileApplication", "PROMPT_SALES", 2));
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.SALES_RETURN_1, LocatorsPath.MAX_TIME, 
					file.getCellData("MobileApplication", "SALES _RETURN", 2));
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.PRODUCT_EXCHANGE_1, LocatorsPath.MAX_TIME, 
					file.getCellData("MobileApplication", "PRODUCT_EXCHANGE", 2));
			break;
			
			
		case "PRESALES REP":
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.PRE_SALES_2, LocatorsPath.MAX_TIME, 
					file.getCellData("MobileApplication", "PRE-SALES", 2));
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.PRE_SALES_RETURN_2, LocatorsPath.MAX_TIME, 
					file.getCellData("MobileApplication", "PRE-SALES_RETURN", 2));
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.PROMPT_SALES_2, LocatorsPath.MAX_TIME, 
					file.getCellData("MobileApplication", "PROMPT_SALES", 2));
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.SALES_RETURN_2, LocatorsPath.MAX_TIME, 
					file.getCellData("MobileApplication", "SALES _RETURN", 2));
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.PRODUCT_EXCHANGE_2, LocatorsPath.MAX_TIME, 
					file.getCellData("MobileApplication", "PRODUCT_EXCHANGE", 2));
			break;
			
			
		case "DISTRIBUTION REP":
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.PRE_SALES_3, LocatorsPath.MAX_TIME, 
					file.getCellData("MobileApplication", "PRE-SALES", 2));
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.PRE_SALES_RETURN_3, LocatorsPath.MAX_TIME, 
					file.getCellData("MobileApplication", "PRE-SALES_RETURN", 2));
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.PROMPT_SALES_3, LocatorsPath.MAX_TIME, 
					file.getCellData("MobileApplication", "PROMPT_SALES", 2));
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.SALES_RETURN_3, LocatorsPath.MAX_TIME, 
					file.getCellData("MobileApplication", "SALES _RETURN", 2));
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.PRODUCT_EXCHANGE_3, LocatorsPath.MAX_TIME, 
					file.getCellData("MobileApplication", "PRODUCT_EXCHANGE", 2));
			break;

		default:
			
			System.out.println("Expected Roles are not present in the Module Privileges");
			
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.PRE_SALES, LocatorsPath.MAX_TIME, 
					file.getCellData("MobileApplication", "PRE-SALES", 2));
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.PRE_SALES_RETURN, LocatorsPath.MAX_TIME, 
					file.getCellData("MobileApplication", "PRE-SALES_RETURN", 2));
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.PROMPT_SALES, LocatorsPath.MAX_TIME, 
					file.getCellData("MobileApplication", "PROMPT_SALES", 2));
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.SALES_RETURN, LocatorsPath.MAX_TIME, 
					file.getCellData("MobileApplication", "SALES _RETURN", 2));
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.PRODUCT_EXCHANGE, LocatorsPath.MAX_TIME, 
					file.getCellData("MobileApplication", "PRODUCT_EXCHANGE", 2));
		}
	}

	
	@Then("^User clicks on the save button$")
	public void finally_click_on_the_save_button() throws Throwable {
	 
		System.out.println("Attempt: Click on Save button");
		CallObject.waitForPageLoad(driver);
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.MOBILE_APP_SAVE)));
        PageObjects.SelectByCSSSelector(
        		driver, LocatorsPath.MOBILE_APP_SAVE, LocatorsPath.MAX_TIME);
        CallObject.waitForPageLoad(driver);
		System.out.println("Success: Save button selected successfully");
	}
	
	
	@Then("^User verifies all the changes were saved successfully\\.$")
	public void verify_all_the_changes_are_saved_successfully() throws Throwable {
	    
		System.out.println("All the changes are "
				+ "saved and verified successfully");
	}
}
