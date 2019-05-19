package com.infotech.wc.ui.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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

public class RcsSaasAuthorizationPage extends TestRunnerWebClient{

	WebDriver driver = getDriver();
	Actions actions = new Actions(driver);
	ExcelApiFile file1 = new ExcelApiFile("TestData1.xlsx");
	WebDriverWait wait = new WebDriverWait(driver, LocatorsPath.MAX_TIME);

	
	public RcsSaasAuthorizationPage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	/**----------------------RCS SAAS Authorization_WC--------------------------**/
	
	
	
	@Then("^User clicks on Authorization$")
	public void user_clicks_on_Authorization() throws Throwable {
	    
		System.out.println("Attempt: Click on Authorization Menu");
		WebElement authorization = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.AUTHORIZATION))));
		actions.moveToElement(authorization).doubleClick().build().perform();
		System.out.println("Success: Authorization Menu selected successfully");
	}

	
	@Then("^The User should be navigated to Authorization screen successfully$")
	public void the_User_should_be_navigated_to_Authorization_screen_successfully() throws Throwable {
	 
		System.out.println("User should be navigated to Authorization screen successfully");
	}
	

	@Then("^User enters the 'Transaction Number'$")
	public void user_enters_the_Transaction_Number() throws Throwable {
	    
		System.out.println("Attempt: enter the field - 'Transaction Number'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.TRANSACTION_NUMBER, LocatorsPath.MAX_TIME,
				file1.getCellData("Authorization", "Transaction Number", 2));
		System.out.println("Success: 'Transaction Number' entered successfully");
	}
	

	@Then("^User selects the 'Transaction Type'$")
	public void user_selects_the_Transaction_Type() throws Throwable {
	    
		System.out.println("Attempt: Select the 'Transaction Type'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.TRANSACTION_TYPE, LocatorsPath.MAX_TIME,
				file1.getCellData("Authorization", "Transaction Type", 2));
		CallObject.waitForPageLoad(driver);
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.TRANSACTION_TYPE, LocatorsPath.MAX_TIME,
				file1.getCellData("Authorization", "Transaction Type", 2));
		System.out.println("Success: 'Transaction Type' selected successfully");
	}
	

	@Then("^User clicks on 'Generate' button$")
	public void user_clicks_on_Generate_button() throws Throwable {
	    
		System.out.println("Attempt: Click on 'Generate' button");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.GENERATE, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Generate' button clicked successfully");
	}
	

	@Then("^User verifies that the 'Authentication Code' is generated in the Authorization screen$")
	public void user_verifies_that_the_Authentication_Code_is_generated_in_the_Authorization_screen() throws Throwable {
	    
		System.out.println("Attempt: Verify that the 'Authentication Code' is generated");
		CallObject.waitForPageLoad(driver);
		WebElement code = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.AUTHENTICATION_CODE))));
		file1.setCellData("Authorization", "Authentication Code", 2, code.getText());
		System.out.println(file1.getCellData("Authorization", "Authentication Code", 2));
		Assert.assertEquals(code.getText(), 
				file1.getCellData("Authorization", "Authentication Code", 2));
		System.out.println("Success: 'Authentication Code' is generated successfully");
	}
}
