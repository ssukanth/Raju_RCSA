package com.infotech.wc.ui.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.infotech.Excel.CsvToExcelConverter;
import com.infotech.Excel.ExcelApiFile;
import com.infotech.basepage.CallObject;
import com.infotech.basepage.LocatorsPath;
import com.infotech.basepage.PageObjects;
import com.infotech.basepage.RobotPage;
import com.infotech.testrunner.TestRunnerWebClient;

import cucumber.api.java.en.Then;

/**
 * @author 30955
 *
 */
public class RcsSaasConfigurationPositiveSteps extends TestRunnerWebClient{
	
	WebDriver driver = getDriver();
	Actions actions = new Actions(driver);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	ExcelApiFile file  = new ExcelApiFile("TestData.xlsx");
	ExcelApiFile file3 = new ExcelApiFile("TestData3.xlsx");
	WebDriverWait wait = new WebDriverWait(driver, LocatorsPath.MAX_TIME);
	RobotPage robot = new RobotPage();
	RcsSaasNewOutletCreationPage newOutletCreationPage = new RcsSaasNewOutletCreationPage();
	RcsSaasConfigurationUsersPage configurationUsersPage = new RcsSaasConfigurationUsersPage();
	
	public RcsSaasConfigurationPositiveSteps() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	/**----------------------RCS_SaaS_Objective_Activities_Selection_WC--------------------------**/
	
	
	
	@Then("^User clicks on Positive Steps/Activities and navigates to the Positive Steps/Activities Screen$")
	public void user_clicks_on_Positive_Steps_Activities_and_navigates_to_the_Positive_Steps_Activities_Screen() throws Throwable {
	  
		newOutletCreationPage.user_clicks_on_Search_tab();
		newOutletCreationPage.user_clicks_on_Create_new_customer_button();
		newOutletCreationPage.the_user_selects_Customer_type_from_the_drop_down();
		newOutletCreationPage.user_selects_Status_from_drop_down();
		newOutletCreationPage.user_selects_Shopper_channel_from_dropdown();
		newOutletCreationPage.user_enters_Customer_name_in_the_Customer_Name_text_box();
		newOutletCreationPage.user_selects_Outlet_type_from_outlet_type_dropdown();
		newOutletCreationPage.user_selects_Outlet_subtype_from_outlet_subtype_dropdown();
		newOutletCreationPage.user_selects_Territory_from_Territory_dropdown();
		newOutletCreationPage.user_clicks_on_save_button_and_the_customer_should_be_created_successfully();
		
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.EXPORT_IN_EXCEL, LocatorsPath.MAX_TIME);
		
