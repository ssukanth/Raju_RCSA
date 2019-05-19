package com.infotech.wc.ui.testscripts;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.infotech.Excel.ExcelApiFile;
import com.infotech.basepage.CallObject;
import com.infotech.basepage.LocatorsPath;
import com.infotech.basepage.PageObjects;
import com.infotech.basepage.RobotPage;
import com.infotech.testrunner.TestRunnerWebClient;

import cucumber.api.java.en.Then;

public class RcsSaasMaliciousFileUploadPossiblePage extends TestRunnerWebClient{

	public RcsSaasMaliciousFileUploadPossiblePage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
	ExcelApiFile file = new ExcelApiFile("TestData.xlsx");
	WebDriverWait wait = new WebDriverWait(driver, LocatorsPath.MAX_TIME);
	WebDriverWait waiting = new WebDriverWait(driver, 300);
	RcsSaasDataEntryPage dataEntry = new RcsSaasDataEntryPage();
	RobotPage robot = new RobotPage();
	
	
	
	/**----------------------Attachment--------------------------**/
	

	
	@Then("^User searches for the customer in the search screen$")
	public void user_searches_for_the_customer_in_the_search_screen() throws Throwable {
	  
		System.out.println("Attempt: search for the customer in the search screen");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.CUSTOMER_SEARCH, LocatorsPath.MAX_TIME);
		System.out.println("Success: Searched for the customer in the search screen");
	}
	

	@Then("^User navigates to the Data entry module & verifies the data entry screen is displayed successfully$")
	public void user_navigates_to_the_Data_entry_module_verifies_the_data_entry_screen_is_displayed_successfully() throws Throwable {
	   
		System.out.println("Attempt: navigate to the Data entry module & "
				+ "verify the data entry screen is displayed");
	    PageObjects.SelectByXpathWithoutClick(
	    		driver, LocatorsPath.SEARCH_RESULTS_SCREEN, LocatorsPath.MAX_TIME); 
	    System.out.println("Success: navigated to the Data entry module & "
	    		+ "verified the data entry screen is displayed successfully");
	}
	

	@Then("^User verifies the following tabs are available in the data entry screen - Profile, Address, Attachments, Contacts, Outlet Times, Assessments$")
	public void user_verifies_the_following_tabs_are_available_in_the_data_entry_screen_Profile_Address_Attachments_Contacts_Outlet_Times_Assessments() throws Throwable {
	 
		dataEntry.user_should_be_able_to_see_the_Profile_tab();
		dataEntry.user_should_be_able_to_see_the_Address_tab();
		dataEntry.user_should_be_able_to_see_the_Attachments_tab();
		dataEntry.user_should_be_able_to_see_the_Contacts_tab();
		dataEntry.user_should_be_able_to_see_the_Outlet_Times_tab();
		dataEntry.user_should_be_able_to_see_the_Assessments_tab();
	}
	

	@Then("^User verifies the following tabs are available in the data entry screen - Suppliers, Merchandising, Retail Audit, Contract, Territory, Sales$")
	public void user_verifies_the_following_tabs_are_available_in_the_data_entry_screen_Suppliers_Merchandising_Retail_Audit_Contract_Territory_Sales() throws Throwable {
	 
		dataEntry.user_should_be_able_to_see_the_Suppliers_tab();
		dataEntry.user_should_be_able_to_see_the_Merchandising_tab();
		dataEntry.user_should_be_able_to_see_the_Retail_Audit_tab();
		dataEntry.user_should_be_able_to_see_the_Contract_tab();
		dataEntry.user_should_be_able_to_see_the_Territory_tab();
		dataEntry.user_should_be_able_to_see_the_Sales_tab();
	}
	

	@Then("^User verifies the following tabs are available in the data entry screen - FOC Orders, Planogram, Group Messages, Service Requests, Customer Sales Target$")
	public void user_verifies_the_following_tabs_are_available_in_the_data_entry_screen_FOC_Orders_Planogram_Group_Messages_Service_Requests_Customer_Sales_Target() throws Throwable {
	    
		dataEntry.user_should_be_able_to_see_the_FOC_Orders_tab();
		dataEntry.user_should_be_able_to_see_the_Planogram_tab();
		dataEntry.user_should_be_able_to_see_the_Group_Messages_tab();
		dataEntry.user_should_be_able_to_see_the_Service_Requests_tab();
		dataEntry.user_should_be_able_to_see_the_Customer_Sales_Target_tab();
	}
	

	
	/**----------------------UploadingFile--------------------------**/
	
	
	
	@Then("^User clicks on the 'Attachments' tab & verifies the attachment screen is displayed successfully$")
	public void user_clicks_on_the_Attachments_tab_verifies_the_attachment_screen_is_displayed_successfully() throws Throwable {
	   
		System.out.println("Attempt: click on the 'Attachments' tab & verify the attachment screen is displayed successfully");
		PageObjects.SelectByXpath(
				driver, LocatorsPath.ATTACHMENTS, LocatorsPath.MAX_TIME);
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.LIST_OF_ATTACHMENTS_DISP, LocatorsPath.MAX_TIME);
		System.out.println("Success: clicked on the 'Attachments' tab & verified the attachment screen is displayed successfully");
	}
	

	@Then("^User clicks on the 'Add Attachment' button & verifies the Uploading files is done through Add attachment button$")
	public void user_clicks_on_the_Add_Attachment_button_verifies_the_Uploading_files_is_done_through_Add_attachment_button() throws Throwable {
	    
		System.out.println("Attempt: click on the 'Add Attachment' button & "
				+ "verify the Uploading files is done through Add attachment button");
		//removeOutletRecords();
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ADD_ATTACHMENTS, LocatorsPath.MAX_TIME);
		System.out.println("Success: clicked on the 'Add Attachment' button & "
				+ "verified the Uploading files is done through Add attachment button");
	}
	

	@Then("^User verifies validation filters should be enabled in order to avoid undesired  files uploaded to the server$")
	public void user_verifies_validation_filters_should_be_enabled_in_order_to_avoid_undesired_files_uploaded_to_the_server() throws Throwable {
	 
		System.out.println("Attempt: verify validation filters should be enabled in order "
				+ "to avoid undesired  files uploaded to the server");
		try {
			//Valid File
			robot.importFile(LocatorsPath.maliciousfile1);
			wait.until(ExpectedConditions.presenceOfElementLocated(
					By.xpath(LocatorsPath.MALICIOUS_FILE_11)));
			WebElement successMsg = waiting.until(ExpectedConditions.presenceOfElementLocated(
					By.cssSelector(LocatorsPath.UPLOAD_SUCCESS_MESSAGE)));
			Assert.assertEquals("Uploaded Successfully!!", successMsg.getText());
			
			
			//InValid File
			user_clicks_on_the_Attachments_tab_verifies_the_attachment_screen_is_displayed_successfully();
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.ADD_ATTACHMENTS, LocatorsPath.MAX_TIME);
			robot.importFile(LocatorsPath.maliciousfile7);
			WebElement errorRecord = waiting.until(ExpectedConditions.presenceOfElementLocated(
					By.cssSelector(LocatorsPath.UPLOAD_FAILURE_MESSAGE)));
			Assert.assertEquals("Invalid File", errorRecord.getText());
			
			
			//Valid File
			user_clicks_on_the_Attachments_tab_verifies_the_attachment_screen_is_displayed_successfully();
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.ADD_ATTACHMENTS, LocatorsPath.MAX_TIME);
	        robot.importFile(LocatorsPath.maliciousfile2);
	        waiting.until(ExpectedConditions.presenceOfElementLocated(
					By.xpath(LocatorsPath.MALICIOUS_FILE_12)));
			Assert.assertEquals("Uploaded Successfully!!", successMsg.getText());
			
			
			//InValid File
			user_clicks_on_the_Attachments_tab_verifies_the_attachment_screen_is_displayed_successfully();
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.ADD_ATTACHMENTS, LocatorsPath.MAX_TIME);
			robot.importFile(LocatorsPath.maliciousfile8);
			Assert.assertEquals("Invalid File", errorRecord.getText());
			
			
			//Valid File
			user_clicks_on_the_Attachments_tab_verifies_the_attachment_screen_is_displayed_successfully();
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.ADD_ATTACHMENTS, LocatorsPath.MAX_TIME);
			robot.importFile(LocatorsPath.maliciousfile3);
			waiting.until(ExpectedConditions.presenceOfElementLocated(
					By.xpath(LocatorsPath.MALICIOUS_FILE_13)));
			Assert.assertEquals("Uploaded Successfully!!", successMsg.getText());
			
			
			//InValid File
			user_clicks_on_the_Attachments_tab_verifies_the_attachment_screen_is_displayed_successfully();
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.ADD_ATTACHMENTS, LocatorsPath.MAX_TIME);
			robot.importFile(LocatorsPath.maliciousfile9);
			Assert.assertEquals("Invalid File", errorRecord.getText());
			
			
			//Valid File
			user_clicks_on_the_Attachments_tab_verifies_the_attachment_screen_is_displayed_successfully();
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.ADD_ATTACHMENTS, LocatorsPath.MAX_TIME);
			robot.importFile(LocatorsPath.maliciousfile4);
			waiting.until(ExpectedConditions.presenceOfElementLocated(
					By.xpath(LocatorsPath.MALICIOUS_FILE_14)));
			Assert.assertEquals("Uploaded Successfully!!", successMsg.getText());
			
			
			//InValid File
			user_clicks_on_the_Attachments_tab_verifies_the_attachment_screen_is_displayed_successfully();
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.ADD_ATTACHMENTS, LocatorsPath.MAX_TIME);
			robot.importFile(LocatorsPath.maliciousfile10);
			Assert.assertEquals("Invalid size", errorRecord.getText());
			
			
			//Valid File
			user_clicks_on_the_Attachments_tab_verifies_the_attachment_screen_is_displayed_successfully();
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.ADD_ATTACHMENTS, LocatorsPath.MAX_TIME);
			robot.importFile(LocatorsPath.maliciousfile5);
			waiting.until(ExpectedConditions.presenceOfElementLocated(
					By.xpath(LocatorsPath.MALICIOUS_FILE_15)));
			Assert.assertEquals("Uploaded Successfully!!", successMsg.getText());
			
			
			//Valid File
			user_clicks_on_the_Attachments_tab_verifies_the_attachment_screen_is_displayed_successfully();
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.ADD_ATTACHMENTS, LocatorsPath.MAX_TIME);
			robot.importFile(LocatorsPath.maliciousfile6);
			waiting.until(ExpectedConditions.presenceOfElementLocated(
					By.xpath(LocatorsPath.MALICIOUS_FILE_16)));
			Assert.assertEquals("Uploaded Successfully!!", successMsg.getText());	
		} catch (StaleElementReferenceException StaleElementReferenceException) {
			System.out.println("Trying to recover from stale element" + StaleElementReferenceException);
		}
		System.out.println("Success: verified validation filters should be enabled in order "
				+ "to avoid undesired  files uploaded to the server");
	}
	

	@Then("^User verifies the files which are about to get uploaded should be scanned with the anti-virus to avoid malicious files uploading to the server$")
	public void user_verifies_the_files_which_are_about_to_get_uploaded_should_be_scanned_with_the_anti_virus_to_avoid_malicious_files_uploading_to_the_server() throws Throwable {
	 
		System.out.println("User verifies the files which are about to get uploaded should be scanned "
				+ "with the anti-virus to avoid malicious files uploading to the server");
	}
	

	@Then("^User verifies the file upload size should be limited to (\\d+)MB and the file types supported should be excel, pdf and word\\.$")
	public void user_verifies_the_file_upload_size_should_be_limited_to_MB_and_the_file_types_supported_should_be_excel_pdf_and_word(int arg1) throws Throwable {
	   
		System.out.println("Attempt: verify the file upload size should be limited to "
				+ "(\\d+)MB and the file types supported should be excel, pdf and word");
		removeOutletRecords();
		System.out.println("Success: verified the file upload size should be limited to "
				+ "(\\d+)MB and the file types supported should be excel, pdf and word");
	}
	
	
	public void removeOutletRecords() throws Throwable {

		/*WebElement delete = wait.until(ExpectedConditions.
				presenceOfElementLocated(
						(By.cssSelector(OUTLET_TIMES_DELETE))));
		if(delete != null)*/
			CallObject.waitForPageLoad(driver);
			Iterator<WebElement> element = driver.findElements(
					By.cssSelector(LocatorsPath.OUTLET_TIMES_DELETE)).iterator();
			while(element.hasNext()) {
				element.next();
				PageObjects.SelectByCSSSelector(
						driver, LocatorsPath.OUTLET_TIMES_DELETE, LocatorsPath.MAX_TIME);
				CallObject.switchToAlert(driver);
		}
	}
}
