package pixalere.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pixalere.scripts.PixalereMedicationManagementScripts;

public class Tests_PixalereMedicationManagement extends PixalereMedicationManagementScripts {
	
	
	/*** eMar ***/

	@Then("{string} section should display")
	public void section_should_display(String section) {
		verifyMedicationManagementSection(section);
	}

	@When("I edit {string} field")
	public void i_edit_field(String field) {
		editMedicationInputField(field);
	}

	@When("I edit {string} field as {string}")
	public void i_edit_field_as(String field, String value) {
		editMedicationInputField(field, value);
	}

	@When("I select {string} field as {string}")
	public void i_select_field_as(String field, String value) {
		editMedicationInputField(field, value);
	}

	@When("I select {string} checkbox")
	public void i_select_checkbox(String field) {
		selectMedicationCheckobx(field);
	}

	@When("I select {string} field as CurrentDate")
	public void i_select_field_as_CurrentDate(String field) {
		editMedicationInputField(field);
	}

	@Then("I verify Saved Record in {string} section")
	public void i_verify_Saved_Record_in_section(String string) {
		verifySavedRecordInCurrentMedicationField();
	}
	
	@When("I click on {string} button for Save record")
	public void i_click_on_button_for_Save_record(String string) {
		clickOnSaveMedicationButton();
	}

	@When("I click on {string} button of latest Medication Record")
	public void i_click_on_button_of_latest_Medication_Record(String value) {
		clickOnLatestMedicationRecordButtonByValue(value);
	}
	
	@Then("End Date should saved for {string} section")
	public void end_Date_should_saved_for_section(String string) {
		verifyLastDoseGivenOnRecord();
	}

	@Then("I verify Medication Name with Date successfully message")
	public void i_verify_Medication_Name_with_Date_successfully_message() {
		verifyGivenMedicationSuccessMessage();
	}
	
	@Then("Current Medication Record set as Hold on Bottom")
	public void current_Medication_Record_set_as_Hold_on_Bottom() {
		verifyMedicationRecordOnHold();
	}

	@When("I click on {string} button of Hold Medication Record")
	public void i_click_on_button_of_Hold_Medication_Record(String value) {
		clickOnLatestMedicationRecordButtonByValue(value);
	}

	@Then("Current Medication Record activated and display on Top")
	public void current_Medication_Record_activated_and_display_on_Top() {
		verifyReactivatedMedicationRecordOnTop();
	}
	
	@Then("Current Medication Record deleted and it display in Delete History")
	public void current_Medication_Record_deleted_and_it_display_in_Delete_History() {
		verifyMedicationRecordDeleted();
	}
	
	
	/*** BPMH ***/
	
	@When("I select {string} radio option from BPMH")
	public void i_select_radio_option_from_BPMH(String string) {
		clickOnAdmissionRadioButton();
	}

	@When("I edit {string} field for BPMH")
	public void i_edit_field_for_BPMH(String field) {
		addMedicationRecordForBPMH(field);
	}

	@When("I edit {string} field as {string} for BPMH")
	public void i_edit_field_as_for_BPMH(String field, String value) {
		addMedicationRecordForBPMH(field, value);
	}

	@When("I select {string} field as {string} for BPMH")
	public void i_select_field_as_for_BPMH(String field, String value) {
		addMedicationRecordForBPMH(field, value);
	}

	@When("I select {string} as {string} checkboxes")
	public void i_select_as_checkboxes(String field, String checkList) {
		selectMultiCheckList(field, checkList);
	}

	@When("I select {string} radio option from {string} field for BPMH")
	public void i_select_radio_option_from_field_for_BPMH(String radioVal, String field) {
		selectRadioOption(field, radioVal);
	}

	@When("I check {string} for BPMH")
	public void i_check_for_BPMH(String option) {
		clickOnInputCheckOption(option);
	}

	@Then("Data should saved and display in Medication History Table")
	public void data_should_saved_and_display_in_Medication_History_Table() {
		verifySavedDataOnBPMHTable();
	}

	@When("I click on {string} for update Record")
	public void i_click_on_for_update_Record(String string) {
		clickOnEditLatestRecord();
	}

	@When("I check {string} Actions checkbox And select CurrentDate")
	public void i_check_Actions_checkbox_And_select_CurrentDate(String actionName) {
		selectActionAndDate(actionName);
	}
	

	@When("I select {string} radio option for {string} value")
	public void i_select_radio_option_for_value(String string, String labelOption) {
		selectRadioLabelOption(labelOption);
	}

	@Then("I verify {string} Date on BPMH page")
	public void i_verify_Date_on_BPMH_page(String string) {
		verifyLastUpdatedDateWithUserOnBPMH();
	}
	
	
	/*** Infusions ***/
	
	@When("I edit {string} input text")
	public void i_edit_input_text(String field) {
		addMedicationRecordForInfusions(field);
	}

	@When("I select {string} radio button in {string}")
	public void i_select_radio_button_in(String value, String field) {
		addMedicationRecordForInfusions(field, value);
	}
	
	@When("I select {string} radio text button in {string}")
	public void i_select_radio_text_button_in(String value, String field) {
		selectRadioTextButton(field, value);
	}

	@Then("{string} dropdown set for {string} field in Daily Entry")
	public void dropdown_option_set_for_field_in_Daily_Entry(String string, String string2) {
		verifySolutionNameDropdown();
	}

	@When("I edit {string} input text in Daily Entry")
	public void i_edit_input_text_in_Daily_Entry(String field) {
		addMedicationRecordForInfusions(field);
	}

	@When("I select {string} checkbox from {string} section in Daily Entry")
	public void i_select_checkbox_from_section_in_Daily_Entry(String value, String field) {
		selectRadioTextButton(field, value);
	}

	@Then("{string} {string} message should display")
	public void message_should_display(String alertMsg, String field) {
		verifyAlertMessage(alertMsg, field);
	}

	@When("I edit {string} input text as {string}")
	public void i_edit_input_text_as(String field, String value) {
		addMedicationRecordForInfusions(field, value);
	}

	@Then("{string} and {string} dropdown should visible")
	public void and_dropdown_should_visible(String string, String string2) {
		verifyDropdownVisibility();
	}

	@When("I select {string} value from {string} dropdown")
	public void i_select_value_from_dropdown(String value, String field) {
		addMedicationRecordForInfusions(field, value);
	}

	@Then("{string} field should visible")
	public void field_should_visible(String field) {
		verifyInputFieldVisibility();
	}

	@Then("Data should Saved in Table and verify it {string}")
	public void data_should_Saved_in_Table_and_verify_it(String isTrue) {
		verifyInfusionsDataEntryDetailsOnViewer(isTrue);
	}

	@When("I click on {string} button to delete record")
	public void i_click_on_button_to_delete_record(String string) {
		deleteLatestRecordFromInfusionsTable();
	}

	@Then("Saved record should deleted in Table and verify it {string}")
	public void saved_record_should_deleted_in_Table_and_verify_it(String isTrue) {
		verifyInfusionsDataEntryDetailsOnViewer(isTrue);
	}
}
