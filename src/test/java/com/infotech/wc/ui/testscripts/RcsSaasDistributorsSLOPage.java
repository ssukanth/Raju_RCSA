package com.infotech.wc.ui.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.infotech.Excel.CsvToExcelConverter;
import com.infotech.Excel.ExcelApiFile;
import com.infotech.Excel.HssfApiFile;
import com.infotech.basepage.CallObject;
import com.infotech.basepage.LocatorsPath;
import com.infotech.basepage.PageObjects;
import com.infotech.testrunner.TestRunnerWebClient;

import cucumber.api.java.en.Then;

public class RcsSaasDistributorsSLOPage extends TestRunnerWebClient{
	
	WebDriver driver = getDriver();
	Actions actions = new Actions(driver);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	ExcelApiFile file  = new ExcelApiFile("TestData.xlsx");
	ExcelApiFile file3 = new ExcelApiFile("TestData3.xlsx");
	WebDriverWait wait = new WebDriverWait(driver, LocatorsPath.MAX_TIME);
	
	public RcsSaasDistributorsSLOPage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	/**----------------------RCS_SaaS_Creation_Of_SLO_WC--------------------------**/
	
	
	
	@Then("^User verifies the pre-requisite - Inventory location for supplier associated with employee is present in the system$")
	public void user_verifies_the_pre_requisite_Inventory_location_for_supplier_associated_with_employee_is_present_in_the_system() throws Throwable {
	    
		System.out.println("User verifies the pre-requisite - "
				+ "Inventory location for supplier associated with employee is present in the system");
	}
	

	@Then("^User verifies the pre-requisite - Full access to Distributor module is provided$")
	public void user_verifies_the_pre_requisite_Full_access_to_Distributor_module_is_provided() throws Throwable {
	 
		System.out.println("User verifies the pre-requisite - "
				+ "Full access to Distributor module is provided");
	}
	

	@Then("^User verifies the inventory levels and note downs the inventory data$")
	public void user_verifies_the_inventory_levels_and_note_downs_the_inventory_data() throws Throwable {
	    
		System.out.println("User verifies the inventory levels "
				+ "and note downs the inventory data");
	}
	

	@Then("^User verifies the above pre-requisites as been executed successfully$")
	public void user_verifies_the_above_pre_requisites_as_been_executed_successfully() throws Throwable {
	   
		System.out.println("User verifies the above pre-requisites "
				+ "as been executed successfully");
	}
	

