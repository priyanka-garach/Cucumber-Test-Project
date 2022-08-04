package pixalere.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pixalere.scripts.PixalerePalliativeScripts;

public class Tests_PixalerePalliative extends PixalerePalliativeScripts {
	
	
	/*** Palliative Performance Scale ***/
	
	@When("I select different PPS Level And verify selected PPS should displayed in area below")
	public void i_select_different_PPS_Level_And_verify_selected_PPS_should_displayed_in_area_below() {
		selectPPSLevelAndVerifyInTable();
	}

	@Then("I verify selected PPS Level record is deleted")
	public void i_verify_selected_PPS_Level_record_is_deleted() {
		verifyPPSRecordDeleted();
	}
	
	
	/*** Palliative Assessment Tool ***/
	
	@When("I edit numeric number in {string} input field")
	public void i_edit_numeric_number_in_input_field(String ppsStageSection) {
		editPPSStageInput(ppsStageSection);
	}
	
	@When("I select {string} options from {string} Palliative section")
	public void i_select_options_from_Palliative_section(String optionList, String section) {
		selectOptionsFromAssessmentToolSection(optionList, section);
	}

	@When("I edit comment for {string} section")
	public void i_edit_comment_for_section(String commentSection) {
		editAssessmentToolSectionComments(commentSection);
	}
	
	@Then("I verify latest {string} details on Viewer page")
	public void i_verify_latest_details_on_Viewer_page(String string) {
		verifyPalliativeAssessmentDetailsOnViewer();
	}
	
	
	/*** ESAS ***/
	
	@When("I select {string} type for {string} field")
	public void i_select_type_for_field(String option, String section) {
		selectAdministeredByOption(option, section);
	}
	
	@When("I select {string} radio value for {string} ESAS")
	public void i_select_radio_value_for_ESAS(String radioValue, String field) {
		selectRadioValueAsPerESAS(radioValue, field);
	}

	@When("I add input as {string} in Other field")
	public void i_add_input_as_in_Other_field(String otherInput) {
		addOtherInput(otherInput);
	}
}
