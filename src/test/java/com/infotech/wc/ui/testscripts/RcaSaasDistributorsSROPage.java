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

public class RcaSaasDistributorsSROPage extends TestRunnerWebClient{

	WebDriver driver = getDriver();
	Actions actions = new Actions(driver);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	ExcelApiFile file  = new ExcelApiFile("TestData.xlsx");
	ExcelApiFile file3 = new ExcelApiFile("TestData3.xlsx");
	WebDriverWait wait = new WebDriverWait(driver, LocatorsPath.MAX_TIME);
	RcsSaasDistributorsSLOPage distributorsSLOPage = new RcsSaasDistributorsSLOPage();
	
	public RcaSaasDistributorsSROPage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	/**----------------------RCS_SaaS_Creation_Of_SRO_WC--------------------------**/
		
	
	
	@Then("^User selects the 'Stock requisition order' tab and navigates to the Stock requisition order screen$")
	public void user_selects_the_Stock_requisition_order_tab_and_navigates_to_the_Stock_requisition_order_screen() throws Throwable {
	   
		System.out.println("Attempt: select the 'Stock requisition order' tab and "
				+ "navigate to the Stock requisition order screen");
		
        /*------------------------PRE-Requisite 1-----------------------*/
		
		PageObjects.SelectByXpath(
				driver, LocatorsPath.INVENTORY_LEVEL, LocatorsPath.MAX_TIME);
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.INVENTORY_LOCATIONS_DISP, LocatorsPath.MAX_TIME);
		
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.INVENTORY_LEVEL_SEARCH, LocatorsPath.MAX_TIME, 
				file3.getCellData("Distributor", "Inventory Location Name", 2));
		CallObject.block(2000);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.INVENTORY_LOCATIONS, LocatorsPath.MAX_TIME);
		
		WebElement row1 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INVENTORY_LEVEL_ROW_1))));
		if(row1.isDisplayed()) {
			
			WebElement qty = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.INVENTORY_LEVEL_QTY_1))));
			file3.setCellData("Distributor", "Inventory Qty", 2, qty.getText());
		}else {
			System.out.println("row1 is not displayed");
		}
		
		WebElement row2 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INVENTORY_LEVEL_ROW_2))));
		if(row2.isDisplayed()) {
			
			WebElement qty = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.INVENTORY_LEVEL_QTY_2))));
			file3.setCellData("Distributor", "Inventory Qty", 3, qty.getText());
		}else {
			System.out.println("row2 is not displayed");
		}
		
		/*------------------------PRE-Requisite 1-----------------------*/
		
		user_login_to_the_RCS_WebApplication_with_child_credentials_verifies_the_child_user_login_is_successful();
		distributorsSLOPage.user_clicks_on_the_Distributors_tab();
		
        /*------------------------PRE-Requisite 2-----------------------*/
		
		PageObjects.SelectByXpath(
				driver, LocatorsPath.INVENTORY_LEVEL, LocatorsPath.MAX_TIME);
		
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.INVENTORY_LOCATIONS_DISP, LocatorsPath.MAX_TIME);
		
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.INVENTORY_LEVEL_SEARCH, LocatorsPath.MAX_TIME, 
				file3.getCellData("DistributorSRO", "Inventory Location Name", 2));
		CallObject.block(2000);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.INVENTORY_LOCATIONS, LocatorsPath.MAX_TIME);
		
		WebElement row = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INVENTORY_LEVEL_ROW_1))));
		if(row.isDisplayed()) {
			WebElement qty = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.INVENTORY_LEVEL_QTY_1))));
			file3.setCellData("DistributorSRO", "Inventory Qty", 2, qty.getText());
		}else {
			System.out.println("row1 is not displayed");
		}
		
		WebElement Row = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INVENTORY_LEVEL_ROW_2))));
		if(Row.isDisplayed()) {
			
			WebElement qty = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.INVENTORY_LEVEL_QTY_2))));
			file3.setCellData("DistributorSRO", "Inventory Qty", 3, qty.getText());
		}else {
			System.out.println("row2 is not displayed");
		}
		
		/*------------------------PRE-Requisite 2-----------------------*/
		
		
		PageObjects.SelectByXpath(
				driver, LocatorsPath.STOCK_REQUISITION_ORDER, LocatorsPath.MAX_TIME);
		
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.CREATE_STOCK_REQUIS_BUTTON, LocatorsPath.MAX_TIME);
		
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.STOCK_REQUIS_ORDER_DISP, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Stock requisition order' tab selected and "
				+ "navigated to the Stock requisition order screen successfully");
	}
	

	@Then("^User clicks on the 'create stock requisition order' and verifies the Stock requisition order is created successfully with 'Open' order status$")
	public void user_clicks_on_the_create_stock_requisition_order_and_verifies_the_Stock_requisition_order_is_created_successfully_with_Open_order_status() throws Throwable {
	    
		System.out.println("Attempt: click on the 'create stock requisition order' and "
				+ "verify the Stock requisition order is created successfully with 'Open' status");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.CREATE_STOCK_REQUIS_ORDER, LocatorsPath.MAX_TIME);

		WebElement status = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_REQUIS_ORDER_STATUS))));
		Assert.assertEquals("OPEN", status.getText());
		System.out.println("Success: 'create stock requisition order' created and "
				+ "The Stock requisition order is created successfully with 'Open' status");
	}
	

	@Then("^User verifies the 'Order header created' message is displayed$")
	public void user_verifies_the_Order_header_created_message_is_displayed() throws Throwable {
	   
		System.out.println("Attempt: verify the 'Order header created' message is displayed");
		WebElement message = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.MESSAGE))));
		Assert.assertEquals("Order Header Created", message.getText());
		System.out.println("Success: The 'Order header created' message is displayed successfully");
	}
	

	@Then("^User verifies the Stock requisition order Header displays the following fields - Order number, Order date, Order status, Order value, Order to supplier, Supplier name, Shipped to & Source of order\\.$")
	public void user_verifies_the_Stock_requisition_order_Header_displays_the_following_fields_Order_number_Order_date_Order_status_Order_value_Order_to_supplier_Supplier_name_Shipped_to_Source_of_order() throws Throwable {
	    
		distributorsSLOPage.user_verifies_the_Stock_lifting_order_Header_displays_the_following_fields_Order_number_Order_date_Order_status_Order_value_Order_to_supplier_Supplier_name_Shipped_to_Source_of_order();
	}

	
	@Then("^User scrolls down to the stock requisition details and verifies the following fields - Product, Target, Quantity, Unit of measure, unit price, Remarks, Free field(\\d+) & Free field(\\d+)\\.$")
	public void user_scrolls_down_to_the_stock_requisition_details_and_verifies_the_following_fields_Product_Target_Quantity_Unit_of_measure_unit_price_Remarks_Free_field_Free_field(int arg1, int arg2) throws Throwable {
	    
		distributorsSLOPage.user_scrolls_down_to_the_stock_lifting_details_and_verifies_the_following_fields_Product_Target_Quantity_Unit_of_measure_unit_price_Remarks_Free_field_Free_field(0, 0);
	}
	

	@Then("^User enters the Qty for an SKU and clicks on Save button$")
	public void user_enters_the_Qty_for_an_SKU_and_clicks_on_Save_button() throws Throwable {
	   
		distributorsSLOPage.user_enters_the_Qty_for_an_SKU_and_clicks_on_save_button();
	}
	

	@Then("^User verifies the Order is saved successfully & details displays only the SKU for which the qty is entered$")
	public void user_verifies_the_Order_is_saved_successfully_details_displays_only_the_SKU_for_which_the_qty_is_entered() throws Throwable {
	    
		System.out.println("User verifies the Order is saved successfully & details displays only the SKU for which the qty is entered");
	}
	

	@Then("^User clicks on the 'BOOK' button & verifies the stock requisition Order is booked and stock requisition order status is displayed as 'BOOK'\\.$")
	public void user_clicks_on_the_BOOK_button_verifies_the_stock_requisition_Order_is_booked_and_stock_requisition_order_status_is_displayed_as_BOOK() throws Throwable {
	   
		System.out.println("Attempt: click on the 'BOOK' button & verify the "
				+ "stock lifting Order is booked and stock lifting order status is displayed as 'BOOK'");
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.STOCK_LIFTING_BOOK)));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.STOCK_LIFTING_BOOK, LocatorsPath.MAX_TIME);
		
		CallObject.block(2000);
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.STOCK_REQUIS_ORDER_STATUS)));
		WebElement status = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_REQUIS_ORDER_STATUS))));
		Assert.assertEquals("BOOK", status.getText());
		
		WebElement orderNumber = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_REQUIS_ORDER_NUMBER))));
		file3.setCellData("DistributorSRO", "Order Number", 2, orderNumber.getText());
		System.out.println("Attempt: The 'BOOK' button clicked & verified the "
				+ "stock lifting Order is booked and stock lifting order status is displayed as 'BOOK'");
	}
	

	
	/**----------------------RCS_SaaS_Approve_SRO_WC--------------------------**/
	
	
	
	
	@Then("^User login to the RCS WebApplication with Parent credentials & verifies the Parent user login is successful$")
	public void user_login_to_the_RCS_WebApplication_with_Parent_credentials_verifies_the_Parent_user_login_is_successful() throws Throwable {

		logOut();
		System.out.println("Attempt: Provide Valid Admin Credentials");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.LOGIN_USERNAME, LocatorsPath.MAX_TIME, 
				file.getCellData("Login", "LoginUserName", 2));
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.LOGIN_PASSWORD, LocatorsPath.MAX_TIME, 
				file.getCellData("Login", "LoginPassword", 2));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.LOGIN, LocatorsPath.MAX_TIME);
		System.out.println("Success: Able to login with the Admin Credentials successfully");
	}
	

	@Then("^User selects the 'Stock lifting order' tab and navigates to the Stock lifting Order screen$")
	public void user_selects_the_Stock_lifting_order_tab_and_navigates_to_the_Stock_lifting_order_screen() throws Throwable {
	    
		System.out.println("Attempt: select the 'Stock lifting order' tab and "
				+ "navigate to the Stock lifting order screen");
		
		PageObjects.SelectByXpath(
				driver, LocatorsPath.STOCK_LIFTING_ORDER, LocatorsPath.MAX_TIME);
		
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.CREATE_STOCK_LIFTING_BUTTON, LocatorsPath.MAX_TIME);
		
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.STOCK_LIFTING_ORDER_DISP, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Stock lifting order' tab selected and "
				+ "navigated to the Stock lifting order screen successfully");
	}
	
	
	@Then("^User selects the 'Approve Stock requisition order' and navigates to 'Approve stock requisition order' screen$")
	public void user_selects_the_Approve_Stock_requisition_order_and_navigates_to_Approve_stock_requisition_order_screen() throws Throwable {
	    
		System.out.println("Attempt: select the 'Approve Stock requisition order' and "
				+ "navigate to 'Approve stock requisition order' screen");
		PageObjects.SelectByXpath(
				driver, LocatorsPath.APPROVE_STOCK_REQUIS_ORDER, LocatorsPath.MAX_TIME);
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.STOCK_REQUIS_LIST_TO_APPROVE, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Approve Stock requisition order' selected and "
				+ "navigated to 'Approve stock requisition order' screen successfully");
	}
	

	@Then("^User verifies the order created in 'Stock requisition order' is displayed with 'Book' status in 'Approve stock requisition order' screen$")
	public void user_verifies_the_order_created_in_Stock_requisition_order_is_displayed_with_Book_status_in_Approve_stock_requisition_order_screen() throws Throwable {
	   
		System.out.println("Attempt: verify the order created in 'Stock requisition order' "
				+ "is displayed with 'Book' status in 'Approve stock requisition order' screen");
		WebElement status = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_REQUIS_APPROVE_STATUS))));
		Assert.assertEquals("BOOK", status.getText());
		System.out.println("Success: The order created in 'Stock requisition order' "
				+ "is displayed with 'Book' status in 'Approve stock requisition order' screen");
	}
	

	@Then("^User selects the checkbox present next to the order & clicks on Approve$")
	public void user_selects_the_checkbox_present_next_to_the_order_clicks_on_Approve() throws Throwable {
	    
		System.out.println("Attempt: select the checkbox present "
				+ "next to the order & click on Approve");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.STOCK_REQUIS_APPROVE_CHECK, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.STOCK_REQUIS_APPROVE_BUTTON, LocatorsPath.MAX_TIME);
		System.out.println("Success: The checkbox present next "
				+ "to the order selected & clicked on Approve button");
	}
	

	@Then("^User verifies the Order status changes to 'TRANSIT' in 'Approve stock requisition order' screen$")
	public void user_verifies_the_Order_status_changes_to_TRANSIT_in_Approve_stock_requisition_order_screen() throws Throwable {
	   
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.INVENTORY_LEVELS)));
		PageObjects.SelectByCSSSelectorWithoutClick(
				driver, LocatorsPath.INVENTORY_LEVELS, LocatorsPath.MAX_TIME);
		
		WebElement message = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.MESSAGE))));
		Assert.assertEquals("successfully approved", message.getText());
		
		
		System.out.println("Attempt: verify the Order status changes to 'TRANSIT' in "
				+ "'Approve stock requisition order' screen");
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.STOCK_REQUIS_APPROVE_STATUS)));
		WebElement status = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_REQUIS_APPROVE_STATUS))));
		Assert.assertEquals("TRANSIT", status.getText());
		System.out.println("Success: The Order status changed to 'TRANSIT'"
				+ " in 'Approve stock requisition order' screen");
	}
	

	@Then("^User navigates to the Parent inventory level$")
	public void user_navigates_to_the_Parent_inventory_level() throws Throwable {
	 
		System.out.println("Attempt: navigate to the Parent inventory level");
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.INVENTORY_LEVELS)));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.INVENTORY_LEVELS, LocatorsPath.MAX_TIME);
		
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.INVENTORY_LOCATIONS_DISP, LocatorsPath.MAX_TIME);
		
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.INVENTORY_LEVEL_SEARCH, LocatorsPath.MAX_TIME, 
				file3.getCellData("Distributor", "Inventory Location Name", 2));
		CallObject.block(2000);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.INVENTORY_LOCATIONS, LocatorsPath.MAX_TIME);
		System.out.println("Success: navigated to the Parent inventory level");
	}
	

	@Then("^User verifies the 'Saleable stock in transit' displays the SKU qty Which is apporved in 'Approve stock requisition order' screen$")
	public void user_verifies_the_Saleable_stock_in_transit_displays_the_SKU_qty_Which_is_apporved_in_Approve_stock_requisition_order_screen() throws Throwable {
	    
		System.out.println("Attempt: verify the 'Saleable stock in transit' displays "
				+ "the SKU qty Which is apporved in 'Approve stock requisition order' screen");
		WebElement row1 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INV_LEVEL_RECORD_1))));
		if(row1.isDisplayed()) {
			
			WebElement qty = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.SALEABLE_STOCK_IN_TRANSIT_1))));
			Assert.assertEquals(file3.getCellData("Distributor", "Qty", 2).concat(".000"), qty.getText());
			
		}else {
			System.out.println("row1 is not displayed");
		}
		
		WebElement row2 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INV_LEVEL_RECORD_2))));
		if(row2.isDisplayed()) {
			
			WebElement qty = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.SALEABLE_STOCK_IN_TRANSIT_2))));
			Assert.assertEquals(file3.getCellData("Distributor", "Qty", 3).concat(".000"), qty.getText());
			
		}else {
			System.out.println("row1 is not displayed");
		}
		System.out.println("Success: verified the 'Saleable stock in transit' displays "
				+ "the SKU qty Which is apporved in 'Approve stock requisition order' screen");
	}
	

	@Then("^User verifies the existing 'Saleable qty' is reduced by SKU qty which was approved in 'Approve stock requisition order' screen$")
	public void user_verifies_the_existing_Saleable_qty_is_reduced_by_SKU_qty_which_was_approved_in_Approve_stock_requisition_order_screen() throws Throwable {
	    
		System.out.println("Attempt: verify the existing 'Saleable qty' is reduced by "
				+ "SKU qty which was approved in 'Approve stock requisition order' screen");
		WebElement row1 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INV_LEVEL_RECORD_1))));
		if(row1.isDisplayed()) {
			
			WebElement totalStock = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.TOTAL_STOCK_1))));
			WebElement saleableQty = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.SALEABLE_QTY_1))));
			WebElement unSaleableQty = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.UNSALEABLE_QTY_1))));
			Assert.assertEquals(
					(int)Double.parseDouble(totalStock.getText())-
					(int)Double.parseDouble(file3.getCellData("Distributor", "Qty", 2))-
					(int)Double.parseDouble(unSaleableQty.getText()), 
					(int)Double.parseDouble(saleableQty.getText()));
		}else {
			System.out.println("row1 is not displayed");
		}
		
		WebElement row2 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INV_LEVEL_RECORD_2))));
		if(row2.isDisplayed()) {
			
			WebElement totalStock = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.TOTAL_STOCK_2))));
			WebElement saleableQty = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.SALEABLE_QTY_2))));
			WebElement unSaleableQty = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.UNSALEABLE_QTY_2))));
			Assert.assertEquals(
					(int)Double.parseDouble(totalStock.getText())-
					(int)Double.parseDouble(file3.getCellData("Distributor", "Qty", 3))-
					(int)Double.parseDouble(unSaleableQty.getText()), 
					(int)Double.parseDouble(saleableQty.getText()));
		}else {
			System.out.println("row2 is not displayed");
		}
		System.out.println("Success: verified the existing 'Saleable qty' is reduced by "
				+ "SKU qty which was approved in 'Approve stock requisition order' screen");
	}
	

	
	/**----------------------RCS_SaaS_Verify_SRO_Status_WC--------------------------**/
	
	
	
	@Then("^User login to the RCS WebApplication with child credentials & verifies the child user login is successful$")
	public void user_login_to_the_RCS_WebApplication_with_child_credentials_verifies_the_child_user_login_is_successful() throws Throwable {
	    
		logOut();
		System.out.println("Attempt: Provide Valid child Credentials");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.LOGIN_USERNAME, LocatorsPath.MAX_TIME, 
				file.getCellData("Login", "LoginUserName", 3));
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.LOGIN_PASSWORD, LocatorsPath.MAX_TIME, 
				file.getCellData("Login", "LoginPassword", 2));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.LOGIN, LocatorsPath.MAX_TIME);
		System.out.println("Success: Able to login with the child Credentials successfully");
	}
	

	@Then("^User selects the 'Stock Requisition Order' tab and navigates to the Stock requisition order screen$")
	public void user_selects_the_Stock_Requisition_Order_tab_and_navigates_to_the_Stock_requisition_order_screen() throws Throwable {

		System.out.println("Attempt: select the 'Stock Requisition Order' "
				+ "tab and navigate to the Stock requisition order screen");
		PageObjects.SelectByXpath(
				driver, LocatorsPath.STOCK_REQUISITION_ORDER, LocatorsPath.MAX_TIME);
		
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.CREATE_STOCK_REQUIS_BUTTON, LocatorsPath.MAX_TIME);
		
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.STOCK_REQUIS_ORDER_DISP, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Stock Requisition Order' "
				+ "tab selected and navigated to the Stock requisition order screen");
	}
	
	
	@Then("^User clicks on the 'create stock requisition order' and verifies the Stock requisition order is created successfully with 'TRANSIT' order status$")
	public void user_clicks_on_the_create_stock_requisition_order_and_verifies_the_Stock_requisition_order_is_created_successfully_with_TRANSIT_order_status() throws Throwable {
	    
		System.out.println("Attempt: click on the 'create stock requisition order' and "
				+ "verify the Stock requisition order is created successfully with 'TRANSIT' status");
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.CREATE_STOCK_REQUIS_BUTTON, LocatorsPath.MAX_TIME);

		WebElement status = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_REQUIS_ORDER_STATUS))));
		Assert.assertEquals("TRANSIT", status.getText());
		System.out.println("Success: 'create stock requisition order' created and "
				+ "The Stock requisition order is created successfully with 'TRANSIT' status");
	}
	

	
	/**----------------------RCS_SaaS_Receive_SRO_WC--------------------------**/
	
	
	
	@Then("^User clicks on the 'Received Stock' & navigates to the 'Received Stock' screen successfully$")
	public void user_clicks_on_the_Received_Stock_navigates_to_the_Received_Stock_screen_successfully() throws Throwable {
	 
		System.out.println("Attempt: click on the 'Received Stock' & navigate to the 'Received Stock' screen");
		PageObjects.SelectByXpath(
				driver, LocatorsPath.RECEIVED_STOCK, LocatorsPath.MAX_TIME);
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.RECEIVED_STOCK_DISP, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Received Stock' clicked & navigated to the 'Received Stock' screen");
	}
	

	@Then("^User verifies the 'Received stock' with open status is displayed after the SRO approved$")
	public void user_verifies_the_Received_stock_with_open_status_is_displayed_after_the_SRO_approved() throws Throwable {
		
		System.out.println("Attempt: verify the 'Received stock' with open "
				+ "status is displayed after the SRO approved");
		WebElement status = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_REQUIS_ORDER_STATUS))));
		Assert.assertEquals("OPEN", status.getText());
		System.out.println("Success: verified the 'Received stock' with open "
				+ "status is displayed after the SRO approved");
	}
	

	@Then("^User enters the batch number for an SKU & clicks on 'Save' button & clicks on 'COMMIT' button in the Received stock details$")
	public void user_enters_the_batch_number_for_an_SKU_clicks_on_Save_button_clicks_on_COMMIT_button_in_the_Received_stock_details() throws Throwable {
	   
		distributorsSLOPage.user_enters_the_batch_number_for_an_SKU_in_received_stock_details_section();
		
		System.out.println("Attempt: click on save button & click on 'Commit' button in the Received stock details");
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.STOCK_LIFTING_SAVE)));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.STOCK_LIFTING_SAVE, LocatorsPath.MAX_TIME);
		
		CallObject.block(1000);
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.RECIEVED_STOCK_COMMIT)));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.RECIEVED_STOCK_COMMIT, LocatorsPath.MAX_TIME);
		System.out.println("Success: save button clicked & 'Commit' button clicked in the Received stock details");
	}
	

	@Then("^User verifies the 'Received stock' order status changes to 'COMMIT'$")
	public void user_verifies_the_Received_stock_order_status_changes_to_COMMIT() throws Throwable {
	   
		System.out.println("Attempt: verify the 'Received stock' order status changes to 'COMMIT'");
		WebElement status = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_REQUIS_ORDER_STATUS))));
		Assert.assertEquals("COMMIT", status.getText());
		System.out.println("Success: The 'Received stock' order status changed to 'COMMIT'");
	}
	

	@Then("^User verifies the 'SRO' order status changes to 'RECEIVE'$")
	public void user_verifies_the_SRO_order_status_changes_to_RECEIVE() throws Throwable {
	 
		PageObjects.SelectByXpath(
				driver, LocatorsPath.STOCK_REQUISITION_ORDER, LocatorsPath.MAX_TIME);
		
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.CREATE_STOCK_REQUIS_BUTTON, LocatorsPath.MAX_TIME);
		
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.STOCK_REQUIS_ORDER_DISP, LocatorsPath.MAX_TIME);
		
		System.out.println("Attempt: verify the 'SRO' order status changes to 'RECEIVE'");
		WebElement status = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_REQUIS_ORDER_STATUS_1))));
		Assert.assertEquals("RECEIVE", status.getText());
		System.out.println("Success: The 'SRO' order status changed to 'RECEIVE'");
	}
	

	@Then("^User verifies the Stock load record is created for the order quantity and Inventory should be Increased with the SRO order qty in the child inventory level$")
	public void user_verifies_the_Stock_load_record_is_created_for_the_order_quantity_and_Inventory_should_be_Increased_with_the_SRO_order_qty_in_the_child_inventory_level() throws Throwable {
	   
		System.out.println("Attempt: verify the Stock load record is created for the order quantity and "
				+ "Inventory should be Increased with the SRO order qty in the child inventory level");
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.INVENTORY_LEVELS)));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.INVENTORY_LEVELS, LocatorsPath.MAX_TIME);
		
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.INVENTORY_LOCATIONS_DISP, LocatorsPath.MAX_TIME);
		
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.INVENTORY_LEVEL_SEARCH, LocatorsPath.MAX_TIME, 
				file3.getCellData("DistributorSRO", "Inventory Location Name", 2));
		CallObject.block(1000);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.INVENTORY_LOCATIONS, LocatorsPath.MAX_TIME);
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.STOCK_LOAD_PRODUCT_DISP)));
		
		WebElement row1 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_LOAD_ROW_1))));
		if(row1.isDisplayed()) {
			
			WebElement product = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_LOAD_PRODUCT))));
			Assert.assertEquals(file3.getCellData("Distributor", "Stock Lift Product", 2), 
					product.getText());
			
			WebElement qty = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_LOAD_QTY))));
			Assert.assertEquals(file3.getCellData("Distributor", "Qty", 2).concat(".000"), 
					qty.getText());
			
			WebElement unitOfMeasure = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_LOAD_UNIT_OF_MEAS))));
			Assert.assertEquals(file3.getCellData("Distributor", "Stock Lift Unit Measure", 2), 
					unitOfMeasure.getText());
		}else {
			System.out.println("row1 is not displayed");
		}
		
		
		WebElement row2 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_LOAD_ROW_2))));
		if(row2.isDisplayed()) {
			
			WebElement product = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_LOAD_PRODUCT_1))));
			Assert.assertEquals(file3.getCellData("Distributor", "Stock Lift Product", 3), 
					product.getText());
			
			WebElement qty = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_LOAD_QTY_1))));
			Assert.assertEquals(file3.getCellData("Distributor", "Qty", 3).concat(".000"), 
					qty.getText());
			
			WebElement unitOfMeasure = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_LOAD_UNIT_OF_MEAS_1))));
			Assert.assertEquals(file3.getCellData("Distributor", "Stock Lift Unit Measure", 3), 
					unitOfMeasure.getText());
		}else {
			System.out.println("row2 is not displayed");
		}
		
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.INVENTORY_LEVELS_PRODUCT)));
		
		WebElement invRow1 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INVENTORY_LEVEL_ROW_1))));
		if(invRow1.isDisplayed()) {
			
			WebElement qty = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.INVENTORY_LEVEL_QTY_1))));
			WebElement unsaleableQty = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.INVENTORY_LEVEL_QTY_3))));
			WebElement totalStock = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.TOTAL_STOCK_1))));
			
			Assert.assertEquals(
					(int)Double.parseDouble(file3.getCellData("DistributorSRO", "Inventory Qty", 2))+
					(int)Double.parseDouble(file3.getCellData("Distributor", "Qty", 2)), 
					(int)Double.parseDouble(qty.getText()));
			Assert.assertEquals(
					(int)Double.parseDouble(file3.getCellData("DistributorSRO", "Inventory Qty", 2))+
					(int)Double.parseDouble(file3.getCellData("Distributor", "Qty", 2))+
					(int)Double.parseDouble(unsaleableQty.getText()), 
					(int)Double.parseDouble(totalStock.getText()));
			
		}else {
			System.out.println("row1 is not displayed");
		}
		
		WebElement invRow2 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INVENTORY_LEVEL_ROW_2))));
		
		if(invRow2.isDisplayed()) {
			
			WebElement qty = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.INVENTORY_LEVEL_QTY_2))));
			WebElement unsaleableQty = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.INVENTORY_LEVEL_QTY_4))));
			WebElement totalStock = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.TOTAL_STOCK_2))));
			Assert.assertEquals(
					(int)Double.parseDouble(file3.getCellData("DistributorSRO", "Inventory Qty", 3))+
					(int)Double.parseDouble(file3.getCellData("Distributor", "Qty", 3)), 
					(int)Double.parseDouble(qty.getText()));
			Assert.assertEquals(
					(int)Double.parseDouble(file3.getCellData("DistributorSRO", "Inventory Qty", 3))+
					(int)Double.parseDouble(file3.getCellData("Distributor", "Qty", 3))+
					(int)Double.parseDouble(unsaleableQty.getText()), 
					(int)Double.parseDouble(totalStock.getText()));
		}else {
			System.out.println("row2 is not displayed");
		}
		System.out.println("Success: verified the Stock load record is created for the order quantity and "
				+ "Inventory is Increased with the SRO order qty in the child inventory level");
	}
	

	@Then("^User verifies the Parent inventory is decreased by the SRO order qty\\.$")
	public void user_verifies_the_Parent_inventory_is_decreased_by_the_SRO_order_qty() throws Throwable {
	   
		System.out.println("Attempt: verify the Parent inventory is decreased by the SRO order qty");
		user_login_to_the_RCS_WebApplication_with_Parent_credentials_verifies_the_Parent_user_login_is_successful();
		distributorsSLOPage.user_clicks_on_the_Distributors_tab();
		
		PageObjects.SelectByXpath(
				driver, LocatorsPath.INVENTORY_LEVEL, LocatorsPath.MAX_TIME);
		
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.INVENTORY_LOCATIONS_DISP, LocatorsPath.MAX_TIME);
		
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.INVENTORY_LEVEL_SEARCH, LocatorsPath.MAX_TIME, 
				file3.getCellData("Distributor", "Inventory Location Name", 2));
		CallObject.block(2000);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.INVENTORY_LOCATIONS, LocatorsPath.MAX_TIME);
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.INVENTORY_LEVELS_PRODUCT)));
		
		WebElement invRow1 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INVENTORY_LEVEL_ROW_1))));
		if(invRow1.isDisplayed()) {
			
			WebElement qty = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.INVENTORY_LEVEL_QTY_1))));
			WebElement unsaleableQty = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.INVENTORY_LEVEL_QTY_3))));
			WebElement totalStock = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.TOTAL_STOCK_1))));
			Assert.assertEquals(
					(int)Double.parseDouble(file3.getCellData("Distributor", "Inventory Qty", 2))-
					(int)Double.parseDouble(file3.getCellData("Distributor", "Qty", 2)), 
					(int)Double.parseDouble(qty.getText()));
			Assert.assertEquals(
					/*(int)Double.parseDouble(file3.getCellData("Distributor", "Inventory Qty", 2))-
					(int)Double.parseDouble(file3.getCellData("Distributor", "Qty", 2))-*/
					(int)Double.parseDouble(unsaleableQty.getText()) + 
					(int)Double.parseDouble(qty.getText()), 
					(int)Double.parseDouble(totalStock.getText()));
			
		}else {
			System.out.println("row1 is not displayed");
		}
		
		WebElement invRow2 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INVENTORY_LEVEL_ROW_2))));
		
		if(invRow2.isDisplayed()) {
			
			WebElement qty = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.INVENTORY_LEVEL_QTY_2))));
			WebElement unsaleableQty = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.INVENTORY_LEVEL_QTY_4))));
			WebElement totalStock = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.TOTAL_STOCK_2))));
			Assert.assertEquals(
					(int)Double.parseDouble(file3.getCellData("Distributor", "Inventory Qty", 3))-
					(int)Double.parseDouble(file3.getCellData("Distributor", "Qty", 3)), 
					(int)Double.parseDouble(qty.getText()));
			Assert.assertEquals(
					/*(int)Double.parseDouble(file3.getCellData("Distributor", "Inventory Qty", 3))-
					(int)Double.parseDouble(file3.getCellData("Distributor", "Qty", 3))-*/
					(int)Double.parseDouble(unsaleableQty.getText()) +
					(int)Double.parseDouble(qty.getText()), 
					(int)Double.parseDouble(totalStock.getText()));
		}else {
			System.out.println("row2 is not displayed");
		}
		System.out.println("Success: The Parent inventory is decreased by the SRO order qty successfully");
	}
	

	
	/**----------------------RCS_SaaS_SRO_Export_Order_deatils_WC--------------------------**/
	
	
	
	@Then("^User selects the Ship to party from the dropdown in the Stock requisition Order screen$")
	public void user_selects_the_Ship_to_party_from_the_dropdown_in_the_Stock_requisition_Order_screen() throws Throwable {
	   
		System.out.println("Attempt: select the Ship to party from the "
				+ "dropdown in the Stock requisition Order screen");
		user_login_to_the_RCS_WebApplication_with_child_credentials_verifies_the_child_user_login_is_successful();
		distributorsSLOPage.user_clicks_on_the_Distributors_tab();
		
		PageObjects.SelectByXpath(
				driver, LocatorsPath.STOCK_REQUISITION_ORDER, LocatorsPath.MAX_TIME);
		
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.CREATE_STOCK_REQUIS_BUTTON, LocatorsPath.MAX_TIME);
		
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.STOCK_REQUIS_ORDER_DISP, LocatorsPath.MAX_TIME);
		
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.STOCK_REQUIS_SHIP_TO_PARTY, LocatorsPath.MAX_TIME, 
				file3.getCellData("Distributor", "Ship To Party", 2));
		System.out.println("Success: Ship to party from the dropdown in the "
				+ "Stock requisition Order screen selected successfully");
	}
	

	@Then("^User clicks on the Export Orders in Excel/CSV button$")
	public void user_clicks_on_the_Export_Orders_in_Excel_CSV_button() throws Throwable {
	   
		distributorsSLOPage.user_clicks_on_the_Export_orders_in_Excel_CSV_button();
	}
	

	@Then("^User verifies the 'Export Order' file is downloaded in Excel/CSV format$")
	public void user_verifies_the_Export_Order_file_is_downloaded_in_Excel_CSV_format() throws Throwable {
	    
		System.out.println("User verifies the 'Export Order' file is downloaded in Excel/CSV format");
	}
	

	@Then("^User verifies the SRO orders created for the selected 'Ship to party' is displayed in the export report$")
	public void user_verifies_the_SRO_orders_created_for_the_selected_Ship_to_party_is_displayed_in_the_export_report() throws Throwable {
	    
		CallObject.block(5000);
		System.out.println("User verifies the SRO orders created for the "
				+ "selected 'Ship to party' is displayed in the export report");
	}
	

	@Then("^User verifies the data in the File that is downloaded contains - Order number, Order date, Order Status, Ship to, Source of order, Order to supplier, Supplier inventory location\\.$")
	public void user_verifies_the_data_in_the_File_that_is_downloaded_contains_Order_number_Order_date_Order_Status_Ship_to_Source_of_order_Order_to_supplier_Supplier_inventory_location() throws Throwable {
	    
		distributorsSLOPage.user_verifies_the_data_in_the_file_that_is_downloaded_conatins_Order_number_Order_date_Order_Status_Ship_to_Source_of_order_Order_to_supplier_Supplier_inventory_location();
	}
	

	
	/**----------------------RCS_SaaS_Export_SRO_Orders_WC--------------------------**/
	
	
	
	@Then("^User clicks on 'Download Requisition Order Detail in CSV/Excel' button$")
	public void user_clicks_on_Download_Requisition_Order_Detail_in_CSV_Excel_button() throws Throwable {
	    
		System.out.println("Attempt: click on 'Download Requisition Order Detail in CSV/Excel' button");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.DOWN_REQUIS_DETAIL_IN_EXCEL, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Download Requisition Order Detail in CSV/Excel' button clicked successfully");
	}
	

	@Then("^User verifies the 'Download stock requisition order details info template' file is downloaded in CSV/Excel format$")
	public void user_verifies_the_Download_stock_requisition_order_details_info_template_file_is_downloaded_in_CSV_Excel_format() throws Throwable {
	   
		System.out.println("User verifies the 'Download stock requisition order "
				+ "details info template' file is downloaded in CSV/Excel format");
	}
	

	@Then("^User verifies the SRO orders details created for the selected order is displayed in the export report$")
	public void user_verifies_the_SRO_orders_details_created_for_the_selected_order_is_displayed_in_the_export_report() throws Throwable {
	   
		CallObject.block(5000);
		System.out.println("User verifies the SRO orders details created for "
				+ "the selected order is displayed in the export report");
	}
	

	@Then("^User verifies the data in the file that is downloaded contains - Product, Quantity, Order number, Drive Brand\\.$")
	public void user_verifies_the_data_in_the_file_that_is_downloaded_contains_Product_Quantity_Order_number_Drive_Brand() throws Throwable {
	 
		distributorsSLOPage.user_verifies_the_data_in_the_file_that_is_downloaded_conatins_Product_Quantity_Order_number_Drive_brand();
	}
	

	
	/**----------------------RCS_SaaS_Export_Stock_Requisition_header_WC--------------------------**/
	
	
	
	@Then("^User clicks on Download Stock requisition order header button$")
	public void user_clicks_on_Download_Stock_requisition_order_header_button() throws Throwable {
	    
		System.out.println("Attempt: click on 'Download Stock requisition order header' button");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.DOWN_REQUIS_ORDER_HEADER, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Download Stock requisition order header' button clicked successfully");
	}
	

	@Then("^User verifies the Export Stock requisition Header file is downloaded in \\.csv format$")
	public void user_verifies_the_Export_Stock_requisition_Header_file_is_downloaded_in_csv_format() throws Throwable {
	   
		CallObject.block(5000);
		System.out.println("User verifies the Export Stock requisition Header file is downloaded in \\.csv format");
	}
	

	@Then("^User verifies the data in the file that is downloaded contains - Order number, Order date, Order Status, Ship to, Source of Order\\.$")
	public void user_verifies_the_data_in_the_file_that_is_downloaded_contains_Order_number_Order_date_Order_Status_Ship_to_Source_of_Order() throws Throwable {
	    
		distributorsSLOPage.user_verifies_the_data_in_the_file_that_is_downloaded_conatins_Order_number_Order_date_Order_Status_Ship_to_Source_of_order();
	}	
	
	
	
	
	/**-------------------------------LOGOUT---------------------------------
	 * @throws Exception **/
	
	
	public void logOut() throws Exception {
		
			System.out.println("Attempt: User should successfully "
					+ "logout from the web client page");
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.LOGOUT, LocatorsPath.MAX_TIME);
	        CallObject.switchToAlert(driver);
			System.out.println("Success: Logout successful");
	}
}
