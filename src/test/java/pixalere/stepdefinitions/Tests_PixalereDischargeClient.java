package pixalere.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pixalere.scripts.PixalereDischargeClientScript;

public class Tests_PixalereDischargeClient extends PixalereDischargeClientScript {
	
	@When("I select {string} from Reason dropdown for Discharge")
	public void i_select_from_dropdown_reason(String value) {
		selectDropdownValue_Reason(value);
	}
	@When("I select {string} from Discharge Date dropdown for Discharge")
	public void i_select_from_dropdown_date(String value) {
		selectDropdownValue_date(value);
	}
	@When("I select {string} from Discharge Month dropdown for Discharge")
	public void i_select_from_dropdown_month(String value) {
		selectDropdownValue_month(value);
	}
	@And("I enter {string} input field in script for Discharge")
	public void i_enter_input_field_OT(String value) {
		enterYear(value);
	}
	@And("I click on Discharge Patient Button")
	public void i_click_on_Discharge_Patient_Button() {
		clickonDischarge();
	}
	
}
