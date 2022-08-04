package pixalere.stepdefinitions;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pixalere.scripts.PixalereAcuteRespiratoryIllnessScripts;

public class Tests_PixalereAcuteRespiratoryIllness extends PixalereAcuteRespiratoryIllnessScripts {

	@When("I checked {string} checkbox")
	public void i_checked_checkbox(String string) {
		checkUncheckNoSymptomsNoted();
	}

	@Then("All fields of {string} page should {string}")
	public void all_fields_of_page_should(String string, String visibility) {
		verifyFieldsVisibility(visibility);
	}

	@When("I unchecked {string} checkbox")
	public void i_unchecked_checkbox(String string) {
		checkUncheckNoSymptomsNoted();
	}
	
	@When("I select {string} radio option for {string} field")
	public void i_select_radio_option_for_field(String option, String section) {
		selectRadioOptionFromSection(section);
	}

	@When("I click {string} radio option for {string} field")
	public void i_select_radio_option_for_field_p(String option, String section) {
		selectRadioOptionFromSection_p(section);
	}
	
	@When("I click {string} radio option for Temperatrture field")
	public void radio_option_for_Temperatrture_field(String string) {
		selectRadioOptionforTemperature(string);
	}
	
	@When("I click {string} radio option for Blood Pressure Position field")
	public void i_select_radio_option_for_field_bp(String section) {
		selectRadioOptionFromSection_bp(section);
	}
	
	@When("I click {string} radio option for TYPE field")
	public void i_select_radio_option_for_field_type(String section) {
		selectRadioOptionFromSection_bp(section);
	}
	
	
	@When("I click {string} radio option for Pulse Type field")
	public void i_select_radio_option_for_field_pt(String section) {
		selectRadioOptionFromSection_pt(section);
		System.out.println();
	}
	
	@When("I click {string} radio option for Battery Checked field")
	public void i_select_radio_option_for_field_bcf(String section) {
		selectRadioOptionFromSection_pt(section);
	}
	@When("I click {string} radio option for Route field")
	public void i_select_radio_option_for_field_RoutePCA(String section) {
		selectRadioOptionFromSection_routePCA(section);
		System.out.println();
	}
	
	
	
	@When("I click {string} radio option for Cassette Change field")
	public void i_select_radio_option_for_field_ccf(String section) {
		selectRadioOptionFromSection_ccf(section);
	}
	
	@When("I click {string} radio option for Tubing Change field")
	public void i_select_radio_option_for_field_tcf(String section) {
		selectRadioOptionFromSection_tcf(section);
	}
	
	@When("I click {string} radio option for Site Change field")
	public void i_select_radio_option_for_field_scf(String section) {
		selectRadioOptionFromSection_scf(section);
	}
	
	
	@When("I click {string} radio option for sat_percentage_type field")
	public void i_select_radio_option_for_field_ptf(String section) {
		selectRadioOptionFromSection_ptf(section);
	}
	
	@When("I click {string} radio option for Bolus reset field")
	public void i_select_radio_option_for_field_brf(String section) {
		selectRadioOptionFromSection_brf(section);
	}

	@Then("I click on GivenButton")
	public void i_click_on_Given_button(){
		clickElement(By.xpath("//input[@id='saveEntries']"));
		System.out.println();
	}
	
	
	@When("I click {string} radio option for progress note field")
	public void i_select_radio_option_for_field_pnf(String section) {
		selectRadioOptionFromSection_pnf(section);
	}
	
	@When("I click {string} radio option for Reported By field")
	public void i_select_radio_option_for_field_pnff(String section) {
		selectRadioOptionFromSection_pnf(section);
	}
	
	@When("I click {string} radio option for Pain Present field")
	public void i_select_radio_option_for_field_pnfff(String section) {
		selectRadioOptionFromSection_pnf(section);
	}
	
	@When("I click {string} radio option for Alert Status field")
	public void i_select_radio_option_for_field_pnffff(String section) {
		selectRadioOptionFromSection_pnf(section);
		System.out.println();
	}
			
	@When("I set {string} degree celsius as Temperature")
	public void i_set_degree_celsius_as_Temperature(String tempInCelsius) {
		enterTemperatureField(tempInCelsius);
	}
	
	@Then("I verify {string} value as {string}")
	public void i_verify_value_as(String section, String value) {
		verifySavedValue(section, value);
	}
	
	@When("I delete saved record")
	public void i_delete_saved_record() {
		clickOnDeleteSavedRecordButton();
	}
	
	@When("I edit reason in {string} text field")
	public void i_edit_reason_in_text_field(String string) {
		editDeleteRecordReason();
	}
	
	@Then("I verify {string} value as {string} deleted")
	public void i_verify_value_as_deleted(String section, String value) {
		verifySavedRecordDeleted(section, value);
	}
}