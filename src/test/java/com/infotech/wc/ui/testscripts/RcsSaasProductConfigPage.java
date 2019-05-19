package com.infotech.wc.ui.testscripts;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
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

public class RcsSaasProductConfigPage extends TestRunnerWebClient{

	WebDriver driver = getDriver();
	ExcelApiFile file1 = new ExcelApiFile("TestData1.xlsx");
	WebDriverWait wait = new WebDriverWait(driver, LocatorsPath.MAX_TIME);
	Actions actions = new Actions(driver);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	RcsSaasMerchandisingPage merchandisingPage = new RcsSaasMerchandisingPage();
	RcsSaasConfigurationUsersPage configurationPage = new RcsSaasConfigurationUsersPage();
	
	public RcsSaasProductConfigPage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	/**----------------------RCS SAAS ProductConfig_WC--------------------------**/
	
	
	
	@Then("^User selects 'LOV' tab$")
	public void user_selects_LOV_tab() throws Throwable {
	   
		System.out.println("Attempt: select 'LOV' tab");
		WebElement lov = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.PROD_LOV))));
		actions.moveToElement(lov).doubleClick().build().perform();
		System.out.println("Success: 'LOV' tab selected successfully");
	}
	

	@Then("^Selects 'LOV' type as 'SYSTEM'$")
	public void selects_LOV_type_as_SYSTEM() throws Throwable {
	   
		System.out.println("Attempt: select 'LOV' tab as 'SYSTEM'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.LOV_TYPE, LocatorsPath.MAX_TIME, 
				file1.getCellData("ProductConfig", "LOV Type", 2));
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.LOV_TYPE, LocatorsPath.MAX_TIME, 
				file1.getCellData("ProductConfig", "LOV Type", 2));
		System.out.println("Success: 'LOV' tab as 'SYSTEM' selected successfully");
	}
	

	@Then("^User searches for 'BATCFG' in Lookup sets table$")
	public void user_searches_for_BATCFG_in_Lookup_sets_table() throws Throwable {
	    
		System.out.println("Attempt: User searches for 'BATCFG' in Lookup sets table");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.PROD_SET_CODE, LocatorsPath.MAX_TIME, 
				file1.getCellData("ProductConfig", "Set Code", 2));
		CallObject.waitForPageLoad(driver);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.LOOK_UP, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'BATCFG' in Lookup sets table selected successfully");
	}
	

	@Then("^User searches for 'EPM' in Lookups Bat configuration table$")
	public void user_searches_for_EPM_in_Lookups_Bat_configuration_table() throws Throwable {
	   
		System.out.println("Attempt: User searches for 'EPM' in Lookups Bat configuration table");
		CallObject.waitForPageLoad(driver);
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.PROD_ITEM_CODE, LocatorsPath.MAX_TIME, 
				file1.getCellData("ProductConfig", "Item Code", 2));
		CallObject.waitForPageLoad(driver);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.SELECT_ITEM_CODE, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'EPM' in Lookups Bat configuration table selected successfully");
	}
	

	@Then("^User selects 'EPM' and updates the Description field as 'N'$")
	public void user_selects_EPM_and_updates_the_Description_field_as_N() throws Throwable {
	    
		System.out.println("Attempt: User selects for 'EPM' in Lookups Bat configuration table");
		wait.until(ExpectedConditions.
				presenceOfElementLocated(
						By.cssSelector(LocatorsPath.PROD_DESCRIPTION))).clear();
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.PROD_DESCRIPTION, LocatorsPath.MAX_TIME, 
				file1.getCellData("ProductConfig", "Description 1", 2));
		System.out.println("Success: 'EPM' in Lookups Bat configuration table selected successfully");
	}
	

	@Then("^User clicks on save button and refreshes the cache$")
	public void user_clicks_on_save_button_and_refreshes_the_cache() throws Throwable {
	   
		System.out.println("Attempt: Click on Save button");
		CallObject.waitForPageLoad(driver);
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.PROD_SAVE)));
        PageObjects.SelectByCSSSelector(
        		driver, LocatorsPath.PROD_SAVE, LocatorsPath.MAX_TIME);
        CallObject.waitForPageLoad(driver);
		
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.REFRESH_CACHE, LocatorsPath.MAX_TIME);
		
		CallObject.waitForPageLoad(driver);
		WebElement refresh = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.REFRESHED_LOV))));
		Assert.assertEquals("Refresh Lov completed Successfully", 
				refresh.getText());
		System.out.println("Success: Save button selected successfully");
	}
	

	@Then("^User clicks on 'Products' tab and navigates to Product screen$")
	public void user_clicks_on_Products_tab_and_navigates_to_Product_screen() throws Throwable {
	    
		System.out.println("Attempt: select 'Products' tab");
		WebElement product = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.PRODUCTS))));
		actions.moveToElement(product).doubleClick().build().perform();
		System.out.println("Success: 'Products' tab selected successfully");
	}
	

	@Then("^User verifies add button is not available in the product master$")
	public void user_verifies_add_button_is_not_available_in_the_product_master() throws Throwable {
	    
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.MASTER_PRODUCT_LIST, LocatorsPath.MAX_TIME);
		if(driver.getPageSource().contains("Add")) {
			CallObject.waitForPageLoad(driver);
			System.out.println("Element is Present");
			Assert.fail("Element is Present");
			}else{
			System.out.println("Success: Element is not present");
		}
	}
	

	@Then("^User selects any Product name from the list$")
	public void user_selects_any_Product_name_from_the_list() throws Throwable {
	   
		System.out.println("Attempt: select any Product name from the list");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.SELECT_PRODUCT_NAME, LocatorsPath.MAX_TIME);
		System.out.println("Success: Product name selected from the list successfully");
	}
	

	@Then("^Product details page is displayed and user should not be able to edit any of the fields for that product$")
	public void product_details_page_is_displayed_and_user_should_not_be_able_to_edit_any_of_the_fields_for_that_product() throws Throwable {
	    
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.EDIT_PRODUCTS, LocatorsPath.MAX_TIME);
		if(driver.getPageSource().contains("Save")){
			CallObject.waitForPageLoad(driver);
			System.out.println("Element is Present");
			Assert.fail("Element is Present");
			}else{
			System.out.println("Success: Element is not present");
		}
	}
	

	@Then("^User selects 'EPM' and updates the Description field as 'Y'$")
	public void user_selects_EPM_and_updates_the_Description_field_as_Y() throws Throwable {
	    
		System.out.println("Attempt: User selects for 'EPM' in Lookups Bat configuration table");
		wait.until(ExpectedConditions.
				presenceOfElementLocated(
						By.cssSelector(LocatorsPath.PROD_DESCRIPTION))).clear();
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.PROD_DESCRIPTION, LocatorsPath.MAX_TIME, 
				file1.getCellData("ProductConfig", "Description 2", 2));
		System.out.println("Success: 'EPM' in Lookups Bat configuration table selected successfully");
	}
	

	@Then("^User clicks on the Add button and the 'Add new Products' screen should open$")
	public void user_clicks_on_the_Add_button_and_the_Add_new_Products_screen_should_open() throws Throwable {
	  
		System.out.println("Attempt: User clicks on the Add button");
		CallObject.waitForPageLoad(driver);
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.PROD_ADD)));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.PROD_ADD, LocatorsPath.MAX_TIME);
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.ADD_NEW_PRODUCTS, LocatorsPath.MAX_TIME);
		System.out.println("Success: Add button selected successfully");
	}
	

	@Then("^User enters the 'Product name'$")
	public void user_enters_the_Product_name() throws Throwable {
	    
		System.out.println("Attempt: Enter 'Product name'");
		wait.until(ExpectedConditions.
				presenceOfElementLocated(
						By.cssSelector(LocatorsPath.PRODUCT_NAME))).clear();
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.PRODUCT_NAME, LocatorsPath.MAX_TIME, 
				CallObject.timestamp().concat("_ProductName"));
		file1.setCellData("ProductConfig", "Product Name", 2, 
				CallObject.timestamp().concat("_ProductName"));
		System.out.println("Success: 'Product name' entered successfully");
	}
	

	@Then("^User enters the 'Product Number'$")
	public void user_enters_the_Product_Number() throws Throwable {
	    
		System.out.println("Attempt: Enter 'Product Number'");
		wait.until(ExpectedConditions.
				presenceOfElementLocated(
						By.cssSelector(LocatorsPath.PRODUCT_NUMBER))).clear();
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.PRODUCT_NUMBER, LocatorsPath.MAX_TIME, 
				CallObject.timestamp().concat("_ProductNo"));
		file1.setCellData("ProductConfig", "Product Number", 2, 
				CallObject.timestamp().concat("_ProductNo"));
		System.out.println("Success: 'Product Number' entered successfully");
	}
	

	@Then("^User enters the 'Tar'$")
	public void user_enters_the_Tar() throws Throwable {
	    
		System.out.println("Attempt: Enter 'Tar'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.TAR, LocatorsPath.MAX_TIME, 
				file1.getCellData("ProductConfig", "Tar", 2));
		System.out.println("Success: 'Tar' entered successfully");
	}
	

	@Then("^User enters the 'Nicotine'$")
	public void user_enters_the_Nicotine() throws Throwable {
	   
		System.out.println("Attempt: Enter 'Nicotine'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.NICOTINE, LocatorsPath.MAX_TIME, 
				file1.getCellData("ProductConfig", "Nicotine", 2));
		System.out.println("Success: 'Nicotine' entered successfully");
	}
	

	@Then("^User selects 'Item Type' as 'Product'$")
	public void user_selects_Item_Type_as_Product() throws Throwable {
	    
		System.out.println("Attempt: select 'Item Type' as 'Product'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ITEM_TYPE, LocatorsPath.MAX_TIME, 
				file1.getCellData("ProductConfig", "Item Type", 4));
		System.out.println("Success: 'Item Type' as 'Product' selected successfully");
	}
	

	@Then("^User selects 'Manufacturer' as 'BAT'$")
	public void user_selects_Manufacturer_as_BAT() throws Throwable {
	   
		System.out.println("Attempt: select 'Manufacturer' as 'BAT'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.MANUFACTURER, LocatorsPath.MAX_TIME, 
				file1.getCellData("ProductConfig", "Manufacturer", 2));
		System.out.println("Success: 'Manufacturer' as 'BAT' selected successfully");
	}
	

	@Then("^User selects 'Parent product Code'$")
	public void user_selects_Parent_product_Code() throws Throwable {
	   
		System.out.println("Attempt: select 'Parent product Code'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.PARENT_PRODUCT_CODE, LocatorsPath.MAX_TIME, 
				file1.getCellData("ProductConfig", "Parent Product Code", 2));
		System.out.println("Success: 'Parent product Code' selected successfully");
	}
	

	@Then("^User enters the 'Product Sequence'$")
	public void user_enters_the_Product_Sequence() throws Throwable {
	    
		System.out.println("Attempt: enter 'Product Sequence'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.PRODUCT_SEQUENCE, LocatorsPath.MAX_TIME, 
				file1.getCellData("ProductConfig", "Product Sequence", 2));
		System.out.println("Success: 'Product Sequence' entered successfully");
	}

	
	@Then("^User selects 'Product Type'$")
	public void user_selects_Product_Type() throws Throwable {
	    
		System.out.println("Attempt: select 'Product Type'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.PRODUCT_TYPE, LocatorsPath.MAX_TIME, 
				file1.getCellData("ProductConfig", "Product Type", 2));
		System.out.println("Success: 'Product Type' selected successfully");
	}
	

	@Then("^User selects 'Status'$")
	public void user_selects_Status() throws Throwable {
	    
		System.out.println("Attempt: select 'Status'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.PROD_STATUS, LocatorsPath.MAX_TIME, 
				file1.getCellData("ProductConfig", "Status", 2));
		System.out.println("Success: 'Status' selected successfully");
	}
	

	@Then("^User selects 'Brand Segment'$")
	public void user_selects_Brand_Segment() throws Throwable {
	    
		System.out.println("Attempt: select 'Brand Segment'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.BRAND_SEGMENT, LocatorsPath.MAX_TIME, 
				file1.getCellData("ProductConfig", "Brand Segment", 2));
		System.out.println("Success: 'Brand Segment' selected successfully");
	}
	

	@Then("^User selects 'Flavor Segment'$")
	public void user_selects_Flavor_Segment() throws Throwable {
	   
		System.out.println("Attempt: select 'Flavor Segment'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.FLAVOUR_SEGMENT, LocatorsPath.MAX_TIME, 
				file1.getCellData("ProductConfig", "Flavour Segment", 2));
		System.out.println("Success: 'Flavor Segment' selected successfully");
	}
	

	@Then("^User selects 'Strategic Mix'$")
	public void user_selects_Strategic_Mix() throws Throwable {
	    
		System.out.println("Attempt: select 'Strategic Mix'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.STRATEGIC_MIX, LocatorsPath.MAX_TIME, 
				file1.getCellData("ProductConfig", "Strategic Mix", 2));
		System.out.println("Success: 'Strategic Mix' selected successfully");
	}
	

	@Then("^User selects 'Price Segment'$")
	public void user_selects_Price_Segment() throws Throwable {
	    
		System.out.println("Attempt: select 'Price Segment'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.PRICE_SEGMENT, LocatorsPath.MAX_TIME, 
				file1.getCellData("ProductConfig", "Price Segment", 2));
		System.out.println("Success: 'Price Segment' selected successfully");
	}
	

	@Then("^User selects 'Product free field three'$")
	public void user_selects_Product_free_field_three() throws Throwable {

		System.out.println("Attempt: select 'Product free field three'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.PRODUCT_FREE_FIELD_3, LocatorsPath.MAX_TIME, 
				file1.getCellData("ProductConfig", "Product Free Field 3", 2));
		System.out.println("Success: 'Product free field three' selected successfully");
	}
	

	@Then("^User selects 'Product free field four'$")
	public void user_selects_Product_free_field_four() throws Throwable {

		System.out.println("Attempt: select 'Product free field four'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.PRODUCT_FREE_FIELD_4, LocatorsPath.MAX_TIME, 
				file1.getCellData("ProductConfig", "Product Free Field 4", 2));
		System.out.println("Success: 'Product free field four' selected successfully");
	}
	

	@Then("^User selects 'Product free field five'$")
	public void user_selects_Product_free_field_five() throws Throwable {

		System.out.println("Attempt: select 'Product free field five'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.PRODUCT_FREE_FIELD_5, LocatorsPath.MAX_TIME, 
				file1.getCellData("ProductConfig", "Product Free Field 5", 2));
		System.out.println("Success: 'Product free field five' selected successfully");
	}
	

	@Then("^User selects 'Blend segment'$")
	public void user_selects_Blend_segment() throws Throwable {
	    
		System.out.println("Attempt: select 'Blend segment'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.BLEND_SEGMENT, LocatorsPath.MAX_TIME, 
				file1.getCellData("ProductConfig", "Blend Segment", 2));
		System.out.println("Success: 'Blend segment' selected successfully");
	}
	

	@Then("^User selects 'Filter type'$")
	public void user_selects_Filter_type() throws Throwable {
	 
		System.out.println("Attempt: select 'Filter type'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.FLITER_TYPE, LocatorsPath.MAX_TIME, 
				file1.getCellData("ProductConfig", "Filter Type", 2));
		System.out.println("Success: 'Filter type' selected successfully");
	}
	

	@Then("^User enters the 'Unit of measure'$")
	public void user_enters_the_Unit_of_measure() throws Throwable {
	    
		System.out.println("Attempt: enter 'Unit of measure'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.PROD_UNIT_OF_MEASURE, LocatorsPath.MAX_TIME, 
				file1.getCellData("ProductConfig", "Unit Of Measure", 2));
		System.out.println("Success: 'Unit of measure' entered successfully");
	}
	

	@Then("^User selects 'SC/FC'$")
	public void user_selects_SC_FC() throws Throwable {
	 
		System.out.println("Attempt: select 'SC/FC'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.SC_FC, LocatorsPath.MAX_TIME, 
				file1.getCellData("ProductConfig", "SC/FC", 2));
		System.out.println("Success: 'SC/FC' selected successfully");
	}
	

	@Then("^User selects 'Start date'$")
	public void user_selects_Start_date() throws Throwable {
	    
		System.out.println("Attempt: select the 'Start Date'");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.PROD_START_DATE_CALENDER, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.PROD_START_DATE, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Start Date' as been selected successfully");
	}
	

	@Then("^User selects 'End date'$")
	public void user_selects_End_date() throws Throwable {
	    
		System.out.println("Attempt: select the 'End Date'");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.PROD_END_DATE_CALENDER, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.PROD_END_DATE, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'End Date' as been selected successfully");
	}
	

	@Then("^User selects 'Pack type'$")
	public void user_selects_Pack_type() throws Throwable {
	    
		System.out.println("Attempt: select 'Pack type'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.PACK_TYPE, LocatorsPath.MAX_TIME, 
				file1.getCellData("ProductConfig", "Pack Type", 2));
		System.out.println("Success: 'Pack type' selected successfully");
	}
	

	@Then("^User selects 'Pack size'$")
	public void user_selects_Pack_size() throws Throwable {
	   
		System.out.println("Attempt: select 'Pack size'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.PACK_SIZE, LocatorsPath.MAX_TIME, 
				file1.getCellData("ProductConfig", "Pack Size", 2));
		System.out.println("Success: 'Pack size' selected successfully");
	}
	

	@Then("^User enters the 'Weight in grams'$")
	public void user_enters_the_Weight_in_grams() throws Throwable {
	    
		System.out.println("Attempt: enter 'Weight in grams'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.WEIGHT_IN_GRAMS, LocatorsPath.MAX_TIME, 
				file1.getCellData("ProductConfig", "Weight In Grams", 2));
		System.out.println("Success: 'Weight in grams' entered successfully");
	}
	

	@Then("^User enters the 'Packs in Carton'$")
	public void user_enters_the_Packs_in_Carton() throws Throwable {
	   
		System.out.println("Attempt: enter 'Packs in Carton'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.PACKS_IN_CARTON, LocatorsPath.MAX_TIME, 
				file1.getCellData("ProductConfig", "Packs In Carton", 2));
		System.out.println("Success: 'Packs in Carton' entered successfully");
	}
	

	@Then("^User enters the 'Unit Price'$")
	public void user_enters_the_Unit_Price() throws Throwable {
	    
		System.out.println("Attempt: enter 'Unit Price'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.PROD_UNIT_PRICE, LocatorsPath.MAX_TIME, 
				file1.getCellData("ProductConfig", "Unit Price", 2));
		System.out.println("Success: 'Unit Price' entered successfully");
	}
	

	@Then("^User enters the 'Shelf Life'$")
	public void user_enters_the_Shelf_Life() throws Throwable {
	    
		System.out.println("Attempt: enter 'Shelf Life'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.SHELF_LIFE, LocatorsPath.MAX_TIME, 
				file1.getCellData("ProductConfig", "Shelf Life", 2));
		System.out.println("Success: 'Shelf Life' entered successfully");
	}
	

	@Then("^User clicks on Save button and Product Record should be saved successfully$")
	public void user_clicks_on_Save_button_and_Product_Record_should_be_saved_successfully() throws Throwable {
	    
		merchandisingPage.
		finally_I_click_on_save_button_and_verify_Merchandise_records_saved_successfully();
	}
	

	@Then("^User selects the Product which is to be modified$")
	public void user_selects_the_Product_which_is_to_be_modified() throws Throwable {
	   
		System.out.println("Attempt: Search with product name which is to be modified");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.PRODUCT_NAME_SEARCH_FIELD, LocatorsPath.MAX_TIME, 
				file1.getCellData("ProductConfig", "Product Name", 2));
		CallObject.waitForPageLoad(driver);
		wait.until(ExpectedConditions.
				presenceOfElementLocated(
						By.cssSelector(LocatorsPath.PRODUCT_NAME_SEARCH_FIELD))).clear();
		CallObject.block(3000);
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.PRODUCT_NAME_SEARCH_FIELD, LocatorsPath.MAX_TIME, 
				file1.getCellData("ProductConfig", "Product Name", 2));
		CallObject.waitForPageLoad(driver);
		System.out.println("Success: product name selected successfully");
	}
	

	@Then("^User drills down to the link of the 'Product Name'$")
	public void user_drills_down_to_the_link_of_the_Product_Name() throws Throwable {
	   
		System.out.println("Attempt: drill down to the link of the 'Product Name'");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.SELECT_PRODUCT_NAME, LocatorsPath.MAX_TIME);
		System.out.println("Success: product name selected successfully");
	}
	

	@Then("^User verifies the 'Edit The Products' screen displayed$")
	public void user_verifies_the_Edit_The_Products_screen_displayed() throws Throwable {
	    
		System.out.println("Attempt: verify 'Edit The Products' screen displayed");
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.EDIT_PRODUCTS, LocatorsPath.MAX_TIME);
		System.out.println("Success: Edit The Products displayed successfully");
	}
	

	@Then("^User Edits any of the field values required to be modified$")
	public void user_Edits_any_of_the_field_values_required_to_be_modified() throws Throwable {
	    
		System.out.println("Attempt: Edit any of the field values");
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.EDIT_TAR)))).clear();
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.EDIT_TAR, LocatorsPath.MAX_TIME, 
				file1.getCellData("ProductConfig", "Tar", 3));
		System.out.println("Success: field values edited successfully");
	}
	

	@Then("^User clicks against the 'Save' button and Product should be updated successfully$")
	public void user_clicks_against_the_Save_button_and_Product_should_be_updated_successfully() throws Throwable {
	    
		user_clicks_on_Save_button_and_Product_Record_should_be_saved_successfully();
	}
	

	@Then("^User changes the field value for STATUS to ACTIVE$")
	public void user_changes_the_field_value_for_STATUS_to_ACTIVE() throws Throwable {
	    
		System.out.println("Attempt: select 'Status'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.EDIT_STATUS, LocatorsPath.MAX_TIME, 
				file1.getCellData("ProductConfig", "Status", 2));
		System.out.println("Success: 'Status' selected successfully");
	}
	

	@Then("^User verifies the STATUS field value for the Product under 'Master Product List Setup' as ACTIVE$")
	public void user_verifies_the_STATUS_field_value_for_the_Product_under_Master_Product_List_Setup_as_ACTIVE() throws Throwable {
	    
		user_selects_the_Product_which_is_to_be_modified();

		int attempts = 1;
		boolean isFound = false;
	    while (!isFound && attempts <= LocatorsPath.MAX_ATTEMPTS) {
	    try {
		        if(driver.getPageSource().contains("Status")){
		            isFound = true;
		            CallObject.waitForPageLoad(driver);
		            PageObjects.SelectByCSSSelectorWithoutClick(
		            		driver, LocatorsPath.VERIFY_STATUS, LocatorsPath.MAX_ATTEMPTS);
		            WebElement element = wait.until(ExpectedConditions.
							presenceOfElementLocated((
									By.cssSelector(LocatorsPath.VERIFY_STATUS_1))));
		            System.out.println(element.getText());
		            Assert.assertEquals("ACTIVE", element.getText());

		        }else {
		        	Assert.fail("Status is not 'ACTIVE'");
		     }
	    } catch (TimeoutException TimeOutException) {
			Assert.fail("Time Out" + TimeOutException);
		} catch (StaleElementReferenceException StaleElementReferenceException) {
			System.out.println("Trying to recover from stale element" + StaleElementReferenceException);
		}
	    attempts++;
	  }
	}
	

	@Then("^User enters the required field values$")
	public void user_enters_the_required_field_values() throws Throwable {
	    
		System.out.println("Attempt: Edit any of the field values");
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.TAR)))).clear();
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.TAR, LocatorsPath.MAX_TIME, 
				file1.getCellData("ProductConfig", "Tar", 3));
		System.out.println("Success: field values edited successfully");
	}
	

	@Then("^User clicks on the cancel button and the screen should exit without adding any Products$")
	public void user_clicks_on_the_cancel_button_and_the_screen_should_exit_without_adding_any_Products() throws Throwable {
	    
		System.out.println("Attempt: Click on Cancel button");
		CallObject.waitForPageLoad(driver);
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.CANCEL_PRODUCTS)));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.CANCEL_PRODUCTS, LocatorsPath.MAX_TIME);

		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(5000);
		System.out.println("Success: Cancel button selected successfully");
	}
	
	
	@Then("^User enters the name and other mandatory fields for Brand selection$")
	public void user_enters_the_name_and_other_mandatory_fields_for_Brand_selection() throws Throwable {
	  
		System.out.println("Attempt: Enter 'Product name'");
		wait.until(ExpectedConditions.
				presenceOfElementLocated(
						By.cssSelector(LocatorsPath.PRODUCT_NAME))).clear();
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.PRODUCT_NAME, LocatorsPath.MAX_TIME, 
				CallObject.timestamp().concat("_ProdNameBrand"));
		file1.setCellData("ProductConfig", "Product Name", 2, 
				CallObject.timestamp().concat("_ProdNameBrand"));
		System.out.println("Success: 'Product name' entered successfully");
		
		System.out.println("Attempt: Enter 'Product Number'");
		wait.until(ExpectedConditions.
				presenceOfElementLocated(
						By.cssSelector(LocatorsPath.PRODUCT_NUMBER))).clear();
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.PRODUCT_NUMBER, LocatorsPath.MAX_TIME, 
				CallObject.timestamp().concat("_ProdNoBrand"));
		file1.setCellData("ProductConfig", "Product Number", 2, 
				CallObject.timestamp().concat("_ProdNoBrand"));
		System.out.println("Success: 'Product Number' entered successfully");
		
		user_selects_Pack_size();
		user_enters_the_Packs_in_Carton();
	}

	
	@Then("^User enters the name and other mandatory fields for Variant selection$")
	public void user_enters_the_name_and_other_mandatory_fields_for_Variant_selection() throws Throwable {
	 
		System.out.println("Attempt: Enter 'Product name'");
		wait.until(ExpectedConditions.
				presenceOfElementLocated(
						By.cssSelector(LocatorsPath.PRODUCT_NAME))).clear();
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.PRODUCT_NAME, LocatorsPath.MAX_TIME, 
				CallObject.timestamp().concat("_ProdNameVariant"));
		file1.setCellData("ProductConfig", "Product Name", 2, 
				CallObject.timestamp().concat("_ProdNameVariant"));
		System.out.println("Success: 'Product name' entered successfully");
		
		System.out.println("Attempt: Enter 'Product Number'");
		wait.until(ExpectedConditions.
				presenceOfElementLocated(
						By.cssSelector(LocatorsPath.PRODUCT_NUMBER))).clear();
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.PRODUCT_NUMBER, LocatorsPath.MAX_TIME, 
				CallObject.timestamp().concat("_ProdNoVariant"));
		file1.setCellData("ProductConfig", "Product Number", 2, 
				CallObject.timestamp().concat("_ProdNoVariant"));
		System.out.println("Success: 'Product Number' entered successfully");
		
		user_selects_Pack_size();
		user_enters_the_Packs_in_Carton();
	}

	
	@Then("^User enters the name and other mandatory fields for Product selection$")
	public void user_enters_the_name_and_other_mandatory_fields_for_Product_selection() throws Throwable {
	 
		System.out.println("Attempt: Enter 'Product name'");
		wait.until(ExpectedConditions.
				presenceOfElementLocated(
						By.cssSelector(LocatorsPath.PRODUCT_NAME))).clear();
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.PRODUCT_NAME, LocatorsPath.MAX_TIME, 
				CallObject.timestamp().concat("_ProdNameProduct"));
		file1.setCellData("ProductConfig", "Product Name", 2, 
				CallObject.timestamp().concat("_ProdNameProduct"));
		System.out.println("Success: 'Product name' entered successfully");
		
		System.out.println("Attempt: Enter 'Product Number'");
		wait.until(ExpectedConditions.
				presenceOfElementLocated(
						By.cssSelector(LocatorsPath.PRODUCT_NUMBER))).clear();
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.PRODUCT_NUMBER, LocatorsPath.MAX_TIME, 
				CallObject.timestamp().concat("_ProdNoProduct"));
		file1.setCellData("ProductConfig", "Product Number", 2, 
				CallObject.timestamp().concat("_ProdNoProduct"));
		System.out.println("Success: 'Product Number' entered successfully");
		
		user_selects_Pack_size();
		user_enters_the_Packs_in_Carton();
	}

	
	@Then("^User enters the name and other mandatory fields for SKU selection$")
	public void user_enters_the_name_and_other_mandatory_fields_for_SKU_selection() throws Throwable {
	    
		System.out.println("Attempt: Enter 'Product name'");
		wait.until(ExpectedConditions.
				presenceOfElementLocated(
						By.cssSelector(LocatorsPath.PRODUCT_NAME))).clear();
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.PRODUCT_NAME, LocatorsPath.MAX_TIME, 
				CallObject.timestamp().concat("_ProdNameSKU"));
		file1.setCellData("ProductConfig", "Product Name", 2, 
				CallObject.timestamp().concat("_ProdNameSKU"));
		System.out.println("Success: 'Product name' entered successfully");
		
		System.out.println("Attempt: Enter 'Product Number'");
		wait.until(ExpectedConditions.
				presenceOfElementLocated(
						By.cssSelector(LocatorsPath.PRODUCT_NUMBER))).clear();
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.PRODUCT_NUMBER, LocatorsPath.MAX_TIME, 
				CallObject.timestamp().concat("_ProdNoSKU"));
		file1.setCellData("ProductConfig", "Product Number", 2, 
				CallObject.timestamp().concat("_ProdNoSKU"));
		System.out.println("Success: 'Product Number' entered successfully");
		
		user_selects_Pack_size();
		user_enters_the_Packs_in_Carton();
	}

	
	@Then("^User enters the name and other mandatory fields for Bundle selection$")
	public void user_enters_the_name_and_other_mandatory_fields_for_Bundle_selection() throws Throwable {
	   
		System.out.println("Attempt: Enter 'Product name'");
		wait.until(ExpectedConditions.
				presenceOfElementLocated(
						By.cssSelector(LocatorsPath.PRODUCT_NAME))).clear();
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.PRODUCT_NAME, LocatorsPath.MAX_TIME, 
				CallObject.timestamp().concat("_ProdNameBundle"));
		file1.setCellData("ProductConfig", "Product Name", 2, 
				CallObject.timestamp().concat("_ProdNameBundle"));
		System.out.println("Success: 'Product name' entered successfully");
		
		System.out.println("Attempt: Enter 'Product Number'");
		wait.until(ExpectedConditions.
				presenceOfElementLocated(
						By.cssSelector(LocatorsPath.PRODUCT_NUMBER))).clear();
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.PRODUCT_NUMBER, LocatorsPath.MAX_TIME, 
				CallObject.timestamp().concat("_ProdNoBundle"));
		file1.setCellData("ProductConfig", "Product Number", 2,
				CallObject.timestamp().concat("_ProdNoBundle"));
		System.out.println("Success: 'Product Number' entered successfully");
		
		user_selects_Pack_size();
		user_enters_the_Packs_in_Carton();
	}
	
	
	@Then("^User selects the Item Type as 'Brand'$")
	public void user_selects_the_Item_Type_as_Brand() throws Throwable {
	    
		System.out.println("Attempt: select 'Item Type' as 'Brand'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ITEM_TYPE, LocatorsPath.MAX_TIME, 
				file1.getCellData("ProductConfig", "Item Type", 2));
		System.out.println("Success: 'Item Type' as 'Brand' selected successfully");
	}
	

	@Then("^User clicks on 'Save' button and a new Brand should be created successfully and should be present in the Product list$")
	public void user_clicks_on_Save_button_and_a_new_Brand_should_be_created_successfully_and_should_be_present_in_the_Product_list() throws Throwable {
	   
		user_clicks_on_Save_button_and_Product_Record_should_be_saved_successfully();
		user_selects_the_Product_which_is_to_be_modified();
		
		int attempts = 1;
		boolean isFound = false;
	    while (!isFound && attempts <= LocatorsPath.MAX_ATTEMPTS) {
	    try {
		        if(driver.getPageSource().contains("Item Type")){
		            isFound = true;
		            CallObject.waitForPageLoad(driver);
		            PageObjects.SelectByCSSSelectorWithoutClick(
		            		driver, LocatorsPath.VERIFY_ITEM_1, LocatorsPath.MAX_ATTEMPTS);
		            WebElement item = wait.until(ExpectedConditions.
							presenceOfElementLocated((By.cssSelector(LocatorsPath.VERIFY_ITEM))));
		            System.out.println(item.getText());
		            Assert.assertEquals("BRAND", item.getText());

		        }else {
		        	Assert.fail("Item Type is not 'BRAND'");
		     }
	    } catch (TimeoutException TimeOutException) {
			Assert.fail("Time Out" + TimeOutException);
		} catch (StaleElementReferenceException StaleElementReferenceException) {
			System.out.println("Trying to recover from stale element" + StaleElementReferenceException);
		}
	    attempts++;
	  }
    }
	

	@Then("^User selects the Item Type as 'Variant'$")
	public void user_selects_the_Item_Type_as_Variant() throws Throwable {
	 
		System.out.println("Attempt: select 'Item Type' as 'Variant'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ITEM_TYPE, LocatorsPath.MAX_TIME, 
				file1.getCellData("ProductConfig", "Item Type", 6));
		System.out.println("Success: 'Item Type' as 'Variant' selected successfully");
	}
	

	@Then("^User clicks on 'Save' button and a new Variant should be created successfully and should be present in the Product list$")
	public void user_clicks_on_Save_button_and_a_new_Variant_should_be_created_successfully_and_should_be_present_in_the_Product_list() throws Throwable {
	    
		user_clicks_on_Save_button_and_Product_Record_should_be_saved_successfully();
		user_selects_the_Product_which_is_to_be_modified();
		
		int attempts = 1;
		boolean isFound = false;
	    while (!isFound && attempts <= LocatorsPath.MAX_ATTEMPTS) {
	    try {
		        if(driver.getPageSource().contains("Item Type")){
		            isFound = true;
		            CallObject.waitForPageLoad(driver);
		            PageObjects.SelectByCSSSelectorWithoutClick(
		            		driver, LocatorsPath.VERIFY_ITEM_1, LocatorsPath.MAX_ATTEMPTS);
		            WebElement element = wait.until(ExpectedConditions.
							presenceOfElementLocated((
									By.cssSelector(LocatorsPath.VERIFY_ITEM))));
		            System.out.println(element.getText());
		            Assert.assertEquals("VARIANT", element.getText());

		        }else {
		        	Assert.fail("Item Type is not 'VARIANT'");
		     }
	    } catch (TimeoutException TimeOutException) {
			Assert.fail("Time Out" + TimeOutException);
		} catch (StaleElementReferenceException StaleElementReferenceException) {
			System.out.println("Trying to recover from stale element" + StaleElementReferenceException);
		}
	    attempts++;
	  }
	}
	

	@Then("^User selects the Item Type as 'Product'$")
	public void user_selects_the_Item_Type_as_Product() throws Throwable {
	    
		user_selects_Item_Type_as_Product();
	}
	

	@Then("^User clicks on 'Save' button and a new product should be created successfully and should be present in the Product list$")
	public void user_clicks_on_Save_button_and_a_new_product_should_be_created_successfully_and_should_be_present_in_the_Product_list() throws Throwable {
	    
		user_clicks_on_Save_button_and_Product_Record_should_be_saved_successfully();
		user_selects_the_Product_which_is_to_be_modified();
		
		int attempts = 1;
		boolean isFound = false;
	    while (!isFound && attempts <= LocatorsPath.MAX_ATTEMPTS) {
	    try {
		        if(driver.getPageSource().contains("Item Type")){
		            isFound = true;
		            CallObject.waitForPageLoad(driver);
		            PageObjects.SelectByCSSSelectorWithoutClick(
		            		driver, LocatorsPath.VERIFY_ITEM_1, LocatorsPath.MAX_ATTEMPTS);
		            WebElement element = wait.until(ExpectedConditions.
							presenceOfElementLocated((
									By.cssSelector(LocatorsPath.VERIFY_ITEM))));
		            System.out.println(element.getText());
		            Assert.assertEquals("PRODUCT", element.getText());

		        }else {
		        	Assert.fail("Item Type is not 'PRODUCT'");
		     }
	    } catch (TimeoutException TimeOutException) {
			Assert.fail("Time Out" + TimeOutException);
		} catch (StaleElementReferenceException StaleElementReferenceException) {
			System.out.println("Trying to recover from stale element" + StaleElementReferenceException);
		}
	    attempts++;
	  }
	}
	

	@Then("^User selects the Item Type as 'SKU'$")
	public void user_selects_the_Item_Type_as_SKU() throws Throwable {
	    
		System.out.println("Attempt: select 'Item Type' as 'SKU'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ITEM_TYPE, LocatorsPath.MAX_TIME, 
				file1.getCellData("ProductConfig", "Item Type", 5));
		System.out.println("Success: 'Item Type' as 'SKU' selected successfully");
	}
	
	
	@Then("^User clicks on 'Save' button and a new sku should be created successfully and should be present in the Product list$")
	public void user_clicks_on_Save_button_and_a_new_sku_should_be_created_successfully_and_should_be_present_in_the_Product_list() throws Throwable {
	    
		user_clicks_on_Save_button_and_Product_Record_should_be_saved_successfully();
		user_selects_the_Product_which_is_to_be_modified();
		
		int attempts = 1;
		boolean isFound = false;
	    while (!isFound && attempts <= LocatorsPath.MAX_ATTEMPTS) {
	    try {
		        if(driver.getPageSource().contains("Item Type")){
		            isFound = true;
		            CallObject.waitForPageLoad(driver);
		            PageObjects.SelectByCSSSelectorWithoutClick(
		            		driver, LocatorsPath.VERIFY_ITEM_1, LocatorsPath.MAX_ATTEMPTS);
		            WebElement element = wait.until(ExpectedConditions.
							presenceOfElementLocated((
									By.cssSelector(LocatorsPath.VERIFY_ITEM))));
		            System.out.println(element.getText());
		            Assert.assertEquals("SKU", element.getText());

		        }else {
		        	Assert.fail("Item Type is not 'SKU'");
		     }
	    } catch (TimeoutException TimeOutException) {
			Assert.fail("Time Out" + TimeOutException);
		} catch (StaleElementReferenceException StaleElementReferenceException) {
			System.out.println("Trying to recover from stale element" + StaleElementReferenceException);
		}
	    attempts++;
	  }
	}
	

	@Then("^User selects the Item Type as 'Bundle'$")
	public void user_selects_the_Item_Type_as_Bundle() throws Throwable {
	    
		System.out.println("Attempt: select 'Item Type' as 'Bundle'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ITEM_TYPE, LocatorsPath.MAX_TIME, 
				file1.getCellData("ProductConfig", "Item Type", 3));
		System.out.println("Success: 'Item Type' as 'Bundle' selected successfully");
	}
	

	@Then("^User clicks on 'Save' button and a new bundle should be created successfully and should be present in the Product list$")
	public void user_clicks_on_Save_button_and_a_new_bundle_should_be_created_successfully_and_should_be_present_in_the_Product_list() throws Throwable {
	    
		user_clicks_on_Save_button_and_Product_Record_should_be_saved_successfully();
		user_selects_the_Product_which_is_to_be_modified();
		int attempts = 1;
		boolean isFound = false;
	    while (!isFound && attempts <= LocatorsPath.MAX_ATTEMPTS) {
	    try {
		        if(driver.getPageSource().contains("Item Type")){
		            isFound = true;
		            CallObject.waitForPageLoad(driver);
		            PageObjects.SelectByCSSSelectorWithoutClick(
		            		driver, LocatorsPath.VERIFY_ITEM_1, LocatorsPath.MAX_ATTEMPTS);
		            WebElement element = wait.until(ExpectedConditions.
							presenceOfElementLocated((
									By.cssSelector(LocatorsPath.VERIFY_ITEM))));
		            System.out.println(element.getText());
		            Assert.assertEquals("BUNDLE", element.getText());

		        }else {
		        	Assert.fail("Item Type is not 'BUNDLE'");
		     }
	    } catch (TimeoutException TimeOutException) {
			Assert.fail("Time Out" + TimeOutException);
		} catch (StaleElementReferenceException StaleElementReferenceException) {
			System.out.println("Trying to recover from stale element" + StaleElementReferenceException);
		}
	    attempts++;
	  }
	}
	
	
	@Then("^User selects the Product Bundle$")
	public void user_selects_the_Product_Bundle() throws Throwable {
	   
		System.out.println("Attempt: select 'Item Type' as 'Bundle'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.SELECT_ITEM_TYPE, LocatorsPath.MAX_TIME, 
				file1.getCellData("ProductConfig", "Item Type", 3));
		CallObject.waitForPageLoad(driver);
		System.out.println("Success: 'Item Type' as 'Bundle' selected successfully");
	}
	

	@Then("^The bottom grid that displays the SKUs in the bundle should open but with no records$")
	public void the_bottom_grid_that_displays_the_SKUs_in_the_bundle_should_open_but_with_no_records() throws Throwable {
	 
		System.out.println("Attempt: click on the bottom grid that displays the SKUs in the bundle");
		user_selects_the_Product_which_is_to_be_modified();
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.REFRESH_BUNDLE, LocatorsPath.MAX_TIME);
		System.out.println("Success: bottom grid that displays the SKUs in the bundle selected successfully");
	}
	

	@Then("^User clicks on the 'Add' button in the bottom grid and Add Sku screen should open$")
	public void user_clicks_on_the_Add_button_in_the_bottom_grid_and_Add_Sku_screen_should_open() throws Throwable {
	    
		System.out.println("Attempt: Click on Add button");
		CallObject.waitForPageLoad(driver);
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.PROD_ADD_1)));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.PROD_ADD_1, LocatorsPath.MAX_TIME);
		System.out.println("Success: Add button selected successfully");
	}
	

	@Then("^User selects the required SKU name and enters the quantity and clicks on 'Save'$")
	public void user_selects_the_required_SKU_name_and_enters_the_quantity_and_clicks_on_Save() throws Throwable {
	    
		System.out.println("Attempt: select the required SKU name and enter the quantity");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.PRODUCT_NAME_1, LocatorsPath.MAX_TIME, 
				file1.getCellData("ProductConfig", "Select Product Name", 2));
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.PROD_QUANTITY, LocatorsPath.MAX_TIME, 
				file1.getCellData("ProductConfig", "Quantity", 2));
		merchandisingPage.
		finally_I_click_on_save_button_and_verify_Merchandise_records_saved_successfully();
		System.out.println("Success: Required SKU name and Quantity added successfully");
	}
	

	@Then("^The selected SKU with the quantity should be added to the bundle successfully and must be displayed in the bottom grid$")
	public void the_selected_SKU_with_the_quantity_should_be_added_to_the_bundle_successfully_and_must_be_displayed_in_the_bottom_grid() throws Throwable {
	   
		user_selects_the_Item_Type_as_Bundle();
		user_selects_the_Product_which_is_to_be_modified();
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.REFRESH_BUNDLE, LocatorsPath.MAX_TIME);
		CallObject.waitForPageLoad(driver);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.VERIFY_QUANTITY_1, LocatorsPath.MAX_TIME);
		
		int attempts = 1;
		boolean isFound = false;
	    while (!isFound && attempts <= LocatorsPath.MAX_ATTEMPTS) {
	    try {
		        if(driver.getPageSource().contains("Item Type")){
		            isFound = true;
		            CallObject.waitForPageLoad(driver);
		            PageObjects.SelectByCSSSelectorWithoutClick(
		            		driver, LocatorsPath.VERIFY_QUANTITY, LocatorsPath.MAX_ATTEMPTS);
		            WebElement quantity = wait.until(ExpectedConditions.
							presenceOfElementLocated((By.cssSelector(LocatorsPath.VERIFY_QUANTITY))));
		            WebElement productName = wait.until(ExpectedConditions.
							presenceOfElementLocated((By.cssSelector(LocatorsPath.VERIFY_PRODUCT_NAME))));
		            System.out.println(quantity.getText());
		            System.out.println(productName.getText());
		            Assert.assertEquals(
		            		file1.getCellData("ProductConfig", "Quantity", 2).concat(".000"), 
		            		quantity.getText());
		            /*Assert.assertEquals(file1.getCellData("ProductConfig", "Select Product Name", 2), 
		            		productName.getText());*/
		        }else {
		        	Assert.fail("Item Type is not 'SKU'");
		     }
	    } catch (TimeoutException TimeOutException) {
			Assert.fail("Time Out" + TimeOutException);
		} catch (StaleElementReferenceException StaleElementReferenceException) {
			System.out.println("Trying to recover from stale element" + StaleElementReferenceException);
		}
	    attempts++;
	  }
	}
}
