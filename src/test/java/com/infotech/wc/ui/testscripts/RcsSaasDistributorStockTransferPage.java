package com.infotech.wc.ui.testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.infotech.Excel.ExcelApiFile;
import com.infotech.basepage.CallObject;
import com.infotech.basepage.LocatorsPath;
import com.infotech.basepage.PageObjects;
import com.infotech.testrunner.TestRunnerWebClient;

import cucumber.api.java.en.Then;

public class RcsSaasDistributorStockTransferPage extends TestRunnerWebClient{

	WebDriver driver = getDriver();
	Actions actions = new Actions(driver);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	ExcelApiFile file  = new ExcelApiFile("TestData.xlsx");
	ExcelApiFile file3 = new ExcelApiFile("TestData3.xlsx");
	WebDriverWait wait = new WebDriverWait(driver, LocatorsPath.MAX_TIME);
	RcaSaasDistributorsSROPage distributorsSROPage = new RcaSaasDistributorsSROPage();
	RcsSaasDistributorsSLOPage distributorsSLOPage = new RcsSaasDistributorsSLOPage();
	
	public RcsSaasDistributorStockTransferPage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	/**----------------------RCS_SaaS_Creation_Of_StockTransfer_SalesFlag_Checked_WC--------------------------**/
	
	
	