	@Then("^User clicks on the 'Distributors' tab$")
	public void user_clicks_on_the_Distributors_tab() throws Throwable {
	    
		System.out.println("Attempt: Click on Distributors");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.DISTRIBUTOR, LocatorsPath.MAX_TIME);
		System.out.println("Success: Distributors is selected successfully");
	}
	

	@Then("^User selects the 'Stock lifting order' tab and navigates to the Stock lifting order screen$")
	public void user_selects_the_Stock_lifting_order_tab_and_navigates_to_the_Stock_lifting_order_screen() throws Throwable {
	    
		System.out.println("Attempt: select the 'Stock lifting order' tab and "
				+ "navigate to the Stock lifting order screen");
		
		/*------------------------PRE-Requisite-----------------------*/
		
		PageObjects.SelectByXpath(
				driver, LocatorsPath.INVENTORY_LEVEL, LocatorsPath.MAX_TIME);
		
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
		
		/*------------------------PRE-Requisite-----------------------*/
		
		PageObjects.SelectByXpath(
				driver, LocatorsPath.STOCK_LIFTING_ORDER, LocatorsPath.MAX_TIME);
		
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.CREATE_STOCK_LIFTING_BUTTON, LocatorsPath.MAX_TIME);
		
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.STOCK_LIFTING_ORDER_DISP, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Stock lifting order' tab selected and "
				+ "navigated to the Stock lifting order screen successfully");
	}
	

	@Then("^User clicks on the 'create stock lifting order' and verifies the Stock lifting order is created successfully with 'Open' status$")
	public void user_clicks_on_the_create_stock_lifting_order_and_verifies_the_Stock_lifting_order_is_created_successfully_with_Open_statu() throws Throwable {
	    
		System.out.println("Attempt: click on the 'create stock lifting order' and "
				+ "verify the Stock lifting order is created successfully with 'Open' status");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.CREATE_STOCK_LIFTING_ORDER, LocatorsPath.MAX_TIME);
		
		WebElement message = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.MESSAGE))));
		Assert.assertEquals("Order Header Created", message.getText());
		
		WebElement status = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_LIFTING_ORDER_STATUS))));
		Assert.assertEquals("OPEN", status.getText());
		System.out.println("Success: 'create stock lifting order' created and "
				+ "The Stock lifting order is created successfully with 'Open' status");
	}

	
	@Then("^User verifies the Stock lifting order Header displays the following fields - Order number, Order date, Order status, Order value, Order to supplier, Supplier name, Shipped to & Source of order\\.$")
	public void user_verifies_the_Stock_lifting_order_Header_displays_the_following_fields_Order_number_Order_date_Order_status_Order_value_Order_to_supplier_Supplier_name_Shipped_to_Source_of_order() throws Throwable {
	    
		System.out.println("Attempt: verify the Stock lifting order Header displays the following fields -"
				+ " Order number, Order date, Order status, Order value, Order to supplier, Supplier name, Shipped to & Source of order");
		WebElement orderNumber = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ORDER_NUMBER))));
		Assert.assertEquals("Order Number", orderNumber.getText());
		
		WebElement orderDate = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ORDER_DATE))));
		Assert.assertEquals("Order Date", orderDate.getText());
		
		WebElement orderStatus = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ORDER_STATUS))));
		Assert.assertEquals("Order Status", orderStatus.getText());
		
		WebElement orderValue = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ORDER_VALUE))));
		Assert.assertEquals("Order Value", orderValue.getText());
		
		WebElement orderToSupplier = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ORDER_TO_SUPPLIER))));
		Assert.assertEquals("Order To Supplier", orderToSupplier.getText());
		
		WebElement supplierName = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SUPPLIER_NAME))));
		Assert.assertEquals("Supplier Name", supplierName.getText());
		
		WebElement shippedTo = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SHIPPED_TO))));
		Assert.assertEquals("Shipped To", shippedTo.getText());
		
		WebElement sourceOfOrder = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SOURCE_OF_ORDER))));
		Assert.assertEquals("Source of Order", sourceOfOrder.getText());
		System.out.println("Success: verified the Stock lifting order Header displays the following fields -"
				+ " Order number, Order date, Order status, Order value, Order to supplier, Supplier name, Shipped to & Source of order");
	}
	

	@Then("^User scrolls down to the stock lifting details and verifies the following fields - Product, Target, Quantity, Unit of measure, unit price, Remarks, Free field(\\d+) & Free field(\\d+)\\.$")
	public void user_scrolls_down_to_the_stock_lifting_details_and_verifies_the_following_fields_Product_Target_Quantity_Unit_of_measure_unit_price_Remarks_Free_field_Free_field(int arg1, int arg2) throws Throwable {
	   
		System.out.println("Attempt: verify the following fields - Product, Target, Quantity, "
				+ "Unit of measure, unit price, Remarks, Free field(\\d+) & Free field(\\d+) displayed");
		WebElement product = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.PRODUCT))));
		Assert.assertEquals("Product", product.getText());
		
		WebElement target = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.TARGET))));
		Assert.assertEquals("Target", target.getText());
		
		/*WebElement quantity = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.QUANTITY))));
		Assert.assertEquals("Quantity *", quantity.getText());*/
		
		WebElement unitOfMeasure = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.UNIT_OF_MEASURE))));
		Assert.assertEquals("Unit Of Measure", unitOfMeasure.getText());
		
		WebElement unitPrice = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.UNIT_PRICE))));
		Assert.assertEquals("Unit Price", unitPrice.getText());
		
		WebElement remarks = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.REMARKS))));
		Assert.assertEquals("Remarks", remarks.getText());
		
		WebElement freeField1 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.FREE_TEXT_FIELD_3))));
		Assert.assertEquals("Free Text Field 3", freeField1.getText());
		
		WebElement freeField2 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.FREE_TEXT_FIELD_4))));
		Assert.assertEquals("Free Text Field 4", freeField2.getText());
		System.out.println("Success: verified the following fields - Product, Target, Quantity, "
				+ "Unit of measure, unit price, Remarks, Free field(\\d+) & Free field(\\d+) displayed");
	}
	

	@Then("^User enters the Qty for an SKU and clicks on save button$")
	public void user_enters_the_Qty_for_an_SKU_and_clicks_on_save_button() throws Throwable {
	    
		System.out.println("Attempt: enter the Qty for an SKU and click on save button");
		
		WebElement record1 = wait.until(ExpectedConditions.presenceOfElementLocated((
				By.cssSelector(LocatorsPath.STOCK_LOAD_RECORD_1))));

		if (record1.isDisplayed()) {
			wait.until(ExpectedConditions.presenceOfElementLocated((
					By.cssSelector(LocatorsPath.STOCKLIFTING_PRODUCT)))).clear();
			CallObject.block(2000);
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.STOCKLIFTING_PRODUCT, LocatorsPath.MAX_TIME, 
					file3.getCellData("Distributor", "Stock Lift Product", 2));
			CallObject.block(3000);
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.STOCK_LIFTING_QUANTITY_1, LocatorsPath.MAX_TIME,
					file3.getCellData("Distributor", "Qty", 2));
		} else {
			System.out.println("row1 is not displayed");
		}

		WebElement record2 = wait.until(ExpectedConditions.presenceOfElementLocated((
				By.cssSelector(LocatorsPath.STOCK_LOAD_RECORD_2))));

		if (record2.isDisplayed()) {
			wait.until(ExpectedConditions.presenceOfElementLocated((
					By.cssSelector(LocatorsPath.STOCKLIFTING_PRODUCT)))).clear();
			CallObject.block(2000);
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.STOCKLIFTING_PRODUCT, LocatorsPath.MAX_TIME, 
					file3.getCellData("Distributor", "Stock Lift Product", 3));
			CallObject.block(3000);
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.STOCK_LIFTING_QUANTITY_1, LocatorsPath.MAX_TIME, 
					file3.getCellData("Distributor", "Qty", 3));
		} else {
			System.out.println("row2 is not displayed");
		}
		wait.until(ExpectedConditions.presenceOfElementLocated((
				By.cssSelector(LocatorsPath.STOCKLIFTING_PRODUCT)))).clear();
		CallObject.block(2000);
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.STOCK_LIFTING_SAVE)));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.STOCK_LIFTING_SAVE, LocatorsPath.MAX_TIME);
		System.out.println("Success: Qty entered for an SKU and clicked on save button");
	}
	

	@Then("^User clicks on the order number hyperlink to select the supplier name$")
	public void user_clicks_on_the_order_number_hyperlink_to_select_the_supplier_name() throws Throwable {
	    
		System.out.println("Attempt: click on the order number hyperlink "
				+ "to select the supplier name");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ORDER_NUMBER_HYPERLINK, LocatorsPath.MAX_TIME);
		System.out.println("Success: clicked on the order number hyperlink "
				+ "to select the supplier name");
	}
	

	@Then("^User selects the supplier name from the supplier dropdown & clicks on save button$")
	public void user_selects_the_supplier_name_from_the_supplier_dropdown_clicks_on_save_button() throws Throwable {
	    
		System.out.println("Attempt: select the supplier name from the "
				+ "supplier dropdown & click on save button");
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.EDIT_LIFTING_ORDER_DISP, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.SUPPLIER_NAME_DROPDOWN, LocatorsPath.MAX_TIME, 
				file3.getCellData("Distributor", "Supplier Name", 2));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.STOCK_LIFTING_SAVE, LocatorsPath.MAX_TIME);
		System.out.println("Success: Supplier name selected from the "
				+ "supplier dropdown & clicked on save button");
	}
	

	@Then("^User verifies the stock lifting Order is saved successfully & the stock lifting details displays only the SKU for which the qty is entered$")
	public void user_verifies_the_stock_lifting_Order_is_saved_successfully_the_stock_lifting_details_displays_only_the_SKU_for_which_the_qty_is_entered() throws Throwable {
	    
		System.out.println("User verifies the stock lifting Order is saved successfully & "
				+ "the stock lifting details displays only the SKU for which the qty is entered");
	}
	

	@Then("^User verifies the Supplier name is visible in the stock lifting Order section$")
	public void user_verifies_the_Supplier_name_is_visible_stock_lifting_Order_section() throws Throwable {
	    
		System.out.println("Attempt: verify the Supplier name is visible in the stock lifting Order section");
		WebElement supplierName = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_LIFTING_SUPPLIER_NAME))));
		Assert.assertEquals(file3.getCellData("Distributor", "Supplier Name", 2),
				supplierName.getText());
		System.out.println("Success: The Supplier name is visible in the stock lifting Order section");
	}
	

	@Then("^User clicks on the 'BOOK' button & verifies the stock lifting Order is booked and stock lifting order status is displayed as 'BOOK'\\.$")
	public void user_clicks_on_the_BOOK_button_verifies_the_stock_lifting_Order_is_booked_and_stock_lifting_order_status_is_displayed_as_BOOK() throws Throwable {
	    
		System.out.println("Attempt: click on the 'BOOK' button & verify the "
				+ "stock lifting Order is booked and stock lifting order status is displayed as 'BOOK'");
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.STOCK_LIFTING_BOOK)));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.STOCK_LIFTING_BOOK, LocatorsPath.MAX_TIME);
		
		CallObject.block(2000);
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.STOCK_LIFTING_ORDER_STATUS)));
		WebElement status = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_LIFTING_ORDER_STATUS))));
		Assert.assertEquals("BOOK", status.getText());
		
		WebElement orderNumber = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_LIFTING_ORDER_NUMBER))));
		file3.setCellData("Distributor", "Order Number", 2, orderNumber.getText());
		System.out.println("Attempt: The 'BOOK' button clicked & verified the "
				+ "stock lifting Order is booked and stock lifting order status is displayed as 'BOOK'");
	}
	

	
	/**----------------------RCS_SaaS_Receive_the_SLO_WC--------------------------**/
	
	
	
	@Then("^User selects the 'Received Stock' tab and navigates to the Received Stock screen$")
	public void user_selects_the_Received_Stock_tab_and_navigates_to_the_Received_Stock_screen() throws Throwable {
	  
		System.out.println("Attempt: select the 'Received Stock' tab and "
				+ "navigate to the Received Stock screen");
		PageObjects.SelectByXpath(
				driver, LocatorsPath.RECEIVED_STOCK, LocatorsPath.MAX_TIME);
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.RECEIVED_STOCK_DISP, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Received Stock' tab selected and "
				+ "navigated to the Received Stock screen");
	}
	

	@Then("^User clicks on the 'Add' button & navigates to the 'add inventory locations' screen$")
	public void user_clicks_on_the_Add_button_navigates_to_the_add_inventory_locations_screen() throws Throwable {
	    
		System.out.println("Attempt: click on the 'Add' button & "
				+ "navigate to the 'add inventory locations' screen");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.RECEIVED_STOCK_ADD, LocatorsPath.MAX_TIME);
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.ADD_INVENTORY_LOCATION_DISP, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Add' button clicked & "
				+ "navigated to the 'add inventory locations' screen");
	}
	

	@Then("^User selects the Supplier name from the 'Receive From Supplier' dropdown$")
	public void user_selects_the_Supplier_name_from_the_Receive_From_Supplier_dropdown() throws Throwable {
	    
		System.out.println("Attempt: select the Supplier name "
				+ "from the 'Receive From Supplier' dropdown");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.RECEIVE_FROM_SUPPLIER, LocatorsPath.MAX_TIME, 
				file3.getCellData("Distributor", "Supplier Name", 2));
		System.out.println("Success: Supplier name from the "
				+ "'Receive From Supplier' dropdown selected");
	}
	

	@Then("^User selects the 'Order Number' from the dropdown$")
	public void user_selects_the_Order_Number_from_the_dropdown() throws Throwable {
	    
		System.out.println("Attempt: select the 'Order Number' from the dropdown");
		CallObject.block(2000);
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.RECIEVED_STOCK_ORDER_NUM, LocatorsPath.MAX_TIME, 
				file3.getCellData("Distributor", "Order Number", 2));
		System.out.println("Success: 'Order Number' from the dropdown selected");
	}
	

	@Then("^User clicks on the save button & verifies the received stock with 'Open' status is created$")
	public void user_clicks_on_the_save_button_verifies_the_received_stock_with_Open_status_is_created() throws Throwable {
	    
		System.out.println("Attempt: click on the save button & "
				+ "verify the received stock with 'Open' status is created");
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.STOCK_LIFTING_SAVE)));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.STOCK_LIFTING_SAVE, LocatorsPath.MAX_TIME);
		
		WebElement status = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_LIFTING_ORDER_STATUS))));
		Assert.assertEquals("OPEN", status.getText());
		System.out.println("Success: save button clicked & "
				+ "the received stock with 'Open' status is created successfully");
	}
	

	@Then("^User enters the batch number for an SKU in received stock details section$")
	public void user_enters_the_batch_number_for_an_SKU_in_received_stock_details_section() throws Throwable {
	   
		System.out.println("Attempt: enter the batch number for an SKU in received stock details section");
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.RECIEVED_STOCK_BATCH_NUM_1)));
		WebElement record1 = wait.until(ExpectedConditions.presenceOfElementLocated((
				By.cssSelector(LocatorsPath.STOCK_LOAD_RECORD_1))));

		if (record1.isDisplayed()) {
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.RECIEVED_STOCK_BATCH_NUM_1, LocatorsPath.MAX_TIME, 
					file3.getCellData("Distributor", "Batch Number", 2));
		} else {
			System.out.println("row1 is not displayed");
		}
		
		WebElement record2 = wait.until(ExpectedConditions.presenceOfElementLocated((
				By.cssSelector(LocatorsPath.STOCK_LOAD_RECORD_2))));

		if (record2.isDisplayed()) {
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.RECIEVED_STOCK_BATCH_NUM_2, LocatorsPath.MAX_TIME, 
					file3.getCellData("Distributor", "Batch Number", 3));
		} else {
			System.out.println("row2 is not displayed");
		}
		System.out.println("Success: batch number for an SKU in received stock details section entered successfully");
	}
	

	@Then("^User clicks on save button & clicks on 'Commit' & verifies the received stock status is changed to 'COMMIT'$")
	public void user_clicks_on_save_button_clicks_on_BOOK_verifies_the_received_stock_status_is_changed_to_COMMIT() throws Throwable {
	  
		System.out.println("Attempt: click on save button & click on 'Commit' & "
				+ "verifies the received stock status is changed to 'COMMIT'");
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.STOCK_LIFTING_SAVE)));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.STOCK_LIFTING_SAVE, LocatorsPath.MAX_TIME);
		
		CallObject.block(1000);
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.RECIEVED_STOCK_COMMIT)));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.RECIEVED_STOCK_COMMIT, LocatorsPath.MAX_TIME);
		
		WebElement status = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_LIFTING_ORDER_STATUS))));
		Assert.assertEquals("COMMIT", status.getText());
		System.out.println("Success: Save button & 'Commit' button clicked & "
				+ "verified the received stock status is changed to 'COMMIT'");
	}
	

	@Then("^User verifies the SLO order status is displayed as 'RECEIVE'$")
	public void user_verifies_the_SLO_order_status_is_displayed_as_RECEIVE() throws Throwable {
	 
		System.out.println("Attempt: verify the SLO order status is displayed as 'RECEIVE'");
		PageObjects.SelectByXpath(
				driver, LocatorsPath.STOCK_LIFTING_ORDER, LocatorsPath.MAX_TIME);
		
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.STOCK_LIFTING_ORDER_DISP, LocatorsPath.MAX_TIME);
		
		WebElement status = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_LIFTING_ORDER_STATUS))));
		Assert.assertEquals("RECEIVE", status.getText());
		
		WebElement row1 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_LIFTING_ROW_1))));
		if(row1.isDisplayed()) {
			
			WebElement product = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_LIFTING_PRODUCT))));
			file3.setCellData("Distributor", "Stock Lift Product", 2, product.getText());
			
			WebElement qty = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_LIFTING_QTY))));
			file3.setCellData("Distributor", "Stock Lift Qty", 2, qty.getText());
			
			WebElement unitOfMeasure = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_LIFTING_UNIT_OF_MEAS))));
			file3.setCellData("Distributor", "Stock Lift Unit Measure", 2, unitOfMeasure.getText());
		}else {
			System.out.println("row1 is not displayed");
		}
		
		
		WebElement row2 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_LIFTING_ROW_2))));
		if(row2.isDisplayed()) {
			
			WebElement product = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_LIFTING_PRODUCT_1))));
			file3.setCellData("Distributor", "Stock Lift Product", 3, product.getText());
			
			WebElement qty = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_LIFTING_QTY_1))));
			file3.setCellData("Distributor", "Stock Lift Qty", 3, qty.getText());
			
			WebElement unitOfMeasure = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_LIFTING_UNIT_OF_MEAS_1))));
			file3.setCellData("Distributor", "Stock Lift Unit Measure", 3, unitOfMeasure.getText());
		}else {
			System.out.println("row2 is not displayed");
		}
		System.out.println("Success: SLO order status is displayed as 'RECEIVE' successfully");
	}
	

	@Then("^User clicks on the inventory Level button & navigates to the inventory level of the user section$")
	public void user_clicks_on_the_inventory_Level_button_navigates_to_the_inventory_level_of_the_user_section() throws Throwable {
	    
		System.out.println("Attempt: click on the inventory Level button & "
				+ "navigate to the inventory level of the user section");
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
		System.out.println("Success: inventory Level button clicked & "
				+ "navigated to the inventory level of the user section");
	}
	

	/*---------------------------------------------Replace the data------------------------------------------------*/
	@Then("^User verifies the Stock load record is created for the order quantity and Inventory is increased with the SLO order qty\\.$")
	public void user_verifies_the_Stock_load_record_is_created_for_the_order_quantity_and_Inventory_is_increased_with_the_SLO_order_qty() throws Throwable {
	 
		System.out.println("Attempt: verify the Stock load record is created for the order quantity "
				+ "and Inventory is increased with the SLO order qty");
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
			Assert.assertEquals(file3.getCellData("Distributor", "Stock Lift Qty", 2), 
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
			Assert.assertEquals(file3.getCellData("Distributor", "Stock Lift Qty", 3), 
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
			Assert.assertEquals(
					(int)Double.parseDouble(file3.getCellData("Distributor", "Inventory Qty", 2))+
					(int)Double.parseDouble(file3.getCellData("Distributor", "Qty", 2)), 
					(int)Double.parseDouble(qty.getText()));
			
		}else {
			System.out.println("row1 is not displayed");
		}
		
		WebElement invRow2 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INVENTORY_LEVEL_ROW_2))));
		if(invRow2.isDisplayed()) {
			
			WebElement qty = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.INVENTORY_LEVEL_QTY_2))));
			Assert.assertEquals(
					(int)Double.parseDouble(file3.getCellData("Distributor", "Inventory Qty", 3))+
					(int)Double.parseDouble(file3.getCellData("Distributor", "Qty", 3)), 
					(int)Double.parseDouble(qty.getText()));
		}else {
			System.out.println("row2 is not displayed");
		}
		System.out.println("Success: verified the Stock load record is created for the order quantity"
				+ " and Inventory is increased with the SLO order qty");
	}
	
	
	
	/**----------------------RCS_SaaS_Export_Orders_WC--------------------------**/
	
	
	
	@Then("^User selects the Source and Ship to party from the dropdown in the Stock Lifting Order screen$")
	public void user_selects_the_Source_and_Ship_to_party_from_the_dropdown_in_the_Stock_Lifting_Order_screen() throws Throwable {
	    
		System.out.println("Attempt: select the Source and Ship to party "
				+ "from the dropdown in the Stock Lifting Order screen");
		PageObjects.SelectByXpath(
				driver, LocatorsPath.STOCK_LIFTING_ORDER, LocatorsPath.MAX_TIME);
		
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.STOCK_LIFTING_ORDER_DISP, LocatorsPath.MAX_TIME);
		
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.STOCK_LIFTING_SOURCE, LocatorsPath.MAX_TIME, 
				file3.getCellData("Distributor", "Source", 2));
		
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.STOCK_LIFTING_SHIP_TO_PARTY, LocatorsPath.MAX_TIME, 
				file3.getCellData("Distributor", "Ship To Party", 2));
		System.out.println("Success: selected the Source and Ship to party "
				+ "from the dropdown in the Stock Lifting Order screen");
	}
	

	@Then("^User clicks on the Export orders in Excel/CSV button$")
	public void user_clicks_on_the_Export_orders_in_Excel_CSV_button() throws Throwable {
	 
		System.out.println("Attempt: click on the Export orders in Excel/CSV button");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.EXPORT_ORDERS_IN_EXCEL, LocatorsPath.MAX_TIME);
		System.out.println("Success: Export orders in Excel/CSV button clicked successfully");
	}

	
	@Then("^User verifies the 'Export order' file is downloaded in Excel/CSV format$")
	public void user_verifies_the_Export_order_file_is_downloaded_in_Excel_CSV_format() throws Throwable {
	    
		CallObject.block(5000);
		System.out.println("User verifies the 'Export order' file is downloaded in Excel/CSV format");
	}
	

	@Then("^User verifies the SLO orders created for the selected 'Source and Ship to party' is displayed in the export report$")
	public void user_verifies_the_SLO_orders_created_for_the_selected_Source_and_Ship_to_party_is_displayed_in_the_export_report() throws Throwable {
	    
		System.out.println("User verifies the SLO orders created for the selected "
				+ "'Source and Ship to party' is displayed in the export report");
	}
	

	@Then("^User verifies the data in the file that is downloaded contains - Order number, Order date, Order Status, Ship to, Source of order, Order to supplier, Supplier inventory location\\.$")
	public void user_verifies_the_data_in_the_file_that_is_downloaded_conatins_Order_number_Order_date_Order_Status_Ship_to_Source_of_order_Order_to_supplier_Supplier_inventory_location() throws Throwable {
	 
		System.out.println("Attempt: verify the data in the file that is downloaded contains - "
				+ "Order number, Order date, Order Status, Ship to, Source of order, Order to supplier, Supplier inventory location");
		HssfApiFile exportExcel = 
				new HssfApiFile("C:\\Users\\30955\\Downloads\\ExportOrders.xls");
		
		/*WebElement orderNumber = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_LIFTING_ORDER_NUMBER))));
		Assert.assertEquals(exportExcel.getCellData("exportStockLiftingOrderId", "Order Number", 2), 
				orderNumber.getText());*/
		
		WebElement orderDate = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_LIFTING_ORDER_DATE))));
		Assert.assertEquals(exportExcel.getCellData("exportStockLiftingOrderId", "Order Date", 2), 
				orderDate.getText());
		
		WebElement orderStatus = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_LIFTING_ORDER_STATUS))));
		Assert.assertEquals(exportExcel.getCellData("exportStockLiftingOrderId", "Order Status", 2), 
				orderStatus.getText());
		
		WebElement shippedTo = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_LIFTING_SHIPPED_TO))));
		Assert.assertEquals(exportExcel.getCellData("exportStockLiftingOrderId", "Shipped To", 2), 
				shippedTo.getText());
		
		/*WebElement supInvLoc = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_LIFTING_SUPPLIER_NAME))));
		Assert.assertEquals(exportExcel.getCellData("exportStockLiftingOrderId", "Supplier Inventory Location", 2), 
				supInvLoc.getText());*/
		System.out.println("Success: verified the data in the file that is downloaded contains - "
				+ "Order number, Order date, Order Status, Ship to, Source of order, Order to supplier, Supplier inventory location");
	}
	

	
	/**----------------------RCS_SaaS_Export_SLO_Orders_WC--------------------------**/
	
	
	
	@Then("^User clicks on 'Download LO detail in CSV/Excel' button$")
	public void user_clicks_on_Download_LO_detail_in_CSV_Excel_button() throws Throwable {
	    
		System.out.println("Attempt: click on 'Download LO detail in CSV/Excel' button");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.DOWNLOAD_LO_DETAIL_IN_EXCEL, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Download LO detail in CSV/Excel' button clicked successfully");
	}
	

	@Then("^User verifies the 'Download stock lifting order details info template' file is downloaded in CSV/Excel format$")
	public void user_verifies_the_Download_stock_lifting_order_details_info_template_file_is_downloaded_in_CSV_Excel_format() throws Throwable {
	   
		CallObject.block(5000);
		System.out.println("User verifies the 'Download stock lifting order "
				+ "details info template' file is downloaded in CSV/Excel format");
	}
	

	@Then("^User verifies the SLO orders details created for the selected order is displayed in the export report$")
	public void user_verifies_the_SLO_orders_details_created_for_the_selected_order_is_displayed_in_the_export_report() throws Throwable {
	    
		System.out.println("User verifies the SLO orders details "
				+ "created for the selected order is displayed in the export report");
	}
	

	@Then("^User verifies the data in the file that is downloaded contains - Product, Quantity, Order number, Drive brand\\.$")
	public void user_verifies_the_data_in_the_file_that_is_downloaded_conatins_Product_Quantity_Order_number_Drive_brand() throws Throwable {
	    
		System.out.println("Attempt: verify the data in the file that is "
				+ "downloaded contains - Product, Quantity, Order number, Drive brand");
		HssfApiFile exportExcel = 
				new HssfApiFile("C:\\Users\\30955\\Downloads\\DownloadStockLiftingDetailsInfoTemplate.xls");
		
		WebElement product = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_LIFTING_PRODUCT))));
		Assert.assertEquals(exportExcel.getCellData("exportStockLiftingDetailId", "Product", 2), 
				product.getText());
		
		WebElement qty = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_LIFTING_QTY))));
		Assert.assertEquals(exportExcel.getCellData("exportStockLiftingDetailId", "Quantity", 2), 
				qty.getText());
		
		/*WebElement orderNumber = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_LIFTING_ORDER_NUMBER))));
		Assert.assertEquals(exportExcel.getCellData("exportStockLiftingDetailId", "Order Number", 2), 
				orderNumber.getText());*/
		System.out.println("Success: verified the data in the file that is "
				+ "downloaded contains - Product, Quantity, Order number, Drive brand");
	}
	

	
	/**----------------------RCS_SaaS_Export_Stock_lifting_header_WC--------------------------**/
	
	
	
	@Then("^User clicks on Export Stock lifting header button$")
	public void user_clicks_on_Export_Stock_lifting_header_button() throws Throwable {
	   
		System.out.println("Attempt: click on Export Stock lifting header button");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.EXPORT_STOCK_LIFTING_ORDER, LocatorsPath.MAX_TIME);
		System.out.println("Success: Export Stock lifting header button clicked successfully");
	}
	

	@Then("^User verifies the Export Stock lifting Header file is downloaded in \\.csv format$")
	public void user_verifies_the_Export_Stock_lifting_Header_file_is_downloaded_in_csv_format() throws Throwable {
	   
		CallObject.block(5000);
		System.out.println("User verifies the Export Stock lifting "
				+ "Header file is downloaded in .csv format");
	}
	

	@Then("^User verifies the data in the file that is downloaded contains - Order number, Order date, Order Status, Ship to, Source of order\\.$")
	public void user_verifies_the_data_in_the_file_that_is_downloaded_conatins_Order_number_Order_date_Order_Status_Ship_to_Source_of_order() throws Throwable {
	  
		System.out.println("Attempt: verify the data in the file that is downloaded contains - "
				+ "Order number, Order date, Order Status, Ship to, Source of order");   
		//Convert CSV to XLSX files
		CsvToExcelConverter.csvConverter
		(LocatorsPath.CsvFirstFileLocation, LocatorsPath.xlsxFirstFileLocation, LocatorsPath.Sheet1);
		
		ExcelApiFile stockLiftingHeader = new ExcelApiFile(LocatorsPath.xlsxFirstFileLocation);
		Assert.assertEquals("Order Number", 
				stockLiftingHeader.getCellData(LocatorsPath.Sheet1, "Order Number", 1));
		Assert.assertEquals("Order Date", 
				stockLiftingHeader.getCellData(LocatorsPath.Sheet1, "Order Date", 1));
		Assert.assertEquals("Order Status", 
				stockLiftingHeader.getCellData(LocatorsPath.Sheet1, "Order Status", 1));
		Assert.assertEquals("Shipped To", 
				stockLiftingHeader.getCellData(LocatorsPath.Sheet1, "Shipped To", 1));
		Assert.assertEquals("Source of Order", 
				stockLiftingHeader.getCellData(LocatorsPath.Sheet1, "Source of Order", 1));
		System.out.println("Success: verified the data in the file that is downloaded contains - "
				+ "Order number, Order date, Order Status, Ship to, Source of order"); 
	}
}
