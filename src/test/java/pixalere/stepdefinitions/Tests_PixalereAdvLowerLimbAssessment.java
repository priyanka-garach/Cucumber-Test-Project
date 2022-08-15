package pixalere.stepdefinitions;

import org.openqa.selenium.By;

import io.cucumber.java.en.When;
import pixalere.scripts.PixalereAdvLowerLimbAssessmentScripts;

public class Tests_PixalereAdvLowerLimbAssessment extends PixalereAdvLowerLimbAssessmentScripts {

	@When("I select {string} checkbox for Right Dorsalis Pedis field")
	public void i_select_checkbox_for_Right_Dorsalis_Pedis_field(String string) {
		selectRightDorsalisPedisAdvLimbCheckBox(string);
	}

	@When("I select {string} checkbox for Left Dorsalis Pedis field")
	public void i_select_checkbox_for_Left_Dorsalis_Pedis_field(String string) {
		selectLeftDorsalisPedisAdvLimbCheckBox(string);
	}

	@When("I click {string} radio option for Ankle Brachial Index field")
	public void i_click_radio_option_for_Ankle_Brachial_Index_field(String value) {
		selectRadioOptionForAnkle_Brachial_Index_field_AdvLimb(value);
	}

	@When("I click {string} radio option for Referral For Vascular Assessment Initiated ABI Score field")
	public void i_click_radio_option_for_Referral_For_Vascular_Assessment_Initiated_ABI_Score_field(String value) {
		selectRadioOptionForVascular_Assessment_Initiated_ABI_Score_field_AdvLimb(value);
	}

	@When("I click {string} radio option for Toe Brachial Index field")
	public void i_click_radio_option_for_Toe_Brachial_Index_field(String string) {
		selectRadioOptionForAnkle_Vascular_Assessment_Initiated_ABI_Score_AdvLimb(string);
	}


	@When("I select {string} checkbox for Right Monofilament Testing field ALB")
	public void i_select_checkbox_for_Right_Monofilament_Testing_field_ALB(String string) {
		selectRightmonofilamentTestingfieldCheckBox(string);
	}


	@When("I click {string} radio option for Right Stemmer's Sign field")
	public void i_click_radio_option_for_Right_Stemmer_s_Sign_field(String string) {
		selectRadioOptionForRight_Stemmer_s_Sign_field_field_AdvLimb(string);
	}

	@When("I click {string} radio option for Left Stemmer's Sign field")
	public void i_click_radio_option_for_Left_Stemmer_s_Sign_field(String string) {
		selectRadioOptionForLeft_Stemmer_s_Sign_field_field_AdvLimb(string);
	}

	@When("I select {string} checkbox for Right Limb Shape field")
	public void i_select_checkbox_for_Right_Limb_Shape_field(String string) {
	   
	}


	@When("I select {string} checkbox for Right Concerns Foot field")
	public void i_select_checkbox_for_Right_Concerns_Foot_field(String string) {
		selectRight_Concerns_Foot_fieldAdvLimbCheckBox(string);
	}

	@When("I select {string} checkbox for Left Derm Assessment field ALB")
	public void i_select_checkbox_for_Left_Derm_Assessment_field_ALB(String string) {
		selectRight_Concerns_Left_Derm_Assessment_field_ALB_CheckBox(string);
	}

	@When("I select {string} checkbox for Right Pain Assessment - Advanced field")
	public void i_select_checkbox_for_Right_Pain_Assessment_Advanced_field(String string) {
		selectRight_Concerns_Right_Pain_Assessment_CheckBox(string);
	}

	@When("I select {string} checkbox for Left Pain Assessment - Advanced field")
	public void i_select_checkbox_for_Left_Pain_Assessment_Advanced_field(String string) {
		selectRight_Concerns_Left_Pain_Assessment_CheckBox(string);
	}

	@When("I click on Save My Work Advanced Lower Limb Assessment Button")
	public void i_click_on_Save_My_Work_Advanced_Lower_Limb_Assessment_Button() {
		clickElement(By.xpath("//*[@id='saveEntries']"));
		clickElement(By.xpath("//*[@id='confirm']"));
		System.out.println();
	}

