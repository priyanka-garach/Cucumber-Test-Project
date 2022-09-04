package pixalere.stepdefinitions;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pixalere.pageObjectUtils.LocatorUtils.CustomizedLocators;
import pixalere.scripts.PixalereCreateNewPatientAccountScripts;

public class Tests_PixalereCreateNewPatientAccount extends PixalereCreateNewPatientAccountScripts {
	
	@Given("I create New Patient")
	public void i_create_New_Patient() {
		createNewPatient();
	}

	@Given("I accept Patient Consent")
	public void i_accept_Patient_Consent() {
		acceptPatientConsent();
	}
	
	@When("I click on Search Button")
	public void i_click_on_Search_Button() {
		clickOnSearchButton();
	}
	
	@When("I enter {string} input field")
	public void i_enter_input_field(String inputField) {
		enterInputFieldAsPerKey(inputField);
		System.out.println();
	}
		
	@When("xyz")
	public void i_enter_xyz(String inputField) {
		Wait_p(2);
		verify();
	}
	
	@When("I click on Save My Work Vital Signs Button")
	public void i_save_vital_form() {
		Wait_p(2);
		clickElement(CustomizedLocators.VitalSignsSaveButton());
		clickElement(CustomizedLocators.VitalSignsSave_ConfirmButton());
		System.out.println();
	}
	

	@When("I select {string} from {string} dropdown")
	public void i_select_from_dropdown(String value, String dropdown) {
		selectDropdownValue(dropdown, value);
	}
	
	@When("I select {string} from {string} drop down")
	public void i_select_from_dropdown_p(String value, String dropdown) {
		selectDropdownValue_p(dropdown, value);
	}
	
	
	@When("I globally select {string} from Search Category dropdown")
	public void i_select_from_dropdown_search_cat(String value) {
		selectDropdownValue_search_cat(value);
	}
	
	@When("I select client name {string} from Dashboard")
	public void i_select_fromm_client_name_fromDashboard(String value) {
		selectValue_from_Dasboard(value);
	}
	
	@When("I select {string} from Service Referral")
	public void i_select_from_OT_from_Service_Referral(String value) {
		selectOTFromSerivceReferral(value);
	}
	
	@When("I select {string} from Service Referral Acosta Sandra")
	public void i_select_from_OT_from_Service_Referral_Acosta_Sandra(String value) {
		selectOTFromSerivceReferral(value);
	}
	
	@When("I select {string} from Service Referral PT")
	public void i_select_from_OT_from_Service_Referral_pt(String value) {
		selectPTFromSerivceReferral(value);
	}

	@When("I select PT from Service Referral PTAssessment")
	public void I_select_PT_from_Service_Referral_PTAssessment() {
		select_ByIndex(By.id("encounter"), 4);
	}
	
	@When("I select PT from Service Referral PT for read from excel")
	public void I_select_PT_from_Service_Referral_PTAssessment_special() {
		selectBycontainsText(By.xpath("//*[@id='encounter']//option"), "PT");
		//select_ByIndex(By.id("encounter"), 2);
	}
	@When("I select PT from Service Referral")
	public void I_select_PT_from_Service_Referral() {
		select_ByIndex(By.id("encounter"), 0);
	}
	
	@When("I select current date with {string} year in {string} dropdown")
	public void i_select_current_date_with_year_in_dropdown(String year, String string2) {
		selectDateOfBirth(year);
	}

	@When("I click on CreatePatientAccount Button")
	public void i_click_on_CreatePatientAccount_Button() {
		clickOnCreatePatientAccountButton();
	}

	@Then("Patient should get create with displaying {string} details")
	public void patient_should_get_create_with_displaying_details(String patientDetails) {
		verifyCreatedPatientAccountsDetails(patientDetails);
	}

	@Then("I verify {string} message should display")
	public void i_verify_displayed(String message) {
		verifyPatientConsentMessage(message);
	}

