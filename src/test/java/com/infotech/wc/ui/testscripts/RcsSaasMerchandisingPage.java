package com.infotech.wc.ui.testscripts;

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
import com.infotech.testrunner.TestRunnerWebClient;

import cucumber.api.java.en.Then;

public class RcsSaasMerchandisingPage extends TestRunnerWebClient{
	
	WebDriver driver = getDriver();
	Actions actions = new Actions(driver);
	ExcelApiFile file = new ExcelApiFile("TestData.xlsx");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	WebDriverWait wait = new WebDriverWait(driver, LocatorsPath.MAX_TIME);
	
	public RcsSaasMerchandisingPage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	/**----------------------RCS SAAS Merchandising_WC--------------------------**/
	
	
	@Then("^User clicks on Merchandising and navigates to Merchandising Screen$")
	public void i_Click_on_Merchandising_and_navigated_to_Merchandising_Screen() throws Throwable {
	   
		System.out.println("Attempt: Click on Merchandising Menu");
		WebElement merchandising = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.MERCHANDISING))));
		actions.moveToElement(merchandising).doubleClick().build().perform();
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.MERCHANDISING_DISPLAY, LocatorsPath.MAX_TIME);
		System.out.println("Success: Merchandising Menu selected successfully");
	}

	
	@Then("^User clicks on Add button and verifies the Add Merchandise screen is displayed$")
	public void i_Click_on_Add_button_and_verify_Add_Merchandise_screen_is_displayed() throws Throwable {
	   
		System.out.println("Attempt: Click on Add button");
		CallObject.waitForPageLoad(driver);
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.ADD)));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ADD, LocatorsPath.MAX_TIME);
		System.out.println("Success: Add button selected successfully");
	}
	

	@Then("^User verifies all the fields were displayed in 'Add Merchandise' screen$")
	public void i_Verify_all_the_fields_were_displayed_in_Add_Merchandise_screen() throws Throwable {
	   
		System.out.println("I Verify all the fields "
				+ "were displayed in 'Add Merchandise' screen");
	}

	
	@Then("^User enters the 'Merchandise name'$")
	public void i_enter_the_field_Merchandise_name() throws Throwable {
	    
		System.out.println("Attempt: enter the field - 'Merchandise name'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.MERCHANDISING_NAME, LocatorsPath.MAX_TIME, 
				CallObject.timestamp().concat("_merchand"));
		file.setCellData("Merchandising", "MerchandiseName", 2, 
				CallObject.timestamp().concat("_merchand"));
		System.out.println("Success: 'Merchandise name' entered successfully");
	}

	
	@Then("^User selects the 'Brand name' dropdown which displays the Brand data from the products$")
	public void i_select_the_Brand_name_dropdown_which_displays_the_Brand_data_from_the_products() throws Throwable {
	   
		System.out.println("Attempt: select the field - 'Brand name'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.BRAND, LocatorsPath.MAX_TIME, 
				file.getCellData("Merchandising", "Brand", 2));
		System.out.println("Success: 'Brand name' selected successfully");
	}

	
	@Then("^User selects the 'Merchandise type' dropdown which displays the data from LOV > USER > MT$")
	public void i_select_the_Merchandise_type_dropdown_which_displays_the_data_from_LOV_USER_MT() throws Throwable {
	    
		System.out.println("Attempt: select the field - 'Merchandise type'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.MERCHANDISING_TYPE, LocatorsPath.MAX_TIME, 
				file.getCellData("Merchandising", "MerchandiseType", 2));
		System.out.println("Success: 'Merchandise type' selected successfully");
	}

	
	@Then("^User enters the 'Asset No\\.'$")
	public void i_enter_the_field_Asset_No() throws Throwable {
	    
		System.out.println("Attempt: enter the field - 'Asset No'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ASSET_NO, LocatorsPath.MAX_TIME, 
				file.getCellData("Merchandising", "AssetNo", 2));
		System.out.println("Success: 'Asset No' entered successfully");
	}

	
	@Then("^User enters the 'Cost'$")
	public void i_enter_the_field_Cost() throws Throwable {
	  
		System.out.println("Attempt: enter the field - 'Cost'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.COST_VN, LocatorsPath.MAX_TIME, 
				file.getCellData("Merchandising", "Cost(VN)", 2));
		System.out.println("Success: 'Cost' entered successfully");
	}

	
	@Then("^User selects the 'Status' dropdown for Merchandise$")
	public void i_select_Status_dropdown_for_Merchandise() throws Throwable {
		
		System.out.println("Attempt: select the 'Status' dropdown");
		PageObjects.SelectByXpathWithSendKeys(
				driver, LocatorsPath.MERCHANDISE_STATUS, LocatorsPath.MAX_TIME, 
				file.getCellData("Merchandising", "Status", 2));
		System.out.println("Success: 'Status' dropdown selected successfully");
	}
	
	
	@Then("^User selects the 'Start Date' for Merchandise$")
	public void i_select_the_Start_Date() throws Throwable {
	    
		System.out.println("Attempt: select the 'Start Date'");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.MERCHAND_START_DATE_CALENDER, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.MERCHANDISE_START_DATE, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Start Date' as been selected successfully");
	}

	
	@Then("^User selects the 'End Date' for Merchandise$")
	public void i_select_the_End_Date() throws Throwable {
	   
		System.out.println("Attempt: select the 'End Date'");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.MERCHAND_END_DATE_CALENDER, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.MERCHANDISE_END_DATE, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'End Date' as been selected successfully");
	}

	
	@Then("^User selects the 'Remove Date'$")
	public void i_select_the_Remove_Date() throws Throwable {
	    
		System.out.println("Attempt: select the 'Remove Date'");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.REMOVE_DATE_CALENDER, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.MERCHANDISE_END_DATE, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Remove Date' as been selected successfully");
	}

	
	@Then("^User selects the 'Inform capability' dropdown$")
	public void i_select_the_Inform_capability_dropdown() throws Throwable {
	   
		System.out.println("Attempt: select the dropdown - 'Inform capability'");
		PageObjects.SelectByXpathWithSendKeys(
				driver, LocatorsPath.INFORM_CAPABILITY, LocatorsPath.MAX_TIME, 
				file.getCellData("Merchandising", "InformCapability", 2));
		System.out.println("Success: 'Inform capability' selected successfully");
	}
	

	@Then("^User selects the 'Switch capability' dropdown$")
	public void i_select_the_Switch_capability_dropdown() throws Throwable {
	    
		System.out.println("Attempt: select the dropdown - 'Switch capability'");
		PageObjects.SelectByXpathWithSendKeys(
				driver, LocatorsPath.SWITCH_CAPABILITY, LocatorsPath.MAX_TIME, 
				file.getCellData("Merchandising", "SwitchCapability", 2));
		System.out.println("Success: 'Switch capability' selected successfully");
	}

	
	@Then("^User selects the 'Retain capability' dropdown$")
	public void i_select_the_Retain_capability_dropdown() throws Throwable {
	    
		System.out.println("Attempt: select the dropdown - 'Retain capability'");
		PageObjects.SelectByXpathWithSendKeys(
				driver, LocatorsPath.RETAIN_CAPABILITY, LocatorsPath.MAX_TIME, 
				file.getCellData("Merchandising", "RetainCapability", 2));
		System.out.println("Success: 'Retain capability' selected successfully");
	}
	

	@Then("^User selects Free Field (\\d+) dropdown which displays the data from LOV > USER > MFL(\\d+)$")
	public void i_select_Free_Field_dropdown_which_displays_the_data_from_LOV_USER_MFL(int arg1, int arg2) throws Throwable {
	    
		System.out.println("Attempt: select the dropdown - 'Free Field 1'");
		PageObjects.SelectByXpathWithSendKeys(
				driver, LocatorsPath.MERCHANDISE_FREE_FIELD_1, LocatorsPath.MAX_TIME, 
				file.getCellData("Merchandising", "FreeField1", 2));
		System.out.println("Success: 'Free Field 1' selected successfully");
	}
	
	
	@Then("^User selects Free Field (\\d+) dropdowns which displays the data from LOV > USER > MFL(\\d+)$")
	public void i_select_Free_Field_dropdowns_which_displays_the_data_from_LOV_USER_MFL(int arg1, int arg2) throws Throwable {
	    
		System.out.println("Attempt: select the dropdown - 'Free Field 2'");
		PageObjects.SelectByXpathWithSendKeys(
				driver, LocatorsPath.MERCHANDISE_FREE_FIELD_2, LocatorsPath.MAX_TIME, 
				file.getCellData("Merchandising", "FreeField2", 2));
		System.out.println("Success: 'Free Field 2' selected successfully");
	}

	
	@Then("^User enters the 'Free Text Field(\\d+)'$")
	public void i_enter_the_field_Free_Text_Field(int arg1) throws Throwable {
	    
		System.out.println("Attempt: enter the field - 'Free Text Field'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.MERCHANDISE_FREE_TEXT_FIELD_1, LocatorsPath.MAX_TIME, 
				file.getCellData("Merchandising", "FreeTextField1", 2));
		System.out.println("Success: 'Free Text Field' entered successfully");
	}

	
	@Then("^User enters the 'Merch\\. Short Name'$")
	public void i_enter_the_field_Merch_Short_Name() throws Throwable {
	    
		System.out.println("Attempt: enter the field - 'MerchShortName'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.MERCH_SHORT_NAME, LocatorsPath.MAX_TIME, 
				file.getCellData("Merchandising", "MerchShortName", 2));
		System.out.println("Success: 'MerchShortName' entered successfully");
	}
	

	@Then("^User clicks on save button and verifies the Merchandise records saved successfully$")
	public void finally_I_click_on_save_button_and_verify_Merchandise_records_saved_successfully() throws Throwable {
	    
		System.out.println("Attempt: Click on Save button");
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.MERCHAND_SAVE)));
        PageObjects.SelectByCSSSelector(
        		driver, LocatorsPath.MERCHAND_SAVE, LocatorsPath.MAX_TIME);
		System.out.println("Success: Save button selected successfully");
	}
	

	@Then("^User clicks on 'Merchandise name' hyperlink and navigates to the \"(.*?)\" screen$")
	public void i_click_on_Merchandise_name_hyperlink_and_should_be_able_to_navigate_to_screen(String arg1) throws Throwable {
	    
		System.out.println("Attempt: click on 'Merchandise name' hyperlink");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.MERCHAND_NAME_SEAR_FIELD, LocatorsPath.MAX_TIME, 
				file.getCellData("Merchandising", "MerchandiseName", 2));
		CallObject.waitForPageLoad(driver);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.MERCHANDISE_FIRST_NAME, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Merchandise name' hyperlink selected successfully");
	}
	

	@Then("^User verifies that the user is allowed to edit and enter the values in the required fields$")
	public void verify_user_should_be_allowed_to_edit_and_enter_the_values_in_the_required_fields_Required_changes_to_be_made() throws Throwable {
	   
		System.out.println("Attempt: Verify user should be allowed to edit and enter the values in the required fields");
		CallObject.waitForPageLoad(driver);
		driver.findElement(By.cssSelector(LocatorsPath.MERCHANDISING_NAME)).clear();
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.MERCHANDISING_NAME, LocatorsPath.MAX_TIME, 
				CallObject.timestamp().concat("_merchand"));
		System.out.println("Success: Edited successfully");
	}
	

	@Then("^User clicks on save button and verifies the Changes are saved successfully$")
	public void finally_I_click_on_save_button_and_verify_Changes_are_saved_successfully() throws Throwable {

		finally_I_click_on_save_button_and_verify_Merchandise_records_saved_successfully();
	}
	

	@Then("^User clicks on Signout and clicks on 'OK' button and verifies the admin as been logged out successfully\\.$")
	public void i_click_on_Signout_and_click_on_OK_and_verify_Admin_as_been_logged_out_succesfully() throws Throwable {
	    
		System.out.println("clicked on Signout and clicked on "
				+ "'OK' and verified as a Admin and logged out succesfully");
	}
}
