package pixalere.stepdefinitions;
import org.openqa.selenium.By;

import io.cucumber.java.en.When;
import pixalere.scripts.PixalerePTSeatingMobility;

public class Tests_PixalerePTSeatingMobility extends PixalerePTSeatingMobility {
	@When("I tick checkbox for Assessment Initiated")
	public void i_tick_checkbox_for_Assessment_Initiated() {
	   clickElement(By.id("assessInitiated_section"));
	}
	
	@When("I tick checkbox for Analysis and Recommendation Provided")
	public void i_tick_checkbox_for_Analysis_and_Recommendation_Provided() {
	   clickElement(By.id("analysis_section_section"));
	}

	@When("I verify all records under Assessment Initiated")
	public void i_verify_all_records_under_Assessment_Initiated() {
	    verify_assesment_data();
	}

	@When("I tick checkbox for Stated Mobility Concerns Discussed")
	public void i_tick_checkbox_for_Stated_Mobility_Concerns_Discussed() {
		 clickElement(By.xpath("(//*[@id='mobility_concerns_section'])/parent::*/parent::*/parent::*//img"));
	}

	@When("I tick checkbox for Assessment Data Obtained")
	public void i_tick_checkbox_for_Assessment_Data_Obtained() {
		 //clickElement(By.id("data_obtained_section"));
		 clickElement(By.xpath("(//*[@id='data_obtained_section'])/parent::*/parent::*/parent::*//img"));
	}

	@When("I select radio {string} for Home Access")
	public void i_select_radio_for_Home_Access(String string) {
	   data_for_Assessment_data_obtained();
	}

	@When("I select radio {string} for Home Access radio")
	public void i_select_radio_for_Home_Access_radio(String string) {
		data_for_Assessment_data_obtained_basic();
	}

	@When("I select {string} for Equipment in place")
	public void i_select_for_Equipment_in_place(String string) {
		data_for_Equipment_in_place(string);
	}

	@When("I select radio {string} for Physical Health Components")
	public void i_select_radio_for_Physical_Health_Components(String string) {
	    clickElement(By.xpath("(//label[contains(@for,'ot_physical_health_comp')])[1]"));
	}

	@When("I select radio {string} for Physical Cognition")
	public void i_select_radio_for_Physical_Cognition(String string) {
	   data_for_Physical_Cognition(string);
	}

	@When("I select {string} checkbox for Cognition")
	public void i_select_checkbox_for_Cognition(String string) {
	   chk_for_Cognition(string);
	}

	@When("I select radio {string} for Mental Behavioural Health")
	public void i_select_radio_for_Mental_Behavioural_Health(String string) {
	     clickElement(By.xpath("(//label[contains(@for,'mental_health')])[2]"));
	}

	@When("I select {string} checkbox for Community Transportation")
	public void i_select_checkbox_for_Community_Transportation(String string) {
		 clickElement(By.xpath("(//label[contains(@for,'community')])[1]"));
	}

	@When("I select {string} checkbox for Supplementary Funding Availability")
	public void i_select_checkbox_for_Supplementary_Funding_Availability(String string) {
		chk_for_Supplementary_Funding_Availability(string);
	}

	@When("I select radio {string} for any falls in the past three months")
	public void i_select_radio_for_any_falls_in_the_past_three_months(String string) {
	   clickElement(By.xpath("(//label[contains(@for,'falls')])[2]"));
	}

	@When("I select radio {string} Activities avoided for fear of falling")
	public void i_select_radio_Activities_avoided_for_fear_of_falling(String string) {
		clickElement(By.xpath("(//label[contains(@for,'activities')])[2]"));
	}

	@When("I select radio {string} for Ambulation")
	public void i_select_radio_for_Ambulation(String string) {
	    radio_Ambulation(string);
	}

	@When("I select checkbox {string} for During assessment, observed client")
	public void i_select_checkbox_for_During_assessment_observed_client(String string) {
	    chk_for_During_assessment(string);
	}

