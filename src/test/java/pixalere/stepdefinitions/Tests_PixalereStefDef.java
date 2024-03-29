package pixalere.stepdefinitions;

import java.io.File;
import java.util.List;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pixalere.pageObjectJavaUtils.JavaUtils;
import pixalere.pageObjectUtils.LocatorUtils.CustomizedLocators;
import pixalere.pageObjectUtils.LocatorUtils.OTLocators;
import pixalere.scripts.PixalereScripts;

public class Tests_PixalereStefDef extends PixalereScripts {
//	public static List<String> SeatingAndMobility_Checkbox = new ArrayList<>();

	@When("I click {string} radio option for {string} field CAM")
	public void i_click_radio_option_for_field_CAM(String string, String string2) {
		selectRdioforfieldCAM(string, string2);
	}

	@When("I click {string} radio option for {string} field Pain Assessment")
	public void I_click_radio_option_for_field_OT(String string, String string2) {
		selectRdioforfieldPainAssessment(string, string2);
	}

	@When("I click on Save Confusion Assessment Method Button")
	public void i_click_on_Save_Confusion_Assessment_Method_Button() {
		clickElement(By.xpath("//*[@id='saveEntries']"));
	}

	@When("I click on Save Confusion Assessment Method TeachingPT Button")
	public void i_click_on_Save_Confusion_Assessment_Method_TeachingPT_Button() {
		// clickElement(By.xpath("//*[@id='saveEntries']"));
	}

	@When("I start verifying records in Confusion Assessment Method Page")
	public void i_start_verifying_records_in_Confusion_Assessment_Method_Page() {
		verify_CAMPAge();
	}

	@When("I click on Save Depression Screening Button")
	public void i_click_on_Save_Depression_Screening_Button() {
		clickElement(By.xpath("//*[@id='saveEntries']"));
		// clickElement(By.xpath("//*[@id='confirm']"));
	}

	@When("I start verifying records in Depression Screening Page")
	public void i_start_verifying_records_in_Depression_Screening_Page() {
		verify_DepressionScreening();
	}

	@When("I select {string} from Relationship dropdown")
	public void I_select_Parents_from_Relationship_dropdown(String string) {
		selectRelation(string);
	}

	@When("I enter {string} input field in script")
	public void i_enter_input_field_OT(String string) {
		enterInputFieldAsPerKeyfromScripts(string);
		System.out.println();
	}
	
	@When("I click on Save As Draft")
	public void i_click_on_Save_As_Draft(String string) {
		clickElement(By.id("draft"));
	}
	
	@When("I select {string} from dropdown of Document Type")
	public void I_select_from_dropdown_of_Document_Type(String value) {
		drp_of_Document_Type(value);
	}

	@When("I verify Document Upload Details")
	public void I_verify_Document_Upload_Details() {
		verify_Document_Upload_Details();
		clickElementWithJQuery(By.xpath("(//td[contains(text(),'Document Name')]//following::tr//td)[5]//a//img"));
	}

	@When("Date of Visit gets inputed")
	public void Date_of_Visit_gets_verified() {
		verify_date_of_visit();
	}

	@When("I click on Save My Work Client Care Summary Button")
	public void I_click_on_Save_My_Work_Client_Care_Summary_Button() {
		clickElement(By.xpath("//*[@id='saveEntries']"));
		clickElement(By.xpath("//*[@id='confirm']"));
	}

	@When("I start verifying records in Client Care Summary Page")
	public void I_start_verifying_records_in_Client_Care_Summary_Page() {
		verify_client_care_cn();
	}

	@When("I start verifying records in PICAT Pediatric Flowchart Page")
	public void I_start_verifying_records_in_PICAT_Pediatric_Flowchart_Page() {
		verify_PICAT_Pediatric_Flowchart();
	}

	@When("I click on Save Client Summary Button")
	public void i_click_on_save_client_summary_button() {
		clickElement(By.xpath("//button[contains(text(),'Save')]"));
	}

	@When("I verify data of client Summary")
	public void i_verify_data_of_client_Summary() {
		verify_client_summary();
	}

	@When("I click on Add More")
	public void i_click_on_Add_More() {
		clickElement(By.xpath("//*[@id='addConcernDiv']"));
	}

	@When("I click on Add button for Exercise one")
	public void i_click_on_Add_Exercise() {
		clickElement(By.xpath("//a[@class='delete proClass']"));
	}

	@When("I click on Add button for Exercise two")
	public void i_click_on_Add_Exercise_two() {
		clickElement(By.xpath("(//a[@class='delete proClass'])[2]"));
	}

	@When("I click on Add button for Exercise three")
	public void i_click_on_Add_Exercise_three() {
		clickElement(By.xpath("(//a[@class='delete proClass'])[3]"));
	}

	@When("I click on Add button for Exercise four")
	public void i_click_on_Add_Exercise_four() {
		clickElement(By.xpath("(//a[@class='delete proClass'])[4]"));
	}

	@When("I click on Add button for Exercise five")
	public void i_click_on_Add_Exercise_five() {
		clickElement(By.xpath("(//a[@class='delete proClass'])[5]"));
	}

	@When("I click on Save VHA Funding Letter Button")
	public void i_click_on_Save_VHA_Funding_Letter_Button() {
		clickElement(By.xpath("//*[@id='saveEntries']"));
		System.out.println();
	}

	@When("I select {string} from {string} dropdown OT")
	public void i_select_from_dropdown_OT(String string, String string2) {
		selectByVisibleText(By.id("cat"), string);
	}

	@When("I click on AddButton on all rows")
	public void i_click_on_AddButton_on_all_rows() {
		clickElementWithJQuery(By.xpath(String.format(OTLocators.LHINAddinRowOrders, "MP1549")));
		enterInputFieldAsPerKeyfromScripts("AdditionalInfo2");
		clickElement(By.xpath("//*[@id='addinfo_']//following::div//div//button"));
		System.out.println();
	}

	@When("I select {string} from Delivery Date dropdown OT")
	public void i_select_from_Delivery_Date_dropdown_OT(String string) {
		selectByVisibleText(By.id("onset_date_day"), "27");
		selectByVisibleText(By.id("onset_date_month"), "Aug");
		selectByVisibleText(By.id("onset_date_day"), "27");
	}

	@When("I click on Place Order Button LHIN")
	public void i_click_on_Place_Order_Button_LHIN() {
		clickElement(By.id("sendRequisition"));
		clickElementWithJQuery(By.xpath("//button[contains(text(),'Confirm')]"));
	}

	@When("I click {string} field OT")
	public void i_click_field(String string) {
		clickElement(By.xpath("//span[contains(text(),'Activity to be Instructed')]//parent::div//a//img"));
	}

	@When("I expand {string} field OT")
	public void i_expand_field(String string) {
		clickElement(By.xpath(String.format("//*[normalize-space(text())='%s']//preceding-sibling::*//a", string)));
	}

	@When("I expand {string} checkbox field OT")
	public void i_expand_checkbox_field(String string) {
		clickElement(By.xpath(String.format(
				"//*[@id='%s-prepop']//ancestor::div[contains(@class,'caption')]//preceding-sibling::*//a",
				string.toLowerCase())));
	}

	@When("I select {string} checkbox for Activity to be Instructed field")
	public void i_select_checkbox_for_Activity_to_be_Instructed_field(String string) {
		String xpath1 = String
				.format("//input[contains(@id,'activity')]//following-sibling::label[contains(text(),'%s')]", string);
		clickElement(By.xpath(xpath1));
	}

	@When("I select {string} checkbox for Consent to be Instructed field")
	public void i_select_checkbox_for_Consent_to_be_Instructed_field(String string) {
		String xpath1 = String
				.format("//input[contains(@id,'consent')]//following-sibling::label[contains(text(),'%s')]", string);
		clickElement(By.xpath(xpath1));
	}

	@When("I select {string} checkbox for Transfer to be Instructed field")
	public void i_select_checkbox_for_Transfer_to_be_Instructed_field(String string) {
		String xpath1 = String
				.format("//input[contains(@id,'transfers')]//following-sibling::label[contains(text(),'%s')]", string);
		clickElement(By.xpath(xpath1));
	}

