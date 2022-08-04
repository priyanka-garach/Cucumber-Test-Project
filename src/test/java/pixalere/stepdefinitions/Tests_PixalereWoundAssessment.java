package pixalere.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pixalere.scripts.PixalereWoundAssessmentScripts;

public class Tests_PixalereWoundAssessment extends PixalereWoundAssessmentScripts {
	
	@When("I click on abdomen in the given canvas")
	public void i_click_on_abdomen_in_the_given_canvas() {
		clickOnAbdomenCanvas();
	}

	@When("I click on Abdomen from the given images")
	public void i_click_on_Abdomen_from_the_given_images() {
		clickOnAbdomenImage();
	}

	@When("I click on the Abdomen image")
	public void i_click_on_the_Abdomen_image() {
		clickOnBluemanImage();
	}

	@Then("it should put Alpha Character in the image")
	public void it_should_put_Alpha_Character_in_the_image() {
		verifyAlphaLatterOnBluemanImage();
	}
	
	@Then("it should put Numeric Character in the image")
	public void it_should_put_Numeric_Character_in_the_image() {
		verifyNumericLatterOnBluemanImage();
	}
	
	@Then("it should put RoundImage Character in the image")
	public void it_should_put_RoundImage_Character_in_the_image() {
		verifyOstomyImageOnBluemanImage();
	}
	
	@When("I select latest Alpha Character from Assessment")
	public void i_select_latest_Alpha_Character_from_Assessment() {
		selectLatestAlphaCharFromAssessment();
	}
	
	@When("I select latest Numeric Character from Assessment")
	public void i_select_latest_Numeric_Character_from_Assessment() {
		selectLatestNumericCharFromAssessment();
	}
	
	@When("I select latest RoundImage Character from Assessment")
	public void i_select_latest_RoundImage_Character_from_Assessment() {
		selectLatestOstomyImageCharFromAssessment();
	}

	@When("I enter text in {string} section")
	public void i_enter_text_in_section(String field) {
		enterInputAsPerKeyOnWoundProfilePage(field);
	}
	
	@Then("I verify {string} Date on Wound Profile page")
	public void i_verify_Date_on_Wound_Profile_page(String string) {
		verifyLastUpdateTimeOnWoundProfilePage();
	}
	
	@When("I get {string} from Wound Profile popup")
	public void i_get_from_Wound_Profile_popup(String string) {
		getVisitDateTimeOnConfirmPopup();
	}
	
	@When("I select {string} in {string} section")
	public void i_select_in_section(String option, String section) {
		selectAssessmentRadioOptionAsPerKey(option, section);
	}
	
	@When("I select {string} from Product Category section")
	public void i_select_from_Product_Category_section(String option) {
		selectProductCategoryForDerm(option);
	}
	
	@When("I select {string} from {string} section")
	public void i_select_from_section(String option, String section) {
		selectAssessmentRadioOptionAsPerKey2(option, section);
	}

	@When("I click on {string} Button from {string} section")
	public void i_click_on_Button_from_section(String button, String string2) {
		clickOnAssessmentButtonAsPerKey(button);
	}
	
	@When("I select value from {string} popup")
	public void i_select_value_from_popup(String popupText) {
		selectValueFromPopup(popupText);
	}
	
	@Then("Selected value should be set for {string}")
	public void selected_value_should_be_set_for(String field) {
		verifySelectedPainValue(field);
	}
	
	@When("I enter text in {string} text box")
	public void i_enter_text_in_text_box(String section) {
		enterTextboxInputField(section);
	}
	
	@When("I enter Numeric value {string} in {string} popup")
	public void i_enter_Numeric_value_in_popup(String numericVal, String popupText) {
		enterNumericValueAsPerPopup(numericVal, popupText);
	}
	
	@When("I click on Next Button from {string} popup")
	public void i_click_on_Next_Button_from_popup(String string) {
		clickOnNextButtonFromPopup();
	}
	
	@Then("{string} block should displayed")
	public void block_should_displayed(String blockTitle) {
		verifyDisplayedAreaBlock(blockTitle);
	}
	
	@When("I select radio option from {string} section for {string}")
	public void i_select_radio_option_from_section_for(String locationList, String section) {
		selectRadioOptionAsPerLocation(locationList, section);
	}
	
