package pixalere.stepdefinitions;

import org.openqa.selenium.By;

import io.cucumber.java.en.When;
import pixalere.scripts.PixalereIntakeOutputScriptsNursing;

public class Tests_PixalereFallRiskNursing extends PixalereIntakeOutputScriptsNursing {
	
	@When("I select {string} checkbox for {string} FallRisk")
	public void i_select_checkbox_for_FallRisk(String string, String string2) {
	    if(string2.equalsIgnoreCase("History of Fall")) {
	    	//chk_Education_FallRisk(string);
	    }
	    
	    if(string2.equalsIgnoreCase("Cogntive impairment")) {
	    	//chk_Education_Cogntive_impairment(string);
	    }
	    
	    if(string2.equalsIgnoreCase("Taking 4 or more medications")) {
	    	//chk_Education_Taking_4_or_more_medications(string);
	    }
	}

	@When("I select {string} from drpdown Handout for History of Fall FallRisk")
	public void i_select_from_drpdown_Handout_for_History_of_Fall_FallRisk(String string) {
	    
	}

	@When("I select checkbox {string} from Referrals\\/rx for History of Fall FallRisk")
	public void i_select_checkbox_from_Referrals_rx_for_History_of_Fall_FallRisk(String string) {
	   
	}

	@When("I enter {string} in script")
	public void i_enter_in_script(String string) {
	   
	}

	@When("I select {string} from drpdown Handout for Cogntive impairment FallRisk")
	public void i_select_from_drpdown_Handout_for_Cogntive_impairment_FallRisk(String string) {
	    
	}

	@When("I select checkbox {string} from Referrals\\/rx for Cogntive impairment FallRisk")
	public void i_select_checkbox_from_Referrals_rx_for_Cogntive_impairment_FallRisk(String string) {
	    
	}

	@When("I select {string} from drpdown Handout for Taking {int} or more medications FallRisk")
	public void i_select_from_drpdown_Handout_for_Taking_or_more_medications_FallRisk(String string, Integer int1) {
	  
	}

	@When("I select checkbox {string} from Referrals\\/rx for Taking {int} or more medications FallRisk")
	public void i_select_checkbox_from_Referrals_rx_for_Taking_or_more_medications_FallRisk(String string, Integer int1) {
	    
	}


	
}
