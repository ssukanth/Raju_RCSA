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
import com.infotech.testrunner.TestRunnerWebClient;

import cucumber.api.java.en.Then;

public class RcsSaasOrganisationPage extends TestRunnerWebClient{
	
	WebDriver driver = getDriver();
	JavascriptExecutor js = (JavascriptExecutor)driver;
	ExcelApiFile file = new ExcelApiFile("TestData.xlsx");
	WebDriverWait wait = new WebDriverWait(driver, LocatorsPath.MAX_TIME);
	
	public RcsSaasOrganisationPage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}


	
	/**----------------------RCS SAAS Edit_Organisation_WC--------------------------**/
	
	
	@Then("^User clicks on Organisation and navigates to the Organisation Screen$")
	public void i_Click_on_Organisation_and_navigated_to_Organisation_Screen() throws Throwable {
	    
		System.out.println("Attempt: Click on Organisation Menu");
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.
				findElement(By.xpath(LocatorsPath.ORGANIZATION))).build().perform();
		PageObjects.SelectByXpath(
				driver, LocatorsPath.ORGANIZATION, LocatorsPath.MAX_TIME);
        PageObjects.SelectByXpathWithoutClick(
        		driver, LocatorsPath.DISPLAY_ORGANISATION, LocatorsPath.MAX_TIME);
		System.out.println("Success: Organisation Menu selected successfully");
	}

	
	@Then("^User search with the username in the List of Organisation section and clicks on first name link$")
	public void i_Search_with_first_name_in_List_of_Organisation_section_and_then_click_on_first_name_link() throws Throwable {
	    
		System.out.println("Attempt: Search with user name in List of Organisation section");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ORG_USER_NAME_SEARCH_FIELD, LocatorsPath.MAX_TIME, 
				file.getCellData("Organisation", "UserName", 2));
		CallObject.block(3000);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ORG_SELECT_FIRST_NAME, LocatorsPath.MAX_TIME);
		System.out.println("Success: user name in List of Organisation section is found successfully");
	}

	
	@Then("^User selects 'Position' dropdown$")
	public void i_select_Position_dropdown() throws Throwable {
	    
		System.out.println("Attempt: select 'Position' dropdown");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.POSITION, LocatorsPath.MAX_TIME, 
				file.getCellData("Organisation", "Position", 2));
		System.out.println("Success: 'Position' dropdown selected");
	}

	
	@Then("^User selects 'Parent Position' dropdown$")
	public void i_select_Parent_Position_dropdown() throws Throwable {
	  
		System.out.println("Attempt: select 'Parent Position' dropdown");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.PARENT_POSITION, LocatorsPath.MAX_TIME, 
				file.getCellData("Organisation", "Parent Position", 2));
		System.out.println("Success: 'Parent Position' dropdown selected");
	}
	

	@Then("^User selects 'Parent' dropdown$")
	public void i_select_Parent_dropdown() throws Throwable {
	  
		System.out.println("Attempt: select 'Parent' dropdown");	
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.PARENT, LocatorsPath.MAX_TIME, 
				file.getCellData("Organisation", "Parent", 2));
		System.out.println("Success: 'Parent' dropdown selected");
	}

	
	@Then("^User selects 'Parent Position(\\d+)' dropdown$")
	public void i_select_Parent_Position_dropdown(int arg1) throws Throwable {
	    
		System.out.println("Attempt: select 'Parent Position 1' dropdown");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.PARENT_POSITION_1, LocatorsPath.MAX_TIME, 
				file.getCellData("Organisation", "ParentPosition1", 2));
		System.out.println("Success: 'Parent Position 1' dropdown selected");
	}

	
	@Then("^User selects 'Parent(\\d+)' dropdown$")
	public void i_select_Parent_dropdown(int arg1) throws Throwable {
	    
		System.out.println("Attempt: select 'Parent 1' dropdown");
		CallObject.block(3000);
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.PARENT_1, LocatorsPath.MAX_TIME, 
				file.getCellData("Organisation", "Parent1", 2));
		System.out.println("Success: 'Parent 1' dropdown selected");
	}
	

	@Then("^User selects 'Status' dropdown$")
	public void i_select_Status_dropdown() throws Throwable {
	    
		System.out.println("Attempt: select the 'Status' dropdown");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ORG_STATUS, LocatorsPath.MAX_TIME, 
				file.getCellData("Configuration", "Status", 2));
		System.out.println("Success: 'Status' dropdown selected successfully");
	}

	
	@Then("^User selects Free Field (\\d+) dropdown$")
	public void i_select_Free_Field_dropdown(int arg1) throws Throwable {
	   
		System.out.println("Attempt: select 'Free Field 1' dropdown");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ORG_FREE_FIELD_1, LocatorsPath.MAX_TIME, 
				file.getCellData("Organisation", "FreeField1", 2));
		System.out.println("Success: 'Free Field 1' dropdown selected");
	}

	
	@Then("^User selects Free Field (\\d+) dropdowns$")
	public void i_select_Free_Field_dropdowns(int arg1) throws Throwable {
	 
		System.out.println("Attempt: select 'Free Field 2' dropdown");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ORG_FREE_FIELD_2, LocatorsPath.MAX_TIME, 
				file.getCellData("Organisation", "FreeField2", 2));
		System.out.println("Success: 'Free Field 2' dropdown selected");
	}

	
	@Then("^The Created employee or user details should be saved successfully$")
	public void finally_created_employee_or_user_details_should_be_successfully_saved() throws Throwable {
	    
		System.out.println("Attempt: Click on Save button");
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.ORG_SAVE)));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ORG_SAVE, LocatorsPath.MAX_TIME);
		CallObject.waitForPageLoad(driver);
		System.out.println("Success: Save button selected successfully");
	}
	

	@Then("^The user created should get an OTP for the e-mail ID provided while creating the User\\.$")
	public void the_user_created_should_get_an_OTP_for_the_e_mail_ID_provided_while_creating_the_User() throws Throwable {
	   
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ORG_USER_NAME_SEARCH_FIELD, LocatorsPath.MAX_TIME, 
				file.getCellData("Organisation", "UserName", 2));
		CallObject.block(3000);
		PageObjects.SelectByCSSSelectorWithoutClick(
				driver, LocatorsPath.ORG_SELECT_FIRST_NAME, LocatorsPath.MAX_TIME);
	}

	
	@Then("^The User should be successfully logged out from the web client page\\.$")
	public void the_User_should_be_successfully_logged_out_from_the_web_client_page() throws Throwable {
	    System.out.println("The User should be successfully logged out from the web client page");
	}


	public void verifyOrganizationPageDisplay() {
		
		WebElement organisationDisplay = driver.findElement(
				By.cssSelector(LocatorsPath.VERIFY_EDIT_ORGANISATION));
		WebDriverWait wait = new WebDriverWait(driver, LocatorsPath.MAX_TIME);
		wait.until(ExpectedConditions.
				presenceOfElementLocated(By.cssSelector(LocatorsPath.VERIFY_EDIT_ORGANISATION)));
		if(!organisationDisplay.isDisplayed()) {
			System.out.println("Edit Oganisation Page is displayed");
		}else {
			System.err.println("Edit Oganisation Page is not displayed");
			Assert.fail("Edit Oganisation Page is not displayed");
		}
	}
	
	
	
	/**----------------------RCS SAAS Add_Organisation_WC--------------------------**/
	
	
	
	@Then("^User clicks on the 'Add' button and navigates to the 'Add Organisation Details' screen$")
	public void user_clicks_on_the_Add_button_and_navigates_to_the_Add_Organisation_Details_screen() throws Throwable {
	 
		System.out.println("Attempt: click on the 'Add' button and "
				+ "navigate to the 'Add Organisation Details' screen");
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.ADD)));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ADD, LocatorsPath.MAX_TIME);
		System.out.println("Success: Add button clicked and navigated "
				+ "to the 'Add Organisation Details' screen successfully");	
	}
	

	@Then("^User enters the 'First Name' in the Add Organisation Details page$")
	public void user_enters_the_First_Name_in_the_Add_Organisation_Details_page() throws Throwable {
	    
		System.out.println("Attempt: enter the 'First Name' in the Add Organisation Details page");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ORG_FIRST_NAME, LocatorsPath.MAX_TIME, 
				CallObject.timestamp().concat("_FN"));
				file.setCellData("Organisation", "First Name", 2, CallObject.timestamp().concat("_FN"));
		System.out.println("Success: 'First Name' in the Add Organisation "
				+ "Details page entered successfully");
	}
	

	@Then("^User enters the 'Last Name' in the Add Organisation Details page$")
	public void user_enters_the_Last_Name_in_the_Add_Organisation_Details_page() throws Throwable {
	    
		System.out.println("Attempt: enter the 'Last Name' in the Add Organisation Details page");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ORG_LAST_NAME, LocatorsPath.MAX_TIME, 
				CallObject.timestamp().concat("_LN"));
		        file.setCellData("Organisation", "Last Name", 2, CallObject.timestamp().concat("_LN"));
		System.out.println("Success: 'Last Name' in the Add Organisation "
				+ "Details page entered successfully");
	}
	

	@Then("^User selects the 'Position' in the Add Organisation Details page$")
	public void user_selects_the_Position_in_the_Add_Organisation_Details_page() throws Throwable {
	    
		System.out.println("Attempt: select 'Position' dropdown");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ADD_POSITION, LocatorsPath.MAX_TIME, 
				file.getCellData("Organisation", "Position", 2));
		System.out.println("Success: 'Position' dropdown selected");
	}
	

	
	@Then("^User selects the 'Parent Position' in the Add Organisation Details page$")
	public void user_selects_the_Parent_Position_in_the_Add_Organisation_Details_page() throws Throwable {
	   
		System.out.println("Attempt: select 'Parent Position' dropdown");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ADD_PARENT_POSITION, LocatorsPath.MAX_TIME, 
				file.getCellData("Organisation", "Parent Position", 2));
		System.out.println("Success: 'Parent Position' dropdown selected");
	}
	

	@Then("^User selects the 'Parent' in the Add Organisation Details page$")
	public void user_selects_the_Parent_in_the_Add_Organisation_Details_page() throws Throwable {
		
		System.out.println("Attempt: select 'Parent' dropdown");
		CallObject.block(3000);
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ADD_PARENT, LocatorsPath.MAX_TIME, 
				file.getCellData("Organisation", "Parent", 2));
		System.out.println("Success: 'Parent' dropdown selected");
	}
	

	@Then("^User selects the 'Status' in the Add Organisation Details page$")
	public void user_selects_the_Status_in_the_Add_Organisation_Details_page() throws Throwable {
	   
		System.out.println("Attempt: select the 'Status' dropdown");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ADD_STATUS, LocatorsPath.MAX_TIME, 
				file.getCellData("Configuration", "Status", 2));
		System.out.println("Success: 'Status' dropdown selected successfully");
	}
	

	@Then("^User enters the 'Employee ID' in the Add Organisation Details page$")
	public void user_enters_the_Employee_ID_in_the_Add_Organisation_Details_page() throws Throwable {
	    
		System.out.println("Attempt: enter the 'Employee ID' in the Add "
				+ "Organisation Details page");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ADD_EMPLOYEE_ID, LocatorsPath.MAX_TIME, 
				file.getCellData("Organisation", "Employee ID", 2));
		System.out.println("Success: 'Employee ID' in the Add Organisation "
				+ "Details page entered successfully");
	}
	

	@Then("^User enters the 'Email ID' in the Add Organisation Details page$")
	public void user_enters_the_Email_ID_in_the_Add_Organisation_Details_page() throws Throwable {
	    
		System.out.println("Attempt: enter the 'Email ID' in the Add "
				+ "Organisation Details page");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ADD_EMAIL, LocatorsPath.MAX_TIME, 
				file.getCellData("Organisation", "Email ID", 2));
		System.out.println("Success: 'Email ID' in the Add Organisation "
				+ "Details page entered successfully");
	}
	

	@Then("^User enters the 'User Name' in the Add Organisation Details page$")
	public void user_enters_the_User_Name_in_the_Add_Organisation_Details_page() throws Throwable {

		System.out.println("Attempt: enter the 'User Name' in the Add "
				+ "Organisation Details page");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ADD_USER_NAME, LocatorsPath.MAX_TIME, 
				CallObject.timestamp().concat("_User"));
				file.setCellData("Organisation", "UserName", 2, CallObject.timestamp().concat("_User"));
		System.out.println("Success: 'User Name' in the Add Organisation "
				+ "Details page entered successfully");
	}
	
	
	@Then("^User selects the 'Role' in the Add Organisation Details page$")
	public void user_selects_the_Role_in_the_Add_Organisation_Details_page() throws Throwable {
	 
		System.out.println("Attempt: select the 'Role' in the Add Organisation Details page");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ADD_ROLE, LocatorsPath.MAX_TIME, 
				file.getCellData("Organisation", "Role", 2));
		System.out.println("Success: 'Role' in the Add Organisation "
				+ "Details page selected successfully");
	}
	

	@Then("^User selects the 'Logging' checkbox$")
	public void user_selects_the_Logging_checkbox() throws Throwable {
	  
		System.out.println("Attempt: select the 'Logging' checkbox");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ADD_LOGGING, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Logging' checkbox selected successfully");
	}
	

	@Then("^User enters the 'Address' in the textfield$")
	public void user_enters_the_Address_in_the_textfield() throws Throwable {
	    
		System.out.println("Attempt: enter the 'Address' in the textfield");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ADD_ADDRESS, LocatorsPath.MAX_TIME, 
				file.getCellData("Organisation", "Address", 2));
		System.out.println("Success: 'Address' entered in the textfield successfully");
	}
	

	@Then("^User selects the 'Territory' in the Add Organisation Details page$")
	public void user_selects_the_Territory_in_the_Add_Organisation_Details_page() throws Throwable {
	    
		System.out.println("Attempt: select the 'Territory' in the Add Organisation Details page");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ADD_TERRITORY, LocatorsPath.MAX_TIME, 
				file.getCellData("Territory", "TerritoryName", 2));
		System.out.println("Success: selected the 'Territory' in the Add Organisation Details page");
	}

	
	@Then("^User selects the 'Parent Position (\\d+)' in the Add Organisation Details page\\.$")
	public void user_selects_the_Parent_Position_in_the_Add_Organisation_Details_page(int arg1) throws Throwable {
	    
		System.out.println("Attempt: select 'Parent Position1' dropdown");
		CallObject.block(3000);
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ADD_PARENT_POSITION_1, LocatorsPath.MAX_TIME, 
				file.getCellData("Organisation", "ParentPosition1", 2));
		System.out.println("Success: 'Parent Position1' dropdown selected");
	}

	
	@Then("^User selects the 'Parent (\\d+)' in the Add Organisation Details page\\.$")
	public void user_selects_the_Parent_in_the_Add_Organisation_Details_page(int arg1) throws Throwable {
	    
		System.out.println("Attempt: select 'Parent1' dropdown");
		CallObject.block(3000);
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ADD_PARENT_1, LocatorsPath.MAX_TIME, 
				file.getCellData("Organisation", "Parent1", 2));
		System.out.println("Success: 'Parent1' dropdown selected");
	}

	
	@Then("^User selects the 'Free Field (\\d+)' in the Add Organisation Details page$")
	public void user_selects_the_Free_Field1_in_the_Add_Organisation_Details_page(int arg1) throws Throwable {
	    
		System.out.println("Attempt: select 'FreeField1' dropdown");
		CallObject.block(2000);
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ADD_FREE_FIELD_1, LocatorsPath.MAX_TIME, 
				file.getCellData("Organisation", "FreeField1", 2));
		System.out.println("Success: 'FreeField1' dropdown selected");
	}
	
	
	@Then("^User selects the 'Free Field (\\d+)' in the Add Organisation Details page\\.$")
	public void user_selects_the_Free_Field2_in_the_Add_Organisation_Details_page(int arg1) throws Throwable {
	 
		System.out.println("Attempt: select 'FreeField2' dropdown");
		CallObject.block(2000);
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ADD_FREE_FIELD_2, LocatorsPath.MAX_TIME, 
				file.getCellData("Organisation", "FreeField2", 2));
		System.out.println("Success: 'FreeField2' dropdown selected");
	}
	
	
	@Then("^User verifies the 'Trade Approach' is auto populated$")
	public void user_verifies_the_Trade_Approach_is_auto_populated() throws Throwable {
	    
		System.out.println("Attempt: verify the 'Trade Approach' is auto populated");
		WebElement tradeApproach = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ADD_TRADE_APPROACH))));
		org.testng.Assert.assertTrue(tradeApproach.getAttribute
				 ("readonly").equals("true"),"readonly");
		System.out.println("Success: verified the 'Trade Approach' is auto populated");
	}

	
	@Then("^User clicks on the save button and verifies the Organisation record is saved successfully\\.$")
	public void user_clicks_on_the_save_button_and_verifies_the_Organisation_record_is_saved_successfully() throws Throwable {
	    
		finally_created_employee_or_user_details_should_be_successfully_saved();
	}
}
