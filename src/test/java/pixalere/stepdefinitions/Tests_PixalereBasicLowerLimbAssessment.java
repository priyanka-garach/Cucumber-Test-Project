package pixalere.stepdefinitions;

import org.openqa.selenium.By;

import io.cucumber.java.en.When;
import pixalere.scripts.PixalereBasicLowerLimbAssessmentScripts;

public class Tests_PixalereBasicLowerLimbAssessment extends PixalereBasicLowerLimbAssessmentScripts {

	@When("I select {string} checkbox for Right Missing Limbs or Toes field")
	public void i_select_checkbox_for_Right_Missing_Limbs_or_Toes_field(String string) {
		selectRightMissingLimbsorToesCheckBox(string);
		System.out.println();
		
	}

	@When("I select {string} checkbox for Left Missing Limbs or Toes field")
	public void i_select_checkbox_for_Left_Missing_Limbs_or_Toes_field(String string) {
		selectLeftMissingLimbsorToesCheckBox(string);
		System.out.println();
	}

	@When("I click {string} radio option for {string} Lower Leg Skin Colour field")
	public void i_click_radio_option_for_Right_Lower_Leg_Skin_Colour_field(String value, String section) {
		selectRadioOptionForLowerRightLegSkinColor(value,section);
	}

	@When("I click {string} radio option for {string} Foot Skin Colour field")
	public void i_click_radio_option_for_Right_Foot_Skin_Colour_field(String value, String section) {
		selectRadioOptionForFootSkinColor(value,section);
	}

	@When("I click {string} radio option for {string} Toes Skin Colour field")
	public void i_click_radio_option_for_Right_Toes_Skin_Colour_field(String value, String section) {
		selectRadioOptionForToesSkinColor(value,section);
	}


	@When("I click {string} radio option for {string} Lower Leg Skin Warmth field")
	public void i_click_radio_option_for_Right_Lower_Leg_Skin_Warmth_field(String value, String section) {
		selectRadioOptionForLowerLegSkinWarmth(value,section);
	}

	@When("I click {string} radio option for {string} Foot Skin Warmth field")
	public void i_click_radio_option_for_Right_Foot_Skin_Warmth_field(String value, String section) {
		selectRadioOptionForFootSkinWarmth(value,section);
	}

	@When("I click {string} radio option for {string} Toes Skin Warmth field")
	public void i_click_radio_option_for_Right_Toes_Skin_Warmth_field(String value, String section) {
		selectRadioOptionForToesSkinWarmth(value,section);
	}

	@When("I click {string} radio option for {string} Dorsalis Pedis Pulses by Palpation field")
	public void i_click_radio_option_for_Right_Dorsalis_Pedis_Pulses_by_Palpation_field(String value, String section) {
		selectRadioOptionForDorsalisPedisPulsesbyPalpationfield(value,section);
	}

	@When("I click {string} radio option for {string} Posterior Tibial Pulses by Palpation field")
	public void i_click_radio_option_for_Right_Posterior_Tibial_Pulses_by_Palpation_field(String value, String section) {
		selectRadioOptionForPosteriorTibialPulsesbyPalpationfield(value,section);
	}

	@When("I click {string} radio option for Less than equal to three secs Capillary Refill field")
	public void i_click_radio_option_for_Less_than_equal_to_secs_Capillary_Refill_field(String string) {
		selectradioLess_than_equaltoThreesecsCapillaryRefillfield(string);
	}

	@When("I click {string} radio option for Greater than three secs Capillary Refill field")
	public void i_click_radio_option_for_Greater_than_secs_Capillary_Refill_field(String string) {
		selectradioLess_than_equaltoThreesecsCapillaryRefillfield_Two(string);
	}

	@When("I click {string} radio option for {string} Knee Range of Motion field")
	public void i_click_radio_option_for_Right_Knee_Range_of_Motion_field(String value, String section) {
		selectRadioOptionForKneeRange_Motion_field(value,section);
	}


	@When("I click {string} radio option for {string} Ankle Range of Motion field")
	public void i_click_radio_option_for_Right_Ankle_Range_of_Motion_field(String value, String section) {
		selectRadioOptionForAnkleRange_Motion_field(value,section);
	}

	@When("I click {string} radio option for {string} Edema Location field")
	public void i_click_radio_option_for_Right_Edema_Location_field(String value, String section) {
		selectRadioOptionForEdema_Location(value,section);
	}

	@When("I click {string} radio option for {string} Edema Severity field")
	public void i_click_radio_option_for_Right_Edema_Severity_field(String value, String section) {
		selectRadioOptionForEdema_Severity_field(value,section);
	}

	@When("I select {string} checkbox for Right Derm Assessment field")
	public void i_select_checkbox_for_Right_Derm_Assessment_field(String string) {
		selectRightDermAssessmentfieldCheckBox(string);
	}

	@When("I select {string} checkbox for Left Derm Assessment field")
	public void i_select_checkbox_for_Left_Derm_Assessment_field(String string) {
		selectLeftDermAssessmentfieldCheckBox(string);
	}

	@When("I select {string} checkbox for Right Monofilament Testing field")
	public void i_select_checkbox_for_Right_Monofilament_Testing_field(String string) {
		selectRight_Monofilament_Testing_fieldCheckBox(string);
		System.out.println();
	}
	
	@When("I select {string} checkbox for Left Sensation Assessment field")
	public void i_select_checkbox_for_Left_Sensation_Assessment_field(String string) {
		selectLeft_Sensation_Assessment_fieldCheckBox(string);
	}

	@When("I select {string} checkbox for {string} Pain Assessment field")
	public void i_select_checkbox_for_Right_Pain_Assessment_field(String value, String section) {
		selectRight_Left_Pain_Assessment_fieldCheckBox(value, section);
	}

	@When("I click on Save My Work Basic Lower Limb Assessment Button")
	public void i_click_on_Save_My_Work_Basic_Lower_Limb_Assessment_Button() {
		clickElement(By.xpath("//div[@id='saveEntries']"));
		clickElement(By.xpath("//button[@id='confirm']"));
		System.out.println();
	}

	@When("I start verifying records in Basic Lower Limb Assessment Page")
	public void i_start_verifying_records_in_Basic_Lower_Limb_Assessment_Page() {
		verify_basic_lower_limb_assessment_page();
	}

	// --------------------************************************************************************---------------------------------//

}
