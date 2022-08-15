package pixalere.stepdefinitions;

import org.openqa.selenium.By;

import io.cucumber.java.en.When;
import pixalere.scripts.PixalereIntakeOutputScriptsNursing;

public class Tests_PixalereIntakeOutputNursing extends PixalereIntakeOutputScriptsNursing {
	
	@When("I enter {string} input field IntakeOutput")
	public void i_enter_input_field_IntakeOutput(String inputField) {
		Wait_p(2);
		enterInputFieldAsPerKeyIntakeOutput(inputField);
	}
	
	@When("I select {string} for Drain1_Type IntakeOutput")
	public void I_select_for_Drain1_Type_IntakeOutput(String string1) {
		drp_select_Drain1_Type(string1);
	}
	
	@When("I select {string} for Drain2_Type IntakeOutput")
	public void I_select_for_Drain2_Type_IntakeOutput(String string1) {
		drp_select_Drain2_Type(string1);
	}
	
	@When("I select {string} for Drain3_Type IntakeOutput")
	public void I_select_for_Drain3_Type_IntakeOutput(String string1) {
		drp_select_Drain3_Type(string1);
	}
	
	@When("I select {string} for Stool Consistency")
	public void I_select_for_Stool_Consistency(String string1) {
		drp_select_for_Stool_Consistency(string1);
	}
	
	@When("I click on Save My Work IntakeOutput Button Nursing")
	public void I_click_on_Save_My_Work_IntakeOutput_Button_Nursing() {
		clickElement(By.xpath("//div[@id='saveEntries']"));	
		clickElement(By.xpath("//button[@id='confirm']"));
		System.out.println();
	}
	
	@When("I start verifying records in IntakeOutput Nursing")
	public void I_start_verifying_records_in_IntakeOutput_Nursing() {
		verify_intake_output_Nursing();
	}
	
	
}
