package pixalere.stepdefinitions;

import org.openqa.selenium.By;

import io.cucumber.java.en.When;
import pixalere.scripts.PixalereUpperLimbAssessmentScripts;

public class Tests_PixalereUpperLimbAssessment extends PixalereUpperLimbAssessmentScripts {

	@When("I select {string} checkbox for Right Missing Limbs or Fingers field")
	public void i_select_checkbox_for_Right_Missing_Limbs_or_Fingers_field(String string) {
		selectRadioRightMissingLimbsorFingersCheckBox(string);
		System.out.println();
	}

	@When("I select {string} checkbox for Left Missing Limbs or Fingers field")
	public void i_select_checkbox_for_Left_Missing_Limbs_or_Fingers_field(String string) {
		selectRadioLeftMissingLimbsorFingersCheckBox(string);
	}

	@When("I click {string} radio option for {string} Arm Skin Colour field")
	public void i_click_radio_option_for_Arm_Skin_Colour_field(String value, String section) {
		selectRadioOptionForUpperRightArmSkinColor(value,section);
		
	}

	@When("I click {string} radio option for {string} Hand Skin Colour field")
	public void i_click_radio_option_for_Hand_Skin_Colour_field(String value, String section) {
		selectRadioOptionForUpperHandSkinColor(value,section);
	}

	@When("I click {string} radio option for {string} Fingers Skin Colour field")
	public void i_click_radio_option_for_Fingers_Skin_Colour_field(String value, String section) {
		selectRadioOptionForUpperFingersSkinSkinColor(value,section);
	}

	@When("I click {string} radio option for {string} Arm Skin Warmth field")
	public void i_click_radio_option_for_Arm_Skin_Warmth_field(String value, String section) {
		selectRadioOptionForUpperArmSkinWarmth(value,section);
	}

	@When("I click {string} radio option for {string} Hand Skin Warmth field")
	public void i_click_radio_option_for_Hand_Skin_Warmth_field(String value, String section) {
		selectRadioOptionForUpperHandSkinWarmth(value,section);
	}

	@When("I click {string} radio option for {string} Fingers Skin Warmth field")
	public void i_click_radio_option_for_Fingers_Skin_Warmth_field(String value, String section) {
		selectRadioOptionForUpperFingersSkinWarmth(value,section);
	}

	@When("I click {string} radio option for {string} Elbow Range of Motion field")
	public void i_click_radio_option_for_Right_Elbow_Range_of_Motion_field(String value, String section) {
		selectRadioOptionForRightElbowMotionfield(value,section);
	}

	@When("I click {string} radio option for {string} Wrist Range of Motion field")
	public void i_click_radio_option_for_Right_Wrist_Range_of_Motion_field(String value, String section) {
		selectRadioOptionForRightWristMotionfield(value,section);
	}


	@When("I click {string} radio option for {string} Thumb Range of Motion field")
	public void i_click_radio_option_for_Right_Thumb_Range_of_Motion_field(String value, String section) {
		selectRadioOptionForRightThumbMotionfield(value,section);
	}


	@When("I start verifying records in Upper Limb Assessment Page")
	public void i_start_verifying_records_in_Upper_Limb_Assessment_Page() {
	  clickElement(By.xpath("//a[@id='uFlowLink']"));
	  verify_upperLimbData();
	}

}
