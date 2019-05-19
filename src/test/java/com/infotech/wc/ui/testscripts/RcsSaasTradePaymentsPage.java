package com.infotech.wc.ui.testscripts;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.infotech.Excel.ExcelApiFile;
import com.infotech.basepage.CallObject;
import com.infotech.basepage.LocatorsPath;
import com.infotech.basepage.PageObjects;
import com.infotech.basepage.RobotPage;
import com.infotech.testrunner.TestRunnerWebClient;

import cucumber.api.java.en.Then;

public class RcsSaasTradePaymentsPage extends TestRunnerWebClient{
	
	WebDriver driver = getDriver();
	Actions actions = new Actions(driver);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	ExcelApiFile file = new ExcelApiFile("TestData.xlsx");
	ExcelApiFile file1 = new ExcelApiFile("TestData1.xlsx");
	RobotPage robotPage = new RobotPage();
	WebDriverWait wait = new WebDriverWait(driver, LocatorsPath.MAX_TIME);
	RcsSaasNewOutletCreationPage newOutletCreationPage = new RcsSaasNewOutletCreationPage();
	RcsSaasConfigurationUsersPage configurationPage = new RcsSaasConfigurationUsersPage();
	

	public RcsSaasTradePaymentsPage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	/**----------------------RCS_SaaS_Configuration_TradePayments_WC--------------------------**/
	
	
	
	@Then("^User clicks on Trade Payments and navigates to Trade Payments Screen$")
	public void user_clicks_on_Trade_Payments_and_navigates_to_Trade_Payments_Screen() throws Throwable {
	 
		System.out.println("Attempt: select 'Trade Payments' tab");
		PageObjects.SelectByXpath(
				driver, LocatorsPath.TRADE_PAYMENTS, LocatorsPath.MAX_TIME);
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.TRADE_PAYMENTS_DISP, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Trade Payments' tab selected successfully");
	}

	
	@Then("^User selects 'Depot' dropdown - defaulted to All$")
	public void user_selects_Depot_dropdown_defaulted_to_All() throws Throwable {
	    
		System.out.println("Attempt: select the field - 'Depot'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.TRADE_DEPOT, LocatorsPath.MAX_TIME, 
				file1.getCellData("Trade Payments", "Depot", 2));
		System.out.println("Success: 'Depot' selected successfully");
	}
	

