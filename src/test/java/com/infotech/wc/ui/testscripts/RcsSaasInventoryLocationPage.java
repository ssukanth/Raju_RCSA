package com.infotech.wc.ui.testscripts;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import com.infotech.Excel.ExcelApiFile;
import com.infotech.basepage.CallObject;
import com.infotech.basepage.LocatorsPath;
import com.infotech.basepage.PageObjects;
import com.infotech.testrunner.TestRunnerWebClient;

import cucumber.api.java.en.Then;

public class RcsSaasInventoryLocationPage extends TestRunnerWebClient{
	
	WebDriver driver = getDriver();
	ExcelApiFile file = new ExcelApiFile("TestData.xlsx");
	Actions actions = new Actions(driver);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	WebDriverWait wait = new WebDriverWait(driver, LocatorsPath.MAX_TIME);
	RcsSaasConfigurationUsersPage configurationPage = new RcsSaasConfigurationUsersPage();
	
	
	public RcsSaasInventoryLocationPage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	/**----------------------RCS SAAS InventoryLocation_WC--------------------------**/
	
	
	
	@Then("^User clicks on Inventory location$")
	public void click_on_Inventory_location() throws Throwable {
	    
		System.out.println("Attempt: Click on Inventory location Menu");
		PageObjects.SelectByXpath(
				driver, LocatorsPath.INVENTORY_LOCATION, LocatorsPath.MAX_TIME);
		System.out.println("Success: Inventory location Menu selected successfully");
	}
	

	@Then("^The User Navigates to 'Inventory location' screen and the existing Inventory locations should be displayed successfully$")
	public void navigate_to_Inventory_location_screen_and_the_existing_Inventory_locations_should_be_displayed_successfully() throws Throwable {
	    
		System.out.println("Attempt: Navigate to 'Inventory location' screen "
				+ "and the existing Inventory locations should be displayed");
		PageObjects.SelectByXpathWithoutClick(driver, 
				LocatorsPath.INVENTORY_LOCATION_DISPLAY, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Inventory location' screen and the "
				+ "existing Inventory locations displayed");
	}
	

	@Then("^User verifies the add button is enabed successfully$")
	public void verify_the_add_button_is_enabed_successfully() throws Throwable {
	   
		System.out.println("Verify the "
				+ "add button is enabed successfully");
	}
	

	@Then("^User clicks on the add button$")
	public void click_on_the_add_button() throws Throwable {
	    
		configurationPage.i_Click_on_Add_button();
	}
	

	@Then("^User verifies the Add Inventory Location screen as been displayed successfully$")
	public void verify_Add_Inventory_Location_screen_as_been_displayed_successfully() throws Throwable {
	    
		System.out.println("Attempt: Verify Add Inventory Location screen as been displayed");
		PageObjects.SelectByXpath(driver, 
				LocatorsPath.ADD_INVENTORY_LOCATION, LocatorsPath.MAX_TIME);
		System.out.println("Success: Add Inventory Location screen displayed");
	}
	

	@Then("^User enters the field - 'Inventory name'$")
	public void enter_the_field_Inventory_name() throws Throwable {
	    
		System.out.println("Attempt: Enter the field - 'Inventory name'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.INVENTORY_NAME, LocatorsPath.MAX_TIME, 
				CallObject.timestamp().concat("_InvName"));
		file.setCellData("InventoryLocation", "InventoryName", 2, 
				CallObject.timestamp().concat("_InvName"));
		System.out.println("Success: 'Inventory name' entered successfully");
	}
	

	@Then("^User enters the field - 'Route/Territory Code'$")
	public void enter_the_field_Route_Territory_Code() throws Throwable {
	    
		System.out.println("Attempt: Enter the field - 'Route/Territory Code'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.TERRITORY_CODE, LocatorsPath.MAX_TIME, 
				file.getCellData("InventoryLocation", "Route/Territory Code", 2));
		System.out.println("Success: 'Route/Territory Code' entered successfully");
	}
	

