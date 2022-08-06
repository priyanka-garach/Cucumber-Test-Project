package pixalere.stepdefinitions;

import io.cucumber.java.en.When;
import pixalere.scripts.PixalereTracheostomyScripts;

public class Tests_PixalereTracheostomy extends PixalereTracheostomyScripts {

	@When("I click {string} radio option for Humidity field")
	public void I_click_on_radio_option_for_Humidity_field_T(String string) {
		selectRdioforfieldTrachestomy(string);
	}
	@When("I click {string} radio option for Suction System Checks")
	public void I_click_Yes_radio_option_for_Suction_System_Checks(String string) {
		selectRadioOptionFromSection_Suction_System_Checks(string);
	}
	@When("I click {string} radio option for Trach Set Change field")
	public void I_click_No_radio_option_for_Trach_Set_Change_field(String string) {
		selectRadioOptionFromSection_Trach_Set_Change_field(string);
	}
	@When("I click {string} radio option for Spare Trach Set Available field")
	public void I_click_Yes_radio_option_for_Spare_Trach_Set_Available_field(String string) {
		selectRadioOptionFromSection_Spare_Trach_Set_Available(string);
	}
	@When("I click {string} radio option for Stoma Care Provided field")
	public void I_click_No_radio_option_for_Stoma_Care_Provided_field(String string) {
		selectRadioOptionFromSection_Stoma_Care_Provided_field(string);
	}
	@When("I click {string} radio option for suctioning performed field")
	public void I_click_No_radio_option_for_suctioning_performed_field(String string) {
		selectRadioOptionFromSection_suctioning_performed_field(string);
	}
	@When("I click {string} radio option for client ventilator field")
	public void I_click_Yes_radio_option_for_client_ventilator_field(String string) {
		selectRadioOptionFromSection_client_ventilator_field(string);
	}
	@When("I click {string} radio option for Water Level Checked field")
	public void I_click_Yes_radio_option_for_Water_Level_Checked_field(String string) {
		selectRadioOptionFromSection_Water_Level_Checked_field(string);
	}
	@When("I click {string} radio option for Humidifier ON Checked field")
	public void I_click_Yes_radio_option_for_Humidifier_ON_Checked_field(String string) {
		selectRadioOptionFromSection_Humidifier_ON_Checked_field(string);
	}
}