	@When("I select checkbox {string} Analysis and Recommendation Provided")
	public void i_select_checkbox_Analysis_and_Recommendation_Provided(String string) {
	   chk_Analysis_and_Recommendation_Provided(string);
	}

	@When("I select radio {string} for Model type sizing and specifications are expected to maximize")
	public void i_select_radio_for_Model_type_sizing_and_specifications_are_expected_to_maximize(String string) {
	    radio_Analysis_and_Recommendation_Provided(string);
	}

	@When("I select radio {string} for Power Scooter Recommendation")
	public void i_select_radio_for_Power_Scooter_Recommendation(String string) {
	   radio_three_wheel(string);
	}

	@When("I verify data for Rationale for type")
	public void i_verify_data_for_Rationale_for_type() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("I select radio {string} for Assessment results shared with client\\/SDM.")
	public void i_select_radio_for_Assessment_results_shared_with_client_SDM(String string) {
		 radio_three_wheel(string);
	}

	@When("I select radio {string} Mobility device goal\\/care plan established in collaboration with client\\/SDM")
	public void i_select_radio_Mobility_device_goal_care_plan_established_in_collaboration_with_client_SDM(String string) {
		 radio_three_wheel(string);
	}

	@When("I select radio {string} Any difficulties\\/issues identified in assessment are addressed")
	public void i_select_radio_Any_difficulties_issues_identified_in_assessment_are_addressed(String string) {
		 radio_three_wheel(string);
	}

	@When("I tick checkbox for Informed Consent for Mobility Service Obtained")
	public void i_tick_checkbox_for_Informed_Consent_for_Mobility_Service_Obtained() {
	     clickElement(By.id("consent_section"));
	}

	@When("I verify data for Proposed Health Services Discussed")
	public void i_verify_data_for_Proposed_Health_Services_Discussed() {
	    chk_Proposed_Health_Services_Discussed();
	}

	@When("I verify data for Consent obtained from")
	public void i_verify_data_for_Consent_obtained_from() {
		chk_Consent_obtained_from();
	}

	@When("I tick checkbox for ADP Eligibility Screened Obtained")
	public void i_tick_checkbox_for_ADP_Eligibility_Screened_Obtained() {
		 clickElement(By.id("eligibility_section"));
	}

	@When("I verify data for ADP Eligibility Screened")
	public void i_verify_data_for_ADP_Eligibility_Screened() {
	      radio_ADP_Eligibility_Screened();
	}

	@When("I select radio {string}")
	public void i_select_radio(String string) {
		clickElement(By.xpath("(//label[contains(@for,'meet_adp')])[1]"));
	}

	@When("I verify data for Client appears to meet ADP eligibility")
	public void i_verify_data_for_Client_appears_to_meet_ADP_eligibility() {
	    chk_Client_appears_to_meet_ADP_eligibility();
	}

	@When("I tick checkbox for Previous Funding by ADP Confirmed")
	public void i_tick_checkbox_for_Previous_Funding_by_ADP_Confirmed() {
	    clickElement(By.id("previous_adp_section"));
	}

	@When("I select radio {string} for Confirmed the status of any prior funding access to ADP")
	public void i_select_radio_for_Confirmed_the_status_of_any_prior_funding_access_to_ADP(String string) {
	   radio_Confirmed_the_status_of_any_prior_funding_access_to_ADP(string);
	}

	@When("I select radio {string} under Confirmed the status")
	public void i_select_radio_under_Confirmed_the_status(String string) {
		 radio_Confirmed_the_status(string);
	}

	@When("I select checkbox {string} for Previous Funding by ADP Confirmed")
	public void i_select_checkbox_for_Previous_Funding_by_ADP_Confirmed(String string) {
	    clickElement(By.xpath("(//label[contains(@for,'client_reapplication')])[1]"));
	}

