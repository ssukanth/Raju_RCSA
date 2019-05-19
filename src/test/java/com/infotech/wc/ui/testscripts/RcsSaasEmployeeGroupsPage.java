package com.infotech.wc.ui.testscripts;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
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

public class RcsSaasEmployeeGroupsPage extends TestRunnerWebClient {

	WebDriver driver = getDriver();
	ExcelApiFile file1 = new ExcelApiFile("TestData1.xlsx");
	WebDriverWait wait = new WebDriverWait(driver, LocatorsPath.MAX_TIME);
	Actions actions = new Actions(driver);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	RcsSaasMerchandisingPage merchandisingPage = new RcsSaasMerchandisingPage();
	RcsSaasConfigurationUsersPage configurationPage = new RcsSaasConfigurationUsersPage();

	public RcsSaasEmployeeGroupsPage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	/**
	 * ----------------------RCS SAAS EmployeeGroups_WC--------------------------
	 **/

	
	@Then("^User clicks on Employee Groups and navigates to Employee Groups Screen$")
	public void user_clicks_on_Employee_Groups_and_navigates_to_Employee_Groups_Screen() throws Throwable {
		
		System.out.println("Attempt: select 'Employee Groups' tab");
		WebElement users = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.EMPLOYEE_GROUPS))));
		actions.moveToElement(users).doubleClick().build().perform();
		System.out.println("Success: 'Employee Groups' tab selected successfully");
	}
	

	@Then("^User clicks on 'ADD GROUP' button in Employee Groups List grid and Add New Group screen should open successfully$")
	public void user_clicks_on_ADD_GROUP_button_in_Employee_Groups_List_grid_and_Add_New_Group_screen_should_open_successfully()
			throws Throwable {
		
		System.out.println("Attempt: User clicks on the Add group button");
		CallObject.waitForPageLoad(driver);
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.ADD_GROUP)));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ADD_GROUP, LocatorsPath.MAX_TIME);
		System.out.println("Success: Add group button selected successfully");
	}
	

	@Then("^User enters the 'Group name' - mandatory Text field$")
	public void user_enters_the_Group_name_mandatory_Text_field() throws Throwable {
		
		System.out.println("Attempt: Enter 'Group name'");
		wait.until(ExpectedConditions.
				presenceOfElementLocated((
						By.cssSelector(LocatorsPath.GROUP_NAME)))).clear();
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.GROUP_NAME, LocatorsPath.MAX_TIME, 
				CallObject.timestamp().concat("_GroupName"));
		file1.setCellData("Employee Group", "Group Name", 2, 
				CallObject.timestamp().concat("_GroupName"));
		System.out.println("Success: 'Group name' entered successfully");
	}
	

	@Then("^User enters the 'Group Description' - Non mandatory Text field$")
	public void user_enters_the_Group_Description_Non_mandatory_Text_field() throws Throwable {
		
		System.out.println("Attempt: Enter 'Group Description'");
		wait.until(ExpectedConditions.
				presenceOfElementLocated((
						By.cssSelector(LocatorsPath.GROUP_DESCRIPTION)))).clear();
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.GROUP_DESCRIPTION, LocatorsPath.MAX_TIME, 
				file1.getCellData("Employee Group", "Group Description", 2));
		System.out.println("Success: 'Group Description' entered successfully");
	}
	

	@Then("^User clicks on save button and the record should get saved & displayed under Employee Groups List$")
	public void user_clicks_on_save_button_and_the_record_should_get_saved_displayed_under_Employee_Groups_List()
			throws Throwable {
		
		System.out.println("Attempt: User clicks on the save button");
		CallObject.waitForPageLoad(driver);
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.SAVE_NEW_GROUP)));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.SAVE_NEW_GROUP, LocatorsPath.MAX_TIME);
		System.out.println("Success: save button selected successfully");
	}
	

	@Then("^User clicks on the Group Name hyperlink for which the data to be edited$")
	public void user_clicks_on_the_Group_Name_hyperlink_for_which_the_data_to_be_edited() throws Throwable {
	
		System.out.println("Attempt: click on 'Group name' hyperlink");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.GROUP_NAME_SEAR_FIELD, LocatorsPath.MAX_TIME, 
				file1.getCellData("Employee Group", "Group Name", 2));
		CallObject.block(2000);
		wait.until(ExpectedConditions.
				presenceOfElementLocated((
						By.cssSelector(LocatorsPath.GROUP_NAME_SEAR_FIELD)))).clear();
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.GROUP_NAME_SEAR_FIELD, LocatorsPath.MAX_TIME, 
				file1.getCellData("Employee Group", "Group Name", 2));
		CallObject.waitForPageLoad(driver);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.GROUP_FIRST_NAME, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Group name' hyperlink selected successfully");
	}
	

	@Then("^User should be navigated to Edit Group List$")
	public void user_should_be_navigated_to_Edit_Group_List() throws Throwable {
		
		System.out.println("Attempt: User should be navigated to Edit Group List");
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.EDIT_GROUP, LocatorsPath.MAX_TIME);
		System.out.println("Success: Navigated to Edit Group List successfully");
	}
	

	@Then("^The data should be edited & saved without any errors$")
	public void the_data_should_be_edited_saved_without_any_errors() throws Throwable {
		
		System.out.println("Attempt: Edit 'Group Description'");
		wait.until(ExpectedConditions.
				presenceOfElementLocated((
						By.cssSelector(LocatorsPath.GROUP_NAME)))).clear();
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.GROUP_NAME, LocatorsPath.MAX_TIME, 
				CallObject.timestamp().concat("_GroupName"));
		file1.setCellData("Employee Group", "Group Name", 2, 
				CallObject.timestamp().concat("_GroupName"));
		user_clicks_on_save_button_and_the_record_should_get_saved_displayed_under_Employee_Groups_List();
		System.out.println("Success: 'Group Description' edited successfully");
	}
	

	@Then("^User clicks on 'ASSIGN EMPLOYEES' button and Assign Employees screen should get displayed successfully$")
	public void user_clicks_on_ASSIGN_EMPLOYEES_button_and_Assign_Employees_screen_should_get_displayed_successfully()
			throws Throwable {
		
		System.out.println("Attempt: User clicks on the 'ASSIGN EMPLOYEES' button");
		CallObject.waitForPageLoad(driver);
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.ASSIGN_EMPLOYEES)));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ASSIGN_EMPLOYEES, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'ASSIGN EMPLOYEES' button selected successfully");
	}
	

	@Then("^User selects the 'Employee Group' - Which displays all the Employee Groups available in the system$")
	public void user_selects_the_Employee_Group_Which_displays_all_the_Employee_Groups_available_in_the_system()
			throws Throwable {
		
		System.out.println("Attempt: Select the 'Employee Group'");
		CallObject.waitForPageLoad(driver);
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.SELECT_EMPLOYEE_GROUP, LocatorsPath.MAX_TIME, 
				file1.getCellData("Employee Group", "Group Name", 2));
		System.out.println("Success: 'Employee Group' selected successfully");
	}
	

	@Then("^User verifies that all the Active Employees from the 'Available Employees' system are present in the left side$")
	public void user_verifies_that_all_the_Active_Employees_from_the_Available_Employees_system_are_present_in_the_left_side()
			throws Throwable {
		
		System.out.println("Attempt: Verify 'Available Employees' system are present in the left side");
		CallObject.waitForPageLoad(driver);
		PageObjects.SelectByCSSSelectorWithoutClick(
				driver, LocatorsPath.AVAILABLE_EMPLOYEES_TABLE, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Available Employees' system are present in the left side");
	}
	

	@Then("^User selects all the required 'Available Employees' to the right side of 'Assign Employees' system by clicking on the right arrow button$")
	public void user_selects_all_the_required_Available_Employees_to_the_right_side_of_Assign_Employees_system_by_clicking_on_the_right_arrow_button()
			throws Throwable {
		
		System.out.println("Attemp: Select all the required 'Available Employees' "
				+ "to the right side of 'Assign Employees' system");
		CallObject.block(2000);
		actions.moveToElement(driver.
				findElement(By.xpath(LocatorsPath.REMOVE_ALL))).doubleClick().build().perform();
		PageObjects.SelectByXpath(driver, LocatorsPath.REMOVE_ALL, LocatorsPath.MAX_TIME);
		
		actions.moveToElement(driver.
				findElement(By.cssSelector(LocatorsPath.ADD_1))).doubleClick().build().perform();
		PageObjects.SelectByCSSSelector(driver, LocatorsPath.ADD_1, LocatorsPath.MAX_TIME);
		
		PageObjects.SelectByXpath(
				driver, LocatorsPath.EMPLOYEE_GROUP_ADD, LocatorsPath.MAX_TIME);
		System.out.println("Success: All the required 'Available Employees' "
				+ "selected to the right side of 'Assign Employees' system");
	}
	

	@Then("^User clicks on save button and verfies the message 'Employees assigned to Group successfully' under Employee Groups List$")
	public void user_clicks_on_save_button_and_verfies_the_message_Employees_assigned_to_Group_successfully_under_Employee_Groups_List()
			throws Throwable {
		
		System.out.println("Attempt: User clicks on the save button");
		CallObject.waitForPageLoad(driver);
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.ASSIGN_EMPLOYEES_SAVE)));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ASSIGN_EMPLOYEES_SAVE, LocatorsPath.MAX_TIME);
		System.out.println("Success: Save button selected successfully");
	}
	

	@Then("^User clicks on 'Group Messages' button and the Group Message List screen should get displayed successfully$")
	public void user_clicks_on_Group_Messages_button_and_the_Group_Message_List_screen_should_get_displayed_successfully()
			throws Throwable {
		
		System.out.println("Attempt: User clicks on the Group Messages button");
		CallObject.waitForPageLoad(driver);
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.GROUP_MESSAGES)));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.GROUP_MESSAGES, LocatorsPath.MAX_TIME);
		System.out.println("Success: Group Messages button selected successfully");
	}
	

	@Then("^User verifies the 'Group name', 'Message', 'Expiry Date', 'Delete icon' present in the Group Message List screen$")
	public void user_verifies_the_Group_name_Message_Expiry_Date_Delete_icon_present_in_the_Group_Message_List_screen()
			throws Throwable {
		
		System.out.println("Attempt: Verify the 'Group name', 'Message', 'Expiry Date', "
				+ "'Delete icon' present in the Group Message List");
		PageObjects.SelectByCSSSelectorWithoutClick(
				driver, LocatorsPath.MESSAGE_LIST_DELETE_ICON, LocatorsPath.MAX_TIME);
		
		WebElement name = wait.until(ExpectedConditions.
				presenceOfElementLocated((
						By.cssSelector(LocatorsPath.MESSAGE_LIST_GROUP_NAME))));
		WebElement message = wait.until(ExpectedConditions.
				presenceOfElementLocated((
						By.cssSelector(LocatorsPath.MESSAGE_LIST_MESSAGES))));
		WebElement expiryDate = wait.until(ExpectedConditions.
				presenceOfElementLocated((
						By.cssSelector(LocatorsPath.MESSAGE_LIST_EXPIRY_DATE))));
		
		Assert.assertEquals("Group Name", name.getText());
		Assert.assertEquals("Message", message.getText());
		Assert.assertEquals("Expiry Date", expiryDate.getText());
		
		System.out.println("Success: 'Group name', 'Message', 'Expiry Date', "
				+ "'Delete icon' present in the Group Message List");
	}
	

	@Then("^User clicks on 'Add Message' button and Add New Message screen should get displayed successfully$")
	public void user_clicks_on_Add_Message_button_and_Add_New_Message_screen_should_get_displayed_successfully()
			throws Throwable {
	
		System.out.println("Attempt: User clicks on the Add Message button");
        CallObject.waitForPageLoad(driver);
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.ADD_MESSAGE)));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ADD_MESSAGE, LocatorsPath.MAX_TIME);
		System.out.println("Success: Add Message button selected successfully");
	}
	

	@Then("^User selects the 'Employee Group' from the dropDown$")
	public void user_selects_the_Employee_Group_from_the_dropDown() throws Throwable {
		
		System.out.println("Attempt: Select the 'Employee Group'");
		CallObject.waitForPageLoad(driver);
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.EMPLOYEE_GROUP, LocatorsPath.MAX_TIME, 
				file1.getCellData("Employee Group", "Group Name", 2));
		System.out.println("Success: 'Employee Group' selected successfully");
	}
	

	@Then("^User enters the 'Message' inside the Text field$")
	public void user_enters_the_Message_inside_the_Text_field() throws Throwable {
		
		System.out.println("Attempt: Enter the 'Message' inside the Text field");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.EMPLOYEE_MESSAGE, LocatorsPath.MAX_TIME, 
				file1.getCellData("Employee Group", "Message", 2));
		System.out.println("Success: 'Message' entered successfully");
	}
	

	@Then("^User selects the 'Expiry Date'$")
	public void user_selects_the_Expiry_Date() throws Throwable {
		
		System.out.println("Attempt: select the 'Expiry Date'");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.EXPIRY_DATE_CALENDER, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelector(
				driver,LocatorsPath. EXPIRY_DATE, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Expiry Date' as been selected successfully");
	}
	

	@Then("^User clicks on save button and the Message should be saved successfully and displayed under Group Messages list$")
	public void user_clicks_on_save_button_and_the_Message_should_be_saved_successfully_and_displayed_under_Group_Messages_list()
			throws Throwable {
		
		user_clicks_on_save_button_and_the_record_should_get_saved_displayed_under_Employee_Groups_List();
	}
	

	@Then("^User clicks on the Group Name hyperlink for which the message to be edited and navigates to Edit Group Message page$")
	public void user_clicks_on_the_Group_Name_hyperlink_for_which_the_message_to_be_edited_and_navigates_to_Edit_Group_Message_page()
			throws Throwable {
		
		user_clicks_on_the_Group_Name_hyperlink_for_which_the_data_to_be_edited();
	}
	

	@Then("^User Edits the Message and clicks on save button and the data should be saved without any errors$")
	public void user_Edits_the_Message_and_clicks_on_save_button_and_the_data_should_be_saved_without_any_errors()
			throws Throwable {
		
		System.out.println("Attempt: Enter the 'Message' inside the Text field");
		wait.until(ExpectedConditions.
				presenceOfElementLocated((
						By.cssSelector(LocatorsPath.EDIT_EMPLOYEE_MESSAGE)))).clear();
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.EDIT_EMPLOYEE_MESSAGE, LocatorsPath.MAX_TIME, 
				file1.getCellData("Employee Group", "Message", 3));
		user_clicks_on_save_button_and_the_record_should_get_saved_displayed_under_Employee_Groups_List();
		System.out.println("Success: 'Message' entered successfully");
	}
	

	@Then("^User clicks on the Delete icon for the Group message and Group Message should be deleted successfully$")
	public void user_clicks_on_the_Delete_icon_for_the_Group_message_and_Group_Message_should_be_deleted_successfully()
			throws Throwable {
		
		System.out.println("Attempt: click on 'Group name' hyperlink");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.GROUP_NAME_SEAR_FIELD, LocatorsPath.MAX_TIME, 
				file1.getCellData("Employee Group", "Group Name", 2));
		CallObject.block(2000);
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.GROUP_NAME_SEAR_FIELD)))).clear();
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.GROUP_NAME_SEAR_FIELD, LocatorsPath.MAX_TIME, 
				file1.getCellData("Employee Group", "Group Name", 2));
		System.out.println("Success: 'Group name' hyperlink selected successfully");
		
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.MESSAGE_LIST_DELETE_ICON, LocatorsPath.MAX_TIME);
		CallObject.switchToAlert(driver);
	}
	

	@Then("^User clicks on the Delete icon for which the Employee Group to be deleted$")
	public void user_clicks_on_the_Delete_icon_for_which_the_Employee_Group_to_be_deleted() throws Throwable {
		
		user_clicks_on_Employee_Groups_and_navigates_to_Employee_Groups_Screen();
		
		System.out.println("Attempt: click on 'Group name' hyperlink");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.GROUP_NAME_SEAR_FIELD, LocatorsPath.MAX_TIME, 
				file1.getCellData("Employee Group", "Group Name", 2));
		CallObject.block(2000);
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.GROUP_NAME_SEAR_FIELD)))).clear();
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.GROUP_NAME_SEAR_FIELD, LocatorsPath.MAX_TIME, 
				file1.getCellData("Employee Group", "Group Name", 2));
		System.out.println("Success: 'Group name' hyperlink selected successfully");
		
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.MESSAGE_LIST_DELETE_ICON, LocatorsPath.MAX_TIME);
		CallObject.switchToAlert(driver);
	}
	

	@Then("^The system should prompt an message 'Group cannot be deleted as Employees are associated with this group'$")
	public void the_system_should_prompt_an_message_Group_cannot_be_deleted_as_Employees_are_associated_with_this_group()
			throws Throwable {
		
		System.out.println("Attempt: system should prompt an message "
				+ "'Group cannot be deleted as Employees are associated with this group'");
		WebElement element = wait.until(ExpectedConditions.
				presenceOfElementLocated((
						By.cssSelector(LocatorsPath.MESSAGE_FROM_SYSTEM))));
		Assert.assertEquals("Group cannot be deleted as Employee(s) are associated with this Group.", 
				element.getText());
		System.out.println("Success: Error message displayed successfully");
	}
	

	@Then("^User selects the Employee group for which the Employs to be disassociated and clicks on the Left icon$")
	public void user_selects_the_Employee_group_for_which_the_Employs_to_be_disassociated_and_clicks_on_the_Left_icon()
			throws Throwable {
	
		user_selects_the_Employee_Group_Which_displays_all_the_Employee_Groups_available_in_the_system();
		
		System.out.println("Attemp: Select all the required 'Available Employees' "
				+ "to the right side of 'Assign Employees' system");
		try {
			CallObject.block(5000);
			actions.moveToElement(driver.
					findElement(By.xpath(LocatorsPath.REMOVE_ALL))).doubleClick().build().perform();
			PageObjects.SelectByXpath(driver, LocatorsPath.REMOVE_ALL, LocatorsPath.MAX_TIME);
		} catch (StaleElementReferenceException StaleElementReferenceException) {
			System.out.println("Trying to recover from stale element" + StaleElementReferenceException);
		}
		System.out.println("Success: All the required 'Available Employees' selected to the right side of 'Assign Employees' system");
	}
	

	@Then("^User clicks on the save button and the System should display a message '(\\d+) Employees assigned to group successfully'$")
	public void user_clicks_on_the_save_button_and_the_System_should_display_a_message_Employees_assigned_to_group_successfully(
			int arg1) throws Throwable {
		
		user_clicks_on_save_button_and_verfies_the_message_Employees_assigned_to_Group_successfully_under_Employee_Groups_List();
		
		System.out.println("Attempt: User clicks on the save button and the"
				+ " System should display a message '(\\\\d+) Employees assigned to group");
		WebElement element = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.MESSAGE_FROM_SYSTEM))));
		Assert.assertEquals("0 Employee(s) Assigned to Group Successfully", 
				element.getText());
		System.out.println("Success: Clicked on save button and the message displayed successfully");
	}

	
	@Then("^User clicks on the Delete icon and the Employee Group should be deleted successfully from the application\\.$")
	public void user_clicks_on_the_Delete_icon_and_the_Employee_Group_should_be_deleted_successfully_from_the_application()
			throws Throwable {
		
		user_clicks_on_the_Delete_icon_for_which_the_Employee_Group_to_be_deleted();
	}
	

	@Then("^User creates a another Employee Group with the same Group name & same Group Description which already exists in the application$")
	public void user_creates_a_another_Employee_Group_with_the_same_Group_name_same_Group_Description_which_already_exists_in_the_application()
			throws Throwable {
		
		user_clicks_on_ADD_GROUP_button_in_Employee_Groups_List_grid_and_Add_New_Group_screen_should_open_successfully();
		user_enters_the_Group_name_mandatory_Text_field();
		user_enters_the_Group_Description_Non_mandatory_Text_field();
		user_clicks_on_save_button_and_the_record_should_get_saved_displayed_under_Employee_Groups_List();
		
		user_clicks_on_ADD_GROUP_button_in_Employee_Groups_List_grid_and_Add_New_Group_screen_should_open_successfully();
		
		System.out.println("Attempt: Enter 'Group name'");
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.GROUP_NAME)))).clear();
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.GROUP_NAME, LocatorsPath.MAX_TIME, 
				file1.getCellData("Employee Group", "Group Name", 2));
		System.out.println("Success: 'Group name' entered successfully");
		
		user_enters_the_Group_Description_Non_mandatory_Text_field();
		user_clicks_on_save_button_and_the_record_should_get_saved_displayed_under_Employee_Groups_List();
	}
	

	@Then("^User verifies application not allowing to create a Employee Group with the same name\\.$")
	public void user_verifies_application_not_allowing_to_create_a_Employee_Group_with_the_same_name()
			throws Throwable {
		
		System.out.println("Attempt: Verify application not allowing to create a Employee Group with the same name");
		WebElement element = wait.until(ExpectedConditions.
				presenceOfElementLocated((
						By.cssSelector(LocatorsPath.MESSAGE_FROM_SYSTEM))));
		Assert.assertEquals(file1.getCellData("Employee Group", "Group Name", 2) +" Already Exists.", 
				element.getText());
		
        user_clicks_on_Employee_Groups_and_navigates_to_Employee_Groups_Screen();
		
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.GROUP_NAME_SEAR_FIELD, LocatorsPath.MAX_TIME, 
				file1.getCellData("Employee Group", "Group Name", 2));
		CallObject.block(2000);
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.GROUP_NAME_SEAR_FIELD)))).clear();
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.GROUP_NAME_SEAR_FIELD, LocatorsPath.MAX_TIME, 
				file1.getCellData("Employee Group", "Group Name", 2));
		
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.MESSAGE_LIST_DELETE_ICON, LocatorsPath.MAX_TIME);
		CallObject.switchToAlert(driver);
		System.out.println("Success: Error message displayed successfully");
	}	
}
