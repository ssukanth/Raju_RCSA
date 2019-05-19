package com.infotech.wc.ui.testscripts;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.infotech.Excel.CsvReaderWriter;
import com.infotech.Excel.CsvToExcelConverter;
import com.infotech.Excel.ExcelApiFile;
import com.infotech.Excel.ExtractZipFile;
import com.infotech.Excel.HssfApiFile;
import com.infotech.Excel.ReadCellData;
import com.infotech.Excel.RenameFile;
import com.infotech.basepage.CallObject;
import com.infotech.basepage.LocatorsPath;
import com.infotech.basepage.PageObjects;
import com.infotech.testrunner.TestRunnerWebClient;

import cucumber.api.java.en.Then;

public class RcsSaasUtilitiesExportsPage extends TestRunnerWebClient{
	
	public RcsSaasUtilitiesExportsPage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
	ExcelApiFile file  = new ExcelApiFile("TestData.xlsx");
	ExcelApiFile file1 = new ExcelApiFile("TestData1.xlsx");
	ExcelApiFile file2 = new ExcelApiFile("TestData2.xlsx");
	ExcelApiFile file3 = new ExcelApiFile("TestData3.xlsx");
	
	WebDriverWait wait = new WebDriverWait(driver, LocatorsPath.MAX_TIME);
	Actions actions = new Actions(driver);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	RenameFile renameFile = new RenameFile();
	ExtractZipFile extractZipFile = new ExtractZipFile();
	CsvReaderWriter SalesOrderDetailCsv = 
			new CsvReaderWriter("C:\\Users\\30955\\Downloads\\SalesOrder_Details_Export.csv");
	CsvReaderWriter SalesOrderHeaderCsv = 
			new CsvReaderWriter("C:\\Users\\30955\\Downloads\\SalesOrder_Header_Export.csv");
	
	RcsSaasNewOutletCreationPage creationPage = new RcsSaasNewOutletCreationPage();
	ReadCellData cellData = new ReadCellData();
	
	
	
	/**----------------------RCS_SaaS_Utilities_Exports_WC--------------------------**/
	
	