	@When("I select {string} checkbox for Resources to be Instructed field")
	public void i_select_checkbox_for_Resources_to_be_Instructed_field(String string) {
		String xpath1 = String
				.format("//input[contains(@id,'resources')]//following-sibling::label[contains(text(),'%s')]", string);
		clickElement(By.xpath(xpath1));
	}

	@When("I select {string} checkbox field OT")
	public void i_select_checkbox_field(String string) {
		String xpath1 = String.format("//label[contains(text(),'%s')]", string);
		clickElement(By.xpath(xpath1));
		System.out.println();
	}

	@When("I click on Save My Work Teaching Agreement Button")
	public void i_click_on_Save_My_Work_Teaching_Agreement_Button() {
		clickElement(By.xpath("//*[@id='saveEntries']"));
		System.out.println();
	}

	@When("I start verifying records in Teaching Agreement Page")
	public void i_start_verifying_records_in_Teaching_Agreement_Page() {
		verify_teaching_agreement();
	}

	@When("I click on Save My Work for cough assist Button")
	public void i_click_on_Save_My_Work_for_cough_assist_Button() {
		clickElement(By.xpath("(//*[@id='saveEntries'])[3]"));
	}

	@When("I start verifying records in Respiratory Flowcharts Page")
	public void I_start_verifying_records_in_Respiratory_Flowcharts_Page() {
		verify_Respiratory_flowchart_page();
	}

	@When("I start verifying records in Respiratory Flowcharts Page Suctioning")
	public void I_start_verifying_records_in_Respiratory_Flowcharts_Page_Suctioning() {
		verify_Respiratory_flowchart_page_Suctioning();
	}

	@When("I start verifying records in Respiratory Flowcharts Page non-invasive ventiltion")
	public void I_start_verifying_records_in_Respiratory_Flowcharts_Page_non_invasive_ventiltion() {
		verify_Respiratory_flowchart_page_non_invasive_ventiltion();
	}

	@When("I select {string} Checkbox from Instruct the Client field")
	public void i_select_checkbox_from_Instruct_the_Client_field(String string) {
		chk_instruct_client_field(string);
	}

	@When("I click on Save My Work 30 Second Sit-Stand Button")
	public void i_click_on_Save_My_Work_Second_Sit_Stand_Button_Button() {
		System.out.println();
		clickElement(By.xpath("//*[@id='sendRequisition']"));
	}

	@When("I click on Save My Work 30 Second Sit-Stand Button PT Assessment")
	public void i_click_on_Save_My_Work_Second_Sit_Stand_Button_Button_PT_Assessment() {
		System.out.println();
		// clickElement(By.xpath("//*[@id='sendRequisition']"));
	}

	@When("I click on Save As Draft PTAssessment")
	public void i_click_on_Save_As_Draft_PT_Assessment() {
		System.out.println();
		clickElement(By.xpath("//*[@id='sendRequisition']"));
	}

	@When("I start verifying records in 30 Second Sit-Stand Page")
	public void i_start_verifying_records_in_Second_Sit_Stand_Page() {
		verify_Second_Sit_Stand();
	}

	@When("I click on Long Button")
	public void i_click_on_short_button() {
		clickElement(By.id("longForm"));
	}

	@When("I click {string} radio option for {string} field PT")
	public void I_click_radio_option_PT(String value1, String value2) {
		selectRdioforfieldPT(value1, value2);
	}

	@When("I get Balance_Gait score")
	public void I_get_Balance_Gait_score() {
		getBalance_Gait();
	}

	@When("I click on Save My Work Berg Balance Scale Button")
	public void I_click_Save_Berg_Balance_Scale_PT() {
		clickElement(By.xpath("//*[@id='sendRequisition']"));

	}

	@When("I start verifying records in Berg Balance Scale Page")
	public void I_verify_Berg_Balance_Scale_PT() {
		System.out.println();
		verify_Berg_Balance();

	}

	@When("I click on Save My Work Tinetti Button")
	public void I_click_Save_My_Work_Tinetti_Button_PT() {
		clickElement(By.xpath("//*[@id='sendRequisition']"));

	}

	@When("I start verifying records in Tinetti Page")
	public void I_verifying_records_in_Tinetti_Page_PT() {
		verify_Tinetti_page();
	}

	@When("I click on Save My Work Time up and Go Button")
	public void I_click_onSave_MyworkTime_up_go_button_Page_PT() {
		clickElement(By.xpath("//*[@id='sendRequisition']"));
	}

	@When("I start verifying records in Time up and Go Page")
	public void I_start_verifying_records_in_Time_up_and_Go_Page_PT() {
		verify_time_up_and_Go_page();
	}

	// *** Pain Asssement***//

	@When("I verify Date of Onset from calendar")
	public void I_verify_Date_of_Onset_from_calendar() {
		System.out.println();
	}

	// ***FIM***///
	@When("I select {string} from {string} for Self-Care Category dropdown")
	public void i_select_from_for_Self_Care_Category_dropdown(String string, String string2) {
		selectdropdownforFIM(string, string2);
	}

	@When("I tick checkbox for Data obtained from other Discipline")
	public void I_tick_checkbox_for_Data_obtained_from_other_Discipline() {
		clickElementWithJQuery(By.xpath("//input[@id='client-prepop']//following-sibling::label"));
	}

	@When("I select {string} from {string} for Sphincter Control dropdown")
	public void i_select_from_for_Sphincter_Control_dropdown(String string, String string2) {
		selectdropdownforSphincterFIM(string, string2);
	}

	@When("I select {string} from {string} for Transfers dropdown")
	public void i_select_from_for_Transfers_dropdown(String string, String string2) {
		selectdropdownforFIM(string, string2);
	}

	@When("I select {string} from {string} for Locomotion dropdown")
	public void i_select_from_for_Locomotion_dropdown(String string, String string2) {
		selectdropdownforFIM(string, string2);
	}

	@When("I select {string} from {string} for Communication dropdown")
	public void i_select_from_for_Communication_dropdown(String string, String string2) {
		selectdropdownforFIM(string, string2);
	}

	@When("I click on Save My Work Functional Independence Measure Button")
	public void i_click_on_Save_My_Work_Functional_Independence_Measure_Button() {
		System.out.println();
		clickElement(By.xpath("//*[@id='sendRequisition']"));
		System.out.println();
	}

	@When("I start verifying records in Functional Independence Measure Page")
	public void i_start_verifying_records_in_Functional_Independence_Measure_Page() {
		verify_FIM_page();
	}
	// *****FIM over ******///////

	/// ******CAM PT *****/////////

	@When("I click {string} radio option for {string} field PT CAM")
	public void i_click_radio_PT_CAM(String value1, String value2) {
		selectRdioforfieldPTCAM(value1, value2);
	}

	@When("I start verifying records in Confusion Assessment Method Page PT")
	public void i_start_verifying_records_in_Confusion_Assessment_Method_Page_PT() {
		verify_PTCAMPAge();
	}

	@When("I start verifying records in Recommendations Sheet Page")
	public void I_start_verifying_records_in_Recommendations_Sheet_Page_PT() {
		verify_RecommendationsPAge();
	}

	@When("I select {string} from Exercise handout dropdown")
	public void I_select_from_Exercise_handout_dropdown_PT(String value) {
		selectByVisibleText(By.id("excHandout"), value);
		System.out.println();

	}

	@Then("I verify record after add button")
	public void I_verify_record_after_add_button() {
		verify_RecordAfterAdd_ExcersizeProgram();
	}

	@When("I start verifying records in PT Assessment Page")
	public void I_start_verifying_records_in_PT_Assessment_Page() {
		verify_PT_Assessment_Page();
	}

	@When("I start verifying records in Exercise Program Page")
	public void I_start_verifying_records_in_Exercise_Program_Page() {
		verify_ExcersizeProgramPage();
	}

	@When("I click on ckeckbox label {string} PT Assessment")
	public void I_click_on_ckeckbox_label_PT_Assessment(String value) {
		Wait_p(2);
		clickElement(By.xpath(String.format("//label[normalize-space(text())='%s']", value)));
	}

	@When("I click on Save as Draft and Continue Button")
	public void I_click_on_Save_as_Draft_and_Continue_Button_PT_Assessment() {
		clickElement(By.id("saveAndnext"));
	}

	@When("I start verifying records in Teaching Agreement PT Page")
	public void I_start_verifying_records_in_Teaching_Agreement_PT_Page() {
		verify_TeachingAgreementPT();
	}

