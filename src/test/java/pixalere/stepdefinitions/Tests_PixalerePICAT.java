package pixalere.stepdefinitions;

import io.cucumber.java.en.When;
import pixalere.pageObjectUtils.LocatorUtils.PICATLocators;
import pixalere.scripts.PixalerePICATScript;

public class Tests_PixalerePICAT extends PixalerePICATScript{

	@When("I select {string} radio option for Immunization up-to-date field")
	public void i_select_radio_option_for_Immunization_up_to_date_field(String string) {
		selectRadioOptionFromSection_Immunization_up_to_date(string);
	}

	@When("I select {string} radio option for Admission goals & discharge planning discussed with Family? field")
	public void i_select_radio_option_for_Admission_goals_discharge_planning_discussed_with_Family_field(String string) {
		selectRadioOptionFromSection_Admission_goals_discharge_planning_discussed(string);
	}

	@When("I select {string} checkbox for Respiratory History field")
	public void i_select_checkbox_for_Respiratory_History_field(String string) {
		clickElement(PICATLocators.chk_noreportedconcern_Respiratory);
		selectRespiratoryCheckobx(string);
	}

	@When("I select {string} checkbox for Respiratory Assessment field")
	public void i_select_checkbox_for_Respiratory_Assessment_field(String string) {
		selectRespiratoryCheckobx(string);
	}

	@When("I select {string} radio option for Pacemaker Present field")
	public void i_select_radio_option_for_Pacemaker_Present_field(String string) {
		selectRadioOptionFromSection_Pacemaker_Present(string);
	}

	@When("I select {string} radio option for Type field")
	public void i_select_radio_option_for_Type_field(String string) {
		selectRadioOptionFromSection_Pacemaker_Present_Type(string);	
	}

	@When("I select {string} checkbox for Cardiovascular History field")
	public void i_select_checkbox_for_Cardiovascular_History_field(String string) {
		selectCardiovascularCheckobx(string);
	}

	@When("I select {string} radio option for Extremities warm to touch? field")
	public void i_select_radio_option_for_Extremities_warm_to_touch_field(String string) {
		selectRadioOptionFromSection_Extremities_warm(string);
	}

	@When("I select {string} radio option for Cap refill field")
	public void i_select_radio_option_for_Cap_refill_field(String string) {
		selectRadioOptionFromSection_Cap_refill(string);
	}

	@When("I select {string} radio option for Cyanosis Present? field")
	public void i_select_radio_option_for_Cyanosis_Present_field(String string) {
		selectRadioOptionFromSection_Cyanosis_Present(string);
	}

	@When("I select {string} radio option for Edema noted field")
	public void i_select_radio_option_for_Edema_noted_field(String string) {
		selectRadioOptionFromSection_Edema_noted(string);
	}

	@When("I select {string} radio option for Presence of Central Intravenous Line? field")
	public void i_select_radio_option_for_Presence_of_Central_Intravenous_Line_field(String string) {
		selectRadioOptionFromSection_Presence_of_Central(string);
	}

	@When("I select {string} radio option for Murmurs field")
	public void i_select_radio_option_for_Murmurs_field(String string) {
		selectRadioOptionFromSection_Murmurs(string);
	}

	@When("I select {string} checkbox option for Gastrointestinal History field")
	public void i_select_radio_option_for_Gastrointestinal_History_field(String string) {
		selectGastrointestinalCheckobx(string);
	}

	@When("I select {string} radio option for Recent weight changes field")
	public void i_select_radio_option_for_Recent_weight_changes_field(String string) {
	}

	@When("I enter {string} in Weight gain feild")
	public void i_enter_in_Weight_gain_feild(String string) {
	}

	@When("I select {string} radio option for Inspection field")
	public void i_select_radio_option_for_Inspection_field(String string) {
	}

	@When("I select {string} radio option for Palpation field")
	public void i_select_radio_option_for_Palpation_field(String string) {
	}

	@When("I select {string} radio option for Auscultation field")
	public void i_select_radio_option_for_Auscultation_field(String string) {
	}

	@When("I select {string} checkbox for Bowel Habits field")
	public void i_select_checkbox_for_Bowel_Habits_field(String string) {
	}

	@When("I select {string} radio option for Enteral Tubes Present? field")
	public void i_select_radio_option_for_Enteral_Tubes_Present_field(String string) {
	}

	@When("I select {string} radio option for Stoma Present? field")
	public void i_select_radio_option_for_Stoma_Present_field(String string) {
	}

	@When("I select {string} checkbox for Skin conditions field")
	public void i_select_checkbox_for_Skin_conditions_field(String string) {
	}

	@When("I select {string} radio option for Skin color field")
	public void i_select_radio_option_for_Skin_color_field(String string) {
	}

	@When("I select {string} radio option for Skin temperature field")
	public void i_select_radio_option_for_Skin_temperature_field(String string) {
	}

	@When("I select {string} radio option for Skin moisture field")
	public void i_select_radio_option_for_Skin_moisture_field(String string) {
	}

	@When("I select {string} checkbox for Oral muscous membranes field")
	public void i_select_checkbox_for_Oral_muscous_membranes_field(String string) {
	}

	@When("I select {string} radio option for Diaper dermatitis field")
	public void i_select_radio_option_for_Diaper_dermatitis_field(String string) {
	}

	@When("I select {string} radio option for Erythema field")
	public void i_select_radio_option_for_Erythema_field(String string) {
	}

	@When("I select {string} radio option for Lesions field")
	public void i_select_radio_option_for_Lesions_field(String string) {
	}

	@When("I select {string} radio option for Bruises field")
	public void i_select_radio_option_for_Bruises_field(String string) {
	}

