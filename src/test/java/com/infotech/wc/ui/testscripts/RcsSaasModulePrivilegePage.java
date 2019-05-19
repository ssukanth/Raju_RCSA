package com.infotech.wc.ui.testscripts;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.infotech.Excel.ExcelApiFile;
import com.infotech.basepage.CallObject;
import com.infotech.basepage.LocatorsPath;
import com.infotech.basepage.PageObjects;
import com.infotech.testrunner.TestRunnerWebClient;

import cucumber.api.java.en.Then;

public class RcsSaasModulePrivilegePage extends TestRunnerWebClient{

	WebDriver driver = getDriver();
	Actions actions = new Actions(driver);
	ExcelApiFile file = new ExcelApiFile("TestData.xlsx");
	WebDriverWait wait = new WebDriverWait(driver, LocatorsPath.MAX_TIME);
	
	public RcsSaasModulePrivilegePage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	/**----------------------RCS SAAS ModulePrivilege_WC--------------------------**/
	
	
	@Then("^User clicks on Module priviliges and navigates to Module priviliges Screen$")
	public void i_Click_on_Module_priviliges_and_navigate_to_Module_priviliges_Screen() throws Throwable {

		System.out.println("Attempt: Click on Module priviliges Menu");
		WebElement privilege = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.MODULE_PRIVILIGES))));
		actions.moveToElement(privilege).doubleClick().build().perform();
		System.out.println("Success: Module priviliges Menu selected successfully");
	}

	
	@Then("^The user or the admin should be able to select a specific role from the dropdown$")
	public void the_user_or_the_admin_should_be_able_to_select_a_specific_role_from_the_dropdown() throws Throwable {
	    
		System.out.println("Attempt: user or the admin should be able to select a specific role from the dropdown");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ROLES, LocatorsPath.MAX_TIME, 
				file.getCellData("ModulePrivileges", "Roles", 2));
		System.out.println("Success: 'Role' dropdown selected");
	}
	

	@Then("^User selects the module name from the dropdown for which the access has to be provided$")
	public void select_the_module_name_from_the_dropdown_for_which_the_access_has_to_be_provided() throws Throwable {
	    
		System.out.println("Attempt: Select the module name from the dropdown for which the access has to be provided");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.MODULES, LocatorsPath.MAX_TIME, 
				file.getCellData("ModulePrivileges", "Modules", 2));
		System.out.println("Success: module name from the dropdown as been selected");
	}

	
	@Then("^User validates the List of screens present under the selected module$")
	public void validate_the_List_of_screens_present_under_the_selected_module() throws Throwable {
	    
        System.out.println("List of screens "
        		+ "present under the selected module");
	}
	

	@Then("^User selects the 'Access type' - User can select 'Read-only access' or 'Full access'$")
	public void select_the_Access_type_User_can_select_Read_only_access_or_Full_access() throws Throwable {
	   
        switch (file.getCellData("ModulePrivileges", "AccessType", 2)) {
		
		case "FULL ACCESS":
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.ACCESS_TYPE, LocatorsPath.MAX_TIME, 
					file.getCellData("ModulePrivileges", "AccessType", 2));
			CallObject.block(5000);
			WebElement removeAll = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.xpath(LocatorsPath.REMOVE_ALL))));
			actions.moveToElement(removeAll).doubleClick().build().perform();
			CallObject.block(5000);
			WebElement addAll = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.xpath(LocatorsPath.ADD_ALL))));
			actions.moveToElement(addAll).doubleClick().build().perform();
			
			List<WebElement> subModulesLeft = 
					driver.findElements(By.cssSelector(LocatorsPath.SUB_MODULES_LEFT));
			List<WebElement> subModulesRight = 
					driver.findElements(By.cssSelector(LocatorsPath.SUB_MODULES_RIGHT));
			
			Assert.assertEquals("Both the sub modules size are equal", 
					subModulesLeft.size(), subModulesRight.size());
			break;
			
		case "READ ONLY ACCESS":
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.ACCESS_TYPE, LocatorsPath.MAX_TIME, 
					file.getCellData("ModulePrivileges", "AccessType", 2));
			CallObject.block(5000);
			WebElement RemoveAll = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.xpath(LocatorsPath.REMOVE_ALL))));
			actions.moveToElement(RemoveAll).doubleClick().build().perform();
			CallObject.block(5000);
			WebElement AddAll = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.xpath(LocatorsPath.ADD_ALL))));
			actions.moveToElement(AddAll).doubleClick().build().perform();
			
			List<WebElement> submodulesLeft = 
					driver.findElements(By.cssSelector(LocatorsPath.SUB_MODULES_LEFT));
			List<WebElement> submodulesRight = 
					driver.findElements(By.cssSelector(LocatorsPath.SUB_MODULES_RIGHT));
			
			Assert.assertEquals("Both the sub modules size are equal", 
					submodulesLeft.size(), submodulesRight.size());
			break;
			
		default:
			System.out.println("Expected Access types are not present in the Module Privileges");
			Assert.fail("Expected Access types are not present in the Module Privileges");
        }
	}

	
	@Then("^User clicks on the 'Add all' arrow button$")
	public void click_on_the_Add_all_arrow_button() throws Throwable {
	    
		System.out.println("'Add all' arrow button selected successfully");
	}

	
	@Then("^User validates whether all the screens provided with the access type 'Privilege' selected$")
	public void validate_all_the_screens_should_be_provided_with_the_access_type_Privilege_selected() throws Throwable {
	   
		System.out.println("'All the screens provided "
				+ "with the access type 'Privilege' selected");
	}

	
	@Then("^User verifies the display of sub-module and screen details with access type 'Full access or read only access' checked\\.$")
	public void finally_verify_the_display_of_sub_module_and_screen_details_with_access_type_Full_access_or_read_only_access_checked() throws Throwable {
	    
        switch (file.getCellData("ModulePrivileges", "AccessType", 2)) {
		
		case "FULL ACCESS":
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.ACCESS_TYPE, LocatorsPath.MAX_TIME, 
					file.getCellData("ModulePrivileges", "AccessType", 2));
			PageObjects.SelectByXpath(
					driver, LocatorsPath.ADD_ALL, LocatorsPath.MAX_TIME);
			CallObject.waitForPageLoad(driver);
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.CHECKED, LocatorsPath.MAX_TIME);
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.UNCHECKED, LocatorsPath.MAX_TIME);
			break;
			
		case "READ ONLY ACCESS":
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.ACCESS_TYPE, LocatorsPath.MAX_TIME, 
					file.getCellData("ModulePrivileges", "AccessType", 2));
			PageObjects.SelectByXpath(
					driver, LocatorsPath.ADD_ALL, LocatorsPath.MAX_TIME);
			CallObject.waitForPageLoad(driver);
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.CHECKED, LocatorsPath.MAX_TIME);
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.UNCHECKED, LocatorsPath.MAX_TIME);
			break;
			
        default:
			System.out.println("Expected Access types are not present in the Module Privileges");
			Assert.fail("Expected Access types are not present in the Module Privileges");
	   }
	}
	
	
	public void subModulesLeft() throws Exception {
		
		CallObject.waitForPageLoad(driver);
		List<WebElement> subModulesLeft = driver.findElements(
				By.cssSelector(LocatorsPath.SUB_MODULES_LEFT));
		System.out.println(subModulesLeft.size());
		for(int i=1; i<=subModulesLeft.size(); i++) {
			String leftModules = subModulesLeft.get(i).getText();
			System.out.println(leftModules);
		}
	}
	
	
     public void subModulesRight() throws Exception {
		
    	 CallObject.waitForPageLoad(driver);
		 List<WebElement> subModulesRight = driver.findElements(
					By.cssSelector(LocatorsPath.SUB_MODULES_RIGHT));
		 System.out.println(subModulesRight.size());
		 for(int i=1; i<=subModulesRight.size(); i++) {
				String rightModules = subModulesRight.get(i).getText();
				System.out.println(rightModules);
		}
	}	
}
