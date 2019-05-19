package com.infotech.wc.ui.testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.infotech.Excel.ExcelApiFile;
import com.infotech.basepage.LocatorsPath;
import com.infotech.testrunner.TestRunnerWebClient;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class RcsSaasAdministrationConsolePage extends TestRunnerWebClient{

	public RcsSaasAdministrationConsolePage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
	ExcelApiFile file = new ExcelApiFile("TestData.xlsx");
	WebDriverWait wait = new WebDriverWait(driver, LocatorsPath.MAX_TIME);
	RcsSaasInformationLeakagePage InformationLeakagePage = new RcsSaasInformationLeakagePage();
	
	
	
	/**----------------------VerifyAdministrationConsole--------------------------**/
	
	
	
	@Given("^User enters the following WC URL - https://rcswhmuat\\.rcsoncloud\\.com/manager$")
	public void user_enters_the_following_WC_URL_https_rcswhmuat_rcsoncloud_com_manager() throws Throwable {
	 
		System.out.println("Attempt: enter the WC URL");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get(file.getCellData("Information Leakage", "Admin Console URL", 2));
		System.out.println("Success: WC URL is entered successfully");
	}
	
	
	@Then("^User verifies the WC url is entered successfully$")
	public void user_verifies_the_WC_url_is_entered_successfully() throws Throwable {
	   
		System.out.println("User verifies the WC url is entered successfully");
	}
	

	@Then("^User verifies administration console running on the web server is not accessible\\.$")
	public void user_verifies_administration_console_running_on_the_web_server_is_not_accessible() throws Throwable {
	 
		System.out.println("Attempt: verify administration console running on the web server is not accessible");
		InformationLeakagePage.
		user_verifies_a_error_message_like_Error_Not_found_I_have_no_idea_where_that_file_is_sorry_Are_you_sure_you_typed_in_the_correct_URL_should_be_displayed_on_the_screen(0);
		System.out.println("Success: verified the administration console running on the web server is not accessible");
	}
}