	@When("I start verifying records in Tracheostomy and Ventilator Record Page")
	public void I_start_verifying_records_in_Tracheostomy_and_Ventilator_Record_Page() {
		verify_Tracheostomy_and_Ventilator_Record_Page();
	}

	@When("I click on Save My Work In-Home Safety Identification Tool Button HSI")
	public void I_click_on_Save_My_Work_In_Home_Safety_Identification_Tool_Button_HSI() {
		clickElement(By.xpath("//*[@id='saveEntries']"));
		clickElement(By.xpath("//*[@id='confirm']"));
	}

	@When("I start verifying records in In-Home Safety Identification Tool Flowchart Record Page")
	public void i_start_verifying_records_in_In_Home_Safety_Identification_Tool_Flowchart_Record_Page() {
		verifying_records_in_In_Home_Safety_Identification_Tool_Flowchart_Record_Page();
	}

	@When("I start verifying records in In-Home Safety Identification Tool Flowchart Record Page Nursing")
	public void i_start_verifying_records_in_In_Home_Safety_Identification_Tool_Flowchart_Record_Page_Nursing() {
		verifying_records_in_In_Home_Safety_Identification_Tool_Flowchart_Record_Page_Nursing();
	}

	@When("I click {string} radio option for Cough Assist field")
	public void I_click_radio_option_for_Cough_Assist_field(String string) {
		clickElement(By.xpath("(//input[contains(@id,'cough_assist')]//following-sibling::label)[1]"));
	}

	@When("I click {string} radio option for {string} Non-invasive ventilation field")
	public void I_click_radio_option_for_Cough_Assist_Non_invasive_ventilation(String string, String string2) {
		String xpath1 = String.format("(((//label[normalize-space(text())='%s'])[1])/following-sibling::div//label)[1]",
				string2);
		clickElement(By.xpath(xpath1));
	}

	@When("I click {string} radio option for {string} field cough assist")
	public void I_click_radio_option_for_Cough_Assist_field_radio(String string, String string2) {
		String xpath1 = String.format("(((//label[normalize-space(text())='%s'])[2])/following-sibling::div//label)[1]",
				string2);
		clickElement(By.xpath(xpath1));
	}

	@When("I click {string} radio option for Non-invasive ventilation field")
	public void I_click_radio_option_for_Non_invasive_ventilation_field(String string) {
		clickElement(By.xpath("(//input[contains(@id,'ventilation')]//following-sibling::label)[1]"));
	}

	@When("I click on Save My Work Non-invasive ventilation Button")
	public void I_click_on_Save_My_Work_Non_invasive_ventilation_Button() {
		clickElement(By.xpath("(//*[@id='saveEntries'])[2]"));
	}

	@When("I click on Save My Work Suctioning Button")
	public void I_click_on_Save_My_Work_Suctioning_Button() {
		clickElement(By.xpath("(//*[@id='saveEntries'])[1]"));
	}

	@When("I click {string} radio option for {string} field IV field")
	public void I_click_on_Save_My_Work_Non_invasive_ventilation_Button_radio(String string, String string2) {
		String xpath1 = String.format("(//label[contains(text(),'%s')]//following-sibling::div//label)[1]", string2);
		clickElement(By.xpath(xpath1));
	}

	@When("I click on Save My Work Non-Verbal Pediatric Pain Button")
	public void I_click_on_Save_My_Work_Non_Verbal_Pediatric_Pain_Button() {
		clickElement(By.xpath("(//*[@id='saveEntries'])[1]"));
	}

	@When("I click on Save My Work Pain Considerations Pain Button")
	public void I_click_on_Save_My_Work_PainConsiderations_Pain_Button_two() {
		clickElement(By.xpath("(//*[@id='saveEntries'])[2]"));
	}

	@When("I click on Save My Work Pain Management: Interventions Button three")
	public void I_click_on_Save_My_Work_Pain_Management_Interventions_Button_three() {
		clickElement(By.xpath("(//*[@id='saveEntries'])[3]"));
	}

	@When("I select {string} from childs current pain score field dropdown OT")
	public void I_select_from_childs_current_pain_score_field_dropdown_OT(String s) {
		selectdropdownforINRS(s);
	}

	@When("I select {string} from childs current pain score")
	public void I_select_from_childs_current_pain_score(String s) {
		selectdropdownforINRS(s);
	}

	@When("I select {string} from Type of Assessment")
	public void I_select_Initial_from_Type_of_Assessment(String string) {
		selectCheckboxForTypeOfAssessment(string);
	}

	@When("I start verifying records in Individualized Numeric Rating Scale Page")
	public void I_start_verifying_records_in_Individualized_Numeric_Rating_Scale_Page() {
		verify_INRSP_CN();
	}

	@When("I click {string} radio option for {string} field 60")
	public void I_click_radio_option_for_field_OT_60(String value, String section) {
		selectradiofor60(value, section);
	}

	@When("I click on image of Left foot Body Parts")
	public void I_click_on_image_of_Left_foot_Body_Parts() {
		clickElementWithJQuery(By.xpath("//div[@id='left_1']"));
		clickElementWithJQuery(By.xpath("//div[@id='left_5']"));
		clickElementWithJQuery(By.xpath("//div[@id='left_6']"));
	}

	@When("I click on image of Right foot Body Parts")
	public void I_click_on_image_of_Right_foot_Body_Parts() {
		clickElementWithJQuery(By.xpath("//div[@id='right_1']"));
		clickElementWithJQuery(By.xpath("//div[@id='right_2']"));
		clickElementWithJQuery(By.xpath("//div[@id='right_10']"));
	}

	@When("I read left foot score")
	public void I_read_left_foot_score() {
		readingscore();
	}

	@When("I read right foot score")
	public void I_read_right_foot_score() {
		readingscore();
	}

	@When("I read Left Foot Image Score")
	public void I_read_Left_Foot_Image_Score() {
		readingscore();
	}

	@When("I read Right Foot Image Score")
	public void I_read_Right_Foot_Image_Score() {
		readingscore();
	}

	@When("I start verifying records in Sensory Assessment Flowchart Page")
	public void I_start_verifying_records_in_Sensory_Assessment_Flowchart_Page() {
		verify_Sensory_assess_flowchart();
	}

	@When("I start verifying records in Fall Risk History Page")
	public void I_start_verifying_records_in_Fall_Risk_History_Page() {
		verify_Fall_Risk_History_Page();
	}

	@When("I start verifying records in Pain Profile Flowchart Page")
	public void I_start_verifying_records_in_Pain_Profile_Flowchart_Page() {
		verify_Pain_Profile_Page();
	}

	@When("I start verifying records in Pain Assessment Flowchart Page")
	public void I_start_verifying_records_in_Pain_Assessment_Flowchart_Page() {
		verify_Pain_Assessment_Flowchart_Page();
	}

	@When("I select {string} checkbox for Quality of Pain field")
	public void I_select_checkbox_for_Quality_of_Pain_field(String string1) {

		chk_quality_of_pain_ass(string1);
	}

	@When("I select {string} from Dropdown Frequency field")
	public void Drp_ferquency(String s1) {
		drp_frequency_pain_ass(s1);
	}

	@When("I select Day as {string} from calendar Pain Assesment")
	public void Day_one(String s1) {
		day_one_pain_ass(s1);
	}

	@When("I select Month as {string} from calendar Pain Assesment")
	public void Month_one(String s1) {
		month_one_pain_ass(s1);
	}

	@When("I select Day as {string} from calendar Pain Assesment last BM")
	public void Day_one_last_BM(String s1) {
		day_one_pain_ass_last_BM(s1);
	}

	@When("I select Month as {string} from calendar Pain Assesment last BM")
	public void Month_one_last_BM(String s1) {
		month_one_pain_ass_last_BM(s1);
	}

	@When("I select {string} checkbox for Accompanying Symptom field")
	public void I_select_checkbox_for_Accompanying_Symptom_field(String string1) {
		chk_Accompanying_Symptom_pain_ass(string1);
	}

	@When("I select {string} checkbox for Non-Pharmacological Intervention field")
	public void I_select_checkbox_for_NonPharmacological_Intervention_field(String string1) {
		chk_onPharmacological_Intervention_pain_ass(string1);

	}

