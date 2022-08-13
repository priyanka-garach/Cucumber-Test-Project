package pixalere.stepdefinitions;

import io.cucumber.java.en.When;
import pixalere.scripts.PixalerePTAssessmentScripts;

public class Tests_PixalerePTAssessment extends PixalerePTAssessmentScripts {


	@When("I click on {string} Assessment")
	public void i_click_on_Assessment(String string) {
		clickOnAssessmentTabs(string);
	}

	@When("I click {string} radio option for initiating service")
	public void i_click_radio_option_for_initiating_service(String string) {
		selectRadioOptionForInitiating_service(string);
	}

	@When("I click {string} radio option for scope of service")
	public void i_click_radio_option_for_scope_of_service(String string) {
		selectRadioOptionForScope_of_service(string);
	}

	@When("I click {string} radio option for Acute Respiratory Screen")
	public void i_click_radio_option_for_Acute_Respiratory_Screen(String string) {
		selectRadioOptionForAcute_Respiratory_Screen(string);
	}

	@When("I click {string} radio option for LHIN referral")
	public void i_click_radio_option_for_LHIN_referral(String string) {
		selectRadioOptionForLHIN_referral(string);
	}

	@When("I click {string} radio option for scope of practice")
	public void i_click_radio_option_for_scope_of_practice(String string) {
		selectRadioOptionForScope_of_practice(string);
	}

	@When("I click {string} radio option for verbal consent")
	public void i_click_radio_option_for_verbal_consent(String string) {
		selectRadioOptionForVerbal_consent(string);
	}

	@When("I click {string} radio option for Student participating in service")
	public void i_click_radio_option_for_Student_participating_in_service(String string) {
		selectRadioOptionForStudent_participating(string);
	}

	@When("I select {string} checkbox for Assessment Initiated")
	public void i_select_checkbox_for_Assessment_Initiated(String string) {
		selectAssessmentInitiatedCheckbox(string);
	}

	@When("I click on {string} radio option for Housing")
	public void i_click_on_radio_option_for_Housing(String string) {
		selectRadioOptionForHousing(string);
	}

	@When("I select {string} checkbox for Home Accessibility")
	public void i_select_checkbox_for_Home_Accessibility(String string) {
		selectHomeAccessibilityCheckbox(string);
	}

	@When("I click on {string} radio option for evidence")
	public void i_click_on_radio_option_for_evidence(String string) {
		selectRadioOptionForEvidence(string);
	}

	@When("I click on {string} radio option for Functional Accessibility of Home")
	public void i_click_on_radio_option_for_Functional_Accessibility_of_Home(String string) {
		selectRadioOptionForFunctionalAccessibility(string);
	}

	@When("I click on {string} radio option for Medication Use Assessed")
	public void i_click_on_radio_option_for_Medication_Use_Assessed(String string) {
		selectRadioOptionForMedicationUse(string);
	}

	@When("I click on {string} radio option for Posture Assessed")
	public void i_click_on_radio_option_for_Posture_Assessed(String string) {
		selectRadioOptionForPostureAssessed(string);
	}

	@When("I select {string} checkbox for Posture Assessed")
	public void i_select_checkbox_for_Posture_Assessed(String string) {
		selectPostureAssessedCheckbox(string);
	}

	@When("I click on {string} radio option for Edema")
	public void i_click_on_radio_option_for_Edema(String string) {
		selectRadioOptionForEdema(string);
	}

	@When("I select {string} checkbox for Edema")
	public void i_select_checkbox_for_Edema(String string) {
		selectEdemaCheckbox(string);
	}

	@When("I click on {string} radio option for Skin Integrity")
	public void i_click_on_radio_option_for_Skin_Integrity(String string) {
		selectRadioOptionForSkinIntegrity(string);
	}

	@When("I select {string} checkbox for Skin Integrity")
	public void i_select_checkbox_for_Skin_Integrity(String string) {
		selectSkinIntegrityCheckbox(string);
	}

	@When("I click on {string} radio option for Pain Assessment")
	public void i_click_on_radio_option_for_Pain_Assessment(String string) {
		selectRadioOptionForPainAssessment(string);
	}

