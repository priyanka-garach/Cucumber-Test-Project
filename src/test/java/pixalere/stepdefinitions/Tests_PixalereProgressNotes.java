package pixalere.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pixalere.scripts.PixalereProgressNotesScripts;

public class Tests_PixalereProgressNotes extends PixalereProgressNotesScripts {

	@When("I enter text in {string} textarea")
	public void i_enter_text_in_textarea(String string) {
		enterProgressNoteInputField();
	}

	@Then("I verify Saved Progress Note, Date and User {string} in search History")
	public void i_verify_Saved_Progress_Note_Date_and_User_in_search_History(String isDisplay) {
		verifyProgressNoteField(isDisplay);
	}

	@When("I set {string} day StartDate and EndDate")
	public void i_set_day_StartDate_and_EndDate(String time) {
		setStartEndDateFilter(time);
	}
}
