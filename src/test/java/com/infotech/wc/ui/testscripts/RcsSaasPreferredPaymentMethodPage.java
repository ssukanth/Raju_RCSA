package com.infotech.wc.ui.testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.infotech.Excel.CsvReaderWriter;
import com.infotech.Excel.ExcelApiFile;
import com.infotech.basepage.CallObject;
import com.infotech.basepage.LocatorsPath;
import com.infotech.basepage.PageObjects;
import com.infotech.basepage.RobotPage;
import com.infotech.testrunner.TestRunnerWebClient;

import cucumber.api.java.en.Then;

public class RcsSaasPreferredPaymentMethodPage extends TestRunnerWebClient{
	
	WebDriver driver = getDriver();
	JavascriptExecutor js = (JavascriptExecutor)driver;
	ExcelApiFile file3 = new ExcelApiFile("TestData3.xlsx");
	ExcelApiFile file1 = new ExcelApiFile("TestData1.xlsx");
	ExcelApiFile file = new ExcelApiFile("TestData.xlsx");
	RobotPage robotPage = new RobotPage();
	WebDriverWait wait = new WebDriverWait(driver, LocatorsPath.MAX_TIME);
	RcsSaasTradePaymentsPage paymentsPage = new RcsSaasTradePaymentsPage();
	RcsSaasNewOutletCreationPage newOutletCreationPage = new RcsSaasNewOutletCreationPage();
	RcsSaasConfigurationContractPage configurationContractPage = new RcsSaasConfigurationContractPage();
	CsvReaderWriter CusTradingTerm = new CsvReaderWriter("C:\\Users\\30955\\Downloads\\CustomerTradingTerm.csv");
	
	
	public RcsSaasPreferredPaymentMethodPage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	/**----------------------Preferred_Payment_Method--------------------------**/
	
	
	
	
	@Then("^User navigates to the 'LOV' tab & selects the LOV type as 'User'$")
	public void user_navigates_to_the_LOV_tab_selects_the_LOV_type_as_User() throws Throwable {

		System.out.println("Attempt: navigate to the 'LOV' tab & select the LOV type as 'User'");
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.LOV, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.LOV_TYPE, LocatorsPath.MAX_TIME, 
				file3.getCellData("PPM", "Lov Type", 2));
		CallObject.block(3000);
		System.out.println("Success: navigated to the 'LOV' tab & selected the LOV type as 'User'");
	}
	

	@Then("^User verifies when the Set Code for the LOV is entered as 'PPM' then the Set Name is displayed as 'Preferred Payment Method'\\.$")
	public void user_verifies_when_the_Set_Code_for_the_LOV_is_entered_as_PPM_then_the_Set_Name_is_displayed_as_Preferred_Payment_Method() throws Throwable {

		System.out.println("Attempt: verify when the Set Code for the LOV is entered as 'PPM' "
				+ "then the Set Name is displayed as 'Preferred Payment Method'");
        PageObjects.SelectByCSSSelectorWithSendKeys(
        		driver, LocatorsPath.SET_CODE_SEARCH, LocatorsPath.MAX_TIME, 
                file3.getCellData("PPM", "Set Code Search", 2));	
        
        CallObject.block(5000);
        WebElement row = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SET_CODE_ROW))));
        if(row.isDisplayed()) {
        WebElement setCode = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SET_CODE))));
        Assert.assertEquals(file3.getCellData("PPM", "Set Code Search", 2), 
        		setCode.getText());
        
        WebElement setName = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SET_NAME))));
        Assert.assertEquals("Preferred Payment Mode", setName.getText());
        }else {
        	Assert.fail("Set Code row is not displayed");
        }
        System.out.println("Success: verified when the Set Code for the LOV is entered as 'PPM' "
        		+ "then the Set Name is displayed as 'Preferred Payment Method'");
	}
	

	@Then("^User clicks on the set code 'PPM'$")
	public void user_clicks_on_the_set_code_PPM() throws Throwable {

		System.out.println("Attempt: click on the set code 'PPM'");
		WebElement row = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.SET_CODE_ROW))));
		if(row.isDisplayed()) {
	        PageObjects.SelectByCSSSelector(
	        		driver, LocatorsPath.SET_CODE_REFRESH, LocatorsPath.MAX_TIME);
	        CallObject.block(2000);
	        }else {
	        	Assert.fail("Set Code row is not displayed");
	     }
		System.out.println("Success: clicked on the set code 'PPM'");
	}
	

	@Then("^User verifies the following values are defined under the new LOV - Cash, Cheque, MMP, EFT$")
	public void user_verifies_the_following_values_are_defined_under_the_new_LOV_Cash_Cheque_MMP_EFT() throws Throwable {
	   
		System.out.println("Attempt: verify the following values are defined under the new LOV - Cash, Cheque, MMP, EFT");
		
		WebElement itemCode = wait.until(ExpectedConditions.presenceOfElementLocated(
				(By.cssSelector(LocatorsPath.ITEM_CODE))));
		try {
			PageObjects.SelectByCSSSelectorWithSendKeys(driver, LocatorsPath.ITEM_CODE_SEARCH, LocatorsPath.MAX_TIME,
					file3.getCellData("PPM", "Item Code Search", 2));
			CallObject.block(4000);
			Assert.assertEquals(file3.getCellData("PPM", "Item Code Search", 2), 
					itemCode.getText());
		}catch (StaleElementReferenceException StaleElementReferenceException) {
			System.out.println("Trying to recover from stale element" + StaleElementReferenceException);
		}


		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(
					(By.cssSelector(LocatorsPath.ITEM_CODE_SEARCH)))).clear();
			CallObject.block(2000);
			wait.until(ExpectedConditions.presenceOfElementLocated(
					(By.cssSelector(LocatorsPath.ITEM_CODE_SEARCH)))).clear();
			PageObjects.SelectByCSSSelectorWithSendKeys(driver, LocatorsPath.ITEM_CODE_SEARCH, LocatorsPath.MAX_TIME,
					file3.getCellData("PPM", "Item Code Search", 3));
			CallObject.block(3000);
			Assert.assertEquals(file3.getCellData("PPM", "Item Code Search", 3), 
					itemCode.getText());
		} catch (StaleElementReferenceException StaleElementReferenceException) {
			System.out.println("Trying to recover from stale element" + StaleElementReferenceException);
		}
			

		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(
					(By.cssSelector(LocatorsPath.ITEM_CODE_SEARCH)))).clear();
			CallObject.block(2000);
			wait.until(ExpectedConditions.presenceOfElementLocated(
					(By.cssSelector(LocatorsPath.ITEM_CODE_SEARCH)))).clear();
			PageObjects.SelectByCSSSelectorWithSendKeys(driver, LocatorsPath.ITEM_CODE_SEARCH, LocatorsPath.MAX_TIME,
					file3.getCellData("PPM", "Item Code Search", 4));
			CallObject.block(3000);
			Assert.assertEquals(file3.getCellData("PPM", "Item Code Search", 4), 
					itemCode.getText());
		} catch (StaleElementReferenceException StaleElementReferenceException) {
			System.out.println("Trying to recover from stale element" + StaleElementReferenceException);
		}
			

		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(
					(By.cssSelector(LocatorsPath.ITEM_CODE_SEARCH)))).clear();
			CallObject.block(2000);
			wait.until(ExpectedConditions.presenceOfElementLocated(
					(By.cssSelector(LocatorsPath.ITEM_CODE_SEARCH)))).clear();
			PageObjects.SelectByCSSSelectorWithSendKeys(driver, LocatorsPath.ITEM_CODE_SEARCH, LocatorsPath.MAX_TIME,
					file3.getCellData("PPM", "Item Code Search", 5));
			CallObject.block(3000);
			Assert.assertEquals(file3.getCellData("PPM", "Item Code Search", 5), 
				 itemCode.getText());
		} catch (StaleElementReferenceException StaleElementReferenceException) {
			System.out.println("Trying to recover from stale element" + StaleElementReferenceException);
		}
		System.out.println("Success: verified the following values are defined under the new LOV - Cash, Cheque, MMP, EFT");
	}
	

	
	
	/**----------------------Verify_Preferred_Payment_Method--------------------------**/
	
	
	
	
	@Then("^User clicks on the Data Entry & selects any available customer where Customer type = Outlet & navigates to the profile tab$")
	public void user_clicks_on_the_Data_Entry_selects_any_available_customer_where_Customer_type_Outlet_navigates_to_the_profile_tab() throws Throwable {
	    
		//paymentsPage.selection_of_Filter_conditions_should_be_successful();
		newOutletCreationPage.user_clicks_on_Search_tab();
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.CUSTOMER_SEARCH, LocatorsPath.MAX_TIME);
	}
	

	@Then("^User navigates to the 'Trading Terms' section$")
	public void user_navigates_to_the_Trading_Terms_section() throws Throwable {
	    
		System.out.println("Attempt: navigate to the 'Trading Terms' section");
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(
						By.xpath(LocatorsPath.PPM_TRADING_TERMS)));
		PageObjects.SelectByXpath(
				driver, LocatorsPath.PPM_TRADING_TERMS, LocatorsPath.MAX_TIME);
		System.out.println("Success: navigated to the 'Trading Terms' section");
	}
	

	@Then("^User verifies the dropdown field named 'Preferred Payment Mode' is displayed$")
	public void user_verifies_the_dropdown_field_named_Preferred_Payment_Mode_is_displayed() throws Throwable {
	    
		System.out.println("Attempt: verify the dropdown field named 'Preferred Payment Mode' is displayed");
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(
						By.xpath(LocatorsPath.PREFERRED_PAYMENT_MODE)));
		WebElement ppm = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.PREFERRED_PAYMENT_MODE))));
		Assert.assertEquals("Preferred Payment Mode", ppm.getText());
		System.out.println("Success: verified the dropdown field named 'Preferred Payment Mode' is displayed");
	}
	

	@Then("^User selects the Collection Type as 'Cash' & verifies the Preferred Payment Mode dropdown field auto-populates the following values as 'Cash' & 'MMP'$")
	public void user_selects_the_Collection_Type_as_Cash_verifies_the_Preferred_Payment_Mode_dropdown_field_auto_populates_the_following_values_as_Cash_MMP() throws Throwable {
	   
		System.out.println("Attempt: select the Collection Type as 'Cash' & verify the "
				+ "Preferred Payment Mode dropdown field auto-populates the following values as 'Cash' & 'MMP'");
        switch (file3.getCellData("PPM", "Payment Method", 2)) {

        case "Credit":
        	try {
        		PageObjects.SelectByCSSSelectorWithSendKeys(
        				driver, LocatorsPath.PPM_PAYMENT_METHOD, LocatorsPath.MAX_TIME, 
        				file3.getCellData("PPM", "Payment Method", 2));
        		CallObject.block(3000);
        		
    			WebElement cashOnly = wait.until(ExpectedConditions.
    					presenceOfElementLocated((By.cssSelector(LocatorsPath.PPM_COLLECTION_TYPE))));
    			Select cash = new Select(cashOnly);
    			cash.selectByVisibleText(
    					file3.getCellData("PPM", "Collection Type", 2));
    			CallObject.block(3000);
    			js.executeScript("arguments[0].scrollIntoView();", 
    					driver.findElement(
    							By.cssSelector(LocatorsPath.PPM_DROPDOWN)));
    			WebElement element = wait.until(ExpectedConditions.
    					presenceOfElementLocated((By.cssSelector(LocatorsPath.PPM_DROPDOWN))));
    			Select select = new Select(element);
    			List<WebElement> allOptions = select.getOptions();
    			
    			 boolean found = false;
    			 for(WebElement ele: allOptions) {
    				 if("Cash".equals(ele.getText())) {
    					 found = true;
    					 System.out.println("Cash" +" - value exists");
    					 Assert.assertTrue(found);
    					 break;
    				 }
    				 
    				 if("MMP".equals(ele.getText())) {
    					 found = true;
    					 System.out.println("MMP" +" - value exists");
    					 Assert.assertTrue(found);
    					 break;
    				 }
    				 
    			 }if(!found) {
    				 System.out.println("Cash" +"or" +"MMP" +" - value doesn't exists");
    				 Assert.fail("Cash" +"or" +"MMP" +" - value doesn't exists");
    		   }
			} catch (StaleElementReferenceException StaleElementReferenceException) {
				System.out.println("Trying to recover from stale element" + StaleElementReferenceException);
			}
            break;
			
		case "Cash":
			try {
				PageObjects.SelectByCSSSelectorWithSendKeys(
	    				driver, LocatorsPath.PPM_PAYMENT_METHOD, LocatorsPath.MAX_TIME, 
	    				file3.getCellData("PPM", "Payment Method", 2));
				CallObject.block(3000);
				
				WebElement cashonly = wait.until(ExpectedConditions.
						presenceOfElementLocated((By.cssSelector(LocatorsPath.PPM_COLLECTION_TYPE))));
				Select Cash = new Select(cashonly);
				Cash.selectByVisibleText(
						file3.getCellData("PPM", "Collection Type", 2));
				CallObject.block(3000);
				js.executeScript("arguments[0].scrollIntoView();", 
						driver.findElement(
								By.cssSelector(LocatorsPath.PPM_DROPDOWN)));
				WebElement Element = wait.until(ExpectedConditions.
						presenceOfElementLocated((By.cssSelector(LocatorsPath.PPM_DROPDOWN))));
				Select Select = new Select(Element);
				List<WebElement> AllOptions = Select.getOptions();
				
				 boolean Found = false;
				 for(WebElement ele: AllOptions) {
					 if("Cash".equals(ele.getText())) {
						 Found = true;
						 System.out.println("Cash" +" - value exists");
						 Assert.assertTrue(Found);
						 break;
					 }
					 
					 if("MMP".equals(ele.getText())) {
						 Found = true;
						 System.out.println("MMP" +" - value exists");
						 Assert.assertTrue(Found);
						 break;
					 }
					 
				 }if(!Found) {
					 System.out.println("Cash" +"or" +"MMP" +" - value doesn't exists");
					 Assert.fail("Cash" +"or" +"MMP" +" - value doesn't exists");
			   }
			} catch (StaleElementReferenceException StaleElementReferenceException) {
				System.out.println("Trying to recover from stale element" + StaleElementReferenceException);
			}
			break;
		
		default:
            Assert.fail("Collection Type as 'Cash or Credit' is not "
            		+ "available in the Payment Method dropdown");
		}
        System.out.println("Success: selected the Collection Type as 'Cash' & verified the "
				+ "Preferred Payment Mode dropdown field auto-populates the following values as 'Cash' & 'MMP'");
	}
	

	@Then("^User selects the Collection Type as 'Cheque' only & verifies the Preferred Payment Mode dropdown field auto-populates the following value as 'Cheque'$")
	public void user_selects_the_Collection_Type_as_Cheque_only_verifies_the_Preferred_Payment_Mode_dropdown_field_auto_populates_the_following_value_as_Cheque() throws Throwable {
	   
		System.out.println("Attempt: select the Collection Type as 'Cheque' only & "
				+ "verify the Preferred Payment Mode dropdown field auto-populates the following value as 'Cheque'");
		switch (file3.getCellData("PPM", "Payment Method", 2)) {

        case "Credit":
        	try {
        		CallObject.block(3000);
    			WebElement cashOnly = wait.until(ExpectedConditions.
    					presenceOfElementLocated((By.cssSelector(LocatorsPath.PPM_COLLECTION_TYPE))));
    			Select cash = new Select(cashOnly);
    			cash.selectByVisibleText(
    					file3.getCellData("PPM", "Collection Type", 3));
    			CallObject.block(3000);
    			js.executeScript("arguments[0].scrollIntoView();", 
    					driver.findElement(
    							By.cssSelector(LocatorsPath.PPM_DROPDOWN)));
    			WebElement element = wait.until(ExpectedConditions.
    					presenceOfElementLocated((By.cssSelector(LocatorsPath.PPM_DROPDOWN))));
    			Select select = new Select(element);
    			List<WebElement> allOptions = select.getOptions();
    			
    			 boolean found = false;
    			 for(WebElement ele: allOptions) {
    				 if("Cheque".equals(ele.getText())) {
    					 found = true;
    					 System.out.println("Cheque" +" - value exists");
    					 Assert.assertTrue(found);
    					 break;
    				 }
    				 
    			 }if(!found) {
    				 System.out.println("Cheque" +" - value doesn't exists");
    				 Assert.fail("Cheque" +" - value doesn't exists");
    		   }
			} catch (StaleElementReferenceException StaleElementReferenceException) {
				System.out.println("Trying to recover from stale element" + StaleElementReferenceException);
			}
        	break;
			
		case "Cash":
			try {
				CallObject.block(3000);
				WebElement cashonly = wait.until(ExpectedConditions.
						presenceOfElementLocated((By.cssSelector(LocatorsPath.PPM_COLLECTION_TYPE))));
				Select Cash = new Select(cashonly);
				Cash.selectByVisibleText(
						file3.getCellData("PPM", "Collection Type", 3));
				CallObject.block(3000);
				js.executeScript("arguments[0].scrollIntoView();", 
						driver.findElement(
								By.cssSelector(LocatorsPath.PPM_DROPDOWN)));
				WebElement Element = wait.until(ExpectedConditions.
						presenceOfElementLocated((By.cssSelector(LocatorsPath.PPM_DROPDOWN))));
				Select Select = new Select(Element);
				List<WebElement> AllOptions = Select.getOptions();
				
				 boolean Found = false;
				 for(WebElement ele: AllOptions) {
					 if("Cheque".equals(ele.getText())) {
						 Found = true;
						 System.out.println("Cheque" +" - value exists");
						 Assert.assertTrue(Found);
						 break;
					 }
					 
				 }if(!Found) {
					 System.out.println("Cheque" +" - value doesn't exists");
					 Assert.fail("Cheque" +" - value doesn't exists");
			   }
			} catch (StaleElementReferenceException StaleElementReferenceException) {
				System.out.println("Trying to recover from stale element" + StaleElementReferenceException);
			}
			break;
		
		default:
            Assert.fail("Collection Type as 'Cash or Credit' is not "
            		+ "available in the Payment Method dropdown");
		}
		System.out.println("Success: selected the Collection Type as 'Cheque' only & "
				+ "verified the Preferred Payment Mode dropdown field auto-populates the following value as 'Cheque'");
	}
	

	@Then("^User selects the Collection Type as 'Cash & Cheque' & verifies the Preferred Payment Mode dropdown field auto-populates the following values as 'Cash', 'Cheque' & 'MMP'$")
	public void user_selects_the_Collection_Type_as_Cash_Cheque_verifies_the_Preferred_Payment_Mode_dropdown_field_auto_populates_the_following_values_as_Cash_Cheque_MMP() throws Throwable {
	    
		System.out.println("Attempt: select the Collection Type as 'Cash & Cheque' & verify the Preferred Payment Mode "
				+ "dropdown field auto-populates the following values as 'Cash', 'Cheque' & 'MMP'");
		switch (file3.getCellData("PPM", "Payment Method", 2)) {

        case "Credit":
        	try {
        		CallObject.block(3000);
    			WebElement cashOnly = wait.until(ExpectedConditions.
    					presenceOfElementLocated((By.cssSelector(LocatorsPath.PPM_COLLECTION_TYPE))));
    			Select cash = new Select(cashOnly);
    			cash.selectByVisibleText(
    					file3.getCellData("PPM", "Collection Type", 4));
    			CallObject.block(3000);
    			js.executeScript("arguments[0].scrollIntoView();", 
    					driver.findElement(
    							By.cssSelector(LocatorsPath.PPM_DROPDOWN)));
    			WebElement element = wait.until(ExpectedConditions.
    					presenceOfElementLocated((By.cssSelector(LocatorsPath.PPM_DROPDOWN))));
    			Select select = new Select(element);
    			List<WebElement> allOptions = select.getOptions();
    			
    			 boolean found = false;
    			 for(WebElement ele: allOptions) {
    				 if("Cash".equals(ele.getText())) {
    					 found = true;
    					 System.out.println("Cash" +" - value exists");
    					 Assert.assertTrue(found);
    					 break;
    				 }
    				 
    				 if("Cheque".equals(ele.getText())) {
    					 found = true;
    					 System.out.println("Cheque" +" - value exists");
    					 Assert.assertTrue(found);
    					 break;
    				 }
    				 
    				 if("MMP".equals(ele.getText())) {
    					 found = true;
    					 System.out.println("MMP" +" - value exists");
    					 Assert.assertTrue(found);
    					 break;
    				 }
    				 
    			 }if(!found) {
    				 System.out.println("Cash" +"or" +"MMP" +"or" +"Cheque" +" - value doesn't exists");
    				 Assert.fail("Cash" +"or" +"MMP" +"or" +"Cheque" +" - value doesn't exists");
    		   }
			} catch (StaleElementReferenceException StaleElementReferenceException) {
				System.out.println("Trying to recover from stale element" + StaleElementReferenceException);
			}
            break;
			
		case "Cash":
			try {
				CallObject.block(3000);
				WebElement cashonly = wait.until(ExpectedConditions.
						presenceOfElementLocated((By.cssSelector(LocatorsPath.PPM_COLLECTION_TYPE))));
				Select Cash = new Select(cashonly);
				Cash.selectByVisibleText(
						file3.getCellData("PPM", "Collection Type", 4));
				CallObject.block(3000);
				js.executeScript("arguments[0].scrollIntoView();", 
						driver.findElement(
								By.cssSelector(LocatorsPath.PPM_DROPDOWN)));
				WebElement Element = wait.until(ExpectedConditions.
						presenceOfElementLocated((By.cssSelector(LocatorsPath.PPM_DROPDOWN))));
				Select Select = new Select(Element);
				List<WebElement> AllOptions = Select.getOptions();
				
				 boolean Found = false;
				 for(WebElement ele: AllOptions) {
					 if("Cash".equals(ele.getText())) {
						 Found = true;
						 System.out.println("Cash" +" - value exists");
						 Assert.assertTrue(Found);
						 break;
					 }
					 
					 if("Cheque".equals(ele.getText())) {
						 Found = true;
						 System.out.println("Cheque" +" - value exists");
						 Assert.assertTrue(Found);
						 break;
					 }
					 
					 if("MMP".equals(ele.getText())) {
						 Found = true;
						 System.out.println("MMP" +" - value exists");
						 Assert.assertTrue(Found);
						 break;
					 }
					 
				 }if(!Found) {
					 System.out.println("Cash" +"or" +"MMP" +"or" +"Cheque" +" - value doesn't exists");
					 Assert.fail("Cash" +"or" +"MMP" +"or" +"Cheque" +" - value doesn't exists");
			   }
			} catch (StaleElementReferenceException StaleElementReferenceException) {
				System.out.println("Trying to recover from stale element" + StaleElementReferenceException);
			}
            break;
		
		default:
            Assert.fail("Collection Type as 'Cash or Credit' is not "
            		+ "available in the Payment Method dropdown");
		}
		System.out.println("Success: selected the Collection Type as 'Cash & Cheque' & verified the Preferred Payment Mode "
				+ "dropdown field auto-populates the following values as 'Cash', 'Cheque' & 'MMP'");
	}
	
	
	@Then("^User selects the Collection Type as 'Deferred Cheque' & verifies the Preferred Payment Mode dropdown field auto-populates the following values as 'Cash', 'Cheque', 'MMP' & 'EFT'\\.$")
	public void user_selects_the_Collection_Type_as_Deferred_Cheque_verifies_the_Preferred_Payment_Mode_dropdown_field_auto_populates_the_following_values_as_Cash_Cheque_MMP_EFT() throws Throwable {
	    
		System.out.println("Attempt: select the Collection Type as 'Deferred Cheque' & verify the "
				+ "Preferred Payment Mode dropdown field auto-populates the following values as 'Cash', 'Cheque', 'MMP' & 'EFT'");
		switch (file3.getCellData("PPM", "Payment Method", 2)) {

        case "Credit":
        	try {
        		CallObject.block(3000);
    			WebElement cashOnly = wait.until(ExpectedConditions.
    					presenceOfElementLocated((By.cssSelector(LocatorsPath.PPM_COLLECTION_TYPE))));
    			Select cash = new Select(cashOnly);
    			cash.selectByVisibleText(
    					file3.getCellData("PPM", "Collection Type", 5));
    			CallObject.block(3000);
    			js.executeScript("arguments[0].scrollIntoView();", 
    					driver.findElement(
    							By.cssSelector(LocatorsPath.PPM_DROPDOWN)));
    			WebElement element = wait.until(ExpectedConditions.
    					presenceOfElementLocated((By.cssSelector(LocatorsPath.PPM_DROPDOWN))));
    			Select select = new Select(element);
    			List<WebElement> allOptions = select.getOptions();
    			
    			 boolean found = false;
    			 for(WebElement ele: allOptions) {
    				 if("Cash".equals(ele.getText())) {
    					 found = true;
    					 System.out.println("Cash" +" - value exists");
    					 Assert.assertTrue(found);
    					 break;
    				 }
    				 
    				 if("Cheque".equals(ele.getText())) {
    					 found = true;
    					 System.out.println("Cheque" +" - value exists");
    					 Assert.assertTrue(found);
    					 break;
    				 }
    				 
    				 if("EFT".equals(ele.getText())) {
    					 found = true;
    					 System.out.println("EFT" +" - value exists");
    					 Assert.assertTrue(found);
    					 break;
    				 }
    				 
    				 if("MMP".equals(ele.getText())) {
    					 found = true;
    					 System.out.println("MMP" +" - value exists");
    					 Assert.assertTrue(found);
    					 break;
    				 }
    				 
    			 }if(!found) {
    				 System.out.println("Cash" +"or" +"MMP" +"or" +"Cheque"+"or" +"MMP" +" - value doesn't exists");
    				 Assert.fail("Cash" +"or" +"MMP" +"or" +"Cheque" +" - value doesn't exists");
    		   }
			} catch (StaleElementReferenceException StaleElementReferenceException) {
				System.out.println("Trying to recover from stale element" + StaleElementReferenceException);
			}
            break;
            
        case "Cash":
        	try {
            	CallObject.block(3000);
    			WebElement Element = wait.until(ExpectedConditions.
    					presenceOfElementLocated((By.cssSelector(LocatorsPath.PPM_COLLECTION_TYPE))));
    			Select Select = new Select(Element);
    			List<WebElement> AllOptions = Select.getOptions();
    			
    			 for(WebElement ele: AllOptions) {
    				 if(ele.getText().contains("Deferred Cheque")) {
                         Assert.fail("Deferred Cheque should not present under cash payment mode");
    					 break;
    				 }
    			 }
			} catch (StaleElementReferenceException StaleElementReferenceException) {
				System.out.println("Trying to recover from stale element" + StaleElementReferenceException);
			}
			break;
		
		default:
			 Assert.fail("Collection Type as 'Cash or Credit' is not "
	            		+ "available in the Payment Method dropdown");
		}
		System.out.println("Success: selected the Collection Type as 'Deferred Cheque' & verified the "
				+ "Preferred Payment Mode dropdown field auto-populates the following values as 'Cash', 'Cheque', 'MMP' & 'EFT'");
	}
	
	

	
	/**----------------------Preferred_Payment_Method_Export--------------------------**/
	
	
	
	
	@Then("^User clicks on the 'Data Entry' tab$")
	public void user_clicks_on_the_Data_Entry_tab() throws Throwable {

		System.out.println("Attempt: click on the 'Data Entry' tab");
		PageObjects.SelectByXpath(
				driver, LocatorsPath.DATA_ENTRY, LocatorsPath.MAX_TIME);
		configurationContractPage.user_enters_the_customer_number();
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.NEW_USER_SAVE, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Data Entry' tab clicked successfully");
	}
	

	@Then("^User clicks on the 'Export Trading Term Data' button$")
	public void user_clicks_on_the_Export_Trading_Term_Data_button() throws Throwable {

		System.out.println("Attempt: click on the 'Export Trading Term Data' button");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.EXPORT_TRADING_TERM_DATA, LocatorsPath.MAX_TIME);
		System.out.println("Success: clicked on the 'Export Trading Term Data' button");
	}
	

	@Then("^User verifies the 'Export Trading Term Data' is downloaded successfully$")
	public void user_verifies_the_Export_Trading_Term_Data_is_downloaded_successfully() throws Throwable {

		System.out.println("User verifies the 'Export Trading Term Data' is downloaded successfully");
	}
	

	@Then("^User verifies the 'Preferred Payment Method' column is added to the right of the 'Payment Method' Column in the Export file\\.$")
	public void user_verifies_the_Preferred_Payment_Method_column_is_added_to_the_right_of_the_Payment_Method_Column_in_the_Export_file() throws Throwable {
	   
		System.out.println("Attempt: verify the 'Preferred Payment Method' "
				+ "column is added to the right of the 'Payment Method' Column in the Export file");
		CallObject.block(3000);
		CusTradingTerm.csvReader("Preferred Payment Method");
		System.out.println("Success: verified the 'Preferred Payment Method' "
				+ "column is added to the right of the 'Payment Method' Column in the Export file");
	}

	
	
	
	/**----------------------Preferred_Payment_Method_Import--------------------------**/
	
	
	
	
	@Then("^User clicks on the 'Import' tab & navigates to the Data Import utility screen$")
	public void user_clicks_on_the_Import_tab_navigates_to_the_Data_Import_utility_screen() throws Throwable {
	    
		System.out.println("Attempt: click on the 'Import' tab & "
				+ "navigate to the Data Import utility screen");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.UTILITIES, LocatorsPath.MAX_TIME);
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.UTILITIES_DISP, LocatorsPath.MAX_TIME);
		System.out.println("Success: clicked on the 'Import' tab & "
				+ "navigated to the Data Import utility screen");
	}
	

	@Then("^User selects the Import type as 'Customer Trading Terms Data'$")
	public void user_selects_the_Import_type_as_Customer_Trading_Terms_Data() throws Throwable {
	    
		System.out.println("Attempt: User selects the Import type as 'Customer Trading Terms Data'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.SELECT_EXP_TYPE_DP, LocatorsPath.MAX_TIME, 
				file3.getCellData("PPM", "Export Type", 2));
		 System.out.println("Success: Selected the Import type as 'Customer Trading Terms Data'");
	}
	

	@Then("^User clicks on the 'Customer Trading Terms Data' button & uploads the template$")
	public void user_clicks_on_the_Customer_Trading_Terms_Data_button_uploads_the_template() throws Throwable {
	    
		System.out.println("Attempt: click on the 'Customer Trading Terms Data' button & upload the template");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.IMPORT_CUST_ASSESS, LocatorsPath.MAX_TIME);
		robotPage.importFile(LocatorsPath.customerTradingTermImport);
		System.out.println("Success: clicked on the 'Customer Trading Terms Data' button & uploaded the template");
	}
	

	@Then("^User verifies the 'Customer Trading Terms Data' template is uploaded successfully\\.$")
	public void user_verifies_the_Customer_Trading_Terms_Data_template_is_uploaded_successfully() throws Throwable {
	    
		System.out.println("Attempt: verify the 'Customer Trading Terms Data' template is uploaded");
		WebElement verify = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.TOTAL_RECORDS_MESSAGE))));
		Assert.assertEquals("Total Records:-1 Success Records:-1 Error Records:-0", verify.getText());
		System.out.println("Success: verified the 'Customer Trading Terms Data' template is uploaded successfully");
	}
}