	@Then("^User selects 'Territory' - Defaulted to All$")
	public void user_selects_Territory_Defaulted_to_All() throws Throwable {
	    
		System.out.println("Attempt: select the field - 'Territory'");
	    js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.xpath("//select[@id='content-area:idealStock1:territories_1']/option[contains(text(),'"+file.getCellData("Territory", "TerritoryName", 2)+"')]")));
	    CallObject.block(1000);
	    WebElement element = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath("//select[@id='content-area:idealStock1:territories_1']/option[contains(text(),'"+file.getCellData("Territory", "TerritoryName", 2)+"')]"))));
	    actions.moveToElement(element).doubleClick().build().perform();
		System.out.println("Success: 'Territory' selected successfully");
	}
	

	@Then("^User selects 'Valid from' - defaulted to (\\d+)st of current month$")
	public void user_selects_Valid_from_defaulted_to_st_of_current_month(int arg1) throws Throwable {
	    
		System.out.println("Attempt: select the 'Valid from'");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.VALID_FROM, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.TRADE_START_DATE, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Valid from' as been selected successfully");
	}
	

	@Then("^User selects 'Valid to' - Defaulted to last date of current month$")
	public void user_selects_Valid_to_Defaulted_to_last_date_of_current_month() throws Throwable {
	    
		System.out.println("Attempt: select the 'Valid to'");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.VALID_UPTO, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.TRADE_END_DATE, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Valid to' as been selected successfully");
	}
	

	@Then("^User selects 'Status' - Defaulted to All$")
	public void user_selects_Status_Defaulted_to_All() throws Throwable {
	    
		System.out.println("Attempt: select the field - 'Status'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.TRADE_STATUS, LocatorsPath.MAX_TIME, 
				file1.getCellData("Trade Payments", "Status", 2));
		System.out.println("Success: 'Status' selected successfully");
	}
	

	@Then("^User selects 'Contract' - Defaulted to All$")
	public void user_selects_Contract_Defaulted_to_All() throws Throwable {
	    
		System.out.println("Attempt: select the field - 'Contract'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.TRADE_CONTRACT, LocatorsPath.MAX_TIME, 
				file1.getCellData("Trade Payments", "Contract", 2));
		System.out.println("Success: 'Contract' selected successfully");
	}
	

	@Then("^User selects 'Type' - Defaulted to All$")
	public void user_selects_Type_Defaulted_to_All() throws Throwable {
	    
		System.out.println("Attempt: select the field - 'Type'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.TRADE_TYPE, LocatorsPath.MAX_TIME, 
				file1.getCellData("Trade Payments", "Type", 2));
		System.out.println("Success: 'Type' selected successfully");
	}
	

	@Then("^User directly clicks on Show button or selects the different values in filter and then clicks on 'Show' button\\.$")
	public void user_directly_clicks_on_Show_button_or_selects_the_different_values_in_filter_and_then_clicks_on_Show_button() throws Throwable {
	    
		System.out.println("Attempt: Click on Show button");
		CallObject.waitForPageLoad(driver);
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.TRADE_SHOW)));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.TRADE_SHOW, LocatorsPath.MAX_TIME);
		System.out.println("Success: Show button selected successfully");
	}
	

	@Then("^Selection of Filter conditions should be successful$")
	public void selection_of_Filter_conditions_should_be_successful() throws Throwable {
	 
		System.out.println("Selection of Filter conditions should be successful");
	}
	

	@Then("^All the trade payment records pertaining to the selection criteria is displayed successfully$")
	public void all_the_trade_payment_records_pertaining_to_the_selection_criteria_is_displayed_successfully() throws Throwable {
	    
		System.out.println("All the trade payment records pertaining to the "
				+ "selection criteria is displayed successfully");
	}
	

	
	/**----------------------RCS_SaaS_Configuration_Creation_New_Trade_Payment_WC--------------------------**/
	
	
	
	@Then("^User clicks on 'Add' button to create a new Trade Payment$")
	public void user_clicks_on_Add_button_to_create_a_new_Trade_Payment() throws Throwable {
	    
		System.out.println("Attempt: Click on Add button");
		CallObject.waitForPageLoad(driver);
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.TRADE_ADD)));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.TRADE_ADD, LocatorsPath.MAX_TIME);
		System.out.println("Success: Add button selected successfully");
	}
	

	@Then("^User enters/selects the 'Customer number/Customer name/Territory' and clicks on search button$")
	public void user_enters_selects_the_Customer_number_Customer_name_Territory_and_clicks_on_search_button() throws Throwable {
	    
		System.out.println("Attempt: User enters/selects the 'Customer number/"
				+ "Customer name/Territory' and clicks on search button");
        switch (file1.getCellData("Trade Payments", "Advanced Search", 2)) {
		
		case "Customer Name":
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.TRADE_CUSTOMER_NAME, LocatorsPath.MAX_TIME, 
					file.getCellData("Contract", "Contract Name", 2));
			CallObject.waitForPageLoad(driver);
			js.executeScript("arguments[0].scrollIntoView();", 
					driver.findElement(By.cssSelector(LocatorsPath.TRADE_CUSTOMER_SEARCH)));
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.TRADE_CUSTOMER_SEARCH, LocatorsPath.MAX_TIME);
            break;
			
			
		case "Customer Number":
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.TRADE_CUSTOMER_NUMBER, LocatorsPath.MAX_TIME, 
					file.getCellData("Contract", "Customer Number", 2));
			CallObject.waitForPageLoad(driver);
			js.executeScript("arguments[0].scrollIntoView();", 
					driver.findElement(By.cssSelector(LocatorsPath.TRADE_CUSTOMER_SEARCH)));
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.TRADE_CUSTOMER_SEARCH, LocatorsPath.MAX_TIME);
			break;
			
			
		case "Territory":
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.CUSTOMER_TERRITORY, LocatorsPath.MAX_TIME, 
					file.getCellData("Territory", "TerritoryName", 2));
			CallObject.waitForPageLoad(driver);
			js.executeScript("arguments[0].scrollIntoView();", 
					driver.findElement(By.cssSelector(LocatorsPath.TRADE_CUSTOMER_SEARCH)));
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.TRADE_CUSTOMER_SEARCH, LocatorsPath.MAX_TIME);
			break;	
			
			
        default:
			System.out.println("Expected Advanced search are not present");
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.TRADE_CUSTOMER_NAME, LocatorsPath.MAX_TIME, 
					file.getCellData("Contract", "Contract Name", 2));
			CallObject.waitForPageLoad(driver);
			js.executeScript("arguments[0].scrollIntoView();", 
					driver.findElement(By.cssSelector(LocatorsPath.TRADE_CUSTOMER_SEARCH)));
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.TRADE_CUSTOMER_SEARCH, LocatorsPath.MAX_TIME);
			
			System.out.println("Success: 'Customer number/"
					+ "Customer name/Territory' entered and clicked on search button successfully");
        }
	}
	

	@Then("^The screen should be displayed consisting following fields - 'Customer name, Customer number and territory'$")
	public void the_screen_should_be_displayed_consisting_following_fields_Customer_name_Customer_number_and_territory() throws Throwable {
	    
		System.out.println("Attempt: Screen should display consisting "
				+ "following fields - 'Customer name, Customer number and territory'");
		WebElement customerName = wait.until(ExpectedConditions.
				presenceOfElementLocated((
						By.cssSelector(LocatorsPath.VERIFY_CUSTOMER_NAME))));
		WebElement customerNumber = wait.until(ExpectedConditions.
				presenceOfElementLocated((
						By.cssSelector(LocatorsPath.VERIFY_CUSTOMER_NUMBER))));
		WebElement territory = wait.until(ExpectedConditions.
				presenceOfElementLocated((
						By.cssSelector(LocatorsPath.VERIFY_TERRITORY))));
		Assert.assertEquals("Customer Name", 
				customerName.getText());
		Assert.assertEquals("Customer Number", 
				customerNumber.getText());
		Assert.assertEquals("Territory Name", 
				territory.getText());
		System.out.println("Success: following fields - 'Customer name, Customer number "
				+ "and territory' displayed successfully");
	}
	

	@Then("^User selects a customer and clicks on 'Add' button$")
	public void user_selects_a_customer_and_clicks_on_Add_button() throws Throwable {
	    
		System.out.println("Attempt: Click on Show button");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.CUSTOMER_CHECKBOX, LocatorsPath.MAX_TIME);
		CallObject.waitForPageLoad(driver);
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.CUSTOMER_ADD)));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.CUSTOMER_ADD, LocatorsPath.MAX_TIME);
		System.out.println("Success: Show button selected successfully");
	}
	

	@Then("^On selecting a customer, user should be navigated to trade Payment screen with the selected customer name & number prepopulated$")
	public void on_selecting_a_customer_user_should_be_navigated_to_trade_Payment_screen_with_the_selected_customer_name_number_prepopulated() throws Throwable {
	    
		System.out.println("Attempt: User should be navigated to trade Payment "
				+ "screen with the selected customer name & number prepopulated");
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.ADD_TRADE_PAYMENTS_DISP, LocatorsPath.MAX_TIME);
		WebElement customerName = wait.until(ExpectedConditions.
				presenceOfElementLocated((
						By.cssSelector(LocatorsPath.ADD_CUSTOMER_NAME))));
		if(customerName.isEnabled()) {
			Assert.assertTrue(customerName.isEnabled());
			Assert.assertEquals(file.getCellData("Contract", "Contract Name", 2), 
					customerName.getAttribute("value"));
		}else {
			Assert.fail("Either Customer Name is disabled "
					+ "or Customer Name doesn't match");
		}
		
		WebElement customerNumber = wait.until(ExpectedConditions.
				presenceOfElementLocated((
						By.cssSelector(LocatorsPath.ADD_CUSTOMER_NUMBER))));
		if(customerNumber.isEnabled()) {
			Assert.assertEquals(true, 
					customerNumber.isEnabled());
			Assert.assertEquals(file.getCellData("Contract", "Customer Number", 2), 
					customerNumber.getAttribute("value"));	
		}else {
			Assert.fail("Either Customer Number is disabled "
					+ "or Customer Number doesn't match");
		}
		System.out.println("Success: User navigated to trade Payment screen"
				+ " with the selected customer name & number successfully");
	}
	

	@Then("^User selects the 'Contract name' - Mandatory field$")
	public void user_selects_the_Contract_name_Mandatory_field() throws Throwable {
	    
		System.out.println("Attempt: select the field - 'Contract name'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ADD_CONTRACT, LocatorsPath.MAX_TIME, 
				file.getCellData("Contract", "Contract Name", 2));
		System.out.println("Success: 'Contract name' selected successfully");
	}
	

	@Then("^User enters the 'Amount' - Mandatory field$")
	public void user_enters_the_Amount_Mandatory_field() throws Throwable {
	    
		System.out.println("Attempt: enter the field - 'Amount'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ADD_AMOUNT, LocatorsPath.MAX_TIME, 
				file1.getCellData("Trade Payments", "Amount", 2));
		System.out.println("Success: 'Amount' entered successfully");
	}
	

	@Then("^User selects 'Valid From date'- Mandatory field$")
	public void user_selects_Valid_From_date_Mandatory_field() throws Throwable {
	   
		System.out.println("Attempt: select the 'Valid From date'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ADD_VALID_FROM, LocatorsPath.MAX_TIME, 
				CallObject.futureDate());
		System.out.println("Success: 'Valid From date' as been selected successfully");
	}
	

	@Then("^User selects 'Valid Upto date' - Mandatory field$")
	public void user_selects_Valid_Upto_date_Mandatory_field() throws Throwable {
	    
		System.out.println("Attempt: select the 'Valid Upto date'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ADD_VALID_UPTO, LocatorsPath.MAX_TIME, 
				CallObject.futureDate());
		System.out.println("Success: 'Valid Upto date' as been selected successfully");
	}
	

	@Then("^User selects the 'Status' - Mandatory field$")
	public void user_selects_the_Status_Mandatory_field() throws Throwable {
	    
		System.out.println("Attempt: Select the field - 'Status'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.TRADE_ADD_STATUS, LocatorsPath.MAX_TIME, 
				file1.getCellData("Trade Payments", "Status", 2));
		System.out.println("Success: 'Status' selected successfully");
	}
	

	@Then("^User verifies 'Rep Apply' checkbox defaults to 'N'$")
	public void user_verifies_Rep_Apply_checkbox_defaults_to_N() throws Throwable {
	    
		System.out.println("Attempt: Verify 'Rep Apply' checkbox defaults to 'N'");
		WebElement customerName = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.REP_APPLY))));
		if(!customerName.isSelected()) {
			CallObject.waitForPageLoad(driver);
			Assert.assertTrue(true);
		}else {
			Assert.fail("Checkbox selected");
		}
		System.out.println("Success: 'Rep Apply' checkbox defaulted to 'N'");
	}
	

	@Then("^User selects the 'Type' - Mandatory field$")
	public void user_selects_the_Type_Mandatory_field() throws Throwable {
	    
		System.out.println("Attempt: Select the field - 'Type'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ADD_TYPE, LocatorsPath.MAX_TIME, 
				file1.getCellData("Trade Payments", "Add Trade Type", 2));
		System.out.println("Success: 'Type' selected successfully");
	}
	

	@Then("^User selects the 'Reason code'- Mandatory field$")
	public void user_selects_the_Reason_code_Mandatory_field() throws Throwable {
	    
		System.out.println("Attempt: Select the field - 'Reason code'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ADD_REASON_CODE, LocatorsPath.MAX_TIME, 
				file1.getCellData("Trade Payments", "Reason Code", 2));
		System.out.println("Success: 'Reason code' selected successfully");
	}
	

	@Then("^User enters the 'Invoice Reference' - Invoice Reference should be displayed the Invoice number on which the trade applied, Populated once the rebate is applied$")
	public void user_enters_the_Invoice_Reference_Invoice_Reference_should_be_displayed_the_Invoice_number_on_which_the_trade_applied_Populated_once_the_rebate_is_applied() throws Throwable {
	    
		System.out.println("Attempt: Enter the field - 'Invoice Reference'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ADD_INVOICE_REFERENCE, LocatorsPath.MAX_TIME, 
				file1.getCellData("Trade Payments", "Invoice Reference", 2));
		System.out.println("Success: 'Invoice Reference' entered successfully");
	}
	

	@Then("^User selects the 'TCIB'- Mandatory field$")
	public void user_selects_the_TCIB_Mandatory_field() throws Throwable {
	    
		System.out.println("Attempt: Select the field - 'TCIB'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ADD_TCIB, LocatorsPath.MAX_TIME, 
				file1.getCellData("Trade Payments", "TCIB", 2));
		System.out.println("Success: 'TCIB' selected successfully");
	}
	

	@Then("^User enters the 'Remarks' - remarks given here will be displayed on clicking the 'i' icon on Order header level while creating order$")
	public void user_enters_the_Remarks_remarks_given_here_will_be_displayed_on_clicking_the_i_icon_on_Order_header_level_while_creating_order() throws Throwable {
	    
		System.out.println("Attempt: Enter the field - 'Remarks'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ADD_REMARKS, LocatorsPath.MAX_TIME, 
				file1.getCellData("Trade Payments", "Remarks", 2));
		System.out.println("Success: 'Remarks' entered successfully");
	}
	

	@Then("^User selects the 'Free field(\\d+)- LOV Field'$")
	public void user_selects_the_Free_field_LOV_Field(int arg1) throws Throwable {
	    
		System.out.println("User selects the 'Free field(\\d+)- LOV Field'");
	}
	

	@Then("^User enters the 'Free Text(\\d+)'$")
	public void user_enters_the_Free_Text(int arg1) throws Throwable {
	    
		System.out.println("Attempt: Enter the field - 'Free Text1'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ADD_FREE_TEXT_1, LocatorsPath.MAX_TIME, 
				file1.getCellData("Trade Payments", "Free Text1", 2));
		System.out.println("Success: 'Free Text1' entered successfully");
	}
	

	@Then("^User clicks on save button and details entered should be saved and new trade payment is created successfully\\.$")
	public void user_clicks_on_save_button_and_details_entered_should_be_saved_and_new_trade_payment_is_created_successfully() throws Throwable {
	    
		System.out.println("Attempt: Click on save button");
		CallObject.waitForPageLoad(driver);
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.ADD_SAVE)));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ADD_SAVE, LocatorsPath.MAX_TIME);
		
		WebElement element = wait.until(ExpectedConditions.
				presenceOfElementLocated((
						By.cssSelector(LocatorsPath.TRADE_MESSAGE_FROM_SYSTEM))));
		Assert.assertEquals("Trade Payment Saved Successfully", 
				element.getText());
		System.out.println("Success: save button selected successfully");
	}
	

	
	/**----------------------RCS_SaaS_Configuration_Trade_Payment_Export_WC--------------------------**/
	
	
	
	@Then("^User selects the Trade Payment or selects all the Trade Payments$")
	public void user_selects_the_Trade_Payment_or_selects_all_the_Trade_Payments() throws Throwable {
	    
		System.out.println("Attempt: Select the Trade Payment");
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.LIST_TRADE_PAYMENT_ROW)));
		WebElement row = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.LIST_TRADE_PAYMENT_ROW))));
		if(row.isDisplayed()) {
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.CONTRCT_CHECKBOX, LocatorsPath.MAX_TIME);
		}else {
			Assert.fail("Trade payment for contract row is not present");
		}
		
		System.out.println("Success: 'Trade Payment' selected successfully");
	}
	

	@Then("^User clicks on Export button$")
	public void user_clicks_on_Export_button() throws Throwable {
	    
		System.out.println("Attempt: verify that the selected Trade Payment exported without any errors");
		CallObject.block(3000);
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.CONTRACT_EXPORT)));
		WebElement export = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.CONTRACT_EXPORT))));
		if(export.isEnabled()) {
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.CONTRACT_EXPORT, LocatorsPath.MAX_TIME);
			CallObject.block(5000);
		}else {
			Assert.fail("Export button is not enabled");
		}
		System.out.println("Success: Trade Payment exported without any errors successfully");
	}
	

	@Then("^User verifies that the selected Trade Payment exported without any errors\\.$")
	public void user_verifies_that_the_selected_Trade_Payment_exported_without_any_errors() throws Throwable {
	    
		System.out.println("User verifies that the selected "
				+ "Trade Payment exported without any errors");
	}
	

	
	/**----------------------RCS_SaaS_Configuration_Trade_Payment_Import_WC--------------------------**/
	
	
	
	@Then("^User updates the Trade Payments Export file which as been downloaded$")
	public void user_updates_the_Trade_Payments_Export_file_which_as_been_downloaded() throws Throwable {
	    
		System.out.println("User updates the Trade Payments Export file which as been downloaded");
	}

	@Then("^User clicks on Import Trade Payments button$")
	public void user_clicks_on_Import_Trade_Payments_button() throws Throwable {
	    
		System.out.println("Attempt: clicks on the Import Trade Payments button");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.IMPORT_TRADE_PAYMENTS, LocatorsPath.MAX_TIME);
		System.out.println("Success: clicked on the Import Trade Payments button successfully");
	}

	
	@Then("^The Pop up window should get opened for the selection of Import Template$")
	public void the_Pop_up_window_should_get_opened_for_the_selection_of_Import_Template() throws Throwable {
	   
		robotPage.importFile(LocatorsPath.tradepayments);
	}
	

	@Then("^User selects the Import template to be uploaded and the selected Template should be imported successfully\\.$")
	public void user_selects_the_Import_template_to_be_uploaded_and_the_selected_Template_should_be_imported_successfully() throws Throwable {
	    
		System.out.println("Attempt: select the Import template to be uploaded and "
				+ "the selected Template should be imported successfully");
		WebElement verifyTradePayment = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.WARN_MESSAGE))));
		org.testng.Assert.assertEquals("Total Records:-1 Success Records:-1 Error Records:-0", 
				verifyTradePayment.getText());
		
		user_directly_clicks_on_Show_button_or_selects_the_different_values_in_filter_and_then_clicks_on_Show_button();
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.TRADE_DELETE)));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.TRADE_DELETE, LocatorsPath.MAX_TIME);
		CallObject.switchToAlert(driver);
		System.out.println("Success: selected the Import template to be "
				+ "uploaded and the Template is imported successfully");
	}
}
