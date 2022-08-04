package pixalere.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pixalere.scripts.PixalereWoundAssessmentMobileScripts;

public class Tests_PixalereWoundAssessmentMobile extends PixalereWoundAssessmentMobileScripts {

	@Given("I create a new wound assessment via API call")
	public void i_create_a_new_wound_assessment_via_API_call() throws Throwable {
		createPatientViaAPICall();
	}
	
	@Then("I verify patient last name with API details")
	public void i_verify_patient_last_name_with_API_details() {
		verifyPatientOnConsultsFilter();
	}
	
	@When("I click on {string} Button of selected patient")
	public void i_click_on_Button_of_selected_patient(String string) {
		clickOnConsultButton();
	}
	
	@When("I select {string} option from {string} section")
	public void i_select_option_from_section(String option, String section) {
		selectOptionFromSection(option, section);
	}
	
	@When("I enter Text in {string} textbox")
	public void i_enter_Text_in_textbox(String section) {
		enterTextAsPerSection(section);
	}
	
	@When("I verify {string} value with API value")
	public void i_verify_value_with_API_value(String section) {
		verifyWoundValueWithAPICalls(section);
	}

	@When("I select value for {string} section")
	public void i_select_value_for_section(String section) {
		performNumberOfFistulasSection();
	}
	
	@When("I click on {string} with respect to select {string} values from {string} block")
	public void i_click_on_with_respect_to_select_values_from_block(String woundBedOptionList, String optionValueList, String optionBlock) {
		editWoundBedSection(woundBedOptionList, optionValueList, optionBlock);
	}
	
	@When("I select {string} radio button from {string} section")
	public void i_select_radio_button_from_section(String option, String section) {
		selectRadioOptionFromSection(option);
	}

	@Then("{string} value should selected for {string} section")
	public void value_should_selected_for_section(String optionList, String section) {
		verifySelectedOptionListFromSection(optionList);
	}
	
	@Then("it should add {int} orders in {string} section")
	public void it_should_add_orders_in_section(int expectedCount, String section) {
		verifyWoundCareTreatmentOrderList(expectedCount);
	}
	
	@When("I enter {string} in  {string} field")
	public void i_enter_in_field(String value, String section) {
		enterValueInTimeSpentSection(value);
	}
	
	@Then("I verify Patient Name, Status as {string} and {string} button")
	public void i_verify_Patient_Name_Status_as_and_button(String patientStatus, String button) {
		verifyPatientAfterCallDetails(patientStatus);
	}
	
	@Then("after click on {string} file should download in Local machine")
	public void after_click_on_file_should_download_in_Local_machine(String string) {
		downloadFileAndVerify();
	}
}
