package pixalere.stepdefinitions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;

import io.cucumber.java.en.When;
import pixalere.scripts.PixalereClientCareGiverEducation;

public class Tests_PixalereClientCareGiverEducation extends PixalereClientCareGiverEducation {

	@When("I click on {string} for {string}")
	public void i_click_on_for_Wounds(String string, String section) {
		if(string.equalsIgnoreCase("Initiated"))
		{
			call_client_caregiver_education_checklist(section);
			initiated_button_click2(section);
			
		}
		if(string.equalsIgnoreCase("Completed")) {
			call_client_caregiver_education_checklist_for_completed_button(section);
			completed_button_click2(section);
		}
		System.out.println();
	}
	
	@When("I click on Add Other Teaching Button")
	public void I_click_on_Add_Other_Teaching_Button() {
		clickElementWithJQuery(By.id("addOther"));
	}
	
	@When("I click on Save Other Teaching Button")
	public void I_click_on_Save_Other_Teaching_Button() {
		clickElementWithJQuery(By.xpath("//button[normalize-space(text())='Save Other Teaching']"));
	}
	
	@When("I click on other intiated and completed button")
	public void I_click_on_other_intiated_and_completed_button() {
		clickElementWithJQuery(By.id("initiated_btn_other1"));
		Wait_p(1);
		clickElementWithJQuery(By.id("completed_btn_other1"));
	}

	@When("I click on Save My Work for Client Care Giver")
	public void i_click_on_Save_My_Work_for_Client_Care_Giver() {
		clickElement(By.xpath("//button[@id='saveEntries']"));
	}

	@When("I start verifying records for ClientCaregiver Education Checklist")
	public void i_start_verifying_records_for_ClientCaregiver_Education_Checklist() {
		verify_ClientCaregiver_Education_Checklist();
	}
}
