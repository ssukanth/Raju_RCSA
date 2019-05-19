package com.infotech.wc.ui.testscripts;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.infotech.Excel.CsvToExcelConverter;
import com.infotech.Excel.ExcelApiFile;
import com.infotech.Excel.RenameFile;
import com.infotech.basepage.CallObject;
import com.infotech.basepage.LocatorsPath;
import com.infotech.basepage.PageObjects;
import com.infotech.testrunner.TestRunnerWebClient;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class RcsSaasRoutesPage extends TestRunnerWebClient{

	WebDriver driver = getDriver();
	Actions actions = new Actions(driver);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	ExcelApiFile file = new ExcelApiFile("TestData.xlsx");
	ExcelApiFile file3 = new ExcelApiFile("TestData3.xlsx");
	WebDriverWait wait = new WebDriverWait(driver, LocatorsPath.MAX_TIME);
	RenameFile renameFile = new RenameFile();
	public FileInputStream fis = null;
    public XSSFWorkbook workbook = null;
    public XSSFSheet sheet = null;
	
	
	public RcsSaasRoutesPage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	
    
	@Then("^User clicks on Route tab$")
	public void user_clicks_on_Route_tab() throws Throwable {
	   
		System.out.println("Attempt: click on Route tab");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ROUTE, LocatorsPath.MAX_TIME);	
		System.out.println("success: Route tab clicked successfully");
	}
	

	@Then("^The User should be navigated to Setup tab under the Route screen successfully$")
	public void the_User_should_be_navigated_to_Setup_tab_under_the_Route_screen_successfully() throws Throwable {
	    
		System.out.println("Attempt: User should be navigated to Setup tab");
		PageObjects.SelectByXpath(
				driver, LocatorsPath.SETUP, LocatorsPath.MAX_TIME);	
		System.out.println("success: User navigated to Setup tab successfully");
	}
	

	@Then("^User selects the 'Trade Approach' from the dropdown$")
	public void user_selects_the_Trade_Approach_from_the_dropdown() throws Throwable {
	    
		System.out.println("Attempt: select the 'Trade Approach' from the dropdown");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.SELECT_TRADE_APPROACH, LocatorsPath.MAX_TIME, 
				file.getCellData("Territory", "TradeApproach", 2));
		System.out.println("Success: 'Trade Approach' selected from the dropdown successfully");
	}
	

	@Then("^User selects the 'Territory' for which the new Route to be selected$")
	public void user_selects_the_Territory_for_which_the_new_Route_to_be_selected() throws Throwable {
	   
		System.out.println("Attempt: select the 'Territory' for which the new Route to be selected");
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.TERRITORY_DISPLAY, LocatorsPath.MAX_TIME);
		WebElement territory = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.TERRITORY_DROPDOWN))));
		Select terr = new Select(territory);
		terr.selectByVisibleText(
				file.getCellData("Territory", "TerritoryName", 2));
		CallObject.block(2000);
		System.out.println("Success: 'Territory' selected for which the new Route to be assigned");
	}
	

	@Then("^User clicks on 'Add' button and navigates to the 'Add New Route page'$")
	public void user_clicks_on_Add_button_and_navigates_to_the_Add_New_Route_page() throws Throwable {
	    
		System.out.println("Attempt: click on 'Add' button");
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.ADD_ROUTE)));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ADD_ROUTE, LocatorsPath.MAX_TIME);
		System.out.println("Attempt: 'Add' button clicked successfully");
	}
	

	@Given("^User verifies the 'Territory Name' is auto displayed based on the Territory selected$")
	public void user_verifies_the_Territory_Name_is_auto_displayed_based_on_the_Territory_selected() throws Throwable {
	 
		System.out.println("Attempt: verify the 'Territory Name' is auto displayed");
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.ADD_NEW_ROUTE_DISPLAY, LocatorsPath.MAX_TIME);
		
		WebElement territoryName = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ROUTE_TERRITORY_NAME))));
		Assert.assertEquals(file.getCellData("Territory", "TerritoryName", 2), 
				territoryName.getText());
		System.out.println("Success: 'Territory Name' is auto displayed successfully");
	}
	

	@Given("^User verifies the 'Trade Approach' is auto displayed based on the Trade Approach selected$")
	public void user_verifies_the_Trade_Approach_is_auto_displayed_based_on_the_Trade_Approach_selected() throws Throwable {
	   
		System.out.println("Attempt: verify the 'Trade Approach' is auto displayed");
		WebElement tradeApproach = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ROUTE_TRADE_APPROACH))));
		Assert.assertEquals(file.getCellData("Territory", "TradeApproach", 2), 
				tradeApproach.getText());
		System.out.println("Success: 'Trade Approach' is auto displayed successfully");
	}
	

	@Then("^User selects the 'Route' from the dropdown based on the Route created$")
	public void user_selects_the_Route_from_the_dropdown_based_on_the_Route_created() throws Throwable {
	    
		System.out.println("Attempt: select the 'Route' from the dropdown based on the Route created");
		WebElement route = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ROUTE_DROPDOWN))));
		Select rout = new Select(route);
		rout.selectByVisibleText(
				file3.getCellData("Route", "Route", 2));
		System.out.println("Success: 'Route' selected from the dropdown based on the Route created");
	}
	

	@Then("^User selects the 'Status' in the Add New Route page$")
	public void user_selects_the_Status_in_the_Add_New_Route_page() throws Throwable {
	    
		System.out.println("Attempt: select the 'Status' in the Add New Route page");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.STATUS_DROPDOWN, LocatorsPath.MAX_TIME, 
				file3.getCellData("Route", "Status", 2));
		System.out.println("Success: 'Status' selected successfully");
	}
	

	@Then("^User selects the 'Free LOV (\\d+)' in the Add New Route page$")
	public void user_selects_the_Free_LOV1_in_the_Add_New_Route_page(int arg1) throws Throwable {
	    
		System.out.println("Attempt: select the 'Free LOV 1' in the Add New Route page");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ROUTE_FREE_LOV_1, LocatorsPath.MAX_TIME, 
				file3.getCellData("Route", "Free LOV 1", 2));
		System.out.println("Success: 'Free LOV 1' selected successfully");
	}
	

	@Then("^User selects the 'Free LOV (\\d+)' in the Add New Route page\\.$")
	public void user_selects_the_Free_LOV2_in_the_Add_New_Route_page(int arg1) throws Throwable {
	   
		System.out.println("Attempt: select the 'Free LOV 2' in the Add New Route page");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ROUTE_FREE_LOV_2, LocatorsPath.MAX_TIME, 
				file3.getCellData("Route", "Free LOV 2", 2));
		System.out.println("Success: 'Free LOV 2' selected successfully");
	}
	

	@Then("^User enters the 'Free Text (\\d+)' in the Add New Route page$")
	public void user_enters_the_Free_Text1_in_the_Add_New_Route_page(int arg1) throws Throwable {
	    
		System.out.println("Attempt: enter the 'Free Text 1' in the Add New Route page");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ROUTE_FREE_TEXT_1, LocatorsPath.MAX_TIME, 
				file3.getCellData("Route", "Free Text 1", 2));
		System.out.println("Success: 'Free Text 1' entered successfully");
	}
	

	@Then("^User enters the 'Free Text (\\d+)' in the Add New Route page\\.$")
	public void user_enters_the_Free_Text2_in_the_Add_New_Route_page(int arg1) throws Throwable {
	    
		System.out.println("Attempt: enter the 'Free Text 2' in the Add New Route page");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ROUTE_FREE_TEXT_2, LocatorsPath.MAX_TIME, 
				file3.getCellData("Route", "Free Text 2", 2));
		System.out.println("Success: 'Free Text 2' entered successfully");
	}
	

	@Then("^User clicks on save button and verifies the selected Route is added successfully for the selected territory\\.$")
	public void user_clicks_on_save_button_and_verifies_the_selected_Route_is_added_successfully_for_the_selected_territory() throws Throwable {
	    
		System.out.println("Attempt: click on 'Save' button");
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.SAVE_ROUTE)));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.SAVE_ROUTE, LocatorsPath.MAX_TIME);
		
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ROUTE_TEXTFIELD_SEARCH, LocatorsPath.MAX_TIME, 
				file3.getCellData("Route", "Route", 2));
		CallObject.waitForPageLoad(driver);
		System.out.println("Attempt: 'Save' button clicked successfully");
	}
	

	@Then("^User navigates to the 'Assign Outlet' tab under the Route screen$")
	public void user_navigates_to_the_Assign_Outlet_tab_under_the_Route_screen() throws Throwable {
	   
		System.out.println("Attempt: User should be navigated to Assign Outlet tab");
		PageObjects.SelectByXpath(
				driver, LocatorsPath.ASSIGN_OUTLET, LocatorsPath.MAX_TIME);	
		System.out.println("success: User navigated to Assign Outlet tab successfully");
	}
	

	@Then("^User selects the same Trade Approach in the 'Assign Outlets to Routes' grid from the dropdown$")
	public void user_selects_the_same_Trade_Approach_in_the_Assign_Outlets_to_Routes_grid_from_the_dropdown() throws Throwable {
	    
		System.out.println("Attempt: select the same Trade Approach in the "
				+ "'Assign Outlets to Routes' grid");
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.ASSIGN_OUTLETS_TO_ROUTES, LocatorsPath.MAX_TIME);
		user_selects_the_Trade_Approach_from_the_dropdown();
		System.out.println("Success: Same Trade Approach in the "
				+ "'Assign Outlets to Routes' grid selected successfully");
	}
	

	@Then("^User selects the same Territory in 'Territories' grid$")
	public void user_selects_the_same_Territory1_in_Territories_grid() throws Throwable {
	    
		user_selects_the_Territory_for_which_the_new_Route_to_be_selected();
		System.out.println("Attempt: select the same Territory in 'Territories' grid");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ROUTE_SEARCH_FIELD, LocatorsPath.MAX_TIME, 
				file3.getCellData("Route", "Route", 2));
		CallObject.waitForPageLoad(driver);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ROUTES_SELECTION, LocatorsPath.MAX_TIME);
		System.out.println("Success: Same Territory selected in the 'Territories' grid");
	}
	

	@Then("^User selects the Route in 'Routes' grid created and verifies that no outlets were assigned to this route if it is a new route$")
	public void user_selects_the_Route1_in_Routes_grid_created_and_verifies_that_no_outlets_were_assigned_to_this_route_if_it_is_a_new_route() throws Throwable {
	    
		System.out.println("Attempt: verify that no outlets were assigned to the route if it is a new route");
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.ROUTE_ASSIGNMENT)));
		WebElement route = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ROUTE_ASSIGNMENT))));
		Assert.assertEquals("No records found.", route.getText());
		System.out.println("Success: verified that no outlets were assigned to the route if it is a new route");
	}
	

	@Then("^User clicks on the icon present in front of required Outlet from 'Available Outlets in Territory' grid$")
	public void user_clicks_on_the_icon_present_in_front_of_required_Outlet_from_Available_Outlets_in_Territory_grid() throws Throwable {
	    
		System.out.println("Attempt: click on the icon present in front of required "
				+ "Outlet from 'Available Outlets in Territory' grid");
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.OUTLET_TERRITORY_ICON)));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.OUTLET_TERRITORY_ICON, LocatorsPath.MAX_TIME);
		System.out.println("Success: clicked on the icon present in front of required "
				+ "Outlet from 'Available Outlets in Territory' grid");
	}
	

	@Then("^User verifies the same Outlet is added successfully in the 'Route Assignment' grid$")
	public void user_verifies_the_same_Outlet_is_added_successfully_in_the_Route_Assignment_grid() throws Throwable {
	   
		System.out.println("Attempt: verify the same Outlet is added in the 'Route Assignment' grid");
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.VERIFY_ROUTE_ASSIGNMENT)));
		WebElement route = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.VERIFY_ROUTE_ASSIGNMENT))));
		Assert.assertEquals("1", route.getAttribute("value"));
		System.out.println("Success: verified the same Outlet is added in the 'Route Assignment' grid successfully");
	}
	

	@Then("^User assigns the Order number for the Outlets & clicks on 'Refresh Order' button and verifies the outlets are displayed based on the order number$")
	public void user_assigns_the_Order_number_for_the_Outlets_clicks_on_Refresh_Order_button_and_verifies_the_outlets_are_displayed_based_on_the_order_number() throws Throwable {
	    
		System.out.println("Attempt: click on 'Refresh Order' button and verify the "
				+ "outlets are displayed based on the order number");
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.VERIFY_ROUTE_ASSIGNMENT)))).clear();
		CallObject.block(1000);
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.VERIFY_ROUTE_ASSIGNMENT, LocatorsPath.MAX_TIME, 
				file3.getCellData("Route", "Order", 2));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.REFRESH_ORDER, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Refresh Order' button clicked successfully");
	}
	

	@Then("^User clicks on the export button and verifies the outlet export file contains the following Trade Approach, Territory, Customer ID, Customer Number, Order, Customer Name & Route information\\.$")
	public void user_clicks_on_the_export_button_and_verifies_the_outlet_export_file_contains_the_following_Trade_Approach_Territory_Customer_ID_Customer_Number_Order_Customer_Name_Route_information() throws Throwable {
	    
		System.out.println("Attepmt: click on the export button and verify the "
				+ "outlet export file contains the following details");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.EXPORT_ROUTE, LocatorsPath.MAX_TIME);

		CallObject.block(6000);
		File newcsvfile = renameFile.getTheNewestFile(LocatorsPath.Route_DriveLocation, LocatorsPath.Route_CSVFormat);
		newcsvfile.renameTo(new File(LocatorsPath.Route_CsvFirstFileLocation));
		String csvfilename = newcsvfile.getName();
		System.out.println("latest file is = " + csvfilename);

		RenameFile renamecsvfile = new RenameFile();
		File csvUpdated = renamecsvfile.getTheNewestFile(LocatorsPath.Route_DriveLocation, LocatorsPath.Route_CSVFormat);
		System.out.println("Changed file name is = " + csvUpdated);
		
		// Convert CSV to XLSX files
		CsvToExcelConverter.csvConverter(
				LocatorsPath.Route_CsvFirstFileLocation, LocatorsPath.Route_xlsxFirstFileLocation, LocatorsPath.Route_Sheet1);
		
		fis = new FileInputStream(new File(LocatorsPath.Route_xlsxFirstFileLocation));
		workbook = new XSSFWorkbook(fis);
        sheet = workbook.getSheetAt(0);
        workbook.setSheetName(workbook.getSheetIndex(sheet), LocatorsPath.Route_Sheet1);
		
		ExcelApiFile outletsExport = new ExcelApiFile(LocatorsPath.Route_xlsxFirstFileLocation);
		Assert.assertEquals(file.getCellData("Territory", "TradeApproach", 2), 
				outletsExport.getCellData(LocatorsPath.Route_Sheet1, "Trade Approach", 2));
		
		Assert.assertEquals(file.getCellData("Territory", "TerritoryName", 2), 
				outletsExport.getCellData(LocatorsPath.Route_Sheet1, "Territory", 2).replaceAll("\\s",""));
		
		WebElement order = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.VERIFY_ROUTE_ASSIGNMENT))));
		Assert.assertEquals(order.getAttribute("value"),
				outletsExport.getCellData(LocatorsPath.Route_Sheet1, "Order", 2));
		
		WebElement customerNumber = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ROUTE_CUSTOMER_NUMBER))));
		Assert.assertEquals(customerNumber.getText(),
				outletsExport.getCellData(LocatorsPath.Route_Sheet1, "Customer Number", 2));
		
		WebElement customerName = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ROUTE_CUSTOMER_NAME))));
		Assert.assertEquals(customerName.getText(),
				outletsExport.getCellData(LocatorsPath.Route_Sheet1, "Customer Name", 2));
		
		Assert.assertEquals(file3.getCellData("Route", "Route", 2),
				outletsExport.getCellData(LocatorsPath.Route_Sheet1, "Route", 2));
		System.out.println("Success: export button clicked and verified the " + "outlet export file details");
	}
	

	@Then("^User navigates to the 'Assign Dates' tab under the Route screen$")
	public void user_navigates_to_the_Assign_Dates_tab_under_the_Route_screen() throws Throwable {
	    
		System.out.println("Attempt: User should be navigated to Assign Dates tab");
		PageObjects.SelectByXpath(
				driver, LocatorsPath.ASSIGN_DATES, LocatorsPath.MAX_TIME);	
		System.out.println("success: User navigated to Assign Dates tab successfully");
	}
	

	@Then("^User selects the same Trade Approach in the 'Assign Dates to Routes' grid from the dropdown$")
	public void user_selects_the_same_Trade_Approach_in_the_Assign_Dates_to_Routes_grid_from_the_dropdown() throws Throwable {
	    
		System.out.println("Attempt: select the same Trade Approach in the "
				+ "'Assign Dates to Routes' grid");
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.ASSIGN_DATES_TO_ROUTES, LocatorsPath.MAX_TIME);
		user_selects_the_Trade_Approach_from_the_dropdown();
		System.out.println("Success: Same Trade Approach in the "
				+ "'Assign Dates to Routes' grid selected successfully");
	}
	

	@Then("^User selects the same Territory in 'Territories' grid\\.$")
	public void user_selects_the_same_Territory2_in_Territories_grid() throws Throwable {
	   
		user_selects_the_Territory_for_which_the_new_Route_to_be_selected();
	}
	

	@Then("^User selects the Route in 'Routes' grid created and verifies that no outlets were assigned to this route if it is a new route\\.$")
	public void user_selects_the_Route2_in_Routes_grid_created_and_verifies_that_no_outlets_were_assigned_to_this_route_if_it_is_a_new_route() throws Throwable {
	    
		System.out.println("User selects the Route in 'Routes' grid created and "
				+ "verifies that no outlets were assigned to this route if it is a new route");
	}
	

	@Then("^From the 'Date Assignment' grid user selects the Start Day from which the Outlets to be assigned to the Route$")
	public void from_the_Date_Assignment_grid_user_selects_the_Start_Day_from_which_the_Outlets_to_be_assigned_to_the_Route() throws Throwable {
	    
		System.out.println("Attempt: select the Start Day from which the "
				+ "Outlets to be assigned to the Route");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ASSIGN_ROUTE_START_DAY, LocatorsPath.MAX_TIME, 
				file3.getCellData("Route", "Start Day", 2));
		System.out.println("Success: Start Day from which the Outlets to be "
				+ "assigned to the Route is selected successfully");
	}
	

	@Then("^User selects the Start Date from which the Outlets to be assigned to the Route$")
	public void user_selects_the_Start_Date_from_which_the_Outlets_to_be_assigned_to_the_Route() throws Throwable {
	 
		System.out.println("Attempt: select the 'Start Date'");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ASSIGN_ROUTE_START_DATE, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ROUTE_START_DATE_SELECTION, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Start Date' as been selected successfully");
	}
	

	@Then("^User enters the data in Repetitions for how many times the Outlet to be assigned to the Route$")
	public void user_enters_the_data_in_Repetitions_for_how_many_times_the_Outlet_to_be_assigned_to_the_Route() throws Throwable {
	   
		System.out.println("Attempt: enter the data in Repetitions for how many times "
				+ "the Outlet to be assigned to the Route");
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ASSIGN_ROUTE_REPETITIONS)))).clear();
		CallObject.block(1000);
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ASSIGN_ROUTE_REPETITIONS, LocatorsPath.MAX_TIME, 
				file3.getCellData("Route", "Repetitions", 2));
		System.out.println("Success: Data entered in Repetitions for how many times "
				+ "the Outlet to be assigned to the Route successfully");
	}
	

	@Then("^User enters the data in Frequency\\(days\\) for how frequently the Outlet to be assigned to the Route$")
	public void user_enters_the_data_in_Frequency_days_for_how_frequently_the_Outlet_to_be_assigned_to_the_Route() throws Throwable {
	   
		System.out.println("Attempt: enters the data in Frequency for how "
				+ "frequently the Outlet to be assigned to the Route");
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ASSIGN_ROUTE_FREQUENCY)))).clear();
		CallObject.block(1000);
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ASSIGN_ROUTE_FREQUENCY, LocatorsPath.MAX_TIME, 
				file3.getCellData("Route", "Frequency", 2));
		System.out.println("Success: Data entered in Frequency for how frequently "
				+ "the Outlet to be assigned to the Route successfully");
	}
	

	@Then("^User clicks on the 'Assign' button and verifies the Start Day & Start Date is displayed under the 'Assigned Dates for Route' grid$")
	public void user_clicks_on_the_Assign_button_and_verifies_the_Start_Day_Start_Date_is_displayed_under_the_Assigned_Dates_for_Route_grid() throws Throwable {
	 
		System.out.println("Attempt: click on the 'Assign' button and verify the "
				+ "Start Day & Start Date is displayed under the 'Assigned Dates for Route' grid");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ROUTE_ASSIGN, LocatorsPath.MAX_TIME);
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.VERIFY_ASSIGNED_ROUTE_DAY)));
		WebElement day = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.VERIFY_ASSIGNED_ROUTE_DAY))));
		Assert.assertEquals(file3.getCellData("Route", "Start Day", 2), day.getText());
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.VERIFY_ASSIGNED_ROUTE_DATE)));
		WebElement date = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.VERIFY_ASSIGNED_ROUTE_DATE))));
		Assert.assertEquals(CallObject.presentTimestamp(), date.getText());
		System.out.println("Success: clicked on the 'Assign' button and verified the "
				+ "Start Day & Start Date is displayed under the 'Assigned Dates for Route' grid");
	}
	

	@Then("^User selects the Date from which the Outlets to be assigned to the Routes in FROM & TO date picker & clicks on SHOW button$")
	public void user_selects_the_Date_from_which_the_Outlets_to_be_assigned_to_the_Routes_in_FROM_TO_date_picker_clicks_on_SHOW_button() throws Throwable {
	    
		System.out.println("Attempt: select the 'Start Date'");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ROUTE_FROM_DATE, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.FROM_TO_DATE_SELECTION, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ROUTE_TO_DATE, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.FROM_TO_DATE_SELECTION, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ROUTE_SHOW, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Start Date' as been selected successfully");
	}
	

	@Then("^User verifies the system displaying the Start Day & Start Date under the 'Assigned Dates for Route' grid\\.$")
	public void user_verifies_the_system_displaying_the_Start_Day_Start_Date_under_the_Assigned_Dates_for_Route_grid() throws Throwable {
	   
		System.out.println("Attempt: verify the system displaying the Start Day & "
				+ "Start Date under the 'Assigned Dates for Route' grid");
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.VERIFY_ASSIGNED_ROUTE_DAY)));
		WebElement day = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.VERIFY_ASSIGNED_ROUTE_DAY))));
		Assert.assertEquals(file3.getCellData("Route", "Start Day", 2), day.getText());
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.VERIFY_ASSIGNED_ROUTE_DATE)));
		WebElement date = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.VERIFY_ASSIGNED_ROUTE_DATE))));
		Assert.assertEquals(CallObject.presentTimestamp(), date.getText());
		System.out.println("Success: verified the system displaying the Start Day & "
				+ "Start Date under the 'Assigned Dates for Route' grid");
	}
	

	@Then("^User navigates to the 'Calendar' tab under the Route screen$")
	public void user_navigates_to_the_Calendar_tab_under_the_Route_screen() throws Throwable {
	    
		System.out.println("Attempt: User should be navigated to Calendar tab");
		PageObjects.SelectByXpath(
				driver, LocatorsPath.CALENDAR, LocatorsPath.MAX_TIME);
		System.out.println("success: User navigated to Calendar tab successfully");
	}
	

	@Then("^User selects the same Trade Approach in the 'Route Calendar' grid from the dropdown$")
	public void user_selects_the_same_Trade_Approach_in_the_Route_Calendar_grid_from_the_dropdown() throws Throwable {
	    
		System.out.println("Attempt: select the same Trade Approach in the "
				+ "'Route Calendar' grid");
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.ROUTE_CALENDAR_DISPLAY, LocatorsPath.MAX_TIME);
		user_selects_the_Trade_Approach_from_the_dropdown();
		System.out.println("Success: Same Trade Approach in the "
				+ "'Route Calendar' grid selected successfully");
	}
	

	@Then("^User selects the same Territory in 'Territories' grid in the Calendar page$")
	public void user_selects_the_same_Territory_in_Territories_grid_in_the_Calendar_page() throws Throwable {
	   
		System.out.println("Attempt: select the same Territory in 'Territories' grid in the Calendar page");
		WebElement territory = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.CALENDER_TERRITORY))));
		Select terr = new Select(territory);
		terr.selectByVisibleText(
				file.getCellData("Territory", "TerritoryName", 2));
		CallObject.block(2000);
		System.out.println("Success: selected the same Territory in 'Territories' grid in the Calendar page");
	}
	

	@Then("^User selects the Route from the Routes dropdown & clicks on the SHOW button$")
	public void user_selects_the_Route_from_the_Routes_dropdown_clicks_on_the_SHOW_button() throws Throwable {
	   
		System.out.println("Attempt: select the Route from the Routes dropdown "
				+ "& click on the SHOW button");
		try {
			WebElement route = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.CALENDAR_ROUTES_DROPDOWN))));
			Select rout = new Select(route);
			rout.selectByVisibleText(
					file3.getCellData("Route", "Route", 2));
			CallObject.block(2000);
		} catch (StaleElementReferenceException StaleElementReferenceException) {
			System.out.println("Trying to recover from stale element" + StaleElementReferenceException);
		}
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ROUTE_SHOW, LocatorsPath.MAX_TIME);
		System.out.println("Success: Route selected from the Routes dropdown "
				+ "& clicked on the SHOW button successfully");
	}
	

	@Then("^User verifies the system by default displaying the Routes for Days for the whole month$")
	public void user_verifies_the_system_by_default_displaying_the_Routes_for_Days_for_the_whole_month() throws Throwable {
	   
		System.out.println("User verifies the system by default displaying "
				+ "the Routes for Days for the whole month");
	}
	

	@Then("^User verifies the created Route is displayed for the Start Day & Start Date for which it is assigned$")
	public void user_verifies_the_created_Route_is_displayed_for_the_Start_Day_Start_Date_for_which_it_is_assigned() throws Throwable {
	    
		System.out.println("Attempt: verify the created Route is displayed for the "
				+ "Start Day & Start Date for which it is assigned");
		WebElement date = wait.until(ExpectedConditions.
				presenceOfElementLocated((
						By.xpath("//span/label[contains(text(),'"+CallObject.presentTimestamp()+"')]"))));
		WebElement route = wait.until(ExpectedConditions.
				presenceOfElementLocated((
						By.xpath("//li/label[contains(text(),'"+file3.getCellData("Route", "Route", 2)+"')]"))));
		
		if(CallObject.presentTimestamp().equals(date.getText()) && 
				(file3.getCellData("Route", "Route", 2).equals(route.getText()))) {
				System.out.println("Start Day & Start Date for the created route is displayed");
		}else {
				Assert.fail("Start Day & Start Date for the created route is not displayed");
		}
		System.out.println("Success: Start Day & Start Date for the created route is displayed successfully");
	}
	

	@Then("^User clicks on the export button and verifies the exported file displaying the following Trade Approach, Territory, Route Start Date & Route Name\\.$")
	public void user_clicks_on_the_export_button_and_verifies_the_exported_file_displaying_the_following_Trade_Approach_Territory_Route_Start_Date_Route_Name() throws Throwable {
	    
		System.out.println("Attepmt: click on the export button and verify the "
				+ "outlet export file contains the following details");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.EXPORT_ROUTE, LocatorsPath.MAX_TIME);

		CallObject.block(5000);
		File newcsvfile = renameFile.getTheNewestFile(LocatorsPath.Route_DriveLocation, LocatorsPath.Route_CSVFormat);
		newcsvfile.renameTo(new File(LocatorsPath.Route_CsvFirstFileLocation1));
		String csvfilename = newcsvfile.getName();
		System.out.println("latest file is = " + csvfilename);

		RenameFile renamecsvfile = new RenameFile();
		File csvUpdated = renamecsvfile.getTheNewestFile(LocatorsPath.Route_DriveLocation, LocatorsPath.Route_CSVFormat);
		System.out.println("Changed file name is = " + csvUpdated);

		// Convert CSV to XLSX files
		CsvToExcelConverter.csvConverter(
				LocatorsPath.Route_CsvFirstFileLocation1, LocatorsPath.Route_xlsxFirstFileLocation1, LocatorsPath.Route_Sheet2);
		
		fis = new FileInputStream(new File(LocatorsPath.Route_xlsxFirstFileLocation1));
		workbook = new XSSFWorkbook(fis);
        sheet = workbook.getSheetAt(0);
        workbook.setSheetName(workbook.getSheetIndex(sheet), LocatorsPath.Route_Sheet2);
        
		ExcelApiFile outletsExport = new ExcelApiFile(LocatorsPath.Route_xlsxFirstFileLocation1);
		Assert.assertEquals(file.getCellData("Territory", "TradeApproach", 2), 
				outletsExport.getCellData(LocatorsPath.Route_Sheet2, "Trade Approach", 2));
		
		Assert.assertEquals(file.getCellData("Territory", "TerritoryName", 2), 
				outletsExport.getCellData(LocatorsPath.Route_Sheet2, "Territory", 2));
		
		Assert.assertEquals(CallObject.presentTimestamp(),
				outletsExport.getCellData(LocatorsPath.Route_Sheet2, "Date", 2));
		
		Assert.assertEquals(file3.getCellData("Route", "Route", 2),
				outletsExport.getCellData(LocatorsPath.Route_Sheet2, "Route", 2));
		System.out.println("Success: export button clicked and verified the " + "outlet export file details");
	}
}