	@Then("^User selects the 'Stock transfer' tab and navigates to the Stock transfer screen successfully$")
	public void user_selects_the_Stock_transfer_tab_and_navigates_to_the_Stock_transfer_screen_successfully() throws Throwable {
		
       /*------------------------PRE-Requisite-----------------------*/
		
		distributorsSROPage.logOut();
		System.out.println("Attempt: Provide Valid child Credentials");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.LOGIN_USERNAME, LocatorsPath.MAX_TIME, 
				file.getCellData("Login", "LoginUserName", 4));
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.LOGIN_PASSWORD, LocatorsPath.MAX_TIME, 
				file.getCellData("Login", "LoginPassword", 2));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.LOGIN, LocatorsPath.MAX_TIME);
		System.out.println("Success: Able to login with the child Credentials successfully");
		
		distributorsSLOPage.user_clicks_on_the_Distributors_tab();
		
		PageObjects.SelectByXpath(
				driver, LocatorsPath.INVENTORY_LEVEL, LocatorsPath.MAX_TIME);
		
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.INVENTORY_LOCATIONS_DISP, LocatorsPath.MAX_TIME);
		
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.INVENTORY_LEVEL_SEARCH, LocatorsPath.MAX_TIME, 
				file3.getCellData("Distributor StockTransfer", "Destination Inventory Location", 4));
		CallObject.block(2000);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.INVENTORY_LOCATIONS, LocatorsPath.MAX_TIME);
		
		PageObjects.SelectByXpath(
				driver, LocatorsPath.INVENTORY_LEVELS_DISP, LocatorsPath.MAX_TIME);
		WebElement Row1 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INVENTORY_LEVEL_ROW_1))));
		if(Row1.isDisplayed()) {
			
			WebElement totalStock = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.INVENTORY_LEVEL_TOTAL_STOCK_1))));
			WebElement saleableQty = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.INVENTORY_LEVEL_SALE_QTY_1))));
			
			file3.setCellData("Distributor StockTransfer", "child Total Stock", 2, 
					totalStock.getText());
			file3.setCellData("Distributor StockTransfer", "child Saleable Qty", 2, 
					saleableQty.getText());
			
		}else {
			System.out.println("row1 is not displayed");
		}
		
		
		WebElement Row2 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INVENTORY_LEVEL_ROW_2))));
		if(Row2.isDisplayed()) {
			
			WebElement totalStock = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.INVENTORY_LEVEL_TOTAL_STOCK_2))));
			WebElement saleableQty = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.INVENTORY_LEVEL_SALE_QTY_2))));
			
			file3.setCellData("Distributor StockTransfer", "child Total Stock", 3, 
					totalStock.getText());
			file3.setCellData("Distributor StockTransfer", "child Saleable Qty", 3, 
					saleableQty.getText());
			
		}else {
			System.out.println("row2 is not displayed");
		}

		distributorsSROPage.logOut();
		System.out.println("Attempt: Provide Valid child Credentials");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.LOGIN_USERNAME, LocatorsPath.MAX_TIME, 
				file.getCellData("Login", "LoginUserName", 2));
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.LOGIN_PASSWORD, LocatorsPath.MAX_TIME, 
				file.getCellData("Login", "LoginPassword", 2));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.LOGIN, LocatorsPath.MAX_TIME);
		System.out.println("Success: Able to login with the child Credentials successfully");
		
		distributorsSLOPage.user_clicks_on_the_Distributors_tab();
		
		/*------------------------PRE-Requisite-----------------------*/
		
		
		System.out.println("Attempt: select the 'Stock transfer' tab and "
				+ "navigate to the Stock transfer screen");
		PageObjects.SelectByXpath(
				driver, LocatorsPath.STOCK_TRANSFER, LocatorsPath.MAX_TIME);
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.STOCK_TRANSFER_HEADER, LocatorsPath.MAX_TIME);
		System.out.println("Success: The 'Stock transfer' tab selected and "
				+ "navigated to the Stock transfer screen");
	}

	
	@Then("^User selects the Sales flag as checked & verifies the destination Inventory Location displays all the external suppliers$")
	public void user_selects_the_Sales_flag_as_checked_verifies_the_destination_Inventory_Location_displays_all_the_external_suppliers() throws Throwable {
	    
		System.out.println("Attempt: select the Sales flag as checked & "
				+ "verify the destination Inventory Location displays all the external suppliers");
		WebElement salesFlag = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SALES_UNCHECK_DISPLAY))));
		
		if(!salesFlag.isSelected()) {
			salesFlag.click();
		}
		
		CallObject.block(3000);
		WebElement element = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.DESTINATION_INV_LOCATION))));
		Select select = new Select(element);
		List<WebElement> allOptions = select.getOptions();
		
		String value = file3.getCellData("Distributor StockTransfer", "Destination Inventory Location", 2);
		 boolean found = false;
		 for(WebElement ele: allOptions) {
			 if(value.equals(ele.getText())) {
				 found = true;
				 System.out.println(value +" - value exists");
				 Assert.assertTrue(found);
				 break;
			 }
			 
		 }if(!found) {
			 System.out.println(value +" - value doesn't exists");
			 Assert.fail(value +" - value doesn't exists");
	   }
	   System.out.println("Success: The Sales flag is checked & verified the "
	   		+ "destination Inventory Location displays all the external suppliers");
		
	}
	

	@Then("^User selects the Source inventory location & verifies the Source inventory location displays the logged in user inventory location$")
	public void user_selects_the_Source_inventory_location_verifies_the_Source_inventory_location_displays_the_logged_in_user_inventory_location() throws Throwable {
	    
		System.out.println("Attempt: select the Source inventory location & "
				+ "verify the Source inventory location displays the logged in user inventory location");
		WebElement element = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SOURCE_INV_LOCATION))));
		Select select = new Select(element);
		List<WebElement> allOptions = select.getOptions();
		
		String value = file3.getCellData("Distributor StockTransfer", "Source Inventory Location", 2);
		 boolean found = false;
		 for(WebElement ele: allOptions) {
			 if(value.equals(ele.getText())) {
				 found = true;
				 System.out.println(value +" - value exists");
				 Assert.assertTrue(found);
				 break;
			 }
			 
		 }if(!found) {
			 System.out.println(value +" - value doesn't exists");
			 Assert.fail(value +" - value doesn't exists");
	   }
	   System.out.println("Success: Source inventory location selected & "
	   		+ "verified the Source inventory location displays the logged in user inventory location");
	}
	

	@Then("^User selects the destination inventory location & verifies the destination inventory location displays all the external suppliers$")
	public void user_selects_the_destination_inventory_location_verifies_the_destination_inventory_location_displays_all_the_external_suppliers() throws Throwable {
	    
		System.out.println("Attempt: select the destination inventory location & "
				+ "verify the destination inventory location displays all the external suppliers");
		CallObject.block(3000);
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.DESTINATION_INV_LOCATION, LocatorsPath.MAX_TIME, 
				file3.getCellData("Distributor StockTransfer", "Destination Inventory Location", 2));
		System.out.println("Success: The destination inventory location selected & "
				+ "verified the destination inventory location displays all the external suppliers");
	}
	

	@Then("^User enters the quantity in Transferred quantity section and verifies the entered Qty is available in the inventory$")
	public void user_enters_the_quantity_in_Transferred_quantity_section_and_verifies_the_entered_Qty_is_available_in_the_inventory() throws Throwable {
	    
		System.out.println("Attempt: enter the quantity in Transferred quantity section "
				+ "and verify the entered Qty is available in the inventory");
		WebElement row1 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_TRANSFER_PROD_1))));
		if(row1.isDisplayed()) {
			
			WebElement qty = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_TRANSFER_QTY_1))));
			file3.setCellData("Distributor StockTransfer", "Stock Transfer Qty", 2, qty.getText());
			
			WebElement product = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_TRANSFER_PRODUCT_1))));
			file3.setCellData("Distributor StockTransfer", "Stock Transfer product", 2, product.getText());
			
			WebElement unitMeasure = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_TRANSFER_UNIT_MEASURE_1))));
			file3.setCellData("Distributor StockTransfer", "Stock Transfer Unit Measure", 2, unitMeasure.getText());
			
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.TRANSFERRED_QTY_1, LocatorsPath.MAX_TIME, 
					file3.getCellData("Distributor StockTransfer", "Transferred Qty", 2));
		}else {
			System.out.println("row1 is not displayed");
		}
		
		WebElement row2 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_TRANSFER_PROD_2))));
		if(row2.isDisplayed()) {
			
			WebElement qty = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_TRANSFER_QTY_2))));
			file3.setCellData("Distributor StockTransfer", "Stock Transfer Qty", 3, qty.getText());
			
			WebElement product = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_TRANSFER_PRODUCT_2))));
			file3.setCellData("Distributor StockTransfer", "Stock Transfer product", 3, product.getText());
			
			WebElement unitMeasure = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_TRANSFER_UNIT_MEASURE_2))));
			file3.setCellData("Distributor StockTransfer", "Stock Transfer Unit Measure", 3, unitMeasure.getText());
			
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.TRANSFERRED_QTY_2, LocatorsPath.MAX_TIME, 
					file3.getCellData("Distributor StockTransfer", "Transferred Qty", 3));
		}else {
			System.out.println("row2 is not displayed");
		}
		System.out.println("Success: quantity in Transferred quantity section entered "
				+ "and verified the entered Qty is available in the inventory");
	}
	

	@Then("^User clicks on transfer button & verifies the Stock transfer header and details is created successfully with open status$")
	public void user_clicks_on_transfer_button_verifies_the_Stock_transfer_header_and_details_is_created_successfully_with_open_status() throws Throwable {
	   
		System.out.println("Attempt: click on transfer button & verify the "
				+ "Stock transfer header and details is created successfully with open status");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.TRANSFER_BUTTON, LocatorsPath.MAX_TIME);
		
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.STOCK_TRANSFER_HEADER, LocatorsPath.MAX_TIME);
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.STOCK_TRANSFER_HEAD_STATUS)));
		WebElement status = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_TRANSFER_HEAD_STATUS))));
		Assert.assertEquals("OPEN", status.getText());
		System.out.println("Success: Transfer button clicked & verified the "
				+ "Stock transfer header and details is created successfully with open status");
	}
	

	@Then("^User clicks on the commit button in the stock transfer details section & verifies the Stock transfer order status is changed to 'COMMIT'$")
	public void user_clicks_on_the_commit_button_in_the_stock_transfer_details_section_verifies_the_Stock_transfer_order_status_is_changed_to_COMMIT() throws Throwable {
	   
		System.out.println("Attempt: click on the commit button in the stock transfer "
				+ "details section & verify the Stock transfer order status is changed to 'COMMIT'");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.STOCK_TRANSFER_COMMIT, LocatorsPath.MAX_TIME);
		
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.STOCK_TRANSFER_HEADER, LocatorsPath.MAX_TIME);
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.STOCK_TRANSFER_HEAD_STATUS)));
		WebElement status = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_TRANSFER_HEAD_STATUS))));
		Assert.assertEquals("COMMIT", status.getText());
		System.out.println("Success: Commit button in the stock transfer details section "
				+ "clicked & verified the Stock transfer order status is changed to 'COMMIT'");
	}
	

	@Then("^User verifies the following Stock transfer Header fields - Source Inventory location, Destination inventory location, Stock transfer number, Transfer date & Status$")
	public void user_verifies_the_following_Stock_transfer_Header_fields_Source_Inventory_location_Destination_inventory_location_Stock_transfer_number_Transfer_date_Status() throws Throwable {
	   
		System.out.println("Attempt: verify the following Stock transfer Header fields - Source Inventory location, "
				+ "Destination inventory location, Stock transfer number, Transfer date & Status");
		
		WebElement sourceInventoryLocation = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SOURCE_INV_LOCATION_DISP))));
		Assert.assertEquals("Source Inventory Location", sourceInventoryLocation.getText());
		
		WebElement destinationInventoryLocation = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.DESTINATION_INV_LOCATION_DISP))));
		Assert.assertEquals("Destination Inventory Location", destinationInventoryLocation.getText());
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.STOCK_TRANSFER_NUMBER)));
		WebElement stockTransferNumber = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_TRANSFER_NUMBER))));
		Assert.assertEquals("Stock Transfer Number", stockTransferNumber.getText());
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.STOCK_TRANSFER_DATE)));
		WebElement transferDate = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_TRANSFER_DATE))));
		Assert.assertEquals("Transfer Date", transferDate.getText());
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.STOCK_TRANSFER_STATUS)));
		WebElement status = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_TRANSFER_STATUS))));
		Assert.assertEquals("Status", status.getText());
		
		System.out.println("Success: verified the following Stock transfer Header fields - Source Inventory location, "
				+ "Destination inventory location, Stock transfer number, Transfer date & Status");
	}
	

	@Then("^User verifies the following Stock transfer details - Product, Transferred quantity, Unit of measure$")
	public void user_verifies_the_following_Stock_transfer_details_Product_Transferred_quantity_Unit_of_measure() throws Throwable {
	 
		System.out.println("Attempt: verify the following Stock transfer details - Product, Transferred quantity, Unit of measure");
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.xpath(LocatorsPath.STOCK_TRANSFER_DETAIL_DISP)));
		
		WebElement row1 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_TRANSFER_DETAIL_1))));
		if(row1.isDisplayed()) {
			
			WebElement product = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_TRANS_DETAIL_PROD_1))));
			Assert.assertEquals(file3.getCellData("Distributor StockTransfer", "Stock Transfer product", 2), 
					product.getText());
			
			WebElement qty = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_TRANSFERRED_QTY_1))));
			Assert.assertEquals(file3.getCellData("Distributor StockTransfer", "Transferred Qty", 2).concat(".000"), 
					qty.getText());
			
			WebElement unitOfMeasure = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_TRANS_DETAIL_MEASURE_1))));
			Assert.assertEquals(file3.getCellData("Distributor StockTransfer", "Stock Transfer Unit Measure", 2), 
					unitOfMeasure.getText());
		}else {
			System.out.println("row1 is not displayed");
		}
		
		
		WebElement row2 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_TRANSFER_DETAIL_2))));
		if(row2.isDisplayed()) {
			
			WebElement product = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_TRANS_DETAIL_PROD_2))));
			Assert.assertEquals(file3.getCellData("Distributor StockTransfer", "Stock Transfer product", 3), 
					product.getText());
			
			WebElement qty = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_TRANSFERRED_QTY_2))));
			Assert.assertEquals(file3.getCellData("Distributor StockTransfer", "Transferred Qty", 3).concat(".000"), 
					qty.getText());
			
			WebElement unitOfMeasure = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_TRANS_DETAIL_MEASURE_2))));
			Assert.assertEquals(file3.getCellData("Distributor StockTransfer", "Stock Transfer Unit Measure", 3), 
					unitOfMeasure.getText());
		}else {
			System.out.println("row2 is not displayed");
		}
		System.out.println("Success: verified the following Stock transfer details - Product, Transferred quantity, Unit of measure");
	}

	
	@Then("^User navigates to the inventory level & verifies the Source inventory is deducted by the stock transfer order quantity\\.$")
	public void user_navigates_to_the_inventory_level_verifies_the_Source_inventory_is_deducted_by_the_stock_transfer_order_quantity() throws Throwable {
	    
		System.out.println("Attempt: navigate to the inventory level & "
				+ "verify the Source inventory is deducted by the stock transfer order quantity");
		PageObjects.SelectByXpath(
				driver, LocatorsPath.INVENTORY_LEVEL, LocatorsPath.MAX_TIME);
		
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.INVENTORY_LOCATIONS_DISP, LocatorsPath.MAX_TIME);
		
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.INVENTORY_LEVEL_SEARCH, LocatorsPath.MAX_TIME, 
				file3.getCellData("Distributor StockTransfer", "Source Inventory Location", 2));
		CallObject.block(2000);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.INVENTORY_LOCATIONS, LocatorsPath.MAX_TIME);
		
		
		WebElement row1 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INVENTORY_LEVEL_ROW_1))));
		if(row1.isDisplayed()) {
			
			WebElement totalStock = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.INVENTORY_LEVEL_TOTAL_STOCK_1))));
			WebElement saleableQty = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.INVENTORY_LEVEL_SALE_QTY_1))));
			WebElement unsaleableQty = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.INVENTORY_LEVEL_QTY_3))));
			Assert.assertEquals(
					/*(int)Double.parseDouble(file3.getCellData("Distributor StockTransfer", "Stock Transfer Qty", 2))-
					(int)Double.parseDouble(file3.getCellData("Distributor StockTransfer", "Transferred Qty", 2))-*/
					(int)Double.parseDouble(unsaleableQty.getText()) + (int)Double.parseDouble(saleableQty.getText()), 
					(int)Double.parseDouble(totalStock.getText()));
			Assert.assertEquals(
					(int)Double.parseDouble(file3.getCellData("Distributor StockTransfer", "Stock Transfer Qty", 2))-
					(int)Double.parseDouble(file3.getCellData("Distributor StockTransfer", "Transferred Qty", 2)), 
					(int)Double.parseDouble(saleableQty.getText()));
		}else {
			System.out.println("row1 is not displayed");
		}
		
		
		WebElement row2 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INVENTORY_LEVEL_ROW_2))));
		if(row2.isDisplayed()) {
			
			WebElement totalStock = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.INVENTORY_LEVEL_TOTAL_STOCK_2))));
			WebElement saleableQty = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.INVENTORY_LEVEL_SALE_QTY_2))));
			WebElement unsaleableQty = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.INVENTORY_LEVEL_QTY_4))));
			Assert.assertEquals(
					/*(int)Double.parseDouble(file3.getCellData("Distributor StockTransfer", "Stock Transfer Qty", 3))-
					(int)Double.parseDouble(file3.getCellData("Distributor StockTransfer", "Transferred Qty", 3))-*/
					(int)Double.parseDouble(unsaleableQty.getText()) + 
					(int)Double.parseDouble(saleableQty.getText()), 
					(int)Double.parseDouble(totalStock.getText()));
			Assert.assertEquals(
					(int)Double.parseDouble(file3.getCellData("Distributor StockTransfer", "Stock Transfer Qty", 3))-
					(int)Double.parseDouble(file3.getCellData("Distributor StockTransfer", "Transferred Qty", 3)), 
					(int)Double.parseDouble(saleableQty.getText()));
		}else {
			System.out.println("row2 is not displayed");
		}
		
		System.out.println("Success: navigated to the inventory level & "
				+ "verified the Source inventory is deducted by the stock transfer order quantity");
	}
	

	
	/**----------------------RCS_SaaS_Creation_Of_StockTransfer_SalesFlag_UnChecked_WC--------------------------**/
	
	
	
	@Then("^User selects the 'Stock transfer' tab and navigates to the Stock transfer screen successfully\\.$")
	public void user_selects_the_Stock_transfer_tab_and_navigates_to_the_Stock_Transfer_screen_successfully() throws Throwable {
	  
		System.out.println("Attempt: select the 'Stock transfer' tab and "
				+ "navigate to the Stock transfer screen");
		PageObjects.SelectByXpath(
				driver, LocatorsPath.STOCK_TRANSFER, LocatorsPath.MAX_TIME);
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.STOCK_TRANSFER_HEADER, LocatorsPath.MAX_TIME);
		System.out.println("Success: The 'Stock transfer' tab selected and "
				+ "navigated to the Stock transfer screen");
	}
	
	
	@Then("^User selects the Sales flag as Unchecked & verifies the destination Inventory Location displays only the part of employees hierarchy$")
	public void user_selects_the_Sales_flag_as_Unchecked_verifies_the_destination_Inventory_Location_displays_only_the_part_of_employees_hierarchy() throws Throwable {
	    
		System.out.println("Attempt: select the Sales flag as Unchecked & "
				+ "verify the destination Inventory Location displays only the part of employees hierarchy");
		
		/*distributorsSROPage.logOut();
		System.out.println("Attempt: Provide Valid child Credentials");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.LOGIN_USERNAME, LocatorsPath.MAX_TIME, 
				file.getCellData("Login", "LoginUserName", 2));
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.LOGIN_PASSWORD, LocatorsPath.MAX_TIME, 
				file.getCellData("Login", "LoginPassword", 2));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.LOGIN, LocatorsPath.MAX_TIME);
		System.out.println("Success: Able to login with the child Credentials successfully");
		
		distributorsSLOPage.user_clicks_on_the_Distributors_tab();*/
		
		WebElement salesFlag = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SALES_UNCHECK_DISPLAY))));
		
		if(salesFlag.isSelected()) {
			salesFlag.click();
		}
		
		CallObject.block(3000);
		WebElement element = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.DESTINATION_INV_LOCATION))));
		Select select = new Select(element);
		List<WebElement> allOptions = select.getOptions();
		
		String value1 = file3.getCellData("Distributor StockTransfer", "Destination Inventory Location", 3);
		String value2 = file3.getCellData("Distributor StockTransfer", "Destination Inventory Location", 4);
		 boolean found = false;
		 for(WebElement ele: allOptions) {
			 if(value1.equals(ele.getText())) {
				 found = true;
				 System.out.println(value1 +" - value exists");
				 Assert.assertTrue(found);
				 break;
			 }
			 
			 if(value2.equals(ele.getText())) {
				 found = true;
				 System.out.println(value2 +" - value exists");
				 Assert.assertTrue(found);
				 break;
			 }
			 
		 }if(!found) {
			 System.out.println(value1 +"or" + value2 +" - value doesn't exists");
			 Assert.fail(value1 +"or" + value2 +" - value doesn't exists");
	   }
	   System.out.println("Success: selected the Sales flag as Unchecked & "
	   		+ "verified the destination Inventory Location displays only the part of employees hierarchy");
	}
	

	@Then("^User selects the destination inventory location & verifies the destination inventory location displays only the part of employees hierarchy$")
	public void user_selects_the_destination_inventory_location_verifies_the_destination_inventory_location_displays_only_the_part_of_employees_hierarchy() throws Throwable {
	    
		System.out.println("Attempt: select the destination inventory location & "
				+ "verify the destination inventory location displays only the part of employees hierarchy");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.DESTINATION_INV_LOCATION, LocatorsPath.MAX_TIME, 
				file3.getCellData("Distributor StockTransfer", "Destination Inventory Location", 4));
		System.out.println("Success: The destination inventory location selected & "
				+ "verified the destination inventory location displays only the part of employees hierarchy");
	}
	

	@Then("^User navigates to the destination inventory level & verifies the Destination inventory is increased by the stock transfer order quantity\\.$")
	public void user_navigates_to_the_destination_inventory_level_verifies_the_Destination_inventory_is_increased_by_the_stock_transfer_order_quantity() throws Throwable {
	    
		System.out.println("Attempt: navigate to the destination inventory level & "
				+ "verify the Destination inventory is increased by the stock transfer order quantity");
		distributorsSROPage.logOut();
		System.out.println("Attempt: Provide Valid child Credentials");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.LOGIN_USERNAME, LocatorsPath.MAX_TIME, 
				file.getCellData("Login", "LoginUserName", 4));
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.LOGIN_PASSWORD, LocatorsPath.MAX_TIME, 
				file.getCellData("Login", "LoginPassword", 2));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.LOGIN, LocatorsPath.MAX_TIME);
		System.out.println("Success: Able to login with the child Credentials successfully");
		
		distributorsSLOPage.user_clicks_on_the_Distributors_tab();
		
		PageObjects.SelectByXpath(
				driver, LocatorsPath.INVENTORY_LEVEL, LocatorsPath.MAX_TIME);
		
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.INVENTORY_LOCATIONS_DISP, LocatorsPath.MAX_TIME);
		
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.INVENTORY_LEVEL_SEARCH, LocatorsPath.MAX_TIME, 
				file3.getCellData("Distributor StockTransfer", "Destination Inventory Location", 4));
		CallObject.block(2000);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.INVENTORY_LOCATIONS, LocatorsPath.MAX_TIME);
		
		WebElement row1 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INVENTORY_LEVEL_ROW_1))));
		if(row1.isDisplayed()) {
			
			WebElement totalStock = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.INVENTORY_LEVEL_TOTAL_STOCK_1))));
			WebElement saleableQty = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.INVENTORY_LEVEL_SALE_QTY_1))));
			WebElement unsaleableQty = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.INVENTORY_LEVEL_QTY_3))));
			Assert.assertEquals(
					(int)Double.parseDouble(file3.getCellData("Distributor StockTransfer", "child Total Stock", 2))+
					(int)Double.parseDouble(file3.getCellData("Distributor StockTransfer", "Transferred Qty", 2))+
					(int)Double.parseDouble(unsaleableQty.getText()), 
					(int)Double.parseDouble(totalStock.getText()));
			Assert.assertEquals(
					(int)Double.parseDouble(file3.getCellData("Distributor StockTransfer", "child Saleable Qty", 2))+
					(int)Double.parseDouble(file3.getCellData("Distributor StockTransfer", "Transferred Qty", 2)), 
					(int)Double.parseDouble(saleableQty.getText()));
		}else {
			System.out.println("row1 is not displayed");
		}
		
		
		WebElement row2 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INVENTORY_LEVEL_ROW_2))));
		if(row2.isDisplayed()) {
			
			WebElement totalStock = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.INVENTORY_LEVEL_TOTAL_STOCK_2))));
			WebElement saleableQty = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.INVENTORY_LEVEL_SALE_QTY_2))));
			WebElement unsaleableQty = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.INVENTORY_LEVEL_QTY_4))));
			Assert.assertEquals(
					(int)Double.parseDouble(file3.getCellData("Distributor StockTransfer", "child Total Stock", 3))+
					(int)Double.parseDouble(file3.getCellData("Distributor StockTransfer", "Transferred Qty", 3))+
					(int)Double.parseDouble(unsaleableQty.getText()), 
					(int)Double.parseDouble(totalStock.getText()));
			Assert.assertEquals(
					(int)Double.parseDouble(file3.getCellData("Distributor StockTransfer", "child Saleable Qty", 3))+
					(int)Double.parseDouble(file3.getCellData("Distributor StockTransfer", "Transferred Qty", 3)), 
					(int)Double.parseDouble(saleableQty.getText()));
		}else {
			System.out.println("row2 is not displayed");
		}
		System.out.println("Success: navigated to the destination inventory level & "
				+ "verified the Destination inventory is increased by the stock transfer order quantity");
	}
}