	@Then("Another window should open for consent")
	public void another_window_should_open_for_consent() {
		verifyOpenedConsentWindow();
	}

	@When("I Select {string} and click on {string} Button")
	public void i_Select_and_click_on_Button(String radioValue, String saveButton) {
		selectConsentOptionAndSave(radioValue, saveButton);
	}

	@Then("Consent window should close And the consent text should {string}")
	public void consent_window_should_close_And_the_consent_text_should(String messageValidation) {
		verifyConsentMessageOnWindowClose(messageValidation);
	}

	@When("I enter {string} in Patient Profile input field")
	public void i_enter_in_Patient_Profile_input_field(String inputField) {
		editPatientProfileAsPerKey(inputField);
	}

	@When("I verify {string} input field with Patient Account")
	public void i_verify_input_field_with_Patient_Account(String string) {
		verifyAllergiesValueOnResidentProfilePage();
	}
	
	@When("I select {string} in Factors that Affect Wound Healing section")
	public void i_select_in_Factors_that_Affect_Wound_Healing_section(String affectWoundHealingString) {
		selectAffectWoundHealingFactors(affectWoundHealingString);
	}

	@When("I get {string} from popup")
	public void i_get_from_popup(String string) {
		getVisitDateTimeOnConfirmPopup();
	}
	
	@Then("Data should saved And {string} message should display")
	public void data_should_saved_And_message_should_display(String successMsg) {
		verifyResidentProfileDataSaved(successMsg);
	}
	
	@Then("I verify {string} Date")
	public void i_verify_Date(String string) {
		verifyLastUpdateTime();
	}
	
	@When("I select {string} radio Button in {string} section")
	public void i_select_radio_Button_in_section(String bradenScoreValue, String string2) {
		selectBradenScoreViseRadioValue(bradenScoreValue);
	}
	
	

	@Then("It should show {string} braden score in {string} textarea")
	public void it_should_show_braden_score_in_textarea(String expectedScore, String string2) {
		verifyTotalBradenScore(expectedScore);
	}

	@When("I enter {string} textarea field")
	public void i_enter_textarea_field(String string) {
		editAdditionalCommentsTextarea();
	}
	
	@When("I click on {string} Button from Diagnostic Tests field")
	public void i_click_on_Button_from_Diagnostic_Tests_field(String string) {
		clickOnDiagnosticTests();
	}

	@When("I select {string} radio option from {string} popup")
	public void i_select_radio_option_from_popup(String radioValue, String string2) {
		selectRadioOptionFromDiagnosticTestsPopup(radioValue);
	}

	@When("I select current date from calendar")
	public void i_select_current_date_from_calendar() {
		selectCurrentDateFromCalendar();
	}

	@Then("Selected value should be added in {string} section")
	public void selected_value_should_be_added_in_section(String string) {
		verifySelectedDiagnosticTestsValue();
	}

	@When("I click on {string} Button from {string} field")
	public void i_click_on_Button_from_field(String fieldOption, String string2) {
		clickOnAlbuminAndPrealbuminTestsOptions(fieldOption);
	}

	@When("I enter Numeric value in {string} popup")
	public void i_enter_Numeric_value_in_popup(String popup) {
		enterNumericValueOnPopup(popup);
	}

	@Then("Selected Numeric value should be shown for {string}")
	public void selected_Numeric_value_should_be_shown_for(String fieldOption) {
		verifyNumericValueAsPerFieldOption(fieldOption);
	}

	@When("I Select Current Date in {string} Date section field")
	public void i_Select_Current_Date_in_Date_section_field(String fieldOption) {
		selectCurrentDateAsPerFieldOption(fieldOption);
	}
	
	@When("I select {string} field as Current Date")
	public void i_select_field_as_Current_Date(String string) {
		selectDateOfSurgery();
	}

	@Then("Selected Date should be shown for {string}")
	public void selected_Date_should_be_shown_for(String fieldOption) {
		verifySelectedDateAsPerFieldOption(fieldOption);
	}
}
