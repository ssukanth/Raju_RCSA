package com.infotech.wc.ui.testscripts;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.infotech.Excel.CsvToExcelConverter;
import com.infotech.Excel.ExcelApiFile;
import com.infotech.Excel.ExtractZipFile;
import com.infotech.Excel.RenameFile;
import com.infotech.basepage.CallObject;
import com.infotech.basepage.LocatorsPath;
import com.infotech.basepage.PageObjects;
import com.infotech.basepage.RobotPage;
import com.infotech.testrunner.TestRunnerWebClient;

import cucumber.api.java.en.Then;

public class RcsSaasAssortmentPlanAndCustomerGroupPage extends TestRunnerWebClient{
	
	WebDriver driver = getDriver();
	Actions actions = new Actions(driver);
	RenameFile renameFile = new RenameFile();
	RobotPage robotPage = new RobotPage();
	ExtractZipFile extractZipFile = new ExtractZipFile();
	JavascriptExecutor js = (JavascriptExecutor)driver;
	ExcelApiFile file = new ExcelApiFile("TestData.xlsx");
	ExcelApiFile file1 = new ExcelApiFile("TestData1.xlsx");
	ExcelApiFile file3 = new ExcelApiFile("TestData3.xlsx");
	WebDriverWait wait = new WebDriverWait(driver, LocatorsPath.MAX_TIME);
	
	
	public RcsSaasAssortmentPlanAndCustomerGroupPage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	/**----------------------RCS_SaaS_AssortmentPlan_Navigation_WC--------------------------**/
	
	
	
