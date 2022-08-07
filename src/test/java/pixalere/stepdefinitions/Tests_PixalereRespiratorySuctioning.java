package pixalere.stepdefinitions;

import io.cucumber.java.en.When;
import pixalere.scripts.PixalereRespiratorySuctioningScripts;

public class Tests_PixalereRespiratorySuctioning extends PixalereRespiratorySuctioningScripts{

	@When ("I click {string} radio option for Suction machine working")
	public void I_click_Yes_radio_option_for_Suction_machine_working(String string) {
		selectRadioButtonBySuction_machine_working(string);
	}
	@When ("I click {string} radio option for Battery charged")
	public void I_click_No_radio_option_for_Battery_charged(String string) {
		selectRadioButtonByBattery_charged(string);
	}
	@When ("I click {string} radio option for Type of suctioning")
	public void I_click_Oral_suctioning_radio_option_for_Type_of_suctioning(String string) {
		selectRadioButtonByType_of_suctioning(string);
	}
	@When ("I click {string} radio option for Amount")
	public void I_click_Moderate_radio_option_for_Amount(String string) {
		selectRadioButtonByAmount(string);
	}
	@When ("I click {string} radio option for Color")
	public void I_click_clear_radio_option_for_Color(String string) {
		selectRadioButtonByColor(string);
	}
	@When ("I click {string} radio option for Consistency")
	public void I_click_Thin_radio_option_for_Consistency(String string) {
		selectRadioButtonByConsistency(string);
	}
	@When ("I click {string} radio option for Odour")
	public void I_click_None_radio_option_for_Odour(String string) {
		selectRadioButtonByOdour(string);
	}
	@When ("I click {string} radio option for Suctioning container cleaned")
	public void I_click_Yes_radio_option_for_Suctioning_container_cleaned(String string) {
		selectRadioButtonBySuctioning_container_cleaned(string);
	}
	@When ("I select {string} from Suctioning Date")
	public void I_select_13_from_Suctioning_Date(String string) {
		selectDateFromSuctioning_Date(string);
	}
	@When ("I select {string} from Suctioning Month")
	public void I_select_Dec_from_Suctioning_Month(String string) {
		selectDateFromSuctioning_Month(string);
	}
	@When ("I click {string} radio option for Non invasive ventilation")
	public void I_click_Yes_radio_option_for_Non_invasive_ventilation(String string) {
		selectRadioButtonByNon_invasive_ventilation(string);
	}
	@When ("I click {string} radio option for Oxygen in situ")
	public void I_click_Yes_radio_option_for_Oxygen_in_situ(String string) {
		selectRadioButtonByOxygen_in_situ(string);
	}
	@When ("I click {string} radio option for Humidifier Check")
	public void I_click_No_radio_option_for_Humidifier_Check(String string) {
		selectRadioButtonByHumidifier_Check(string);
	}
	@When ("I click {string} radio option for Air filter cleaned")
	public void I_click_Yes_radio_option_for_Air_filter_cleaned(String string) {
		selectRadioButtonByAir_filter_cleaned(string);
	}
	@When ("I click {string} radio option for Mask_tubing cleaned")
	public void I_click_Yes_radio_option_for_Mask_tubing_cleaned(String string) {
		selectRadioButtonByMask_tubing_cleaned(string);
	}
	@When ("I select {string} from Non invasive ventilation Date")
	public void I_select_3_from_Non_invasive_ventilation_Date(String string) {
		selectDateFromNon_invasive_ventilation_Date(string);
	}
	@When ("I select {string} from Non invasive ventilation Month")
	public void I_select_Jan_from_Non_invasive_ventilation_Month(String string) {
		selectDateFromNon_invasive_ventilation_Month(string);
	}
	@When ("I click {string} radio option for Cough Assist")
	public void I_click_Automatic_radio_option_for_Cough_Assist(String string) {
		selectRadioButtonByCough_Assist(string);
	}
	@When ("I click {string} radio option for Air filter cleaned Cough Assist")
	public void I_click_Yes_radio_option_for_Air_filter_cleaned_Cough_Assist(String string) {
		selectRadioButtonByAir_filter_cleaned_Cough_Assist(string);
	}
	@When ("I click {string} radio option for Mask_tubing cleaned Cough Assist")
	public void I_click_Yes_radio_option_for_Mask_tubing_cleaned_Cough_Assist(String string) {
		selectRadioButtonByMask_tubing_cleaned_Cough_Assist(string);
	}
	@When ("I select {string} from Cough Assist Date")
	public void I_select_3_from_Cough_Assist_Date(String string) {
		selectDateFromCough_Assist_Date(string);
	}
	@When ("I select {string} from Cough Assist Month")
	public void I_select_Jan_from_Cough_Assist_Month(String string) {
		selectDateFromCough_Assist_Month(string);
	}
}
