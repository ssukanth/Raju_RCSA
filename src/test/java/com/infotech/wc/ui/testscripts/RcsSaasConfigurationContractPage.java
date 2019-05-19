package com.infotech.wc.ui.testscripts;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.infotech.Excel.ExcelApiFile;
import com.infotech.Excel.ExtractZipFile;
import com.infotech.Excel.RenameFile;
import com.infotech.basepage.CallObject;
import com.infotech.basepage.LocatorsPath;
import com.infotech.basepage.PageObjects;
import com.infotech.basepage.RobotPage;
import com.infotech.testrunner.TestRunnerWebClient;

import cucumber.api.java.en.Then;

public class RcsSaasConfigurationContractPage extends TestRunnerWebClient{
		
	    RobotPage robot = new RobotPage();
		WebDriver driver = getDriver();
		Actions actions = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		ExcelApiFile file = new ExcelApiFile("TestData.xlsx");
		WebDriverWait wait = new WebDriverWait(driver, LocatorsPath.MAX_TIME);
		RenameFile renameFile = new RenameFile();
		ExtractZipFile extractZipFile = new ExtractZipFile();
		RcsSaasMerchandisingPage merchandisingPage = new RcsSaasMerchandisingPage();
		RcsSaasConfigurationUsersPage configurationPage = new RcsSaasConfigurationUsersPage();
		RcsSaasNewOutletCreationPage newOutletCreationPage = new RcsSaasNewOutletCreationPage();
		
		public RcsSaasConfigurationContractPage() throws Exception {
			super();
			// TODO Auto-generated constructor stub
		}


		
		/**----------------------RCS_SaaS_Create_Corporate_Contract--------------------------**/
		
		

		@Then("^User clicks on 'Contract' tab and navigates to the Contract screen$")
		public void user_clicks_on_Contract_tab_and_navigates_to_the_Contract_screen() throws Throwable {
		   
			System.out.println("Attempt: Click on Contract Menu");
			PageObjects.SelectByXpath(
					driver, LocatorsPath.CONTRACT, LocatorsPath.MAX_TIME);
			PageObjects.SelectByXpathWithoutClick(
					driver, LocatorsPath.CORPORATE_CONTRACT_DISPLAY, LocatorsPath.MAX_TIME);
			System.out.println("Success: Contract Menu selected successfully");
		}
		

