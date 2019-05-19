package com.infotech.wc.ui.testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

public class RcsSaasNewUserLoginPage extends TestRunnerWebClient{
	
	public RcsSaasNewUserLoginPage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
	ExcelApiFile file = new ExcelApiFile("TestData.xlsx");
	Actions actions = new Actions(driver);
	WebDriverWait  wait = new WebDriverWait(driver, LocatorsPath.MAX_TIME);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	
	
	/**----------------------RCS_SaaS_Verify_New_User_WC--------------------------**/
	
	
	
	@Given("^User enters the URL which was received through mail$")
	public void user_enters_the_URL_which_was_received_through_mail() throws Throwable {
	    
		System.out.println("Attempt: Login to the WC");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get(file.getCellData("Login", "URL", 2));
		System.out.println("Success: Able to Login to the WC successfully");
	}
	

	@Then("^User enters the User name and password which was received through mail & clicks on the Login button$")
	public void user_enters_the_User_name_and_password_which_was_received_through_mail_clicks_on_the_Login_button() throws Throwable {
	    
		System.out.println("Attempt: Provide Valid Admin Credentials");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.LOGIN_USERNAME, LocatorsPath.MAX_TIME, 
				file.getCellData("Login", "LoginUserName", 2));
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.LOGIN_PASSWORD, LocatorsPath.MAX_TIME, 
				file.getCellData("Login", "LoginPassword", 3));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.LOGIN, LocatorsPath.MAX_TIME);
		System.out.println("Success: Able to login with the Admin Credentials successfully");
	}
	

	@Then("^User navigates to the welcome screen & verifies the message is displayed as 'You password has expired Click here to change your password'$")
	public void user_navigates_to_the_welcome_screen_verifies_the_message_is_displayed_as_You_password_has_expired_Click_here_to_change_your_password() throws Throwable {
	    
		System.out.println("Attempt: navigate to the welcome screen & verify the message is "
				+ "displayed as 'You password has expired Click here to change your password'");
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.WELCOME_DISP, LocatorsPath.MAX_TIME);
		
		WebElement pwd = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.PASSWORD_EXP_DISP))));
		Assert.assertEquals("You password has expired.", pwd.getText());
		
		WebElement click = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.CLICK_HERE_DISP))));
		Assert.assertEquals("Click here", click.getText());
		
		WebElement changePwd = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.CHANGE_PWD_DISP))));
		Assert.assertEquals("Click hereto change your password", changePwd.getText());
		
		System.out.println("Success: navigated to the welcome screen & verified the message is "
				+ "displayed as 'You password has expired Click here to change your password'");
	}
	

	@Then("^User clicks on the link & navigates to the Change Password screen$")
	public void user_clicks_on_the_link_navigates_to_the_Change_Password_screen() throws Throwable {
	    
		System.out.println("Attempt: click on the link & "
				+ "navigate to the Change Password screen");
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.CLICK_HERE_DISP)))).click();
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.CHANGE_PWD_DISP_1, LocatorsPath.MAX_TIME);
		System.out.println("Success: clicked on the link & "
				+ "navigated to the Change Password screen");
	}
	

	@Then("^User verifies that the 'User name' is auto populated$")
	public void user_verifies_that_the_User_name_is_auto_populated() throws Throwable {
	    
		System.out.println("Attempt: verify that the 'User name' is auto populated");
		WebElement userName = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.CURRENT_USERNAME))));
		Assert.assertEquals(file.getCellData("Login", "LoginUserName", 2), 
				userName.getText());
		System.out.println("Success: verified that the 'User name' is auto populated");
	}
	

	@Then("^User enters the Old Password which was received through mail$")
	public void user_enters_the_Old_Password_which_was_received_through_mail() throws Throwable {
	 
		System.out.println("Attempt: enter the Old Password which was received through mail");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.CURRENT_PASSWORD, LocatorsPath.MAX_TIME, 
				file.getCellData("Login", "LoginPassword", 3));
		System.out.println("Success: entered the Old Password which was received through mail");
	}
	

	@Then("^User enters the New Password and Confirms the New Password fields$")
	public void user_enters_the_New_Password_and_Confirms_the_New_Password_fields() throws Throwable {
	   
		System.out.println("Attempt: enter the New Password and Confirm the New Password fields");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.RESET_PASSWORD, LocatorsPath.MAX_TIME, 
				file.getCellData("Login", "LoginPassword", 2));
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.CONFIRM_PASSWORD, LocatorsPath.MAX_TIME, 
				file.getCellData("Login", "LoginPassword", 2));
		System.out.println("Success: entered the New Password and Confirmed the New Password fields");
	}
	

	@Then("^User clicks on save button & verifies that the new user details is saved successfully$")
	public void user_clicks_on_save_button_verifies_that_the_new_user_details_is_saved_successfully() throws Throwable {
	    
		System.out.println("Attempt: click on save button & "
				+ "verify that the new user details is saved successfully");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.NEW_USER_SAVE, LocatorsPath.MAX_TIME);
		System.out.println("Success: clicked on save button & "
				+ "verified that the new user details is saved successfully");
	}
	

	@Then("^User verifies that the 'Welcome to RCS(\\d+) Data Entry Module' screen is displayed successfully$")
	public void user_verifies_that_the_Welcome_to_RCS_Data_Entry_Module1_screen_is_displayed_successfully(int arg1) throws Throwable {
	    
		System.out.println("Attempt: verify that the 'Welcome to RCS(\\d+) "
				+ "Data Entry Module' screen is displayed successfully");
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.RCS8_DISP, LocatorsPath.MAX_TIME);
		logOut();
		System.out.println("Success: verified that the 'Welcome to RCS(\\d+) "
				+ "Data Entry Module' screen is displayed successfully");
	}
	

	@Then("^User enters the valid URL and enters the newly created Username and Password & then clicks on Login$")
	public void user_enters_the_valid_URL_and_enters_the_newly_created_Username_and_Password_then_clicks_on_Login() throws Throwable {
	    
		System.out.println("Attempt: enter the valid URL and enter the newly "
				+ "created Username and Password & then click on Login");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.LOGIN_USERNAME, LocatorsPath.MAX_TIME, 
				file.getCellData("Organisation", "UserName", 2));
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.LOGIN_PASSWORD, LocatorsPath.MAX_TIME, 
				file.getCellData("Login", "LoginPassword", 2));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.LOGIN, LocatorsPath.MAX_TIME);
		System.out.println("Success: entered the valid URL and entered the newly "
				+ "created Username and Password & then clicked on Login");
	}
	

	@Then("^User verifies that the 'Welcome to RCS(\\d+) Data Entry Module' screen is displayed successfully\\.$")
	public void user_verifies_that_the_Welcome_to_RCS_Data_Entry_Module2_screen_is_displayed_successfully(int arg1) throws Throwable {
	    
		System.out.println("Attempt: verify that the 'Welcome to RCS(\\d+) "
				+ "Data Entry Module' screen is displayed successfully");
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.RCS8_DISP, LocatorsPath.MAX_TIME);
		System.out.println("Success: verified that the 'Welcome to RCS(\\d+) "
				+ "Data Entry Module' screen is displayed successfully");
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
