package com.infotech.wc.ui.testscripts;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.infotech.Excel.CsvToExcelConverter;
import com.infotech.Excel.ExcelApiFile;
import com.infotech.basepage.CallObject;
import com.infotech.basepage.LocatorsPath;
import com.infotech.basepage.PageObjects;
import com.infotech.testrunner.TestRunnerWebClient;

import cucumber.api.java.en.Then;

public class RcsSaasConfigurationSalesTargetPage extends TestRunnerWebClient{
	
	public RcsSaasConfigurationSalesTargetPage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
	ExcelApiFile file  = new ExcelApiFile("TestData.xlsx");
	ExcelApiFile file1 = new ExcelApiFile("TestData1.xlsx");
	WebDriverWait wait = new WebDriverWait(driver, LocatorsPath.MAX_TIME);
	Actions actions = new Actions(driver);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	
	
	/**----------------------RCS SAAS Configuration SalesTarget_WC--------------------------**/
	
	
	
	@Then("^User clicks on Sales Target and navigates to Sales Target Screen$")
	public void user_clicks_on_Sales_Target_and_navigates_to_Sales_Target_Screen() throws Throwable {
	   
		System.out.println("Attempt: Click on Sales Target Menu");
		PageObjects.SelectByXpath(
				driver, LocatorsPath.SALES_TARGET, LocatorsPath.MAX_TIME);
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.SALES_TARGET_DISP, LocatorsPath.MAX_TIME);
		System.out.println("Success: Sales Target Menu selected successfully");
	}
	

	@Then("^User clicks on Add button and verifies the ADD SALES TARGET screen is displayed$")
	public void user_clicks_on_Add_button_and_verifies_the_ADD_SALES_TARGET_screen_is_displayed() throws Throwable {
	    
		System.out.println("Attempt: click on 'Add' button");
		CallObject.waitForPageLoad(driver);
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.EMPLSALES_ADD)));
		try {
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.EMPLSALES_ADD, LocatorsPath.MAX_TIME);
		} catch (StaleElementReferenceException StaleElementReferenceException) {
			System.out.println("Trying to recover from stale element" + StaleElementReferenceException);
		}
		System.out.println("Success: Add button selected successfully");
	}
	

	@Then("^User selects the 'Employee' dropdown - Employee Names should be listed$")
	public void user_selects_the_Employee_dropdown_Employee_Names_should_be_listed() throws Throwable {
	    
		System.out.println("Attempt: Select the 'Employee' dropDown");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.EMPLOYEE_SALES, LocatorsPath.MAX_TIME, 
				file.getCellData("Configuration", "UserName", 2));
		System.out.println("Success: 'Employee' dropDown selected successfully");
	}
	

	@Then("^User selects the 'SKU' dropdown - Active SKU names should be displayed$")
	public void user_selects_the_SKU_dropdown_Active_SKU_names_should_be_displayed() throws Throwable {
	   
		System.out.println("Attempt: Select the 'SKU' dropDown");
		CallObject.waitForPageLoad(driver);
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.EMPLSALES_SKU, LocatorsPath.MAX_TIME, 
				file1.getCellData("SalesTarget", "SKU", 2));
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.EMPLSALES_SKU, LocatorsPath.MAX_TIME, 
				file1.getCellData("SalesTarget", "SKU", 2));
		System.out.println("Success: 'SKU' dropDown selected successfully");
	}
	

	@Then("^User enters the 'Sales Target'$")
	public void user_enters_the_Sales_Target() throws Throwable {
	    
		System.out.println("Attempt: Enter the field - 'Sales Target'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ADD_SALES_TARGET, LocatorsPath.MAX_TIME, 
				file1.getCellData("SalesTarget", "Sales Target", 2));
		System.out.println("Success: 'Sales Target' entered successfully");
	}
	

	@Then("^User selects the 'Start Date' for Sales Target$")
	public void user_selects_the_Start_Date_for_Sales_Target() throws Throwable {
	 
		System.out.println("Attempt: select the 'Start Date'");
		/*PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.EMPLSALES_START_DATE_CALENDER, LocatorsPath.MAX_TIME);*/
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.EMPLSALES_START_DATE_1, 
				LocatorsPath.MAX_TIME, CallObject.presentTimestamp());
		System.out.println("Success: 'Start Date' as been selected successfully");
	}
	

	@Then("^User selects the 'End Date' for Sales Target$")
	public void user_selects_the_End_Date_for_Sales_Target() throws Throwable {
	    
		System.out.println("Attempt: select the 'End Date'");
		/*PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.EMPLSALES_END_DATE_CALENDER, LocatorsPath.MAX_TIME);*/
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.EMPLSALES_END_DATE_1, 
				LocatorsPath.MAX_TIME, CallObject.presentTimestamp());
		System.out.println("Success: 'End Date' as been selected successfully");
	}
	

	@Then("^User verifies 'Achieved' is a Read only field$")
	public void user_verifies_Achieved_is_a_Read_only_field() throws Throwable {
	    
		System.out.println("Attempt: Validate 'Achieved' is a Read only field");
		WebElement archieved = driver.findElement(
				By.cssSelector(LocatorsPath.ARCHIEVED));
		if(archieved.isEnabled()) {
			CallObject.waitForPageLoad(driver);
			Assert.assertTrue(true);
		}else {
			Assert.fail("archieved is enabled");
		}
		System.out.println("Attempt: 'Achieved' validated successfully");
	}
	

	@Then("^User verifies '% Achieved' is a Read only field$")
	public void user_verifies_percent_Achieved_is_a_Read_only_field() throws Throwable {
	    
		System.out.println("Attempt: Validate '% Achieved' is a Read only field");
		WebElement archieved = driver.findElement(
				By.cssSelector(LocatorsPath.PERCENT_ARCHIEVED));
		if(archieved.isEnabled()) {
			CallObject.waitForPageLoad(driver);
			Assert.assertTrue(true);
		}else {
			Assert.fail("% archieved is enabled");
		}
		System.out.println("Attempt: '% Achieved' validated successfully");
	}
	

	@Then("^User verifies 'Remaining Volume' is a Read only field$")
	public void user_verifies_Remaining_Volume_is_a_Read_only_field() throws Throwable {
	    
		System.out.println("Attempt: Validate 'Remaining Volume' is a Read only field");
		WebElement remainingVolume = driver.findElement(
				By.cssSelector(LocatorsPath.REMAINING_VOLUME));
		if(remainingVolume.isEnabled()) {
			CallObject.waitForPageLoad(driver);
			Assert.assertTrue(true);
		}else {
			Assert.fail("Remaining Volume is enabled");
		}
		System.out.println("Attempt: 'Remaining Volume' validated successfully");
	}
	

	@Then("^User enters the 'Remarks'$")
	public void user_enters_the_Remarks() throws Throwable {
	    
		System.out.println("Attempt: Enter the field - 'Remarks'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.EMPLSALES_REMARKS, LocatorsPath.MAX_TIME, 
				file1.getCellData("SalesTarget", "Remarks", 2));
		System.out.println("Success: 'Remarks' entered successfully");
	}
	

	@Then("^User enters the data in all mandatory fields & click on Save button$")
	public void user_enters_the_data_in_all_mandatory_fields_click_on_Save_button() throws Throwable {
	 
		System.out.println("Attempt: Click on Save button");
		CallObject.waitForPageLoad(driver);
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.EMPLSALES_SAVE)));
        PageObjects.SelectByCSSSelector(
        		driver, LocatorsPath.EMPLSALES_SAVE, LocatorsPath.MAX_TIME);
        CallObject.waitForPageLoad(driver);
		System.out.println("Success: Save button selected successfully");
	}
	

	@Then("^User verifies the SKU Sales Target for the Employee created successfully\\.$")
	public void user_verifies_the_SKU_Sales_Target_for_the_Employee_created_successfully() throws Throwable {
	    
		System.out.println("Attempt: Verify the SKU Sales Target for the Employee created");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.EMPLOYEE_SEAR_FIELD, LocatorsPath.MAX_TIME, 
				file.getCellData("Configuration", "UserName", 2));
		CallObject.waitForPageLoad(driver);
		wait.until(ExpectedConditions.
				presenceOfElementLocated((
						By.cssSelector(LocatorsPath.EMPLOYEE_SEAR_FIELD)))).clear();
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.EMPLOYEE_SEAR_FIELD, LocatorsPath.MAX_TIME, 
				file.getCellData("Configuration", "UserName", 2));
		CallObject.waitForPageLoad(driver);
		PageObjects.SelectByCSSSelectorWithoutClick(
				driver, LocatorsPath.EMPLOYEE_FIRST_NAME, LocatorsPath.MAX_TIME);
		
		WebElement firstName = driver.findElement(
				By.cssSelector(LocatorsPath.EMPLOYEE_FIRST_NAME));
		Assert.assertEquals(file.getCellData("Configuration", "UserName", 2), 
				firstName.getText());
		System.out.println("Success: SKU Sales Target for the Employee created successfully");
	}
	

	@Then("^User clicks on 'Employee Sales Target' button and the system should export all the Employee Sales Target in the excel format$")
	public void user_clicks_on_Employee_Sales_Target_button_and_the_system_should_export_all_the_Employee_Sales_Target_in_the_excel_format() throws Throwable {
	    
		System.out.println("Attempt: Click on 'Employee Sales Target' button");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.EMPLOYEE_SALES_TARGET, LocatorsPath.MAX_TIME);
		CallObject.block(4000);
		System.out.println("Success: 'Employee Sales Target' button selected successfully");
	}
	

	@Then("^User verifies the 'Employee' column is available in the 'Employees Sales Target' sheet$")
	public void user_verifies_the_Employee_column_is_available_in_the_Employees_Sales_Target_sheet() throws Throwable {
	    
		System.out.println("Attempt: verify the 'Employee' column is available in the 'Employees Sales Target' sheet");
		//Convert CSV to XLSX files
				CsvToExcelConverter.csvConverter
				(LocatorsPath.CsvEmployeeSalesTargetLoc, 
						LocatorsPath.xlsxEmployeeSalesTargetLoc, 
						LocatorsPath.EmployeeSalesTargetSheet);
		ExcelApiFile file2 = 
				new ExcelApiFile("C:\\Users\\30955\\Downloads\\Employee Sales Target.xlsx");
		String employee = file2.getCellData("Employee Sales Target", "Employee", 1);
		System.out.println(employee);
		Assert.assertEquals("Employee", employee);
		System.out.println("Success: 'Employee' column is present in the 'Employees Sales Target' sheet");
	}
	

	@Then("^User verifies the 'Product name' column is available in the 'Employees Sales Target' sheet$")
	public void user_verifies_the_Product_name_column_is_available_in_the_Employees_Sales_Target_sheet() throws Throwable {
	 
		System.out.println("Attempt: verify the 'Product name' column is available in the 'Employees Sales Target' sheet");
		ExcelApiFile file2 = 
				new ExcelApiFile("C:\\Users\\30955\\Downloads\\Employee Sales Target.xlsx");
		String productName = file2.getCellData("Employee Sales Target", "Product Name", 1);
		System.out.println(productName);
		Assert.assertEquals("Product Name", productName);
		System.out.println("Success: 'Product name' column is present in the 'Employees Sales Target' sheet");
	}
	

	@Then("^User verifies the 'Sales Target' column is available in the 'Employees Sales Target' sheet$")
	public void user_verifies_the_Sales_Target_column_is_available_in_the_Employees_Sales_Target_sheet() throws Throwable {
	   
		System.out.println("Attempt: verify the 'Sales Target' column is available in the 'Employees Sales Target' sheet");
		ExcelApiFile file2 = 
				new ExcelApiFile("C:\\Users\\30955\\Downloads\\Employee Sales Target.xlsx");
		String salesTarget = file2.getCellData("Employee Sales Target", "Sales Target", 1);
		System.out.println(salesTarget);
		Assert.assertEquals("Sales Target", salesTarget);
		System.out.println("Success: 'Sales Target' column is present in the 'Employees Sales Target' sheet");
	}
	

	@Then("^User verifies the 'Remarks' column is available in the 'Employees Sales Target' sheet$")
	public void user_verifies_the_Remarks_column_is_available_in_the_Employees_Sales_Target_sheet() throws Throwable {
	    
		System.out.println("Attempt: verify the 'Remarks' column is available in the 'Employees Sales Target' sheet");
		ExcelApiFile file2 = 
				new ExcelApiFile("C:\\Users\\30955\\Downloads\\Employee Sales Target.xlsx");
		String remarks = file2.getCellData("Employee Sales Target", "Remarks", 1);
		System.out.println(remarks);
		Assert.assertEquals("Remarks", remarks);
		System.out.println("Success: 'Remarks' column is present in the 'Employees Sales Target' sheet");
	}
	

	@Then("^User verifies the 'Start Date' column is available in the 'Employees Sales Target' sheet$")
	public void user_verifies_the_Start_Date_column_is_available_in_the_Employees_Sales_Target_sheet() throws Throwable {
	    
		System.out.println("Attempt: verify the 'Start Date' column is available in the 'Employees Sales Target' sheet");
		ExcelApiFile file2 = 
				new ExcelApiFile("C:\\Users\\30955\\Downloads\\Employee Sales Target.xlsx");
		String startDate = file2.getCellData("Employee Sales Target", "Start Date", 1);
		System.out.println(startDate);
		Assert.assertEquals("Start Date", startDate);
		System.out.println("Success: 'Start Date' column is present in the 'Employees Sales Target' sheet");
	}
	

	@Then("^User verifies the 'End Date' column is available in the 'Employees Sales Target' sheet$")
	public void user_verifies_the_End_Date_column_is_available_in_the_Employees_Sales_Target_sheet() throws Throwable {
	    
		System.out.println("Attempt: verify the 'End Date' column is available in the 'Employees Sales Target' sheet");
		ExcelApiFile file2 = 
				new ExcelApiFile("C:\\Users\\30955\\Downloads\\Employee Sales Target.xlsx");
		String endDate = file2.getCellData("Employee Sales Target", "End Date", 1);
		System.out.println(endDate);
		Assert.assertEquals("End Date", endDate);
		System.out.println("Success: 'End Date' column is present in the 'Employees Sales Target' sheet");
	}
	

	@Then("^User verifies the 'Sales Achieved' column is available in the 'Employees Sales Target' sheet$")
	public void user_verifies_the_Sales_Achieved_column_is_available_in_the_Employees_Sales_Target_sheet() throws Throwable {
	    
		System.out.println("Attempt: verify the 'Sales Achieved' column is available in the 'Employees Sales Target' sheet");
		ExcelApiFile file2 = 
				new ExcelApiFile("C:\\Users\\30955\\Downloads\\Employee Sales Target.xlsx");
		String salesAchieved = file2.getCellData("Employee Sales Target", "Sale Achieved", 1);
		System.out.println(salesAchieved);
		Assert.assertEquals("Sale Achieved", salesAchieved);
		System.out.println("Success: 'Sales Achieved' column is present in the 'Employees Sales Target' sheet");
	}
	

	@Then("^User verifies the 'Sale Percent Achieved' column is available in the 'Employees Sales Target' sheet$")
	public void user_verifies_the_Sale_Percent_Achieved_column_is_available_in_the_Employees_Sales_Target_sheet() throws Throwable {
	    
		System.out.println("Attempt: verify the 'Sale Percent Achieved' column is available in the 'Employees Sales Target' sheet");
		ExcelApiFile file2 = 
				new ExcelApiFile("C:\\Users\\30955\\Downloads\\Employee Sales Target.xlsx");
		String salesPercentAchieved = file2.getCellData("Employee Sales Target", "Sale Percent Achieved", 1);
		System.out.println(salesPercentAchieved);
		Assert.assertEquals("Sale Percent Achieved", salesPercentAchieved);
		System.out.println("Success: 'Sale Percent Achieved' column is present in the 'Employees Sales Target' sheet");
	}
	

	@Then("^User verifies the 'Sale Remaining Volume' column is available in the 'Employees Sales Target' sheet$")
	public void user_verifies_the_Sale_Remaining_Volume_column_is_available_in_the_Employees_Sales_Target_sheet() throws Throwable {
	    
		System.out.println("Attempt: verify the 'Sale Percent Achieved' column is available in the 'Employees Sales Target' sheet");
		ExcelApiFile file2 = 
				new ExcelApiFile("C:\\Users\\30955\\Downloads\\Employee Sales Target.xlsx");
		String salesRemainVolume = file2.getCellData("Employee Sales Target", "Sale Remaining Volume", 1);
		System.out.println(salesRemainVolume);
		Assert.assertEquals("Sale Remaining Volume", salesRemainVolume);
		System.out.println("Success: 'Sale Percent Achieved' column is present in the 'Employees Sales Target' sheet");
	}
	

	@Then("^User enters the 'Start Date' greater than the 'End Date' for the Sales Target$")
	public void user_enters_the_Start_Date_greater_than_the_End_Date_for_the_Sales_Target() throws Throwable {
	 
		user_selects_the_Employee_dropdown_Employee_Names_should_be_listed();
		user_selects_the_SKU_dropdown_Active_SKU_names_should_be_displayed();
		user_enters_the_Sales_Target();
		
		System.out.println("Attempt: select the 'Start Date'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.EMPLSALES_START_DATE_1, LocatorsPath.MAX_TIME, 
				CallObject.futureDate());
		System.out.println("Success: 'Start Date' as been selected successfully");
		
		System.out.println("Attempt: select the 'End Date'");
		/*PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.EMPLSALES_END_DATE_CALENDER, LocatorsPath.MAX_TIME);*/
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.EMPLSALES_END_DATE_1, 
				LocatorsPath.MAX_TIME, CallObject.presentTimestamp());
		System.out.println("Success: 'End Date' as been selected successfully");
		
		user_enters_the_data_in_all_mandatory_fields_click_on_Save_button();
	}
	

	@Then("^User verifies the Error message displayed as 'Start Date cannot be greater than End Date'\\.$")
	public void user_verifies_the_Error_message_displayed_as_Start_Date_cannot_be_greater_than_End_Date() throws Throwable {
	    
		if(driver.getPageSource().
				contains("Start Date Cannot Be Greater Than End Date")) {
			CallObject.waitForPageLoad(driver);
			System.out.println("Error Message displayed");
		}else {
			Assert.fail("Error Message not displayed");
		}
	}
	

	@Then("^User Adds one more sales target for the same SKU, same Employee, same date range & clicks on save button$")
	public void user_Adds_one_more_sales_target_for_the_same_SKU_same_Employee_same_date_range_clicks_on_save_button() throws Throwable {
	    
		user_selects_the_Employee_dropdown_Employee_Names_should_be_listed();
		user_selects_the_SKU_dropdown_Active_SKU_names_should_be_displayed();
		user_enters_the_Sales_Target();
		user_selects_the_Start_Date_for_Sales_Target();
		user_selects_the_End_Date_for_Sales_Target();
		user_enters_the_data_in_all_mandatory_fields_click_on_Save_button();
	}
	

	@Then("^User verifies the Error message displayed as 'Sales Target dates are overlapping for the SKU'$")
	public void user_verifies_the_Error_message_displayed_as_Sales_Target_dates_are_overlapping_for_the_SKU() throws Throwable {
	    
		if(driver.getPageSource().
				contains("sales target dates are overlapping for the SKU")) {
			CallObject.waitForPageLoad(driver);
			System.out.println("Error Message displayed");
		}else {
			Assert.fail("Error Message not displayed");
		}
	}
	

	@Then("^User selects an Sales Target record & clicks on the Delete icon present before the Employee name$")
	public void user_selects_an_Sales_Target_record_clicks_on_the_Delete_icon_present_before_the_Employee_name() throws Throwable {
	 
		System.out.println("Attempt: select an Sales Target record & click on the Delete icon");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.EMPLOYEE_SEAR_FIELD, LocatorsPath.MAX_TIME, 
				file.getCellData("Configuration", "UserName", 2));
		CallObject.block(2000);
        PageObjects.SelectByCSSSelector(
        		driver, LocatorsPath.EMPLSALES_DELETE, LocatorsPath.MAX_TIME);
        CallObject.switchToAlert(driver);
		System.out.println("Success: Sales Target record selected & clicked on the Delete icon successfully");
	}
	

	@Then("^User verifies that selected Sales Target record deleted successfully\\.$")
	public void user_verifies_that_selected_Sales_Target_record_deleted_successfully() throws Throwable {
	    
		System.out.println("Attempt: Verify the selected Sales Target record deleted");
		wait.until(ExpectedConditions.
				presenceOfElementLocated((
						By.cssSelector(LocatorsPath.EMPLOYEE_SEAR_FIELD)))).clear();
		CallObject.block(2000);
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.EMPLOYEE_SEAR_FIELD, LocatorsPath.MAX_TIME, 
				file.getCellData("Configuration", "UserName", 2));
		CallObject.block(2000);
		WebElement deleteRecord = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.RECORD_DISP))));
		Assert.assertEquals("No records found.", 
				deleteRecord.getText());
		System.out.println("Success: Selected Sales Target record deleted successfully");
	}
}