	@Then("The selected {string} section values should display")
	public void the_selected_section_values_should_display(String section) {
		verifySectionValuesAsPerKey(section);
	}
	
	@Then("{string} textarea should display And I enter text in textarea")
	public void textarea_should_display_And_I_enter_text_in_textarea(String string) {
		verifyFistulaTextareaAndEdit();
	}
	
	@When("I select {string} value from {string} section")
	public void i_select_value_from_section(String option, String section) {
		selectOptionFromSection(option, section);
	}
	
	@When("I enter {string} value {string} text box")
	public void i_enter_value_text_box(String inputText, String string2) {
		editQuantityField(inputText);
	}
	
	@When("I click on Each hyperlink from {string} section")
	public void i_click_on_Each_hyperlink_from_section(String section) {
		clickOnEachHyperLink(section);
	}
	
	@Then("{string} and {string} should display with {string} Quantity in {string} section")
	public void and_should_display_with_Quantity_in_section(String value1, String value2, String quantity, String string4) {
		verifyTreatmentElementsByAlphaSection(value1, value2, quantity);
	}
	
	@When("I enter Text in {string} text Area")
	public void i_enter_Text_in_text_Area(String string) {
		enterProgressNoteTextareaInput();
	}
	
	@When("I select Caretype option")
	public void i_select_Caretype_option() {
		selectCaretypeValue();
	}
	
	@When("I select {string} option")
	public void i_select_option(String fieldAndOption) {
		selectOptionAsPerField(fieldAndOption);
	}

	@When("I edit {string} input field")
	public void i_edit_input_field(String field) {
		editNPWTInputFieldAsPerKey(field);
	}

	@When("I select current Date in {string} Date section field")
	public void i_select_current_Date_in_Date_section_field(String field) {
		selectNPWTDatePickerCalenderAsPerKey(field);
	}
	
	@Then("Selected Date should be shown for {string} field")
	public void selected_Date_should_be_shown_for_field(String field) {
		verifySelectedDateAsPerFieldOption(field);
	}

	@Then("{string} page data should saved")
	public void page_data_should_saved(String fieldMessage) {
		waitInterval(5);
		waitForCompletePageLoad();
		System.out.println(fieldMessage+": data should saved..");
	}
	
	@When("I click on {string} from {string} section AND with respect select {string} values from {string} block")
	public void i_click_on_from_section_AND_with_respect_select_values_from_block(String woundBedOptionList, String section, String optionValueList, String optionBlock) {
		editWoundBedSection(woundBedOptionList, section, optionValueList, optionBlock);
	}
	
	@Then("Remaining values like {string} should {string}")
	public void remaining_values_like_should(String exudateCharacteristicsOptionList, String isEnabled) {
		verifyIsEnabledExudateCharacteristicsList(exudateCharacteristicsOptionList, isEnabled);
	}
	
	@When("I enter Numeric value in {string} Assessment popup")
	public void i_enter_Numeric_value_in_Assessment_popup(String popup) {
		enterNumericValueOnPopup(popup);
	}

	@Then("Selected Numeric value should be shown for {string} Assessment")
	public void selected_Numeric_value_should_be_shown_for_Assessment(String fieldOption) {
		verifyNumericValueAsPerFieldOption(fieldOption);
	}
	
	@Then("I verify {string} details on Viewer page")
	public void i_verify_details_on_Viewer_page(String string) {
		verifyWoundAssessmentDetailsOnViewer();
	}
	
	@When("I fill {string} textarea")
	public void i_fill_textarea(String section) {
		fillDermAssessmentTextarea(section);
	}
	
	@When("I select {string} from Diagnosis section with select {string} options")
	public void i_select_from_Diagnosis_section_with_select_options(String alphabet, String optionSelectionList) {
		selectDiagnosisSection(alphabet, optionSelectionList);
	}
	
	@When("I click on {string} div Button from {string} section")
	public void i_click_on_div_Button_from_section(String option, String section) {
		selectOstomyField(option, section);
	}
	
	@When("I click on {string} tab from Wound Profile page")
	public void i_click_on_tab_from_Wound_Profile_page(String assessmentTab) {
		selectAssessmentTab(assessmentTab);
	}
	
	@When("I select {string} value for {string} from {string} section")
	public void i_select_value_for_from_section(String string, String string2, String string3) {
		selectmmXDimensions();
	}
}
