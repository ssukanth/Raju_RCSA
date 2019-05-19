package com.infotech.android.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.infotech.Excel.ExcelApiFile;
import com.infotech.basepage.CallObject;
import com.infotech.basepage.LocatorsPath;
import com.infotech.basepage.PageObjects;
import com.infotech.testrunner.TestRunnerMobility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.appium.java_client.MobileElement;

public class SusMislaneousInvIbPage extends TestRunnerMobility{
	
	/*public SusMislaneousInvIbPage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
	ExcelApiFile file = new ExcelApiFile("MobileTestData.xlsx");
	WebDriverWait wait = new WebDriverWait(driver, LocatorsPath.MAX_TIME);
	
	
	
	
	*//**----------------------1451_Create_Data_RCS--------------------------**//*
	
	
	
	@Given("^Login to the RCS(\\d+) SaaS MC as Rep$")
	public void login_to_the_RCS_SaaS_MC_as_Rep(int arg1) throws Throwable {
	    
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
		
		wait.until(ExpectedConditions.presenceOfElementLocated(
				 By.id(LocatorsPath.MOBILE_USERNAME))).sendKeys(
						 file.getCellData("Login", "UserName", 2));
		wait.until(ExpectedConditions.presenceOfElementLocated(
				 By.id(LocatorsPath.MOBILE_PASSWORD))).sendKeys(
						 file.getCellData("Login", "Password", 2));
		PageObjects.SelectByXpath(
				driver, LocatorsPath.MOBILE_LOGIN, LocatorsPath.MAX_TIME);
		System.out.println("Success: Logged to the RCS(\\d+) SaaS MC as Rep successfully");
	}
	

	@Then("^User verifies the MC login screen is displayed successfully$")
	public void user_verifies_the_MC_login_screen_is_displayed_successfully() throws Throwable {
		
		PageObjects.SelectByXpath(
				driver, LocatorsPath.MOBILE_JOURNEY_PLAN, LocatorsPath.MAX_TIME);
		
		 wait.until(ExpectedConditions.presenceOfElementLocated(
				 By.id(LocatorsPath.MOBILE_EXP_MENU_LIST))).click();
		 
		 wait.until(ExpectedConditions.presenceOfElementLocated(
				 By.id(LocatorsPath.ADD_OUTLET_NAME))).click();
		 
		 driver.findElementByAndroidUIAutomator(
				 "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().index(0).instance(0))").click();
		 
		 PageObjects.SelectByXpath(
				 driver, LocatorsPath.MOBILE_SUBMIT, LocatorsPath.MAX_TIME);
		 
		 try {
				WebDriverWait driverWait = new WebDriverWait(driver, 3);
				driverWait.until(ExpectedConditions.presenceOfElementLocated(
						 By.xpath(LocatorsPath.MOBILE_OK_POPUP))).click();
			} catch (NoSuchElementException NoSuchElementException) {
				System.out.println("No such element" +NoSuchElementException);
			}catch (StaleElementReferenceException StaleElementReferenceException) {
				System.out.println("Trying to recover from stale element" + StaleElementReferenceException);
			}catch (TimeoutException TimeOutException) {
				System.out.println("Time Out" + TimeOutException);
			}
		 
		 try {
				WebDriverWait driverWait = new WebDriverWait(driver, 3);
				PageObjects.SelectByXpath(
						driver, LocatorsPath.START_VISIT_BUTTON, LocatorsPath.MAX_TIME);
				
				MobileElement confirm = (MobileElement) driverWait.until(ExpectedConditions.presenceOfElementLocated(
						 By.xpath(LocatorsPath.START_VISIT_BUTTON_QUERY)));
				if(confirm.isDisplayed()) {
					PageObjects.SelectByXpath(
							driver, LocatorsPath.MOBILE_OK_POPUP_1, LocatorsPath.MAX_TIME);

					CallObject.block(3000);
					PageObjects.SelectByXpath(
							driver, LocatorsPath.EXPAND_MENU_ID, LocatorsPath.MAX_TIME);
					 
					 CallObject.block(3000);
					 PageObjects.SelectByXpath(
							 driver, LocatorsPath.END_CALL_IN_PROGRESS, LocatorsPath.MAX_TIME);
					 PageObjects.SelectByXpath(
							 driver, LocatorsPath.MOBILE_CANCEL, LocatorsPath.MAX_TIME);

					 PageObjects.SelectByXpath(
							 driver, LocatorsPath.MOBILE_PRESALES, LocatorsPath.MAX_TIME);
				}
				
			} catch (NoSuchElementException NoSuchElementException) {
				System.out.println("No such element" +NoSuchElementException);
			}catch (StaleElementReferenceException StaleElementReferenceException) {
				System.out.println("Trying to recover from stale element" + StaleElementReferenceException);
			}catch (TimeoutException TimeOutException) {
				System.out.println("Time Out" + TimeOutException);
			}
	}
	

	@Then("^User selects the Credit customer RCS which has ERP number and makes a note of the Available Credit$")
	public void user_selects_the_Credit_customer_RCS_which_has_ERP_number_and_makes_a_note_of_the_Available_Credit() throws Throwable {
	    
	}
	

	@Then("^User Creates the following sales data - SalesOrder -> Invoice(\\d+), Invoice(\\d+)$")
	public void user_Creates_the_following_sales_data_SalesOrder_Invoice_Invoice(int arg1, int arg2) throws Throwable {
	    
	}
	

	@Then("^User verifies the Sales data is created in RCS(\\d+) and the Available Credit is verified successfully\\.$")
	public void user_verifies_the_Sales_data_is_created_in_RCS_and_the_Available_Credit_is_verified_successfully(int arg1) throws Throwable {
	    
	}
	

	
	*//**----------------------1451_ECC_Mandatory_Fields_Validation--------------------------**//*
	
	
	
	@Then("^User logins to the RestClient$")
	public void user_logins_to_the_RestClient() throws Throwable {
	    
	}
	

	@Then("^User verifies the RestClient screen is displayed successfully$")
	public void user_verifies_the_RestClient_screen_is_displayed_successfully() throws Throwable {
	   
	}
	

	@Then("^User provides the valid 'Customer Clearance Inbound' link in the Request URL field$")
	public void user_provides_the_valid_Customer_Clearance_Inbound_link_in_the_Request_URL_field() throws Throwable {
	    
	}
	

	@Then("^User selects the request type as 'POST' in the RestClient screen$")
	public void user_selects_the_request_type_as_POST_in_the_RestClient_screen() throws Throwable {
	    
	}
	

	@Then("^User selects the 'Content- Type' as 'application/xml' under the 'HEADER' field$")
	public void user_selects_the_Content_Type_as_application_xml_under_the_HEADER_field() throws Throwable {
	    
	}
	

	@Then("^User provides the '(\\d+) Customer Clearance SU-S XML' under the 'BODY' field$")
	public void user_provides_the_Customer_Clearance_SU_S_XML_under_the_BODY_field(int arg1) throws Throwable {
	    
	}
	

	@Then("^User updates the following invoice details for Sales orders in XML - Invoice, Invoice Amount, Invoice Date, Dispute and Promise to Pay$")
	public void user_updates_the_following_invoice_details_for_Sales_orders_in_XML_Invoice_Invoice_Amount_Invoice_Date_Dispute_and_Promise_to_Pay() throws Throwable {
	    
	}
	

	@Then("^User verifies all the mandatory fields for (\\d+) Customer Clearance SU-S Inbound details as been updated successfully in the RestClient screen$")
	public void user_verifies_all_the_mandatory_fields_for_Customer_Clearance_SU_S_Inbound_details_as_been_updated_successfully_in_the_RestClient_screen(int arg1) throws Throwable {
	    
	}
	

	@Then("^User clicks on the send button in the RestClient & verifies the Customer Clearance SU-S Inbound is created successfully in the ECC tool\\.$")
	public void user_clicks_on_the_send_button_in_the_RestClient_verifies_the_Customer_Clearance_SU_S_Inbound_is_created_successfully_in_the_ECC_tool() throws Throwable {
	    
	}
	

	
	*//**----------------------1451_CustomerClearanceService_Job--------------------------**//*
	
	
	
	@Then("^User logins to the WC application as admin$")
	public void user_logins_to_the_WC_application_as_admin() throws Throwable {
	    
	}
	

	@Then("^User clicks on the 'Utilities' tab and verifies the Utilities screen is displayed successfully$")
	public void user_clicks_on_the_Utilities_tab_and_verifies_the_Utilities_screen_is_displayed_successfully() throws Throwable {
	    
	}
	

	@Then("^User selects the 'Inbound' tab under the 'Utilities'$")
	public void user_selects_the_Inbound_tab_under_the_Utilities() throws Throwable {
	    
	}
	

	@Then("^User verifies the '(\\d+)_CustomerClearanceService' job status is updated successfully in the 'Inbound' screen\\.$")
	public void user_verifies_the__CustomerClearanceService_job_status_is_updated_successfully_in_the_Inbound_screen(int arg1) throws Throwable {
	    
	}
	

	
	*//**----------------------1451_CustomerClearanceService_Job--------------------------**//*
	
	
	
	@Then("^User logins to the MC$")
	public void user_logins_to_the_MC() throws Throwable {
	    
	}
	

	@Then("^User verifies the Invoice data in RCS(\\d+) is updated successfully\\.$")
	public void user_verifies_the_Invoice_data_in_RCS_is_updated_successfully(int arg1) throws Throwable {
	   
	}*/

}
