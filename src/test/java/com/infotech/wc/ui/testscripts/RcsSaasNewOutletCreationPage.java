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

public class RcsSaasNewOutletCreationPage extends TestRunnerWebClient{

	WebDriver driver = getDriver();
	ExcelApiFile file = new ExcelApiFile("TestData.xlsx");
	ExcelApiFile file1 = new ExcelApiFile("TestData1.xlsx");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	Actions actions = new Actions(driver);
	WebDriverWait wait = new WebDriverWait(driver, LocatorsPath.MAX_TIME);
	RcsSaasMerchandisingPage merchandisingPage = new RcsSaasMerchandisingPage();
	
	public RcsSaasNewOutletCreationPage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	/**----------------------RCS SAAS New_Outlet_Creation_WC--------------------------**/
	
	
	
	@Then("^User clicks on Search tab$")
	public void user_clicks_on_Search_tab() throws Throwable {
	 
		System.out.println("Attempt: navigate to search module");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.SEARCH, LocatorsPath.MAX_TIME);	
		System.out.println("success: navigated to search module successfully");
	}

	
	@Then("^The User should be navigated to customer search screen successfully$")
	public void the_User_should_be_navigated_to_customer_search_screen_successfully() throws Throwable {
	    
		System.out.println("Attempt: User should be navigated to customer search screen");
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.CUSTOMER_SEARCH_DISPLAY, LocatorsPath.MAX_TIME);
		System.out.println("Success: customer search screen displayed successfully");
	}
	

	@Then("^User clicks on Create new customer button$")
	public void user_clicks_on_Create_new_customer_button() throws Throwable {
	 
		System.out.println("Attempt: click on 'Create new customer' button");
        CallObject.waitForPageLoad(driver);
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.CREATE_NEW_CUSTOMER)));
		WebElement newCustomer = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.CREATE_NEW_CUSTOMER))));
		actions.moveToElement(newCustomer).doubleClick().build().perform();
		System.out.println("Success: Create new customer button selected successfully");
	}
	

	@Then("^The Add new customer screen should be visible to the admin$")
	public void the_Add_new_customer_screen_should_be_visible_to_the_admin() throws Throwable {
	   
		System.out.println("The Add new customer "
				+ "screen should be visible to the admin");
	}
	

	@Then("^The user selects 'Customer type' from the drop down$")
	public void the_user_selects_Customer_type_from_the_drop_down() throws Throwable {
	    
		System.out.println("Attempt: Select the 'Customer type' dropDown");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.CUSTOMER_TYPE, LocatorsPath.MAX_TIME, 
				file1.getCellData("Outlet", "Customer Type", 2));
		System.out.println("Success: 'Customer type' dropDown selected successfully");
	}
	

	@Then("^User selects 'Status' from drop down$")
	public void user_selects_Status_from_drop_down() throws Throwable {
	    
		System.out.println("Attempt: Select the 'Status' dropDown");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.NEW_OUTLET_STATUS, LocatorsPath.MAX_TIME, 
				file1.getCellData("Outlet", "Status", 2));
		System.out.println("Success: 'Status' dropDown selected successfully");
	}
	

	@Then("^User selects 'Shopper channel' from dropdown$")
	public void user_selects_Shopper_channel_from_dropdown() throws Throwable {
	  
		System.out.println("Attempt: Select the 'Shopper channel' dropDown");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.SHOPPER_CHANNEL, LocatorsPath.MAX_TIME, 
				file1.getCellData("Outlet", "Shopper Channel", 2));
		System.out.println("Success: 'Shopper channel' dropDown selected successfully");
	}
	

	@Then("^User enters 'Customer name' in the Customer Name text box$")
	public void user_enters_Customer_name_in_the_Customer_Name_text_box() throws Throwable {
	    
		System.out.println("Attempt: Enter 'Customer name'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.CUSTOMER_NAME, LocatorsPath.MAX_TIME, 
				file.getCellData("Contract", "Contract Name", 2));
		System.out.println("Success: 'Customer name' entered successfully");
	}
	

	@Then("^User selects 'Outlet type' from outlet type dropdown$")
	public void user_selects_Outlet_type_from_outlet_type_dropdown() throws Throwable {
	    
		System.out.println("Attempt: Select the 'Outlet type' dropDown");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.OUTLET_TYPE, LocatorsPath.MAX_TIME, 
				file1.getCellData("Outlet", "Outlet Type", 2));
		System.out.println("Success: 'Outlet type' dropDown selected successfully");
	}
	

	@Then("^User selects 'Outlet subtype' from outlet subtype dropdown$")
	public void user_selects_Outlet_subtype_from_outlet_subtype_dropdown() throws Throwable {
	    
		System.out.println("Attempt: Select the 'Outlet subtype' dropDown");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.OUTLET_SUB_TYPE, LocatorsPath.MAX_TIME, 
				file1.getCellData("Outlet", "Outlet Subtype", 2));
		CallObject.block(3000);
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.OUTLET_SUB_TYPE, LocatorsPath.MAX_TIME, 
				file1.getCellData("Outlet", "Outlet Subtype", 2));
		System.out.println("Success: 'Outlet subtype' dropDown selected successfully");
	}
	

	@Then("^User selects 'Territory' from Territory dropdown$")
	public void user_selects_Territory_from_Territory_dropdown() throws Throwable {
	    
		System.out.println("Attempt: Select the 'Territory' dropDown");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.TERRITORY, LocatorsPath.MAX_TIME, 
				file.getCellData("Territory", "TerritoryName", 2));
		System.out.println("Success: 'Territory' dropDown selected successfully");
	}
	

	@Then("^User navigates to Customer Classification section$")
	public void user_navigates_to_Customer_Classification_section() throws Throwable {
	    
		System.out.println("Attempt: User navigates to Customer Classification section");
		PageObjects.SelectByXpath(
				driver, LocatorsPath.CUSTOMER_CLASSIFICATION, LocatorsPath.MAX_TIME);
		System.out.println("Success: Customer Classification section selected successfully");	
	}
	

	@Then("^User Enter/Selects the required data in Customer Classification Section$")
	public void user_Enter_Selects_the_required_data_in_Customer_Classification_Section() throws Throwable {
	    
		System.out.println("Attempt: Enter the required data in Customer Classification Section");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ASU, LocatorsPath.MAX_TIME, 
				file1.getCellData("Outlet", "%ASU", 2));
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.PREMIUM_SALES_MIX, LocatorsPath.MAX_TIME, 
				file1.getCellData("Outlet", "%Premium Sales Mix", 2));
		System.out.println("Success: Required data for Customer Classification Section entered successfully");
	}
	

	@Then("^User navigates to Additional Information section$")
	public void user_navigates_to_Additional_Information_section() throws Throwable {
	    
		System.out.println("Attempt: User navigates to Additional Information section");
		PageObjects.SelectByXpath(
				driver, LocatorsPath.ADDITIONAL_INFORMATION, LocatorsPath.MAX_TIME);
		System.out.println("Success: Additional Information section selected successfully");	
	}
	

	@Then("^User Enter/Selects the required data in Additional Information Section$")
	public void user_Enter_Selects_the_required_data_in_Additional_Information_Section() throws Throwable {
	    
		System.out.println("Attempt: Enter the required data in Additional Information Section");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.SALES_METHOD, LocatorsPath.MAX_TIME, 
				file1.getCellData("Outlet", "Sales Method", 2));
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.INTERNET_AVAILABILITY, LocatorsPath.MAX_TIME, 
				file1.getCellData("Outlet", "Internet Availability", 2));
		System.out.println("Success: Required data for Additional Information Section entered successfully");
	}
	

	@Then("^User clicks on save button and the customer should be created successfully$")
	public void user_clicks_on_save_button_and_the_customer_should_be_created_successfully() throws Throwable {
	    
		merchandisingPage.
		finally_I_click_on_save_button_and_verify_Merchandise_records_saved_successfully();
	}
	

	@Then("^User navigates to the Search results screen$")
	public void user_navigates_to_the_Search_results_screen() throws Throwable {
	    
		System.out.println("Attempt: User navigates to the Search results screen");
		PageObjects.SelectByCSSSelectorWithoutClick(
				driver, LocatorsPath.CUSTOMER_CREATED, LocatorsPath.MAX_TIME);
		WebElement customer = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.CUSTOMER_CREATED))));
		Assert.assertEquals("Customer created successfully.", 
				customer.getText());
		System.out.println("Success: Navigated to the Search results screen successfully");
	}
	

	@Then("^User navigates to the Trading Terms section$")
	public void user_navigates_to_the_Trading_Terms_section() throws Throwable {
	    
		System.out.println("Attempt: User navigates to Trading Terms section");
        CallObject.waitForPageLoad(driver);
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.xpath(LocatorsPath.TRADING_TERMS)));
		WebElement trading = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.TRADING_TERMS))));
		actions.moveToElement(trading).doubleClick().build().perform();
		System.out.println("Success: Trading Terms section selected successfully");
	}
	

	@Then("^User selects the 'Price List' dropdown$")
	public void user_selects_the_Price_List_dropdown() throws Throwable {
	 
		System.out.println("Attempt: select the 'Price List' dropdown");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.PRICE_LIST, LocatorsPath.MAX_TIME, 
				file1.getCellData("Outlet", "Price List", 2));
		System.out.println("Success: 'Price List' dropdown selected successfully");
	}
	

	@Then("^User selects the 'Payment type' dropdown$")
	public void user_selects_the_Payment_type_dropdown() throws Throwable {
	    
		System.out.println("Attempt: select the 'Payment Method' dropdown");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.PAYMENT_METHOD, LocatorsPath.MAX_TIME, 
				file1.getCellData("Outlet", "Payment Method", 2));
		System.out.println("Success: 'Payment Method' dropdown selected successfully");
	}
	

	@Then("^User selects the 'Collection type' dropdown and other required fields$")
	public void user_selects_the_Collection_type_dropdown_and_other_required_fields() throws Throwable {
	   
		System.out.println("Attempt: select the 'Collection type' dropdown");
		CallObject.waitForPageLoad(driver);
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.COLLECTION_TYPE, LocatorsPath.MAX_TIME, 
				file1.getCellData("Outlet", "Collection Type", 2));
		System.out.println("Success: 'Collection type' dropdown selected successfully");
	}
	

	@Then("^User clicks on save button and the customer should be saved$")
	public void user_clicks_on_save_button_and_the_customer_should_be_saved() throws Throwable {
	    
		user_clicks_on_save_button_and_the_customer_should_be_created_successfully();
		PageObjects.SelectByCSSSelectorWithoutClick(
				driver, LocatorsPath.CUSTOMER_CREATED, LocatorsPath.MAX_TIME);
		WebElement customer = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.CUSTOMER_CREATED))));
		Assert.assertEquals(file.
				getCellData("Contract", "Contract Name", 2) 
				+" - "+ "Customer updated successfully.", customer.getText());
	}
}