	@Then("^User selects the 'Employee - LOV' dropdown$")
	public void select_the_Employee_LOV_dropdown() throws Throwable {
	    
		System.out.println("Attempt: Select the 'Employee - LOV' dropdown");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.EMPLOYEE, LocatorsPath.MAX_TIME, 
				file.getCellData("Configuration", "EmployeeID", 2).concat("-")
				+file.getCellData("Configuration", "UserName", 2).concat(" ")
				+file.getCellData("Configuration", "FirstName", 2).concat(" ")
				+file.getCellData("Configuration", "LastName", 2));
		System.out.println("Success: 'Employee - LOV' dropdown selected successfully");
	}
	

	@Then("^User clicks on the Depot checkbox - should be checked only for Warehouse$")
	public void click_on_the_Depot_checkbox_checked_only_for_Warehouse() throws Throwable {
	    
		System.out.println("Attempt: Click on the Depot - checkbox");
		/*PageObjects.SelectByXpath(
				driver, LocatorsPath.DEPOT, LocatorsPath.MAX_TIME);*/
		System.out.println("Success: Depot - checkbox checked successfully");
	}
	

	@Then("^User clicks on the 'Integrated to ERP' checkbox - should be enabled only if the inventory location is a depot$")
	public void click_on_the_Integrated_to_ERP_checkbox_enabled_only_if_the_inventory_location_is_a_depot() throws Throwable {
	    
		System.out.println("Attempt: Click on the Integrated to ERP - checkbox");
		/*PageObjects.SelectByXpath(
				driver, INTEGRATED_ERP, LocatorsPath.MAX_TIME);*/
		System.out.println("Success: Integrated to ERP - checkbox checked successfully");
	}
	

	@Then("^User clicks on the 'Uses RCS(\\d+)' checkbox$")
	public void user_clicks_on_the_Uses_RCS_checkbox(int arg1) throws Throwable {

		System.out.println("Attempt: Click on the Integrated to ERP - checkbox");
		CallObject.block(2000);
		PageObjects.SelectByXpath(
				driver, LocatorsPath.INV_USES_RCS8, LocatorsPath.MAX_TIME);
		System.out.println("Success: Integrated to ERP - checkbox checked successfully");
	}
	
	
	@Then("^User selects the 'Type' as either - Van/Stock Point/ Supplier from the dropdown$")
	public void select_the_Type_either_Van_Stock_Point_Supplier_from_the_dropdown() throws Throwable {
	    
		System.out.println("Attempt: Select the 'Type' dropdown");
		/*PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.TYPE, LocatorsPath.MAX_TIME, 
				file.getCellData("InventoryLocation", "Type", 2));*/
		System.out.println("Success: 'Type' dropdown selected successfully");
	}
	

	@Then("^User selects the Parent Location dropdown - Mandatory for Van and Stock Point$")
	public void select_the_Parent_Location_dropdown_Mandatory_for_Van_and_Stock_Point() throws Throwable {
	 
		System.out.println("Attempt: Select the 'Parent Location' dropdown");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.PARENT_LOCATION, LocatorsPath.MAX_TIME, 
				file.getCellData("InventoryLocation", "Parent Location", 2));
		System.out.println("Success: 'Parent Location' dropdown selected successfully");
	}
	

	@Then("^User selects the 'Assortment plan' dropdown$")
	public void select_the_Assortment_plan_dropdown() throws Throwable {
	    
		System.out.println("Attempt: Select the 'Assortment plan' dropdown");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ASSORTMENT_LOCATION, LocatorsPath.MAX_TIME, 
				file.getCellData("InventoryLocation", "Assortment Plan", 2));
		System.out.println("Success: 'Assortment plan' dropdown selected successfully");
	}
	

	@Then("^User selects the 'Distributor Name This is mandatory for Rep' dropdown$")
	public void select_the_Distributor_Name_This_is_mandatory_for_Rep_dropdown() throws Throwable {
	    
		System.out.println("Attempt: Select the 'Distributor Name' dropdown");
		PageObjects.SelectByXpathWithSendKeys(
				driver, LocatorsPath.DISTRIBUTOR_NAME, LocatorsPath.MAX_TIME, 
				file.getCellData("InventoryLocation", "Distributor Name", 2));
		System.out.println("Success: 'Distributor Name' dropdown selected successfully");
	}
	

	@Then("^User selects the 'Status' dropdown for Inventory Location$")
	public void select_the_Status_dropdown_for_Inventory_Location() throws Throwable {
	    
		System.out.println("Attempt: Select the 'Status' dropDown");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.INVENTORY_STATUS, LocatorsPath.MAX_TIME, 
				file.getCellData("Configuration", "Status", 2));
		System.out.println("Success: 'Status' dropDown selected successfully");
	}
	

	@Then("^User enters the field - 'Address Line (\\d+)'$")
	public void enter_the_field_Address_Line(int arg1) throws Throwable {
	    
		System.out.println("Attempt: Enter the field - 'Address Line 1'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ADDRESS_LINE_1, LocatorsPath.MAX_TIME, 
				file.getCellData("InventoryLocation", "Address Line 1", 2));
		System.out.println("Success: 'Address Line 1' entered successfully");
	}
	

	@Then("^User enters the field - 'Address Line (\\d+)' - Optional$")
	public void enter_the_field_Address_Line_Optional(int arg1) throws Throwable {
	    
		System.out.println("Attempt: Enter the field - 'Address Line 2'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ADDRESS_LINE_2, LocatorsPath.MAX_TIME, 
				file.getCellData("InventoryLocation", "Address Line 2", 2));
		System.out.println("Success: 'Address Line 2' entered successfully");
	}
	

	@Then("^User selects the 'Country' dropdown for Inventory Location screen$")
	public void select_the_Country_dropdown_for_Inventory_Location_screen() throws Throwable {
	   
		System.out.println("Attempt: Select the 'Country' dropdown");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.COUNTRY, LocatorsPath.MAX_TIME, 
				file.getCellData("InventoryLocation", "Country", 2));
		System.out.println("Success: 'Country' dropdown selected successfully");
	}
	

	@Then("^User selects the 'County' dropdown$")
	public void select_the_County_dropdown() throws Throwable {
	   
		System.out.println("Attempt: Select the 'County' dropdown");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.COUNTY, LocatorsPath.MAX_TIME, 
				file.getCellData("InventoryLocation", "County", 2));
		System.out.println("Success: 'County' dropdown selected successfully");
	}
	

	@Then("^User selects the 'City' dropdown$")
	public void select_the_City_dropdown() throws Throwable {
	   
		System.out.println("Attempt: Select the 'City' dropdown");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.CITY, LocatorsPath.MAX_TIME, 
				file.getCellData("InventoryLocation", "City", 2));
		System.out.println("Success: 'City' dropdown selected successfully");
	}
	

	@Then("^User selects the 'Suburb' dropdown$")
	public void select_the_Suburb_dropdown() throws Throwable {
	  
		System.out.println("Attempt: Select the 'Suburb' dropdown");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.SUBURB, LocatorsPath.MAX_TIME, 
				file.getCellData("InventoryLocation", "Suburb", 2));
		System.out.println("Success: 'Suburb' dropdown selected successfully");
	}
	

	@Then("^User enters the field - 'Phone No\\.'$")
	public void enter_the_field_Phone_No() throws Throwable {
	    
		System.out.println("Attempt: Enter the field - 'Phone no'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.PHONE_NUMBER, LocatorsPath.MAX_TIME, 
				file.getCellData("InventoryLocation", "Phone No", 2));
		System.out.println("Success: 'Phone no' entered successfully");
	}
	

	@Then("^User enters the field - 'Mobile No\\.'$")
	public void enter_the_field_Mobile_No() throws Throwable {
	    
		System.out.println("Attempt: Enter the field - 'Mobile no'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.MOBILE_NUMBER, LocatorsPath.MAX_TIME, 
				file.getCellData("InventoryLocation", "Mobile No", 2));
		System.out.println("Success: 'Mobile no' entered successfully");
	}
	

	@Then("^User enters the field - 'Fax'$")
	public void enter_the_field_Fax() throws Throwable {
	  
		System.out.println("Attempt: Enter the field - 'Fax'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.FAX, LocatorsPath.MAX_TIME, 
				file.getCellData("InventoryLocation", "FAX", 2));
		System.out.println("Success: 'Fax' entered successfully");
	}

	
	@Then("^User enters the field - 'PIN'$")
	public void enter_the_field_PIN() throws Throwable {
	    
		System.out.println("Attempt: Enter the field - 'Pin'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.PIN, LocatorsPath.MAX_TIME, 
				file.getCellData("InventoryLocation", "PIN", 2));
		System.out.println("Success: 'Pin' entered successfully");
	}


	@Then("^User enters the field - 'E-mail'$")
	public void enter_the_field_E_mail() throws Throwable {
	    
		System.out.println("Attempt: Enter the field - 'Email'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.INV_EMAIL, LocatorsPath.MAX_TIME, 
				file.getCellData("InventoryLocation", "Email", 2));
		System.out.println("Success: 'Email' entered successfully");
	}

	
	@Then("^User clicks on Save button and verifies that the New Inventory Location is added successfully in the list$")
	public void finally_click_on_Save_button_and_verify_New_Inventory_Location_is_added_successfully_in_the_list() throws Throwable {
	    
		System.out.println("Attempt: click on Save button and verify that the"
				+ " New Inventory Location is added successfully in the list");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.RECORD_SAVE, LocatorsPath.MAX_TIME);
		System.out.println("Success: clicked on Save button and verified that"
				+ " the New Inventory Location is added successfully in the list");
	}
	

	
	/**----------------------RCS_SaaS_Delete_InventoryLocation_WC--------------------------**/
	
	
	
	@Then("^User verifies that selecting Cancel button, user should exit from the screen without the new Inventory Location created\\.$")
	public void also_Verify_selecting_Cancel_button_user_should_exit_from_the_screen_without_new_Inventory_Location_created() throws Throwable {
	    
		configurationPage.i_Click_on_Add_button();
		navigate_to_Inventory_location_screen_and_the_existing_Inventory_locations_should_be_displayed_successfully();
		
		System.out.println("Attempt: Click on Cancel button");
		CallObject.waitForPageLoad(driver);
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.CANCEL)));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.CANCEL, LocatorsPath.MAX_TIME);
		CallObject.switchToAlert(driver);
		System.out.println("Success: Cancel button selected successfully");
	}
	

	
	/**----------------------RCS_SaaS_Edit_InventoryLocation_WC--------------------------**/
	
	
	
	@Then("^User navigates to 'Inventory location' screen and verifies that the hyperlink of 'Name' is available$")
	public void navigate_to_Inventory_location_screen_and_verify_the_hyperlink_of_Name_is_available() throws Throwable {
	   
		System.out.println("Attempt: Search with user name in List of Inventory location screen");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.USER_NAME_SEARCH_FIELD, LocatorsPath.MAX_TIME, 
				file.getCellData("InventoryLocation", "InventoryName", 2));
		System.out.println("Success: user name in List of Inventory location screen is found successfully");
	}
	

	@Then("^User clicks on the Hyper Link of 'Name' field and verifies that the 'Edit Inventory location' screen is displayed$")
	public void click_on_the_Hyper_Link_of_Name_field_and_verify_Edit_Inventory_location_screen_is_displayed() throws Throwable {
	   
		System.out.println("Attempt: Click on the Hyper Link of 'Name' field");
		CallObject.waitForPageLoad(driver);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.SELECT_FIRST_NAME, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Name' field is selected successfully");
	}
	

	@Then("^User updates few fields$")
	public void update_few_fields() throws Throwable {
	    
		System.out.println("Attempt: Select the 'Type' dropdown");
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.TERRITORY_CODE)))).clear();
		CallObject.block(2000);
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.TERRITORY_CODE, LocatorsPath.MAX_TIME, 
				file.getCellData("InventoryLocation", "Route/Territory Code", 3));
		System.out.println("Success: 'Type' dropdown selected successfully");
	}
	

	@Then("^User clicks on save button and verifies 'Inventory location' details updated successfully in the list\\.$")
	public void click_on_save_button_and_verify_Inventory_location_details_updated_successfully_in_the_list() throws Throwable {
	  
		finally_click_on_Save_button_and_verify_New_Inventory_Location_is_added_successfully_in_the_list();
	}
	

	
	/**----------------------RCS_SaaS_Navigation_InventoryLocation_WC--------------------------**/
	
	
	
	@Then("^User navigates to 'Inventory location' screen and selects an inventory location from the top grid$")
	public void navigate_to_Inventory_location_screen_and_select_an_inventory_location_from_the_top_grid() throws Throwable {
	  
		System.out.println("Attempt: Navigate to 'Inventory location' screen"
				+ " and select an inventory location from the top grid");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.USER_NAME_SEARCH_FIELD, LocatorsPath.MAX_TIME, 
				file.getCellData("InventoryLocation", "InventoryName", 2));
		CallObject.block(2000);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.SELECT_INVENTORY_LOC, LocatorsPath.MAX_TIME);
		System.out.println("Success: inventory location from the top grid selected successfully");
	}
	

	@Then("^User verifies the Inventory Levels of the selected location displayed in the bottom grid\\.$")
	public void verify_the_Inventory_Levels_of_the_selected_location_must_be_displayed_in_the_bottom_grid() throws Throwable {
	  
		System.out.println("Attempt: Verify the Inventory Levels of the selected location");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.INVENTORY_LEVELS_GRID, LocatorsPath.MAX_TIME);
		System.out.println("Success: Verify the Inventory Levels of the selected location");
	}
	

	
	/**----------------------RCS_SaaS_Verification_InventoryLocation_WC--------------------------**/
	
	
	
	@Then("^User Verifies the following Column - Product is present in the Inventory Levels$")
	public void user_Verifies_the_following_Column_Product_is_present_in_the_Inventory_Levels() throws Throwable {
	    
		System.out.println("Attempt: Verify the following field - Product is present in the list");
		try {
			WebElement element = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.xpath(LocatorsPath.INV_PRODUCT))));
		    Assert.assertEquals("Product", element.getText());
		    } catch (ElementNotFoundException e) {
		    	Assert.fail("Element Not Found" +e);
		    }
		System.out.println("Success: Product is present in the list");
	}

	
	@Then("^User Verifies the following Column - Unit of measure is present in the Inventory Levels$")
	public void user_Verifies_the_following_Column_Unit_of_measure_is_present_in_the_Inventory_Levels() throws Throwable {
	    
		System.out.println("Attempt: Verify the following field - Unit Of Measure is present in the list");
		try {
			WebElement element = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.xpath(LocatorsPath.INV_UNIT_OF_MEASURE))));
		    Assert.assertEquals("Unit Of Measure", element.getText());
		    } catch (ElementNotFoundException e) {
		    	Assert.fail("Element Not Found" +e);
		    }
		System.out.println("Success: Unit Of Measure is present in the list");
	}
	

	@Then("^User Verifies the following Column - Total stock is present in the Inventory Levels$")
	public void user_Verifies_the_following_Column_Total_stock_is_present_in_the_Inventory_Levels() throws Throwable {
	    
		System.out.println("Attempt: Verify the following field - Product is present in the list");
		try {
			WebElement element = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.xpath(LocatorsPath.INV_TOTAL_STOCK))));
		    Assert.assertEquals("Total stock", element.getText());
		    } catch (ElementNotFoundException e) {
		    	Assert.fail("Element Not Found" +e);
		    }
		System.out.println("Success: Product is present in the list");
	}
	

	@Then("^User Verifies the following Column - Saleable Quanty is present in the Inventory Levels$")
	public void user_Verifies_the_following_Column_Saleable_Quanty_is_present_in_the_Inventory_Levels() throws Throwable {
	 
		System.out.println("Attempt: Verify the following field - Product is present in the list");
		try {
			WebElement element = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.xpath(LocatorsPath.SALEABLE_QUANTITY))));
		    Assert.assertEquals("Saleable Quantity", element.getText());
		    } catch (ElementNotFoundException e) {
		    	Assert.fail("Element Not Found" +e);
		    }
		System.out.println("Success: Product is present in the list");
	}

	
	@Then("^User Verifies the following Column - Unsaleable Quantity is present in the Inventory Levels$")
	public void user_Verifies_the_following_Column_Unsaleable_Quantity_is_present_in_the_Inventory_Levels() throws Throwable {
	   
		System.out.println("Attempt: Verify the following field - Product is present in the list");
		try {
			WebElement element = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.xpath(LocatorsPath.UNSALEABLE_QUANTITY))));
		    Assert.assertEquals("Unsaleable Quantity", element.getText());
		    } catch (ElementNotFoundException e) {
		    	Assert.fail("Element Not Found" +e);
		    }
		System.out.println("Success: Product is present in the list");
	}
	

	@Then("^User Verifies the following Column - Saleable Stock in Transit is present in the Inventory Levels$")
	public void user_Verifies_the_following_Column_Saleable_Stock_in_Transit_is_present_in_the_Inventory_Levels() throws Throwable {
	    
		System.out.println("Attempt: Verify the following field - Product is present in the list");
		try {
			WebElement element = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.xpath(LocatorsPath.SALEABLE_STOCK_TRANSIT))));
		    Assert.assertEquals("Saleable Stock in transit", element.getText());
		    } catch (ElementNotFoundException e) {
		    	Assert.fail("Element Not Found" +e);
		    }
		System.out.println("Success: Product is present in the list");
	}
	

	@Then("^User Verifies the following Column - Saleable Lost in Transit is present in the Inventory Levels$")
	public void user_Verifies_the_following_Column_Saleable_Lost_in_Transit_is_present_in_the_Inventory_Levels() throws Throwable {
	    
		System.out.println("Attempt: Verify the following field - Product is present in the list");
		try {
			WebElement element = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.xpath(LocatorsPath.SALEABLE_LOST_TRANSIT))));
		    Assert.assertEquals("saleable lost in transit", element.getText());
		    } catch (ElementNotFoundException e) {
		    	Assert.fail("Element Not Found" +e);
		    }
		System.out.println("Success: Product is present in the list");
	}
	

	@Then("^User Verifies the following Column - Unsaleable stock in Transit is present in the Inventory Levels$")
	public void user_Verifies_the_following_Column_Unsaleable_stock_in_Transit_is_present_in_the_Inventory_Levels() throws Throwable {
	 
		System.out.println("Attempt: Verify the following field - Product is present in the list");
		try {
			WebElement element = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.xpath(LocatorsPath.UNSALEABLE_STOCK_TRANSIT))));
		    Assert.assertEquals("Unsaleable Stock in transit", element.getText());
		    } catch (ElementNotFoundException e) {
		    	Assert.fail("Element Not Found" +e);
		    }
		System.out.println("Success: Product is present in the list");
	}
	

	@Then("^User Verifies the following Column - Unsaleable lost in transit is present in the Inventory Levels$")
	public void user_Verifies_the_following_Column_Unsaleable_lost_in_transit_is_present_in_the_Inventory_Levels() throws Throwable {
	    
		System.out.println("Attempt: Verify the following field - Product is present in the list");
		try {
			WebElement element = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.xpath(LocatorsPath.UNSALEABLE_LOST_TRANSIT))));
		    Assert.assertEquals("Unsaleable lost in transit", element.getText());
		    } catch (ElementNotFoundException e) {
		    	Assert.fail("Element Not Found" +e);
		    }
		System.out.println("Success: Product is present in the list");
	}
	
	
	
	/**----------------------RCS_SaaS_Create_InventoryLocation_External_Supplier--------------------------**/
	
	
	
	@Then("^User clicks on the 'Add' button at the  bottom of  the 'Inventory Locations' grid$")
	public void click_on_the_Add_button_at_the_bottom_of_the_Inventory_Locations_grid() throws Throwable {
	   
		configurationPage.i_Click_on_Add_button();
	}
	

	@Then("^User verifies the 'Add Inventory Location' screen displayed successfully$")
	public void the_Add_Inventory_Location_screen_should_display() throws Throwable {
	    
		navigate_to_Inventory_location_screen_and_the_existing_Inventory_locations_should_be_displayed_successfully();
	}
	

	@Then("^User enters the 'Inventory name' field as 'ExternalSupplier_INV'$")
	public void enter_the_field_Inventory_name_as_ExternalSupplier_INV() throws Throwable {
	    
		System.out.println("Attempt: Enter the field - 'Inventory name'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.INVENTORY_NAME, LocatorsPath.MAX_TIME, 
				CallObject.timestamp().concat("_ExternalSup_inv"));
		file.setCellData("InventoryLocation", "InventoryName", 3, 
				CallObject.timestamp().concat("_ExternalSup_inv"));
		System.out.println("Success: 'Inventory name' entered successfully");
	}
	

	@Then("^User selects the 'Employee - LOV' dropdown as 'Null'$")
	public void select_the_Employee_LOV_dropdown_as_Null() throws Throwable {
	    
		System.out.println("^Select the 'Employee - LOV' "
				+ "dropdown as 'Null'");
	}

	
	@Then("^User selects the 'Depot' as Unchecked$")
	public void select_the_Depot_as_Unchecked() throws Throwable {
	    
		System.out.println("^Select the 'Depot' "
				+ "as Unchecked");
	}

	
	@Then("^User selects the Parent Location dropdown as 'Null'$")
	public void select_the_Parent_Location_dropdown_as_Null() throws Throwable {
	   
		System.out.println("^Select the Parent "
				+ "Location dropdown as 'Null'");
	}
	

	@Then("^User selects the 'Status' dropdown as 'Active'$")
	public void select_the_Status_dropdown_as_Active() throws Throwable {
	    
		select_the_Status_dropdown_for_Inventory_Location();
	}
	

	@Then("^User selects the 'Type' as 'Supplier' from the dropdown$")
	public void select_the_Type_as_Supplier_from_the_dropdown() throws Throwable {
	   
		System.out.println("Attempt: Select the 'Type' dropdown");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.TYPE, LocatorsPath.MAX_TIME, 
				file.getCellData("InventoryLocation", "Type", 4));
		System.out.println("Success: 'Type' dropdown selected successfully");
	}
	

	@Then("^User clicks on Save button and verifies that the admin is successfully navigated to 'Inventory Locations' screen and the record is visible in the view\\.$")
	public void finally_click_on_Save_button_and_verify_the_admin_should_be_successfully_navigated_to_the_Inventory_Locations_screen_and_the_record_should_be_visible_in_the_view() throws Throwable {
	   
		finally_click_on_Save_button_and_verify_New_Inventory_Location_is_added_successfully_in_the_list();
		
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.USER_NAME_SEARCH_FIELD, LocatorsPath.MAX_TIME, 
				file.getCellData("InventoryLocation", "InventoryName", 3));
		CallObject.block(2000);
		WebElement invName = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INV_NAME_DISP))));
		org.testng.Assert.assertEquals(file.getCellData("InventoryLocation", "InventoryName", 3), 
				invName.getText());
	}
}