	@When("I start verifying records in Advanced Lower Limb Assessment Page")
	public void i_start_verifying_records_in_Advanced_Lower_Limb_Assessment_Page() {
		clickElement(By.xpath("//*[@id='aFlowLink']"));
		verify_adv_lower_limb_assessment_page();
	}
	
	@When("I select {string} checkbox for Right Posterior Tibial field")
	public void i_select_checkbox_for_Right_Posterior_Tibial_field(String string) {
	    selectchkRightPosterioirTibialALB(string);
	}

	/*@When("I select {string} checkbox for Left Posterior Tibialfield")
	public void i_select_checkbox_for_Left_Posterior_Tibialfield(String string) {
		selectchkLeftPosterioirTibialALB(string);

	}*/

	@When("I select {string} checkbox for Left Posterior Tibialfield")
	public void i_select_checkbox_for_Left_Posterior_Tibialfield(String string) {
	    // Write code here that turns the phrase above into concrete actions
		selectchkLeftPosterioirTibialALB(string);

	}

	@When("I select {string} for day in Date dropdown")
	public void i_select_for_day_in_Date_dropdown(String string) {
	    selectDayALB(string);
	}

	@When("I select {string} for month in Date dropdown")
	public void i_select_for_month_in_Date_dropdown(String string) {
		selectMonthALB(string);
	}
	@When("I select {string} for day in Date_AB dropdown")
	public void i_select_for_day_in_Date_AB_dropdown(String string) {
		selectDay_ABALB(string);
	}
	

	@When("I select {string} for month in Date_AB dropdown")
	public void i_select_for_month_in_Date_AB_dropdown(String string) {
		selectMonth_ABALB(string);
	}
	
	@When("I select {string} checkbox for Left Monofilament Testing field ALB")
	public void i_select_checkbox_for_Left_Monofilament_Testing_field_ALB(String string) {
	    // Write code here that turns the phrase above into concrete actions
	  selectchkLeft_Monofilament_Testing_field_ALB(string);
	}

	@When("I select {string} checkbox for Right Limb Shape field ALB")
	public void i_select_checkbox_for_Right_Limb_Shape_field_ALB(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    selectRight_Limb_Shape_field_ALB(string);
	    
	}

	@When("I select {string} checkbox for Left Limb Shape field ALB")
	public void i_select_checkbox_for_Left_Limb_Shape_field_ALB(String string) {
	    // Write code here that turns the phrase above into concrete actions
		selectLeft_Limb_Shape_field_ALB(string);	}

	@When("I select {string} checkbox for Left Concerns Foot field")
	public void i_select_checkbox_for_Left_Concerns_Foot_field(String string) {
	    // Write code here that turns the phrase above into concrete actions
		selectLeft_Concerns_Foot_fieldAdvLimbCheckBox(string);
	}

	@When("I select {string} checkbox for Right Toe Nails field")
	public void i_select_checkbox_for_Right_Toe_Nails_field(String string) {
	    // Write code here that turns the phrase above into concrete actions
		selectRight_Toe_Nails_fieldAdvLimbCheckBox(string);
	}

	@When("I select {string} checkbox for Left Toe Nails field")
	public void i_select_checkbox_for_Left_Toe_Nails_field(String string) {
	    // Write code here that turns the phrase above into concrete actions
		selectLeft_Toe_Nails_fieldAdvLimbCheckBox(string);
	}

	@When("I select {string} checkbox for Left Skin Appearance - Advanced field")
	public void i_select_checkbox_for_Left_Skin_Appearance_Advanced_field(String string) {
	    // Write code here that turns the phrase above into concrete actions
		selectLeft_Skin_Appearance_Advanced_fieldAdvLimbCheckBox(string);
	}

	@When("I select {string} checkbox for Right Skin Appearance - Advanced field")
	public void i_select_checkbox_for_Right_Skin_Appearance_Advanced_field(String string) {
	    // Write code here that turns the phrase above into concrete actions
		selectRight_Skin_Appearance_Advanced_fieldAdvLimbCheckBox(string);
	}
	
	


	// --------------------************************************************************************---------------------------------//

}