	@When("I select {string} from Dropdown Frequency field OT")
	public void I_select_from_Dropdown_Frequency_field_OT(String string) {
		selectByVisibleText(By.id("frequency"), string);
	}

	// ************* *************//
	@When("I select {string} checkbox for Handouts provided field MACH")
	public void I_select_checkbox_for_Handouts_provided_field_MACH(String string1) {
		selectchk_provided_field_MACH(string1);

	}

	@When("I select {string} checkbox for ConsultsReferrals made to field MACH")
	public void I_select_checkbox_for_ConsultsReferrals_made_to_field_MACH(String string1) {
		selectchk_ConsultsReferrals_made_to_field_MACH(string1);

	}

	@When("I click {string} radio option for {string} field MAHC")
	public void I_click_radio_option_for_field_MAHC(String string1, String string2) {
		selectRdioforfieldMAHC(string1, string2);
	}

	@When("I select {string} checkbox for Prior history of falls within three months field MACH")
	public void i_select_checkbox_for_Prior_history_of_falls_within_months_field_MACH(String string) {
		selectchk_Prior_history_of_falls_within_three_months_field_MACH(string);
	}

	@When("I select {string} checkbox for Visual Impairment field MACH")
	public void i_select_checkbox_for_Visual_Impairment_field_MACH(String string) {
		if (string.equalsIgnoreCase("MD")) {
			String xpath1 = String.format("(//label[contains(@for,'impairment_consult')])[1]", string);
			clickElementWithJQuery(By.xpath(xpath1));
		}
		if (string.equalsIgnoreCase("OT")) {
			String xpath1 = String.format("(//label[contains(@for,'impairment_consult')])[3]", string);
			clickElementWithJQuery(By.xpath(xpath1));
		}
		if (string.equalsIgnoreCase("PT")) {
			String xpath1 = String.format("(//label[contains(@for,'impairment_consult')])[4]", string);
			clickElementWithJQuery(By.xpath(xpath1));
		}
	}

	@When("I select {string} checkbox for Impaired Functional Mobility field MACH")
	public void i_select_checkbox_for_Impaired_Functional_Mobility_field_MACH(String string) {
		chk_Impaired_Functional_Mobility_handOuts(string);
	}

	@When("I select {string} checkbox for Pain affecting level of function field MACH")
	public void i_select_checkbox_for_Pain_affecting_level_of_function_field_MACH(String string) {
		chk_Pain_affecting_level_of_function_handOuts(string);
	}

	@When("I select {string} checkbox for Gait Aid Use field MACH")
	public void i_select_checkbox_for_Gait_Aid_Use_field_MACH(String string) {
		chk_Gait_Aid_Use_field_handOuts(string);

	}

	@When("I select {string} checkbox for FootFootwear Concerns field MACH")
	public void i_select_checkbox_for_FootFootwear_Concerns_field_MACH(String string) {
		chk_FootFootwear_Concerns_field_MACH(string);
	}

	@When("I get MAHC-10 Fall Risk Score")
	public void I_get_MAHC_10_Fall_Risk_Score() {
		get_MAHC_10_Fall_Risk_Score();
	}

	@When("I click on Save My MAHC Fall Risk Assessment Button")
	public void i_click_on_Save_My_MAHC_Fall_Risk_Assessment_Button() {
		clickElement(By.xpath("//*[@id='saveEntries']"));
		clickElement(By.xpath("//*[@id='confirm']"));
	}

	@When("I start verifying records in MAHC Fall Risk Assessment Page")
	public void i_start_verifying_records_in_MAHC_Fall_Risk_Assessment_Page() {
		verify_MAHC_Fall_Risk_Assessment();
	}

	@When("I verified Psychosocial Assessment")
	public void i_verified_Psychosocial_Assessment() {
		var_Psychosocial_Assessment();
	}

//////////////////////////ICAT START//////////////////////////////
	@When("I select {string} from Primary Diagnosis dropdown OT")
	public void i_select_from_Primary_Diagnosis_dropdown_OT(String string) {
		select_ByIndex(By.id("primary_diagnosis"), Integer.parseInt(string));
	}

	@When("I select {string} from Co-morbidities dropdown OT")
	public void i_select_from_Comorbidities_dropdown_OT(String string) {
		select_ByIndex(By.id("current_comorbidities"), Integer.parseInt(string));
	}

	@When("I select {string} from Home Self-Monitoring dropdown OT")
	public void i_select_from_Home_Self_Monitoring_dropdown_OT(String string) {
		select_ByIndex(By.id("home_self_mon"), Integer.parseInt(string));
	}

	@When("I select {string} radio option for any chronic diseases OT")
	public void i_select_radio_option_for_any_chronic_diseases_OT(String string) {
		selctradiochronic(string);

	}

	@When("I select {string} radio option for eyes ears nose Problem identified one OT")
	public void I_select_radio_option_for_eyes_ears_nose_Problem_identified_oneOT(String string) {

		selctradioeyesearsthroat_one(string);

	}

	@When("I select {string} radio option for eyes ears nose Problem identified two OT")
	public void I_select_radio_option_for_eyes_ears_nose_Problem_identified_twoOT(String string) {

		selctradioeyesearsthroat_two(string);

	}

	@When("I select {string} radio option for eyes ears nose Problem identified three OT")
	public void I_select_radio_option_for_eyes_ears_nose_Problem_identified_threeOT(String string) {

		selctradioeyesearsthroat_three(string);

	}

	@When("I select {string} radio option for eyes ears nose Problem identified four OT")
	public void I_select_radio_option_for_eyes_ears_nose_Problem_identified_fourOT(String string) {

		selctradioeyesearsthroat_four(string);

	}

	@When("I select {string} radio option for eyes ears nose Hearing Device OT")
	public void I_select_radio_option_for_eyes_ears_nose_Hearing_DeviceOT(String string) {

		selctradioeyesearsthroathd(string);

	}

	@When("I select {string} radio option for Depression Screening Tool one OT")
	public void I_select_radio_option_for_Depression_Screening_Tool_one_OT(String string) {
		selectradiodepressiontoolone(string);
	}

	@When("I select {string} radio option for Depression Screening Tool Two OT")
	public void I_select_radio_option_for_Depression_Screening_Tool_Two_OT(String string) {
		selectradiodepressiontooltwo(string);
	}

	@When("I select {string} radio option for pain OT")
	public void I_select_radio_option_for_pain_OT(String string) {
		selectradiodpain(string);
	}

	@When("I select score {string} radio option for {string} OT")
	public void I_select_score_radio_option_for_OT(String value1, String value2) {
		selctradiodepressiontool(value1, value2);
	}

	@When("I select {string} radio option for home self-monitoring OT")
	public void i_select_radio_option_for_home_self_monitoring_OT(String string) {
		selctradiohomeselfmonitoring(string);

	}

	@When("I select {string} radio option for Gastrointestinal Assessment Not Assessed Bowel Movement Regular OT")
	public void i_select_radio_option_for_Gastrointestinal_Assessment_Not_Assessed_Bowel_Movement_Regular_OT(
			String string) {
		selectradionotassessedbowlmovementregular(string);
	}

	@When("I select {string} radio option for Gastrointestinal Assessment Change in Bowel Pattern OT")
	public void i_select_radio_option_for_Gastrointestinal_Assessment_Change_in_Bowel_Pattern_OT(String string) {
		selectradiochangeinbowelpattern(string);
	}

	/*
	 * @When("I select {string} from Home Self-Monitoring dropdown OT") public void
	 * i_select_from_Home_Self_Monitoring_dropdown_OT(String string) { // Write code
	 * here that turns the phrase above into concrete actions
	 * select_ByIndex(By.id("Home Self-Monitoring (check all that apply)"),
	 * Integer.parseInt(string)); }
	 */

	@When("I verified Cardiovascular History data")
	public void i_verified_Cardiovascular_History_data() {
		var_Cardiovascular_History_data();
	}

	@When("I verified Respiratory History data")
	public void i_verified_Respiratory_History_data() {
		var_Respiratory_History_data();
	}

	@When("I verified Respiratory Assessment data")
	public void i_verified_Respiratory_Assessment_data() {
		var_Respiratory_Assessment_data();
	}

