package pixalere.stepdefinitions;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pixalere.scripts.PixalereShowPreventionScripts;

public class Tests_PixalereShowPrevention extends PixalereShowPreventionScripts {

	@When("I click on Next Button")
	public void i_click_Next_Button() {
		clickElement(By.xpath("//*[@id='nextbutton']"));
	}

	@Then("I enter {string} and {string} and {string} for Occiput")
	public void i_enter_and_and_for_Occiput(String a, String b, String c) {
	    radio_Occuiput(a,b,c);
	}

	@Then("I enter {string} and {string} and {string} for Scapula")
	public void i_enter_and_and_for_Scapula(String a, String b, String c) {
		radio_Scapula(a,b,c);
	}

	@Then("I enter {string} and {string} and {string} for Spinous process")
	public void i_enter_and_and_for_Spinous_process(String a, String b, String c) {
		radio_Spinous_process(a,b,c);
	}

	@Then("I enter {string} and {string} and {string} for Elbow")
	public void i_enter_and_and_for_Elbow(String a, String b, String c) {
		radio_Elbow_process(a,b,c);
	}

	@Then("I enter {string} and {string} and {string} for Lliac crest")
	public void i_enter_and_and_for_Lliac_crest(String a, String b, String c) {
		radio_Lliac_crest(a,b,c);
	}

	@Then("I enter {string} and {string} and {string} for Sacrum")
	public void i_enter_and_and_for_Sacrum(String a, String b, String c) {
		radio_Sacrum(a,b,c);
	}

	@Then("I enter {string} and {string} and {string} for Ischial Tuberosity")
	public void i_enter_and_and_for_Ischial_Tuberosity(String a, String b, String c) {
		radio_IschialTuberosity(a,b,c);
	}

	@Then("I enter {string} and {string} and {string} for Erythema")
	public void i_enter_and_and_for_Erythema(String a, String b, String c) {
		radio_Erythema(a,b,c);
	}

	@Then("I enter {string} and {string} and {string} for Heel")
	public void i_enter_and_and_for_Heel(String a, String b, String c) {
		radio_Heel(a,b,c);
	}

	@Then("I enter {string} and {string} and {string} for Sole")
	public void i_enter_and_and_for_Sole(String a, String b, String c) {
		radio_Sole(a,b,c);
	}

	@Then("I enter {string} and {string} and {string} for Ear")
	public void i_enter_and_and_for_Ear(String a, String b, String c) {
		radio_Ear(a,b,c);
	}

	@Then("I enter {string} and {string} and {string} for Shoulder")
	public void i_enter_and_and_for_Shoulder(String a, String b, String c) {
		radio_Shoulder(a,b,c);
	}

	@Then("I enter {string} and {string} and {string} for Anterior iliac spine")
	public void i_enter_and_and_for_Anterior_iliac_spine(String a, String b, String c) {
		radio_Anterior_iliac_spine(a,b,c);
	}

	@Then("I enter {string} and {string} and {string} for Trochanter")
	public void i_enter_and_and_for_Trochanter(String a, String b, String c) {
		radio_Trochanter(a,b,c);
	}

	@Then("I enter {string} and {string} and {string} for Thigh")
	public void i_enter_and_and_for_Thigh(String a, String b, String c) {
		radio_Thigh(a,b,c);
	}

	@Then("I enter {string} and {string} and {string} for Medial knee")
	public void i_enter_and_and_for_Medial_knee(String a, String b, String c) {
		radio_Medial_knee(a,b,c);
	}

	@Then("I enter {string} and {string} and {string} for Lateral knee")
	public void i_enter_and_and_for_Lateral_knee(String a, String b, String c) {
		radio_Lateral_knee(a,b,c);
	}

	@Then("I enter {string} and {string} and {string} for Lower leg")
	public void i_enter_and_and_for_Lower_leg(String a, String b, String c) {
		radio_Lower_leg(a,b,c);
	}

	@Then("I enter {string} and {string} and {string} for Medial malleolus")
	public void i_enter_and_and_for_Medial_malleolus(String a, String b, String c) {
		radio_Medial_malleolus(a,b,c);
	}

	@Then("I enter {string} and {string} and {string} for Lateral malleolus")
	public void i_enter_and_and_for_Lateral_malleolus(String a, String b, String c) {
		radio_Lateral_malleolus(a,b,c);
	}

	@Then("I enter {string} and {string} and {string} for Lateral edge of foot")
	public void i_enter_and_and_for_Lateral_edge_of_foot(String a, String b, String c) {
		radio_Lateral_edge_of_foot(a,b,c);
	}

	@Then("I enter {string} and {string} and {string} for Posterior knee")
	public void i_enter_and_and_for_Posterior_knee(String a, String b, String c) {
		radio_Posterior_knee(a,b,c);
	}

	@Then("I select radio {string} for Risk Level")
	public void i_select_radio_for_Risk_Level(String string) {
	    radio_risk_level(string);
	}

	@Then("I select {string} for Day Date Show Prevention")
	public void i_select_for_Day_Date_Show_Prevention(String string) {
	   selectByVisibleText(By.id("reassessment_date_day"), string);
	}

	@Then("I select {string} for Month Date Show Prevention")
	public void i_select_for_Month_Date_Show_Prevention(String string) {
	   selectByVisibleText(By.id("reassessment_date_month"), string);
	}

	@Then("I click on Save Button Care Plan")
	public void i_click_on_Save_Button_Care_Plan() {
	   clickElement(By.id("save_careplan"));
	}
}
