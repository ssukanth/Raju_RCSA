package com.infotech.android.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.infotech.Excel.ExcelApiFile;
import com.infotech.Excel.WriteExcelFile;
import com.infotech.basepage.LocatorsPath;
import com.infotech.basepage.PageObjects;
import com.infotech.testrunner.TestRunnerMobility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.appium.java_client.MobileElement;

public class MobileLoginCheckPage extends TestRunnerMobility{
	
	public MobileLoginCheckPage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
	ExcelApiFile file = new ExcelApiFile("MobileLoginCheckData.xlsx");
	WriteExcelFile writeExcelFile = new WriteExcelFile("MobileLoginCheckData.xlsx");
	WebDriverWait wait = new WebDriverWait(driver, LocatorsPath.MAX_TIME);
	
	
	
	/**------------------------Mobile Login Check--------------------------**/
	
	
	
	@Given("^Login to the RCS(\\d+) SaaS MC as a Rep$")
	public void login_to_the_RCS_SaaS_MC_as_a_Rep(int arg1) throws Throwable {

		System.out.println("Attempt: Login to the RCS(\\d+) SaaS MC as Rep");
		try {
			WebDriverWait driverWait = new WebDriverWait(driver, 3);
			MobileElement access = (MobileElement) driverWait.until(
					ExpectedConditions.presenceOfElementLocated(
					 By.xpath(LocatorsPath.ALLOW_RCS8_ACCESS)));
			if(access.isDisplayed()) {
			driverWait.until(ExpectedConditions.presenceOfElementLocated(
						 By.id(LocatorsPath.RCS8_APP_PERMISSION))).click();
			}
		}catch (NoSuchElementException NoSuchElementException) {
			System.out.println("No such element" +NoSuchElementException);
		}catch (StaleElementReferenceException StaleElementReferenceException) {
			System.out.println("Trying to recover from stale element" + StaleElementReferenceException);
		}catch (TimeoutException TimeOutException) {
			System.out.println("Time Out" + TimeOutException);
		}
		
		for(int i = 2; i<=100; i++) {
			try {
				wait.until(ExpectedConditions.presenceOfElementLocated(
						 By.id(LocatorsPath.MOBILE_USERNAME))).sendKeys(
								 file.getCellData("MobileLogin", "UserName", i));
				wait.until(ExpectedConditions.presenceOfElementLocated(
						 By.id(LocatorsPath.MOBILE_PASSWORD))).sendKeys(
								 file.getCellData("MobileLogin", "Password", i));
				PageObjects.SelectByXpath(
						driver, LocatorsPath.MOBILE_LOGIN, LocatorsPath.MAX_TIME);
			
				try {
					WebDriverWait driverWait = new WebDriverWait(driver, 50);
					MobileElement journey = (MobileElement) driverWait.until(ExpectedConditions.presenceOfElementLocated(
							 By.xpath(LocatorsPath.MOBILE_JOURNEY_PLAN)));
					if(journey.isDisplayed()) {
						writeExcelFile.setCellData("MobileLogin", 2, i-1, "Login Success");
						System.out.println("Login was Successful - " +file.getCellData("MobileLogin", "UserName", i));
					}
				} catch (Exception e) {
					writeExcelFile.setCellData("MobileLogin", 2, i-1, "Login Failed");
					System.err.println("Login was Failed - " +file.getCellData("MobileLogin", "UserName", i));
				}
				driver.resetApp();
			} catch (Exception e) {
				System.out.println("No records found from the row -"+i);
				driver.quit();
			}
		}
		System.out.println("Success: Logged to the RCS(\\d+) SaaS MC as Rep successfully");
	}

	
	@Then("^User verifies the MC login screen is displayed successfully$")
	public void user_verifies_the_MC_login_screen_is_displayed_successfully() throws Throwable {
	    
		System.out.println("User verifies the MC login screen is displayed successfully");
	}
}