	@When("I verified Eyes Ears Nose Throat History data")
	public void i_verified_Eyes_Ears_Nose_Throat_History_data() {
		var_Eyes_Ears_Nose_Throat_data();
	}

	@When("I verified Neurological History")
	public void i_verified_Neurological_History() {
		var_Neurological_History_data();
	}

	@When("I verified Neurological Assessment")
	public void i_verified_Neurological_Assessment() {
		var_Neurological_Assessment_data();
	}

	@When("I verify checkboxe data for Effects of Pain on Activities of Daily Living")
	public void i_verified_Effects_of_Pain_on_Activities_of_Daily_Living() {
		var_Pain_on_Activities_of_Daily_Living_data();
	}

	@When("I verify click on blueman image left")
	public void I_click_on_blueman_image_left() {
		verify_image_left();

	}

	@When("I verify click on blueman image right")
	public void I_click_on_blueman_image_right() {
		verify_image_right();
	}

	@When("I verified Endocrine Assessment")
	public void i_verified_Endocrine_Assessment() {
		var_Endocrine_Assessment_data();
	}

	@When("I verified Gastrointestinal History")
	public void i_verified_Gastrointestinal_History() {
		var_Gastrointestinal_History_data();
	}

	@When("I verified Gastrointestinal Assessment")
	public void i_verified_Gastrointestinal_Assessment() {
		var_Gastrointestinal_Assessment_data();
	}

	@When("I verified Genitourinary History")
	public void i_verified_Genitourinary_History() {
		var_Genitourinary_History();
	}

	@When("I verified Genitourinary Assessment")
	public void i_verified_Genitourinary_Assessment() {
		var_Genitourinary_Assessment();
	}

	@When("I verified Depression Screening Tool")
	public void i_verified_Depression_Screening_Tool() {
		var_Depression_Screening_Tool();
	}

	@When("I verified Pain")
	public void i_verified_Pain() {
		var_verified_pain();
	}

	@When("I verified Cognition")
	public void i_verified_Cognition() {
		var_verified_Cognition();
	}

	/*
	 * @When("I verified Psychosocial Assessment") public void
	 * i_verified_Psychosocial_Assessment() { var_Psychosocial_Assessment(); }
	 */

	@When("I verified Musculoskeletal Assessment")
	public void i_verified_Musculoskeletal_Assessment() {
		var_Musculoskeletal_Assessment();
	}

	@When("I verified AlternativeComplimentary Therapies")
	public void i_verified_Alternative_Complimentary_Therapies() {
		var_Alternative_Complimentary_Therapies();
	}

	@When("I verified nursing intervention")
	public void i_verified_nursing_intervention() {
		var_nursing_intervention();
	}

	@When("I start verifying records in ICAT Flowchart Page")
	public void i_start_verifying_records_in_ICAT_Flowchart_Page() {
		verify_ICAT_Flowchart_Page();
	}
//////////ICAT STOP///////////

	/* Seating and Mobility *///////////////////

	@When("I click on {string} checkbox Button SM")
	public void i_click_on_checkbox_Button_SM(String string) throws InterruptedException {
		Thread.sleep(5000);
		clickElement(By.xpath(String.format("//label[normalize-space(text())='%s']", string)));
	}

	@When("I click on {string} Radio Button")
	public void I_click_on_SeatingAndMobility_Radio_Button(String string) {
		selectRadioButton_SeatingAndMobility(string);
	}

	@When("I save my work for above SM")
	public void i_save_my_work_for_above_SM() {
		clickElementWithJQuery(By.xpath("//button[contains(text(),'Add My Electronic Signature and Save My Work')]"));
		System.out.println("Work Saved");
	}

	@When("I saveAsDraft for Authorizer Involved in Service")
	public void i_saveAsDraft_for_Authorizer_Involved_in_Service() {
		clickElement(By.xpath("(//button[@id='draft'])[6]"));
	}

	@When("I click on radio button for {string}")
	public void i_click_on_radio_button_for(String string) {
		clickElement(By.xpath("(//label[contains(@for,'client_adp_eligible')])[1]"));
	}

	@When("I click checkbox for {string}")
	public void i_click_checkbox_for(String string) {
		clickElementWithJQuery(By.xpath(String.format("//label[contains(text(),'%s')]", string)));
//		SeatingAndMobility_Checkbox.add(string);	
		checkboxData.add(string);
	}

	@When("I click checkbox for {string} at {string}")
	public void i_click_checkbox_for(String string, String index) {
		clickElementWithJQuery(By.xpath(String.format("(//label[contains(text(),'%s')])[" + index + "]", string)));
//		SeatingAndMobility_Checkbox.add(string);	
	}

	@When("I click on checkbox for Client_Substitute Decision Maker has requested and agrees to communication via text")
	public void I_click_on_checkbox_for_Client_Substitute_Decision_Maker_has_requested_and_agrees_to_communication_via_text() {
		clickElementWithJQuery(By.xpath("//label[@for='agrees_to_text']"));
	}

	@When("I click on Other checkbox for Service Consent Obtained")
	public void I_click_on_Other_checkbox_for_Service_Consent_Obtained() {
		clickElementWithJQuery(By.xpath("//*[contains(@id,'other_label')][1]"));
	}

	@When("I start verifying records in Non-Authorizer Mobility Device Recommendation Page")
	public void i_start_verifying_records_in_Non_Authorizer_Mobility_Device_Recommendation_Page() {
		verifyNon_Authorizer_Mobility_Device_Recommendation_Page();
		System.out.println("Data verified");
	}

	@When("I click on Check All Button")
	public void i_click_on_Check_All_Button() {
		clickElement(By.xpath("//input[@name='tickAll']"));
	}

	@When("I click on Add Joint Button")
	public void i_click_on_Add_Joint_Button() {
		clickElement(By.xpath("//*[@name='addJoint']"));
	}

	@When("I click on Save Button PTJointMovement")
	public void i_click_on_Save_Button_PTJointMovement() {
		clickElement(By.xpath("//button[contains(text(),'Submit')]"));
		clickElement(By.xpath("//*[@id='saveEntriesAI']"));
	}

	@When("I start verifying records in Joint Movement Page")
	public void i_verifying_records_in_Joint_Movement_Page() {
		verify_Joint_Movement();
	}

	@When("I start verifying records in Client Consent Page")
	public void i_verifying_records_in_Client_Consent_Page() {
		verify_Client_Consent();
	}

	@When("I click on Virtual Care Consent to Open PopUp")
	public void i_click_on_Virtual_Care_Consent_to_Open_PopUp() {
		clickElement(By.xpath("(//div[@class='titl-crt'])[4]"));
	}

	@When("I click on Email Use For Communication Requested by Client_SDM to Open PopUp")
	public void I_click_on_Email_Use_For_Communication_Requested_by_Client_SDM_to_Open_PopUp() {
		clickElementWithJQuery(By.xpath("//*[@id='ClientConsentForm']/div/div/div[2]/div[4]/div[1]/div[3]/span"));
	}

	@When("I click on Text Use For Communication Requested by Client_SDM Open PopUp")
	public void I_click_on_Text_Use_For_Communication_Requested_by_Client_SDM_to_Open_PopUp() {
		clickElementWithJQuery(By.xpath("//*[@id='ClientConsentForm']/div/div/div[2]/div[5]/div[1]/div[3]/span"));

	}

	@When("I click on Required for video checkbox")
	public void i_click_on_Required_for_video_checkbox() {
		clickElement(By.xpath("//*[@for='e_consent']"));
	}

	@When("I verified data for {string}")
	public void i_verified_data_for(String string) {
		var_verified_Cognition();
	}

	@When("I click on radio button {string} CC")
	public void i_click_on_radio_button_CC(String string) {
		clickElement(By.xpath("//label[@id='e_consent_tel_label3']//span[contains(@class,'box')]"));
	}

	@When("I click on radio button two {string} CC")
	public void i_click_on_radio_button_two_CC(String string) {
		clickElement(By.xpath("(//*[@id='md-radio-e_consent_video_1'])"));
	}

	@When("I click on radio button {string} for Service Consent Obtained")
	public void I_click_on_radio_button_Yes_for_Service_Consent_Obtained(String section) {
		clickElement(CustomizedLocators.getRadioOptionBy_Service_Consent_Obtained(section));
	}

