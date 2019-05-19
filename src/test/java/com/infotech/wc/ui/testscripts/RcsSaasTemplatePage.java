package com.infotech.wc.ui.testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
import com.infotech.basepage.RobotPage;
import com.infotech.testrunner.TestRunnerWebClient;

import cucumber.api.java.en.Then;

public class RcsSaasTemplatePage extends TestRunnerWebClient{
	
	public RcsSaasTemplatePage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
	ExcelApiFile file = new ExcelApiFile("TestData.xlsx");
	WebDriverWait wait = new WebDriverWait(driver, LocatorsPath.MAX_TIME);
	Actions actions = new Actions(driver);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	RcsSaasConfigurationContractPage contractPage = new RcsSaasConfigurationContractPage();
	RobotPage robot = new RobotPage();
	
	
	
	/**----------------------RCS_View_Template_WC--------------------------**/
	
	
	
	@Then("^User clicks on Template and navigates to the template screen successfully$")
	public void user_clicks_on_Template_and_navigates_to_the_template_screen_successfully() throws Throwable {
	 
		System.out.println("Attempt: click on Template and "
				+ "navigate to the template screen successfully");
		PageObjects.SelectByXpath(
				driver, LocatorsPath.TEMPLATE, LocatorsPath.MAX_TIME);
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.TEMPLATE_SETUP, LocatorsPath.MAX_TIME);
		System.out.println("Success: clicked on Template and "
				+ "navigated to the template screen successfully");
	}
	

	@Then("^User selects the 'Choose Template Type' section & verifies the following dropdowns are available - BAT Authority Assessment, BAT Volume Assessment, Custom Assessment, RCM Shopper Channel, RCM Communication opportunity$")
	public void user_selects_the_Choose_Template_Type_section_verifies_the_following_dropdowns_are_available_BAT_Authority_Assessment_BAT_Volume_Assessment_Custom_Assessment_RCM_Shopper_Channel_RCM_Communication_opportunity() throws Throwable {
	   
		System.out.println("Attempt: select the 'Choose Template Type' section & verify the following dropdowns are available - "
				+ "BAT Authority Assessment, BAT Volume Assessment, Custom Assessment, RCM Shopper Channel, RCM Communication opportunity");
		WebElement element = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.TEMPLATE_TYPE))));
		Select select = new Select(element);
		List<WebElement> allOptions = select.getOptions();
		
		 boolean found = false;
		 for(WebElement ele: allOptions) {
			 if(LocatorsPath.TemplateType1.equals(ele.getText())) {
				 found = true;
				 System.out.println(LocatorsPath.TemplateType1 +" - value exists");
				 Assert.assertTrue(found);
				 break;
			 }
			 
			 if(LocatorsPath.TemplateType2.equals(ele.getText())) {
				 found = true;
				 System.out.println(LocatorsPath.TemplateType2 +" - value exists");
				 Assert.assertTrue(found);
				 break;
			 }
			 
			 if(LocatorsPath.TemplateType3.equals(ele.getText())) {
				 found = true;
				 System.out.println(LocatorsPath.TemplateType3 +" - value exists");
				 Assert.assertTrue(found);
				 break;
			 }
			 
			 if(LocatorsPath.TemplateType4.equals(ele.getText())) {
				 found = true;
				 System.out.println(LocatorsPath.TemplateType4 +" - value exists");
				 Assert.assertTrue(found);
				 break;
			 }
			 
			 if(LocatorsPath.TemplateType5.equals(ele.getText())) {
				 found = true;
				 System.out.println(LocatorsPath.TemplateType5 +" - value exists");
				 Assert.assertTrue(found);
				 break;
			 }
			 
		 }if(!found) {
			 System.out.println(LocatorsPath.TemplateType1 +"or" + LocatorsPath.TemplateType2 +"or" +LocatorsPath.TemplateType3 +"or" +LocatorsPath.TemplateType4 +"or" +LocatorsPath.TemplateType5 +" - value doesn't exists");
			 Assert.fail(LocatorsPath.TemplateType1 +"or" + LocatorsPath.TemplateType2 +"or" +LocatorsPath.TemplateType3 +"or" +LocatorsPath.TemplateType4 +"or" +LocatorsPath.TemplateType5 +" - value doesn't exists");
	   }
		 System.out.println("Success: selected the 'Choose Template Type' section & verified the following dropdowns are available - "
					+ "BAT Authority Assessment, BAT Volume Assessment, Custom Assessment, RCM Shopper Channel, RCM Communication opportunity");
	}
	

	@Then("^User verifies all the existing Templates displayed successfully and the user selects any Template Type from the dropdown\\.$")
	public void user_verifies_all_the_existing_Templates_displayed_successfully_and_the_user_selects_any_Template_Type_from_the_dropdown() throws Throwable {
	   
		System.out.println("Attempt: verify all the existing Templates "
				+ "displayed successfully and select any Template Type from the dropdown");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.TEMPLATE_TYPE, LocatorsPath.MAX_TIME, 
				file.getCellData("Template", "Template Type", 2));
		CallObject.block(3000);
		System.out.println("Success: verified all the existing Templates "
				+ "displayed successfully and selected any Template Type from the dropdown");
	}
	

	
	/**----------------------RCS_Create_New_Assessment_Template_WC--------------------------**/
	
	
	
	@Then("^User clicks on the 'Add' button to create a New Assessment Template & navigates to the Add template screen successfully$")
	public void user_clicks_on_the_Add_button_to_create_a_New_Assessment_Template_navigates_to_the_Add_template_screen_successfully() throws Throwable {
	 
		System.out.println("Attempt: click on the 'Add' button to create a New Assessment "
				+ "Template & navigate to the Add template screen successfully");
		CallObject.block(3000);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.TEMPLATE_ADD, LocatorsPath.MAX_TIME);
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.ADD_TEMPLATE_DISP, LocatorsPath.MAX_TIME);
		System.out.println("Success: clicked on the 'Add' button to create a New Assessment "
				+ "Template & navigated to the Add template screen successfully");
	}
	

	@Then("^User enters the field - 'Template code' - which is mandatory$")
	public void user_enters_the_field_Template_code_which_is_mandatory() throws Throwable {
	    
		System.out.println("Attempt: enter the field - 'Template code' - which is mandatory");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.TEMP_CODE, LocatorsPath.MAX_TIME, 
				CallObject.timestamp().concat("_TempCode"));
		file.setCellData("Template", "Template code", 2, CallObject.timestamp().concat("_TempCode"));
		System.out.println("Success: entered the field - 'Template code' - which is mandatory");
	}

	
	@Then("^User enters the field - 'Description' which is a mandatory field, any value can be entered in Description$")
	public void user_enters_the_field_Description_which_is_a_mandatory_field_any_value_can_be_entered_in_Description() throws Throwable {
	    
		System.out.println("Attempt: enter the field - 'Description' - which is mandatory");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.TEMP_DESC, LocatorsPath.MAX_TIME, 
				CallObject.timestamp().concat("_TempDesc"));
		file.setCellData("Template", "Description", 2, 
				CallObject.timestamp().concat("_TempDesc"));
		System.out.println("Success: entered the field - 'Description' - which is mandatory");
	}
	

	@Then("^User selects the 'template type' for which the Template has to be created$")
	public void user_selects_the_template_type_for_which_the_Template_has_to_be_created() throws Throwable {
	    
		System.out.println("Attempt: select the 'template type' for which the Template has to be created");
		WebElement templateType = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.TEMPLATE_TYPE_1))));
		Assert.assertEquals(file.getCellData("Template", "Template Type", 2), 
				templateType.getText());
		System.out.println("Success: selected the 'template type' for which the Template has to be created");
	}
	

	@Then("^User selects the 'Calculate Score' Checkbox - the Assessment score will be calculated after it is performed$")
	public void user_selects_the_Calculate_Score_Checkbox_the_Assessment_score_will_be_calculated_after_it_is_performed() throws Throwable {
	    
		System.out.println("Attempt: select the 'Calculate Score' Checkbox - "
				+ "the Assessment score will be calculated after it is performed");
		WebElement calculateScrore = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.CALCULATE_SCORE))));
		if(!calculateScrore.isSelected()) {
			calculateScrore.click();
		}
		System.out.println("Success: selected the 'Calculate Score' Checkbox - "
				+ "the Assessment score will be calculated after it is performed");
	}

	
	@Then("^User selects the 'Enable Baseline' Checkbox for Setting up the template as baseline template$")
	public void user_selects_the_Enable_Baseline_Checkbox_for_Setting_up_the_template_as_baseline_template() throws Throwable {
	    
		System.out.println("Attempt: select the 'Enable Baseline' Checkbox for "
				+ "Setting up the template as baseline template");
		WebElement enableBaseline = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ENABLE_BASELINE))));
		if(!enableBaseline.isSelected()) {
			enableBaseline.click();
		}
		System.out.println("Success: selected the 'Enable Baseline' Checkbox for "
				+ "Setting up the template as baseline template");
	}
	

	@Then("^User selects the status as 'Active/Inactive' to create the new Assessment Template$")
	public void user_selects_the_status_as_Active_Inactive_to_create_the_new_Assessment_Template() throws Throwable {
	   
		System.out.println("Attempt: select the status as 'Active/Inactive' "
				+ "to create the new Assessment Template");
		WebElement status = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.TEMPLATE_STATUS))));
		if(!status.isSelected()) {
			status.click();
		}
		System.out.println("Success: selected the status as 'Active/Inactive' "
				+ "to create the new Assessment Template");
	}
	

	@Then("^User selects the 'Free LOV (\\d+)' dropdown in the Add template screen$")
	public void user_selects_the_Free_LOV_dropdown_in_the_Add_template_screen(int arg1) throws Throwable {
	  
		System.out.println("Attempt: select the 'Free LOV (\\d+)' dropdown in the Add template screen");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.FREE_LOV_1, LocatorsPath.MAX_TIME, 
				file.getCellData("Template", "Free LOV1", 2));
		System.out.println("Success: selected the 'Free LOV (\\d+)' dropdown in the Add template screen");
	}
	

	@Then("^User selects the 'Free LOV (\\d+)' dropdown in the add template screen$")
	public void user_selects_the_Free_LOV_dropdown_in_the_add_template_screen(int arg1) throws Throwable {
	    
		System.out.println("Attempt: select the 'Free LOV (\\d+)' dropdown in the Add template screen");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.FREE_LOV_2, LocatorsPath.MAX_TIME, 
				file.getCellData("Template", "Free LOV2", 2));
		System.out.println("Success: selected the 'Free LOV (\\d+)' dropdown in the Add template screen");
	}
	

	@Then("^User enters the first field - 'FreeText (\\d+)' in the Add template screen$")
	public void user_enters_the_first_field_FreeText_in_the_Add_template_screen(int arg1) throws Throwable {
	 
		System.out.println("Attempt: enter the first field - 'FreeText (\\d+)' in the Add template screen");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.FREE_TEXT_1, LocatorsPath.MAX_TIME, 
				file.getCellData("Template", "Free Text1", 2));
		System.out.println("Success: entered the first field - 'FreeText (\\d+)' in the Add template screen");
	}
	

	@Then("^User enters the second field - 'FreeText (\\d+)' in the add template screen$")
	public void user_enters_the_second_field_FreeText_in_the_add_template_screen(int arg1) throws Throwable {
	    
		System.out.println("Attempt: enter the first field - 'FreeText (\\d+)' in the Add template screen");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.FREE_TEXT_2, LocatorsPath.MAX_TIME, 
				file.getCellData("Template", "Free Text2", 2));
		System.out.println("Success: entered the first field - 'FreeText (\\d+)' in the Add template screen");
	}
	

	@Then("^User clicks on save button and verifies the Template is saved successfully\\.$")
	public void user_clicks_on_save_button_and_verifies_the_Template_is_saved_successfully() throws Throwable {
	   
		System.out.println("Attempt: click on save button and verify the Template is saved successfully");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.TEMPLATE_SAVE, LocatorsPath.MAX_TIME);
		System.out.println("Success: clicked on save button and verified the Template is saved successfully");
	}
	

	
	/**----------------------RCS_Edit_Existing_Template_WC--------------------------**/
	
	
	
	@Then("^User selects the template which needs to be edited and clicks on the hypelink available in the description field of the template$")
	public void user_selects_the_template_which_needs_to_be_edited_and_clicks_on_the_hypelink_available_in_the_description_field_of_the_template() throws Throwable {
	    
		System.out.println("Attempt: select the template which needs to be edited and "
				+ "click on the hypelink available in the description field of the template");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.TEMPLATE_CODE_SEARCH, LocatorsPath.MAX_TIME, 
				file.getCellData("Template", "Template code", 2));
		CallObject.block(3000);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.TEMPLATE_CODE_SELECT, LocatorsPath.MAX_TIME);
		System.out.println("Success: selected the template which needs to be edited and "
				+ "clicked on the hypelink available in the description field of the template");
	}
	

	@Then("^User should be navigated to the Edit template screen$")
	public void user_should_be_navigated_to_the_Edit_template_screen() throws Throwable {
	    
		System.out.println("Attempt: navigate to the Edit template screen");
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.EDIT_TEMP_DISP, LocatorsPath.MAX_TIME);
		System.out.println("Success: navigated to the Edit template screen");
	}
	

	@Then("^User makes required changes in the template and clicks on save button$")
	public void user_makes_required_changes_in_the_template_and_clicks_on_save_button() throws Throwable {
	  
		System.out.println("Attempt: Make the required changes in the template and click on save button");
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.FREE_TEXT_1)))).clear();
		CallObject.block(1000);
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.FREE_TEXT_1, LocatorsPath.MAX_TIME, 
				file.getCellData("Template", "Free Text1", 3));
		
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.FREE_TEXT_2)))).clear();
		CallObject.block(1000);
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.FREE_TEXT_2, LocatorsPath.MAX_TIME, 
				file.getCellData("Template", "Free Text2", 3));
		
		user_clicks_on_save_button_and_verifies_the_Template_is_saved_successfully();
		System.out.println("Success: The required changes in the template done and clicked on save button");
	}
	

	@Then("^User verifies the changes as been saved & the user is navigated to the Template screen successfully\\.$")
	public void user_verifies_the_changes_as_been_saved_the_user_is_navigated_to_the_Template_screen_successfully() throws Throwable {
	    
		System.out.println("Attempt: verify the changes as been saved & "
				+ "the user is navigated to the Template screen successfully");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.TEMPLATE_CODE_SEARCH, LocatorsPath.MAX_TIME, 
				file.getCellData("Template", "Template code", 2));
		CallObject.block(3000);
		PageObjects.SelectByCSSSelectorWithoutClick(
				driver, LocatorsPath.TEMPLATE_CODE_SELECT, LocatorsPath.MAX_TIME);
		
		WebElement version = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.TEMPLATE_VERSION))));
		file.setCellData("Template", "Template Version", 2, version.getText());
		System.out.println("Success: verified the changes as been saved & "
				+ "the user is navigated to the Template screen successfully");
	}
	

	
	/**----------------------RCS_Copy_Existing_Template_WC--------------------------**/
	
	
	
	
	@Then("^User selects a template which needs to be copied and clicks on the 'Copy' icon$")
	public void user_selects_a_template_which_needs_to_be_copied_and_clicks_on_the_Copy_icon() throws Throwable {
	    
		System.out.println("Attempt: select a template which needs to be copied and click on the 'Copy' icon");
		PageObjects.SelectByXpath(
				driver, LocatorsPath.ASSESSMENT, LocatorsPath.MAX_TIME);
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.ASSESSMENT_SETUP_DISP, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.CHOOSE_TEMPLATE_DP, LocatorsPath.MAX_TIME, 
				file.getCellData("Template", "Template code", 2).toUpperCase()+"-"+
				file.getCellData("Template", "Description", 2)+" - "+"[ "+
						file.getCellData("Template", "Template Version", 2)+" ]");
		
		CallObject.block(2000);
		WebElement add = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.TEMPLATE_ADD))));
		if(add.isDisplayed()) {
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.TEMPLATE_ADD, LocatorsPath.MAX_TIME);
			PageObjects.SelectByXpathWithoutClick(
					driver, LocatorsPath.ASSESS_TEMPLATE_DISP, LocatorsPath.MAX_TIME);
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.ASSESSMENT_ATTRIBUTE, LocatorsPath.MAX_TIME, 
					file.getCellData("Assessment", "Attribute", 2));
			
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.ASSESSMENT_WEIGHT, LocatorsPath.MAX_TIME, 
					file.getCellData("Assessment", "Weight", 2));
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.ASSESS_CONTROL_TYPE, LocatorsPath.MAX_TIME, 
					file.getCellData("Assessment", "Control Type", 2));
			
			user_clicks_on_save_button_and_verifies_the_Template_is_saved_successfully();
		}
		
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ASSESSMENT_FREEZE, LocatorsPath.MAX_TIME);
		
		WebElement errorMsg = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.xpath(LocatorsPath.ERROR_MSG))));
		if(errorMsg.isDisplayed()) {
			js.executeScript("arguments[0].scrollIntoView();", 
					driver.findElement(By.cssSelector(LocatorsPath.RESPONSES_ADD)));
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.RESPONSES_ADD, LocatorsPath.MAX_TIME);
			
			PageObjects.SelectByXpathWithoutClick(
					driver, LocatorsPath.ADD_RESPONSE_DISP, LocatorsPath.MAX_TIME);
			
			WebElement templateCode = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.TEMPLATE_CODE_2))));
			Assert.assertEquals(file.getCellData("Template", "Description", 2)+" - "+"[ "+
					file.getCellData("Template", "Template Version", 2)+" ]", 
					templateCode.getAttribute("value"));
			
			WebElement assessTemplate = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.ASSESS_TEMPLATE))));
			Assert.assertEquals(file.getCellData("Assessment", "Attribute", 2), 
					assessTemplate.getText());
			
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.RESPONSE, LocatorsPath.MAX_TIME, 
					file.getCellData("Assessment", "Response", 2));
			
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.RESPONSE_TRANS, LocatorsPath.MAX_TIME, 
					file.getCellData("Assessment", "Response translation", 2));
			
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.SCORE, LocatorsPath.MAX_TIME, 
					file.getCellData("Assessment", "Score", 2));
			
			PageObjects.SelectByCSSSelectorWithSendKeys(
					driver, LocatorsPath.INDICATOR, LocatorsPath.MAX_TIME, 
					file.getCellData("Assessment", "Indicator", 2));
			
			user_clicks_on_save_button_and_verifies_the_Template_is_saved_successfully();
		}
		
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ASSESSMENT_FREEZE, LocatorsPath.MAX_TIME);
		
		WebElement unFreeze = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ASSESSMENT_UNFREEZE))));
		if(unFreeze.isDisplayed()) {
			System.out.println("Unfreeze element displayed successfuly");
		}else {
			Assert.fail("Unfreeze element not displayed");
		}
		
		user_clicks_on_Template_and_navigates_to_the_template_screen_successfully();
		user_verifies_all_the_existing_Templates_displayed_successfully_and_the_user_selects_any_Template_Type_from_the_dropdown();
		
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.TEMPLATE_CODE_SEARCH, LocatorsPath.MAX_TIME, 
				file.getCellData("Template", "Template code", 2));
		CallObject.block(3000);
		PageObjects.SelectByCSSSelectorWithoutClick(
				driver, LocatorsPath.TEMPLATE_CODE_SELECT, LocatorsPath.MAX_TIME);
		
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.TEMPLATE_COPY_ICON, LocatorsPath.MAX_TIME);
		System.out.println("Success: selected a template which needs to be copied and clicked on the 'Copy' icon");
	}
	

	@Then("^User should be navigated to the 'New version template' screen$")
	public void user_should_be_navigated_to_the_New_version_template_screen() throws Throwable {
	    
		System.out.println("Attempt: navigate to the 'New version template' screen");
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.NEW_VERSION_TEMPLATE, LocatorsPath.MAX_TIME);
		System.out.println("Success: navigated to the 'New version template' screen");
	}
	

	@Then("^User makes required changes in the template and Clicks on save button$")
	public void user_makes_required_changes_in_the_template_and_Clicks_on_save_button() throws Throwable {
	    
		System.out.println("Attempt: make required changes in the template and Click on save button");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.NEW_VER_FREE_LOV_1, LocatorsPath.MAX_TIME, 
				file.getCellData("Template", "Free LOV1", 2));
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.NEW_VER_FREE_LOV_2, LocatorsPath.MAX_TIME, 
				file.getCellData("Template", "Free LOV2", 2));
		user_clicks_on_save_button_and_verifies_the_Template_is_saved_successfully();
		System.out.println("Success: Required changes made in the template and Clicked on save button");
	}
	

	@Then("^User verifies the changes as been saved & the New copy of template is created with different version successfully\\.$")
	public void user_verifies_the_changes_as_been_saved_the_New_copy_of_template_is_created_with_different_version_successfully() throws Throwable {
	    
		System.out.println("Attempt: verify the changes as been saved & "
				+ "the New copy of template is created with different version successfully");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.TEMPLATE_CODE_SEARCH, LocatorsPath.MAX_TIME, 
				file.getCellData("Template", "Template code", 2));
		CallObject.block(3000);
		PageObjects.SelectByCSSSelectorWithoutClick(
				driver, LocatorsPath.TEMPLATE_CODE_SELECT, LocatorsPath.MAX_TIME);
		
		WebElement newVersion = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.TEMPLATE_VERSION))));
		Assert.assertEquals("2.00", newVersion.getText());
		System.out.println("Success: verified the changes as been saved & "
				+ "the New copy of template is created with different version successfully");
	}
	

	
	/**----------------------RCS_Delete_Template_WC--------------------------**/
	
	
	
	@Then("^User selects a template which needs to be deleted and Clicks on the 'delete' icon$")
	public void user_selects_a_template_which_needs_to_be_deleted_and_Clicks_on_the_delete_icon() throws Throwable {
	   
		System.out.println("Attempt: select a template which needs to be "
				+ "deleted and Click on the 'delete' icon");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.TEMPLATE_DELETE, LocatorsPath.MAX_TIME);
		System.out.println("Success: selected a template which needs to be "
				+ "deleted and Clicked on the 'delete' icon");
	}
	

	@Then("^User verifies the selected template is deleted successfully\\.$")
	public void user_verifies_the_selected_template_is_deleted_successfully() throws Throwable {
	   
		CallObject.switchToAlert(driver);
	}
	

	
	/**----------------------RCS_Add_Common_Responses_Template_WC--------------------------**/
	
	
	
	@Then("^User clicks on 'Add' button in the Common responses section$")
	public void user_clicks_on_Add_button_in_the_Common_responses_section() throws Throwable {
	    
		System.out.println("Attempt: click on 'Add' button in the Common responses section");
		wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath(LocatorsPath.ASSESSMENT)));
		PageObjects.SelectByXpath(
				driver, LocatorsPath.ASSESSMENT, LocatorsPath.MAX_TIME);
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.ASSESSMENT_SETUP_DISP, LocatorsPath.MAX_TIME);
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.CHOOSE_TEMPLATE_DP, LocatorsPath.MAX_TIME, 
				file.getCellData("Template", "Template code", 2).toUpperCase()+"-"+
				file.getCellData("Template", "Description", 2)+" - "+"[ "+
						file.getCellData("Template", "Template Version", 2)+" ]");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ASSESSMENT_UNFREEZE, LocatorsPath.MAX_TIME);
		
		WebElement Freeze = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ASSESSMENT_FREEZE))));
		if(Freeze.isDisplayed()) {
			System.out.println("Freeze element is displayed successfuly");
		}else {
			Assert.fail("Freeze element not displayed");
		}
		
		user_clicks_on_Template_and_navigates_to_the_template_screen_successfully();
		user_verifies_all_the_existing_Templates_displayed_successfully_and_the_user_selects_any_Template_Type_from_the_dropdown();
		
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.TEMPLATE_CODE_SEARCH, LocatorsPath.MAX_TIME, 
				file.getCellData("Template", "Template code", 2));
		CallObject.block(3000);
		PageObjects.SelectByCSSSelectorWithoutClick(
				driver, LocatorsPath.TEMPLATE_CODE_SELECT, LocatorsPath.MAX_TIME);
		
		WebElement version = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.TEMPLATE_VERSION))));
		file.setCellData("Template", "Template Version", 3, version.getText());
		
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.TEMPLATE_REFRESH, LocatorsPath.MAX_TIME);
		CallObject.block(2000);
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.COMMON_RESPONSES_ADD)));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.COMMON_RESPONSES_ADD, LocatorsPath.MAX_TIME);
		System.out.println("Success: clicked on 'Add' button in the Common responses section");
	}
	

	@Then("^User should be navigated to 'Add common responses' screen$")
	public void user_should_be_navigated_to_Add_common_responses_screen() throws Throwable {
	    
		System.out.println("Attempt: navigate to 'Add common responses' screen");
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.ADD_COMMON_RESPONSE, LocatorsPath.MAX_TIME);
		System.out.println("Success: navigated to 'Add common responses' screen");
	}
	

	@Then("^User verifies the 'Template code' field displays the template code and version of the template$")
	public void user_verifies_the_Template_code_field_displays_the_template_code_and_version_of_the_template() throws Throwable {
	    
		System.out.println("Attempt: verify the 'Template code' field displays "
				+ "the template code and version of the template");
		WebElement templateCode = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.TEMP_CODE))));
		Assert.assertEquals(file.getCellData("Template", "Template code", 2)+" - "+"[ "+
				file.getCellData("Template", "Template Version", 3)+" ]", templateCode.getAttribute("value"));
		System.out.println("Success: verified the 'Template code' field displays "
				+ "the template code and version of the template");
	}
	

	@Then("^User enters the field - 'Response' in the 'Add common responses' screen$")
	public void user_enters_the_field_Response_in_the_Add_common_responses_screen() throws Throwable {
	    
		System.out.println("Attempt: enter the field - 'Response' in the 'Add common responses' screen");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.TEMPLATE_RESPONSES, LocatorsPath.MAX_TIME, 
				file.getCellData("Template", "Response", 2));
		System.out.println("Success: entered the field - 'Response' in the 'Add common responses' screen");
	}
	

	@Then("^User enters the field - 'Response translation' in the 'Add common responses' screen$")
	public void user_enters_the_field_Response_translation_in_the_Add_common_responses_screen() throws Throwable {
	    
		System.out.println("Attempt: enter the field - 'Response translation' "
				+ "in the 'Add common responses' screen");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.RESPONSE_TRANSLATION, LocatorsPath.MAX_TIME, 
				file.getCellData("Template", "Response translation", 2));
		System.out.println("Success: entered the field - 'Response translation' "
				+ "in the 'Add common responses' screen");
	}
	

	@Then("^User enters the field - 'Score' in the 'Add common responses' screen$")
	public void user_enters_the_field_Score_in_the_Add_common_responses_screen() throws Throwable {
	   
		System.out.println("Attempt: enter the field - 'Score' in the 'Add common responses' screen");
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.TEMPLATE_SCORE)))).clear();
		CallObject.block(1000);
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.TEMPLATE_SCORE, LocatorsPath.MAX_TIME, 
				file.getCellData("Template", "Score", 2));
		System.out.println("Success: entered the field - 'Score' in the 'Add common responses' screen");
	}
	

	@Then("^User enters the field - 'Indicator' in the 'Add common responses' screen$")
	public void user_enters_the_field_Indicator_in_the_Add_common_responses_screen() throws Throwable {
	   
		System.out.println("Attempt: enter the field - 'Indicator' in the "
				+ "'Add common responses' screen");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.TEMPLATE_INDICATOR, LocatorsPath.MAX_TIME, 
				file.getCellData("Template", "Indicator", 2));
		System.out.println("Success: entered the field - 'Indicator' in the "
				+ "'Add common responses' screen");
	}
	

	@Then("^User selects the 'Free LOV(\\d+)' dropdown in the 'Add common responses' screen$")
	public void user_selects_the_Free_LOV_dropdown_in_the_Add_common_responses_screen(int arg1) throws Throwable {
	    
		System.out.println("Attempt: select the 'Free LOV(\\d+)' dropdown in the "
				+ "'Add common responses' screen");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.TEMP_RESP_FREE_LOV_1, LocatorsPath.MAX_TIME, 
				file.getCellData("Template", "Free LOV1", 3));
		System.out.println("Success: selected the 'Free LOV(\\d+)' dropdown in the "
				+ "'Add common responses' screen");
	}
	

	@Then("^User selects the 'Free LOV(\\d+)' dropdown in the 'Add common responses' Screen$")
	public void user_selects_the_Free_LOV_dropdown_in_the_Add_common_responses_Screen(int arg1) throws Throwable {
	    
		System.out.println("Attempt: select the 'Free LOV(\\d+)' dropdown in the "
				+ "'Add common responses' screen");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.TEMP_RESP_FREE_LOV_2, LocatorsPath.MAX_TIME, 
				file.getCellData("Template", "Free LOV2", 3));
		System.out.println("Success: selected the 'Free LOV(\\d+)' dropdown in the "
				+ "'Add common responses' screen");
	}
	

	@Then("^User enters the 'Free text field(\\d+)' in the 'Add common responses' screen$")
	public void user_enters_the_Free_text_field_in_the_Add_common_responses_screen(int arg1) throws Throwable {
	    
		System.out.println("Attempt: enter the 'Free text field(\\d+)' "
				+ "in the 'Add common responses' screen");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.RESP_FREE_FIELD_1, LocatorsPath.MAX_TIME, 
				file.getCellData("Template", "Free Text1", 4));
		System.out.println("Success: entered the 'Free text field(\\d+)' "
				+ "in the 'Add common responses' screen");
	}
	

	@Then("^User enters the 'Free text field(\\d+)' in the 'Add common responses' Screen$")
	public void user_enters_the_Free_text_field_in_the_Add_common_responses_Screen(int arg1) throws Throwable {
	    
		System.out.println("Attempt: enter the 'Free text field(\\d+)' "
				+ "in the 'Add common responses' screen");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.RESP_FREE_FIELD_2, LocatorsPath.MAX_TIME, 
				file.getCellData("Template", "Free Text2", 4));
		System.out.println("Success: entered the 'Free text field(\\d+)' "
				+ "in the 'Add common responses' screen");
	}
	

	@Then("^User clicks on save button and verifies the Common responses record is added successfully\\.$")
	public void user_clicks_on_save_button_and_verifies_the_Common_responses_record_is_added_successfully() throws Throwable {
	   
		user_clicks_on_save_button_and_verifies_the_Template_is_saved_successfully();
	}
	

	
	/**----------------------RCS_Delete_Common_Responses_Template_WC--------------------------**/
	
	
	
	@Then("^User clicks on 'delete' button in the Common responses section$")
	public void user_clicks_on_delete_button_in_the_Common_responses_section() throws Throwable {
	    
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.COMMON_RESP_ROW)));
		WebElement row = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.COMMON_RESP_ROW))));
		if(row.isDisplayed()) {
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.COMMON_RESP_DELETE, LocatorsPath.MAX_TIME);
		}else {
			Assert.fail("Common Responses Record is not displayed");
		}
	}
	

	@Then("^User verifies the Common responses record is deleted successfully\\.$")
	public void user_verifies_the_Common_responses_record_is_deleted_successfully() throws Throwable {
	    
		CallObject.switchToAlert(driver);
	}
	

	
	/**----------------------RCS_Verify_Assessment_Attributes_WC--------------------------**/
	
	
	
	@Then("^User selects the template and clicks on 'Assessment attributes'$")
	public void user_selects_the_template_and_clicks_on_Assessment_attributes() throws Throwable {
	    
		System.out.println("Attempt: select the template and click on 'Assessment attributes'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.TEMPLATE_CODE_SEARCH, LocatorsPath.MAX_TIME, 
				file.getCellData("Template", "Template code", 2));
		CallObject.block(3000);
		PageObjects.SelectByCSSSelectorWithoutClick(
				driver, LocatorsPath.TEMPLATE_CODE_SELECT, LocatorsPath.MAX_TIME);
		
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ASSESSMENT_ATTRIBUTES, LocatorsPath.MAX_TIME);
		System.out.println("Success: selected the template and clicked on 'Assessment attributes'");
	}
	

	@Then("^User navigates to the Assessment screen under Configuration for the selected template & verifies the behaviour\\.$")
	public void user_navigates_to_the_Assessment_screen_under_Configuration_for_the_selected_template_verifies_the_behaviour() throws Throwable {
	   
		System.out.println("User navigates to the Assessment screen under "
				+ "Configuration for the selected template & verifies the behaviour");
		
		/*-------------------------------Pre-Requisite---------------------------------*/
		
		contractPage.user_navigates_to_the_search_module();
		contractPage.user_enters_the_customer_number();
		
		PageObjects.SelectByCSSSelector(
	        		driver, LocatorsPath.MERCHAND_SAVE, LocatorsPath.MAX_TIME);
		 
		WebElement msg = wait.until(ExpectedConditions.
					presenceOfElementLocated((By.cssSelector(LocatorsPath.SUCCESS_MESSAGE))));
		Assert.assertEquals("Customer created successfully.", msg.getText());
			
		PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.UTIL_EXPORT_IN_EXCEL, LocatorsPath.MAX_TIME);
	}
	

	
	/**----------------------RCS_Import_Customer_Assessment_WC--------------------------**/
	
	
	
	@Then("^User selects the template and clicks on the 'Import customer assessment'$")
	public void user_selects_the_template_and_clicks_on_the_Import_customer_assessment() throws Throwable {
	    
		System.out.println("Attempt: select the template and clicks on the 'Import customer assessment'");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.CONFIGURATION, LocatorsPath.MAX_TIME);
		
		PageObjects.SelectByXpath(
				driver, LocatorsPath.ASSESSMENT, LocatorsPath.MAX_TIME);
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.ASSESSMENT_SETUP_DISP, LocatorsPath.MAX_TIME);
		
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ASSESSMENT_FREEZE, LocatorsPath.MAX_TIME);
		
		user_clicks_on_Template_and_navigates_to_the_template_screen_successfully();
		user_verifies_all_the_existing_Templates_displayed_successfully_and_the_user_selects_any_Template_Type_from_the_dropdown();
		
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.IMPORT_CUST_ASSESS, LocatorsPath.MAX_TIME);
		robot.importFile(LocatorsPath.TemplateImport);
		
		WebElement msg = wait.until(ExpectedConditions.presenceOfElementLocated(
				By.cssSelector(LocatorsPath.WARN_MESSAGE)));
		Assert.assertEquals("Total Records:-1 Success Records:-1 Error Records:-0", 
				msg.getText());
		System.out.println("Success: selected the template and clicked on the 'Import customer assessment'");
	}
	

	@Then("^User verifies the Import is successful\\.$")
	public void user_verifies_the_Import_is_successful() throws Throwable {
	   
		System.out.println("Attempt: verify the Import is successful");
		PageObjects.SelectByXpath(
				driver, LocatorsPath.ASSESSMENT, LocatorsPath.MAX_TIME);
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.ASSESSMENT_SETUP_DISP, LocatorsPath.MAX_TIME);
		
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ASSESSMENT_UNFREEZE, LocatorsPath.MAX_TIME);
		
		user_clicks_on_Template_and_navigates_to_the_template_screen_successfully();
		user_verifies_all_the_existing_Templates_displayed_successfully_and_the_user_selects_any_Template_Type_from_the_dropdown();
		
		user_selects_a_template_which_needs_to_be_deleted_and_Clicks_on_the_delete_icon();
		user_verifies_the_selected_template_is_deleted_successfully();
		
		WebElement msg = wait.until(ExpectedConditions.presenceOfElementLocated(
				By.cssSelector(LocatorsPath.WARN_MESSAGE)));
		Assert.assertEquals("Template cannot be deleted as template is associated to Customer assessment.", 
				msg.getText());
		System.out.println("Success: verified the Import is successful");
	}
}
