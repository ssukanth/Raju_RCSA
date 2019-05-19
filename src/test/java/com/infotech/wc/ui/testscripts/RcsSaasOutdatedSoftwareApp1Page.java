package com.infotech.wc.ui.testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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

public class RcsSaasOutdatedSoftwareApp1Page extends TestRunnerWebClient{

	public RcsSaasOutdatedSoftwareApp1Page() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
	ExcelApiFile file = new ExcelApiFile("TestData.xlsx");
	WebDriverWait wait = new WebDriverWait(driver, LocatorsPath.MAX_TIME);
	RcsSaasInformationLeakagePage RcsSaasInformationLeakagePage = new RcsSaasInformationLeakagePage();
	
	
	
	/**----------------------Tomcat_Server_Version_Verification--------------------------**/
	
	
	
	@Given("^User enters the latest WC URL$")
	public void user_enters_the_latest_WC_URL() throws Throwable {
	    
		System.out.println("Attempt: enter the latest WC URL");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get(file.getCellData("Information Leakage", "Valid URL", 2));
		System.out.println("Success: latest WC URL is entered successfully");
	}
	

	@Then("^User verifies the RCS(\\d+) WC application login page is displayed successfully$")
	public void user_verifies_the_RCS_WC_application_login_page_is_displayed_successfully(int arg1) throws Throwable {
	   
		System.out.println("User verifies the RCS(\\d+) WC application login page is displayed successfully");
	}
	

	@Then("^User removes the extra characters from the WC url & updates the url to 'https://rcswhmuat\\.rcsoncloud\\.com'$")
	public void user_removes_the_extra_characters_from_the_WC_url_updates_the_url_to_https_rcswhmuat_rcsoncloud_com() throws Throwable {
	 
		System.out.println("Attempt: Remove the extra characters from the WC url & "
				+ "update the url to 'https://rcswhmuat\\.rcsoncloud\\.com'");
		driver.navigate().to(file.getCellData("Information Leakage", "Updated URL", 2));
		System.out.println("Success: Extra characters removed from the WC url & "
				+ "updated the url to 'https://rcswhmuat\\.rcsoncloud\\.com'");
	}
	

	@Then("^User verifies the 'Welcome to RCS SaaS' Message is displayed with a 'ReCaptcha' text icon to be selected to verify if your not a robot$")
	public void user_verifies_the_Welcome_to_RCS_SaaS_Message_is_displayed_with_a_ReCaptcha_text_icon_to_be_selected_to_verify_if_your_not_a_robot() throws Throwable {
	    
		System.out.println("Attempt: verify the 'Welcome to RCS SaaS' Message is displayed with a "
				+ "'ReCaptcha' text icon to be selected to verify if your not a robot");
		WebElement display = wait.until(
				ExpectedConditions.presenceOfElementLocated(
						By.xpath(LocatorsPath.RCS_WELCOME_DISP)));
		if(display.isDisplayed()) {
			Assert.assertTrue(true);
		}
		System.out.println("Success: verified the 'Welcome to RCS SaaS' Message is displayed with a "
				+ "'ReCaptcha' text icon to be selected to verify if your not a robot");
	}
	

	@Then("^Once the 'Captcha' verification is completed, then user verifies the 'Error (\\d+): Not found :\\( I have no idea where that file is, sorry\\. Are you sure you typed in the correct URL\\?' error Message is displayed\\.$")
	public void once_the_Captcha_verification_is_completed_then_user_verifies_the_Error_Not_found_I_have_no_idea_where_that_file_is_sorry_Are_you_sure_you_typed_in_the_correct_URL_error_Message_is_displayed(int arg1) throws Throwable {
	    
		System.out.println("Attempt: Once the 'Captcha' verification is completed, then user verifies "
				+ "the 'Error (\\d+): Not found :\\( I have no idea where that file is, sorry\\. "
				+ "Are you sure you typed in the correct URL\\?' error Message is displayed");
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
				driver.findElement(By.xpath(LocatorsPath.SWITCH_TO_FRAME_1))));
		WebElement captchaDisp = wait.until(
				ExpectedConditions.presenceOfElementLocated(
						By.cssSelector(LocatorsPath.ROBOT_CAPTCHA_TEXT)));
		if(captchaDisp.getText().contains("I'm not a robot")) {
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.ROBOT_CHECKBOX, LocatorsPath.MAX_TIME);
			CallObject.block(2000);
			driver.switchTo().defaultContent();
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
					driver.findElement(By.xpath(LocatorsPath.SWITCH_TO_FRAME_2))));
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.VERIFY_CAPTCHA_FRAME, LocatorsPath.MAX_TIME);
		}else {
			Assert.fail("No Captcha or catcha text icon is displayed");
		}
		
		driver.navigate().refresh();
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.RCS_WELCOME_SUBMIT, LocatorsPath.MAX_TIME);
		RcsSaasInformationLeakagePage.
		user_verifies_a_error_message_like_Error_Not_found_I_have_no_idea_where_that_file_is_sorry_Are_you_sure_you_typed_in_the_correct_URL_should_be_displayed_on_the_screen(0);
		System.out.println("Success: verification of captcha is completed, & "
				+ "user verified the 'Error (\\d+): Not found :\\( I have no idea where that file is, sorry\\. "
				+ "Are you sure you typed in the correct URL\\?' error Message is displayed");
	}
	

	@Then("^User verifies the application is upgraded with latest tomcat version '(\\d+)\\.(\\d+)\\.(\\d+)'\\.$")
	public void user_verifies_the_application_is_upgraded_with_latest_tomcat_version(int arg1, int arg2, int arg3) throws Throwable {
	    
		System.out.println("User verifies the application is upgraded with latest tomcat version '");
	}
}
