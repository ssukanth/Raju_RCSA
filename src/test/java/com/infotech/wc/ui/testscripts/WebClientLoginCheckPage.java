package com.infotech.wc.ui.testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.infotech.Excel.ExcelApiFile;
import com.infotech.Excel.WriteExcelFile;
import com.infotech.basepage.CallObject;
import com.infotech.basepage.LocatorsPath;
import com.infotech.basepage.PageObjects;
import com.infotech.testrunner.TestRunnerWebClient;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class WebClientLoginCheckPage extends TestRunnerWebClient{


	public WebClientLoginCheckPage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
	ExcelApiFile file = new ExcelApiFile("MobileLoginCheckData.xlsx");
	WriteExcelFile writeExcelFile = new WriteExcelFile("MobileLoginCheckData.xlsx");
	WebDriverWait wait = new WebDriverWait(driver, LocatorsPath.MAX_TIME);
	

	
	
	/**------------------------WC Login Check--------------------------**/
	
	
	
	
	@Given("^Login to the RCS(\\d+) SaaS WC as a Admin$")
	public void login_to_the_RCS_SaaS_WC_as_a_Admin(int arg1) throws Throwable {

				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.get(file.getCellData("WebClientLogin", "URL", 2));
				
			for(int i=2; i<=32; i++) {
				try {
					PageObjects.SelectByCSSSelectorWithSendKeys(
							driver, LocatorsPath.LOGIN_USERNAME, LocatorsPath.MAX_TIME, 
							file.getCellData("WebClientLogin", "LoginUserName", i));
					PageObjects.SelectByCSSSelectorWithSendKeys(
							driver, LocatorsPath.LOGIN_PASSWORD, LocatorsPath.MAX_TIME, 
							file.getCellData("WebClientLogin", "LoginPassword", i));
					PageObjects.SelectByCSSSelector(
							driver, LocatorsPath.LOGIN, LocatorsPath.MAX_TIME);
					
					try {
						
						PageObjects.SelectByCSSSelectorWithoutClick(
								driver, LocatorsPath.CONFIGURATION, LocatorsPath.MAX_TIME);
						
						PageObjects.SelectByCSSSelector(
								driver, LocatorsPath.LOGOUT, LocatorsPath.MAX_TIME);
				        CallObject.switchToAlert(driver);
				        
				        writeExcelFile.setCellData("WebClientLogin", 3, i-1, "Login Success");
						System.out.println("Login was Successful - " +file.getCellData("WebClientLogin", "LoginUserName", i));
						
					} catch (Exception e) {
						writeExcelFile.setCellData("WebClientLogin", 3, i-1, "Login Failed");
						System.err.println("Login was Failed - " +file.getCellData("WebClientLogin", "LoginUserName", i));
					}
				} catch (Exception e) {
					System.out.println("No records found from the row -"+i);
					driver.quit();
			    }
		  }
	}

	
	@Then("^User verifies the WC login screen is displayed successfully$")
	public void user_verifies_the_WC_login_screen_is_displayed_successfully() throws Throwable {

		System.out.println("User verifies the WC login screen is displayed successfully");
	}
}
