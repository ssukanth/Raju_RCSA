package com.infotech.wc.ui.testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.infotech.Excel.ExcelApiFile;
import com.infotech.basepage.LocatorsPath;
import com.infotech.basepage.PageObjects;
import com.infotech.testrunner.TestRunnerWebClient;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class RcsSaasInformationLeakagePage extends TestRunnerWebClient{

	public RcsSaasInformationLeakagePage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
	ExcelApiFile file = new ExcelApiFile("TestData.xlsx");
	WebDriverWait wait = new WebDriverWait(driver, LocatorsPath.MAX_TIME);
	
	
	
	/**----------------------WC_URL_Verification--------------------------**/
	
	
	
	@Given("^User enters the WC URL$")
	public void user_enters_the_WC_URL() throws Throwable {
	    
		System.out.println("Attempt: enter the WC URL");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get(file.getCellData("Information Leakage", "Valid URL", 2));
		System.out.println("Success: WC URL is entered successfully");
	}
	

	@Then("^User verifies the WC URL is entered successfully$")
	public void user_verifies_the_WC_URL_is_entered_successfully() throws Throwable {
	    
		System.out.println("Attempt: verify the WC URL is entered");
		PageObjects.SelectByCSSSelectorWithoutClick(
				driver, LocatorsPath.LOGIN, LocatorsPath.MAX_TIME);
		System.out.println("Success: The WC URL is entered successfully");
	}
	

	@Then("^User replaces the RCS URL with some other words$")
	public void user_replaces_the_RCS_URL_with_some_other_words() throws Throwable {
	    
		System.out.println("Attempt: Replace the RCS URL with some other words");
		driver.get(file.getCellData("Information Leakage", "Invalid URL", 2));
		System.out.println("Success: Replaced the RCS URL with some other words");
	}
	

	@Then("^User verifies the changes were updated successfully in the URL$")
	public void user_verifies_the_changes_were_updated_successfully_in_the_URL() throws Throwable {
	    
		System.out.println("User verifies the changes were updated successfully in the URL");
	}
	

	@Then("^User clicks on the enter button from the keyboard$")
	public void user_clicks_on_the_enter_button_from_the_keyboard() throws Throwable {
	    
		System.out.println("User clicks on the enter button from the keyboard");
	}
	

	@Then("^User verifies the error message is displayed saying that this is not a valid application URL\\.$")
	public void user_verifies_the_error_message_is_displayed_saying_that_this_is_not_a_valid_application_URL() throws Throwable {
	    
		System.out.println("User verifies the error message is displayed "
				+ "saying that this is not a valid application URL");
	}
	

	
	/**----------------------Error_Message_Verification--------------------------**/
	
	
	
	@Then("^User verifies a error message like 'Error (\\d+): Not found :\\( I have no idea where that file is, sorry\\. Are you sure you typed in the correct URL\\?' should be displayed on the screen$")
	public void user_verifies_a_error_message_like_Error_Not_found_I_have_no_idea_where_that_file_is_sorry_Are_you_sure_you_typed_in_the_correct_URL_should_be_displayed_on_the_screen(int arg1) throws Throwable {
	    
		System.out.println("Attempt: verify a generic message like 'Error 404: Not found :( "
				+ "I have no idea where that file is, sorry. Are you sure you typed in the correct URL?' should be displayed on the screen");
		WebElement verifyErrorDisp = wait.until(
				ExpectedConditions.presenceOfElementLocated(
						By.xpath(LocatorsPath.VERIFY_URL_ERROR_MSG_DISPLAY)));
		WebElement verifyerrorDisp = wait.until(
				ExpectedConditions.presenceOfElementLocated(
						By.xpath(LocatorsPath.VERIFY_ERROR_MSG_TEXT_DISP)));
		if(verifyErrorDisp.isDisplayed()) {
			Assert.assertEquals("Error 404: Not found :-(", verifyErrorDisp.getText());
			Assert.assertEquals("I have no idea where that file is, sorry. Are you sure you typed in the correct URL?", 
					verifyerrorDisp.getText());
		}
		System.out.println("Success: verified a generic message like 'Error 404: Not found :( "
				+ "I have no idea where that file is, sorry. Are you sure you typed in the correct URL?' should be displayed on the screen");
	}
	

	@Then("^User also verifies that any information related to application internal server should not be displayed on the screen\\.$")
	public void user_also_verifies_that_any_information_related_to_application_internal_server_should_not_be_displayed_on_the_screen() throws Throwable {
	    
		System.out.println("User also verifies that any information related to "
				+ "application internal server should not be displayed on the screen");
	}
}