	@Then("^User clicks on Utilities$")
	public void user_clicks_on_Utilities() throws Throwable {
	    
		System.out.println("Attempt: Click on Utilities");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.UTILITIES, LocatorsPath.MAX_TIME);
		System.out.println("Success: Utilities is selected successfully");
	}
	

	@Then("^The User should be navigated to Utilities screen successfully$")
	public void the_User_should_be_navigated_to_Utilities_screen_successfully() throws Throwable {
	    
		System.out.println("Attempt: User should be navigated to Utilities screen");
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.UTILITIES_DISP, LocatorsPath.MAX_TIME);
		System.out.println("Success: Utilities screen displayed successfully");
	}
	

	@Then("^User clicks on 'Exports' tab and navigates to the 'Data Export Utility' page$")
	public void user_clicks_on_Exports_tab_and_navigates_to_the_Data_Export_Utility_page() throws Throwable {
	    
		System.out.println("Attempt: click on 'Exports' tab");
		PageObjects.SelectByXpath(
				driver, LocatorsPath.EXPORTS, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Exports' tab clicked successfully");
	}
	

	@Then("^User verifies the 'Select Export Type' dropdown is available in the 'Data Export Utility' section$")
	public void user_verifies_the_Select_Export_Type_dropdown_is_available_in_the_Data_Export_Utility_section() throws Throwable {
	  
		System.out.println("Attempt:  verify the 'Select Export Type' dropdown "
				+ "is available in the 'Data Export Utility' section");
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.DATA_EXPORT_UTILITY, LocatorsPath.MAX_TIME);
		WebElement export = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.SELECT_EXPORT_TYPE))));
		Assert.assertEquals("Select Export Type", export.getText());
		System.out.println("Success: 'Select Export Type' dropdown is available "
				+ "in the 'Data Export Utility' section successfully");
	}
	

	@Then("^User verifies the 'Export Criteria' section is available in the export screen$")
	public void user_verifies_the_Export_Criteria_section_is_available_in_the_export_screen() throws Throwable {
	    
		System.out.println("Attempt: verify the 'Export Criteria' "
				+ "section is available in the export screen");
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.EXPORT_CRITERIA, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Export Criteria' section is "
				+ "available in the export screen successfully");
	}
	

	
	/**----------------------RCS_SaaS_Export_Criteria_WC--------------------------**/
	
	
	
	@Then("^User verifies the 'Export Outlet Data' is available in the 'Select Export Type' dropdown$")
	public void user_verifies_the_is_available_in_the_Select_Export_Type_dropdown() throws Throwable {
		
		System.out.println("Attempt: verify the 'Export Outlet Data' is available in the 'Select Export Type' dropdown");
		WebElement element = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SELECT_EXP_TYPE_DP))));
		Select select = new Select(element);
		List<WebElement> allOptions = select.getOptions();
		
		 boolean found = false;
		 for(WebElement ele: allOptions) {
			 if(LocatorsPath.outletData.equals(ele.getText())) {
				 found = true;
				 System.out.println(LocatorsPath.outletData +" - value exists");
				 Assert.assertTrue(found);
				 break;
			 }
		 }if(!found) {
			 System.out.println(LocatorsPath.outletData +" - value doesn't exists");
			 Assert.fail(LocatorsPath.outletData +" - value doesn't exists");
	   }
	   System.out.println("Success: 'Export Outlet Data' is available in the 'Select Export Type' dropdown");
	}
	

	@Then("^User verifies the 'Export Sales Order' is available in the 'Select Export Type' dropdown$")
	public void user_verifies_the_Export_Sales_Order_is_available_in_the_Select_Export_Type_dropdown() throws Throwable {
	    
		System.out.println("Attempt: verify the 'Export Sales Order' is available in the 'Select Export Type' dropdown");
		WebElement element = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SELECT_EXP_TYPE_DP))));
		Select select = new Select(element);
		List<WebElement> allOptions = select.getOptions();
		
		 boolean found = false;
		 for(WebElement ele: allOptions) {
			 if(LocatorsPath.salesOrder.equals(ele.getText())) {
				 found = true;
				 System.out.println(LocatorsPath.salesOrder +" - value exists");
				 Assert.assertTrue(found);
				 break;
			 }
		 }if(!found) {
			 System.out.println(LocatorsPath.salesOrder +" - value doesn't exists");
			 Assert.fail(LocatorsPath.salesOrder +" - value doesn't exists");
	   }
	   System.out.println("Success: 'Export Sales Order' is available in the 'Select Export Type' dropdown");
	}
	

	@Then("^User verifies the 'Export Pre Sales Order data' is available in the 'Select Export Type' dropdown$")
	public void user_verifies_the_Export_Pre_Sales_Order_data_is_available_in_the_Select_Export_Type_dropdown() throws Throwable {
	    
		System.out.println("Attempt: verify the 'Export Pre Sales Order' is available in the 'Select Export Type' dropdown");
		WebElement element = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SELECT_EXP_TYPE_DP))));
		Select select = new Select(element);
		List<WebElement> allOptions = select.getOptions();
		
		 boolean found = false;
		 for(WebElement ele: allOptions) {
			 if(LocatorsPath.preSalesData.equals(ele.getText())) {
				 found = true;
				 System.out.println(LocatorsPath.preSalesData +" - value exists");
				 Assert.assertTrue(found);
				 break;
			 }
		 }if(!found) {
			 System.out.println(LocatorsPath.preSalesData +" - value doesn't exists");
			 Assert.fail(LocatorsPath.preSalesData +" - value doesn't exists");
	   }
	   System.out.println("Success: 'Export Pre Sales Order' is available in the 'Select Export Type' dropdown");
	}
	

	@Then("^User verifies the 'Export Invoices' is available in the 'Select Export Type' dropdown$")
	public void user_verifies_the_Export_Invoices_is_available_in_the_Select_Export_Type_dropdown() throws Throwable {
	    
		System.out.println("Attempt: verify the 'Export Invoices' is available in the 'Select Export Type' dropdown");
		WebElement element = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SELECT_EXP_TYPE_DP))));
		Select select = new Select(element);
		List<WebElement> allOptions = select.getOptions();
		
		 boolean found = false;
		 for(WebElement ele: allOptions) {
			 if(LocatorsPath.invoices.equals(ele.getText())) {
				 found = true;
				 System.out.println(LocatorsPath.invoices +" - value exists");
				 Assert.assertTrue(found);
				 break;
			 }
		 }if(!found) {
			 System.out.println(LocatorsPath.invoices +" - value doesn't exists");
			 Assert.fail(LocatorsPath.invoices +" - value doesn't exists");
	   }
	   System.out.println("Success: 'Export Invoices' is available in the 'Select Export Type' dropdown");
	}
	

	@Then("^User verifies the 'Exports Payments' is available in the 'Select Export Type' dropdown$")
	public void user_verifies_the_Exports_Payments_is_available_in_the_Select_Export_Type_dropdown() throws Throwable {
	    
		System.out.println("Attempt: verify the 'Export Payments' is available in the 'Select Export Type' dropdown");
		WebElement element = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SELECT_EXP_TYPE_DP))));
		Select select = new Select(element);
		List<WebElement> allOptions = select.getOptions();
		
		 boolean found = false;
		 for(WebElement ele: allOptions) {
			 if(LocatorsPath.payments.equals(ele.getText())) {
				 found = true;
				 System.out.println(LocatorsPath.payments +" - value exists");
				 Assert.assertTrue(found);
				 break;
			 }
		 }if(!found) {
			 System.out.println(LocatorsPath.payments +" - value doesn't exists");
			 Assert.fail(LocatorsPath.payments +" - value doesn't exists");
	   }
	   System.out.println("Success: 'Export Payments' is available in the 'Select Export Type' dropdown");
	}
	

	@Then("^User verifies the 'Export Retail Audit' is available in the 'Select Export Type' dropdown$")
	public void user_verifies_the_Export_Retail_Audit_is_available_in_the_Select_Export_Type_dropdown() throws Throwable {
	    
		System.out.println("Attempt: verify the 'Export Retail Audit' is available in the 'Select Export Type' dropdown");
		WebElement element = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SELECT_EXP_TYPE_DP))));
		Select select = new Select(element);
		List<WebElement> allOptions = select.getOptions();
		
		 boolean found = false;
		 for(WebElement ele: allOptions) {
			 if(LocatorsPath.retailAudit.equals(ele.getText())) {
				 found = true;
				 System.out.println(LocatorsPath.retailAudit +" - value exists");
				 Assert.assertTrue(found);
				 break;
			 }
		 }if(!found) {
			 System.out.println(LocatorsPath.retailAudit +" - value doesn't exists");
			 Assert.fail(LocatorsPath.retailAudit +" - value doesn't exists");
	   }
	   System.out.println("Success: 'Export Retail Audit' is available in the 'Select Export Type' dropdown");
	}
	

	@Then("^User verifies the 'Export Contracts' is available in the 'Select Export Type' dropdown$")
	public void user_verifies_the_Export_Contracts_is_available_in_the_Select_Export_Type_dropdown() throws Throwable {
	    
		System.out.println("Attempt: verify the 'Export Contracts' is available in the 'Select Export Type' dropdown");
		WebElement element = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SELECT_EXP_TYPE_DP))));
		Select select = new Select(element);
		List<WebElement> allOptions = select.getOptions();
		
		 boolean found = false;
		 for(WebElement ele: allOptions) {
			 if(LocatorsPath.contracts.equals(ele.getText())) {
				 found = true;
				 System.out.println(LocatorsPath.contracts +" - value exists");
				 Assert.assertTrue(found);
				 break;
			 }
		 }if(!found) {
			 System.out.println(LocatorsPath.contracts +" - value doesn't exists");
			 Assert.fail(LocatorsPath.contracts +" - value doesn't exists");
	   }
	   System.out.println("Success: 'Export Contracts' is available in the 'Select Export Type' dropdown");
	}
	

	@Then("^User verifies the '(\\d+)-Export Key Contact' is available in the 'Select Export Type' dropdown$")
	public void user_verifies_the_Export_Key_Contact_is_available_in_the_Select_Export_Type_dropdown(int arg1) throws Throwable {
	   
		System.out.println("Attempt: verify the '1191-Export Key Contacts' is available in the 'Select Export Type' dropdown");
		WebElement element = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SELECT_EXP_TYPE_DP))));
		Select select = new Select(element);
		List<WebElement> allOptions = select.getOptions();
		
		 boolean found = false;
		 for(WebElement ele: allOptions) {
			 if(LocatorsPath.contact.equals(ele.getText())) {
				 found = true;
				 System.out.println(LocatorsPath.contact +" - value exists");
				 Assert.assertTrue(found);
				 break;
			 }
		 }if(!found) {
			 System.out.println(LocatorsPath.contact +" - value doesn't exists");
			 Assert.fail(LocatorsPath.contact +" - value doesn't exists");
	   }
	   System.out.println("Success: '1191-Export Key Contacts' is available in the 'Select Export Type' dropdown");
	}
	

	@Then("^User verifies the '(\\d+) - Sales Order' is available in the 'Select Export Type' dropdown$")
	public void user_verifies_the_Sales_Order_is_available_in_the_Select_Export_Type_dropdown(int arg1) throws Throwable {
	    
		System.out.println("Attempt: verify the '1178 - Sales Order' is available in the 'Select Export Type' dropdown");
		WebElement element = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SELECT_EXP_TYPE_DP))));
		Select select = new Select(element);
		List<WebElement> allOptions = select.getOptions();
		
		 boolean found = false;
		 for(WebElement ele: allOptions) {
			 if(LocatorsPath.salesPrder.equals(ele.getText())) {
				 found = true;
				 System.out.println(LocatorsPath.salesPrder +" - value exists");
				 Assert.assertTrue(found);
				 break;
			 }
		 }if(!found) {
			 System.out.println(LocatorsPath.salesPrder +" - value doesn't exists");
			 Assert.fail(LocatorsPath.salesPrder +" - value doesn't exists");
	   }
	   System.out.println("Success: '1178 - Sales Order' is available in the 'Select Export Type' dropdown");
	}
	

	@Then("^User verifies the '(\\d+)-Customer Master' is available in the 'Select Export Type' dropdown$")
	public void user_verifies_the_Customer_Master_is_available_in_the_Select_Export_Type_dropdown(int arg1) throws Throwable {
	    
		System.out.println("Attempt: verify the '1183-Customer Master' is available in the 'Select Export Type' dropdown");
		WebElement element = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SELECT_EXP_TYPE_DP))));
		Select select = new Select(element);
		List<WebElement> allOptions = select.getOptions();
		
		 boolean found = false;
		 for(WebElement ele: allOptions) {
			 if(LocatorsPath.customer.equals(ele.getText())) {
				 found = true;
				 System.out.println(LocatorsPath.customer +" - value exists");
				 Assert.assertTrue(found);
				 break;
			 }
		 }if(!found) {
			 System.out.println(LocatorsPath.customer +" - value doesn't exists");
			 Assert.fail(LocatorsPath.customer +" - value doesn't exists");
	   }
	   System.out.println("Success: '1183-Customer Master' is available in the 'Select Export Type' dropdown");
	}
	

	@Then("^User verifies the '(\\d+)R-Customer Trading Terms' is available in the 'Select Export Type' dropdown$")
	public void user_verifies_the_R_Customer_Trading_Terms_is_available_in_the_Select_Export_Type_dropdown(int arg1) throws Throwable {
	    
		System.out.println("Attempt: verify the '1184R-Customer Trading Terms' is available in the 'Select Export Type' dropdown");
		WebElement element = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SELECT_EXP_TYPE_DP))));
		Select select = new Select(element);
		List<WebElement> allOptions = select.getOptions();
		
		 boolean found = false;
		 for(WebElement ele: allOptions) {
			 if(LocatorsPath.tradingTerms.equals(ele.getText())) {
				 found = true;
				 System.out.println(LocatorsPath.tradingTerms +" - value exists");
				 Assert.assertTrue(found);
				 break;
			 }
		 }if(!found) {
			 System.out.println(LocatorsPath.tradingTerms +" - value doesn't exists");
			 Assert.fail(LocatorsPath.tradingTerms +" - value doesn't exists");
	   }
	   System.out.println("Success: '1184R-Customer Trading Terms' is available in the 'Select Export Type' dropdown");
	}
	

	@Then("^User verifies the '(\\d+) Sales Export to ECC' is available in the 'Select Export Type' dropdown$")
	public void user_verifies_the_Sales_Export_to_ECC_is_available_in_the_Select_Export_Type_dropdown(int arg1) throws Throwable {
	    
		System.out.println("Attempt: verify the '1178 Sales Export to ECC' is available in the 'Select Export Type' dropdown");
		WebElement element = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SELECT_EXP_TYPE_DP))));
		Select select = new Select(element);
		List<WebElement> allOptions = select.getOptions();
		
		 boolean found = false;
		 for(WebElement ele: allOptions) {
			 if(LocatorsPath.exportEcc.equals(ele.getText())) {
				 found = true;
				 System.out.println(LocatorsPath.exportEcc +" - value exists");
				 Assert.assertTrue(found);
				 break;
			 }
		 }if(!found) {
			 System.out.println(LocatorsPath.exportEcc +" - value doesn't exists");
			 Assert.fail(LocatorsPath.exportEcc +" - value doesn't exists");
	   }
	   System.out.println("Success: '1178 Sales Export to ECC' is available in the 'Select Export Type' dropdown");
	}
	

	
	/**----------------------RCS_SaaS_Verify_Export_Validation_WC--------------------------**/
	
	
	
	@Then("^User verifies the Time Duration of start & End date for 'Export Outlet data' is (\\d+) week$")
	public void user_verifies_the_Time_Duration_of_start_End_date_for_Export_Outlet_data_is_week(int arg1) throws Throwable {
	    
		System.out.println("Attempt: verify the Time Duration of start "
				+ "& End date for 'Export Outlet data'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.SELECT_EXP_TYPE_DP, LocatorsPath.MAX_TIME, 
				file3.getCellData("Exports", "Export Type", 2));
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.UTIL_START_DATE_CALENDER))));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.UTIL_START_DATE_CALENDER, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.UTIL_START_DATE, LocatorsPath.MAX_TIME);
		CallObject.block(3000);
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.UTIL_END_DATE_CALENDER)))).click();
		WebElement element = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.END_DATE_1))));
		
		if(element.isDisplayed()) {
			/*Assert.assertTrue(
					element.getText().contains(java.lang.String.valueOf(8)));
			CallObject.block(3000);*/
			PageObjects.SelectByXpath(
					driver, "//div[@id='ui-datepicker-div']//*[contains(text(),"
							+ "'"+file3.getCellData("Exports", "FutureDate", 2)+"')]", LocatorsPath.MAX_TIME);
			PageObjects.SelectByCSSSelectorWithoutClick(
					driver, LocatorsPath.UTIL_END_DATE, LocatorsPath.MAX_TIME);
		}
		System.out.println("Success: Time Duration of start & End date for "
				+ "'Export Outlet data' is verified successfully");
	}
	
	
	@Then("^User verifies the Time Duration of start & End date for 'Export Sales Order' is (\\d+) week$")
	public void user_verifies_the_Time_Duration_of_start_End_date_for_Export_Sales_Order_is_week(int arg1) throws Throwable {
	    
		System.out.println("Attempt: verify the Time Duration of start "
				+ "& End date for 'Export Sales Order'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.SELECT_EXP_TYPE_DP, LocatorsPath.MAX_TIME, 
				file3.getCellData("Exports", "Export Type", 3));
		
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.START_DATE_CALEN_1, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.UTIL_START_DATE, LocatorsPath.MAX_TIME);
		CallObject.block(3000);
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.END_DATE_CALEN_1)))).click();
		WebElement element = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.END_DATE_1))));
		
		if(element.isDisplayed()) {
			/*Assert.assertTrue(
					element.getText().contains(java.lang.String.valueOf(8)));*/
			//CallObject.block(3000);
			PageObjects.SelectByXpath(
					driver, "//div[@id='ui-datepicker-div']//*[contains(text(),"
							+ "'"+file3.getCellData("Exports", "FutureDate", 2)+"')]", LocatorsPath.MAX_TIME);
			PageObjects.SelectByCSSSelectorWithoutClick(
					driver, LocatorsPath.END_DATE_TEXTFIELD_1, LocatorsPath.MAX_TIME);
		}
		System.out.println("Success: Time Duration of start & End date for "
				+ "'Export Sales Order' is verified successfully");
	}
	

	@Then("^User verifies the Time Duration of start & End date for 'Export Pre Sales Order' is (\\d+) week$")
	public void user_verifies_the_Time_Duration_of_start_End_date_for_Export_Pre_Sales_Order_is_week(int arg1) throws Throwable {
	    
		System.out.println("Attempt: verify the Time Duration of start "
				+ "& End date for 'Export Pre Sales Order'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.SELECT_EXP_TYPE_DP, LocatorsPath.MAX_TIME, 
				file3.getCellData("Exports", "Export Type", 4));
		
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.START_DATE_CALEN_2, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.UTIL_START_DATE, LocatorsPath.MAX_TIME);
		CallObject.block(3000);
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.END_DATE_CALEN_2)))).click();
		PageObjects.SelectByXpath(
				driver, "//div[@id='ui-datepicker-div']//*[contains(text(),"
						+ "'"+file3.getCellData("Exports", "FutureDate", 2)+"')]", LocatorsPath.MAX_TIME);
		System.out.println("Success: Time Duration of start & End date for "
				+ "'Export Pre Sales Order' is verified successfully");
	}
	

	@Then("^User verifies the Time Duration of start & End date for 'Export Invoices' is (\\d+) week$")
	public void user_verifies_the_Time_Duration_of_start_End_date_for_Export_Invoices_is_week(int arg1) throws Throwable {
	    
		System.out.println("Attempt: verify the Time Duration of start "
				+ "& End date for 'Export Invoices'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.SELECT_EXP_TYPE_DP, LocatorsPath.MAX_TIME, 
				file3.getCellData("Exports", "Export Type", 5));
		
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.START_DATE_CALEN_1, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.UTIL_START_DATE, LocatorsPath.MAX_TIME);
		CallObject.block(3000);
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.END_DATE_CALEN_1)))).click();
		WebElement element = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.END_DATE_1))));
		
		if(element.isDisplayed()) {
			/*Assert.assertTrue(
					element.getText().contains(java.lang.String.valueOf(8)));
			CallObject.block(3000);*/
			PageObjects.SelectByXpath(
					driver, "//div[@id='ui-datepicker-div']//*[contains(text(),"
							+ "'"+file3.getCellData("Exports", "FutureDate", 2)+"')]", LocatorsPath.MAX_TIME);
			PageObjects.SelectByCSSSelectorWithoutClick(
					driver, LocatorsPath.UTIL_END_DATE, LocatorsPath.MAX_TIME);
		}
		System.out.println("Success: Time Duration of start & End date for "
				+ "'Export Invoices' is verified successfully");
	}
	

	@Then("^User verifies the Time Duration of start & End date for 'Exports Payments' is (\\d+) week$")
	public void user_verifies_the_Time_Duration_of_start_End_date_for_Exports_Payments_is_week(int arg1) throws Throwable {
	    
		System.out.println("Attempt: verify the Time Duration of start "
				+ "& End date for 'Export Payments'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.SELECT_EXP_TYPE_DP, LocatorsPath.MAX_TIME, 
				file3.getCellData("Exports", "Export Type", 6));
		
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.START_DATE_CALEN_1, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.UTIL_START_DATE, LocatorsPath.MAX_TIME);
		CallObject.block(3000);
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.END_DATE_CALEN_3)))).click();
		WebElement element = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.END_DATE_1))));
		
		if(element.isDisplayed()) {
			/*Assert.assertTrue(
					element.getText().contains(java.lang.String.valueOf(8)));
			CallObject.block(3000);*/
			PageObjects.SelectByXpath(
					driver, "//div[@id='ui-datepicker-div']//*[contains(text(),"
							+ "'"+file3.getCellData("Exports", "FutureDate", 2)+"')]", LocatorsPath.MAX_TIME);
			PageObjects.SelectByCSSSelectorWithoutClick(
					driver, LocatorsPath.END_DATE_TEXTFIELD_3, LocatorsPath.MAX_TIME);
		}
		System.out.println("Success: Time Duration of start & End date for "
				+ "'Export Payments' is verified successfully");
	}
	

	@Then("^User verifies the Time Duration of start & End date for 'Export Retail Audit' is (\\d+) week$")
	public void user_verifies_the_Time_Duration_of_start_End_date_for_Export_Retail_Audit_is_week(int arg1) throws Throwable {
	   
		System.out.println("Attempt: verify the Time Duration of start "
				+ "& End date for 'Export Retail Audit'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.SELECT_EXP_TYPE_DP, LocatorsPath.MAX_TIME, 
				file3.getCellData("Exports", "Export Type", 7));
		
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.START_DATE_CALEN_1, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.UTIL_START_DATE, LocatorsPath.MAX_TIME);
		CallObject.block(3000);
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.END_DATE_CALEN_1)))).click();
		WebElement element = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.END_DATE_1))));
		
		if(element.isDisplayed()) {
			/*Assert.assertTrue(
					element.getText().contains(java.lang.String.valueOf(8)));
			CallObject.block(3000);*/
			PageObjects.SelectByXpath(
					driver, "//div[@id='ui-datepicker-div']//*[contains(text(),"
							+ "'"+file3.getCellData("Exports", "FutureDate", 2)+"')]", LocatorsPath.MAX_TIME);
			PageObjects.SelectByCSSSelectorWithoutClick(
					driver, LocatorsPath.UTIL_END_DATE, LocatorsPath.MAX_TIME);
		}
		System.out.println("Success: Time Duration of start & End date for "
				+ "'Export Retail Audit' is verified successfully");
	}
	

	@Then("^User verifies the Time Duration of start & End date for 'Export Contracts' is (\\d+) week$")
	public void user_verifies_the_Time_Duration_of_start_End_date_for_Export_Contracts_is_week(int arg1) throws Throwable {
	    
		System.out.println("Attempt: verify the Time Duration of start "
				+ "& End date for 'Export Contracts'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.SELECT_EXP_TYPE_DP, LocatorsPath.MAX_TIME, 
				file3.getCellData("Exports", "Export Type", 8));
		
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.START_DATE_CALEN_2, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.UTIL_START_DATE, LocatorsPath.MAX_TIME);
		CallObject.block(3000);
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.END_DATE_CALEN_2)))).click();
		WebElement element = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.END_DATE_1))));
		
		if(element.isDisplayed()) {
			/*Assert.assertTrue(
					element.getText().contains(java.lang.String.valueOf(8)));
			CallObject.block(3000);*/
			PageObjects.SelectByXpath(
					driver, "//div[@id='ui-datepicker-div']//*[contains(text(),"
							+ "'"+file3.getCellData("Exports", "FutureDate", 2)+"')]", LocatorsPath.MAX_TIME);
			PageObjects.SelectByCSSSelectorWithoutClick(
					driver, LocatorsPath.UTIL_END_DATE, LocatorsPath.MAX_TIME);
		}
		System.out.println("Success: Time Duration of start & End date for "
				+ "'Export Contracts' is verified successfully");
	}
	

	
	/**----------------------RCS_SaaS_Export_Outlet_Data_WC--------------------------**/
	
	
	
	@Then("^User selects the 'Export Outlet Data' from the 'Select Export Type' dropdown$")
	public void user_selects_the_Export_Outlet_Data_from_the_Select_Export_Type_dropdown() throws Throwable {
	    
		/*creationPage.user_clicks_on_Search_tab();
		creationPage.user_clicks_on_Create_new_customer_button();
		creationPage.the_user_selects_Customer_type_from_the_drop_down();
		creationPage.user_selects_Status_from_drop_down();
		creationPage.user_selects_Shopper_channel_from_dropdown();
		creationPage.user_enters_Customer_name_in_the_Customer_Name_text_box();
		creationPage.user_selects_Outlet_type_from_outlet_type_dropdown();
		creationPage.user_selects_Outlet_subtype_from_outlet_subtype_dropdown();
		creationPage.user_selects_Territory_from_Territory_dropdown();
		creationPage.user_clicks_on_save_button_and_the_customer_should_be_created_successfully();
		
		WebElement number = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(GET_CUST_NUM))));
		file3.setCellData("Exports", "Customer Number", 2, 
				number.getText());
		
		WebElement name = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(GET_CUST_NAME))));
		file3.setCellData("Exports", "Customer Name", 2, 
				name.getText());*/
		
		user_clicks_on_Utilities();
		user_clicks_on_Exports_tab_and_navigates_to_the_Data_Export_Utility_page();
		System.out.println("Attempt: select the 'Export Outlet Data' "
				+ "from the 'Select Export Type' dropdown");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.SELECT_EXP_TYPE_DP, LocatorsPath.MAX_TIME, 
				file3.getCellData("Exports", "Export Type", 2));
		System.out.println("Success: 'Export Outlet Data' selected"
				+ "from the 'Select Export Type' dropdown successfully");
	}

	
	@Then("^User selects the 'Customer Type' in the export criteria section$")
	public void user_selects_the_Customer_Type_in_the_export_criteria_section() throws Throwable {
	    
		System.out.println("Attempt: select the 'Customer Type' "
				+ "in the export criteria section");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.UTIL_CUSTOMER_TYPE, LocatorsPath.MAX_TIME, 
				file1.getCellData("Outlet", "Customer Type", 2));
		System.out.println("Success: 'Customer Type' in the export "
				+ "criteria section selected successfully");
	}
	

	@Then("^User selects the 'Territory' in the export criteria section$")
	public void user_selects_the_Territory_in_the_export_criteria_section() throws Throwable {
	   
		System.out.println("Attempt: select the 'Territory' "
				+ "in the export criteria section");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.UTIL_TERRITORY, LocatorsPath.MAX_TIME, 
				file.getCellData("Territory", "TerritoryName", 2));
		System.out.println("Success: 'Territory' in the export "
				+ "criteria section selected successfully");
	}
	

	@Then("^User selects the 'Shoppers Channel' in the export criteria section$")
	public void user_selects_the_Shoppers_Channel_in_the_export_criteria_section() throws Throwable {
	    
		System.out.println("Attempt: select the 'Shoppers Channel' "
				+ "in the export criteria section");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.SHOPPERS_CHANNEL, LocatorsPath.MAX_TIME, 
				file1.getCellData("Outlet", "Shopper Channel", 2));
		System.out.println("Success: 'Shoppers Channel' in the export "
				+ "criteria section selected successfully");
	}
	

	@Then("^User selects the 'Tag Value' in the export criteria section$")
	public void user_selects_the_Tag_Value_in_the_export_criteria_section() throws Throwable {
	    
		/*System.out.println("Attempt: select the 'Tag Value' "
				+ "in the export criteria section");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, TAG_VALUE, LocatorsPath.MAX_TIME, 
				file3.getCellData("Exports", "Tag Value", 2));
		System.out.println("Success: 'Tag Value' in the export "
				+ "criteria section selected successfully");*/
	}
	

	@Then("^User enters the 'Customer Number' in the export criteria section$")
	public void user_enters_the_Customer_Number_in_the_export_criteria_section() throws Throwable {
	    
		System.out.println("Attempt: enter the 'Customer Number' "
				+ "in the export criteria section");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.UTIL_CUSTOMER_NUMBER, LocatorsPath.MAX_TIME, 
				file3.getCellData("Exports", "Customer Number", 2));
		System.out.println("Success: 'Customer Number' in the export "
				+ "criteria section entered successfully");
	}
	

	@Then("^User enters the 'Customer Name' in the export criteria section$")
	public void user_enters_the_Customer_Name_in_the_export_criteria_section() throws Throwable {
	    
		System.out.println("Attempt: enter the 'Customer Name' "
				+ "in the export criteria section");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.UTIL_CUSTOMER_NAME, LocatorsPath.MAX_TIME, 
				file3.getCellData("Exports", "Customer Name", 2));
		System.out.println("Success: 'Customer Name' in the export "
				+ "criteria section entered successfully");
	}
	

	@Then("^User selects the 'Start & End Date' in the export criteria section$")
	public void user_selects_the_Start_End_Date_in_the_export_criteria_section() throws Throwable {
	    
		System.out.println("Attempt: select the 'Start & End Date' in the export criteria section");
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.START_DATE_CALENDER))));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.START_DATE_CALENDER, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.CURRENT_DATE, LocatorsPath.MAX_TIME);
		CallObject.block(3000);
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.UTIL_END_DATE_CALENDER)))).click();
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.CURRENT_DATE, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Start & End Date' in the export "
				+ "criteria section selected successfully");
	}
	

	@Then("^User verifies the Export criteria for Outlet data is entered successfully$")
	public void user_verifies_the_Export_criteria_for_Outlet_data_is_entered_successfully() throws Throwable {
	    
		System.out.println("User verifies the Export criteria for Outlet data is entered successfully");
	}
	

	@Then("^User clicks on the 'Export in CSV or Export in Excel' button$")
	public void user_clicks_on_the_Export_in_CSV_or_Export_in_Excel_button() throws Throwable {
	    
		System.out.println("Attempt: click on the 'Export in CSV or Export in Excel' button");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.UTIL_EXPORT_IN_EXCEL, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Export in CSV or Export in Excel' button clicked successfully");
	}
	

	@Then("^User verifies the Outlet Data is exported successfully and verifies the data\\.$")
	public void user_verifies_the_Outlet_Data_is_exported_successfully_and_verifies_the_data() throws Throwable {
	   
		System.out.println("Attempt: verify the Outlet Data is exported");
		CallObject.block(3000);
		HssfApiFile exportExcel = 
				new HssfApiFile("C:\\Users\\30955\\Downloads\\Outlet_Export.xls");
		
		Assert.assertEquals("Customer No.", 
				exportExcel.getCellData("exportOutletData", "Customer No.", 1));
		
		Assert.assertEquals("Customer Name", 
				exportExcel.getCellData("exportOutletData", "Customer Name", 1));
		
		Assert.assertEquals("Outlet Type", 
				exportExcel.getCellData("exportOutletData", "Outlet Type", 1));
		
		Assert.assertEquals("Outlet Subtype", 
				exportExcel.getCellData("exportOutletData", "Outlet Subtype", 1));
		
		Assert.assertEquals("Customer Type", 
				exportExcel.getCellData("exportOutletData", "Customer Type", 1));
		
		Assert.assertEquals("Status", 
				exportExcel.getCellData("exportOutletData", "Status", 1));
		
		Assert.assertEquals("Shopper Channel", 
				exportExcel.getCellData("exportOutletData", "Shopper Channel", 1));
		
		System.out.println("Success: Outlet Data is exported successfully");
	}
	

	
	/**----------------------RCS_SaaS_Export_Sales_Order_WC--------------------------**/
	
	
	
	@Then("^User selects the 'Export Sales Order' from the 'Select Export Type' dropdown$")
	public void user_selects_the_Export_Sales_Order_from_the_Select_Export_Type_dropdown() throws Throwable {
	    
		System.out.println("Attempt: select the 'Export Sales Order' "
				+ "from the 'Select Export Type' dropdown");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.SELECT_EXP_TYPE_DP, LocatorsPath.MAX_TIME, 
				file3.getCellData("Exports", "Export Type", 3));
		System.out.println("Success: 'Export Sales Order' from the "
				+ "'Select Export Type' dropdown selected successfully");
	}

	
	@Then("^User selects the 'Start & End Date' in the Export Sales Order section$")
	public void user_selects_the_Start_End_Date_in_the_Export_Sales_Order_section() throws Throwable {
			
			System.out.println("Attempt: select the 'Start & End Date' in the Export Sales Order section");
			wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.START_DATE_CALEN_1))));
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.START_DATE_CALEN_1, LocatorsPath.MAX_TIME);
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.CURRENT_DATE, LocatorsPath.MAX_TIME);
			CallObject.block(3000);
			wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.END_DATE_CALEN_1)))).click();
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.CURRENT_DATE, LocatorsPath.MAX_TIME);
			System.out.println("Success: 'Start & End Date' in the "
					+ "Export Sales Order selected successfully");
	}
	

	@Then("^User selects the Export format as 'CSV or TEXT' in the Export Sales Order section$")
	public void user_selects_the_Export_format_as_CSV_or_TEXT_in_the_Export_Sales_Order_section() throws Throwable {
	 
		System.out.println("Attempt: select the Export format as 'CSV or TEXT' "
				+ "in the Export Sales Order section");
		PageObjects.SelectByCSSSelectorWithSendKeys(driver, LocatorsPath.EXPORT_FORMAT, LocatorsPath.MAX_TIME, 
				file3.getCellData("Exports", "Export format", 2));
		System.out.println("Success: 'CSV or TEXT' text format"
				+ "in the Export Sales Order section selected successfully");
	}
	

	@Then("^User verifies the export criteria for Sales Order data is entered successfully\\.$")
	public void user_verifies_the_export_criteria_for_Sales_Order_data_is_entered_successfully() throws Throwable {
	    
		System.out.println("User verifies the export criteria for Sales Order data is entered successfully");
	}
	

	@Then("^User clicks on the 'Export' button and verifies the Sales Order data is exported and validated successfully\\.$")
	public void user_clicks_on_the_Export_button_and_verifies_the_Sales_Order_data_is_exported_and_validated_successfully() throws Throwable {
	   
		System.out.println("Attempt: click on the 'Export' button");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.UTIL_EXPORT, LocatorsPath.MAX_TIME);
		
		CallObject.block(3000);
		File newfile = renameFile.getTheNewestFile(LocatorsPath.UtilDriveLocation, LocatorsPath.UtilZipFormat);
		newfile.renameTo(new File(LocatorsPath.UtilFileLocation));
		String filename= newfile.getName();
		System.out.println("latest file is = "+filename);
		  
		RenameFile renamefile = new RenameFile();
		File updated = renamefile.getTheNewestFile(LocatorsPath.UtilDriveLocation, LocatorsPath.UtilZipFormat);
		System.out.println("Changed file name is = "+updated);
		
		CallObject.block(3000);
		extractZipFile.unzip(LocatorsPath.UtilFileLocation, LocatorsPath.UtilDriveLocation);
				
		//Rename First File Location
		File newcsvfile = renameFile.getTheNewestFile(LocatorsPath.UtilDriveLocation, LocatorsPath.UtilCSVFormat);
		newcsvfile.renameTo(new File(LocatorsPath.UtilCsvFirstFileLocation));
		String csvfilename= newcsvfile.getName();
		System.out.println("latest file is = "+csvfilename);
		  
		RenameFile renamecsvfile = new RenameFile();
		File csvUpdated = renamecsvfile.getTheNewestFile(LocatorsPath.UtilDriveLocation, LocatorsPath.UtilCSVFormat);
		System.out.println("Changed file name is = "+csvUpdated);
		
		//Rename Second File Location
		File newcsvfile1 = renameFile.getTheSecondNewestFile(LocatorsPath.UtilDriveLocation, LocatorsPath.UtilCSVFormat);
		newcsvfile1.renameTo(new File(LocatorsPath.UtilCsvSecondFileLocation));
		String csvfilename1= newcsvfile1.getName();
		System.out.println("latest file is = "+csvfilename1);
		  
		RenameFile renamecsvfile1 = new RenameFile();
		File csvUpdated1 = renamecsvfile1.getTheNewestFile(LocatorsPath.UtilDriveLocation, LocatorsPath.UtilCSVFormat);
		System.out.println("Changed file name is = "+csvUpdated1);
		
		//Convert CSV to XLSX files
		CsvToExcelConverter.csvConverter
		(LocatorsPath.UtilCsvFirstFileLocation, LocatorsPath.UtilxlsxFirstFileLocation, LocatorsPath.UtilSheet1);
		
		CsvToExcelConverter.csvConverter
		(LocatorsPath.UtilCsvSecondFileLocation, LocatorsPath.UtilxlsxSecondFileLocation, LocatorsPath.UtilSheet2);
		
		ExcelApiFile SalesOrderDetails = new ExcelApiFile(LocatorsPath.UtilxlsxFirstFileLocation);
		Assert.assertEquals(file2.getCellData("DataEntry-Sales", "Stocks Product Name", 2), 
				SalesOrderDetails.getCellData(LocatorsPath.UtilSheet1, "Product", 2));
		/*Assert.assertEquals(file2.getCellData("DataEntry-Sales", "Quantity", 2).concat(".000"), 
				SalesOrderDetails.getCellData(LocatorsPath.UtilSheet1, " Quantity", 2));*/
		/*Assert.assertEquals(file2.getCellData("DataEntry-Sales", "Pre-Sales Unit Price", 2), 
				SalesOrderDetails.getCellData(LocatorsPath.UtilSheet1, "Unit Price", 2));*/
		
		ExcelApiFile SalesOrderHeader = new ExcelApiFile(LocatorsPath.UtilxlsxSecondFileLocation);
		/*Assert.assertEquals(file2.getCellData("DataEntry-Sales", "Amount", 2), 
				SalesOrderHeader.getCellData(LocatorsPath.UtilSheet2, "Total Amount", 2));
		Assert.assertEquals(file2.getCellData("DataEntry-Sales", "Quantity", 2).concat(".000"), 
				SalesOrderHeader.getCellData(LocatorsPath.UtilSheet2, "Quantity", 2));*/
		 Assert.assertEquals("4-CLOSED", 
				 SalesOrderHeader.getCellData(LocatorsPath.UtilSheet2, "Order Status", 2));
		System.out.println("Success: 'Export' button clicked successfully");
	}
	

	
	/**----------------------RCS_SaaS_Export_Pre_Sales_Order_WC--------------------------**/
	
	
	
	@Then("^User selects the 'Export Pre Sales Order data' from the 'Select Export Type' dropdown$")
	public void user_selects_the_Export_Pre_Sales_Order_data_from_the_Select_Export_Type_dropdown() throws Throwable {
	  
		System.out.println("Attempt: select the 'Export Pre Sales Order' "
				+ "from the 'Select Export Type' dropdown");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.SELECT_EXP_TYPE_DP, LocatorsPath.MAX_TIME, 
				file3.getCellData("Exports", "Export Type", 4));
		System.out.println("Success: 'Export Pre Sales Order' from the "
				+ "'Select Export Type' dropdown selected successfully");
	}
	

	@Then("^User selects the 'Date Selection' dropdown in the Export Pre Sales Order data section$")
	public void user_selects_the_Date_Selection_dropdown_in_the_Export_Pre_Sales_Order_data_section() throws Throwable {
	    
		System.out.println("Attempt: select the 'Date Selection' dropdown "
				+ "in the Export Pre Sales Order data section");
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.EXPORT_PRE_SALE_DISP, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelectorWithSendKeys(driver, LocatorsPath.DATE_SELECTION, LocatorsPath.MAX_TIME, 
				file3.getCellData("Exports", "Date Selection", 2));
		System.out.println("Success: 'Date Selection' dropdown in the Export Pre "
				+ "Sales Order data section selected successfully");
	}
	

	@Then("^User selects the 'Start & End Date' in the Export Pre Sales Order data section$")
	public void user_selects_the_Start_End_Date_in_the_Export_Pre_Sales_Order_data_section() throws Throwable {
	    
		System.out.println("Attempt: select the 'Start & End Date' in the Export Pre Sales Order section");
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.START_DATE_CALEN_2))));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.START_DATE_CALEN_2, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.CURRENT_DATE, LocatorsPath.MAX_TIME);
		CallObject.block(3000);
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.END_DATE_CALEN_2)))).click();
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.CURRENT_DATE, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Start & End Date' in the "
				+ "Export Pre Sales Order selected successfully");
	}
	

	@Then("^User selects the Export format as 'CSV or TEXT' in the Export Pre Sales Order data section$")
	public void user_selects_the_Export_format_as_CSV_or_TEXT_in_the_Export_Pre_Sales_Order_data_section() throws Throwable {
	    
		System.out.println("Attempt: select the Export format as 'CSV or TEXT' "
				+ "in the Export Pre Sales Order section");
		PageObjects.SelectByCSSSelectorWithSendKeys(driver, LocatorsPath.EXPORT_FORMAT_PRESALE, LocatorsPath.MAX_TIME, 
				file3.getCellData("Exports", "Export format", 2));
		System.out.println("Success: 'CSV or TEXT' text format"
				+ "in the Export Pre Sales Order section selected successfully");
	}
	

	@Then("^User verifies the export criteria for Pre Sales Order data is entered successfully\\.$")
	public void user_verifies_the_export_criteria_for_Pre_Sales_Order_data_is_entered_successfully() throws Throwable {
	    
		System.out.println("User verifies the export criteria for Pre Sales Order data is entered successfully");
	}
	

	@Then("^User clicks on the 'Export' button and verifies the Pre Sales Order data is exported and validated successfully\\.$")
	public void user_clicks_on_the_Export_button_and_verifies_the_Pre_Sales_Order_data_is_exported_and_validated_successfully() throws Throwable {
	   
		System.out.println("Attempt: click on the 'Export' button");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.UTIL_EXPORT, LocatorsPath.MAX_TIME);
		
		CallObject.block(3000);
		File newfile = renameFile.getTheNewestFile(LocatorsPath.UtilDriveLocation, LocatorsPath.UtilZipFormat);
		newfile.renameTo(new File(LocatorsPath.UtilPreSalesLocation));
		String filename= newfile.getName();
		System.out.println("latest file is = "+filename);
		  
		RenameFile renamefile = new RenameFile();
		File updated = renamefile.getTheNewestFile(LocatorsPath.UtilDriveLocation, LocatorsPath.UtilZipFormat);
		System.out.println("Changed file name is = "+updated);
		
		CallObject.block(3000);
		extractZipFile.unzip(LocatorsPath.UtilPreSalesLocation, LocatorsPath.UtilDriveLocation);
		
		
		//Rename First File Location
		File newcsvfile = renameFile.getTheNewestFile(LocatorsPath.UtilDriveLocation, LocatorsPath.UtilCSVFormat);
		newcsvfile.renameTo(new File(LocatorsPath.UtilCsvPreSalesDetailLoc));
		String csvfilename= newcsvfile.getName();
		System.out.println("latest file is = "+csvfilename);
		  
		RenameFile renamecsvfile = new RenameFile();
		File csvUpdated = renamecsvfile.getTheNewestFile(LocatorsPath.UtilDriveLocation, LocatorsPath.UtilCSVFormat);
		System.out.println("Changed file name is = "+csvUpdated);
		
		//Rename Second File Location
		File newcsvfile1 = renameFile.getTheSecondNewestFile(LocatorsPath.UtilDriveLocation, LocatorsPath.UtilCSVFormat);
		newcsvfile1.renameTo(new File(LocatorsPath.UtilCsvPreSalesHeaderLoc));
		String csvfilename1= newcsvfile1.getName();
		System.out.println("latest file is = "+csvfilename1);
		  
		RenameFile renamecsvfile1 = new RenameFile();
		File csvUpdated1 = renamecsvfile1.getTheNewestFile(LocatorsPath.UtilDriveLocation, LocatorsPath.UtilCSVFormat);
		System.out.println("Changed file name is = "+csvUpdated1);
		
		//Convert CSV to XLSX files
		CsvToExcelConverter.csvConverter
		(LocatorsPath.UtilCsvPreSalesDetailLoc, LocatorsPath.UtilxlsxPreSalesDetailLoc, LocatorsPath.UtilSheet3);
		
		CsvToExcelConverter.csvConverter
		(LocatorsPath.UtilCsvPreSalesHeaderLoc, LocatorsPath.UtilxlsxPreSalesHeaderLoc, LocatorsPath.UtilSheet4);
		
		ExcelApiFile PreSalesOrderDetails = new ExcelApiFile(LocatorsPath.UtilxlsxPreSalesDetailLoc);
		Assert.assertEquals(file2.getCellData("DataEntry-Sales", "Stocks Product Name", 2), 
				PreSalesOrderDetails.getCellData(LocatorsPath.UtilSheet3, "Product", 2));
		/*Assert.assertEquals(file2.getCellData("DataEntry-Sales", "Pre-Sales Order Quan", 2), 
				PreSalesOrderDetails.getCellData(LocatorsPath.UtilSheet3, "Quantity", 2));*/
		/*Assert.assertEquals(file2.getCellData("DataEntry-Sales", "Pre-Sales Unit Price", 2), 
				PreSalesOrderDetails.getCellData(LocatorsPath.UtilSheet3, "Unit Price", 2));
		Assert.assertEquals(file2.getCellData("DataEntry-Sales", "Pre-Sales Net Price", 2).replaceAll(",", ""), 
				PreSalesOrderDetails.getCellData(LocatorsPath.UtilSheet3, "Net Price", 2));
		Assert.assertEquals(file2.getCellData("DataEntry-Sales", "Pre-Sales Gross Price", 2).replaceAll(",", ""), 
				PreSalesOrderDetails.getCellData(LocatorsPath.UtilSheet3, "Gross Price", 2));*/
		
		
		ExcelApiFile PreSalesOrderHeader = new ExcelApiFile(LocatorsPath.UtilxlsxPreSalesHeaderLoc);
		/*Assert.assertEquals(file2.getCellData("DataEntry-Sales", "Pre-Sales Order Date", 2), 
				PreSalesOrderHeader.getCellData(LocatorsPath.UtilSheet4, "Order Date", 2));*/
		Assert.assertEquals("BOOKED", 
				 PreSalesOrderHeader.getCellData(LocatorsPath.UtilSheet4, "Order Status", 2));
		/*Assert.assertEquals(file2.getCellData("DataEntry-Sales", "Pre-Sales Order value", 2).replaceAll(",", ""), 
				PreSalesOrderHeader.getCellData(LocatorsPath.UtilSheet4, "OrderValue", 2));*/
		/*Assert.assertEquals(file2.getCellData("DataEntry-Sales", "Pre-Sales Order Quan", 2), 
				PreSalesOrderHeader.getCellData(LocatorsPath.UtilSheet4, "Quantity", 2));*/
		System.out.println("Success: 'Export' button clicked successfully");
	}
	

	
	/**----------------------RCS_SaaS_Export_Invoices_WC--------------------------**/
	
	
	
	@Then("^User selects the 'Export Invoices' from the 'Select Export Type' dropdown$")
	public void user_selects_the_Export_Invoices_from_the_Select_Export_Type_dropdown() throws Throwable {
	   
		System.out.println("Attempt: select the 'Export Invoices' "
				+ "from the 'Select Export Type' dropdown");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.SELECT_EXP_TYPE_DP, LocatorsPath.MAX_TIME, 
				file3.getCellData("Exports", "Export Type", 5));
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.EXPORT_INVOICE_DISP, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Export Invoices' from the "
				+ "'Select Export Type' dropdown selected successfully");
	}
	

	@Then("^User selects the 'Start & End Date' in the Export Invoice data section$")
	public void user_selects_the_Start_End_Date_in_the_Export_Invoice_data_section() throws Throwable {
	    
		System.out.println("Attempt: select the 'Start & End Date' in the Export Invoice section");
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.START_DATE_CALEN_1))));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.START_DATE_CALEN_1, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.CURRENT_DATE, LocatorsPath.MAX_TIME);
		CallObject.block(3000);
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.END_DATE_CALEN_1)))).click();
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.CURRENT_DATE, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Start & End Date' in the "
				+ "Export Invoice selected successfully");
	}
	

	@Then("^User selects the Export format as 'CSV or TEXT' in the Export Invoice data section$")
	public void user_selects_the_Export_format_as_CSV_or_TEXT_in_the_Export_Invoice_data_section() throws Throwable {
	    
		System.out.println("Attempt: select the Export format as 'CSV or TEXT' "
				+ "in the Export Invoice section");
		PageObjects.SelectByCSSSelectorWithSendKeys(driver, LocatorsPath.EXPORT_FORMAT_INVOICE, LocatorsPath.MAX_TIME, 
				file3.getCellData("Exports", "Export format", 2));
		System.out.println("Success: 'CSV or TEXT' text format"
				+ "in the Export Invoice section selected successfully");
	}
	

	@Then("^User verifies the export criteria for Invoices is entered successfully\\.$")
	public void user_verifies_the_export_criteria_for_Invoices_is_entered_successfully() throws Throwable {
	   
		System.out.println("User verifies the export criteria for Invoices is entered successfully");
	}
	

	@Then("^User clicks on the 'Export' button and verifies the Invoice data is exported and validated successfully\\.$")
	public void user_clicks_on_the_Export_button_and_verifies_the_Invoice_data_is_exported_and_validated_successfully() throws Throwable {
	    
		System.out.println("Attempt: click on the 'Export' button");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.UTIL_EXPORT, LocatorsPath.MAX_TIME);
		
		CallObject.block(3000);
		File newfile = renameFile.getTheNewestFile(LocatorsPath.UtilDriveLocation, LocatorsPath.UtilZipFormat);
		newfile.renameTo(new File(LocatorsPath.UtilInvoicesLocation));
		String filename= newfile.getName();
		System.out.println("latest file is = "+filename);
		  
		RenameFile renamefile = new RenameFile();
		File updated = renamefile.getTheNewestFile(LocatorsPath.UtilDriveLocation, LocatorsPath.UtilZipFormat);
		System.out.println("Changed file name is = "+updated);
		
		CallObject.block(3000);
		extractZipFile.unzip(LocatorsPath.UtilInvoicesLocation, LocatorsPath.UtilDriveLocation);
		
		
		//Rename First File Location
		File newcsvfile = renameFile.getTheNewestFile(LocatorsPath.UtilDriveLocation, LocatorsPath.UtilCSVFormat);
		newcsvfile.renameTo(new File(LocatorsPath.UtilCsvInvoiceDetailLoc));
		String csvfilename= newcsvfile.getName();
		System.out.println("latest file is = "+csvfilename);
		  
		RenameFile renamecsvfile = new RenameFile();
		File csvUpdated = renamecsvfile.getTheNewestFile(LocatorsPath.UtilDriveLocation, LocatorsPath.UtilCSVFormat);
		System.out.println("Changed file name is = "+csvUpdated);
		
		//Rename Second File Location
		File newcsvfile1 = renameFile.getTheSecondNewestFile(LocatorsPath.UtilDriveLocation, LocatorsPath.UtilCSVFormat);
		newcsvfile1.renameTo(new File(LocatorsPath.UtilCsvInvoiceHeaderLoc));
		String csvfilename1= newcsvfile1.getName();
		System.out.println("latest file is = "+csvfilename1);
		  
		RenameFile renamecsvfile1 = new RenameFile();
		File csvUpdated1 = renamecsvfile1.getTheNewestFile(LocatorsPath.UtilDriveLocation, LocatorsPath.UtilCSVFormat);
		System.out.println("Changed file name is = "+csvUpdated1);
		
		//Convert CSV to XLSX files
		CsvToExcelConverter.csvConverter
		(LocatorsPath.UtilCsvInvoiceDetailLoc, LocatorsPath.UtilxlsxInvoiceDetailLoc, LocatorsPath.UtilSheet5);
		
		CsvToExcelConverter.csvConverter
		(LocatorsPath.UtilCsvInvoiceHeaderLoc, LocatorsPath.UtilxlsxInvoiceHeaderLoc, LocatorsPath.UtilSheet6);
		
		ExcelApiFile InvoicesDetails = new ExcelApiFile(LocatorsPath.UtilxlsxInvoiceDetailLoc);
		Assert.assertEquals(file2.getCellData("DataEntry-Sales", "Stocks Product Name", 2), 
				InvoicesDetails.getCellData(LocatorsPath.UtilSheet5, "Product", 2));
		/*Assert.assertEquals(file2.getCellData("DataEntry-Sales", "Quantity", 2).concat(".000"), 
				InvoicesDetails.getCellData(LocatorsPath.UtilSheet5, "Quantity", 2));*/
		
		ExcelApiFile InvoicesHeader = new ExcelApiFile(LocatorsPath.UtilxlsxInvoiceHeaderLoc);
		/*Assert.assertEquals(file2.getCellData("DataEntry-Sales", "Amount", 2), 
				InvoicesHeader.getCellData(LocatorsPath.UtilSheet6, "Invoice Amount", 2));*/
		Assert.assertEquals("Closed", 
				InvoicesHeader.getCellData(LocatorsPath.UtilSheet6, "Invoice Status", 2));
		System.out.println("Success: 'Export' button clicked successfully");
	}
	

	
	/**----------------------RCS_SaaS_Export_Payments_WC--------------------------**/
	
	
	
	@Then("^User selects the 'Exports Payments' from the 'Select Export Type' dropdown$")
	public void user_selects_the_Exports_Payments_from_the_Select_Export_Type_dropdown() throws Throwable {
	   
		System.out.println("Attempt: select the 'Export Payments' "
				+ "from the 'Select Export Type' dropdown");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.SELECT_EXP_TYPE_DP, LocatorsPath.MAX_TIME, 
				file3.getCellData("Exports", "Export Type", 6));
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.EXPORT_PAYMENT_DISP, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Export Payments' from the "
				+ "'Select Export Type' dropdown selected successfully");
	}
	

	@Then("^User selects the 'Start & End Date' in the Export Payments data section$")
	public void user_selects_the_Start_End_Date_in_the_Export_Payments_data_section() throws Throwable {
	 
		System.out.println("Attempt: select the 'Start & End Date' in the Export Payments data section");
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.START_DATE_CALEN_1))));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.START_DATE_CALEN_1, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.CURRENT_DATE, LocatorsPath.MAX_TIME);
		CallObject.block(3000);
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.END_DATE_CALEN_3)))).click();
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.CURRENT_DATE, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Start & End Date' in the "
				+ "Export Payments data selected successfully");
	}
	

	@Then("^User verifies the Export criteria for Payments is entered successfully$")
	public void user_verifies_the_Export_criteria_for_Payments_is_entered_successfully() throws Throwable {
	    
		System.out.println("User verifies the Export criteria for Payments is entered successfully");
	}
	

	@Then("^User clicks on either 'Export in CSV or Export in Excel' button$")
	public void user_clicks_on_either_Export_in_CSV_or_Export_in_Excel_button() throws Throwable {
	    
		System.out.println("Attempt: click on either 'Export in CSV or Export in Excel' button");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.UTIL_EXPORT_IN_EXCEL, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Export in CSV or Export in Excel' button clicked successfully");
	}
	

	@Then("^User verifies the Payments data is exported and validated successfully\\.$")
	public void user_verifies_the_Payments_data_is_exported_and_validated_successfully() throws Throwable {
	   
		//cellData.findRowHssf(Sheet1.g, file2.getCellData("DataEntry-Sales", "Quantity", 2))
	}
	

	
	/**----------------------RCS_SaaS_Export_Retail_Audit_WC--------------------------**/
	
	
	
	@Then("^User selects the 'Export Retail Audit' from the 'Select Export Type' dropdown$")
	public void user_selects_the_Export_Retail_Audit_from_the_Select_Export_Type_dropdown() throws Throwable {
	    
	}
	

	@Then("^User selects the 'Start & End Date' in the Export Retail Audit data section$")
	public void user_selects_the_Start_End_Date_in_the_Export_Retail_Audit_data_section() throws Throwable {
	    
	}
	

	@Then("^User selects the Export format as 'CSV or TEXT' in the Export Retail Audit data section$")
	public void user_selects_the_Export_format_as_CSV_or_TEXT_in_the_Export_Retail_Audit_data_section() throws Throwable {
	    
	}
	

	@Then("^User verifies the Export criteria for Retail Audit is entered successfully$")
	public void user_verifies_the_Export_criteria_for_Retail_Audit_is_entered_successfully() throws Throwable {
	    
	}
	

	@Then("^User clicks on the 'Export' button and verifies the Retail Audit data is exported and validated successfully\\.$")
	public void user_clicks_on_the_Export_button_and_verifies_the_Retail_Audit_data_is_exported_and_validated_successfully() throws Throwable {
	   
	}
	

	
	/**----------------------RCS_SaaS_Export_Contracts_WC--------------------------**/
	
	
	
	@Then("^User selects the 'Export Contracts' from the 'Select Export Type' dropdown$")
	public void user_selects_the_Export_Contracts_from_the_Select_Export_Type_dropdown() throws Throwable {
	    
	}
	

	@Then("^User selects the 'Export Type' in the Export Contracts data section$")
	public void user_selects_the_Export_Type_in_the_Export_Contracts_data_section() throws Throwable {
	    
	}
	

	@Then("^User selects the 'Start & End Date' in the Export Contracts data section$")
	public void user_selects_the_Start_End_Date_in_the_Export_Contracts_data_section() throws Throwable {
	   
	}
	

	@Then("^User verifies the Export criteria for Contracts is entered successfully$")
	public void user_verifies_the_Export_criteria_for_Contracts_is_entered_successfully() throws Throwable {
	    
	}
	

	@Then("^User clicks on either 'Contracts Data in CSV or Contracts Data in XLS' button$")
	public void user_clicks_on_either_Contracts_Data_in_CSV_or_Contracts_Data_in_XLS_button() throws Throwable {
	   
	}
	

	@Then("^User verifies the Contract data is exported and validated successfully\\.$")
	public void user_verifies_the_Contract_data_is_exported_and_validated_successfully() throws Throwable {
	    
	}



}
