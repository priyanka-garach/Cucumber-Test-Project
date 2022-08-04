package pixalere.stepdefinitions;

import io.cucumber.java.en.When;
import pixalere.scripts.PixalereTeachingAgreementScript;

public class Tests_PixalereTeachingAgreementPT extends PixalereTeachingAgreementScript{

	@When("I click on {string} checkbox")
	public void i_click_on_checkbox(String string) {
		selectActivityCheckbox(string);
	}

	@When("I select {string} checkbox for Activity to be Instructed")
	public void i_select_checkbox_for_Activity_to_be_Instructed(String string) {
		selectActivityCheckbox(string);
	}

	@When("I select {string} checkbox under Transfer Feild")
	public void i_select_checkbox_under_Transfer_Feild(String string) {
		selectActivityCheckbox(string);
	}

	@When("I select {string} radio button for  Activities Assigned")
	public void i_select_radio_button_for_Activities_Assigned(String string) {
		selectRadioOptionFromSection_Activities_Assigned(string);
	}

	@When("I select {string} radio button for  modification plan")
	public void i_select_radio_button_for_modification_plan(String string) {
		selectRadioOptionFromSection_modification_plan(string);
	}

	@When("I select {string} radio button for service provider")
	public void i_select_radio_button_for_service_provider(String string) {
		selectRadioOptionFromSection_service_provider(string);
	}

	@When("I select {string} checkbox for Client Consent Obtained")
	public void i_select_checkbox_for_Client_Consent_Obtained(String string) {
		selectActivityCheckbox(string);
	}

	@When("I select {string} radio button for Education received")
	public void i_select_radio_button_for_Education_received(String string) {
		selectRadioOptionFromSection_Education_received(string);
	}
	@When("I select {string} radio button for alternatives and benefits")
	public void i_select_radio_button_for_alternatives_and_benefits(String string) {
		selectRadioOptionFromSection_alternatives_and_benefits(string);
	}

	@When("I select {string} radio button for PSW providing")
	public void i_select_radio_button_for_PSW_providing(String string) {
		selectRadioOptionFromSection_PSW_providing(string);
	}

	@When("I select {string} from learner dropdown")
	public void i_select_from_learner_dropdown(String string) {
		selectPSWfromLearner(string);
	}

	@When("I select {string} from employed dropdown")
	public void i_select_from_employed_dropdown(String string) {
		selectVHAfromemployee(string);
	}

	@When("I select {string} radio button for demonstrated understanding")
	public void i_select_radio_button_for_demonstrated_understanding(String string) {
		selectRadioOptionFromSection_demonstrated_understanding(string);
	}

	@When("I select {string} radio button for Service Supervisor")
	public void i_select_radio_button_for_Service_Supervisor(String string) {
		selectRadioOptionFromSection_Service_Supervisor(string);
	}

	@When("I click on save button")
	public void i_click_on_save_button() {
		clickonsave();
	}

}
