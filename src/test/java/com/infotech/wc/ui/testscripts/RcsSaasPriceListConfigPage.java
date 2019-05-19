package com.infotech.wc.ui.testscripts;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

public class RcsSaasPriceListConfigPage extends TestRunnerWebClient{

	public RcsSaasPriceListConfigPage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	WebDriver driver = getDriver();
	ExcelApiFile file = new ExcelApiFile("TestData.xlsx");
	ExcelApiFile file1 = new ExcelApiFile("TestData1.xlsx");
	WebDriverWait wait = new WebDriverWait(driver, LocatorsPath.MAX_TIME);
	Actions actions = new Actions(driver);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	RcsSaasConfigurationContractPage contractPage = new RcsSaasConfigurationContractPage();
	RcsSaasConfigurationUsersPage configurationPage = new RcsSaasConfigurationUsersPage();
	RcsSaasNewOutletCreationPage newOutletCreationPage = new RcsSaasNewOutletCreationPage();
	
	
	
	/**----------------------RCS_SaaS_PriceList_WC--------------------------**/
	
	
	
	@Then("^User searches for 'EPL' in Lookups Bat configuration table$")
	public void user_searches_for_EPL_in_Lookups_Bat_configuration_table() throws Throwable {
	  
		System.out.println("Attempt: User searches for 'EPL' in Lookups Bat configuration table");
		CallObject.waitForPageLoad(driver);
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.PRICELIST_ITEM_CODE, LocatorsPath.MAX_TIME, 
				file1.getCellData("PriceList", "Item Code", 2));
		CallObject.waitForPageLoad(driver);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.PRICELIST_SELECT_ITEM_CODE, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'EPL' in Lookups Bat configuration table selected successfully");
	}
	

	@Then("^User selects 'EPL' and updates the Description field as 'N'$")
	public void user_selects_EPL_and_updates_the_Description_field_as_N() throws Throwable {
	    
		System.out.println("Attempt: User selects for 'EPM' in Lookups Bat configuration table");
		wait.until(ExpectedConditions.
				presenceOfElementLocated((
						By.cssSelector(LocatorsPath.PRICELIST_DESCRIPTION)))).clear();
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.PRICELIST_DESCRIPTION, LocatorsPath.MAX_TIME, 
				file1.getCellData("PriceList", "Description 1", 2));
		System.out.println("Success: 'EPM' in Lookups Bat configuration table selected successfully");
	}
	

	@Then("^User clicks on 'Price List' tab and navigates to Price List screen$")
	public void user_clicks_on_Price_List_tab_and_navigates_to_Price_List_screen() throws Throwable {
	 
		System.out.println("Attempt: select 'Price List' tab");
		WebElement priceList = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.PRICE_LIST_TAB))));
		actions.moveToElement(priceList).doubleClick().build().perform();
		System.out.println("Success: 'Price List' tab selected successfully");
	}
	

	@Then("^User verifies add button is not available in the price list view screen$")
	public void user_verifies_add_button_is_not_available_in_the_price_list_view_screen() throws Throwable {
	    
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.PRICELIST_VIEW, LocatorsPath.MAX_TIME);
		
		if(driver.getPageSource().contains("Add")) {
			CallObject.waitForPageLoad(driver);
			System.out.println("Element is Present");
			Assert.fail("Element is Present");
			}else{
			System.out.println("Success: Element is not present");
		}
	}
	

	@Then("^User selects any Pricelist Name from the list$")
	public void user_selects_any_Pricelist_Name_from_the_list() throws Throwable {
	    
		System.out.println("Attempt: select any PriceList name from the list");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.SELECT_PRICE_LIST_NAME, LocatorsPath.MAX_TIME);
		System.out.println("Success: PriceList name selected from the list successfully");
	}
	

	@Then("^Pricelist details page is displayed and user should not be able to edit any of the fields for that pricelist$")
	public void pricelist_details_page_is_displayed_and_user_should_not_be_able_to_edit_any_of_the_fields_for_that_pricelist() throws Throwable {
	    
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.EDIT_PRICE_LIST, LocatorsPath.MAX_TIME);
		
		if(driver.getPageSource().contains("Save")){
			CallObject.waitForPageLoad(driver);
			System.out.println("Element is Present");
			Assert.fail("Element is Present");
			}else{
			System.out.println("Success: Element is not present");
		}
	}
	

	
	/**----------------------RCS_SaaS_PriceList_WC_PriceList_Header_Creation--------------------------**/
	
	
	
	@Then("^User selects 'EPL' and updates the Description field as 'Y'$")
	public void user_selects_EPL_and_updates_the_Description_field_as_Y() throws Throwable {
	   
		System.out.println("Attempt: User selects for 'EPL' in Lookups Bat configuration table");
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.PRICELIST_DESCRIPTION)))).clear();
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.PRICELIST_DESCRIPTION, LocatorsPath.MAX_TIME, 
				file1.getCellData("PriceList", "Description 2", 2));
		System.out.println("Success: 'EPL' in Lookups Bat configuration table selected successfully");
	}
	

	@Then("^User clicks on the Add button and the 'Add Price List Header' screen should open$")
	public void user_clicks_on_the_Add_button_and_the_Add_Price_List_Header_screen_should_open() throws Throwable {
	    
		System.out.println("Attempt: User clicks on the Add button");
		CallObject.waitForPageLoad(driver);
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.PRICELIST_ADD)));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.PRICELIST_ADD, LocatorsPath.MAX_TIME);
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.ADD_PRICE_LIST_HEADER, LocatorsPath.MAX_TIME);
		System.out.println("Success: Add button selected successfully");
	}
	

	@Then("^User enters the 'Price List Name'$")
	public void user_enters_the_Price_List_Name() throws Throwable {
	 
		System.out.println("Attempt: Enter 'Price List Name'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.PRICELIST_NAME, LocatorsPath.MAX_TIME, 
				CallObject.timestamp().concat("_PriceName"));
		file1.setCellData("PriceList", "Price List Name", 2, 
				CallObject.timestamp().concat("_PriceName"));
		System.out.println("Success: 'Price List Name' entered successfully");
	}
	

	@Then("^User selects 'Customer Code'$")
	public void user_selects_Customer_Code() throws Throwable {
	 
		System.out.println("Attempt: Select 'Customer Code'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.CUSTOMER_CODE, LocatorsPath.MAX_TIME, 
				file1.getCellData("PriceList", "Customer Code", 2));
		System.out.println("Success: 'Customer Code' selected successfully");
	}
	

	@Then("^User selects 'Status' for Price List$")
	public void user_selects_Status_for_Price_List() throws Throwable {
	    
		System.out.println("Attempt: Select 'Status'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.PRICELIST_STATUS, LocatorsPath.MAX_TIME, 
				file1.getCellData("PriceList", "Status", 2));
		System.out.println("Success: 'Status' selected successfully");
	}
	

	@Then("^User selects 'Start date' for Price List$")
	public void user_selects_Start_date_for_Price_List() throws Throwable {
	    
		System.out.println("Attempt: select the 'Start Date'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.START_DATE_TEXT, LocatorsPath.MAX_TIME, 
				CallObject.futureDate());
		System.out.println("Success: 'Start Date' as been selected successfully");
	}
	

	@Then("^User selects 'End date' for Price List$")
	public void user_selects_End_date_for_Price_List() throws Throwable {
	 
		System.out.println("Attempt: select the 'End Date'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.END_DATE_TEXT, LocatorsPath.MAX_TIME, 
				CallObject.futureDate());
		System.out.println("Success: 'End Date' as been selected successfully");
	}
	

	@Then("^User enters the Free Field one for Price List$")
	public void user_enters_the_Free_Field_one_for_Price_List() throws Throwable {
	    
		System.out.println("Attempt: enter 'Free Field 1'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.PRICELIST_FREE_FIELD_1, LocatorsPath.MAX_TIME, 
				file1.getCellData("PriceList", "Free Field 1", 2));
		System.out.println("Success: 'Free Field 1' entered successfully");
	}
	

	@Then("^User enters the Free Field two for Price List$")
	public void user_enters_the_Free_Field_two_for_Price_List() throws Throwable {
	    
		System.out.println("Attempt: enter 'Free Field 2'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.PRICELIST_FREE_FIELD_2, LocatorsPath.MAX_TIME, 
				file1.getCellData("PriceList", "Free Field 2", 2));
		System.out.println("Success: 'Free Field 2' entered successfully");
	}
	
	
	@Then("^User selects Free Field three for Price List$")
	public void user_selects_Free_Field_three_for_Price_List() throws Throwable {
		System.out.println("Attempt: Select 'Free Field 3'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.PRICELIST_FREE_FIELD_3, LocatorsPath.MAX_TIME, 
				file1.getCellData("PriceList", "Free Field 3", 2));
		System.out.println("Success: 'Free Field 3' selected successfully");
	}

	
	@Then("^User clicks on save button and the Pricelist Header should be created accurately with the respective fields populated\\.$")
	public void user_clicks_on_save_button_and_the_Pricelist_Header_should_be_created_accurately_with_the_respective_fields_populated() throws Throwable {
	   
		System.out.println("Attempt: Click on Save button");
		CallObject.waitForPageLoad(driver);
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.PRICELIST_SAVE)));
        PageObjects.SelectByCSSSelector(
        		driver, LocatorsPath.PRICELIST_SAVE, LocatorsPath.MAX_TIME);
        CallObject.waitForPageLoad(driver);
		System.out.println("Success: Save button selected successfully");
	}
	

	
	/**----------------------RCS_SaaS_PriceList_WC_PriceList_Details_Creation--------------------------**/
	
	
	
	@Then("^User searches for the Price List Name in the search field and clicks on refresh button$")
	public void user_searches_for_the_Price_List_Name_in_the_search_field_and_clicks_on_refresh_button() throws Throwable {
	    
		System.out.println("Attempt: Search for the Price List Name in the search field");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.SEARCH_PRICE_LIST_NAME, LocatorsPath.MAX_TIME, 
				file1.getCellData("PriceList", "Price List Name", 2));
		CallObject.block(3000);
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SEARCH_PRICE_LIST_NAME)))).clear();
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.SEARCH_PRICE_LIST_NAME, LocatorsPath.MAX_TIME, 
				file1.getCellData("PriceList", "Price List Name", 2));
		CallObject.block(3000);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.REFRESH_PRICE_LIST_NAME, LocatorsPath.MAX_TIME);
		System.out.println("Success: Price List Name searched successfully");
	}
	

	@Then("^User clicks on the Add button in the 'PriceList Line Items' grid table$")
	public void user_clicks_on_the_Add_button_in_the_PriceList_Line_Items_grid_table() throws Throwable {
	    
		System.out.println("Attempt: User clicks on the Add button");
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.PRICELIST_ADD_1)));
		CallObject.block(2000);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.PRICELIST_ADD_1, LocatorsPath.MAX_TIME);
		System.out.println("Success: Add button selected successfully");
	}
	

	@Then("^User navigates to the PriceList Details page successfully$")
	public void user_navigates_to_the_PriceList_Details_page_successfully() throws Throwable {
	 
		System.out.println("Attempt: Navigate to the PriceList Details page");
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.PRICELIST_DETAILS_VIEW, LocatorsPath.MAX_TIME);
		System.out.println("Success: PriceList Details page displayed successfully");
	}
	

	@Then("^User selects 'SKU' for Price List$")
	public void user_selects_SKU_for_Price_List() throws Throwable {
	    
		System.out.println("Attempt: select 'SKU'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.SKU, LocatorsPath.MAX_TIME, 
				file1.getCellData("PriceList", "SKU", 2));
		System.out.println("Success: 'SKU' selected successfully");
	}
	

	@Then("^User enters the 'Unit Price VN'$")
	public void user_enters_the_Unit_Price_VN() throws Throwable {
	 
		System.out.println("Attempt: enter 'Unit Price VN'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.PRICELIST_UNIT_PRICE, LocatorsPath.MAX_TIME, 
				file1.getCellData("PriceList", "Unit Price", 2));
		System.out.println("Success: 'Unit Price VN' entered successfully");
	}
	

	@Then("^User enters the 'Excise'$")
	public void user_enters_the_Excise() throws Throwable {
	   
		System.out.println("Attempt: enter 'Excise'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.EXCISE, LocatorsPath.MAX_TIME, 
				file1.getCellData("PriceList", "Excise", 2));
		System.out.println("Success: 'Excise' entered successfully");
	}
	

	@Then("^User enters the 'GST%'$")
	public void user_enters_the_GST() throws Throwable {
	    
		System.out.println("Attempt: enter 'GST'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.GST, LocatorsPath.MAX_TIME, 
				file1.getCellData("PriceList", "GST", 2));
		System.out.println("Success: 'GST' entered successfully");
	}
	

	@Then("^User enters the 'Consumer Price VN'$")
	public void user_enters_the_Consumer_Price_VN() throws Throwable {
	    
		System.out.println("Attempt: enter 'Consumer Price VN'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.CONSUMER_PRICE, LocatorsPath.MAX_TIME, 
				file1.getCellData("PriceList", "Consumer Price", 2));
		System.out.println("Success: 'Consumer Price VN' entered successfully");
	}
	

	@Then("^User selects the Free Field three for Price List$")
	public void user_selects_the_Free_Field_three_for_Price_List() throws Throwable {
	    
		System.out.println("Attempt: select 'Free Field three'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.FREE_FIELD_3_DETAILS, LocatorsPath.MAX_TIME, 
				file1.getCellData("PriceList", "Free Field3", 2));
		System.out.println("Success: 'Free Field three' selected successfully");
	}

	
	@Then("^User selects the Free Field four for Price List$")
	public void user_selects_the_Free_Field_four_for_Price_List() throws Throwable {
	    
		System.out.println("Attempt: select 'Free Field four'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.FREE_FIELD_4_DETAILS, LocatorsPath.MAX_TIME, 
				file1.getCellData("PriceList", "Free Field4", 2));
		System.out.println("Success: 'Free Field four' selected successfully");
	}
	
	
	@Then("^User selects 'Start date' for Price List Details$")
	public void user_selects_Start_date_for_Price_List_Details() throws Throwable {
	    
		System.out.println("Attempt: select the 'Start Date'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.START_DATE_TEXT, LocatorsPath.MAX_TIME, 
				CallObject.futureDate());
		System.out.println("Success: 'Start Date' as been selected successfully");
	}
	

	@Then("^User selects 'End date' for Price List Details$")
	public void user_selects_End_date_for_Price_List_Details() throws Throwable {
	    
		System.out.println("Attempt: select the 'End Date'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.END_DATE_TEXT, LocatorsPath.MAX_TIME, 
				CallObject.futureDate());
		System.out.println("Success: 'End Date' as been selected successfully");
	}
	
	
	@Then("^User clicks on save button and the Pricelist Details should be created accurately with the respective fields populated\\.$")
	public void user_clicks_on_save_button_and_the_Pricelist_Details_should_be_created_accurately_with_the_respective_fields_populated() throws Throwable {

		user_clicks_on_save_button_and_the_Pricelist_Header_should_be_created_accurately_with_the_respective_fields_populated();
	}
	

	
	/**----------------------RCS_SaaS_PriceList_WC_PriceList_Duplicate_Customer--------------------------**/
	
	
	
	@Then("^User creates a price list with customer code and other mandatory details$")
	public void user_creates_a_price_list_with_customer_code_and_other_mandatory_details() throws Throwable {
	    
		System.out.println("User creates a price list with customer code and other mandatory details");
	}
	

	@Then("^Price list should be created successfully$")
	public void price_list_should_be_created_successfully() throws Throwable {
	    
		System.out.println("Price list should be created successfully");
	}
	

	@Then("^User tries to create another price list with same customer code as the first one$")
	public void user_tries_to_create_another_price_list_with_same_customer_code_as_the_first_one() throws Throwable {
	    
		user_enters_the_Price_List_Name();
		user_selects_Customer_Code();
		user_selects_Status_for_Price_List();
		user_selects_Start_date_for_Price_List();
		user_selects_End_date_for_Price_List();
		user_enters_the_Free_Field_one_for_Price_List();
		user_enters_the_Free_Field_two_for_Price_List();
		user_selects_Free_Field_three_for_Price_List();;
		user_clicks_on_save_button_and_the_Pricelist_Header_should_be_created_accurately_with_the_respective_fields_populated();
	}
	

	@Then("^The system shouldn't allow to create new pricelist with existing customer code which is allocated to other price list$")
	public void the_system_shouldn_t_allow_to_create_new_pricelist_with_existing_customer_code_which_is_allocated_to_other_price_list() throws Throwable {
	    
		if(driver.getPageSource().
				contains("Selected Customer Code is already associated to other price list.")) {
			CallObject.waitForPageLoad(driver);
			System.out.println("Error Message displayed");
		}else {
			Assert.fail("Error Message not displayed");
		}
	}
	

	
	/**----------------------RCS_SaaS_PriceList_WC_PriceList_Duplicate_Line_Item--------------------------**/
	
	
	
	@Then("^User searches for the Price List Name in the search field and clicks on Refresh button$")
	public void user_searches_for_the_Price_List_Name_in_the_search_field_and_clicks_on_Refresh_button() throws Throwable {
         
		System.out.println("User searches for the Price List Name in the "
				+ "search field and clicks on Refresh button");
	}

	
	@Then("^Add same SKU's with overlapping time period to the same price list$")
	public void add_same_SKU_s_with_overlapping_time_period_to_the_same_price_list() throws Throwable {
	    
		user_selects_SKU_for_Price_List();
		user_enters_the_Unit_Price_VN();
		user_enters_the_Excise();
		user_enters_the_GST();
		user_enters_the_Consumer_Price_VN();
		user_selects_Start_date_for_Price_List_Details();
		user_selects_End_date_for_Price_List_Details();
		user_selects_the_Free_Field_three_for_Price_List();
		user_selects_the_Free_Field_four_for_Price_List();
		user_clicks_on_save_button_and_the_Pricelist_Details_should_be_created_accurately_with_the_respective_fields_populated();
	}
	

	@Then("^The system shouldn't allow to add same SKU with overlapping time period to the same price list\\.$")
	public void the_system_shouldn_t_allow_to_add_same_SKU_with_overlapping_time_period_to_the_same_price_list() throws Throwable {
	    
		if(driver.getPageSource().
				contains("Details date range should not be overlapped for the same product")) {
			CallObject.waitForPageLoad(driver);
			System.out.println("Error Message displayed");
		}else {
			Assert.fail("Error Message not displayed");
		}
	}
	

	
	/**----------------------RCS_SaaS_PriceList_WC_PriceList_Associate_Customers_Price_List--------------------------**/
	
	
	
	@Then("^User clicks on the 'Associate Customers' button$")
	public void user_clicks_on_the_Associate_Customers_button() throws Throwable {
	 
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
		contractPage.user_clicks_on_Export_in_CSV_button();
		configurationPage.i_Click_on_Configiuration();
		user_clicks_on_Price_List_tab_and_navigates_to_Price_List_screen(); 
	}
	

	@Then("^User selects an Import File, having customer ID, customer number and account name which has to be associated to the price list created$")
	public void user_selects_an_Import_File_having_customer_ID_customer_number_and_account_name_which_has_to_be_associated_to_the_price_list_created() throws Throwable {
	 
		contractPage.user_selects_the_contract_for_which_the_customer_has_to_be_associated_and_then_clicks_on_the_associate_customers_button();
		contractPage.user_verifies_the_popup_window_to_import_the_file_is_opened_successfully();
		contractPage.user_selects_the_file_and_imports_it();
	}
	

	@Then("^User drills down to the Data Entry and navigates to the Search view screen$")
	public void user_drills_down_to_the_Data_Entry_and_navigates_to_the_Search_view_screen() throws Throwable {
	    
		newOutletCreationPage.user_clicks_on_Search_tab();
		newOutletCreationPage.the_User_should_be_navigated_to_customer_search_screen_successfully();
	}
	

	@Then("^User should be able to search & find the customer$")
	public void user_should_be_able_to_search_find_the_customer() throws Throwable {
		
		System.out.println("Attempt: Enter 'Customer name'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.PRICELIST_CUSTOMER_NAME, LocatorsPath.MAX_TIME, 
				file.getCellData("Contract", "Contract Name", 2));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.PRICELIST_CUSTOMER_SEARCH, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Customer name' entered successfully");
	}
	

	@Then("^User drills down to the Customer and navigate to 'Trading Terms' tab$")
	public void user_drills_down_to_the_Customer_and_navigate_to_Trading_Terms_tab() throws Throwable {
	 
		newOutletCreationPage.user_navigates_to_the_Trading_Terms_section();
	}
	

	@Then("^The 'Price List' field value should be displayed as selected during pricelist header creation$")
	public void the_Price_List_field_value_should_be_displayed_as_selected_during_pricelist_header_creation() throws Throwable {
		
		CallObject.waitForPageLoad(driver);
        PageObjects.SelectByCSSSelectorWithSendKeys(
        		driver, LocatorsPath.PRICE_LIST_1, LocatorsPath.MAX_TIME, 
        		file1.getCellData("PriceList", "Price List Name", 2));
        Assert.assertTrue(PageObjects.SelectByCSSSelectorWithSendKeys(
        		driver, LocatorsPath.PRICE_LIST_1, LocatorsPath.MAX_TIME, 
        		file1.getCellData("PriceList", "Price List Name", 2)));
	}
	

	
	/**----------------------RCS_SaaS_PriceList_WC_PriceList_Export--------------------------**/
	
	
	
	@Then("^User selects one or more Pricelists from the checkbox$")
	public void user_selects_one_or_more_Pricelists_from_the_checkbox() throws Throwable {
	   
		System.out.println("Attempt: Search for the Price List Name in the search field");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.PRICELIST_VIEW_CHECKBOX, LocatorsPath.MAX_TIME);
		System.out.println("Success: Price List Name searched successfully");
	}
	

	@Then("^User selects the specified format TXT and CSV in which the Pricelist Details are to be exported$")
	public void user_selects_the_specified_format_TXT_and_CSV_in_which_the_Pricelist_Details_are_to_be_exported() throws Throwable {
		
		System.out.println("Attempt: Select the specified format TXT and CSV in which the Pricelist Details are to be exported");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.CSV_TXT, LocatorsPath.MAX_TIME, 
				file1.getCellData("PriceList", "CSV/TXT", 2));	
		System.out.println("Success: Specified format TXT and CSV in which the Pricelist Details are to be exported selected");
	}
	

	@Then("^User clicks on the Export button for Pricelist\\.$")
	public void user_clicks_on_the_Export_button_for_Pricelist() throws Throwable {
		
		System.out.println("Attempt: click on the Export button for Pricelist");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.PRICELIST_EXPORT, LocatorsPath.MAX_TIME);
		CallObject.block(3000);
		System.out.println("Success: Export button for Pricelist selected successfully");
	}
}
