package com.infotech.wc.ui.testscripts;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.infotech.Excel.ExcelApiFile;
import com.infotech.basepage.CallObject;
import com.infotech.basepage.LocatorsPath;
import com.infotech.basepage.PageObjects;
import com.infotech.testrunner.TestRunnerWebClient;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RcsSaasConfigurationUsersPage extends TestRunnerWebClient{

	public RcsSaasConfigurationUsersPage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
	ExcelApiFile file = new ExcelApiFile("TestData.xlsx");
	Actions actions = new Actions(driver);
	WebDriverWait  wait = new WebDriverWait(driver, LocatorsPath.MAX_TIME);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	
	
	/**----------------------RCS SAAS Configuration Organization Login_WC--------------------------**/
	
	
	
	private static boolean flag = false;
	
	@Given("^Login to the WebClient$")
	public void i_Login_to_the_WC() throws Throwable {
	   
		if(flag==false) {
		flag=true;
			System.out.println("Attempt: Login to the WC");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.get(file.getCellData("Login", "URL", 2));
			System.out.println("Success: Able to Login to the WC successfully");
			
			System.out.println("Attempt: Provide Valid Admin Credentials");
			/*wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
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
				wait.until(ExpectedConditions.presenceOfElementLocated(
						By.cssSelector(LocatorsPath.BLOCK_CAPTCHA))).click();
				Thread.sleep(3000);
			}else {
				Assert.fail("No captcha found......");
			}*/
			
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.LOGIN_USERNAME, LocatorsPath.MAX_TIME, 
					file.getCellData("Login", "LoginUserName", 2));
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.LOGIN_PASSWORD, LocatorsPath.MAX_TIME, 
					file.getCellData("Login", "LoginPassword", 2));
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.LOGIN, LocatorsPath.MAX_TIME);
			System.out.println("Success: Able to login with the Admin Credentials successfully");
		}
	}

	
	@When("^User Provides the valid Admin credentials$")
	public void i_provide_valid_Admin_credentials() throws Throwable {

		System.out.println("valid Admin credentials provided");
	}
	
	
	@Then("^The User should be successfully logged into the Application$")
	public void the_User_should_be_successfully_logged_into_the_Application() throws Throwable {
	    
		System.out.println("User should be successfully "
				+ "logged into the Application");
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
	
	
	@Then("^User clicks on 'Users' tab and navigates to Users screen$")
	public void i_Click_on_Users_Menu() throws Throwable {
	    
		System.out.println("Attempt: Click on Users Menu");
		/*WebElement users = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(USERS))));
		actions.moveToElement(users).doubleClick().build().perform();*/
		PageObjects.SelectByXpath(
				driver, LocatorsPath.USERS, LocatorsPath.MAX_TIME);
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.USERS_DISPLAY, LocatorsPath.MAX_TIME);
		System.out.println("Success: Users Menu selected successfully");
	}

	
	@Then("^User clicks on Add button and navigate to Add New User screen$")
	public void i_Click_on_Add_button() throws Throwable {
	    
		System.out.println("Attempt: Click on Add button");
		CallObject.waitForPageLoad(driver);
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.ADD)));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ADD, LocatorsPath.MAX_TIME);
		System.out.println("Success: Add button selected successfully");
	}
	

	@Then("^User enters the 'Employee ID'$")
	public void enter_the_field_Employee_ID() throws Throwable {
	   
		System.out.println("Attempt: Enter the field - 'Employee ID'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.EMPLOYEE_ID, LocatorsPath.MAX_TIME, 
				file.getCellData("Configuration", "EmployeeID", 2));
		System.out.println("Success: 'Employee ID' entered successfully");
	}

	
	@Then("^User enters the 'First Name'$")
	public void enter_the_field_First_Name() throws Throwable {
	  
		System.out.println("Attempt: Enter the field - 'First Name'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.FIRST_NAME, LocatorsPath.MAX_TIME, 
				file.getCellData("Configuration", "FirstName", 2));
		System.out.println("Success: 'First Name' entered successfully");
	}

	
	@Then("^User enters the 'Last Name'$")
	public void enter_the_field_Last_Name() throws Throwable {
	   
		System.out.println("Attempt: Enter the field - 'Last Name'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.LAST_NAME, LocatorsPath.MAX_TIME, 
				file.getCellData("Configuration", "LastName", 2));
		System.out.println("Success: 'Last Name' entered successfully");
	}

	
	@Then("^User enters the 'User Name'$")
	public void enter_the_field_User_Name() throws Throwable {
	
		System.out.println("Attempt: Enter the field - 'User Name'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.USER_NAME, LocatorsPath.MAX_TIME, 
				CallObject.timestamp().concat("_user"));
		file.setCellData("Configuration", "UserName", 2, 
				CallObject.timestamp().concat("_user"));
		System.out.println("Success: 'User Name' entered successfully");
	}

	
	@Then("^User selects the 'Role' dropDown$")
	public void select_the_Role_dropDown() throws Throwable {
	    
		System.out.println("Attempt: Select the 'Role' dropDown");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ROLE, LocatorsPath.MAX_TIME, 
				file.getCellData("Configuration", "Role", 2));
		System.out.println("Success: 'Role' dropDown selected successfully");
	}

	
	@Then("^User selects the 'Status' dropDown$")
	public void select_the_Status_dropDown() throws Throwable {
	    
		System.out.println("Attempt: Select the 'Status' dropDown");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.USER_STATUS, LocatorsPath.MAX_TIME, 
				file.getCellData("Configuration", "Status", 2));
		System.out.println("Success: 'Status' dropDown selected successfully");
	}

	
	@Then("^User enters the 'Address'$")
	public void enter_the_field_Address() throws Throwable {
	   
		System.out.println("Attempt: Enter the field - 'Address'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ADDRESS, LocatorsPath.MAX_TIME, 
				file.getCellData("Configuration", "Address", 2));
		System.out.println("Success: 'Address' entered successfully");
	}

	
	@Then("^User enters the 'Valid Email'$")
	public void enter_the_field_Valid_Email() throws Throwable {
	  
		System.out.println("Attempt: Enter the field - 'Valid Email'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.EMAIL, LocatorsPath.MAX_TIME, 
				file.getCellData("Configuration", "Email", 2));
		System.out.println("Success: 'Valid Email' entered successfully");
	}
	

	@Then("^User clicks on Save button and the data should be saved successfully and the user should be able to get the Email/OTP\\.$")
	public void i_Click_on_Save_button() throws Throwable {
	   
		System.out.println("Attempt: Click on Save button");
		CallObject.waitForPageLoad(driver);
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.SAVE)));
        PageObjects.SelectByCSSSelector(
        		driver, LocatorsPath.SAVE, LocatorsPath.MAX_TIME);
        CallObject.waitForPageLoad(driver);
		throwError();
		
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.USER_NAME_DISP, LocatorsPath.MAX_TIME, 
				file.getCellData("Configuration", "UserName", 2));
		CallObject.block(3000);
		WebElement userName = driver.findElement(
				By.cssSelector(LocatorsPath.USER_NAME_VERIFY));
		Assert.assertEquals(file.getCellData("Configuration", "UserName", 2), 
				userName.getText());
		/*CallObject.block(3000);
		PageObjects.SelectByCSSSelector(
				driver, DELETE, LocatorsPath.MAX_TIME);
		CallObject.switchToAlert(driver);*/
		System.out.println("Success: Save button selected successfully");
	}
	
	
	public void throwError() throws Exception {
		
		if(driver.getPageSource().contains("User Name already exists.")) {
			CallObject.waitForPageLoad(driver);
			System.err.println("User Name already exists, please change the UserName");
			Assert.fail("User Name already exists, please change the UserName");
		}
	}
}
