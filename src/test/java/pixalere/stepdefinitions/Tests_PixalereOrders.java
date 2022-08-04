package pixalere.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pixalere.scripts.PixalereOrdersScripts;

public class Tests_PixalereOrders extends PixalereOrdersScripts {
	
	@When("I edit {string} field for Orders")
	public void i_edit_field_for_Orders(String field) {
		addOrderInputField(field);
	}

	@Then("{string} field Data should saved and verify in History record")
	public void field_Data_should_saved_and_verify_in_History_record(String string) {
		verifySavedOrderHistoryRecord();
	}
	
	@When("I click on {string} input value Button for Orders")
	public void i_click_on_input_value_Button_for_Orders(String button) {
		clickOnFirstRecordDeleteButton(button);
	}
	
	@Then("{string} field Data should deleted and verify in History record")
	public void field_Data_should_deleted_and_verify_in_History_record(String string) {
		verifyDeletedOrderHistoryRecord();
	}
	
	@When("I edit {string} field as {string} for Orders")
	public void i_edit_field_as_for_Orders(String field, String value) {
		addOrderInputField(field, value);
	}

	@When("I select {string} field as CurrentDate for Orders")
	public void i_select_field_as_CurrentDate_for_Orders(String field) {
		addOrderInputField(field);
	}
}
