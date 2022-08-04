package pixalere.stepdefinitions;

import io.cucumber.java.en.When;
import pixalere.scripts.PixalereWaterlawAssessmentScript;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;

public class Tests_PixalereWaterlowAssessment extends PixalereWaterlawAssessmentScript {
	
	@When("I click {string} radio option for Incontinence field")
	public void i_click_radio_option_for_Incontinence_field(String string) {
		selectRadioOptionFromSection_Incontinence(string);
	}
	@When("I click {string} radio option for Skin Type - Visual Risk Area field")
	public void i_click_radio_option_for_Skin_Type_Visual_Risk_Area_field(String string) {
		selectRadioOptionFromSection_Skin_Type_Visual_Risk_Area(string);
	}

	@When("I click {string} radio option for Mobility field")
	public void i_click_radio_option_for_Mobility_field(String string) {
		selectRadioOptionFromSection_Mobility(string);
	}

	@When("I click {string} radio option for Nutrition Element field")
	public void i_click_radio_option_for_Nutrition_Element_field(String string) {
		selectRadioOptionFromSection_Nutrition_Element(string);
	}

	@When("I select {string} checkbox for Special Risks - Tissue Malnutrition field")
	public void i_select_checkbox_for_Special_Risks_Tissue_Malnutrition_field(String string) {
		selectSpecialRisksTissueMalnutritionCheckbox(string);
	}

	@When("I select {string} checkbox for Special Risks - Neurological Deficit field")
	public void i_select_checkbox_for_Special_Risks_Neurological_Deficit_field(String string) {
		selectSpecialRisksNeurologicalDeficitCheckbox(string);
	}

	@When("I select {string} checkbox for Special Risks - Surgery\\/Trauma field")
	public void i_select_checkbox_for_Special_Risks_Surgery_Trauma_field(String string) {
		selectSpecialRisksSurgeryTraumaCheckbox(string);
	}

	@When("I select {string} checkbox for Medication field")
	public void i_select_checkbox_for_Medication_field(String string) {
		 selectMedicationCheckbox(string);
	}

	@When("I click on Add My Electronic Signature and Save My Work Button")
	public void i_click_on_Add_My_Electronic_Signature_and_Save_My_Work_Button() {
		clickElement(By.xpath("//div[@id='saveEntries']"));
	}

	@When("I click on Confirm Button")
	public void i_click_on_Confirm_Button() {
		clickElement(By.xpath("//button[@id='confirm']"));
	}

	@Then("I start verifying records in Waterlow Assessment")
	public void i_start_verifying_records_in_Waterlow_Assessment() {
		verifyWaterlowAssessment();
	}
}