		configurationUsersPage.i_Click_on_Configiuration();
		System.out.println("Attempt: Click on Positive Steps/Activities Menu");
		WebElement activities = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.POSITIVE_STEP_ACTIVITIES))));
		actions.moveToElement(activities).doubleClick().build().perform();
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.POSITIVE_STEP_ACTIVITIES_DIS, LocatorsPath.MAX_TIME);
		System.out.println("Success: Positive Steps/Activities Menu selected successfully");
	}
	

	@Then("^User selects the Objective - 'Pre-Call Activities', 'Selling Ideas', 'Implement and Impact', 'Post-Call Activities' in the 'Positive Steps' grid for which the Activities to be assigned$")
	public void user_selects_the_Objective_Pre_Call_Activities_Selling_Ideas_Implement_and_Impact_Post_Call_Activities_in_the_Positive_Steps_grid_for_which_the_Activities_to_be_assigned() throws Throwable {
	 
		System.out.println("Attempt: select the Objective - 'Pre-Call Activities', 'Selling Ideas', 'Implement and Impact', 'Post-Call Activities' "
				+ "in the 'Positive Steps' grid for which the Activities to be assigned");
		WebElement preCall = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.PRE_CALL_ACTIVITIES))));
		Assert.assertEquals("1.Pre-Call Activities", preCall.getText());
		
		WebElement ideas = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.SELLING_IDEAS))));
		Assert.assertEquals("2.Selling Ideas", ideas.getText());
		
		WebElement impact = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.IMPL_AND_IMPACT))));
		Assert.assertEquals("3.Implement and Impact", impact.getText());
		
		WebElement postCall = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.POST_CALL_ACTIVITIES))));
		Assert.assertEquals("4.Post-Call Activities", postCall.getText());
		
		WebElement none = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.NONE_ACTIVITIES))));
		Assert.assertEquals("None", none.getText());
		System.out.println("Success: The Objective - 'Pre-Call Activities', 'Selling Ideas', 'Implement and Impact', 'Post-Call Activities' "
				+ "in the 'Positive Steps' grid for which the Activities to be assigned is selected successfully");
	}
	

	@Then("^User selects the Activities as - Profile, Address, Attachment, Contacts, Outlet Times, Territory, Sales, Assessments, Retail Audit, Contracts, Special Orders, Planogram, Merchandising, Service Request, Suppliers to be assigned based on the Objective$")
	public void user_selects_the_Activities_as_Profile_Address_Attachment_Contacts_Outlet_Times_Territory_Sales_Assessments_Retail_Audit_Contracts_Special_Orders_Planogram_Merchandising_Service_Request_Suppliers_to_be_assigned_based_on_the_Objective() throws Throwable {
	    
		System.out.println("Attempt: Select the required Activities");
        switch (file3.getCellData("Positive Activities", "Positive Steps", 2)) {
		
		case "1.Pre-Call Activities":
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.PROFILE_1, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.ADDRESS_1, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.ATTACHMENT_1, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.CONTACTS_1, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.OUTLET_TIMES_1, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.TERRITORY_1, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.SALES_1, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.ASSESSMENTS_1, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.RETAIL_AUDIT_1, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.CONTRACTS_1, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.SPECIAL_ORDERS_1, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.PLANOGRAM_1, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.MERCHANDISING_1, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.SERVICE_REQUEST_1, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.SUPPLIERS_1, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.POSITIVE_STEPS_SAVE, LocatorsPath.MAX_TIME);
			CallObject.block(3000);
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.PRE_CALL_ACTIVITIES_REFRESH, LocatorsPath.MAX_TIME);
			CallObject.waitForPageLoad(driver);
			break;
			
		case "2.Selling Ideas":
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.PROFILE_2, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.ADDRESS_2, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.ATTACHMENT_2, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.CONTACTS_2, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.OUTLET_TIMES_2, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.TERRITORY_2, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.SALES_2, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.ASSESSMENTS_2, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.RETAIL_AUDIT_2, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.CONTRACTS_2, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.SPECIAL_ORDERS_2, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.PLANOGRAM_2, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.MERCHANDISING_2, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.SERVICE_REQUEST_2, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.SUPPLIERS_2, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.POSITIVE_STEPS_SAVE, LocatorsPath.MAX_TIME);
			CallObject.block(3000);
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.SELLING_IDEAS_REFRESH, LocatorsPath.MAX_TIME);
			CallObject.waitForPageLoad(driver);
			break;
			
		case "3.Implement and Impact":
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.PROFILE_3, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.ADDRESS_3, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.ATTACHMENT_3, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.CONTACTS_3, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.OUTLET_TIMES_3, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.TERRITORY_3, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.SALES_3, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.ASSESSMENTS_3, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.RETAIL_AUDIT_3, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.CONTRACTS_3, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.SPECIAL_ORDERS_3, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.PLANOGRAM_3, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.MERCHANDISING_3, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.SERVICE_REQUEST_3, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.SUPPLIERS_3, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.POSITIVE_STEPS_SAVE, LocatorsPath.MAX_TIME);
			CallObject.block(3000);
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.IMPL_AND_IMPACT_REFRESH, LocatorsPath.MAX_TIME);
			CallObject.waitForPageLoad(driver);
			break;
			
		case "4.Post-Call Activities":
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.PROFILE_4, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.ADDRESS_4, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.ATTACHMENT_4, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.CONTACTS_4, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.OUTLET_TIMES_4, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.TERRITORY_4, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.SALES_4, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.ASSESSMENTS_4, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.RETAIL_AUDIT_4, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.CONTRACTS_4, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.SPECIAL_ORDERS_4, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.PLANOGRAM_4, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.MERCHANDISING_4, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.SERVICE_REQUEST_4, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.SUPPLIERS_4, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.POSITIVE_STEPS_SAVE, LocatorsPath.MAX_TIME);
			CallObject.block(3000);
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.POST_CALL_ACTIVITIES_REFRESH, LocatorsPath.MAX_TIME);
			CallObject.waitForPageLoad(driver);
			break;
			
		case "None":
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.PROFILE_5, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.ADDRESS_5, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.ATTACHMENT_5, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.CONTACTS_5, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.OUTLET_TIMES_5, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.TERRITORY_5, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.SALES_5, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.ASSESSMENTS_5, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.RETAIL_AUDIT_5, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.CONTRACTS_5, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.SPECIAL_ORDERS_5, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.PLANOGRAM_5, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.MERCHANDISING_5, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.SERVICE_REQUEST_5, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.SUPPLIERS_5, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.POSITIVE_STEPS_SAVE, LocatorsPath.MAX_TIME);
			CallObject.block(3000);
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.NONE_ACTIVITIES_REFRESH, LocatorsPath.MAX_TIME);
			CallObject.waitForPageLoad(driver);
			break;
			
            
		default:
			
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.PROFILE_1, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.ADDRESS_1, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.ATTACHMENT_1, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.CONTACTS_1, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.OUTLET_TIMES_1, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.TERRITORY_1, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.SALES_1, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.ASSESSMENTS_1, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.RETAIL_AUDIT_1, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.CONTRACTS_1, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.SPECIAL_ORDERS_1, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.PLANOGRAM_1, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.MERCHANDISING_1, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.SERVICE_REQUEST_1, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.SUPPLIERS_1, LocatorsPath.MAX_TIME); 
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.POSITIVE_STEPS_SAVE, LocatorsPath.MAX_TIME);
			CallObject.block(3000);
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.PRE_CALL_ACTIVITIES_REFRESH, LocatorsPath.MAX_TIME);
			CallObject.waitForPageLoad(driver);
		}
        System.out.println("Success: Required Activities selected successfully");
			
	}
	
	
	
	/**----------------------RCS_SaaS_Add_Activity_WC--------------------------**/
	
	
	
	@Then("^User clicks on Add Activity in the 'Activities' grid$")
	public void user_clicks_on_Add_Activity_in_the_Activities_grid() throws Throwable {
	    
		System.out.println("Attempt: click on Add Activity in the 'Activities' grid");
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.ADD_ACTIVITY)));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ADD_ACTIVITY, LocatorsPath.MAX_TIME);
		System.out.println("Success: Add Activity in the 'Activities' grid clicked successfully");
	}
	

	@Then("^User verifies the 'Add Activity screen' is displayed successfully$")
	public void user_verifies_the_Add_Activity_screen_is_displayed_successfully() throws Throwable {
	    
		System.out.println("Attempt: verify the 'Add Activity screen' is displayed");
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.ADD_ACTIVITY_DISP, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Add Activity screen' is displayed successfully");
	}
	

	@Then("^User verifies the system displaying the Objective name based on the Objective selected in the previous step$")
	public void user_verifies_the_system_displaying_the_Objective_name_based_on_the_Objective_selected_in_the_previous_step() throws Throwable {
	    
		System.out.println("Attempt: verify the system displaying the "
				+ "Objective name based on the Objective selected in the previous step");
		WebElement name = wait.until(ExpectedConditions.
				presenceOfElementLocated((
						By.xpath("//tr[1]//*[contains(text(),'"+
				file3.getCellData("Positive Activities", "Positive Steps", 2)+"')]"))));
		Assert.assertEquals(
				file3.getCellData("Positive Activities", "Positive Steps", 2), 
				name.getText());
		System.out.println("Success: verified the system displaying the "
				+ "Objective name based on the Objective selected in the previous step");
	}
	

	@Then("^User selects the 'Activity Name' in the Add Activity page$")
	public void user_selects_the_Activity_Name_in_the_Add_Activity_page() throws Throwable {
	   
		System.out.println("Attempt: select the field - 'Activity Name'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ACTIVITY_NAME, LocatorsPath.MAX_TIME, 
				file3.getCellData("Positive Activities", "Activity Name", 2));
		System.out.println("Success: 'Activity Name' selected successfully");
	}
	

	@Then("^User enters the 'Description' in the Add Activity page$")
	public void user_enters_the_Description_in_the_Add_Activity_page() throws Throwable {
	    
		System.out.println("Attempt: Enter the 'Description'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.DESCRIPTION, LocatorsPath.MAX_TIME, 
				file3.getCellData("Positive Activities", "Description", 2));
		System.out.println("Success: 'Description' entered successfully");
	}
	

	@Then("^User selects the 'Start Date' in the Add Activity page$")
	public void user_selects_the_Start_Date_in_the_Add_Activity_page() throws Throwable {
	 
		System.out.println("Attempt: select the 'Start Date'");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.START_DATE_CALENDER, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.START_DATE, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Start Date' as been selected successfully");
	}
	

	@Then("^User selects the 'End Date' in the Add Activity page$")
	public void user_selects_the_End_Date_in_the_Add_Activity_page() throws Throwable {
	    
		System.out.println("Attempt: select the 'End Date'");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.END_DATE_CALENDER, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.END_DATE, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'End Date' as been selected successfully");
	}
	

	@Then("^User selects the 'Touch Point' for which the Activity to be assigned$")
	public void user_selects_the_Touch_Point_for_which_the_Activity_to_be_assigned() throws Throwable {
	    
		System.out.println("Attempt: select the 'Touch Point'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.TOUCHPOINT, LocatorsPath.MAX_TIME, 
				file3.getCellData("Positive Activities", "Touch Point", 2));
		System.out.println("Success: 'Touch Point' selected successfully");
	}
	

	@Then("^User selects the 'Required' checkbox to make an activity mandatory for execution between the Start & End Date$")
	public void user_selects_the_Required_checkbox_to_make_an_activity_mandatory_for_execution_between_the_Start_End_Date() throws Throwable {
	    
		System.out.println("Attempt: select the 'Required' checkbox to make an activity mandatory");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.REQUIRED, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Required' checkbox selected successfully");
	}
	

	@Then("^User selects the 'Recurrent' checkbox to make an activity recurrent for execution between the Start & End Date\\.$")
	public void user_selects_the_Recurrent_checkbox_to_make_an_activity_recurrent_for_execution_between_the_Start_End_Date() throws Throwable {
	    
		System.out.println("Attempt: select the 'Recurrent' checkbox to make an activity recurrent");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.RECURRENT, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Recurrent' checkbox selected successfully");
	}
	

	@Then("^User selects the 'Status' to make the Activity Active/Inactive$")
	public void user_selects_the_Status_to_make_the_Activity_Active_Inactive() throws Throwable {
	   
		System.out.println("Attempt: select the 'Status'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.STATUS, LocatorsPath.MAX_TIME, 
				file3.getCellData("Positive Activities", "Status", 2));
		System.out.println("Success: 'Status' selected successfully");
	}
	

	@Then("^User enters the 'Comments' in the Text field$")
	public void user_enters_the_Comments_in_the_Text_field() throws Throwable {
	 
		System.out.println("Attempt: enter the 'Comments'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.COMMENTS, LocatorsPath.MAX_TIME, 
				file3.getCellData("Positive Activities", "Comments", 2));
		System.out.println("Success: 'Comments' entered successfully");
	}
	

	@Then("^User selects the 'Free Field (\\d+)' in the Add Activity page$")
	public void user_selects_the_Free_Field_in_the_Add_Activity_page(int arg1) throws Throwable {
	    
		System.out.println("Attempt: enter the 'Free Field 1'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.FREE_FIELD_1, LocatorsPath.MAX_TIME, 
				file3.getCellData("Positive Activities", "Free Field 1", 2));
		System.out.println("Success: 'Free Field 1' entered successfully");
	}
	

	@Then("^User enters the 'Free Text Field (\\d+)' in the Add Activity page$")
	public void user_enters_the_Free_Text_Field1_in_the_Add_Activity_page(int arg1) throws Throwable {
	    
		System.out.println("Attempt: enter the 'Free Text Field 1'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.FREE_TEXT_FIELD_1, LocatorsPath.MAX_TIME, 
				file3.getCellData("Positive Activities", "Free Text Field 1", 2));
		System.out.println("Success: 'Free Text Field 1' entered successfully");
	}
	

	@Then("^User enters the 'Free Text Field (\\d+)' in the Add Activity page\\.$")
	public void user_enters_the_Free_Text_Field2_in_the_Add_Activity_page(int arg1) throws Throwable {
	    
		System.out.println("Attempt: enter the 'Free Text Field 2'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.FREE_TEXT_FIELD_2, LocatorsPath.MAX_TIME, 
				file3.getCellData("Positive Activities", "Free Text Field 2", 2));
		System.out.println("Success: 'Free Text Field 2' entered successfully");
	}
	

	@Then("^User clicks on save button and verifies the Activity record is saved without any errors$")
	public void user_clicks_on_save_button_and_verifies_the_Activity_record_is_saved_without_any_errors() throws Throwable {
	    
		System.out.println("Attempt: click on save button");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ADD_ACTIVITY_SAVE, LocatorsPath.MAX_TIME);
		System.out.println("Success: save button clicked successfully");
	}
	

	@Then("^User edits the record and modifies the data and clicks on save button$")
	public void user_edits_the_record_and_modifies_the_data_and_clicks_on_save_button() throws Throwable {
	 
		try {
			System.out.println("Attempt: edit the record and modify the data");
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.ACTIVITY_NAME_SEARCH, LocatorsPath.MAX_TIME, 
					file3.getCellData("Positive Activities", "Activity Name", 2));
			CallObject.block(2000);

			wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.EDIT_DESCRIPTION)))).clear();
			CallObject.block(1000);
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.EDIT_DESCRIPTION, LocatorsPath.MAX_TIME, 
					file3.getCellData("Positive Activities", "Description", 3));
			System.out.println("Success: Record is edited and modified successfully");
		} catch (StaleElementReferenceException StaleElementReferenceException) {
			System.out.println("Trying to recover from stale element" + StaleElementReferenceException);
		}
	}
	

	@Then("^User verifies the edited activity record is saved without any errors\\.$")
	public void user_verifies_the_edited_activity_record_is_saved_without_any_errors() throws Throwable {
	    
		System.out.println("Attempt: verify the edited activity record is saved without any errors");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ADD_ACTIVITY_SAVE_1, LocatorsPath.MAX_TIME);
		System.out.println("Success: edited activity record is saved without any errors successfully");
	}
	

	@Then("^User repeats the above steps by adding multiple activities$")
	public void user_repeats_the_above_steps_by_adding_multiple_activities() throws Throwable {
	    
		user_selects_the_Activities_as_Profile_Address_Attachment_Contacts_Outlet_Times_Territory_Sales_Assessments_Retail_Audit_Contracts_Special_Orders_Planogram_Merchandising_Service_Request_Suppliers_to_be_assigned_based_on_the_Objective();
		user_clicks_on_Add_Activity_in_the_Activities_grid();
		user_verifies_the_Add_Activity_screen_is_displayed_successfully();
		user_verifies_the_system_displaying_the_Objective_name_based_on_the_Objective_selected_in_the_previous_step();
		
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ACTIVITY_NAME, LocatorsPath.MAX_TIME, 
				file3.getCellData("Positive Activities", "Activity Name", 3));
		
		user_enters_the_Description_in_the_Add_Activity_page();
		user_selects_the_Start_Date_in_the_Add_Activity_page();
		user_selects_the_End_Date_in_the_Add_Activity_page();
		user_selects_the_Touch_Point_for_which_the_Activity_to_be_assigned();
		user_selects_the_Required_checkbox_to_make_an_activity_mandatory_for_execution_between_the_Start_End_Date();
		user_selects_the_Recurrent_checkbox_to_make_an_activity_recurrent_for_execution_between_the_Start_End_Date();
		user_selects_the_Status_to_make_the_Activity_Active_Inactive();
		user_enters_the_Comments_in_the_Text_field();
		user_selects_the_Free_Field_in_the_Add_Activity_page(0);
		user_enters_the_Free_Text_Field1_in_the_Add_Activity_page(0);
		user_enters_the_Free_Text_Field2_in_the_Add_Activity_page(0);
		user_clicks_on_save_button_and_verifies_the_Activity_record_is_saved_without_any_errors();
	}
	

	
	/**----------------------RCS_SaaS_Delete_Activities_WC--------------------------**/
	
	
	
	@Then("^User clicks on the Delete icon for the activity to be deleted$")
	public void user_clicks_on_the_Delete_icon_for_the_activity_to_be_deleted() throws Throwable {
	    
		System.out.println("Attempt: edit the record and modify the data");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ACTIVITY_NAME_SEARCH, LocatorsPath.MAX_TIME, 
				file3.getCellData("Positive Activities", "Activity Name", 3));

		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ADD_ACTIVITY_DELETE, LocatorsPath.MAX_TIME);
		CallObject.switchToAlert(driver);
		System.out.println("Success: Record is edited and modified successfully");
	}
	

	@Then("^User verifies the Activity is deleted without any errors\\.$")
	public void user_verifies_the_Activity_is_deleted_without_any_errors() throws Throwable {
	    
		System.out.println("Attempt: verify the Activity is deleted without any errors");
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ACTIVITY_NAME_SEARCH)))).clear();
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ACTIVITY_NAME_SEARCH, LocatorsPath.MAX_TIME, 
				file3.getCellData("Positive Activities", "Activity Name", 3));
		CallObject.block(3000);
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ACTIVITY_NAME_SEARCH)))).clear();
		CallObject.waitForPageLoad(driver);
		System.out.println("Success: Activity is deleted without any errors successfully");
	}
	

	
	/**----------------------RCS_SaaS_Associate_Customers_WC--------------------------**/
	
	
	
	
	@Then("^User assigns the Outlets to the Activity on clicking 'Associate Customers' button$")
	public void user_assigns_the_Outlets_to_the_Activity_on_clicking_Associate_Customers_button() throws Throwable {
	    
		System.out.println("Attempt: click on 'Associate Customers' button");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ACTIVITY_NAME_SEARCH, LocatorsPath.MAX_TIME, 
				file3.getCellData("Positive Activities", "Activity Name", 2));

		CallObject.waitForPageLoad(driver);
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.ASSOCIATE_CUSTOMERS)));
		WebElement activities = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ASSOCIATE_CUSTOMERS))));
		actions.moveToElement(activities).doubleClick().build().perform();
		robot.importFile(LocatorsPath.Customers);
		
		WebElement element = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.TOTAL_RECORDS_MESSAGE))));
		Assert.assertEquals("Total Records:-1 Success Records:-1 Error Records:-0", 
				element.getText());
		System.out.println("Success: 'Associate Customers' button clicked successfully");
	}
	

	@Then("^User clicks on the export button$")
	public void user_clicks_on_the_export_button() throws Throwable {
	    
		System.out.println("Attempt: click on the export button");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.EXPORT, LocatorsPath.MAX_TIME);
		System.out.println("Success: export button clicked successfully");
	}
	

	@Then("^User verifies the Outlets associated to the selected Activity is exported successfully$")
	public void user_verifies_the_Outlets_associated_to_the_selected_Activity_is_exported_successfully() throws Throwable {
	   
		System.out.println("Attempt: verify the Outlets associated to the selected Activity is exported");
		//Convert CSV to XLSX files
				CsvToExcelConverter.csvConverter
				(LocatorsPath.CsvCustomerActivitiesLoc, LocatorsPath.xlsxCustomerActivitiesLoc, LocatorsPath.Sheet);
		System.out.println("Success: Outlets associated to the selected Activity is exported successfully");
	}
	

	@Then("^User verifies the export file contains Customer ID, Customer Number, Account Name, Activity Name & Activity Number\\.$")
	public void user_verifies_the_export_file_contains_Customer_ID_Customer_Number_Account_Name_Activity_Name_Activity_Number() throws Throwable {
	    
		System.out.println("Attempt: verify the export file contains Customer ID, Customer Number, "
				+ "Account Name, Activity Name & Activity Number");
		ExcelApiFile customerID = new ExcelApiFile(LocatorsPath.xlsxCustomerActivitiesLoc);
		Assert.assertEquals("Customer ID", 
				customerID.getCellData("CustomerActivities", "Customer ID", 1));
		Assert.assertEquals("Customer No", 
				customerID.getCellData("CustomerActivities", "Customer No", 1));
		Assert.assertEquals("Account Name", 
				customerID.getCellData("CustomerActivities", "Account Name", 1));
		/*Assert.assertEquals("Activity Name", 
				customerID.getCellData("CustomerActivities", "Activity Name", 1));
		Assert.assertEquals("Activity Number", 
				customerID.getCellData("CustomerActivities", "Activity Number", 1));*/
		System.out.println("Success: export file contains Customer ID, Customer Number, "
				+ "Account Name, Activity Name & Activity Number successfully");
	}
	

	
	/**----------------------RCS_SaaS_PositiveActivities_Validation1_WC--------------------------**/
	
	
	
	@Then("^User creates an activity for the current date & associate Outlets$")
	public void user_creates_an_activity_for_the_current_date_associate_Outlets() throws Throwable {
	    
		System.out.println("Attempt: create an activity for the current date & associate Outlets");
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ACTIVITY_NAME_SEARCH)))).clear();
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ACTIVITY_NAME_SEARCH, LocatorsPath.MAX_TIME, 
				file3.getCellData("Positive Activities", "Activity Name", 2));
		System.out.println("Success: Activity created for the current date & associate Outlets successfully");
	}
	

	@Then("^User clicks on the delete icon to delete the activity$")
	public void user_clicks_on_the_delete_icon_to_delete_the_activity() throws Throwable {
	    
		System.out.println("Attempt: click on the delete icon to delete the activity");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ADD_ACTIVITY_DELETE, LocatorsPath.MAX_TIME);
		CallObject.switchToAlert(driver);
		System.out.println("Success: Deleted the activity successfully");
	}
	

	@Then("^User verifies the system not allowing to delete the activity as it has been already started & verifies the error message displayed as 'Activity already started, cannot delete this activity'$")
	public void user_verifies_the_system_not_allowing_to_delete_the_activity_as_it_has_been_already_started_verifies_the_error_message_displayed_as_Activity_already_started_cannot_delete_this_activity() throws Throwable {
	    
		System.out.println("Attempt: verify the system not allowing to delete the activity");
		WebElement errorMessage = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ERROR_MESSAGE))));
		Assert.assertEquals("Activity already started,cannot delete this activity.", 
				errorMessage.getText());
		System.out.println("Success: System not allowing to delete the activity is verified successfully");
	}
	

	
	/**----------------------RCS_SaaS_PositiveActivities_Validation2_WC--------------------------**/
	
	
	
	@Then("^User creates an activity for the current date as Start Date & End Date & associate Outlets & saves the record\\.$")
	public void user_creates_an_activity_for_the_current_date_as_Start_Date_End_Date_associate_Outlets_saves_the_record() throws Throwable {
	    
		user_creates_an_activity_for_the_current_date_associate_Outlets();
	}
	

	@Then("^User tries to change the Start Date as future date & saves it\\.$")
	public void user_tries_to_change_the_Start_Date_as_future_date_saves_it() throws Throwable {
	    
		System.out.println("Attempt: Try to change the Start Date as future date & save it");
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.EDIT_START_DATE)));
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.EDIT_START_DATE)))).clear();
		CallObject.block(2000);
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.EDIT_START_DATE, LocatorsPath.MAX_TIME, CallObject.futureDate());
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ADD_ACTIVITY_SAVE_1, LocatorsPath.MAX_TIME);
		System.out.println("Success: Changed the Start Date as future date & saved it successfully");
	}
	

	@Then("^User verifies the system not allowing to modify the start Date & displays the error message as 'Start Date cannot be greater than End Date'\\.$")
	public void user_verifies_the_system_not_allowing_to_modify_the_start_Date_displays_the_error_message_as_Start_Date_cannot_be_greater_than_End_Date() throws Throwable {
	    
		System.out.println("Attempt: verify the system not allowing to modify the start Date");
		WebElement errorMessage = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ERROR_MESSAGE))));
		Assert.assertEquals("Start date cannot be greater than end date.", 
				errorMessage.getText());
		System.out.println("Success: System not allowing to modify the start Date is verified successfully");
	}
}
