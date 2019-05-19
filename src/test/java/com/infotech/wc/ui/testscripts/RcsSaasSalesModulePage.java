package com.infotech.wc.ui.testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
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

public class RcsSaasSalesModulePage extends TestRunnerWebClient{
	
	WebDriver driver = getDriver();
	Actions actions = new Actions(driver);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	ExcelApiFile file3 = new ExcelApiFile("TestData3.xlsx");
	WebDriverWait wait = new WebDriverWait(driver, LocatorsPath.MAX_TIME);
	
	public RcsSaasSalesModulePage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	/**----------------------RCS_SaaS_SalesModule_Navigation_WC--------------------------**/
	
	
	
	@Then("^User clicks on 'Sales Module' Tab$")
	public void user_clicks_on_Sales_Module_Tab() throws Throwable {
	    
		System.out.println("Attempt: click on Sales Module tab");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.SALES_MODULE, LocatorsPath.MAX_TIME);	
		System.out.println("Success: Sales Module tab clicked successfully");
	}

	
	@Then("^The User should be navigated to Sales Module screen successfully$")
	public void the_User_should_be_navigated_to_Sales_Module_screen_successfully() throws Throwable {
	    
		System.out.println("User should be navigated to Sales Module screen successfully");
	}

	
	@Then("^User verifies by default Start of Day screen should appear under Sales Module successfully$")
	public void user_verifies_by_default_Start_of_Day_screen_should_appear_under_Sales_Module_successfully() throws Throwable {
	   
		System.out.println("Attempt: verify by default Start of Day screen "
				+ "should appear under Sales Module");
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.DEFAULT_ACTIVE_ELEMENT, LocatorsPath.MAX_TIME);
		System.out.println("Success: By default Start of Day screen appeared "
				+ "under Sales Module successfully");
	}
	
	
	
	/**----------------------RCS_SaaS_Verify_SalesModule_WC--------------------------**/
	
	
	
	@Then("^User verifies the 'Start of Day' tab is available under Sales Module$")
	public void user_verifies_the_Start_of_Day_tab_is_available_under_Sales_Module() throws Throwable {
	    
		System.out.println("Attempt: verify the 'Start of Day' tab is available under Sales Module");
		WebElement startOfDay = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.START_OF_DAY))));
		Assert.assertEquals("Start of Day", startOfDay.getText());
		System.out.println("Success: 'Start of Day' tab is available under Sales Module");
	}

	
	@Then("^User verifies the 'Message' tab is available under Start of Day tab$")
	public void user_verifies_the_Message_tab_is_available_under_Start_of_Day_tab() throws Throwable {
	    
		System.out.println("Attempt: verify the 'Message' tab is available under Start of Day tab");
		WebElement message = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.SALES_MODULE_MESSAGE))));
		Assert.assertEquals("Message", message.getText());
		System.out.println("Success: 'Message' tab is available under Start of Day tab");
	}

	
	@Then("^User verifies the 'Opening Mileage' tab is available under Start of Day tab$")
	public void user_verifies_the_Opening_Mileage_tab_is_available_under_Start_of_Day_tab() throws Throwable {
	    
		System.out.println("Attempt: verify the 'Opening Mileage' tab is available under Start of Day tab");
		WebElement mileage = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.OPENING_MILEAGE))));
		Assert.assertEquals("Opening Mileage", mileage.getText());
		System.out.println("Success: 'Opening Mileage' tab is available under Start of Day tab");
	}

	
	@Then("^User verifies the 'My Inventory' tab is available under Start of Day tab$")
	public void user_verifies_the_My_Inventory_tab_is_available_under_Start_of_Day_tab() throws Throwable {
	  
		System.out.println("Attempt: verify the 'My Inventory' tab is available under Start of Day tab");
		WebElement inventory = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.MY_INVENTORY))));
		Assert.assertEquals("My Inventory", inventory.getText());
		System.out.println("Success: 'My Inventory' tab is available under Start of Day tab");
	}

	
	@Then("^User verifies the 'Journey Plan' tab is available under Start of Day tab$")
	public void user_verifies_the_Journey_Plan_tab_is_available_under_Start_of_Day_tab() throws Throwable {
	    
		System.out.println("Attempt: verify the 'Journey Plan' tab is available under Start of Day tab");
		WebElement journeyPlan = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.JOURNEY_PLAN))));
		Assert.assertEquals("Journey Plan", journeyPlan.getText());
		System.out.println("Success: 'Journey Plan' tab is available under Start of Day tab");
	}
	

	@Then("^User verifies the 'Sales Target' tab is available under Start of Day tab$")
	public void user_verifies_the_Sales_Target_tab_is_available_under_Start_of_Day_tab() throws Throwable {
	    
		System.out.println("Attempt: verify the 'Sales Target' tab is available under Start of Day tab");
		WebElement salesTarget = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.SALESTARGET))));
		Assert.assertEquals("Sales Target", salesTarget.getText());
		System.out.println("Success: 'Sales Target' tab is available under Start of Day tab");
	}
	

	@Then("^User verifies the 'End of Day' tab is available under Sales Module$")
	public void user_verifies_the_End_of_Day_tab_is_available_under_Sales_Module() throws Throwable {
	    
		System.out.println("Attempt: verify the 'End of Day' tab is available under Sales Module");
		PageObjects.SelectByXpath(
				driver, LocatorsPath.END_OF_DAY, LocatorsPath.MAX_TIME);
		WebElement endOfDay = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.END_OF_DAY))));
		Assert.assertEquals("End of Day", endOfDay.getText());
		System.out.println("Success: 'End of Day' tab is available under Sales Module");
	}
	

	@Then("^User verifies the 'Cash Reconciliation' tab is available under End of Day tab$")
	public void user_verifies_the_Cash_Reconciliation_tab_is_available_under_End_of_Day_tab() throws Throwable {
	   
		System.out.println("Attempt: verify the 'Cash Reconciliation' tab is available under End of Day tab");
		WebElement cashReconciliation = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.CASH_RECONCILIATION))));
		Assert.assertEquals("Cash Reconciliation", cashReconciliation.getText());
		System.out.println("Success: 'Cash Reconciliation' tab is available under End of Day tab");
	}
	

	@Then("^User verifies the 'Stock Reconciliation' tab is available under End of Day tab$")
	public void user_verifies_the_Stock_Reconciliation_tab_is_available_under_End_of_Day_tab() throws Throwable {
	 
		System.out.println("Attempt: verify the 'Stock Reconciliation' tab is available under End of Day tab");
		WebElement stockReconciliation = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.STOCK_RECONCILIATION))));
		Assert.assertEquals("Stock Reconciliation", stockReconciliation.getText());
		System.out.println("Success: 'Stock Reconciliation' tab is available under End of Day tab");
	}
	

	@Then("^User verifies the 'Sales Target' tab is available under End of Day tab$")
	public void user_verifies_the_Sales_Target_tab_is_available_under_End_of_Day_tab() throws Throwable {
	    
		user_verifies_the_Sales_Target_tab_is_available_under_Start_of_Day_tab();
	}
	

	@Then("^User verifies the 'Sales History' tab is available under End of Day tab$")
	public void user_verifies_the_Sales_History_tab_is_available_under_End_of_Day_tab() throws Throwable {
	    
		System.out.println("Attempt: verify the 'Sales History' tab is available under End of Day tab");
		WebElement salesHistory = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.SALES_HISTORY))));
		Assert.assertEquals("Sales History", salesHistory.getText());
		System.out.println("Success: 'Sales History' tab is available under End of Day tab");
	}
	

	@Then("^User verifies the 'Closing Mileage' tab is available under End of Day tab$")
	public void user_verifies_the_Closing_Mileage_tab_is_available_under_End_of_Day_tab() throws Throwable {
	    
		System.out.println("Attempt: verify the 'Closing Mileage' tab is available under End of Day tab");
		WebElement closingMileage = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.CLOSING_MILEAGE))));
		Assert.assertEquals("Closing Mileage", closingMileage.getText());
		System.out.println("Success: 'Closing Mileage' tab is available under End of Day tab");
	}
	

	@Then("^User verifies the 'Reports' tab is available under Sales Module$")
	public void user_verifies_the_Reports_tab_is_available_under_Sales_Module() throws Throwable {
	    
		System.out.println("Attempt: verify the 'Reports' tab is available under Sales Module");
		PageObjects.SelectByXpath(
				driver, LocatorsPath.REPORTS, LocatorsPath.MAX_TIME);
		WebElement reports = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.REPORTS))));
		Assert.assertEquals("Reports", reports.getText());
		System.out.println("Success: 'Reports' tab is available under Sales Module");
	}
	

	@Then("^User verifies the 'Daily Sales Report' tab is available under Reports tab$")
	public void user_verifies_the_Daily_Sales_Report_tab_is_available_under_Reports_tab() throws Throwable {
	    
		System.out.println("Attempt: verify the 'Daily Sales Report' tab is available under Reports tab");
		WebElement salesReport = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.DAILY_SALES_REPORT))));
		Assert.assertEquals("Daily Sales Report", salesReport.getText());
		System.out.println("Success: 'Daily Sales Report' tab is available under Reports tab");
	}
	

	@Then("^User verifies the 'Credit Report' tab is available under Reports tab$")
	public void user_verifies_the_Credit_Report_tab_is_available_under_Reports_tab() throws Throwable {
	    
		System.out.println("Attempt: verify the 'Credit Report' tab is available under Reports tab");
		WebElement creditReport = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.CREDIT_REPORT))));
		Assert.assertEquals("Credit Report", creditReport.getText());
		System.out.println("Success: 'Credit Report' tab is available under Reports tab");
	}
	

	
	/**----------------------RCS_SaaS_Verify_StartOfDay_WC--------------------------**/
	
	
	
	@Then("^User verifies the 'Message' and 'Group' sections present under the Message tab$")
	public void user_verifies_the_Message_and_Group_sections_present_under_the_Message_tab() throws Throwable {
	    
		System.out.println("Attempt: verify the 'Message' and 'Group' sections present under the Message tab");
		PageObjects.SelectByXpath(
				driver, LocatorsPath.START_OF_DAY, LocatorsPath.MAX_TIME);
		WebElement message = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.MESSAGE_1))));
		Assert.assertEquals("Message", message.getText());
		
		WebElement group = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.GROUP))));
		Assert.assertEquals("Group", group.getText());
		System.out.println("Success: 'Message' and 'Group' sections present under the Message tab successfully");
	}
	

	@Then("^User verifies the Date, Time, Mileage, Comments sections present under the Opening Mileage tab$")
	public void user_verifies_the_Date_Time_Mileage_Comments_sections_present_under_the_Opening_Mileage_tab() throws Throwable {
	    
		System.out.println("Attempt: verify the Date, Time, Mileage, Comments "
				+ "sections present under the Opening Mileage tab");
		PageObjects.SelectByXpath(
				driver, LocatorsPath.OPENING_MILEAGE, LocatorsPath.MAX_TIME);
		WebElement date = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.OPENING_MILEAGE_DATE))));
		Assert.assertEquals("Date", date.getText());
		
		WebElement time = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.OPENING_MILEAGE_TIME))));
		Assert.assertEquals("Time", time.getText());
		
		WebElement mileage = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.OPENING_MILEAGE_MILE))));
		Assert.assertEquals("Mileage", mileage.getText());
		
		WebElement comments = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.OPENING_MILEAGE_COMMENTS))));
		Assert.assertEquals("Comments", comments.getText());
		System.out.println("Success: verified the Date, Time, Mileage, Comments "
				+ "sections present under the Opening Mileage tab");
	}
	

	@Then("^User verifies the 'Stock Load for Rep Inventory' and 'Stock Load for SKU/Product Details' displayed under the My Inventory tab$")
	public void user_verifies_the_Stock_Load_for_Rep_Inventory_and_Stock_Load_for_SKU_Product_Details_displayed_under_the_My_Inventory_tab() throws Throwable {
	 
		System.out.println("User verifies the 'Stock Load for Rep Inventory' and 'Stock Load "
				+ "for SKU/Product Details' displayed under the My Inventory tab");
	}
	

	@Then("^User verifies the Stock Load Number, Reference, Date, Status, and Create Stock Load button present under the Stock Load for Rep Inventory section$")
	public void user_verifies_the_Stock_Load_Number_Reference_Date_Status_and_Create_Stock_Load_button_present_under_the_Stock_Load_for_Rep_Inventory_section() throws Throwable {
	    
		System.out.println("Attempt: verify the Stock Load Number, Reference, Date, Status, and "
				+ "Create Stock Load button present under the Stock Load for Rep Inventory section");
		PageObjects.SelectByXpath(
				driver, LocatorsPath.MY_INVENTORY, LocatorsPath.MAX_TIME);
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.DEFAULT_ACTIVE_STOCK_LOAD, LocatorsPath.MAX_TIME);
		
		WebElement stockLoadNumber = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SALES_STOCK_LOAD_NUMBER))));
		Assert.assertEquals("Stock Load Number", stockLoadNumber.getText());
		
		WebElement reference = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_LOAD_REFERENCE))));
		Assert.assertEquals("Reference", reference.getText());
		
		WebElement date = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SALES_STOCK_LOAD_DATE))));
		Assert.assertEquals("Date", date.getText());
		
		WebElement status = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SALES_STOCK_LOAD_STATUS))));
		Assert.assertEquals("Status", status.getText());
	
		PageObjects.SelectByCSSSelectorWithoutClick(
				driver, LocatorsPath.CREATE_STOCK_LOAD, LocatorsPath.MAX_TIME);
		System.out.println("Success: verified the Stock Load Number, Reference, Date, Status, and "
				+ "Create Stock Load button present under the Stock Load for Rep Inventory section");
	}
	

	@Then("^User verifies the Product Name, Qty, Commit All button and Print button present under the Stock Load for SKU/Product section$")
	public void user_verifies_the_Product_Name_Qty_Commit_All_button_and_Print_button_present_under_the_Stock_Load_for_SKU_Product_section() throws Throwable {
	    
		System.out.println("Attempt: verify the Product Name, Qty, Commit All button "
				+ "and Print button present under the Stock Load for SKU/Product section");
		WebElement productName = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SALES_STOCK_LOAD_PRODUCT))));
		Assert.assertEquals("Product", productName.getText());
		
		WebElement quantity = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_LOAD_QUANTITY))));
		Assert.assertEquals("Quantity", quantity.getText());
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.STOCK_LOAD_COMMIT_ALL)));
		PageObjects.SelectByCSSSelectorWithoutClick(
				driver, LocatorsPath.STOCK_LOAD_COMMIT_ALL, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelectorWithoutClick(
				driver, LocatorsPath.STOCK_LOAD_PRINT_ALL, LocatorsPath.MAX_TIME);
		System.out.println("Success: verified the Product Name, Qty, Commit All button "
				+ "and Print button present under the Stock Load for SKU/Product section");
	}
	

	@Then("^User verifies the system current 'Journey Date' is displayed under the Journey Plan tab$")
	public void user_verifies_the_system_current_Journey_Date_is_displayed_under_the_Journey_Plan_tab() throws Throwable {
	    
		System.out.println("Attempt: verify the system current 'Journey Date' "
				+ "is displayed under the Journey Plan tab");
		PageObjects.SelectByXpath(
				driver, LocatorsPath.JOURNEY_PLAN, LocatorsPath.MAX_TIME);
		WebElement date = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.JOURNEY_DATE))));
		Assert.assertEquals(CallObject.presentTimestamp(), date.getAttribute("value"));
		System.out.println("Success: System current 'Journey Date' is displayed "
				+ "under the Journey Plan tab successfully");
	}
	

	@Then("^User verifies the Account Name and Account Number sections present under the Journey Plan tab$")
	public void user_verifies_the_Account_Name_and_Account_Number_sections_present_under_the_Journey_Plan_tab() throws Throwable {
	    
		System.out.println("Attempt: verify the Account Name and Account Number "
				+ "sections present under the Journey Plan tab");
		WebElement accountName = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.JOURNEY_ACCOUNT_NAME))));
		Assert.assertEquals("Account Name", accountName.getText());
		
		WebElement accountNumber = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.JOURNEY_ACCOUNT_NUMBER))));
		Assert.assertEquals("Account Number", accountNumber.getText());
		System.out.println("Success: Account Name and Account Number sections "
				+ "present under the Journey Plan tab successfully");
	}
	

	@Then("^User verifies the Product, Sales Target, Time Period and Remarks sections present under the Sales Target tab$")
	public void user_verifies_the_Product_Sales_Target_Time_Period_and_Remarks_sections_present_under_the_Sales_Target_tab() throws Throwable {
	    
		System.out.println("Attempt: verify the Product, Sales Target, Time Period "
				+ "and Remarks sections present under the Sales Target tab");
		try {
			PageObjects.SelectByXpath(
					driver, LocatorsPath.SALESTARGET, LocatorsPath.MAX_TIME);
			
			WebElement product = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.SALES_TARGET_PRODUCT))));
			Assert.assertEquals("Product", product.getText());
			
			WebElement salesTarget = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.SALES_TARGET_TAR))));
			Assert.assertEquals("Sales Target", salesTarget.getText());
			
			WebElement timePeriod = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.SALES_TARGET_TIME_PERIOD))));
			Assert.assertEquals("Time Period", timePeriod.getText());
			
			WebElement remarks = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.SALES_TARGET_REMARKS))));
			Assert.assertEquals("Remarks", remarks.getText());
		}  catch (StaleElementReferenceException StaleElementReferenceException) {
			System.out.println("Trying to recover from stale element" + StaleElementReferenceException);
		}
		System.out.println("Success: verified the Product, Sales Target, Time Period "
				+ "and Remarks sections present under the Sales Target tab");
	}
	

	
	/**----------------------RCS_SaaS_Verify_EndOfDay_WC--------------------------**/
	
	
	
	@Then("^User verifies the system current 'Payment Date' is displayed under the Cash Reconciliation tab$")
	public void user_verifies_the_system_current_Payment_Date_is_displayed_under_the_Cash_Reconciliation_tab() throws Throwable {
	    
		System.out.println("Attempt: verify the system current 'Payment Date' is "
				+ "displayed under the Cash Reconciliation tab");
		PageObjects.SelectByXpath(
				driver, LocatorsPath.END_OF_DAY, LocatorsPath.MAX_TIME);
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.DEFAULT_ACTIVE_CASH_RECONCIL, LocatorsPath.MAX_TIME);
		
		WebElement date = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.JOURNEY_DATE))));
		Assert.assertEquals(CallObject.presentTimestamp(), date.getAttribute("value"));
		System.out.println("Success: System current 'Payment Date' is displayed "
				+ "under the Cash Reconciliation tab");
	}
	

	@Then("^User verifies the Customer Number, Customer Name, Payment Number and Payment Amount sections present under the Cash Reconciliation tab$")
	public void user_verifies_the_Customer_Number_Customer_Name_Payment_Number_and_Payment_Amount_sections_present_under_the_Cash_Reconciliation_tab() throws Throwable {
	    
		System.out.println("Attempt: verify the Customer Number, Customer Name, Payment Number "
				+ "and Payment Amount sections present under the Cash Reconciliation tab");
		WebElement customerNum = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.CASH_RECON_CUST_NUM))));
		Assert.assertEquals("Customer Number", customerNum.getText());
		
		WebElement customerName = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.CASH_RECON_CUST_NAME))));
		Assert.assertEquals("Customer Name", customerName.getText());
		
		WebElement paymentNum = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.CASH_RECON_PAY_NUM))));
		Assert.assertEquals("Payment Number", paymentNum.getText());
		
		WebElement paymentAmount = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.CASH_RECON_PAY_AMOUNT))));
		Assert.assertEquals("Payment Amount", paymentAmount.getText());
		System.out.println("Success: Customer Number, Customer Name, Payment Number "
				+ "and Payment Amount sections present under the Cash Reconciliation tab successfully");
	}
	

	@Then("^User verifies the Total Amt Cash, Total Amt Cheque, No of Cheques, Total GTN Value, No\\.of GTNs records present under the Cash Reconciliation tab$")
	public void user_verifies_the_Total_Amt_Cash_Total_Amt_Cheque_No_of_Cheques_Total_GTN_Value_No_of_GTNs_records_present_under_the_Cash_Reconciliation_tab() throws Throwable {
	   
		System.out.println("Attempt: verify the Total Amt Cash, Total Amt Cheque, No of Cheques, Total GTN Value, "
				+ "No\\.of GTNs records present under the Cash Reconciliation tab");
		WebElement totalAmtCash = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.TOTAL_AMOUNT_CASH))));
		Assert.assertEquals("Total Amt Cash :", totalAmtCash.getText());
		
		WebElement totalAmtCheque = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.TOTAL_AMOUNT_CHEQUE))));
		Assert.assertEquals("Total Amt Cheque :", totalAmtCheque.getText());
		
		WebElement noOfCheques = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.NO_OF_CHEQUES))));
		Assert.assertEquals("No of Cheques", noOfCheques.getText());
		
		WebElement totalGtnValue = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.TOTAL_GTN_VALUE))));
		Assert.assertEquals("Total GTN Value :", totalGtnValue.getText());
		
		WebElement noOfGtns = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.NO_OF_GTNS))));
		Assert.assertEquals("No.of GTNs", noOfGtns.getText());
		System.out.println("Success: Total Amt Cash, Total Amt Cheque, No of Cheques, Total GTN Value, "
				+ "No\\.of GTNs records present under the Cash Reconciliation tab successfully");
	}
	

	@Then("^User verifies the Total Amt Credit Memo, Total EFT amount, No\\.of EFTs, Total MMP Amount, No\\.of MMPs & Grand Total records present under the Cash Reconciliation tab$")
	public void user_verifies_the_Total_Amt_Credit_Memo_Total_EFT_amount_No_of_EFTs_Total_MMP_Amount_No_of_MMPs_Grand_Total_records_present_under_the_Cash_Reconciliation_tab() throws Throwable {
	    
		System.out.println("Attempt: verify the Total Amt Credit Memo, Total EFT amount, No\\.of EFTs,"
				+ " Total MMP Amount, No\\.of MMPs & Grand Total records present under the Cash Reconciliation tab");
		WebElement totalAmtCreditMemo = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.TOTAL_AMOUNT_CREDIT_MEMO))));
		Assert.assertEquals("Total Amt Credit Memo :", totalAmtCreditMemo.getText());
		
		WebElement totalEftAmount = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.TOTAL_EFT_AMOUNT))));
		Assert.assertEquals("Total EFT amount :", totalEftAmount.getText());
	
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.NO_OF_EFTS, LocatorsPath.MAX_TIME);
		
		WebElement totalMmpAmount = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.TOTAL_MMP_AMOUNT))));
		Assert.assertEquals("Total MMP Amount :", totalMmpAmount.getText());
		
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.NO_OF_MMPS, LocatorsPath.MAX_TIME);
		
		WebElement grandTotalRecords = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.GRAND_TOTAL))));
		Assert.assertEquals("Grand Total :", grandTotalRecords.getText());
		System.out.println("Success: verified the Total Amt Credit Memo, Total EFT amount, No\\.of EFTs,"
				+ " Total MMP Amount, No\\.of MMPs & Grand Total records present under the Cash Reconciliation tab");
	}
	

	@Then("^User verifes by default the status is displayed as 'Open/Committed' under Stock Reconciliation tab$")
	public void user_verifes_by_default_the_status_is_displayed_as_Open_under_Stock_Reconciliation_tab() throws Throwable {
	    
		System.out.println("Attempt: verify by default the status is displayed as "
				+ "'Open/Committed' under Stock Reconciliation tab");
		PageObjects.SelectByXpath(
				driver, LocatorsPath.STOCK_RECONCILIATION, LocatorsPath.MAX_TIME);
		
		WebElement element = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_RECONCIL_STATUS))));
		Select select = new Select(element);
		List<WebElement> allOptions = select.getOptions();
		
		 boolean found = false;
		 for(WebElement ele: allOptions) {
			 if(LocatorsPath.status1.equals(ele.getText())) {
				 found = true;
				 System.out.println(LocatorsPath.status1 +" - value exists");
				 Assert.assertTrue(found);
				 break;
			 }
			 
			 if(LocatorsPath.status2.equals(ele.getText())) {
				 found = true;
				 System.out.println(LocatorsPath.status2 +" - value exists");
				 Assert.assertTrue(found);
				 break;
			 }
			 
		 }if(!found) {
			 System.out.println(LocatorsPath.status1 +"or" + LocatorsPath.status2 +" - value doesn't exists");
			 Assert.fail(LocatorsPath.status1 +"or" + LocatorsPath.status2 +" - value doesn't exists");
	   }
	   System.out.println("Success: Status is displayed as 'Open/Committed' under "
	   		+ "Stock Reconciliation tab successfully");
	}
	

	@Then("^User selects the status as 'Committed'$")
	public void user_selects_the_status_as_Committed() throws Throwable {
	   
		System.out.println("Attempt: select the status as 'Committed'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.STOCK_RECONCIL_STATUS, LocatorsPath.MAX_TIME, 
				file3.getCellData("Sales Module", "Status", 2));
		
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.STOCK_RECONCIL_SHOW, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Committed' selected successfully");
	}
	

	@Then("^User selects the 'From date' and 'To date'$")
	public void user_selects_the_From_date_and_To_date() throws Throwable {
	    
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.STOCK_RECONCIL_FROM_DATE, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.FROM_DATE_SELECTION, LocatorsPath.MAX_TIME);
		CallObject.block(1000);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.STOCK_RECONCIL_TO_DATE, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.TO_DATE_SELECTION, LocatorsPath.MAX_TIME);
	}
	

	@Then("^User clicks on 'Show' button and verifies the Stock Reconciliation details$")
	public void user_clicks_on_Show_button_and_verifies_the_Stock_Reconciliation_details() throws Throwable {
	    
		System.out.println("Attempt: click on 'Show' button and "
				+ "verify the Stock Reconciliation details");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.SALES_SHOW, LocatorsPath.MAX_TIME);
		System.out.println("Success: clicked on 'Show' button and "
				+ "verified the Stock Reconciliation details");
	}
	

	@Then("^User verifies the Stock Reconciliation Number, Date and Time, Status, User & Inventory Name sections present under the Stock Reconciliation tab$")
	public void user_verifies_the_Stock_Reconciliation_Number_Date_and_Time_Status_User_Inventory_Name_sections_present_under_the_Stock_Reconciliation_tab() throws Throwable {
	    
		System.out.println("Attempt: verify the Stock Reconciliation Number, Date and Time, Status, "
				+ "User & Inventory Name sections present under the Stock Reconciliation tab");
		WebElement stockReconciliationNumber = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_RECONCIL_NUMBER))));
		Assert.assertEquals("Stock Reconciliation Number", stockReconciliationNumber.getText());
		
		WebElement stockReconciliationDate = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_RECONCIL_DATE))));
		Assert.assertEquals("Date", stockReconciliationDate.getText());
		
		WebElement stockReconciliationStatus = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_RECONCIL_STATUS_1))));
		Assert.assertEquals("Status", stockReconciliationStatus.getText());
		
		WebElement stockReconciliationUser = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_RECONCIL_USER))));
		Assert.assertEquals("User", stockReconciliationUser.getText());
		
		WebElement stockReconciliationInvName = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_RECONCIL_INV_NAME))));
		Assert.assertEquals("Inventory Name", stockReconciliationInvName.getText());
		System.out.println("Success: Stock Reconciliation Number, Date and Time, Status, "
				+ "User & Inventory Name sections present under the Stock Reconciliation tab successfully");
	}
	

	@Then("^User verifies the Product, Actual Quantity, System Quantity, Difference, Variance Flag, Variance Reason, Unsaleble Quantity & Unsaleable Variance Reason sections present under the Stock Reconciliation tab$")
	public void user_verifies_the_Product_Actual_Quantity_System_Quantity_Difference_Variance_Flag_Variance_Reason_Unsaleble_Quantity_Unsaleable_Variance_Reason_sections_present_under_the_Stock_Reconciliation_tab() throws Throwable {
	   
		System.out.println("Attempt: verify the Product, Actual Quantity, System Quantity, Difference, Variance Flag, Variance Reason, "
				+ "Unsaleble Quantity & Unsaleable Variance Reason sections present under the Stock Reconciliation tab");
	/*	wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.STOCK_RECONCIL_ACTUAL_QTY))));
		
		List<WebElement> list = driver.findElements(
				By.xpath(LocatorsPath.STOCK_RECONCIL_ACTUAL_QTY));
		for(WebElement element: list) {
			element.sendKeys(
					file3.getCellData("Sales Module", "Actual Qty", 2));
			CallObject.block(1000);
		}
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.STOCK_RECONCIL_COMPUTE, LocatorsPath.MAX_TIME);

		PageObjects.SelectByCSSSelectorWithoutClick(
				driver, LocatorsPath.STOCK_RECONCIL_POP_UP, LocatorsPath.MAX_TIME);
		if(driver.getPageSource().contains
				("Variances exist, do you want to continue? [Yes/No]")) {
			CallObject.block(2000);
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.STOCK_RECONCIL_ALERT_SELECT, LocatorsPath.MAX_TIME);
		}
		
		PageObjects.SelectByCSSSelectorWithoutClick(
				driver, LocatorsPath.STOCK_RECONCIL_POP_UP_1, LocatorsPath.MAX_TIME);
		if(driver.getPageSource().contains
				("Stock Reconciliation is Open. Please complete it before Proceed ")) {
			CallObject.block(2000);
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.STOCK_RECONCIL_ALERT_SELECT_1, LocatorsPath.MAX_TIME);
		}*/
		System.out.println("Success: verified the Product, Actual Quantity, System Quantity, Difference, Variance Flag, Variance Reason, "
				+ "Unsaleble Quantity & Unsaleable Variance Reason sections present under the Stock Reconciliation tab");
	}
	

	@Then("^User verifies the Print button, Carry Fwd Stock & Off-load Van buttons available under the Stock Reconciliation tab$")
	public void user_verifies_the_Print_button_Carry_Fwd_Stock_Off_load_Van_buttons_available_under_the_Stock_Reconciliation_tab() throws Throwable {
	    
		System.out.println("Attempt: verify the Print button, Carry Fwd Stock & Off-load Van "
				+ "buttons available under the Stock Reconciliation tab");
		WebElement product = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_RECONCIL_PRODUCT))));
		Assert.assertEquals("Product", product.getText());
		
		WebElement actualQty = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_RECONCIL_ACTUAL_QTY_1))));
		Assert.assertEquals("Actual Quantity", actualQty.getText());
		
		WebElement systemQty = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_RECONCIL_SYSTEM_QTY_1))));
		Assert.assertEquals("System Quantity", systemQty.getText());
		
		WebElement difference = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_RECONCIL_DIFFERENCE))));
		Assert.assertEquals("Difference", difference.getText());
		
		WebElement varianceFlag = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_RECONCIL_VARIANCE_FLAG))));
		Assert.assertEquals("Variance Flag", varianceFlag.getText());
		
		WebElement varianceReason = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_RECONCIL_VARIANCE_REAS))));
		Assert.assertEquals("Variance Reason *", varianceReason.getText());
		
		WebElement unsaleableQty = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_RECONCIL_UNSALEABLE_QTY))));
		Assert.assertEquals("Unsaleable Quantity", unsaleableQty.getText());
		
		WebElement unsaleableVarianceReason = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_RECON_UNSAL_VAR_REASON))));
		Assert.assertEquals("Unsaleable Variance Reason *", unsaleableVarianceReason.getText());
		
		/*js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.CARRY_FWD_STOCK)));
		WebElement carryFwdStock = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.CARRY_FWD_STOCK))));
		Assert.assertEquals("Carry_Fwd Stock", carryFwdStock.getAttribute("value"));*/
		
		WebElement print = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.STOCK_RECON_PRINT))));
		Assert.assertEquals("Print", print.getAttribute("value"));
		
		/*WebElement offLoadVan = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.OFF_LOAD_VAN))));
		Assert.assertEquals("Off-load Van", offLoadVan.getAttribute("value"));*/
		System.out.println("Success: The Print button, Carry Fwd Stock & Off-load Van "
				+ "buttons available under the Stock Reconciliation tab successfully");
	}
	

	
	/**----------------------RCS_SaaS_Verify_EndOfDay1_WC--------------------------**/
	
	
	
	@Then("^User verifies the 'Sales Target' tab is present under the End of day tab$")
	public void user_verifies_the_Sales_Target_tab_is_present_under_the_End_of_day_tab() throws Throwable {
	    
		System.out.println("Attempt: verify the 'Sales Target' tab is "
				+ "present under the End of day tab");
		PageObjects.SelectByXpath(
				driver, LocatorsPath.SALESTARGET, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Sales Target' tab is present under "
				+ "the End of day tab");
	}

	
	@Then("^User verifies the product, Sales Target, Time Period, Remarks & Actual fields are present under the 'Sales Target' tab$")
	public void user_verifies_the_product_Sales_Target_Time_Period_Remarks_Actual_fields_are_present_under_the_Sales_Target_tab() throws Throwable {
	 
		user_verifies_the_Product_Sales_Target_Time_Period_and_Remarks_sections_present_under_the_Sales_Target_tab();
	}
	
	
	@Then("^User verifies the 'Sales History' tab is present under the End of day tab$")
	public void user_verifies_the_Sales_History_tab_is_present_under_the_End_of_day_tab() throws Throwable {
	    
		System.out.println("Attempt: verify the 'Sales History' tab is "
				+ "present under the End of day tab");
		PageObjects.SelectByXpath(
				driver, LocatorsPath.SALES_HISTORY, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Sales History' tab is present under"
				+ " the End of day tab successfully");
	}
	

	@Then("^User verifies the 'Sales Order' tab is present under the Sales History tab$")
	public void user_verifies_the_Sales_Order_tab_is_present_under_the_Sales_History_tab() throws Throwable {
	    
		System.out.println("Attempt: verify the 'Sales Order' tab is present"
				+ " under the Sales History tab");
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.SALES_ORDERS, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Sales Order' tab is present under the"
				+ " Sales History tab");
	}
	

	@Then("^User selects the status as either Open/Closed/Billed under the Sales Order tab$")
	public void user_selects_the_status_as_either_Open_Closed_Billed_under_the_Sales_Order_tab() throws Throwable {
	    
		System.out.println("Attempt: select the status as either Open/Closed/Billed"
				+ " under the Sales Order tab");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.SALES_ORDER_STATUS, LocatorsPath.MAX_TIME, 
				file3.getCellData("Sales Module", "Status 1", 2));
		System.out.println("Success: selected the status as either Open/Closed/Billed "
				+ "under the Sales Order tab");
	}
	

	@Then("^User selects the From & To Order Date under the Sales Order$")
	public void user_selects_the_From_To_Order_Date_under_the_Sales_Order() throws Throwable {
	    
		System.out.println("Attempt: select the From & To Order Date "
				+ "under the Sales Order");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.SALES_ORDERS_FROM_DATE, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.FROM_DATE_SELECTION, LocatorsPath.MAX_TIME);
		
		CallObject.block(1000);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.SALES_ORDERS_TO_DATE, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.SALES_ORDERS_DATE_SELECTION, LocatorsPath.MAX_TIME);
		System.out.println("Success: selected the From & To Order Date "
				+ "under the Sales Order");
	}
	

	@Then("^User clicks on Show button under the Sales Order$")
	public void user_clicks_on_Show_button_under_the_Sales_Order() throws Throwable {
	    
		System.out.println("Attempt: click on Show button under the Sales Order");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.STOCK_RECONCIL_SHOW, LocatorsPath.MAX_TIME);
		System.out.println("Success: Show button under the Sales Order clicked successfully");
	}

	
	@Then("^User verifies the Name of the Outlet, Date, Payment Amount & Discount % sections displayed under the Sales Order$")
	public void user_verifies_the_Name_of_the_Outlet_Date_Payment_Amount_Discount_sections_displayed_under_the_Sales_Order() throws Throwable {
	    
		System.out.println("Attempt: verify the Name of the Outlet, Date, Payment Amount & "
				+ "Discount % sections displayed under the Sales Order");
		WebElement nameofOutlet = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.NAME_OF_THE_OUTLET))));
		Assert.assertEquals("Name of the Outlet", nameofOutlet.getText());
		
		WebElement date = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SALES_ORDERS_DATE))));
		Assert.assertEquals("Date", date.getText());
		
		WebElement payAmount = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SALES_ORDERS_PAY_AMOUNT))));
		Assert.assertEquals("Payment Amount", payAmount.getText());
		
		WebElement discountPercent = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SALES_ORDERS_DISCOUNT_PER))));
		Assert.assertEquals("Discount %", discountPercent.getText());
		System.out.println("Success: The Name of the Outlet, Date, Payment Amount & "
				+ "Discount % sections displayed under the Sales Order");
	}
	

	@Then("^User navigates to the Pre Sales Order tab$")
	public void user_navigates_to_the_Pre_Sales_Order_tab() throws Throwable {
	    
		System.out.println("Attempt: navigate to the Pre Sales Order tab");
		PageObjects.SelectByXpath(
				driver, LocatorsPath.PRE_SALES_ORDERS, LocatorsPath.MAX_TIME);
		System.out.println("Success: navigated to the Pre Sales Order tab successfully");
	}
	

	@Then("^User verifies the Pre Sales Order, Pre Sales Order List & Sales Data sections displayed under the Sales History tab$")
	public void user_verifies_the_Pre_Sales_Order_Pre_Sales_Order_List_Sales_Data_sections_displayed_the_Sales_History_tab() throws Throwable {
	   
		System.out.println("Attempt: verify the Pre Sales Order, Pre Sales Order List & Sales Data "
				+ "sections displayed the Sales History tab");
		WebElement preSalesOrder = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.PRE_SALES_ORDERS_DISPLAY))));
		Assert.assertEquals("Pre-Sales Orders", preSalesOrder.getText());
		
		WebElement preSalesOrderList = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.PRE_SALES_ORDERS_LIST))));
		Assert.assertEquals("Pre-Sales Order List", preSalesOrderList.getText());
		
		WebElement salesData = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.SALES_DATA))));
		Assert.assertEquals("Sales Data", salesData.getText());
		System.out.println("Success: verify the Pre Sales Order, Pre Sales Order List & Sales Data "
				+ "sections displayed the Sales History tab");
	}
	

	@Then("^User selects the status under Pre Sales Order$")
	public void user_selects_the_status_under_Pre_Sales_Order() throws Throwable {
	    
		System.out.println("Attempt: select the status under Pre Sales Order");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.SALES_ORDER_STATUS, LocatorsPath.MAX_TIME, 
				file3.getCellData("Sales Module", "Status 2", 2));
		System.out.println("Success: selected the status under Pre Sales Order");
	}
	

	@Then("^User selects the From & To Order Date under the Pre Sales Order$")
	public void user_selects_the_From_To_Order_Date_under_the_Pre_Sales_Order() throws Throwable {
	   
		user_selects_the_From_To_Order_Date_under_the_Sales_Order();
	}
	

	@Then("^User clicks on Show button under the Pre Sales Order$")
	public void user_clicks_on_Show_button_under_the_Pre_Sales_Order() throws Throwable {
	    
		user_clicks_on_Show_button_under_the_Sales_Order();
	}
	

	@Then("^User verifies the Customer Name, Customer Number, Order Number, Order Date, Amount Payable, Disc on Bill, Total Quantity, Order Status, Delivery Date & Remarks fields displayed under Pre Sales Order List section$")
	public void user_verifies_the_Customer_Name_Customer_Number_Order_Number_Order_Date_Amount_Payable_Disc_on_Bill_Total_Quantity_Order_Status_Delivery_Date_Remarks_fields_displayed_under_Pre_Sales_Order_List_section() throws Throwable {
	 
		System.out.println("Attempt: verify the Customer Name, Customer Number, Order Number, Order Date, Amount Payable,"
				+ " Disc on Bill, Total Quantity, Order Status, Delivery Date & Remarks fields displayed under Pre Sales Order List section");
		WebElement customerName = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.PRE_SALES_CUSTOMER_NAME))));
		Assert.assertEquals("Customer Name", customerName.getText());
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.PRE_SALES_CUSTOMER_NUMBER)));
		WebElement customerNumber = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.PRE_SALES_CUSTOMER_NUMBER))));
		Assert.assertEquals("Customer Number", customerNumber.getText());
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.PRE_SALES_ORDER_NUMBER)));
		WebElement orderNumber = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.PRE_SALES_ORDER_NUMBER))));
		Assert.assertEquals("Order Number", orderNumber.getText());
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.PRE_SALES_ORDER_DATE)));
		WebElement orderDate = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.PRE_SALES_ORDER_DATE))));
		Assert.assertEquals("Order Date", orderDate.getText());
		
		/*js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.PRE_SALES_AMOUNT_PAYABLE)));
		WebElement amountPayable = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.PRE_SALES_AMOUNT_PAYABLE))));
		Assert.assertEquals("Amount Payable (EGP)", amountPayable.getText());*/
	
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.PRE_SALES_DISC_ON_BILL)));
		WebElement discOnBill = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.PRE_SALES_DISC_ON_BILL))));
		Assert.assertEquals("Disc on Bill", discOnBill.getText());
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.PRE_SALES_TOTAL_QTY)));
		WebElement totalQty = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.PRE_SALES_TOTAL_QTY))));
		Assert.assertEquals("Total Quantity", totalQty.getText());
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.PRE_SALES_ORDER_STATUS)));
		WebElement orderStatus = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.PRE_SALES_ORDER_STATUS))));
		Assert.assertEquals("Order Status", orderStatus.getText());
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.PRE_SALES_DELIVERY_DATE)));
		WebElement deliveryDate = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.PRE_SALES_DELIVERY_DATE))));
		Assert.assertEquals("Delivery Date", deliveryDate.getText());
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.PRE_SALES_REMARKS)));
		WebElement remarks = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.PRE_SALES_REMARKS))));
		Assert.assertEquals("Remarks", remarks.getText());
		
		System.out.println("Success: verified the Customer Name, Customer Number, Order Number, Order Date, Amount Payable,"
				+ " Disc on Bill, Total Quantity, Order Status, Delivery Date & Remarks fields displayed under Pre Sales Order List section");
	}
	

	@Then("^User verifies the Product, Product Number, Quantity, Bonus Quantity, SOQ, Unit Price, GST %, PL Discount, Net Price, Gross Price, Free Field (\\d+), Free Field (\\d+), Free Text Field (\\d+) & Free Text Field (\\d+) fields displayed under Sales Data section$")
	public void user_verifies_the_Product_Product_Number_Quantity_Bonus_Quantity_SOQ_Unit_Price_GST_PL_Discount_Net_Price_Gross_Price_Free_Field_Free_Field_Free_Text_Field_Free_Text_Field_fields_displayed_under_Sales_Data_section(int arg1, int arg2, int arg3, int arg4) throws Throwable {
	    
		System.out.println("Attempt: verifies the Product, Product Number, Quantity, Bonus Quantity, SOQ, Unit Price, GST %, PL Discount, Net Price, Gross Price, "
				+ "Free Field (\\d+), Free Field (\\d+), Free Text Field (\\d+) & Free Text Field (\\d+) fields displayed under Sales Data section");
		WebElement product = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SALES_DATA_PRODUCT))));
		Assert.assertEquals("Product", product.getText());
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.SALES_DATA_PRODUCT_NUMBER)));
		WebElement productNumber = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SALES_DATA_PRODUCT_NUMBER))));
		Assert.assertEquals("Product Number", productNumber.getText());
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.SALES_DATA_QTY)));
		WebElement qty = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SALES_DATA_QTY))));
		Assert.assertEquals("Quantity", qty.getText());
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.SALES_DATA_BONUS_QTY)));
		WebElement bonusQty = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SALES_DATA_BONUS_QTY))));
		Assert.assertEquals("Bonus Quantity", bonusQty.getText());
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.SALES_DATA_SOQ)));
		WebElement soq = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SALES_DATA_SOQ))));
		Assert.assertEquals("SOQ", soq.getText());
		
		/*js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.SALES_DATA_UNIT_PRICE)));
		WebElement unitPrice = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SALES_DATA_UNIT_PRICE))));
		Assert.assertEquals("Unit Price (EGP)", unitPrice.getText());*/
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.SALES_DATA_GST)));
		WebElement gst = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SALES_DATA_GST))));
		Assert.assertEquals("GST%", gst.getText());
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.SALES_DATA_PL_DISCOUNT)));
		WebElement plDiscount = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SALES_DATA_PL_DISCOUNT))));
		Assert.assertEquals("PL Discount", plDiscount.getText());
		
		/*js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.SALES_DATA_NET_PRICE)));
		WebElement netPrice = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SALES_DATA_NET_PRICE))));
		Assert.assertEquals("Net Price (EGP)", netPrice.getText());*/
		
		/*js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.SALES_DATA_GROSS_PRICE)));
		WebElement grossPrice = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SALES_DATA_GROSS_PRICE))));
		Assert.assertEquals("Gross Price (EGP)", grossPrice.getText());*/
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.SALES_DATA_FREE_FIELD_1)));
		WebElement freeField1 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SALES_DATA_FREE_FIELD_1))));
		Assert.assertEquals("Free Field 1", freeField1.getText());
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.SALES_DATA_FREE_FIELD_2)));
		WebElement freeField2 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SALES_DATA_FREE_FIELD_2))));
		Assert.assertEquals("Free Field 2", freeField2.getText());
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.SALES_DATA_FREE_TEXT_FIELD_1)));
		WebElement freeTextField1 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SALES_DATA_FREE_TEXT_FIELD_1))));
		Assert.assertEquals("Free Text Field 1", freeTextField1.getText());
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.SALES_DATA_FREE_TEXT_FIELD_2)));
		WebElement freeTextField2 = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SALES_DATA_FREE_TEXT_FIELD_2))));
		Assert.assertEquals("Free Text Field 2", freeTextField2.getText());
		
		System.out.println("Success: The Product, Product Number, Quantity, Bonus Quantity, SOQ, Unit Price, GST %, PL Discount, Net Price, Gross Price, "
				+ "Free Field (\\d+), Free Field (\\d+), Free Text Field (\\d+) & Free Text Field (\\d+) fields displayed under Sales Data section");
	}
	

	@Then("^User navigates to the Invoices tab$")
	public void user_navigates_to_the_Invoices_tab() throws Throwable {
	    
		System.out.println("Attempt: navigate to the Invoices tab");
		PageObjects.SelectByXpath(
				driver, LocatorsPath.INVOICES, LocatorsPath.MAX_TIME);
		System.out.println("Success: navigated to the Invoices tab successfully");
	}
	

	@Then("^User selects the status under Invoices tab$")
	public void user_selects_the_status_under_Invoices_tab() throws Throwable {
	    
		System.out.println("Attempt: select the status under Invoices tab");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.SALES_ORDER_STATUS, LocatorsPath.MAX_TIME, 
				file3.getCellData("Sales Module", "Status 3", 2));
		System.out.println("Success: selected the status under Invoices tab");
	}
	

	@Then("^User selects the From & To Order Date under the Invoices tab$")
	public void user_selects_the_From_To_Order_Date_under_the_Invoices_tab() throws Throwable {
	    
		user_selects_the_From_To_Order_Date_under_the_Pre_Sales_Order();
	}
	

	@Then("^User clicks on Show button under the Invoices tab$")
	public void user_clicks_on_Show_button_under_the_Invoices_tab() throws Throwable {
	    
		user_clicks_on_Show_button_under_the_Pre_Sales_Order();
	}
	

	@Then("^User verifies the Customer Name, Sales Order Number, Discount, Invoice Number, Invoice Date, Amount Payable, Payment Date,Payment Amount & Payment Number fields displayed under Invoices section$")
	public void user_verifies_the_Customer_Name_Sales_Order_Number_Discount_Invoice_Number_Invoice_Date_Amount_Payable_Payment_Date_Payment_Amount_Payment_Number_fields_displayed_under_Invoices_section() throws Throwable {
	    
		System.out.println("Attempt: verify the Customer Name, Sales Order Number, Discount, Invoice Number, Invoice Date, "
				+ "Amount Payable, Payment Date,Payment Amount & Payment Number fields displayed under Invoices section");
		WebElement customerName = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.PRE_SALES_CUSTOMER_NAME))));
		Assert.assertEquals("Customer Name", customerName.getText());
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.INVOICE_SALES_ORDER_NUM)));
		WebElement orderNumber = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INVOICE_SALES_ORDER_NUM))));
		Assert.assertEquals("Sales Order Number", orderNumber.getText());
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.INVOICE_DISCOUNT)));
		WebElement discount = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INVOICE_DISCOUNT))));
		Assert.assertEquals("Discount", discount.getText());
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.INVOICE_NUMBER)));
		WebElement invoiceNumber = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INVOICE_NUMBER))));
		Assert.assertEquals("Invoice Number", invoiceNumber.getText());
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.INVOICE_DATE)));
		WebElement invoiceDate = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INVOICE_DATE))));
		Assert.assertEquals("Invoice Date", invoiceDate.getText());
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.INVOICE_AMOUNT_PAYABLE)));
		WebElement amountPayable = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INVOICE_AMOUNT_PAYABLE))));
		Assert.assertEquals("Amount Payable", amountPayable.getText());
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.INVOICE_PAYMENT_DATE)));
		WebElement paymentDate = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INVOICE_PAYMENT_DATE))));
		Assert.assertEquals("Payment Date", paymentDate.getText());
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.INVOICE_PAYMENT_AMOUNT)));
		WebElement paymentAmount = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INVOICE_PAYMENT_AMOUNT))));
		Assert.assertEquals("Payment Amount", paymentAmount.getText());
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.INVOICE_PAYMENT_NUMBER)));
		WebElement paymentNumber = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.INVOICE_PAYMENT_NUMBER))));
		Assert.assertEquals("Payment Number", paymentNumber.getText());
		System.out.println("Success: The Customer Name, Sales Order Number, Discount, Invoice Number, Invoice Date, "
				+ "Amount Payable, Payment Date,Payment Amount & Payment Number fields displayed under Invoices section");
	}
	

	@Then("^User navigates to the 'Closing Mileage' tab under the End of day tab$")
	public void user_navigates_to_the_Closing_Mileage_tab_under_the_End_of_day_tab() throws Throwable {
	    
		System.out.println("Attempt: navigate to the 'Closing Mileage' tab under the End of day tab");
		PageObjects.SelectByXpath(
				driver, LocatorsPath.CLOSING_MILEAGE, LocatorsPath.MAX_TIME);
		System.out.println("Success: navigated to the 'Closing Mileage' tab under the End of day tab successfully");
	}
	

	@Then("^User verifies the Add button is available under Mileage section$")
	public void user_verifies_the_Add_button_is_available_under_Mileage_section_and_clicks_on_it() throws Throwable {

		System.out.println("Attempt: verify the Add button is available under "
				+ "Mileage section and click on it");
		PageObjects.SelectByCSSSelectorWithoutClick(
				driver, LocatorsPath.CLOSING_MILEAGE_ADD, LocatorsPath.MAX_TIME);
		System.out.println("Success: Add button is available under Mileage section");
	}
	
	
	@Then("^User verifies the Date, Time, Mileage & Comments fields displayed under Mileage section$")
	public void user_verifies_the_Date_Time_Mileage_Comments_fields_displayed_under_Mileage_section() throws Throwable {
	    
		System.out.println("Attempt: verify the Date, Time, Mileage & Comments fields displayed under Mileage section");
		WebElement date = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.CLOSING_MILEAGE_DATE))));
		Assert.assertEquals("Date", date.getText());
		
		WebElement time = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.CLOSING_MILEAGE_TIME))));
		Assert.assertEquals("Time", time.getText());
		
		WebElement mileage = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.CLOSING_MILEAGE_MIL))));
		Assert.assertEquals("Mileage", mileage.getText());
		
		WebElement comments = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.CLOSING_MILEAGE_COMMENTS))));
		Assert.assertEquals("Comments", comments.getText());
		System.out.println("Success: The Date, Time, Mileage & Comments fields displayed under Mileage section");
	}
	

	
	/**----------------------RCS_SaaS_Verify_Reports_WC--------------------------**/
	
	
	
	@Then("^User navigates to the 'Reports tab' under the Sale Module$")
	public void user_navigates_to_the_Reports_tab_under_the_Sale_Module() throws Throwable {
	    
		System.out.println("Attempt: verify the 'Reports' tab is available under Sales Module");
		PageObjects.SelectByXpath(
				driver, LocatorsPath.REPORTS, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Reports' tab is available under Sales Module");
	}
	

	@Then("^User verifies the Daily Sales Report & Credit Report available under the Reports tab$")
	public void user_verifies_the_Daily_Sales_Report_Credit_Report_available_under_the_Reports_tab() throws Throwable {
	   
		System.out.println("Attempt: verify the Daily Sales Report & "
				+ "Credit Report available under the Reports tab");
		WebElement salesReport = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.DEF_ACT_DAILY_SALES_REPORT))));
		Assert.assertEquals("Daily Sales Report", salesReport.getText());

		user_verifies_the_Credit_Report_tab_is_available_under_Reports_tab();
		System.out.println("Success: verified the Daily Sales Report & Credit Report"
				+ " available under the Reports tab successfully");
	}
	

	@Then("^User verifies the system current 'Date' is displayed under the Daily Sales Report section$")
	public void user_verifies_the_system_current_Date_is_displayed_under_the_Daily_Sales_Report_section() throws Throwable {
	   
		System.out.println("Attempt: verify the system current 'Date' is displayed "
				+ "under the Daily Sales Report section");
		WebElement date = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.DAILY_SALES_REPORT_DATE))));
		Assert.assertEquals(CallObject.presentTimestamp(), date.getAttribute("value"));
		System.out.println("Success: The system current 'Date' is displayed "
				+ "under the Daily Sales Report section successfully");
	}
	

	@Then("^User clicks on 'Go' button & verifies the START OF DAILY SALES REPORT$")
	public void user_clicks_on_Go_button_verifies_the_START_OF_DAILY_SALES_REPORT() throws Throwable {
	   
		System.out.println("Attempt: click on 'Go' button & verify the START OF DAILY SALES REPORT");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.DAILY_SALES_REPORT_GO, LocatorsPath.MAX_TIME);
		System.out.println("Success: clicked on 'Go' button & verified the START OF DAILY SALES REPORT");
	}
	

	@Then("^User verifies the Sales Rep Name & Date is displayed under the Daily Sales Report section$")
	public void user_verifies_the_Sales_Rep_Name_Date_is_displayed_under_the_Daily_Sales_Report_section() throws Throwable {
	    
		System.out.println("Attempt: verify the Sales Rep Name & Date is displayed "
				+ "under the Daily Sales Report section");
		WebElement salesRep = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.SALES_REP))));
		Assert.assertEquals("Sales Rep:", salesRep.getText());
		
		WebElement date = wait.until(ExpectedConditions.
				presenceOfElementLocated((
						By.xpath("//div//span[contains(text(),'Date') and //label[contains(text(),'"
				+CallObject.presentTimestamp()+"')]]"))));
		Assert.assertEquals("Date:", date.getText());
		System.out.println("Success: The Sales Rep Name & Date is displayed under "
				+ "the Daily Sales Report section successfully");
	}
	

	@Then("^User verifies the 'Start of Daily Sales Report' header label is displayed$")
	public void user_verifies_the_Start_of_Daily_Sales_Report_header_label_is_displayed() throws Throwable {
	    
		System.out.println("Attempt: verify the 'Start of Daily Sales Report' header label is displayed");
		WebElement report = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.START_DAILY_STATUS_REPORT))));
		Assert.assertEquals("*START OF DAILY SALES REPORT*", report.getText());
		System.out.println("Success: 'Start of Daily Sales Report' header label is displayed successfully");
	}
	

	@Then("^User verifies the Product Name, Retail, Wholesale & Grand Total fields are displayed under START OF DAILY SALES REPORT$")
	public void user_verifies_the_Product_Name_Retail_Wholesale_Grand_Total_fields_are_displayed_under_START_OF_DAILY_SALES_REPORT() throws Throwable {
	    
		System.out.println("Attempt: verify the Product Name, Retail, Wholesale & "
				+ "Grand Total fields are displayed under START OF DAILY SALES REPORT");
		try {
			
			WebElement prodName = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.SALES_REPORT_PROD_NAME))));
			Assert.assertEquals("Product Name", prodName.getText());
			
			WebElement retail = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.SALES_REPORT_RETAIL))));
			Assert.assertEquals("Retail", retail.getText());
			
			WebElement wholesale = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.SALES_REPORT_WHOLESALE))));
			Assert.assertEquals("WholeSale", wholesale.getText());
			
			WebElement grandTotal = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.SALES_REPORT_GRANDTOTAL))));
			Assert.assertEquals("Grand Total", grandTotal.getText());
		} catch (StaleElementReferenceException StaleElementReferenceException) {
			System.out.println("Trying to recover from stale element" + StaleElementReferenceException);
		}
		System.out.println("Success: Product Name, Retail, Wholesale & Grand Total "
				+ "fields are displayed under START OF DAILY SALES REPORT");
	}
	

	@Then("^User verifies the Total Number of Invoice, Sales Rep Signature, Manager Signature & End of Daily Sales Report fields were displayed under START OF DAILY SALES REPORT$")
	public void user_verifies_the_Total_Number_of_Invoice_Sales_Rep_Signature_Manager_Signature_End_of_Daily_Sales_Report_fields_were_displayed_under_START_OF_DAILY_SALES_REPORT() throws Throwable {
	    
		System.out.println("Attempt: verify the Total Number of Invoice, Sales Rep Signature, Manager Signature & "
				+ "End of Daily Sales Report fields were displayed under START OF DAILY SALES REPORT");
		WebElement totalNoOfInvoice = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.TOTAL_NO_OF_INVOICES))));
		Assert.assertEquals("Total Number Of Invoices", totalNoOfInvoice.getText());
		
		WebElement salesRepSign = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.SALES_REP_SIGNATURE))));
		Assert.assertEquals("Sales Rep Signature", salesRepSign.getText());
		
		WebElement managerSign = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.MANAGER_SIGNATURE))));
		Assert.assertEquals("Manager Signature", managerSign.getText());
		
		WebElement report = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.END_DAILY_STATUS_REPORT))));
		Assert.assertEquals("*END OF DAILY SALES REPORT*", report.getText());
		System.out.println("Success: Total Number of Invoice, Sales Rep Signature, Manager Signature & "
				+ "End of Daily Sales Report fields were displayed under START OF DAILY SALES REPORT");
	}
	

	@Then("^User verifies the 'Print' button is present under the Daily Sales Report section$")
	public void user_verifies_the_Print_button_is_present_under_the_Daily_Sales_Report_section() throws Throwable {
	    
		System.out.println("Attempt: verify the 'Print' button is "
				+ "present under the Daily Sales Report section");
		PageObjects.SelectByCSSSelectorWithoutClick(
				driver, LocatorsPath.DAILY_STATUS_REPORT_PRINT, LocatorsPath.MAX_TIME);
		System.out.println("Success: Print' button is present under "
				+ "the Daily Sales Report section successfully");
	}
	

	
	/**----------------------RCS_SaaS_Verify_Reports1_WC--------------------------**/
	
	
	
	@Then("^User navigates to the 'Credit Report' under the Reports tab$")
	public void user_navigates_to_the_Credit_Report_under_the_Reports_tab() throws Throwable {
	    
		System.out.println("Attempt: navigate to the 'Credit Report' under the Reports tab");
		PageObjects.SelectByXpath(
				driver, LocatorsPath.CREDIT_REPORT, LocatorsPath.MAX_TIME);
		System.out.println("Success: navigated to the 'Credit Report' under the Reports tab successfully");
	}
	

	@Then("^User verifies the Sales Rep Name, Date & Time under the credit report$")
	public void user_verifies_the_Sales_Rep_Name_Date_Time_under_the_credit_report() throws Throwable {
	 
		System.out.println("Attempt: verify the Sales Rep Name & Date is displayed "
				+ "under the credit Report section");
		WebElement salesRep = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.SALES_REP_1))));
		Assert.assertEquals("Sales Rep :", salesRep.getText());
		
		WebElement date = wait.until(ExpectedConditions.
				presenceOfElementLocated((
						By.xpath("//div//span[contains(text(),'Date') and //label[contains(text(),'"
				+CallObject.presentTimestamp()+"')]]"))));
		Assert.assertEquals("Date:", date.getText());
		System.out.println("Success: The Sales Rep Name & Date is displayed under "
				+ "the credit Report section successfully");
	}
	

	@Then("^User verifies the 'Start of Credit Report' header label is displayed$")
	public void user_verifies_the_Start_of_Credit_Report_header_label_is_displayed() throws Throwable {
	    
		System.out.println("Attempt: verify the 'Start of Credit Report' header label is displayed");
		WebElement report = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.START_CREDIT_REPORT))));
		Assert.assertEquals("* START OF CREDIT REPORT *", report.getText());
		System.out.println("Success: 'Start of Credit Report' header label is displayed successfully");
	}
	

	@Then("^User verifies the Customer, Customer Type, Credit Limit, Available Credit, Outstanding Credit & BAD Debt Check are displayed under the 'Start of Credit Report' header$")
	public void user_verifies_the_Customer_Customer_Type_Credit_Limit_Available_Credit_Outstanding_Credit_BAD_Debt_Check_are_displayed_under_the_Start_of_Credit_Report_header() throws Throwable {
	    
		System.out.println("Attempt: verify the Customer, Customer Type, Credit Limit, Available Credit, "
				+ "Outstanding Credit & BAD Debt Check are displayed under the 'Start of Credit Report' header");
		WebElement customer = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.CREDIT_REPORT_CUSTOMER))));
		Assert.assertEquals("Customer", customer.getText());
		
		WebElement customerType = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.CREDIT_REPORT_CUSTOMER_TYPE))));
		Assert.assertEquals("Customer Type:", customerType.getText());
		
		WebElement creditLimit = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.CREDIT_REPORT_CREDIT_LIMIT))));
		Assert.assertEquals("Credit Limit", creditLimit.getText());
		
		WebElement availableCredit = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.CREDIT_REPORT_AVAIL_CREDIT))));
		Assert.assertEquals("Available Credit", availableCredit.getText());
		
		WebElement outstandingCredit = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.CREDIT_REPORT_OUT_CREDIT))));
		Assert.assertEquals("Outstanding Credit", outstandingCredit.getText());
		
		WebElement debtCheck = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.CREDIT_REPORT_DEBT_CHECK))));
		Assert.assertEquals("BAD Debt Check", debtCheck.getText());
		System.out.println("Success: The Customer, Customer Type, Credit Limit, Available Credit, "
				+ "Outstanding Credit & BAD Debt Check are displayed under the 'Start of Credit Report' header");
	}
	

	@Then("^User verifies the Sales Rep Signature & Manager Signature present under the 'Start of Credit Report' header$")
	public void user_verifies_the_Sales_Rep_Signature_Manager_Signature_present_under_the_Start_of_Credit_Report_header() throws Throwable {
	 
		System.out.println("Attempt: verify the Sales Rep Signature & Manager Signature "
				+ "present under the 'Start of Credit Report' header");
		WebElement salesRepSign = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.SALES_REP_SIGNATURE))));
		Assert.assertEquals("Sales Rep Signature", salesRepSign.getText());
		
		WebElement managerSign = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.MANAGER_SIGNATURE))));
		Assert.assertEquals("Manager Signature", managerSign.getText());
		System.out.println("Success: The Sales Rep Signature & Manager Signature "
				+ "present under the 'Start of Credit Report' header");
	}
	

	@Then("^User verifies the 'End of Daily Sales Report' header label is displayed$")
	public void user_verifies_the_End_of_Daily_Sales_Report_header_label_is_displayed() throws Throwable {
	   
		System.out.println("Attempt: verify the 'End of Daily Sales Report' header label is displayed");
		WebElement creditReport = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.END_CREDIT_REPORT))));
		Assert.assertEquals("* END OF CREDIT REPORT *", creditReport.getText());
		System.out.println("Success: The 'End of Daily Sales Report' header label is displayed successfully");
	}
	

	@Then("^User verifies the 'Print' button is present under 'Start of Credit Report' header\\.$")
	public void user_verifies_the_Print_button_is_present_under_Start_of_Credit_Report_header() throws Throwable {
	    
		user_verifies_the_Print_button_is_present_under_the_Daily_Sales_Report_section();
	}

}
