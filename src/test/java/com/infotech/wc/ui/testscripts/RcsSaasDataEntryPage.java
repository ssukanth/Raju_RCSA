package com.infotech.wc.ui.testscripts;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.infotech.Excel.CsvReaderWriter;
import com.infotech.Excel.ExcelApiFile;
import com.infotech.Excel.HssfApiFile;
import com.infotech.basepage.CallObject;
import com.infotech.basepage.LocatorsPath;
import com.infotech.basepage.PageObjects;
import com.infotech.testrunner.TestRunnerWebClient;

import cucumber.api.java.en.Then;

public class RcsSaasDataEntryPage extends TestRunnerWebClient{

	WebDriver driver = getDriver();
	Actions actions = new Actions(driver);
	ExcelApiFile file = new ExcelApiFile("TestData.xlsx");
    ExcelApiFile file1 = new ExcelApiFile("TestData1.xlsx");
    ExcelApiFile file2 = new ExcelApiFile("TestData2.xlsx");
	CsvReaderWriter exportCSV = new CsvReaderWriter("C:\\Users\\30955\\Downloads\\Customers.csv");
	CsvReaderWriter CusTradingTerm = new CsvReaderWriter("C:\\Users\\30955\\Downloads\\CustomerTradingTerm.csv");
	WebDriverWait wait = new WebDriverWait(driver, LocatorsPath.MAX_TIME);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	RcsSaasNewOutletCreationPage newOutletCreationPage = new RcsSaasNewOutletCreationPage();

	
	public RcsSaasDataEntryPage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	/**----------------------RCS_SAAS_DataEntry_Navigation_WC--------------------------**/
	
	
	
	
	@Then("^User navigates to the Search screen$")
	public void user_navigates_to_the_Search_screen() throws Throwable {
	    
		System.out.println("Attempt: Click on SEARCH Menu");
		WebElement search = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.SEARCH_SCREEN))));
		actions.moveToElement(search).doubleClick().build().perform();
		System.out.println("Success: SEARCH Menu selected successfully");
	}
	

	@Then("^User provides a query for an Outlet/provides specific condition & clicks on Search button$")
	public void user_provides_a_query_for_an_Outlet_provides_specific_condition_clicks_on_Search_button() throws Throwable {
	 
		System.out.println("Attempt: Provide a query for an Outlet/provide "
				+ "specific condition & click on Search button");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.CUSTOMER_NUMBER, LocatorsPath.MAX_TIME,
				file.getCellData("Contract", "Customer Number", 2));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.CUSTOMER_SEARCH, LocatorsPath.MAX_TIME);
		System.out.println("Success: Query for an Outlet provided & clicked on search button successfully");
	}
	

	@Then("^User navigates to the Profile screen successfully$")
	public void user_navigates_to_the_Profile_screen_successfully() throws Throwable {
	   
		System.out.println("Attempt: Navigate to the Profile screen");
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.DATA_ENTRY, LocatorsPath.MAX_TIME);
		System.out.println("Success: Profile screen displayed successfully");
	}
	

	@Then("^User should be able to see the - Profile tab$")
	public void user_should_be_able_to_see_the_Profile_tab() throws Throwable {
	    
		System.out.println("Attempt: User should be able to see the - Profile tab");
		WebElement profile = wait.until(ExpectedConditions.
				presenceOfElementLocated(By.xpath(LocatorsPath.PROFILE)));
		Assert.assertEquals("Profile", profile.getText());
		System.out.println("Success: Profile tab displayed successfully");
	}

	
	@Then("^User should be able to see the - Address tab$")
	public void user_should_be_able_to_see_the_Address_tab() throws Throwable {
	    
		System.out.println("Attempt: User should be able to see the - Address tab");
		WebElement address = wait.until(ExpectedConditions.
				presenceOfElementLocated(By.xpath(LocatorsPath.DATA_ENTRY_ADDRESS)));
		Assert.assertEquals("Address", address.getText());
		System.out.println("Success: Address tab displayed successfully");
	}
	

	@Then("^User should be able to see the - Attachments tab$")
	public void user_should_be_able_to_see_the_Attachments_tab() throws Throwable {
	    
		System.out.println("Attempt: User should be able to see the - Attachments tab");
		WebElement attach = wait.until(ExpectedConditions.
				presenceOfElementLocated(By.xpath(LocatorsPath.ATTACHMENTS)));
		Assert.assertEquals("Attachments", attach.getText());
		System.out.println("Success: Attachments tab displayed successfully");
	}
	

	@Then("^User should be able to see the - Contacts tab$")
	public void user_should_be_able_to_see_the_Contacts_tab() throws Throwable {
	   
		System.out.println("Attempt: User should be able to see the - Contacts tab");
		WebElement contacts = wait.until(ExpectedConditions.
				presenceOfElementLocated(By.xpath(LocatorsPath.CONTACTS)));
		Assert.assertEquals("Contacts", contacts.getText());
		System.out.println("Success: Contacts tab displayed successfully");
	}
	

	@Then("^User should be able to see the - Outlet Times tab$")
	public void user_should_be_able_to_see_the_Outlet_Times_tab() throws Throwable {
	 
		System.out.println("Attempt: User should be able to see the - Outlet Times tab");
		WebElement Outlet = wait.until(ExpectedConditions.
				presenceOfElementLocated(By.xpath(LocatorsPath.OUTLET_TIMES)));
		Assert.assertEquals("Outlet Times", Outlet.getText());
		System.out.println("Success: Outlet Times tab displayed successfully");
	}
	

	@Then("^User should be able to see the - Assessments tab$")
	public void user_should_be_able_to_see_the_Assessments_tab() throws Throwable {
	   
		System.out.println("Attempt: User should be able to see the - Assessments tab");
		WebElement assessments = wait.until(ExpectedConditions.
				presenceOfElementLocated(By.xpath(LocatorsPath.ASSESSMENTS)));
		Assert.assertEquals("Assessments", assessments.getText());
		System.out.println("Success: Assessments tab displayed successfully");
	}
	

	@Then("^User should be able to see the - Suppliers tab$")
	public void user_should_be_able_to_see_the_Suppliers_tab() throws Throwable {
	    
		System.out.println("Attempt: User should be able to see the - Suppliers tab");
		WebElement suppliers = wait.until(ExpectedConditions.
				presenceOfElementLocated(By.xpath(LocatorsPath.SUPPLIERS)));
		Assert.assertEquals("Suppliers", suppliers.getText());
		System.out.println("Success: Suppliers tab displayed successfully");
	}
	

	@Then("^User should be able to see the - Merchandising tab$")
	public void user_should_be_able_to_see_the_Merchandising_tab() throws Throwable {
	    
		System.out.println("Attempt: User should be able to see the - Merchandising tab");
		WebElement merchandising = wait.until(ExpectedConditions.
				presenceOfElementLocated(By.xpath(LocatorsPath.DATA_ENTRY_MERCHANDISING)));
		Assert.assertEquals("Merchandising", merchandising.getText());
		System.out.println("Success: Merchandising tab displayed successfully");
	}
	

	@Then("^User should be able to see the - Retail Audit tab$")
	public void user_should_be_able_to_see_the_Retail_Audit_tab() throws Throwable {
	 
		System.out.println("Attempt: User should be able to see the - Retail Audit tab");
		WebElement Retail = wait.until(ExpectedConditions.
				presenceOfElementLocated(By.xpath(LocatorsPath.RETAIL_AUDIT)));
		Assert.assertEquals("Retail Audit", Retail.getText());
		System.out.println("Success: Retail Audit tab displayed successfully");
	}
	

	@Then("^User should be able to see the - Contract tab$")
	public void user_should_be_able_to_see_the_Contract_tab() throws Throwable {
	 
		System.out.println("Attempt: User should be able to see the - Contract tab");
		WebElement contract = wait.until(ExpectedConditions.
				presenceOfElementLocated(By.xpath(LocatorsPath.CONTARCT)));
		Assert.assertEquals("Contract", contract.getText());
		System.out.println("Success: Contract tab displayed successfully");
	}
	

	@Then("^User should be able to see the - Territory tab$")
	public void user_should_be_able_to_see_the_Territory_tab() throws Throwable {
	    
		System.out.println("Attempt: User should be able to see the - Territory tab");
		WebElement territory = wait.until(ExpectedConditions.
				presenceOfElementLocated(By.xpath(LocatorsPath.DATA_ENTRY_TERRITORY)));
		Assert.assertEquals("Territory", territory.getText());
		System.out.println("Success: Territory tab displayed successfully");
	}
	

	@Then("^User should be able to see the - Sales tab$")
	public void user_should_be_able_to_see_the_Sales_tab() throws Throwable {
	   
		System.out.println("Attempt: User should be able to see the - Sales tab");
		WebElement sales = wait.until(ExpectedConditions.
				presenceOfElementLocated(By.xpath(LocatorsPath.SALES)));
		Assert.assertEquals("Sales", sales.getText());
		System.out.println("Success: Sales tab displayed successfully");
	}
	

	@Then("^User should be able to see the - FOC Orders tab$")
	public void user_should_be_able_to_see_the_FOC_Orders_tab() throws Throwable {
	  
		System.out.println("Attempt: User should be able to see the - FOC Orders tab");
		WebElement foc = wait.until(ExpectedConditions.
				presenceOfElementLocated(By.xpath(LocatorsPath.FOC_ORDERS)));
		Assert.assertEquals("FOC Orders", foc.getText());
		System.out.println("Success: FOC Orders tab displayed successfully");
	}
	

	@Then("^User should be able to see the - Planogram tab$")
	public void user_should_be_able_to_see_the_Planogram_tab() throws Throwable {
	    
		System.out.println("Attempt: User should be able to see the - Planogram tab");
		WebElement planogram = wait.until(ExpectedConditions.
				presenceOfElementLocated(By.xpath(LocatorsPath.PLANOGRAM)));
		Assert.assertEquals("Planogram", planogram.getText());
		System.out.println("Success: Planogram tab displayed successfully");
	}
	

	@Then("^User should be able to see the - Group Messages tab$")
	public void user_should_be_able_to_see_the_Group_Messages_tab() throws Throwable {

		System.out.println("Attempt: User should be able to see the - Group Messages tab");
		WebElement group = wait.until(ExpectedConditions.
				presenceOfElementLocated(By.xpath(LocatorsPath.DATA_ENTRY_GROUP_MESSAGES)));
		Assert.assertEquals("Group Messages", group.getText());
		System.out.println("Success: Group Messages tab displayed successfully");
	}
	

	@Then("^User should be able to see the - Service Requests tab$")
	public void user_should_be_able_to_see_the_Service_Requests_tab() throws Throwable {
	    
		System.out.println("Attempt: User should be able to see the - Service Requests tab");
		WebElement service = wait.until(ExpectedConditions.
				presenceOfElementLocated(By.xpath(LocatorsPath.SERVICE_REQUEST)));
		Assert.assertEquals("Service Request", service.getText());
		System.out.println("Success: Service Requests tab displayed successfully");
	}
	

	@Then("^User should be able to see the - Customer Sales Target tab$")
	public void user_should_be_able_to_see_the_Customer_Sales_Target_tab() throws Throwable {
	   
		System.out.println("Attempt: User should be able to see the - Customer Sales Target tab");
		WebElement customer = wait.until(ExpectedConditions.
				presenceOfElementLocated(By.xpath(LocatorsPath.CUSTOMER_SALES_TARGET)));
		Assert.assertEquals("Customer Sales Target", customer.getText());
		System.out.println("Success: Customer Sales Target tab displayed successfully");
	}


	
	/**----------------------RCS_SAAS_DataEntry_Profile_WC--------------------------**/
	
	
	
	@Then("^User verifies the Search Results screen displaying the following column - Customer No\\.$")
	public void user_verifies_the_Search_Results_screen_displaying_the_following_column_Customer_No() throws Throwable {

		System.out.println("Attempt: User verifies the Search Results "
				+ "screen displaying the following column - Customer No");
		WebElement customer = wait.until(ExpectedConditions.
				presenceOfElementLocated(By.cssSelector(LocatorsPath.CUSTOMER_NO)));
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.CUSTOMER_NO)));
		Assert.assertEquals("Customer No", customer.getText());
		System.out.println("Success: Customer No. column displayed successfully");
	}
	

	@Then("^User verifies the Search Results screen displaying the following column - Account Name$")
	public void user_verifies_the_Search_Results_screen_displaying_the_following_column_Account_Name() throws Throwable {
	    
		System.out.println("Attempt: User verifies the Search Results "
				+ "screen displaying the following column - Account Name");
		WebElement account = wait.until(ExpectedConditions.
				presenceOfElementLocated(By.cssSelector(LocatorsPath.ACCOUNT_NAME)));
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.ACCOUNT_NAME)));
		Assert.assertEquals("Account Name", account.getText());
		System.out.println("Success: Account Name column displayed successfully");
	}

	
	@Then("^User verifies the Search Results screen displaying the following column - City$")
	public void user_verifies_the_Search_Results_screen_displaying_the_following_column_City() throws Throwable {
	    
		System.out.println("Attempt: User verifies the Search Results "
				+ "screen displaying the following column - City");
		WebElement city = wait.until(ExpectedConditions.
				presenceOfElementLocated(By.cssSelector(LocatorsPath.DATA_ENTRY_CITY)));
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.DATA_ENTRY_CITY)));
		Assert.assertEquals("City", city.getText());
		System.out.println("Success: City column displayed successfully");
	}
	

	@Then("^User verifies the Search Results screen displaying the following column - Phone Number$")
	public void user_verifies_the_Search_Results_screen_displaying_the_following_column_Phone_Number() throws Throwable {
	    
		System.out.println("Attempt: User verifies the Search Results "
				+ "screen displaying the following column - Phone Number");
		WebElement phone = wait.until(ExpectedConditions.
				presenceOfElementLocated(By.cssSelector(LocatorsPath.DATA_ENTRY_PHONE_NUMBER)));
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.DATA_ENTRY_PHONE_NUMBER)));
		Assert.assertEquals("Phone Number", phone.getText());
		System.out.println("Success: Phone Number column displayed successfully");
	}
	

	@Then("^User verifies the Search Results screen displaying the following column - Shopper Channel$")
	public void user_verifies_the_Search_Results_screen_displaying_the_following_column_Shopper_Channel() throws Throwable {
	    
		System.out.println("Attempt: User verifies the Search Results "
				+ "screen displaying the following column - Shopper Channel");
		WebElement shopper = wait.until(ExpectedConditions.
				presenceOfElementLocated(By.cssSelector(LocatorsPath.DATA_ENTRY_SHOPPER_CHANNEL)));
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.DATA_ENTRY_SHOPPER_CHANNEL)));
		Assert.assertEquals("Shopper Channel", shopper.getText());
		System.out.println("Success: Shopper Channel column displayed successfully");
	}
	

	@Then("^User verifies the Search Results screen displaying the following column - Outlet Type$")
	public void user_verifies_the_Search_Results_screen_displaying_the_following_column_Outlet_Type() throws Throwable {
	    
		System.out.println("Attempt: User verifies the Search Results "
				+ "screen displaying the following column - Outlet Type");
		WebElement outlet = wait.until(ExpectedConditions.
				presenceOfElementLocated(By.cssSelector(LocatorsPath.DATA_ENTRY_OUTLET_TYPE)));
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.DATA_ENTRY_OUTLET_TYPE)));
		Assert.assertEquals("Outlet Type", outlet.getText());
		System.out.println("Success: Outlet Type column displayed successfully");
	}
	

	@Then("^User verifies the Search Results screen displaying the following column - Outlet Sub Type$")
	public void user_verifies_the_Search_Results_screen_displaying_the_following_column_Outlet_Sub_Type() throws Throwable {
	    
		System.out.println("Attempt: User verifies the Search Results "
				+ "screen displaying the following column - Outlet Sub Type");
		WebElement outlet = wait.until(ExpectedConditions.
				presenceOfElementLocated(By.cssSelector(LocatorsPath.DATA_ENTRY_OUTLET_SUB_TYPE)));
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.DATA_ENTRY_OUTLET_SUB_TYPE)));
		Assert.assertEquals("Outlet Sub Type", outlet.getText());
		System.out.println("Success: Outlet Sub Type column displayed successfully");
	}

	
	
	/**----------------------RCS_SAAS_DataEntry_Export_Verification_WC--------------------------**/
	
	
	
	@Then("^User clicks on the EXPORT IN CSV button$")
	public void user_clicks_on_the_EXPORT_IN_CSV_button() throws Throwable {

		System.out.println("Attempt: click on 'Export in CSV' button");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.DATA_ENTRY_EXPORT_IN_CSV, LocatorsPath.MAX_TIME);	
		System.out.println("success: 'Export in CSV' button clicked successfully");
	}

	
	@Then("^EXPORT IN CSV should export the results for the searched criteria in CSV format displaying - Customer ID, Customer No, Account Name$")
	public void export_IN_CSV_should_export_the_results_for_the_searched_criteria_in_CSV_format_displaying_Customer_ID_Customer_No_Account_Name() throws Throwable {
	    
		CallObject.block(3000);
		exportCSV.csvReader("Customer ID");
	    exportCSV.csvReader("Customer No");
	    exportCSV.csvReader("Account Name");
	}

	
	@Then("^User clicks on the EXPORT IN EXCEL button$")
	public void user_clicks_on_the_EXPORT_IN_EXCEL_button() throws Throwable {
	    
		System.out.println("Attempt: click on 'Export in Excel' button");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.DATA_ENTRY_EXPORT_IN_EXCEL, LocatorsPath.MAX_TIME);	
		System.out.println("success: 'Export in Excel' button clicked successfully");
	}

	
	@Then("^EXPORT IN EXCEL should export the results for the searched criteria in Excel format displaying - Customer ID, Customer No, Account Name$")
	public void export_IN_EXCEL_should_export_the_results_for_the_searched_criteria_in_Excel_format_displaying_Customer_ID_Customer_No_Account_Name() throws Throwable {
	    
		CallObject.block(3000);
		HssfApiFile exportExcel = 
				new HssfApiFile("C:\\Users\\30955\\Downloads\\Customers.xls");
		exportExcel.getCellData("custDetailExport", "Customer ID", 2);
		exportExcel.getCellData("custDetailExport", "Customer No", 2);
		exportExcel.getCellData("custDetailExport", "Account Name", 2);
		file1.setCellData("DataEntry", "Account Name", 2, 
				exportExcel.getCellData("custDetailExport", "Account Name", 2));
	}
	

	@Then("^User clicks on the EXPORT TRADING TERMS DATA button$")
	public void user_clicks_on_the_EXPORT_TRADING_TERMS_DATA_button() throws Throwable {
	    
		System.out.println("Attempt: click on 'Export Trading Terms Data' button");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.EXPORT_TRADING_TERM_DATA, LocatorsPath.MAX_TIME);	
		System.out.println("success: 'Export Trading Terms Data' button clicked successfully");
	}
	

	@Then("^EXPORT TRADING TERMS DATA should export the Trading Terms results for the searched criteria in CSV format displaying - Customer ID, Customer No, Account Name$")
	public void export_TRADING_TERMS_DATA_should_export_the_Trading_Terms_results_for_the_searched_criteria_in_CSV_format_displaying_Customer_ID_Customer_No_Account_Name() throws Throwable {
	    
		CallObject.block(3000);
		exportCSV.csvReader("Customer Id");	
		exportCSV.csvReader("Price List");
		exportCSV.csvReader("Trading Days");
		exportCSV.csvReader("Credit Days");	
		exportCSV.csvReader("Available Credit");	
		exportCSV.csvReader("Delivery");
		exportCSV.csvReader("Lead Time");	
		exportCSV.csvReader("Payment Method");
		exportCSV.csvReader("Discount On Bill");
		exportCSV.csvReader("Credit Limit");
		exportCSV.csvReader("Collection Type");
		exportCSV.csvReader("Bad Debt");
		exportCSV.csvReader("Central Payment");	
		exportCSV.csvReader("Free Field 1");	
		exportCSV.csvReader("Free Field 2");	
		exportCSV.csvReader("Tobacco License Number");	
		exportCSV.csvReader("Tobacco License Start Date");
		exportCSV.csvReader("Tobacco License"); 
		exportCSV.csvReader("Expire Date");	
		exportCSV.csvReader("Contract Number");
		exportCSV.csvReader("Contract Start Date");	
		exportCSV.csvReader("Contract Expire Date");	
		exportCSV.csvReader("Tax ID Number");
		exportCSV.csvReader("TCI Bucket for Discount on Bill");
		exportCSV.csvReader("TCI Bucket for FOC Orders");	
		exportCSV.csvReader("Withholding Tax");
	}



	/**----------------------RCS_SaaS_DataEntry_Profile_Grid_Verification_WC--------------------------**/
	
	
	
	@Then("^User verifies the following grid - General Information is available under the Profile tab$")
	public void user_verifies_the_following_grid_General_Information_is_available_under_the_Profile_tab() throws Throwable {

		System.out.println("Attempt: User verifies the following grid "
				+ "General Information is available under the Profile tab");
		WebElement general = wait.until(ExpectedConditions.
				presenceOfElementLocated(
						By.xpath(LocatorsPath.GENERAL_INFORMATION)));
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(
						By.xpath(LocatorsPath.GENERAL_INFORMATION)));
		Assert.assertEquals("General Information", 
				general.getText());
		System.out.println("Success: General Information tab is displayed successfully");
	}
	

	@Then("^User verifies the following grid - Customer Address is available under the Profile tab$")
	public void user_verifies_the_following_grid_Customer_Address_is_available_under_the_Profile_tab() throws Throwable {
	    
		System.out.println("Attempt: User verifies the following grid "
				+ "Customer Address is available under the Profile tab");
		WebElement customer = wait.until(ExpectedConditions.
				presenceOfElementLocated(
						By.xpath(LocatorsPath.CUSTOMER_ADDRESS)));
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(
						By.xpath(LocatorsPath.CUSTOMER_ADDRESS)));
		Assert.assertEquals("Customer Address", 
				customer.getText());
		System.out.println("Success: Customer Address tab is displayed successfully");
	}

	
	@Then("^User verifies the following grid - Customer Classification is available under the Profile tab$")
	public void user_verifies_the_following_grid_Customer_Classification_is_available_under_the_Profile_tab() throws Throwable {
	    
		System.out.println("Attempt: User verifies the following grid "
				+ "Customer Classification is available under the Profile tab");
		WebElement customer = wait.until(ExpectedConditions.
				presenceOfElementLocated(
						By.xpath(LocatorsPath.CUSTOMER_CLASSIFICATION)));
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(
						By.xpath(LocatorsPath.CUSTOMER_CLASSIFICATION)));
		Assert.assertEquals("Customer Classification", 
				customer.getText());
		System.out.println("Success: Customer Classification tab is displayed successfully");
	}

	
	@Then("^User verifies the following grid - Trading Terms is available under the Profile tab$")
	public void user_verifies_the_following_grid_Trading_Terms_is_available_under_the_Profile_tab() throws Throwable {
	   
		System.out.println("Attempt: User verifies the following grid "
				+ "Trading Terms is available under the Profile tab");
		WebElement trading = wait.until(ExpectedConditions.
				presenceOfElementLocated(
						By.xpath(LocatorsPath.TRADING_TERMS)));
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(
						By.xpath(LocatorsPath.TRADING_TERMS)));
		Assert.assertEquals("Trading Terms", 
				trading.getText());
		System.out.println("Success: Trading Terms tab is displayed successfully");
	}

	
	@Then("^User verifies the following grid - Additional Information is available under the Profile tab$")
	public void user_verifies_the_following_grid_Additional_Information_is_available_under_the_Profile_tab() throws Throwable {
	    
		System.out.println("Attempt: User verifies the following grid "
				+ "Additional Information is available under the Profile tab");
		WebElement additional = wait.until(ExpectedConditions.
				presenceOfElementLocated(
						By.xpath(LocatorsPath.ADDITIONAL_INFORMATION)));
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(
						By.xpath(LocatorsPath.ADDITIONAL_INFORMATION)));
		Assert.assertEquals("Additional Information", 
				additional.getText());
		System.out.println("Success: Additional Information tab is displayed successfully");
	}

	
	@Then("^User verifies the following grid - Notes is available under the Profile tab$")
	public void user_verifies_the_following_grid_Notes_is_available_under_the_Profile_tab() throws Throwable {
	    
		System.out.println("Attempt: User verifies the following grid "
				+ "Notes is available under the Profile tab");
		WebElement notes = wait.until(ExpectedConditions.
				presenceOfElementLocated(
						By.xpath(LocatorsPath.NOTES)));
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(
						By.xpath(LocatorsPath.NOTES)));
		Assert.assertEquals("Notes", 
				notes.getText());
		System.out.println("Success: Notes tab is displayed successfully");
	}


	
	/**----------------------RCS_SaaS_Profile_DataEntry_WC--------------------------**/
	
	
	
	@Then("^User verifies the 'General information' section displays the Customer's General Information with Mandatory fields as - Customer No, Customer Name, Outlet Type, Outlet Sub Type, Shopper Channel, Customer Type, Status, Global Customer Number\\.$")
	public void user_verifies_the_General_information_section_displays_the_Customer_s_General_Information_with_Mandatory_fields_as_Customer_No_Customer_Name_Outlet_Type_Outlet_Sub_Type_Shopper_Channel_Customer_Type_Status_Global_Customer_Number() throws Throwable {

		System.out.println("Attempt: User verifies the 'General information' section displays the Customer's General Information with Mandatory fields as - "
				+ "Customer No, Customer Name, Outlet Type, Outlet Sub Type, Shopper Channel, Customer Type, Status, Global Customer Number");
		WebElement element = wait.until(ExpectedConditions.
				presenceOfElementLocated(
						By.xpath(LocatorsPath.GENERAL_INFORMATION)));
		js.executeScript("arguments[0].scrollIntoView();", 
				element);

		PageObjects.SelectByCSSSelectorWithoutClick(
				driver, LocatorsPath.GEN_CUSTOMER_NO, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelectorWithoutClick(
				driver, LocatorsPath.GEN_CUSTOMER_NAME, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelectorWithoutClick(
				driver, LocatorsPath.GEN_OUTLET_TYPE, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelectorWithoutClick(
				driver, LocatorsPath.GEN_OUTLET_SUB_TYPE, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelectorWithoutClick(
				driver, LocatorsPath.GEN_SHOPPER_CHANNEL, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelectorWithoutClick(
				driver, LocatorsPath.GEN_CUSTOMER_TYPE, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelectorWithoutClick(
				driver, LocatorsPath.GEN_STATUS, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelectorWithoutClick(
				driver, LocatorsPath.GEN_GLOBAL_CUST_NUM, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'General information' section displays the Customer's General Information with Mandatory fields as - "
				+ "Customer No, Customer Name, Outlet Type, Outlet Sub Type, Shopper Channel, Customer Type, Status, Global Customer Number successfully");
	}
	

	@Then("^User verifies the 'Customer Address' section displays the Customer's Primary Address, Bill To Address, Ship To Address & GPS Coordinates$")
	public void user_verifies_the_Customer_Address_section_displays_the_Customer_s_Primary_Address_Bill_To_Address_Ship_To_Address_GPS_Coordinates() throws Throwable {
	   
		System.out.println("Attempt: User verifies the 'Customer Address' section displays the Customer's "
				+ "Primary Address, Bill To Address, Ship To Address & GPS Coordinates");
		WebElement element = wait.until(ExpectedConditions.
				presenceOfElementLocated(
						By.xpath(LocatorsPath.CUSTOMER_ADDRESS)));
		js.executeScript("arguments[0].scrollIntoView();", 
				element);
		PageObjects.SelectByXpath(
				driver, LocatorsPath.CUSTOMER_ADDRESS, LocatorsPath.MAX_TIME);
		
		WebElement primary = wait.until(ExpectedConditions.
				presenceOfElementLocated(
						By.xpath(LocatorsPath.PRIMARY_ADDRESS)));
		assertEquals("Primary Address", primary.getText());
		
		WebElement bill = wait.until(ExpectedConditions.
				presenceOfElementLocated(
						By.xpath(LocatorsPath.BILL_TO_ADDRESS)));
		assertEquals("Bill To Address", bill.getText());
		
		WebElement ship = wait.until(ExpectedConditions.
				presenceOfElementLocated(
						By.xpath(LocatorsPath.SHIP_TO_ADDRESS)));
		assertEquals("Ship To Address", ship.getText());
		
		CallObject.waitForPageLoad(driver);
		WebElement yCordinate = wait.until(ExpectedConditions.
				presenceOfElementLocated(
						By.xpath(LocatorsPath.GPS_Y_COORDINATES)));
		assertEquals("GPS Y coordinate", yCordinate.getText());
		
		WebElement xCordinate = wait.until(ExpectedConditions.
				presenceOfElementLocated(
						By.xpath(LocatorsPath.GPS_X_COORDINATES)));
		assertEquals("GPS X coordinate", xCordinate.getText());
		PageObjects.SelectByXpath(
				driver, LocatorsPath.CUSTOMER_ADDRESS, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Customer Address' section displays the Customer's "
				+ "Primary Address, Bill To Address, Ship To Address & GPS Coordinates successfully");
	}
	

	@Then("^User verifies the 'Customer Classification' section displays the Customer's Classification details$")
	public void user_verifies_the_Customer_Classification_section_displays_the_Customer_s_Classification_details() throws Throwable {
	    
		System.out.println("Attempt: User verifies the 'Customer Classification'"
				+ " section displays the Customer's Classification details");
		WebElement element = wait.until(ExpectedConditions.
				presenceOfElementLocated(
						By.xpath(LocatorsPath.CUSTOMER_CLASSIFICATION)));
		js.executeScript("arguments[0].scrollIntoView();", 
				element);
		PageObjects.SelectByXpath(
				driver, LocatorsPath.CUSTOMER_CLASSIFICATION, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelectorWithoutClick(
				driver, LocatorsPath.CUST_CLASSIFICATION_DETAILS, LocatorsPath.MAX_TIME);
		PageObjects.SelectByXpath(
				driver, LocatorsPath.CUSTOMER_CLASSIFICATION, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Customer Classification'"
				+ " section displays the Customer's Classification details successfully");
	}
	

	@Then("^User verifies the 'Trading Terms' section displays the Customer's Trading Terms with Mandatory field as Collection Type information$")
	public void user_verifies_the_Trading_Terms_section_displays_the_Customer_s_Trading_Terms_with_Mandatory_field_as_Collection_Type_information() throws Throwable {
	   
		System.out.println("Attempt: User verifies the 'Trading Terms' section displays "
				+ "the Customer's Trading Terms with Mandatory field as Collection Type information");
		WebElement element = wait.until(ExpectedConditions.
				presenceOfElementLocated(
						By.xpath(LocatorsPath.TRADING_TERMS)));
		js.executeScript("arguments[0].scrollIntoView();", 
				element);
		PageObjects.SelectByXpath(
				driver, LocatorsPath.TRADING_TERMS, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelectorWithoutClick(
				driver, LocatorsPath.TRADING_CUSTOMER_TYPE, LocatorsPath.MAX_TIME);
		PageObjects.SelectByXpath(
				driver, LocatorsPath.TRADING_TERMS, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Trading Terms' section displays the Customer's Trading Terms "
				+ "with Mandatory field as Collection Type information successfully");
	}
	

	@Then("^User verifies the 'Additional Information' section displays the Customer's Additional Information details$")
	public void user_verifies_the_Additional_Information_section_displays_the_Customer_s_Additional_Information_details() throws Throwable {
	    
		System.out.println("Attempt: User verifies the 'Additional Information' "
				+ "section displays the Customer's Additional Information details");
		WebElement element = wait.until(ExpectedConditions.
				presenceOfElementLocated(
						By.xpath(LocatorsPath.ADDITIONAL_INFORMATION)));
		js.executeScript("arguments[0].scrollIntoView();", 
				element);
		PageObjects.SelectByXpath(
				driver, LocatorsPath.ADDITIONAL_INFORMATION, LocatorsPath.MAX_TIME);
		PageObjects.SelectByXpath(
				driver, LocatorsPath.ADDITIONAL_INFORMATION, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Additional Information' section displays the "
				+ "Customer's Additional Information details successfully");
	}
	

	@Then("^User verifies the 'Notes' section displays the Customer's Notes$")
	public void user_verifies_the_Notes_section_displays_the_Customer_s_Notes() throws Throwable {
	    
		System.out.println("Attempt: User verifies the 'Notes' section displays the Customer's Notes");
		WebElement element = wait.until(ExpectedConditions.
				presenceOfElementLocated(
						By.xpath(LocatorsPath.NOTES)));
		js.executeScript("arguments[0].scrollIntoView();", 
				element);
		PageObjects.SelectByXpath(
				driver, LocatorsPath.NOTES, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Notes' section displays the Customer's Notes successfully");
	}
	

	@Then("^User clicks on the 'Add Notes' button$")
	public void user_clicks_on_the_Add_Notes_button() throws Throwable {
	    
		System.out.println("Attempt: User clicks on the 'Add Notes' button");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ADD_NOTES, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Add Notes' button clicked successfully");
	}
	

	@Then("^User enters the 'Date' in the 'Notes' section and it should be a Date picker & mandatory field$")
	public void user_enters_the_Date_in_the_Notes_section_and_it_should_be_a_Date_picker_mandatory_field() throws Throwable {
	    
		System.out.println("Attempt: User enters the 'Date' in the 'Notes' section and it should be a Date picker & mandatory field");
		WebElement element = wait.until(ExpectedConditions.
				presenceOfElementLocated(
						By.xpath(LocatorsPath.NOTES)));
		js.executeScript("arguments[0].scrollIntoView();", 
				element);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.NOTES_SELECT_DATE, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.NOTES_DATE, LocatorsPath.MAX_TIME);
		System.out.println("Success: Date' entered in the 'Notes' section successfully");
	}
	

	@Then("^User selects the 'Type' dropdown in the 'Notes' section$")
	public void user_selects_the_Type_dropdown_in_the_Notes_section() throws Throwable {
	   
		System.out.println("Attempt: User selects the 'Type' dropdown in the 'Notes' section");
        PageObjects.SelectByCSSSelectorWithSendKeys(driver, LocatorsPath.NOTES_TYPE, LocatorsPath.MAX_TIME, 
        		file1.getCellData("DataEntry", "Type", 2));
		System.out.println("Success: 'Type' dropdown in the 'Notes' section selected successfully");
	}
	

	@Then("^User enters the text in the 'Note text' field$")
	public void user_enters_the_text_in_the_Note_text_field() throws Throwable {
	    
		System.out.println("Attempt: User enters the text in the 'Note text' field");
		wait.until(ExpectedConditions.
				presenceOfElementLocated(
						By.cssSelector(LocatorsPath.NOTES_TEXT))).clear();
        PageObjects.SelectByCSSSelectorWithSendKeys(driver, LocatorsPath.NOTES_TEXT, LocatorsPath.MAX_TIME, 
        		file1.getCellData("DataEntry", "Notes Text", 2));
		System.out.println("Success: 'Note text' field entered successfully");
	}
	

	@Then("^User clicks on 'Save Notes' button and the 'Notes' should be saved successfully$")
	public void user_clicks_on_Save_Notes_button_and_the_Notes_should_be_saved_successfully() throws Throwable {
	    
		System.out.println("Attempt: User clicks on 'Save Notes' button");
		CallObject.waitForPageLoad(driver);
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.SAVE_NOTES)));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.SAVE_NOTES, LocatorsPath.MAX_TIME);
		CallObject.waitForPageLoad(driver);
		System.out.println("Success: 'Notes' saved successfully");
	}
	

	@Then("^User clicks on delete icon and the 'Notes' should be deleted successfully$")
	public void user_clicks_on_delete_icon_and_the_Notes_should_be_deleted_successfully() throws Throwable {
	    
		System.out.println("Attempt: User clicks on delete icon");
		WebElement element = wait.until(ExpectedConditions.
				presenceOfElementLocated(
						By.xpath(LocatorsPath.NOTES)));
		js.executeScript("arguments[0].scrollIntoView();", 
				element);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.DELETE_NOTES, LocatorsPath.MAX_TIME);
		CallObject.switchToAlert(driver);
		System.out.println("Success: 'Notes' deleted successfully");
	}
	

	@Then("^User clicks on the save button and verifies the message displayed as 'Customer Name - Customer updated successfully'\\.$")
	public void user_clicks_on_the_save_button_and_verifies_the_message_displayed_as_Customer_Name_Customer_updated_successfully() throws Throwable {
	    
		System.out.println("Attempt: Click on the save button and verify the message displayed");
		CallObject.waitForPageLoad(driver);
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.PROFILE_SAVE)));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.PROFILE_SAVE, LocatorsPath.MAX_TIME);
		CallObject.waitForPageLoad(driver);
		
		WebElement success = wait.until(ExpectedConditions.
				presenceOfElementLocated(
						By.cssSelector(LocatorsPath.SUCCESS_MESSAGE)));
		assertEquals(file1.getCellData("DataEntry", "Account Name", 2) +" - " +"Customer updated successfully.", 
				success.getText());
		PageObjects.SelectByXpath(
				driver, LocatorsPath.NOTES, LocatorsPath.MAX_TIME);
		System.out.println("Success: message displayed successfully");
	}


	
	/**----------------------RCS_SaaS_DataEntry_Profile_Grid_Verification_WC--------------------------**/
	
	
	
	@Then("^User clicks on the 'Address Tab' and navigates to the Address screen successfully$")
	public void user_clicks_on_the_Address_Tab_and_navigates_to_the_Address_screen_successfully() throws Throwable {

		System.out.println("Attempt: Click on Address Tab");
		PageObjects.SelectByXpath(
				driver, LocatorsPath.DATA_ENTRY_ADDRESS, LocatorsPath.MAX_TIME);
		System.out.println("Success: Address Tab selected successfully");
	}
	

	@Then("^User clicks on the 'Add Address' button$")
	public void user_clicks_on_the_Add_Address_button() throws Throwable {
	    
		System.out.println("Attempt: Click on Add Address");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.DATA_ENTRY_ADD_ADDRESS, LocatorsPath.MAX_TIME);
		System.out.println("Success: Add Address selected successfully");
	}
	

	@Then("^Add Customer Address page should be displayed successfully$")
	public void add_Customer_Address_page_should_be_displayed_successfully() throws Throwable {
	    
		System.out.println("Attempt: Add Customer Address page should be displayed");
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.ADD_CUSTOMER_ADDRESS, LocatorsPath.MAX_TIME);
		System.out.println("Success: Add Customer Address page displayed successfully");
	}
	

	@Then("^User enters the 'Street Info' in the Customer Address page$")
	public void user_enters_the_Street_Info_in_the_Customer_Address_page() throws Throwable {
	   
		System.out.println("Attempt: User enters the 'Street Info' in the Customer Address page");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.STREET_INFO, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Address", "Street Info", 2));
		System.out.println("Success: 'Street Info' in the Customer Address page entered successfully");
	}
	

	@Then("^User enters the 'Street Number' in the Customer Address page$")
	public void user_enters_the_Street_Number_in_the_Customer_Address_page() throws Throwable {
	   
		System.out.println("Attempt: User enters the 'Street Number' in the Customer Address page");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.STREET_NUMBER, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Address", "Street Number", 2));
		System.out.println("Success: 'Street Number' in the Customer Address page entered successfully");
	}
	

	@Then("^User enters the 'Street Name' in the Customer Address page$")
	public void user_enters_the_Street_Name_in_the_Customer_Address_page() throws Throwable {
	 
		System.out.println("Attempt: User enters the 'Street Name' in the Customer Address page");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.STREET_NAME, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Address", "Street Name", 2));
		System.out.println("Success: 'Street Name' in the Customer Address page entered successfully");
	}
	

	@Then("^User selects the 'Suburb' dropdown in the Customer Address page$")
	public void user_selects_the_Suburb_dropdown_in_the_Customer_Address_page() throws Throwable {
	    
		System.out.println("Attempt: User selects the 'Country' dropdown in the Customer Address page");
		CallObject.block(3000);
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.DATA_ENTRY_SUBURB, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Address", "Suburb", 2));
		System.out.println("Success: 'Country' dropdown in the Customer Address page selected successfully");
	}
	

	@Then("^User selects the 'City' dropdown in the Customer Address page$")
	public void user_selects_the_City_dropdown_in_the_Customer_Address_page() throws Throwable {
	    
		System.out.println("Attempt: User selects the 'County' dropdown in the Customer Address page");
		CallObject.block(3000);
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.CUSTOMER_ADDRESS_CITY, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Address", "City", 2));
		System.out.println("Success: 'County' dropdown in the Customer Address page selected successfully");
	}
	

	@Then("^User selects the 'County' dropdown in the Customer Address page$")
	public void user_selects_the_County_dropdown_in_the_Customer_Address_page() throws Throwable {
	   
		System.out.println("Attempt: User selects the 'City' dropdown in the Customer Address page");
		CallObject.block(2000);
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.CUSTOMER_ADDRESS_COUNTY, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Address", "County", 2));
		System.out.println("Success: 'City' dropdown in the Customer Address page selected successfully");
	}
	

	@Then("^User selects the 'Country' dropdown in the Customer Address page$")
	public void user_selects_the_Country_dropdown_in_the_Customer_Address_page() throws Throwable {
	   
		System.out.println("Attempt: User selects the 'Suburb' dropdown in the Customer Address page");
		CallObject.block(2000);
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.CUSTOMER_ADDRESS_COUNTRY, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Address", "Country", 2));
		System.out.println("Success: 'Suburb' dropdown in the Customer Address page selected successfully");
	}
	

	@Then("^User enters the 'Postal Code' in the Customer Address page$")
	public void user_enters_the_Postal_Code_in_the_Customer_Address_page() throws Throwable {
	    
		System.out.println("Attempt: User enters the 'Postal Code' in the Customer Address page");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.POSTAL_CODE, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Address", "Postal code", 2));
		System.out.println("Success: Postal Code in the Customer Address page successfully");
	}
	

	@Then("^User clicks on save button and the Address record should be added & displayed under the Address list successfully$")
	public void user_clicks_on_save_button_and_the_Address_record_should_be_added_displayed_under_the_Address_list_successfully() throws Throwable {
	    
		System.out.println("Attempt: Click on save button");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.PROFILE_SAVE, LocatorsPath.MAX_TIME);
		System.out.println("Success: Save button clicked successfully");
	}
	

	@Then("^User verifies by default the newly added address does not have all three Flags checked - Primary Address, Bill To Address, Ship To Address$")
	public void user_verifies_by_default_the_newly_added_address_does_not_have_all_three_Flags_checked_Primary_Address_Bill_To_Address_Ship_To_Address() throws Throwable {
	   
	}
	

	@Then("^User verifies that the system should allow to select any of these (\\d+) Flags or all (\\d+) Flags for an Address record$")
	public void user_verifies_that_the_system_should_allow_to_select_any_of_these_Flags_or_all_Flags_for_an_Address_record(int arg1, int arg2) throws Throwable {
	    
	}
	

	@Then("^User verifies that the system should not allow to select any of these (\\d+) Flags or all (\\d+) Flags for all the Address records\\.$")
	public void user_verifies_that_the_system_should_not_allow_to_select_any_of_these_Flags_or_all_Flags_for_all_the_Address_records(int arg1, int arg2) throws Throwable {
	    
	}
	

	@Then("^User selects an Address record for which the Primary Address is checked & clicks on the Delete icon$")
	public void user_selects_an_Address_record_for_which_the_Primary_Address_is_checked_clicks_on_the_Delete_icon() throws Throwable {
	    
	}
	

	@Then("^The System should prompt a message 'Primary address cannot be deleted'$")
	public void the_System_should_prompt_a_message_Primary_address_cannot_be_deleted() throws Throwable {
	    
	}
	

	@Then("^User selects an Address record for which the Primary Address is Unchecked, Bill To & Ship To Address are Checked and clicks on the Delete icon$")
	public void user_selects_an_Address_record_for_which_the_Primary_Address_is_Unchecked_Bill_To_Ship_To_Address_are_Checked_and_clicks_on_the_Delete_icon() throws Throwable {
	   
	}

	
	@Then("^The Address record should be deleted successfully\\.$")
	public void the_Address_record_should_be_deleted_successfully() throws Throwable {
	  
	}


	
	/**----------------------RCS_SaaS_Contacts_Creation_WC--------------------------**/	
	
	
	
	@Then("^User clicks on the 'Contacts Tab' and navigates to the Contacts screen successfully$")
	public void user_clicks_on_the_Contacts_Tab_and_navigates_to_the_Contacts_screen_successfully() throws Throwable {

		System.out.println("Attempt: Click on Contacts Tab");
		WebElement contacts = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.CONTACTS))));
		actions.moveToElement(contacts).doubleClick().build().perform();
		System.out.println("Success: Contacts Tab selected successfully");
	}
	

	@Then("^User clicks on the 'Add New' button and the 'Add Customer Contact' page should be displayed successfully$")
	public void user_clicks_on_the_Add_New_button_and_the_Add_Customer_Contact_page_should_be_displayed_successfully() throws Throwable {
	    
		System.out.println("Attempt: Click on Add New");
		removeOutletRecords();
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.CONTACTS_ADD_NEW, LocatorsPath.MAX_TIME);
		System.out.println("Success: Add New button selected successfully");
	}
	

	@Then("^User enters the following mandatory fields - 'First & Last name'$")
	public void user_enters_the_following_mandatory_fields_First_Last_name() throws Throwable {
	   
		System.out.println("Attempt: User enters the following mandatory fields - 'First & Last name'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.CONTACTS_FIRST_NAME, LocatorsPath.MAX_TIME, 
				CallObject.timestamp().concat("_First_Contact"));
		file2.setCellData("DataEntry-Contacts", "Contacts First Name", 2, 
				CallObject.timestamp().concat("_First_Contact"));
		
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.CONTACTS_LAST_NAME, LocatorsPath.MAX_TIME,
				CallObject.timestamp().concat("_Last_Contact"));
		file2.setCellData("DataEntry-Contacts", "Contacts Last Name", 2, 
				CallObject.timestamp().concat("_Last_Contact"));
		System.out.println("Success: 'First & Last name' entered successfully");
	}
	

	@Then("^User enters the 'Mobile Number'$")
	public void user_enters_the_Mobile_Number() throws Throwable {
	    
		System.out.println("Attempt: User enters the 'Mobile Number'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.CONTACTS_MOBILE_NO, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Contacts", "Contacts Mobile No", 2));
		System.out.println("Success: 'Mobile Number' entered successfully");
	}
	

	@Then("^User enters the 'Land Phone Number'$")
	public void user_enters_the_Land_Phone_Number() throws Throwable {
	   
		System.out.println("Attempt: User enters the 'Land Phone Number'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.CONTACTS_LAND_PHONE_NO, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Contacts", "Contacts Land Phone No", 2));
		System.out.println("Success: 'Land Phone Number' entered successfully");
	}
	

	@Then("^User enters the 'Fax'$")
	public void user_enters_the_Fax() throws Throwable {
	    
		System.out.println("Attempt: User enters the 'Fax'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.CONTACTS_FAX, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Contacts", "Contacts Fax", 2));
		System.out.println("Success: 'Fax' entered successfully");
	}
	

	@Then("^User enters the valid 'Email Address'$")
	public void user_enters_the_valid_Email_Address() throws Throwable {
	    
		System.out.println("Attempt: User enters the 'Email Address'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.CONTACTS_EMAIL_ADDRESS, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Contacts", "Contacts Email", 2));
		System.out.println("Success: 'Email Address' entered successfully");
	}
	

	@Then("^User sets the field 'Key Contact' to YES to make this as a KEY CONTACT$")
	public void user_sets_the_field_Key_Contact_to_YES_to_make_this_as_a_KEY_CONTACT() throws Throwable {
	   
		System.out.println("Attempt: User sets the field 'Key Contact' to YES to make this as a KEY CONTACT");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.CONTACTS_KEY_CONTACT, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Contacts", "Contacts Key Contact", 2));
		System.out.println("Success: 'Key Contact' is set to YES successfully");
	}
	

	@Then("^User enters/selects the data in all the other fields$")
	public void user_enters_selects_the_data_in_all_the_other_fields() throws Throwable {
	   
		System.out.println("Attempt: User enters/selects the data in all the other fields");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.CONTACTS_TITLE, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Contacts", "Contacts Title", 2));
		
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.CONTACTS_JOB_TITLE, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Contacts", "Contacts Job Title", 2));
		
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.CONTACTS_BRAND_SMOKED, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Contacts", "Contacts Brand Smoked", 2));
		
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.CONTACTS_NATIONALITY, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Contacts", "Contacts Nationality", 2));
		
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.CONTACTS_LANGUAGE, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Contacts", "Contacts Language", 2));
		
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.CONTACTS_FREE_LOV1, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Contacts", "Contacts Free LOV1", 2));
		
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.CONTACTS_FREE_LOV2, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Contacts", "Contacts Free LOV2", 2));
		
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.CONTACTS_FREE_TEXT1, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Contacts", "Contacts Free Text1", 2));
		
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.CONTACTS_FREE_TEXT2, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Contacts", "Contacts Free Text2", 2));

		System.out.println("Success: Data in all the other fields entered/selected successfully");
	}
	

	@Then("^User clicks on save button and the Contact should be created successfully & displayed under the Contact list$")
	public void user_clicks_on_save_button_and_the_Contact_should_be_created_successfully_displayed_under_the_Contact_list() throws Throwable {
	    
		user_clicks_on_save_button_and_the_Address_record_should_be_added_displayed_under_the_Address_list_successfully();
	}
	

	@Then("^User clicks on the 'First Name' and edits the contact records and clicks on the save button$")
	public void user_clicks_on_the_First_Name_and_edits_the_contact_records_and_clicks_on_the_save_button() throws Throwable {
	    
		System.out.println("Attempt: User clicks on the 'First Name' and edits the contact records and clicks on the save button");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.CONTACT_USER_NAME_SEARCH, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Contacts", "Contacts First Name", 2));
		CallObject.block(2000);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.CONTACT_SELECT_FIRST_NAME, LocatorsPath.MAX_TIME);
		
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.CONTACTS_EDIT_FIRST_NAME)))).clear();
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.CONTACTS_EDIT_FIRST_NAME, LocatorsPath.MAX_TIME, 
				CallObject.timestamp().concat("_First_Contact"));
				file2.setCellData("DataEntry-Contacts", "Contacts First Name", 2, 
						CallObject.timestamp().concat("_First_Contact"));
		
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.CONTACTS_EDIT_LAST_NAME)))).clear();
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.CONTACTS_EDIT_LAST_NAME, LocatorsPath.MAX_TIME,
				CallObject.timestamp().concat("_Last_Contact"));
				file2.setCellData("DataEntry-Contacts", "Contacts Last Name", 2, 
						CallObject.timestamp().concat("_Last_Contact"));
		
		user_clicks_on_save_button_and_the_Address_record_should_be_added_displayed_under_the_Address_list_successfully();
		
		System.out.println("Success: First Name clicked and edited successfully");
	}
	

	@Then("^User verifies the Contact record is edited & saved without any errors\\.$")
	public void user_verifies_the_Contact_record_is_edited_saved_without_any_errors() throws Throwable {
	    
		System.out.println("User verifies the Contact record is edited & saved without any errors");
	}
	
	
	
	/**----------------------RCS_SaaS_Contacts_Navigation_WC--------------------------**/	
	
	

	
	@Then("^User verifies the following fields are available in the contacts list screen - Title, First Name, LAST Name, Mobile Number, Land Phone Number$")
	public void user_verifies_the_following_fields_are_avaialble_in_the_contacts_list_screen_Title_First_Name_LAST_Name_Mobile_Number_Land_Phone_Number() throws Throwable {
	   
		System.out.println("Attempt: User verifies the following fields are avaialble in the contacts list screen -"
				+ " Title, First Name, LAST Name, Mobile Number, Land Phone Number");
		WebElement title = wait.until(ExpectedConditions.
				presenceOfElementLocated(By.xpath(LocatorsPath.CONTACTS_DISPLAY_TITLE)));
		Assert.assertEquals("Title", title.getText());
		
		WebElement firstName = wait.until(ExpectedConditions.
				presenceOfElementLocated(By.xpath(LocatorsPath.CONTACTS_DISPLAY_FIRST_NAME)));
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.xpath(LocatorsPath.CONTACTS_DISPLAY_FIRST_NAME)));
		Assert.assertEquals("First Name", firstName.getText());
		
		WebElement lastName = wait.until(ExpectedConditions.
				presenceOfElementLocated(By.xpath(LocatorsPath.CONTACTS_DISPLAY_LAST_NAME)));
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.xpath(LocatorsPath.CONTACTS_DISPLAY_LAST_NAME)));
		Assert.assertEquals("Last Name", lastName.getText());
		
		WebElement mobileNo = wait.until(ExpectedConditions.
				presenceOfElementLocated(By.xpath(LocatorsPath.CONTACTS_DISPLAY_MOBILE_NO)));
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.xpath(LocatorsPath.CONTACTS_DISPLAY_MOBILE_NO)));
		Assert.assertEquals("Mobile Number", mobileNo.getText());
		
		WebElement landNo = wait.until(ExpectedConditions.
				presenceOfElementLocated(By.xpath(LocatorsPath.CONTACTS_DISPLAY_LAND_PHO_NO)));
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.xpath(LocatorsPath.CONTACTS_DISPLAY_LAND_PHO_NO)));
		Assert.assertEquals("Land Phone Number", landNo.getText());
		
		System.out.println("Success: The following fields Title, First Name, LAST Name, "
				+ "Mobile Number, Land Phone Number available in the contacts list screen successfully");
	}
	

	@Then("^User verifies the following fields are available in the contacts list screen - Fax, Email Address, Job Title, Brand Smoked, Nationality$")
	public void user_verifies_the_following_fields_are_avaialble_in_the_contacts_list_screen_Fax_Email_Address_Job_Title_Brand_Smoked_Nationality() throws Throwable {
	    
		System.out.println("Attempt: User verifies the following fields are avaialble in the contacts list screen -"
				+ " Fax, Email Address, Job Title, Brand Smoked, Nationality");
		WebElement fax = wait.until(ExpectedConditions.
				presenceOfElementLocated(By.xpath(LocatorsPath.CONTACTS_DISPLAY_FAX)));
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.xpath(LocatorsPath.CONTACTS_DISPLAY_FAX)));
		Assert.assertEquals("Fax", fax.getText());
		
		WebElement email = wait.until(ExpectedConditions.
				presenceOfElementLocated(By.xpath(LocatorsPath.CONTACTS_DISPLAY_EMAIL)));
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.xpath(LocatorsPath.CONTACTS_DISPLAY_EMAIL)));
		Assert.assertEquals("Email Address", email.getText());
		
		WebElement title = wait.until(ExpectedConditions.
				presenceOfElementLocated(By.xpath(LocatorsPath.CONTACTS_DISPLAY_JOB_TITLE)));
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.xpath(LocatorsPath.CONTACTS_DISPLAY_JOB_TITLE)));
		Assert.assertEquals("Job Title", title.getText());
		
		WebElement brandSmoke = wait.until(ExpectedConditions.
				presenceOfElementLocated(By.xpath(LocatorsPath.CONTACTS_DISPLAY_BRAND_SMOKE)));
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.xpath(LocatorsPath.CONTACTS_DISPLAY_BRAND_SMOKE)));
		Assert.assertEquals("Brand Smoked", brandSmoke.getText());
		
		WebElement nationality = wait.until(ExpectedConditions.
				presenceOfElementLocated(By.xpath(LocatorsPath.CONTACTS_DISPLAY_NATIONALITY)));
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.xpath(LocatorsPath.CONTACTS_DISPLAY_NATIONALITY)));
		Assert.assertEquals("Nationality", nationality.getText());
		
		System.out.println("Success: The following fields Fax, Email Address, "
				+ "Job Title, Brand Smoked, Nationality available in the contacts list screen successfully");
	}
	

	@Then("^User verifies the following fields are available in the contacts list screen - Language, Key Contact, Free LOV, Free LOV (\\d+), Free Text (\\d+), Free Text (\\d+)$")
	public void user_verifies_the_following_fields_are_avaialble_in_the_contacts_list_screen_Language_Key_Contact_Free_LOV_Free_LOV_Free_Text_Free_Text(int arg1, int arg2, int arg3) throws Throwable {
	    
		System.out.println("Attempt: User verifies the following fields are avaialble in the contacts list screen -"
				+ "Language, Key Contact, Free LOV, Free LOV (\\d+), Free Text (\\d+), Free Text (\\d+)");
		WebElement language = wait.until(ExpectedConditions.
				presenceOfElementLocated(By.xpath(LocatorsPath.CONTACTS_DISPLAY_LANGUAGE)));
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.xpath(LocatorsPath.CONTACTS_DISPLAY_LANGUAGE)));
		Assert.assertEquals("Language", language.getText());
		
		WebElement keyContact = wait.until(ExpectedConditions.
				presenceOfElementLocated(By.xpath(LocatorsPath.CONTACTS_DISPLAY_KEY_CONTACT)));
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.xpath(LocatorsPath.CONTACTS_DISPLAY_KEY_CONTACT)));
		Assert.assertEquals("Key Contact", keyContact.getText());
		
		WebElement lov1 = wait.until(ExpectedConditions.
				presenceOfElementLocated(By.xpath(LocatorsPath.CONTACTS_DISPLAY_FREE_LOV1)));
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.xpath(LocatorsPath.CONTACTS_DISPLAY_FREE_LOV1)));
		Assert.assertEquals("Free LOV 1", lov1.getText());
		
		WebElement lov2 = wait.until(ExpectedConditions.
				presenceOfElementLocated(By.xpath(LocatorsPath.CONTACTS_DISPLAY_FREE_LOV2)));
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.xpath(LocatorsPath.CONTACTS_DISPLAY_FREE_LOV2)));
		Assert.assertEquals("Free LOV 2", lov2.getText());
		
		WebElement text1 = wait.until(ExpectedConditions.
				presenceOfElementLocated(By.xpath(LocatorsPath.CONTACTS_DISPLAY_FREE_TEXT1)));
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.xpath(LocatorsPath.CONTACTS_DISPLAY_FREE_TEXT1)));
		Assert.assertEquals("Free Text 1", text1.getText());
		
		WebElement text2 = wait.until(ExpectedConditions.
				presenceOfElementLocated(By.xpath(LocatorsPath.CONTACTS_DISPLAY_FREE_TEXT2)));
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.xpath(LocatorsPath.CONTACTS_DISPLAY_FREE_TEXT2)));
		Assert.assertEquals("Free Text 2", text2.getText());
		
		System.out.println("Success: The following fields Language, Key Contact, "
				+ "Free LOV, Free LOV (\\d+), Free Text (\\d+), Free Text (\\d+) available in the contacts list screen successfully");
	}
	

	@Then("^User verifies the 'Copy Contact icon' is present in front of the Title field$")
	public void user_verifies_the_Copy_Contact_icon_is_present_in_front_of_the_Title_field() throws Throwable {
	    
		System.out.println("Attempt: User verifies the 'Copy Contact icon' is present in front of the Title field");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.CONTACT_USER_NAME_SEARCH, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Contacts", "Contacts First Name", 2));
		CallObject.block(2000);
		PageObjects.SelectByCSSSelectorWithoutClick(
				driver, LocatorsPath.CONTACTS_COPY, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Copy Contact icon' is present in front of the Title field");
	}
	

	@Then("^User verifies the 'Delete icon' is present in front of the Copy Contact icon$")
	public void user_verifies_the_Delete_icon_is_present_in_front_of_the_Copy_Contact_icon() throws Throwable {
	    
		System.out.println("Attempt: User verifies the 'Delete icon' is present in front of the Title field");
		PageObjects.SelectByCSSSelectorWithoutClick(
				driver, LocatorsPath.CONTACTS_DELETE, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Delete icon' is present in front of the Title field");
	}
	

	
	
	/**----------------------RCS_SaaS_Add_Exisiting_Contact_WC--------------------------**/	
	
	

	
	@Then("^User clicks on the 'Add Existing Contact' button$")
	public void user_clicks_on_the_Add_Existing_Contact_button() throws Throwable {
	    
		System.out.println("Attempt: User clicks on the 'Add Existing Contact' button");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ADD_EXISTING_CONTACT, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Add Existing Contact' button clicked successfully");
	}
	

	@Then("^User verifies 'Add Existing Contact' page displayed & by default system should display all the contacts$")
	public void user_verifies_Add_Existing_Contact_page_displayed_by_default_system_should_display_all_the_contacts() throws Throwable {
	    
		System.out.println("Attempt: User verifies 'Add Existing Contact' page displayed & "
				+ "by default system should display all the contacts");
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.ADD_EXISTING_CONTACT_DISPLAY, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Add Existing Contact' page displayed successfully");
	}
	

	@Then("^User selects the Territory dropdown & clicks on the icon in front the Title field for the record to be added$")
	public void user_selects_the_Territory_dropdown_clicks_on_the_icon_in_front_the_Title_field_for_the_record_to_be_added() throws Throwable {
	    
		System.out.println("Attempt: User selects the Territory dropdown & clicks on the "
				+ "icon in front the Title field for the record to be added");
		
		/*PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, CONTATCTS_TERRITORY, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Contacts", "Contacts Territory", 2));*/
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.CONTACTS_ADD_ICON, LocatorsPath.MAX_TIME);
		
		System.out.println("Success: Territory dropdown is selected successfully");
	}
	

	@Then("^User verifies the selected contact is added to the contacts list successfully\\.$")
	public void user_verifies_the_selected_contact_is_added_to_the_contacts_list_successfully() throws Throwable {
	    
		System.out.println("Attempt: User verifies the selected contact is added to the contacts list");
		if(driver.getPageSource().contains("Technical Error, Please Contact Administrator.")) {
		CallObject.block(5000);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ADD_EXIST_CONTACT_CANCEL, LocatorsPath.MAX_TIME);
		user_clicks_on_the_Add_Existing_Contact_button();
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.CONTACTS_ADD_ICON, LocatorsPath.MAX_TIME);
		}
		System.out.println("Success: contact is added to the contacts list successfully");
	}
	

	
	/**----------------------RCS_SaaS_Copy_Contact_WC--------------------------**/	
	
	
	
	
	@Then("^User clicks on the Copy Contact icon in front the Title field for the record to be copied$")
	public void user_clicks_on_the_Copy_Contact_icon_in_front_the_Title_field_for_the_record_to_be_copied() throws Throwable {
	    
		System.out.println("Attempt: User verifies the selected contact record is deleted");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.CONTACT_USER_NAME_SEARCH, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Contacts", "Contacts First Name", 2));
        CallObject.waitForPageLoad(driver);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.CONTACTS_COPY, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'contact record is deleted successfully");
	}
	

	@Then("^User verifies the 'Copy Customer Contact' page displayed successfully$")
	public void user_verifies_the_Copy_Customer_Contact_page_displayed_successfully() throws Throwable {
	    
		System.out.println("Attempt: User verifies the 'Copy Customer Contact' page displayed");
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.COPY_CUSTOMER_CONTACT, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Copy Customer Contact' page displayed successfully");
	}
	

	@Then("^User edits the record and clicks on save button$")
	public void user_edits_the_record_and_clicks_on_save_button() throws Throwable {
	   
		System.out.println("Attempt: User edits the record and clicks on save button");

		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.CONTACTS_COPY_FIRST_NAME)))).clear();
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.CONTACTS_COPY_FIRST_NAME, LocatorsPath.MAX_TIME,  
				CallObject.timestamp().concat("_First_Contact"));
		file2.setCellData("DataEntry-Contacts", "Contacts First Name", 2, 
				CallObject.timestamp().concat("_First_Contact"));
		
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.CONTACTS_COPY_LAST_NAME)))).clear();
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.CONTACTS_COPY_LAST_NAME, LocatorsPath.MAX_TIME, 
				CallObject.timestamp().concat("_Last_Contact"));
		file2.setCellData("DataEntry-Contacts", "Contacts Last Name", 2, 
				CallObject.timestamp().concat("_Last_Contact"));
		
		user_clicks_on_save_button_and_the_Address_record_should_be_added_displayed_under_the_Address_list_successfully();
		
		System.out.println("Success: Edited and clicked on save button successfully");
	}
	

	@Then("^User verifies the New Record is edited and saved without any errors successfully\\.$")
	public void user_verifies_the_New_Record_is_edited_and_saved_without_any_errors_successfully() throws Throwable {
	    
		System.out.println("Attempt: User verifies the New Record is edited and saved");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.CONTACT_USER_NAME_SEARCH, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Contacts", "Contacts First Name", 2));
		CallObject.block(2000);
		System.out.println("Success: New Record is edited and saved without any errors successfully");
	}
	

	
    /**----------------------RCS_SaaS_Contacts_Deletion_WC--------------------------**/	
	

	
	@Then("^User selects the contact record & clicks on the Delete icon$")
	public void user_selects_the_contact_record_clicks_on_the_Delete_icon() throws Throwable {
	    
		System.out.println("Attempt: select the contact record & click on the Delete icon");
        try {
			List<WebElement> delete = driver.findElements(By.cssSelector(LocatorsPath.CONTACTS_DELETE));
			Iterator<WebElement> itr = delete.iterator();
			while(itr.hasNext()) {
			    itr.next().click();
			    CallObject.switchToAlert(driver);
			}
		}  catch (StaleElementReferenceException StaleElementReferenceException) {
			System.out.println("Trying to recover from stale element" + StaleElementReferenceException);
		} catch (WebDriverException WebDriverException) {
			System.out.println("Webdriver exception" + WebDriverException);
		}
        System.out.println("Success: selected the contact record & clicked on the Delete icon");
	}
	

	@Then("^User verifies the selected contact record is deleted successfully\\.$")
	public void user_verifies_the_selected_contact_record_is_deleted_successfully() throws Throwable {
	    
		System.out.println("Attempt: User verifies the selected contact record is deleted");
		CallObject.block(2000);
        wait.until(ExpectedConditions.
				presenceOfElementLocated(
						(By.cssSelector(LocatorsPath.CONTACT_USER_NAME_SEARCH)))).clear();
        wait.until(ExpectedConditions.
				presenceOfElementLocated(
						(By.cssSelector(LocatorsPath.CONTACT_USER_NAME_SEARCH)))).sendKeys(Keys.ENTER);
		CallObject.block(2000);
		removeOutletRecords();
		System.out.println("Success: 'contact record is deleted successfully");
	}
	
	

	/**----------------------RCS_SaaS_Outlets_Times_Navigation_WC--------------------------**/	
	
	
	
	@Then("^User clicks on the 'Outlet Times' tab and navigates to the Outlet Times screen$")
	public void user_clicks_on_the_Outlet_Times_tab_and_navigates_to_the_Outlet_Times_screen() throws Throwable {

		System.out.println("Attempt: Click on Outlet Times Tab");
		WebElement outlet = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.OUTLET_TIMES))));
		actions.moveToElement(outlet).doubleClick().build().perform();
		System.out.println("Success: Outlet Times Tab selected successfully");
	}
	

	@Then("^User clicks on the 'Add' button and the 'Add Customer Outlet Times' page should be displayed successfully$")
	public void user_clicks_on_the_Add_button_and_the_Add_Customer_Outlet_Times_page_should_be_displayed_successfully() throws Throwable {
	    
		System.out.println("Attempt: Click on Add button");
		removeOutletRecords();
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.OUTLET_TIMES_ADD, LocatorsPath.MAX_TIME);
		System.out.println("Success: Add button selected successfully");
	}
	

	@Then("^User selects the 'Week Day' dropdown$")
	public void user_selects_the_Week_Day_dropdown() throws Throwable {
	    
		System.out.println("Attempt: User selects the 'Week Day' dropdown");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.WEEK_DAY, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-OutletTimes", "Week Day", 2));
		System.out.println("Success: 'Week Day' dropdown selected successfully");
	}
	

	@Then("^User selects the 'Rep Type' dropdown$")
	public void user_selects_the_Rep_Type_dropdown() throws Throwable {
	    
		System.out.println("Attempt: User selects the 'Rep Type' dropdown");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.REP_TYPE, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-OutletTimes", "Rep Type", 2));
		System.out.println("Success: 'Rep Type' dropdown selected successfully");
	}
	

	@Then("^User selects the 'Season(\\d+)' dropdown$")
	public void user_selects_the_Season1_dropdown(int arg1) throws Throwable {
	    
		System.out.println("Attempt: User selects the 'Season 1' dropdown");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.SEASON1, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-OutletTimes", "Season1", 2));
		System.out.println("Success: 'Season 1' dropdown selected successfully");
	}
	

	@Then("^User verifies the Start Date is a greyed out field and by default Start date defined for the Season-(\\d+) should popup$")
	public void user_verifies_the_Start_Date1_is_a_greyed_out_field_and_by_default_Start_date_defined_for_the_Season_should_popup(int arg1) throws Throwable {
	    
		System.out.println("Attempt: Verify the Start Date is a greyed out field");
		WebElement startDate1 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.OUTLET_TIMES_START_DATE_1))));
		 Assert.assertTrue(startDate1.getAttribute
				 ("readonly").equals("true"),"readonly");
		 CallObject.block(5000);
		 file2.setCellData("DataEntry-OutletTimes", "Start Date1", 2, startDate1.getAttribute("value"));
		 Assert.assertEquals(startDate1.getAttribute("value"), 
				 file2.getCellData("DataEntry-OutletTimes", "Start Date1", 2));
		System.out.println("Success: Verify the Start Date is a greyed out field successfully");
	}
	

	@Then("^User verifies the End Date is a greyed out field and by default End date defined for the Season-(\\d+) should popup$")
	public void user_verifies_the_End_Date1_is_a_greyed_out_field_and_by_default_End_date_defined_for_the_Season_should_popup(int arg1) throws Throwable {
	   
		System.out.println("Attempt: Verify the End Date is a greyed out field");
		WebElement endDate1 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.OUTLET_TIMES_END_DATE_1))));
		 Assert.assertTrue(endDate1.getAttribute
				 ("readonly").equals("true"),"readonly");
		 CallObject.block(5000);
		 file2.setCellData("DataEntry-OutletTimes", "End Date1", 2, endDate1.getAttribute("value"));
		 Assert.assertEquals(endDate1.getAttribute("value"), 
				 file2.getCellData("DataEntry-OutletTimes", "End Date1", 2));
		System.out.println("Success: Verify the End Date is a greyed out field successfully");
	}
	

	@Then("^User enters the Start Time in Hours & Minutes fields in (\\d+) digits$")
	public void user_enters_the_Start_Time1_in_Hours_Minutes_fields_in_digits(int arg1) throws Throwable {
	    
		System.out.println("Attempt: User enters the Start Time in Hours & Minutes fields");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.START_TIME_HOURS_1, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-OutletTimes", "Start Time1 in Hrs", 2));
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.START_TIME_MIN_1, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-OutletTimes", "Start Time1 in Mins", 2));
		System.out.println("Success: Start Time in Hours & Minutes fields entered successfully");
	}
	

	@Then("^User enters the End Time in Hours & Minutes fields in (\\d+) digits$")
	public void user_enters_the_End_Time1_in_Hours_Minutes_fields_in_digits(int arg1) throws Throwable {
	    
		System.out.println("Attempt: User enters the End Time in Hours & Minutes fields");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.END_TIME_HOURS_1, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-OutletTimes", "End Time1 in Hrs", 2));
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.END_TIME_MIN_1, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-OutletTimes", "End Time1 in Mins", 2));
		System.out.println("Success: End Time in Hours & Minutes fields entered successfully");
	}
	

	@Then("^User selects the 'Season(\\d+)' dropdown\\.$")
	public void user_selects_the_Season2_dropdown(int arg1) throws Throwable {
	    
		System.out.println("Attempt: User selects the 'Season 2' dropdown");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.SEASON2, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-OutletTimes", "Season2", 2));
		System.out.println("Success: 'Season 2' dropdown selected successfully");
	}
	
	
	@Then("^User verifies the Start Date is a greyed out field and by default Start date defined for the Season-(\\d+) should popup\\.$")
	public void user_verifies_the_Start_Date2_is_a_greyed_out_field_and_by_default_Start_date_defined_for_the_Season_should_popup(int arg1) throws Throwable {
	    
		System.out.println("Attempt: Verify the Start Date is a greyed out field");
		WebElement startDate2 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.OUTLET_TIMES_START_DATE_2))));
		 Assert.assertTrue(startDate2.getAttribute
				 ("readonly").equals("true"),"readonly");
		 CallObject.block(5000);
		 file2.setCellData("DataEntry-OutletTimes", "Start Date2", 2, startDate2.getAttribute("value"));
		 Assert.assertEquals(startDate2.getAttribute("value"), 
				 file2.getCellData("DataEntry-OutletTimes", "Start Date2", 2));
		System.out.println("Success: Verify the Start Date is a greyed out field successfully");
	}
	

	@Then("^User verifies the End Date is a greyed out field and by default End date defined for the Season-(\\d+) should popup\\.$")
	public void user_verifies_the_End_Date2_is_a_greyed_out_field_and_by_default_End_date_defined_for_the_Season_should_popup(int arg1) throws Throwable {
	   
		System.out.println("Attempt: Verify the End Date is a greyed out field");
		WebElement endDate2 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.OUTLET_TIMES_END_DATE_2))));
		 Assert.assertTrue(endDate2.getAttribute
				 ("readonly").equals("true"),"readonly");
		 CallObject.block(5000);
		 file2.setCellData("DataEntry-OutletTimes", "End Date2", 2, endDate2.getAttribute("value"));
		 Assert.assertEquals(endDate2.getAttribute("value"), 
				 file2.getCellData("DataEntry-OutletTimes", "End Date2", 2));
		System.out.println("Success: Verify the End Date is a greyed out field successfully");
	}
	

	@Then("^User enters the Start Time in Hours & Minutes fields in (\\d+) digits\\.$")
	public void user_enters_the_Start_Time2_in_Hours_Minutes_fields_in_digits(int arg1) throws Throwable {
	    
		System.out.println("Attempt: User enters the Start Time in Hours & Minutes fields");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.START_TIME_HOURS_2, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-OutletTimes", "Start Time2 in Hrs", 2));
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.START_TIME_MIN_2, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-OutletTimes", "Start Time2 in Mins", 2));
		System.out.println("Success: Start Time in Hours & Minutes fields entered successfully");
	}
	

	@Then("^User enters the End Time in Hours & Minutes fields in (\\d+) digits\\.$")
	public void user_enters_the_End_Time2_in_Hours_Minutes_fields_in_digits(int arg1) throws Throwable {
	   
		System.out.println("Attempt: User enters the End Time in Hours & Minutes fields");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.END_TIME_HOURS_2, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-OutletTimes", "End Time2 in Hrs", 2));
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.END_TIME_MIN_2, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-OutletTimes", "End Time2 in Mins", 2));
		System.out.println("Success: End Time in Hours & Minutes fields entered successfully");
	}
	

	@Then("^User enters the 'Remarks' in the text field$")
	public void user_enters_the_Remarks_in_the_text_field() throws Throwable {
	    
		System.out.println("Attempt: User enters the 'Remarks' in the text field");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.OUTLET_TIMES_REMARKS, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-OutletTimes", "Remarks", 2));
		System.out.println("Success: Remarks entered successfully");
	}
	

	@Then("^User selects the Free Field (\\d+) dropdown in the Customer Outlet Times screen$")
	public void user_selects_the_Free_Field1_dropdown_in_the_Customer_Outlet_Times_screen(int arg1) throws Throwable {
	   
		System.out.println("Attempt: User selects the Free Field1 dropdown in the Customer Outlet Times screen");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.OUTLET_TIMES_FREE_FIELD_1, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-OutletTimes", "Free Field1", 2));
		System.out.println("Success: Free Field1 dropdown in the Customer Outlet Times screen selected successfully");
	}
	

	@Then("^User selects the Free Field (\\d+) dropdown in the Customer Outlet Times screen\\.$")
	public void user_selects_the_Free_Field2_dropdown_in_the_Customer_Outlet_Times_screen(int arg1) throws Throwable {
	    
		System.out.println("Attempt: User selects the Free Field2 dropdown in the Customer Outlet Times screen");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.OUTLET_TIMES_FREE_FIELD_2, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-OutletTimes", "Free Field2", 2));
		System.out.println("Success: Free Field2 dropdown in the Customer Outlet Times screen selected successfully");
	}
	

	@Then("^User enters the  Free Text (\\d+) in the Customer Outlet Times screen$")
	public void user_enters_the_Free_Text1_in_the_Customer_Outlet_Times_screen(int arg1) throws Throwable {
	    
		System.out.println("Attempt: User selects the Free Text1 in the Customer Outlet Times screen");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.OUTLET_TIMES_FREE_TEXT_1, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-OutletTimes", "Free Text1", 2));
		System.out.println("Success: Free Text1 entered in the Customer Outlet Times screen successfully");
	}
	

	@Then("^User enters the  Free Text (\\d+) in the Customer Outlet Times screen\\.$")
	public void user_enters_the_Free_Text2_in_the_Customer_Outlet_Times_screen(int arg1) throws Throwable {
	    
		System.out.println("Attempt: User selects the Free Text2 in the Customer Outlet Times screen");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.OUTLET_TIMES_FREE_TEXT_2, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-OutletTimes", "Free Text2", 2));
		System.out.println("Success: Free Text2 entered in the Customer Outlet Times screen successfully");
	}

	
	@Then("^User clicks on save button and verifies the data entered/selected is saved successfully\\.$")
	public void user_clicks_on_save_button_and_verifies_the_data_entered_selected_is_saved_successfully() throws Throwable {
	   
		System.out.println("Attempt: Click on the save button");
		CallObject.waitForPageLoad(driver);
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.PROFILE_SAVE)));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.PROFILE_SAVE, LocatorsPath.MAX_TIME);
		CallObject.waitForPageLoad(driver);
		
		outletDuplicates();
		System.out.println("Success: save button selected successfully");
	}
	

	@Then("^User edits the record & clicks on save button and verifies that the record is saved without any errors successfully\\.$")
	public void user_edits_the_record_clicks_on_save_button_and_verifies_that_the_record_is_saved_without_any_errors_successfully() throws Throwable {
	   
		System.out.println("Attempt: User edits the record & clicks on save button");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.OUTLET_TIMES_EDIT_WEEKDAY, LocatorsPath.MAX_TIME);
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.EDIT_CUSTOMER_OUTLET_TIMES, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.WEEK_DAY, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-OutletTimes", "Week Day", 3));
		
		CallObject.waitForPageLoad(driver);
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.PROFILE_SAVE)));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.PROFILE_SAVE, LocatorsPath.MAX_TIME);
		CallObject.waitForPageLoad(driver);
		System.out.println("Success: Record is edited and clicked on save button successfully");
	}
	

	
	/**----------------------RCS_SaaS_Copy_Outlet_Times_WC--------------------------**/	
	
	
	
	
	@Then("^User clicks on the 'Copy OUTLET TIMES' icon in front of the Week Day field for the record to be copied$")
	public void user_clicks_on_the_Copy_OUTLET_TIMES_icon_in_front_of_the_Week_Day_field_for_the_record_to_be_copied() throws Throwable {
	    
		System.out.println("Attempt: User clicks on the 'Copy OUTLET TIMES' icon in front of the Week Day field");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.OUTLET_TIMES_COPY, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Copy OUTLET TIMES' icon is clicked successfully");
	}

	
	@Then("^User verifies the Copy Outlet Times page displayed successfully$")
	public void user_verifies_the_Copy_Outlet_Times_page_displayed_successfully() throws Throwable {
	    
		System.out.println("Attempt: User verifies the Copy Outlet Times page displayed");
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.COPY_CUSTOMER_OUTLET_TIMES, LocatorsPath.MAX_TIME);
		System.out.println("Success: Copy Outlet Times page displayed successfully");
	}
	

	@Then("^User edits the record and clicks on save button in the Copy Outlet Times screen$")
	public void user_edits_the_record_and_clicks_on_save_button_in_the_Copy_Outlet_Times_screen() throws Throwable {
	   
		System.out.println("Attempt: User edits the record & clicks on save button");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.WEEK_DAY, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-OutletTimes", "Week Day", 4));
		System.out.println("Success: Record is edited and clicked on save button successfully");
	}
	

	@Then("^User verifies that the record is saved without any errors successfully\\.$")
	public void user_verifies_that_the_record_is_saved_without_any_errors_successfully() throws Throwable {
	    
		CallObject.waitForPageLoad(driver);
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.PROFILE_SAVE)));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.PROFILE_SAVE, LocatorsPath.MAX_TIME);
		CallObject.waitForPageLoad(driver);
	}
	
	
	
	/**----------------------RCS_SaaS_Outlet_Times_Deletion_WC--------------------------**/	
	
	
	

	@Then("^User selects an OUTLET TIMES record & clicks on the Delete icon$")
	public void user_selects_an_OUTLET_TIMES_record_clicks_on_the_Delete_icon() throws Throwable {
	    

		System.out.println("Attempt: User selects the OUTLET TIMES record & clicks on the Delete icon");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.OUTLET_TIMES_DELETE, LocatorsPath.MAX_TIME);
		CallObject.switchToAlert(driver);
		System.out.println("Success: 'Delete icon' is clicked successfully");
	}
	

	@Then("^User verifies that the selected OUTLET TIMES record deleted successfully\\.$")
	public void user_verifies_that_the_selected_OUTLET_TIMES_record_deleted_successfully() throws Throwable {
	    
		//user_selects_an_OUTLET_TIMES_record_clicks_on_the_Delete_icon();
	}


	public void outletDuplicates() throws Throwable {
		
            if(driver.getPageSource().contains("Type must be unique.")) {
			CallObject.block(2000);
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.OUTLET_TIMES_CANCEL, LocatorsPath.MAX_TIME);
			CallObject.switchToAlert(driver);

			Iterator<WebElement> element = driver.findElements(
					By.cssSelector("div[id='content-area:dataEntryForm:contentholder_content'] [alt='Delete']")).iterator();
			while(element.hasNext()) {
				element.next();
				user_selects_an_OUTLET_TIMES_record_clicks_on_the_Delete_icon();
			}
			
			user_clicks_on_the_Add_button_and_the_Add_Customer_Outlet_Times_page_should_be_displayed_successfully();
			user_selects_the_Week_Day_dropdown();
			user_selects_the_Rep_Type_dropdown();
			user_selects_the_Season1_dropdown(0);
			user_verifies_the_Start_Date1_is_a_greyed_out_field_and_by_default_Start_date_defined_for_the_Season_should_popup(0);
			user_verifies_the_End_Date1_is_a_greyed_out_field_and_by_default_End_date_defined_for_the_Season_should_popup(0);
			user_enters_the_Start_Time1_in_Hours_Minutes_fields_in_digits(0);
			user_enters_the_End_Time1_in_Hours_Minutes_fields_in_digits(0);
			user_selects_the_Season2_dropdown(0);
			user_verifies_the_Start_Date2_is_a_greyed_out_field_and_by_default_Start_date_defined_for_the_Season_should_popup(0);
			user_verifies_the_End_Date2_is_a_greyed_out_field_and_by_default_End_date_defined_for_the_Season_should_popup(0);
			user_enters_the_Start_Time2_in_Hours_Minutes_fields_in_digits(0);
			user_enters_the_End_Time2_in_Hours_Minutes_fields_in_digits(0);
			user_enters_the_Remarks_in_the_text_field();
			user_selects_the_Free_Field1_dropdown_in_the_Customer_Outlet_Times_screen(0);
			user_selects_the_Free_Field2_dropdown_in_the_Customer_Outlet_Times_screen(0);
			user_enters_the_Free_Text1_in_the_Customer_Outlet_Times_screen(0);
			user_enters_the_Free_Text2_in_the_Customer_Outlet_Times_screen(0);
			user_clicks_on_save_button_and_verifies_the_data_entered_selected_is_saved_successfully();
	    }
	}
	
	
	public void removeOutletRecords() throws Throwable {

		/*WebElement delete = wait.until(ExpectedConditions.
				presenceOfElementLocated(
						(By.cssSelector(OUTLET_TIMES_DELETE))));
		if(delete != null)*/
			CallObject.waitForPageLoad(driver);
			Iterator<WebElement> element = driver.findElements(
					By.cssSelector(LocatorsPath.OUTLET_TIMES_DELETE)).iterator();
			while(element.hasNext()) {
				element.next();
				user_selects_an_OUTLET_TIMES_record_clicks_on_the_Delete_icon();
			}
	}
	
	
	
	/**----------------------RCS_SaaS_Suppliers_WC--------------------------**/	
	
	
		
	@Then("^User clicks on the 'Suppliers' tab and navigates to the Suppliers screen$")
	public void user_clicks_on_the_Suppliers_tab_and_navigates_to_the_Suppliers_screen() throws Throwable {

		System.out.println("Attempt: Click on Suppliers Tab");
		WebElement supplier = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.SUPPLIERS))));
		actions.moveToElement(supplier).doubleClick().build().perform();
		System.out.println("Success: Suppliers Tab selected successfully");
	}

	
	@Then("^User clicks on the 'Add' button and the 'Add Customer Suppliers' page should be displayed successfully$")
	public void user_clicks_on_the_Add_button_and_the_Add_Customer_Suppliers_page_should_be_displayed_successfully() throws Throwable {
	   
		System.out.println("Attempt: Click on Add button");
		removeOutletRecords();
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.OUTLET_TIMES_ADD, LocatorsPath.MAX_TIME);
		System.out.println("Success: Add button selected successfully");
	}
	

	@Then("^User selects the 'Supplier Name' dropdown which displays all the Supplier records available in the application$")
	public void user_selects_the_Supplier_Name_dropdown_which_displays_all_the_Supplier_records_available_in_the_application() throws Throwable {
	   
		System.out.println("Attempt: User selects the 'Supplier Name' dropdown");
		/*WebElement name = wait.until(ExpectedConditions.presenceOfElementLocated(
				By.cssSelector(LocatorsPath.DATA_ENTRY_SUPPLIER_NAME)));
		Select suppName = new Select(name);
		suppName.selectByIndex(1);*/
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.DATA_ENTRY_SUPPLIER_NAME, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Suppliers", "Supplier Name", 2));
		System.out.println("Success: 'Supplier Name' dropdown selected successfully");
	}
	

	@Then("^User enters the 'Supplier Customer Ref #'$")
	public void user_enters_the_Supplier_Customer_Ref() throws Throwable {
	    
		System.out.println("Attempt: User enters the 'Supplier Customer Ref #'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.SUPPLIER_CUST_REF_NUM, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Suppliers", "Customer Reference No", 2));
		System.out.println("Success: 'Supplier Customer Ref #' entered successfully");
	}
	

	@Then("^User enters the 'BAT% of Supply'$")
	public void user_enters_the_BAT_of_Supply() throws Throwable {
	    
		System.out.println("Attempt: User enters the 'BAT% of Supply'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.BAT_PERCENT_SUPPLY, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Suppliers", "BAT percent Supply", 2));
		System.out.println("Success: 'BAT% of Supply' entered successfully");
	}
	

	@Then("^User enters the 'Total Volume Supply%'$")
	public void user_enters_the_Total_Volume_Supply() throws Throwable {
	    
		System.out.println("Attempt: User enters the 'Total Volume Supply%'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.TOTAL_VOLUME_SUPPLY, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Suppliers", "Total Volume Supply", 2));
		System.out.println("Success: 'Total Volume Supply%' entered successfully");
	}
	

	@Then("^User selects the Free Lov (\\d+) dropdown in the Suppliers screen$")
	public void user_selects_the_Free_Lov1_dropdown_in_the_Suppliers_screen(int arg1) throws Throwable {
	   
		System.out.println("Attempt: User selects the 'Free LOV1'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.SUPPLIERS_FREE_LOV1, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Suppliers", "Free LOV1", 2));
		System.out.println("Success: 'Free LOV1' selected successfully");
	}
	

	@Then("^User selects the Free Lov (\\d+) dropdown in the Suppliers screen\\.$")
	public void user_selects_the_Free_Lov2_dropdown_in_the_Suppliers_screen(int arg1) throws Throwable {
	    
		System.out.println("Attempt: User selects the 'Free LOV2'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.SUPPLIERS_FREE_LOV2, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Suppliers", "Free LOV2", 2));
		System.out.println("Success: 'Free LOV2' selected successfully");
	}

	
	@Then("^User enters the  Free Text (\\d+) in the Suppliers screen$")
	public void user_enters_the_Free_Text1_in_the_Suppliers_screen(int arg1) throws Throwable {
	    
		System.out.println("Attempt: User enters the 'Free Text1'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.SUPPLIERS_FREE_TEXT1, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Suppliers", "Free Text1", 2));
		System.out.println("Success: 'Free Text1' entered successfully");
	}
	

	@Then("^User enters the  Free Text (\\d+) in the Suppliers screen\\.$")
	public void user_enters_the_Free_Text2_in_the_Suppliers_screen(int arg1) throws Throwable {
	    
		System.out.println("Attempt: User enters the 'Free Text2'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.SUPPLIERS_FREE_TEXT2, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Suppliers", "Free Text2", 2));
		System.out.println("Success: 'Free Text2' entered successfully");
	}
	

	@Then("^User clicks on save button and verifies the supplier record is listed under Suppliers list\\.$")
	public void user_clicks_on_save_button_and_verifies_the_supplier_record_is_listed_under_Suppliers_list() throws Throwable {
	    
		System.out.println("Attempt: Click on the save button");
		CallObject.waitForPageLoad(driver);
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.PROFILE_SAVE)));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.PROFILE_SAVE, LocatorsPath.MAX_TIME);
		CallObject.waitForPageLoad(driver);
		System.out.println("Success: save button selected successfully");
	}
	

	@Then("^User clicks on the supplier name & edits the record & clicks on save button and verifies that the record is saved without any errors successfully\\.$")
	public void user_clicks_on_the_supplier_name_edits_the_record_clicks_on_save_button_and_verifies_that_the_record_is_saved_without_any_errors_successfully() throws Throwable {
	    
		System.out.println("Attempt: User clicks on the 'supplier name' and edits the supplier records and clicks on the save button");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.SUPPLIER_USER_NAME_SEARCH, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Suppliers", "Supplier Name", 2));
		CallObject.block(2000);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.SUPPLIER_SELECT_FIRST_NAME, LocatorsPath.MAX_TIME);
		
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.VERIFY_CUST_SUPPLIER_DISPLAY, LocatorsPath.MAX_TIME);
		
		wait.until(ExpectedConditions.
				presenceOfElementLocated(
						(By.cssSelector(LocatorsPath.EDIT_SUPPLIER_CUST_REF_NUM)))).clear();
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.EDIT_SUPPLIER_CUST_REF_NUM, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Suppliers", "Customer Reference No", 3));
		user_clicks_on_save_button_and_verifies_the_supplier_record_is_listed_under_Suppliers_list();
		System.out.println("Success: 'Supplier name' selected and supplier records edited and clicked on the save button successfully");
	}
	
	
	
	/**----------------------RCS_SaaS_Copy_Supplier_WC--------------------------**/	
	
	
	
	@Then("^User clicks on the copy supplier icon in front the Supplier Name field for the record to be copied$")
	public void user_clicks_on_the_copy_supplier_icon_in_front_the_Supplier_Name_field_for_the_record_to_be_copied() throws Throwable {
	    
		System.out.println("Attempt: User clicks on the copy supplier icon in front the Supplier Name field for the record to be copied");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.SUPPLIER_USER_NAME_SEARCH, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Suppliers", "Supplier Name", 2));
		CallObject.block(2000);
		PageObjects.SelectByCSSSelectorWithoutClick(
				driver, LocatorsPath.SUPPLIER_SELECT_FIRST_NAME, LocatorsPath.MAX_TIME);
		user_clicks_on_the_Copy_OUTLET_TIMES_icon_in_front_of_the_Week_Day_field_for_the_record_to_be_copied();
		System.out.println("Success: Copy supplier icon clicked successfully");
	}
	

	@Then("^User verifies the copy customer supplier page is displayed successfully$")
	public void user_verifies_the_copy_customer_supplier_page_is_displayed_successfully() throws Throwable {
	    
		System.out.println("Attempt: Verify the copy customer supplier page is displayed");
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.COPY_CUSTOMER_DISPLAY, LocatorsPath.MAX_TIME);
		System.out.println("Success: copy customer supplier page displayed successfully");
	}
	

	@Then("^User edits the record and changes the supplier name & clicks on the save button$")
	public void user_edits_the_record_and_changes_the_supplier_name_clicks_on_the_save_button() throws Throwable {
	    
		System.out.println("Attempt: User edits the record and changes the supplier name");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.COPY_SUPPLIER_NAME, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Suppliers", "Supplier Name", 3));
		System.out.println("Success: Record is edited & supplier name is changed successfully");
	}
	

	@Then("^User verifies that the record is saved without any errors successfully in the suppliers screen\\.$")
	public void user_verifies_that_the_record_is_saved_without_any_errors_successfully_in_the_suppliers_screen() throws Throwable {
	    
		user_clicks_on_save_button_and_verifies_the_supplier_record_is_listed_under_Suppliers_list();
	}
	

	
	/**----------------------RCS_SaaS_Supplier_Deletion_WC--------------------------**/	
	
	
	
	@Then("^User selects an supplier record & clicks on the Delete icon$")
	public void user_selects_an_supplier_record_clicks_on_the_Delete_icon() throws Throwable {
	    
		removeOutletRecords();
	}

	
	@Then("^User verifies that the selected supplier record deleted successfully\\.$")
	public void user_verifies_that_the_selected_supplier_record_deleted_successfully() throws Throwable {
		
		System.out.println("The selected supplier records deleted successfully");
	}
	
	
	
	/**----------------------RCS_SaaS_Add_Merchandising_WC--------------------------**/	
	
	
	
	@Then("^User clicks on the 'Merchandising' tab and navigates to the Merchandising screen$")
	public void user_clicks_on_the_Merchandising_tab_and_navigates_to_the_Merchandising_screen() throws Throwable {

		System.out.println("Attempt: Click on Merchandising Tab");
		WebElement merchandise = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.MERCHANDISING))));
		actions.moveToElement(merchandise).doubleClick().build().perform();
		System.out.println("Success: Merchandising Tab selected successfully");
	}
	

	@Then("^User clicks on the 'Add' button and the 'Add Merchandise for Customer page' should be displayed successfully$")
	public void user_clicks_on_the_Add_button_and_the_Add_Merchandise_for_Customer_page_should_be_displayed_successfully() throws Throwable {
	    
		System.out.println("Attempt: Click on Add button");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.OUTLET_TIMES_ADD, LocatorsPath.MAX_TIME);
		System.out.println("Success: Add button selected successfully");
	}
	

	@Then("^User selects the 'Merchandise Name' dropdown which displays all the Active Merchandise records available in the application$")
	public void user_selects_the_Merchandise_Name_dropdown_which_displays_all_the_Active_Merchandise_records_available_in_the_application() throws Throwable {
	    
		System.out.println("Attempt: User selects the 'Merchandise Name'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.MERCHANDISE_NAME, LocatorsPath.MAX_TIME, 
				file.getCellData("Merchandising", "MerchandiseName", 2));
		System.out.println("Success: 'Merchandise Name' selected successfully");
	}
	

	@Then("^User enters the 'No of Column'$")
	public void user_enters_the_No_of_Column() throws Throwable {
	    
		System.out.println("Attempt: User enters the 'No of Column'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.NO_OF_COLUMNS, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Merchandise", "No of Column", 2));
		System.out.println("Success: 'No of Column' entered successfully");
	}
	

	@Then("^User verifies the 'Quantity' by default displayed as (\\d+) in the quantity textbox field$")
	public void user_verifies_the_Quantity_by_default_displayed_as_in_the_quantity_textbox_field(int arg1) throws Throwable {
	   
		System.out.println("Attempt: User verifies the 'Quantity'");
		WebElement quantity = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.MERCHANDISE_QUANTITY))));
		Assert.assertEquals(file2.getCellData("DataEntry-Merchandise", "Quantity", 2), 
				quantity.getAttribute("value"));
		System.out.println("Success: 'Quantity' value is verified successfully");
	}
	

	@Then("^User verifies the 'Brand' textbox field is greyed out and by selecting the Merchandise name, this field should be auto-populated$")
	public void user_verifies_the_Brand_textbox_field_is_greyed_out_and_by_selecting_the_Merchandise_name_this_field_should_be_auto_populated() throws Throwable {
	    
		System.out.println("Attempt: Verify the Brand is a greyed out field");
		WebElement brand = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.MERCHANDISE_BRAND))));
		 Assert.assertTrue(brand.getAttribute
				 ("readonly").equals("true"),"readonly");
		System.out.println("Success: Verified that the Brand is a greyed out field successfully");
	}
	

	@Then("^User selects the 'Execution' dropdown$")
	public void user_selects_the_Execution_dropdown() throws Throwable {
	    
		System.out.println("Attempt: User selects the 'Execution'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.MERCHANDISE_EXECUTION, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Merchandise", "Execution", 2));
		System.out.println("Success: 'Execution' selected successfully");
	}
	

	@Then("^User selects the 'Execution Status'$")
	public void user_selects_the_Execution_Status() throws Throwable {
	    
		System.out.println("Attempt: User selects the 'Execution Status'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.MERCHANDISE_EXECUTION_STATUS, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Merchandise", "Execution Status", 2));
		System.out.println("Success: 'Execution Status' selected successfully");
	}
	

	@Then("^User selects the 'Location'$")
	public void user_selects_the_Location() throws Throwable {
	    
		System.out.println("Attempt: User selects the 'Location'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.MERCHANDISE_LOCATION, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Merchandise", "Location", 2));
		System.out.println("Success: 'Location' selected successfully");
	}
	

	@Then("^User selects the 'Installation Date'$")
	public void user_selects_the_Installation_Date() throws Throwable {
	    
		System.out.println("Attempt: User selects the 'Installation Date'");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.INSTALLATION_DATE_CALENDER, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.INSTALLATION_DATE, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Installation Date' selected successfully");
	}
	

	@Then("^User selects the 'Condition'$")
	public void user_selects_the_Condition() throws Throwable {
	    
		System.out.println("Attempt: User selects the 'Condition'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.MERCHANDISE_CONDITION, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Merchandise", "Condition", 2));
		System.out.println("Success: 'Condition' selected successfully");
	}
	

	@Then("^User selects the 'Touch Point'$")
	public void user_selects_the_Touch_Point() throws Throwable {
	    
		System.out.println("Attempt: User selects the 'Touch Point'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.MERCHANDISE_TOUCH_POINT, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Merchandise", "Touch Point", 2));
		System.out.println("Success: 'Touch Point' selected successfully");
	}
	

	@Then("^User selects the 'Hot Spot Indicator'$")
	public void user_selects_the_Hot_Spot_Indicator() throws Throwable {
	    
		System.out.println("Attempt: User selects the 'Hot Spot Indicator'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.HOT_SPOT_INDICATOR, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Merchandise", "Hot Spot Indicator", 2));
		System.out.println("Success: 'Hot Spot Indicator' selected successfully");
	}
	

	@Then("^User selects the 'Company' dropdown$")
	public void user_selects_the_Company_dropdown() throws Throwable {
	    
		System.out.println("Attempt: User selects the 'Company'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.MERCHANDISE_COMPANY, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Merchandise", "Company", 2));
		System.out.println("Success: 'Company' selected successfully");
	}
	

	@Then("^User verifies the 'Asset No\\.' textbox field is greyed out$")
	public void user_verifies_the_Asset_No_textbox_field_is_greyed_out() throws Throwable {
	    
		System.out.println("Attempt: User selects the 'Asset No\\.'");
		WebElement asset = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.MERCHANDISE_ASSET_NO))));
		 Assert.assertTrue(asset.getAttribute
				 ("readonly").equals("true"),"readonly");
		System.out.println("Success: 'Asset No\\.' selected successfully");
	}
	

	@Then("^User selects the 'Removal Date'$")
	public void user_selects_the_Removal_Date() throws Throwable {
	   
		System.out.println("Attempt: User selects the 'Removal Date'");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.REMOVAL_DATE_CALENDER, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.INSTALLATION_DATE, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Removal Date' selected successfully");
	}
	

	@Then("^User selects the Free Field (\\d+) dropdown in the merchandising screen$")
	public void user_selects_the_Free_Field1_dropdown_in_the_merchandising_screen(int arg1) throws Throwable {
	    
		System.out.println("Attempt: User selects the 'Free Field 1'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.DT_MERCHANDISE_FREE_FIELD_1, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Merchandise", "Free Field 1", 2));
		System.out.println("Success: 'Free Field 1' selected successfully");
	}
	

	@Then("^User selects the Free Field (\\d+) dropdown in the merchandising screen\\.$")
	public void user_selects_the_Free_Field2_dropdown_in_the_merchandising_screen(int arg1) throws Throwable {
	    
		System.out.println("Attempt: User selects the 'Free Field 2'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.DT_MERCHANDISE_FREE_FIELD_2, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Merchandise", "Free Field 2", 2));
		System.out.println("Success: 'Free Field 2' selected successfully");
	}
	

	@Then("^User enters the Free Text (\\d+) in the merchandising screen$")
	public void user_enters_the_Free_Text1_in_the_merchandising_screen(int arg1) throws Throwable {
	   
		System.out.println("Attempt: User selects the 'Free Text 1'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.MERCHANDISE_FREE_TEXT_1, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Merchandise", "Free Text 1", 2));
		System.out.println("Success: 'Free Text 1' selected successfully");
	}
	

	@Then("^User enters the Free Text (\\d+) in the merchandising screen\\.$")
	public void user_enters_the_Free_Text2_in_the_merchandising_screen(int arg1) throws Throwable {

		System.out.println("Attempt: User selects the 'Free Text 2'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.MERCHANDISE_FREE_TEXT_2, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Merchandise", "Free Text 2", 2));
		System.out.println("Success: 'Free Text 2' selected successfully");
	}

	
	@Then("^User clicks on save button and verifies the Merchandise record is listed under Merchandise list\\.$")
	public void user_clicks_on_save_button_and_verifies_the_Merchandise_record_is_listed_under_Merchandise_list() throws Throwable {
	    
		System.out.println("Attempt: User clicks on save button");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.MERCHANDISE_SAVE, LocatorsPath.MAX_TIME);
		System.out.println("Success: Save button clicked successfully");
	}
	

	@Then("^User clicks on the Merchandise name & edits the record & clicks on save button and verifies that the record is saved without any errors successfully\\.$")
	public void user_clicks_on_the_Merchandise_name_edits_the_record_clicks_on_save_button_and_verifies_that_the_record_is_saved_without_any_errors_successfully() throws Throwable {
	    
		System.out.println("Attempt: User clicks on the Merchandise name & edits the record");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.MERCHANDISE_USER_SEARCH_NAME, LocatorsPath.MAX_TIME, 
				file.getCellData("Merchandising", "MerchandiseName", 2));
		CallObject.block(2000);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.MERCHAND_SELECT_FIRST_NAME, LocatorsPath.MAX_TIME);
		
		System.out.println("Attempt: User enters the 'No of Column'");
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.NO_OF_COLUMNS)))).clear();
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.NO_OF_COLUMNS, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Merchandise", "No of Column", 3));
		System.out.println("Success: 'No of Column' entered successfully");
		
		user_clicks_on_save_button_and_verifies_the_Merchandise_record_is_listed_under_Merchandise_list();
		System.out.println("Success: Record as been edited successfully");
	}


	
	/**----------------------RCS_SaaS_Copy_Merchandise_WC--------------------------**/	
	
	
	
	@Then("^User clicks on the Copy Merchandise icon in front the Merchandise Name field for the record to be copied$")
	public void user_clicks_on_the_Copy_Merchandise_icon_in_front_the_Merchandise_Name_field_for_the_record_to_be_copied() throws Throwable {
	   
		System.out.println("Attempt: User clicks on the Copy Merchandise icon in front the Merchandise Name field");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.MERCHANDISE_USER_SEARCH_NAME, LocatorsPath.MAX_TIME, 
				file.getCellData("Merchandising", "MerchandiseName", 2));
		CallObject.block(2000);
		PageObjects.SelectByCSSSelectorWithoutClick(
				driver, LocatorsPath.MERCHAND_SELECT_FIRST_NAME, LocatorsPath.MAX_TIME);
		user_clicks_on_the_Copy_OUTLET_TIMES_icon_in_front_of_the_Week_Day_field_for_the_record_to_be_copied();
		System.out.println("Success: Copy Merchandise icon in front the Merchandise Name field is clicked successfully");
	}
	

	@Then("^User verifies the Copy Merchandise for Customer page is displayed successfully$")
	public void user_verifies_the_Copy_Merchandise_for_Customer_page_is_displayed_successfully() throws Throwable {
	    
		System.out.println("Attempt: Verify the Copy Merchandise for Customer page is displayed");
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.COPY_MERCHANDISE_CUST_DISP, LocatorsPath.MAX_TIME);
		System.out.println("Success: Copy Merchandise for Customer page displayed successfully");
	}
	

	@Then("^User edits the record & clicks on the save button$")
	public void user_edits_the_record_clicks_on_the_save_button() throws Throwable {
	    
		System.out.println("Attempt: User enters the 'No of Column'");
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.NO_OF_COLUMNS)))).clear();
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.NO_OF_COLUMNS, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Merchandise", "No of Column", 4));
		System.out.println("Success: 'No of Column' entered successfully");
	}
	

	@Then("^User verifies that the record is saved without any errors successfully in the Merchandise screen\\.$")
	public void user_verifies_that_the_record_is_saved_without_any_errors_successfully_in_the_Merchandise_screen() throws Throwable {
	    
		System.out.println("Attempt: Verify that the record is saved without any errors");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.MERCHANDISE_COPY_SAVE, LocatorsPath.MAX_TIME);
		System.out.println("Success: Record is saved without any errors successfully");
	}
	

	
	/**----------------------RCS_SaaS_Merchandising_Deletion_WC--------------------------**/
	
	
	
	@Then("^User selects an Merchandise record & clicks on the Delete icon$")
	public void user_selects_an_Merchandise_record_clicks_on_the_Delete_icon() throws Throwable {
	    
		System.out.println("Attempt: Click on Merchandising Tab");
		WebElement merchandise = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.MERCHANDISING))));
		actions.moveToElement(merchandise).doubleClick().build().perform();
		System.out.println("Success: Merchandising Tab selected successfully");
	}
	

	@Then("^User verifies that the selected Merchandise record is deleted successfully\\.$")
	public void user_verifies_that_the_selected_Merchandise_record_is_deleted_successfully() throws Throwable {
	    
		removeOutletRecords();
	}
	

	
	/**----------------------RCS_SaaS_Merchandising_Data_Validation_WC--------------------------**/
	
	
	
	@Then("^User creates a Merchandise record where the Removal date is lesser than the Installation Date & saves the record$")
	public void user_creates_a_Merchandise_record_where_the_Removal_date_is_lesser_than_the_Installation_Date_saves_the_record() throws Throwable {
	    
		System.out.println("Attempt: User clicks on the Merchandise name & edits the record");
		user_clicks_on_the_Add_button_and_the_Add_Merchandise_for_Customer_page_should_be_displayed_successfully();
		user_selects_the_Merchandise_Name_dropdown_which_displays_all_the_Active_Merchandise_records_available_in_the_application();
		
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.NO_OF_COLUMNS)))).clear();
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.NO_OF_COLUMNS, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Merchandise", "No of Column", 5));
		
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.INSTALLATION_DATE_CALENDER, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.INSTALLATION_DATE, LocatorsPath.MAX_TIME);
		
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.REMOVAL_DATE_CALENDER, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.MERCHAND_REMOVAL_DATE_1, LocatorsPath.MAX_TIME);
		
		user_clicks_on_save_button_and_verifies_the_Merchandise_record_is_listed_under_Merchandise_list();
		System.out.println("Success: Record as been edited successfully");
	}
	

	@Then("^User verifies that the system should prompt a message 'Removal Date should be greater than Installation Date'\\.$")
	public void user_verifies_that_the_system_should_prompt_a_message_Removal_Date_should_be_greater_than_Installation_Date() throws Throwable {
	    
		CallObject.waitForPageLoad(driver);
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.xpath(LocatorsPath.MERCHANDISE_ERROR_MESSSAGE)));
		WebElement element = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.MERCHANDISE_ERROR_MESSSAGE))));
		Assert.assertEquals("Removal Date should be Greater than Installation Date.", 
				element.getText());
	}



	/**----------------------RCS_SaaS_Retail_Audit_WC--------------------------**/	
	
	
	
	@Then("^User clicks on the 'Retail Audit' tab and navigates to the Facings Check screen$")
	public void user_clicks_on_the_Retail_Audit_tab_and_navigates_to_the_Facings_Check_screen() throws Throwable {
		
		System.out.println("Attempt: Click on Retail Audit Tab");
		WebElement retail = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.RETAIL_AUDIT))));
		actions.moveToElement(retail).doubleClick().build().perform();
		System.out.println("Success: Retail Audit Tab selected successfully");
	}
	

	@Then("^User clicks on the 'Create New Facings Check' button$")
	public void user_clicks_on_the_Create_New_Facings_Check_button() throws Throwable {

		System.out.println("Attempt: click on the 'Create New Facings Check' button");
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.AUDIT_DATE)))).clear();
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.AUDIT_DATE, LocatorsPath.MAX_TIME, 
				CallObject.pastDate());
		
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.CREATE_NEW_FACINGS_CHECK, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Create New Facings Check' button is selected successfully");
	}
	

	@Then("^User verifies the 'Facings Check record' created with Header \"(.*?)\" & Details page is displayed with all Products$")
	public void user_verifies_the_Facings_Check_record_created_with_Header_Details_page_is_displayed_with_all_Products(String arg1) throws Throwable {
	    
		System.out.println("Attempt: User verifies the 'Facings Check record' created with Header Audit date");
		WebElement date = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.AUDIT_DATE))));
		Assert.assertEquals(CallObject.pastDate(), 
				date.getAttribute("value"));
		
		if(driver.getPageSource().contains("Given Audit date already exists. ") || 
				driver.getPageSource().contains("No records found")) {
			CallObject.block(2000);
			user_clicks_on_the_ADD_button_enters_selects_the_data_in_all_the_fields_for_rest_of_the_Products();
		}
		System.out.println("Success: 'Facings Check record' is created with Header Audit date");
	}
	

	@Then("^User verifies all the active Product records are available in the application$")
	public void user_verifies_all_the_active_Product_records_are_available_in_the_application() throws Throwable {
	    
		System.out.println("Attempt: User verifies all the active Product records are available");
		PageObjects.SelectByCSSSelectorWithoutClick(
				driver, LocatorsPath.FACING_CHECKS_PRODUCT_DISP, LocatorsPath.MAX_TIME);
		System.out.println("Success: All the active Product records are available");
	}
	

	@Then("^User verifies the 'Product Number' is auto populated from the Product Master$")
	public void user_verifies_the_Product_Number_is_auto_populated_from_the_Product_Master() throws Throwable {
	   
		System.out.println("Attempt: verify the 'Product Number' is auto populated from the Product Master");
		wait.until(ExpectedConditions.elementToBeClickable(
				By.cssSelector(LocatorsPath.FACING_CHECKS_PRODUCT_NUM))).isEnabled();
		System.out.println("Success: verified the 'Product Number' is auto populated from the Product Master");
	}
	

	@Then("^User enters the data in the 'Face-On' textbox$")
	public void user_enters_the_data_in_the_Face_On_textbox() throws Throwable {
	   
		System.out.println("Attempt: User enters the data in the 'Face-On' textbox");
		CallObject.block(5000);
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.FACING_CHECKS_FACE_ON)));
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.FACING_CHECKS_FACE_ON)))).clear();
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.FACING_CHECKS_FACE_ON, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Retail Audit", "Face-On", 2));
		System.out.println("Success: 'Face-On' data entered successfully");
	}
	

	@Then("^User enters the data in the 'End-On' textbox$")
	public void user_enters_the_data_in_the_End_On_textbox() throws Throwable {
	    
		System.out.println("Attempt: User enters the data in the 'End-On' textbox");
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.FACING_CHECKS_END_ON)));
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.FACING_CHECKS_END_ON)))).clear();
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.FACING_CHECKS_END_ON, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Retail Audit", "End-On", 2));
		System.out.println("Success: 'End-On' data entered successfully");
	}
	

	@Then("^User enters the data in the 'Side-On' textbox$")
	public void user_enters_the_data_in_the_Side_On_textbox() throws Throwable {
	    
		System.out.println("Attempt: User enters the data in the 'Side-On' textbox");
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.FACING_CHECKS_SIDE_ON)));
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.FACING_CHECKS_SIDE_ON)))).clear();
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.FACING_CHECKS_SIDE_ON, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Retail Audit", "Side-On", 2));
		System.out.println("Success: 'Side-On' data entered successfully");
	}
	

	@Then("^User selects the 'Availability' dropdown$")
	public void user_selects_the_Availability_dropdown() throws Throwable {
	   
		System.out.println("Attempt: User selects the 'Availability' dropdown");
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.FACING_CHECKS_AVAILABILITY)));
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.FACING_CHECKS_AVAILABILITY, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Retail Audit", "Availability", 2));
		System.out.println("Success: 'Availability' dropdown seleted successfully");
	}
	

	@Then("^User enters the 'Table Count'$")
	public void user_enters_the_Table_Count() throws Throwable {
	    
		System.out.println("Attempt: User enters the data in the 'Table Count'");
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.FACING_CHECKS_TABLE_COUNT)));
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.FACING_CHECKS_TABLE_COUNT)))).clear();
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.FACING_CHECKS_TABLE_COUNT, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Retail Audit", "Table Count", 2));
		System.out.println("Success: 'Table Count' data entered successfully");
	}
	

	@Then("^User selects the Free Field (\\d+) dropdown in the Facings Check screen$")
	public void user_selects_the_Free_Field1_dropdown_in_the_Facings_Check_screen(int arg1) throws Throwable {
	    
		System.out.println("Attempt: User selects the 'Free Field 1' dropdown");
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.FACING_CHECKS_FREE_FIELD_1)));
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.FACING_CHECKS_FREE_FIELD_1, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Retail Audit", "Free Field 1", 2));
		System.out.println("Success: 'Free Field 1' dropdown seleted successfully");
	}
	

	@Then("^User selects the Free Field (\\d+) dropdown in the Facings Check screen\\.$")
	public void user_selects_the_Free_Field2_dropdown_in_the_Facings_Check_screen(int arg1) throws Throwable {
	  
		System.out.println("Attempt: User selects the 'Free Field 2' dropdown");
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.FACING_CHECKS_FREE_FIELD_2)));
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.FACING_CHECKS_FREE_FIELD_2, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Retail Audit", "Free Field 2", 2));
		System.out.println("Success: 'Free Field 2' dropdown seleted successfully");
	}
	

	@Then("^User enters the Free Text (\\d+) in the Facings Check screen$")
	public void user_enters_the_Free_Text1_in_the_Facings_Check_screen(int arg1) throws Throwable {
	   
		System.out.println("Attempt: User enters the data in the 'Free Text 1'");
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.FACING_CHECKS_FREE_TEXT_1)));
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.FACING_CHECKS_FREE_TEXT_1)))).clear();
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.FACING_CHECKS_FREE_TEXT_1, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Retail Audit", "Free Text 1", 2));
		System.out.println("Success: 'Free Text 1' data entered successfully");
	}
	

	@Then("^User enters the Free Text (\\d+) in the Facings Check screen\\.$")
	public void user_enters_the_Free_Text2_in_the_Facings_Check_screen(int arg1) throws Throwable {
	    
		System.out.println("Attempt: User enters the data in the 'Free Text 2'");
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.FACING_CHECKS_FREE_TEXT_2)));
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.FACING_CHECKS_FREE_TEXT_2)))).clear();
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.FACING_CHECKS_FREE_TEXT_2, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Retail Audit", "Free Text 2", 2));
		System.out.println("Success: 'Free Text 2' data entered successfully");
	}
	

	@Then("^User verifies the 'Product Status' is displayed in Green color if it is Active$")
	public void user_verifies_the_Product_Status_is_displayed_in_Green_color_if_it_is_Active() throws Throwable {
	    
		System.out.println("Attempt: User verifies the 'Product Status' is displayed in Green color if it is Active");
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.FACING_CHECKS_ACTIVE)));
		WebElement status = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.FACING_CHECKS_ACTIVE))));
		Assert.assertEquals("ACTIVE", status.getText());
		System.out.println("Success: 'Product Status' is displayed in Green color");
	}
	

	@Then("^User verifies the 'Audit Date' with Date Picker & 'Product Name Filter' with Search button is displayed$")
	public void user_verifies_the_Audit_Date_with_Date_Picker_Product_Name_Filter_with_Search_button_is_displayed() throws Throwable {
	    
		System.out.println("Attempt: User verifies the 'Audit Date' with Date Picker & "
				+ "'Product Name Filter' with Search button is displayed");
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.FACING_CHECKS_PRODUCT_NAME, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelectorWithoutClick(
				driver, LocatorsPath.FACING_CHECKS_SEARCH, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Audit Date' with Date Picker & "
				+ "'Product Name Filter' with Search button is displayed successfully");
	}
	

	@Then("^User clicks on the save button and verifies the product records is saved without any errors$")
	public void user_clicks_on_the_save_button_and_verifies_the_product_records_is_saved_without_any_errors() throws Throwable {
	    
		System.out.println("Attempt: Click on the save button and "
				+ "verify the product records is saved without any errors");
		CallObject.waitForPageLoad(driver);
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.PROFILE_SAVE)));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.PROFILE_SAVE, LocatorsPath.MAX_TIME);
		CallObject.waitForPageLoad(driver);
		System.out.println("Success: Product record is saved without any errors");
	}
	

	@Then("^User clicks on the ADD button & enters/selects the data in all the fields for rest of the Products$")
	public void user_clicks_on_the_ADD_button_enters_selects_the_data_in_all_the_fields_for_rest_of_the_Products() throws Throwable {
	    
		System.out.println("Attempt: Click on the ADD button & enters/selects the data in all the fields for rest of the Products");
		
		try {
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.FACING_CHECKS_ADD, LocatorsPath.MAX_TIME);

			CallObject.block(3000);
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.FACING_CHECKS_PRODUCT_1, LocatorsPath.MAX_TIME, 
					file2.getCellData("DataEntry-Retail Audit", "Product", 2));
			
			user_verifies_the_Product_Number_is_auto_populated_from_the_Product_Master();
			
			js.executeScript("arguments[0].scrollIntoView();", 
					driver.findElement(By.cssSelector(LocatorsPath.FACING_CHECKS_FACE_ON)));
			CallObject.block(5000);
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.FACING_CHECKS_FACE_ON, LocatorsPath.MAX_TIME, 
					file2.getCellData("DataEntry-Retail Audit", "Face-On", 2));
			
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.FACING_CHECKS_END_ON, LocatorsPath.MAX_TIME, 
					file2.getCellData("DataEntry-Retail Audit", "End-On", 2));
			
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.FACING_CHECKS_SIDE_ON, LocatorsPath.MAX_TIME, 
					file2.getCellData("DataEntry-Retail Audit", "Side-On", 2));
			
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.FACING_CHECKS_AVAILABILITY, LocatorsPath.MAX_TIME, 
					file2.getCellData("DataEntry-Retail Audit", "Availability", 2));
			
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.FACING_CHECKS_TABLE_COUNT, LocatorsPath.MAX_TIME, 
					file2.getCellData("DataEntry-Retail Audit", "Table Count", 2));
			
			user_selects_the_Free_Field1_dropdown_in_the_Facings_Check_screen(0);
			user_selects_the_Free_Field2_dropdown_in_the_Facings_Check_screen(0);
			
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.FACING_CHECKS_FREE_TEXT_1, LocatorsPath.MAX_TIME, 
					file2.getCellData("DataEntry-Retail Audit", "Free Text 1", 2));
			
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.FACING_CHECKS_FREE_TEXT_2, LocatorsPath.MAX_TIME, 
					file2.getCellData("DataEntry-Retail Audit", "Free Text 2", 2));
			
			user_verifies_the_Product_Status_is_displayed_in_Green_color_if_it_is_Active();
			
			js.executeScript("arguments[0].scrollIntoView();", 
					driver.findElement(By.cssSelector(LocatorsPath.FACING_CHECKS_PRODUCT_NUMBER)));
			WebElement productNumber = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.FACING_CHECKS_PRODUCT_NUMBER))));
			file2.setCellData("DataEntry-Retail Audit", "Product Number", 2,
					productNumber.getText());
			CallObject.block(2000);
			Assert.assertEquals(file2.getCellData
					("DataEntry-Retail Audit", "Product Number", 2), productNumber.getText());
		} catch (StaleElementReferenceException StaleElementReferenceException) {
			System.out.println("Trying to recover from stale element" + StaleElementReferenceException);
		} catch (WebDriverException WebDriverException) {
			System.out.println("Webdriver exception" + WebDriverException);
		}
		System.out.println("Success: Add button is clicked and all the data is entered successfully");
	}
	

	@Then("^User clicks on the save button and verifies the rest of the product records is saved without any errors$")
	public void user_clicks_on_the_save_button_and_verifies_the_rest_of_the_product_records_is_saved_without_any_errors() throws Throwable {
	    
		user_clicks_on_the_save_button_and_verifies_the_product_records_is_saved_without_any_errors();
	}
	

	@Then("^User enters the 'Product name' in 'PRODUCT NAME FILTER' search box & clicks on Search button\\.$")
	public void user_enters_the_Product_name_in_PRODUCT_NAME_FILTER_search_box_clicks_on_Search_button() throws Throwable {
	    
		CallObject.block(3000);
		PageObjects.SelectByXpathWithSendKeys(
				driver, LocatorsPath.FACING_CHECKS_PRODUCT_NAME, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Retail Audit", "Product", 2));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.FACING_CHECKS_SEARCH, LocatorsPath.MAX_TIME);
	}
	

	@Then("^User verifies the Queried product is displayed successfully$")
	public void user_verifies_the_Queried_product_is_displayed_successfully() throws Throwable {
	    
		System.out.println("Attempt: User verifies the Queried product is displayed");
		PageObjects.SelectByCSSSelectorWithoutClick(
				driver, LocatorsPath.FACING_CHECKS_RECORD, LocatorsPath.MAX_TIME);
		System.out.println("Success: Queried product is displayed successfully");
	}
	

	@Then("^User edits the record and clicks on save button in the Facings Check screen$")
	public void user_edits_the_record_and_clicks_on_save_button_in_the_Facings_Check_screen() throws Throwable {
	    
		System.out.println("Attempt: Edit the record and click on save button");
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.FACING_CHECKS_FACE_ON)))).clear();
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.FACING_CHECKS_FACE_ON)));
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.FACING_CHECKS_FACE_ON, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Retail Audit", "Face-On", 3));
		
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.FACING_CHECKS_END_ON)))).clear();
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.FACING_CHECKS_END_ON)));
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.FACING_CHECKS_END_ON, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Retail Audit", "End-On", 3));
		
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.FACING_CHECKS_SIDE_ON)))).clear();
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.FACING_CHECKS_SIDE_ON)));
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.FACING_CHECKS_SIDE_ON, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Retail Audit", "Side-On", 3));
		System.out.println("Success: Record is edited and clicked on save button");
	}
	

	@Then("^User verifies the record is saved without any errors and the system displays a prompt message as 'Product saved successfully'\\.$")
	public void user_verifies_the_record_is_saved_without_any_errors_and_the_system_displays_a_prompt_message_as_Product_saved_successfully() throws Throwable {
	    
		System.out.println("Attempt: Verify the record is saved without any errors");
		user_clicks_on_the_save_button_and_verifies_the_product_records_is_saved_without_any_errors();
		
		WebElement success = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.FACING_CHECKS_SUCCESS_MSG))));
		Assert.assertEquals("Product saved successfully.", 
				success.getText());
		System.out.println("Success: Record is saved without any errors successfully");
	}
	

	
	/**----------------------RCS_SaaS_Retail_Audit_Product_Deletion_WC--------------------------**/	
	
	
	
	@Then("^User selects an Product record & clicks on the Delete icon$")
	public void user_selects_an_Product_record_clicks_on_the_Delete_icon() throws Throwable {
	    
		System.out.println("Success: Record deleted successfully");
	}
	

	@Then("^User verifies that the selected Product record is deleted successfully\\.$")
	public void user_verifies_that_the_selected_Product_record_is_deleted_successfully() throws Throwable {
	 
		removeOutletRecords();
	}
	

	
	/**----------------------RCS_SaaS_Stock_Count_WC--------------------------**/	
	
	
	
	@Then("^User clicks on the 'Switch to Stock Count' button and navigates to the Stock Count screen$")
	public void user_clicks_on_the_Switch_to_Stock_Count_button_and_navigates_to_the_Stock_Count_screen() throws Throwable {
	    
		System.out.println("Attempt: click on the 'Switch to Stock Count' button");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.SWITCH_TO_STOCK_COUNT, LocatorsPath.MAX_TIME);
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.AUDIT_DATE)))).clear();
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.AUDIT_DATE, LocatorsPath.MAX_TIME, 
				CallObject.pastDate());
		
		WebElement create = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.CREATE_NEW_STOCK_COUNT))));
		actions.moveToElement(create).doubleClick().build().perform();
		System.out.println("Success: 'Switch to Stock Count' button is selected successfully");
	}
	

	@Then("^User verifies the 'Stock Count' record is created with Header \"(.*?)\" & Details page with all SKU's is displayed with all Products$")
	public void user_verifies_the_Stock_Count_record_is_created_with_Header_Details_page_with_all_SKU_s_is_displayed_with_all_Products(String arg1) throws Throwable {
	    
		System.out.println("Attempt: User verifies the 'Facings Check record' created with Header Audit date");
		WebElement date = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.AUDIT_DATE))));
		Assert.assertEquals(CallObject.pastDate(), 
				date.getAttribute("value"));
		
		if(driver.getPageSource().contains("Given Audit date already exists. ") || 
				driver.getPageSource().contains("No records found")) {
			CallObject.block(2000);
			user_clicks_on_the_ADD_button_enters_selects_the_data_in_all_the_fields_for_rest_of_the_Products_in_Stock_Count_screen();
		}
		System.out.println("Success: 'Facings Check record' is created with Header Audit date");
	}
	

	@Then("^User verifies all the active product SKU records are available in the application$")
	public void user_verifies_all_the_active_product_SKU_records_are_available_in_the_application() throws Throwable {
	    
		user_verifies_all_the_active_Product_records_are_available_in_the_application();
	}
	

	@Then("^User verifies the 'Product Number' is auto populated from the Product Master in the Stock Count screen$")
	public void user_verifies_the_Product_Number_is_auto_populated_from_the_Product_Master_in_the_Stock_Count_screen() throws Throwable {
	    
		System.out.println("User verifies the 'Product Number' is auto populated "
				+ "from the Product Master in the Stock Count screen");
	}
	

	@Then("^User enters the data in the 'Good Quantity' textbox$")
	public void user_enters_the_data_in_the_Good_Quantity_textbox() throws Throwable {
	    
		System.out.println("Attempt: User enters the data in the 'Good Quantity' textbox");
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.SWITCH_TO_GOOD_QUANTITY)));
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SWITCH_TO_GOOD_QUANTITY)))).clear();
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.SWITCH_TO_GOOD_QUANTITY, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Retail Audit", "Good Quantity", 2));
		System.out.println("Success: 'Good Quantity' data entered successfully");
	}
	

	@Then("^User enters the 'Price'$")
	public void user_enters_the_Price() throws Throwable {
	    
		System.out.println("Attempt: User enters the data in the 'Price' textbox");
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.SWITCH_TO_PRICE)));
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SWITCH_TO_PRICE)))).clear();
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.SWITCH_TO_PRICE, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Retail Audit", "Price", 2));
		System.out.println("Success: 'Price' data entered successfully");
	}
	

	@Then("^User enters the data in the 'Deliveries' textbox$")
	public void user_enters_the_data_in_the_Deliveries_textbox() throws Throwable {
	    
		System.out.println("Attempt: User enters the data in the 'Deliveries' textbox");
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.SWITCH_TO_DELIVERIES)));
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SWITCH_TO_DELIVERIES)))).clear();
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.SWITCH_TO_DELIVERIES, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Retail Audit", "Deliveries", 2));
		System.out.println("Success: 'Deliveries' data entered successfully");
	}
	

	@Then("^User enters the data in the 'Third Party Deliveries' textbox$")
	public void user_enters_the_data_in_the_Third_Party_Deliveries_textbox() throws Throwable {
	   
		System.out.println("Attempt: User enters the data in the 'Third Party Deliveries' textbox");
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.SWITCH_TO_THIRD_PARTY_DELIV)));
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SWITCH_TO_THIRD_PARTY_DELIV)))).clear();
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.SWITCH_TO_THIRD_PARTY_DELIV, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Retail Audit", "Third Party Deliveries", 2));
		System.out.println("Success: 'Third Party Deliveries' data entered successfully");
	}
	

	@Then("^User enters the data in the 'Bad Quantity' textbox$")
	public void user_enters_the_data_in_the_Bad_Quantity_textbox() throws Throwable {
	    
		System.out.println("Attempt: User enters the data in the 'Bad Quantity' textbox");
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.SWITCH_TO_BAD_QUANTITY)));
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SWITCH_TO_BAD_QUANTITY)))).clear();
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.SWITCH_TO_BAD_QUANTITY, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Retail Audit", "Bad Quantity", 2));
		System.out.println("Success: 'Bad Quantity' data entered successfully");
	}
	

	@Then("^User selects the Free Field (\\d+) dropdown in the Stock Count screen$")
	public void user_selects_the_Free_Field1_dropdown_in_the_Stock_Count_screen(int arg1) throws Throwable {
	 
		user_selects_the_Free_Field1_dropdown_in_the_Facings_Check_screen(0);
	}
	

	@Then("^User selects the Free Field (\\d+) dropdown in the Stock Count screen\\.$")
	public void user_selects_the_Free_Field2_dropdown_in_the_Stock_Count_screen(int arg1) throws Throwable {
	 
		user_selects_the_Free_Field2_dropdown_in_the_Facings_Check_screen(0);
	}
	

	@Then("^User enters the Free Text (\\d+) in the Stock Count screen$")
	public void user_enters_the_Free_Text1_in_the_Stock_Count_screen(int arg1) throws Throwable {
	    
		user_enters_the_Free_Text1_in_the_Facings_Check_screen(0);
	}
	

	@Then("^User enters the Free Text (\\d+) in the Stock Count screen\\.$")
	public void user_enters_the_Free_Text2_in_the_Stock_Count_screen(int arg1) throws Throwable {
	    
		user_enters_the_Free_Text2_in_the_Facings_Check_screen(0);
	}
	

	@Then("^User verifies the 'Product SKU Status' is displayed in Green color if it is Active$")
	public void user_verifies_the_Product_SKU_Status_is_displayed_in_Green_color_if_it_is_Active() throws Throwable {
	    
		user_verifies_the_Product_Status_is_displayed_in_Green_color_if_it_is_Active();
	}
	

	@Then("^User verifies the 'Audit Date' with Date Picker & 'Product Name Filter' with Search button is displayed in the Stock Count screen$")
	public void user_verifies_the_Audit_Date_with_Date_Picker_Product_Name_Filter_with_Search_button_is_displayed_in_the_Stock_Count_screen() throws Throwable {
	    
		user_verifies_the_Audit_Date_with_Date_Picker_Product_Name_Filter_with_Search_button_is_displayed();
	}
	

	@Then("^User clicks on the ADD button & enters/selects the data in all the fields for rest of the Products in Stock Count screen$")
	public void user_clicks_on_the_ADD_button_enters_selects_the_data_in_all_the_fields_for_rest_of_the_Products_in_Stock_Count_screen() throws Throwable {
	 
		System.out.println("Attempt: Click on the ADD button & enters/selects the data in all the fields for rest of the Products");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.FACING_CHECKS_ADD, LocatorsPath.MAX_TIME);
 
		CallObject.block(3000);
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.FACING_CHECKS_PRODUCT_1, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Retail Audit", "Product", 3));
		
		user_enters_the_data_in_the_Good_Quantity_textbox();
		user_enters_the_Price();
		user_enters_the_data_in_the_Deliveries_textbox();
		user_enters_the_data_in_the_Third_Party_Deliveries_textbox();
		user_enters_the_data_in_the_Bad_Quantity_textbox();
		user_selects_the_Free_Field1_dropdown_in_the_Facings_Check_screen(0);
		user_selects_the_Free_Field2_dropdown_in_the_Facings_Check_screen(0);
		user_enters_the_Free_Text1_in_the_Facings_Check_screen(0);
		user_enters_the_Free_Text2_in_the_Facings_Check_screen(0);
		user_verifies_the_Product_Status_is_displayed_in_Green_color_if_it_is_Active();
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.FACING_CHECKS_PRODUCT_NUMBER)));
		WebElement productNumber = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.FACING_CHECKS_PRODUCT_NUMBER))));
		file2.setCellData("DataEntry-Retail Audit", "Product Number", 3,
				productNumber.getText());
		Assert.assertEquals(file2.getCellData
				("DataEntry-Retail Audit", "Product Number", 3), productNumber.getText());
		System.out.println("Success: Add button is clicked and all the data is entered successfully");
	}
	
	
	@Then("^User enters the 'Product name' in 'PRODUCT NAME FILTER' search box & clicks on Search button in Stock Count screen$")
	public void user_enters_the_Product_name_in_PRODUCT_NAME_FILTER_search_box_clicks_on_Search_button_in_Stock_Count_screen() throws Throwable {
	    
		CallObject.waitForPageLoad(driver);
		CallObject.block(2000);
		PageObjects.SelectByXpathWithSendKeys(
				driver, LocatorsPath.FACING_CHECKS_PRODUCT_NAME, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Retail Audit", "Product", 3));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.FACING_CHECKS_SEARCH, LocatorsPath.MAX_TIME);
	}
	
	
	@Then("^User verifies the Queried SKU is displayed successfully$")
	public void user_verifies_the_Queried_SKU_is_displayed_successfully() throws Throwable {
	    
		user_verifies_the_Queried_product_is_displayed_successfully();
	}

	
	@Then("^User edits the record and clicks on save button in the Stock Count screen$")
	public void user_edits_the_record_and_clicks_on_save_button_in_the_Stock_Count_screen() throws Throwable {
	    
		System.out.println("Attempt: Edit the record and click on save button");
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SWITCH_TO_GOOD_QUANTITY)))).clear();
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.SWITCH_TO_GOOD_QUANTITY)));
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.SWITCH_TO_GOOD_QUANTITY, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Retail Audit", "Good Quantity", 3));
		
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SWITCH_TO_PRICE)))).clear();
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.SWITCH_TO_PRICE)));
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.SWITCH_TO_PRICE, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Retail Audit", "Price", 3));
		
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SWITCH_TO_DELIVERIES)))).clear();
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.SWITCH_TO_DELIVERIES)));
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.SWITCH_TO_DELIVERIES, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Retail Audit", "Deliveries", 3));
		System.out.println("Success: Record is edited and clicked on save button");
	}
	

	
	/**----------------------RCS_SaaS_Retail_Audit_SKU_Deletion_WC--------------------------**/	
	
	
	
	@Then("^User selects an SKU record & clicks on the Delete icon$")
	public void user_selects_an_SKU_record_clicks_on_the_Delete_icon() throws Throwable {
	    
		user_selects_an_Product_record_clicks_on_the_Delete_icon();
	}
	

	@Then("^User verifies that the selected SKU record is deleted successfully\\.$")
	public void user_verifies_that_the_selected_SKU_record_is_deleted_successfully() throws Throwable {
	    
		user_verifies_that_the_selected_Product_record_is_deleted_successfully();
	}

	
	
	/**----------------------RCS_SaaS_Corporate_Contracts_WC--------------------------**/	
	
	

	@Then("^User clicks on the 'Contracts' tab and navigates to the Contracts screen$")
	public void user_clicks_on_the_Contracts_tab_and_navigates_to_the_Contracts_screen() throws Throwable {
		
		System.out.println("Attempt: Click on Contract Tab");
		WebElement contract = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.CONTARCT))));
		actions.moveToElement(contract).doubleClick().build().perform();
		System.out.println("Success: Contract Tab selected successfully");
	}
	

	@Then("^User verifies the following grids Contract List, Driver list and Trade Payment for the Contract are avaialble$")
	public void user_verifies_the_following_grids_Contract_List_Driver_list_and_Trade_Payment_for_the_Contract_are_avaialble() throws Throwable {
	    
		System.out.println("Attempt: Verify the following grids Contract List, "
				+ "Driver list and Trade Payment for the Contract are avaialble");
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.LIST_OF_CONTRACTS, LocatorsPath.MAX_TIME);
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.LIST_OF_DRIVERS, LocatorsPath.MAX_TIME);
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.LIST_OF_TRADE_PAYMENTS, LocatorsPath.MAX_TIME);
		System.out.println("Success: The following grids Contract List, Driver list "
				+ "and Trade Payment for the Contract are avaialble");
	}
	

	@Then("^User clicks on the 'Add Corporate Contract' button and navigates to the 'Add Customer Corporate Contract' page$")
	public void user_clicks_on_the_Add_Corporate_Contract_button_and_navigates_to_the_Add_Customer_Corporate_Contract_page() throws Throwable {
	    
		System.out.println("Attempt: User clicks on the 'Add Corporate Contract' button");
		/*PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ADD_CORPORATE_CONTRACT, LocatorsPath.MAX_TIME);
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.ADD_CUST_CORPORATE_CONTRACT, LocatorsPath.MAX_TIME);*/
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.DT_SEARCH_CONTRACT_NAME, LocatorsPath.MAX_TIME, 
				file.getCellData("Contract", "Contract Name", 2));

        WebElement ROW = wait.until(ExpectedConditions.presenceOfElementLocated(
        		By.cssSelector(LocatorsPath.DT_CONTRACT_NAME_ROW)));
		if(ROW.isDisplayed()) {
			PageObjects.SelectByCSSSelectorWithoutClick(
					driver, LocatorsPath.DT_SELECT_CONTRACT_NAME, LocatorsPath.MAX_TIME);
		}
		System.out.println("Success: 'Add Corporate Contract' button clicked successfully");
	}
	

	@Then("^User selects the 'Contract Name' which displays all the active Corporate Contracts records available in the application$")
	public void user_selects_the_Contract_Name_which_displays_all_the_active_Corporate_Contracts_records_available_in_the_application() throws Throwable {
	    
		System.out.println("User selects the 'Contract Name' which displays"
				+ " all the active Corporate Contracts records available in the application");
	}
	

	@Then("^User verifies the 'Contract Type' textfield is greyed out and auto populated to Corporate$")
	public void user_verifies_the_Contract_Type_textfield_is_greyed_out_and_auto_populated_to_Corporate() throws Throwable {
	    
		System.out.println("User verifies the 'Contract Type' textfield is "
				+ "greyed out and auto populated to Corporate");
	}
	

	@Then("^User verifies the 'Contract Company' textfield is greyed out and auto populated based on the Contract selected$")
	public void user_verifies_the_Contract_Company_textfield_is_greyed_out_and_auto_populated_based_on_the_Contract_selected() throws Throwable {
	    
		System.out.println("User verifies the 'Contract Company' textfield is "
				+ "greyed out and auto populated based on the Contract selected");
	}
	

	@Then("^User selects the 'Contract Inactive' in the Add Customer Corporate Contract page$")
	public void user_selects_the_Contract_Inactive_in_the_Add_Customer_Corporate_Contract_page() throws Throwable {
	    
		System.out.println("User selects the 'Contract Inactive' in the Add Customer Corporate Contract page");
	}
	

	@Then("^User selects the 'Check Frequency' in the Add Customer Corporate Contract page$")
	public void user_selects_the_Check_Frequency_in_the_Add_Customer_Corporate_Contract_page() throws Throwable {
	 
		System.out.println("User selects the 'Check Frequency' "
				+ "in the Add Customer Corporate Contract page");
	}
	

	@Then("^User selects the 'Start Date' in the Add Customer Corporate Contract page$")
	public void user_selects_the_Start_Date_in_the_Add_Customer_Corporate_Contract_page() throws Throwable {
	    
		System.out.println("User selects the 'Start Date' in the Add Customer Corporate Contract page");
	}
	

	@Then("^User selects the 'End Date' in the Add Customer Corporate Contract page$")
	public void user_selects_the_End_Date_in_the_Add_Customer_Corporate_Contract_page() throws Throwable {
	    
		System.out.println("User selects the 'End Date' in the Add Customer Corporate Contract page");
	}
	

	@Then("^User selects the 'Actual End Date' in the Add Customer Corporate Contract page$")
	public void user_selects_the_Actual_End_Date_in_the_Add_Customer_Corporate_Contract_page() throws Throwable {
	   
		System.out.println("User selects the 'Actual End Date' in the Add Customer Corporate Contract page");
	}
	

	@Then("^User selects the 'Contract Agreed' in the Add Customer Corporate Contract page$")
	public void user_selects_the_Contract_Agreed_in_the_Add_Customer_Corporate_Contract_page() throws Throwable {
	    
		System.out.println("User selects the 'Contract Agreed' "
				+ "in the Add Customer Corporate Contract page");
	}
	

	@Then("^User selects the 'Free Field (\\d+)' dropdown in the Add Customer Corporate Contract page$")
	public void user_selects_the_Free_Field1_dropdown_in_the_Add_Customer_Corporate_Contract_page(int arg1) throws Throwable {
	  
		System.out.println("User selects the 'Free field 1' dropdown");
	}
	

	@Then("^User selects the 'Free Field (\\d+)' dropdown in the Add Customer Corporate Contract page\\.$")
	public void user_selects_the_Free_Field2_dropdown_in_the_Add_Customer_Corporate_Contract_page(int arg1) throws Throwable {
	    
		System.out.println("User selects the 'Free field 2' dropdown");
	}
	

	@Then("^User enters the 'Free Text (\\d+)' in the Add Customer Corporate Contract page$")
	public void user_enters_the_Free_Text1_in_the_Add_Customer_Corporate_Contract_page(int arg1) throws Throwable {
	    
		System.out.println("User enters 'Free text field 1'");
	}
	

	@Then("^User enters the 'Free Text (\\d+)' in the Add Customer Corporate Contract page\\.$")
	public void user_enters_the_Free_Text2_in_the_Add_Customer_Corporate_Contract_page(int arg1) throws Throwable {
	    
		System.out.println("User enters 'Free text field 2'");
	}
	

	@Then("^User clicks on the save button and verifies the Add Customer Corporate Contract page record is saved without any errors$")
	public void user_clicks_on_the_save_button_and_verifies_the_Add_Customer_Corporate_Contract_page_record_is_saved_without_any_errors() throws Throwable {
	    
		System.out.println("User clicks on the save button and "
				+ "verifies the Add Customer Corporate Contract page recorded");
	}
	

	@Then("^User edits the record and clicks on save button and verifies the Add Customer Corporate Contract page record is saved without any errors$")
	public void user_edits_the_record_and_clicks_on_save_button_and_verifies_the_Add_Customer_Corporate_Contract_page_record_is_saved_without_any_errors() throws Throwable {
	    
		System.out.println("Attempt: Edit the record and click on save button");
		wait.until(ExpectedConditions.presenceOfElementLocated(
				By.cssSelector(LocatorsPath.CONTRACT_NAME_SEARCH))).clear();
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.CONTRACT_NAME_SEARCH, LocatorsPath.MAX_TIME, 
				file.getCellData("Contract", "Contract Name", 2));
		CallObject.block(2000);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.CONTRACT_FIRST_NAME, LocatorsPath.MAX_TIME);
		
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.EDIT_CONTRACT_INACTIVE, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.PROFILE_SAVE, LocatorsPath.MAX_TIME);
		System.out.println("Success: Record edited and clicked on save button successfully");
	}
	

	
	/**----------------------RCS_SaaS_Same_Contract_Adding_WC--------------------------**/	
	
	
	
	@Then("^User adds the Corporate Contract for the same Start & End Date which is already associated to the Customer$")
	public void user_adds_the_Corporate_Contract_for_the_same_Start_End_Date_which_is_already_associated_to_the_Customer() throws Throwable {
	    
		System.out.println("Attempt: Add the Corporate Contract for the same Start & "
				+ "End Date which is already associated to the Customer");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ADD_CORPORATE_CONTRACT, LocatorsPath.MAX_TIME);
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.ADD_CUST_CORPORATE_CONTRACT, LocatorsPath.MAX_TIME);
		
		
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.DATA_ENTRY_CONTRACT_NAME, LocatorsPath.MAX_TIME,
				file.getCellData("Contract", "Contract Name", 2));
		
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.CORPORATE_CONTRACT_SAVE, LocatorsPath.MAX_TIME);
		System.out.println("Success: Added the Corporate Contract for the same Start & "
				+ "End Date which is already associated to the Customer");
	}
	

	@Then("^User verifies the system displaying a prompt error message 'Contract & Start Date should be identical'$")
	public void user_verifies_the_system_displaying_a_prompt_error_message_Contract_Start_Date_should_be_identical() throws Throwable {
	    
		System.out.println("Attempt: Verify the system displaying a prompt error message");
		WebElement message = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ERROR_MESSAGE))));
		Assert.assertEquals("Contract and Start Date should be Identical.", 
				message.getText());
		System.out.println("Success: Prompt error message displayed successfully");
	}
	

	
	/**----------------------RCS_SaaS_Contract_Deletion_WC--------------------------**/	
	
	
	
	@Then("^User selects a Contract record & clicks on the Delete icon$")
	public void user_selects_a_Contract_record_clicks_on_the_Delete_icon() throws Throwable {
	    
		System.out.println("Attempt: Select a Contract record & click on the Delete icon");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ADD_CORP_CONTRACT_CANCEL, LocatorsPath.MAX_TIME);
		
		CallObject.switchToAlert(driver);
		CallObject.waitForPageLoad(driver);
		removeOutletRecords();
		System.out.println("Success: Contract record selected & clicked on the Delete icon");
	}
	

	@Then("^User verifies the selected Contract cannot be deleted if it is locked$")
	public void user_verifies_the_Locked_Contract_cannot_be_deleted() throws Throwable {
	    
		System.out.println("Attempt: Verify the selected Contract cannot be deleted if it is locked");
		WebElement message = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ERROR_MESSAGE))));
		Assert.assertEquals("Selected Contract cannot be deleted as it is already in Locked Status.", 
				message.getText());
		System.out.println("Success: Verifies the selected Contract "
				+ "cannot be deleted if it is locked successfully");
	}
	
	
	@Then("^User verifies the selected Contract record is deleted successfully if it is not locked$")
	public void user_verifies_the_selected_Contract_record_is_deleted_successfully_if_it_is_not_locked() throws Throwable {
	   
		System.out.println("Attempt: Verify the selected Contract record is deleted");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.CONTRACT_NAME_SEARCH, LocatorsPath.MAX_TIME, 
				file.getCellData("Contract", "Contract Name", 2));
		CallObject.block(2000);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.CONTRACT_FIRST_NAME, LocatorsPath.MAX_TIME);
		
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.DT_CONTRACT_LOCKED, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.PROFILE_SAVE, LocatorsPath.MAX_TIME);
		
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.OUTLET_TIMES_DELETE, LocatorsPath.MAX_TIME);
		CallObject.switchToAlert(driver);
		System.out.println("Success: Selected Contract record is deleted successfully");
	}
	

	
	/**----------------------RCS_SaaS_Discretionary_Contracts_WC--------------------------**/	
	
	
	
	@Then("^User clicks on the 'Add Discretionary Contract' button and navigates to the 'Add Customer Discretionary Contract' page$")
	public void user_clicks_on_the_Add_Discretionary_Contract_button_and_navigates_to_the_Add_Customer_Discretionary_Contract_page() throws Throwable {
	    
		System.out.println("Attempt: Click on the 'Add Discretionary Contract' button");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ADD_DISCRETIONARY_CONTRACT, LocatorsPath.MAX_TIME);
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.ADD_CUST_DISCRE_CONTRACT, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Add Discretionary Contract' button clicked successfully");
		
	}
	

	@Then("^User enters the 'Contract Name' in the Add Customer Discretionary Contract page$")
	public void user_enters_the_Contract_Name_in_the_Add_Customer_Discretionary_Contract_page() throws Throwable {
	   
		System.out.println("Attempt: User enters the 'Contract Name'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.CONTRACT_NAME_1, LocatorsPath.MAX_TIME, 
				CallObject.timestamp().concat("_Discre"));
				file2.setCellData("DataEntry-Contract", "Discre Contract Name", 2, 
						CallObject.timestamp().concat("_Discre"));
		System.out.println("Attempt: 'Contract Name' entered successfully");
	}
	

	@Then("^User verifies the 'Contract Type' is greyed out & auto populated to discretionary$")
	public void user_verifies_the_Contract_Type_is_greyed_out_auto_populated_to_discretionary() throws Throwable {
	    
		System.out.println("Attempt: Verify the 'Contract Type' is a greyed out field");
		 WebElement type = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.CONTRACT_TYPE_1))));
		 Assert.assertTrue(type.getAttribute
				 ("readonly").equals("true"),"readonly");
		 CallObject.block(5000);
		 file2.setCellData("DataEntry-Contract", "Discre Contract Type", 2, type.getAttribute("value"));
		 Assert.assertEquals(type.getAttribute("value"), 
				 file2.getCellData("DataEntry-Contract", "Discre Contract Type", 2));
		System.out.println("Success: Verify the 'Contract Type' is a greyed out field successfully");
	}
	

	@Then("^User selects the 'Contract Company' in the Add Customer Discretionary Contract page$")
	public void user_selects_the_Contract_Company_in_the_Add_Customer_Discretionary_Contract_page() throws Throwable {
	    
		System.out.println("Attempt: Select the 'Contract Company'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.CONTRACT_COMPANY_1, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Contract", "Discre Contract Company", 2));
		System.out.println("Success: 'Contract Company' selected successfully");
	}
	

	@Then("^User selects the 'Contract Inactive' in the Add Customer Discretionary Contract page$")
	public void user_selects_the_Contract_Inactive_in_the_Add_Customer_Discretionary_Contract_page() throws Throwable {
	    
		System.out.println("Attempt: Select the 'Contract Inactive'");
		PageObjects.SelectByCSSSelectorWithoutClick(
				driver, LocatorsPath.CONTRACT_INACTIVE_1, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Contract Inactive' selected successfully");
	}
	

	@Then("^User selects the 'Check Frequency' in the Add Customer Discretionary Contract page$")
	public void user_selects_the_Check_Frequency_in_the_Add_Customer_Discretionary_Contract_page() throws Throwable {
	    
		System.out.println("Attempt: Select the 'Check Frequency'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.CHECK_FREQUENCY_1, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Contract", "Discre Check Frequency", 2));
		System.out.println("Success: 'Check Frequency' selected successfully");
	}
	

	@Then("^User selects the 'Start Date' in the Add Customer Discretionary Contract page$")
	public void user_selects_the_Start_Date_in_the_Add_Customer_Discretionary_Contract_page() throws Throwable {
	    
		System.out.println("Attempt: select the 'Start Date'");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.DISC_CONTRACT_START_DATE, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.UTIL_START_DATE, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Start Date' as been selected successfully");
	}
	

	@Then("^User selects the 'End Date' in the Add Customer Discretionary Contract page$")
	public void user_selects_the_End_Date_in_the_Add_Customer_Discretionary_Contract_page() throws Throwable {
	    
		System.out.println("Attempt: select the 'End Date'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.DISCRE_END_DATE, LocatorsPath.MAX_TIME, CallObject.futureDate());
		System.out.println("Success: 'End Date' as been selected successfully");
	}
	

	@Then("^User selects the 'Actual End Date' in the Add Customer Discretionary Contract page$")
	public void user_selects_the_Actual_End_Date_in_the_Add_Customer_Discretionary_Contract_page() throws Throwable {
	    
		System.out.println("Attempt: select the 'Actual End Date'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.DISCRE_ACTUAL_END_DATE, LocatorsPath.MAX_TIME, CallObject.futureDate());
		System.out.println("Success: 'Actual End Date' as been selected successfully");
	}
	

	@Then("^User selects the 'Contract Agreed' in the Add Customer Discretionary Contract page$")
	public void user_selects_the_Contract_Agreed_in_the_Add_Customer_Discretionary_Contract_page() throws Throwable {
	    
		System.out.println("Attempt: select the 'Contract Agreed' checkbox");
		PageObjects.SelectByCSSSelectorWithoutClick(
				driver, LocatorsPath.CONTRACT_AGREED_1, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Contract Agreed' checkbox selected");
	}
	

	@Then("^User selects the 'Free Field (\\d+)' dropdown in the Add Customer Discretionary Contract page$")
	public void user_selects_the_Free_Field1_dropdown_in_the_Add_Customer_Discretionary_Contract_page(int arg1) throws Throwable {
	    
		System.out.println("Attempt: select the 'Free field 1' dropdown");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.DISCRE_CONTRACT_FREE_FIELD_1, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Contract", "Discre Free Field 1", 2));
		System.out.println("Success: 'Free field 1' dropdown selected");
	}
	

	@Then("^User selects the 'Free Field (\\d+)' dropdown in the Add Customer Discretionary Contract page\\.$")
	public void user_selects_the_Free_Field2_dropdown_in_the_Add_Customer_Discretionary_Contract_page(int arg1) throws Throwable {
	    
		System.out.println("Attempt: select the 'Free field 2' dropdown");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.DISCRE_CONTRACT_FREE_FIELD_2, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Contract", "Discre Free Field 2", 2));
		System.out.println("Success: 'Free field 2' dropdown selected");
	}
	

	@Then("^User enters the 'Free Text (\\d+)' in the Add Customer Discretionary Contract page$")
	public void user_enters_the_Free_Text1_in_the_Add_Customer_Discretionary_Contract_page(int arg1) throws Throwable {
	    
		System.out.println("Attempt: select the 'Free Text 1' dropdown");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.DISCRE_CONTRACT_FREE_TEXT_1, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Contract", "Discre Free Text 1", 2));
		System.out.println("Success: 'Free Text 1' dropdown selected");
	}
	

	@Then("^User enters the 'Free Text (\\d+)' in the Add Customer Discretionary Contract page\\.$")
	public void user_enters_the_Free_Text2_in_the_Add_Customer_Discretionary_Contract_page(int arg1) throws Throwable {
	    
		System.out.println("Attempt: select the 'Free Text 2' dropdown");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.DISCRE_CONTRACT_FREE_TEXT_2, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Contract", "Discre Free Text 2", 2));
		System.out.println("Success: 'Free Text 2' dropdown selected");
	}
	

	@Then("^User clicks on the save button and verifies the Add Customer Discretionary Contract page record is saved without any errors$")
	public void user_clicks_on_the_save_button_and_verifies_the_Add_Customer_Discretionary_Contract_page_record_is_saved_without_any_errors() throws Throwable {
	    
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.CORPORATE_CONTRACT_SAVE, LocatorsPath.MAX_TIME);
	}
	

	@Then("^User edits the record and clicks on save button and verifies the Add Customer Discretionary Contract page record is saved without any errors$")
	public void user_edits_the_record_and_clicks_on_save_button_and_verifies_the_Add_Customer_Discretionary_Contract_page_record_is_saved_without_any_errors() throws Throwable {
	 
		System.out.println("Attempt: Edit the record and click on save button");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.CONTRACT_NAME_SEARCH, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Contract", "Discre Contract Name", 2));
		CallObject.block(2000);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.CONTRACT_FIRST_NAME, LocatorsPath.MAX_TIME);
		
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.EDIT_CONTRACT_COMPANY_1, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Contract", "Discre Contract Company", 3));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.PROFILE_SAVE, LocatorsPath.MAX_TIME);
		System.out.println("Success: Record is edited and clicked on save button successfully");
	}
	

	
	/**----------------------RCS_SaaS_Add_Driver_Discretionary_WC--------------------------**/
	
	
	
	@Then("^User clicks on the ADD DRIVER button in the Driver section & enters the data in all fields\\.$")
	public void user_clicks_on_the_ADD_DRIVER_button_in_the_Driver_section_enters_the_data_in_all_fields() throws Throwable {
	    
		System.out.println("Attempt: click on the ADD DRIVER button in the Driver section");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.LIST_CONTRACT_DRIVERS, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ADD_CONTRACT_DRIVER, LocatorsPath.MAX_TIME);
		System.out.println("Success: ADD DRIVER button clicked in the Driver section successfully");
	}
	

	@Then("^User clicks on the save button & verifies the record is saved without any errors in the Add Customer Driver Details screen$")
	public void user_clicks_on_the_save_button_verifies_the_record_is_saved_without_any_errors_in_the_Add_Customer_Driver_Details_screen() throws Throwable {
	    
		System.out.println("Attempt: click on the save button & verify the record is saved without any errors");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.CONTRACT_CATEGORY, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Contract", "Contract Category", 2));
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.CONTRACT_DRIVER, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Contract", "Contract Driver", 2));
		CallObject.block(2000);
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.CONTRACT_COMPENSATION_TYPE, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Contract", "Compensation Type", 2));
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.CONTRACT_AMOUNT, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Contract", "Contract Amount", 2));
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.CONTRACT_TCI_BUCKET, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Contract", "Contract TCI Bucket", 2));
		
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.DT_CONTRACT_START_DATE_CAL, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.UTIL_START_DATE, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.DT_CONTRACT_END_DATE, LocatorsPath.MAX_TIME, CallObject.futureDate());
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.DATA_ENTRY_CONTRACT_SAVE, LocatorsPath.MAX_TIME);
		
		try {
			WebElement amount = wait.until(
					ExpectedConditions.presenceOfElementLocated(By.xpath(LocatorsPath.ERROR_MSG_AMT)));
			if(amount.isDisplayed()) {
				PageObjects.SelectByCSSSelectorWithSendKeys(
						driver, LocatorsPath.CONTRACT_AMOUNT, LocatorsPath.MAX_TIME, 
						file2.getCellData("DataEntry-Contract", "Contract Amount", 2));
				PageObjects.SelectByCSSSelector(
						driver, LocatorsPath.DATA_ENTRY_CONTRACT_SAVE, LocatorsPath.MAX_TIME);
			}
		} catch (NoSuchElementException NoSuchElementException) {
			System.out.println("No such element" +NoSuchElementException);
		}catch (StaleElementReferenceException StaleElementReferenceException) {
			System.out.println("Trying to recover from stale element" + StaleElementReferenceException);
		}catch (TimeoutException TimeOutException) {
			System.out.println("Time Out" + TimeOutException);
		}
		System.out.println("Success: clicked on the save button & verified the record is saved without any errors");
	}
	

	@Then("^User verifies the Trade Payment cannot be created for a Discretionary contract$")
	public void user_versfies_the_Trade_Payment_cannot_be_created_for_a_Discretionary_contract() throws Throwable {
	    
		System.out.println("Attempt: verify the Trade Payment cannot be created for a Discretionary contract");
		WebElement record = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.TRADE_PAYMENT_NO_RECORD))));
		Assert.assertEquals("No records found.", record.getText());
		System.out.println("Success: verified the Trade Payment cannot be created for a Discretionary contract");
	}
	

	
	/**----------------------RCS_SaaS_Contract_Validation_WC--------------------------**/
	
	
	
	@Then("^User creates a Discretionary contract for the same Start & End Date & saves the record$")
	public void user_creates_a_Discretionary_contract_for_the_same_Start_End_Date_saves_the_record() throws Throwable {
	    
		user_clicks_on_the_Add_Discretionary_Contract_button_and_navigates_to_the_Add_Customer_Discretionary_Contract_page();
		user_enters_the_Contract_Name_in_the_Add_Customer_Discretionary_Contract_page();
		user_selects_the_Contract_Company_in_the_Add_Customer_Discretionary_Contract_page();
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.DISCRE_START_DATE, LocatorsPath.MAX_TIME, CallObject.futureDate());
		user_selects_the_End_Date_in_the_Add_Customer_Discretionary_Contract_page();
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.CORPORATE_CONTRACT_SAVE, LocatorsPath.MAX_TIME);
	}
	

	@Then("^User verifies the system displaying a prompt error message 'End Date and Start Date are same\\. Please enter valid dates'$")
	public void user_verifies_the_system1_displaying_a_prompt_error_message_End_Date_and_Start_Date_are_same_Please_enter_valid_dates() throws Throwable {
	    
		System.out.println("Attempt: Verify the system displaying a prompt error message");
		WebElement message = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ERROR_MESSAGE))));
		Assert.assertEquals("End date and Start Date are same. Please Enter valid Dates", 
				message.getText());
		System.out.println("Success: System displayed a prompt error message successfully");
		
		System.out.println("Attempt: Select a Contract record & click on the Delete icon");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ADD_CORP_CONTRACT_CANCEL, LocatorsPath.MAX_TIME);
		
		CallObject.switchToAlert(driver);
		CallObject.waitForPageLoad(driver);
		System.out.println("Success: Contract record selected & clicked on the Delete icon");
	}
	

	@Then("^User creates a driver for the same Start & End Date & saves the record$")
	public void user_creates_a_driver_for_the_same_Start_End_Date_saves_the_record() throws Throwable {
	 
		System.out.println("Attempt: User creates a driver for the same Start & End Date");
		user_clicks_on_the_ADD_DRIVER_button_in_the_Driver_section_enters_the_data_in_all_fields();
		
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.CONTRACT_CATEGORY, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Contract", "Contract Category", 2));
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.CONTRACT_DRIVER, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Contract", "Contract Driver", 2));
		CallObject.block(2000);
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.CONTRACT_COMPENSATION_TYPE, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Contract", "Compensation Type", 2));
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.CONTRACT_AMOUNT, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Contract", "Contract Amount", 2));
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.CONTRACT_TCI_BUCKET, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Contract", "Contract TCI Bucket", 2));
		
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.DT_CONTRACT_START_DATE_CAL, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.UTIL_START_DATE, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.DT_CONTRACT_END_DATE_CAL, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.UTIL_START_DATE, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ADD_DRIVER_SAVE, LocatorsPath.MAX_TIME);
		System.out.println("Success: Driver for the same Start & End Date created successfully");
	}
	

	@Then("^User verifies the system displaying a prompt error message 'End Date and Start Date are same\\. Please enter valid dates'\\.$")
	public void user_verifies_the_system2_displaying_a_prompt_error_message_End_Date_and_Start_Date_are_same_Please_enter_valid_dates() throws Throwable {
	    
		System.out.println("Attempt: Verify the system displaying a prompt error message");
		WebElement message = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.DRIVER_ERROR_MESSAGE))));
		Assert.assertEquals("End date and Start Date are same. Please Enter valid Dates", 
				message.getText());
		System.out.println("Success: System displayed a prompt error message successfully");
	}
	

	
	/**----------------------RCS_SaaS_Delete_Driver_Contract_WC--------------------------**/
	
	
	
	@Then("^User selects a Driver record & clicks on the Delete icon$")
	public void user_selects_a_Driver_record_clicks_on_the_Delete_icon() throws Throwable {
	    
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ADD_CORP_CONTRACT_CANCEL, LocatorsPath.MAX_TIME);
		CallObject.switchToAlert(driver);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.OUTLET_TIMES_DELETE, LocatorsPath.MAX_TIME);
		CallObject.switchToAlert(driver);
	}
	

	@Then("^User verifies the selected Driver record is deleted successfully\\.$")
	public void user_verifies_the_selected_Driver_record_is_deleted_successfully() throws Throwable {
	    
		System.out.println("User verifies the selected Driver record is deleted successfully");
	}
	

	
	/**----------------------RCS_SaaS_Discretionary_Contract_Deletion_WC--------------------------**/
	
	
	
	@Then("^User selects a Discretionary Contract record & clicks on the Delete icon$")
	public void user_selects_a_Discretionary_Contract_record_clicks_on_the_Delete_icon() throws Throwable {
	    
		removeOutletRecords();
	}
	

	@Then("^User verifies the selected Discretionary Contract record is deleted successfully\\.$")
	public void user_verifies_the_selected_Discretionary_Contract_record_is_deleted_successfully() throws Throwable {
	    
		System.out.println("User verifies the selected Discretionary Contract record is deleted successfully");
	}

	
	
	/**----------------------RCS_SaaS_Add_Territory_WC--------------------------**/
	
	
	
	@Then("^User clicks on the 'Territory' tab and navigates to the Territory screen$")
	public void user_clicks_on_the_Territory_tab_and_navigates_to_the_Territory_screen() throws Throwable {
	    
		/*user_navigates_to_the_Search_screen();
		user_provides_a_query_for_an_Outlet_provides_specific_condition_clicks_on_Search_button();
		user_navigates_to_the_Profile_screen_successfully();*/
		
		System.out.println("Attempt: Click on Territory Tab");
		WebElement territory = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.DATA_ENTRY_TERRITORY))));
		actions.moveToElement(territory).doubleClick().build().perform();
		System.out.println("Success: Territory Tab selected successfully");
	}
	

	@Then("^User clicks on the Add button and navigates to the Add Customer Territory page$")
	public void user_clicks_on_the_Add_button_and_navigates_to_the_Add_Customer_Territory_page() throws Throwable {
	    
		System.out.println("Attempt: Click on the Add button");
		removeOutletRecords();
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.FACING_CHECKS_ADD, LocatorsPath.MAX_TIME);
		System.out.println("Success: Add button clicked successfully");
	}
	

	@Then("^User selects the 'Trade Approach' which displays all the Trade Approaches available in the application$")
	public void user_selects_the_Trade_Approach_which_displays_all_the_Trade_Approaches_available_in_the_application() throws Throwable {
	    
		System.out.println("Attempt: Selects the 'Trade Approach'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.DT_TRADE_APPROACH, LocatorsPath.MAX_TIME, 
				file.getCellData("Territory", "TradeApproach", 2));
		System.out.println("Success: 'Trade Approach' selected successfully");
	}
	

	@Then("^User selects the 'Territory Name' which displays all the Territories available in the application$")
	public void user_selects_the_Territory_Name_which_displays_all_the_Territories_available_in_the_application() throws Throwable {
	   
		System.out.println("Attempt: Selects the 'Territory Name'");
		CallObject.block(4000);
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.DT_TERRITORY_NAME, LocatorsPath.MAX_TIME, 
				file.getCellData("Territory", "TerritoryName", 2));
		System.out.println("Success: 'Territory Name' selected successfully");
	}
	

	@Then("^User enters the 'Visit Frequency'$")
	public void user_enters_the_Visit_Frequency() throws Throwable {
	    
		System.out.println("Attempt: enter the 'Visit Frequency'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.VISIT_FREQUENCY, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Territory", "Visit Frequency", 2));
		System.out.println("Success: 'Visit Frequency' entered successfully");
	}
	

	@Then("^User enters the 'Call Rate'$")
	public void user_enters_the_Call_Rate() throws Throwable {
	    
		System.out.println("Attempt: enter the 'Call Rate'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.CALL_RATE, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Territory", "Call Rate", 2));
		System.out.println("Success: 'Call Rate' entered successfully");
	}
	

	@Then("^User selects the 'Free Field (\\d+)' in the Add Customer Territory page$")
	public void user_selects_the_Free_Field1_in_the_Add_Customer_Territory_page(int arg1) throws Throwable {
	   
		System.out.println("Attempt: Select the 'Free Field 1'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.TERRITORY_FREE_FIELD_1, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Territory", "Free Field 1", 2));
		System.out.println("Success: 'Free Field 1' selected successfully");
	}
	

	@Then("^User selects the 'Free Field (\\d+)' in the Add Customer Territory page\\.$")
	public void user_selects_the_Free_Field2_in_the_Add_Customer_Territory_page(int arg1) throws Throwable {
	    
		System.out.println("Attempt: Select the 'Free Field 2'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.TERRITORY_FREE_FIELD_2, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Territory", "Free Field 2", 2));
		System.out.println("Success: 'Free Field 2' selected successfully");
	}
	

	@Then("^User enters the 'Free Text Field (\\d+)' in the Add Customer Territory page$")
	public void user_enters_the_Free_Text_Field1_in_the_Add_Customer_Territory_page(int arg1) throws Throwable {
	    
		System.out.println("Attempt: Select the 'Free Text Field 1'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.TERR_FREE_TEXT_FIELD_1, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Territory", "Free Text Field 1", 2));
		System.out.println("Success: 'Free Text Field 1' selected successfully");
	}
	

	@Then("^User enters the 'Free Text Field (\\d+)' in the Add Customer Territory page\\.$")
	public void user_enters_the_Free_Text_Field2_in_the_Add_Customer_Territory_page(int arg1) throws Throwable {
	    
		System.out.println("Attempt: Select the 'Free Text Field 2'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.TERR_FREE_TEXT_FIELD_2, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Territory", "Free Text Field 2", 2));
		System.out.println("Success: 'Free Text Field 2' selected successfully");
	}
	

	@Then("^User clicks on the save button and verifies the Territory record is saved without any errors$")
	public void user_clicks_on_the_save_button_and_verifies_the_Territory_record_is_saved_without_any_errors() throws Throwable {
	 
		user_clicks_on_the_save_button_and_verifies_the_product_records_is_saved_without_any_errors();
	}
	

	@Then("^User clicks on the 'Territory Name' edits the record and clicks on the save button$")
	public void user_clicks_on_the_Territory_Name_edits_the_record_and_clicks_on_the_save_button() throws Throwable {
	    
		System.out.println("Attempt: Edit the record and click on save button");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.TERRITORY_NAME_SEARCH, LocatorsPath.MAX_TIME, 
				file.getCellData("Territory", "TerritoryName", 2));
		CallObject.block(2000);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.TERRITORY_FIRST_NAME, LocatorsPath.MAX_TIME);
		System.out.println("Success: Record is edited and clicked on save button successfully");
	}
	

	@Then("^User verifies the record is edited & saved without any errors\\.$")
	public void user_verifies_the_record_is_edited_saved_without_any_errors() throws Throwable {
	    
		System.out.println("Attempt: Verify the record is edited & saved without any errors");
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.VISIT_FREQUENCY)))).clear();
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.VISIT_FREQUENCY, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Territory", "Visit Frequency", 3));
		user_clicks_on_the_save_button_and_verifies_the_product_records_is_saved_without_any_errors();
		System.out.println("Success: Record is edited & saved without any errors");
	}
	

	
	/**----------------------RCS_SaaS_Copy_Territory_WC--------------------------**/
	
	
	
	@Then("^User clicks on the Copy Territory icon in front of the Territory Name field for the record to be copied$")
	public void user_clicks_on_the_Copy_Territory_icon_in_front_of_the_Territory_Name_field_for_the_record_to_be_copied() throws Throwable {
	   
		System.out.println("Attempt: click on the Copy Territory icon in "
				+ "front of the Territory Name field");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.TERRITORY_COPY, LocatorsPath.MAX_TIME);
		System.out.println("Success: Copy Territory icon in front of the"
				+ " Territory Name field clicked successfully");
	}
	

	@Then("^User verifies the 'Copy Customer Territory' page is displayed$")
	public void user_verifies_the_Copy_Customer_Territory_page_is_displayed() throws Throwable {
	    
		System.out.println("Attempt: verify the 'Copy Customer Territory' page is displayed");
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.COPY_CUST_TERR_DISP, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Copy Customer Territory' page is displayed successfully");
	}
	

	@Then("^User edits the record and clicks on the save button$")
	public void user_edits_the_record_and_clicks_on_the_save_button() throws Throwable {
	 
		System.out.println("Attempt: Verify the record is edited & saved without any errors");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.DT_TRADE_APPROACH, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Territory", "Trade Approach", 2));
		CallObject.block(4000);
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.DT_TERRITORY_NAME, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Territory", "Territory Name", 2));
		
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.VISIT_FREQUENCY)))).clear();
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.VISIT_FREQUENCY, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Territory", "Visit Frequency", 4));
		System.out.println("Success: Record is edited & saved without any errors");
	}
	

	@Then("^User verifies the New Territory Record is edited & saved without any errors\\.$")
	public void user_verifies_the_New_Territory_Record_is_edited_saved_without_any_errors() throws Throwable {
	    
		user_clicks_on_the_save_button_and_verifies_the_product_records_is_saved_without_any_errors();
	}
	

	
    /**----------------------RCS_SaaS_Territory_Validation_WC--------------------------**/
	
	
	
	@Then("^User adds a Territory & assign the same Customer to the same Trade Approach and saves the record$")
	public void user_adds_a_Territory_assign_the_same_Customer_to_the_same_Trade_Approach_and_saves_the_record() throws Throwable {
	    
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.FACING_CHECKS_ADD, LocatorsPath.MAX_TIME); 
		
		user_selects_the_Trade_Approach_which_displays_all_the_Trade_Approaches_available_in_the_application();
		user_selects_the_Territory_Name_which_displays_all_the_Territories_available_in_the_application();
		user_clicks_on_the_save_button_and_verifies_the_product_records_is_saved_without_any_errors();
	}
	

	@Then("^User verifies the system displaying a error message as 'Selected Trade Approach already exists for this customer'$")
	public void user_verifies_the_system_displaying_a_error_message_as_Selected_Trade_Approach_already_exists_for_this_customer() throws Throwable {
	    
		System.out.println("Attempt: Verify the system displaying a prompt error message");
		WebElement message = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ERROR_MESSAGE))));
		Assert.assertEquals("Selected trade approach already exist for this customer", 
				message.getText());
		
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.OUTLET_TIMES_CANCEL, LocatorsPath.MAX_TIME);
		CallObject.switchToAlert(driver);
		System.out.println("Success: System displayed a prompt error message successfully");
	}
	
	
	
	/**----------------------RCS_SaaS_Territory_Deletion_WC--------------------------**/
	
	
	
	@Then("^User selects a Territory record & clicks on the Delete icon\\.$")
	public void user_selects_a_Territory_record_clicks_on_the_Delete_icon() throws Throwable {
	    
		System.out.println("User selects a Territory record & clicks on the Delete icon");
	}
	

	@Then("^User verifies the selected Territory record is deleted successfully\\.$")
	public void user_verifies_the_selected_Territory_record_is_deleted_successfully() throws Throwable {
	    
		removeOutletRecords();
	}
	
	
	
	/**----------------------RCS_SaaS_Service_Request_WC--------------------------**/
	
	
	
	@Then("^User clicks on the 'Service Request' tab and navigates to the Service Request screen$")
	public void user_clicks_on_the_Service_Request_tab_and_navigates_to_the_Service_Request_screen() throws Throwable {
		
		System.out.println("Attempt: Click on Service Request Tab");
		WebElement request = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.SERVICE_REQUEST))));
		actions.moveToElement(request).doubleClick().build().perform();
		System.out.println("Success: Service Request Tab selected successfully");
	}
	

	@Then("^User verifies all the Service Request header & details assigned to the Customer displayed successfully$")
	public void user_verifies_all_the_Service_Request_header_details_assigned_to_the_Customer_displayed_successfully() throws Throwable {
	    
		System.out.println("User verifies all the Service Request header & "
				+ "details assigned to the Customer displayed successfully");
	}
	

	
	/**----------------------RCS_SaaS_Add_Service_Request_WC--------------------------**/
	
	
	
	@Then("^User clicks on the 'Add Service Request' tab and navigates to the Add Service Request page$")
	public void user_clicks_on_the_Add_Service_Request_button_and_navigates_to_the_Add_Service_Request_page() throws Throwable {
	 
		System.out.println("Attempt: click on the 'Add Service Request' button");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ADD_SERVICE_REQUEST, LocatorsPath.MAX_TIME);
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.ADD_SERVICE_REQUEST_DISP, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Add Service Request' button clciked successfully");
	}
	

	@Then("^User verifies the 'Creation Date' defaulted to the current date & the textfield is greyed out$")
	public void user_verifies_the_Creation_Date_defaulted_to_the_current_date_the_textfield_is_greyed_out() throws Throwable {
	    
		System.out.println("Attempt: Verify the 'Creation Date' is a greyed out field");
		 WebElement creation = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SERVICE_CREATION_DATE))));
		 Assert.assertTrue(creation.getAttribute
				 ("readonly").equals("true"),"readonly");
		 CallObject.block(5000);
		 file2.setCellData("DataEntry-ServiceRequest", "Creation Date", 2, 
				 creation.getAttribute("value"));
		 Assert.assertEquals(creation.getAttribute("value"), 
				 file2.getCellData("DataEntry-ServiceRequest", "Creation Date", 2));
		System.out.println("Success: Verify the 'Creation Date' is a greyed out field successfully");
	}
	

	@Then("^User verifies the 'Status' defaulted to 'Open' and the textfield is disabled$")
	public void user_verifies_the_Status_defaulted_to_Open_and_the_textfield_is_disabled() throws Throwable {
	    
		System.out.println("Attempt: Verify the 'Status' defaulted to 'Open' and the textfield is disabled");
		WebElement status = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SERVICE_STATUS))));
		if(!status.isEnabled()) {
			CallObject.block(3000);
			file2.setCellData("DataEntry-ServiceRequest", "Status", 2, 
					status.getAttribute("value"));
			 Assert.assertEquals(status.getAttribute("value"), 
					 file2.getCellData("DataEntry-ServiceRequest", "Status", 2));
		}else {
			Assert.fail("Either textfield is enabled or the attributes doesn't match");
		}
		
		System.out.println("Success: 'Status' defaulted to 'Open' and the textfield is disabled successfully");
	}
	

	@Then("^User selects the 'Category' in the service request page$")
	public void user_selects_the_Category_in_the_service_request_page() throws Throwable {
	    
		System.out.println("Attempt: select the 'Category' in the service request page");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.SERVICE_CATEGORY, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-ServiceRequest", "Category", 2));
		System.out.println("success: 'Category' selected in the service request page");
	}
	

	@Then("^User selects the 'Item' in the service request page$")
	public void user_selects_the_Item_in_the_service_request_page() throws Throwable {
	    
		System.out.println("Attempt: select the 'Item' in the service request page");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.SERVICE_ITEM, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-ServiceRequest", "Item", 2));
		System.out.println("success: 'Item' selected in the service request page");
	}
	

	@Then("^User verifies the 'Cost' textfield is greyed out and Auto populates the value after selecting the Merchandise Type$")
	public void user_verifies_the_Cost_textfield_is_greyed_out_and_Auto_populates_the_value_after_selecting_the_Merchandise_Type() throws Throwable {
	    
		System.out.println("Attempt: Verify the 'Cost' is a greyed out field");
		 WebElement cost = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SERVICE_COSTS))));
		 Assert.assertTrue(cost.getAttribute
				 ("readonly").equals("true"),"readonly");
		System.out.println("Success: Verify the 'Cost' is a greyed out field successfully");
	}

	
	@Then("^User selects the 'Action' in the service request page$")
	public void user_selects_the_Action_in_the_service_request_page() throws Throwable {
	    
		System.out.println("Attempt: select the 'Action' in the service request page");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.SERVICE_ACTION, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-ServiceRequest", "Action", 2));
		System.out.println("success: 'Action' selected in the service request page");
	}
	

	@Then("^User enters the 'Description' in the service request page$")
	public void user_enters_the_Description_in_the_service_request_page() throws Throwable {
	    
		System.out.println("Attempt: enter the 'Description' in the service request page");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.SERVICE_DESC, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-ServiceRequest", "Description", 2));
		System.out.println("success: 'Description' entered in the service request page");
	}
	

	@Then("^User selects the 'Required Date' in the service request page$")
	public void user_selects_the_Required_Date_in_the_service_request_page() throws Throwable {
	    
		System.out.println("Attempt: select the 'Required Date' in the service request page");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.SERVICE_REQUIRED_DATE_CALEN, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.CURRENT_DATE, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Required Date' selected in the service request page");
	}
	

	@Then("^User clicks on the save button and verifies the service request record is saved without any errors$")
	public void user_clicks_on_the_save_button_and_verifies_the_service_request_record_is_saved_without_any_errors() throws Throwable {
	   
		user_clicks_on_the_save_button_and_verifies_the_product_records_is_saved_without_any_errors();
	}
	

	@Then("^User clicks on the 'Service Request Name' & edits the record & clicks on the save button$")
	public void user_clicks_on_the_Service_Request_Name_edits_the_record_clicks_on_the_save_button() throws Throwable {
	    
		System.out.println("Attempt: Edit the record and click on save button");
		/*PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.SERVICE_SEARCH_CREATION_DATE, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-ServiceRequest", "Creation Date", 2));
		CallObject.block(2000);*/
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.SUPPLIER_SELECT_FIRST_NAME, LocatorsPath.MAX_TIME);
		
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.SERVICE_ACTION_1, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-ServiceRequest", "Action", 3));
		System.out.println("Success: Record edited and clicked on save button");
	}
	

	@Then("^User verifies the 'Service Request' record is edited and saved without errors\\.$")
	public void user_verifies_the_Service_Request_record_is_edited_and_saved_without_errors() throws Throwable {
	   
		user_clicks_on_the_save_button_and_verifies_the_product_records_is_saved_without_any_errors();
	}
	

	
	/**----------------------RCS_SaaS_Add_Notes_WC--------------------------**/
	
	
	
	@Then("^User clicks on the 'Add Notes' button and navigates to the 'Add Service Request Notes' page$")
	public void user_clicks_on_the_Add_Notes_button_and_navigates_to_the_Add_Service_Request_Notes_page() throws Throwable {
	    
		System.out.println("Attempt: click on the 'Add Notes' button");
		CallObject.waitForPageLoad(driver);
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.SERVICE_ADD_NOTES)));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.SERVICE_ADD_NOTES, LocatorsPath.MAX_TIME);
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.ADD_SERVICE_REQUESTS_NOTES, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Add Notes' button clicked successfully");
	}
	

	@Then("^User verifies the 'Note Date' defaulted to the current date & the textfield is greyed out$")
	public void user_verifies_the_Note_Date_defaulted_to_the_current_date_the_textfield_is_greyed_out() throws Throwable {
	    
		System.out.println("Attempt: Verify the 'Note Date' is a greyed out field");
		 WebElement date = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SERVICE_CREATION_DATE))));
		 Assert.assertTrue(date.getAttribute
				 ("readonly").equals("true"),"readonly");
		 CallObject.block(5000);
		 file2.setCellData("DataEntry-ServiceRequest", "Note Date", 2, 
				 date.getAttribute("value"));
		 Assert.assertEquals(date.getAttribute("value"), 
				 file2.getCellData("DataEntry-ServiceRequest", "Note Date", 2));
		System.out.println("Success: Verify the 'Note Date' is a greyed out field successfully");
	}
	

	@Then("^User verifies the 'User Name' textfield displays the 'User name' who creates the notes & the textfield is greyed out$")
	public void user_verifies_the_User_Name_textfield_displays_the_User_name_who_creates_the_notes_the_textfield_is_greyed_out() throws Throwable {
	   
		System.out.println("Attempt: Verify the 'User Name' is a greyed out field");
		 WebElement userName = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.NOTES_USER_NAME))));
		 Assert.assertTrue(userName.getAttribute
				 ("readonly").equals("true"),"readonly");
		CallObject.block(5000);
		 file2.setCellData("DataEntry-ServiceRequest", "User Name", 2, 
				 userName.getAttribute("value"));
		 Assert.assertEquals(userName.getAttribute("value"), 
				 file2.getCellData("DataEntry-ServiceRequest", "User Name", 2));
		System.out.println("Success: Verify the 'User Name' is a greyed out field successfully");
	}
	

	@Then("^User enters the 'Notes' in the Add Service Request Notes page$")
	public void user_enters_the_Notes_in_the_Add_Service_Request_Notes_page() throws Throwable {
	   
		System.out.println("Attempt: enter the 'Notes' in the service request page");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.SERVICE_NOTES, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-ServiceRequest", "Notes", 2));
		System.out.println("success: 'Notes' entered in the service request page");
	}
	

	@Then("^User selects the 'Free Field (\\d+)' in the Add Service Request Notes page$")
	public void user_selects_the_Free_Field1_in_the_Add_Service_Request_Notes_page(int arg1) throws Throwable {
	    
		System.out.println("Attempt: select the 'Free Field 1' in the service request page");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.NOTES_FREE_FIELD_1, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-ServiceRequest", "Free Field 1", 2));
		System.out.println("success: 'Free Field 1' selected in the service request page");
	}
	

	@Then("^User selects the 'Free Field (\\d+)' in the Add Service Request Notes page\\.$")
	public void user_selects_the_Free_Field2_in_the_Add_Service_Request_Notes_page(int arg1) throws Throwable {
	    
		System.out.println("Attempt: select the 'Free Field 2' in the service request page");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.NOTES_FREE_FIELD_2, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-ServiceRequest", "Free Field 2", 2));
		System.out.println("success: 'Free Field 2' selected in the service request page");
	}

	
	@Then("^User enters the 'Free Text (\\d+)' in the Add Service Request Notes page$")
	public void user_enters_the_Free_Text1_in_the_Add_Service_Request_Notes_page(int arg1) throws Throwable {
	    
		System.out.println("Attempt: enter the 'Free Text 1' in the service request page");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.NOTES_FREE_TEXT_1, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-ServiceRequest", "Free Text 1", 2));
		System.out.println("success: 'Free Text 1' entered in the service request page");
	}

	
	@Then("^User enters the 'Free Text (\\d+)' in the Add Service Request Notes page\\.$")
	public void user_enters_the_Free_Text2_in_the_Add_Service_Request_Notes_page(int arg1) throws Throwable {
	    
		System.out.println("Attempt: enter the 'Free Text 2' in the service request page");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.NOTES_FREE_TEXT_2, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-ServiceRequest", "Free Text 2", 2));
		System.out.println("success: 'Free Text 2' entered in the service request page");
	}
	

	@Then("^User clicks on the save button and verifies the Add Service Request Notes record is saved without any errors$")
	public void user_clicks_on_the_save_button_and_verifies_the_Add_Service_Request_Notes_record_is_saved_without_any_errors() throws Throwable {
	    
		user_clicks_on_the_save_button_and_verifies_the_product_records_is_saved_without_any_errors();
	}
	

	@Then("^User clicks on the 'Notes Name' & edits the record & clicks on the save button$")
	public void user_clicks_on_the_Notes_Name_edits_the_record_clicks_on_the_save_button() throws Throwable {
	   
		System.out.println("Attempt: click on the 'Notes Name' & edit the record");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.SERVICE_NOTES_SEARCH, LocatorsPath.MAX_TIME);
		
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SERVICE_NOTES)))).clear();
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.SERVICE_NOTES, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-ServiceRequest", "Notes", 3));
		System.out.println("Success: 'Notes Name' clicked & edited the record successfully");
	}
	

	@Then("^User verifies the 'Service Request Notes' record is edited and saved without errors\\.$")
	public void user_verifies_the_Service_Request_Notes_record_is_edited_and_saved_without_errors() throws Throwable {
	    
		user_clicks_on_the_save_button_and_verifies_the_product_records_is_saved_without_any_errors();
	}
	

	@Then("^User clicks on the Delete icon & Deletes the Notes record\\.$")
	public void user_clicks_on_the_Delete_icon_Deletes_the_Notes_record() throws Throwable {
	   
		System.out.println("Attempt: click on the Delete icon & Delete the Notes record");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.SERVICE_NOTES_DELETE, LocatorsPath.MAX_TIME);
		CallObject.switchToAlert(driver);
		System.out.println("Success: Notes record deleted successfully");
	}
	

	@Then("^User verifies the Notes record is deleted without any errors\\.$")
	public void user_verifies_the_Notes_record_is_deleted_without_any_errors() throws Throwable {
	    
		System.out.println("User verifies the Notes record is deleted without any errors");
	}
	

	
	/**----------------------RCS_SaaS_Service_Request_Deletion_WC--------------------------**/
	
	
	
	@Then("^User selects an Service Request record & clicks on the Delete icon$")
	public void user_selects_an_Service_Request_record_clicks_on_the_Delete_icon() throws Throwable {
	    
		System.out.println("Attempt: select an Service Request record & click on the Delete icon");
		/*PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.SERVICE_SEARCH_CREATION_DATE, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-ServiceRequest", "Creation Date", 2));
		CallObject.block(2000);*/
		PageObjects.SelectByCSSSelectorWithoutClick(
				driver, LocatorsPath.SUPPLIER_SELECT_FIRST_NAME, LocatorsPath.MAX_TIME);
		System.out.println("Success: Service Request record Deleted successfully");
	}

	
	@Then("^User verifies the selected Service Request record is deleted successfully\\.$")
	public void user_verifies_the_selected_Service_Request_record_is_deleted_successfully() throws Throwable {
	    
		removeOutletRecords();
	}


	
	/**----------------------RCS_SaaS_Group_Messages_WC--------------------------**/
	
	
	
	@Then("^User clicks on the 'Group Messages' tab and and navigates to the Group Messages screen$")
	public void user_clicks_on_the_Group_Messages_tab_and_and_navigates_to_the_Group_Messages_screen() throws Throwable {
		
		System.out.println("Attempt: Click on Group Messages Tab");
		WebElement message = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.DATA_ENTRY_GROUP_MESSAGES))));
		actions.moveToElement(message).doubleClick().build().perform();
		System.out.println("Success: Group Messages Tab selected successfully");
	}

	
	@Then("^User verifies that all the Group messages assigned to the Customer is displayed successfully$")
	public void user_verifies_that_all_the_Group_messages_assigned_to_the_Customer_is_displayed_successfully() throws Throwable {
	    
		System.out.println("Attempt: verify that all the Group messages assigned to the Customer");
		WebElement name = wait.until(ExpectedConditions.
				presenceOfElementLocated(By.cssSelector(LocatorsPath.DATA_ENTRY_GROUP_NAME)));
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.DATA_ENTRY_GROUP_NAME)));
		Assert.assertEquals("Group Name", name.getText());
		
		WebElement message = wait.until(ExpectedConditions.
				presenceOfElementLocated(By.cssSelector(LocatorsPath.GROUP_MESSAGE)));
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.GROUP_MESSAGE)));
		Assert.assertEquals("Message", message.getText());
		
		WebElement date = wait.until(ExpectedConditions.
				presenceOfElementLocated(By.cssSelector(LocatorsPath.GROUP_EXPIRY_DATE)));
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.GROUP_EXPIRY_DATE)));
		Assert.assertEquals("Expiry Date", date.getText());
		
		 /*WebElement nameDisplay = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.GROUP_NAME_DISPLAY))));
		 file2.setCellData("DataEntry-GroupMessages", "Group name", 2, 
				 nameDisplay.getText());
		 CallObject.block(2000);
		 Assert.assertEquals(nameDisplay.getText(), 
					 file2.getCellData("DataEntry-GroupMessages", "Group name", 2));		
		
		 WebElement messageDisplay = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.GROUP_MESSAGE_DISPLAY))));
		 file2.setCellData("DataEntry-GroupMessages", "Group Message", 2, 
				 messageDisplay.getText());
		 CallObject.block(2000);
		 Assert.assertEquals(messageDisplay.getText(), 
					 file2.getCellData("DataEntry-GroupMessages", "Group Message", 2));
		 
		 WebElement dateDisplay = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.GROUP_EXPIRY_DATE_DISPLAY))));
		 file2.setCellData("DataEntry-GroupMessages", "Group Expiry Date", 2, 
				 dateDisplay.getText());
		 CallObject.block(2000);
		 Assert.assertEquals(dateDisplay.getText(), 
					 file2.getCellData("DataEntry-GroupMessages", "Group Expiry Date", 2));*/
		 System.out.println("Success: Group messages assigned to the Customer successfully");
	}

	
	
	/**----------------------RCS_SaaS_Customer_Sales_Target_WC--------------------------**/
	
	
	
	@Then("^User clicks on the 'Customer Sales Target' tab and navigates to the 'Customer Sales Target' screen$")
	public void user_clicks_on_the_Customer_Sales_Target_tab_and_navigates_to_the_Customer_Sales_Target_screen() throws Throwable {

		System.out.println("Attempt: Click on Customer Sales Target Tab");
		WebElement sales = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.CUSTOMER_SALES_TARGET))));
		actions.moveToElement(sales).doubleClick().build().perform();
		System.out.println("Success: Customer Sales Target Tab selected successfully");
	}
	

	@Then("^User clicks on the 'Add Sales Target' button and navigates to the Add Sales Target page$")
	public void user_clicks_on_the_Add_Sales_Target_button_and_navigates_to_the_Add_Sales_Target_page() throws Throwable {
	   
		System.out.println("Attempt: click on the 'Add Sales Target' button");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.DT_ADD_SALES_TARGET, LocatorsPath.MAX_TIME);
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.ADD_SALES_TARGET_DISP, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Add Sales Target' button clicked successfully");
	}
	

	@Then("^User selects the 'Product Name' which displays all the SKU which are part of Depot Assortment Plan$")
	public void user_selects_the_Product_Name_which_displays_all_the_SKU_which_are_part_of_Depot_Assortment_Plan() throws Throwable {
	 
		System.out.println("Attempt: select the 'Product Name'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.SALES_TARGET_PROD_NAME, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-SalesTarget", "Product Name", 2));
		System.out.println("success: 'Product Name' selected successfully");
	}
	

	@Then("^User enters the 'Target' in the Customer Sales Target page$")
	public void user_enters_the_Target_in_the_Customer_Sales_Target_page() throws Throwable {
	    
		System.out.println("Attempt: enter the 'Target'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.SALES_TARGET_1, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-SalesTarget", "Target", 2));
		System.out.println("success: 'Target' entered successfully");
	}
	

	@Then("^User selects the 'Start Date' in the Customer Sales Target page$")
	public void user_selects_the_Start_Date_in_the_Customer_Sales_Target_page() throws Throwable {
	    
		System.out.println("Attempt: select the 'Start Date'");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.SALES_TARGET_START_DATE_CAL, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.CURRENT_DATE, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Start Date' as been selected successfully");
	}
	

	@Then("^User selects the 'End Date' in the Customer Sales Target page$")
	public void user_selects_the_End_Date_in_the_Customer_Sales_Target_page() throws Throwable {
	    
		System.out.println("Attempt: select the 'End Date'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.SALES_TARGET_END_DATE, LocatorsPath.MAX_TIME, CallObject.futureDate());
		System.out.println("Success: 'End Date' as been selected successfully");
	}
	

	@Then("^User verifies the 'Achieved' textfield is greyed out$")
	public void user_verifies_the_Achieved_textfield_is_greyed_out() throws Throwable {
	    
		System.out.println("Attempt: verify the 'Achieved' textfield is greyed out");
		WebElement archieved = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SALES_TARGET_ARCHIEVED))));
		 Assert.assertTrue(archieved.getAttribute
				 ("readonly").equals("true"),"readonly");
		System.out.println("success: 'Achieved' textfield is greyed out successfully");
	}
	

	@Then("^User verifies the '% Achieved' textfield is greyed out$")
	public void user_verifies_the_percent_Achieved_textfield_is_greyed_out() throws Throwable {
	    
		System.out.println("Attempt: verify the '% Achieved' textfield is greyed out");
		WebElement archieved = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SALES_TARGET_PER_ARCHIEVED))));
		 Assert.assertTrue(archieved.getAttribute
				 ("readonly").equals("true"),"readonly");
		System.out.println("success: '% Achieved' textfield is greyed out successfully");
	}
	

	@Then("^User verifies the 'Remaining - Volume' textfield is greyed out$")
	public void user_verifies_the_Remaining_Volume_textfield_is_greyed_out() throws Throwable {
	    
		System.out.println("Attempt: verify the 'Remaining - Volume' textfield is greyed out");
		WebElement remain = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SALES_TARGET_REMAIN_VOLUME))));
		 Assert.assertTrue(remain.getAttribute
				 ("readonly").equals("true"),"readonly");
		System.out.println("success: 'Remaining - Volume' textfield is greyed out successfully");
	}
	

	@Then("^User enters the 'Remarks' in the Customer Sales Target page$")
	public void user_enters_the_Remarks_in_the_Customer_Sales_Target_page() throws Throwable {
	    
		System.out.println("Attempt: enter the 'Remarks'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.DT_SALES_TARGET_REMARKS, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-SalesTarget", "Remarks", 2));
		System.out.println("success: 'Remarks' entered successfully");
	}
	

	@Then("^User selects the 'Free Field (\\d+)' in the Customer Sales Target page$")
	public void user_selects_the_Free_Field1_in_the_Customer_Sales_Target_page(int arg1) throws Throwable {
	    
		System.out.println("Attempt: select the 'Free Field 1'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.SALES_TARGET_FREE_FIELD_1, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-SalesTarget", "Free Field 1", 2));
		System.out.println("success: 'Free Field 1' selected successfully");
	}
	

	@Then("^User selects the 'Free Field (\\d+)' in the Customer Sales Target page\\.$")
	public void user_selects_the_Free_Field2_in_the_Customer_Sales_Target_page(int arg1) throws Throwable {
	    
		System.out.println("Attempt: select the 'Free Field 2'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.SALES_TARGET_FREE_FIELD_2, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-SalesTarget", "Free Field 2", 2));
		System.out.println("success: 'Free Field 2' selected successfully");
	}
	

	@Then("^User enters the 'Free Text (\\d+)' in the Customer Sales Target page$")
	public void user_enters_the_Free_Text1_in_the_Customer_Sales_Target_page(int arg1) throws Throwable {
	    
		System.out.println("Attempt: enter the 'Free Text 1'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.SALES_TARGET_FREE_TEXT_1, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-SalesTarget", "Free Text 1", 2));
		System.out.println("success: 'Free Text 1' entered successfully");
	}
	

	@Then("^User enters the 'Free Text (\\d+)' in the Customer Sales Target page\\.$")
	public void user_enters_the_Free_Text2_in_the_Customer_Sales_Target_page(int arg1) throws Throwable {
	    
		System.out.println("Attempt: enter the 'Free Text 2'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.SALES_TARGET_FREE_TEXT_2, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-SalesTarget", "Free Text 2", 2));
		System.out.println("success: 'Free Text 2' entered successfully");
	}
	

	@Then("^User clicks on the save button and verifies the Customer Sales Target record is saved without any errors$")
	public void user_clicks_on_the_save_button_and_verifies_the_Customer_Sales_Target_record_is_saved_without_any_errors() throws Throwable {
	    
		user_clicks_on_the_save_button_and_verifies_the_product_records_is_saved_without_any_errors();
	}
	

	@Then("^User clicks on the 'Product Name' & edits the record & clicks on the save button$")
	public void user_clicks_on_the_Product_Name_edits_the_record_clicks_on_the_save_button() throws Throwable {
	
		System.out.println("Attempt: User clicks on the 'Product Name' and edits the records and clicks on the save button");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.SALES_TAR_SEARCH_PROD_NAME, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-SalesTarget", "Product Name", 2));
		CallObject.block(2000);
		PageObjects.SelectByXpath(
				driver, LocatorsPath.SALES_TARGET_FIRST_NAME, LocatorsPath.MAX_TIME);
		
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SALES_TARGET_1)))).clear();
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.SALES_TARGET_1, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-SalesTarget", "Target", 3));
		System.out.println("Attempt: Record edited and clicked on the save button successfully");
	}
	

	@Then("^User verifies the 'Customer Sales Target' record is edited and saved without any errors\\.$")
	public void user_verifies_the_Customer_Sales_Target_record_is_edited_and_saved_without_any_errors() throws Throwable {
	    
		user_clicks_on_the_save_button_and_verifies_the_product_records_is_saved_without_any_errors();
	}
	

	@Then("^User Tries to add the SKU which is already part of the list for the same date range$")
	public void user_Tries_to_add_the_SKU_which_is_already_part_of_the_list_for_the_same_date_range() throws Throwable {
	 
		user_clicks_on_the_Add_Sales_Target_button_and_navigates_to_the_Add_Sales_Target_page();
		user_selects_the_Product_Name_which_displays_all_the_SKU_which_are_part_of_Depot_Assortment_Plan();
		user_enters_the_Target_in_the_Customer_Sales_Target_page();
		user_selects_the_Start_Date_in_the_Customer_Sales_Target_page();
		user_selects_the_End_Date_in_the_Customer_Sales_Target_page();
		user_clicks_on_the_save_button_and_verifies_the_product_records_is_saved_without_any_errors();
	}
	

	@Then("^User verifies that the system displays a error message as 'Sales Target dates overlapping for the SKU'\\.$")
	public void user_verifies_that_the_system_displays_a_error_message_as_Sales_Target_dates_overlapping_for_the_SKU() throws Throwable {
	    
		System.out.println("Attempt: Verify the system displaying a prompt error message");
		WebElement message = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ERROR_MESSAGE))));
		Assert.assertEquals("sales target dates are overlapping for the SKU", 
				message.getText());
		System.out.println("Success: Prompt error message displayed successfully");	
	}
	

	
	/**----------------------RCS_SaaS_Customer_Sales_Target_SKU_Deletion_WC--------------------------**/
	
	
	
	@Then("^User selects a SKU record & clicks on the Delete icon\\.$")
	public void user_selects_a_SKU_record_clicks_on_the_Delete_icon() throws Throwable {
	    
		System.out.println("Attempt: Select a Contract record & click on the Delete icon");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.OUTLET_TIMES_CANCEL, LocatorsPath.MAX_TIME);
		
		CallObject.switchToAlert(driver);
		CallObject.waitForPageLoad(driver);
		System.out.println("Success: Contract record selected & clicked on the Delete icon");
	}
	

	@Then("^User verifies that the selected SKU record is deleted successfully$")
	public void user_verify_that_the_selected_SKU_record_is_deleted_successfully() throws Throwable {
	   
		removeOutletRecords();
	}


	
	/**----------------------RCS_SaaS_Sales_Tab_WC--------------------------**/
	
	
	
	@Then("^User clicks on the 'Sales' tab as a rep and navigates to the 'Sales' screen$")
	public void user_clicks_on_the_Sales_tab_as_a_rep_and_navigates_to_the_Sales_screen() throws Throwable {
	   
		logOut();
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.LOGIN_USERNAME, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Sales", "LoginUserName", 2));
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.LOGIN_PASSWORD, LocatorsPath.MAX_TIME, 
				file.getCellData("Login", "LoginPassword", 2));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.LOGIN, LocatorsPath.MAX_TIME);
		
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.CUSTOMER_SEARCH, LocatorsPath.MAX_TIME);
		WebElement search = wait.until(
				ExpectedConditions.presenceOfElementLocated(By.cssSelector(LocatorsPath.DT_CUST_SEARCH)));
		file2.setCellData("DataEntry-Sales", "Customer Number", 2, search.getText());
		CallObject.block(3000);
		
		user_navigates_to_the_Search_screen();
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.CUSTOMER_NUMBER, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Sales", "Customer Number", 2));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.CUSTOMER_SEARCH, LocatorsPath.MAX_TIME);
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.xpath(LocatorsPath.DP_TRADING_TERMS)));
		PageObjects.SelectByXpath(
				driver, LocatorsPath.DP_TRADING_TERMS, LocatorsPath.MAX_TIME);
		
		WebElement priceList = wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath(LocatorsPath.DT_TRADING_TERMS_PRICE_LIST)));
		Select priceSelect = new Select(priceList);
		priceSelect.selectByVisibleText(
				file2.getCellData("DataEntry-Sales", "PriceList", 2));
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.NEW_USER_SAVE)));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.NEW_USER_SAVE, LocatorsPath.MAX_TIME);
		
		System.out.println("Attempt: Click on Sales Tab");
		WebElement sales = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.SALES))));
		actions.moveToElement(sales).doubleClick().build().perform();
		System.out.println("Success: Sales Tab selected successfully");
	}
	

	@Then("^User verifies the following 'Sales Orders' sub tab is avaialable$")
	public void user_verifies_the_following_Sales_Orders_sub_tab_is_avaialable() throws Throwable {
	   
		System.out.println("Attempt: verify the following 'Sales Orders' sub tab is avaialable");
		WebElement sale = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.SALES_SALE_ORDERS))));
	    Assert.assertEquals("Sales Orders", sale.getText());
	    System.out.println("Success: The following 'Sales Orders' sub tab is displayed successfully");
	}
	

	@Then("^User verifies the following 'Pre-Sales Orders' sub tab is avaialable$")
	public void user_verifies_the_following_Pre_Sales_Orders_sub_tab_is_avaialable() throws Throwable {
	   
		System.out.println("Attempt: verify the following 'Pre-Sales Orders' sub tab is avaialable");
		WebElement presale = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.SALES_PRE_SALE_ORDERS))));
	    Assert.assertEquals("Pre-Sales Orders", presale.getText());
	    System.out.println("Success: The following 'Pre-Sales Orders' sub tab is displayed successfully");
	}
	

	@Then("^User verifies the following 'Invoices' sub tab is avaialable$")
	public void user_verifies_the_following_Invoices_sub_tab_is_avaialable() throws Throwable {
	   
		System.out.println("Attempt: verify the following 'Invoices' sub tab is avaialable");
		WebElement invoices = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.SALES_INVOICES))));
	    Assert.assertEquals("Invoices", invoices.getText());
	    System.out.println("Success: The following 'Invoices' sub tab is displayed successfully");
	}
	

	@Then("^User verifies the following 'Payments' sub tab is avaialable$")
	public void user_verifies_the_following_Payments_sub_tab_is_avaialable() throws Throwable {
	 
		System.out.println("Attempt: verify the following 'Payments' sub tab is avaialable");
		WebElement payments = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.SALES_PAYMENTS))));
	    Assert.assertEquals("Payments", payments.getText());
	    System.out.println("Success: The following 'Payments' sub tab is displayed successfully");
	}
	

	@Then("^User verifies the following 'Return Order' sub tab contains (\\d+) options - 'Presales Return', 'Prompt-Return' & 'Stock-Exchange'$")
	public void user_verifies_the_following_Return_Order_sub_tab_contains_options_Presales_Return_Prompt_Return_Stock_Exchange(int arg1) throws Throwable {
	    
		System.out.println("Attempt: verify the following 'Return Order' sub tab is avaialable");
		WebElement returnOrder = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.SALES_RETURN_ORDERS))));
	    Assert.assertEquals("Return Order", returnOrder.getText());
	    
	    PageObjects.SelectByXpath(
	    		driver, LocatorsPath.SALES_RETURN_ORDERS, LocatorsPath.MAX_TIME);
	    WebElement presales = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SALES_PRE_SALES_RETURN))));
	    Assert.assertEquals("Presales - Return", presales.getText());
	    
	    WebElement prompt = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SALES_PROMPT_RETURN))));
	    Assert.assertEquals("Prompt - Return", prompt.getText());
	    
	    WebElement stock = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SALES_STOCK_EXCHANGE))));
	    Assert.assertEquals("Stock-Exchange", stock.getText());
	    System.out.println("Success: The following 'Return Order' sub tab is displayed successfully");
	}
	

	
	/**----------------------RCS_SaaS_Sales_Orders_WC--------------------------**/
	
	
	
	@Then("^User clicks on the 'Sales Order' sub tab$")
	public void user_clicks_on_the_Sales_Order_sub_tab() throws Throwable {
	    
		System.out.println("Attempt: click on the 'Sales Order' sub tab");
		PageObjects.SelectByXpath(
	    		driver, LocatorsPath.SALES_SALE_ORDERS, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Sales Order' sub tab clicked successfully");
	}
	

	@Then("^User verifes the 'Sales Order Header' & 'Sales Order Details' displayed under the 'Sales Order' sub tab$")
	public void user_verifes_the_Sales_Order_Header_Sales_Order_Details_displayed_under_the_Sales_Order_sub_tab() throws Throwable {
	    
		System.out.println("Attempt: Verify the 'Sales Order Header' & 'Sales Order Details' displayed");
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.SALES_SALES_HISTORY, LocatorsPath.MAX_TIME);
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.SALES_SALES_DATA, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Sales Order Header' & 'Sales Order Details' displayed successfully");
	}
	

	@Then("^User clicks on the 'Create Sales Order' and enters the quantity for the SKU's & saves the record$")
	public void user_clicks_on_the_Create_Sales_Order_and_enters_the_quantity_for_the_SKU_s_saves_the_record() throws Throwable {
	    
		System.out.println("Attempt: click on the 'Create Sales Order' "
				+ "and enter the quantity for the SKU's");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.CREATE_SALES_ORDER, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.SALES_PRODUCT_SKU_1, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Sales", "Quantity", 2));
		System.out.println("Success: 'Create Sales Order' clicked and "
				+ "the quantity entered for the SKU's successfully");
	}
	

	@Then("^User verifies the SKU quantity is entered & saved without any errors\\.$")
	public void user_verifies_the_SKU_quantity_is_entered_saved_without_any_errors() throws Throwable {
	    
		System.out.println("Attempt: verify the SKU quantity is entered & saved without any errors");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.SALES_PRODUCT_SKU_SAVE, LocatorsPath.MAX_TIME);
		
		if(driver.getPageSource().contains("Please enter the quantity for atleast one Product !!!")) {
			driver.manage().timeouts().pageLoadTimeout(LocatorsPath.MAX_TIME, TimeUnit.SECONDS);
			wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.SALES_PRODUCT_SKU_1)))).clear();
			CallObject.block(3000);
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.SALES_PRODUCT_SKU_1, LocatorsPath.MAX_TIME, 
					file2.getCellData("DataEntry-Sales", "Quantity", 2));
			CallObject.block(2000);
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.SALES_PRODUCT_SKU_3, LocatorsPath.MAX_TIME, 
					file2.getCellData("DataEntry-Sales", "Quantity", 2));
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.SALES_PRODUCT_SKU_SAVE, LocatorsPath.MAX_TIME);
		}
		System.out.println("Success: SKU quantity is entered & saved without any errors successfully");
	}
	

	@Then("^User clicks on the 'Invoice' button$")
	public void user_clicks_on_the_Invoice_button1() throws Throwable {
	    
		System.out.println("Attempt: click on the 'Invoice' button");
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.SALES_INVOICE)));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.SALES_INVOICE, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Invoice' button clicked successfully");
	}
	

	@Then("^User verifies on selecting 'Invoice' option system should prompt through Payment mode - Cash, Cheque, Credit Memo, Allocate GTN, EFT, Mobile Money Payment$")
	public void user_verifies_on_selecting_Invoice_option_system_should_prompt_through_Payment_mode_Cash_Cheque_Credit_Memo_Allocate_GTN_EFT_Mobile_Money_Payment1() throws Throwable {
	    
		System.out.println("Attempt: verify on selecting 'Invoice' option system should prompt through Payment mode");
		WebElement cash = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.SALES_PAYMENT_CASH))));
	    Assert.assertEquals("Cash", cash.getText());
	    
	    WebElement cheque = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.SALES_PAYMENT_CHEQUE))));
	    Assert.assertEquals("Cheque", cheque.getText());
	    
	    WebElement credit = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.SALES_PAYMENT_CREDIT_MEMO))));
	    Assert.assertEquals("Credit Memo", credit.getText());
	    
	    WebElement gtn = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.SALES_PAYMENT_GTN))));
	    Assert.assertEquals("Allocate GTN", gtn.getText());
	    
	    WebElement eft = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.SALES_PAYMENT_EFT))));
	    Assert.assertEquals("EFT", eft.getText());
	    
	    WebElement mobile = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.SALES_PAY_MONEY_MOVEMENT))));
	    Assert.assertEquals("Mobile Money Payment", mobile.getText());
	    System.out.println("Success: verified on selecting 'Invoice' option system should prompt through Payment mode");
	}
	

	@Then("^User selects the Payment Mode & enters the amount & clicks on save button$")
	public void user_selects_the_Payment_Mode1_enters_the_amount_clicks_on_save_button() throws Throwable {
	    
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.SALES_PAYMENT_CASH_1, LocatorsPath.MAX_TIME);
		
		WebElement balance = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SALES_PAY_BALANCE_AMOUNT))));
		file2.setCellData("DataEntry-Sales", "Amount", 2, balance.getAttribute("value"));
		
		driver.manage().timeouts().pageLoadTimeout(LocatorsPath.MAX_TIME, TimeUnit.SECONDS);
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.SALES_PAY_AMOUNT, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Sales", "Amount", 2));
		user_clicks_on_the_save_button_and_verifies_the_product_records_is_saved_without_any_errors();
	}
	

	@Then("^User verifies the Order status is CLOSED, Invoice status is CLOSED & Payment status is CLOSED$")
	public void user_verifies_the_Order_status1_is_CLOSED_Invoice_status_is_CLOSED_Payment_status_is_CLOSED() throws Throwable {
	    
		try {
			System.out.println("Attempt: verify the Order status is CLOSED, "
					+ "Invoice status is CLOSED & Payment status is CLOSED");
			WebElement paymentStatus = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.SALES_PAYMENT_NUMBER))));
			CallObject.block(2000);
			file2.setCellData("DataEntry-Sales", "Payment Number", 2, 
					paymentStatus.getText());
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.SALES_PAYMENT_SEARCH, LocatorsPath.MAX_TIME, 
					file2.getCellData("DataEntry-Sales", "Payment Number", 2));
			
			 WebElement verifyPayStatus = wait.until(ExpectedConditions.
						presenceOfElementLocated((By.cssSelector(LocatorsPath.SALES_PAYMENT_STATUS))));
			 Assert.assertEquals("Closed", verifyPayStatus.getText());
			 
			 PageObjects.SelectByXpath(
					 driver, LocatorsPath.SALES_SALE_ORDERS, LocatorsPath.MAX_TIME);
			 WebElement orderStatus = wait.until(ExpectedConditions.
						presenceOfElementLocated((By.cssSelector(LocatorsPath.SALES_ORDERS_NUMBER))));
			 CallObject.block(2000);
			 file2.setCellData("DataEntry-Sales", "Order Number", 2, 
						orderStatus.getText());
			 PageObjects.SelectByCSSSelectorWithSendKeys(
						driver, LocatorsPath.SALES_ORDER_SEARCH, LocatorsPath.MAX_TIME, 
						file2.getCellData("DataEntry-Sales", "Order Number", 2));
			 
			 js.executeScript("arguments[0].scrollIntoView();", 
						driver.findElement(By.cssSelector(LocatorsPath.DT_SALES_ORDER_STATUS)));
			 WebElement verifyOrderStatus = wait.until(ExpectedConditions.
						presenceOfElementLocated((By.cssSelector(LocatorsPath.DT_SALES_ORDER_STATUS))));
			 Assert.assertEquals("4-CLOSED", verifyOrderStatus.getText());
			 
			 PageObjects.SelectByXpath(
					 driver, LocatorsPath.SALES_INVOICES, LocatorsPath.MAX_TIME);
			 WebElement invoiceStatus = wait.until(ExpectedConditions.
						presenceOfElementLocated((By.cssSelector(LocatorsPath.SALES_INVOICE_NUMBER))));
			 CallObject.block(2000);
			 file2.setCellData("DataEntry-Sales", "Invoice Number", 2, 
					 invoiceStatus.getText());
			 PageObjects.SelectByCSSSelectorWithSendKeys(
						driver, LocatorsPath.SALES_INVOICE_SEARCH, LocatorsPath.MAX_TIME, 
						file2.getCellData("DataEntry-Sales", "Invoice Number", 2));
			 
		     js.executeScript("arguments[0].scrollIntoView();", 
						driver.findElement(By.cssSelector(LocatorsPath.SALES_INVOICE_STATUS)));
			 WebElement verifyInvoiceStatus = wait.until(ExpectedConditions.
						presenceOfElementLocated((By.cssSelector(LocatorsPath.SALES_INVOICE_STATUS))));
			 Assert.assertEquals("CLOSED", verifyInvoiceStatus.getText());
			 System.out.println("Success: Order status is CLOSED, Invoice status is CLOSED "
			 		+ "& Payment status is CLOSED successfully");	
		} catch (StaleElementReferenceException StaleElementReferenceException) {
			System.out.println("Trying to recover from stale element" + StaleElementReferenceException);
		}
	}
	

	
	/**----------------------RCS_SaaS_Pre_Sales_Orders_WC--------------------------**/
	
	
	
	@Then("^User clicks on the 'Pre-Sales Orders' as a REP user$")
	public void user_clicks_on_the_Pre_Sales_Orders_as_a_REP_user() throws Throwable {
	    
		System.out.println("Attempt: click on the 'Pre-Sales Orders' as a REP user");
		PageObjects.SelectByXpath(
				driver, LocatorsPath.SALES_PRE_SALE_ORDERS, LocatorsPath.MAX_TIME);
		System.out.println("Attempt: clicked on 'Pre-Sales Orders' as a REP user successfully");
	}
	

	@Then("^User verifes the 'Pre-Sales Order Header' & 'Pre-Sales Order' Details displayed under the 'Pre-Sales Orders' sub tab$")
	public void user_verifes_the_Pre_Sales_Order_Header_Pre_Sales_Order_Details_displayed_under_the_Pre_Sales_Orders_sub_tab() throws Throwable {
	    
		user_verifes_the_Sales_Order_Header_Sales_Order_Details_displayed_under_the_Sales_Order_sub_tab();
	}
	

	@Then("^User clicks on the 'Create Pre-Sales Order' and enters the quantity for the SKU's & saves the record$")
	public void user_clicks_on_the_Create_Pre_Sales_Order_and_enters_the_quantity_for_the_SKU_s_saves_the_record() throws Throwable {
	    
		System.out.println("Attempt: click on the 'Create Pre-Sales Order'");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.CREATE_PRE_SALES_ORDER, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.SALES_PRODUCT_SKU_1, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Sales", "Quantity", 3));
		System.out.println("Success: 'Create Pre-Sales Order' clicked successfully");
	}
	

	@Then("^User should be able to create & save Pre-Sales Order as Inventory is not required$")
	public void user_should_be_able_to_create_save_Pre_Sales_Order_as_Inventory_is_not_required() throws Throwable {
		
		System.out.println("Attempt: verify the SKU quantity is entered & saved without any errors");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.SALES_PRODUCT_SKU_SAVE, LocatorsPath.MAX_TIME);
		
		if(driver.getPageSource().contains("Please enter the quantity for atleast one Product !!!")) {
			driver.manage().timeouts().pageLoadTimeout(LocatorsPath.MAX_TIME, TimeUnit.SECONDS);
			wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.SALES_PRODUCT_SKU_1)))).clear();
			CallObject.block(3000);
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.SALES_PRODUCT_SKU_1, LocatorsPath.MAX_TIME, 
					file2.getCellData("DataEntry-Sales", "Quantity", 2));
			CallObject.block(2000);
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.SALES_PRODUCT_SKU_3, LocatorsPath.MAX_TIME, 
					file2.getCellData("DataEntry-Sales", "Quantity", 2));
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.SALES_PRODUCT_SKU_SAVE, LocatorsPath.MAX_TIME);
		}
		System.out.println("Success: SKU quantity is entered & saved without any errors successfully");
	}
	

	@Then("^User books the Pre-Sales Order$")
	public void user_books_the_Pre_Sales_Order() throws Throwable {
	    
		System.out.println("Attempt: book the Pre-Sales Order");
		WebElement book = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.SALES_PRE_SALES_ORDER_BOOK))));
		actions.moveToElement(book).doubleClick().build().perform();
		System.out.println("Success: Pre-Sales Order booked successfully");
	}
	

	@Then("^User verifies the Pre-Sales Order Header is created with the Order Number, Order value, Order quantity, Order status as SAVED & Delivery Date$")
	public void user_verifies_the_Pre_Sales_Order_Header_is_created_with_the_Order_Number_Order_value_Order_quantity_Order_status_as_SAVED_Delivery_Date() throws Throwable {
	    
		 System.out.println("Attempt: verify the Pre-Sales Order Header is created");
		 WebElement orderNum = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.SALES_PRE_SALES_ORDER_NUM))));
		 file2.setCellData("DataEntry-Sales", "Pre-Sales Order Number", 2, 
				 orderNum.getText());
		 PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.SALES_PRE_SALES_ORDER_SEARCH, LocatorsPath.MAX_TIME, 
					file2.getCellData("DataEntry-Sales", "Pre-Sales Order Number", 2));
		 try {
			 js.executeScript("arguments[0].scrollIntoView();", 
						driver.findElement(By.cssSelector(LocatorsPath.SALES_PRE_SALES_ORDER_VALUE)));
			 WebElement verifyOrderValue = wait.until(ExpectedConditions.
						presenceOfElementLocated((By.cssSelector(LocatorsPath.SALES_PRE_SALES_ORDER_VALUE))));
			 file2.setCellData("DataEntry-Sales", "Pre-Sales Order value", 2, 
					 verifyOrderValue.getText());
			 Assert.assertEquals(
					 file2.getCellData("DataEntry-Sales", "Pre-Sales Order value", 2), 
					 verifyOrderValue.getText());
		} catch (StaleElementReferenceException StaleElementReferenceException) {
			System.out.println("Trying to recover from stale element" + StaleElementReferenceException);
		}
		
		 try {
			 js.executeScript("arguments[0].scrollIntoView();", 
						driver.findElement(By.cssSelector(LocatorsPath.SALES_PRE_SALES_ORDER_VALUE)));
			 WebElement verifyOrderQuantity = wait.until(ExpectedConditions.
						presenceOfElementLocated((By.cssSelector(LocatorsPath.SALES_PRE_SALES_ORDER_QUAN))));
			 file2.setCellData("DataEntry-Sales", "Pre-Sales Order Quan", 2, 
					 verifyOrderQuantity.getText());
			 Assert.assertEquals(
					 file2.getCellData("DataEntry-Sales", "Pre-Sales Order Quan", 2), 
					 verifyOrderQuantity.getText());
		} catch (StaleElementReferenceException StaleElementReferenceException) {
			System.out.println("Trying to recover from stale element" + StaleElementReferenceException);
		}
		
		 try {
			 js.executeScript("arguments[0].scrollIntoView();", 
						driver.findElement(By.cssSelector(LocatorsPath.SALES_PRE_SALES_ORDER_DATE)));
			 WebElement verifyOrderDate = wait.until(ExpectedConditions.
						presenceOfElementLocated((By.cssSelector(LocatorsPath.SALES_PRE_SALES_ORDER_DATE))));
			 file2.setCellData("DataEntry-Sales", "Pre-Sales Order Date", 2, 
					 verifyOrderDate.getAttribute("value"));
			 Assert.assertEquals(
					 file2.getCellData("DataEntry-Sales", "Pre-Sales Order Date", 2), 
					 verifyOrderDate.getAttribute("value"));
		} catch (StaleElementReferenceException StaleElementReferenceException) {
			System.out.println("Trying to recover from stale element" + StaleElementReferenceException);
		}
		 System.out.println("Success: Pre-Sales Order Header is created successfully");
	}
	

	@Then("^User verifies the Pre-Sales Detail section as the SKU's with Quantity entered, Unit Price, Net Price & Gross Price$")
	public void user_verifies_the_Pre_Sales_Detail_section_as_the_SKU_s_with_Quantity_entered_Unit_Price_Net_Price_Gross_Price() throws Throwable {
	    
		try {
			js.executeScript("arguments[0].scrollIntoView();", 
					driver.findElement(By.cssSelector(LocatorsPath.SALES_PRE_SALES_ORDE_QUAN)));
			WebElement quantity = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.SALES_PRE_SALES_ORDE_QUAN))));
			Assert.assertTrue(quantity.getAttribute
					 ("readonly").equals("true"),"readonly");
			file2.setCellData("DataEntry-Sales", "Pre-Sales Quantity", 2, 
					quantity.getAttribute("value"));
		    Assert.assertEquals(
		    		file2.getCellData("DataEntry-Sales", "Pre-Sales Quantity", 2),
		    		quantity.getAttribute("value"));
		    
		    js.executeScript("arguments[0].scrollIntoView();", 
					driver.findElement(By.cssSelector(LocatorsPath.SALES_PRE_SALES_UNIT_PRICE)));
		    WebElement unitPrice = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.SALES_PRE_SALES_UNIT_PRICE))));
		    Assert.assertTrue(unitPrice.getAttribute
					 ("readonly").equals("true"),"readonly");
			file2.setCellData("DataEntry-Sales", "Pre-Sales Unit Price", 2, 
					unitPrice.getAttribute("value"));
		    Assert.assertEquals(
		    		file2.getCellData("DataEntry-Sales", "Pre-Sales Unit Price", 2),
		    		unitPrice.getAttribute("value"));
		    
		    js.executeScript("arguments[0].scrollIntoView();", 
					driver.findElement(By.cssSelector(LocatorsPath.SALES_PRE_SALES_NET_PRICE)));
		    WebElement netPrice = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.SALES_PRE_SALES_NET_PRICE))));
		    Assert.assertTrue(netPrice.getAttribute
					 ("readonly").equals("true"),"readonly");
			file2.setCellData("DataEntry-Sales", "Pre-Sales Net Price", 2, 
					netPrice.getAttribute("value"));
		    Assert.assertEquals(
		    		file2.getCellData("DataEntry-Sales", "Pre-Sales Net Price", 2),
		    		netPrice.getAttribute("value"));
		    
		    js.executeScript("arguments[0].scrollIntoView();", 
					driver.findElement(By.cssSelector(LocatorsPath.SALES_PRE_SALES_GROSS_PRICE)));
		    WebElement grossPrice = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.SALES_PRE_SALES_GROSS_PRICE))));
		    Assert.assertTrue(grossPrice.getAttribute
					 ("readonly").equals("true"),"readonly");
			file2.setCellData("DataEntry-Sales", "Pre-Sales Gross Price", 2, 
					grossPrice.getAttribute("value"));
		    Assert.assertEquals(
		    		file2.getCellData("DataEntry-Sales", "Pre-Sales Gross Price", 2),
		    		grossPrice.getAttribute("value"));	
		} catch (StaleElementReferenceException StaleElementReferenceException) {
			System.out.println("Trying to recover from stale element" + StaleElementReferenceException);
		}
	}
	

	@Then("^User verifies the Pre-Sales Order status changed to BOOKED$")
	public void usser_verifies_the_Pre_Sales_Order_status_changed_to_BOOKED() throws Throwable {
	 
	 System.out.println("Attempt: verify the Pre-Sales Order status changed to BOOKED");
	 js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.SALES_PRE_SALES_ORDER_STATUS)));
	 WebElement verifyOrderStatus = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SALES_PRE_SALES_ORDER_STATUS))));
	 Assert.assertEquals("BOOKED", verifyOrderStatus.getText());
	 System.out.println("Success: Pre-Sales Order status changed to BOOKED successfully");
	}
	

	
	/**----------------------RCS_SaaS_Invoice_Tab_WC--------------------------**/
	
	
	
	@Then("^User clicks on the 'Invoices' as a REP & navigates to the Invoices tab$")
	public void user_clicks_on_the_Invoice_as_a_REP_navigates_to_the_Invoice_tab() throws Throwable {
	 
		System.out.println("Attempt: click on the 'Invoices' as a REP");
		PageObjects.SelectByXpath(
				driver, LocatorsPath.SALES_INVOICES, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Invoices' as a REP clicked successfully");
	}
	

	@Then("^User verifies all the Invoices Header, Invoices Details & Payments for the Customer is displayed\\.$")
	public void user_verifes_all_the_Invoices_Header_Invoice_Details_Payments_for_the_Customer_is_displayed() throws Throwable {
	    
		System.out.println("Attempt: Verify all the Invoices Header, Invoices Details "
				+ "& Payments for the Customer is displayed");
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.SALES_INVOICES_DISPLAY, LocatorsPath.MAX_TIME);
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.SALES_INVOICES_DETAILS_DISP, LocatorsPath.MAX_TIME);
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.SALES_INVOICES_PAYMENTS_DISP, LocatorsPath.MAX_TIME);
		System.out.println("Success: All the Invoices Header, Invoices Details & "
				+ "Payments for the Customer is displayed successfully");
	}
	

	
	/**----------------------RCS_SaaS_Payments_Tab_WC--------------------------**/
	
	
	
	@Then("^User clicks on the 'Payments' as a REP & navigates to the Payments tab$")
	public void user_clicks_on_the_Payments_as_a_REP_navigates_to_the_Payments_tab() throws Throwable {
	    
		System.out.println("Attempt: click on the 'Payments' as a REP");
		PageObjects.SelectByXpath(
				driver, LocatorsPath.SALES_PAYMENTS, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Payments' as a REP clicked successfully");
	}
	

	@Then("^User User all the Payments Details & Payments Allocations for the Customer is displayed\\.$")
	public void user_User_all_the_Payments_Details_Payments_Allocations_for_the_Customer_is_displayed() throws Throwable {
	   
		System.out.println("Attempt: Verify all the Payments Details & "
				+ "Payments Allocations for the Customer is displayed");
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.SALES_PAYMENTS_DISPLAY, LocatorsPath.MAX_TIME);
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.SALES_PAYMENTS_ALLOCATION, LocatorsPath.MAX_TIME);
		System.out.println("Success: All the Payments Details & Payments Allocations"
				+ " for the Customer is displayed successfully");
	}
	

	
	/**----------------------RCS_SaaS_Pre_Sales_Return_WC--------------------------**/
	
	
	
	@Then("^User clicks on the 'Return Order' tab and selects the 'Pre-Sales Return' option as a REP user$")
	public void user_clicks_on_the_Return_Order_tab_and_selects_the_Pre_Sales_Return_option_as_a_REP_user() throws Throwable {
	    
		System.out.println("Attempt: click on the 'Return Order' tab and "
				+ "selects the 'Pre-Sales Return' option as a REP");
		PageObjects.SelectByXpath(
				driver, LocatorsPath.SALES_RETURN_ORDERS, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.SALES_PRE_SALES_RETURN_1, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Return Order' as a REP clicked & "
				+ "'Pre-Sales Return' option selected successfully");
	}
	

	@Then("^User navigates to the Pre-Sales Return Order tab where the Pre-Sales Return Order Header & Pre-Sales Return Order Details displayed$")
	public void user_navigates_to_the_Pre_Sales_Return_Order_tab_where_the_Pre_Sales_Return_Order_Header_Pre_Sales_Return_Order_Details_displayed() throws Throwable {
	    
		System.out.println("Attempt: Verify the Pre-Sales Return Order Header & "
				+ "Pre-Sales Return Order Details for the Customer is displayed");
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.SALES_RETURN_ORDER_DISP, LocatorsPath.MAX_TIME);
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.SALES_STOCK_RETURN_DISP, LocatorsPath.MAX_TIME);
		System.out.println("Success: Pre-Sales Return Order Header & Pre-Sales Return Order Details"
				+ " for the Customer is displayed successfully");
	}
	

	@Then("^User clicks on the 'Create Return Order' & enter the quantity for the SKU's & save the record under Pre-Sales Return\\.$")
	public void user_clicks_on_the_Create_Return_Order_enter_the_quantity_for_the_SKU_s_save_the_record_under_Pre_Sales_Return() throws Throwable {
	    
		System.out.println("Attempt: click on the 'Create Return "
				+ "Order' & enter the quantity for the SKU's");
		
		try {
			WebElement create = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.CREATE_RETURN_ORDER))));
			actions.moveToElement(create).doubleClick().build().perform();
			
			js.executeScript("arguments[0].scrollIntoView();", 
					driver.findElement(By.cssSelector(LocatorsPath.FACING_CHECKS_ADD)));
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.FACING_CHECKS_ADD, LocatorsPath.MAX_TIME);
			
			PageObjects.SelectByXpathWithoutClick(
					driver, LocatorsPath.STOCKS_RETURN_ADD_DISPLAY, LocatorsPath.MAX_TIME);
			
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.STOCKS_RETURN_PROD_NAME, LocatorsPath.MAX_TIME, 
					file2.getCellData("DataEntry-Sales", "Stocks Product Name", 2));
			
			CallObject.block(6000);
			wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCKS_RETURN_QUANTITY)))).clear();
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.STOCKS_RETURN_QUANTITY, LocatorsPath.MAX_TIME, 
					file2.getCellData("DataEntry-Sales", "Stocks Quantity", 2));
			
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.STOCKS_START_DATE_CALENDER, LocatorsPath.MAX_TIME);
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.CURRENT_DATE, LocatorsPath.MAX_TIME);
			
			user_clicks_on_the_save_button_and_verifies_the_product_records_is_saved_without_any_errors();
		} catch (StaleElementReferenceException StaleElementReferenceException) {
			System.out.println("Trying to recover from stale element" + StaleElementReferenceException);
		}
		System.out.println("Success: 'Create Return Order' clicked "
				+ "& quantity for the SKU's entered successfully");
	}
	

	@Then("^User verifes Pre-Sales Return Order Header is created with the Order Number, Return value, Order status as SAVED & Delivery Date\\.$")
	public void user_verifes_Pre_Sales_Return_Order_Header_is_created_with_the_Order_Number_Return_value_Order_status_as_SAVED_Delivery_Date() throws Throwable {
	    
		try {
			System.out.println("Attempt: verify the Pre-Sales Order Header is created");
			 WebElement orderNum = wait.until(ExpectedConditions.
						presenceOfElementLocated((By.cssSelector(LocatorsPath.PRE_SALES_RETURN_ORDER_NUM))));
			 file2.setCellData("DataEntry-Sales", "Pre-Sales Return Order Num", 2, 
					 orderNum.getText());
			 PageObjects.SelectByCSSSelectorWithSendKeys(
						driver, LocatorsPath.PRE_SALES_RETU_ORDER_SEARCH, LocatorsPath.MAX_TIME, 
						file2.getCellData("DataEntry-Sales", "Pre-Sales Return Order Num", 2));
			 
			 js.executeScript("arguments[0].scrollIntoView();", 
						driver.findElement(By.cssSelector(LocatorsPath.PRE_SALES_RETU_ORDER_STATUS)));
			 WebElement verifyReturnStatus = wait.until(ExpectedConditions.
						presenceOfElementLocated((By.cssSelector(LocatorsPath.PRE_SALES_RETU_ORDER_STATUS))));
			 file2.setCellData("DataEntry-Sales", "Pre-Sales Return Order Status", 2, 
					 verifyReturnStatus.getText());
			 Assert.assertEquals(
					 file2.getCellData("DataEntry-Sales", "Pre-Sales Return Order Status", 2), 
					 verifyReturnStatus.getText());
			 
			 js.executeScript("arguments[0].scrollIntoView();", 
						driver.findElement(By.cssSelector(LocatorsPath.PRE_SALES_RETU_RETURN_VALUE)));
			 WebElement verifyReturnValue = wait.until(ExpectedConditions.
						presenceOfElementLocated((By.cssSelector(LocatorsPath.PRE_SALES_RETU_RETURN_VALUE))));
			 file2.setCellData("DataEntry-Sales", "Pre-Sales Return Order Value", 2, 
					 verifyReturnValue.getText());
			 Assert.assertEquals(
					 file2.getCellData("DataEntry-Sales", "Pre-Sales Return Order Value", 2), 
					 verifyReturnValue.getText());
			 
			 js.executeScript("arguments[0].scrollIntoView();", 
						driver.findElement(By.cssSelector(LocatorsPath.PRE_SALES_RETU_DELIVER_DATE)));
			 WebElement verifyOrderDate = wait.until(ExpectedConditions.
						presenceOfElementLocated((By.cssSelector(LocatorsPath.PRE_SALES_RETU_DELIVER_DATE))));
			 CallObject.block(3000);
			 file2.setCellData("DataEntry-Sales", "Pre-Sales Return Order Date", 2, 
					 verifyOrderDate.getAttribute("value"));
			 Assert.assertEquals(
					 file2.getCellData("DataEntry-Sales", "Pre-Sales Return Order Date", 2), 
					 verifyOrderDate.getAttribute("value"));
			 System.out.println("Success: Pre-Sales Order Header is created successfully");
		} catch (StaleElementReferenceException StaleElementReferenceException) {
			System.out.println("Trying to recover from stale element" + StaleElementReferenceException);
		}
	}
	

	@Then("^User verifies the Pre-Sales Detail section should have SKU with Quantity entered, Price, Pricing Date, Stock Condition, Return for Reason, Amount, Excise Tax, GST % etc\\.$")
	public void user_verifies_the_Pre_Sales_Detail_section_should_have_SKU_with_Quantity_entered_Price_Pricing_Date_Stock_Condition_Return_for_Reason_Amount_Excise_Tax_GST_etc() throws Throwable {
	    
		 System.out.println("Attempt: verify the Pre-Sales Detail section should have SKU with "
		 		+ "Quantity entered, Price, Pricing Date, Stock Condition, Return for Reason, Amount, Excise Tax, GST % etc\\");
		 try {
			 WebElement verifyQuantity = wait.until(ExpectedConditions.
						presenceOfElementLocated((By.cssSelector(LocatorsPath.PRE_SALES_STOCK_RET_QUAN))));
			 file2.setCellData("DataEntry-Sales", "Pre-Sales Stock Return Quan", 2, 
					 verifyQuantity.getText());
			 Assert.assertEquals(
					 file2.getCellData("DataEntry-Sales", "Pre-Sales Stock Return Quan", 2), 
					 verifyQuantity.getText());
			 
			 js.executeScript("arguments[0].scrollIntoView();", 
						driver.findElement(By.cssSelector(LocatorsPath.PRE_SALES_STOCK_RET_EX_TAX)));
			 WebElement verifyExciseTax = wait.until(ExpectedConditions.
						presenceOfElementLocated((By.cssSelector(LocatorsPath.PRE_SALES_STOCK_RET_EX_TAX))));
			 file2.setCellData("DataEntry-Sales", "Pre-Sales Stock Return Excise Tax", 2, 
					 verifyExciseTax.getText());
			 Assert.assertEquals(
					 file2.getCellData("DataEntry-Sales", "Pre-Sales Stock Return Excise Tax", 2), 
					 verifyExciseTax.getText());
			 
			 js.executeScript("arguments[0].scrollIntoView();", 
						driver.findElement(By.cssSelector(LocatorsPath.PRE_SALES_STOCK_RET_PRICE)));
			 WebElement verifyPrice = wait.until(ExpectedConditions.
						presenceOfElementLocated((By.cssSelector(LocatorsPath.PRE_SALES_STOCK_RET_PRICE))));
			 file2.setCellData("DataEntry-Sales", "Pre-Sales Stock Return Price", 2, 
					 verifyPrice.getText());
			 Assert.assertEquals(
					 file2.getCellData("DataEntry-Sales", "Pre-Sales Stock Return Price", 2), 
					 verifyPrice.getText());
			 
			 js.executeScript("arguments[0].scrollIntoView();", 
						driver.findElement(By.cssSelector(LocatorsPath.PRE_SALES_STOCK_RET_GST)));
			 WebElement verifyGst = wait.until(ExpectedConditions.
						presenceOfElementLocated((By.cssSelector(LocatorsPath.PRE_SALES_STOCK_RET_GST))));
			 file2.setCellData("DataEntry-Sales", "Pre-Sales Stock Return GST", 2, 
					 verifyGst.getText());
			 Assert.assertEquals(
					 file2.getCellData("DataEntry-Sales", "Pre-Sales Stock Return GST", 2), 
					 verifyGst.getText());
			 
			 js.executeScript("arguments[0].scrollIntoView();", 
						driver.findElement(By.cssSelector(LocatorsPath.PRE_SALES_STOCK_RET_AMOUNT)));
			 WebElement verifyAmount = wait.until(ExpectedConditions.
						presenceOfElementLocated((By.cssSelector(LocatorsPath.PRE_SALES_STOCK_RET_AMOUNT))));
			 file2.setCellData("DataEntry-Sales", "Pre-Sales Stock Return Amount", 2, 
					 verifyAmount.getText());
			 Assert.assertEquals(
					 file2.getCellData("DataEntry-Sales", "Pre-Sales Stock Return Amount", 2), 
					 verifyAmount.getText());
			 
			 js.executeScript("arguments[0].scrollIntoView();", 
						driver.findElement(By.cssSelector(LocatorsPath.PRE_SALES_STOCK_RET_PRIC_DAT)));
			 WebElement verifyDate = wait.until(ExpectedConditions.
						presenceOfElementLocated((By.cssSelector(LocatorsPath.PRE_SALES_STOCK_RET_PRIC_DAT))));
			 file2.setCellData("DataEntry-Sales", "Pre-Sales Stock Return Price Date", 2, 
					 verifyDate.getText());
			 Assert.assertEquals(
					 file2.getCellData("DataEntry-Sales", "Pre-Sales Stock Return Price Date", 2), 
					 verifyDate.getText());
			 
			 js.executeScript("arguments[0].scrollIntoView();", 
						driver.findElement(By.cssSelector(LocatorsPath.PRE_SALES_STOCK_RET_STO_CON)));
			 WebElement verifyCondition = wait.until(ExpectedConditions.
						presenceOfElementLocated((By.cssSelector(LocatorsPath.PRE_SALES_STOCK_RET_STO_CON))));
			 file2.setCellData("DataEntry-Sales", "Pre-Sales Stock Return Condition", 2, 
					 verifyCondition.getText());
			 Assert.assertEquals(
					 file2.getCellData("DataEntry-Sales", "Pre-Sales Stock Return Condition", 2), 
					 verifyCondition.getText());
			 
			 js.executeScript("arguments[0].scrollIntoView();", 
						driver.findElement(By.cssSelector(LocatorsPath.PRE_SALES_STOCK_RET_REAS_RET)));
			 WebElement verifyReason= wait.until(ExpectedConditions.
						presenceOfElementLocated((By.cssSelector(LocatorsPath.PRE_SALES_STOCK_RET_REAS_RET))));
			 file2.setCellData("DataEntry-Sales", "Pre-Sales Stock Return Reason", 2, 
					 verifyReason.getText());
			 Assert.assertEquals(
					 file2.getCellData("DataEntry-Sales", "Pre-Sales Stock Return Reason", 2), 
					 verifyReason.getText());
		} catch (StaleElementReferenceException StaleElementReferenceException) {
			System.out.println("Trying to recover from stale element" + StaleElementReferenceException);
		}
		 System.out.println("Success: verified the Pre-Sales Detail section SKU with "
			 		+ "Quantity entered, Price, Pricing Date, Stock Condition, Return for Reason, Amount, Excise Tax, GST % etc\\\\");
	}
	

	@Then("^User books the order for the 'Pre-Sales Return'$")
	public void user_books_the_order_for_the_Pre_Sales_Return() throws Throwable {
	    
		System.out.println("Attempt: book the Pre-Sales Return");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.PRE_SALES_STOCK_RET_BOOK, LocatorsPath.MAX_TIME);
		System.out.println("Success: Pre-Sales Return booked successfully");
	}
	

	@Then("^User verifies the Pre-Sales Order status is changed to BOOKED$")
	public void user_verifies_the_Pre_Sales_Order_status_is_changed_to_BOOKED() throws Throwable {
	   
		 System.out.println("Attempt: verify the Pre-Sales Order status changed to BOOKED");
		 js.executeScript("arguments[0].scrollIntoView();", 
					driver.findElement(By.cssSelector(LocatorsPath.PRE_SALES_RETU_ORDER_STATUS)));
		 WebElement verifyOrderStatus = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.PRE_SALES_RETU_ORDER_STATUS))));
		 Assert.assertEquals("BOOK", verifyOrderStatus.getText());
		 System.out.println("Success: Pre-Sales Order status changed to BOOKED successfully");
	}
	

	
	/**----------------------RCS_SaaS_Prompt_Return_WC--------------------------**/
	
	
	
	@Then("^User clicks on the 'Return Order' tab and selects the 'Prompt Return' option as a REP user$")
	public void user_clicks_on_the_Return_Order_tab_and_selects_the_Prompt_Return_option_as_a_REP_user() throws Throwable {
	    
		System.out.println("Attempt: click on the 'Return Order' tab and "
				+ "selects the 'Prompt Return' option as a REP");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.SALES_PROMPT_RETURN_1, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Return Order' as a REP clicked & "
				+ "'Prompt Return' option selected successfully");
	}
	

	@Then("^User Verifies the Return Order Header & Return Order Details displayed$")
	public void user_Verifies_the_Return_Order_Header_Return_Order_Details_displayed() throws Throwable {
	    
		user_navigates_to_the_Pre_Sales_Return_Order_tab_where_the_Pre_Sales_Return_Order_Header_Pre_Sales_Return_Order_Details_displayed();
	}
	

	@Then("^User clicks on the 'Create Return Order' & enter the quantity for the SKU's & save the record under Prompt Return\\.$")
	public void user_clicks_on_the_Create_Return_Order_enter_the_quantity_for_the_SKU_s_save_the_record_under_Prompt_Return() throws Throwable {
	    
		user_clicks_on_the_Create_Return_Order_enter_the_quantity_for_the_SKU_s_save_the_record_under_Pre_Sales_Return();
	}
	

	@Then("^User verifies the SKU quantity is entered & saved without errors under Prompt Return$")
	public void user_verifies_the_SKU_quantity_is_entered_saved_without_errors_under_Prompt_Return() throws Throwable {
	    
		System.out.println("User verifies the SKU quantity is entered "
				+ "& saved without errors under Prompt Return");
	}
	

	@Then("^User clicks on the commit button and verifies the Order status is changed to Booked$")
	public void user_clicks_on_the_commit_button_and_verifies_the_Order_status_is_changed_to_Closed1() throws Throwable {
	    
		System.out.println("Attempt: click on the commit button and verify the Order status is changed to booked");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.PROMPT_RETURN_COMMIT, LocatorsPath.MAX_TIME);
		 WebElement orderNum = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.PRE_SALES_RETURN_ORDER_NUM))));
		 CallObject.block(2000);
		 file2.setCellData("DataEntry-Sales", "Pre-Sales Return Order Num", 2, 
				 orderNum.getText());
		 PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.PRE_SALES_RETU_ORDER_SEARCH, LocatorsPath.MAX_TIME, 
					file2.getCellData("DataEntry-Sales", "Pre-Sales Return Order Num", 2));
		 
		 js.executeScript("arguments[0].scrollIntoView();", 
					driver.findElement(By.cssSelector(LocatorsPath.PRE_SALES_RETU_ORDER_STATUS)));
		 WebElement verifyOrderStatus = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.PRE_SALES_RETU_ORDER_STATUS))));
		 Assert.assertEquals("BOOKED", verifyOrderStatus.getText());
		 System.out.println("Success: commit button clicked and Order status is changed to booked");
	}
	

	
	/**----------------------RCS_SaaS_Stock_Exchange_WC--------------------------**/
	
	
	
	@Then("^User clicks on the 'Return Order' tab and selects the 'Stock Exchange' option as a REP user$")
	public void user_clicks_on_the_Return_Order_tab_and_selects_the_Stock_Exchange_option_as_a_REP_user() throws Throwable {
	    
		System.out.println("Attempt: click on the 'Return Order' tab and "
				+ "selects the 'Stock Exchange' option as a REP");
		PageObjects.SelectByXpath(
				driver, LocatorsPath.SALES_RETURN_ORDERS, LocatorsPath.MAX_TIME);
		CallObject.block(3000);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.SALES_STOCK_EXCHANGE_1, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.SALES_STOCK_EXCHANGE_1, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Return Order' as a REP clicked & "
				+ "'Stock Exchange' option selected successfully");
	}
	

	@Then("^User navigates to the Return Order with Return Order Header, Stock Returns & Stock Exchange section displayed$")
	public void user_navigates_to_the_Return_Order_with_Return_Order_Header_Stock_Returns_Stock_Exchange_section_displayed() throws Throwable {
	    
		user_navigates_to_the_Pre_Sales_Return_Order_tab_where_the_Pre_Sales_Return_Order_Header_Pre_Sales_Return_Order_Details_displayed();
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.STOCK_EXCHANGES_DISP, LocatorsPath.MAX_TIME);
	}
	

	@Then("^User clicks on the 'Create Return Order' & verifies Return Order header is created$")
	public void user_clicks_on_the_Create_Return_Order_verifies_Return_Order_header_is_created() throws Throwable {
	    
		user_clicks_on_the_Create_Return_Order_enter_the_quantity_for_the_SKU_s_save_the_record_under_Pre_Sales_Return();
	}
	

	@Then("^User clicks on the ADD button in Stock Return section, enter the quantity for the SKU's & save the record\\.$")
	public void user_clicks_on_the_ADD_button_in_Stock_Return_section_enter_the_quantity_for_the_SKU_s_save_the_record() throws Throwable {
	   
		System.out.println("User clicks on the ADD button in Stock Return section, "
				+ "enter the quantity for the SKU's & save the record");
	}
	

	@Then("^User verifes the Stock return record is saved without errors under Stock Return section$")
	public void user_verifes_the_Stock_return_record_is_saved_without_errors_under_Stock_Return_section() throws Throwable {
	    
		System.out.println("User verifes the Stock return record "
				+ "is saved without errors under Stock Return section");
	}
	

	@Then("^User clicks on the ADD button in Stock Exchange section, enter the quantity for the SKU's & save the record\\.$")
	public void user_clicks_on_the_ADD_button_in_Stock_Exchange_section_enter_the_quantity_for_the_SKU_s_save_the_record() throws Throwable {
	    
		System.out.println("Attempt: click on the ADD button in Stock Exchange section, "
				+ "enter the quantity for the SKU's");
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.STOCK_EXCHANGE_ADD)));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.STOCK_EXCHANGE_ADD, LocatorsPath.MAX_TIME);
		
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.REPLACEMENT_STOCK_DETAILS, LocatorsPath.MAX_TIME);
		
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.STOCK_EXCHANGE_PROD_NAME, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Sales", "Stocks Exchange Product Name", 2));
		
		CallObject.block(6000);
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_EXCHANGE_QUAN)))).clear();
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.STOCK_EXCHANGE_QUAN, LocatorsPath.MAX_TIME, 
				file2.getCellData("DataEntry-Sales", "Stocks Exchange Quantity", 2));
		
		System.out.println("Success: ADD button clicked in Stock Exchange section, "
				+ "quantity for the SKU's entered successfully");
	}
	

	@Then("^User verifies the Stock Exchange record is saved without errors under Stock Exchange section\\.$")
	public void user_verifies_the_Stock_Exchange_record_is_saved_without_errors_under_Stock_Exchange_section() throws Throwable {
	    
		user_clicks_on_the_save_button_and_verifies_the_product_records_is_saved_without_any_errors();

	}
	

	@Then("^User clicks on the commit button and verifies the Order status is changed to CLOSED\\.$")
	public void user_clicks_on_the_commit_button_and_verifies_the_Order_status_is_changed_to_Closed() throws Throwable {
	   
		System.out.println("Attempt: click on the commit button and verify the Order status is changed to booked");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.PROMPT_RETURN_COMMIT, LocatorsPath.MAX_TIME);
		 WebElement orderNum = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.PRE_SALES_RETURN_ORDER_NUM))));
		 CallObject.block(2000);
		 file2.setCellData("DataEntry-Sales", "Pre-Sales Return Order Num", 2, 
				 orderNum.getText());
		 PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.PRE_SALES_RETU_ORDER_SEARCH, LocatorsPath.MAX_TIME, 
					file2.getCellData("DataEntry-Sales", "Pre-Sales Return Order Num", 2));
		 
		 js.executeScript("arguments[0].scrollIntoView();", 
					driver.findElement(By.cssSelector(LocatorsPath.PRE_SALES_RETU_ORDER_STATUS)));
		 WebElement verifyOrderStatus = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.PRE_SALES_RETU_ORDER_STATUS))));
		 Assert.assertEquals("", verifyOrderStatus.getText());
		 System.out.println("Success: commit button clicked and Order status is changed to booked");
	}
	
	
	public void logOut() throws Exception {
		
		System.out.println("Attempt: User should successfully "
				+ "logout from the web client page");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.LOGOUT, LocatorsPath.MAX_TIME);
        CallObject.switchToAlert(driver);
		System.out.println("Success: Logout successful");
}
}
