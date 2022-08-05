package pixalere.stepdefinitions;

import io.cucumber.java.en.When;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import pixalere.scripts.PixalereMedRATScripts;

public class Tests_PixalereMedRAT extends PixalereMedRATScripts {
	@When("I click {string} radio option for Completed in paper chart field")
	public void i_click_radio_option_for_Completed_in_paper_chart_field(String string) {
		selectRadioOptionFromSection_riskMedRAT(string);
	}

	@When("I click {string} radio option for client's medication regimen field")
	public void i_click_radio_option_for_client_s_medication_regimen_field(String string) {
		selectRadioOptionFromSection_clients_medication_Medrat(string);
	}

	@When("I click {string} radio option for client's medication adherence field")
	public void i_click_radio_option_for_client_s_medication_adherence_field(String string) {
		selectRadioOptionFromSection_clients_medication_adherence(string);
	}

	@When("I select {string} checkbox for medication adherence reasons field")
	public void i_select_checkbox_for_medication_adherence_reasons_field(String string) {
		selectIntakeOutputCheckobx(string);

	}

	@When("I click {string} radio option for  client on any high risk medications field")
	public void i_click_radio_option_for_client_on_any_high_risk_medications_field(String string) {
		selectRadioOptionFromSection_clients_high_risk_medication(string);
	}
	
	@When("I click {string} Based on the information above is the client high risk field")
	public void i_click_radio_Based_on_the_information_above_is_the_client_high_risk_field(String string) {
		selectRadioOptionFromSection_clients_high_risk_medication_Based_on_the_information_above(string);
	}

	@When("I click on Save MedRAT Button")
	public void i_click_on_Save_MedRAT_Button() {
		clickElement(By.xpath("//div[@id='saveEntries']"));
		clickElement(By.xpath("//button[@id='confirm']"));
	}
	
	@When("I start verifying records in MedRAT Page")
	public void i_start_verifying_records_in_MedRAT_Page() {
		verify_MedRat();
	}
	
	@When("I start verifying records in MedRAT Delete Page")
	public void i_start_verifying_records_in_MedRAT_Page_del() {
		verify_MedRatDelete();
	}
	

	
}