	@When("I click on {string} radio option for Duration")
	public void i_click_on_radio_option_for_Duration(String string) {
		selectRadioOptionForDuration(string);
	}

	@When("I click on {string} radio option for Frequency")
	public void i_click_on_radio_option_for_Frequency(String string) {
		selectRadioOptionForFrequency(string);
	}

	@When("I select {string} checkbox for Quality")
	public void i_select_checkbox_for_Quality(String string) {
		selectQualityCheckbox(string);
	}

	@When("I select {string} checkbox for Pain Factors")
	public void i_select_checkbox_for_Pain_Factors(String string) {
		selectPainFactorsCheckbox(string);
	}

	@When("I click on {string} radio option for Bed Mobility")
	public void i_click_on_radio_option_for_Bed_Mobility(String string) {
	}

	@When("I click on {string} radio option for Chair Repositioning")
	public void i_click_on_radio_option_for_Chair_Repositioning(String string) {
	}

	@When("I click on {string} radio option for Transfers")
	public void i_click_on_radio_option_for_Transfers(String string) {
	}

	@When("I click on {string} radio option for Ambulation")
	public void i_click_on_radio_option_for_Ambulation(String string) {
	}

	@When("I click on {string} radio option for Weight Bearing Status")
	public void i_click_on_radio_option_for_Weight_Bearing_Status(String string) {
	}

	@When("I select {string} checkbox for Mobility")
	public void i_select_checkbox_for_Mobility(String string) {
	}

	@When("I click on {string} radio option for Stair use Assessed")
	public void i_click_on_radio_option_for_Stair_use_Assessed(String string) {
	}

	@When("I click on {string} radio option for Sitting balance")
	public void i_click_on_radio_option_for_Sitting_balance(String string) {
	}

	@When("I click on {string} radio option for Standing balance")
	public void i_click_on_radio_option_for_Standing_balance(String string) {
	}

	@When("I click on {string} radio option for MSK")
	public void i_click_on_radio_option_for_MSK(String string) {
		selectRadioOptionForMSK(string);
	}

	@When("I click on {string} Respiratory")
	public void i_click_on_Respiratory(String string) {
		selectRadioOptionForRespiratory(string);
	}

	@When("I click on {string} Neurological")
	public void i_click_on_Neurological(String string) {
		selectRadioOptionForNeurological(string);
	}

	@When("I click on {string} radio option for Cognitive Functioning")
	public void i_click_on_radio_option_for_Cognitive_Functioning(String string) {
		selectRadioOptionForCognitiveFunctioning(string);
	}

	@When("I click on {string} radio option for Affective Functioning")
	public void i_click_on_radio_option_for_Affective_Functioning(String string) {
		selectRadioOptionForAffectiveFunctioning(string);
	}
	
	@When("I click on {string} radio option for Cognition")
	public void i_click_on_radio_option_for_Cognition(String string) {
		selectRadioOptionForCognition(string);
	}

	@When("I click on {string} radio option for PT Service")
	public void i_click_on_radio_option_for_PT_Service(String string) {
		selectRadioOptionForPTService(string);		
	}

	@When("I select {string} checkbox for Assessment information")
	public void i_select_checkbox_for_Assessment_information(String string) {
		selectAssessmentInformationCheckbox(string);
	}

	@When("I click on {string} radio Option for Assessment results")
	public void i_click_on_radio_Option_for_Assessment_results(String string) {
		selectRadioOptionForAssessmentresults(string);
	}

	@When("I click on {string} radio Option for conversation completed")
	public void i_click_on_radio_Option_for_conversation_completed(String string) {
		selectRadioOptionForConversationcompleted(string);
	}

	@When("I click on {string} radio Option for Welcome Brochure")
	public void i_click_on_radio_Option_for_Welcome_Brochure(String string) {
		selectRadioOptionForWelcomeBrochure(string);
	}

	@When("I click on {string} radio Option for Client Emergency")
	public void i_click_on_radio_Option_for_Client_Emergency(String string) {
		selectRadioOptionForClientEmergency(string);
	}
}
