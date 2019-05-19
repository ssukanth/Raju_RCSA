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

public class RcsSaasDiscountPlanPage extends TestRunnerWebClient{
	
	WebDriver driver = getDriver();
	ExcelApiFile file1 = new ExcelApiFile("TestData1.xlsx");
	ExcelApiFile file3 = new ExcelApiFile("TestData3.xlsx");
	WebDriverWait wait = new WebDriverWait(driver, LocatorsPath.MAX_TIME);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	Actions actions = new Actions(driver);
	RcsSaasNewOutletCreationPage newOutletCreationPage = new RcsSaasNewOutletCreationPage(); 
	RcsSaasConfigurationUsersPage configurationUsersPage = new RcsSaasConfigurationUsersPage();
	RcsSaasAssortmentPlanAndCustomerGroupPage 
	customerGroupPage = new RcsSaasAssortmentPlanAndCustomerGroupPage();
	
	public RcsSaasDiscountPlanPage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	/**----------------------RCS_SaaS_Configuration_Discount_Plan_WC--------------------------**/
	
	
	
	
	@Then("^User clicks on the Discount Plan and navigates to the Discount Plan screen$")
	public void user_clicks_on_the_Discount_Plan_and_navigates_to_the_Discount_Plan_screen() throws Throwable {
	    
		System.out.println("Attempt: Click on Discount Plan");
		PageObjects.SelectByXpath(
				driver, LocatorsPath.DISCOUNT_PLAN, LocatorsPath.MAX_TIME);
		System.out.println("Success: Discount Plan selected successfully");
	}
	