	@Then("^User clicks on AssortmentPlan and navigates to the Assortment Plan Screen$")
	public void user_clicks_on_AssortmentPlan_and_navigates_to_the_Assortment_Plan_Screen() throws Throwable {
	    
		System.out.println("Attempt: Click on AssortmentPlan Menu");
		WebElement assortmentPlan = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.ASSORTMENT_PLAN))));
		actions.moveToElement(assortmentPlan).doubleClick().build().perform();
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.ASSORTMENT_PLAN_LIST_DISP, LocatorsPath.MAX_TIME);
		System.out.println("Success: AssortmentPlan Menu selected successfully");
	}

	
	@Then("^User verifies the AssortmentPlan dropdown as the following LOVs - Customer SKU Assortment, Depot Assortment$")
	public void user_verifies_the_AssortmentPlan_dropdown_as_the_following_LOVs_Customer_SKU_Assortment_Depot_Assortment() throws Throwable {
	   
		System.out.println("Attempt: verify the AssortmentPlan dropdown as the "
				+ "following LOVs - Customer SKU Assortment, Depot Assortment");
		
		WebElement element = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ASSORTMENT_TYPE))));
		Select select = new Select(element);
		List<WebElement> allOptions = select.getOptions();
		
		 boolean found = false;
		 for(WebElement ele: allOptions) {
			 if(LocatorsPath.AssortmentType1.equals(ele.getText())) {
				 found = true;
				 System.out.println(LocatorsPath.AssortmentType1 +" - value exists");
				 Assert.assertTrue(found);
				 break;
			 }
			 
			 if(LocatorsPath.AssortmentType2.equals(ele.getText())) {
				 found = true;
				 System.out.println(LocatorsPath.AssortmentType2 +" - value exists");
				 Assert.assertTrue(found);
				 break;
			 }
			 
		 }if(!found) {
			 System.out.println(LocatorsPath.AssortmentType1 +"or" + LocatorsPath.AssortmentType2 +" - value doesn't exists");
			 Assert.fail(LocatorsPath.AssortmentType1 +"or" + LocatorsPath.AssortmentType2 +" - value doesn't exists");
	   }
	   System.out.println("Success: verified the AssortmentPlan dropdown as the "
	   		+ "following LOVs - Customer SKU Assortment, Depot Assortmentb successfully");
	}
	

	@Then("^User verifies the AssortmentPlan page as the following sections - Assortment Plan List, Assortment Detail, Customer Group$")
	public void user_verifies_the_AssortmentPlan_page_as_the_following_sections_Assortment_Plan_List_Assortment_Detail_Customer_Group() throws Throwable {
	   
		System.out.println("Attempt: verify the AssortmentPlan page as the following sections -"
				+ " Assortment Plan List, Assortment Detail, Customer Group");
		user_selects_the_Depot_Assortment_Plan_from_the_Assortment_Type_dropdown();
		
		WebElement stockReconciliationUser = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.ASSORTMENT_PLAN_LIST_DISP))));
		Assert.assertEquals("Assortment Plan List", stockReconciliationUser.getText());
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.xpath(LocatorsPath.ASSORTMENT_DETAIL_DISP)));
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.ASSORTMENT_DETAIL_DISP, LocatorsPath.MAX_TIME);
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.xpath(LocatorsPath.INVENTORY_LOCATION_DISP)));
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.INVENTORY_LOCATION_DISP, LocatorsPath.MAX_TIME);
		System.out.println("Success: verified the AssortmentPlan page as the following sections -"
				+ " Assortment Plan List, Assortment Detail, Customer Group");
	}


	
	/**----------------------RCS_SaaS_AssortmentPlan_Header_Detail_Section_WC--------------------------**/
	
	
	
	@Then("^User selects the Depot Assortment Plan from the Assortment Type dropdown$")
	public void user_selects_the_Depot_Assortment_Plan_from_the_Assortment_Type_dropdown() throws Throwable {
	    
		System.out.println("Attempt: select the Depot Assortment Plan from the Assortment Type dropdown");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ASSORTMENT_TYPE, LocatorsPath.MAX_TIME, 
				file3.getCellData("AssortmentPlan", "Assortment Type", 2));
		System.out.println("Success: selected the Depot Assortment Plan from the Assortment Type dropdown");
	}
	

	@Then("^User verifies the following fields are present in 'Assortment Plan' header section - Name, Code, Start Date, End Date, Description, Depot Assortment, Parent Assortment, Status, Default$")
	public void user_verifies_the_following_fields_are_present_in_Assortment_Plan_header_section_Name_Code_Start_Date_End_Date_Description_Depot_Assortment_Parent_Assortment_Status_Default() throws Throwable {
	    
		System.out.println("Attempt: verify the following fields are present in 'Assortment Plan' header section "
				+ "- Name, Code, Start Date, End Date, Description, Depot Assortment, Parent Assortment, Status, Default");
		
		WebElement name = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ASSORTMENT_NAME))));
		Assert.assertEquals("Name", name.getText());
		
		WebElement code = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ASSORTMENT_CODE))));
		Assert.assertEquals("Code", code.getText());
		
		WebElement startDate = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ASSORTMENT_START_DATE))));
		Assert.assertEquals("Start Date", startDate.getText());
		
		WebElement endDate = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ASSORTMENT_END_DATE))));
		Assert.assertEquals("End Date", endDate.getText());
		
		WebElement desc = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ASSORTMENT_DESCRIPTION))));
		Assert.assertEquals("Description", desc.getText());
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.ASSORTMENT_DEPOT)));
		WebElement depot = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ASSORTMENT_DEPOT))));
		Assert.assertEquals("Depot Assortment", depot.getText());
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.ASSORTMENT_PARENT)));
		WebElement parent = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ASSORTMENT_PARENT))));
		Assert.assertEquals("Parent Assortment", parent.getText());
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.ASSORTMENT_STATUS)));
		WebElement status = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ASSORTMENT_STATUS))));
		Assert.assertEquals("Status", status.getText());
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.ASSORTMENT_DEFAULT)));
		WebElement deFault = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ASSORTMENT_DEFAULT))));
		Assert.assertEquals("Default", deFault.getText());
		
		System.out.println("Success: verified the following fields are present in 'Assortment Plan' header section "
				+ "- Name, Code, Start Date, End Date, Description, Depot Assortment, Parent Assortment, Status, Default");
	}
	

	@Then("^User verifies the following fields are present in 'Assortment Plan' detail section - SKU Name, SKU Code, Sequence, Target, Drive Brand, SC$")
	public void user_verifies_the_following_fields_are_present_in_Assortment_Plan_detail_section_SKU_Name_SKU_Code_Sequence_Target_Drive_Brand_SC() throws Throwable {
	 
		System.out.println("Attempt: verify the following fields are present in 'Assortment Plan' "
				+ "detail section - SKU Name, SKU Code, Sequence, Target, Drive Brand, SC");
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.ASSORTMENT_SKU_NAME)));
		WebElement skuName = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ASSORTMENT_SKU_NAME))));
		Assert.assertEquals("SKU Name", skuName.getText());
		
		WebElement skuCode = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ASSORTMENT_SKU_CODE))));
		Assert.assertEquals("SKU Code", skuCode.getText());
		
		WebElement driveBrand = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ASSORTMENT_DRIVE_BRAND))));
		Assert.assertEquals("Drive Brand", driveBrand.getText());
		
		WebElement sequence = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ASSORTMENT_SEQUENCE))));
		Assert.assertEquals("Sequence", sequence.getText());
		
		WebElement target = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ASSORTMENT_TARGET))));
		Assert.assertEquals("Target", target.getText());
		
		WebElement sc = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ASSORTMENT_SC))));
		Assert.assertEquals("SC", sc.getText());
		
		System.out.println("Success: verified the following fields are present in 'Assortment Plan' "
				+ "detail section - SKU Name, SKU Code, Sequence, Target, Drive Brand, SC");
	}
	

	@Then("^User verifies the following fields are present in 'Inventory Location Section' - Inv Loc Name, Inv Loc Code, Parent Location, Employee, Type, Depot Flag\\.$")
	public void user_verifies_the_following_fields_are_present_in_Inventory_Location_Section_Inv_Loc_Name_Inv_Loc_Code_Parent_Location_Employee_Type_Depot_Flag() throws Throwable {
	    
		System.out.println("Attempt: verify the following fields are present in 'Inventory Location Section' - "
				+ "Inv Loc Name, Inv Loc Code, Parent Location, Employee, Type, Depot Flag");
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.ASSORTMENT_INV_LOC_NAME)));
		WebElement invLocName = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ASSORTMENT_INV_LOC_NAME))));
		Assert.assertEquals("Inv Loc Name", invLocName.getText());
		
		WebElement invLocCode = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ASSORTMENT_INV_LOC_CODE))));
		Assert.assertEquals("Inv Loc Code", invLocCode.getText());
		
		WebElement parentLoc = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ASSORTMENT_PARENT_LOC))));
		Assert.assertEquals("Parent Location", parentLoc.getText());
		
		WebElement employee = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ASSORTMENT_EMPLOYEE))));
		Assert.assertEquals("Employee", employee.getText());
		
		WebElement type = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ASSORTMENT_TYPE_1))));
		Assert.assertEquals("Type", type.getText());
		
		WebElement depotFlag = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ASSORTMENT_DEPOT_FLAG))));
		Assert.assertEquals("Depot Flag", depotFlag.getText());
		
		System.out.println("Success: verified the following fields are present in 'Inventory Location Section' - "
				+ "Inv Loc Name, Inv Loc Code, Parent Location, Employee, Type, Depot Flag");
	}
	

	
	/**----------------------RCS_SaaS_Creation_of_AssortmentPlan_Header_WC--------------------------**/
	
	
	
	@Then("^User selects the 'Depot Assortment Plan' from the Assortment Type dropdown & verifies the Assortment page is displayed$")
	public void user_selects_the_Depot_Assortment_Plan_from_the_Assortment_Type_dropdown_verifies_the_Assortment_page_is_displayed() throws Throwable {
	    
		System.out.println("Attempt: select the Depot Assortment Plan from the Assortment Type dropdown");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ASSORTMENT_TYPE, LocatorsPath.MAX_TIME, 
				file3.getCellData("AssortmentPlan", "Assortment Type", 2));
		System.out.println("Success: selected the Depot Assortment Plan from the Assortment Type dropdown");
	}
	

	@Then("^User clicks on the 'ADD' button in Assortment Plan List section & verifies the Assortment screen is displayed$")
	public void user_clicks_on_the_ADD_button_in_Assortment_Plan_List_section_verifies_the_Assortment_screen_is_displayed() throws Throwable {
	    
		System.out.println("Attempt: click on the 'ADD' button in Assortment Plan List section & "
				+ "verify the Assortment screen is displayed");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ASSORTMENT_PLAN_LIST_ADD, LocatorsPath.MAX_TIME);
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.ASSORTMENT_DISP, LocatorsPath.MAX_TIME);
		System.out.println("Success: clicked on the 'ADD' button in Assortment Plan List section & "
				+ "verified the Assortment screen is displayed");
	}
	

	@Then("^User enters the 'Name' which is the Mandatory field in the Assortment page$")
	public void user_enters_the_Name_which_is_the_Mandatory_field_in_the_Assortment_page() throws Throwable {
	    
		System.out.println("Attempt: enter the 'Name' which is the Mandatory field in the Assortment page");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ASSORTMENT_NAME_1, LocatorsPath.MAX_TIME, 
				CallObject.timestamp().concat("_AssortPlan"));
		file3.setCellData("AssortmentPlan", "Name", 2, CallObject.timestamp().concat("_AssortPlan"));
		System.out.println("Success: entered the 'Name' which is the Mandatory field in the Assortment page");
	}
	

	@Then("^User enters the 'Code' which is the Mandatory field in the Assortment page$")
	public void user_enters_the_Code_which_is_the_Mandatory_field_in_the_Assortment_page() throws Throwable {
	    
		System.out.println("Attempt: enter the 'Code' which is the Mandatory field in the Assortment page");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ASSORTMENT_CODE_1, LocatorsPath.MAX_TIME, 
				CallObject.timestamp().concat("_Assort"));
		System.out.println("Success: entered the 'Code' which is the Mandatory field in the Assortment page");
	}
	

	@Then("^User selects the 'Start Date' which is the Mandatory field in the Assortment page$")
	public void user_selects_the_Start_Date_which_is_the_Mandatory_field_in_the_Assortment_page() throws Throwable {
	    
		System.out.println("Attempt: select the 'Start Date' which is the "
				+ "Mandatory field in the Assortment page");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ASSORTMENT_START_DATE_1, LocatorsPath.MAX_TIME, 
				CallObject.presentTimestamp());
		System.out.println("Success: selected the 'Start Date' which is the "
				+ "Mandatory field in the Assortment page");
	}
	

	@Then("^User selects the 'End Date' which is the Mandatory field in the Assortment page$")
	public void user_selects_the_End_Date_which_is_the_Mandatory_field_in_the_Assortment_page() throws Throwable {
	    
		System.out.println("Attempt: select the 'End Date' which is the "
				+ "Mandatory field in the Assortment page");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ASSORTMENT_END_DATE_1, LocatorsPath.MAX_TIME, 
				CallObject.presentTimestamp());
		System.out.println("Success: selected the 'End Date' which is the "
				+ "Mandatory field in the Assortment page");
	}
	

	@Then("^User enters the 'Description' in the Assortment page$")
	public void user_enters_the_Description_in_the_Assortment_page() throws Throwable {
	    
		System.out.println("Attempt: enter the 'Description' in the Assortment page");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ASSORTMENT_DESCRIPTION_1, LocatorsPath.MAX_TIME, 
				file3.getCellData("AssortmentPlan", "Description", 2));
		System.out.println("Success: entered the 'Description' in the Assortment page");
	}
	

	@Then("^User verifies the 'Depot Assortment' Checkbox is Defaulted to True$")
	public void user_verifies_the_Depot_Assortment_Checkbox_is_Defaulted_to_True() throws Throwable {
	    
		System.out.println("Attempt: verify the 'Depot Assortment' Checkbox is Defaulted to True");
		WebElement depot = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ASSORTMENT_DEPOT_1))));
		Assert.assertEquals(true, depot.isSelected());
		Assert.assertEquals(true, !depot.isEnabled());
		System.out.println("Success: verified the 'Depot Assortment' Checkbox is Defaulted to True");
	}
	

	@Then("^User selects the 'Parent Assortment' value from the dropdown which populates all the depot assortment plans$")
	public void user_selects_the_Parent_Assortment_value_from_the_dropdown_which_populates_all_the_depot_assortment_plans() throws Throwable {
	    
		System.out.println("Attempt: select the 'Parent Assortment' "
				+ "value from the dropdown which populates all the depot assortment plans");
		/*PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, ASSORTMENT_PARENT_1, LocatorsPath.MAX_TIME, 
				file3.getCellData("AssortmentPlan", "Parent Assortment", 2));*/
		System.out.println("Success: selected the 'Parent Assortment' "
				+ "value from the dropdown which populates all the depot assortment plans");
	}
	

	@Then("^User verifies the 'Status' defaults to Draft$")
	public void user_verifies_the_Status_defaults_to_Draft() throws Throwable {
	    
		System.out.println("Attempt: verify the 'Status' defaults to Draft");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ASSORTMENT_STATUS_1, LocatorsPath.MAX_TIME, 
				file3.getCellData("AssortmentPlan", "Status", 2));
		System.out.println("Success: verified the 'Status' defaults to Draft");
	}
	

	@Then("^User verifies the 'Default' Checkbox is Defaulted to False$")
	public void user_verifies_the_Default_Checkbox_is_Defaulted_to_False() throws Throwable {
	 
		System.out.println("Attempt: verify the 'Default' Checkbox is Defaulted to False");
		WebElement deFault = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ASSORTMENT_DEFAULT_1))));
		Assert.assertEquals(true, !deFault.isSelected());
		System.out.println("Success: verified the 'Default' Checkbox is Defaulted to False");
	}
	

	@Then("^User clicks on 'Save' button to save the Assortment Plan header$")
	public void user_clicks_on_Save_button_to_save_the_Assortment_Plan_header() throws Throwable {
	    
		System.out.println("Attempt: click on 'Save' button to save the Assortment Plan header");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ASSORTMENT_SAVE, LocatorsPath.MAX_TIME);
		System.out.println("Success: clicked on 'Save' button to save the Assortment Plan header");
	}
	

	@Then("^User verifies the Assortment header is saved with all the mandatory fields successfully\\.$")
	public void user_verifies_the_Assortment_header_is_saved_with_all_the_mandatory_fields_successfully() throws Throwable {
	    
		System.out.println("User verifies the Assortment header is saved with all the mandatory fields successfully");
	}
	

	
	/**----------------------RCS_SaaS_AssortmentPlan_Date_Validation_WC--------------------------**/
	
	
	
	
	@Then("^User creates a Assortment Plan Header with End Date lesser than Start Date and saves it$")
	public void user_creates_a_Assortment_Plan_Header_with_End_Date_lesser_than_Start_Date_and_saves_it() throws Throwable {
	   
		System.out.println("Attempt: create a Assortment Plan Header with End Date lesser than Start Date and save it");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ASSORTMENT_NAME_SEARCH, LocatorsPath.MAX_TIME, 
				file3.getCellData("AssortmentPlan", "Name", 2));
		CallObject.block(2000);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ASSORTMENT_NAME_SELECTION, LocatorsPath.MAX_TIME);
		
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ASSORTMENT_END_DATE_1)))).clear();
		CallObject.block(1000);
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ASSORTMENT_END_DATE_1, LocatorsPath.MAX_TIME, 
				CallObject.pastDate());
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ASSORTMENT_SAVE, LocatorsPath.MAX_TIME);
		System.out.println("Success: created a Assortment Plan Header with End Date lesser than Start Date and saved it");
	}
	

	@Then("^User verifies the Application doesnt accept the End Date lesser than Start Date & displays the error message as 'Start Date Should not be Greater Than End Date'$")
	public void user_verifies_the_Application_doesnt_accept_the_End_Date_lesser_than_Start_Date_displays_the_error_message_as_Start_Date_Should_not_be_Greater_Than_End_Date() throws Throwable {
	    
		System.out.println("Attempt: verify the Application doesnt accept the End Date lesser than Start Date & "
				+ "displays the error message as 'Start Date Should not be Greater Than End Date'");
		WebElement msg = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ERROR_MESSAGE))));
		Assert.assertEquals("Start Date Should not be Greater Than End Date.", msg.getText());
		System.out.println("Success: verified the Application doesnt accept the End Date lesser than Start Date & "
				+ "displays the error message as 'Start Date Should not be Greater Than End Date'");
	}
	

	@Then("^User creates the Assortment Plan Header with End date and Start Date as Past date and saves it$")
	public void user_creates_the_Assortment_Plan_Header_with_End_date_and_Start_Date_as_Past_date_and_saves_it() throws Throwable {
	 
		System.out.println("User creates the Assortment Plan Header with End date and Start Date as Past date and saves it");
	}
	

	@Then("^User verifies the system not allowing the user to select past dates\\.$")
	public void user_verifies_the_system_not_allowing_the_user_to_select_past_dates() throws Throwable {
	    
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ASSORTMENT_CANCEL, LocatorsPath.MAX_TIME);
		CallObject.switchToAlert(driver);
	}
	

	
	/**----------------------RCS_SaaS_Creation_of_AssortmentPlan_Details_WC--------------------------**/
	
	
	
	@Then("^In Assortment Plan screen, User selects the created Assortment Plan header and clicks on 'Add' button to create the assortment details$")
	public void in_Assortment_Plan_screen_User_selects_the_created_Assortment_Plan_header_and_clicks_on_Add_button_to_create_the_assortment_details() throws Throwable {
	    
		System.out.println("Attempt: Select the created Assortment Plan header and "
				+ "click on 'Add' button to create the assortment details");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ASSORTMENT_NAME_SEARCH, LocatorsPath.MAX_TIME, 
				file3.getCellData("AssortmentPlan", "Name", 2));
		CallObject.block(2000);
		PageObjects.SelectByCSSSelectorWithoutClick(
				driver, LocatorsPath.ASSORTMENT_NAME_SELECTION, LocatorsPath.MAX_TIME);
		
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ASSORTMENT_HEADER_REFRESH, LocatorsPath.MAX_TIME);
		CallObject.block(3000);
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.ASSORTMENT_PLAN_DETAIL_ADD)));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ASSORTMENT_PLAN_DETAIL_ADD, LocatorsPath.MAX_TIME);
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.ASSORTMENT_DETAIL_SKU_DISP, LocatorsPath.MAX_TIME);
		System.out.println("Success: Selected the created Assortment Plan header and "
				+ "clicked on 'Add' button to create the assortment details");
	}
	

	@Then("^User selects the 'SKU name' which is a Mandatory field which lists all the active BAT SKUs$")
	public void user_selects_the_SKU_name_which_is_a_Mandatory_field_which_lists_all_the_active_BAT_SKUs() throws Throwable {
	  
		System.out.println("Attempt: select the 'SKU name' which is a "
				+ "Mandatory field which lists all the active BAT SKUs");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ASSORTMENT_SKU_NAME_1, LocatorsPath.MAX_TIME, 
				file3.getCellData("AssortmentPlan", "SKU Name", 2));
		System.out.println("Success: selected the 'SKU name' which is a "
				+ "Mandatory field which lists all the active BAT SKUs");
	}
	

	@Then("^User verifies the 'SKU Code' is auto populated on selecting SKU name$")
	public void user_verifies_the_SKU_Code_is_auto_populated_on_selecting_SKU_name() throws Throwable {
	    
		System.out.println("Attempt: verify the 'SKU Code' is auto populated on selecting SKU name");
		CallObject.block(3000);
		WebElement skuCode = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ASSORTMENT_SKU_CODE_1))));
		Assert.assertTrue(skuCode.getAttribute
				 ("readonly").equals("true"),"readonly");
		System.out.println("Success: verified the 'SKU Code' is auto populated on selecting SKU name");
	}
	

	@Then("^User verifies the 'Sequence' field is auto populated on selecting SKU name$")
	public void user_verifies_the_Sequence_field_is_auto_populated_on_selecting_SKU_name() throws Throwable {
	    
		System.out.println("Attempt: verify the 'Sequence' field is auto populated on selecting SKU name");
		PageObjects.SelectByCSSSelectorWithoutClick(
				driver, LocatorsPath.ASSORTMENT_SEQUENCE_1, LocatorsPath.MAX_TIME);
		System.out.println("Success: verified the 'Sequence' field is auto populated on selecting SKU name");
	}
	

	@Then("^User enters the 'Target' which is a Editable Numeric field$")
	public void user_enters_the_Target_which_is_a_Editable_Numeric_field() throws Throwable {
	    
		System.out.println("Attempt: enter the 'Target' which is a Editable Numeric field");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ASSORTMENT_TARGET_1, LocatorsPath.MAX_TIME, 
				file3.getCellData("AssortmentPlan", "Target", 2));
		System.out.println("Success: entered the 'Target' which is a Editable Numeric field");
	}
	

	@Then("^User verifies the 'Drive Brand' checkbox is defaulted to N$")
	public void user_verifies_the_Drive_Brand_checkbox_is_defaulted_to_N() throws Throwable {
	    
		System.out.println("Attempt: verify the 'Drive Brand' checkbox is defaulted to N");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ASSORTMENT_DRIVE_BRAND_1, LocatorsPath.MAX_TIME);
		System.out.println("Success: verified the 'Drive Brand' checkbox is defaulted to N");
	}
	

	@Then("^User verifies the 'SC' field is auto populated on selecting SKU name$")
	public void user_verifies_the_SC_field_is_auto_populated_on_selecting_SKU_name() throws Throwable {
	    
		System.out.println("Attempt: verify the 'SC' field is auto populated on selecting SKU name");
		WebElement sc = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ASSORTMENT_SC_1))));
		Assert.assertTrue(sc.getAttribute
				 ("readonly").equals("true"),"readonly");
		System.out.println("Success: verified the 'SC' field is auto populated on selecting SKU name");
	}
	

	@Then("^User clicks on save button & verifies the Assortment details is saved with all the mandatory fields successfully\\.$")
	public void user_clicks_on_save_button_verifies_the_Assortment_details_is_saved_with_all_the_mandatory_fields_successfully() throws Throwable {
	    
		user_clicks_on_Save_button_to_save_the_Assortment_Plan_header();
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.xpath(LocatorsPath.ASSORTMENT_DETAIL_DISP)));
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.ASSORTMENT_DETAIL_DISP, LocatorsPath.MAX_TIME);
	}



