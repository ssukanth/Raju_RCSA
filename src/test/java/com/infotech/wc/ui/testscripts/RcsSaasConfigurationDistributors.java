package com.infotech.wc.ui.testscripts;

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

import cucumber.api.java.en.Then;

public class RcsSaasConfigurationDistributors extends TestRunnerWebClient{
	
	public RcsSaasConfigurationDistributors() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
	ExcelApiFile file3 = new ExcelApiFile("TestData3.xlsx");
	WebDriverWait wait = new WebDriverWait(driver, LocatorsPath.MAX_TIME);
	RcsSaasDataEntryPage dataEntryPage = new RcsSaasDataEntryPage();
	Actions actions = new Actions(driver);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	
	
	/**----------------------RCS_SaaS_Add_Distributors_WC--------------------------**/
	
	
	
	@Then("^User clicks on Distributors and navigates to Distributors Screen$")
	public void user_clicks_on_Distributors_and_navigates_to_Distributors_Screen() throws Throwable {
	    
		System.out.println("Attempt: Click on Sales Target Menu");
		WebElement users = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.DISTRIBUTORS))));
		actions.moveToElement(users).doubleClick().build().perform();
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.DISTRIBUTORS_DISP, LocatorsPath.MAX_TIME);
		System.out.println("Success: Sales Target Menu selected successfully");
	}
	

	@Then("^User clicks on the 'Add' button and Add Distributor screen should get displayed successfully$")
	public void user_clicks_on_the_Add_button_and_Add_Distributor_screen_should_get_displayed_successfully() throws Throwable {
	    
		System.out.println("Attempt: click on the 'Add' button and Add Distributor screen should get displayed");
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.DISTRIBUTORS_ADD)));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.DISTRIBUTORS_ADD, LocatorsPath.MAX_TIME);
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.ADD_DISTR_DISP, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Add' button clicked and Add Distributor screen displayed successfully");
	}
	

	@Then("^User enters the 'Name' in the Distributor screen$")
	public void user_enters_the_Name_in_the_Distributor_screen() throws Throwable {
	    
		System.out.println("Attempt: enter the 'Name' in the Distributor screen");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.DISTR_NAME, LocatorsPath.MAX_TIME, 
				file3.getCellData("Distributors", "Name", 2));
		System.out.println("Success: 'Name' entered in the Distributor screen successfully");
	}
	

	@Then("^User enters the Address Line (\\d+) in the Distributor screen$")
	public void user_enters_the_Address_Line1_in_the_Distributor_screen(int arg1) throws Throwable {
	    
		System.out.println("Attempt: enter the 'Address Line 1' in the Distributor screen");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.DISTR_ADDRESS_1, LocatorsPath.MAX_TIME, 
				file3.getCellData("Distributors", "Address Line 1", 2));
		System.out.println("Success: 'Address Line 1' entered in the Distributor screen successfully");
	}
	

	@Then("^User enters the Address Line (\\d+) in the Distributor screen\\.$")
	public void user_enters_the_Address_Line2_in_the_Distributor_screen(int arg1) throws Throwable {
	    
		System.out.println("Attempt: enter the 'Address Line 2' in the Distributor screen");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.DISTR_ADDRESS_2, LocatorsPath.MAX_TIME, 
				file3.getCellData("Distributors", "Address Line 2", 2));
		System.out.println("Success: 'Address Line 2' entered in the Distributor screen successfully");
	}
	

	@Then("^User enters the 'City' in the Distributor screen$")
	public void user_enters_the_City_in_the_Distributor_screen() throws Throwable {
	    
		System.out.println("Attempt: enter the 'City' in the Distributor screen");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.DISTR_CITY, LocatorsPath.MAX_TIME, 
				file3.getCellData("Distributors", "City", 2));
		System.out.println("Success: 'City' entered in the Distributor screen successfully");
	}
	

	@Then("^User enters the 'Telephone No\\.' in the Distributor screen$")
	public void user_enters_the_Telephone_No_in_the_Distributor_screen() throws Throwable {
	    
		System.out.println("Attempt: enter the 'Telephone No' in the Distributor screen");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.DISTR_TELEPHONE, LocatorsPath.MAX_TIME, 
				file3.getCellData("Distributors", "Telephone No", 2));
		System.out.println("Success: 'Telephone No' entered in the Distributor screen successfully");
	}
	

	@Then("^User enters the 'Mobile No\\.' in the Distributor screen$")
	public void user_enters_the_Mobile_No_in_the_Distributor_screen() throws Throwable {
	    
		System.out.println("Attempt: enter the 'Mobile No' in the Distributor screen");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.DISTR_MOBILE_NUM, LocatorsPath.MAX_TIME, 
				file3.getCellData("Distributors", "Mobile No", 2));
		System.out.println("Success: 'Mobile No' entered in the Distributor screen successfully");
	}
	

	@Then("^User enters the 'Fax' in the Distributor screen$")
	public void user_enters_the_Fax_in_the_Distributor_screen() throws Throwable {
	   
		System.out.println("Attempt: enter the 'Fax' in the Distributor screen");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.DISTR_FAX, LocatorsPath.MAX_TIME, 
				file3.getCellData("Distributors", "Fax", 2));
		System.out.println("Success: 'Fax' entered in the Distributor screen successfully");
	}
	

	@Then("^User enters the 'VAT' in the Distributor screen$")
	public void user_enters_the_VAT_in_the_Distributor_screen() throws Throwable {
	    
		System.out.println("Attempt: enter the 'VAT' in the Distributor screen");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.DISTR_VAT, LocatorsPath.MAX_TIME, 
				file3.getCellData("Distributors", "VAT", 2));
		System.out.println("Success: 'VAT' entered in the Distributor screen successfully");
	}
	

	@Then("^User enters the 'PIN' in the Distributor screen$")
	public void user_enters_the_PIN_in_the_Distributor_screen() throws Throwable {
	    
		System.out.println("Attempt: enter the 'PIN' in the Distributor screen");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.DISTR_PIN_NUM, LocatorsPath.MAX_TIME, 
				file3.getCellData("Distributors", "PIN", 2));
		System.out.println("Success: 'PIN' entered in the Distributor screen successfully");
	}
	

	@Then("^User enters the 'E-Mail ID' in the Distributor screen$")
	public void user_enters_the_E_Mail_ID_in_the_Distributor_screen() throws Throwable {
	    
		System.out.println("Attempt: enter the 'E-Mail ID' in the Distributor screen");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.DISTR_EMAIL, LocatorsPath.MAX_TIME, 
				file3.getCellData("Distributors", "E-Mail ID", 2));
		System.out.println("Success: 'E-Mail ID' entered in the Distributor screen successfully");
	}
	

	@Then("^User enters the Free Text (\\d+) in the Distributor screen$")
	public void user_enters_the_Free_Text1_in_the_Distributor_screen(int arg1) throws Throwable {
	   
		System.out.println("Attempt: enter the 'Free Text 1' in the Distributor screen");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.DISTR_FREE_TEXT_1, LocatorsPath.MAX_TIME, 
				file3.getCellData("Distributors", "Free Text 1", 2));
		System.out.println("Success: 'Free Text 1' entered in the Distributor screen successfully");
	}
	

	@Then("^User enters the Free Text (\\d+) in the Distributor screen\\.$")
	public void user_enters_the_Free_Text2_in_the_Distributor_screen(int arg1) throws Throwable {
	    
		System.out.println("Attempt: enter the 'Free Text 2' in the Distributor screen");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.DISTR_FREE_TEXT_2, LocatorsPath.MAX_TIME, 
				file3.getCellData("Distributors", "Free Text 2", 2));
		System.out.println("Success: 'Free Text 2' entered in the Distributor screen successfully");
	}
	

	@Then("^User clicks on save button and verifies the New Distributor record is created successfully\\.$")
	public void user_clicks_on_save_button_and_verifies_the_New_Distributor_record_is_created_successfully() throws Throwable {
	    
		System.out.println("Attempt: click on save button and verify the New Distributor record is created");
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.DISTR_SAVE)));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.DISTR_SAVE, LocatorsPath.MAX_TIME);
		System.out.println("Success: save button clicked and the New Distributor record is created successfully");
	}
	

	
	/**----------------------RCS_SaaS_Create_Distributors_WC--------------------------**/
	
	
	
	@Then("^User creates the Multiple Distributors with the name which already exists in Distributor List & saves it\\.$")
	public void user_creates_the_Multiple_Distributors_with_the_name_which_already_exists_in_Distributor_List_saves_it() throws Throwable {
	    
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.DISTR_NAME_SEARCH, LocatorsPath.MAX_TIME, 
				file3.getCellData("Distributors", "Name", 2));
		CallObject.block(2000);
		user_clicks_on_the_Add_button_and_Add_Distributor_screen_should_get_displayed_successfully();
		user_enters_the_Name_in_the_Distributor_screen();
		user_enters_the_Address_Line1_in_the_Distributor_screen(0);
		user_enters_the_Address_Line2_in_the_Distributor_screen(0);
		user_enters_the_City_in_the_Distributor_screen();
		user_clicks_on_save_button_and_verifies_the_New_Distributor_record_is_created_successfully();
	}
	

	@Then("^User verifies that the system displaying a error message as 'Distributor name already exists\\. Please enter another name'$")
	public void user_verifies_that_the_system_displaying_a_error_message_as_Distributor_name_already_exists_Please_enter_another_name() throws Throwable {
	    
		System.out.println("Attempt: User verifies that the system displaying a error message");
		WebElement errorMsg = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.DISTR_ERROR_MSG))));
		Assert.assertEquals("Distributor name already exists. Please enter another name.", 
				errorMsg.getText());
		System.out.println("Success: error message displayed successfully");
	}
	

	
	/**----------------------RCS_SaaS_Delete_Distributors_WC--------------------------**/
	
	
	
	@Then("^User Deletes the Distributor record by clicking on the Delete icon in front of the Distributor Name$")
	public void user_Deletes_the_Distributor_record_by_clicking_on_the_Delete_icon_in_front_of_the_Distributor_Name() throws Throwable {
	    
		System.out.println("Attempt: Delete the Distributor record by clicking "
				+ "on the Delete icon in front of the Distributor Name");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.DISTR_CANCEL, LocatorsPath.MAX_TIME);
		CallObject.switchToAlert(driver);
		
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.DISTR_NAME_SEARCH, LocatorsPath.MAX_TIME, 
				file3.getCellData("Distributors", "Name", 2));
		System.out.println("Success: Distributor record deleted successfully");
	}
	

	@Then("^User verifies that the selected Distributor record is deleted successfully\\.$")
	public void user_verifies_that_the_selected_Distributor_record_is_deleted_successfully() throws Throwable {
	   
		System.out.println("Attempt: verify the selected Distributor record is deleted");
		CallObject.block(3000);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.DIST_DELETE_RECORD, LocatorsPath.MAX_TIME);
		CallObject.switchToAlert(driver);
		
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.DISTR_NAME_SEARCH)))).clear();
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.DISTR_NAME_SEARCH, LocatorsPath.MAX_TIME, 
				file3.getCellData("Distributors", "Name", 2));
		
		WebElement verifyRecord = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.DIST_VERIFY_RECORD))));
		Assert.assertEquals("No records found.", verifyRecord.getText());
		System.out.println("Success: Selected Distributor record is deleted successfully");
	}
}