	@When("I click on radio button two {string} for Virtual Care Consent PT reviewed")
	public void I_click_on_radio_button_Yes_for_Virtual_Care_Consent_PT_reviewed(String section) {
		Wait_p(2);
		clickElement(CustomizedLocators.getRadioOptionBy_Virtual_Care_Consent_PT_reviewed(section));
	}

	@When("I click on radio button {string} for Guidelines and Policies")
	public void I_click_on_radio_button_Yes_for_Guidelines_and_Policies(String section) {
		clickElement(CustomizedLocators.getRadioOptionBy_Guidelines_and_Policies(section));
	}

	@When("I save my work PTClient Consent")
	public void i_save_my_work_PTClient_Consent() {
		clickElement(By.xpath("(//*[@id='saveEntries'])"));
	}

	@When("I click on Upload Button")
	public void I_click_on_Upload_Button() {
		clickElement(By.xpath("//*[@id='doc_submit']"));
	}

	@When("PDF is downloaded and verified")
	public void i_save_PDF_is_downloaded() {
		String s = getLatestFilefromDir(System.getProperty("user.dir") + File.separator + directory).toString();
		if (!s.contains("MOHLTC_ADP_Application")) {
			Assert.assertTrue(false);
		}
		System.out.println("PDF Downloaded Succesfully.............");
	}

	@When("I click on Apply Filter Button")
	public void I_click_on_Apply_Filter_Button() {
		clickElement(By.xpath("//*[@name='apply_filter']"));
	}

	@When("I Verified searched record")
	public void I_Verified_searched_record() {
		Assert.assertTrue(isDisplayed(
				By.xpath(String.format("(//td[contains(text(),'%s')])[1]", PixalereScripts.ADP_Authorizer_Name1))));
	}

	@When("I start verifying records in Care Plan Nursing Adult Page")
	public void I_start_verifying_records_in_Care_Plan_Nursing_Adult_Page() {
		verify_Care_Plan_Nursing();
	}

	@When("I enter {string} input field Deletion in scripts")
	public void i_enter_input_field_delete_n_scripts(String inputField) {
		Wait_p(2);
		enterInputFieldAsPerKeyfromScripts(inputField);
		System.out.println();
	}

	@When("I click on Save Button for page Care Plan Nursing Adult")
	public void I_click_on_Save_Button_for_page_Care_Plan_Nursing_Adult() {
		clickElement(By.id("save_careplan"));
	}

	@When("I check reason after deletion in viewer")
	public void I_check_reason_after_deletion_in_viewer() {
		Wait_p(3);
		verify_RecordAfterDeletion();
	}

	@When("I check reason after deletion in viewer for respiratory")
	public void I_check_reason_after_deletion_in_viewer_for_respiratory() {
		Wait_p(3);
		verify_RecordAfterDeletion_respiratory();
	}

	@When("I confirm to press Delete Button")
	public void i_click_MedRAT_Page_del_button() {
		Wait_p(3);
		clickElementWithJQuery(By.xpath("//button[contains(text(),'Delete this charting')]"));
	}

	@When("I press on Delete Button")
	public void i_press_delete_in_MedRAT_Page() {
		clickElementWithJQuery(
				By.xpath("((//td[normalize-space()='Data Correction']/following::tbody//tr[1]//td)[last()])//button"));
	}

	@When("I press on Delete Button for respiratory suctioning")
	public void i_press_delete_in_delete_suctioning_Page() {
		Wait_p(2);
		clickElementWithJQuery(By.xpath("(//td[contains(text(),'Data Correction')])[1]//following::td[3]//button"));
	}

	@When("I press on Delete Button for respiratory Non-invasive ventilation")
	public void i_press_delete_in_delete_Non_invasive_ventilation_Page() {
		Wait_p(2);
		clickElement(By.xpath("(//td[contains(text(),'Data Correction')])[2]//following::td[6]//button"));
	}

	@When("I press on Delete Button for respiratory Cough Assist")
	public void i_press_delete_in_delete_Cough_Assist_Page() {
		Wait_p(2);
		clickElementWithJQuery(By.xpath("(//td[contains(text(),'Data Correction')])[3]//following::td[6]//button"));
	}

	@When("I press on Delete Button for Document Upload")
	public void i_press_delete_for_Document_Upload() {
		clickElementWithJQuery(
				By.xpath("(//td[contains(text(),'Document Name')]//following::tr//td)[6]//a[@value='Delete']"));
	}

	@When("I save my work for above Analysis Device Recommended")
	public void i_save_my_work_for_above_Analysis_Device_Recommended() {
		clickElementWithJQuery(By.id("saveEntries"));
		System.out.println("Work Saved");
	}

	@When("I save my work for above ADP Eligibility Screened")
	public void i_save_my_work_for_above_ADP_Eligibility_Screened() {
		clickElementWithJQuery(By.id("saveEntriesAE"));
		System.out.println("Work Saved");
	}

	@When("I save my work for above Previous Funding by ADP Confirmed")
	public void i_save_my_work_for_above_Previous_Funding_by_ADP_Confirmed() {
		clickElementWithJQuery(By.id("saveEntriesPF"));
		System.out.println("Work Saved");
	}

	@When("I save my work for above Mobility Device Specifications Recommended")
	public void i_save_my_work_for_above_Mobility_Device_Specifications_Recommended() {
		clickElementWithJQuery(By.id("saveEntriesD"));
		System.out.println("Work Saved");
	}

	@When("I save my work for above Equipment Trial Arranged")
	public void i_save_my_work_for_above_Equipment_Trial_Arranged() {
		clickElementWithJQuery(By.id("saveEntriesET"));
		System.out.println("Work Saved");
	}

	@When("I save my work for above Authorizer Involved in Service")
	public void i_save_my_work_for_above_Authorizer_Involved_in_Service() {
		clickElementWithJQuery(By.id("saveEntriesAI"));
		System.out.println("Work Saved");
	}

	@When("I save my work for above Authorizer Services Concluded")
	public void i_save_my_work_for_above_Authorizer_Services_Concluded() {
		clickElementWithJQuery(By.id("saveEntriesAS"));
		System.out.println("Work Saved");
	}

	@When("I select {string} radio button for SDM Consent Obtained Question1 field")
	public void i_select_radio_button_for_SDM_Consent_Obtained_Question1_field(String string) {
		clickElementWithJQuery(By.id("sdm_for_activities1_label"));
	}

	@When("I select {string} radio button for SDM Consent Obtained Question2 field")
	public void i_select_radio_button_for_SDM_Consent_Obtained_Question2_field(String string) {
		clickElementWithJQuery(By.id("sdm_discussed_client1_label"));
	}

	@When("I select {string} radio button for SDM Consent Obtained Question3 field")
	public void i_select_radio_button_for_SDM_Consent_Obtained_Question3_field(String string) {
		clickElementWithJQuery(By.id("sdm_discussed_psw1_label"));
	}

	@When("I select {string} radio button for Learner Question1 field")
	public void i_select_radio_button_for_Learner_Question1_field(String string) {
		clickElementWithJQuery(By.id("learner_edu_rec1_label"));
	}

	@When("I select {string} radio button for Learner Question2 field")
	public void i_select_radio_button_for_Learner_Question2_field(String string) {
		clickElementWithJQuery(By.id("learner_for_list_act1_label"));
	}

	@When("I select {string} radio button for Learner Question3 field")
	public void i_select_radio_button_for_Learner_Question3_field(String string) {
		clickElementWithJQuery(By.xpath("//label[@for='the_inst1']"));
	}

	@When("I enter learner name")
	public void I_enter_learner_name() {
		PixalereScripts.name = RandomStringUtils.randomAlphabetic(5);
		sendKeys(By.id("learner_name1"), PixalereScripts.name);
	}

	@And("I select Learner dropdown")
	public void I_select_Learner_dropdown() {
		selectByVisibleText(By.id("learner1"), "Learner");
	}

	@And("I select Employed By dropdown")
	public void I_select_Employed_By_dropdown() {
		selectByVisibleText(By.id("employed_by1"), "Employed By");
	}

	@And("I select Date")
	public void I_select_Date() {
		sendKeys(By.id("learner_date1"), "08/28/2022");
	}

	@When("I select {string} radio button for Acknowledge1")
	public void i_select_radio_button_for_Acknowledge1(String string) {
		clickElementWithJQuery(By.id("educator_ack_11_label"));
	}

