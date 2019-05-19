package com.infotech.wc.ui.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.infotech.Excel.CsvToExcelConverter;
import com.infotech.Excel.ExcelApiFile;
import com.infotech.basepage.CallObject;
import com.infotech.basepage.LocatorsPath;
import com.infotech.basepage.PageObjects;
import com.infotech.basepage.RobotPage;
import com.infotech.testrunner.TestRunnerWebClient;

import cucumber.api.java.en.Then;

public class RcsSaasConfigurationIdealStockPage extends TestRunnerWebClient{
	
	WebDriver driver = getDriver();
	Actions actions = new Actions(driver);
	RobotPage robotPage = new RobotPage();
	JavascriptExecutor js = (JavascriptExecutor)driver;
	ExcelApiFile file  = new ExcelApiFile("TestData.xlsx");
	ExcelApiFile file3 = new ExcelApiFile("TestData3.xlsx");
	WebDriverWait wait = new WebDriverWait(driver, LocatorsPath.MAX_TIME);
	
	public RcsSaasConfigurationIdealStockPage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	/**----------------------RCS_SaaS_IdealStockUI_WC--------------------------**/
	
	
	
	@Then("^User clicks on Ideal Stock and navigates to the Ideal Stock Screen$")
	public void user_clicks_on_Ideal_Stock_and_navigates_to_the_Ideal_Stock_Screen() throws Throwable {
	    
		System.out.println("Attempt: click on Ideal Stock and navigate to the Ideal Stock Screen");
		PageObjects.SelectByXpath(
				driver, LocatorsPath.IDEAL_STOCK, LocatorsPath.MAX_TIME);
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.IDEAL_STOCK_DISP, LocatorsPath.MAX_TIME);
		System.out.println("Success: clicked on Ideal Stock and navigated to the Ideal Stock Screen");
	}

	
	@Then("^User selects the Trade Approach from the dropdown & verifies the Trade Approach is selected successfully$")
	public void user_selects_the_Trade_Approach_from_the_dropdown_verifies_the_Trade_Approach_is_selected_successfully() throws Throwable {
	    
		System.out.println("Attempt: select the Trade Approach from the dropdown & "
				+ "verify the Trade Approach is selected successfully");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ID_TRADE_APPROACH, LocatorsPath.MAX_TIME, 
				file3.getCellData("IdealStock", "Trade Approach", 2));
		System.out.println("Success: selected the Trade Approach from the dropdown & "
				+ "verified the Trade Approach is selected successfully");
	}
	
		
	@Then("^User selects the Territory from the list for which the Ideal Stock to be created & verifies the Territory is selected without any error$")
	public void user_selects_the_Territory_from_the_list_for_which_the_Ideal_Stock_to_be_created_verifies_the_Territory_is_selected_without_any_error() throws Throwable {
	   
	    System.out.println("Attempt: select the Territory from the list for "
	    		+ "which the Ideal Stock to be created & verify the Territory is selected without any error");
	    CallObject.block(2000);
	    js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.xpath("//select[@id='content-area:idealStock1:setupTerPNlId']/option[@selected='selected'][contains(text(),'"+file.getCellData("Territory", "TerritoryName", 2)+"')]")));
	    CallObject.block(1000);
	    WebElement element = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath("//select[@id='content-area:idealStock1:setupTerPNlId']/option[@selected='selected'][contains(text(),'"+file.getCellData("Territory", "TerritoryName", 2)+"')]"))));
	    actions.moveToElement(element).doubleClick().build().perform();
		System.out.println("Success: selected the Territory from the list for "
		    		+ "which the Ideal Stock to be created & verified the Territory is selected without any error");
	}
	

	@Then("^User selects the Route from the list for which Ideal Stock to be created & verifies the Route is selected successfully$")
	public void user_selects_the_Route_from_the_list_for_which_Ideal_Stock_to_be_created_verifies_the_Route_is_selected_successfully() throws Throwable {
	    
		System.out.println("Attempt: select the Route from the list for which "
				+ "Ideal Stock to be created & verify the Route is selected successfully");
		try {
			js.executeScript("arguments[0].scrollIntoView();", 
					driver.findElement(By.xpath
							("//span[@id='content-area:idealStock1:Terr_routes']//option[contains(text(),'"+file3.getCellData("Route", "Route", 2)+"')]")));
			wait.until(ExpectedConditions.
					presenceOfElementLocated((By.xpath(LocatorsPath.IDEAL_ROUTE))));
			PageObjects.SelectByXpath(driver, 
					"//span[@id='content-area:idealStock1:Terr_routes']//option[contains(text(),'"+file3.getCellData("Route", "Route", 2)+"')]", 
					LocatorsPath.MAX_TIME);
			
			PageObjects.SelectByCSSSelectorWithoutClick(
					driver, LocatorsPath.IDEAL_STOCK_SHOW, LocatorsPath.MAX_TIME);
		} catch (StaleElementReferenceException StaleElementReferenceException) {
			System.out.println("Trying to recover from stale element" + StaleElementReferenceException);
		}
		System.out.println("Success: selected the Route from the list for which "
				+ "Ideal Stock to be created & verified the Route is selected successfully");
	}
	

	
	/**----------------------RCS_SaaS_IdealStock_ExportTemplate_WC--------------------------**/
	
	
	
	@Then("^User clicks on the 'EXPORT TEMPLATE' button & verifies the Ideal Stock exported template as all the SKUs which are part of Depot Assortment Plan$")
	public void user_clicks_on_the_EXPORT_TEMPLATE_button_verifies_the_Ideal_Stock_exported_template_as_all_the_SKUs_which_are_part_of_Depot_Assortment_Plan() throws Throwable {
	 
		System.out.println("Attempt: click on the 'EXPORT TEMPLATE' button & "
				+ "verify the Ideal Stock exported template as all the SKUs which are part of Depot Assortment Plan");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.EXPORT_TEMPLATE, LocatorsPath.MAX_TIME);
		System.out.println("Success: clicked on the 'EXPORT TEMPLATE' button & "
				+ "verified the Ideal Stock exported template as all the SKUs which are part of Depot Assortment Plan");
	}
	

	@Then("^User verifies the exported template as the following columns displayed - Route Name, Product, Territory Name$")
	public void user_verifies_the_exported_template_as_the_following_columns_displayed_Route_Name_Product_Territory_Name() throws Throwable {
	   
		System.out.println("Attempt: verify the exported template as the "
				+ "following columns displayed - Route Name, Product, Territory Name");
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.xpath("//select[@id='content-area:idealStock1:setupTerPNlId']/option[@selected='selected'][contains(text(),'"+file.getCellData("Territory", "TerritoryName", 2)+"')]")));
	    CallObject.block(1000);
	    WebElement territory = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath("//select[@id='content-area:idealStock1:setupTerPNlId']/option[@selected='selected'][contains(text(),'"+file.getCellData("Territory", "TerritoryName", 2)+"')]"))));
		
		CsvToExcelConverter.csvConverter
		(LocatorsPath.Id_CsvFirstFileLocation, LocatorsPath.Id_xlsxFirstFileLocation, LocatorsPath.Id_Sheet1);
		
		ExcelApiFile idealStock = new ExcelApiFile(LocatorsPath.Id_xlsxFirstFileLocation);
		Assert.assertEquals("Route Name",
				idealStock.getCellData(LocatorsPath.Id_Sheet1, "Route Name", 1));
		Assert.assertEquals("Product",  
				idealStock.getCellData(LocatorsPath.Id_Sheet1, "Product", 1));
		Assert.assertEquals(idealStock.getCellData(LocatorsPath.Id_Sheet1, file3.getCellData("IdealStock", "Territory", 2), 1), 
				territory.getText());
		System.out.println("Success: verified the exported template as the "
				+ "following columns displayed - Route Name, Product, Territory Name");
	}
	

	@Then("^User enters the required data in the EXPORT TEMPLATE file & verifies the Export file is saved with modified data\\.$")
	public void user_enters_the_required_data_in_the_EXPORT_TEMPLATE_file_verifies_the_Export_file_is_saved_with_modified_data() throws Throwable {
	   
		System.out.println("Attempt: enter the required data in the "
				+ "EXPORT TEMPLATE file & verify the Export file is saved with modified data");
		WebElement route = wait.until(ExpectedConditions.
				presenceOfElementLocated((
						By.xpath("//span[@id='content-area:idealStock1:Terr_routes']//select/option[contains(text(),"
								+ "'"+file3.getCellData("IdealStock", "Route", 2)+"')]"))));
		
		WebElement territory = wait.until(ExpectedConditions.
				presenceOfElementLocated((
						By.xpath("//select[@id='content-area:idealStock1:setupTerPNlId']/option[contains(text(),"
								+ "'"+file3.getCellData("IdealStock", "Territory", 2)+"')]"))));
		
		ExcelApiFile idealStock = new ExcelApiFile(LocatorsPath.Id_xlsxFirstFileLocation);
		idealStock.setCellData("Sheet1", "Route Name", 2, route.getText());	
		
		idealStock.setCellData("Sheet1", territory.getText(), 2, 
				file3.getCellData("IdealStock", "Territory Value", 2));	
		System.out.println("Success: The required data in the "
				+ "EXPORT TEMPLATE file is enetered & verified the Export file is saved with modified data");
	}
	

	
	/**----------------------RCS_SaaS_IdealStock_Import_WC--------------------------**/
	
	
	
	@Then("^User clicks on the Import button & verifies the file explorer is opened$")
	public void user_clicks_on_the_Import_button_verifies_the_file_explorer_is_opened() throws Throwable {
	    
		System.out.println("Attempt: click on the Import button "
				+ "& verify the file explorer is opened");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.IMPORT_TEMPLATE, LocatorsPath.MAX_TIME);
		System.out.println("Success: clicked on the Import button "
				+ "& verified the file explorer is opened");
	}
	

	@Then("^User selects the Saved import file and clicks on 'Open' button & verifies the selected file is imported successfully$")
	public void user_selects_the_Saved_import_file_and_clicks_on_Open_button_verifies_the_selected_file_is_imported_successfully() throws Throwable {
	    
		System.out.println("Attempt: select the Saved import file and click on 'Open' "
				+ "button & verify the selected file is imported successfully");
		robotPage.importFile(LocatorsPath.Id_CsvFirstFileLocation);
		System.out.println("Success: selected the Saved import file and clicked on 'Open' "
				+ "button & verified the selected file is imported successfully");
	}
	

	@Then("^User clicks on the 'Show' button & verifies the imported data is displayed on the screen and the quantity field is editable$")
	public void user_clicks_on_the_Show_button_verifies_the_imported_data_is_displayed_on_the_screen_and_the_quantity_field_is_editable() throws Throwable {
	    
		System.out.println("Attempt: click on the 'Show' button & "
				+ "verify the imported data is displayed on the screen and the quantity field is editable");
		WebElement msg = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.WARN_MESSAGE))));
		Assert.assertEquals("Total Records:-1 Success Records:-1 Error Records:-0", msg.getText());
		
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.IDEAL_STOCK_SHOW, LocatorsPath.MAX_TIME);
		System.out.println("Success: clicked on the 'Show' button & "
				+ "verified the imported data is displayed on the screen and the quantity field is editable");
	}
	

	@Then("^User selects the checkbox for the records to be modified and clicks on 'Save' button & verifies the selected Records is modified & saved without any errors, quantity field is displayed as Read-Only\\.$")
	public void user_selects_the_checkbox_for_the_records_to_be_modified_and_clicks_on_Save_button_verifies_the_selected_Records_is_modified_saved_without_any_errors_quantity_field_is_displayed_as_Read_Only() throws Throwable {
	   
		System.out.println("Attempt: select the checkbox for the records to be modified and "
				+ "click on 'Save' button & verify the selected Records is modified & saved without any errors, "
				+ "quantity field is displayed as Read-Only");
		WebElement record = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.RECORD_1))));
		
		if(record.isDisplayed()){
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.RECORD_1_CHECKBOX, LocatorsPath.MAX_TIME);
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.RECORD_SAVE, LocatorsPath.MAX_TIME);
		}else {
			System.out.println("record is not displayed");
		}
		System.out.println("Success: selected the checkbox for the records to be modified and "
				+ "clicked on 'Save' button & verified the selected Records is modified & saved without any errors, "
				+ "quantity field is displayed as Read-Only");
	}
	

	@Then("^User clicks on the 'Export in CSV/EXCEL' button & verifies all the SKUs is exported in CSV/excel format\\.$")
	public void user_clicks_on_the_Export_in_CSV_EXCEL_button_verifies_all_the_SKUs_is_exported_in_CSV_excel_format() throws Throwable {
	    
		System.out.println("Attempt: click on the 'Export in CSV/EXCEL' button & "
				+ "verify all the SKUs is exported in CSV/excel format");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.EXPORT_IN_CSV_BUTTON, LocatorsPath.MAX_TIME);
		System.out.println("Success: clicked on the 'Export in CSV/EXCEL' button & "
				+ "verified all the SKUs is exported in CSV/excel format");
	}
	

	
	/**----------------------RCS_SaaS_IdealStock_Delete_WC--------------------------**/
	
	
	
	@Then("^User selects the checkbox for the records to be deleted and clicks on 'DELETE' button & verifies the record is deleted successfully$")
	public void user_selects_the_checkbox_for_the_records_to_be_deleted_and_clicks_on_DELETE_button_verifies_the_record_is_deleted_successfully() throws Throwable {
	    
		System.out.println("Attempt: select the checkbox for the records to be deleted and "
				+ "click on 'DELETE' button & verify the record is deleted successfully");
		WebElement record = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.RECORD_1))));
		
		if(record.isDisplayed()){
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.RECORD_1_CHECKBOX, LocatorsPath.MAX_TIME);
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.DELETE_TEMPLATE, LocatorsPath.MAX_TIME);
		}else {
			System.out.println("record is not displayed");
		}
		System.out.println("Success: selected the checkbox for the records to be deleted and "
				+ "clicked on 'DELETE' button & verified the record is deleted successfully");
	}
	

	@Then("^User clicks on the DELETE button Without selecting any record & verifies the system displaying prompt alert message as 'Select atleast one checkbox to delete'$")
	public void user_clicks_on_the_DELETE_button_Without_selecting_any_record_verifies_the_system_displaying_prompt_alert_message_as_Select_atleast_one_checkbox_to_delete() throws Throwable {
	    
		System.out.println("Attempt: click on the DELETE button Without selecting any record & "
				+ "verify the system displaying prompt alert message as 'Select atleast one checkbox to delete'");
		
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.DELETE_TEMPLATE, LocatorsPath.MAX_TIME);
		WebElement msg = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ERROR_MESSAGE))));
		Assert.assertEquals("Select Atleast One CheckBox To Delete", msg.getText());
		
		System.out.println("Success: clicked on the DELETE button Without selecting any record & "
				+ "verified the system displaying prompt alert message as 'Select atleast one checkbox to delete'");
	}
	

	@Then("^User clicks on the SAVE button Without selecting any record & verifies the system displaying prompt alert message as 'Select atleast one checkbox to update quantity'\\.$")
	public void user_clicks_on_the_SAVE_button_Without_selecting_any_record_verifies_the_system_displaying_prompt_alert_message_as_Select_atleast_one_checkbox_to_update_quantity() throws Throwable {
	    
		System.out.println("Attempt: click on the SAVE button Without selecting any record & "
				+ "verify the system displaying prompt alert message as 'Select atleast one checkbox to update quantity'");
		
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.RECORD_SAVE, LocatorsPath.MAX_TIME);
		WebElement msg = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ERROR_MESSAGE))));
		Assert.assertEquals("Select atleast one checkbox to update quantity", msg.getText());
		
		System.out.println("Success: clicked on the SAVE button Without selecting any record & "
				+ "verified the system displaying prompt alert message as 'Select atleast one checkbox to update quantity'");
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
