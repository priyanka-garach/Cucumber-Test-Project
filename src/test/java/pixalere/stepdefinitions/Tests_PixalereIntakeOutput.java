package pixalere.stepdefinitions;

import io.cucumber.java.en.When;
import pixalere.scripts.PixalereIntakeOutputScripts;

public class Tests_PixalereIntakeOutput extends PixalereIntakeOutputScripts {
	
	@When("I select {string} checkbox IntakeOutput")
	public void i_select_checkbox(String field) {
		selectIntakeOutputCheckobx(field);
	}

	@When("I click {string} radio option for Emesis field")
	public void i_select_radio_option_for_field_RoutePCA(String section) {
		selectRadioOptionFromSection_io_emesis(section);
		System.out.println();
	}

	@When("I click {string} radio option for Enteral field")
	public void i_select_radio_option_for_field_Enteral_field(String section) {
		selectRadioOptionFromSection_io_enteral(section);
		System.out.println();
	}
	
	@When("I click {string} radio option for Tube Type field")
	public void i_select_radio_option_for_tube_Type_field(String section) {
		selectRadioOptionFromSection_io_TubeType_field(section);
		System.out.println();
	}

	@When("I enter {string} input field IO")
	public void i_enter_input_field(String inputField) {
		Wait_p(2);
		enterInputFieldAsPerKey(inputField);
	}
	
	@When("I click {string} radio option for Safety Check field")
	public void i_click_radio_option_for_Safety_Check_field(String string) {
		selectRadioOptionFromSection_io_SafetyCheck_field(string);
		
	}

	@When("I click {string} radio option for Tube placement verified field")
	public void i_click_radio_option_for_Tube_placement_verified_field(String string) {
		selectRadioOptionFromSection_io_TubePlacementVerified_field(string);
	}

	@When("I click {string} radio option for Void field")
	public void i_click_radio_option_for_Void_field(String string) {
		selectRadioOptionFromSection_io_Void_field(string);
	}

	@When("I click {string} radio option for Ostomy field")
	public void i_click_radio_option_for_Ostomy_field(String string) {
		selectRadioOptionFromSection_io_ostomy_field(string);
	}

	@When("I click {string} radio option for Drain field")
	public void i_click_radio_option_for_Drain_field(String string) {
		selectRadioOptionFromSection_io_drain_field(string);
	}

	@When("I click {string} radio option for Drain Type1 field")
	public void i_click_radio_option_for_Drain_Type1_field(String string) {
		selectRadioOptionFromSection_io_drain_type1_field(string);
	}
	
	@When("I click {string} radio option for Drain Type2 field")
	public void i_click_radio_option_for_Drain_Type2_field(String string) {
		selectRadioOptionFromSection_io_drain_type2_field(string);
	}
	
	@When("I click {string} radio option for Drain Type3 field")
	public void i_click_radio_option_for_Drain_Type3_field(String string) {
		selectRadioOptionFromSection_io_drain_type3_field(string);
	}

	@When("I click {string} radio option for Stool field")
	public void i_click_radio_option_for_Stool_field(String string) {
		selectRadioOptionFromSection_io_stool_field(string);
	}

	@When("I click {string} radio option for Stool Consistency field")
	public void i_click_radio_option_for_Stool_Consistency_field(String string) {
		selectRadioOptionFromSection_io_stool_Consistency_field(string);
	}

	@When("I click on Save My Work IntakeOutput Button")
	public void i_click_on_Save_My_Work_Intake_Output_Button() {
		
		saveIntakeOutput();
		System.out.println();
	}

	@When("I start verifying records in Intake\\/Output")
	public void i_start_verifying_records_in_Intake_Output() {
		verify_IntakeOutput();
		
		////input[@id='backdated_time']
		////select[@id='backdated_day']
		////select[@id='backdated_month']
		////input[@id='backdated_year']
		////button[@id='confirm']
	}

}