	@When("I select {string} radio button for Acknowledge2")
	public void i_select_radio_button_for_Acknowledge2(String string) {
		clickElementWithJQuery(By.xpath("//label[@for='educator_ack_21']"));
	}

	@When("I expand all")
	public void i_expand_all() {
		clickElementWithJQuery(By.xpath("//label[normalize-space()='Expand All/Collapse All']"));
	}

	@When("I enter visit date")
	public void i_enter_visit_date() {
		sendKeys(By.id("educator_date"), JavaUtils.getCurrentDate("MM/dd/yyyy"));
	}

	@When("I select {string} in {string} radio assessment initiated field")
	public void i_select_in_radio_assessment_initiated_field(String string, String string2) {
		if (string.equalsIgnoreCase("yes"))
			clickElementWithJQuery(By.xpath(String.format(
					"//*[text()='%s']//following-sibling::div//input[@value='2']//following-sibling::label", string2)));
		else
			clickElementWithJQuery(By.xpath(String.format(
					"//*[text()='%s']//following-sibling::div//input[@value='1']//following-sibling::label", string2)));
	}

	@When("I select {string} in {string} radio")
	public void i_select_Acute_Respiratory_Screen(String string, String string2) {
		clickElementWithJQuery(By.xpath(String.format(
				"//*[contains(text(),'%s')]//..//following-sibling::*//label[normalize-space()='" + string + "']",
				string2)));
	}

	@When("I enter comment for client stated concerns")
	public void i_enter_comment_for_client_stated_concerns() {
		PixalereScripts.client_stated_concerns_comment = RandomStringUtils.randomAlphabetic(5);
		sendKeys(By.id("ot_client_caregiver_comment"), PixalereScripts.client_stated_concerns_comment);
	}

	@When("I select {string} in Home Accessibility Assessed")
	public void i_select_in_Home_Accessibility_Assessed(String string) {
		clickElementWithJQuery(By.xpath(String.format("//label[normalize-space()='%s']", string)));
	}

	@When("I enter additional comments in Home Accessibility Assessed")
	public void i_enter_additional_comments_in_Home_Accessibility_Assessed() {
		PixalereScripts.ot_home_aceess_assessed_comment = RandomStringUtils.randomAlphabetic(5);
		sendKeys(By.id("ot_home_aceess_assessed_comment"), PixalereScripts.ot_home_aceess_assessed_comment);
	}

	@When("I select WFL in Home Accessibility Assessed")
	public void i_select_WFL_in_Home_Accessibility_Assessed() {
		clickElementWithJQuery(By.xpath("(//label[contains(@class,'ot_wfl_rado_label')])[1]"));
	}

	@When("I select ESS")
	public void i_select_ESS() {
		clickElementWithJQuery(By.xpath("(//label[contains(@id,'ot_home_env_safety_scan1_label')])[1]"));
	}

	@When("I select Home Accessibility Assessed NURD for Equipment")
	public void i_select_Home_Accessibility_Assessed_NURD_for_Equipment() {
		List<WebElement> list = getWebDriver().findElements(By.xpath("//label[contains(@class,'home_nurd_label')]"));
		for (WebElement ele : list) {
			clickElementWithJQuery(ele);
		}
	}

	@When("I enter optional additional comments in Home Accessibility Assessed")
	public void i_enter_optional_additional_comments_in_Home_Accessibility_Assessed() {
		PixalereScripts.ot_home_env_comment = RandomStringUtils.randomAlphabetic(5);
		sendKeys(By.xpath("//*[contains(@id,'ot_home_env_comment')]"), PixalereScripts.ot_home_env_comment);
	}

	@When("I enter Diagnosis corrections")
	public void i_enter_Diagnosis_corrections() {
		PixalereScripts.ot_diagnosis_addition_comments = RandomStringUtils.randomAlphabetic(5);
		sendKeys(By.xpath("//*[contains(@id,'ot_diagnosis_addition_comments')]"),
				PixalereScripts.ot_diagnosis_addition_comments);
	}

	@When("I select WFL in Physical Health Components Assessed")
	public void i_select_WFL_in_Physical_Health_Components_Assessed() {
		clickElementWithJQuery(By.xpath("(//*[contains(@class,'ot_physical_health_comp_label')])[1]"));
	}

	@When("I select Physical Health Components Assessed NURD for Equipment")
	public void i_select_Physical_Health_Components_Assessed_NURD_for_Equipment() {
		List<WebElement> list = getWebDriver()
				.findElements(By.xpath("//label[contains(@class,'physical_health_nurd_label')]"));
		for (WebElement ele : list) {
			clickElementWithJQuery(ele);
		}
	}

	@When("I select additional comments for Physical Health Components Assessed")
	public void i_select_additional_comments_for_Physical_Health_Components_Assessed() {
		PixalereScripts.ot_stretegies_comment = RandomStringUtils.randomAlphabetic(5);
		sendKeys(By.id("ot_stretegies_comment"), PixalereScripts.ot_stretegies_comment);
	}

	@When("I select WFL in Skin Integrity Assessed")
	public void i_select_WFL_in_Skin_Integrity_Assessed() {
		clickElementWithJQuery(By.xpath("(//*[contains(@class,'skin_integrity_assessed')])[1]"));
	}

	@When("I select Skin Integrity Assessed NURD for Equipment")
	public void i_select_Skin_Integrity_Assessed_NURD_for_Equipment() {
		List<WebElement> list = getWebDriver()
				.findElements(By.xpath("//label[contains(@class,'skinIntigrity_nurd_label')]"));
		for (WebElement ele : list) {
			clickElementWithJQuery(ele);
		}
	}

	@When("I select additional comments for Skin Integrity Assessed")
	public void i_select_additional_comments_for_Skin_Integrity_Assessed() {
		PixalereScripts.skin_comment = RandomStringUtils.randomAlphabetic(5);
		sendKeys(By.xpath("(//*[contains(@name,'skin_comment')])[1]"), PixalereScripts.skin_comment);
	}

	@When("I select WFL in Cognition Assessed")
	public void i_select_WFL_in_Cognition_Assessed() {
		clickElementWithJQuery(By.xpath("(//*[contains(@class,'ot_cognition_assessed_master_label')])[1]"));
	}

	@When("I select Cognition Assessed NURD for Equipment")
	public void i_select_Cognition_Assessed_NURD_for_Equipment() {
		List<WebElement> list = getWebDriver()
				.findElements(By.xpath("//label[contains(@class,'congnition_assessment_nurd_label')]"));
		for (WebElement ele : list) {
			clickElementWithJQuery(ele);
		}
	}

	@When("I select additional comments for Cognition Assessed")
	public void i_select_additional_comments_for_Cognition_Assessed() {
		PixalereScripts.ot_strategies_education_comment = RandomStringUtils.randomAlphabetic(5);
		sendKeys(By.id("ot_strategies_education_comment"), PixalereScripts.ot_strategies_education_comment);
	}

	@When("I select WFL in Medication Management Discussed")
	public void i_select_WFL_in_Medication_Management_Discussed() {
		clickElementWithJQuery(By.xpath(
				"(//input[@name='medication_management']//following-sibling::label[contains(@class,'medication_management_label')])[1]"));
	}

	@When("I select Medication Management Discussed NURD for Equipment")
	public void i_select_Medication_Management_Discussed_NURD_for_Equipment() {
		List<WebElement> list = getWebDriver()
				.findElements(By.xpath("//label[contains(@class,'medication_management_nurd_label')]"));
		for (WebElement ele : list) {
			clickElementWithJQuery(ele);
		}
	}

	@When("I select additional comments for Medication Management Discussed")
	public void i_select_additional_comments_for_Medication_Management_Discussed() {
		PixalereScripts.medication_management_comment = RandomStringUtils.randomAlphabetic(5);
		sendKeys(By.xpath("//*[contains(@id,'medication_management_comment')]"),
				PixalereScripts.medication_management_comment);
	}

	@When("I select WFL in Behavioural Health Assessed")
	public void i_select_WFL_in_Behavioural_Health_Assessed() {
		clickElementWithJQuery(By.xpath("(//label[contains(@class,'mental_health_label')])[1]"));
	}

