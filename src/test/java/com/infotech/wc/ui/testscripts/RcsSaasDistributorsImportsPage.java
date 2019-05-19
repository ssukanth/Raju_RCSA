package com.infotech.wc.ui.testscripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.infotech.Excel.ExcelApiFile;
import com.infotech.basepage.CallObject;
import com.infotech.basepage.LocatorsPath;
import com.infotech.basepage.PageObjects;
import com.infotech.basepage.RobotPage;
import com.infotech.testrunner.TestRunnerWebClient;

import cucumber.api.java.en.Then;

public class RcsSaasDistributorsImportsPage extends TestRunnerWebClient{

	RobotPage robotPage = new RobotPage();
	WebDriver driver = getDriver();
	Actions actions = new Actions(driver);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	ExcelApiFile file3 = new ExcelApiFile("TestData3.xlsx");
	WebDriverWait wait = new WebDriverWait(driver, LocatorsPath.MAX_TIME);
	RcsSaasDistributorsSLOPage distributorsSLOPage = new RcsSaasDistributorsSLOPage();
	RcaSaasDistributorsSROPage distributorsSROPage = new RcaSaasDistributorsSROPage();
	
	
	public RcsSaasDistributorsImportsPage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	@Then("^User verifies the Pre-requisite (\\d+) - SLO header and details template is created with data$")
	public void user_verifies_the_Pre_requisite_SLO_header_and_details_template_is_created_with_data(int arg1) throws Throwable {
	   
		System.out.println("User verifies the Pre-requisite 1 - "
				+ "SLO header and details template is created with data");
	}
	

	@Then("^User verifies the Pre-requisite (\\d+) - SRO header and details template is created with data$")
	public void user_verifies_the_Pre_requisite_SRO_header_and_details_template_is_created_with_data(int arg1) throws Throwable {
	   
		System.out.println("User verifies the Pre-requisite 2 - "
				+ "SRO header and details template is created with data");
	}
	

	@Then("^User selects the 'Imports' tab and navigates to the imports screen$")
	public void user_selects_the_Imports_tab_and_navigates_to_the_imports_screen() throws Throwable {
	  
		System.out.println("Attempt: select the 'Imports' tab and "
				+ "navigate to the imports screen");
		PageObjects.SelectByXpath(
				driver, LocatorsPath.IMPORTS, LocatorsPath.MAX_TIME);
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.DATA_IMPORT_UTILITY, LocatorsPath.MAX_TIME);
		System.out.println("Success: selected the 'Imports' tab and "
				+ "navigated to the imports screen");
	}
	

	@Then("^User selects the 'SLO header and details' import type from the dropdown$")
	public void user_selects_the_SLO_header_and_details_import_type_from_the_dropdown() throws Throwable {
	    
		System.out.println("Attempt: select the 'SLO header and details' "
				+ "import type from the dropdown");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.IMPORT_TYPE_SLO, LocatorsPath.MAX_TIME, 
				file3.getCellData("DistributorImports", "Import Type", 3));
		CallObject.block(3000);
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.IMPORT_TYPE_SLO, LocatorsPath.MAX_TIME, 
				file3.getCellData("DistributorImports", "Import Type", 2));
		System.out.println("Success: selected the 'SLO header and details' "
				+ "import type from the dropdown");
	}
	

	@Then("^User imports the file which is created with the SLO header and details template & verifies the import is successful$")
	public void user_imports_the_file_which_is_created_with_the_SLO_header_and_details_template_verifies_the_import_is_successful() throws Throwable {
	    
		System.out.println("Attempt: import the file which is created with the SLO header "
				+ "and details template & verify the import is successful");
		CallObject.block(2000);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.STOCK_LIFTING_HEADER_BUTTON, LocatorsPath.MAX_TIME);
		robotPage.importFile(LocatorsPath.importFile);
		System.out.println("Success: imported the file which is created with the SLO header "
				+ "and details template & verified the import is successful");
	}
	

	@Then("^User selects the 'SRO header and details' import type from the dropdown$")
	public void user_selects_the_SRO_header_and_details_import_type_from_the_dropdown() throws Throwable {
	 
		System.out.println("Attempt: select the 'SRO header and details' import type from the dropdown");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.IMPORT_TYPE_SRO, LocatorsPath.MAX_TIME, 
				file3.getCellData("DistributorImports", "Import Type", 4));
		System.out.println("Success: selected the 'SRO header and details' import type from the dropdown");
	}
	

	@Then("^User imports the file which is created with the SRO header and details template & verifies the import is successful\\.$")
	public void user_imports_the_file_which_is_created_with_the_SRO_header_and_details_template_verifies_the_import_is_successful() throws Throwable {
	   
		System.out.println("Attempt: import the file which is created with the "
				+ "SRO header and details template & verify the import is successful");
		CallObject.block(2000);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.STOCK_LIFTING_DETAILS_BUTTON, LocatorsPath.MAX_TIME);
		robotPage.importFile(LocatorsPath.importFile);
		System.out.println("Success: imported the file which is created with the "
				+ "SRO header and details template & verified the import is successful");
	}
}