	@Then("^User verifies the Discount Plan list section is available in Discount Plan screen$")
	public void user_verifies_the_Discount_Plan_list_section_is_available_in_Discount_Plan_screen() throws Throwable {
	    
		System.out.println("Attempt: Verify Discount Plan list section is available");
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.DISCOUNT_PLAN_DISPLAY, LocatorsPath.MAX_TIME);
		System.out.println("Success: Discount Plan list section is present");
	}
	

	@Then("^User verifies the Discount Rules section is available in Discount Plan screen$")
	public void user_verifies_the_Discount_Rules_section_is_available_in_Discount_Plan_screen() throws Throwable {
	   
		System.out.println("Attempt: Verify Discount Rules section is available");
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.xpath(LocatorsPath.DISCOUNT_RULES_DISPLAY)));
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.DISCOUNT_RULES_DISPLAY, LocatorsPath.MAX_TIME);
		System.out.println("Success: Discount Rules section is present");
	}
	

	@Then("^User verifies the Customer Groups section is available in Discount Plan screen$")
	public void user_verifies_the_Customer_Groups_section_is_available_in_Discount_Plan_screen() throws Throwable {
	    
		System.out.println("Attempt: Verify Discount Groups section is available");
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.xpath(LocatorsPath.CUSTOMER_GROUPS_DISPLAY)));
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.CUSTOMER_GROUPS_DISPLAY, LocatorsPath.MAX_TIME);
		System.out.println("Success: Discount Groups section is present");
	}
	


	
	/**----------------------RCS_SaaS_Creation_of_Discount_Plan--------------------------**/
	
	
	
	
	@Then("^In the Discount Plan section user navigates to Add/Create a new Discount Plan by clicking on the 'Create Discount Plan' Button$")
	public void in_the_Discount_Plan_section_user_navigates_to_Add_Create_a_new_Discount_Plan_by_clicking_on_the_Create_Discount_Plan_Button() throws Throwable {
	    
		System.out.println("Attempt: click on 'Create Discount Plan' button");
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.CREATE_DISCOUNT_PLAN)));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.CREATE_DISCOUNT_PLAN, LocatorsPath.MAX_TIME);
		System.out.println("Success: Create Discount Plan button selected successfully");
	}
	

	@Then("^The Create Discount Plan page should be opened successfully$")
	public void the_Create_Discount_Plan_page_should_be_opened_successfully() throws Throwable {
	    
		System.out.println("Attempt: Verify Create Discount Plan page is available");
        PageObjects.SelectByXpathWithoutClick(
        		driver, LocatorsPath.CREATE_DISCOUNT_PLAN_DISP, LocatorsPath.MAX_TIME);
		System.out.println("Success: Create Discount Plan page is present");
	}
	

	@Then("^User enters the 'NAME' - Discount Plan Name should be Unique$")
	public void user_enters_the_NAME_Discount_Plan_Name_should_be_Unique() throws Throwable {
	    
		System.out.println("Attempt: Enter the 'Discount Plan Name'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.NAME, LocatorsPath.MAX_TIME, CallObject.timestamp().concat("_DiscPlan"));
		file1.setCellData("Discount Plan", "Name", 2, 
				CallObject.timestamp().concat("_DiscPlan"));
		System.out.println("Success: 'Discount Plan Name' entered successfully");
	}
	

	@Then("^User enters the 'CODE'$")
	public void user_enters_the_CODE() throws Throwable {
	    
		System.out.println("Attempt: Enter the 'Discount Plan Code'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.CODE, LocatorsPath.MAX_TIME, 
				file1.getCellData("Discount Plan", "Code", 2));
		System.out.println("Success: 'Discount Plan Code' entered successfully");
	}
	

	@Then("^User enters the 'Description'$")
	public void user_enters_the_Description() throws Throwable {
	    
		System.out.println("Attempt: Enter the 'Discount Plan Description'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.DP_DESCRIPTION, LocatorsPath.MAX_TIME, 
				file1.getCellData("Discount Plan", "Description", 2));
		System.out.println("Success: 'Discount Plan Description' entered successfully");
	}
	

	@Then("^User selects the 'Status' dropdown - By default, DRAFT should be populated while creation$")
	public void user_selects_the_Status_dropdown_By_default_DRAFT_should_be_populated_while_creation() throws Throwable {
	 
		System.out.println("Attempt: Select the 'Discount Plan Status'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.DP_STATUS, LocatorsPath.MAX_TIME, 
				file1.getCellData("Discount Plan", "Status", 2));
		System.out.println("Success: 'Discount Plan Status' entered successfully");
	}
	

	@Then("^User selects 'Start date' for Discount Plan$")
	public void user_selects_Start_date_for_Discount_Plan() throws Throwable {
	    
		System.out.println("Attempt: select the 'Start Date'");
		/*PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.DP_START_DATE_CALENDER, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.DP_START_DATE, LocatorsPath.MAX_TIME);*/
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.DP_START_DATE_TEXT, LocatorsPath.MAX_TIME, CallObject.presentTimestamp());
		System.out.println("Success: 'Start Date' as been selected successfully");
	}

	
	@Then("^User selects 'End date' for Discount Plan$")
	public void user_selects_End_date_for_Discount_Plan() throws Throwable {
	   
		System.out.println("Attempt: select the 'End Date'");
		/*PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.DP_END_DATE_CALENDER, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.DP_END_DATE, LocatorsPath.MAX_TIME);*/
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.DP_END_DATE_TEXT, LocatorsPath.MAX_TIME, CallObject.presentTimestamp());
		System.out.println("Success: 'End Date' as been selected successfully");
	}
	

	@Then("^User clicks on save button and verifies the New Discount Plan is created with all the required fields populated, One discount plan should be associated only one discount Group$")
	public void user_clicks_on_save_button_and_verifies_the_New_Discount_Plan_is_created_with_all_the_required_fields_populated_One_discount_plan_should_be_associated_only_one_discount_Group() throws Throwable {
	    
		System.out.println("Attempt: Click on Save button");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.SAVE_CREATE_DISCOUNT_PLAN, LocatorsPath.MAX_TIME);
		System.out.println("Success: Save button selected successfully");
	}
	

	
	
	/**----------------------RCS_SaaS_Start_End_Date_Modification--------------------------**/
	
	
	
	
	@Then("^User searches for the New Discount Plan created and opens the link$")
	public void user_searches_for_the_New_Discount_Plan_created_and_opens_the_link() throws Throwable {
	    
		System.out.println("Attempt: click on 'New Discount Plan' hyperlink");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.DISC_PLAN_NAME_SEAR_FIELD, LocatorsPath.MAX_TIME, 
				file1.getCellData("Discount Plan", "Name", 2));
		CallObject.block(3000);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.DISCOUNT_PLAN_FIRST_NAME, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'New Discount Plan' hyperlink selected successfully");
	}
	

	@Then("^User tries to modify the Start and End Dates of the Discount Group$")
	public void user_tries_to_modify_the_Start_and_End_Dates_of_the_Discount_Group() throws Throwable {
	    
		System.out.println("Attempt: select the 'Start Date'");
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.DP_START_DATE_TEXT)))).clear();
		CallObject.block(1000);
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.DP_START_DATE_TEXT, LocatorsPath.MAX_TIME, 
				CallObject.futureDate());
		System.out.println("Success: 'Start Date' as been selected successfully");
		
		System.out.println("Attempt: select the 'End Date'");
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.DP_END_DATE_TEXT)))).clear();
		CallObject.block(1000);
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.DP_END_DATE_TEXT, LocatorsPath.MAX_TIME, 
				CallObject.futureDate());
		System.out.println("Success: 'End Date' as been selected successfully");
	}
	

	@Then("^User ensures that there is no overlapping period with other Discount Plans associated to the Customer Groups$")
	public void user_ensures_that_there_is_no_overlapping_period_with_other_Discount_Plans_associated_to_the_Customer_Groups() throws Throwable {
	    
		user_clicks_on_save_button_and_verifies_the_New_Discount_Plan_is_created_with_all_the_required_fields_populated_One_discount_plan_should_be_associated_only_one_discount_Group();
	}
	

	
	
	/**----------------------RCS_SaaS_Adding_Discount_Rules_Category_Order--------------------------**/
	
	
	
	
	@Then("^In the Discount Plan section user navigates to Discount Rules section, and clicks on 'Add' button$")
	public void in_the_Discount_Plan_section_user_navigates_to_Discount_Rules_section_and_clicks_on_Add_button() throws Throwable {
	    
		System.out.println("Attempt: click on 'Add discount rules' button");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.DISC_PLAN_NAME_SEAR_FIELD, LocatorsPath.MAX_TIME, 
				file1.getCellData("Discount Plan", "Name", 2));
		CallObject.block(3000);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.REFRESH_DISCOUNT_PLAN, LocatorsPath.MAX_TIME);
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.DISCOUNT_RULES_ADD)));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.DISCOUNT_RULES_ADD, LocatorsPath.MAX_TIME);
		System.out.println("Success: Add discount rules button selected successfully");
	}
	

	@Then("^The Add Rule Details page should be opened successfully$")
	public void the_Add_Rule_Details_page_should_be_opened_successfully() throws Throwable {
	    
		System.out.println("Attempt: Verify Add Rule Details page is opened   ");
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.ADD_RULE_DETAIL_DISP, LocatorsPath.MAX_TIME);
		System.out.println("Success: Add Rule Details page opened successfully");
	}
	

	@Then("^User selects the 'Category' dropdown - By default, 'ORDER' should be displayed else user can select 'Category' as 'SKU'$")
	public void user_selects_the_Category_dropdown_By_default_ORDER_should_be_displayed_else_user_can_select_Category_as_SKU() throws Throwable {
	    
		System.out.println("Attempt: Select 'Category' dropdown value");
        switch (file1.getCellData("Discount Plan", "Category", 2)) {
		
		case "Order":
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.DP_CATEGORY, LocatorsPath.MAX_TIME, 
					file1.getCellData("Discount Plan", "Category", 2));
			break;
			
		case "SKU":
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.DP_CATEGORY, LocatorsPath.MAX_TIME, 
					file1.getCellData("Discount Plan", "Category", 2));
			WebElement sku = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.DP_SKU))));
			if(sku.isDisplayed()) {
				PageObjects.SelectByCSSSelectorWithSendKeys(
						driver, LocatorsPath.DP_SKU, LocatorsPath.MAX_TIME, 
						file1.getCellData("Discount Plan", "SKU", 2));
			}
			break;
		
        default:
			System.out.println("Category dropdown values are not available");
			Assert.fail("Category dropdown values are not available");
        }
        System.out.println("Success: 'Category' dropdown value selected successfully");
	}
	

	@Then("^User selects the 'Rule Base' dropdown - By default, QUANTITY should be displayed else user can select 'Value'$")
	public void user_selects_the_Rule_Base_dropdown_By_default_QUANTITY_should_be_displayed_else_user_can_select_Value() throws Throwable {
	 
		System.out.println("Attempt: Select 'Rule Base' dropdown value");
        switch (file1.getCellData("Discount Plan", "Rule Base", 2)) {
		
		case "Quantity":
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.RULE_BASE, LocatorsPath.MAX_TIME, 
					file1.getCellData("Discount Plan", "Rule Base", 2));
			break;
			
		case "Value":
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.RULE_BASE, LocatorsPath.MAX_TIME, 
					file1.getCellData("Discount Plan", "Rule Base", 2));
			break;
			
        default:
			System.out.println("Rule Base dropdown values are not available");
			Assert.fail("Rule Base dropdown values are not available");
        }
		 System.out.println("Success: 'Rule Base' dropdown value selected successfully");
	}
	

	@Then("^User selects the 'TCI Bucket' dropdown - used to specify the cost centre code for the Discount rule$")
	public void user_selects_the_TCI_Bucket_dropdown_used_to_specify_the_cost_centre_code_for_the_Discount_rule() throws Throwable {
	    
		System.out.println("Attempt: Select 'TCI Bucket' dropdown value");
		CallObject.block(2000);
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.DP_TCI_BUCKET, LocatorsPath.MAX_TIME, 
				file1.getCellData("Discount Plan", "TCI Bucket", 2));
		 System.out.println("Success: 'TCI Bucket' dropdown value selected successfully");
	}
	

	@Then("^User enters the 'Rule Description'$")
	public void user_enters_the_Rule_Description() throws Throwable {
	   
		System.out.println("Attempt: Enter 'Rule Description'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.RULE_DESCRIPTION, LocatorsPath.MAX_TIME, 
				file1.getCellData("Discount Plan", "Rule Description", 2));
		 System.out.println("Success: 'Rule Description' entered successfully");
	}
	

	@Then("^User clicks on next button$")
	public void user_clicks_on_next_button() throws Throwable {
	    
		System.out.println("Attempt: User click on next button");
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.NEXT)));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.NEXT, LocatorsPath.MAX_TIME);
		
		CallObject.block(3000);
		if(driver.getPageSource().contains("Max should be greater than Min!") || 
				 driver.getPageSource().contains("Min Value: Validation Error: Specified attribute is not between the expected values of 0.001 and 9,999,999,999.999.") ||
				 driver.getPageSource().contains("Max Value: Validation Error: Specified attribute is not between the expected values of 0.001 and 9,999,999,999.999.")){
				Assert.fail("Min/Max values are less than 0 or min value is greater than max value");
			}
		System.out.println("Success:  next button selected successfully");
	}
	

	@Then("^User enters the 'MIN' value to avail the discount - Min value should be greater than value '(\\d+)'$")
	public void user_enters_the_MIN_value_to_avail_the_discount_Min_value_should_be_greater_than_value(int arg1) throws Throwable {
	    
		System.out.println("Attempt: Enter the 'MIN' value to avail the discount");
		try {
				PageObjects.SelectByCSSSelectorWithSendKeys(
						driver, LocatorsPath.MIN_VALUE, LocatorsPath.MAX_TIME, 
						file1.getCellData("Discount Plan", "Min", 2));
		} catch (StaleElementReferenceException StaleElementReferenceException) {
			System.out.println("Trying to recover from stale element" + StaleElementReferenceException);
		}
		System.out.println("Success: 'MIN' value entered successfully");
	}
	

	@Then("^User enters the 'MAX' value to avail the discount - Max value should be greater than 'Min' Value$")
	public void user_enters_the_MAX_value_to_avail_the_discount_Max_value_should_be_greater_than_Min_Value() throws Throwable {
	    
		System.out.println("Attempt: Enter the 'MAX' value to avail the discount");
		try {
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.MAX_VALUE, LocatorsPath.MAX_TIME, 
					file1.getCellData("Discount Plan", "Max", 2));
		} catch (StaleElementReferenceException StaleElementReferenceException) {
			System.out.println("Trying to recover from stale element" + StaleElementReferenceException);
		}
		System.out.println("Success: 'MAX' value entered successfully");
	}
	

	@Then("^If 'Category' is 'ORDER' then user can select the 'Offer Type' as 'Percent/Value'$")
	public void if_Category_is_ORDER_then_user_can_select_the_Offer_Type_as_Percent_Value() throws Throwable {
	 
		System.out.println("Attempt: If 'Category' is 'ORDER' then select the 'Offer Type' as 'Percent/Value'");
		
        switch (file1.getCellData("Discount Plan", "Offer Type", 2)) {
		
		case "Percent":
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.OFFER_TYPE, LocatorsPath.MAX_TIME, 
					file1.getCellData("Discount Plan", "Offer Type", 2));
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.OFFER_VALUE, LocatorsPath.MAX_TIME, 
					file1.getCellData("Discount Plan", "Offer Value", 2));
			WebElement base = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.CALC_BASE))));
			org.testng.Assert.assertEquals("Flat", base.getText());
			break;
			
			
		case "Value":
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.OFFER_TYPE, LocatorsPath.MAX_TIME, 
					file1.getCellData("Discount Plan", "Offer Type", 2));
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.OFFER_VALUE, LocatorsPath.MAX_TIME, 
					file1.getCellData("Discount Plan", "Offer Value", 2));
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.CALC_BASE, LocatorsPath.MAX_TIME, 
					file1.getCellData("Discount Plan", "Calc Base", 2));
			break;
			
			
		case "FPET":
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.OFFER_TYPE, LocatorsPath.MAX_TIME, 
					file1.getCellData("Discount Plan", "Offer Type", 2));
			CallObject.block(2000);
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.COMPN_SKU, LocatorsPath.MAX_TIME, 
					file1.getCellData("Discount Plan", "Compn SKU", 2));
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.COMPN_QTY, LocatorsPath.MAX_TIME, 
					file1.getCellData("Discount Plan", "Compn Qty", 2));
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.CALC_BASE, LocatorsPath.MAX_TIME, 
					file1.getCellData("Discount Plan", "Calc Base", 2));
			break;
			
			
		case "FPIT":
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.OFFER_TYPE, LocatorsPath.MAX_TIME, 
					file1.getCellData("Discount Plan", "Offer Type", 2));
			CallObject.block(2000);
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.COMPN_SKU, LocatorsPath.MAX_TIME, 
					file1.getCellData("Discount Plan", "Compn SKU", 2));
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.COMPN_QTY, LocatorsPath.MAX_TIME, 
					file1.getCellData("Discount Plan", "Compn Qty", 2));
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.CALC_BASE, LocatorsPath.MAX_TIME, 
					file1.getCellData("Discount Plan", "Calc Base", 2));
			break;
			
        default:
			System.out.println("Category dropdown values are not available");
			Assert.fail("Category dropdown values are not available");
        }
        
        
        switch (file1.getCellData("Discount Plan", "Calc Base", 2)) {
		
		case "Threshold":
		    PageObjects.SelectByCSSSelectorWithSendKeys(
						driver, LocatorsPath.THRESHOLD, LocatorsPath.MAX_TIME, 
						file1.getCellData("Discount Plan", "Threshold", 2));
		    break;

		default:
			System.out.println("Threshold dropdown values are not available");
        }
        
        PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.NEXT_1, LocatorsPath.MAX_TIME);
        
        CallObject.block(3000);
		if(driver.getPageSource().contains("Threshold: Validation Error: Specified attribute is not between the expected values of 0.001 and 9,999,999,999.999.")||
		   driver.getPageSource().contains("Field cannot be empty")){
				Assert.fail("Threshold value can't be '0' or Threshold field can't be empty");
			}
        System.out.println("Success: 'Offer Type' as 'Percent/Value' selected successfully");
	}
	

	@Then("^If 'Category' is 'SKU' then user can select the 'Offer Type' as 'Percent/Value/FPIT/FPET'$")
	public void if_Category_is_SKU_then_user_can_select_the_Offer_Type_as_Percent_Value_FPIT_FPET() throws Throwable {
	    
		System.out.println("user selects the 'Offer Type' as 'Percent/Value/FPIT/FPET'");
	}
	

	@Then("^User enters the 'Offer Value' - if 'Offer Type' is 'Value'$")
	public void user_enters_the_Offer_Value_if_Offer_Type_is_Value() throws Throwable {
	    
		System.out.println("User enters the 'Offer Value' - if 'Offer Type' is 'Value'");
	}

	
	@Then("^User selects 'Compn sku' and enters the 'Compn Qty' - if 'Offer Type' is 'FPET/FPIT'$")
	public void user_selects_Compn_sku_and_enters_the_Compn_Qty_if_Offer_Type_is_FPET_FPIT() throws Throwable {
	    
		System.out.println("User selects 'Compn sku' and enters the 'Compn Qty' - if 'Offer Type' is 'FPET/FPIT'");
	}
	

	@Then("^User verifies if Offer type is selected as 'Percent' then 'Calc Base' is defaulted to 'Flat'$")
	public void user_verifies_if_Offer_type_is_selected_as_Percent_then_Calc_Base_is_defaulted_to_Flat() throws Throwable {
	    
		System.out.println("User verifies if Offer type is selected as 'Percent' then 'Calc Base' is defaulted to 'Flat'");
	}
	

	@Then("^User verifies if Offer type is selected as 'Value' then 'Calc Base' dropdown is displayed with default value as 'Flat'$")
	public void user_verifies_if_Offer_type_is_selected_as_Value_then_Calc_Base_dropdown_is_displayed_with_default_value_as_Flat() throws Throwable {

		System.out.println("User verifies if Offer type is selected as 'Value' then 'Calc Base' "
				+ "dropdown is displayed with default value as 'Flat'");
	}
	

	@Then("^User verifies if 'Calc Base' is selected as 'Threshold' then user enters the 'Threshold' value - Threshold value should be greater than '(\\d+)'$")
	public void user_verifies_if_Calc_Base_is_selected_as_Threshold_then_user_enters_the_Threshold_value_Threshold_value_should_be_greater_than(int arg1) throws Throwable {
		
		System.out.println("User verifies if 'Calc Base' is selected as 'Threshold' then user "
				+ "enters the 'Threshold' value - Threshold value should be greater than '(\\d+)'");
	}
	
	
	@Then("^User verifies if 'Calc base' is selected as 'Flat' CAP is not applicable else user enters the 'CAP' value if 'Calc base' is selected as 'Threshold'$")
	public void user_verifies_if_Calc_base_is_selected_as_Flat_CAP_is_not_applicable_else_user_enters_the_CAP_value_if_Calc_base_is_selected_as_Threshold() throws Throwable {
	    
		System.out.println("User verifies if 'Calc base' is selected as 'Flat' CAP is not "
				+ "applicable else user enters the 'CAP' value if 'Calc base' is selected as 'Threshold'");
	}
	

	@Then("^User selects 'Apply once' checkbox - 'Apply once' checkbox should be applied only once for the targeted$")
	public void user_selects_Apply_once_checkbox_Apply_once_checkbox_should_be_applied_only_once_for_the_targeted() throws Throwable {
	    
		System.out.println("Attempt: select 'Apply once' checkbox - 'Apply once' checkbox "
				+ "should be applied only once for the targeted");
		WebElement applyOnce = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.DP_APPLY_ONCE))));
		if(applyOnce.isDisplayed()) {
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.DP_APPLY_ONCE, LocatorsPath.MAX_TIME);
		}
		System.out.println("Success: selected 'Apply once' checkbox - 'Apply once' "
				+ "checkbox should be applied only once for the targeted");
	}
	

	@Then("^User verifies 'CAP for Period' checkbox is enabled/disabled - selects if checkbox is enabled$")
	public void user_verifies_CAP_for_Period_checkbox_is_enabled_disabled_selects_if_checkbox_is_enabled() throws Throwable {
		
		System.out.println("Attempt: verify 'CAP for Period' checkbox is enabled/disabled "
				+ "- selects if checkbox is enabled");;
		WebElement cap = wait.until(ExpectedConditions.
						presenceOfElementLocated((By.cssSelector(LocatorsPath.CAP_DISP))));
		if(cap.getText().isEmpty()) {
			System.out.println("No records found");
		}else {
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.CAP, LocatorsPath.MAX_TIME, 
					file1.getCellData("Discount Plan", "Cap", 2));
		}
		
		CallObject.block(2000);
		WebElement capPeriod = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.CAP_FOR_PERIOD))));
		if(capPeriod.isDisplayed() && capPeriod.isEnabled()) {
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.CAP_FOR_PERIOD, LocatorsPath.MAX_TIME);
		}
		System.out.println("Success: verified 'CAP for Period' checkbox is enabled/disabled "
				+ "- selects if checkbox is enabled");
	}
	

	@Then("^User selects 'Rep Decide' checkbox - If it is Set to 'TRUE' then Rep can decide whether the Discount has to be applied for the respective customer or not$")
	public void user_selects_Rep_Decide_checkbox_If_it_is_Set_to_TRUE_then_Rep_can_decide_whether_the_Discount_has_to_be_applied_for_the_respective_customer_or_not() throws Throwable {
	 
		System.out.println("Attempt: select 'Rep Decide' checkbox - If it is Set to 'TRUE' then Rep can decide "
				+ "whether the Discount has to be applied for the respective customer or not");
		WebElement rep = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.REP_DECIDE))));
		if(rep.isDisplayed()) {
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.REP_DECIDE, LocatorsPath.MAX_TIME);
		}
		System.out.println("Attempt: selected 'Rep Decide' checkbox - If it is Set to 'TRUE' then Rep can decide "
				+ "whether the Discount has to be applied for the respective customer or not");
	}
	

	@Then("^User selects 'Start Date' range for the discount rule$")
	public void user_selects_Start_Date_range_for_the_discount_rule() throws Throwable {
	   
		System.out.println("Attempt: select 'Start Date' range for the discount rule");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.START_DATE_RULE, LocatorsPath.MAX_TIME, 
				CallObject.futureDate());
		System.out.println("Success: selected 'Start Date' range for the discount rule");
	}
	

	@Then("^User selects 'End Date' range for the discount rule$")
	public void user_selects_End_Date_range_for_the_discount_rule() throws Throwable {
	 
		System.out.println("Attempt: select 'End Date' range for the discount rule");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.END_DATE_RULE, LocatorsPath.MAX_TIME, 
				CallObject.futureDate());
		System.out.println("Success: selected 'End Date' range for the discount rule");
	}
	

	@Then("^User selects the 'Status' for the discount rule$")
	public void user_selects_the_Status_for_the_discount_rule() throws Throwable {
	
		System.out.println("Attempt: select the 'Status' for the discount rule");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.STATUS_1, LocatorsPath.MAX_TIME, 
				file1.getCellData("Discount Plan", "Status", 3));
		System.out.println("Success: selected the 'Status' for the discount rule");
	}
	

	@Then("^User clicks on save button and all the Discount rules should be saved successfully$")
	public void user_clicks_on_save_button_and_all_the_Discount_rules_should_be_saved_successfully() throws Throwable {
	   
		System.out.println("Attempt: click on save button and all the Discount "
				+ "rules should be saved successfully");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.DP_SAVE, LocatorsPath.MAX_TIME);
		user_verifies_the_Discount_Plan_list_section_is_available_in_Discount_Plan_screen();
		System.out.println("Success: clicked on save button and all the Discount "
				+ "rules should be saved successfully");
	}
	

	@Then("^User verifies if 'Rule Base' dropdown is selected as 'Value' then Offer type cannot be selected as 'Percent' - error message displays$")
	public void user_verifies_if_Rule_Base_dropdown_is_selected_as_Value_then_Offer_type_cannot_be_selected_as_Percent_error_message_displays() throws Throwable {
	
		System.out.println("User verifies if 'Rule Base' dropdown is selected as 'Value' "
				+ "then Offer type cannot be selected as 'Percent' - error message displays");
	}
	
	

	
	/**----------------------RCS_SaaS_Adding_Discount_Rules_Category_Customer_group--------------------------**/
	
	
	
	
	@Then("^User clicks on the Customer Group and navigates to the Customer Group screen$")
	public void user_clicks_on_the_Customer_Group_and_navigates_to_the_Customer_Group_screen() throws Throwable {
		
		newOutletCreationPage.user_clicks_on_Search_tab();
		newOutletCreationPage.the_User_should_be_navigated_to_customer_search_screen_successfully();
		newOutletCreationPage.user_clicks_on_Create_new_customer_button();
		newOutletCreationPage.the_user_selects_Customer_type_from_the_drop_down();
		newOutletCreationPage.user_selects_Status_from_drop_down();
		newOutletCreationPage.user_selects_Shopper_channel_from_dropdown();
		newOutletCreationPage.user_enters_Customer_name_in_the_Customer_Name_text_box();
		newOutletCreationPage.user_selects_Outlet_type_from_outlet_type_dropdown();
		newOutletCreationPage.user_selects_Outlet_subtype_from_outlet_subtype_dropdown();
		newOutletCreationPage.user_selects_Territory_from_Territory_dropdown();
		newOutletCreationPage.user_clicks_on_save_button_and_the_customer_should_be_created_successfully();
		newOutletCreationPage.user_navigates_to_the_Search_results_screen();
		configurationUsersPage.i_Click_on_Configiuration();
		customerGroupPage.user_clicks_on_the_Customer_Group_tab_navigates_to_the_Customer_Group_screen_successfully();
	}
	    

	@Then("^User selects the 'Group Settings' and clicks on the add button$")
	public void user_selects_the_Group_Settings_and_clicks_on_the_add_button() throws Throwable {
	    
		customerGroupPage.user_selects_the_Group_Type_as_DISCOUNT_GROUP_clicks_on_the_Add_button_to_create_Customer_Group();
	}
	

	@Then("^User enters all the mandatory fields for customer group and clicks on save button$")
	public void user_enters_all_the_mandatory_fields_for_customer_group_and_clicks_on_save_button() throws Throwable {
	    
		customerGroupPage.user_enters_the_following_mandatory_fields_Name_Group_Code_selects_the_Group_Type_as_DISCOUNT_GROUP_clicks_on_Save_button();
		customerGroupPage.user_verifies_the_record_is_saved_successfully();
	}
	

	@Then("^User clicks on add button in the 'Customer Group' section$")
	public void user_clicks_on_add_button_in_the_Customer_Group_section() throws Throwable {
	 
		customerGroupPage.user_clicks_on_the_Add_button_in_the_nd_Frame_to_add_customer_customers_verifies_the_Advanced_search_screen_is_displayed(0);
	}
	

	@Then("^User searches for the customer and adds the selected customer to the 'Customer Group'$")
	public void user_searches_for_the_customer_and_adds_the_selected_customer_to_the_Customer_Group() throws Throwable {
		
		customerGroupPage.user_selects_the_various_fields_and_clicks_on_Search_button();
		customerGroupPage.user_verifies_the_list_of_customers_is_displayed_who_belongs_to_the_search_criteria_User_selects_the_required_data();
		
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.GROUP_SETTINGS_ADD_BUTTON, LocatorsPath.MAX_TIME);
		
		WebElement msg = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.DP_SUCCESS_MESSAGE))));
		Assert.assertEquals("Customer Associated Successfully To The Customer Group !", 
				msg.getText());
	}
	

	@Then("^User clicks on 'Associate Discount Plan' and selects the 'Discount Plan'$")
	public void user_clicks_on_Associate_Discount_Plan_and_selects_the_Discount_Plan() throws Throwable {
	    
		System.out.println("Attempt: click on 'Associate Discount Plan' and select the 'Discount Plan'");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ASSOCIATE_DISC_PLAN, LocatorsPath.MAX_TIME);
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.SEARCH_RESULTS_DISPLAY, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.DISC_PLAN_SEARCH, LocatorsPath.MAX_TIME, 
				file1.getCellData("Discount Plan", "Name", 2));
		CallObject.block(3000);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.DISC_PLAN_SELECTION, LocatorsPath.MAX_TIME);
		System.out.println("Success: clicked on 'Associate Discount Plan' and selected the 'Discount Plan'");
	}

	
	@Then("^User clicks on save button and the Customer Group association should be added successfully$")
	public void user_clicks_on_save_button_and_the_Customer_Group_association_should_be_added_successfully() throws Throwable {
	    
		System.out.println("Attempt: click on save button and the Customer "
				+ "Group association should be added successfully");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.DISC_PLAN_SAVE, LocatorsPath.MAX_TIME);
		WebElement msg = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.DP_SUCCESS_MESSAGE))));
		Assert.assertEquals("Discount Plan Added Successfully !", msg.getText());
		System.out.println("Success: clicked on save button and the Customer Group "
				+ "association is added successfully");
	}
	

	@Then("^User navigates to search screen and searches for the customer$")
	public void user_navigates_to_search_screen_and_searches_for_the_customer() throws Throwable {
		
		System.out.println("Attempt: navigate to search screen and search for the customer");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.DP_SEARCH, LocatorsPath.MAX_TIME);
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.CUST_SEARCH_DISP, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.CUST_NUMBER, LocatorsPath.MAX_TIME, 
				file3.getCellData("AssortmentPlan", "Customer Num1", 2));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.SEARCH_BUTTON, LocatorsPath.MAX_TIME);
		System.out.println("Success: navigated to search screen and searched for the customer");
	}
	

	@Then("^User navigates to the 'Trading Terms' tab and verifies the 'Discount Plan field' displayed\\.$")
	public void user_navigates_to_the_Trading_Terms_tab_and_verifies_the_Discount_Plan_field_displayed() throws Throwable {
	    
		System.out.println("Attempt: navigate to the 'Trading Terms' "
				+ "tab and verify the 'Discount Plan field' displayed");
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.xpath(LocatorsPath.DP_TRADING_TERMS)));
		PageObjects.SelectByXpath(
				driver, LocatorsPath.DP_TRADING_TERMS, LocatorsPath.MAX_TIME);
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.SEARCH_DISC_PLAN_DISP)));
		WebElement disPlan = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SEARCH_DISC_PLAN_DISP))));
		Assert.assertEquals(file1.getCellData("Discount Plan", "Name", 2), 
				disPlan.getAttribute("value"));
		System.out.println("Success: navigated to the 'Trading Terms' "
				+ "tab and verified the 'Discount Plan field' displayed");
	}
	

	

	/**----------------------RCS_SaaS_Adding_Discount_Rules_Category_Customer_group_Duplicate--------------------------**/
	
	
	
	
	@Then("^User tries to add one more Discount Plan which has the same Date range$")
	public void user_tries_to_add_one_more_Discount_Plan_which_has_the_same_Date_range() throws Throwable {
	    
		user_clicks_on_the_Discount_Plan_and_navigates_to_the_Discount_Plan_screen();
		in_the_Discount_Plan_section_user_navigates_to_Add_Create_a_new_Discount_Plan_by_clicking_on_the_Create_Discount_Plan_Button();
		the_Create_Discount_Plan_page_should_be_opened_successfully();
		
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.NAME, LocatorsPath.MAX_TIME, CallObject.timestamp().concat("_DiscPlan"));
		file1.setCellData("Discount Plan", "Name", 3, 
				CallObject.timestamp().concat("_DiscPlan"));
		
		user_enters_the_CODE();
		user_enters_the_Description();
		user_selects_the_Status_dropdown_By_default_DRAFT_should_be_populated_while_creation();
		user_selects_Start_Date_range_for_the_discount_rule();
		user_selects_End_Date_range_for_the_discount_rule();
		user_clicks_on_save_button_and_verifies_the_New_Discount_Plan_is_created_with_all_the_required_fields_populated_One_discount_plan_should_be_associated_only_one_discount_Group();
	}
	

	@Then("^User navigates to the 'Customer Group' screen and clicks on 'Associate Discount Plan' and selects the 'Discount Plan' of same date range$")
	public void user_navigates_to_the_Customer_Group_screen_and_clicks_on_Associate_Discount_Plan_and_selects_the_Discount_Plan_of_same_date_range() throws Throwable {
	    
		System.out.println("Attempt: navigate to the 'Customer Group' screen and click on "
				+ "'Associate Discount Plan' and select the 'Discount Plan' of same date range");
		customerGroupPage.user_clicks_on_the_Customer_Group_tab_navigates_to_the_Customer_Group_screen_successfully();
		
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ASSOCIATE_DISC_PLAN, LocatorsPath.MAX_TIME);
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.SEARCH_RESULTS_DISPLAY, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.DISC_PLAN_SEARCH, LocatorsPath.MAX_TIME, 
				file1.getCellData("Discount Plan", "Name", 3));
		CallObject.block(3000);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.DISC_PLAN_SELECTION, LocatorsPath.MAX_TIME);
		System.out.println("Success: navigated to the 'Customer Group' screen and clicked on "
				+ "'Associate Discount Plan' and selected the 'Discount Plan' of same date range");
	}
	

	@Then("^when user tries to save the 'Associate Discount Plan' system should throw the error message as \"(.*?)\"\\.$")
	public void when_user_tries_to_save_the_Associate_Discount_Plan_system_should_throw_the_error_message_as(String arg1) throws Throwable {
		
		System.out.println("Attempt: try to save the 'Associate Discount Plan' "
				+ "system should throw the error message");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.DISC_PLAN_SAVE, LocatorsPath.MAX_TIME);
		WebElement msg = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.DP_ERROR_MSG))));
		Assert.assertEquals("Given Date Range Already Exist", 
				msg.getText());
		System.out.println("Success: error message displayed successfully");
	}
	

	
	
	/**----------------------RCS_SaaS_Copy_Discount_Plan--------------------------**/
	
	
	
	
	@Then("^In the Discount Plan section user navigates to Create a new Discount Plan by Clicking on 'Copy Discount Plan' button$")
	public void in_the_Discount_Plan_section_user_navigates_to_Create_a_new_Discount_Plan_by_Clicking_on_Copy_Discount_Plan_button() throws Throwable {
	    
		System.out.println("Attempt: navigate to Create a new Discount Plan "
				+ "by Clicking on 'Copy Discount Plan' button");
		user_clicks_on_the_Discount_Plan_and_navigates_to_the_Discount_Plan_screen();
		user_verifies_the_Discount_Plan_list_section_is_available_in_Discount_Plan_screen();
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.COPY_DISC_PLAN)));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.COPY_DISC_PLAN, LocatorsPath.MAX_TIME);
		System.out.println("Success: navigated to Create a new Discount Plan "
				+ "by Clicking on 'Copy Discount Plan' button");
	}
	

	@Then("^User verifies a copy of the selected Discount Plan with all the Rules will be displayed$")
	public void user_verifies_a_copy_of_the_selected_Discount_Plan_with_all_the_Rules_will_be_displayed() throws Throwable {
	    
		System.out.println("Attempt: verify a copy of the selected Discount Plan with "
				+ "all the Rules will be displayed");
		CallObject.block(3000);
		driver.switchTo().defaultContent();
		WebElement alert = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.COPY_DISC_PLAN_POPUP))));
		if(alert.isDisplayed()) {
		Assert.assertEquals("Do you want to continue with same plan date?", 
				alert.getText());
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.COPY_DISC_PLAN_OPTION, LocatorsPath.MAX_TIME);
		}else {
			Assert.fail("Alert not present");
		}
		System.out.println("Success: verified a copy of the selected Discount Plan with "
				+ "all the Rules is displayed");
	}
	

	@Then("^User specifies the values for all mandatory fields for the New Discount plan$")
	public void user_specifies_the_values_for_all_mandatory_fields_for_the_New_Discount_plan() throws Throwable {
		
		System.out.println("Attempt: specify the values for all mandatory fields for the New Discount plan");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.NAME, LocatorsPath.MAX_TIME, CallObject.timestamp().concat("_DiscPlan"));
		if(driver.getPageSource().contains("Create Discount Plan")) {
			Assert.fail("Header Details displayed");
		}else {
			System.out.println("Header details not displayed");
		}
		user_enters_the_CODE();
		user_enters_the_Description();
		user_selects_the_Status_dropdown_By_default_DRAFT_should_be_populated_while_creation();
		user_clicks_on_save_button_and_verifies_the_New_Discount_Plan_is_created_with_all_the_required_fields_populated_One_discount_plan_should_be_associated_only_one_discount_Group();
		System.out.println("Success: specified the values for all mandatory fields for the New Discount plan");
	}
	

	@Then("^User verifies that Discount Plan header Details will not be copied in the 'Copy Discount Plan' screen\\.$")
	public void user_verifies_that_Discount_Plan_header_Details_will_not_be_copied_in_the_Copy_Discount_Plan_screen() throws Throwable {
	 
		System.out.println("Attempt: verify that Discount Plan header Details will "
				+ "not be copied in the 'Copy Discount Plan' screen");
		WebElement errorMsg = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.DP_ERROR_MSG))));
		Assert.assertEquals("Discount Group with this name Already Exist", errorMsg.getText());
		System.out.println("Success: verified that Discount Plan header Details not "
				+ "copied in the 'Copy Discount Plan' screen");
	}
	

	
	
	/**----------------------RCS_SaaS_Copy_Discount_Rule--------------------------**/
	
	
	
	
	
	@Then("^In the Discount Plan section user navigates to Create a new Discount rule by Clicking on 'Copy Discount Rule'$")
	public void in_the_Discount_Plan_section_user_navigates_to_Create_a_new_Discount_rule_by_Clicking_on_Copy_Discount_Rule() throws Throwable {
		
		System.out.println("Attempt: navigate to Create a new Discount rule by Clicking on 'Copy Discount Rule'");
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.DISC_PLAN_NAME_SEAR_FIELD)))).clear();
		CallObject.block(1000);
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.DISC_PLAN_NAME_SEAR_FIELD, LocatorsPath.MAX_TIME, 
				file1.getCellData("Discount Plan", "Name", 2));
		CallObject.block(3000);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.DISC_PLAN_REFRESH, LocatorsPath.MAX_TIME);
		System.out.println("Success: navigated to the Create a new Discount rule by Clicking on 'Copy Discount Rule'");
	}
	

	@Then("^User selects a 'Discount Rule' for which the Copy of the selected Discount rule should be created$")
	public void user_selects_a_Discount_Rule_for_which_the_Copy_of_the_selected_Discount_rule_should_be_created() throws Throwable {
	 
		System.out.println("Attempt: select a 'Discount Rule' for which the Copy of the "
				+ "selected Discount rule should be created");
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.xpath(LocatorsPath.DISCOUNT_RULES_DISPLAY)));
		WebElement row1 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.DISC_RULE_ROW_1))));
		if(row1.isDisplayed()) {
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.DISC_RULE_SELECTION, LocatorsPath.MAX_TIME);
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.COPY_DISC_RULE, LocatorsPath.MAX_TIME);
		}else {
			org.testng.Assert.fail("Disc rule row/copy button is not displayed");
		}
		System.out.println("Success: selected a 'Discount Rule' for which the Copy of the "
				+ "selected Discount rule should be created");
	}
	

	@Then("^User specifies the required values for the New Discount rule which is created through 'Copy Discount Rule'$")
	public void user_specifies_the_required_values_for_the_New_Discount_rule_which_is_created_through_Copy_Discount_Rule() throws Throwable {
	   
		System.out.println("User specifies the required values for the New "
				+ "Discount rule which is created through 'Copy Discount Rule'");
	}
	

	@Then("^User verifies that 'Min' and 'Max' values not copied through 'Copy Discount Rule'$")
	public void user_verifies_that_Min_and_Max_values_not_copied_through_Copy_Discount_Rule() throws Throwable {
		
		System.out.println("Attempt: verify that 'Min' and 'Max' values not copied through 'Copy Discount Rule'");
	    WebElement row2 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.DISC_RULE_ROW_2))));
		if(row2.isDisplayed()) {
			
			WebElement min = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.DISC_RULE_MIN_VALUE))));
			org.testng.Assert.assertEquals("0.000", min.getText());
			
			WebElement max = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.DISC_RULE_MAX_VALUE))));
			org.testng.Assert.assertEquals("0.000", max.getText());
		}else {
			org.testng.Assert.fail("'Min' and 'Max' values copied through 'Copy Discount Rule'");
		}
		System.out.println("Success: verified that 'Min' and 'Max' values not copied through 'Copy Discount Rule'");
	}
	

	
	/**----------------------RCS_SaaS_Discount_Plan_Group_Name--------------------------**/
	
	
	
	
	@Then("^User verifies the 'Group Name' field in 'Customer Group' section is a Hyperlink$")
	public void user_verifies_the_Group_Name_field_in_Customer_Group_section_is_a_Hyperlink() throws Throwable {
	
		in_the_Discount_Plan_section_user_navigates_to_Create_a_new_Discount_rule_by_Clicking_on_Copy_Discount_Rule();
		user_verifies_the_Customer_Groups_section_is_available_in_Discount_Plan_screen();
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.CUSTOMER_GROUPS_ROW)));
		WebElement row = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.CUSTOMER_GROUPS_ROW))));
		if(row.isDisplayed()) {
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.CUSTOMER_GROUPS_NAMEFIELD, LocatorsPath.MAX_TIME);
		}else {
			org.testng.Assert.fail("'Group Name' field in 'Customer Group' section is not displayed");
		}
	}
	

	@Then("^User clicks on the hyperlink and navigates to Customer group details screen$")
	public void user_clicks_on_the_hyperlink_and_navigates_to_Customer_group_details_screen() throws Throwable {
	    
		System.out.println("Attempt: click on the hyperlink and "
				+ "navigate to Customer group details screen");
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.SEARCH_RESULTS_DISP, LocatorsPath.MAX_TIME);
		System.out.println("Success: clicked on the hyperlink and n"
				+ "avigated to Customer group details screen");
	}
	

	@Then("^User should be able to add/delete the customers in the group\\.$")
	public void user_should_be_able_to_add_delete_the_customers_in_the_group() throws Throwable {
	    
		System.out.println("Attempt: should be able to add/delete the customers in the group");
		WebElement row = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.CUST_GROUP_FOR_ROW))));
		if(row.isDisplayed()) {
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.CUST_GROUP_FOR_CHECKBOX, LocatorsPath.MAX_TIME);
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.CUST_GROUP_FOR_DELETE, LocatorsPath.MAX_TIME);
			CallObject.switchToAlert(driver);
		}else {
			org.testng.Assert.fail("add/delete the customers in the group is not displayed");
		}
		System.out.println("Success: add/delete the customers in the group is verifies successfully");
	}
}
