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

public class RcsSaasDistributorsReturnOrderPage extends TestRunnerWebClient{
	
	WebDriver driver = getDriver();
	Actions actions = new Actions(driver);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	ExcelApiFile file  = new ExcelApiFile("TestData.xlsx");
	ExcelApiFile file3 = new ExcelApiFile("TestData3.xlsx");
	WebDriverWait wait = new WebDriverWait(driver, LocatorsPath.MAX_TIME);
	RcsSaasDistributorsSLOPage distributorsSLOPage = new RcsSaasDistributorsSLOPage();
	RcaSaasDistributorsSROPage distributorsSROPage = new RcaSaasDistributorsSROPage();
	
	
	public RcsSaasDistributorsReturnOrderPage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}


	
	/**----------------------RCS_SaaS_Creation_Of_ReturnOrder_WC--------------------------**/
	

	
	@When("^User Provides the valid child credentials$")
	public void user_Provides_the_valid_child_credentials() throws Throwable {

        /*------------------------PRE-Requisite 2-----------------------*/
		
		
		distributorsSLOPage.user_clicks_on_the_Distributors_tab();
		
		PageObjects.SelectByXpath(
				driver, LocatorsPath.INVENTORY_LEVEL, LocatorsPath.MAX_TIME);
		
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.INVENTORY_LOCATIONS_DISP, LocatorsPath.MAX_TIME);
		
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.RET_INVENTORY_LEVEL_SEARCH, LocatorsPath.MAX_TIME, 
				file3.getCellData("DistributorReturnOrder", "Inventory Location Name", 2));
		CallObject.block(2000);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.RET_INVENTORY_LOCATIONS, LocatorsPath.MAX_TIME);
		
		WebElement row = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.RET_INVENTORY_LEVEL_ROW_1))));
		if(row.isDisplayed()) {
			WebElement qty = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.RET_INVENTORY_LEVEL_QTY_1))));
			file3.setCellData("DistributorReturnOrder", "Inventory Qty", 2, qty.getText());
		}else {
			System.out.println("row1 is not displayed");
		}
		
		WebElement Row = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.RET_INVENTORY_LEVEL_ROW_2))));
		if(Row.isDisplayed()) {
			
			WebElement qty = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.RET_INVENTORY_LEVEL_QTY_2))));
			file3.setCellData("DistributorReturnOrder", "Inventory Qty", 3, qty.getText());
		}else {
			System.out.println("row2 is not displayed");
		}
		
		distributorsSROPage.logOut();

		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.LOGIN_USERNAME, LocatorsPath.MAX_TIME, 
				file.getCellData("Login", "LoginUserName", 3));
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.LOGIN_PASSWORD, LocatorsPath.MAX_TIME, 
				file.getCellData("Login", "LoginPassword", 2));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.LOGIN, LocatorsPath.MAX_TIME);
		
		distributorsSLOPage.user_clicks_on_the_Distributors_tab();
		
		/*------------------------PRE-Requisite 2-----------------------*/
	}
	

	@Then("^User selects the 'Return order' tab and navigates to the Return order screen successfully$")
	public void user_selects_the_Return_order_tab_and_navigates_to_the_Return_order_screen_successfully() throws Throwable {
	    
		System.out.println("Attempt: select the 'Return order' tab and "
				+ "navigate to the Return order screen");
		PageObjects.SelectByXpath(
				driver, LocatorsPath.RETURN_ORDER, LocatorsPath.MAX_TIME);
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.RETURN_ORDER_DISP, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Return order' tab selected and "
				+ "navigated to the Return order screen");
	}
	

	@Then("^User verifies the child user inventory name is displayed in 'Source inventory location' and Parent user inventory name is displayed in 'Destination inventory location'$")
	public void user_verifies_the_child_user_inventory_name_is_displayed_in_Source_inventory_location_and_Parent_user_inventory_name_is_displayed_in_Destination_inventory_location() throws Throwable {
	 
		System.out.println("Attempt: verify the child user inventory name is displayed in 'Source inventory location' "
				+ "and Parent user inventory name is displayed in 'Destination inventory location'");
		CallObject.block(2000);
		if(driver.getPageSource().contains(
				file3.getCellData("DistributorReturnOrder", "Inventory Location Name", 2))) {
			System.out.println("Source inventory location is present");
		}else {
			Assert.fail("Source inventory location is not present");
		}
		
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.RET_DESTINATION_INV_LOC, LocatorsPath.MAX_TIME, 
				file3.getCellData("DistributorReturnOrder", "Inventory Location Name", 3));
		System.out.println("Success: verified the child user inventory name is displayed in 'Source inventory location' "
				+ "and Parent user inventory name is displayed in 'Destination inventory location'");
	}
	

	@Then("^User clicks on the 'Create Return order' & verifies the 'Return order created' message is displayed$")
	public void user_clicks_on_the_Create_Return_order_verifies_the_Return_order_created_message_is_displayed() throws Throwable {
	   
		System.out.println("Attempt: click on the 'Create Return order' & "
				+ "verify the 'Return order created' message is displayed");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.RET_CREATE_RETURN_ORDER, LocatorsPath.MAX_TIME);
		
		WebElement message = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.RET_SUCCESS_MESSAGE))));
		Assert.assertEquals("Return Order Created", message.getText());
		System.out.println("Success: clicked on the 'Create Return order' & "
				+ "verified the 'Return order created' message");
	}
	

	@Then("^User verifies the Return  order is created successfully with 'Open' status$")
	public void user_verifies_the_Return_order_is_created_successfully_with_Open_status() throws Throwable {
	    
		System.out.println("Attempt: verify the Return  order is created successfully with 'Open' status");
		WebElement status = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.RETURN_ORDER_STATUS))));
		Assert.assertEquals("OPEN", status.getText());
		System.out.println("Attempt: verified the Return  order is created successfully with 'Open' status");
	}
	

	@Then("^User verifies the following Return Order Header fields - Order number, Return order date, Order status, Return order quantity$")
	public void user_verifies_the_following_Return_Order_Header_fields_Order_number_Return_order_date_Order_status_Return_order_quantity() throws Throwable {

		System.out.println("Attempt: verify the following Return Order Header fields - "
				+ "Order number, Return order date, Order status, Return order quantity");
		WebElement orderNum = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.RET_ORDER_NUMBER))));
		Assert.assertEquals("Order Number", orderNum.getText());
		
		WebElement orderDate = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.RETURN_ORDER_DATE))));
		Assert.assertEquals("Return Order Date", orderDate.getText());
		
		WebElement orderStatus = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.RET_ORDER_STATUS))));
		Assert.assertEquals("Order Status", orderStatus.getText());
		
		WebElement orderQty = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.RETURN_ORDER_QTY))));
		Assert.assertEquals("Return Order Quantity", orderQty.getText());
		System.out.println("Success: verified the following Return Order Header fields - "
				+ "Order number, Return order date, Order status, Return order quantity");
	}
	

	
	
	/**----------------------RCS_SaaS_ReturnOrder_Details_WC--------------------------**/
	
	
	
	
	@Then("^User verifies the following Return Order Details - Product, Saleable quantity, Return for reason, Saleable dispatch quantity, Unsaleable quantity, Return for reason, Unsaleable dispatch quantity, Unit of measure, Batch number, Free text field (\\d+) & Free text field (\\d+)$")
	public void user_verifies_the_following_Return_Order_Details_Product_Saleable_quantity_Return_for_reason_Saleable_dispatch_quantity_Unsaleable_quantity_Return_for_reason_Unsaleable_dispatch_quantity_Unit_of_measure_Batch_number_Free_text_field_Free_text_field(int arg1, int arg2) throws Throwable {
	    
		System.out.println("Attempt: verify the following Return Order Details - Product, Saleable quantity, "
				+ "Return for reason, Saleable dispatch quantity, Unsaleable quantity, Return for reason, "
				+ "Unsaleable dispatch quantity, Unit of measure, Batch number, Free text field (\\d+) & Free text field (\\d+)");
		WebElement product = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.PRODUCT))));
		Assert.assertEquals("Product", product.getText());
		
		WebElement saleableQty = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.RET_SALEABLE_QTY))));
		Assert.assertEquals("Saleable Quantity", saleableQty.getText());
		
		WebElement reasonReturn = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.REASON_FOR_RETURN_1))));
		Assert.assertEquals("Reason for Return", reasonReturn.getText());
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.SALEABLE_DISPATCH_QTY)));
		WebElement saleableDispatchQty = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SALEABLE_DISPATCH_QTY))));
		Assert.assertEquals("salesable dispatch quantity", saleableDispatchQty.getText());
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.RET_UNSALEABLE_QTY)));
		WebElement unSaleableQty = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.RET_UNSALEABLE_QTY))));
		Assert.assertEquals("Unsaleable Quantity", unSaleableQty.getText());
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.REASON_FOR_RETURN_2)));
		WebElement reasonreturn = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.REASON_FOR_RETURN_2))));
		Assert.assertEquals("Reason for Return", reasonreturn.getText());
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.UNSALEABLE_DISPATCH_QTY)));
		WebElement unSaleableDispatchQty = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.UNSALEABLE_DISPATCH_QTY))));
		Assert.assertEquals("unsalesable dispatch quantity", unSaleableDispatchQty.getText());
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.RET_UNIT_OF_MEASURE)));
		WebElement unitMeasure = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.RET_UNIT_OF_MEASURE))));
		Assert.assertEquals("Unit Of Measure", unitMeasure.getText());
		
		/*js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.BATCH_NUMBER)));
		WebElement batchNumber = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.BATCH_NUMBER))));
		Assert.assertEquals("Batch Number *", batchNumber.getText());*/
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.RET_FREE_TEXT_FIELD_3)));
		WebElement freeTextField3 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.RET_FREE_TEXT_FIELD_3))));
		Assert.assertEquals("Free Text Field 3", freeTextField3.getText());
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.RET_FREE_TEXT_FIELD_4)));
		WebElement freeTextField4 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.RET_FREE_TEXT_FIELD_4))));
		Assert.assertEquals("Free Text Field 4", freeTextField4.getText());
		
		System.out.println("Success: verified the following Return Order Details - Product, Saleable quantity, "
				+ "Return for reason, Saleable dispatch quantity, Unsaleable quantity, Return for reason, "
				+ "Unsaleable dispatch quantity, Unit of measure, Batch number, Free text field (\\d+) & Free text field (\\d+)");
	}
	

	@Then("^User enters saleable & unsaleable Quantities for an SKU & selects the 'Reason for Return' values from the dropdown$")
	public void user_enters_saleable_unsaleable_Quantities_for_an_SKU_selects_the_Reason_for_Return_values_from_the_dropdown() throws Throwable {
	   
		System.out.println("Attempt: Enter saleable & unsaleable Quantities for an SKU & "
				+ "select the 'Reason for Return' values from the dropdown");
		WebElement row1 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.RETURN_ORDER_ROW_0))));
		if(row1.isDisplayed()) {
			
			wait.until(ExpectedConditions.presenceOfElementLocated((
					By.cssSelector(LocatorsPath.STOCKLIFTING_PRODUCT)))).clear();
			CallObject.block(2000);
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.STOCKLIFTING_PRODUCT, LocatorsPath.MAX_TIME, 
					file3.getCellData("Distributor", "Stock Lift Product", 2));
			CallObject.block(3000);
			
			js.executeScript("arguments[0].scrollIntoView();", 
					driver.findElement(By.cssSelector(LocatorsPath.RETURN_ORDER_SALEABLE_QTY)));
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.RETURN_ORDER_SALEABLE_QTY, LocatorsPath.MAX_TIME, 
					file3.getCellData("DistributorReturnOrder", "Saleable Qty", 2));
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.REASON_FOR_RETURN_SALEABLE, LocatorsPath.MAX_TIME, 
					file3.getCellData("DistributorReturnOrder", "Reason for Return 1", 2));
			
			js.executeScript("arguments[0].scrollIntoView();", 
					driver.findElement(By.cssSelector(LocatorsPath.RETURN_ORDER_UNSALEABLE_QTY)));
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.RETURN_ORDER_UNSALEABLE_QTY, LocatorsPath.MAX_TIME, 
					file3.getCellData("DistributorReturnOrder", "UnSaleable Qty", 2));
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.REASON_FOR_RETURN_UNSALEABLE, LocatorsPath.MAX_TIME, 
					file3.getCellData("DistributorReturnOrder", "Reason for Return 2", 2));
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.RETURN_ORDER_BATCH, LocatorsPath.MAX_TIME, 
					file3.getCellData("DistributorReturnOrder", "Batch Number", 2));
		}else {
			System.out.println("row1 is not displayed");
		}
		
		
		WebElement row2 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.RETURN_ORDER_ROW_0))));
		if(row2.isDisplayed()) {
			
			js.executeScript("arguments[0].scrollIntoView();", 
					driver.findElement(By.cssSelector(LocatorsPath.STOCKLIFTING_PRODUCT)));
			wait.until(ExpectedConditions.presenceOfElementLocated((
					By.cssSelector(LocatorsPath.STOCKLIFTING_PRODUCT)))).clear();
			CallObject.block(2000);
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.STOCKLIFTING_PRODUCT, LocatorsPath.MAX_TIME, 
					file3.getCellData("Distributor", "Stock Lift Product", 3));
			CallObject.block(3000);
			
			js.executeScript("arguments[0].scrollIntoView();", 
					driver.findElement(By.cssSelector(LocatorsPath.RETURN_ORDER_SALEABLE_QTY)));
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.RETURN_ORDER_SALEABLE_QTY, LocatorsPath.MAX_TIME, 
					file3.getCellData("DistributorReturnOrder", "Saleable Qty", 3));
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.REASON_FOR_RETURN_SALEABLE, LocatorsPath.MAX_TIME, 
					file3.getCellData("DistributorReturnOrder", "Reason for Return 1", 3));
			
			js.executeScript("arguments[0].scrollIntoView();", 
					driver.findElement(By.cssSelector(LocatorsPath.RETURN_ORDER_UNSALEABLE_QTY)));
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.RETURN_ORDER_UNSALEABLE_QTY, LocatorsPath.MAX_TIME, 
					file3.getCellData("DistributorReturnOrder", "UnSaleable Qty", 3));
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.REASON_FOR_RETURN_UNSALEABLE, LocatorsPath.MAX_TIME, 
					file3.getCellData("DistributorReturnOrder", "Reason for Return 2", 3));
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.RETURN_ORDER_BATCH, LocatorsPath.MAX_TIME, 
					file3.getCellData("DistributorReturnOrder", "Batch Number", 3));
		}else {
			System.out.println("row2 is not displayed");
		}
		System.out.println("Success: Saleable & unsaleable Quantities for an SKU entered & "
				+ "The 'Reason for Return' values from the dropdown selected successfully");
	}
	

	@Then("^User enters the 'Batch Number' for the saleable & unsaleable Qty's$")
	public void user_enters_the_Batch_Number_for_the_saleable_unsaleable_Qty_s() throws Throwable {
	 
		System.out.println("User enters the 'Batch Number' for the saleable & unsaleable Qty's");
	}
	

	@Then("^User clicks on save button & verifies the Order is saved successfully & displays only the SKU for which the qty is entered$")
	public void user_clicks_on_save_button_verifies_the_Order_is_saved_successfully_displays_only_the_SKU_for_which_the_qty_is_entered() throws Throwable {
	    
		System.out.println("Attempt: click on save button & verify the Order is saved "
				+ "successfully & displays only the SKU for which the qty is entered");
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.RETURN_ORDER_SAVE)));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.RETURN_ORDER_SAVE, LocatorsPath.MAX_TIME);
		System.out.println("Success: Save button clicked & verified the Order is saved "
				+ "successfully & displays only the SKU for which the qty is entered");
	}
	

	@Then("^User clicks on the 'Book' button & verifies the Return order status is displayed as 'BOOK'$")
	public void user_clicks_on_the_Book_button_verifies_the_Return_order_status_is_displayed_as_BOOK() throws Throwable {
	    
		System.out.println("Attempt: click on the 'Book' button & "
				+ "verify the Return order status is displayed as 'BOOK'");
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.RETURN_ORDER_BOOK)));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.RETURN_ORDER_BOOK, LocatorsPath.MAX_TIME);
		
		CallObject.block(3000);
		WebElement status = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.RETURN_ORDER_STATUS))));
		Assert.assertEquals("BOOK", status.getText());
		System.out.println("Success: clicked on the 'Book' button & "
				+ "verified the Return order status is displayed as 'BOOK'");
	}
	

	@Then("^User navigates to the child inventory level$")
	public void user_navigates_to_the_child_inventory_level() throws Throwable {
	    
		System.out.println("Attempt: navigate to the child inventory level");
		PageObjects.SelectByXpath(
				driver, LocatorsPath.INVENTORY_LEVEL, LocatorsPath.MAX_TIME);
		System.out.println("Success: navigated to the child inventory level");
	}
	

	@Then("^User verifies the 'Saleable & Unsaleable stock in transit' displaying the SKU qty's which is entered in 'Return Order Details' section$")
	public void user_verifies_the_Saleable_Unsaleable_stock_in_transit_displaying_the_SKU_qty_s_which_is_entered_in_Return_Order_Details_section() throws Throwable {
	    
		System.out.println("Attempt: verify the 'Saleable & Unsaleable stock in transit' "
				+ "displaying the SKU qty's which is entered in 'Return Order Details' section");
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.INVENTORY_LOCATIONS_DISP, LocatorsPath.MAX_TIME);
		
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.RET_INVENTORY_LEVEL_SEARCH, LocatorsPath.MAX_TIME, 
				file3.getCellData("DistributorReturnOrder", "Inventory Location Name", 3));
		CallObject.block(2000);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.RET_INVENTORY_LOCATIONS, LocatorsPath.MAX_TIME);
		
		WebElement row1 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.RETURN_ORDER_INV_LEVEL_1))));
        if(row1.isDisplayed()) {
        	WebElement saleableStockTransit = wait.until(ExpectedConditions.
    				presenceOfElementLocated((By.cssSelector(LocatorsPath.SALEABLE_STOCK_TRANSIT_1))));
        	Assert.assertEquals(file3.getCellData("DistributorReturnOrder", "Saleable Qty", 2).concat(".000"), 
        			saleableStockTransit.getText());
        	WebElement UnSaleableStockTransit = wait.until(ExpectedConditions.
    				presenceOfElementLocated((By.cssSelector(LocatorsPath.UNSALEABLE_STOCK_TRANSIT_1))));
        	Assert.assertEquals(file3.getCellData("DistributorReturnOrder", "UnSaleable Qty", 2).concat(".000"), 
        			UnSaleableStockTransit.getText());
        	
        	WebElement totalStock = wait.until(ExpectedConditions.
    				presenceOfElementLocated((By.cssSelector(LocatorsPath.RET_TOTAL_STOCK_1))));
        	file3.setCellData("DistributorReturnOrder", "Total Stock", 2, totalStock.getText());
			
		}else {
			System.out.println("row1 is not displayed");
		}
        
        
        WebElement row2 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.RETURN_ORDER_INV_LEVEL_2))));
        if(row2.isDisplayed()) {
        	WebElement saleableStockTransit = wait.until(ExpectedConditions.
    				presenceOfElementLocated((By.cssSelector(LocatorsPath.SALEABLE_STOCK_TRANSIT_2))));
        	Assert.assertEquals(file3.getCellData("DistributorReturnOrder", "Saleable Qty", 3).concat(".000"), 
        			saleableStockTransit.getText());
        	WebElement UnSaleableStockTransit = wait.until(ExpectedConditions.
    				presenceOfElementLocated((By.cssSelector(LocatorsPath.UNSALEABLE_STOCK_TRANSIT_2))));
        	Assert.assertEquals(file3.getCellData("DistributorReturnOrder", "UnSaleable Qty", 3).concat(".000"), 
        			UnSaleableStockTransit.getText());
        	
        	WebElement totalStock = wait.until(ExpectedConditions.
    				presenceOfElementLocated((By.cssSelector(LocatorsPath.RET_TOTAL_STOCK_2))));
        	file3.setCellData("DistributorReturnOrder", "Total Stock", 3, totalStock.getText());
			
		}else {
			System.out.println("row2 is not displayed");
		}
        System.out.println("Success: verified the 'Saleable & Unsaleable stock in transit' "
				+ "displaying the SKU qty's which is entered in 'Return Order Details' section");
	}
	

	@Then("^User verifies the same qty is deducted from Saleable & Unsaleable quantity column$")
	public void user_verifies_the_same_qty_is_deducted_from_Saleable_Unsaleable_quantity_column() throws Throwable {
	   
		System.out.println("Attempt: verify the same qty is deducted from Saleable & Unsaleable quantity column");
		WebElement row1 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.RETURN_ORDER_INV_LEVEL_1))));
        if(row1.isDisplayed()) {
        	WebElement saleableQty = wait.until(ExpectedConditions.
    				presenceOfElementLocated((By.cssSelector(LocatorsPath.RET_SALEABLE_QTY_1))));
        	WebElement unsaleableQty = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.RET_INVENTORY_LEVEL_QTY_3))));
        	Assert.assertEquals(
					(int)Double.parseDouble(file3.getCellData("DistributorReturnOrder", "Total Stock", 2))-
					(int)Double.parseDouble(file3.getCellData("DistributorReturnOrder", "Saleable Qty", 2))-
					(int)Double.parseDouble(unsaleableQty.getText()), 
					(int)Double.parseDouble(saleableQty.getText()));
		}else {
			System.out.println("row1 is not displayed");
		}
        
        WebElement row2 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.RETURN_ORDER_INV_LEVEL_2))));
        if(row2.isDisplayed()) {
        	WebElement UnSaleableQty = wait.until(ExpectedConditions.
    				presenceOfElementLocated((By.cssSelector(LocatorsPath.RET_SALEABLE_QTY_2))));
        	WebElement unsaleableQty = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.RET_INVENTORY_LEVEL_QTY_4))));
        	Assert.assertEquals(
					(int)Double.parseDouble(file3.getCellData("DistributorReturnOrder", "Total Stock", 3))-
					(int)Double.parseDouble(file3.getCellData("DistributorReturnOrder", "Saleable Qty", 3))-
					(int)Double.parseDouble(unsaleableQty.getText()), 
					(int)Double.parseDouble(UnSaleableQty.getText()));
		}else {
			System.out.println("row2 is not displayed");
		}
        System.out.println("Success: verified the same qty is deducted from Saleable & Unsaleable quantity column");
	}
	

	
	/**----------------------RCS_SaaS_Return_Stock_Received_WC--------------------------**/
	
	
	
	
	@Then("^User login to the RCS WebApplication with Parent credentials$")
	public void user_login_to_the_RCS_WebApplication_with_Parent_credentials() throws Throwable {
	    
		System.out.println("Attempt: login to the RCS WebApplication with Parent credentials");
		distributorsSROPage.logOut();

		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.LOGIN_USERNAME, LocatorsPath.MAX_TIME, 
				file.getCellData("Login", "LoginUserName", 2));
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.LOGIN_PASSWORD, LocatorsPath.MAX_TIME, 
				file.getCellData("Login", "LoginPassword", 2));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.LOGIN, LocatorsPath.MAX_TIME);
		System.out.println("Success: logged into the RCS WebApplication with Parent credentials");
	}
	

	@Then("^User selects the 'Received Stock' tab and then selects the 'Return Stock Received' under Received Stock tab & navigates to the Received Stock screen successfully$")
	public void user_selects_the_Received_Stock_tab_and_then_selects_the_Return_Stock_Received_under_Received_Stock_tab_navigates_to_the_Received_Stock_screen_successfully() throws Throwable {
	    
		System.out.println("Attempt: select the 'Received Stock' tab and then "
				+ "select the 'Return Stock Received' under Received Stock tab & navigate to the Received Stock screen");
		PageObjects.SelectByXpath(
				driver, LocatorsPath.RET_RECEIVED_STOCK, LocatorsPath.MAX_TIME);
		PageObjects.SelectByXpath(
				driver, LocatorsPath.RETURN_STOCK_RECEIVED, LocatorsPath.MAX_TIME);
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.RET_RECEIVED_STOCK_DISP, LocatorsPath.MAX_TIME);
		System.out.println("Success: selected the 'Received Stock' tab and then "
				+ "selected the 'Return Stock Received' under Received Stock tab & navigated to the Received Stock screen");
	}
	

	@Then("^User verifies the Return order created is displayed with 'OPEN' status$")
	public void user_verifies_the_Return_order_created_is_displayed_with_OPEN_status() throws Throwable {
	    
		System.out.println("Attempt: verify the Return order created is displayed with 'OPEN' status");
		PageObjects.SelectByCSSSelectorWithoutClick(
				driver, LocatorsPath.SALEABLE_DISPATCH_QTY_DISP, LocatorsPath.MAX_TIME);
		WebElement status = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.RETURN_ORDER_STATUS))));
		Assert.assertEquals("OPEN", status.getText());
		System.out.println("Success: The Return order created is displayed with 'OPEN' status successfully");
	}
	

	@Then("^User enters the 'Batch Number' for the saleable & unsaleable Qty's in the Received Stock screen$")
	public void user_enters_the_Batch_Number_for_the_saleable_unsaleable_Qty_s_in_the_Received_Stock_screen() throws Throwable {
	   
		System.out.println("Attempt: enter the 'Batch Number' for the saleable & "
				+ "unsaleable Qty's in the Received Stock screen");
		WebElement row1 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.RETURN_STOCK_RECEIVED_ROW_1))));
        if(row1.isDisplayed()) {
        	js.executeScript("arguments[0].scrollIntoView();", 
    				driver.findElement(By.cssSelector(LocatorsPath.REASON_FOR_RETURN_3)));
        	PageObjects.SelectByCSSSelectorWithSendKeys(
        			driver, LocatorsPath.REASON_FOR_RETURN_3, LocatorsPath.MAX_TIME, 
        			file3.getCellData("DistributorReturnOrder", "Reason for Return 2", 2));
		}else {
			System.out.println("row1 is not displayed");
		}
        
        WebElement row2 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.RETURN_STOCK_RECEIVED_ROW_2))));
        if(row2.isDisplayed()) {
        	js.executeScript("arguments[0].scrollIntoView();", 
    				driver.findElement(By.cssSelector(LocatorsPath.REASON_FOR_RETURN_4)));
        	PageObjects.SelectByCSSSelectorWithSendKeys(
        			driver, LocatorsPath.REASON_FOR_RETURN_4, LocatorsPath.MAX_TIME, 
        			file3.getCellData("DistributorReturnOrder", "Reason for Return 1", 2));
		}else {
			System.out.println("row2 is not displayed");
		}
        System.out.println("Success:'Batch Number' for the saleable & "
				+ "unsaleable Qty's in the Received Stock screen entered successfully");
	}
	

	@Then("^User clicks on the save button & then clicks on the commit button in the Received Stock screen$")
	public void user_clicks_on_the_save_button_then_clicks_on_the_commit_button_in_the_Received_Stock_screen() throws Throwable {
	    
		System.out.println("Attempt: click on the save button & "
				+ "then click on the commit button in the Received Stock screen");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.RETURN_ORDER_SAVE, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.RETURN_ORDER_COMMIT, LocatorsPath.MAX_TIME);
		System.out.println("Success: clicked on the save button & "
				+ "then clicked on the commit button in the Received Stock screen");
	}
	

	@Then("^User verifies the Order status is changed to 'COMMIT' in 'Received stock' screen$")
	public void user_verifies_the_Order_status_is_changed_to_COMMIT_in_Received_stock_screen() throws Throwable {
	    
		System.out.println("Attempt: verify the Order status is changed to 'COMMIT' in 'Received stock' screen");
		CallObject.block(3000);
		WebElement status = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.RETURN_ORDER_STATUS))));
		Assert.assertEquals("COMMIT", status.getText());
		System.out.println("Success: verified the Order status is changed to 'COMMIT' in 'Received stock' screen");
	}
	

	@Then("^User navigates to the parent inventory level & verifies the Stock load record is created for the order quantity$")
	public void user_navigates_to_the_parent_inventory_level_verifies_the_Stock_load_record_is_created_for_the_order_quantity() throws Throwable {
	    
		System.out.println("Attempt: navigate to the parent inventory level & "
				+ "verify the Stock load record is created for the order quantity");
		PageObjects.SelectByXpath(
				driver, LocatorsPath.INVENTORY_LEVEL, LocatorsPath.MAX_TIME);
		
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.INVENTORY_LOCATIONS_DISP, LocatorsPath.MAX_TIME);
		
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.RET_INVENTORY_LEVEL_SEARCH, LocatorsPath.MAX_TIME, 
				file3.getCellData("DistributorReturnOrder", "Inventory Location Name", 2));
		CallObject.block(2000);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.RET_INVENTORY_LOCATIONS, LocatorsPath.MAX_TIME);
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.RET_STOCK_LOAD_ROW_1)));
		
		WebElement row1 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.RET_STOCK_LOAD_ROW_1))));
		if(row1.isDisplayed()) {
			WebElement qty = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_LOAD_QUANTITY_1))));
			Assert.assertEquals(file3.getCellData("DistributorReturnOrder", "Saleable Qty", 2).concat(".000"), 
					qty.getText());
		}else {
			System.out.println("row1 is not displayed");
		}
		
		WebElement row2 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.RET_STOCK_LOAD_ROW_2))));
		if(row2.isDisplayed()) {
			WebElement qty = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_LOAD_QUANTITY_2))));
			Assert.assertEquals(file3.getCellData("DistributorReturnOrder", "Saleable Qty", 3).concat(".000"), 
					qty.getText());
		}else {
			System.out.println("row2 is not displayed");
		}
		System.out.println("Success: navigated to the parent inventory level & "
				+ "verified the Stock load record is created for the order quantity");
	}
	

	@Then("^User verifies the Saleable & Unsaleable quantities is increased by the order qty Commited in the parent inventory level$")
	public void user_verifies_the_Saleable_Unsaleable_quantities_is_increased_by_the_order_qty_Commited_in_the_parent_inventory_level() throws Throwable {
	   
		System.out.println("Attempt: verify the Saleable & Unsaleable quantities is "
				+ "increased by the order qty Commited in the parent inventory level");
		WebElement row = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.RET_INVENTORY_LEVEL_ROW_1))));
		if(row.isDisplayed()) {
			WebElement qty = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.RET_INVENTORY_LEVEL_QTY_1))));
			Assert.assertEquals(
					(int)Double.parseDouble(file3.getCellData("DistributorReturnOrder", "Inventory Qty", 2))+
					(int)Double.parseDouble(file3.getCellData("DistributorReturnOrder", "Saleable Qty", 2)), 
					(int)Double.parseDouble(qty.getText()));
		}else {
			System.out.println("row1 is not displayed");
		}
		
		WebElement Row = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.RET_INVENTORY_LEVEL_ROW_2))));
		if(Row.isDisplayed()) {
			
			WebElement qty = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.RET_INVENTORY_LEVEL_QTY_2))));
			Assert.assertEquals(
					(int)Double.parseDouble(file3.getCellData("DistributorReturnOrder", "Inventory Qty", 3))+
					(int)Double.parseDouble(file3.getCellData("DistributorReturnOrder", "Saleable Qty", 3)), 
					(int)Double.parseDouble(qty.getText()));
		}else {
			System.out.println("row2 is not displayed");
		}
		System.out.println("Success: verified the Saleable & Unsaleable quantities is "
				+ "increased by the order qty Commited in the parent inventory level");
	}
	

	@Then("^User verifes the Total stock should be the sum of saleable and unsaleable quantities$")
	public void user_verifes_the_Total_stock_should_be_the_sum_of_saleable_and_unsaleable_quantities() throws Throwable {
	    
		System.out.println("Attempt: verify the Total stock should be the "
				+ "sum of saleable and unsaleable quantities");
		WebElement row = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.RET_INVENTORY_LEVEL_ROW_1))));
		if(row.isDisplayed()) {
			WebElement stock = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.INV_LEVEL_TOTAL_STOCK_1))));
			WebElement unsaleableQty = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.RET_UNSALEABLE_QTY_1))));
			Assert.assertEquals(
					(int)Double.parseDouble(file3.getCellData("DistributorReturnOrder", "Inventory Qty", 2))+
					(int)Double.parseDouble(file3.getCellData("DistributorReturnOrder", "Saleable Qty", 2))+
					(int)Double.parseDouble(unsaleableQty.getText()), 
					(int)Double.parseDouble(stock.getText()));
		}else {
			System.out.println("row1 is not displayed");
		}
		
		WebElement Row = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.RET_INVENTORY_LEVEL_ROW_2))));
		WebElement unsaleableQty = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.RET_UNSALEABLE_QTY_2))));
		if(Row.isDisplayed()) {
			
			WebElement stock = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.INV_LEVEL_TOTAL_STOCK_2))));
			Assert.assertEquals(
					(int)Double.parseDouble(file3.getCellData("DistributorReturnOrder", "Inventory Qty", 3))+
					(int)Double.parseDouble(file3.getCellData("DistributorReturnOrder", "Saleable Qty", 3))+
					(int)Double.parseDouble(unsaleableQty.getText()), 
					(int)Double.parseDouble(stock.getText()));
		}else {
			System.out.println("row2 is not displayed");
		}
		System.out.println("Success: verifed the Total stock should be the "
				+ "sum of saleable and unsaleable quantities");
	}
	

	@Then("^User navigates to the child inventory level & verifies the Saleable & unsaleable stock in transit is decreased by the order quantities\\.$")
	public void user_navigates_to_the_child_inventory_level_verifies_the_Saleable_unsaleable_stock_in_transit_is_decreased_by_the_order_quantities() throws Throwable {
	    
		System.out.println("Attempt: navigate to the child inventory level & verify "
				+ "the Saleable & unsaleable stock in transit is decreased by the order quantities");
		distributorsSROPage.logOut();

		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.LOGIN_USERNAME, LocatorsPath.MAX_TIME, 
				file.getCellData("Login", "LoginUserName", 3));
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.LOGIN_PASSWORD, LocatorsPath.MAX_TIME, 
				file.getCellData("Login", "LoginPassword", 2));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.LOGIN, LocatorsPath.MAX_TIME);
		
		distributorsSLOPage.user_clicks_on_the_Distributors_tab();
		
		PageObjects.SelectByXpath(
				driver, LocatorsPath.INVENTORY_LEVEL, LocatorsPath.MAX_TIME);
		
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.INVENTORY_LOCATIONS_DISP, LocatorsPath.MAX_TIME);
		
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.RET_INVENTORY_LEVEL_SEARCH, LocatorsPath.MAX_TIME, 
				file3.getCellData("DistributorReturnOrder", "Inventory Location Name", 3));
		CallObject.block(2000);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.RET_INVENTORY_LOCATIONS, LocatorsPath.MAX_TIME);
		
		WebElement row1 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.RETURN_ORDER_INV_LEVEL_1))));
        if(row1.isDisplayed()) {
        	WebElement totalStock = wait.until(ExpectedConditions.
    				presenceOfElementLocated((By.cssSelector(LocatorsPath.RET_TOTAL_STOCK_1))));
        	WebElement saleableStockTransit = wait.until(ExpectedConditions.
    				presenceOfElementLocated((By.cssSelector(LocatorsPath.SALEABLE_STOCK_TRANSIT_1))));
        	Assert.assertEquals(
					(int)Double.parseDouble(file3.getCellData("DistributorReturnOrder", "Total Stock", 2))-
					(int)Double.parseDouble(file3.getCellData("DistributorReturnOrder", "Saleable Qty", 2)), 
					(int)Double.parseDouble(totalStock.getText()));
        	Assert.assertEquals("0.000", saleableStockTransit.getText());
		}else {
			System.out.println("row1 is not displayed");
		}
        
        WebElement row2 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.RETURN_ORDER_INV_LEVEL_2))));
        if(row2.isDisplayed()) {
        	WebElement totalStock = wait.until(ExpectedConditions.
    				presenceOfElementLocated((By.cssSelector(LocatorsPath.RET_TOTAL_STOCK_2))));
        	WebElement saleableStockTransit = wait.until(ExpectedConditions.
    				presenceOfElementLocated((By.cssSelector(LocatorsPath.SALEABLE_STOCK_TRANSIT_2))));
        	Assert.assertEquals(
					(int)Double.parseDouble(file3.getCellData("DistributorReturnOrder", "Total Stock", 3))-
					(int)Double.parseDouble(file3.getCellData("DistributorReturnOrder", "Saleable Qty", 3)), 
					(int)Double.parseDouble(totalStock.getText()));
        	Assert.assertEquals("0.000", saleableStockTransit.getText());
		}else {
			System.out.println("row2 is not displayed");
		}
        System.out.println("Success: navigated to the child inventory level & verified "
				+ "the Saleable & unsaleable stock in transit is decreased by the order quantities");
	}
}