	@When("I select No evidence of abuse")
	public void i_select_No_evidence_of_abuse() {
		clickElementWithJQuery(
				By.xpath("(//*[contains(@name,'mental_health_rado_abuse')]//following-sibling::label)[1]"));
	}

	@When("I select No evidence of acute suicidal risk")
	public void i_select_No_evidence_of_acute_suicidal_risk() {
		clickElementWithJQuery(By.xpath("(//*[@name='mental_health_rado']//following-sibling::label)[1]"));
	}

	@When("I enter additional comment in Behavioural Health Assessed")
	public void i_enter_additional_comment_in_Behavioural_Health_Assessed() {
		PixalereScripts.mental_health_comment = RandomStringUtils.randomAlphabetic(5);
		sendKeys(By.xpath("//textarea[contains(@id,'mental_health')]"), PixalereScripts.mental_health_comment);
	}

	@When("I select WFL in Routines and IADLs Assessed")
	public void i_select_WFL_in_Routines_and_IADLs_Assessed() {
		clickElementWithJQuery(By.xpath("(//label[contains(@class,'ot_iadl_wfl_label')])[1]"));
	}

	@When("I select Routines and IADLs Assessed NURD for Equipment")
	public void i_select_Routines_and_IADLs_Assessed_NURD_for_Equipment() {
		List<WebElement> list = getWebDriver()
				.findElements(By.xpath("//label[contains(@class,'routine_and_iadl_nurd_label')]"));
		for (WebElement ele : list) {
			clickElementWithJQuery(ele);
		}
	}

	@When("I select additional comments for Routines and IADLs Assessed")
	public void i_select_additional_comments_for_Routines_and_IADLs_Assessed() {
		PixalereScripts.routine_comment = RandomStringUtils.randomAlphabetic(5);
		sendKeys(By.xpath("//textarea[contains(@id,'routine_comment')]"), PixalereScripts.routine_comment);
	}

	@When("I select WFL in ADLs")
	public void i_select_WFL_in_ADLs() {
		clickElementWithJQuery(By.xpath("(//label[contains(@class,'ot_adls_dressing_label')])[1]"));
	}

	@When("I select ADLs NURD for Equipment")
	public void i_select_ADLs_NURD_for_Equipment() {
		List<WebElement> list = getWebDriver()
				.findElements(By.xpath("//label[contains(@class,'dresing_grooming_nurd_label')]"));
		for (WebElement ele : list) {
			clickElementWithJQuery(ele);
		}
	}

	@When("I select additional comments for ADLs")
	public void i_select_additional_comments_for_ADLs() {
		PixalereScripts.adls_dressing_comment = RandomStringUtils.randomAlphabetic(5);
		sendKeys(By.xpath("//textarea[contains(@id,'adls_dressing_comment')]"), PixalereScripts.adls_dressing_comment);
	}

	@When("I select WFL in Ambulation and Stair Use Assessed")
	public void i_select_WFL_in_Ambulation_and_Stair_Use_Assessed() {
		clickElementWithJQuery(By.xpath("(//label[contains(@class,'ambulation_stair_label')])[1]"));
	}

	@When("I select Ambulation and Stair Use Assessed NURD for Equipment")
	public void i_select_Ambulation_and_Stair_Use_Assessed_NURD_for_Equipment() {
		List<WebElement> list = getWebDriver()
				.findElements(By.xpath("//label[contains(@class,'ambulation_stair_nurd_label')]"));
		for (WebElement ele : list) {
			clickElementWithJQuery(ele);
		}
	}

	@When("I select additional comments for Ambulation and Stair Use Assessed")
	public void i_select_additional_comments_for_Ambulation_and_Stair_Use_Assessed() {
		PixalereScripts.ambulation_stair_comment = RandomStringUtils.randomAlphabetic(5);
		sendKeys(By.xpath("//textarea[contains(@id,'ambulation_stair_comment')]"),
				PixalereScripts.ambulation_stair_comment);
	}

	@When("I select WFL in Transfers")
	public void i_select_WFL_in_Transfers() {
		clickElementWithJQuery(By.xpath("(//label[contains(@class,'transfer_assessed_label')])[1]"));
	}

	@When("I select Transfers NURD for Equipment")
	public void i_select_Transfers_NURD_for_Equipment() {
		List<WebElement> list = getWebDriver()
				.findElements(By.xpath("//label[contains(@class,'transfer_assessed_nurd_label')]"));
		for (WebElement ele : list) {
			clickElementWithJQuery(ele);
		}
	}

	@When("I select additional comments for Transfers")
	public void i_select_additional_comments_for_Transfers() {
		PixalereScripts.transfer_assessed_comment = RandomStringUtils.randomAlphabetic(5);
		sendKeys(By.xpath("//textarea[contains(@id,'transfer_assessed_comment')]"),
				PixalereScripts.transfer_assessed_comment);
	}

	@When("I select WFL in Bathroom ADLs")
	public void i_select_WFL_in_Bathroom_ADLs() {
		clickElementWithJQuery(By.xpath("(//label[contains(@class,'bathroom_assessed_label')])[1]"));
	}

	@When("I select Bathroom ADLs NURD for Equipment")
	public void i_select_Bathroom_ADLs_NURD_for_Equipment() {
		List<WebElement> list = getWebDriver()
				.findElements(By.xpath("//label[contains(@class,'bathroom_assessed_nurd_label')]"));
		for (WebElement ele : list) {
			clickElementWithJQuery(ele);
		}
	}

	@When("I select additional comments for Bathroom ADLs")
	public void i_select_additional_comments_for_Bathroom_ADLs() {
		PixalereScripts.bathroom_assessed_comment = RandomStringUtils.randomAlphabetic(5);
		sendKeys(By.xpath("//textarea[contains(@id,'bathroom_assessed_comment')]"),
				PixalereScripts.bathroom_assessed_comment);
	}

	@When("I enter VAC number")
	public void i_enter_VAC_number() {
		PixalereScripts.VAC = RandomStringUtils.randomNumeric(5);
		sendKeys(By.xpath("//*[contains(text(),'VAC')]//following-sibling::input"), PixalereScripts.VAC);
	}

	@When("I enter Insurance number")
	public void i_enter_Insurance_number() {
		PixalereScripts.Insurance = RandomStringUtils.randomNumeric(5);
		sendKeys(By.xpath("//*[contains(text(),'Insurance')]//following-sibling::input"), PixalereScripts.Insurance);
	}

	@When("I enter WSIB number")
	public void i_enter_WSIB_number() {
		PixalereScripts.WSIB = RandomStringUtils.randomNumeric(5);
		sendKeys(By.xpath("//*[contains(text(),'WSIB')]//following-sibling::input"), PixalereScripts.WSIB);
	}

	@When("I enter comment in Supplementary Funding Availability Noted")
	public void i_enter_comment_in_Supplementary_Funding_Availability_Noted() {
		PixalereScripts.income_assessed_comment = RandomStringUtils.randomAlphabetic(5);
		sendKeys(By.id("income_assessed_comment"), PixalereScripts.income_assessed_comment);
	}

	@When("I enter additional comment in Assessment Activities Completed")
	public void i_enter_additional_comment_in_Assessment_Activities_Completed() {
		PixalereScripts.assess_activities_comments = RandomStringUtils.randomAlphabetic(5);
		sendKeys(By.id("assess_activities_comments"), PixalereScripts.assess_activities_comments);
	}

	@When("I enter additional comment in Analysis and Recommendations")
	public void i_enter_additional_comment_in_Analysis_and_Recommendations() {
		PixalereScripts.analysis_recommendation_comment = RandomStringUtils.randomAlphabetic(5);
		sendKeys(By.id("analysis_recommendation_comment"), PixalereScripts.analysis_recommendation_comment);
	}

	@When("I save OT Assessment")
	public void i_save_OT_Assessment() {
		clickElementWithJQuery(By.id("saveEntries"));
	}

	@When("I select {string} checkbox in OT Assessment")
	public void i_select_checkbox(String field) {
		clickElementWithJQuery(By.xpath("//label[contains(text(),'" + field + "')]"));
	}

	@When("I start verifying records in OT Assessment Page")
	public void i_start_verifying_records_in_OT_Assessment_Page() {
		verifyOT_Assessment_Page();
		System.out.println("Data verified");
	}
}
