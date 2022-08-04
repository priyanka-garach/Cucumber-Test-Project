package pixalere.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pixalere.scripts.PixalereTeachingGuidelinesScripts;

public class Tests_PixalereTeachingGuidelines extends PixalereTeachingGuidelinesScripts {
	
	@When("I select all {string} and {string} buttons")
	public void i_select_all_and_buttons(String string, String string2) {
		selectAllInitiatedAndCompleted();
	}
	
	@When("I edit {string} input list")
	public void i_edit_input_list(String string) {
		editMedicationInputList();
	}
	
	@When("I click on {string} Button on Teaching section")
	public void i_click_on_Button_on_Teaching_section(String buttonText) {
		clickOnAddOtherTeachingButton(buttonText);
	}

	@When("I edit {string} text field on popup")
	public void i_edit_text_field_on_popup(String string) {
		editOtherEducationInput();
	}

	@Then("Text field should added in {string} column field")
	public void text_field_should_added_in_column_field(String string) {
		verifyAddedOtherEducationField();
	}
	
	@Then("{string} and {string} ButtonList should not displayed And {string} ButtonList should display")
	public void and_ButtonList_should_not_displayed_And_ButtonList_should_display(String string, String string2, String string3) {
		verifyUndoChartDoneListVisible();
	}

	@When("I select all {string} buttons")
	public void i_select_all_buttons(String string) {
		selectAllUndoChartDone();
	}

	@Then("{string} and {string} ButtonList should displayed And {string} ButtonList should not display")
	public void and_ButtonList_should_displayed_And_ButtonList_should_not_display(String string, String string2, String string3) {
		verifyInitiatedCompletedListVisible();
	}
}
