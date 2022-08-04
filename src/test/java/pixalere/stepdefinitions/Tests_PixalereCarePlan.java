package pixalere.stepdefinitions;

import org.openqa.selenium.By;

import io.cucumber.java.en.When;
import pixalere.pageObjectUtils.LocatorUtils.CarePlanLocators;
import pixalere.scripts.PixalereCarePlanScripts;

public class Tests_PixalereCarePlan extends PixalereCarePlanScripts {

	@When("I enter {string} input field CarePlan")
	public void i_enter_input_field_CarePlan(String string) {
		enterInputFieldAsPerKey(string);
	}

	@When("I click {string} radio option for Goals Met field")
	public void i_click_radio_option_for_Goals_Met_field(String string) {
		selectRdioOptionCarePlan(string);
	}

	@When("I click on Save My Work Care Plan Button CarePlan")
	public void i_click_on_Save_My_Work_Care_Plan_Button_CarePlan() {
		clickElement(By.xpath("//input[@id='save_careplan']"));
	}

	@When("I click on Save My Work Diabetes Teaching Guidelines Button")
	public void i_click_on_Save_My_Work_Diabetes_Teaching_Button_CarePlan() {
		clickElement(By.xpath("//button[@id='saveEntries']"));
	}

	@When("I click on Save My Work Daily Schedule Button")
	public void i_click_on_Save_My_Work_Daily_Schedule_Button() {
		clickElement(By.xpath("//*[@id='saveEntries']"));
		clickElement(By.xpath("//*[@id='confirm']"));
	}

	@When("I click on {string} Completed Button on Diabetes Teaching Guidelines Page")
	public void i_click_on_Save_My_Work_Diabetes_Teaching_Guidelines_Page(String pattern) {
		complteed_button_click1(pattern);
		complteed_button_click2(pattern);
	}

	@When("I start verifying records in Diabetes Teaching Guidelines Page")
	public void I_start_verifying_records_in_Diabetes_Teaching_Guidelines_Page() {
		verify_diabetes_teaching_page();

	}

	@When("I click on upadte button")
	public void i_click_on_upadte_button() {
		Wait_p(2);
		clickElementWithJQuery(CarePlanLocators.btn_update);
	}

	@When("I click on after Edit Update Care Plan Button")
	public void i_click_on_Update_Care_Button() {
		Wait_p(2);
		clickElement(CarePlanLocators.btnUpdateCareEdit);

	}

	@When("I start verifying records in Prevention Care Plan")
	public void i_start_verifying_records_in_Prevention_Care_Plan() {
		verify_carePlan();
	}
}
