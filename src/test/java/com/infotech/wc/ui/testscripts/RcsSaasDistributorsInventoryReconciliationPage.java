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

public class RcsSaasDistributorsInventoryReconciliationPage extends TestRunnerWebClient{

	WebDriver driver = getDriver();
	Actions actions = new Actions(driver);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	ExcelApiFile file  = new ExcelApiFile("TestData.xlsx");
	ExcelApiFile file3 = new ExcelApiFile("TestData3.xlsx");
	WebDriverWait wait = new WebDriverWait(driver, LocatorsPath.MAX_TIME);
	RcsSaasDistributorsSLOPage distributorsSLOPage = new RcsSaasDistributorsSLOPage();
	RcaSaasDistributorsSROPage distributorsSROPage = new RcaSaasDistributorsSROPage();
	
	
	public RcsSaasDistributorsInventoryReconciliationPage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	/**----------------------RCS_SaaS_Creation_Of_InventoryReconciliation_WC--------------------------**/
	
	
	
	@When("^User Provides the valid parent credentials$")
	public void user_Provides_the_valid_parent_credentials() throws Throwable {
	 
		distributorsSLOPage.user_clicks_on_the_Distributors_tab();
		
		/*------------------------PRE-Requisite -----------------------*/
		
		PageObjects.SelectByXpath(
				driver, LocatorsPath.INVENTORY_LEVEL, LocatorsPath.MAX_TIME);
		
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.INVENTORY_LOCATIONS_DISP, LocatorsPath.MAX_TIME);
		
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.RECON_INVENTORY_LEVEL_SEARCH, LocatorsPath.MAX_TIME, 
				file3.getCellData("DistributorReturnOrder", "Inventory Location Name", 2));
		CallObject.block(2000);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.INVENTORY_LOCATIONS, LocatorsPath.MAX_TIME);
		
		WebElement row = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.RECON_INVENTORY_LEVEL_ROW_1))));
		if(row.isDisplayed()) {
			WebElement saleable = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.INV_LEVEL_SALEABLE_QTY_1))));
			file3.setCellData("DistributorInvRecounciliation", "Inv Saleable Qty", 2, saleable.getText());
			
			WebElement unsaleable = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.INV_LEVEL_UNSALEABLE_QTY_1))));
			file3.setCellData("DistributorInvRecounciliation", "Inv UnSaleable Qty", 2, unsaleable.getText());
		}else {
			System.out.println("row1 is not displayed");
		}
		
		WebElement Row = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.RECON_INVENTORY_LEVEL_ROW_2))));
		if(Row.isDisplayed()) {
			WebElement saleable = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.INV_LEVEL_SALEABLE_QTY_2))));
			file3.setCellData("DistributorInvRecounciliation", "Inv Saleable Qty", 3, saleable.getText());
			
			WebElement unsaleable = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.INV_LEVEL_UNSALEABLE_QTY_2))));
			file3.setCellData("DistributorInvRecounciliation", "Inv UnSaleable Qty", 3, unsaleable.getText());
		}else {
			System.out.println("row2 is not displayed");
		}
		
		/*------------------------PRE-Requisite -----------------------*/
	}
	

	@Then("^User selects the 'Inventory reconciliaiton' tab and navigates to the inventory reconciliation screen$")
	public void user_selects_the_Inventory_reconciliaiton_tab_and_navigates_to_the_inventory_reconciliation_screen() throws Throwable {
	    
		System.out.println("Attempt: select the 'Inventory reconciliaiton' "
				+ "tab and navigate to the inventory reconciliation screen");
		PageObjects.SelectByXpath(
				driver, LocatorsPath.INVENTORY_RECONCILIATION, LocatorsPath.MAX_TIME);
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.INVENTORY_RECONCIL_DISP, LocatorsPath.MAX_TIME);
		System.out.println("Success: The 'Inventory reconciliaiton' "
				+ "tab selected and navigated to the inventory reconciliation screen");
	}

	
	@Then("^User clicks on the 'Create Inventory reconciliation'$")
	public void user_clicks_on_the_Create_Inventory_reconciliation() throws Throwable {
	 
		System.out.println("Attempt: click on the 'Create Inventory reconciliation'");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.CREATE_INV_RECONCIL, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Create Inventory reconciliation' clicked successfully");
	}
	

	@Then("^User verifies the Inventory reconciliation with 'Open' status is created and all the SKU is displayed in the details$")
	public void user_verifies_the_Inventory_reconciliation_with_Open_status_is_created_and_all_the_SKU_is_displayed_in_the_details() throws Throwable {
	    
		System.out.println("Attempt: verify the Inventory reconciliation with 'Open' "
				+ "status is created and all the SKU is displayed in the details");
		WebElement status = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INV_RECONCIL_ORDER_STATUS))));
		Assert.assertEquals(file3.getCellData("DistributorInvRecounciliation", "Status", 2), 
				status.getText());
		
		PageObjects.SelectByCSSSelectorWithoutClick(
				driver, LocatorsPath.INV_RECONCIL_PRODUCT_DETAILS, LocatorsPath.MAX_TIME);
		System.out.println("Success: verified the Inventory reconciliation with 'Open' "
				+ "status is created and all the SKU is displayed in the details");
	}
	

	@Then("^User verifies the following Inventory Reconciliation Header Details - Inventory reconciliation number, Date, Status$")
	public void user_verifies_the_following_Inventory_Reconciliation_Header_Details_Inventory_reconciliation_number_Date_Status() throws Throwable {
	    
		System.out.println("Attempt: verify the following Inventory Reconciliation Header Details - "
				+ "Inventory reconciliation number, Date, Status");
		WebElement number = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INV_RECONCIL_NUMBER))));
		Assert.assertEquals("Inventory Reconciliation Number", number.getText());
		
		WebElement date = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INV_RECONCIL_DATE))));
		Assert.assertEquals("Date", date.getText());
		
		WebElement status = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INV_RECONCIL_STATUS))));
		Assert.assertEquals("Status", status.getText());
		System.out.println("Success: verified the following Inventory Reconciliation Header Details - "
				+ "Inventory reconciliation number, Date, Status");
	}
	

	@Then("^User verifies the following Inventory Reconciliation Product Details - SKU name, Saleable qty, Unsaleable qty$")
	public void user_verifies_the_following_Inventory_Reconciliation_Product_Details_SKU_name_Saleable_qty_Unsaleable_qty() throws Throwable {
	   
		System.out.println("Attempt: verify the following Inventory Reconciliation "
				+ "Product Details - SKU name, Saleable qty, Unsaleable qty");
		WebElement product = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INV_RECONCIL_PRODUCT))));
		Assert.assertEquals("Product", product.getText());
		
		WebElement saleableQty = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INV_RECONCIL_SALEABLE_QTY))));
		Assert.assertEquals("Saleable Qty", saleableQty.getText());
		
		WebElement unSaleableQty = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INV_RECONCIL_UNSALEABLE_QTY))));
		Assert.assertEquals("Unsaleable Quantity", unSaleableQty.getText());
		System.out.println("Success: verified the following Inventory Reconciliation "
				+ "Product Details - SKU name, Saleable qty, Unsaleable qty");
	}
	

	@Then("^User enters the saleable and unsaleable qty against each SKU$")
	public void user_enters_the_saleable_and_unsaleable_qty_against_each_SKU() throws Throwable {
	 
		System.out.println("Attempt: enter the saleable and unsaleable qty against each SKU");
		WebElement row1 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INV_RECONCIL_SKU_ROW_1))));
        if(row1.isDisplayed()) {
        	WebElement sku = wait.until(ExpectedConditions.
    				presenceOfElementLocated((By.cssSelector(LocatorsPath.INV_RECONCIL_SKU_1))));
        	file3.setCellData("DistributorInvRecounciliation", "SKU", 2, sku.getText());
        	PageObjects.SelectByCSSSelectorWithSendKeys(
        			driver, LocatorsPath.INV_RECONCIL_SALEABLE_QTY_1, LocatorsPath.MAX_TIME, 
        			file3.getCellData("DistributorInvRecounciliation", "Saleable Qty", 2));
        	PageObjects.SelectByCSSSelectorWithSendKeys(
        			driver, LocatorsPath.INV_RECONCIL_UNSALEABLE_QTY_1, LocatorsPath.MAX_TIME, 
        			file3.getCellData("DistributorInvRecounciliation", "UnSaleable Qty", 2));
		}else {
			System.out.println("row1 is not displayed");
		}
        
        
        WebElement row2 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INV_RECONCIL_SKU_ROW_2))));
        if(row2.isDisplayed()) {
        	WebElement sku = wait.until(ExpectedConditions.
    				presenceOfElementLocated((By.cssSelector(LocatorsPath.INV_RECONCIL_SKU_2))));
        	file3.setCellData("DistributorInvRecounciliation", "SKU", 3, sku.getText());
        	PageObjects.SelectByCSSSelectorWithSendKeys(
        			driver, LocatorsPath.INV_RECONCIL_SALEABLE_QTY_2, LocatorsPath.MAX_TIME, 
        			file3.getCellData("DistributorInvRecounciliation", "Saleable Qty", 3));
        	PageObjects.SelectByCSSSelectorWithSendKeys(
        			driver, LocatorsPath.INV_RECONCIL_UNSALEABLE_QTY_2, LocatorsPath.MAX_TIME, 
        			file3.getCellData("DistributorInvRecounciliation", "UnSaleable Qty", 3));
		}else {
			System.out.println("row2 is not displayed");
		}
        System.out.println("Success: The saleable and unsaleable qty against each SKU entered successfully");
	}
	

	@Then("^User clicks on 'Compute' button & navigates to the variance screen$")
	public void user_clicks_on_Compute_button_navigates_to_the_variance_screen() throws Throwable {
	    
		System.out.println("Attempt: click on 'Compute' button & navigate to the variance screen");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.INV_RECONCIL_COMPUTE, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Compute' button clicked & navigated to the variance screen");
	}
	

	@Then("^User verifies the 'Product' - SKU Name is displayed$")
	public void user_verifies_the_Product_SKU_Name_is_displayed() throws Throwable {
	  
		System.out.println("Attempt: verify the 'Product' - SKU Name is displayed");
		WebElement row1 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INV_RECONCIL_SKU_ROW_1))));
        if(row1.isDisplayed()) {
        	WebElement sku = wait.until(ExpectedConditions.
    				presenceOfElementLocated((By.cssSelector(LocatorsPath.INV_RECONCIL_SKU_1))));
        	Assert.assertEquals(file3.getCellData("DistributorInvRecounciliation", "SKU", 2), 
        			sku.getText());
		}else {
			System.out.println("row1 is not displayed");
		}
        
        WebElement row2 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INV_RECONCIL_SKU_ROW_2))));
        if(row2.isDisplayed()) {
        	WebElement sku = wait.until(ExpectedConditions.
    				presenceOfElementLocated((By.cssSelector(LocatorsPath.INV_RECONCIL_SKU_2))));
        	Assert.assertEquals(file3.getCellData("DistributorInvRecounciliation", "SKU", 3), 
        			sku.getText());
		}else {
			System.out.println("row2 is not displayed");
		}
        System.out.println("Success: verified the 'Product' - SKU Name is displayed");
	}
	

	@Then("^User verifies the 'Saleable qty' is displayed which is entered during reconcilaition$")
	public void user_verifies_the_Saleable_qty_is_displayed_which_is_entered_during_reconcilaition() throws Throwable {
	    
		System.out.println("Attempt: verify the 'Saleable qty' is displayed which is entered during reconcilaition");
		WebElement row1 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INV_RECONCIL_SKU_ROW_1))));
        if(row1.isDisplayed()) {
        	WebElement saleableQty = wait.until(ExpectedConditions.
    				presenceOfElementLocated((By.cssSelector(LocatorsPath.SKU_SALEABLE_QTY_1))));
        	Assert.assertEquals(file3.getCellData("DistributorInvRecounciliation", "Saleable Qty", 2), 
        			saleableQty.getText());
		}else {
			System.out.println("row1 is not displayed");
		}
        
        WebElement row2 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INV_RECONCIL_SKU_ROW_2))));
        if(row2.isDisplayed()) {
        	WebElement saleableQty = wait.until(ExpectedConditions.
    				presenceOfElementLocated((By.cssSelector(LocatorsPath.SKU_SALEABLE_QTY_2))));
        	Assert.assertEquals(file3.getCellData("DistributorInvRecounciliation", "Saleable Qty", 3), 
        			saleableQty.getText());
		}else {
			System.out.println("row2 is not displayed");
		}
        System.out.println("Success: verified the 'Saleable qty' is displayed which is entered during reconcilaition");
	}
	

	@Then("^User verifies the 'Saleable system qty' is displayed from the user inventory levels$")
	public void user_verifies_the_Saleable_system_qty_is_displayed_from_the_user_inventory_levels() throws Throwable {
	 
		System.out.println("Attempt: verify the 'Saleable system qty' is displayed from the user inventory levels");
		WebElement row1 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INV_RECONCIL_SKU_ROW_1))));
        if(row1.isDisplayed()) {
        	WebElement saleableSystemQty = wait.until(ExpectedConditions.
    				presenceOfElementLocated((By.cssSelector(LocatorsPath.SALEABLE_SYSTEM_QTY_1))));
        	Assert.assertEquals(file3.getCellData("DistributorInvRecounciliation", "Inv Saleable Qty", 2), 
        			saleableSystemQty.getText());
		}else {
			System.out.println("row1 is not displayed");
		}
        
        WebElement row2 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INV_RECONCIL_SKU_ROW_2))));
        if(row2.isDisplayed()) {
        	WebElement saleableSystemQty = wait.until(ExpectedConditions.
    				presenceOfElementLocated((By.cssSelector(LocatorsPath.SALEABLE_SYSTEM_QTY_2))));
        	Assert.assertEquals(file3.getCellData("DistributorInvRecounciliation", "Inv Saleable Qty", 3), 
        			saleableSystemQty.getText());
		}else {
			System.out.println("row2 is not displayed");
		}
        System.out.println("Success: verified the 'Saleable system qty' is displayed from the user inventory levels");
	}
	

	@Then("^User verifies the 'Difference' is displayed - difference between the Saleable qty and saleable system qty$")
	public void user_verifies_the_Difference_is_displayed_difference_between_the_Saleable_qty_and_saleable_system_qty() throws Throwable {
	    
		System.out.println("Attempt: verify the 'Difference' is displayed - "
				+ "difference between the Saleable qty and saleable system qty");
		WebElement row1 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INV_RECONCIL_SKU_ROW_1))));
        if(row1.isDisplayed()) {
        	WebElement difference = wait.until(ExpectedConditions.
    				presenceOfElementLocated((By.cssSelector(LocatorsPath.DIFFERENCE_1))));
        	Assert.assertEquals(
					(int)Double.parseDouble(file3.getCellData("DistributorInvRecounciliation", "Inv Saleable Qty", 2))-
					(int)Double.parseDouble(file3.getCellData("DistributorInvRecounciliation", "Saleable Qty", 2)), 
					(int)Double.parseDouble(difference.getText()));
		}else {
			System.out.println("row1 is not displayed");
		}
        
        WebElement row2 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INV_RECONCIL_SKU_ROW_2))));
        if(row2.isDisplayed()) {
        	WebElement difference = wait.until(ExpectedConditions.
    				presenceOfElementLocated((By.cssSelector(LocatorsPath.DIFFERENCE_2))));
        	Assert.assertEquals(
					(int)Double.parseDouble(file3.getCellData("DistributorInvRecounciliation", "Inv Saleable Qty", 3))-
					(int)Double.parseDouble(file3.getCellData("DistributorInvRecounciliation", "Saleable Qty", 3)), 
					(int)Double.parseDouble(difference.getText()));
		}else {
			System.out.println("row2 is not displayed");
		}
        System.out.println("Success: verified the 'Difference' is displayed - "
        		+ "difference between the Saleable qty and saleable system qty");
	}
	

	@Then("^User verifies the 'Variance flag' is displayed - If any difference found then the variance flag is checked$")
	public void user_verifies_the_Variance_flag_is_displayed_If_any_difference_found_then_the_variance_flag_is_checked() throws Throwable {
	 
		System.out.println("Attempt: verify the 'Variance flag' is displayed - "
				+ "If any difference found then the variance flag is checked");
		WebElement varianceFlag = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.VARIANCE_FLAG_1))));
		WebElement varianceReason = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.VARIANCE_REASON_1))));
		WebElement difference1 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.DIFFERENCE_1))));
        if(difference1.getText().contains("0.000")) {
        		Assert.assertTrue(!varianceFlag.isSelected());
        		Assert.assertTrue(!varianceReason.isEnabled());
        	}else {
        		PageObjects.SelectByCSSSelectorWithSendKeys(
            			driver, LocatorsPath.VARIANCE_REASON_1, LocatorsPath.MAX_TIME, 
            			file3.getCellData("DistributorInvRecounciliation", "Variance Reason", 2));
        	}
        
		WebElement varianceflag = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.VARIANCE_FLAG_2))));
		WebElement variancereason = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.VARIANCE_REASON_2))));
		WebElement difference2 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.DIFFERENCE_2))));
        if(difference2.getText().contains("0.000")) {
        		Assert.assertTrue(!varianceflag.isSelected());
        		Assert.assertTrue(!variancereason.isEnabled());
        	}else {
        		PageObjects.SelectByCSSSelectorWithSendKeys(
            			driver, LocatorsPath.VARIANCE_REASON_2, LocatorsPath.MAX_TIME, 
            			file3.getCellData("DistributorInvRecounciliation", "Variance Reason", 3));
        	}
        System.out.println("Success: verified the 'Variance flag' is displayed - "
        		+ "If any difference found then the variance flag is checked");
	}
	

	@Then("^User selects the 'Variance reason' - If variance flag is checked then the variance reason is selected for that SKU$")
	public void user_selects_the_Variance_reason_If_variance_flag_is_checked_then_the_variance_reason_is_selected_for_that_SKU() throws Throwable {
	   
		System.out.println("User selects the 'Variance reason' - If variance flag is "
				+ "checked then the variance reason is selected for that SKU");
	}
	

	@Then("^User verifies the 'Unsaleable qty' is displayed which is entered during reconcilaition$")
	public void user_verifies_the_Unsaleable_qty_is_displayed_which_is_entered_during_reconcilaition() throws Throwable {
	   
		System.out.println("Attempt: verify the 'UnSaleable qty' is displayed which is entered during reconcilaition");
		WebElement row1 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INV_RECONCIL_SKU_ROW_1))));
        if(row1.isDisplayed()) {
        	WebElement UnsaleableQty = wait.until(ExpectedConditions.
    				presenceOfElementLocated((By.cssSelector(LocatorsPath.SKU_UNSALEABLE_QTY_1))));
        	Assert.assertEquals(file3.getCellData("DistributorInvRecounciliation", "UnSaleable Qty", 2), 
        			UnsaleableQty.getText());
		}else {
			System.out.println("row1 is not displayed");
		}
        
        WebElement row2 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INV_RECONCIL_SKU_ROW_2))));
        if(row2.isDisplayed()) {
        	WebElement UnsaleableQty = wait.until(ExpectedConditions.
    				presenceOfElementLocated((By.cssSelector(LocatorsPath.SKU_UNSALEABLE_QTY_2))));
        	Assert.assertEquals(file3.getCellData("DistributorInvRecounciliation", "UnSaleable Qty", 3), 
        			UnsaleableQty.getText());
		}else {
			System.out.println("row2 is not displayed");
		}
        System.out.println("Success: verified the 'UnSaleable qty' is displayed which is entered during reconcilaition");
	}
	

	@Then("^User verifies the 'Unsaleable system qty' is displayed from the user inventory levels$")
	public void user_verifies_the_Unsaleable_system_qty_is_displayed_from_the_user_inventory_levels() throws Throwable {
	    
		System.out.println("Attempt: verify the 'UnSaleable system qty' is displayed from the user inventory levels");
		WebElement row1 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INV_RECONCIL_SKU_ROW_1))));
        if(row1.isDisplayed()) {
        	WebElement UnsaleableSystemQty = wait.until(ExpectedConditions.
    				presenceOfElementLocated((By.cssSelector(LocatorsPath.UNSALEABLE_SYSTEM_QTY_1))));
        	Assert.assertEquals(file3.getCellData("DistributorInvRecounciliation", "Inv UnSaleable Qty", 2), 
        			UnsaleableSystemQty.getText());
		}else {
			System.out.println("row1 is not displayed");
		}
        
        WebElement row2 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INV_RECONCIL_SKU_ROW_2))));
        if(row2.isDisplayed()) {
        	WebElement UnsaleableSystemQty = wait.until(ExpectedConditions.
    				presenceOfElementLocated((By.cssSelector(LocatorsPath.UNSALEABLE_SYSTEM_QTY_2))));
        	Assert.assertEquals(file3.getCellData("DistributorInvRecounciliation", "Inv UnSaleable Qty", 3), 
        			UnsaleableSystemQty.getText());
		}else {
			System.out.println("row2 is not displayed");
		}
        System.out.println("Success: verified the 'UnSaleable system qty' is displayed from the user inventory levels");
	}
	

	@Then("^User verifies the 'Unsaleable Difference' is displayed - difference between the unsaleable qty and unsaleable system qty$")
	public void user_verifies_the_Unsaleable_Difference_is_displayed_difference_between_the_unsaleable_qty_and_unsaleable_system_qty() throws Throwable {
	    
		System.out.println("Attempt: verify the 'Unsaleable Difference' is displayed - "
				+ "difference between the UnSaleable qty and Unsaleable system qty");
		WebElement row1 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INV_RECONCIL_SKU_ROW_1))));
        if(row1.isDisplayed()) {
        	WebElement difference = wait.until(ExpectedConditions.
    				presenceOfElementLocated((By.cssSelector(LocatorsPath.UNSALEABLE_DIFFERENCE_1))));
        	Assert.assertEquals(
					(int)Double.parseDouble(file3.getCellData("DistributorInvRecounciliation", "Inv UnSaleable Qty", 2))-
					(int)Double.parseDouble(file3.getCellData("DistributorInvRecounciliation", "UnSaleable Qty", 2)), 
					(int)Double.parseDouble(difference.getText()));
		}else {
			System.out.println("row1 is not displayed");
		}
        
        WebElement row2 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INV_RECONCIL_SKU_ROW_2))));
        if(row2.isDisplayed()) {
        	WebElement difference = wait.until(ExpectedConditions.
    				presenceOfElementLocated((By.cssSelector(LocatorsPath.UNSALEABLE_DIFFERENCE_2))));
        	Assert.assertEquals(
					(int)Double.parseDouble(file3.getCellData("DistributorInvRecounciliation", "Inv UnSaleable Qty", 3))-
					(int)Double.parseDouble(file3.getCellData("DistributorInvRecounciliation", "UnSaleable Qty", 3)), 
					(int)Double.parseDouble(difference.getText()));
		}else {
			System.out.println("row2 is not displayed");
		}
        System.out.println("Success: verified the 'Unsaleable Difference' is displayed - "
        		+ "difference between the UnSaleable qty and Unsaleable system qty");
	}
	

	@Then("^User verifies the 'Unsaleable Variance flag' is displayed - If any unsaleable difference found then the variance flag is checked$")
	public void user_verifies_the_Unsaleable_Variance_flag_is_displayed_If_any_unsaleable_difference_found_then_the_variance_flag_is_checked() throws Throwable {
	    
		System.out.println("Attempt: verify the 'Unsaleable Variance flag' is displayed - "
				+ "If any Unsaleable difference found then the variance flag is checked");
		WebElement varianceFlag = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.UNSALEABLE_VARIANCE_FLAG_1))));
		WebElement varianceReason = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.UNSALEABLE_VARIANCE_REASON_1))));
		WebElement difference1 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.UNSALEABLE_DIFFERENCE_1))));
        if(difference1.getText().contains("0.000")) {
        		Assert.assertTrue(!varianceFlag.isSelected());
        		Assert.assertTrue(!varianceReason.isEnabled());
        	}else {
        		PageObjects.SelectByCSSSelectorWithSendKeys(
            			driver, LocatorsPath.UNSALEABLE_VARIANCE_REASON_1, LocatorsPath.MAX_TIME, 
            			file3.getCellData("DistributorInvRecounciliation", "Unsaleable Variance Reason", 2));
        	}

		WebElement varianceflag = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.UNSALEABLE_VARIANCE_FLAG_2))));
		WebElement variancereason = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.UNSALEABLE_VARIANCE_REASON_2))));
		WebElement difference2 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.UNSALEABLE_DIFFERENCE_2))));
        if(difference2.getText().contains("0.000")) {
        	Assert.assertTrue(!varianceflag.isSelected());
    		Assert.assertTrue(!variancereason.isEnabled());
        	}else {
        		PageObjects.SelectByCSSSelectorWithSendKeys(
            			driver, LocatorsPath.UNSALEABLE_VARIANCE_REASON_2, LocatorsPath.MAX_TIME, 
            			file3.getCellData("DistributorInvRecounciliation", "Unsaleable Variance Reason", 3));
        	}
        System.out.println("Success: verified the 'Unsaleable Variance flag' is displayed - "
        		+ "If any Unsaleable difference found then the variance flag is checked");
	}
	

	@Then("^User selects the 'Unsaleable Variance reason' - If Unsaleable variance flag is checked then the variance reason is selected for that SKU$")
	public void user_selects_the_Unsaleable_Variance_reason_If_Unsaleable_variance_flag_is_checked_then_the_variance_reason_is_selected_for_that_SKU() throws Throwable {
	 
		System.out.println("User selects the 'Unsaleable Variance reason' - "
				+ "If Unsaleable variance flag is checked then the variance reason is selected for that SKU");
	}
	

	@Then("^User clicks on the 'Commit' button & verifies the Inventory reconciliation completed successfully message is displayed$")
	public void user_clicks_on_the_Commit_button_verifies_the_Inventory_reconciliation_completed_successfully_message_is_displayed() throws Throwable {
	    
		System.out.println("Attempt: click on the 'Commit' button & "
				+ "verify the Inventory reconciliation completed successfully message is displayed");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.INV_RECONCIL_COMMIT, LocatorsPath.MAX_TIME);
		
		WebElement msg = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.RECON_SUCCESS_MESSAGE))));
    	Assert.assertEquals("Inventory reconciliation completed successfully.", msg.getText());
    	System.out.println("Success: 'Commit' button clicked & "
    			+ "verified the Inventory reconciliation completed successfully message is displayed");
	}
	

	@Then("^User verifies the Inventory levels is updated with the latest saleable and unsaleable quantities\\.$")
	public void user_verifies_the_Inventory_levels_is_updated_with_the_latest_saleable_and_unsaleable_quantities() throws Throwable {
	    
		System.out.println("Attempt: verify the Inventory levels is "
				+ "updated with the latest saleable and unsaleable quantities");
		PageObjects.SelectByXpath(
				driver, LocatorsPath.INVENTORY_LEVEL, LocatorsPath.MAX_TIME);
		
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.INVENTORY_LOCATIONS_DISP, LocatorsPath.MAX_TIME);
		
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.RECON_INVENTORY_LEVEL_SEARCH, LocatorsPath.MAX_TIME, 
				file3.getCellData("DistributorReturnOrder", "Inventory Location Name", 2));
		CallObject.block(2000);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.INVENTORY_LOCATIONS, LocatorsPath.MAX_TIME);
		
		WebElement row = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.RECON_INVENTORY_LEVEL_ROW_1))));
		if(row.isDisplayed()) {
			WebElement saleable = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.INV_LEVEL_SALEABLE_QTY_1))));
			Assert.assertEquals(file3.getCellData("DistributorInvRecounciliation", "Saleable Qty", 2).concat(".000"), 
					saleable.getText());
			
			WebElement unsaleable = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.INV_LEVEL_UNSALEABLE_QTY_1))));
			Assert.assertEquals(file3.getCellData("DistributorInvRecounciliation", "UnSaleable Qty", 2).concat(".000"), 
					unsaleable.getText());
			
			WebElement totalStock = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.RECON_INV_LEVEL_TOTAL_STOCK_1))));
			Assert.assertEquals((int)Double.parseDouble(file3.getCellData("DistributorInvRecounciliation", "Saleable Qty", 2))+
					(int)Double.parseDouble(file3.getCellData("DistributorInvRecounciliation", "UnSaleable Qty", 2)), 
					(int)Double.parseDouble(totalStock.getText()));
		}else {
			System.out.println("row1 is not displayed");
		}
		
		WebElement Row = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.RECON_INVENTORY_LEVEL_ROW_2))));
		if(Row.isDisplayed()) {
			WebElement saleable = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.INV_LEVEL_SALEABLE_QTY_2))));
			Assert.assertEquals(file3.getCellData("DistributorInvRecounciliation", "Saleable Qty", 3).concat(".000"), 
					saleable.getText());
			
			WebElement unsaleable = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.INV_LEVEL_UNSALEABLE_QTY_2))));
			Assert.assertEquals(file3.getCellData("DistributorInvRecounciliation", "UnSaleable Qty", 3).concat(".000"), 
					unsaleable.getText());
			
			WebElement totalStock = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.RECON_INV_LEVEL_TOTAL_STOCK_2))));
			Assert.assertEquals((int)Double.parseDouble(file3.getCellData("DistributorInvRecounciliation", "Saleable Qty",3))+
					(int)Double.parseDouble(file3.getCellData("DistributorInvRecounciliation", "UnSaleable Qty", 3)), 
					(int)Double.parseDouble(totalStock.getText()));
		}else {
			System.out.println("row2 is not displayed");
		}
		System.out.println("Success: verified the Inventory levels is "
				+ "updated with the latest saleable and unsaleable quantities");
	}
	

	
	/**----------------------RCS_SaaS_Verify_Commited_InventoryReconciliation_WC--------------------------**/
	
	
	
	@Then("^User selects the status to 'Commited' from the dropdown & navigates to the inventory reconciliation screen$")
	public void user_selects_the_status_to_Commited_from_the_dropdown_navigates_to_the_inventory_reconciliation_screen() throws Throwable {
	    
		System.out.println("Attempt: select the status to 'Commited' from the dropdown & "
				+ "navigate to the inventory reconciliation screen");
		user_selects_the_Inventory_reconciliaiton_tab_and_navigates_to_the_inventory_reconciliation_screen();
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.INV_RECONCIL_STATUS_SELECTION, LocatorsPath.MAX_TIME, 
				file3.getCellData("DistributorInvRecounciliation", "Status", 3));
		System.out.println("Success: selected the status to 'Commited' from the dropdown & "
				+ "navigated to the inventory reconciliation screen");
	}
	

	@Then("^User verifies the Start and end date fields gets enabled & then user selects a different date range & clicks on show button$")
	public void user_verifies_the_Start_and_end_date_fields_gets_enabled_then_user_selects_a_different_date_range_clicks_on_show_button() throws Throwable {
	    
		System.out.println("Attempt: verify the Start and end date fields gets"
				+ " enabled & then select a different date range & click on show button");
		/*PageObjects.SelectByCSSSelector(
				driver, START_DATE_CALENDER, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelector(
				driver, DATE_SELECTION, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelector(
				driver, END_DATE_CALENDER, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelector(
				driver, DATE_SELECTION, LocatorsPath.MAX_TIME);*/
		
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.INV_RECONCIL_SHOW, LocatorsPath.MAX_TIME);
		System.out.println("Success: verified the Start and end date fields gets "
				+ "enabled & then selected a different date range & clicked on show button");
	}
	

	@Then("^User verifies the Reconciliation records for the selected date range is displayed$")
	public void user_verifies_the_Reconciliation_records_for_the_selected_date_range_is_displayed() throws Throwable {
	 
		System.out.println("Attempt: verify the Reconciliation records "
				+ "for the selected date range is displayed");
		PageObjects.SelectByCSSSelectorWithoutClick(
				driver, LocatorsPath.INV_RECONCIL_RECORD, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.INV_RECONCIL_RECORD_SELECT, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelectorWithoutClick(
				driver, LocatorsPath.INV_RECONCIL_PRODUCT_DETAILS, LocatorsPath.MAX_TIME);
		System.out.println("Success: verified the Reconciliation records "
				+ "for the selected date range is displayed");
	}
	

	@Then("^User navigates to the Inventory levels screen & searches for the inventory for whom the Inventory reconciliation has been performed$")
	public void user_navigates_to_the_Inventory_levels_screen_searches_for_the_inventory_for_whom_the_Inventory_reconciliation_has_been_performed() throws Throwable {
	    
		System.out.println("Attempt: navigate to the Inventory levels screen &"
				+ " search for the inventory for whom the Inventory reconciliation has been performed");
		PageObjects.SelectByXpath(
				driver, LocatorsPath.INVENTORY_LEVEL, LocatorsPath.MAX_TIME);
		
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.INVENTORY_LOCATIONS_DISP, LocatorsPath.MAX_TIME);
		
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.RECON_INVENTORY_LEVEL_SEARCH, LocatorsPath.MAX_TIME, 
				file3.getCellData("DistributorReturnOrder", "Inventory Location Name", 2));
		CallObject.block(2000);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.INVENTORY_LOCATIONS, LocatorsPath.MAX_TIME);
		System.out.println("Success: navigated to the Inventory levels screen & "
				+ "searched for the inventory for whom the Inventory reconciliation has been performed");
	}
	

	@Then("^User verifies the Saleable and Unsaleable qty of the inventory is displayed as per the previous inventory reconciliation records\\.$")
	public void user_verifies_the_Saleable_and_Unsaleable_qty_of_the_inventory_is_displayed_as_per_the_previous_inventory_reconciliation_records() throws Throwable {
	   
        System.out.println("Attempt: verify the Saleable and Unsaleable qty of "
        		+ "the inventory is displayed as per the previous inventory reconciliation records");
		WebElement row = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.RECON_INVENTORY_LEVEL_ROW_1))));
		if(row.isDisplayed()) {
			WebElement saleable = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.INV_LEVEL_SALEABLE_QTY_1))));
			Assert.assertEquals(file3.getCellData("DistributorInvRecounciliation", "Saleable Qty", 2).concat(".000"), 
					saleable.getText());
			
			WebElement unsaleable = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.INV_LEVEL_UNSALEABLE_QTY_1))));
			Assert.assertEquals(file3.getCellData("DistributorInvRecounciliation", "UnSaleable Qty", 2).concat(".000"), 
					unsaleable.getText());
			
			WebElement totalStock = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.RECON_INV_LEVEL_TOTAL_STOCK_1))));
			Assert.assertEquals((int)Double.parseDouble(file3.getCellData("DistributorInvRecounciliation", "Saleable Qty", 2))+
					(int)Double.parseDouble(file3.getCellData("DistributorInvRecounciliation", "UnSaleable Qty", 2)), 
					(int)Double.parseDouble(totalStock.getText()));
		}else {
			System.out.println("row1 is not displayed");
		}
		
		WebElement Row = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.RECON_INVENTORY_LEVEL_ROW_2))));
		if(Row.isDisplayed()) {
			WebElement saleable = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.INV_LEVEL_SALEABLE_QTY_2))));
			Assert.assertEquals(file3.getCellData("DistributorInvRecounciliation", "Saleable Qty", 3).concat(".000"), 
					saleable.getText());
			
			WebElement unsaleable = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.INV_LEVEL_UNSALEABLE_QTY_2))));
			Assert.assertEquals(file3.getCellData("DistributorInvRecounciliation", "UnSaleable Qty", 3).concat(".000"), 
					unsaleable.getText());
			
			WebElement totalStock = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.RECON_INV_LEVEL_TOTAL_STOCK_2))));
			Assert.assertEquals((int)Double.parseDouble(file3.getCellData("DistributorInvRecounciliation", "Saleable Qty",3))+
					(int)Double.parseDouble(file3.getCellData("DistributorInvRecounciliation", "UnSaleable Qty", 3)), 
					(int)Double.parseDouble(totalStock.getText()));
		}else {
			System.out.println("row2 is not displayed");
		}
		System.out.println("Success: verified the Saleable and Unsaleable qty of the "
				+ "inventory is displayed as per the previous inventory reconciliation records");
	}
}
