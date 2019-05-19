package com.infotech.wc.ui.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
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
import cucumber.api.java.en.When;

public class RcsSaasDistributorsInventoryLevelPage extends TestRunnerWebClient{

	WebDriver driver = getDriver();
	Actions actions = new Actions(driver);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	ExcelApiFile file3 = new ExcelApiFile("TestData3.xlsx");
	WebDriverWait wait = new WebDriverWait(driver, LocatorsPath.MAX_TIME);
	
	
	public RcsSaasDistributorsInventoryLevelPage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	/**----------------------RCS_SaaS_Creation_Of_InventoryLevels_WC--------------------------**/
	
	
	
	@When("^User Provides the valid depo user credentials$")
	public void user_Provides_the_valid_depo_user_credentials() throws Throwable {
	    
		System.out.println("User Provides the valid depo user credentials");
	}
	

	@Then("^User selects the ' InventoryLevels' tab and navigates to the inventory levels screen$")
	public void user_selects_the_InventoryLevels_tab_and_navigates_to_the_inventory_levels_screen() throws Throwable {
	    
		System.out.println("Attempt: select the ' InventoryLevels' tab and navigate to the inventory levels screen");
		PageObjects.SelectByXpath(
				driver, LocatorsPath.INVENTORY_LEVEL, LocatorsPath.MAX_TIME);
		
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.INVENTORY_LOCATIONS_DISP, LocatorsPath.MAX_TIME);
		System.out.println("Success: selected the ' InventoryLevels' tab and navigated to the inventory levels screen");
	}
	

	@Then("^User verifies the 'Inventory location data' is displayed for the users reporting to the logged in user$")
	public void user_verifies_the_Inventory_location_data_is_displayed_for_the_users_reporting_to_the_logged_in_user() throws Throwable {
	    
		System.out.println("Attempt: verify the 'Inventory location data' "
				+ "is displayed for the users reporting to the logged in user");
		WebElement name = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INV_NAME))));
		Assert.assertEquals("Name", name.getText());
		
		WebElement territoryCode = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ROUTE_TERRITORY_CODE))));
		Assert.assertEquals("Route/Territory Code", territoryCode.getText());
		
		WebElement employee = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INV_EMPLOYEE))));
		Assert.assertEquals("Employee", employee.getText());
		
		WebElement parentLoc = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INV_PARENT_LOC))));
		Assert.assertEquals("Parent Location", parentLoc.getText());
		
		WebElement depot = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INV_DEPOT))));
		Assert.assertEquals("Depot", depot.getText());
		
		WebElement rcs8 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.USES_RCS8))));
		Assert.assertEquals("Uses RCS8", rcs8.getText());
		
		WebElement nameRep = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.DIS_NAME_REP))));
		Assert.assertEquals("Distributor Name This is mandatory for Rep", nameRep.getText());
		
		WebElement status = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INV_STATUS))));
		Assert.assertEquals("Status", status.getText());
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.INV_ADDRESS_LINE_1)));
		WebElement addressLine1 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INV_ADDRESS_LINE_1))));
		Assert.assertEquals("Address Line 1", addressLine1.getText());
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.INV_ADDRESS_LINE_2)));
		WebElement addressLine2 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INV_ADDRESS_LINE_2))));
		Assert.assertEquals("Address Line 2", addressLine2.getText());
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.INV_COUNTRY)));
		WebElement country = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INV_COUNTRY))));
		Assert.assertEquals("Country", country.getText());
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.INV_COUNTY)));
		WebElement county = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INV_COUNTY))));
		Assert.assertEquals("County", county.getText());
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.INV_CITY)));
		WebElement city = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INV_CITY))));
		Assert.assertEquals("City", city.getText());
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.INV_SUBURB)));
		WebElement suburb = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INV_SUBURB))));
		Assert.assertEquals("Suburb", suburb.getText());
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.INV_TELEPHONE)));
		WebElement telephone = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INV_TELEPHONE))));
		Assert.assertEquals("Telephone", telephone.getText());
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.INV_FAX)));
		WebElement fax = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INV_FAX))));
		Assert.assertEquals("Fax", fax.getText());
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.INV_PIN)));
		WebElement pin = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INV_PIN))));
		Assert.assertEquals("PIN", pin.getText());
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.INV_FREE_FIELD_1)));
		WebElement freeField1 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INV_FREE_FIELD_1))));
		Assert.assertEquals("Free Field 1", freeField1.getText());
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.INV_FREE_FIELD_2)));
		WebElement freeField2 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INV_FREE_FIELD_2))));
		Assert.assertEquals("Free Field 2", freeField2.getText());
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.INV_FREE_TEXT_FIELD_1)));
		WebElement freeTextField1 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INV_FREE_TEXT_FIELD_1))));
		Assert.assertEquals("Free Text Field 1", freeTextField1.getText());
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.INV_FREE_TEXT_FIELD_2)));
		WebElement freeTextField2 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INV_FREE_TEXT_FIELD_2))));
		Assert.assertEquals("Free Text Field 2", freeTextField2.getText());
		System.out.println("Success: verified the 'Inventory location data' "
				+ "is displayed for the users reporting to the logged in user");
	}
	

	@Then("^User verifies the 'Inventory Levels' displays the following Inventory details - Product, Unit of measure, Total Stock, Saleable quantity, UnSaleable quantity, Saleable stock in transit, Saleable lost in transit, unsaleable stock in transit & unsaleable lost in transit$")
	public void user_verifies_the_Inventory_Levels_displays_the_following_Inventory_details_Product_Unit_of_measure_Total_Stock_Saleable_quantity_UnSaleable_quantity_Saleable_stock_in_transit_Saleable_lost_in_transit_unsaleable_stock_in_transit_unsaleable_lost_in_transit() throws Throwable {
	    
		System.out.println("Attempt: verify the 'Inventory Levels' displays the following Inventory details - "
				+ "Product, Unit of measure, Total Stock, Saleable quantity, UnSaleable quantity, Saleable stock in transit, "
				+ "Saleable lost in transit, unsaleable stock in transit & unsaleable lost in transit");
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.xpath(LocatorsPath.INV_LEVELS_FOR)));
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.INV_LEVELS_FOR, LocatorsPath.MAX_TIME);
		
		WebElement product = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.DISTRIBUTOR_INV_PRODUCT))));
		Assert.assertEquals("Product", product.getText());
		
		WebElement unitMeasure = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.DISTRIBUTOR_INV_UNIT_OF_MEAS))));
		Assert.assertEquals("Unit Of Measure", unitMeasure.getText());
		
		WebElement totalStock = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.TOTAL_STOCK))));
		Assert.assertEquals("Total stock", totalStock.getText());
		
		WebElement saleableQty = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SALEABLE_QTY))));
		Assert.assertEquals("Saleable Quantity", saleableQty.getText());
		
		WebElement unSaleableQty = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.UNSALEABLE_QTY))));
		Assert.assertEquals("Unsaleable Quantity", unSaleableQty.getText());
		
		WebElement saleableStockTransit = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SALEABLE_STOCK_IN_TRANSIT))));
		Assert.assertEquals("Saleable Stock in transit", saleableStockTransit.getText());
		
		WebElement saleableLostTransit = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SALEABLE_LOST_IN_TRANSIT))));
		Assert.assertEquals("saleable lost in transit", saleableLostTransit.getText());
		
		WebElement unSaleableStockTransit = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.UNSALEABLE_STOCK_IN_TRANSIT))));
		Assert.assertEquals("Unsaleable Stock in transit", unSaleableStockTransit.getText());
		
		WebElement unSaleableLostTransit = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.UNSALEABLE_LOST_IN_TRANSIT))));
		Assert.assertEquals("Unsaleable lost in transit", unSaleableLostTransit.getText());
		
		System.out.println("Success: verified the 'Inventory Levels' displays the following Inventory details - "
				+ "Product, Unit of measure, Total Stock, Saleable quantity, UnSaleable quantity, Saleable stock in transit, "
				+ "Saleable lost in transit, unsaleable stock in transit & unsaleable lost in transit");
	}
	

	@Then("^User verifies the 'Stock load header' displays the following stock load records - Stock load number, Stock load date, Status$")
	public void user_verifies_the_Stock_load_header_displays_the_following_stock_load_records_Stock_load_number_Stock_load_date_Status() throws Throwable {
	    
		System.out.println("Attempt: verify the 'Stock load header' "
				+ "displays the following stock load records - Stock load number, Stock load date, Status");
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.xpath(LocatorsPath.STOCK_LOAD_HEADER_FOR)));
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.STOCK_LOAD_HEADER_FOR, LocatorsPath.MAX_TIME);
		
		WebElement stockLoadNum = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_LOAD_NUMBER))));
		Assert.assertEquals("Stock Load Number", stockLoadNum.getText());
		
		WebElement stockLoadDate = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_LOAD_DATE))));
		Assert.assertEquals("Stock Load Date", stockLoadDate.getText());
		
		WebElement stockLoadStatus = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_LOAD_STATUS))));
		Assert.assertEquals("Status", stockLoadStatus.getText());
		
		System.out.println("Success: verified the 'Stock load header' "
				+ "displays the following stock load records - Stock load number, Stock load date, Status");
	}
	

	@Then("^User verifies the 'Stock load' displays the following details - Product, Quantity, Unit of measure, Commit$")
	public void user_verifies_the_Stock_load_displays_the_following_details_Product_Quantity_Unit_of_measure_Commit() throws Throwable {
	 
		System.out.println("Attempt: verify the 'Stock load' displays "
				+ "the following details - Product, Quantity, Unit of measure, Commit");
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.xpath(LocatorsPath.STOCK_LOAD_FOR)));
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.STOCK_LOAD_FOR, LocatorsPath.MAX_TIME);
		
		WebElement stockLoadProd = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.DIST_INV_STOCK_LOAD_PRODUCT))));
		Assert.assertEquals("Product", stockLoadProd.getText());
		
		WebElement stockLoadQty = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.DIST_INV_STOCK_LOAD_QTY))));
		Assert.assertEquals("Quantity", stockLoadQty.getText());
		
		WebElement stockLoadUnitMeasure = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_LOAD_UNIT_OF_MEASURE))));
		Assert.assertEquals("Unit Of Measure", stockLoadUnitMeasure.getText());
		
		WebElement stockLoadCommit = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_LOAD_COMMIT))));
		Assert.assertEquals("Commit", stockLoadCommit.getText());
		
		System.out.println("Success: verified the 'Stock load' displays "
				+ "the following details - Product, Quantity, Unit of measure, Commit");
	}
	

	@Then("^User clicks on 'Add' button & navigates to the 'Add inventory locations' Screen\\.$")
	public void user_clicks_on_Add_button_navigates_to_the_Add_inventory_locations_Screen() throws Throwable {
	 
		System.out.println("Attempt: click on 'Add' button & "
				+ "navigate to the 'Add inventory locations' Screen");
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.INV_LOCATION_ADD)));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.INV_LOCATION_ADD, LocatorsPath.MAX_TIME);
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.ADD_INVENTORY_LOCATION, LocatorsPath.MAX_TIME);
		System.out.println("Success: clicked on 'Add' button & "
				+ "navigated to the 'Add inventory locations' Screen");
	}
	

	@Then("^User creates an new inventory location$")
	public void user_creates_an_new_inventory_location() throws Throwable {
	    
		System.out.println("Attempt: create an new inventory location");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ADD_INV_LOC_NAME, LocatorsPath.MAX_TIME, 
				CallObject.timestamp().concat("_Inv"));
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.ADD_INV_LOC_SAVE)));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ADD_INV_LOC_SAVE, LocatorsPath.MAX_TIME);
		System.out.println("Success: created an new inventory location");
	}
	

	@Then("^User clicks on 'Update inventory' button & verifies the Depo user inventory is updated with the transactions\\.$")
	public void user_clicks_on_Update_inventory_button_verifies_the_Depo_user_inventory_is_updated_with_the_transactions() throws Throwable {
	    
		System.out.println("Attempt: click on 'Update inventory' button & "
				+ "verify the Depo user inventory is updated with the transactions");
		PageObjects.SelectByXpath(
				driver, LocatorsPath.UPDATE_INVENTORY, LocatorsPath.MAX_TIME);
		
		WebElement update = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SUCCESS_MSG))));
		Assert.assertEquals("Inventory updated successfully", update.getText());
		System.out.println("Success: clicked on 'Update inventory' button & "
				+ "verified the Depo user inventory is updated with the transactions");
	}
}
