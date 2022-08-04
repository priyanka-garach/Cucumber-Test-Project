package pixalere.stepdefinitions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;

import io.cucumber.java.en.When;
import pixalere.scripts.PixalereClientCareGiverEducation;

public class Tests_PixalereClientCareGiverEducation extends PixalereClientCareGiverEducation {

	public static List<String> CareGiverInitiatedList = new ArrayList<>();
	public static List<String> CareGiverCompleteList = new ArrayList<>();

	@When("I click on {string} for Review of Client Bill of RightsResponsibilities")
	public void i_click_on_for_Review_of_Client_Bill_of_Rights_Responsibilities(String string) {
		if(string.equalsIgnoreCase("Initiated"))
		{
			clickElementWithJQuery(By.xpath("(//div[normalize-space(text()) = 'Review of Client Bill of Rights/Responsibilities']//following-sibling::div)//button[contains(@id,'initiated_btn')]"));
			CareGiverInitiatedList.add("Review of Client Bill of RightsResponsibilities");
		}
		if(string.equalsIgnoreCase("Completed")) {
			clickElementWithJQuery(By.xpath("(//div[normalize-space(text()) = 'Review of Client Bill of Rights/Responsibilities']//following-sibling::div)//button[contains(@id,'completed_btn')]"));
			CareGiverCompleteList.add("Review of Client Bill of RightsResponsibilities");
		}
		System.out.println();
	}

	@When("I click on {string} for {string}")
	public void i_click_on_for_Wounds(String string, String section) {
		if(string.equalsIgnoreCase("Initiated"))
		{
			String s = "(//div[normalize-space(text()) = '%s']//following-sibling::div)//button[contains(@id,'initiated_btn')]";
			clickElementWithJQuery(By.xpath(String.format(s,section)));
			CareGiverInitiatedList.add(section);
		}
		if(string.equalsIgnoreCase("Completed")) {
			String s = "(//div[normalize-space(text()) = '%s']//following-sibling::div)//button[contains(@id,'completed_btn')]";
			clickElementWithJQuery(By.xpath(String.format(s,section)));
			CareGiverCompleteList.add(section);
			
		}
		System.out.println();
	}

	@When("I click on Save My Work for Client Care Giver")
	public void i_click_on_Save_My_Work_for_Client_Care_Giver() {
		clickElement(By.xpath("//button[@id='saveEntries']"));
	}

	@When("I start verifying records for ClientCaregiver Education Checklist")
	public void i_start_verifying_records_for_ClientCaregiver_Education_Checklist() {
		/*void verifycareGiver(){
			System.out.println();
		}*/
	}
}
