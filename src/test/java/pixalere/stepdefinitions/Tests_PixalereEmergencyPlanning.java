package pixalere.stepdefinitions;
import java.util.ArrayList;

import org.openqa.selenium.By;

import io.cucumber.java.en.When;
import pixalere.scripts.PixalereEmergencyPlanningScripts;

public class Tests_PixalereEmergencyPlanning extends PixalereEmergencyPlanningScripts {
	
	public static ArrayList<String> Emergency_chk = new ArrayList<String>();
	
	@When("I click {string} radio option for Expected Risk of Life field")
	public void i_click_radio_option_for_Expected_Risk_of_Life_field(String string) {
		selectRadioOptionFromSection_risk(string);
	}
	

	@When("I click {string} radio option for Do you live alone in Emergency Planning field")
	public void i_click_radio_option_for_Do_you_live_alone_in_Emergency_Planning_field(String string) {
		selectRadioOptionFromSection_liveAlone(string);
	}

	@When("I click {string} radio option for contact your support contact in case of emergency in Emergency Planning field")
	public void i_click_radio_option_for_contact_your_support_contact_in_case_of_emergency_in_Emergency_Planning_field(String string) {
		selectRadioOptionFromSection_E_planning_field(string);
	}

	@When("I select {string} checkbox for backup plan field")
	public void i_select_checkbox_for_backup_plan_field(String string) {
	 
		switch(string) {
	    	case "Batteries":		
	    		ischeckedCheckbox(By.xpath("//input[@id='backup_plan1']/following-sibling::label"));
	    		Emergency_chk.add(string);
	    		//clickElementWithJQuery(By.xpath("//input[@id='backup_plan1']/following-sibling::label"));
	    		break;
	    	
	    	case "Power Source":
	    		Emergency_chk.add(string);
	    		break;
	    		
	    	case "Oxygen":
	    		ischeckedCheckbox(By.xpath("//input[@id='backup_plan3']/following-sibling::label"));
	    		Emergency_chk.add(string);
	    		break;
	    	
	    	 default:
	    		    // code block
		}
	}

	@When("I click on Save My Emergency Planning Button")
	public void i_click_on_Save_My_Emergency_Planning_Button() {
		clickElement(By.xpath("//div[@id='saveEntries']"));	
		clickElement(By.xpath("//button[@id='confirm']"));
		System.out.println();
	}
	
	@When("I start verifying records for Emergency Planning Page")
	public void I_start_verifying_records_for_Emergency_Planning_Page() {
		verify_Emergency_Planning_page();
	}

	@When("I start verifying records in Emergency Planning Page")
	public void i_start_verifying_records_in_Emergency_Planning_Page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}


}