/**----------------------RCS_SaaS_Validation_Depot_AssortmentPlan_WC--------------------------**/
	
	
	
	@Then("^User creates a Depot Assortment Plan DAP(\\d+) & verifies the assortment Plan is saved successfully$")
	public void user_creates_a_Depot1_Assortment_Plan_DAP_verifies_the_assortment_Plan_is_saved_successfully(int arg1) throws Throwable {
	    
		System.out.println("User creates a Depot Assortment Plan DAP(\\d+) & verifies the assortment Plan is saved successfully");
	}
	

	@Then("^User verifies the 'Depot Assortment Plan DAP(\\d+)' is set to 'TRUE' while creating the header & saves the record$")
	public void user_verifies_the_Depot_Assortment_Plan_DAP_is_set_to_TRUE_while_creating_the_header_saves_the_record(int arg1) throws Throwable {
	    
		System.out.println("User verifies the 'Depot Assortment Plan DAP(\\d+)' is set to 'TRUE' while creating the header & saves the record");
	}
	

	@Then("^User creates a Depot Assortment Plan DAP(\\d+) & verifies the assortment Plan is saved successfully\\.$")
	public void user_creates_a_Depot2_Assortment_Plan_DAP_verifies_the_assortment_Plan_is_saved_successfully(int arg1) throws Throwable {
	    
		System.out.println("Attempt: create a Depot Assortment Plan DAP(\\d+) & verify the assortment Plan is saved successfully");
		user_clicks_on_AssortmentPlan_and_navigates_to_the_Assortment_Plan_Screen();
		user_selects_the_Depot_Assortment_Plan_from_the_Assortment_Type_dropdown_verifies_the_Assortment_page_is_displayed();
		user_clicks_on_the_ADD_button_in_Assortment_Plan_List_section_verifies_the_Assortment_screen_is_displayed();
		
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ASSORTMENT_NAME_1, LocatorsPath.MAX_TIME, 
				CallObject.timestamp().concat("_AssortPlan"));
		file3.setCellData("AssortmentPlan", "Name", 3, CallObject.timestamp().concat("_AssortPlan"));
		
		user_enters_the_Code_which_is_the_Mandatory_field_in_the_Assortment_page();
		user_selects_the_Start_Date_which_is_the_Mandatory_field_in_the_Assortment_page();
		user_selects_the_End_Date_which_is_the_Mandatory_field_in_the_Assortment_page();
		user_enters_the_Description_in_the_Assortment_page();

		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ASSORTMENT_DEFAULT_1, LocatorsPath.MAX_TIME);
		user_clicks_on_Save_button_to_save_the_Assortment_Plan_header();
		System.out.println("Success: created a Depot Assortment Plan DAP(\\d+) & verified the assortment Plan is saved successfully");
	}
	

	@Then("^User verifies the system throws a prompt message as 'Default assortment exists in the system\\. Do you want to override default assortment\\?'$")
	public void user_verifies_the_system_throws_a_prompt_message_as_Default_assortment_exists_in_the_system_Do_you_want_to_override_default_assortment() throws Throwable {
	    
		System.out.println("Attempt: verify the system throws a prompt message as "
				+ "'Default assortment exists in the system\\. Do you want to override default assortment\\?'");
		WebElement frame = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.DEFAULT_ASSORTMENTPLAN_FRAME))));
		if(frame.isDisplayed()) {
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.DEFAULT_ASSORTPLAN_PROCEED, LocatorsPath.MAX_TIME);
		}else {
			Assert.fail("frame doesn't exists");
		}
		System.out.println("Success: verified the system throws a prompt message as "
				+ "'Default assortment exists in the system\\. Do you want to override default assortment\\?'");
	}
	

	@Then("^User verifies on accepting 'PROCEED', other Assortment plan is set to DEFAULT$")
	public void user_verifies_on_accepting_PROCEED_other_Assortment_plan_is_set_to_DEFAULT() throws Throwable {
	 
		System.out.println("User verifies on accepting 'PROCEED', other Assortment plan is set to DEFAULT");
	}
	

	@Then("^User verifies while creating Depot Assortment Plan, Parent assortment field is set conditionally mandatory$")
	public void user_verifies_while_creating_Depot_Assortment_Plan_Parent_assortment_field_is_set_conditionally_mandatory() throws Throwable {
	    
		System.out.println("User verifies while creating Depot Assortment Plan, Parent assortment field is set conditionally mandatory");
	}
	

	@Then("^User verifies the Parent Assortment can't be modified, once Depot Assortment plan is Saved\\.$")
	public void user_verifies_the_Parent_Assortment_can_t_be_modified_once_Depot_Assortment_plan_is_Saved() throws Throwable {
	    
		System.out.println("User verifies the Parent Assortment can't be modified, once Depot Assortment plan is Saved");
	}
	

	
	/**----------------------RCS_SaaS_Creation_Customer_Assortment_Header_WC--------------------------**/
	
	
	
	@Then("^User selects the 'Customer Assortment Plan' in 'Assortment Type'$")
	public void user_selects_the_Customer_Assortment_Plan_in_Assortment_Type() throws Throwable {
	    
		System.out.println("Attempt: select the Depot Assortment Plan from the Assortment Type dropdown");
		user_clicks_on_AssortmentPlan_and_navigates_to_the_Assortment_Plan_Screen();
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ASSORTMENT_TYPE, LocatorsPath.MAX_TIME, 
				file3.getCellData("AssortmentPlan", "Assortment Type", 3));
		System.out.println("Success: selected the Depot Assortment Plan from the Assortment Type dropdown");
	}
	

	@Then("^User creates Customer Assortment Plan header with all the following required details - Name, Code, Start Date, End Date, Description, Parent Assortment$")
	public void user_creates_Customer_Assortment_Plan_header_with_all_the_following_required_details_Name_Code_Start_Date_End_Date_Description_Parent_Assortment() throws Throwable {
	    
		System.out.println("Attempt: create Customer Assortment Plan header with all the following required details -"
				+ " Name, Code, Start Date, End Date, Description, Parent Assortment");
		user_clicks_on_the_ADD_button_in_Assortment_Plan_List_section_verifies_the_Assortment_screen_is_displayed();
		
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ASSORTMENT_NAME_1, LocatorsPath.MAX_TIME, 
				CallObject.timestamp().concat("_AssortPlan"));
		file3.setCellData("AssortmentPlan", "Name", 4, CallObject.timestamp().concat("_AssortPlan"));
		
		user_enters_the_Code_which_is_the_Mandatory_field_in_the_Assortment_page();
		user_selects_the_Start_Date_which_is_the_Mandatory_field_in_the_Assortment_page();
		user_selects_the_End_Date_which_is_the_Mandatory_field_in_the_Assortment_page();
		user_enters_the_Description_in_the_Assortment_page();
		
		CallObject.block(2000);
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ASSORTMENT_PARENT_1, LocatorsPath.MAX_TIME, 
				file3.getCellData("AssortmentPlan", "Name", 2));
		
		user_verifies_the_Status_defaults_to_Draft();
		System.out.println("Success: created Customer Assortment Plan header with all the following required details -"
				+ " Name, Code, Start Date, End Date, Description, Parent Assortment");
	}
	

	@Then("^User verifies the status by Default is displayed as 'Draft'$")
	public void user_verifies_the_status_by_Default_is_displayed_as_Draft() throws Throwable {
	    
		System.out.println("Attempt: verify the status by Default is displayed as 'Draft'");
		PageObjects.SelectByCSSSelectorWithoutClick(
				driver, LocatorsPath.ASSORTMENT_DEFAULT_2, LocatorsPath.MAX_TIME);
		System.out.println("Success: verified the status by Default is displayed as 'Draft'");
	}
	

	@Then("^User clicks on save button & verifies the Customer Assortment Plan Header is saved successfully\\.$")
	public void user_clicks_on_save_button_verifies_the_Customer_Assortment_Plan_Header_is_saved_successfully() throws Throwable {
	    
		user_clicks_on_Save_button_to_save_the_Assortment_Plan_header();
	}
	

	
	/**----------------------RCS_SaaS_Creation_Customer_Assortment_Details_WC--------------------------**/
	
	
	
	@Then("^User clicks on 'ADD' button in details section to Add the SKUs to the header$")
	public void user_clicks_on_ADD_button_in_details_section_to_Add_the_SKUs_to_the_header() throws Throwable {
	    
		System.out.println("Attempt: click on 'ADD' button in details section to Add the SKUs to the header");
		user_clicks_on_AssortmentPlan_and_navigates_to_the_Assortment_Plan_Screen();
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ASSORTMENT_NAME_SEARCH, LocatorsPath.MAX_TIME, 
				file3.getCellData("AssortmentPlan", "Name", 4));
		CallObject.block(2000);
		PageObjects.SelectByCSSSelectorWithoutClick(
				driver, LocatorsPath.ASSORTMENT_NAME_SELECTION, LocatorsPath.MAX_TIME);
		System.out.println("Success: clicked on 'ADD' button in details section to Add the SKUs to the header");
	}
	

	@Then("^User verifies the Adding SKU screen is displayed successfully with below fields$")
	public void user_verifies_the_Adding_SKU_screen_is_displayed_successfully_with_below_fields() throws Throwable {
	    
		WebElement skuNameRow = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ASSORTMENT_DETAIL_SKU_ROW))));
		if(skuNameRow.isDisplayed()) {
			PageObjects.SelectByCSSSelectorWithoutClick(
					driver, LocatorsPath.ASSORTMENT_DETAIL_SKU, LocatorsPath.MAX_TIME);
		}
	}
	

	@Then("^User selects the 'SKU name' from the dropdown - All the SKUs associated to the selected Parent Assortment plan gets displayed$")
	public void user_selects_the_SKU_name_from_the_dropdown_All_the_SKUs_associated_to_the_selected_Parent_Assortment_plan_gets_displayed() throws Throwable {
	   
		System.out.println("Attempt: select the 'SKU name' from the dropdown - "
				+ "All the SKUs associated to the selected Parent Assortment plan gets displayed");
		WebElement skuName = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ASSORTMENT_SKU_NAME_DISP))));
		Assert.assertEquals("SKU Name", skuName.getText());
		System.out.println("Success: selected the 'SKU name' from the dropdown - "
				+ "All the SKUs associated to the selected Parent Assortment plan gets displayed");
	}
	

	@Then("^User verifies the 'SKU code' is auto populated on selecting the 'SKU name' from the dropdown$")
	public void user_verifies_the_SKU_code_is_auto_populated_on_selecting_the_SKU_name_from_the_dropdown() throws Throwable {
	    
		System.out.println("Attempt: verify the 'SKU code' is auto populated on selecting the 'SKU name' from the dropdown");
		WebElement skuCode = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ASSORTMENT_SKU_CODE_DISP))));
		Assert.assertEquals("SKU Code", skuCode.getText());
		System.out.println("Success: verified the 'SKU code' is auto populated on selecting the 'SKU name' from the dropdown");
	}
	

	@Then("^User verifies the 'Sequence value' is auto populated from the Product Master$")
	public void user_verifies_the_Sequence_value_is_auto_populated_from_the_Product_Master() throws Throwable {
	   
		System.out.println("Attempt: verify the 'Sequence value' is auto populated from the Product Master");
		WebElement sequence = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ASSORTMENT_SEQUENCE_DISP))));
		Assert.assertEquals("Sequence", sequence.getText());
		System.out.println("Success: verified the 'Sequence value' is auto populated from the Product Master");
	}
	

	@Then("^User enters the 'Target' value in the SKUs screen$")
	public void user_enters_the_Target_value_in_the_SKUs_screen() throws Throwable {
	    
		System.out.println("Attempt: enter the 'Target' value in the SKUs screen");
		WebElement target = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ASSORTMENT_TARGET_DISP))));
		Assert.assertEquals("Target", target.getText());
		System.out.println("Success: entered the 'Target' value in the SKUs screen");
	}
	

	@Then("^User selects the 'Drive Brand' in the SKUs screen$")
	public void user_selects_the_Drive_Brand_in_the_SKUs_screen() throws Throwable {
	    
		System.out.println("Attempt: select the 'Drive Brand' in the SKUs screen");
		WebElement brand = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ASSORTMENT_DRIVE_BRAND_DISP))));
		Assert.assertEquals("Drive Brand", brand.getText());
		System.out.println("Success: selected the 'Drive Brand' in the SKUs screen");
	}

	
	@Then("^User clicks on 'save' button & verifies all the SKUs for that Customer Assortment plan is saved successfully\\.$")
	public void user_clicks_on_save_button_verifies_all_the_SKUs_for_that_Customer_Assortment_plan_is_saved_successfully() throws Throwable {
	   
		System.out.println("User clicks on 'save' button & verifies all the SKUs for that Customer Assortment plan is saved successfully");
	}
	

	
	/**----------------------RCS_SaaS_Customer_Assortment_Date_Validation_WC--------------------------**/
	
	
	
	
	@Then("^User creates a Customer Assortment Plan Header with End Date lesser than Start Date and saves it$")
	public void user_creates_a_Customer_Assortment_Plan_Header_with_End_Date_lesser_than_Start_Date_and_saves_it() throws Throwable {
	    
		System.out.println("Attempt: create a Customer Assortment Plan Header with End Date lesser than Start Date and saves it");
		user_selects_the_Customer_Assortment_Plan_in_Assortment_Type();
        user_clicks_on_the_ADD_button_in_Assortment_Plan_List_section_verifies_the_Assortment_screen_is_displayed();
		
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ASSORTMENT_NAME_1, LocatorsPath.MAX_TIME, 
				CallObject.timestamp().concat("_AssortPlan"));
		
		user_enters_the_Code_which_is_the_Mandatory_field_in_the_Assortment_page();
		
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ASSORTMENT_START_DATE_1, LocatorsPath.MAX_TIME, 
				CallObject.futureDate());
		
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ASSORTMENT_END_DATE_1, LocatorsPath.MAX_TIME, 
				CallObject.presentTimestamp());
		
		CallObject.block(2000);
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ASSORTMENT_PARENT_1, LocatorsPath.MAX_TIME, 
				file3.getCellData("AssortmentPlan", "Name", 2));
		
		user_clicks_on_Save_button_to_save_the_Assortment_Plan_header();
		System.out.println("Success: created a Customer Assortment Plan Header with End Date lesser than Start Date and saves it");
	}
	

	@Then("^User verifies the Application not accepting End Date lesser than Start Date & displays error message as 'Start Date Should not be Greater Than End Date'$")
	public void user_verifies_the_Application_not_accepting_End_Date_lesser_than_Start_Date_displays_error_message_as_Start_Date_Should_not_be_Greater_Than_End_Date() throws Throwable {
	   
		System.out.println("Attempt: verify the Application not accepting End Date "
				+ "lesser than Start Date & displays error message as 'Start Date Should not be Greater Than End Date'");
		WebElement msg = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ERROR_MESSAGE))));
		Assert.assertEquals("Start Date Should not be Greater Than End Date.", msg.getText());
		System.out.println("Success: verified the Application not accepting End Date "
				+ "lesser than Start Date & displays error message as 'Start Date Should not be Greater Than End Date'");
	}
	

	@Then("^User creates the Customer Assortment Plan Header with End date and Start Date as Past date and saves it$")
	public void user_creates_the_Customer_Assortment_Plan_Header_with_End_date_and_Start_Date_as_Past_date_and_saves_it() throws Throwable {
	    
		System.out.println("User creates the Customer Assortment Plan Header with End date and Start Date as Past date and saves it");
	}
	

	@Then("^User verifies the system not allowing user to select past dates\\.$")
	public void user_verifies_the_system_not_allowing_user_to_select_past_dates() throws Throwable {
	    
		user_verifies_the_system_not_allowing_the_user_to_select_past_dates();
	}


	
	/**----------------------RCS_SaaS_Verification_Association_NewParentAssortmentPlan_WC--------------------------**/
	
	
	

	@Then("^User verifies that once Customer SKUs Assortment plan is saved, changing Parent Assortment will delete Current Assortment details and copy details from the modified Parent Assortment plan$")
	public void user_verifies_that_once_Customer_SKUs_Assortment_plan_is_saved_changing_Parent_Assortment_will_delete_Current_Assortment_details_and_copy_details_from_the_modified_Parent_Assortment_plan() throws Throwable {
	    
		System.out.println("User verifies that once Customer SKUs Assortment plan is saved, "
				+ "changing Parent Assortment will delete Current Assortment details and copy details from the modified Parent Assortment plan");
	}
	

	@Then("^User verifies Customer Assortment Plan and Depot Assortment Plan is associated successfully$")
	public void user_verifies_Customer_Assortment_Plan_and_Depot_Assortment_Plan_is_associated_successfully() throws Throwable {
	   
		System.out.println("User verifies Customer Assortment Plan and Depot Assortment Plan is associated successfully");
	}

	
	@Then("^User verifies when Parent Assortment is modified from PDAP to XDAP, Current Assortment details is deleted and copies details from the modified Parent Assortment plan XDAP\\.$")
	public void user_verifies_when_Parent_Assortment_is_modified_from_PDAP_to_XDAP_Current_Assortment_details_is_deleted_and_copies_details_from_the_modified_Parent_Assortment_plan_XDAP() throws Throwable {
	    
		System.out.println("User verifies when Parent Assortment is modified from PDAP to XDAP, "
				+ "Current Assortment details is deleted and copies details from the modified Parent Assortment plan XDAP");
	}


	
	
	/**----------------------RCS_SaaS_CustomerGroup_Navigation_WC--------------------------**/
	
	
	
	
	@Then("^User clicks on the 'Customer Group' tab & navigates to the 'Customer Group' screen successfully$")
	public void user_clicks_on_the_Customer_Group_tab_navigates_to_the_Customer_Group_screen_successfully() throws Throwable {
	    
		System.out.println("Attempt: click on the 'Customer Group' tab & "
				+ "navigate to the 'Customer Group' screen successfully");
		PageObjects.SelectByXpath(
				driver, LocatorsPath.CUSTOMER_GROUP, LocatorsPath.MAX_TIME);
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.GROUP_SETTINGS_DISP, LocatorsPath.MAX_TIME);
		System.out.println("Success: clicked on the 'Customer Group' tab & "
				+ "navigated to the 'Customer Group' screen successfully");
	}
	

	@Then("^User verifies the following tabs are available in Customer Group - Group Settings, Retail Audit Settings$")
	public void user_verifies_the_following_tabs_are_available_in_Customer_Group_Group_Settings_Retail_Audit_Settings() throws Throwable {
	   
		System.out.println("Attempt: verify the following tabs are available "
				+ "in Customer Group - Group Settings, Retail Audit Settings");
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.GROUP_SETTINGS, LocatorsPath.MAX_TIME);
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.RETAIL_AUDIT_SETTINGS, LocatorsPath.MAX_TIME);
		System.out.println("Success: verified the following tabs are available "
				+ "in Customer Group - Group Settings, Retail Audit Settings");
	}
	

	@Then("^User navigates to the 'Group Settings' tab & verifies the following sections are present - Group Settings, Customer Group, Assortment Plan$")
	public void user_navigates_to_the_Group_Settings_tab_verifies_the_following_sections_are_present_Group_Settings_Customer_Group_Assortment_Plan() throws Throwable {
	    
		System.out.println("Attempt: navigate to the 'Group Settings' tab & "
				+ "verify the following sections are present - Group Settings, Customer Group, Assortment Plan");
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.GROUP_SETTINGS_DISP, LocatorsPath.MAX_TIME);
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.xpath(LocatorsPath.CUSTOMER_GROUP_DISP)));
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.CUSTOMER_GROUP_DISP, LocatorsPath.MAX_TIME);
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.xpath(LocatorsPath.ASSORTMENT_PLAN_DISP)));
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.ASSORTMENT_PLAN_DISP, LocatorsPath.MAX_TIME);
		System.out.println("Success: navigated to the 'Group Settings' tab & "
				+ "verified the following sections are present - Group Settings, Customer Group, Assortment Plan");
	}
	

	@Then("^User verifies the following dropdown options are present under 'Group Settings' - Assortment Group, Discount Group$")
	public void user_verifies_the_following_dropdown_options_are_present_under_Group_Settings_Assortment_Group_Discount_Group() throws Throwable {
	 
		System.out.println("Attempt: verify the following dropdown options are "
				+ "present under 'Group Settings' - Assortment Group, Discount Group");
		WebElement element = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.GROUP_SETTINGS_DROPDOWN))));
		Select select = new Select(element);
		List<WebElement> allOptions = select.getOptions();
		
		 boolean found = false;
		 for(WebElement ele: allOptions) {
			 if(LocatorsPath.GroupSettings1.equals(ele.getText())) {
				 found = true;
				 System.out.println(LocatorsPath.GroupSettings1 +" - value exists");
				 Assert.assertTrue(found);
				 break;
			 }
			 
			 if(LocatorsPath.GroupSettings2.equals(ele.getText())) {
				 found = true;
				 System.out.println(LocatorsPath.GroupSettings2 +" - value exists");
				 Assert.assertTrue(found);
				 break;
			 }
			 
		 }if(!found) {
			 System.out.println(LocatorsPath.GroupSettings1 +"or" + LocatorsPath.GroupSettings2 +" - value doesn't exists");
			 Assert.fail(LocatorsPath.GroupSettings1 +"or" + LocatorsPath.GroupSettings2 +" - value doesn't exists");
	   }
		System.out.println("Success: verified the following dropdown options are "
				+ "present under 'Group Settings' - Assortment Group, Discount Group");
	}
	

	
	/**----------------------RCS_SaaS_Creation_CustomerGroup_Assortment_WC--------------------------**/
	
	
	
	@Then("^User clicks on the Add button to create Customer Group$")
	public void user_clicks_on_the_Add_button_to_create_Customer_Group() throws Throwable {
	    
		System.out.println("Attempt: click on the Add button to create Customer Group");
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.AG_GROUP_SETTINGS_ADD_BUTTON)));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.AG_GROUP_SETTINGS_ADD_BUTTON, LocatorsPath.MAX_TIME);
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.GROUP_SETTINGS_ADD_DISP, LocatorsPath.MAX_TIME);
		System.out.println("Success: clicked on the Add button to create Customer Group");
	}
	

	@Then("^User enters the following mandatory fields - Name, Group Code & Group Type$")
	public void user_enters_the_following_mandatory_fields_Name_Group_Code_Group_Type() throws Throwable {
	    
		System.out.println("Attempt: enter the following mandatory fields - Name, Group Code & Group Type");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.AG_GROUP_NAME, LocatorsPath.MAX_TIME, 
				CallObject.timestamp().concat("_GN"));
		file3.setCellData("AssortmentPlan", "Group Name", 2, 
				CallObject.timestamp().concat("_GN"));
		
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.GROUP_CODE, LocatorsPath.MAX_TIME, 
				file3.getCellData("AssortmentPlan", "Group Code", 2));
		System.out.println("Success: entered the following mandatory fields - Name, Group Code & Group Type");
	}
	

	@Then("^User verifies the 'Group Type' by default is displayed as 'Assortment Group'$")
	public void user_verifies_the_Group_Type_by_default_is_displayed_as_Assortment_Group() throws Throwable {
	    
		System.out.println("Attempt: verify the 'Group Type' by default is displayed as 'Assortment Group'");
		WebElement groupType = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.GROUP_TYPE))));
		Assert.assertEquals("Assortment Group", groupType.getText());
		System.out.println("Success: verified the 'Group Type' by default is displayed as 'Assortment Group'");
	}
	

	@Then("^User clicks on save button & verifies the record is saved successfully\\.$")
	public void user_clicks_on_save_button_verifies_the_record_is_saved_successfully() throws Throwable {
	   
		System.out.println("Attempt: click on save button & verify the record is saved successfully");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ASSORTMENT_SAVE, LocatorsPath.MAX_TIME);
		System.out.println("Success: clicked on save button & verified the record is saved successfully");
	}
	

	
	/**----------------------RCS_SaaS_Creation_Add_Customers_WC--------------------------**/
	
	
	
	@Then("^User clicks on the Add button in the (\\d+)nd frame to add customer/customers & verifies the Advanced search screen is displayed$")
	public void user_clicks_on_the_Add_button_in_the_nd_frame_to_add_customer_customers_verifies_the_Advanced_search_screen_is_displayed(int arg1) throws Throwable {
	    
		System.out.println("Attempt: click on the Add button in the (\\d+)nd frame to add "
				+ "customer/customers & verify the Advanced search screen is displayed");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.GROUP_NAME_SEARCH, LocatorsPath.MAX_TIME, 
				file3.getCellData("AssortmentPlan", "Group Name", 2));
		CallObject.block(2000);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.GROUP_NAME_SEARCH_REFRESH, LocatorsPath.MAX_TIME);
		CallObject.block(2000);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.GROUP_SETTINGS_ADD_BUTTON_1, LocatorsPath.MAX_TIME);
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.ADVANCED_SEARCH_DISP, LocatorsPath.MAX_TIME);
		System.out.println("Success: clicked on the Add button in the (\\d+)nd frame to add "
				+ "customer/customers & verified the Advanced search screen is displayed");
	}
	

	@Then("^User selects the various fields and clicks on Search button$")
	public void user_selects_the_various_fields_and_clicks_on_Search_button() throws Throwable {
	    
		System.out.println("Attempt: select the various fields and click on Search button");
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.ADVANCED_SEARCH_TERRITORY)));
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ADVANCED_SEARCH_TERRITORY, LocatorsPath.MAX_TIME, 
				file.getCellData("Territory", "TerritoryCode", 2));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.AG_SEARCH_BUTTON, LocatorsPath.MAX_TIME);
		System.out.println("Success: selected the various fields and clicked on Search button");
	}
	

	@Then("^User verifies the list of customers is displayed who belongs to the search criteria & User selects the required data$")
	public void user_verifies_the_list_of_customers_is_displayed_who_belongs_to_the_search_criteria_User_selects_the_required_data() throws Throwable {
	   
		System.out.println("Attempt: verify the list of customers is displayed who "
				+ "belongs to the search criteria & User selects the required data");
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.AG_SEARCH_RESULTS_DISPLAY, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.SEARCH_CRITERIA_DISPLAY, LocatorsPath.MAX_TIME);
		
		WebElement CustName = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SEARCH_CUSTOMER_NAME))));
		file3.setCellData("AssortmentPlan", "Customer Name1", 2, CustName.getText());
		
		WebElement CustNum = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SEARCH_CUSTOMER_NUM))));
		file3.setCellData("AssortmentPlan", "Customer Num1", 2, CustNum.getText());
		
		System.out.println("Success: verified the list of customers is displayed who "
				+ "belongs to the search criteria & User selects the required data");
	}
	

	@Then("^User selects the customers and clicks on ADD button & user verifies the selected customers is displayed in the detail section of Customer Group screen\\.$")
	public void user_selects_the_customers_and_clicks_on_ADD_button_user_verifies_the_selected_customers_is_display_in_the_detail_section_of_Customer_Group_screen() throws Throwable {
	   
		System.out.println("Attempt: select the customers and click on ADD button & verify the "
				+ "selected customers is displayed in the detail section of Customer Group screen");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.AG_GROUP_SETTINGS_ADD_BUTTON, LocatorsPath.MAX_TIME);
		
		WebElement msg = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SUCCESS_MESSAGE))));
		/*Assert.assertEquals("Customer Associated Successfully To The Customer Group !", 
				msg.getText());*/
		System.out.println("Success: selected the customers and clicked on ADD button & verified the "
				+ "selected customers is displayed in the detail section of Customer Group screen");
	}
	

	
	/**----------------------RCS_SaaS_AssortmentPlan_Exports_WC--------------------------**/
	
	
	
	@Then("^User clicks on the 'EXPORT IN CSV' button without selecting any Customers$")
	public void user_clicks_on_the_EXPORT_IN_CSV_button_without_selecting_any_Customers() throws Throwable {
	   
		System.out.println("Attempt: click on the 'EXPORT IN CSV' button without selecting any Customers");
		WebElement row = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SEARCH_RESULTS_ROW))));
		if(row.isDisplayed()) {
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.AG_EXPORT_IN_CSV, LocatorsPath.MAX_TIME);
		}else {
			Assert.fail("No records found!!!!!!!!!!");
		}
		System.out.println("Success: clicked on the 'EXPORT IN CSV' button without selecting any Customers");
	}
	

	@Then("^User verifies all the customers associated to the Customer Group were exported in CSV format with following fields - Customer ID, Customer No, Account Name$")
	public void user_verifies_all_the_customers_associated_to_the_Customer_Group_were_exported_in_CSV_format_with_following_fields_Customer_ID_Customer_No_Account_Name() throws Throwable {
	    
		System.out.println("Attempt: verify all the customers associated to the Customer Group were "
				+ "exported in CSV format with following fields - Customer ID, Customer No, Account Name");
		        CallObject.block(5000);
				CsvToExcelConverter.csvConverter
				(LocatorsPath.CsvCustomerDetails, LocatorsPath.xlsxCustomerDetails, LocatorsPath.Sheet);

				ExcelApiFile customers = new ExcelApiFile(LocatorsPath.xlsxCustomerDetails);
				Assert.assertEquals(file3.getCellData("AssortmentPlan", "Customer Name1", 2), 
						customers.getCellData(LocatorsPath.Sheet, "Account Name", 2));
				Assert.assertEquals(file3.getCellData("AssortmentPlan", "Customer Num1", 2), 
						customers.getCellData(LocatorsPath.Sheet, "Customer No", 2));
		System.out.println("Success: verified all the customers associated to the Customer Group were "
						+ "exported in CSV format with following fields - Customer ID, Customer No, Account Name");
	}
	

	@Then("^User clicks on the 'EXPORT' button without selecting any Customers$")
	public void user_clicks_on_the_EXPORT_button_without_selecting_any_Customers() throws Throwable {
	    
		System.out.println("Attempt: click on the 'EXPORT' button without selecting any Customers");
		WebElement row = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SEARCH_RESULTS_ROW))));
		if(row.isDisplayed()) {
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.SEARCH_RESULTS_EXPORT, LocatorsPath.MAX_TIME);
		}else {
			Assert.fail("No records found!!!!!!!!!!");
		}
		System.out.println("Success: clicked on the 'EXPORT' button without selecting any Customers");
	}
	

	@Then("^User verifies the system displaying the error message as - Select at least one check box to export'$")
	public void user_verifies_the_system_displaying_the_error_message_as_Select_at_least_one_check_box_to_export() throws Throwable {
	    
		System.out.println("Attempt: verify the system displaying the error "
				+ "message as - Select at least one check box to export'");
		WebElement msg = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ERROR_MESSAGE))));
		Assert.assertEquals("Select atleast one check box to Export", msg.getText());
		System.out.println("Success: verified the system displaying the error "
				+ "message as - Select at least one check box to export'");
	}
	

	@Then("^User clicks on the 'EXPORT' button by selecting few/all Customers & also by selecting the Export format as - CSV or TXT$")
	public void user_clicks_on_the_EXPORT_button_by_selecting_few_all_Customers_also_by_selecting_the_Export_format_as_CSV_or_TXT() throws Throwable {
	    
		System.out.println("Attempt: click on the 'EXPORT' button by selecting few/all "
				+ "Customers & also by selecting the Export format as - CSV or TXT");
		WebElement row = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SEARCH_RESULTS_ROW))));
		if(row.isDisplayed()) {
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.SEARCH_RESULTS_SELECTION, LocatorsPath.MAX_TIME);
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.SEARCH_RESULTS_EXPORT, LocatorsPath.MAX_TIME);
		}else {
			Assert.fail("No records found!!!!!!!!!!");
		}
		System.out.println("Success: clicked on the 'EXPORT' button by selecting few/all "
				+ "Customers & also by selecting the Export format as - CSV or TXT");
	}
	

	@Then("^User verifies the zip file is created which contains \\.csv file with following fields - Customer ID, Customer No, Account Name$")
	public void user_verifies_the_zip_file_is_created_which_contains_csv_file_with_following_fields_Customer_ID_Customer_No_Account_Name() throws Throwable {
	    
		System.out.println("Attempt: verify the zip file is created which contains "
				+ "\\.csv file with following fields - Customer ID, Customer No, Account Name");
		CallObject.block(5000);
		File newfile = renameFile.getTheNewestFile(LocatorsPath.DriveLocation, LocatorsPath.ZipFormat);
		newfile.renameTo(new File(LocatorsPath.CustomerLoc));
		String filename= newfile.getName();
		System.out.println("latest file is = "+filename);
		  
		RenameFile renamefile = new RenameFile();
		File updated = renamefile.getTheNewestFile(LocatorsPath.DriveLocation, LocatorsPath.ZipFormat);
		System.out.println("Changed file name is = "+updated);
		
		CallObject.block(3000);
		extractZipFile.unzip(LocatorsPath.CustomerLoc, LocatorsPath.DriveLocation);
		
		
		//Rename First File Location
		File newcsvfile = renameFile.getTheNewestFile(LocatorsPath.DriveLocation, LocatorsPath.CSVFormat);
		newcsvfile.renameTo(new File(LocatorsPath.CsvCustomerLocLoc));
		String csvfilename= newcsvfile.getName();
		System.out.println("latest file is = "+csvfilename);
		  
		RenameFile renamecsvfile = new RenameFile();
		File csvUpdated = renamecsvfile.getTheNewestFile(LocatorsPath.DriveLocation, LocatorsPath.CSVFormat);
		System.out.println("Changed file name is = "+csvUpdated);
		
		System.out.println("Success: verified the zip file is created which contains "
				+ "\\.csv file with following fields - Customer ID, Customer No, Account Name");
	}
	

	
	/**----------------------RCS_SaaS_AssortmentPlan_Imports_WC--------------------------**/
	
	
	
	@Then("^User clicks on the Import button & selects the option 'Add customers to group' and selects the file$")
	public void user_clicks_on_the_Import_button_selects_the_option_Add_customers_to_group_and_selects_the_file() throws Throwable {
	 
		System.out.println("Attempt: click on the Import button & select the option "
				+ "'Add customers to group' and select the file");
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.SEARCH_RESULTS_ROW)));
		WebElement row = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SEARCH_RESULTS_ROW))));
		if(row.isDisplayed()) {
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.SEARCH_RESULTS_IMPORT, LocatorsPath.MAX_TIME);
			PageObjects.SelectByXpathWithoutClick(
					driver, LocatorsPath.ASSOCIATE_CUSTOMERS_DISP, LocatorsPath.MAX_TIME);
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.ADD_CUST_TO_GROUP_RADIO, LocatorsPath.MAX_TIME);
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.ASSOCIATE_CUSTOMERS_BUTTON, LocatorsPath.MAX_TIME);
			robotPage.importFile(LocatorsPath.CustomerImport);
		}else {
			Assert.fail("No records found!!!!!!!!!!");
		}
		System.out.println("Success: clicked on the Import button & selected the option "
				+ "'Add customers to group' and selected the file");
	}
	

	@Then("^User verifies the Import is successful & All the customers in the file were added to the detail section of Customer Group screen$")
	public void user_verifies_the_Import1_is_successful_All_the_customers_in_the_file_were_added_to_the_detail_section_of_Customer_Group_screen() throws Throwable {
	    
		System.out.println("Attempt: verify the Import is successful & All the customers "
				+ "in the file were added to the detail section of Customer Group screen");
		WebElement msg = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.WARN_MESSAGE))));
		Assert.assertEquals("Total Records:-1 Success Records:-1 Error Records:-0", 
				msg.getText());
		System.out.println("Success: verified the Import is successful & All the customers "
				+ "in the file were added to the detail section of Customer Group screen");
	}
	

	@Then("^User clicks on the Import button & selects the option 'Associate Customers' and selects the file$")
	public void user_clicks_on_the_Import_button_selects_the_option_Associate_Customers_and_selects_the_file() throws Throwable {
	    
		System.out.println("Attempt: click on the Import button & select the option "
				+ "'Associate Customers' and select the file");
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.SEARCH_RESULTS_ROW)));
		WebElement row = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SEARCH_RESULTS_ROW))));
		if(row.isDisplayed()) {
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.SEARCH_RESULTS_IMPORT, LocatorsPath.MAX_TIME);
			PageObjects.SelectByXpathWithoutClick(
					driver, LocatorsPath.ASSOCIATE_CUSTOMERS_DISP, LocatorsPath.MAX_TIME);
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.ASSOCIATE_CUST_RADIO, LocatorsPath.MAX_TIME);
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.ASSOCIATE_CUSTOMERS_BUTTON, LocatorsPath.MAX_TIME);
			robotPage.importFile(LocatorsPath.CustomerImport);
		}else {
			Assert.fail("No records found!!!!!!!!!!");
		}
		System.out.println("Success: clicked on the Import button & selected the option "
				+ "'Associate Customers' and selected the file");
	}
	

	@Then("^User verifies the Import is successful & All the customers in the file were added to the detail section of Customer Group screen\\.$")
	public void user_verifies_the_Import2_is_successful_All_the_customers_in_the_file_were_added_to_the_detail_section_of_Customer_Group_screen() throws Throwable {
	    
		user_verifies_the_Import1_is_successful_All_the_customers_in_the_file_were_added_to_the_detail_section_of_Customer_Group_screen();
	}


	
	
	/**----------------------RCS_SaaS_CreateCG_AssociationAssortmentPlan_WC--------------------------**/
	
	
	
	
	@Then("^User creates a Customer Group & verifies the Customer Group is created successfully$")
	public void user_creates_a_Customer_Group_verifies_the_Customer_Group_is_created_successfully() throws Throwable {
	   
		System.out.println("User creates a Customer Group & verifies the Customer Group is created successfully");
	}
	

	@Then("^User verifies the customers are associated to the Assortment plan$")
	public void user_verifies_the_customers_are_associated_to_the_Assortment_plan() throws Throwable {
	    
		System.out.println("User verifies the customers are associated to the Assortment plan");
	}
	

	@Then("^User selects the Customer group created and selects the Assortment Group & then clicks on the Associate Assortment Plan button$")
	public void user_selects_the_Customer_group_created_and_selects_the_Assortment_Group_then_clicks_on_the_Associate_Assortment_Plan_button() throws Throwable {
	    
		System.out.println("Attempt: select the Customer group created and select the "
				+ "Assortment Group & then click on the Associate Assortment Plan button");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.GROUP_NAME_SEARCH, LocatorsPath.MAX_TIME, 
				file3.getCellData("AssortmentPlan", "Group Name", 2));
		CallObject.block(2000);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.GROUP_NAME_SEARCH_REFRESH, LocatorsPath.MAX_TIME);
		CallObject.block(2000);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ASSOCIATE_ASSORTMENT_PLAN, LocatorsPath.MAX_TIME);
		System.out.println("Success: selected the Customer group created and select the "
				+ "Assortment Group & then clicked on the Associate Assortment Plan button");
	}
	

	@Then("^User verifies the Associate Assortment Plan page is displayed which contains all the Active Customer SKU Assortment Plan$")
	public void user_verifies_the_Associate_Assortment_Plan_page_is_displayed_which_contains_all_the_Active_Customer_SKU_Assortment_Plan() throws Throwable {
	    
		System.out.println("Attempt: verify the Associate Assortment Plan page is "
				+ "displayed which contains all the Active Customer SKU Assortment Plan");
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.ASSOC_ASSORTMENT_PLAN_DISP, LocatorsPath.MAX_TIME);
		System.out.println("Success: verified the Associate Assortment Plan page is "
				+ "displayed which contains all the Active Customer SKU Assortment Plan");
	}
	

	@Then("^User selects the Assortment Plan & clicks on Save & verifies the selected Assortment Plan is associated to the Customer Group$")
	public void user_selects_the_Assortment_Plan_clicks_on_Save_verifies_the_selected_Assortment_Plan_is_associated_to_the_Customer_Group() throws Throwable {
	    
		System.out.println("Attempt: select the Assortment Plan & click on Save & "
				+ "verify the selected Assortment Plan is associated to the Customer Group");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ASSOC_ASSORTMENT_PLAN_SELECT, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ASSOC_ASSORTMENT_PLAN_SAVE, LocatorsPath.MAX_TIME);
		System.out.println("Success: selected the Assortment Plan & clicked on Save & "
				+ "verified the selected Assortment Plan is associated to the Customer Group");
	}
	

	@Then("^User clicks on the Assortment Plan name & verifies in the (\\d+)rd frame, Assortment Plan details is visible$")
	public void user_clicks_on_the_Assortment_Plan_name_verifies_in_the_rd_frame_Assortment_Plan_details_is_visible(int arg1) throws Throwable {
	    
		System.out.println("Attempt: click on the Assortment Plan name & "
				+ "verify in the (\\d+)rd frame, Assortment Plan details is visible");
		/*WebElement msg = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SUCCESS_MESSAGE))));
		Assert.assertEquals("Assortment Plan Updated Successfully !", msg.getText());*/
		
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.GROUP_NAME_SEARCH, LocatorsPath.MAX_TIME, 
				file3.getCellData("AssortmentPlan", "Group Name", 2));
		CallObject.block(2000);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.GROUP_NAME_SEARCH_REFRESH, LocatorsPath.MAX_TIME);
		CallObject.block(2000);
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.ASSORTMENT_PLAN_ROW)));
		WebElement row = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ASSORTMENT_PLAN_ROW))));
		if(row.isDisplayed()) {
			System.out.println("Assortment Plan details is visible");
		}else {
			Assert.fail("Assortment Plan details not visible");
		}
		System.out.println("Success: clicked on the Assortment Plan name & "
				+ "verified in the (\\d+)rd frame, Assortment Plan details is visible");
	}
	

	@Then("^User creates one more Customer Group & associates the same set of customers which are already associated to a different Customer Group$")
	public void user_creates_one_more_Customer_Group_associates_the_same_set_of_customers_which_are_already_associated_to_a_different_Customer_Group() throws Throwable {
	    
		System.out.println("Attempt: create one more Customer Group & associate the "
				+ "same set of customers which are already associated to a different Customer Group");
		user_clicks_on_AssortmentPlan_and_navigates_to_the_Assortment_Plan_Screen();
		user_selects_the_Depot_Assortment_Plan_from_the_Assortment_Type_dropdown_verifies_the_Assortment_page_is_displayed();
		user_clicks_on_the_ADD_button_in_Assortment_Plan_List_section_verifies_the_Assortment_screen_is_displayed();
		
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ASSORTMENT_NAME_1, LocatorsPath.MAX_TIME, 
				CallObject.timestamp().concat("_AssortPlan"));
		file3.setCellData("AssortmentPlan", "Name", 3, 
				CallObject.timestamp().concat("_AssortPlan"));
		
		user_enters_the_Code_which_is_the_Mandatory_field_in_the_Assortment_page();
		user_selects_the_Start_Date_which_is_the_Mandatory_field_in_the_Assortment_page();
		user_selects_the_End_Date_which_is_the_Mandatory_field_in_the_Assortment_page();
		user_enters_the_Description_in_the_Assortment_page();
		user_verifies_the_Depot_Assortment_Checkbox_is_Defaulted_to_True();
		user_verifies_the_Status_defaults_to_Draft();
		user_verifies_the_Default_Checkbox_is_Defaulted_to_False();
		user_clicks_on_Save_button_to_save_the_Assortment_Plan_header();
		
		PageObjects.SelectByXpath(
				driver, LocatorsPath.CUSTOMER_GROUP, LocatorsPath.MAX_TIME);
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.GROUP_SETTINGS, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.GROUP_NAME_SEARCH, LocatorsPath.MAX_TIME, 
				file3.getCellData("AssortmentPlan", "Group Name", 3));
		CallObject.block(2000);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.GROUP_NAME_SEARCH_REFRESH, LocatorsPath.MAX_TIME);
		CallObject.block(2000);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ASSOCIATE_ASSORTMENT_PLAN, LocatorsPath.MAX_TIME);
		
		user_verifies_the_Associate_Assortment_Plan_page_is_displayed_which_contains_all_the_Active_Customer_SKU_Assortment_Plan();
		user_selects_the_Assortment_Plan_clicks_on_Save_verifies_the_selected_Assortment_Plan_is_associated_to_the_Customer_Group();
		
		WebElement msg = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SUCCESS_MESSAGE))));
		Assert.assertEquals("Assortment Plan Saved Successfully !", msg.getText());
		
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.GROUP_NAME_SEARCH, LocatorsPath.MAX_TIME, 
				file3.getCellData("AssortmentPlan", "Group Name", 3));
		CallObject.block(2000);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.GROUP_NAME_SEARCH_REFRESH, LocatorsPath.MAX_TIME);
		CallObject.block(2000);
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.ASSORTMENT_PLAN_ROW)));
		WebElement row = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ASSORTMENT_PLAN_ROW))));
		if(row.isDisplayed()) {
			System.out.println("Assortment Plan details is visible");
		}else {
			Assert.fail("Assortment Plan details not visible");
		}
		System.out.println("Success: created one more Customer Group & associated the "
				+ "same set of customers which are already associated to a different Customer Group");
	}
	

	@Then("^User verifies the customer is added to the newly created Customer Group & verifies the already associated Customer Group is deleted$")
	public void user_verifies_the_customer_is_added_to_the_newly_created_Customer_Group_verifies_the_already_associated_Customer_Group_is_deleted() throws Throwable {
	    
		System.out.println("Attempt: verify the customer is added to the newly created "
				+ "Customer Group & verify the already associated Customer Group is deleted");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.GROUP_NAME_SEARCH, LocatorsPath.MAX_TIME, 
				file3.getCellData("AssortmentPlan", "Group Name", 2));
		CallObject.block(2000);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.GROUP_NAME_SEARCH_REFRESH, LocatorsPath.MAX_TIME);
		CallObject.block(2000);
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.xpath(LocatorsPath.ASSORTMENT_PLAN_DISP)));
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.ASSORTMENT_PLAN_DISP, LocatorsPath.MAX_TIME);
		
		WebElement row = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ASSORTMENT_PLAN_ROW_1))));
		Assert.assertEquals("No records found.", row.getText());
		System.out.println("Success: verified the customer is added to the newly created "
				+ "Customer Group & verified the already associated Customer Group is deleted");
	}
	

	@Then("^User selects the different Assortment Plan which is having the same date range like the already associated Assortment Plan$")
	public void user_selects_the_different_Assortment_Plan_which_is_having_the_same_date_range_like_the_already_associated_Assortment_Plan() throws Throwable {
	    
		System.out.println("Attempt: select the different Assortment Plan which is "
				+ "having the same date range like the already associated Assortment Plan");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.GROUP_NAME_SEARCH, LocatorsPath.MAX_TIME, 
				file3.getCellData("AssortmentPlan", "Group Name", 3));
		CallObject.block(2000);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.GROUP_NAME_SEARCH_REFRESH, LocatorsPath.MAX_TIME);
		CallObject.block(2000);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ASSOCIATE_ASSORTMENT_PLAN, LocatorsPath.MAX_TIME);
		
		user_verifies_the_Associate_Assortment_Plan_page_is_displayed_which_contains_all_the_Active_Customer_SKU_Assortment_Plan();
		user_selects_the_Assortment_Plan_clicks_on_Save_verifies_the_selected_Assortment_Plan_is_associated_to_the_Customer_Group();
		
		System.out.println("Success: selected the different Assortment Plan which is "
				+ "having the same date range like the already associated Assortment Plan");
	}
	

	@Then("^User verifies on selecting the Assortment Plan, Error message is displayed as 'Date range is already found'$")
	public void user_verifies_on_selecting_the_Assortment_Plan_Error_message_is_displayed_as_Date_range_is_already_found() throws Throwable {
	    
		System.out.println("Attempt: verify on selecting the Assortment Plan, "
				+ "Error message is displayed as 'Date range is already found'");
		WebElement row = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ERROR_MESSAGE))));
		Assert.assertEquals("Date Range is Already Found !", row.getText());
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.ASSOCIATE_ASSORT_PLAN_CANCEL)));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ASSOCIATE_ASSORT_PLAN_CANCEL, LocatorsPath.MAX_TIME);
		CallObject.switchToAlert(driver);
		System.out.println("Success: verified on selecting the Assortment Plan, "
				+ "Error message is displayed as 'Date range is already found'");
	}
	

	@Then("^User selects the customer group that has to be dissociated from Assortment Plan$")
	public void user_selects_the_customer_group_that_has_to_be_dissociated_from_Assortment_Plan() throws Throwable {
	    
		System.out.println("Attempt: select the customer group that has to be dissociated from Assortment Plan");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.GROUP_NAME_SEARCH, LocatorsPath.MAX_TIME, 
				file3.getCellData("AssortmentPlan", "Group Name", 2));
		CallObject.block(2000);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.GROUP_NAME_SEARCH_REFRESH, LocatorsPath.MAX_TIME);
		CallObject.block(2000);
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.CUSTOMER_GROUP_ROW)));
		WebElement row = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.CUSTOMER_GROUP_ROW))));
		if(row.isDisplayed()) {
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.CUSTOMER_GROUP_CHECKBOX, LocatorsPath.MAX_TIME);
		}else {
			Assert.fail("customer group is not displayed");
		}
		System.out.println("Success: selected the customer group that has to be dissociated from Assortment Plan");
	}
	

	@Then("^User goes to the assortment plan grid in customer group screen & clicks on the cross button to delete the assortment plan$")
	public void user_goes_to_the_assortment_plan_grid_in_customer_group_screen_clicks_on_the_cross_button_to_delete_the_assortment_plan() throws Throwable {
	    
		System.out.println("Attempt: click on the cross button to delete the assortment plan");
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.xpath(LocatorsPath.GROUP_SETTINGS_DISP)));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ASSORTMENT_GROUP_DELETE, LocatorsPath.MAX_TIME);
		CallObject.switchToAlert(driver);
		System.out.println("Success: clicked on the cross button to delete the assortment plan");
	}
	

	@Then("^User verifies the Associated Assortment plan to customer group is removed successfully$")
	public void user_verifies_the_Associated_Assortment_plan_to_customer_group_is_removed_successfully() throws Throwable {
	   
		System.out.println("Attempt: verify the Associated Assortment plan to customer group is removed successfully");
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.GROUP_NAME_SEARCH)))).clear();
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.GROUP_NAME_SEARCH, LocatorsPath.MAX_TIME, 
				file3.getCellData("AssortmentPlan", "Group Name", 2));
		CallObject.block(2000);
		WebElement row = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.GROUP_SETTINGS_ROW))));
		Assert.assertEquals("No records found.", row.getText());
		System.out.println("Success: verified the Associated Assortment plan to customer group is removed successfully");
	}
	

	@Then("^User navigates to the Search screen & searches for the customer present in the Customer Group that got de-associated$")
	public void user_navigates_to_the_Search_screen_searches_for_the_customer_present_in_the_Customer_Group_that_got_de_associated() throws Throwable {
	    
		System.out.println("User navigates to the Search screen & searches for the customer present in the Customer Group that got de-associated");
	}
	

	@Then("^User verifies the Assortment plan field should have the 'Default Customer SKU Assortment Plan'\\.$")
	public void user_verifies_the_Assortment_plan_field_should_have_the_Default_Customer_SKU_Assortment_Plan() throws Throwable {
	 
		System.out.println("User verifies the Assortment plan field should have the 'Default Customer SKU Assortment Plan'");
	}
	

	
	/**----------------------RCS_SaaS_Creation_DiscountGroups_WC--------------------------**/
	
	
	
	
	@Then("^User selects the Group Type as 'DISCOUNT GROUP' & clicks on the Add button to create Customer Group$")
	public void user_selects_the_Group_Type_as_DISCOUNT_GROUP_clicks_on_the_Add_button_to_create_Customer_Group() throws Throwable {
	    
		System.out.println("Attempt: select the Depot Assortment Plan from the Assortment Type dropdown");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ASSORTMENT_TYPE, LocatorsPath.MAX_TIME, 
				file3.getCellData("AssortmentPlan", "Group Settings", 3));
		CallObject.block(2000);
		
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.DISCOUNT_GROUP_ADD, LocatorsPath.MAX_TIME);
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.DISCOUNT_GROUP_ADD_DISP, LocatorsPath.MAX_TIME);
		System.out.println("Success: selected the Depot Assortment Plan from the Assortment Type dropdown");
	}
	

	@Then("^User enters the following mandatory fields - Name, Group Code & selects the Group Type as 'DISCOUNT GROUP' & clicks on Save button$")
	public void user_enters_the_following_mandatory_fields_Name_Group_Code_selects_the_Group_Type_as_DISCOUNT_GROUP_clicks_on_Save_button() throws Throwable {
	   
		System.out.println("Attempt: enter the following mandatory fields - "
				+ "Name, Group Code & select the Group Type as 'DISCOUNT GROUP' & click on Save button");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.DISCOUNT_GROUP_NAME, LocatorsPath.MAX_TIME, 
				CallObject.timestamp().concat("_DG"));
		file3.setCellData("Discount Group", "Name", 2, CallObject.timestamp().concat("_DG"));
		
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.DISCOUNT_GROUP_CODE, LocatorsPath.MAX_TIME, 
				CallObject.timestamp().concat("_DG"));
		
		WebElement groupType = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.DISCOUNT_GROUP_TYPE))));
		Assert.assertEquals("Discount Group", groupType.getText());
		
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ASSORTMENT_SAVE, LocatorsPath.MAX_TIME);
		System.out.println("Success: entered the following mandatory fields - "
				+ "Name, Group Code & selected the Group Type as 'DISCOUNT GROUP' & clicked on Save button");
	}
	

	@Then("^User verifies the record is saved successfully\\.$")
	public void user_verifies_the_record_is_saved_successfully() throws Throwable {
	    
		System.out.println("Attempt: verify the record is saved successfully");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.GROUP_NAME_SEARCH, LocatorsPath.MAX_TIME, 
				file3.getCellData("Discount Group", "Name", 2));
		CallObject.block(2000);
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.GROUP_NAME_SEARCH)))).clear();
		System.out.println("Success: verified the record is saved successfully");
	}
	

	
	/**----------------------RCS_SaaS_Creation_Add_Customers_CG_WC--------------------------**/
	
	
	
	
	@Then("^User clicks on the Add button in the (\\d+)nd Frame to add customer/customers & verifies the Advanced search screen is displayed$")
	public void user_clicks_on_the_Add_button_in_the_nd_Frame_to_add_customer_customers_verifies_the_Advanced_search_screen_is_displayed(int arg1) throws Throwable {
	   
		System.out.println("Attempt: click on the Add button in the (\\d+)nd Frame "
				+ "to add customer/customers & verify the Advanced search screen is displayed");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.GROUP_NAME_SEARCH, LocatorsPath.MAX_TIME, 
				file3.getCellData("Discount Group", "Name", 2));
		CallObject.block(2000);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.GROUP_NAME_SEARCH_REFRESH, LocatorsPath.MAX_TIME);
		
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.DISCOUNT_GROUP_TYPE_ADD_2, LocatorsPath.MAX_TIME);
		
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.ADVANCED_SEARCH_DISP, LocatorsPath.MAX_TIME);
		System.out.println("Success: clicked on the Add button in the (\\d+)nd Frame"
				+ " to add customer/customers & verified the Advanced search screen is displayed");
	}
	

	@Then("^User selects the various fields and clicks on search button$")
	public void user_selects_the_various_fields_and_clicks_on_search_button() throws Throwable {
		
		user_selects_the_various_fields_and_clicks_on_Search_button();
	}
	

	@Then("^User verifies the list of customers is displayed who belongs to the search criteria & user selects the required data$")
	public void user_verifies_the_list_of_customers_is_displayed_who_belongs_to_the_search_criteria_user_selects_the_required_data() throws Throwable {
		
		user_verifies_the_list_of_customers_is_displayed_who_belongs_to_the_search_criteria_User_selects_the_required_data();
	}
	

	@Then("^User selects the customers and clicks on ADD button & verifies the selected customers is displayed in the detail section of Customer Group screen\\.$")
	public void user_selects_the_customers_and_clicks_on_ADD_button_verifies_the_selected_customers_is_displayed_in_the_detail_section_of_Customer_Group_screen() throws Throwable {
		
		System.out.println("Attempt: select the customers and click on ADD button & verify the "
				+ "selected customers is displayed in the detail section of Customer Group screen");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.AG_GROUP_SETTINGS_ADD_BUTTON, LocatorsPath.MAX_TIME);
		
		WebElement msg = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SUCCESS_MESSAGE))));
		Assert.assertEquals("Customer Associated Successfully To The Customer Group !", 
				msg.getText());
		System.out.println("Success: selected the customers and clicked on ADD button & verified the "
				+ "selected customers is displayed in the detail section of Customer Group screen");
	}
	
	

	
	/**----------------------RCS_SaaS_AssortmentPlan_Exports_CG_WC--------------------------**/
	
	
	
	
	@Then("^User clicks on the 'EXPORT IN CSV' button without selecting any customers$")
	public void user_clicks_on_the_EXPORT_IN_CSV_button_without_selecting_any_customers() throws Throwable {
		
		user_clicks_on_the_EXPORT_IN_CSV_button_without_selecting_any_Customers();
	}
	

	@Then("^User verifies all the Customers associated to the Customer Group were exported in CSV format with following fields - Customer ID, Customer No, Account Name$")
	public void user_verifies_all_the_Customers_associated_to_the_Customer_Group_were_exported_in_CSV_format_with_following_fields_Customer_ID_Customer_No_Account_Name() throws Throwable {
		
		user_verifies_all_the_customers_associated_to_the_Customer_Group_were_exported_in_CSV_format_with_following_fields_Customer_ID_Customer_No_Account_Name();
	}
	

	@Then("^User clicks on the 'EXPORT' button without selecting any customers$")
	public void user_clicks_on_the_EXPORT_button_without_selecting_any_customers() throws Throwable {
		
		user_clicks_on_the_EXPORT_button_without_selecting_any_Customers();
	}
	

	@Then("^User verifies the system displaying the Error message as - Select at least one check box to export'$")
	public void user_verifies_the_system_displaying_the_Error_message_as_Select_at_least_one_check_box_to_export() throws Throwable {
		
		user_verifies_the_system_displaying_the_error_message_as_Select_at_least_one_check_box_to_export();
	}
	

	@Then("^User clicks on the 'EXPORT' button by selecting few/all customers & also by selecting the Export format as - CSV or TXT$")
	public void user_clicks_on_the_EXPORT_button_by_selecting_few_all_customers_also_by_selecting_the_Export_format_as_CSV_or_TXT() throws Throwable {
		
		user_clicks_on_the_EXPORT_button_by_selecting_few_all_Customers_also_by_selecting_the_Export_format_as_CSV_or_TXT();
	}
	

	@Then("^User verifies the Zip file is created which contains \\.csv file with following fields - Customer ID, Customer No, Account Name$")
	public void user_verifies_the_Zip_file_is_created_which_contains_csv_file_with_following_fields_Customer_ID_Customer_No_Account_Name() throws Throwable {
		
		user_verifies_the_zip_file_is_created_which_contains_csv_file_with_following_fields_Customer_ID_Customer_No_Account_Name();
	}
	

	
	/**----------------------RCS_SaaS_AssortmentPlan_Imports_CG_WC--------------------------**/
	
	
	
	
	@Then("^User clicks on the Import button & selects the option as 'Add customers to group' and selects the file$")
	public void user_clicks_on_the_Import_button_selects_the_option_as_Add_customers_to_group_and_selects_the_file() throws Throwable {
		
		user_clicks_on_the_Import_button_selects_the_option_Add_customers_to_group_and_selects_the_file();
	}
	

	@Then("^User verifies the Import is successful & all the customers in the file were added to the detail section of Customer Group screen$")
	public void user_verifies_the_Import1_is_successful_all_the_customers_in_the_file_were_added_to_the_detail_section_of_Customer_Group_screen() throws Throwable {
		
		user_verifies_the_Import1_is_successful_All_the_customers_in_the_file_were_added_to_the_detail_section_of_Customer_Group_screen();
	}
	

	@Then("^User clicks on the Import button & Selects the option 'Associate Customers' and selects the file$")
	public void user_clicks_on_the_Import_button_Selects_the_option_Associate_Customers_and_selects_the_file() throws Throwable {
		
		user_clicks_on_the_Import_button_selects_the_option_Associate_Customers_and_selects_the_file();
	}

	
	@Then("^User verifies the Import is successful & all the customers in the file were added to the detail section of Customer Group screen\\.$")
	public void user_verifies_the_Import2_is_successful_all_the_customers_in_the_file_were_added_to_the_detail_section_of_Customer_Group_screen() throws Throwable {
		
		user_verifies_the_Import2_is_successful_All_the_customers_in_the_file_were_added_to_the_detail_section_of_Customer_Group_screen();
	}
	

	
	/**----------------------RCS_SaaS_CreateCG1_AssociationAssortmentPlan_WC--------------------------**/
	
	
	
	
	@Then("^User clicks on the Associate Discount Plan button & verifies the Associate Discount Plan page is displayed which contains all the Active Customer SKU Assortment Plan$")
	public void user_clicks_on_the_Associate_Discount_Plan_button_verifies_the_Associate_Discount_Plan_page_is_displayed_which_contains_all_the_Active_Customer_SKU_Assortment_Plan() throws Throwable {
	   
		System.out.println("Attempt: click on the Associate Discount Plan button & verify the"
				+ " Associate Discount Plan page is displayed which contains all the Active Customer SKU Assortment Plan");
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.GROUP_NAME_SEARCH)));
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.GROUP_NAME_SEARCH, LocatorsPath.MAX_TIME, 
				file3.getCellData("Discount Group", "Name", 2));
		CallObject.block(2000);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.GROUP_NAME_SEARCH_REFRESH, LocatorsPath.MAX_TIME);
		CallObject.block(2000);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ASSOC_DISCOUNT_PLAN_BUTTON, LocatorsPath.MAX_TIME);
		System.out.println("Success: clicked on the Associate Discount Plan button & verified the "
				+ "Associate Discount Plan page is displayed which contains all the Active Customer SKU Assortment Plan");
	}
	

	@Then("^User selects a Discount Plan & Clicks on Save button & verifies the Discount Plan is selected, associated and available in the (\\d+)rd frame Discount Plan section\\.$")
	public void user_selects_a_Discount_Plan_Clicks_on_Save_button_verifies_the_Discount_Plan_is_selected_associated_and_available_in_the_rd_frame_Discount_Plan_section(int arg1) throws Throwable {
	    
		System.out.println("Attempt: select a Discount Plan & Click on Save button & verify "
				+ "the Discount Plan is selected, associated and available in the (\\d+)rd frame Discount Plan section");
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.ASSOC_DISCOUNT_PLAN_DISP, LocatorsPath.MAX_TIME);
		
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ASSOC_ASSORTMENT_PLAN_SELECT, LocatorsPath.MAX_TIME);
		PageObjects.SelectByXpath(
				driver, LocatorsPath.ASSOC_DISCOUNT_PLAN_SAVE, LocatorsPath.MAX_TIME);
		
		WebElement msg = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SUCCESS_MESSAGE))));
		Assert.assertEquals("Discount Plan Updated Successfully !", msg.getText());
		
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.GROUP_NAME_SEARCH, LocatorsPath.MAX_TIME, 
				file3.getCellData("Discount Group", "Name", 2));
		CallObject.block(2000);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.GROUP_NAME_SEARCH_REFRESH, LocatorsPath.MAX_TIME);
		CallObject.block(2000);
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.DISCOUNT_PLAN_ROW)));
		WebElement row = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.DISCOUNT_PLAN_ROW))));
		if(row.isDisplayed()) {
			System.out.println("Discount Plan details is visible");
		}else {
			Assert.fail("Discount Plan details not visible");
		}
		System.out.println("Success: selected a Discount Plan & Clicked on Save button & verified the"
				+ " Discount Plan is selected, associated and available in the (\\d+)rd frame Discount Plan section");
	}
	

	
	/**----------------------RCS_SaaS_Creation_Retail_Audit_Group_WC--------------------------**/
	
	
	
	
	@Then("^User clicks on the Customer Group & navigates to the 'Retail Audit Settings' tab$")
	public void user_clicks_on_the_Customer_Group_navigates_to_the_Retail_Audit_Settings_tab() throws Throwable {
	    
		System.out.println("Attempt: click on the Customer Group & "
				+ "navigate to the 'Retail Audit Settings' tab");
		PageObjects.SelectByXpath(
				driver, LocatorsPath.RETAIL_AUDIT_SETTINGS, LocatorsPath.MAX_TIME);
		System.out.println("Success: clicked on the Customer Group & "
				+ "navigated to the 'Retail Audit Settings' tab");
	}
	

	@Then("^User verifies the Retail Audit Settings screen displays the Retail Audit Group as (\\d+)st section & SKU's to be added to the Retail Audit group as (\\d+)nd section$")
	public void user_verifies_the_Retail_Audit_Settings_screen_displays_the_Retail_Audit_Group_as_st_section_SKU_s_to_be_added_to_the_Retail_Audit_group_as_nd_section(int arg1, int arg2) throws Throwable {
	    
		System.out.println("Attempt: verify the Retail Audit Settings screen displays the Retail Audit Group as "
				+ "(\\d+)st section & SKU's to be added to the Retail Audit group as (\\d+)nd section");
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.RETAIL_AUDIT_SETTINGS_DISP, LocatorsPath.MAX_TIME);
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.RETAIL_AUDIT_SETTINGS_DISP_1, LocatorsPath.MAX_TIME);
		System.out.println("Success: verified the Retail Audit Settings screen displays the Retail Audit Group as "
				+ "(\\d+)st section & SKU's to be added to the Retail Audit group as (\\d+)nd section");
	}
	

	@Then("^User clicks on the Add button to create Retail Audit Group & verifies the 'Add Retail Audit Group' screen is displayed$")
	public void user_clicks_on_the_Add_button_to_create_Retail_Audit_Group_verifies_the_Add_Retail_Audit_Group_screen_is_displayed() throws Throwable {
	 
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.RETAIL_AUDIT_ADD, LocatorsPath.MAX_TIME);
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.ADD_RETAIL_AUDIT_GROUP_DISP, LocatorsPath.MAX_TIME);
	}
	

	@Then("^User enters the following Mandatory fields - Name, Group Code & Group Type$")
	public void user_enters_the_following_Mandatory_fields_Name_Group_Code_Group_Type() throws Throwable {

		System.out.println("Attempt: enter the following Mandatory fields - Name, Group Code & Group Type");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.RETAIL_AUDIT_GROUP_NAME, LocatorsPath.MAX_TIME, 
				file3.getCellData("AssortmentPlan", "Group Name", 2));
		
		CallObject.block(3000);
		WebElement groupCode = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.RETAIL_AUDIT_GROUP_CODE))));
		Assert.assertEquals(file3.getCellData("AssortmentPlan", "Group Code", 2), 
				groupCode.getAttribute("value"));
		System.out.println("Success: entered the following Mandatory fields - Name, Group Code & Group Type");
	}
	

	@Then("^User verifies the 'Group Type' by Default is displayed as 'Assortment Group'$")
	public void user_verifies_the_Group_Type_by_Default_is_displayed_as_Assortment_Group() throws Throwable {
	    
		System.out.println("Attempt: verify the 'Group Type' by Default is displayed as 'Assortment Group'");
		WebElement groupType = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.RETAIL_AUDIT_GROUP_TYPE))));
		Assert.assertEquals("Assortment Group", groupType.getAttribute("value"));
		System.out.println("Success: verified the 'Group Type' by Default is displayed as 'Assortment Group'");
	}
	

	@Then("^User clicks on Save button & verifies the record is saved successfully$")
	public void user_clicks_on_Save_button_verifies_the_record_is_saved_successfully() throws Throwable {
	    
		System.out.println("Attempt: click on Save button & verify the record is saved successfully");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.RETAIL_AUDIT_SAVE, LocatorsPath.MAX_TIME);
		
		WebElement msg = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SUCCESS_MESSAGE))));
		Assert.assertEquals("Retail Audit Group has been created successfully.", msg.getText());
		System.out.println("Success: clicked on Save button & verified the record is saved successfully");
	}
	

	@Then("^User clicks on the Add button in (\\d+)nd frame to add SKUs & verifies the 'Add Retail Audit Settings' page is displayed$")
	public void user_clicks_on_the_Add_button_in_nd_frame_to_add_SKUs_verifies_the_Add_Retail_Audit_Settings_page_is_displayed(int arg1) throws Throwable {
	   
		System.out.println("Attempt: click on the Add button in (\\d+)nd frame "
				+ "to add SKUs & verify the 'Add Retail Audit Settings' page is displayed");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.RETAIL_AUDIT_SET_REFRESH, LocatorsPath.MAX_TIME);
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.RETAIL_AUDIT_SET_ADD_1)));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.RETAIL_AUDIT_SET_ADD_1, LocatorsPath.MAX_TIME);
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.ADD_RETAIL_AUDIT_SET_DISP, LocatorsPath.MAX_TIME);
		System.out.println("Success: clicked on the Add button in (\\d+)nd frame "
				+ "to add SKUs & verified the 'Add Retail Audit Settings' page is displayed");
	}
	

	@Then("^User selects the 'SKU name' which is a Mandatory field which lists all the Active BAT SKUs$")
	public void user_selects_the_SKU_name_which_is_a_Mandatory_field_which_lists_all_the_Active_BAT_SKUs() throws Throwable {
	    
		System.out.println("Attempt: select the 'SKU name' which is a Mandatory "
				+ "field which lists all the Active BAT SKUs");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.RETAIL_AUDIT_SKU_NAME, LocatorsPath.MAX_TIME, 
				file1.getCellData("ProductConfig", "Product Name", 2));
		System.out.println("Success: selected the 'SKU name' which is a Mandatory "
				+ "field which lists all the Active BAT SKUs");
	}
	

	@Then("^User verifies the 'SKU Code' is Auto populated on selecting SKU name$")
	public void user_verifies_the_SKU_Code_is_Auto_populated_on_selecting_SKU_name() throws Throwable {
	    
		System.out.println("Attempt: verify the 'SKU Code' is Auto populated on selecting SKU name");
		WebElement skuCode = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.RETAIL_AUDIT_SKU_CODE))));
		Assert.assertTrue(skuCode.getAttribute
				 ("readonly").equals("true"),"readonly");
		System.out.println("Success: verified the 'SKU Code' is Auto populated on selecting SKU name");
	}
	

	@Then("^User selects the 'SC' checkbox - If checked, selected SKU will be made mandatory in Stock Count screen$")
	public void user_selects_the_SC_checkbox_If_checked_selected_SKU_will_be_made_mandatory_in_Stock_Count_screen() throws Throwable {
	    
		System.out.println("Attempt:  select the 'SC' checkbox");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.RETAIL_AUDIT_SC, LocatorsPath.MAX_TIME);
		System.out.println("Success:  selected the 'SC' checkbox successfully");
	}
	

	@Then("^User clicks on the save button & verifies the SKUs is added to the Retail Audit Group under the (\\d+)nd Frame\\.$")
	public void user_clicks_on_the_save_button_verifies_the_SKUs_is_added_to_the_Retail_Audit_Group_under_the_nd_Frame(int arg1) throws Throwable {
	    
		System.out.println("Attempt: click on the save button & verify the SKUs is "
				+ "added to the Retail Audit Group under the (\\d+)nd Frame");
		CallObject.block(2000);
		WebElement save = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.RETAIL_AUDIT_SAVE))));
		if(save.isEnabled()) {
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.RETAIL_AUDIT_SAVE, LocatorsPath.MAX_TIME);
		WebElement msg = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SUCCESS_MESSAGE))));
		Assert.assertEquals("Retail Audit Settings has been created successfully.", msg.getText());
		}else {
			user_clicks_on_the_Customer_Group_navigates_to_the_Retail_Audit_Settings_tab();
		}
		System.out.println("Success: clicked on the save button & verified the SKUs is "
				+ "added to the Retail Audit Group under the (\\d+)nd Frame");
	}
	

	
	/**----------------------RCS_SaaS_Retail_Audit_Group_Exports_WC--------------------------**/
	
	
	
	
	@Then("^User clicks on the 'EXPORT IN CSV' button without selecting any Retail Audit Group$")
	public void user_clicks_on_the_EXPORT_IN_CSV_button_without_selecting_any_Retail_Audit_Group() throws Throwable {
	 
		System.out.println("Attempt: click on the 'EXPORT IN CSV' button "
				+ "without selecting any Retail Audit Group");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.AG_EXPORT_IN_CSV, LocatorsPath.MAX_TIME);
		System.out.println("Success: clicked on the 'EXPORT IN CSV' button "
				+ "without selecting any Retail Audit Group");
	}
	

	@Then("^User verifies all the Retail Audit Groups and the associated SKUs were exported in CSV format with following fields - Customer Group Name, Group Code, SKU Name, SKU Code, SC$")
	public void user_verifies_all_the_Retail_Audit_Groups_and_the_associated_SKUs_were_exported_in_CSV_format_with_following_fields_Customer_Group_Name_Group_Code_SKU_Name_SKU_Code_SC() throws Throwable {
	    
		System.out.println("Attempt: verify all the Retail Audit Groups and the associated SKUs were "
				+ "exported in CSV format with following fields - Customer Group Name, Group Code, SKU Name, SKU Code, SC");
		CallObject.block(5000);
		CsvToExcelConverter.csvConverter
		(LocatorsPath.CsvRetailAuditGroup, LocatorsPath.xlsxRetailAuditGroup, LocatorsPath.Sheet_Retail);

		ExcelApiFile retailAudit = new ExcelApiFile(LocatorsPath.xlsxRetailAuditGroup);
		Assert.assertEquals("Customer Group Name", 
				retailAudit.getCellData(LocatorsPath.Sheet_Retail, "Customer Group Name", 1));
		Assert.assertEquals("Group Code", 
				retailAudit.getCellData(LocatorsPath.Sheet_Retail, "Group Code", 1));
		Assert.assertEquals("SKU Name", 
				retailAudit.getCellData(LocatorsPath.Sheet_Retail, "SKU Name", 1));
		Assert.assertEquals("SKU Code", 
				retailAudit.getCellData(LocatorsPath.Sheet_Retail, "SKU Code", 1));
		Assert.assertEquals("SC", 
				retailAudit.getCellData(LocatorsPath.Sheet_Retail, "SC", 1));
		System.out.println("Success: verified all the Retail Audit Groups and the associated SKUs were "
				+ "exported in CSV format with following fields - Customer Group Name, Group Code, SKU Name, SKU Code, SC");
	}
	

	@Then("^User Verifies without selecting any Retail Audit Group the EXPORT button is disabled$")
	public void user_Verifies_without_selecting_any_Retail_Audit_Group_the_EXPORT_button_is_disabled() throws Throwable {
	    
		System.out.println("Attempt: verify without selecting any Retail Audit Group the EXPORT button is disabled");
		WebElement export = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SEARCH_RESULTS_EXPORT))));
		Assert.assertEquals(true, !export.isEnabled());
		System.out.println("Success: verified without selecting any Retail Audit Group the EXPORT button is disabled");
	}
	

	@Then("^User clicks on the EXPORT button by selecting few/all Retail Audit Group & also by selecting the Export format as - CSV or TXT$")
	public void user_clicks_on_the_EXPORT_button_by_selecting_few_all_Retail_Audit_Group_also_by_selecting_the_Export_format_as_CSV_or_TXT() throws Throwable {
	    
		System.out.println("Attempt: click on the EXPORT button by selecting few/all "
				+ "Retail Audit Group & also by selecting the Export format as - CSV or TXT");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.RETAIL_AUDIT_SET_CHECKBOX, LocatorsPath.MAX_TIME);
		CallObject.block(3000);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.SEARCH_RESULTS_EXPORT, LocatorsPath.MAX_TIME);
		System.out.println("Success: clicked on the EXPORT button by selecting few/all "
				+ "Retail Audit Group & also by selecting the Export format as - CSV or TXT");
	}
	

	@Then("^User verifies the selected Retail Audit Groups exported in CSV format with following fields - Customer Group Name, Group Code, SKU Name, SKU Code, SC$")
	public void user_verifies_the_selected_Retail_Audit_Groups_exported_in_CSV_format_with_following_fields_Customer_Group_Name_Group_Code_SKU_Name_SKU_Code_SC() throws Throwable {
	   
		user_verifies_all_the_Retail_Audit_Groups_and_the_associated_SKUs_were_exported_in_CSV_format_with_following_fields_Customer_Group_Name_Group_Code_SKU_Name_SKU_Code_SC();
	}
	

	
	/**----------------------RCS_SaaS_Retail_Audit_Group_Imports_WC--------------------------**/
	
	
	
	@Then("^User clicks on the Import button and selects the Retail Audit Group Imports file$")
	public void user_clicks_on_the_Import_button_and_selects_the_Retail_Audit_Group_Imports_file() throws Throwable {
	 
		System.out.println("Attempt: click on the Import button and "
				+ "select the Retail Audit Group Imports file");
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.RETAIL_AUDIT_IMPORT)));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.RETAIL_AUDIT_IMPORT, LocatorsPath.MAX_TIME);
		System.out.println("Success: clicked on the Import button and selected the Retail Audit Group Imports file");
	}
	

	@Then("^User verifies the Import is successful & all the SKUs in the file is added to the detail section of Retail Audit Group\\.$")
	public void user_verifies_the_Import_is_successful_all_the_SKUs_in_the_file_is_added_to_the_detail_section_of_Retail_Audit_Group() throws Throwable {
	    
		System.out.println("Attempt: verify the Import is successful & "
				+ "all the SKUs in the file is added to the detail section of Retail Audit Group");
		robotPage.importFile(LocatorsPath.RetailAuditImport);
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.WARN_MESSAGE)));
		WebElement msg = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.WARN_MESSAGE))));
		Assert.assertEquals("Total Records:-1 Success Records:-1 Error Records:-0", msg.getText());
		System.out.println("Success: verified the Import is successful & "
				+ "all the SKUs in the file is added to the detail section of Retail Audit Group");
	}
}
