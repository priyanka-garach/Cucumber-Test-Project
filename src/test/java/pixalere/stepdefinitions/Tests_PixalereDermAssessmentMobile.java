package pixalere.stepdefinitions;

import io.cucumber.java.en.Given;
import pixalere.scripts.PixalereDermAssessmentMobileScripts;

public class Tests_PixalereDermAssessmentMobile extends PixalereDermAssessmentMobileScripts {

	@Given("I create a new derm assessment via API call")
	public void i_create_a_new_derm_assessment_via_API_call() throws Throwable {
		createPatientViaAPICall();
	}
}