	@When("I select {string} for rationale")
	public void i_select_for_rationale(String string) {
	    chk_for_rationale(string);
	}

	@When("I tick checkbox for Client Portion Discussed")
	public void i_tick_checkbox_for_Client_Portion_Discussed() {
		 clickElement(By.id("client_portion_section"));
	}

	@When("I select radio {string} for Client their representative is aware of the client portion to be paid")
	public void i_select_radio_for_Client_their_representative_is_aware_of_the_client_portion_to_be_paid(String string) {
	   radio_for_Client_their_representative_is_aware_of_the_client_portion_to_be_paid(string);
	}

	@When("I select checkbox {string} for Funding for client portion")
	public void i_select_checkbox_for_Funding_for_client_portion(String string) {
	   chk_for_client_portion(string);
	}

	@When("I tick checkbox for Equipment Trial Arranged")
	public void i_tick_checkbox_for_Equipment_Trial_Arranged() {
	   clickElement(By.id("equipment_trial_section"));
	}

	@When("I verify radio options discussed and clientSDM and Role activities for vendor in relation")
	public void i_verify_radio_options_discussed_and_client_SDM_and_Role_activities_for_vendor_in_relation() {
	    radio_SDM_and_Role_activities_for_vendor_in_relation();
	}

	@When("I tick checkbox for Client Assessed with Mobility Device")
	public void i_tick_checkbox_for_Client_Assessed_with_Mobility_Device() {
	    clickElement(By.id("add_equipment_trial_section"));
	}

	@When("I select radio {string} for Assessed client with use of mobility device")
	public void i_select_radio_for_Assessed_client_with_use_of_mobility_device(String string) {
	    clickElement(By.xpath("(//label[contains(@for,'assessed_with_client')])[1]"));
	}

	@When("I verify data for Mobility device inspected and appears to be in working order and Delivered as per specs ordered")
	public void i_verify_data_for_Mobility_device_inspected_and_appears_to_be_in_working_order_and_Delivered_as_per_specs_ordered() {
	   radio_data_Mobility_device_inspected_and_appears_to_be_in_working_order();
	}

	@When("I tick checkbox for Education and Training on Device Use Provided")
	public void i_tick_checkbox_for_Education_and_Training_on_Device_Use_Provided() {
		clickElement(By.id("training_section"));
	}

	@When("I tick checkbox for ADP Application for Funding Completed")
	public void i_tick_checkbox_for_ADP_Application_for_Funding_Completed() {
		 clickElement(By.id("app_funding_section"));
	}

	@When("I verify data for ADP Application for Funding Completed")
	public void i_verify_data_for_ADP_Application_for_Funding_Completed_one() {
		verify_data_for_ADP_Application_for_Funding_Completed();
	}

	@When("I tick checkbox for ADP Application Submitted")
	public void i_tick_checkbox_for_ADP_Application_Submitted() {
	    clickElement(By.id("app_submitted_section"));
	}

	@When("I select checkbox {string} for ADP application submitted to")
	public void i_select_checkbox_for_ADP_application_submitted_to(String string) {
	   chk_for_ADP_application_submitted_to(string);
	}

	@When("I select radio {string} for ADP application delivered via")
	public void i_select_radio_for_ADP_application_delivered_via(String string) {
		clickElement(By.xpath("(//label[contains(@for,'app_delivered')])[2]"));
	    radio_for_ADP_application_delivered_via(string);
	}

	@When("I select radio for {string} ADP authorizer assessmentApplication results shared")
	public void i_select_radio_for_ADP_authorizer_assessmentApplication_results_shared(String string) {
		clickElement(By.xpath("(//label[contains(@for,'adp_auth')])[1]"));
	}

	@When("I select radio for {string} Goal of comprehensive mobility assessment met")
	public void i_select_radio_for_Goal_of_comprehensive_mobility_assessment_met(String string) {
		clickElement(By.xpath("(//label[contains(@for,'adp_goal')])[1]"));
	}

}