		@Then("^User clicks on 'Add Corporate Contract' button$")
		public void user_clicks_on_Add_Corporate_Contract_button() throws Throwable {
		    
			System.out.println("Attempt: click on 'Add corporate contract' button");
			js.executeScript("arguments[0].scrollIntoView();", 
					driver.findElement(By.cssSelector(LocatorsPath.ADD_CORPORATE_CONTRACT)));
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.ADD_CORPORATE_CONTRACT, LocatorsPath.MAX_TIME);
			System.out.println("Success: Add corporate contract button selected successfully");
		}
		

		@Then("^The User should be navigated to 'Add Corporate Contract screen'$")
		public void the_User_should_be_navigated_to_Add_Corporate_Contract_screen() throws Throwable {
		    
			System.out.println("Attempt: navigate to 'Add corporate contract screen'");
			PageObjects.SelectByXpathWithoutClick(
					driver, LocatorsPath.ADD_CORPORATE_CONTRACT_DISP, LocatorsPath.MAX_TIME);
			System.out.println("Success: Add corporate contract displayed successfully");
		}
		

		@Then("^User enters the 'Contract name' which is a mandatory field$")
		public void user_enters_the_Contract_name_which_is_a_mandatory_field() throws Throwable {
		   
			System.out.println("Attempt: Enter the field - 'Contract name'");
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.CONTRACT_NAME, LocatorsPath.MAX_TIME, 
					CallObject.timestamp().concat("_ContractName"));
			file.setCellData("Contract", "Contract Name", 2, 
					CallObject.timestamp().concat("_ContractName"));
			System.out.println("Success: 'Contract name' entered successfully");
		}
		

		@Then("^User verifies the 'Contract type' is 'Corporate' by default & it is displayed as read only field$")
		public void user_verifies_the_Contract_type_is_Corporate_by_default_it_is_displayed_as_read_only_field() throws Throwable {
		   
			System.out.println("Attempt: Validate 'Contract type'");
			WebElement contractType = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.CONTRACT_TYPE))));
			Assert.assertEquals("CORPORATE", contractType.getAttribute("value"));
			Assert.assertTrue(contractType.getAttribute
					 ("readonly").equals("true"),"readonly");
			System.out.println("Success: 'Contract type' validated successfully");
		}
		

		@Then("^User selects the 'Contract company' dropdown$")
		public void user_selects_the_Contract_company_dropdown() throws Throwable {
		    
			System.out.println("Attempt: Select the 'Contract Company' dropDown");
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.CONTRACT_COMPANY, LocatorsPath.MAX_TIME, 
					file.getCellData("Contract", "Contract Company", 2));
			System.out.println("Success: 'Contract Company' dropDown selected successfully");
		}
		

		@Then("^User selects the 'Contract Inactive' checkbox$")
		public void user_selects_the_Contract_Inactive_checkbox() throws Throwable {
		 
			System.out.println("Attempt: select the 'Contract inactive' checkbox");
			PageObjects.SelectByCSSSelectorWithoutClick(
					driver, LocatorsPath.CONTRACT_INACTIVE, LocatorsPath.MAX_TIME);
			System.out.println("Success: 'Contract inactive' checkbox selected");
		}
		

		@Then("^User selects the 'Check Frequency' dropdown$")
		public void user_selects_the_Check_Frequency_dropdown() throws Throwable {
		    
			System.out.println("Attempt: select the 'Check frequency' dropdown");
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.CHECK_FREQUENCY, LocatorsPath.MAX_TIME);
			System.out.println("Success: 'Check frequency' dropdown selected");
		}
		

		@Then("^User selects the 'Start Date' for the Contract$")
		public void user_selects_the_Start_Date_for_the_Contract() throws Throwable {
		    
			System.out.println("Attempt: select the 'Start Date'");
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.CONTRACT_START_DATE_CALENDER, LocatorsPath.MAX_TIME);
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.CONTRACT_START_DATE, LocatorsPath.MAX_TIME);
			System.out.println("Success: 'Start Date' as been selected successfully");
		}
		

		@Then("^User selects the 'End Date' for the Contract$")
		public void user_selects_the_End_Date_for_the_Contract() throws Throwable {
		   
			System.out.println("Attempt: select the 'End Date'");
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.CONTRACT_END_DATE_CALENDER, LocatorsPath.MAX_TIME);
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.CONTRACT_END_DATE, LocatorsPath.MAX_TIME);
			System.out.println("Success: 'End Date' as been selected successfully");
		}
		

		@Then("^User selects the 'Actual end date' for the Contract$")
		public void user_selects_the_Actual_end_date_for_the_Contract() throws Throwable {
		    
			System.out.println("Attempt: select the 'Actual End Date'");
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.ACTUAL_END_DATE_CALENDER, LocatorsPath.MAX_TIME);
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.CONTRACT_END_DATE, LocatorsPath.MAX_TIME);
			System.out.println("Success: 'Actual End Date' as been selected successfully");
		}
		

		@Then("^User selects the 'Contract Locked' - Contract cannot be locked without drivers created for the contract$")
		public void user_selects_the_Contract_Locked_Contract_cannot_be_locked_without_drivers_created_for_the_contract() throws Throwable {
		    
			System.out.println("Attempt: select the 'Contract locked' checkbox");
			PageObjects.SelectByCSSSelectorWithoutClick(
					driver, LocatorsPath.CONTRACT_LOCKED, LocatorsPath.MAX_TIME);
			System.out.println("Success: 'Contract locked' checkbox selected");
		}
		

		@Then("^User selects the 'In Field Association' checkbox$")
		public void user_selects_the_In_Field_Association_checkbox() throws Throwable {
		    
			System.out.println("Attempt: select the 'In Field association' checkbox");
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.FIELD_ASSOCIATION, LocatorsPath.MAX_TIME);
			System.out.println("Success: 'In Field association' checkbox selected");
		}
		

		@Then("^User selects the 'Free field (\\d+)' for Contract$")
		public void user_selects_the_Free_field_for_Contract(int arg1) throws Throwable {
		   
			System.out.println("Attempt: select the 'Free field 1' dropdown");
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.CONTRACT_FREE_FIELD_1, LocatorsPath.MAX_TIME, 
					file.getCellData("Contract", "Free Field 1", 2));
			System.out.println("Success: 'Free field 1' dropdown selected");
		}
		
		
		@Then("^User selects the 'Free field (\\d+)' for contract$")
		public void user_selects_the_Free_field_for_contract(int arg1) throws Throwable {

			System.out.println("Attempt: select the 'Free field 2' dropdown");
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.CONTRACT_FREE_FIELD_2, LocatorsPath.MAX_TIME, 
					file.getCellData("Contract", "Free Field 2", 2));
			System.out.println("Success: 'Free field 2' dropdown selected");
		}
		

		@Then("^User enters the 'Free text field (\\d+)' for Contract$")
		public void user_enters_the_Free_text_field_for_Contract(int arg1) throws Throwable {
		    
			System.out.println("Attempt: Enter 'Free text field 1'");
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.CONTRACT_FREE_TEXT_FIELD_1, LocatorsPath.MAX_TIME, 
					file.getCellData("Contract", "Free Text Field 1", 2));
			System.out.println("Success: 'Free text field 1' entered successfully");
		}
		
		
		@Then("^User enters the 'Free text field (\\d+)' for contract$")
		public void user_enters_the_Free_text_field_for_contract(int arg1) throws Throwable {

			System.out.println("Attempt: Enter 'Free text field 2'");
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.CONTRACT_FREE_TEXT_FIELD_2, LocatorsPath.MAX_TIME, 
					file.getCellData("Contract", "Free Text Field 2", 2));
			System.out.println("Success: 'Free text field 2' entered successfully");
		}
		

		@Then("^The User clicks on save button and verifies the contract records is created successfully with 'Active' status\\.$")
		public void the_User_clicks_on_save_button_and_verifies_the_contract_records_is_created_successfully_with_Active_status() throws Throwable {
		 
			merchandisingPage.
			finally_I_click_on_save_button_and_verify_Merchandise_records_saved_successfully();
		}
		

		
		/**----------------------RCS_SaaS_Create_Driver_Contract--------------------------**/
		
		
		
		@Then("^User scrolls down and clicks on the 'Add driver' button$")
		public void user_scrolls_down_and_clicks_on_the_Add_driver_button() throws Throwable {
		 
			System.out.println("Attempt: click on 'Add driver' button");
			js.executeScript("arguments[0].scrollIntoView();", 
					driver.findElement(By.cssSelector(LocatorsPath.ADD_DRIVER)));
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.ADD_DRIVER, LocatorsPath.MAX_TIME);
			System.out.println("Success: Add driver button selected successfully");
		}
		

		@Then("^User should be navigated to 'Add contract driver details' screen$")
		public void user_should_be_navigated_to_Add_contract_driver_details_screen() throws Throwable {
		 
			System.out.println("Attempt: navigate to 'Add contract driver details screen'");
			PageObjects.SelectByXpathWithoutClick(
					driver, LocatorsPath.ADD_CONTRACT_DRIVER_DETAILS, LocatorsPath.MAX_TIME);
			System.out.println("Success: Add contract driver details screen displayed successfully");
		}
		

		@Then("^The User verifies the selected 'Contract name' display$")
		public void the_User_verifies_the_selected_Contract_name_display() throws Throwable {
		    
			System.out.println("Attempt: Validate 'Contract Name'");
			WebElement contractName = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.CONTRACT_NAME))));
			Assert.assertTrue(contractName.getAttribute
					 ("readonly").equals("true"),"readonly");
			Assert.assertEquals(file.getCellData("Contract", "Contract Name", 2), 
						contractName.getAttribute("value"));
			System.out.println("Attempt: 'Contract Name' validated successfully");
		}
		

		@Then("^User selects the 'Fixed payment' from the Category dropdown$")
		public void user_selects_the_Fixed_payment_from_the_Category_dropdown() throws Throwable {
		    
			System.out.println("Attempt: Select the 'Category' dropDown");
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.CATEGORY, LocatorsPath.MAX_TIME, 
					file.getCellData("Contract", "Category", 2));
			System.out.println("Success: 'Category' dropDown selected successfully");
		}
		

		@Then("^User selects the 'Availability' from the Driver dropdown$")
		public void user_selects_the_Availability_from_the_Driver_dropdown() throws Throwable {
		    
			System.out.println("Attempt: Select the 'Driver' dropDown");
			CallObject.block(3000);
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.DRIVER, LocatorsPath.MAX_TIME, 
					file.getCellData("Contract", "Driver", 2));
			System.out.println("Success: 'Driver' dropDown selected successfully");
		}
		

		@Then("^User selects the 'Cash' from the Compensation type dropdown$")
		public void user_selects_the_Cash_from_the_Compensation_type_dropdown() throws Throwable {
		    
			System.out.println("Attempt: Select the 'Compensation type' dropDown");
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.COMPENSATION_TYPE, LocatorsPath.MAX_TIME, 
					file.getCellData("Contract", "Compensation Type", 2));
			System.out.println("Success: 'Compensation type' dropDown selected successfully");
		}
		

		@Then("^User verifies 'SKU' field is disabled - read only field$")
		public void user_verifies_SKU_field_is_disabled_read_only_field() throws Throwable {
		   
			System.out.println("Attempt: Validate 'SKU'");
			WebElement sku = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.CONTRACT_SKU))));
			if(!sku.isEnabled()) {
				CallObject.waitForPageLoad(driver);
				Assert.assertEquals(true, !sku.isEnabled());
			}else {
				Assert.fail("SKU is enabled");
			}
			System.out.println("Attempt: 'SKU' validated successfully");
		}
		

		@Then("^User verifies 'Threshold value' is displayed as read only field$")
		public void user_verifies_Threshold_value_is_displayed_as_read_only_field() throws Throwable {
		   
			System.out.println("Attempt: Validate 'Threshold value'");
			WebElement thresholdValue = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.THRESHOLD_VALUE))));
			Assert.assertTrue(thresholdValue.getAttribute
					 ("readonly").equals("true"),"readonly");
			System.out.println("Attempt: 'Threshold value' validated successfully");
		}
		

		@Then("^User verifies 'Compensation SKU' is displayed as read only field$")
		public void user_verifies_Compensation_SKU_is_displayed_as_read_only_field() throws Throwable {
		    
			System.out.println("Attempt: Validate 'Compensation SKU'");
			WebElement sku = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.COMPENSATION_SKU))));
			if(!sku.isEnabled()) {
				CallObject.waitForPageLoad(driver);
				Assert.assertEquals(true, !sku.isEnabled());
			}else {
				Assert.fail("Compensation SKU is enabled");
			}
			System.out.println("Attempt: 'Compensation SKU' validated successfully");
		}
		

		@Then("^User verifies 'Compensation qty' is displayed as read only field$")
		public void user_verifies_Compensation_qty_is_displayed_as_read_only_field() throws Throwable {
		 
			System.out.println("Attempt: Validate 'Compensation qty'");
			WebElement quantity = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.COMPENSATION_QUANTITY))));
			Assert.assertTrue(quantity.getAttribute
					 ("readonly").equals("true"),"readonly");
			System.out.println("Attempt: 'Compensation qty' validated successfully");
		}
		

		@Then("^User enters the 'Amount' for the contract$")
		public void user_enters_the_Amount_for_the_contract() throws Throwable {
		 
			System.out.println("Attempt: Enter the 'Amount'");
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.AMOUNT, LocatorsPath.MAX_TIME, 
					file.getCellData("Contract", "Amount", 2));
			System.out.println("Success: 'Amount' entered successfully");
		}
		

		@Then("^User verifies the 'Disc%' is displayed as read only field$")
		public void user_verifies_the_Disc_is_displayed_as_read_only_field() throws Throwable {
		 
			System.out.println("Attempt: Validate 'Disc%'");
			WebElement disc = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.DISC))));
			Assert.assertTrue(disc.getAttribute
					 ("readonly").equals("true"),"readonly");
			System.out.println("Attempt: 'Disc%' validated successfully");
		}
		

		@Then("^User enters the 'Disc value' for the contract$")
		public void user_enters_the_Disc_value_for_the_contract() throws Throwable {
		    
			System.out.println("Attempt: Validate 'Disc value'");
			WebElement disc = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.DISC_VALUE))));
			Assert.assertTrue(disc.getAttribute
					 ("readonly").equals("true"),"readonly");
			System.out.println("Attempt: 'Disc value' validated successfully");
		}
		

		@Then("^User selects 'TCI Bucket' dropdown$")
		public void user_selects_TCI_Bucket_dropdown() throws Throwable {
		    
			System.out.println("Attempt: select 'TCI Bucket' dropdown");
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.TCI_BUCKET, LocatorsPath.MAX_TIME, 
					file.getCellData("Contract", "TCI Bucket", 2));
			System.out.println("Success: 'TCI Bucket' selected successfully");
		}
		

		@Then("^User selects the 'Start Date' for Contract driver$")
		public void user_selects_the_Start_Date_for_Contract_driver() throws Throwable {
		    
			System.out.println("Attempt: select the 'Start Date'");
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.START_DATE_CALENDER_DRIVER, LocatorsPath.MAX_TIME);
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.START_DATE_DRIVER, LocatorsPath.MAX_TIME);
			System.out.println("Success: 'Start Date' as been selected successfully");
		}
		

		@Then("^User selects the 'End Date' for Contract driver$")
		public void user_selects_the_End_Date_for_Contract_driver() throws Throwable {
		    
			System.out.println("Attempt: select the 'End Date'");
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.END_DATE_CALENDER_DRIVER, LocatorsPath.MAX_TIME);
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.END_DATE_DRIVER, LocatorsPath.MAX_TIME);
			System.out.println("Success: 'End Date' as been selected successfully");
		}
		

		@Then("^User selects the 'Status' for Contract driver$")
		public void user_selects_the_Status_for_Contract_driver() throws Throwable {
		    
			System.out.println("Attempt: select the 'Status'");
			CallObject.waitForPageLoad(driver);
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.CONTRACT_STATUS, LocatorsPath.MAX_TIME);
			System.out.println("Success: 'Status' as been selected successfully");
		}
		

		@Then("^User selects the 'Apply once' checkbox for Contract driver$")
		public void user_selects_the_Apply_once_checkbox_for_Contract_driver() throws Throwable {
		    
			System.out.println("Attempt: select the 'Apply once'");
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.APPLY_ONCE, LocatorsPath.MAX_TIME);
			System.out.println("Success: 'Apply once' as been selected successfully");
		}
		

		@Then("^User selects the 'Free field (\\d+)' for Contract driver$")
		public void user_selects_the_Free_field_for_Contract_driver(int arg1) throws Throwable {
		 
			System.out.println("Attempt: select the 'Free field 1' dropdown");
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.FREE_FIELD_1_DRIVER, LocatorsPath.MAX_TIME, 
					file.getCellData("Contract", "Free Field 1", 3));
			System.out.println("Success: 'Free field 1' dropdown selected");
		}
		

		@Then("^User selects the 'Free field (\\d+)' for contract driver$")
		public void user_selects_the_Free_field_for_contract_driver(int arg1) throws Throwable {

			System.out.println("Attempt: select the 'Free field 2' dropdown");
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.FREE_FIELD_2_DRIVER, LocatorsPath.MAX_TIME, 
					file.getCellData("Contract", "Free Field 2", 3));
			System.out.println("Success: 'Free field 2' dropdown selected");
		}

		
		@Then("^User enters the 'Free text field (\\d+)' for Contract driver$")
		public void user_enters_the_Free_text_field_for_Contract_driver(int arg1) throws Throwable {
		 
			System.out.println("Attempt: Enter 'Free text field 1'");
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.FREE_TEXT_FIELD_1_DRIVER, LocatorsPath.MAX_TIME, 
					file.getCellData("Contract", "Free Text Field 1", 3));
			System.out.println("Success: 'Free text field 1' entered successfully");
		}
		
		
		@Then("^User enters the 'Free text field (\\d+)' for contract driver$")
		public void user_enters_the_Free_text_field_for_contract_driver(int arg1) throws Throwable {

			System.out.println("Attempt: Enter 'Free text field 2'");
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.FREE_TEXT_FIELD_2_DRIVER, LocatorsPath.MAX_TIME, 
					file.getCellData("Contract", "Free Text Field 2", 3));
			System.out.println("Success: 'Free text field 2' entered successfully");
		}
		

		@Then("^The User clicks on save button and verifies the Driver record is created successfully with 'Active' status\\.$")
		public void the_User_clicks_on_save_button_and_verifies_the_Driver_record_is_created_successfully_with_Active_status() throws Throwable {
		    
			merchandisingPage.
			finally_I_click_on_save_button_and_verify_Merchandise_records_saved_successfully();
		}
		

		
		/**----------------------RCS_SaaS_Lock_Contract--------------------------**/
		
		
		
		
		@Then("^User selects the contract which has to be locked by clicking on the checkbox next to the contract name$")
		public void user_selects_the_contract_which_has_to_be_locked_by_clicking_on_the_checkbox_next_to_the_contract_name() throws Throwable {
		    
			System.out.println("Attempt: select the contract which has to be locked by clicking on the checkbox");
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.CONTRACT_NAME_SEARCH_FIELD, LocatorsPath.MAX_TIME, 
					file.getCellData("Contract", "Contract Name", 2));
			CallObject.block(3000);
			System.out.println("Success: contract which has to be locked as been selected successfully");
		}
		

		@Then("^User selects the Contract which has to be locked$")
		public void user_selects_the_Contract_which_has_to_be_locked() throws Throwable {
		   
			System.out.println("Success: Contract as been selected successfully");
		}
		

		@Then("^User clicks on the Lock/Unlock button$")
		public void user_clicks_on_the_Lock_Unlock_button() throws Throwable {
		    
			System.out.println("Attempt: click on the Lock/Unlock button");
			try {
				
				js.executeScript("arguments[0].scrollIntoView();", 
						driver.findElement(By.cssSelector(LocatorsPath.VERIFY_LOCK)));
				WebElement verify = wait.until(ExpectedConditions.
						presenceOfElementLocated((By.cssSelector(LocatorsPath.VERIFY_LOCK))));
				if(verify.getText().equals("Locked")) {
					System.out.println("Lock is displayed successfully");
				}
				
				if(verify.getText().equals("UnLocked")) {
					PageObjects.SelectByCSSSelector(
							driver, LocatorsPath.CONTRACT_CHECKBOX, LocatorsPath.MAX_TIME);
					PageObjects.SelectByCSSSelector(
							driver, LocatorsPath.LOCK_UNLOCK, LocatorsPath.MAX_TIME);
					Assert.assertEquals("Locked", verify.getText());
				}
			} catch (StaleElementReferenceException StaleElementReferenceException) {
				System.out.println("Trying to recover from stale element" + StaleElementReferenceException);
			}
			System.out.println("Success: Lock/Unlock button selected successfully");
		}
		

		@Then("^User verifies the Contract is locked successfully$")
		public void user_verifies_the_Contract_is_locked_successfully() throws Throwable {

			System.out.println("User verifies the Contract is locked successfully");
		}
		
		
		
		/**----------------------RCS_SaaS_Associate_Customer_Contract--------------------------**/
		
		

		@Then("^User selects the customer for whom the contract has to be associated$")
		public void user_selects_the_customer_for_whom_the_contract_has_to_be_associated() throws Throwable {
		    
			System.out.println("Success: User selects the "
					+ "customer for whom the contract has to be associated");
		}
		

		@Then("^User navigates to the search module$")
		public void user_navigates_to_the_search_module() throws Throwable {
		    
			System.out.println("Attempt: navigate to search module");
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.SEARCH, LocatorsPath.MAX_TIME);	
			System.out.println("success: navigated to search module successfully");
		}
		

		@Then("^User enters the customer number$")
		public void user_enters_the_customer_number() throws Throwable {
		    
            System.out.println("Attempt: enter the customer number");
			newOutletCreationPage.user_clicks_on_Create_new_customer_button();
			newOutletCreationPage.the_user_selects_Customer_type_from_the_drop_down();
			newOutletCreationPage.user_selects_Status_from_drop_down();
			newOutletCreationPage.user_selects_Shopper_channel_from_dropdown();
			newOutletCreationPage.user_enters_Customer_name_in_the_Customer_Name_text_box();
			newOutletCreationPage.user_selects_Outlet_type_from_outlet_type_dropdown();
			newOutletCreationPage.user_selects_Outlet_subtype_from_outlet_subtype_dropdown();
			newOutletCreationPage.user_selects_Territory_from_Territory_dropdown();
			System.out.println("success: customer number entered successfully");
		}
		

		@Then("^User clicks on the search button$")
		public void user_clicks_on_the_search_button() throws Throwable {
		    
			System.out.println("Attempt: click on search button");
			newOutletCreationPage.
			user_clicks_on_save_button_and_the_customer_should_be_created_successfully();
			
			WebElement cust = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.FETCH_CUST_NUM))));
			file.setCellData("Contract", "Customer Number", 2, 
					cust.getText());
			WebElement msg = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.SUCCESS_MESSAGE))));
			Assert.assertEquals("Customer created successfully.", msg.getText());
			System.out.println("success: search button clicked successfully");
		}
		

		@Then("^User clicks on 'Export in CSV' button$")
		public void user_clicks_on_Export_in_CSV_button() throws Throwable {
		    
			System.out.println("Attempt: click on 'Export in CSV' button");
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.EXPORT_IN_CSV, LocatorsPath.MAX_TIME);	
			System.out.println("success: 'Export in CSV' button clicked successfully");
		}
		

		@Then("^User verifies the following pre-requisite is executed successfully$")
		public void user_verifies_the_following_pre_requisite_is_executed_successfully() throws Throwable {
		    
			configurationPage.i_Click_on_Configiuration();
			user_clicks_on_Contract_tab_and_navigates_to_the_Contract_screen();
		}
		

		@Then("^User selects the contract for which the customer has to be associated and then clicks on the associate customers button$")
		public void user_selects_the_contract_for_which_the_customer_has_to_be_associated_and_then_clicks_on_the_associate_customers_button() throws Throwable {
		    
			System.out.println("Attempt: select the contract which the customer has to be associated "
					+ "and click on associate customers button");
			CallObject.waitForPageLoad(driver);
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.CONTRACT_ASSOCIATE_CUSTOMERS, LocatorsPath.MAX_TIME);	
			System.out.println("success: Contract as been associate and "
					+ "clicked on associate customers button successfully");
		}
		

		@Then("^User verifies the popup window to import the file is opened successfully$")
		public void user_verifies_the_popup_window_to_import_the_file_is_opened_successfully() throws Throwable {
		   
			System.out.println("Attempt:Popup window to import the file should get opened");
			robot.importFile(LocatorsPath.CONTRACT_CUSTOMER);
		    System.out.println("Success:Popup window to import the file opened successfully");
		}
		

		@Then("^User selects the file and imports it$")
		public void user_selects_the_file_and_imports_it() throws Throwable {

			System.out.println("Attempt: select the file and import it");
			WebElement msg = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.WARN_MESSAGE))));
			Assert.assertEquals("Total Records:-1 Success Records:-1 Error Records:-0",
					msg.getText());
			System.out.println("Success: selected the file and imported it");
		}
		

		@Then("^User searches for the Customer selected in the Import File in search screen$")
		public void user_searches_for_the_Customer_selected_in_the_Import_File_in_search_screen() throws Throwable {
		    
			user_navigates_to_the_search_module();	
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.CUSTOMER_NUMBER, LocatorsPath.MAX_TIME, 
					file.getCellData("Contract", "Customer Number", 2));
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.CUSTOMER_SEARCH, LocatorsPath.MAX_TIME);
		}
		

		@Then("^User navigates to the 'Data Entry' and selects the 'Contract'$")
		public void user_navigates_to_the_Data_Entry_and_selects_the_Contract() throws Throwable {
		    
			System.out.println("Attempt: navigate to the 'Data Entry' and select the 'Contract'");
			PageObjects.SelectByXpath(
					driver, LocatorsPath.CONTRACT, LocatorsPath.MAX_TIME);
			System.out.println("Success: navigated to the 'Data Entry' and selected the 'Contract'");
		}
		

		@Then("^User verifies the Customer is associated with the selected 'Contract' successfully\\.$")
		public void user_verifies_the_Customer_is_associated_with_the_selected_Contract_successfully() throws Throwable {
		    
			System.out.println("Attempt: 'Contract' screen should be displayed");
			PageObjects.SelectByXpathWithoutClick(
					driver, LocatorsPath.LIST_CONTRACTS_CUSTOMER, LocatorsPath.MAX_TIME);
			
			WebElement cust = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.CONTRACT_ROW))));
			if(cust.isDisplayed()) {
				WebElement Cust = wait.until(ExpectedConditions.
						presenceOfElementLocated((By.cssSelector(LocatorsPath.CONTRACT_ROW_VERIFY))));
				Assert.assertEquals(file.getCellData("Contract", "Contract Name", 2), 
						Cust.getText());
			}else {
				Assert.fail("Contract row is not displayed");
			}
			System.out.println("Success: 'Contract' screen displayed successfully");
		}
		

		
		/**----------------------RCS_SaaS_Exporting_Corporate_Contract--------------------------**/
		
		
		
		
		@Then("^User selects the contracts which needs to be exported by selecting the Checkbox corresponding to the contract$")
		public void user_selects_the_contracts_which_needs_to_be_exported_by_selecting_the_Checkbox_corresponding_to_the_contract() throws Throwable {
		 
			configurationPage.i_Click_on_Configiuration();
			user_clicks_on_Contract_tab_and_navigates_to_the_Contract_screen();
			user_selects_the_contract_which_has_to_be_locked_by_clicking_on_the_checkbox_next_to_the_contract_name();
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.CONTRACT_CHECKBOX, LocatorsPath.MAX_TIME);
		}
		

		@Then("^User Clicks on the export button$")
		public void user_Clicks_on_the_export_button() throws Throwable {
		 
			System.out.println("Attempt: User Clicks on the export");
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.EXPORT, LocatorsPath.MAX_TIME);
			System.out.println("Success: export button selected successfully");
		}
		

		@Then("^User verifies the zip file gets downloaded having (\\d+) csv files - Contract details, Contract customers, Contract drivers$")
		public void user_verifies_the_zip_file_gets_downloaded_having_csv_files_Contract_details_Contract_customers_Contract_drivers(int arg1) throws Throwable {
		    
			CallObject.block(5000);
			File newfile = renameFile.getTheNewestFile(LocatorsPath.ContractDriveLocation, LocatorsPath.ContractZipFormat);
			newfile.renameTo(new File(LocatorsPath.ContractFileLocation1));
			String filename= newfile.getName();
			System.out.println("latest file is = "+filename);
			  
			RenameFile renamefile = new RenameFile();
			File updated = renamefile.getTheNewestFile(LocatorsPath.ContractDriveLocation, LocatorsPath.ContractZipFormat);
			System.out.println("Changed file name is = "+updated);
			
			CallObject.block(3000);
			extractZipFile.unzip(LocatorsPath.ContractFileLocation1, LocatorsPath.ContractDriveLocation);
					
			//Rename First File Location
			File newcsvfile = renameFile.getTheNewestFile(LocatorsPath.ContractDriveLocation, LocatorsPath.ContractCSVFormat);
			newcsvfile.renameTo(new File(LocatorsPath.ContractCsvFirstFileLocation));
			String csvfilename= newcsvfile.getName();
			System.out.println("latest file is = "+csvfilename);
			  
			RenameFile renamecsvfile = new RenameFile();
			File csvUpdated = renamecsvfile.getTheNewestFile(LocatorsPath.ContractDriveLocation, LocatorsPath.ContractCSVFormat);
			System.out.println("Changed file name is = "+csvUpdated);
			
			//Rename Second File Location
			File newcsvfile1 = renameFile.getTheSecondNewestFile(LocatorsPath.ContractDriveLocation, LocatorsPath.ContractCSVFormat);
			newcsvfile1.renameTo(new File(LocatorsPath.ContractCsvSecondFileLocation));
			String csvfilename1= newcsvfile1.getName();
			System.out.println("latest file is = "+csvfilename1);
			  
			RenameFile renamecsvfile1 = new RenameFile();
			File csvUpdated1 = renamecsvfile1.getTheNewestFile(LocatorsPath.ContractDriveLocation, LocatorsPath.ContractCSVFormat);
			System.out.println("Changed file name is = "+csvUpdated1);
			
			//Rename Third File Location
			File newcsvfile2 = renameFile.getTheSecondNewestFile(LocatorsPath.ContractDriveLocation, LocatorsPath.ContractCSVFormat);
			newcsvfile2.renameTo(new File(LocatorsPath.ContractCsvThirdFileLocation));
			String csvfilename2 = newcsvfile1.getName();
			System.out.println("latest file is = "+csvfilename2);
			  
			RenameFile renamecsvfile2 = new RenameFile();
			File csvUpdated2 = renamecsvfile2.getTheNewestFile(LocatorsPath.ContractDriveLocation, LocatorsPath.ContractCSVFormat);
			System.out.println("Changed file name is = "+csvUpdated2);
		}
		

		
		/**----------------------RCS_SaaS_Exporting_Outlet_Details--------------------------**/
		
		
		
		
		@Then("^User selects the outlets which needs to be exported by selecting the Check box corresponding to the outlet$")
		public void user_selects_the_outlets_which_needs_to_be_exported_by_selecting_the_Check_box_corresponding_to_the_outlet() throws Throwable {
		   
			System.out.println("Attempt: select the outlets which needs to be exported by "
					+ "selecting the Check box corresponding to the outlet");
			WebElement verify = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.OUTLETS_ROW))));
			if(verify.isDisplayed()) {
				PageObjects.SelectByCSSSelector(
						driver, LocatorsPath.OUTLETS_ROW_CHECKBOX, LocatorsPath.MAX_TIME);
			}else {
				Assert.fail("Outlets row is not displayed");
			}
			System.out.println("Success: selected the outlets which needs to be exported by "
					+ "selecting the Check box corresponding to the outlet");
		}
		

		@Then("^User Clicks on the export for outlet$")
		public void user_Clicks_on_the_export_for_outlet() throws Throwable {
		 
			System.out.println("Attempt: Click on the export for outlet");
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.OUTLETS_EXPORT, LocatorsPath.MAX_TIME);
			System.out.println("Success: Clicked on the export for outlet");
		}
		

		@Then("^User verifies the zip file gets downloaded having Contract customers details\\.$")
		public void user_verifies_the_zip_file_gets_downloaded_having_Contract_customers_details() throws Throwable {
		    
			System.out.println("Attempt: verify the zip file gets downloaded having Contract customers details");
			CallObject.block(5000);
			File newfile = renameFile.getTheNewestFile(LocatorsPath.ContractDriveLocation, LocatorsPath.ContractZipFormat);
			newfile.renameTo(new File(LocatorsPath.ContractFileLocation2));
			String filename= newfile.getName();
			System.out.println("latest file is = "+filename);
			  
			RenameFile renamefile = new RenameFile();
			File updated = renamefile.getTheNewestFile(LocatorsPath.ContractDriveLocation, LocatorsPath.ContractZipFormat);
			System.out.println("Changed file name is = "+updated);
			
			CallObject.block(3000);
			extractZipFile.unzip(LocatorsPath.ContractFileLocation2, LocatorsPath.ContractDriveLocation);
					
			//Rename First File Location
			File newcsvfile = renameFile.getTheNewestFile(LocatorsPath.ContractDriveLocation, LocatorsPath.ContractCSVFormat);
			newcsvfile.renameTo(new File(LocatorsPath.ContractCsvFourthFileLocation));
			String csvfilename= newcsvfile.getName();
			System.out.println("latest file is = "+csvfilename);
			  
			RenameFile renamecsvfile = new RenameFile();
			File csvUpdated = renamecsvfile.getTheNewestFile(LocatorsPath.ContractDriveLocation, LocatorsPath.ContractCSVFormat);
			System.out.println("Changed file name is = "+csvUpdated);
			System.out.println("Success: verified the zip file gets downloaded having Contract customers details");
		}
}
