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
import com.infotech.basepage.RobotPage;
import com.infotech.testrunner.TestRunnerWebClient;

import cucumber.api.java.en.Then;

public class RcsSaasTerritoryPage extends TestRunnerWebClient{
	
	public RcsSaasTerritoryPage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	ExcelApiFile file = new ExcelApiFile("TestData.xlsx");
	WebDriver driver = getDriver();
	Actions actions = new Actions(driver);
	RobotPage robot = new RobotPage();
	WebDriverWait wait = new WebDriverWait(driver, LocatorsPath.MAX_TIME);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	RcsSaasConfigurationUsersPage configurationPage = 
			new RcsSaasConfigurationUsersPage();
	RcsSaasConfigurationContractPage ContractPage = 
			new RcsSaasConfigurationContractPage();
	
	
	
	/**----------------------RCS SAAS Territory_WC--------------------------**/
	
	
	@Then("^User clicks on the Territory Menu and navigates to the Territory Screen$")
	public void i_Click_on_Territory_Menu_and_navigated_to_Territory_Screen() throws Throwable {

		System.out.println("Attempt: Click on Territory Menu");
		WebElement terr = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.TERRITORY_TAB))));
		actions.moveToElement(terr).doubleClick().build().perform();
		System.out.println("Success: Territory Menu selected successfully");
	}
	

	
	/**----------------------Creation_Of_New_Territory--------------------------**/
	
	
	
	@Then("^User clicks on 'Add' button to add a Territory$")
	public void i_Click_on_Add_button_to_add_a_Territory() throws Throwable {

		configurationPage.i_Click_on_Add_button();
	}
	

	@Then("^The 'Add Territory' screen should be displayed successfully$")
	public void finally_Add_Territory_screen_should_be_displayed_successfully() throws Throwable {
	 
		System.out.println("Success: Add button "
				+ "selected successfully");
	}
	

	@Then("^User enters the 'Territory code'$")
	public void i_enter_the_field_Territory_code() throws Throwable {
	    
		System.out.println("Attempt: Enter the field - 'Territory code'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.TERR_CODE, LocatorsPath.MAX_TIME, 
				CallObject.timestamp());
		file.setCellData("Territory", "TerritoryCode", 2, 
				CallObject.timestamp());
		System.out.println("Success: 'Territory code' entered successfully");
	}
	

	@Then("^User enters the 'Territory name'$")
	public void i_enter_the_field_Territory_name() throws Throwable {
	    
		System.out.println("Attempt: Enter the field - 'Territory name'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.TERRITORY_NAME, LocatorsPath.MAX_TIME, 
				CallObject.timestamp().concat("_Ter_Name"));
		file.setCellData("Territory", "TerritoryName", 2, 
				CallObject.timestamp().concat("_Ter_Name"));
		System.out.println("Success: 'Territory name' entered successfully");
	}

	
	@Then("^User selects 'Trade Approach' dropdown$")
	public void i_select_Trade_Approach_dropdown() throws Throwable {
	   
		System.out.println("Attempt: select the 'Trade Approach' dropdown");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.TRADE_APPROACH, LocatorsPath.MAX_TIME, 
				file.getCellData("Territory", "TradeApproach", 2));
		System.out.println("Success: 'Trade Approach' dropdown selected successfully");
	}

	
	@Then("^User selects the 'Status' as 'Active by default'$")
	public void i_select_the_Status_Active_by_default() throws Throwable {
	   
		System.out.println("Attempt: select the 'Status' dropdown");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.TERR_STATUS, LocatorsPath.MAX_TIME, 
				file.getCellData("Territory", "Status", 2));
		System.out.println("Success: 'Status' dropdown selected successfully");
	}

	
	@Then("^User selects the 'Level' dropdown$")
	public void i_select_the_Level_select_a_Value_from_dropdown() throws Throwable {
	   
		System.out.println("Attempt: select the 'Level' dropdown");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.LEVEL, LocatorsPath.MAX_TIME, 
				file.getCellData("Territory", "Level", 2));
		System.out.println("Success: 'Level' dropdown selected successfully");
	}

	
	@Then("^User selects the 'Country' dropdown$")
	public void i_select_the_Country_Select_a_value_from_dropdown() throws Throwable {
	    
		System.out.println("Attempt: select the 'County' dropdown");
        switch (file.getCellData("Territory", "Level", 2)) {
		
		case "LEVEL0":
			wait.until(ExpectedConditions.
					presenceOfElementLocated((By.xpath(LocatorsPath.COUNTRY_DISP))));
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.TERR_ADDRESS, LocatorsPath.MAX_TIME, 
					file.getCellData("Territory", "Country", 2));
        break;
			
		case "LEVEL1":
			wait.until(ExpectedConditions.
					presenceOfElementLocated((By.xpath(LocatorsPath.COUNTY_DISP))));
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.TERR_ADDRESS, LocatorsPath.MAX_TIME, 
					file.getCellData("Territory", "County", 2));
        break;
        
		case "LEVEL2":
			wait.until(ExpectedConditions.
					presenceOfElementLocated((By.xpath(LocatorsPath.CITY_DISP))));
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.TERR_ADDRESS, LocatorsPath.MAX_TIME, 
					file.getCellData("Territory", "City", 2));
        break;
        
		case "LEVEL3":
			wait.until(ExpectedConditions.
					presenceOfElementLocated((By.xpath(LocatorsPath.SUBURB_DISP))));
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.TERR_ADDRESS, LocatorsPath.MAX_TIME, 
					file.getCellData("Territory", "Suburb", 2));
        break;
		
		default:
			System.out.println("Territory addresses not displayed properly");
			Assert.fail("Territory addresses not displayed properly");
        }
		System.out.println("Success: 'County' dropdown selected successfully");
	}

	
	@Then("^User selects the 'Start Date'$")
	public void select_the_Start_Date_field() throws Throwable {
	   
		System.out.println("Attempt: select the 'Start Date'");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.TERR_START_DATE_CALENDER, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.TERR_START_DATE, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'Start Date' as been selected successfully");
	}

	
	@Then("^User selects the 'End Date'$")
	public void select_the_End_Date_field() throws Throwable {
	    
		System.out.println("Attempt: select the 'End Date'");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.TERR_END_DATE_CALENDER, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.TERR_END_DATE, LocatorsPath.MAX_TIME);
		System.out.println("Success: 'End Date' as been selected successfully");
	}

	
	@Then("^User clicks on Save button and Territory details should be saved successfully$")
	public void finally_I_Click_on_Save_button_and_Territory_details_should_be_saved_successfully() throws Throwable {
	    
		System.out.println("Attempt: Click on Save button");
		CallObject.waitForPageLoad(driver);
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.TERR_SAVE)));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.TERR_SAVE, LocatorsPath.MAX_TIME);
		
		WebElement successSumary = wait.until(ExpectedConditions.
				presenceOfElementLocated(By.cssSelector(LocatorsPath.EDIT_TERR_SUMMARY)));
		WebElement successMsg = wait.until(ExpectedConditions.
				presenceOfElementLocated(By.cssSelector(LocatorsPath.EDIT_SUCCESS_MSG)));
		Assert.assertEquals(file.getCellData("Territory", "TerritoryName", 2), 
				successSumary.getText());
		Assert.assertEquals("Territory created successfully.", 
				successMsg.getText());
		System.out.println("Success: Save button selected successfully");
	}
	
	
	
	/**----------------------Association_Of_Outlets_To_Territory--------------------------**/
	
	
	
	@Then("^User clicks on the 'Associate Customers' button in the Territory Screen$")
	public void user_clicks_on_the_Associate_Customers_button_in_the_Territory_Screen() throws Throwable {
	    
		System.out.println("Attempt: click on the 'Associate Customers' button in the Territory Screen");
		ContractPage.user_navigates_to_the_search_module();
		ContractPage.user_enters_the_customer_number();
		ContractPage.user_clicks_on_the_search_button();
		ContractPage.user_clicks_on_Export_in_CSV_button();
		configurationPage.i_Click_on_Configiuration();
		i_Click_on_Territory_Menu_and_navigated_to_Territory_Screen();
		
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.TERR_SEARCH, LocatorsPath.MAX_TIME, 
				file.getCellData("Territory", "TerritoryCode", 2));
		CallObject.block(3000);
		WebElement row = wait.until(ExpectedConditions.
				presenceOfElementLocated(By.cssSelector(LocatorsPath.TERR_ROW)));
		if(row.isDisplayed()) {
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.TERR_REFRESH, LocatorsPath.MAX_TIME);
		}else {
			Assert.fail("None of the rows are displayed");
		}
		
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.xpath(LocatorsPath.TERR_ASSOCIATE_CUST)));
		System.out.println("Success: clicked on the 'Associate Customers' "
				+ "button in the Territory Screen successfully");
	}
	

	@Then("^User verifies the Popup window should be displayed to choose the local file$")
	public void user_verifies_the_Popup_window_should_be_displayed_to_choose_the_local_file() throws Throwable {
	    
		System.out.println("Attempt: verify the Popup window is displayed to choose the local file");
		WebElement selectedTerr = wait.until(ExpectedConditions.
				presenceOfElementLocated((
						By.xpath("//label[contains(text(),'"+file.getCellData("Territory", "TerritoryName", 2)+"')]"))));
		Assert.assertEquals(file.getCellData("Territory", "TerritoryName", 2),
				selectedTerr.getText());
		
        switch (file.getCellData("Territory", "Select Associate Customer", 2)) {
		
		case "0":
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.ASSOCIATE_CUST_TO_TERR, LocatorsPath.MAX_TIME);
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.TERR_ASSOCIATE_CUSTOMERS, LocatorsPath.MAX_TIME);
			break;
			
			
		case "1":
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.ADD_CUST_TO_TERR, LocatorsPath.MAX_TIME);
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.TERR_ASSOCIATE_CUSTOMERS, LocatorsPath.MAX_TIME);
			break;

		default:
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.ASSOCIATE_CUST_TO_TERR, LocatorsPath.MAX_TIME);
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.TERR_ASSOCIATE_CUSTOMERS, LocatorsPath.MAX_TIME);
		System.out.println("Success: verified the Popup window is displayed to choose the local file");			
		}
	}
	

	@Then("^User selects the file 'Outlet Import' and clicks on 'Open' button to associate Outlets to the territory$")
	public void user_selects_the_file_Outlet_Import_and_clicks_on_Open_button_to_associate_Outlets_to_the_territory() throws Throwable {
	    
		robot.importFile(LocatorsPath.Territory_File);
	}
	

	@Then("^User verifies the Association of Outlets to the territory should be successful$")
	public void user_verifies_the_Association_of_Outlets_to_the_territory_should_be_successful() throws Throwable {
	    
		System.out.println("Attempt: verify the Association of Outlets to the territory should be successful");
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.TERR_WARN_MSG_SUMMARY)));
		
		WebElement successSumary = wait.until(ExpectedConditions.
				presenceOfElementLocated(By.cssSelector(LocatorsPath.TERR_WARN_MSG_SUMMARY)));
		WebElement successMsg = wait.until(ExpectedConditions.
				presenceOfElementLocated(By.cssSelector(LocatorsPath.TERR_WAREN_MSG)));
		Assert.assertEquals("Association for "+file.getCellData("Territory", "TerritoryName", 2)+"", 
				successSumary.getText());
		Assert.assertEquals("Total Records:-1 Success Records:-1 Error Records:-0", 
				successMsg.getText());
		System.out.println("Success: verified the Association of Outlets to the territory is successful");
	}
	

	
	/**----------------------Edit_Territory	--------------------------**/
	
	
	
	@Then("^User clicks on the Territory code hyperlink to Edit Territory details$")
	public void user_clicks_on_the_Territory_code_hyperlink_to_Edit_Territory_details() throws Throwable {
	    
		System.out.println("Attempt: click on the Territory code "
				+ "hyperlink to Edit Territory details");
		wait.until(ExpectedConditions.
				presenceOfElementLocated(By.cssSelector(LocatorsPath.TERR_SEARCH))).clear();
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.TERR_SEARCH, LocatorsPath.MAX_TIME, 
				file.getCellData("Territory", "TerritoryCode", 2));
		CallObject.block(3000);
		WebElement row = wait.until(ExpectedConditions.
				presenceOfElementLocated(By.cssSelector(LocatorsPath.TERR_ROW)));
		if(row.isDisplayed()) {
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.TERR_CODE_SELECTION, LocatorsPath.MAX_TIME);
		}else {
			Assert.fail("None of the rows are displayed");
		}
		System.out.println("Success: clicked on the Territory code "
				+ "hyperlink to Edit Territory details successfully");
	}
	

	@Then("^User verifies the Edit Territory page is displayed successfully$")
	public void user_verifies_the_Edit_Territory_page_is_displayed_successfully() throws Throwable {
	    
		System.out.println("Attempt: verify the Edit Territory page is displayed successfully");
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.EDIT_TERR_DISP, LocatorsPath.MAX_TIME);
		System.out.println("Success: verified the Edit Territory page is displayed successfully");
	}
	

	@Then("^User edits the Territory details and clicks on Save button$")
	public void user_edits_the_Territory_details_and_clicks_on_Save_button() throws Throwable {
	    
		System.out.println("Attempt: Edit the Territory details and click on Save button");
		wait.until(ExpectedConditions.
				presenceOfElementLocated(By.cssSelector(LocatorsPath.EDIT_TERR_COMMENTS))).clear();
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.EDIT_TERR_COMMENTS, LocatorsPath.MAX_TIME, 
				file.getCellData("Territory", "Comments", 2));
		
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.TERR_SAVE, LocatorsPath.MAX_TIME);
		System.out.println("Success: Edited the Territory details and clicked on Save button");
	}
	

	@Then("^User verifies the Territory details is updated successfully\\.$")
	public void user_verifies_the_Territory_details_is_updated_successfully() throws Throwable {
	   
		System.out.println("Attempt: verify the Territory details is updated successfully");
		WebElement successSumary = wait.until(ExpectedConditions.
				presenceOfElementLocated(By.cssSelector(LocatorsPath.EDIT_TERR_SUMMARY)));
		WebElement successMsg = wait.until(ExpectedConditions.
				presenceOfElementLocated(By.cssSelector(LocatorsPath.EDIT_SUCCESS_MSG)));
		Assert.assertEquals(file.getCellData("Territory", "TerritoryName", 2), 
				successSumary.getText());
		Assert.assertEquals("Territory modified successfully.", 
				successMsg.getText());
		System.out.println("Success: verified the Territory details is updated successfully");
	}
}
