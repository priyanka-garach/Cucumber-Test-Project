package pixalere.stepdefinitions;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pixalere.scripts.PixalereHomePeritonealScripts;

public class Tests_PixalereHomePeritoneal extends PixalereHomePeritonealScripts {

	@When("I click {string} radio option for Modality field")
	public void i_select_radio_option_for_field_mfhome(String section) {
		selectRadioOptionFromSection_mfhome(section);
		
		//selectRadioOptionFromSection_mfhome(section);
	}

	@When("I click {string} radio option for Edema field")
	public void i_select_radio_option_for_field_efhome(String section) {
		selectRadioOptionFromSection_efhome(section);
	}

	@When("I click {string} radio option for Antibiotic Added field")
	public void i_select_radio_option_for_field_aaf(String section) {
		//selectRadioOptionFromSection_aaf(section);
		waitInterval(10);
		selectRadioOptionFromSection_aaf(section);
		System.out.println();
	}

	@When("I click {string} radio option for Dialysate Clear field")
	public void i_select_radio_option_for_field_dsf(String section) {
		selectRadioOptionFromSection_dsf(section);
	}

	@When("I click {string} radio option for Heparin field")
	public void i_select_radio_option_for_field_hf(String section) {
		selectRadioOptionFromSection_hf(section);
	}

	@Then("I click on Save My Work Button on Home Peritoneal Dialysis Page")
	public void i_save_my_work_home_peritoneal_Dialysis() {
		clickElement(By.xpath("//div[@id='saveEntries']"));
		clickElement(By.xpath("//button[@id='confirm']"));
		System.out.println();
	}

	@When("I start verifying records Home Peritoneal Flowchart")
	public void verify_records_vital_page() {
		verify_Home_Peritoneal();
	}

	@When("I select {string} from {string} drop down Home")
	public void i_select_from_dropdown_p(String value, String dropdown) {
		selectDropdownValue_p(dropdown, value);
	}

}
