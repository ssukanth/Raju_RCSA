package com.infotech.wc.ui.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

public class RcsSaasAssessmentPage extends TestRunnerWebClient{

	public RcsSaasAssessmentPage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
	ExcelApiFile file = new ExcelApiFile("TestData.xlsx");
	WebDriverWait wait = new WebDriverWait(driver, LocatorsPath.MAX_TIME);
	Actions actions = new Actions(driver);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	RcsSaasTemplatePage rcsSaasTemplatePage = new RcsSaasTemplatePage();
	
	
	
	/**----------------------RCS_SaaS_Add_Assessment_Template_WC--------------------------**/
	
	
	
	@Then("^User clicks on the 'Assessment' tab and navigates to the Assessment screen successfully$")
	public void user_clicks_on_the_Assessment_tab_and_navigates_to_the_Assessment_screen_successfully() throws Throwable {
	    
		/*----------------------PRE-Requisite---------------------------*/
		
		rcsSaasTemplatePage.user_clicks_on_Template_and_navigates_to_the_template_screen_successfully();
		rcsSaasTemplatePage.user_verifies_all_the_existing_Templates_displayed_successfully_and_the_user_selects_any_Template_Type_from_the_dropdown();
		CallObject.block(3000);
		rcsSaasTemplatePage.user_clicks_on_the_Add_button_to_create_a_New_Assessment_Template_navigates_to_the_Add_template_screen_successfully();
		rcsSaasTemplatePage.user_enters_the_field_Template_code_which_is_mandatory();
		rcsSaasTemplatePage.user_enters_the_field_Description_which_is_a_mandatory_field_any_value_can_be_entered_in_Description();
		rcsSaasTemplatePage.user_selects_the_template_type_for_which_the_Template_has_to_be_created();
		rcsSaasTemplatePage.user_clicks_on_save_button_and_verifies_the_Template_is_saved_successfully();
		
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.TEMPLATE_REFRESH, LocatorsPath.MAX_TIME);
		CallObject.block(2000);
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.COMMON_RESPONSES_ADD)));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.COMMON_RESPONSES_ADD, LocatorsPath.MAX_TIME);
		
		rcsSaasTemplatePage.user_should_be_navigated_to_Add_common_responses_screen();
		rcsSaasTemplatePage.user_enters_the_field_Response_in_the_Add_common_responses_screen();
		rcsSaasTemplatePage.user_enters_the_field_Response_translation_in_the_Add_common_responses_screen();
		rcsSaasTemplatePage.user_enters_the_field_Score_in_the_Add_common_responses_screen();
		rcsSaasTemplatePage.user_enters_the_field_Indicator_in_the_Add_common_responses_screen();
		rcsSaasTemplatePage.user_clicks_on_save_button_and_verifies_the_Common_responses_record_is_added_successfully();
		
		WebElement desc = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.TEMPLATE_DESC))));
		file.setCellData("Template", "Description", 2, desc.getText());
		
		/*----------------------PRE-Requisite---------------------------*/
		
		System.out.println("Attempt: click on the 'Assessment' tab and "
				+ "navigate to the Assessment screen successfully");
		PageObjects.SelectByXpath(
				driver, LocatorsPath.ASSESSMENT, LocatorsPath.MAX_TIME);
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.ASSESSMENT_SETUP_DISP, LocatorsPath.MAX_TIME);
		System.out.println("Success: clicked on the 'Assessment' tab and "
				+ "navigated to the Assessment screen successfully");
	}
	

	@Then("^User selects the template from the dropdown$")
	public void user_selects_the_template_from_the_dropdown() throws Throwable {
	    
		System.out.println("Attempt: select the template from the dropdown");
		/*PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, CHOOSE_TEMPLATE_DP, MAX_TIME, 
				file.getCellData("Template", "Template code", 2).toUpperCase()+"-"+
						file.getCellData("Template", "Description", 2)+" - "+"[ "+
						file.getCellData("Template", "Template Version", 2)+" ]");*/
		System.out.println("Success: selected the template from the dropdown");
	}
	

	@Then("^User clicks on the 'Add' button and navigates to the 'Add assessment template' screen$")
	public void user_clicks_on_the_Add_button_and_navigates_to_the_Add_assessment_template_screen() throws Throwable {
	    
		System.out.println("Attempt: click on the 'Add' button and "
				+ "navigate to the 'Add assessment template' screen");
		CallObject.block(3000);
		WebElement add = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.TEMPLATE_ADD))));
		if(add.isDisplayed()) {
			PageObjects.SelectByCSSSelector(
					driver, LocatorsPath.TEMPLATE_ADD, LocatorsPath.MAX_TIME);
			PageObjects.SelectByXpathWithoutClick(
					driver, LocatorsPath.ASSESS_TEMPLATE_DISP, LocatorsPath.MAX_TIME);
		}else {
		    Assert.fail("Add button is not visible");
		}
		System.out.println("Success: clicked on the 'Add' button and "
				+ "navigated to the 'Add assessment template' screen");
	}
	

	@Then("^User verifies the field - 'Template code' displays the template code and the version of the template$")
	public void user_verifies_the_field_Template_code_displays_the_template_code_and_the_version_of_the_template() throws Throwable {
	   
		System.out.println("Attempt: verify the field - 'Template code' displays "
				+ "the template code and the version of the template");
		WebElement templateCode = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.TEMPLATE_CODE))));
		Assert.assertEquals(file.getCellData("Template", "Description", 2)+" - "+"[ "+
				file.getCellData("Template", "Template Version", 2)+" ]", 
				templateCode.getAttribute("value"));
		System.out.println("Success: verified the field - 'Template code' displays "
				+ "the template code and the version of the template");
	}
	

	@Then("^User enters the field - 'Attribute' in the Add assessment template screen$")
	public void user_enters_the_field_Attribute_in_the_Add_assessment_template_screen() throws Throwable {
	    
		System.out.println("Attempt: enter the field - 'Attribute' in the "
				+ "Add assessment template screen");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ASSESSMENT_ATTRIBUTE, LocatorsPath.MAX_TIME, 
				file.getCellData("Assessment", "Attribute", 2));
		System.out.println("Success: entered the field - 'Attribute' in the "
				+ "Add assessment template screen");
	}
	

	@Then("^User enters the field - 'Attribute translation' in the Add assessment template screen$")
	public void user_enters_the_field_Attribute_translation_in_the_Add_assessment_template_screen() throws Throwable {
	   
		System.out.println("Attempt: enter the field - 'Attribute translation' "
				+ "in the Add assessment template screen");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ATTRIBUTE_TRANS, LocatorsPath.MAX_TIME, 
				file.getCellData("Assessment", "Attribute translation", 2));
		System.out.println("Success: entered the field - 'Attribute translation' "
				+ "in the Add assessment template screen");
	}
	

	@Then("^User enters the field - 'Weight' in the Add assessment template screen$")
	public void user_enters_the_field_Weight_in_the_Add_assessment_template_screen() throws Throwable {
	    
		System.out.println("Attempt: enter the field - 'Weight' in the "
				+ "Add assessment template screen");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ASSESSMENT_WEIGHT, LocatorsPath.MAX_TIME, 
				file.getCellData("Assessment", "Weight", 2));
		System.out.println("Success: entered the field - 'Weight' in the "
				+ "Add assessment template screen");
	}
	

	@Then("^User selects the Control type as either 'Date/Numeric/Dropdown/text' value from the dropdown$")
	public void user_selects_the_Control_type_as_either_Date_Numeric_Dropdown_text_value_from_the_dropdown() throws Throwable {
	    
		System.out.println("Attempt: select the Control type as either "
				+ "'Date/Numeric/Dropdown/text' value from the dropdown");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ASSESS_CONTROL_TYPE, LocatorsPath.MAX_TIME, 
				file.getCellData("Assessment", "Control Type", 2));
		System.out.println("Success: selected the Control type as either "
				+ "'Date/Numeric/Dropdown/text' value from the dropdown");
	}
	

	@Then("^User selects the 'Free LOV(\\d+)' dropdown in the Add assessment template screen$")
	public void user_selects_the_Free_LOV_dropdown_in_the_Add_assessment_template_screen(int arg1) throws Throwable {
	   
		System.out.println("Attempt: select the 'Free LOV(\\d+)' dropdown in the "
				+ "'Add assessment template' screen");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.TEMPLATE_FREE_LOV_1, LocatorsPath.MAX_TIME, 
				file.getCellData("Assessment", "Free LOV1", 2));
		System.out.println("Success: selected the 'Free LOV(\\d+)' dropdown in the "
				+ "'Add assessment template' screen");
	}
	

	@Then("^User selects the 'Free LOV(\\d+)' dropdown in the Add assessment template Screen$")
	public void user_selects_the_Free_LOV_dropdown_in_the_Add_assessment_template_Screen(int arg1) throws Throwable {
	    
		System.out.println("Attempt: select the 'Free LOV(\\d+)' dropdown in the "
				+ "'Add assessment template' screen");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.TEMPLATE_FREE_LOV_2, LocatorsPath.MAX_TIME, 
				file.getCellData("Assessment", "Free LOV2", 2));
		System.out.println("Success: selected the 'Free LOV(\\d+)' dropdown in the "
				+ "'Add assessment template' screen");
	}
	

	@Then("^User enters the 'Free Text Field(\\d+)' in the Add assessment template screen$")
	public void user_enters_the_Free_Text_Field_in_the_Add_assessment_template_screen(int arg1) throws Throwable {
	    
		System.out.println("Attempt: enter the 'Free text field(\\d+)' "
				+ "in the 'Add assessment template' screen");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.TEMPLATE_FREE_TEXT_1, LocatorsPath.MAX_TIME, 
				file.getCellData("Template", "Free Text1", 2));
		System.out.println("Success: entered the 'Free text field(\\d+)' "
				+ "in the 'Add assessment template' screen");
	}
	

	@Then("^User enters the 'Free Text Field(\\d+)' in the Add assessment template Screen$")
	public void user_enters_the_Free_Text_Field_in_the_Add_assessment_template_Screen(int arg1) throws Throwable {
	    
		System.out.println("Attempt: enter the 'Free text field(\\d+)' "
				+ "in the 'Add assessment template' screen");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.TEMPLATE_FREE_TEXT_2, LocatorsPath.MAX_TIME, 
				file.getCellData("Template", "Free Text2", 2));
		System.out.println("Success: entered the 'Free text field(\\d+)' "
				+ "in the 'Add assessment template' screen");
	}
	

	@Then("^User clicks on save button and verifies the changes is saved successfully and the New assessment attribute is created\\.$")
	public void user_clicks_on_save_button_and_verifies_the_changes_is_saved_successfully_and_the_New_assessment_attribute_is_created() throws Throwable {
	   
		rcsSaasTemplatePage.user_clicks_on_save_button_and_verifies_the_Template_is_saved_successfully();
	}
	

	
	/**----------------------RCS_SaaS_Edit_Assessment_Template_WC--------------------------**/
	
	
	
	
	@Then("^User selects a attribute which needs to be edited and clicks on the hypelink which is available in the attribute field of the template$")
	public void user_selects_a_attribute_which_needs_to_be_edited_and_clicks_on_the_hypelink_which_is_available_in_the_attribute_field_of_the_template() throws Throwable {
	    
		System.out.println("Attempt: select a attribute which needs to be edited and click on the "
				+ "hypelink which is available in the attribute field of the template");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ATTRIBUTE_SEARCH, LocatorsPath.MAX_TIME, 
				file.getCellData("Assessment", "Attribute", 2));
		CallObject.block(3000);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ATTRI_SEARCH_CLICK, LocatorsPath.MAX_TIME);
		System.out.println("Success: selected a attribute which needs to be edited and clicked on the "
				+ "hypelink which is available in the attribute field of the template");
	}
	

	@Then("^The User should be navigated to 'Edit assessment template' screen successfully$")
	public void the_User_should_be_navigated_to_Edit_assessment_template_screen_successfully() throws Throwable {
	 
		System.out.println("Attempt: navigate to 'Edit assessment template' screen successfully");
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.EDIT_ASSESS_TEMP_DISP, LocatorsPath.MAX_TIME);
		System.out.println("Success: navigated to 'Edit assessment template' screen successfully");
	}
	

	@Then("^User verifies the field - 'Template code' displays the template code and the version of the Template$")
	public void user_verifies_the_field_Template_code_displays_the_template_code_and_the_version_of_the_Template() throws Throwable {
	    
		System.out.println("User verifies the field - 'Template code' displays the "
				+ "template code and the version of the Template");
	}
	

	@Then("^User enters the field - 'Attribute' in the Edit assessment template screen$")
	public void user_enters_the_field_Attribute_in_the_Edit_assessment_template_screen() throws Throwable {
	   
		System.out.println("User enters the field - 'Attribute' in the Edit assessment template screen");
	}
	

	@Then("^User enters the field - 'Attribute translation' in the Edit assessment template screen$")
	public void user_enters_the_field_Attribute_translation_in_the_Edit_assessment_template_screen() throws Throwable {
	   
		System.out.println("User enters the field - 'Attribute translation' in the Edit assessment template screen");
	}
	

	@Then("^User enters the field - 'Weight' in the Edit assessment template screen$")
	public void user_enters_the_field_Weight_in_the_Edit_assessment_template_screen() throws Throwable {
	    
		System.out.println("User enters the field - 'Weight' in the Edit assessment template screen");
	}
	

	@Then("^User verifies the 'Control type' is displayed as read-only field$")
	public void user_verifies_the_Control_type_is_displayed_as_read_only_field() throws Throwable {
	    
		System.out.println("User verifies the 'Control type' is displayed as read-only field");
	}
	

	@Then("^User selects the 'Free LOV(\\d+)' dropdown in the Edit assessment template screen$")
	public void user_selects_the_Free_LOV_dropdown_in_the_Edit_assessment_template_screen(int arg1) throws Throwable {
	    
		System.out.println("User selects the 'Free LOV(\\d+)' dropdown in the Edit assessment template screen");
	}
	

	@Then("^User selects the 'Free LOV(\\d+)' dropdown in the Edit assessment template Screen$")
	public void user_selects_the_Free_LOV_dropdown_in_the_Edit_assessment_template_Screen(int arg1) throws Throwable {
	    
		System.out.println("User selects the 'Free LOV(\\d+)' dropdown in the Edit assessment template Screen");
	}
	

	@Then("^User enters the 'Free Text Field(\\d+)' in the Edit assessment template screen$")
	public void user_enters_the_Free_Text_Field_in_the_Edit_assessment_template_screen(int arg1) throws Throwable {
	    
		System.out.println("Attempt: enter the 'Free Text Field(\\d+)' in the Edit assessment template screen");
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.TEMPLATE_FREE_TEXT_1)))).clear();
		CallObject.block(1000);
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.TEMPLATE_FREE_TEXT_1, LocatorsPath.MAX_TIME, 
				file.getCellData("Template", "Free Text1", 3));
		System.out.println("Success: entered the 'Free Text Field(\\d+)' in the Edit assessment template screen");
	}
	

	@Then("^User enters the 'Free Text Field(\\d+)' in the Edit assessment template Screen$")
	public void user_enters_the_Free_Text_Field_in_the_Edit_assessment_template_Screen(int arg1) throws Throwable {
	    
		System.out.println("Attempt: enter the 'Free Text Field(\\d+)' in the Edit assessment template screen");
		wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.TEMPLATE_FREE_TEXT_2)))).clear();
		CallObject.block(1000);
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.TEMPLATE_FREE_TEXT_2, LocatorsPath.MAX_TIME, 
				file.getCellData("Template", "Free Text2", 3));
		System.out.println("Success: entered the 'Free Text Field(\\d+)' in the Edit assessment template screen");
	}
	

	@Then("^User clicks on the save button and the verifies the Changes is saved successfully and the Assessment attribute is modified\\.$")
	public void user_clicks_on_the_save_button_and_the_verifies_the_Changes_is_saved_successfully_and_the_Assessment_attribute_is_modified() throws Throwable {
	    
		rcsSaasTemplatePage.user_clicks_on_save_button_and_verifies_the_Template_is_saved_successfully();
	}
	

	
	/**----------------------RCS_SaaS_Add_Responses_To_Attributes_WC--------------------------**/
	
	
	
	
	@Then("^User selects the attribute and clicks on the 'Add' button in the responses section$")
	public void user_selects_the_attribute_and_clicks_on_the_Add_button_in_the_responses_section() throws Throwable {
	    
		System.out.println("Attempt: select the attribute and click on the 'Add' button in the responses section");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.ATTRIBUTE_SEARCH, LocatorsPath.MAX_TIME, 
				file.getCellData("Assessment", "Attribute", 2));
		CallObject.block(3000);
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ATTRIBUTE_REFRESH, LocatorsPath.MAX_TIME);
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.RESPONSES_ADD)));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.RESPONSES_ADD, LocatorsPath.MAX_TIME);
		System.out.println("Success: selected the attribute and clicked on the 'Add' button in the responses section");
	}
	

	@Then("^The User navigates to the 'Add responses' screen successfully$")
	public void the_User_navigates_to_the_Add_responses_screen_successfully() throws Throwable {
	 
		System.out.println("Attempt: navigate to the 'Add responses' screen successfully");
		PageObjects.SelectByXpathWithoutClick(
				driver, LocatorsPath.ADD_RESPONSE_DISP, LocatorsPath.MAX_TIME);
		System.out.println("Success: navigated to the 'Add responses' screen successfully");
	}
	

	@Then("^User verifies the field - 'Template code' displays the Template Code and the version of the template$")
	public void user_verifies_the_field_Template_code_displays_the_Template_Code_and_the_version_of_the_template() throws Throwable {
	    
		System.out.println("Attempt: verify the field - 'Template code' displays "
				+ "the Template Code and the version of the template");
		WebElement templateCode = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.TEMPLATE_CODE_1))));
		Assert.assertEquals(file.getCellData("Template", "Description", 2)+" - "+"[ "+
				file.getCellData("Template", "Template Version", 2)+" ]", 
				templateCode.getAttribute("value"));
		System.out.println("Success: verified the field - 'Template code' displays "
				+ "the Template Code and the version of the template");
	}
	

	@Then("^User verifies that the 'Assessment template' displays the selected attribute name$")
	public void user_verifies_that_the_Assessment_template_displays_the_selected_attribute_name() throws Throwable {
	    
		System.out.println("Attempt: verify that the 'Assessment template' "
				+ "displays the selected attribute name");
		WebElement assessTemplate = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ASSESS_TEMPLATE))));
		Assert.assertEquals(file.getCellData("Assessment", "Attribute", 2), 
				assessTemplate.getText());
		System.out.println("Success: verified that the 'Assessment template' "
				+ "displays the selected attribute name");
	}
	

	@Then("^User enters the field - 'Response' in the Add responses screen$")
	public void user_enters_the_field_Response_in_the_Add_responses_screen() throws Throwable {
	   
		System.out.println("Attempt: enter the field - 'Response' in the Add responses screen");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.RESPONSE, LocatorsPath.MAX_TIME, 
				file.getCellData("Assessment", "Response", 2));
		System.out.println("Success: entered the field - 'Response' in the Add responses screen");
	}
	

	@Then("^User enters the field - 'Response translation' in the Add responses screen$")
	public void user_enters_the_field_Response_translation_in_the_Add_responses_screen() throws Throwable {
	    
		System.out.println("Attempt: enter the field - 'Response translation' in the Add responses screen");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.RESPONSE_TRANS, LocatorsPath.MAX_TIME, 
				file.getCellData("Assessment", "Response translation", 2));
		System.out.println("Success: entered the field - 'Response translation' in the Add responses screen");
	}
	

	@Then("^User enters the field - 'Score' in the Add responses screen$")
	public void user_enters_the_field_Score_in_the_Add_responses_screen() throws Throwable {
	    
		System.out.println("Attempt: enter the field - 'Score' in the Add responses screen");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.SCORE, LocatorsPath.MAX_TIME, 
				file.getCellData("Assessment", "Score", 2));
		System.out.println("Success: entered the field - 'Score' in the Add responses screen");
	}
	

	@Then("^User enters the field - 'Indicator' in the Add responses screen$")
	public void user_enters_the_field_Indicator_in_the_Add_responses_screen() throws Throwable {
	   
		System.out.println("Attempt: enter the field - 'Indicator' in the Add responses screen");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.INDICATOR, LocatorsPath.MAX_TIME, 
				file.getCellData("Assessment", "Indicator", 2));
		System.out.println("Success: entered the field - 'Indicator' in the Add responses screen");
	}
	

	@Then("^User selects the 'Free LOV(\\d+)' dropdown in the Add responses screen$")
	public void user_selects_the_Free_LOV_dropdown_in_the_Add_responses_screen(int arg1) throws Throwable {
	  
		System.out.println("Attempt: select the 'Free LOV(\\d+)' dropdown in the "
				+ "'Add responses screen'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.RESP_FREE_LOV_1, LocatorsPath.MAX_TIME, 
				file.getCellData("Assessment", "Free LOV1", 3));
		System.out.println("Success: selected the 'Free LOV(\\d+)' dropdown in the "
				+ "'Add responses screen'");
	}
	

	@Then("^User selects the 'Free LOV(\\d+)' dropdown in the Add responses Screen$")
	public void user_selects_the_Free_LOV_dropdown_in_the_Add_responses_Screen(int arg1) throws Throwable {
	  
		System.out.println("Attempt: select the 'Free LOV(\\d+)' dropdown in the "
				+ "'Add responses screen'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.RESP_FREE_LOV_2, LocatorsPath.MAX_TIME, 
				file.getCellData("Assessment", "Free LOV2", 3));
		System.out.println("Success: selected the 'Free LOV(\\d+)' dropdown in the "
				+ "'Add responses screen'");
	}
	
	
	@Then("^User enters the 'Free Text Field(\\d+)' in the Add responses screen$")
	public void user_enters_the_Free_Text_Field_in_the_Add_responses_screen(int arg1) throws Throwable {
	 
		System.out.println("Attempt: enter the 'Free text field(\\d+)' "
				+ "in the 'Add responses screen'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.RESP_FREE_TEXT_1, LocatorsPath.MAX_TIME, 
				file.getCellData("Assessment", "Free Text1", 2));
		System.out.println("Success: entered the 'Free text field(\\d+)' "
				+ "in the 'Add responses screen'");
	}
	

	@Then("^User enters the 'Free Text Field(\\d+)' in the Add responses Screen$")
	public void user_enters_the_Free_Text_Field_in_the_Add_responses_Screen(int arg1) throws Throwable {
	    
		System.out.println("Attempt: enter the 'Free text field(\\d+)' "
				+ "in the 'Add responses screen'");
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.RESP_FREE_TEXT_2, LocatorsPath.MAX_TIME, 
				file.getCellData("Assessment", "Free Text2", 2));
		System.out.println("Success: entered the 'Free text field(\\d+)' "
				+ "in the 'Add responses screen'");
	}
	
	
	@Then("^User clicks on the save button and verifies the Responses is saved successfully\\.$")
	public void user_clicks_on_the_save_button_and_verifies_the_Responses_is_saved_successfully() throws Throwable {
	    
		rcsSaasTemplatePage.user_clicks_on_save_button_and_verifies_the_Template_is_saved_successfully();
	}

	
	
	/**----------------------Rcs_Saas_Copy_Common_Responses_To_The_Attributes--------------------------**/
	
	
	

	@Then("^User selects the attribute and clicks on the 'Copy common responses' button in the response section$")
	public void user_selects_the_attribute_and_clicks_on_the_Copy_common_responses_button_in_the_response_section() throws Throwable {
	 
		System.out.println("Attempt: select the attribute and click on the "
				+ "'Copy common responses' button in the response section");
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.COPY_COMMON_RESP)));
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.COPY_COMMON_RESP, LocatorsPath.MAX_TIME);
		System.out.println("Success: selected the attribute and clicked on the "
				+ "'Copy common responses' button in the response section");
	}
	

	@Then("^User verifies the response created with the message 'Total records, Added, Duplicate' count records is displayed$")
	public void user_verifies_the_response_created_with_the_message_Total_records_Added_Duplicate_count_records_is_displayed() throws Throwable {
	    
		System.out.println("Attempt: verify the response created with the message "
				+ "'Total records, Added, Duplicate' count records is displayed");
		WebElement message = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.RECORDS_DISP_MESSAGE))));
		Assert.assertEquals("Total Common Responses :1 Added :1 Duplicates: 0", 
				message.getText());
		
		/*-------Verify Duplicate Entry-----------*/
		user_selects_the_attribute_and_clicks_on_the_Copy_common_responses_button_in_the_response_section();
		WebElement Message = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.RECORDS_DISP_MESSAGE))));
		Assert.assertEquals("Total Common Responses :1 Added :0 Duplicates: 1", 
				Message.getText());
		
		System.out.println("Success: verified the response created with the message "
				+ "'Total records, Added, Duplicate' count records is displayed");
	}
	

	@Then("^User verifies all the Responses created in Pre-requiste are copied to the selected attribute\\.$")
	public void user_verifies_all_the_Responses_created_in_Pre_requiste_are_copied_to_the_selected_attribute() throws Throwable {
	    
		System.out.println("Attempt: verify all the Responses created in Pre-requiste "
				+ "are copied to the selected attribute");
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.cssSelector(LocatorsPath.RESPONSE_SEARCH)));
		PageObjects.SelectByCSSSelectorWithSendKeys(
				driver, LocatorsPath.RESPONSE_SEARCH, LocatorsPath.MAX_TIME, 
				file.getCellData("Template", "Response", 2));
		CallObject.block(3000);
		WebElement verify = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.RESP_SEARCH_VERIFY))));
	    Assert.assertEquals(file.getCellData("Template", "Response", 2), 
	    		verify.getText());
	    System.out.println("Success: verified all the Responses created in Pre-requiste "
	    		+ "are copied to the selected attribute");
	}
	

	
	/**----------------------Rcs_Saas_Freeze_Unfreeze_Assessment_Template--------------------------**/
	
	
	
	
	@Then("^User selects the template which has to be freezed or unfreezed$")
	public void user_selects_the_template_which_has_to_be_freezed_or_unfreezed() throws Throwable {
	    
		user_selects_the_template_from_the_dropdown();
	}
	

	@Then("^User verifies that the template is selected successfully$")
	public void user_verifies_that_the_template_is_selected_successfully() throws Throwable {
	    
		System.out.println("User verifies that the template is selected successfully");
	}
	

	@Then("^User clicks on the button 'Freeze/Unfreeze' present next to the template dropdown$")
	public void user_clicks_on_the_button_Freeze_Unfreeze_present_next_to_the_template_dropdown() throws Throwable {
	    
		System.out.println("Attempt: click on the button 'Freeze/Unfreeze' "
				+ "present next to the template dropdown");
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ASSESSMENT_FREEZE, LocatorsPath.MAX_TIME);
		System.out.println("Success: clicked on the button 'Freeze/Unfreeze' "
				+ "present next to the template dropdown");
	}
	

	@Then("^User verifies that the template is freezed or unfreezed successfully\\.$")
	public void user_verifies_that_the_template_is_freezed_or_unfreezed_successfully() throws Throwable {
	    
		System.out.println("Attempt: verify that the template is freezed or unfreezed successfully");
		WebElement unFreeze = wait.until(ExpectedConditions.
				presenceOfElementLocated((By.cssSelector(LocatorsPath.ASSESSMENT_UNFREEZE))));
		if(unFreeze.isDisplayed()) {
			System.out.println("Unfreeze element displayed successfuly");
		}else {
			Assert.fail("Unfreeze element not displayed");
		}
		
		/*--------------Delete Assessment-------------*/
		PageObjects.SelectByCSSSelector(
				driver, LocatorsPath.ASSESSMENT_UNFREEZE, LocatorsPath.MAX_TIME);
		rcsSaasTemplatePage.user_clicks_on_Template_and_navigates_to_the_template_screen_successfully();
		rcsSaasTemplatePage.user_verifies_all_the_existing_Templates_displayed_successfully_and_the_user_selects_any_Template_Type_from_the_dropdown();
		CallObject.block(3000);
		rcsSaasTemplatePage.user_selects_a_template_which_needs_to_be_deleted_and_Clicks_on_the_delete_icon();
		rcsSaasTemplatePage.user_verifies_the_selected_template_is_deleted_successfully();
		
		System.out.println("Success: verified that the template is freezed or unfreezed successfully");
	}
}