	@When("I select {string} radio option for Lacerations field")
	public void i_select_radio_option_for_Lacerations_field(String string) {
	}

	@When("I select {string} radio option for Petechiae field")
	public void i_select_radio_option_for_Petechiae_field(String string) {
	}

	@When("I select {string} radio option for Scars field")
	public void i_select_radio_option_for_Scars_field(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("I select {string} radio option for Burns field")
	public void i_select_radio_option_for_Burns_field(String string) {
	}

	@When("I select {string} radio option for Pressure injuries field")
	public void i_select_radio_option_for_Pressure_injuries_field(String string) {
	}

	@When("I select {string} radio option for Genital urinary malformations field")
	public void i_select_radio_option_for_Genital_urinary_malformations_field(String string) {
	}

	@When("I select {string} radio option for Discharge present field")
	public void i_select_radio_option_for_Discharge_present_field(String string) {
	}

	@When("I select {string} radio option for Foul odor in urine present field")
	public void i_select_radio_option_for_Foul_odor_in_urine_present_field(String string) {
	}

	@When("I select {string} radio option for Skin integrity of perineal area field")
	public void i_select_radio_option_for_Skin_integrity_of_perineal_area_field(String string) {
	}

	@When("I select {string} radio option for Sexual Development Reported Concerns field")
	public void i_select_radio_option_for_Sexual_Development_Reported_Concerns_field(String string) {
	}

	@When("I select {string} checkbox for Neurological History field")
	public void i_select_checkbox_for_Neurological_History_field(String string) {
	}

	@When("I select {string} radio option for Pupils, Equal, Round, & Reactive to Light & Accomodation \\(PERRLA) field")
	public void i_select_radio_option_for_Pupils_Equal_Round_Reactive_to_Light_Accomodation_PERRLA_field(String string) {
	}

	@When("I select {string} radio option for Gait field")
	public void i_select_radio_option_for_Gait_field(String string) {
	}

	@When("I select {string} radio option for Oriented field")
	public void i_select_radio_option_for_Oriented_field(String string) {
	}

	@When("I select {string} radio option for Response to painful stimuli field")
	public void i_select_radio_option_for_Response_to_painful_stimuli_field(String string) {
	}

	@When("I select {string} radio option for Cooperative\\/friendly field")
	public void i_select_radio_option_for_Cooperative_friendly_field(String string) {
	}

	@When("I select {string} radio option for Crying field")
	public void i_select_radio_option_for_Crying_field(String string) {
	}

	@When("I select {string} checkbox for Neuromuscular History field")
	public void i_select_checkbox_for_Neuromuscular_History_field(String string) {
	}

	@When("I select {string} checkbox for Neuromuscular Assessment field")
	public void i_select_checkbox_for_Neuromuscular_Assessment_field(String string) {
	}

	@When("I select {string} radio option for Muscle tone field")
	public void i_select_radio_option_for_Muscle_tone_field(String string) {
	}

	@When("I select {string} radio option for Muscle strength field")
	public void i_select_radio_option_for_Muscle_strength_field(String string) {
	}

	@When("I select {string} checkbox for face field")
	public void  I_select_Data_checkbox_for_face_field(String string) {
	}
	
	@When("I select {string} radio option for Cranial_facial malformations field")
	public void i_select_radio_option_for_Cranial_facial_malformations_field(String string) {
	}

	@When("I select {string} radio option for Fontanelle - Palpable field")
	public void i_select_radio_option_for_Fontanelle_Palpable_field(String string) {
	}

	@When("I enter {string} in Head Circumference feild")
	public void i_enter_in_Head_Circumference_feild(String string) {
	}

	@When("I select {string} radio option for Lumps and\\/or swelling noted to head field")
	public void i_select_radio_option_for_Lumps_and_or_swelling_noted_to_head_field(String string) {
	}

	@When("I select {string} checkbox for Eyes field")
	public void i_select_checkbox_for_Eyes_field(String string) {
	}

	@When("I select {string} checkbox for Nose field")
	public void i_select_checkbox_for_Nose_field(String string) {
	}

	@When("I select {string} checkbox for Mouth & Throat field")
	public void i_select_checkbox_for_Mouth_Throat_field(String string) {
	}

	@When("I select {string} radio option for Is the child agitated and\\/or aggressive field")
	public void i_select_radio_option_for_Is_the_child_agitated_and_or_aggressive_field(String string) {
	}

	@When("I select {string} radio option for Does the child wander field")
	public void i_select_radio_option_for_Does_the_child_wander_field(String string) {
	}

	@When("I select {string} radio option for Are restraints used & required field")
	public void i_select_radio_option_for_Are_restraints_used_required_field(String string) {
	}

	@When("I select {string} radio option for Does the client have pain field")
	public void i_select_radio_option_for_Does_the_client_have_pain_field(String string) {
	}

	@When("I select {string} radio option for Oral intake field")
	public void i_select_radio_option_for_Oral_intake_field(String string) {
	}

	@When("I select {string} checkbox for Diet field")
	public void i_select_checkbox_for_Diet_field(String string) {
	}

	@When("I select {string} checkbox for Feeding field")
	public void i_select_checkbox_for_Feeding_field(String string) {
	}

	@When("I select {string} checkbox for Eating habits field")
	public void i_select_checkbox_for_Eating_habits_field(String string) {
	}

	@When("I select {string} radio option for Does the client take naps field")
	public void i_select_radio_option_for_Does_the_client_take_naps_field(String string) {
	}

	@When("I select {string} radio option for Does the child sleep alone field")
	public void i_select_radio_option_for_Does_the_child_sleep_alone_field(String string) {
	}
}
