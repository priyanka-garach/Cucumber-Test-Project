package pixalere.stepdefinitions;

import org.openqa.selenium.By;

import dataProviders.ConfigFileReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pixalere.pageObjectUtils.PixalereCommonUtils;

public class Tests_PixalereCommonStepDefinition extends PixalereCommonUtils {

	@Given("^I setup in Browser$")
	public void i_setup_in_Browser() throws Throwable {
		setUp();
	}

	@Given("^I am enter Pixalere Url$")
	public void i_am_enter_Pixalere_Url() throws Throwable {
		getUrl(ConfigFileReader.getProperties("application.url"));
	}

	@Given("^I login with \"([^\"]*)\" User$")
	public void i_login_with_User(String user) {
		loginInPixalere(user);
	}

	@Given("I login with {string} User-p")
	public void i_login_with_User_p(String user) {
		loginInPixalere_p(user);
	}

	@Then("{string} page should open")
	public void page_should_open(String pageTitle) {
		verifyOpenedPage(pageTitle);
	}

	@Then("{string} page will open")
	public void page_should_open_p(String pageTitle) {
		verifyOpenedPage_p(pageTitle);
		System.out.println();
	}

	@When("I start verifying records in Vital Page")
	public void verify_records_vital_page() {
		verify();
	}

	@When("I start verifying records PCA Pain Pump Flowchart")
	public void verify_records_PCA_Pain_pump() {
		verify_PCA_pain_pump();
	}

	@When("I click on Add Solution button")
	public void clickbuttonAddSolution() {
		clickElement(By.xpath("//button[@id='addPCASolution']"));
		System.out.println();
	}

	@When("I click on Save Solution button")
	public void clickbuttonSaveSolution_PCAPAin() {
		clickElement(By.xpath("((//div[@class='modal-footer'])[last()])/button[contains(text(),'Save Solution')]"));
		System.out.println();
	}

	@When("I Navigate to {string} LH panel option")
	public void i_Navigate_to_LH_panel_option(String administrationOption) {
		navigateToAdministrationPanelOption(administrationOption);
	}
	
	@When("I Navigate to Prevention LH panel option")
	public void i_Navigate_to_Prevention_panel_option() {
		navigateToAdministrationPanelOption("Prevention");
	}
	
	@When("I Navigate-NAMD to {string} LH panel option Non-Authorizer Mobility Device Recommendation")
	public void i_Navigate_to_LH_panel_option_NAMDR(String administrationOption) {
		navigateToAdministrationPanelOptionNAMDR(administrationOption);
	}

	@Then("It should be shown {string} screen")
	public void it_should_be_shown_screen(String activeScreen) {
		verifyActiveScreen(activeScreen);
	}

	@When("I set CIN for Existing User")
	public void i_set_CIN_for_Existing_User() {
		setPatientAsExistingUser();
	}

	@When("I search created patient")
	public void i_search_created_patient() {
		searchPatient();
	}

	@When("I search created patient with PIXID")
	public void i_search_created_patient_pixid() {
		searchPatient_p();
	}
	
	@When("I search created patient with PIXID Nursing")
	public void i_search_created_patient_pixid_nursing() {
		searchPatient_nursing();
	}
	
	@When("I search created patient with PIXID Nursing Discharge Patient")
	public void i_search_created_patient_pixid_nursing_Discharge_Patient() {
		searchPatient_nursing_discharge();
	}
	
	@When("I search created patient with PIXID PT")
	public void i_search_created_patient_pixid_pt() {
		searchPatient_pt();
	}
	@When("I search created patient with PIXID OT")
	public void i_search_created_patient_pixid_ot() {
		searchPatient_ot();
	}
	
	@When("I search created patient with PIXID special for PTAssessement and Teaching")
	public void i_search_created_patient_pixid_for_PTAssessement_and_Teaching() {
		searchPatient_pp();
	}
	
	@When("I search created patient with PIXID special for PTConsent Form")
	public void i_search_created_patient_pixid_for_PTConsent_Form() {
		searchPatient_consentform();
	}
	
	@When("I search created patient with PIXID special for PT_Teaching")
	public void i_search_created_patient_pixid_for_PT_Teaching_agreement() {
		searchPatient_pt_teaching();
	}
	
	@When("I search created patient with PIXID special")
	public void i_search_created_patient_pixid_special() {
		searchPatient_pp();
		
	}

	@When("I click on {string} hyper link")
	public void i_click_on_hyper_link(String hyperLink) {
		clickLinkWithText(hyperLink);
	}

	@When("I click on {string} Button")
	public void i_click_on_Button(String buttonText) {
		clickButtonWithText(buttonText);
	}

	@When("I click on {string} div Button")
	public void i_click_on_div_Button(String divButtonText) {
		clickDivButtonWithText(divButtonText);
	}

	@When("I click on {string} input value Button")
	public void i_click_on_input_value_Button(String inputButtonText) {
		clickOnInputButtonWithText(inputButtonText);
	}

	@When("I click on {string} input value Button on popup")
	public void i_click_on_input_value_Button_on_popup(String inputButtonText) {
		clickOnInputButtonWithTextOnPopup(inputButtonText);
	}

	@When("I click on {string} Button on popup")
	public void i_click_on_Button_on_popup(String buttonText) {
		clickOnButtonWithTextOnPopup(buttonText);
	}

	@Then("{string} popup should open")
	public void popup_should_open(String popupText) {
		verifyPopup(popupText);
	}

	@Then("{string} modal popup should open")
	public void modal_popup_should_open(String popupText) {
		verifyModalPopup(popupText);
	}

	@Then("{string} popup should close")
	public void popup_should_close(String popupText) {
		verifyPopupClosed(popupText);
	}

	@When("I accept Alert popup")
	public void i_accept_Alert_popup() {
		acceptAlertPrompt();
	}

}
