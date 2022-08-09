package pixalere.stepdefinitions;

import io.cucumber.java.en.When;
import pixalere.scripts.PixalereInHomeSafetyIdentificationToolScripts;

public class Tests_PixalereInHomeSafetyIdentificationTool extends PixalereInHomeSafetyIdentificationToolScripts{
	@When("I select {string} checkbox for HSA Not Compelted field HSI")
	public void I_select_checkbox_for_HSA_Not_Compelted_field_HSI(String string) {
		selectCheckboxForHomeSafetyAssessment(string);
	}	
	@When("I select {string} checkbox for TrippingFalling field HSI")
	public void I_select_checkbox_for_HSA_Tripping_Falling_field_HSI(String string) {
		selectCheckboxForTrippingFallingfieldHSI(string);
	}
	@When("I select {string} checkbox for Medication")
	public void I_select_checkbox_for_Medication(String string) {
		selectCheckboxForMedication(string);
	}
	@When("I select {string} checkbox for Other")
	public void I_select_checkbox_for_Other(String string) {
		selectCheckboxForOther(string);
	}
	@When("I select {string} checkbox for Fire")
	public void I_select_checkbox_for_Fire(String string) {
		selectCheckboxForFire(string);
	}
	@When("I select {string} checkbox for FollowupPlan")
	public void I_select_checkbox_for_FollowupPlan(String string) {
		selectCheckboxForFollowupPlan(string);
	}
	@When("I select {string} checkbox for SafeSleep")
	public void I_select_checkbox_for_SafeSleep(String string) {
		selectCheckboxForSafeSleep(string);
	}
	@When("I select {string} checkbox for FallsPrevention")
	public void I_select_checkbox_for_FallsPrevention(String string) {
		selectCheckboxForFallsPrevention(string);
	}
	@When("I select {string} checkbox for PoisonChoking")
	public void I_select_checkbox_for_PoisonChoking(String string) {
		selectCheckboxForPoisonChoking(string);
	}
	@When("I select {string} checkbox for rooms for hazard")
	public void I_select_Bathroom_checkbox_for_rooms_for_hazard(String string) {
		selectCheckboxForhazard(string);
	}
	@When("I click on Save for rooms for hazard")
	public void I_click_on_Save_for_rooms_for_hazard() {
		clickOnSave();
	}
}
