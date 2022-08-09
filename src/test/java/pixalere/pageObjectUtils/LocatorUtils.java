package pixalere.pageObjectUtils;

import org.openqa.selenium.By;

public class LocatorUtils {
	
	public static String radioService_Supervisor;
	public static String radiodemonstrated_understanding;
	public static String radioPSW_providing;
	public static String radioalternatives_and_benefits;
	public static String radioEducation_received;
	public static String radioservice_provider;
	public static String radiomodification_plan;
	public static String radioGuidelines_and_Policies;
	public static String radioVirtual_Care_Consent_PT_reviewed;
	public static String radioService_Consent_Obtained;
	public static String radioActivities_Assigned;
	public static String radioImmunization_up_to_date1;
	public static String radioAdmission_goals_discharge_planning;
	public static String radioPacemaker_Present;
	public static String radioPacemaker_Type;
	public static String radioExtremities_warm;
	public static String radioCap_refill;
	public static String radioCyanosis_Present;
	public static String radioEdema_noted;
	public static String radioPresence_of_Central;
	public static String radioMurmurs;
	public static String radioHumidifier_ON_Checked;
	public static String radioWater_Level_Checked;
	public static String radioclient_ventilator;
	public static String radiosuctioning_performed;
	public static String radioStoma_Care_Provided;
	public static String radioSpare_Trach_Set_Available;
	public static String radioTrach_Set_Change_field;
	public static String radioSuction_System_Checks;
	public static String radioTrachestomy;
	public static String radioIncontinence;
	public static String radioSkin_Type_Visual_Risk_Area;
	public static String radioMobility;
	public static String radioNutrition_Element;
	public static String radioSuction_machine_working;
	public static String radioBattery_charged;
	public static String radioType_of_suctioning;
	public static String radioAmount;
	public static String radioColor;
	public static String radioConsistency;
	public static String radioOdour;
	public static String radioSuctioning_container;
	public static String radioNon_invasive_ventilation;
	public static String radioOxygen_in_situ;
	public static String radioHumidifier_Check;
	public static String radioAir_filter_cleaned;
	public static String radioMask_tubing_cleaned;
	public static String radioCough_Assist;
	public static String radioAir_filter_cleaned_Cough_Assist;
	public static String radioMask_tubing_cleaned_Cough_Assist;
	public static String radioMedrat1;
	public static String radioMedrat2;
	public static String radioMedrat3;
	public static String radioMedrat4;
	public static String EmergencyPlanning1;
	public static String EmergencyPlanning2;
	public static String EmergencyPlanning3;
	public static String VitalSigns1;
	public static String VitalSigns2;
	public static String upperlimb_radio_1;
	public static String upperlimb_radio_2;
	public static String upperlimb_radio_3;
	public static String upperlimb_radio_4;
	public static String upperlimb_radio_5;
	public static String upperlimb_radio_6;
	public static String upperlimb_radio_7;
	public static String upperlimb_radio_8;
	public static String upperlimb_radio_9;
	public static String upperlimb_radio_10;
	public static String upperlimb_radio_11;
	public static String upperlimb_radio_12;
	public static String upperlimb_radio_13;
	public static String upperlimb_radio_14;
	public static String upperlimb_radio_15;
	public static String upperlimb_radio_16;
	public static String upperlimb_radio_17;
	public static String upperlimb_radio_18;
	public static String upperlimb_radio_19;
	public static String upperlimb_radio_20;
	public static String upperlimb_radio_21;
	public static String upperlimb_radio_22;
	public static String upperlimb_radio_23;
	public static String upperlimb_radio_24;
	public static String upperlimb_radio_25;
	public static String upperlimb_radio_26;
	public static String upperlimb_radio_27;
	public static String upperlimb_radio_28;
	
	public static String radioModality;
	public static String radioHomeEdemafield;
	public static String radioHomeDialysateClear;
	public static String radioHomeHerapin;
	public static String radioHomeAntibiotic;
	

	public static class LoginPageLocators {

		public static By ele_LoginPopup = By.xpath("//div[@class='login-box' ]//h4[text()='LOGIN']");
		public static By txt_Username = By.cssSelector("input[id='userId']");
		public static By txt_Password = By.cssSelector("input[id='password']");
		public static By btn_Login = By.cssSelector("input[name='submit']");
	}

	public static class HomePageLocators {
		public static By btn_HomePagePopupCloseButton = By.cssSelector("button[id='close_popup']");
		public static By img_HomePagePixalereLogoImage = By.cssSelector("div[class='page-logo'] img[alt='logo']");
		public static By ele_HomePageTitle = By.xpath("//h3[@class='page-title'][normalize-space(text())='Home']");
	}

	public static class GlobalPageLocators {
		public static By txt_SearchPatientInput = By.cssSelector("input[id='search']");
		public static By txt_SearchPatientInputDropdown = By.cssSelector("select[id='search_cat']");
		public static By btn_SearchBuutton = By.cssSelector("button[id='searchP']");
		public static String lnk_SearchedPatientLink = "//a[contains(text(),'%s')]";
		public static By pop_PopupLabel = By.cssSelector("div[style*='display: block'] span[class*='dialog-title']");
		public static String search_patient = "//a[normalize-space(text()) = '%s']";
		public static String select_from_ServiceReferreal = "//*[@id='encounter']//option[contains(text(),'%s')]";
		public static By txt_reason_delete = By.xpath("//*[@id='deleted_reason']");
	}
	public static class PICATLocators {
		// Respiratory
		public static By chk_noreportedconcern_Respiratory = By.id("checkbox-resp_history1");
		public static By chk_Cough = By.id("checkbox-resp_history2");
		public static By chk_respiratory_distress = By.id("checkbox-resp_history3");
		public static By chk_snoring = By.id("checkbox-resp_history4");
		public static By chk_smoking = By.id("checkbox-resp_history5");
		public static By chk_O2Therapy = By.id("checkbox-resp_history9");
		public static By chk_Ventillation = By.id("checkbox-resp_history19");
		public static By chk_Tracheostomy = By.id("checkbox-resp_history23");
		public static By chk_Suctioning = By.id("checkbox-resp_history26");
		public static By chk_chest_physiotherapy = By.id("checkbox-resp_history31");
		public static By chk_Amount = By.id("checkbox-resp_history10");
		public static By chk_Delivery = By.id("checkbox-resp_history11");
		public static By chk_BIPAP = By.id("checkbox-resp_history20");
		public static By chk_CPAP = By.id("checkbox-resp_history21");
		public static By chk_vantilator = By.id("checkbox-resp_history22");
		public static By chk_size = By.id("checkbox-resp_history24");
		public static By chk_type = By.id("checkbox-resp_history25");
		public static By chk_oralfrequency = By.id("checkbox-resp_history27");
		public static By chk_Oralpharyngeal = By.id("checkbox-resp_history28");
		public static By chk_nasopharyngeal = By.id("checkbox-resp_history29");
		public static By chk_Tracheal = By.id("checkbox-resp_history30");
		public static By chk_Percussion = By.id("checkbox-resp_history32");
		public static By chk_Cough_assist = By.id("checkbox-resp_history33");
		public static By chk_PEP = By.id("checkbox-resp_history34");
		public static By chk_OTHER = By.id("checkbox-resp_history35");
		public static By chk_Nasal_Cannula = By.id("checkbox-resp_history12");
		public static By chk_Nasal_Prongs = By.id("checkbox-resp_history13");
		public static By chk_mask = By.id("checkbox-resp_history14");
		public static By chk_Continuuous = By.id("checkbox-resp_history15");
		public static By chk_Intermittent = By.id("checkbox-resp_history16");
		public static By chk_Low_Flow = By.id("checkbox-resp_history17");
		public static By chk_Blow_By = By.id("checkbox-resp_history18");
		// assessment
		public static By chk_Not_Assessed = By.xpath("//label[@id='resp_assess1_label']");
		public static By chk_Inspection = By.id("checkbox-resp_assess2");
		public static By chk_respiratory_stress = By.id("checkbox-resp_assess3");
		public static By chk_Nasal_Flaring = By.id("checkbox-resp_assess4");
		public static By chk_grunting = By.id("checkbox-resp_assess5");
		public static By chk_cyanosis = By.id("checkbox-resp_assess6");
		public static By chk_Clubbing = By.id("checkbox-resp_assess7");
		public static By chk_Strider = By.id("checkbox-resp_assess8");
		public static By chk_Retractions = By.id("checkbox-resp_assess9");
		public static By chk_Suprasternal = By.id("checkbox-resp_assess10");
		public static By chk_Substernal = By.id("checkbox-resp_assess11");
		public static By chk_Intercostal = By.id("checkbox-resp_assess12");
		public static By chk_Auscultation = By.id("checkbox-resp_assess13");
		public static By chk_Air_entry = By.id("checkbox-resp_assess14");
		public static By chk_Satisfactory = By.id("checkbox-resp_assess15");
		public static By chk_Reduced = By.id("checkbox-resp_assess16");
		public static By chk_Breath_Sounds = By.id("checkbox-resp_assess17");
		public static By chk_Clear = By.id("checkbox-resp_assess18");
		public static By chk_Adventitious = By.id("checkbox-resp_assess19");
		public static By chk_Crackle_fine = By.id("checkbox-resp_assess20");
		public static By chk_Crackle_course = By.id("checkbox-resp_assess21");
		public static By chk_high_pitched = By.id("checkbox-resp_assess22");
		public static By chk_low_pitched = By.id("checkbox-resp_assess23");
		public static By chk_airways_sounds = By.id("checkbox-resp_assess24");

		// Cardiovascular
		public static By chk_No_Reported_Concerns_Cardiovascular = By.id("checkbox-cardiovascular_history1");
		public static By chk_Fatigue = By.id("checkbox-cardiovascular_history2_other");
		public static By chk_Murmurs = By.id("checkbox-cardiovascular_history3_other");
		public static By chk_Arrhythmias = By.id("checkbox-cardiovascular_history4_other");
		public static By chk_Cardiac_Surgery = By.id("checkbox-cardiovascular_history5_other");
		public static By chk_Thrombus = By.id("checkbox-cardiovascular_history6_other");
		public static By chk_Stroke = By.id("checkbox-cardiovascular_history7_other");

//		Gastrointestinal
		public static By chk_No_Reported_Concern_gastrointestinal = By.xpath("//label[@for='gastro_hist_na1']");
		public static By chk_Pain_Management = By.xpath("//label[@id='gasto_history1_label']");
		public static By chk_Nutrition_and_Patient = By.xpath("//label[@id='gasto_history2_label']");
		public static By chk_Nausea = By.xpath("//label[@id='gasto_history3_other_label']");
		public static By chk_Vomiting = By.xpath("//label[@id='gasto_history4_other_label']");
		public static By chk_Toilet_trained = By.xpath("//label[@id='bowel_habits1_label']");
		public static By chk_yes = By.xpath("//label[@id='bowel_habits2_label']");
		public static By chk_no = By.xpath("//label[@id='bowel_habits3_label']");
		public static By chk_diaper = By.xpath("//label[@id='bowel_habits4_label']");
		public static By chk_words_for_stool = By.xpath("//label[@id='bowel_habits5_other_label']");
		public static By chk_Bowel_movement = By.xpath("//label[@id='bowel_habits6_other_label']");
		public static By chk_Constipation = By.xpath("//label[@id='bowel_habits7_label']");
		public static By chk_Diarrhea = By.xpath("//label[@id='bowel_habits8_label']");
		public static By chk_Incontinent_Stool = By.xpath("//label[@id='bowel_habits9_label']");
		public static By chk_Bowel_aids = By.xpath("//label[@id='bowel_habits10_other_label']");
		

	}
	public static class InHomeSafetyIdentificationTool{
		public static By chk_Client_safety_assessment = By.xpath("//label[contains(text(),'Client did not consent to home safety assessment')]");
		public static By chk_School_Client = By.xpath("//label[contains(text(),'School Client')]");
		public static By chk_Clutter = By.xpath("//label[contains(text(),'Clutter')]");
		public static By chk_Cords = By.xpath("//label[contains(text(),'Cords')]");
		public static By chk_Unsafe_disposal_of_sharps = By.xpath("//label[contains(text(),'Unsafe disposal of sharps')]");
		public static By chk_Improper_storage_of_meds = By.xpath("//label[contains(text(),'Improper storage of meds')]");
		public static By chk_Absence_of_food_in_home = By.xpath("//label[contains(text(),'Absence of food in home')]");
		public static By chk_Issue_with_medical_equipment = By.xpath("//label[contains(text(),'Issue with medical equipment')]");
		public static By chk_No_phone = By.xpath("//label[contains(text(),'No phone')]");
		public static By chk_Frayed_cords = By.xpath("//label[contains(text(),'Frayed cords')]");
		public static By chk_Oxygen_present = By.xpath("//label[contains(text(),'Oxygen present')]");
		public static By chk_Lack_of_smoke_detector = By.xpath("//label[contains(text(),'Lack of smoke detector')]");
		public static By chk_No_safety_issues_identified = By.xpath("//label[contains(text(),'No safety issues identified')]");
		public static By chk_Client_chooses_to_live_at_risk = By.xpath("//label[contains(text(),'Client chooses to live at risk')]");
		public static By chk_Safety_issues_addressed = By.xpath("//label[contains(text(),'Safety issues addressed')]");
		public static By chk_Non_adherence = By.xpath("//label[contains(text(),'adherence to RNAO')]");
		public static By chk_Bunk_beds_in_children = By.xpath("//label[contains(text(),'Bunk beds in children')]");
		public static By chk_Lack_of_safety_belts_on_equipment = By.xpath("//label[contains(text(),'Lack of safety belts on equipment')]");
		public static By chk_Risk_for_falls_from_windows = By.xpath("//label[contains(text(),'Risk for falls from windows')]");
		public static By chk_Lack_of_mechanical_aids = By.xpath("//label[contains(text(),'Lack of mechanical aids')]");
		public static By chk_Developmentally_unsafe_food = By.xpath("//label[contains(text(),'Developmentally unsafe food')]");
		public static By chk_Unsafe_storage_of_hazardous_material = By.xpath("//label[contains(text(),'Unsafe storage')]");
		
		public static By chk_Kichen = By.xpath("//div[@class='checkbox']//label[@for='room_4203']");
		public static By chk_family_room = By.xpath("//div[@class='checkbox']//label[@for='room_4204']");
		public static By chk_Bathroom = By.xpath("//div[@class='checkbox']//label[@for='room_4205']");
		public static By chk_Bedroom = By.xpath("//div[@class='checkbox']//label[@for='room_4206']");
		public static By chk_Hallway = By.xpath("//div[@class='checkbox']//label[@for='room_4207']");
		public static By chk_Stairs = By.xpath("//div[@class='checkbox']//label[@for='room_4208']");
		public static By chk_Outdoors = By.xpath("//div[@class='checkbox']//label[@for='room_4209']");
		public static By chk_Other = By.xpath("//div[@class='checkbox']//label[@for='room_4210']");
		
		
		
		
		
	}
	public static class WaterlowLocators{
//		Special Risks - Tissue Malnutrition
		public static By chk_Terminal_Cahexia = By.xpath("//*[@id='specialrisk_tissue_list1_label']");
		public static By chk_Multiple_organ_failure = By.xpath("//*[@id='specialrisk_tissue_list2_label']");
		public static By chk_Single_organ_failure = By.xpath("//*[@id='specialrisk_tissue_list3_label']");
		public static By chk_Peripheral_vascular_disease = By.xpath("//*[@id='specialrisk_tissue_list4_label']");
		public static By chk_Anaemia = By.xpath("//*[@id='specialrisk_tissue_list5_label']");
		public static By chk_Smoking = By.xpath("//*[@id='specialrisk_tissue_list6_label']");
//		Special Risks - Neurological Deficit
		public static By chk_Not_Applicable_Neurological = By.xpath("//*[@id='specialrisk_neuro_list1_label']");
		public static By chk_Diabetes = By.xpath("//*[@id='specialrisk_neuro_list2_label']");
		public static By chk_MS = By.xpath("//*[@id='specialrisk_neuro_list3_label']");
		public static By chk_CVA = By.xpath("//*[@id='specialrisk_neuro_list4_label']");
		public static By chk_Motor = By.xpath("//*[@id='specialrisk_neuro_list5_label']");
		public static By chk_Sensory = By.xpath("//*[@id='specialrisk_neuro_list6_label']");
		public static By chk_Paraplegia = By.xpath("//*[@id='specialrisk_neuro_list7_label']");
//		Special Risks - Surgery/Trauma
		public static By chk_Not_Applicable_Surgery = By.xpath("//*[@id='specialrisk_surg_list1_label']");
		public static By chk_On_table_6_hours = By.xpath("//*[@id='specialrisk_surg_list2_label']");
		public static By chk_Orthopaedic = By.xpath("//*[@id='specialrisk_surg_list3_label']");
		public static By chk_On_table_2_hours = By.xpath("//*[@id='specialrisk_surg_list4_label']");
//		Medication
		public static By chk_High_Dose_Steroid_Use = By.xpath("//*[@id='medication_list1_label']");
		public static By chk_Cytotoxic = By.xpath("//*[@id='medication_list2_label']");
		public static By chk_Anti_inflammatory = By.xpath("//*[@id='medication_list3_label']");
		public static By chk_Long_term_Steroid_Use = By.xpath("//*[@id='medication_list4_label']");
		
	}
	public static class DischargeClient{
		public static By drp_reason = By.xpath("//*[@name='inactivate_reason']");
		public static By drp_day = By.xpath("//*[@id='backdated_day']");
		public static By drp_month = By.xpath("//*[@id='backdated_month']");
		public static By drp_year = By.xpath("//*[@id='backdated_year']");
		public static By button_discharge_client = By.xpath("//*[@id='discharge_submit']");
	}
	public static class TeachingAgreementPT{
		public static By Activity_to_be_Instructed = By.xpath("//a[@class='titl-crt']");
		public static By chk_Breathing_exercises = By.xpath("//*[@id='checkbox-activities3']");
		public static By chk_Ambulation = By.xpath("//*[@id='checkbox-activities4']");
		public static By chk_Stairs = By.xpath("//*[@id='checkbox-activities5']");
		public static By chk_Bathroom_safety = By.xpath("//*[@id='checkbox-activities6']");
		public static By chk_Transfers = By.xpath("//*[@id='checkbox-transfers1']");
		public static By chk_Transfer_board = By.xpath("//*[@id='checkbox-transfers5']");
		public static By chk_Stair_glide_transfer = By.xpath("//*[@id='checkbox-transfers11']");
		public static By chk_Sit_to_stand_lift = By.xpath("//*[@id='checkbox-transfers3']");
		public static By chk_Chair_to_chair = By.xpath("//*[@id='checkbox-transfers9']");
		public static By chk_Toilet_seat_transfer = By.xpath("//*[@id='checkbox-transfers4']");
		public static By chk_Bath_tub_transfer = By.xpath("//*[@id='checkbox-transfers10']");
		public static By chk_Lift_handout_provided = By.xpath("//*[@id='checkbox-resources1']//label");
		public static By chk_Exercise_sheets_provided = By.xpath("//*[@id='checkbox-resources3']//label");
		
		public static By Consent_Obtained = By.xpath("//*[@id='consent_arrow']//a[@data-toggle='collapse']");
		public static By chk_Client = By.xpath("//*[@id='checkbox-sdm_consent_from1']");
		public static By chk_With_Use_of_Interpreter = By.xpath("//*[@id='checkbox-sdm_consent_from3']");
		public static By chk_Verbally = By.xpath("//*[@id='checkbox-sdm_consent_from4']");
		
		public static By LearnerAcknowledgementofEducation = By.xpath("//a[@href='#dv-clps3']//img[@src='images/arrow-down.png']");
		public static By drp_learner = By.xpath("//*[@id='learner1']");
		public static By drp_employee = By.xpath("//*[@id='employed_by1']");

		public static By EducationCompletedbyServiceProvider = By.xpath("//a[@href='#dv-clps5']//img[@src='images/arrow-down.png']");
	}
	public static class PatientAccountsPageLocators {
		public static By tab_ActiveScreen = By.cssSelector("li[role='presentation'][class='active'] a");
		public static By btn_SearchButton = By.cssSelector("input[value='Search'][type='submit']");
		public static By txt_LastNameInput = By.cssSelector("input[type='text'][id='lastName']");
		public static By txt_FirstNameInput = By.cssSelector("input[type='text'][id='firstName']");
		public static By txt_MiddleNameInput = By.cssSelector("input[type='text'][id='middle_name']");
		public static By txt_CIN1Input = By.cssSelector("input[type='text'][id='phn1_1']");
		public static By txt_CIN2Input = By.cssSelector("input[type='text'][id='phn1_2']");
		public static By txt_AllergiesInput = By.cssSelector("textarea[id='allergies']");
		public static By txt_HomeAddressInput = By.cssSelector("input[id='address_line1']");
		public static By txt_CityInput = By.cssSelector("input[id='address_city']");
		public static By txt_PostalCodeInput = By.cssSelector("input[id='address_postal']");
		public static By txt_StateProvinceInput = By.cssSelector("input[id='address_state']");
		public static By txt_PrimaryInsuranceCarrierInput = By.cssSelector("input[id='insurance_carrier_1']");
		public static By txt_PrimaryInsurancePolicyHolderNameInput = By
				.cssSelector("input[id='insurance_policy_holder_1']");
		public static By txt_PrimaryInsurancePolicyInput = By.cssSelector("input[id='insurance_policy_number_1']");
		public static By txt_PrimaryInsuranceGroupInput = By.cssSelector("input[id='insurance_group_number_1']");
		public static By drp_DaysCalendarDropdown = By.cssSelector("div[class='datePicker'] select[id*='day']");
		public static By drp_MonthsCalendarDropdown = By.cssSelector("div[class='datePicker'] select[id*='month']");
		public static By txt_YearsCalendarInput = By.cssSelector("div[class='datePicker'] input[id*='year']");
		public static By btn_CreatePatientAccountButton = By
				.cssSelector("input[type='button'][value='Create Patient Account']");
		public static By msg_PatientConsentMessage = By
				.xpath("//p[@id='success_text'][a[normalize-space(text())='click here']]");

		public static By txt_careGiver_med1 = By.xpath("");
		public static By txt_careGiver_med2 = By.xpath("");
	}

	public static class PatientProfilePageLocators {
		public static By lbl_PatientProfilePageTitle = By.cssSelector("h3[class='page-title']");
		public static By txt_PastMedicalHistoryInput = By.cssSelector("textarea[id='past_medical_history']");
		public static By txt_PastMedicalHistoryOtherInput = By.cssSelector("textarea[id='past_medical_history_other']");
		public static By txt_Allergies = By.cssSelector("textarea[id='allergies']");
		public static By txt_CurrentMedicationsInput = By.cssSelector("textarea[id='medications']");
		public static By css_AffectWoundHealingFactorList = By
				.cssSelector("div[class*='hybrid-tile'] div[id*='im_title']");
		public static By drp_ConfirmPopDayDropdown = By.cssSelector("select[id='backdated_day']");
		public static By drp_ConfirmPopMonthDropdown = By.cssSelector("select[id='backdated_month']");
		public static By txt_ConfirmPopYearInput = By.cssSelector("input[id='backdated_year']");
		public static By msg_SuccessTextMessage = By.cssSelector("div[style*='display: block'] p[id='success_text']");
		public static By ele_LastUpdateDateLabel = By.cssSelector("label[id='signature']");
		public static By txt_BradenScoreInput = By.cssSelector("input[id='braden_score']");
		public static By txt_AdditionalCommentsInput = By.cssSelector("textarea[id='additional_comments']");
		public static By btn_DiagnosticTestsButton = By.cssSelector("button[id='AddAnti']");
		public static By lnk_DiagnosticTestsCalendarCurrentDate = By
				.cssSelector("table[class*='datepicker-calendar'] a[class*='active']");
//		public static By lnk_AlbuminAndPrealbuminTestsCalendarCurrentDate= By.cssSelector("table[class*='datepicker-calendar'] a[class*='highlight']");
		public static By lnk_AlbuminAndPrealbuminTestsCalendarCurrentDate = By
				.cssSelector("a[class='ui-state-default ui-state-highlight ui-state-hover']");
		public static By css_DiagnosticTestsSelectedproductList = By.cssSelector("div[class*='product-list']");
		public static By txt_AlbuminAndPrealbuminTestsPopupInput = By
				.xpath("//div[contains(@style, 'display: block')]//input[@type='text']");
		public static By btn_AlbuminSelectDate = By.cssSelector("div[name='albumin'] div[class='datePicker']");
		public static By ele_AlbuminSelectedDate = By.cssSelector("span[id='date_span_albumin']");
		public static By btn_PrealbuminSelectDate = By.cssSelector("div[name='prealbumin'] div[class='datePicker']");
		public static By ele_PrealbuminSelectedDate = By.cssSelector("span[id='date_span_prealbumin']");
		public static By btn_BloodGlucoseSelectDate = By.cssSelector("div[name='bloodsugar'] div[class='datePicker']");
		public static By ele_BloodGlucoseSelectedDate = By.cssSelector("span[id='date_span_bloodsugar']");
	}

	public static class AssessmentPageLocators {
		public static By css_WoundProfileAlphaCharList = By.cssSelector("div[id*='alpha']");
		public static By txt_WoundProfileCauseHistoryInput = By.cssSelector("textarea[name='reason_for_care']");
		public static By txt_WoundProfileSurgicalProcedureInput = By
				.cssSelector("textarea[name='operative_procedure_comments']");
		public static By txt_WoundProfileSurgeonInput = By.cssSelector("input[name='surgeon']");
		public static By btn_DateOfSurgerySelectDate = By
				.cssSelector("div[name='date_surgery'] div[class='datePicker']");
		public static By ele_DateOfSurgerySelectedDate = By.cssSelector("span[id='date_span_date_surgery']");
		public static By drp_DateOfSurgeryDaysDropdown = By.cssSelector("select[id='date_surgery_day']");
		public static By drp_DateOfSurgeryMonthDropdown = By.cssSelector("select[id='date_surgery_month']");
		public static By txt_DateOfSurgeryYearInput = By.cssSelector("input[id='date_surgery_year']");
		public static By ele_TeachingGoalsLocator = By.xpath("//div[@id='teaching_goals_title']");
		public static By ele_LastUpdateDateLabel = By
				.xpath("//span[@class='caption-subject'][contains(text(), 'Last Update')]");
		public static By ele_AbdomenCanvasLocator = By.cssSelector("area[id='ab']");
		public static By img_AbdomenImageLocator = By
				.xpath("//div[@class='wound_profile_name']//span[text()='Abdomen']");
		public static By img_BluemenImageLocator = By.cssSelector("div[id='blueman'] div[id='blueman_grid']");
		public static By img_BluemenImageAlphaLatterLocator = By
				.cssSelector("div[class*='Atrash'][id='dragA'][alt='Wound']");
		public static By img_BluemenImageNumericLatterLocator = By
				.xpath("//div[@alt='Skin']//img[contains(@src, 'red')]");
		public static By img_BluemenImageOstomyImageLocator = By
				.xpath("//div[@alt='Urostomy']//img[contains(@src, 'red')]");
		public static By btn_AddPainScaleButton = By.xpath("//div[@id='pain_title']");
		public static By btn_LengthButton = By.xpath("//div[@id='length_title']");
		public static By btn_WidthButton = By.xpath("//div[@id='width_title']");
		public static By btn_DepthButton = By.xpath("//div[@id='depth_title']");
		public static By btn_UnderminingAreaButton = By.xpath("//div[@id='num_under_title']");
		public static By btn_LocationStartButton = By.xpath("//div[@id='location_start']");
		public static By btn_LocationEndButton = By.xpath("//div[@id='location_end']");
		public static By btn_SinusLocationStartButton = By.xpath("//div[@id='sinus_location_start']");
		public static By btn_SinusTractsAreaButton = By.xpath("//div[@id='sinus_tract_title']");
		public static By btn_NumberOfFistulasButton = By.xpath("//div[@id='fistula_title']");
		public static By ele_NumberOfFistulasElement = By.xpath("//div[@id='fistula_icon']");
		public static By txt_Fistula1textareaInput = By.cssSelector("textarea[id='fistulas_1']");
		public static By txt_PainCommentsTextareaInput = By.cssSelector("textarea[placeholder='Pain Comments']");
		public static By btn_AssessmentTabNumericPopupNextButton = By
				.xpath("//div[@role='dialog'][contains(@style, 'display: block')]//button[contains(@id, 'next')]");
		public static By txt_AssessmentTabNumericPopupInput = By
				.xpath("//div[@role='dialog'][contains(@style, 'display: block')]//input[@type='text']");
		public static By txt_WoundPartsTextareaInput = By.cssSelector("textarea[id='wound_parts']");
		public static By txt_OtherSymptomsTextareaInput = By.cssSelector("textarea[placeholder='Other Symptoms']");
		public static By txt_NurseDiagnosisTextareaInput = By.cssSelector("textarea[id='preliminary_diagnosis']");
		public static By txt_biopsyYesTextareaInput = By.cssSelector("textarea[name='biopsy_yes']");
		public static By txt_TreatmentsTriedTextareaInput = By.cssSelector("textarea[name='treatments_tried']");
		public static By txt_RecommendationsTextareaInput = By.cssSelector("textarea[id='derm_recommendations']");
		public static By txt_FollowUpTextareaInput = By.cssSelector("textarea[id='derm_followup']");
		public static By txt_SiteTextareaInput = By.cssSelector("textarea[id='site']");
		public static By txt_ResponseTextareaInput = By.cssSelector("textarea[id='response']");
		public static By css_DiagnosisSelectedProductList = By.cssSelector("div[class='tile-name-product-list']");
		public static By ele_mmXDimensionsButton = By
				.xpath("//div[normalize-space(text())='mm X']//div[@class='tile-ic-number']");
		public static By ele_mmX0DimensionsOption = By
				.xpath("//div[@class='open']//div[contains(@class, 'tile')][normalize-space(text())='0']");
		public static By txt_SelfCareProgressCommentsTextareaInput = By
				.cssSelector("textarea[id='self_care_progress_comments']");
	}

	public static class TreatmentPageLocators {
		public static By txt_QuantityInput = By.cssSelector("input[id='quantity']");
		public static By lnk_EachHyperLink = By.xpath("//a[@id='each_div']");
		public static By txt_ProgressNoteTextareaInput = By.cssSelector("textarea[id='progress_note']");
		public static By ele_AlphaCharProductTitle2 = By.cssSelector("label[for='alpha_tile2']");
		public static By ele_AlphaCharProductLocator = By
				.cssSelector("input[alp_type='" + PixalereCommonUtils.focusChar + "']+label");
		public static By ele_NumericCharProductLocator = By
				.cssSelector("input[alp_type='s" + PixalereCommonUtils.focusChar + "']+label");
	}

	public static class ConsultsPageLocators {
		public static By ele_FirstPatientCell = By.cssSelector("tr[class*='historyRow']:nth-child(1) td:nth-child(1)");
//		public static By ele_FirstPatientStatusCell					= By.cssSelector("tr[class*='historyRow']:nth-child(1) td:nth-child(7)");
		public static By ele_FirstPatientStatusCell = By
				.cssSelector("tr[class*='historyRow']:nth-child(1) td:nth-child(6)");
		public static By btn_FirstPatientConsultButton = By
				.cssSelector("tr[class*='historyRow']:nth-child(1) input[value='Consult']");
		public static By btn_FirstPatientDownloadPDFButton = By
				.cssSelector("tr[class*='historyRow']:nth-child(2) input[value='Download PDF']");
		public static By txt_OverviewTextareaInput = By.cssSelector("textarea[name='overview']");
		public static By txt_WoundPartsTextareaInput = By.cssSelector("textarea[id='wound_parts']");
		public static By css_WoundCareTreatmentOrderList = By
				.cssSelector("tbody[id='products_table'] tr[id*='product']");
		public static By txt_TimeSpentInput = By.cssSelector("input[name='time_spent']");
		public static By ele_PainElement = By.cssSelector("div[id='pain_icon']");
		public static By ele_UnderminingLocationStartElement = By.cssSelector("div[id='location_start']");
		public static By ele_UnderminingLocationEndElement = By.cssSelector("div[id='location_end']");
		public static By ele_UnderminingLocationDepthElement = By.cssSelector("div[id='dimnesion_dep_icon']");
		public static By ele_SinusLocationStartElement = By.cssSelector("div[id='sinus_location_start']");
		public static By ele_SinusLocationEndElement = By.cssSelector("div[id='sinus_dimnesion_dep_icon']");
	}

	public static class ChatPageLocators {
		public static By txt_SearchRecipientUserInput = By.cssSelector("input[id='search_professional']");
		public static By txt_SearchPatientInput = By.cssSelector("input[id='search_patient']");
		public static By lbl_SearchedPatientLabel = By.xpath("//label[@id='patient_reference'][text()]");
		public static By lbl_SearchedRecipientLabel = By.xpath("//label[@id='professional_reference'][text()]");
		public static By css_DeleteLabelButtonList = By
				.cssSelector("button[type='button'][class='hide show'][id*='delete'] i");
		public static By txt_MessageChatModuleInput = By.cssSelector("textarea[id='message']");
		public static By txt_ReceiverMessageChatModuleInput = By
				.cssSelector("textarea[placeholder='Enter your message here']");
		public static By lbl_NoMessageEntryLabel = By.xpath("//td[text()='No data available in table']");
		public static By msg_LatestSentMessage = By
				.xpath("//div[@class='popup-messages']//div[contains(@class, 'base_sent')][1]//p[text()]");
		public static By msg_LatestReceivedMessage = By
				.xpath("//div[@class='popup-messages']//div[contains(@class, 'base_receive')][1]//p[text()]");
		public static By css_UnreadMessageDetailsList = By
				.xpath("//tr[contains(@class, 'unread')][last()]//td[text()]");
		public static By btn_ViewUnreadMessageButton = By
				.xpath("//tr[contains(@class, 'unread')][last()]//button[text()='View Message']");
	}

	public static class ProgressNotePageLocators {
		public static By txt_ProgressNoteTextareaInput = By.cssSelector("textarea[id='comments_body']");
		public static By lbl_ProgressNoteLatestResultDetailsLabel = By.xpath(
				"//div[contains(@class, 'progress-notes')]//div[@class='row' and div[contains(@class, 'alert-type')]][1]//label[@class='hintanchor']");
		public static By lbl_ProgressNoteLatestResultTextLabel = By.xpath(
				"//div[contains(@class, 'progress-notes')]//div[@class='row' and div[contains(@class, 'alert-type')]][1]//span[contains(@id, 'progress_note_body')]");
	}

	public static class IntakeOutputLocators {
		public static By chk_fluid = By.xpath("//label[contains(text(),'Fluid')]");
		public static By chk_solid = By.xpath("//label[contains(text(),'Solid')]");
		public static By chk_H2O = By.xpath("//label[contains(text(),'H2O')]");
		public static By chk_other = By.xpath("//label[contains(text(),'Other')]");
		public static By chk_water = By.xpath("//label[contains(text(),'Water')]");
		public static By txt_emesis_yes_ml = By.id("emesis");
		public static By txt_fluid = By.xpath("//label[contains(text(),'Fluid')]/child::input");
		public static By txt_solid = By.xpath("//label[contains(text(),'Solid')]/child::input");
		public static By txt_H2O = By.xpath("//label[contains(text(),'H2O')]/child::input");
		public static By txt_other = By.xpath("//label[contains(text(),'Other')]/child::input");
		public static By txt_water = By.xpath("//label[contains(text(),'Water')]/child::input");
		public static By txt_Formula = By.xpath("*//input[@name='formula']");
		public static By txt_Water_Bolus = By.xpath("*//input[@name='water_bolus']");
		public static By txt_Vol_Delivered = By.xpath("*//input[@name='volume_to_be_delivered']");
		public static By txt_Vol_Infused = By.id("volume_infused");
		public static By txt_Flush_Vol = By.id("flush_volume");
		public static By txt_total_vol = By.xpath("//input[@name='total_volume']");
		public static By txt_rate = By.xpath("//input[@name='rate']");
		public static By txt_formula_name = By.xpath("//input[@name='formula_name']");
		public static By txt_void_vol = By.id("voided");
		public static By txt_number_of_wet_diapers = By.id("number_of_wet_diaper");
		public static By txt_ostomy = By.id("ostomyTxt");
		public static By txt_drain1 = By.id("drain1");
		public static By txt_drain2 = By.id("drain2");
		public static By txt_drain3 = By.id("drain3");
		public static By txt_drain_location1 = By.id("drain1_location");
		public static By txt_drain_location2 = By.id("drain2_location");
		public static By txt_drain_location3 = By.id("drain3_location");
		public static By txt_stool_num = By.id("stool_num");

	}

	public static class OTLocators {
		public static By delivery_inst_edit = By.id("delivery_inst_edit");
		public static By con_edit1 = By.id("con_edit1");
		public static By con_edit2 = By.id("con_edit2");
		public static By yearLHIN = By.id("onset_date_year");
		public static By signature_canvas = By.id("signature_canvas");
		public static String LHINSuppliesNorders = "//table[@id='supplies_and_equipment']//td[contains(text(),'%s')]//following-sibling::td[4]//input";
		public static String LHINAddinRowOrders = "//table[@id='supplies_and_equipment']//td[contains(text(),'%s')]//following-sibling::td[5]//a";

	}

	public static class PTLocators {
		public static By txt_num = By.id("number");
	}

	public static class CarePlanLocators {
		public static By txt_problem_num = By.id("problem_number");
		public static By txt_nursing_diagnosis = By.id("client_needs");
		public static By txt_interventions_routine = By.id("service_plan");
		public static By txt_outcomes = By.id("outcomes");

		public static By txtedit_nursing_diagnosis = By.id("editclient_needs");
		public static By txtedit_interventions_routine = By.id("editservice_plan");
		public static By txtedit_outcomes = By.id("editoutcomes");
		public static By btn_update = By
				.xpath("(//div[@id='current_careplans']//tbody//tr//td//input[@value='Update'])[last()]");
		public static By btnUpdateCareEdit = By
				.xpath("//div[contains(@class, 'ui-dialog-buttonset')]//button[contains(text(), 'Update Care Plan')]");
	}

	public static class MedRatLocators {
		public static By chk_Impaired_cognition = By.xpath("//label[contains(text(),'Impaired cognition')]");
		public static By chk_Impaired_Vision_Hear_Swallow = By
				.xpath("//label[contains(text(),'Impaired vision, hearing, swallowing')]");
		public static By chk_Lacks_necessary_support = By.xpath("//label[contains(text(),'Lacks necessary support')]");
		public static By chk_Lower_literacy_or_ESL_issuest = By
				.xpath("//label[contains(text(),'Lower literacy or ESL issues')]");
		public static By chk_Side_effects = By.xpath("//label[contains(text(),'Side effects')]");
		public static By chk_Cost = By.xpath("//label[contains(text(),'Cost')]");
		public static By chk_Client_beliefs_expectations = By
				.xpath("//label[contains(text(),'Client_beliefs_expectations')]");
		public static By chk_lacks_basic = By
				.xpath("//label[contains(text(),'Lacks basic understanding of medications')]");
		public static By chk_other = By.xpath("//label[contains(text(),'Other')]");
		public static By txt_reason_delete = By.xpath("//*[@id='deleted_reason']");

	}

	public static class UpperLimbLocator {
		public static String chk_right_missing_limbs_fingers = "//label[normalize-space(text())='%s' and contains(@id,'right_missing_limbs')]";
		public static String chk_left_missing_limbs_fingers = "//label[normalize-space(text())='%s' and contains(@id,'left_missing_limbs')]";
		public static String radio_lower_arm_right = "//input[contains(@add,'%s') and contains(@id,'right_skin_colour_arm')]//following-sibling::label";
		public static String radio_lower_arm_left = "//input[contains(@add,'%s') and contains(@id,'left_skin_colour_arm')]//following-sibling::label";
		public static String radio_hand_skincolor_right = "//input[contains(@add,'%s') and contains(@id,'right_skin_colour_hand')]//following-sibling::label";
		public static String radio_hand_skincolor_left = "//input[contains(@add,'%s') and contains(@id,'left_skin_colour_hand')]//following-sibling::label";
		public static String radio_fingers_skincolor_left = "//input[contains(@add,'%s') and contains(@id,'left_skin_colour_fingers')]//following-sibling::label";
		public static String radio_fingers_skincolor_right = "//input[contains(@add,'%s') and contains(@id,'right_skin_colour_fingers')]//following-sibling::label";
		public static String radio_arm_skin_temp_right = "//input[contains(@add,'%s') and contains(@id,'right_temperature_arm')]//following-sibling::label";
		public static String radio_arm_skin_temp_left = "//input[contains(@add,'%s') and contains(@id,'left_temperature_arm')]//following-sibling::label";
		public static String radio_hand_skin_temp_right = "//input[contains(@add,'%s') and contains(@id,'right_temperature_hand')]//following-sibling::label";
		public static String radio_hand_skin_temp_left = "//input[contains(@add,'%s') and contains(@id,'left_temperature_hand')]//following-sibling::label";
		public static String radio_fingers_skin_temp_right = "//input[contains(@add,'%s') and contains(@id,'right_temperature_fingers')]//following-sibling::label";
		public static String radio_fingers_skin_temp_left = "//input[contains(@add,'%s') and contains(@id,'left_temperature_fingers')]//following-sibling::label";
		public static String radio_elbow_right = "//input[contains(@add,'%s') and contains(@id,'right_range_motion_arm')]//following-sibling::label";
		public static String radio_elbow_left = "//input[contains(@add,'%s') and contains(@id,'left_range_motion_arm')]//following-sibling::label";
		public static String radio_wrist_right = "//input[contains(@add,'%s') and contains(@id,'right_range_motion_hand')]//following-sibling::label";
		public static String radio_wrist_left = "//input[contains(@add,'%s') and contains(@id,'left_range_motion_hand')]//following-sibling::label";
		public static String radio_thumb_right = "//input[contains(@add,'Normal') and contains(@id,'right_range_motion_fingers')]//following-sibling::label";
		public static String radio_thumb_left = "//input[contains(@add,'Normal') and contains(@id,'left_range_motion_fingers')]//following-sibling::label";
		public static By txt_upper_limb_comments = By.id("limb_comments_upper");
		public static By txt_wrist_cm_right = By.xpath("//input[@id='right_wrist_cm']");
		public static By txt_wrist_cm_right1 = By.xpath("//input[@id='right_wrist_mm']");
		
		public static By txt_wrist_cm_left = By.xpath("//input[@id='left_wrist_cm']");
		public static By txt_wrist_cm_left1 = By.xpath("//input[@id='left_wrist_mm']");
		public static By txt_forearm_cm_right = By.xpath("//input[@id='right_elbow_cm']");
		public static By txt_forearm_cm_right1 = By.xpath("//input[@id='right_elbow_mm']");
		public static By txt_forearm_cm_left = By.xpath("	//input[@id='left_elbow_cm']");
		public static By txt_forearm_cm_left1 = By.xpath("	//input[@id='left_elbow_mm']");
		
	}

	public static class AdvLimbLocator {
		public static By txt_ankle_Dorsalis_Pedis = By.id("right_dorsalis_pedis_ankle_brachial");
		public static By txt_right_tibial_pedis_ankle_brachial = By.id("right_tibial_pedis_ankle_brachial");
		public static By txt_right_ankle_brachial = By.id("right_ankle_brachial");
		public static By txt_right_toe_pressure = By.id("right_toe_pressure");
		public static By txt_comment_hsi = By.xpath("//*[@name='ped_comment']");
		public static By txt_right_brachial_pressure = By.id("right_brachial_pressure");
		public static String chk_right_dorsalis_pedis = "//label[normalize-space(text())='%s' and contains(@id,'right_dorsalis_pedis_doppler')]";
		public static String chk_left_dorsalis_pedis = "//label[normalize-space(text())='%s' and contains(@id,'left_dorsalis_pedis_doppler')]";
		public static String radio_ankle_brachial_index1 = "(//label[contains(@id,'ankle_brachial_lab')])[1]";
		public static String radio_ankle_brachial_index2 = "(//label[contains(@id,'ankle_brachial_lab')])[2]";
		public static String radio_toe_brachial_index1 = "(//label[contains(@id,'toe_brachial_lab')])[1]";
		public static String radio_toe_brachial_index2 = "(//label[contains(@id,'toe_brachial_lab')])[2]";
		public static String radio_Stemmer_Sign_Right_yes = "(//input[contains(@id,'right_stemmers')]//following-sibling::label)[1]";
		public static String radio_Stemmer_Sign_Right_no = "(//input[contains(@id,'right_stemmers')]//following-sibling::label)[2]";
		public static String radio_Stemmer_Sign_Left_yes = "(//input[contains(@id,'right_stemmers')]//following-sibling::label)[1]";
		public static String radio_Stemmer_Sign_Left_no = "(//input[contains(@id,'right_stemmers')]//following-sibling::label)[2]";
		public static String chk_monofilament_testing_right = "//input[contains(@add,'%s') and contains(@id,'right_sensation')]//following-sibling::label";
		public static String chk_monofilament_testing_left = "//input[contains(@add,'%s') and contains(@id,'left_sensation')]//following-sibling::label";
		public static String chk_foot_concerns_ri8 = "//label[normalize-space(text())='%s' and contains(@id,'right_foot_deformities')]";
		public static String chk_derm_ass_ri8 = "//label[normalize-space(text())='%s' and contains(@id,'right_foot_skin')]";
		public static String chk_pain_ass_ri8 = "//label[normalize-space(text())='%s' and contains(@id,'right_pain_assessment')]";
		public static String chk_pain_ass_left = "//label[normalize-space(text())='%s' and contains(@id,'left_pain_assessment')]";
		
		//////////////////////
		
		public static String chk_right_posterior_tibal = "//label[normalize-space(text())='%s' and contains(@id,'right_posterior_tibial_doppler')]";
		public static String chk_left_posterior_tibal = "//label[normalize-space(text())='%s' and contains(@id,'left_posterior_tibial_doppler')]";
		
		public static String radio_Vascular_Assessment_Initiated_index1 = "(//label[contains(@id,'referral_vascular_assessment')])[1]"; 
		public static String radio_Vascular_Assessment_Initiated_index2 = "(//label[contains(@id,'referral_vascular_assessment')])[2]";
		
		public static String chk_foot_concerns_li8 = "//label[normalize-space(text())='%s' and contains(@id,'left_foot_deformities')]";
		public static String chk_toe_nails_ri8 = "//label[normalize-space(text())='%s' and contains(@id,'right_foot_toes')]";
		public static String chk_toe_nails_li8 = "//label[normalize-space(text())='%s' and contains(@id,'left_foot_toes')]";
				
		public static String chk_limpshaped_testing_right="//input[contains(@add,'%s') and contains(@id,'right_limb_shape')]//following-sibling::label";
		public static String chk_limpshaped_testing_left="//input[contains(@add,'%s') and contains(@id,'left_limb_shape')]//following-sibling::label";
		public static String chk_SkinAppearance_testing_right= "//input[contains(@add,'%s') and contains(@id,'right_foot_skin')]//following-sibling::label";
		public static String chk_SkinAppearance_testing_left= "//input[contains(@add,'%s') and contains(@id,'left_foot_skin')]//following-sibling::label";
	}

	public static class BasicLowerLimbLocator {
		public static String chk_right_missing_limbs_toes = "//label[normalize-space(text())='%s' and contains(@id,'right_missing_limbs')]";
		public static String chk_left_missing_limbs_toes = "//label[normalize-space(text())='%s' and contains(@id,'left_missing_limbs')]";
		public static String radio_lower_leg_right = "//input[contains(@add,'%s') and contains(@id,'right_skin_colour_leg')]//following-sibling::label";
		public static String radio_lower_leg_left = "//input[contains(@add,'%s') and contains(@id,'left_skin_colour_leg')]//following-sibling::label";
		public static String radio_foot_right = "//input[contains(@add,'%s') and contains(@id,'right_skin_colour_foot')]//following-sibling::label";
		public static String radio_foot_left = "//input[contains(@add,'%s') and contains(@id,'left_skin_colour_foot')]//following-sibling::label";
		public static String radio_toes_left = "//input[contains(@add,'%s') and contains(@id,'left_skin_colour_toes')]//following-sibling::label";
		public static String radio_toes_right = "//input[contains(@add,'%s') and contains(@id,'right_skin_colour_toes')]//following-sibling::label";
		public static String radio_skin_warmth_lower_leg_right = "//input[contains(@add,'%s') and contains(@id,'right_temperature_leg')]//following-sibling::label";
		public static String radio_skin_warmth_lower_leg_left = "//input[contains(@add,'%s') and contains(@id,'left_temperature_leg')]//following-sibling::label";
		public static String radio_skin_warmth_foot_right = "//input[contains(@add,'%s') and contains(@id,'right_temperature_foot')]//following-sibling::label";
		public static String radio_skin_warmth_foot_left = "//input[contains(@add,'%s') and contains(@id,'left_temperature_foot')]//following-sibling::label";
		public static String radio_skin_warmth_toes_right = "//input[contains(@add,'%s') and contains(@id,'right_temperature_toes')]//following-sibling::label";
		public static String radio_skin_warmth_toes_left = "//input[contains(@add,'%s') and contains(@id,'left_temperature_toes')]//following-sibling::label";
		public static String radio_circulation_dorsalis_pedis_right = "//input[contains(@add,'%s') and contains(@id,'right_dorsalis_pedis_palpation')]//following-sibling::label";
		public static String radio_circulation_dorsalis_pedis_left = "//input[contains(@add,'%s') and contains(@id,'left_dorsalis_pedis_palpation')]//following-sibling::label";
		public static String radio_circulation_posterior_tibial_right = "//input[contains(@add,'%s') and contains(@id,'right_posterior_tibial_palpation')]//following-sibling::label";
		public static String radio_circulation_posterior_tibial_left = "//input[contains(@add,'%s') and contains(@id,'left_posterior_tibial_palpation')]//following-sibling::label";
		public static String radio_circulation_capillary_refill_right1 = "//input[contains(@id,'right_less_less')]//following-sibling::label";
		public static String radio_circulation_capillary_refill_left1 = "//input[contains(@id,'left_less_less')]//following-sibling::label";
		public static String radio_circulation_capillary_refill_right2 = "//input[contains(@id,'right_less_more')]//following-sibling::label";
		public static String radio_circulation_capillary_refill_left2 = "//input[contains(@id,'left_less_more')]//following-sibling::label";
		public static String radio_range_of_motion_knee_right = "//input[contains(@add,'%s') and contains(@id,'right_range_motion_knee')]//following-sibling::label";
		public static String radio_range_of_motion_knee_left = "//input[contains(@add,'%s') and contains(@id,'left_range_motion_knee')]//following-sibling::label";
		public static String radio_range_of_motion_ankle_right = "//input[contains(@add,'%s') and contains(@id,'right_range_motion_ankle')]//following-sibling::label";
		public static String radio_range_of_motion_ankle_left = "//input[contains(@add,'%s') and contains(@id,'left_range_motion_ankle')]//following-sibling::label";
		public static String radio_edema_location_right = "//input[contains(@add,'%s') and contains(@id,'right_edema_location')]//following-sibling::label";
		public static String radio_edema_location_left = "//input[contains(@add,'%s') and contains(@id,'left_edema_location')]//following-sibling::label";
		public static String radio_edema_severity_right = "//input[contains(@add,'%s') and contains(@id,'right_edema_severity')]//following-sibling::label";
		public static String radio_edema_severity_left = "//input[contains(@add,'%s') and contains(@id,'left_edema_severity')]//following-sibling::label";
		public static By txt_sleep_position = By.id("sleep_positions");
		public static By txt_limb_comments = By.id("limb_comments");
		public static By txt_right_ankle_cm = By.id("right_ankle_cm");
		public static By txt_right_ankle_mm = By.id("right_ankle_mm");
		public static By txt_right_midcalf_cm = By.id("right_midcalf_cm");
		public static By txt_right_midcalf_mm = By.id("right_midcalf_mm");
		public static String chk_derm_assess_right = "//input[contains(@add,'%s') and contains(@id,'right_skin_assessment')]//following-sibling::label";
		public static String chk_derm_assess_left = "//input[contains(@add,'%s') and contains(@id,'left_skin_assessment')]//following-sibling::label";
		public static String chk_monofilament_testing_right = "//input[contains(@add,'%s') and contains(@id,'right_sensory')]//following-sibling::label";
		public static String chk_monofilament_testing_left = "//input[contains(@add,'%s') and contains(@id,'left_sensory')]//following-sibling::label";
		public static String chk_pain_assessment_right = "//input[contains(@add,'%s') and contains(@id,'right_pain_assessment')]//following-sibling::label";
		public static String chk_pain_assessment_left = "//input[contains(@add,'%s') and contains(@id,'left_pain_assessment')]//following-sibling::label";
	}

	public static class AcuteRespiratoryIllnessPageLocators {
		public static By chk_NoSymptomsNotedCheckbox = By.xpath("//label[contains(text(), 'No symptoms noted')]");
		public static By txt_TemperatureInput = By.xpath("//input[@name='temperature'][not(@disabled)]");
		public static By css_AcuteRespiratoryIllnessTableColumnList = By
				.cssSelector("table[class*='table-bordered'] thead tr:nth-child(1) td");
		public static By btn_DeleteRecordButton = By
				.cssSelector("table[class*='table-bordered'] tbody tr:nth-child(1) td button[id*='delbtn']");
		public static By txt_DeleteReasonTextarea = By.cssSelector("textarea[id='deleted_reason']");
	}

	public static class PalliativePageLocators {
		public static By txt_PPSStageInput = By.cssSelector("input[name='stage']");
		public static By txt_DiseaseManagementCommentsInput = By.cssSelector("textarea[id='disease_comments']");
		public static By txt_PhysicalCommentsInput = By.cssSelector("textarea[id='physical_comments']");
		public static By txt_PsychologicalCommentsInput = By.cssSelector("textarea[id='psychological_comments']");
		public static By txt_SocialCommentsInput = By.cssSelector("textarea[id='social_comments']");
		public static By txt_SpiritualCommentsInput = By.cssSelector("textarea[id='spiritual_comments']");
		public static By txt_PracticalCommentsInput = By.cssSelector("textarea[id='practical_comments']");
		public static By txt_EndOfLifeCommentsInput = By.cssSelector("textarea[id='endoflife_comments']");
		public static By txt_LossAndGriefCommentsInput = By.cssSelector("textarea[id='lossgrief_comments']");
		public static By sel_AdministeredByFirstRadioButton = By
				.xpath("//div[contains(@id, 'administered_by')][1]//label");
		public static By txt_OtherInput = By.cssSelector("input[id='other_text']");
	}

	public static class MedicationManagementPageLocators {
		public static By txt_MedicationNameInput = By
				.cssSelector("div[id*='MarDiv']:not([style*='none']) input[id='name']");
		public static By txt_DosageInput = By.cssSelector("div[id*='MarDiv']:not([style*='none']) input[id='dosage']");
		public static By drp_RouteDropdown = By
				.cssSelector("div[id*='MarDiv']:not([style*='none']) select[id='route']");
		public static By drp_DoseFrequencyDropdown = By
				.cssSelector("div[id*='MarDiv']:not([style*='none']) select[id*='freq']");
		public static By txt_SpecialInstructionsInput = By
				.cssSelector("div[id*='MarDiv']:not([style*='none']) textarea[name='instructions']");
		public static By drp_EndDateDaysCalendarDropdown = By.cssSelector(
				"div[id*='MarDiv']:not([style*='none']) div[class='datePicker'] select[id='end_date_day']");
		public static By drp_EndDateMonthsCalendarDropdown = By.cssSelector(
				"div[id*='MarDiv']:not([style*='none']) div[class='datePicker'] select[id='end_date_month']");
		public static By txt_EndDateYearsCalendarInput = By.cssSelector(
				"div[id*='MarDiv']:not([style*='none']) div[class='datePicker'] input[id='end_date_year']");
		public static By drp_DateOrderedDaysCalendarDropdown = By.cssSelector(
				"div[id*='MarDiv']:not([style*='none']) div[class='datePicker'] select[id*='ordered'][id*='day']");
		public static By drp_DateOrderedMonthsCalendarDropdown = By.cssSelector(
				"div[id*='MarDiv']:not([style*='none']) div[class='datePicker'] select[id*='ordered'][id*='month']");
		public static By txt_DateOrderedYearsCalendarInput = By.cssSelector(
				"div[id*='MarDiv']:not([style*='none']) div[class='datePicker'] input[id*='ordered'][id*='year']");
		public static By lbl_LatestHighRiskMedicationLabel = By.xpath(
				"//div[@class='portlet-body']//div[contains(@class, 'med_pink')][1]//p[contains(text(), 'High Risk Medication')]");
		public static By btn_SaveMedicationButton = By
				.cssSelector("div[id*='MarDiv']:not([style*='none']) input[value='Save Medication']");
		public static By btn_CurrentMedicationsLatestEditButton = By
				.xpath("//div[@class='portlet-body']//div[contains(@class, 'med_pink')][1]//button[@title='Edit']");
		public static By btn_CurrentMedicationsLatestHoldButton = By
				.xpath("//div[@class='portlet-body']//div[contains(@class, 'med_pink')][1]//button[@title='Hold']");
		public static By btn_CurrentMedicationsLatestGivenButton = By.xpath(
				"//div[@class='portlet-body']//div[contains(@class, 'med_pink')][1]//button[contains(text(), 'Given')]");
		public static By lbl_LatestMedicationOnHoldLabel = By.xpath(
				"//div[@class='portlet-body']//div[contains(@class, 'med_hold')][1]//div[normalize-space(text())='Medication On Hold']");
		public static By btn_LatestHoldMedicationReactivateButton = By.xpath(
				"//div[@class='portlet-body']//div[contains(@class, 'med_hold')][1]//button[@title='Reactivate']");
		public static By btn_LatestHoldMedicationDiscontinueButton = By.xpath(
				"//div[@class='portlet-body']//div[contains(@class, 'med_hold')][1]//button[@title='Discontinue']");
		public static By btn_CurrentMedicationLatestDiscontinueButton = By.xpath(
				"//div[@class='portlet-body']//div[contains(@class, 'med_pink')][1]//button[@title='Discontinue']");

		public static By sel_AdmissionRadioButton = By.cssSelector("label[for='state_1']");
		public static By txt_BPMHMedicationNameInput = By.cssSelector("input[id='name']");
		public static By txt_BPMHDoseInput = By.cssSelector("input[id='dose']");
		public static By drp_BPMHRouteDropdown = By.cssSelector("select[id='route']");
		public static By drp_BPMHFrequencyDropdown = By.cssSelector("select[id='frequency']");
		public static By css_TableColumnList = By
				.cssSelector("table[class*='table-bordered'] tbody tr:not([class]) td");
		public static By btn_TableLastRecordEditButton = By
				.xpath("//table[contains(@class, 'table-bordered')]//tbody//tr[@class][last()]//input[@value='Edit']");
		public static By drp_CopyFaxedDaysCalendarDropdown = By.cssSelector("select[id='copy_faxed_day']");
		public static By drp_CopyFaxedMonthsCalendarDropdown = By.cssSelector("select[id='copy_faxed_month']");
		public static By txt_CopyFaxedYearsCalendarInput = By.cssSelector("input[id='copy_faxed_year']");
		public static By ele_LastUpdateDateLabel = By.cssSelector("span[id='signature']");

		public static By txt_SolutionNameInput = By.cssSelector("input[name='solution_name']");
		public static By sel_SolutionTypeFirstRadioButton = By
				.cssSelector("input[name='solution']+label[for='solution_1']");
		public static By sel_MethodFirstRadioButton = By.cssSelector("input[name='method']+label[for='method_1']");
		public static By drp_SolutionNameDropdown = By.cssSelector("select[name*='solution']");
		public static By opt_SolutionNameDropdownOption = By.cssSelector("select[name*='solution'] option");
		public static By txt_SiteLocationInput = By.cssSelector("input[id='site_location']");
		public static By msg_RednessAlertMessage = By.xpath(
				"//div[@id='infection_alert1'][not(contains(@style, 'display: none'))]//label[@id='infection_label1']");
		public static By msg_HeparinLockAlertMessage = By
				.xpath("//div[@id='heparin_msg'][not(contains(@style, 'display: none'))]//p[text()]");
		public static By sel_LocationChangeYesRadioButton = By.cssSelector("label[for='location_change1']");
		public static By txt_CannulaInput = By.cssSelector("input[id='cannula']");
		public static By txt_CentralLineInput = By.cssSelector("input[id='central_line']");
		public static By txt_PICCInput = By.cssSelector("input[id='picc_circum']");
		public static By sel_OcclusionAssessedYesRadioButton = By.cssSelector("label[for='occlusion_assessed1']");
		public static By sel_OcclusionDetectedYesRadioButton = By.cssSelector("label[for='occlusion_detected1']");
		public static By drp_OcclusionQualityDropdown = By
				.cssSelector("select[id='occlusion_quality']:not([disabled])");
		public static By drp_OcclusionSourceDropdown = By.cssSelector("select[id='occlusion_source']:not([disabled])");
		public static By txt_NormalSalineInput = By.cssSelector("input[id='normal_saline']");
		public static By txt_VolumeTBDInput = By.cssSelector("input[id='volume_tbd']");
		public static By txt_VolumeInfusedInput = By.cssSelector("input[id='volume_done']");
		public static By txt_ResVolumeInput = By.cssSelector("input[id='res_volume']");
		public static By drp_DosesGivenDropdown = By.cssSelector("select[id='doses_given']");
		public static By sel_BatteryCheckedFirstRadioButton = By
				.cssSelector("input[name='battery_checked']+label[for='battery_checked1']");
		public static By sel_BatteryChangedFirstRadioButton = By
				.cssSelector("input[name='battery_changed']+label[for='battery_changed1']");
		public static By sel_TubingChangeFirstRadioButton = By
				.cssSelector("input[name='tubing_changed']+label[for='tubing_changed1']");
		public static By sel_DressingChangeFirstRadioButton = By
				.cssSelector("input[name='dressing_changed']+label[for='dressing_changed1']");
		public static By sel_BagChangeFirstRadioButton = By
				.cssSelector("input[name='bag_change']+label[for='bag_change1']");
		public static By sel_CapChangeFirstRadioButton = By
				.cssSelector("input[name='cap_change']+label[for='cap_change1']");
		public static By sel_PortACathChangedRadioButton = By
				.cssSelector("input[name='port_a_cath_changed']+label[for='port_a_cath_changed1']");
		public static By sel_HeparinLockRadioButton = By
				.cssSelector("input[name='heparin_flush']+label[for='heparin_flush1']");
		public static By txt_PortACatchGaugeInput = By
				.cssSelector("div[style*='display: block'] input[id='port_a_cath_gauge']");
		public static By btn_LatestInfusionsRecordDeleteButton = By.xpath(
				"//tr//td[normalize-space(text())='Data correction']/following-sibling::td[last()]//button[text()='Delete']");
	}

	public static class OrdersPageLocators {
		public static By txt_PhysicianNameInput = By.cssSelector("input[name*='physician'][name*='name']");
		public static By txt_ProvidersReportInput = By.cssSelector("textarea[id='providers_report']");
		public static By txt_TelephoneInput = By.cssSelector("input[type='tel'][id='phone']");
		public static By txt_FaxInput = By.cssSelector("input[type='tel'][id='fax']");
		public static By txt_FirstRecordErrorMarkedReasonInput = By
				.xpath("//div[@class='lightRow'][1]//*[@name='delete_reason']");
		public static By btn_FirstRecordDeleteMedicalUpdateLetterButton = By
				.xpath("//div[@class='lightRow'][1]//input[@value='Delete Medical Update Letter']");
		public static By btn_FirstRecordDeleteOrderButton = By
				.xpath("//div[@class='lightRow'][1]//input[@value='Delete Order']");
		public static By ele_PhysicianNameHistoryFirstRecord = By.xpath(
				"//div[@class='lightRow'][1]//label[normalize-space(@class)='title'][contains(text(), 'Physician')]//following-sibling::label[text()]");
		public static By ele_TelephoneHistoryFirstRecord = By.xpath(
				"//div[@class='lightRow'][1]//label[normalize-space(@class)='title'][contains(text(), 'Telephone')]//following-sibling::label[text()]");
		public static By ele_FaxHistoryFirstRecord = By.xpath(
				"//div[@class='lightRow'][1]//label[normalize-space(@class)='title'][contains(text(), 'Fax')]//following-sibling::label[text()]");
		public static By ele_OrderDateHistoryFirstRecord = By.xpath(
				"//div[@class='lightRow'][1]//label[normalize-space(@class)='title'][contains(text(), 'Order Date')]//following-sibling::label[text()]");
		public static By ele_ProvidersReportHistoryFirstRecord = By
				.xpath("//div[@class='lightRow'][1]//label[@class='body'][text()]");
		public static By ele_PhysicianNameDeletedHistoryFirstRecord = By.xpath(
				"//div[@class='lightRow'][1]//label[normalize-space(@class)='title'][contains(text(), 'Physician')]//following-sibling::label//del//font[text()]");
		public static By ele_TelephoneDeletedHistoryFirstRecord = By.xpath(
				"//div[@class='lightRow'][1]//label[normalize-space(@class)='title'][contains(text(), 'Telephone')]//following-sibling::label//del//font[text()]");
		public static By ele_FaxDeletedHistoryFirstRecord = By.xpath(
				"//div[@class='lightRow'][1]//label[normalize-space(@class)='title'][contains(text(), 'Fax')]//following-sibling::label//del//font[text()]");
		public static By ele_OrderDateDeletedHistoryFirstRecord = By.xpath(
				"//div[@class='lightRow'][1]//label[normalize-space(@class)='title'][contains(text(), 'Order Date')]//following-sibling::label//del//font[text()]");
		public static By ele_ProvidersReportDeletedHistoryFirstRecord = By
				.xpath("//div[@class='lightRow'][1]//label[@class='body']//del//font[text()]");
		public static By ele_ReasonForMarkedInErrorHistoryFirstRecord = By
				.xpath("//div[@class='lightRow'][1]//label[contains(text(), 'Reason for Marked in Error')]");
		public static By drp_OrderDateDaysCalendarDropdown = By.cssSelector("select[id='order_date_day']");
		public static By drp_OrderDateMonthsCalendarDropdown = By.cssSelector("select[id='order_date_month']");
		public static By txt_OrderDateYearsCalendarInput = By.cssSelector("input[id='order_date_year']");
		public static By txt_OrdersInput = By.cssSelector("textarea[id='orders']");
	}

	public static class TeachingGuidelinesPageLocators {
		public static By btn_InitiatedCompletedButtonList = By.xpath(
				"//div[not(contains(@class, 'header'))][contains(@class, 'edu_row')]//button[contains(text(), 'Initiated') or contains(text(), 'Completed')]");
		public static By btn_UndoChartDoneButtonList = By.xpath(
				"//div[not(contains(@class, 'header'))][contains(@class, 'edu_row')]//button[contains(text(), 'Undo Chart Done')]");
		public static By css_MedicationNameInputList = By
				.xpath("//div[contains(text(), 'Name of medication')]//input[@type='text']");
		public static By txt_OtherEducationInput = By.cssSelector("input[id='other_name']");
		public static By txt_OtherEducationInputField = By.cssSelector("input[id='other_other1']");
	}

	public static class NPWTPageLocators {
		public static By css_CaretypeButtonList = By
				.cssSelector("div[class='tile-ckbox-label'] div[class='tile-name'] div[id*='title']");
		public static By css_NPWTMachineSerialInputList = By.cssSelector("input[name*='serial_num']");
		public static By css_NPWTVendorConfirmationInputList = By.cssSelector("input[name*='kci_num']");
//		public static By css_NPWTStartDateList						= By.cssSelector("div[name*='vacstart'] div[class='datePicker']");
//		public static By css_NPWTEndDateList						= By.cssSelector("div[name*='vacend'] div[class='datePicker']");
		public static By css_NPWTStartDateList = By.cssSelector("span[id*='date_span_vacstart']");
		public static By css_NPWTEndDateList = By.cssSelector("span[id*='date_span_vacend']");
	}

	public static class PatientVitalSignsLocators {
		public static By txt_TemperatureInput = By.id("temperature");
		public static By txt_getTitleVitalSigns = By.xpath("//h3[contains(@class,'page-title')]");
		public static By txt_bloodPressInput = By.xpath("//input[@name='blood_pressure']");
		public static By txt_HeartRateInput = By.id("pulse");
		public static By txt_RespiRateInput = By.id("resp_rate");
		public static By txt_HeightInput = By.id("height");
		public static By txt_WeightInput = By.id("weight");
		public static By txt_Osat = By.id("o2_saturation");
		public static By drp_bp = By.id("bp_arm");
		public static By txt_head_circumInput = By.id("head_circumference");
		public static By txt_abdominal_girth_Input = By.id("abdominal_girth");
	}

	public static class TracheostomyLocators {
		public static By txt_ventilator_type = By.id("ventilator_type");
		public static By txt_leak = By.id("leak");
		public static By txt_ventiltion = By.id("ventiltion");
		public static By txt_pressure = By.id("pressure");
		public static By txt_tidal_exhaled = By.id("tidal_exhaled");
		 	
		
	}
	
	public static class PCAPainPumpLocators {
		public static By txt_solutionName = By.id("solution_name");
		public static By txt_ReservoirVolBag = By.id("reservoir_volume");
		public static By txt_DoseConcentration = By.id("dose_concentration");
		public static By txt_DoseHour = By.id("dose_hour");
		public static By txt_BolusDose = By.id("bolus_dose");
		public static By txt_BolusDoseAllowed = By.id("bolus_doses_allowed");
		public static By txt_BolusDoseAttempts = By.id("bolus_attempts");
		public static By txt_BolusGiven = By.id("bolus_given");
		public static By drp_siteAppearance = By.xpath("//select[@name='site_appearance']");
		public static By drp_locklevel = By.xpath("//select[@name='lock_level']");
		public static By drp_DoseHour = By.xpath("//select[@id='dose_concentration_type']");
		public static By drp_BolusDoseType = By.xpath("//select[@id='bolus_doses_type']");
	}

	public static class HomePeritonealLocators {
		public static By txt_TargetWeight = By.id("target_weight");
		public static By txt_LBS = By.id("weight_conversion");
		public static By txt_TargetBP = By.id("target_blood_pressure");
		public static By txt_location = By.id("location");
		public static By txt_measurement = By.xpath("//input[@id='measurement']");
		public static By txt_other = By.xpath("//input[@name='other']");
		public static By txt_DwellTime = By.xpath("//input[@name='dwell_time']");
		public static By txt_HomePeritoneal_OtherRadio = By.xpath("//input[@name='other']");
		public static By txt_drainageAmt = By.xpath("//input[@name='drainage_amount']");
		public static By txt_SolutionUsed_1 = By.xpath("(//label[@class='text-input']//following-sibling::input)[1]");
		public static By txt_SolutionUsed_2 = By.xpath("(//label[@class='text-input']//following-sibling::input)[2]");
		public static By txt_SolutionUsed_3 = By.xpath("(//label[@class='text-input']//following-sibling::input)[3]");
		public static By txt_Insulin_1 = By.xpath("(//label[@class='text-input']//following-sibling::input)[4]");
		public static By txt_Insulin_2 = By.xpath("(//label[@class='text-input']//following-sibling::input)[5]");
		public static By txt_Insulin_3 = By.xpath("(//label[@class='text-input']//following-sibling::input)[6]");
		public static By drp_drainage = By.xpath("//select[@name='drainage']");
		public static By drp_SkinIntegrity = By.xpath("//select[@name='skin_integrity']");
		
	}

	public static class EmergencyPlanningLocators {
		public static By txt_support = By.id("support_person");
		public static By txt_emergency_contact = By.id("emergency_contact");
		public static By txt_emergency_reltionship = By.id("emergency_contact_rel");
		public static By txt_emergency_phone = By.id("emergency_contact_ph");
		public static By txt_alt_emergency_contact = By.id("alt_emergency_contact");
		public static By txt_alt_emergency_reltionship = By.id("alt_emergency_contact_rel");
		public static By txt_alt_emergency_phone = By.id("alt_emergency_contact_ph");
		public static By txt_preparedness_plan = By.id("necessary_services");
		public static By txt_emergency_comments = By.id("emergency_comments");

	}

	public static class CustomizedLocators {

		public static By getWelcomeTitleElement(String titleText) {
			return By.xpath("//h4[@class='modal-title'][contains(text(), '" + titleText + "')]");
		}

		public static By getLinkWithTextElement(String linkText) {
			return By.xpath("//a[normalize-space(text())='" + linkText + "']");
		}

		public static By getButtonWithTextElement(String buttonText) {
			return By.xpath("//button[normalize-space(text())='" + buttonText + "']");
		}

		public static By getButtonWithTextElementOnPopup(String buttonText) {
			return By.xpath(
					"//div[contains(@style, 'display: block')]//button[normalize-space(text())='" + buttonText + "']");
		}

		public static By getDivButtonWithTextElement(String divButtonText) {
			return By.xpath("//div[normalize-space(text())='" + divButtonText + "']");
		}

		public static By getInputButtonWithTextElement(String inputButtonText) {
			return By.xpath("//input[normalize-space(@value)='" + inputButtonText + "']");
		}

		public static By getInputButtonWithTextOnPopupElement(String inputButtonText) {
			return By.xpath("//div[contains(@style, 'display: block')]//input[normalize-space(@value)='"
					+ inputButtonText + "']");
		}

		public static By getAdministrationLHPanelOption(String option) {
			return By.xpath("//ul[@style='display: block;']//a[normalize-space(text())='" + option + "']");
		}

		public static By getPatientAccountPageDropdownElement(String dropdown) {
			return By.xpath("//label[contains(text(), '" + dropdown + "')]//following-sibling::div//select");
		}

		public static By getPatientAccountDetailsByKey(String patientKey) {
			return By.xpath("//div[@class='profile-des']//label[contains(text(), '" + patientKey.trim()
					+ "')]//following-sibling::span");
		}

		public static By getConsentRadioButtonByValue(String radioValue) {
			return By.xpath("//div[@class='tile-name-radio']//div[normalize-space(text())='" + radioValue + "']");
		}

		public static By getBradenScoreRadioButtonByValue(String bradenScoreValue) {
			return By.xpath("//label[text() and b[contains(text(), '" + bradenScoreValue + "')]]");
		}

		public static By getDiagnosticTestsRadioButtonByValue(String radioValue) {
			return By.xpath(
					"//label[contains(@id, 'investigation_list')]//div[@class='tile-name-radio']/span[contains(@id, 'wound_tile')][text()='"
							+ radioValue + "']");
		}

		public static By getAlbuminAndPrealbuminTestsLocatorByOption(String option) {
			return By.xpath("//div[contains(@id, '_title') and span[contains(@id, '_num')]][contains(text(), '" + option
					+ "')]");
		}

		public static By getAlbuminAndPrealbuminTestsSelectedNumericValue(String option) {
			return By.xpath(
					"//div[contains(@id, '_title')][contains(text(), '" + option + "')]//span[contains(@id, '_num')]");
		}

		public static By getAssessmentRadioOptionByValue(String radioValue) {
			return By.xpath("//div[@class='tile-name-radio']//span[normalize-space(text())='" + radioValue + "']");
		}

		public static By getAssessmentRadioDivOptionByValue(String radioValue) {
			return By.xpath("//div[@class='tile-name-radio']//div[normalize-space(text())='" + radioValue + "']");
		}

		public static By getTreatmentRadioOptionByValue(String radioValue) {
//			return !PixalereCommonUtils.isDermNumber ? By.xpath("//div[span[contains(text(), 'Wound "+PixalereCommonUtils.focusChar+"')]]//following-sibling::div//div[@class='tile-name-radio']//span[normalize-space(text())='"+radioValue+"']") : By.xpath("//div[span[contains(text(), 'Derm "+PixalereCommonUtils.focusChar+"')]]//following-sibling::div//div[@class='tile-name-radio']//span[normalize-space(text())='"+radioValue+"']");
			if (PixalereCommonUtils.isDermNumber)
				return By.xpath("//div[span[contains(text(), 'Derm " + PixalereCommonUtils.focusChar
						+ "')]]//following-sibling::div//div[@class='tile-name-radio']//span[normalize-space(text())='"
						+ radioValue + "']");
			else if (PixalereCommonUtils.isOstomyImage)
				return PixalereCommonUtils.focusChar.contains(
						"u1") ? By.xpath("//div[span[contains(text(), 'Urostomy')]]//following-sibling::div//div[@class='tile-name-radio']//span[normalize-space(text())='" + radioValue + "']") : By.xpath("//div[span[contains(text(), 'Fecal Stoma')]]//following-sibling::div//div[@class='tile-name-radio']//span[normalize-space(text())='" + radioValue + "']");
			else
				return By.xpath("//div[span[contains(text(), 'Wound " + PixalereCommonUtils.focusChar
						+ "')]]//following-sibling::div//div[@class='tile-name-radio']//span[normalize-space(text())='"
						+ radioValue + "']");
		}

		public static By getProductCategoryByValue(String radioValue) {
			return By.xpath("//div[@class='tile-name-radio']//span[normalize-space(text())='" + radioValue + "']");
		}

		public static By getNumberElementFromPopupAsPerKey(String key, String number) {
			if (key.contains(PixalereStringPool.PAIN_SCALE))
				return By.cssSelector("ul[class='wound-tile-radio'] input[iconval='" + number + "']+label");
			else if (key.contains(PixalereStringPool.NUMBER_OF_FISTULAS))
				return By.cssSelector("ul[class='wound-tile-radio'] input[value='" + number + "']+label");
			else
				return null;
		}

		public static By getDisplayedAreaBlockOnPopup(String blockTitle) {
			return By.xpath("//div[contains(@style, 'display: block')]//h2[normalize-space(text())='" + blockTitle
					+ "'] | //div[contains(@style, 'display: block')]//h4[normalize-space(text())='" + blockTitle
					+ "']");
		}

		public static By getLocationStartLocatorByValue(String value) {
			return By.xpath(
					"//div[@role='dialog'][contains(@style, 'display: block')]//div[contains(@id, '_start_1')]//input[@value='"
							+ value + "']//following-sibling::label");
		}

		public static By getLocationEndLocatorByValue(String value) {
			return By.xpath(
					"//div[@role='dialog'][contains(@style, 'display: block')]//div[contains(@id, '_end_1')]//input[@value='"
							+ value + "']//following-sibling::label");
		}

		public static By getWoundBedElementByValue(String value) {
			return By.xpath("//div[contains(@id, 'wound_tile')][normalize-space(text())='" + value + "']");
		}

		public static By getWoundBedPercentElementByValue(String value) {
			return By.xpath("//div[@role='dialog'][contains(@style, 'display: block')]//label[span//input[@value='"
					+ value + "']]");
		}

		public static By getExudateCharacteristicsElementByValue(String value) {
			return By.xpath("//div[contains(@id, 'exudate_type_title')][text()='" + value + "']");
		}

		public static By getExudateCharacteristicsElementDisabledValue(String value) {
			return By.xpath(
					"//div[@class='hybrid-tile ' and input[@disabled]]//div[contains(@id, 'exudate_type_title')][text()='"
							+ value + "']");
		}

		public static By getOdourElementByValue(String value) {
			return By.xpath("//div[contains(@id, 'exudate_odour')][text()='" + value + "']");
		}

		public static By getWoundEdgeElementByValue(String value) {
			return By.xpath("//div[contains(@id, 'wound_edge_title')][text()='" + value + "']");
		}

		public static By getPeriWoundSkinElementByValue(String value) {
			return By.xpath("//div[contains(@id, 'periwound_title')][text()='" + value + "']");
		}

		public static By getSelectProductElementByValue(String value) {
			return By.xpath("//div[contains(@id, 'wound_tile_percent')][text()='" + value + "']");
		}

		public static By getSymptomsElementByValue(String value) {
			return By.xpath("//div[contains(@id, 'symptoms_title')][text()='" + value + "']");
		}

		public static By getProfileElementByValue(String value) {
			return By.xpath("//div[contains(@id, 'profile_title')][text()='" + value + "']");
		}

		public static By getAppearanceElementByValue(String value) {
			return By.xpath("//div[contains(@id, 'appearance_title')][text()='" + value + "']");
		}

		public static By getAbdominalContourElementByValue(String value) {
			return By.xpath("//div[contains(@id, 'contour_title')][text()='" + value + "']");
		}

		public static By getConcernsForPouchingElementByValue(String value) {
			return By.xpath("//div[contains(@id, 'pouching_title')][text()='" + value + "']");
		}

		public static By getMucocutaneousMarginElementByValue(String value) {
			return By.xpath("//div[contains(@id, 'margin_title')][text()='" + value + "']");
		}

		public static By getPeriOstomySkinElementByValue(String value) {
			return By.xpath("//div[contains(@id, 'periostomy_skin_title')][text()='" + value + "']");
		}

		public static By getFistulaDrainageElementByValue(String value) {
			return By.xpath("//div[contains(@id, 'drainage_title')][text()='" + value + "']");
		}

		public static By getPeriFistulaSkinElementByValue(String value) {
			return By.xpath("//div[contains(@id, 'perifistula_skin_title')][text()='" + value + "']");
		}

		public static By getUrineColourElementByValue(String value) {
			return By.xpath("//div[contains(@id, 'urine_colour_title')][text()='" + value + "']");
		}

		public static By getUrineTypeElementByValue(String value) {
			return By.xpath("//div[contains(@id, 'urine_type_title')][text()='" + value + "']");
		}

		public static By getSelfCareProgressElementByValue(String value) {
			return By
					.xpath("//div[contains(@id, 'self_care_progress_title')][normalize-space(text())='" + value + "']");
		}

		public static By getStoolColourElementByValue(String value) {
			return By.xpath("//div[contains(@id, 'stool_colour_title')][normalize-space(text())='" + value + "']");
		}

		public static By getStoolConsistancyElementByValue(String value) {
			return By.xpath("//div[contains(@id, 'stool_consistency_title')][normalize-space(text())='" + value + "']");
		}

		public static By getCoMorbiditiesElementByValue(String value) {
			return By.xpath("//div[contains(@id, 'comorbidities_title')][normalize-space(text())='" + value + "']");
		}

		public static By getWoundHealingAffectedFactorElementByValue(String value) {
			return By.xpath("//div[contains(@id, 'im_title')][normalize-space(text())='" + value + "']");
		}

		public static By getPrimaryDiagnosisElementByValue(String value) {
			return By.xpath("//div[contains(@id, 'primaryDiagnosis_title')][text()='" + value + "']");
		}

		public static By getCPTCodesElementByValue(String value) {
			return By.xpath("//div[contains(@id, 'title')][contains(text(), '" + value + "')]");
		}

//		public static By getWoundAAssessmentElementByValue(String value) {
//			return !PixalereCommonUtils.isDermNumber ? By.xpath("//div[@id='"+PixalereCommonUtils.focusChar+"']//div[not(@id)][normalize-space(text())='"+value+"']")
//					: By.xpath("//div[@id='s"+PixalereCommonUtils.focusChar+"']//div[not(@id)][normalize-space(text())='"+value+"']");
//		}

		public static By getWoundAAssessmentElementByValue(String value) {
			if (PixalereCommonUtils.isDermNumber)
				return By.xpath("//div[@id='s" + PixalereCommonUtils.focusChar
						+ "']//div[not(@id)][normalize-space(text())='" + value + "']");
			else if (PixalereCommonUtils.isOstomyImage)
				return By.xpath("//div[@id='ost" + PixalereCommonUtils.focusChar
						+ "']//div[not(@id)][normalize-space(text())='" + value + "']");
			else
				return By.xpath("//div[@id='" + PixalereCommonUtils.focusChar
						+ "']//div[not(@id)][normalize-space(text())='" + value + "']");
		}

		public static By getICNumberSizeByValue(String value) {
//			return !PixalereCommonUtils.isDermNumber ? By.xpath("//div[@id='"+PixalereCommonUtils.focusChar+"']//div[@class='tile-ic-number'][text()='"+value+"']") : By.xpath("//div[@id='s"+PixalereCommonUtils.focusChar+"']//div[@class='tile-ic-number'][text()='"+value+"']");
			if (PixalereCommonUtils.isDermNumber)
				return By.xpath("//div[@id='s" + PixalereCommonUtils.focusChar
						+ "']//div[@class='tile-ic-number'][text()='" + value + "']");
			else if (PixalereCommonUtils.isOstomyImage)
				return By.xpath("//div[@id='ost" + PixalereCommonUtils.focusChar
						+ "']//div[@class='tile-ic-number'][text()='" + value + "']");
			else
				return By.xpath("//div[@id='" + PixalereCommonUtils.focusChar
						+ "']//div[@class='tile-ic-number'][text()='" + value + "']");
		}

		public static By getPopupInputButtonByNumericValue(String numericVal, String popupText) {
			return popupText.contains(PixalereStringPool.SINUS_TRACTS)
					? By.xpath("//div[contains(@style, 'display: block')]//div[@id='sinus_number']//input[@value='"
							+ numericVal + "']")
					: By.xpath(
							"//div[contains(@style, 'display: block')] //div[@id='undermining_number']//input[@value='"
									+ numericVal + "']");
		}

		public static By getNPWTPageRadioButtonByValue(String value) {
			return By.xpath("//div[@class='tile-name-radio']//span[normalize-space(text())='" + value + "']");
		}

		public static By getViewerAssessmentByAlphaChar() {
//			return !PixalereCommonUtils.isDermNumber ? By.xpath("//button[contains(@id, 'alpha')][normalize-space(text())='"+PixalereCommonUtils.focusChar+"']") : By.xpath("//button[contains(@id, 'alpha')]//img[contains(@src, 's"+PixalereCommonUtils.focusChar+"_')]");
			if (PixalereCommonUtils.isDermNumber)
				return By.xpath("//button[contains(@id, 'alpha')]//img[contains(@src, 's"
						+ PixalereCommonUtils.focusChar + "_')]");
			else if (PixalereCommonUtils.isOstomyImage)
				return By.xpath("//button[contains(@id, 'alpha')]//img[contains(@src, 'ost"
						+ PixalereCommonUtils.focusChar + "_')]");
			else
				return By.xpath("//button[contains(@id, 'alpha')][normalize-space(text())='"
						+ PixalereCommonUtils.focusChar + "']");
		}

		public static By getWoundAssessmentValueLocatorOnViewerByKey(String mapKey) {
			return By
					.xpath("//tr//td[contains(text(), '" + mapKey + "')]/following-sibling::td//td[not(a) and text()]");
		}

		public static By getAlphaCharAssessmentByValue(String alphaChar) {
			return By.xpath(
					"//p[span[normalize-space(text())='Assessment:']]//following-sibling::span[button[normalize-space(text())='"
							+ alphaChar + "']]");
		}

		public static By getNumericCharAssessmentByValue(String numericChar) {
			return By.xpath(
					"//p[span[normalize-space(text())='Assessment:']]//following-sibling::span[button[@id='bgbtns"
							+ numericChar + "']]");
		}

		public static By getOstomyImageCharAssessmentByValue(String imageChar) {
			return By.xpath(
					"//p[span[normalize-space(text())='Assessment:']]//following-sibling::span[button[@id='bgbtnost"
							+ imageChar + "']]");
		}

		public static By getDiagnosisAlphabet(String alphabet) {
			return By.cssSelector("button[id='" + alphabet + "']");
		}

		public static By getSelectedDiagnosisAlphabet(String alphabet) {
			return By.cssSelector("button[id='" + alphabet + "'][style*='solid']");
		}

		public static By getMeasurementElementByValue(String value) {
			return By.cssSelector("input[name='" + value.toLowerCase() + "']+div div");
		}

		public static By getSearchedRecipientUserPatient(String value) {
			return By.cssSelector("ul[style*='display: block'] li[onclick*='" + value.trim() + "']");
		}

		public static By getRadioOptionByAcuteRespiratoryIllnessSection(String section) {
			return By.xpath("//label[p[normalize-space(text())='" + section.trim()
					+ "']]//following-sibling::span[contains(@class, 'acute-radio')]//label[not(@disabled)][contains(@id, 'yn1')]");
		}

		public static By getRadioOptionByAcuteRespiratoryIllnessSection_p(String section) {
			return By.xpath("(//*[@name='visit_type']//following-sibling::label)[1]");
		}

		public static By VitalSignsSaveButton() {
			return By.xpath("//div[@id='saveEntries']");
		}

		public static By VitalSignsSave_ConfirmButton() {
			return By.xpath("//button[@id='confirm']");
		}
		
		public static By selectRadioOptionforTemperature(String section) {
			VitalSigns1 = section;
			if (section.equalsIgnoreCase("Oral"))
				return By.xpath("(//input[contains(@id,'temp_location')]/following-sibling::label)[1]");

			else if (section.equalsIgnoreCase("Axilla"))
				return By.xpath("(//input[contains(@id,'temp_location')]/following-sibling::label)[2]");
			
			else if (section.equalsIgnoreCase("Rectal"))
				return By.xpath("(//input[contains(@id,'temp_location')]/following-sibling::label)[3]");
			
			else
				return By.xpath("(//input[contains(@id,'temp_location')]/following-sibling::label)[4]"); 	
		}

		public static By getRadioOptionByVitalSigns_bloodpressure(String section) {
			VitalSigns2 = section;
			return By.xpath("//label[normalize-space(.)='" + section + "']");
		}

		public static By getRadioOptionByVitalSigns_pulseType(String section) {
			return By.xpath("//label[normalize-space(.)='" + section + "']");
		}

		public static By getRadioOptionForAntibiotic_added(String section) {
			radioHomeAntibiotic = section;
			if (section.equalsIgnoreCase("Yes"))
				return By.xpath("//label[@for='antibiotic1']");

			else if (section.equalsIgnoreCase("No"))
				return By.xpath("//label[@for='antibiotic2']");
			else
				return By.xpath("//label[@for='antibiotic3']");

		}

		public static By getRadioOptionFor_io_emesis(String section) {
			if (section.equalsIgnoreCase("Yes"))
				return By.xpath("//label[@for='emesis_detected2']");

			else if (section.equalsIgnoreCase("No"))
				return By.xpath("//label[@for='emesis_detected1']");
			else
				return By.xpath("");

		}

		public static By getRadioOptionFor_io_enteral(String section) {
			if (section.equalsIgnoreCase("Yes"))
				return By.xpath("//div[@id='md-radio-enteral2']/child::label");

			else if (section.equalsIgnoreCase("No"))
				return By.xpath("//div[@id='md-radio-enteral1']/child::label");
			else
				return By.xpath("");

		}

		public static By getRadioOptionFor_io_TypeField(String section) {
			if (section.equalsIgnoreCase("G-Tube"))
				return By.xpath("//label[@for='tube_type_1']");

			else if (section.equalsIgnoreCase("GJ-Tube"))
				return By.xpath("//label[@for='tube_type_2']");

			else if (section.equalsIgnoreCase("N/G Tube"))
				return By.xpath("//label[@for='tube_type_3']");

			else if (section.equalsIgnoreCase("Other"))
				return By.xpath("//label[@for='tube_type_4']");

			else
				return By.xpath("");
		}

		public static By getRadioOptionFor_io_SafetyCheck(String section) {
			if (section.equalsIgnoreCase("Yes"))
				return By.xpath("//label[@for='safety_check1']");

			else if (section.equalsIgnoreCase("No"))
				return By.xpath("//label[@for='safety_check2']");
			else
				return By.xpath("");

		}

		public static By getRadioOptionFor_io_TubePlacement(String section) {
			if (section.equalsIgnoreCase("Yes"))
				return By.xpath("//label[@for='tube_placement_verified1']");

			else if (section.equalsIgnoreCase("No"))
				return By.xpath("//label[@for='tube_placement_verified2']");
			else
				return By.xpath("");

		}

		public static By getRadioOptionFor_io_voidfield(String section) {
			if (section.equalsIgnoreCase("Yes"))
				return By.xpath("//label[@for='void_detected1']");

			else if (section.equalsIgnoreCase("No"))
				return By.xpath("//label[@for='void_detected2']");
			else
				return By.xpath("");

		}

		public static By getRadioOptionFor_io_stoolfield(String section) {
			if (section.equalsIgnoreCase("Yes"))
				return By.xpath("//label[@for='stool_detected1']");

			else if (section.equalsIgnoreCase("No"))
				return By.xpath("//label[@for='stool_detected2']");
			else
				return By.xpath("");
		}

		public static By getRadioOptionFor_io_stool_consistency_field(String section) {
			if (section.equalsIgnoreCase("Hard"))
				return By.xpath("//label[@for='stool_consistency_1']");

			else if (section.equalsIgnoreCase("Formed"))
				return By.xpath("//label[@for='stool_consistency_2']");

			else
				return By.xpath("//label[@for='stool_consistency_3']");
		}

		public static By getRadioOptionFor_io_ostomyfield(String section) {
			if (section.equalsIgnoreCase("Yes"))
				return By.xpath("//label[@for='ostomy_detected2']");

			else if (section.equalsIgnoreCase("No"))
				return By.xpath("//label[@for='ostomy_detected1']");
			else
				return By.xpath("");

		}

		public static By getRadioOptionFor_io_drainfield(String section) {
			if (section.equalsIgnoreCase("Yes"))
				return By.xpath("//label[@for='drain_check2']");

			else if (section.equalsIgnoreCase("No"))
				return By.xpath("//label[@for='drain_check1']");
			else
				return By.xpath("");

		}

		public static By getRadioOptionFor_io_drainType2field(String section) {
			if (section.equalsIgnoreCase("Mitrofanoff"))
				return By.xpath("//label[@for='drain2_type_1']");

			else if (section.equalsIgnoreCase("Hemovac"))
				return By.xpath("//label[@for='drain2_type_3']");

			else if (section.equalsIgnoreCase("Paracentesis"))
				return By.xpath("//label[@for='drain2_type_5']");

			else if (section.equalsIgnoreCase("Tenckhoff"))
				return By.xpath("//label[@for='drain2_type_7']");

			else if (section.equalsIgnoreCase("Chest Tube"))
				return By.xpath("//label[@for='drain2_type_2']");

			else if (section.equalsIgnoreCase("Jackson-Pratt"))
				return By.xpath("//label[@for='drain2_type_4']");

			else if (section.equalsIgnoreCase("PleurX"))
				return By.xpath("//label[@for='drain2_type_6']");

			else
				return By.xpath("//label[@for='drain2_type_8']");

		}

		public static By getRadioOptionFor_io_drainType1field(String section) {
			if (section.equalsIgnoreCase("Mitrofanoff"))
				return By.xpath("//label[@for='drain1_type_1']");

			else if (section.equalsIgnoreCase("Hemovac"))
				return By.xpath("//label[@for='drain1_type_3']");

			else if (section.equalsIgnoreCase("Paracentesis"))
				return By.xpath("//label[@for='drain1_type_5']");

			else if (section.equalsIgnoreCase("Tenckhoff"))
				return By.xpath("//label[@for='drain1_type_7']");

			else if (section.equalsIgnoreCase("Chest Tube"))
				return By.xpath("//label[@for='drain1_type_2']");

			else if (section.equalsIgnoreCase("Jackson-Pratt"))
				return By.xpath("//label[@for='drain1_type_4']");

			else if (section.equalsIgnoreCase("PleurX"))
				return By.xpath("//label[@for='drain1_type_6']");

			else
				return By.xpath("//label[@for='drain1_type_8']");

		}

		public static By getRadioOptionFor_io_drainType3field(String section) {
			if (section.equalsIgnoreCase("Mitrofanoff"))
				return By.xpath("//label[@for='drain3_type_1']");

			else if (section.equalsIgnoreCase("Hemovac"))
				return By.xpath("//label[@for='drain3_type_3']");

			else if (section.equalsIgnoreCase("Paracentesis"))
				return By.xpath("//label[@for='drain3_type_5']");

			else if (section.equalsIgnoreCase("Tenckhoff"))
				return By.xpath("//label[@for='drain3_type_7']");

			else if (section.equalsIgnoreCase("Chest Tube"))
				return By.xpath("//label[@for='drain3_type_2']");

			else if (section.equalsIgnoreCase("Jackson-Pratt"))
				return By.xpath("//label[@for='drain3_type_4']");

			else if (section.equalsIgnoreCase("PleurX"))
				return By.xpath("//label[@for='drain3_type_6']");

			else
				return By.xpath("//label[@for='drain3_type_8']");

		}

		public static By getRadioOptionByVitalSigns_efhome(String section) {
			radioHomeEdemafield=section;
			if (section.equalsIgnoreCase("Yes"))
				return By.xpath("//label[@id='edema_swelling1_label']");
			else
				return By.xpath("//label[@for='edema_swelling2']");
		}

		public static By getRadioOptionByHome_DialysateClear(String section) {
			radioHomeDialysateClear = section;
			if (section.equalsIgnoreCase("Yes"))
				return By.xpath("//label[@for='dialysate1']");
			else if (section.equalsIgnoreCase("No"))
				return By.xpath("//label[@for='dialysate2']");
			else
				return By.xpath("//label[@for='dialysate2']");
		}

		public static By getRadioOptionByEmegency_risk_of_lifeMEDRAT(String section) {
		
			if (section.equalsIgnoreCase("Yes"))
				return By.xpath("//div[@id='md-radio-completed_on_paper1']/label");
			else if (section.equalsIgnoreCase("No"))
				return By.xpath("//div[@id='md-radio-completed_on_paper2']/label");
			else
				return By.xpath("");
		}

		public static By getRadioOptionByEmegency_clients_medication_Medrat(String section) {
			radioMedrat1 = section;
			if (section.equalsIgnoreCase("Simple"))
				return By.xpath("//div[@id='md-radio-med_risk_regime-1']/label");
			else if (section.equalsIgnoreCase("Complex"))
				return By.xpath("//div[@id='md-radio-med_risk_regime-2']/label");
			else
				return By.xpath("//div[@id='md-radio-med_risk_regime-3']/label");
		}

		public static By getRadioOptionByEmegency_clients_medication_adherence_medrat(String section) {
			
			radioMedrat2 = section;
			if (section.contains("Taken as prescribed"))
				return By.xpath("//div[@id='md-radio-med_risk_adher-1']/label");
			else if (section.contains("Chaotic"))
				return By.xpath("//div[@id='md-radio-med_risk_adher-2']/label");
			else
				return By.xpath("");
		}

		public static By getRadioOptionByEmegency_clients_high_risk_medication_medrat(String section) {
			radioMedrat3 = section;
			if (section.equalsIgnoreCase("Yes"))
				return By.xpath("//input[@id='high_risk_meds_yn1']/following-sibling::label");
			else if (section.equalsIgnoreCase("No"))
				return By.xpath("//input[@id='high_risk_meds_yn2']/following-sibling::label");
			else
				return By.xpath("");
		}
		
		public static void getRadioOptionByEmegency_Based_on_the_information_above_medrat(String section) {
			radioMedrat4 = section;
		}

		public static By getRadioOptionByHome_heparin(String section) {
			radioHomeHerapin = section;
			if (section.equalsIgnoreCase("Yes"))
				return By.xpath("//label[@id='heparin1_label']");
			else
				return By.xpath("//label[@for='heparin2']");
		}

		public static By getRadioOptionByHome_Modality(String section) {
			radioModality = section;
			
			if (section.equalsIgnoreCase("Twin Bag"))
				return By.xpath("//label[@for='dialysis_type_1']");

			else if (section.equalsIgnoreCase("Cycler"))
				return By.xpath("//label[@for='dialysis_type_2']");
			else
				return By.xpath("//label[@for='dialysis_type_3']");
		}

		public static By getRadioOptionByEmegency_risk_of_life(String section) {
			EmergencyPlanning1 = section;
			if (section.equalsIgnoreCase("1: Within 12 Hours"))
				return By.xpath("//div[@id='md-radio-expected_risk_life-1']/child::label");

			else if (section.equalsIgnoreCase("2: 13-24 Hours"))
				return By.xpath("//div[@id='md-radio-expected_risk_life-2']/child::label");

			else if (section.equalsIgnoreCase("3: 25-72 Hours"))
				return By.xpath("//div[@id='md-radio-expected_risk_life-3']/child::label");

			else if (section.equalsIgnoreCase("4: Up to 5 Days"))
				return By.xpath("//div[@id='md-radio-expected_risk_life-4']/child::label");

			else if (section.equalsIgnoreCase("5: No Risk (Until Resolution)"))
				return By.xpath("//div[@id='md-radio-expected_risk_life-5']/child::label");

			else
				return By.xpath("");
		}

		public static By getRadioOptionByUpperHandSkinColor(String value, String section) {
			String xpath1 = null;
			if (section.equalsIgnoreCase("Right")) {
				upperlimb_radio_3 = value;
				xpath1 = String.format(UpperLimbLocator.radio_hand_skincolor_right, value);
			} else {
				upperlimb_radio_4 = value;
				xpath1 = String.format(UpperLimbLocator.radio_hand_skincolor_left, value);
			}
			return By.xpath(xpath1);
		}

		public static By getRadioOptionByUpperFingersSkinColor(String value, String section) {
			String xpath1 = null;
			if (section.equalsIgnoreCase("Right")) {
				upperlimb_radio_5 = value;
				xpath1 = String.format(UpperLimbLocator.radio_fingers_skincolor_right, value);
			} else {
				upperlimb_radio_6 = value;
				xpath1 = String.format(UpperLimbLocator.radio_fingers_skincolor_right, value);
			}
			return By.xpath(xpath1);
		}

		public static By getRadioOptionByUpperArmSkinWarmth(String value, String section) {
			String xpath1 = null;
			if (section.equalsIgnoreCase("Right")) {
				upperlimb_radio_7 = value;
				xpath1 = String.format(UpperLimbLocator.radio_arm_skin_temp_right, value);
			} else {
				upperlimb_radio_8 = value;
				xpath1 = String.format(UpperLimbLocator.radio_arm_skin_temp_left, value);
			}
			return By.xpath(xpath1);
		}

		public static By getRadioOptionByUpperHandSkinWarmth(String value, String section) {
			String xpath1 = null;
			if (section.equalsIgnoreCase("Right")) {
				upperlimb_radio_9 = value;
				xpath1 = String.format(UpperLimbLocator.radio_hand_skin_temp_right, value);
			} else {
				upperlimb_radio_10 = value;
				xpath1 = String.format(UpperLimbLocator.radio_hand_skin_temp_left, value);
			}
			return By.xpath(xpath1);
		}

		public static By getRadioOptionByUpperRightElbowMotionfield(String value, String section) {
			String xpath1 = null;
			if (section.equalsIgnoreCase("Right")) {
				upperlimb_radio_23 = value;
				xpath1 = String.format(UpperLimbLocator.radio_elbow_right, value);
			} else {
				upperlimb_radio_24 = value;
				xpath1 = String.format(UpperLimbLocator.radio_elbow_left, value);
			}
			return By.xpath(xpath1);
		}

		public static By getRadioOptionByUpperRightWristMotionfield(String value, String section) {
			String xpath1 = null;
			if (section.equalsIgnoreCase("Right")) {
				upperlimb_radio_25 = value;
				xpath1 = String.format(UpperLimbLocator.radio_wrist_right, value);
			} else {
				upperlimb_radio_26 = value;
				xpath1 = String.format(UpperLimbLocator.radio_wrist_left, value);
			}
			return By.xpath(xpath1);
		}

		public static By getRadioOptionByUpperRightThumbMotionfield(String value, String section) {
			String xpath1 = null;
			if (section.equalsIgnoreCase("Right")) {
				upperlimb_radio_27 = value;
				xpath1 = String.format(UpperLimbLocator.radio_thumb_right, value);
			} else {
				upperlimb_radio_28 = value;
				xpath1 = String.format(UpperLimbLocator.radio_thumb_left, value);
			}
			return By.xpath(xpath1);
		}

		public static By getRadioOptionByUpperFingersSkinWarmth(String value, String section) {
			String xpath1 = null;
			if (section.equalsIgnoreCase("Right")) {
				upperlimb_radio_11 = value;
				xpath1 = String.format(UpperLimbLocator.radio_fingers_skin_temp_right, value);
			} else {
				upperlimb_radio_12 = value;
				xpath1 = String.format(UpperLimbLocator.radio_fingers_skin_temp_left, value);
			}
			return By.xpath(xpath1);
		}

		public static By getRadioOptionByUpperRightArmSkinColor(String value, String section) {
			
			String xpath1 = null;
			if (section.equalsIgnoreCase("Right")) {
				upperlimb_radio_1 = value;
				xpath1 = String.format(UpperLimbLocator.radio_lower_arm_right, value);
			} else {
				upperlimb_radio_2 = value;
				xpath1 = String.format(UpperLimbLocator.radio_lower_arm_left, value);
			}
			return By.xpath(xpath1);
		}

		public static By getRadioOptionByLowerLegSkinColor(String value, String section) {
			String xpath1 = null;
			if (section.equalsIgnoreCase("Right")) {
				xpath1 = String.format(BasicLowerLimbLocator.radio_lower_leg_right, value);
			} else {
				xpath1 = String.format(BasicLowerLimbLocator.radio_lower_leg_left, value);
			}
			return By.xpath(xpath1);
		}

		public static By getRadioOptionByFootSkinColor(String value, String section) {
			String xpath1 = null;
			if (section.equalsIgnoreCase("Right")) {
				xpath1 = String.format(BasicLowerLimbLocator.radio_foot_right, value);
			} else {
				xpath1 = String.format(BasicLowerLimbLocator.radio_foot_left, value);
			}
			return By.xpath(xpath1);
		}

		public static By getRadioOptionByToesSkinColor(String value, String section) {
			String xpath1 = null;
			if (section.equalsIgnoreCase("Right")) {
				xpath1 = String.format(BasicLowerLimbLocator.radio_toes_right, value);
			} else {
				xpath1 = String.format(BasicLowerLimbLocator.radio_toes_left, value);
			}
			return By.xpath(xpath1);
		}

		public static By getRadioOptionByLowerLegSkinWarmth(String value, String section) {
			String xpath1 = null;
			if (section.equalsIgnoreCase("Right")) {
				xpath1 = String.format(BasicLowerLimbLocator.radio_skin_warmth_lower_leg_right, value);
			} else {
				xpath1 = String.format(BasicLowerLimbLocator.radio_skin_warmth_lower_leg_left, value);
			}
			return By.xpath(xpath1);
		}

		public static By getRadioOptionByFootSkinWarmth(String value, String section) {
			String xpath1 = null;
			if (section.equalsIgnoreCase("Right")) {
				xpath1 = String.format(BasicLowerLimbLocator.radio_skin_warmth_foot_right, value);
			} else {
				xpath1 = String.format(BasicLowerLimbLocator.radio_skin_warmth_foot_left, value);
			}
			return By.xpath(xpath1);
		}

		public static By getRadioOptionByToesSkinWarmth(String value, String section) {
			String xpath1 = null;
			if (section.equalsIgnoreCase("Right")) {
				xpath1 = String.format(BasicLowerLimbLocator.radio_skin_warmth_toes_right, value);
			} else {
				xpath1 = String.format(BasicLowerLimbLocator.radio_skin_warmth_toes_left, value);
			}
			return By.xpath(xpath1);
		}

		public static By getRadioOptionByDorsalisPedisPulsesbyPalpationfield(String value, String section) {
			String xpath1 = null;
			if (section.equalsIgnoreCase("Right")) {
				upperlimb_radio_13 = value;
				xpath1 = String.format(BasicLowerLimbLocator.radio_circulation_dorsalis_pedis_right, value);
			} else {
				upperlimb_radio_14 = value;
				xpath1 = String.format(BasicLowerLimbLocator.radio_circulation_dorsalis_pedis_left, value);
			}
			return By.xpath(xpath1);
		}

		public static By getRadioOptionByPosteriorTibialPulsesbyPalpationfield(String value, String section) {
			String xpath1 = null;
			if (section.equalsIgnoreCase("Right")) {
				upperlimb_radio_15 = value;
				xpath1 = String.format(BasicLowerLimbLocator.radio_circulation_posterior_tibial_right, value);
			} else {
				upperlimb_radio_16 = value;
				xpath1 = String.format(BasicLowerLimbLocator.radio_circulation_posterior_tibial_left, value);
			}
			return By.xpath(xpath1);
		}

		public static By getRadioOptionByLess_KneeRange_Motion_field(String value, String section) {
			String xpath1 = null;
			if (section.equalsIgnoreCase("Right")) {
				xpath1 = String.format(BasicLowerLimbLocator.radio_range_of_motion_knee_right, value);
			} else {
				xpath1 = String.format(BasicLowerLimbLocator.radio_range_of_motion_knee_left, value);
			}
			return By.xpath(xpath1);
		}

		public static By getRadioOptionByLess_AnkleRange_Motion_field(String value, String section) {
			String xpath1 = null;
			if (section.equalsIgnoreCase("Right")) {
				xpath1 = String.format(BasicLowerLimbLocator.radio_range_of_motion_ankle_right, value);
			} else {
				xpath1 = String.format(BasicLowerLimbLocator.radio_range_of_motion_ankle_left, value);
			}
			return By.xpath(xpath1);
		}

		public static By getRadioOptionByEdema_Location(String value, String section) {
			String xpath1 = null;
			if (section.equalsIgnoreCase("Right")) {
				upperlimb_radio_19 = value;
				xpath1 = String.format(BasicLowerLimbLocator.radio_edema_location_right, value);
			} else {
				upperlimb_radio_20 = value;
				xpath1 = String.format(BasicLowerLimbLocator.radio_edema_location_left, value);
			}
			return By.xpath(xpath1);
		}

		public static By getRadioOptionByEdema_severity_field(String value, String section) {
			String xpath1 = null;
			if (section.equalsIgnoreCase("Right")) {
				upperlimb_radio_21 = value;
				xpath1 = String.format(BasicLowerLimbLocator.radio_edema_severity_right, value);
			} else {
				upperlimb_radio_22 = value;
				xpath1 = String.format(BasicLowerLimbLocator.radio_edema_severity_left, value);
			}
			return By.xpath(xpath1);
		}

		public static By getRadioOptionByLess_than_equaltoThreesecsCapillaryRefillfield(String value) {
			String xpath1 = null;
			upperlimb_radio_17 = value;
			if (value.equalsIgnoreCase("Right")) {
				
				xpath1 = String.format(BasicLowerLimbLocator.radio_circulation_capillary_refill_right1, value);
			} else {
		
				xpath1 = String.format(BasicLowerLimbLocator.radio_circulation_capillary_refill_left1, value);
			}
			return By.xpath(xpath1);
		}

		public static By getRadioOptionByLess_than_equaltoThreesecsCapillaryRefillfield_Two(String value) {
			upperlimb_radio_18 = value;
			String xpath1 = null;
			if (value.equalsIgnoreCase("Right")) {
				xpath1 = String.format(BasicLowerLimbLocator.radio_circulation_capillary_refill_right2, value);
			} else {
				xpath1 = String.format(BasicLowerLimbLocator.radio_circulation_capillary_refill_left2, value);
			}
			return By.xpath(xpath1);
		}

		public static By getRadioOptionByEmegency_liveAlone(String section) {
			EmergencyPlanning2 = section;
			if (section.equalsIgnoreCase("Yes"))
				return By.xpath("//div[@id='md-radio-live_alone1']//child::label");
			else
				return By.xpath("//div[@id='md-radio-live_alone2']//child::label");
		}

		public static By getRadioOptionByEmegency_E_panning(String section) {
			EmergencyPlanning3 = section;
			if (section.equalsIgnoreCase("Yes"))
				return By.xpath("//div[@id='md-radio-contact_support_person1']/label");
			else
				return By.xpath("//div[@id='md-radio-contact_support_person2']/label");
		}

		public static By getRadioOptionByPCAPainPump_cassete_ccf(String section) {
			return By.xpath("//label[@id='cassette_changed1_label']");
		}

		public static By getRadioOptionByPCAPainPump_tubing_tcf(String section) {
			return By.xpath("//label[@id='tubing_changed1_label']");
		}

		public static By getRadioOptionByPCAPainPump_RoutePCA(String section) {
			if (section.equalsIgnoreCase("Subcutaneous"))
				return By.xpath("//label[@for='route_1']");

			else if (section.equalsIgnoreCase("Peripheral Line"))
				return By.xpath("//label[@for='route_2']");
			else
				return By.xpath("//label[@for='route_3']");
		}

		public static By getRadioOptionByPCAPainPump_sitechange_scf(String section) {
			if (section.equalsIgnoreCase("Yes"))
				return By.xpath("//label[@for='site_change1']");
			else
				return By.xpath("//label[@for='site_change2']");
		}

		public static By getRadioOptionByVitalSigns_brf(String section) {
			if (section.equalsIgnoreCase("Yes"))
				return By.xpath("//label[@for='bolus_reset1']");
			else
				return By.xpath("//label[@for='bolus_reset2']");
		}

		public static By getRadioOptionByVitalSigns_perTypefield(String section) {
			return By.xpath("//label[normalize-space(.)='" + section + "']");
		}

		public static By getAcuteRespiratoryIllnessTableValueAsPerIndex(int index) {
			return By.cssSelector("table[class*='table-bordered'] tbody tr:nth-child(1) td:nth-child(" + index + ")");
		}

		public static By getAcuteRespiratoryIllnessTableDeletedValueAsPerIndex(int index) {
			return By.cssSelector(
					"table[class*='table-bordered'] tbody tr:nth-child(1) td:nth-child(" + index + ") del");
		}

		public static By getPPSLevelSelectElementByValue(String ppsValue) {
			return By.cssSelector("input[name*='pps'][onClick*='selectPPS(" + ppsValue + ")']");
		}

		public static By getPalliativeAssessmentToolOptionBySection(String section, String option) {
			return By.xpath(
					"//div[contains(@class, 'portlet-title') and div[@class='caption' and span[normalize-space(text())='"
							+ section.trim()
							+ "']]]//following-sibling::div[@class='portlet-body']//div[contains(@class, 'form-group')]//label[contains(text(), '"
							+ option.trim() + "')]");
		}

		public static By getPalliativeAssessmentLatestValueOnViewerByKey(String mapKey) {
			return By.xpath("//tr//td[normalize-space(text())='" + mapKey.trim()
					+ "']/following-sibling::td[last()]//td[not(a) and text()]");
		}

		public static By getPainESASByRadioOption(String radioOption) {
//			return By.xpath("//div[contains(@id, 'pain') and input[@id='pain_"+radioOption.trim()+"']]");
			return By.xpath("//div[contains(@id, 'pain') and input[@id='pain_" + radioOption.trim() + "']]//label");
		}

		public static By getTirednessESASByRadioOption(String radioOption) {
//			return By.xpath("//div[contains(@id, 'tiredness') and input[@id='tiredness_"+radioOption.trim()+"']]");
			return By.xpath(
					"//div[contains(@id, 'tiredness') and input[@id='tiredness_" + radioOption.trim() + "']]//label");
		}

		public static By getNauseaESASByRadioOption(String radioOption) {
//			return By.xpath("//div[contains(@id, 'nauseated') and input[@id='nauseated_"+radioOption.trim()+"']]");
			return By.xpath(
					"//div[contains(@id, 'nauseated') and input[@id='nauseated_" + radioOption.trim() + "']]//label");
		}

		public static By getDepressionESASByRadioOption(String radioOption) {
//			return By.xpath("//div[contains(@id, 'depressed') and input[@id='depressed_"+radioOption.trim()+"']]");
			return By.xpath(
					"//div[contains(@id, 'depressed') and input[@id='depressed_" + radioOption.trim() + "']]//label");
		}

		public static By getAnxietyESASByRadioOption(String radioOption) {
//			return By.xpath("//div[contains(@id, 'anxious') and input[@id='anxious_"+radioOption.trim()+"']]");
			return By.xpath(
					"//div[contains(@id, 'anxious') and input[@id='anxious_" + radioOption.trim() + "']]//label");
		}

		public static By getDrowsinessESASByRadioOption(String radioOption) {
//			return By.xpath("//div[contains(@id, 'drowsy') and input[@id='drowsy_"+radioOption.trim()+"']]");
			return By.xpath("//div[contains(@id, 'drowsy') and input[@id='drowsy_" + radioOption.trim() + "']]//label");
		}

		public static By getLackOfAppetiteESASByRadioOption(String radioOption) {
//			return By.xpath("//div[contains(@id, 'appetite') and input[@id='appetite_"+radioOption.trim()+"']]");
			return By.xpath(
					"//div[contains(@id, 'appetite') and input[@id='appetite_" + radioOption.trim() + "']]//label");
		}

		public static By getFeelingOfWellBeingESASByRadioOption(String radioOption) {
//			return By.xpath("//div[contains(@id, 'wellbeing') and input[@id='wellbeing_"+radioOption.trim()+"']]");
			return By.xpath(
					"//div[contains(@id, 'wellbeing') and input[@id='wellbeing_" + radioOption.trim() + "']]//label");
		}

		public static By getShortnessBreathESASByRadioOption(String radioOption) {
//			return By.xpath("//div[contains(@id, 'shortness_breath') and input[@id='shortness_breath_"+radioOption.trim()+"']]");
			return By.xpath("//div[contains(@id, 'shortness_breath') and input[@id='shortness_breath_"
					+ radioOption.trim() + "']]//label");
		}

		public static By getOtherESASByRadioOption(String radioOption) {
//			return By.xpath("//div[contains(@id, 'other') and input[@id='other_"+radioOption.trim()+"']]");
			return By.xpath("//div[contains(@id, 'other') and input[@id='other_" + radioOption.trim() + "']]//label");
		}

		public static By getMedicationManagementSectionByValue(String section) {
			return By.xpath("//span[@class='caption-subject'][normalize-space(text())='" + section + "']");
		}

		public static By getMedicationCheckboxSectionByValue(String section) {
			return By.xpath("//span[contains(text(), '" + section.trim() + "')]//preceding-sibling::label");
		}

		public static By getLatestCurrentMedicationRecordByValue(String section) {
			return !section.contains(PixalereStringPool.LAST_DOSE_GIVEN_ON) ? By.xpath(
					"//div[@class='portlet-body']//div[contains(@class, 'med_pink')][1]//label[contains(text(), '"
							+ section.trim() + "')]//following-sibling::div//p[text()]")
					: By.xpath(
							"//div[@class='portlet-body']//div[contains(@class, 'med_pink')][1]//label[contains(text(), '"
									+ section.trim() + "')]//following-sibling::div//label[text()]");
		}

		public static By getLatestHoldMedicationRecordByValue(String section) {
			return By.xpath(
					"//div[@class='portlet-body']//div[contains(@class, 'med_hold')][1]//label[contains(text(), '"
							+ section.trim() + "')]//following-sibling::div//p[text()]");
		}

		public static By getLabelElementByValue(String value) {
			return By.xpath("//label[normalize-space(text())='" + value.trim() + "']");
		}

		public static By getRadioLabelElementByValue(String value) {
			return By.xpath("//input[@label='" + value.trim() + "']//following-sibling::label");
		}

		public static By getInputCheckElementByOption(String Option) {
			return By.xpath("//div[label[normalize-space(text())='" + Option.trim()
					+ "']]//following-sibling::div/input[@type='checkbox']");
		}

		public static By getTableColumnValueAsPerIndex(int index) {
			return By
					.xpath("//table[contains(@class, 'table-bordered')]//tbody//tr[@class][last()]//td[" + index + "]");
		}

		public static By getInfusionsTableLatestValueOnViewerByKey(String mapKey) {
			return By.xpath("//tr//td[normalize-space(text())='" + mapKey.trim() + "']/following-sibling::td[last()]");
		}

		public static By getInfusionsTableLatestValueDeletedOnViewerByKey(String mapKey) {
			return By.xpath("//tr//td[normalize-space(text())='" + mapKey.trim()
					+ "']/following-sibling::td[last()]//del[text()]");
		}
		
		public static By getRadioOptionByService_Supervisor(String section) {
			radioService_Supervisor = section;
			if (section.equalsIgnoreCase("Yes"))
				return By.xpath("//div[@id='md-radio-educator_ack_21']");
			else if (section.equalsIgnoreCase("No"))
				return By.xpath("//div[@id='md-radio-educator_ack_22']");
			else
				return By.xpath("");
		}
		public static By getRadioOptionBydemonstrated_understanding(String section) {
			radiodemonstrated_understanding = section;
			if (section.equalsIgnoreCase("Yes"))
				return By.xpath("//*[@id='md-radio-educator_ack_11']");
			else if (section.equalsIgnoreCase("No"))
				return By.xpath("//*[@id='md-radio-educator_ack_12']");
			else
				return By.xpath("");
		}
		public static By getRadioOptionByPSW_providing(String section) {
			radioPSW_providing = section;
			if (section.equalsIgnoreCase("Yes"))
				return By.xpath("//*[@id='md-radio-the_inst1']");
			else if (section.equalsIgnoreCase("No"))
				return By.xpath("//*[@id='md-radio-the_inst2']");
			else
				return By.xpath("");
		}
		public static By getRadioOptionBy_Guidelines_and_Policies(String section) {
			radioGuidelines_and_Policies = section;
			if (section.equalsIgnoreCase("Yes"))
				return By.xpath("//*[@class='email_verify1_label']");
			else if (section.equalsIgnoreCase("No"))
				return By.xpath("//*[@class='email_verify2_label']");
			else
				return By.xpath("");
		}
		public static By getRadioOptionBy_Virtual_Care_Consent_PT_reviewed(String section) {
			radioVirtual_Care_Consent_PT_reviewed = section;
			if (section.equalsIgnoreCase("Yes"))
				return By.xpath("//*[@id='md-radio-video_consent1']");
			else if (section.equalsIgnoreCase("No"))
				return By.xpath("//*[@id='md-radio-video_consent2']");
			else
				return By.xpath("");
		}
		public static By getRadioOptionBy_Service_Consent_Obtained(String section) {
			radioService_Consent_Obtained = section;
			if (section.equalsIgnoreCase("Yes"))
				return By.xpath("//*[@id='md-radio-questions_addressed_21']");
			else if (section.equalsIgnoreCase("No"))
				return By.xpath("//*[@id='md-radio-questions_addressed_22']");
			else
				return By.xpath("");
		}
				public static By getRadioOptionByActivities_Assigned(String section) {
			radioActivities_Assigned = section;
			if (section.equalsIgnoreCase("Yes"))
				return By.xpath("//*[@id='md-radio-sdm_for_activities1']");
			else if (section.equalsIgnoreCase("No"))
				return By.xpath("//*[@id='md-radio-sdm_for_activities2']");
			else
				return By.xpath("");
		}
		public static By getRadioOptionBymodification_plan(String section) {
			radiomodification_plan = section;
			if (section.equalsIgnoreCase("Yes"))
				return By.xpath("//*[@id='md-radio-sdm_discussed_client1']");
			else if (section.equalsIgnoreCase("No"))
				return By.xpath("//*[@id='md-radio-sdm_discussed_client2']");
			else
				return By.xpath("");
		}
		public static By getRadioOptionByservice_provider(String section) {
			radioservice_provider = section;
			if (section.equalsIgnoreCase("Yes"))
				return By.xpath("//*[@id='md-radio-sdm_discussed_psw1']//label");
			else if (section.equalsIgnoreCase("No"))
				return By.xpath("//*[@id='md-radio-sdm_discussed_psw2']//label");
			else
				return By.xpath("");
		}
		public static By getRadioOptionByEducation_received(String section) {
			radioEducation_received = section;
			if (section.equalsIgnoreCase("Yes"))
				return By.xpath("//*[@id='md-radio-learner_edu_rec1']");
			else if (section.equalsIgnoreCase("No"))
				return By.xpath("//*[@id='md-radio-learner_edu_rec2']");
			else
				return By.xpath("");
		}
		public static By getRadioOptionByalternatives_and_benefits(String section) {
			radioalternatives_and_benefits = section;
			if (section.equalsIgnoreCase("Yes"))
				return By.xpath("//*[@id='md-radio-learner_for_list_act1']");
			else if (section.equalsIgnoreCase("No"))
				return By.xpath("//*[@id='md-radio-learner_for_list_act2']");
			else
				return By.xpath("");
		}
				public static By getRadioOptionByImmunization_up_to_date(String section) {

			radioImmunization_up_to_date1 = section;
			if (section.contains("Yes"))
				return By.xpath("//*[@id='md-radio-immunization_date1']");
			else if (section.contains("No"))
				return By.xpath("//*[@id='md-radio-immunization_date2']");
			else
				return By.xpath("");
		}

		public static By getRadioOptionByAdmission_goals_discharge_planning(String section) {

			radioAdmission_goals_discharge_planning = section;
			if (section.contains("Yes"))
				return By.xpath("//*[@id='md-radio-goals_discussed1']");
			else if (section.contains("No"))
				return By.xpath("//*[@id='md-radio-goals_discussed2']");
			else
				return By.xpath("");
		}

		public static By getRadioOptionByPacemaker_Present(String section) {

			radioPacemaker_Present = section;
			if (section.contains("No"))
				return By.xpath("//*[@id='md-radio-pacemaker_present1']");
			else if (section.contains("Yes"))
				return By.xpath("//*[@id='md-radio-pacemaker_present2']");
			else
				return By.xpath("");
		}

		public static By getRadioOptionByPacemaker_Present_Type(String section) {

			radioPacemaker_Type = section;
			if (section.contains("On-demand"))
				return By.xpath("//*[@id='md-radio-cardiovascular_type-1']");
			else if (section.contains("Fixed"))
				return By.xpath("//*[@id='md-radio-cardiovascular_type-2']");
			else
				return By.xpath("");
		}

		public static By getRadioOptionByExtremities_warm(String section) {

			radioExtremities_warm = section;
			if (section.contains("Yes"))
				return By.xpath("//*[@id='md-radio-extremities1']");
			else if (section.contains("No"))
				return By.xpath("//*[@id='md-radio-extremities2']");
			else
				return By.xpath("");
		}

		public static By getRadioOptionByCap_refill(String section) {

			radioCap_refill = section;
			if (section.contains("Less than or equal to 2 seconds"))
				return By.xpath("//*[@id='md-radio-caprefill-1']");
			else if (section.contains("Greater than 2 seconds"))
				return By.xpath("//*[@id='md-radio-caprefill-2']");
			else
				return By.xpath("");
		}

		public static By getRadioOptionByCyanosis_Present(String section) {

			radioCyanosis_Present = section;
			if (section.contains("No"))
				return By.xpath("//*[@id='md-radio-cyanosis1']");
			else if (section.contains("Yes"))
				return By.xpath("//*[@id='md-radio-cyanosis2']");
			else
				return By.xpath("");
		}

		public static By getRadioOptionByEdema_noted(String section) {

			radioEdema_noted = section;
			if (section.contains("No"))
				return By.xpath("//*[@id='md-radio-edema1']");
			else if (section.contains("Yes"))
				return By.xpath("//*[@id='md-radio-edema2']");
			else
				return By.xpath("");
		}

		public static By getRadioOptionByPresence_of_Central(String section) {

			radioPresence_of_Central = section;
			if (section.contains("No"))
				return By.xpath("//*[@id='md-radio-intravenous_line1']");
			else if (section.contains("Yes"))
				return By.xpath("//*[@id='md-radio-intravenous_line2']");
			else
				return By.xpath("");
		}

		public static By getRadioOptionByMurmurs(String section) {

			radioMurmurs = section;
			if (section.contains("Yes"))
				return By.xpath("//*[@id='md-radio-murmurs1']");
			else if (section.contains("No"))
				return By.xpath("//*[@id='md-radio-murmurs2']");
			else
				return By.xpath("");
		}
		public static By getRadioOptionByHumidifier_ON_Checked_field(String section) {
			radioHumidifier_ON_Checked = section;
			if (section.equalsIgnoreCase("Yes"))
				return By.xpath("//*[@id='md-radio-humid_on1']");
			else if (section.equalsIgnoreCase("No"))
				return By.xpath("//*[@id='md-radio-humid_on2']");
			else
				return By.xpath("");
		}
		public static By getRadioOptionByWater_Level_Checked_field(String section) {
			radioWater_Level_Checked = section;
			if (section.equalsIgnoreCase("Yes"))
				return By.xpath("//*[@id='md-radio-water_checked1']");
			else if (section.equalsIgnoreCase("No"))
				return By.xpath("//*[@id='md-radio-water_checked2']");
			else
				return By.xpath("");
		}
		public static By getRadioOptionByclient_ventilator_field(String section) {
			radioclient_ventilator = section;
			if (section.equalsIgnoreCase("Yes"))
				return By.xpath("//*[@id='md-radio-ventilaton1']");
			else if (section.equalsIgnoreCase("No"))
				return By.xpath("//*[@id='md-radio-ventilaton2']");
			else
				return By.xpath("");
		}
		public static By getRadioOptionBysuctioning_performed_field(String section) {
			radiosuctioning_performed = section;
			if (section.equalsIgnoreCase("Yes"))
				return By.xpath("//*[@id='md-radio-suction_question1']");
			else if (section.equalsIgnoreCase("No"))
				return By.xpath("//*[@id='md-radio-suction_question2']");
			else
				return By.xpath("");
		}
		public static By getRadioOptionByStoma_Care_Provided_field(String section) {
			radioStoma_Care_Provided = section;
			if (section.equalsIgnoreCase("Yes"))
				return By.xpath("//*[@id='md-radio-stoma_care1']");
			else if (section.equalsIgnoreCase("No"))
				return By.xpath("//*[@id='md-radio-stoma_care2']");
			else
				return By.xpath("");
		}
		public static By getRadioOptionBySpare_Trach_Set_Available(String section) {
			radioSpare_Trach_Set_Available = section;
			if (section.equalsIgnoreCase("Yes"))
				return By.xpath("//*[@id='md-radio-spare_trach_set1']");
			else if (section.equalsIgnoreCase("No"))
				return By.xpath("//*[@id='md-radio-spare_trach_set2']");
			else
				return By.xpath("");
		}
		public static By getRadioOptionByTrach_Set_Change_field(String section) {
			radioTrach_Set_Change_field = section;
			if (section.equalsIgnoreCase("Yes"))
				return By.xpath("//*[@id='md-radio-trach_set_change1']");
			else if (section.equalsIgnoreCase("No"))
				return By.xpath("//*[@id='md-radio-trach_set_change2']");
			else
				return By.xpath("");
		}
		public static By getRadioOptionBySuction_System_Checks(String section) {
			radioSuction_System_Checks = section;
			if (section.equalsIgnoreCase("Yes"))
				return By.xpath("//*[@id='md-radio-suction_system_checks1']");
			else if (section.equalsIgnoreCase("No"))
				return By.xpath("//*[@id='md-radio-suction_system_checks2']");
			else
				return By.xpath("");
		}
		public static By getRadioOptionByTrachestomy(String section) {
			radioTrachestomy = section;
			if (section.equalsIgnoreCase("Humidified Air"))
				return By.xpath("//*[@id='md-radio-humidity-1']");
			else if (section.equalsIgnoreCase("HME"))
				return By.xpath("//*[@id='md-radio-humidity-2']");
			else
				return By.xpath("");
		}
		public static By getRadioOptionByIncontinence(String section) {
			radioIncontinence = section;
			if (section.equalsIgnoreCase("0 : Complete/ catheterised"))
				return By.xpath("//*[@id='md-radio-incontinence_list-1']");
			else if (section.equalsIgnoreCase("1 : Incontinent urine"))
				return By.xpath("//*[@id='md-radio-incontinence_list-2']");
			else if (section.equalsIgnoreCase("2 : Incontinent faeces"))
				return By.xpath("//*[@id='md-radio-incontinence_list-3']");
			else if (section.equalsIgnoreCase("3 : Doubly incontinent (urine & faeces)"))
				return By.xpath("//*[@id='md-radio-incontinence_list-4']");
			else
				return By.xpath("");
		}

		public static By getRadioOptionBySkin_Type_Visual_Risk_Area(String section) {
			radioSkin_Type_Visual_Risk_Area = section;
			if (section.equalsIgnoreCase("0 : Healthy"))
				return By.xpath("//*[@id='md-radio-skintype_list-1']");
			
			else if (section.equalsIgnoreCase("1 : Tissue paper (thin/fragile)"))
				return By.xpath("//*[@id='md-radio-skintype_list-2']");
			
			else if (section.equalsIgnoreCase("1 : Dry (appears flaky)"))
				return By.xpath("//*[@id='md-radio-skintype_list-3']");
			
			else if (section.equalsIgnoreCase("1 : Oedematous (puffy)"))
				return By.xpath("//*[@id='md-radio-skintype_list-4']");
			
			else if (section.equalsIgnoreCase("1 : Clammy (moist to touch)/pyrexia"))
				return By.xpath("//*[@id='md-radio-skintype_list-5']");
			
			else if (section.equalsIgnoreCase("2 : Discoloured (bruising/mottled)"))
				return By.xpath("//*[@id='md-radio-skintype_list-6']");
			else if (section.equalsIgnoreCase("3 : Broken (established ulcer)"))
				return By.xpath("//*[@id='md-radio-skintype_list-7']");
			else
				return By.xpath("");
		}
		
		public static By getRadioOptionByMobility(String section) {
			radioMobility = section;
			if (section.equalsIgnoreCase("0 : Fully mobile"))
				return By.xpath("//*[@id='md-radio-mobility_list-1']");
			
			else if (section.equalsIgnoreCase("1 : Restless/fidgety"))
				return By.xpath("//*[@id='md-radio-mobility_list-2']");
			
			else if (section.equalsIgnoreCase("2 : Apathetic (sedated/depressed/reluctant to move)"))
				return By.xpath("//*[@id='md-radio-mobility_list-3']");
			
			else if (section.equalsIgnoreCase("3 : Restricted (restricted by severe pain or disease)"))
				return By.xpath("//*[@id='md-radio-mobility_list-4']");
			
			else if (section.equalsIgnoreCase("4 : Bedbound (unconscious/unable to change position/traction)"))
				return By.xpath("//*[@id='md-radio-mobility_list-5']");
			
			else if (section.equalsIgnoreCase("5 : Chair bound (unable to leave chair without assistance)"))
				return By.xpath("//*[@id='md-radio-mobility_list-6']");
			else
				return By.xpath("");
		}
		public static By getRadioOptionByNutrition_Element(String section) {
			radioNutrition_Element = section;
			if (section.equalsIgnoreCase("0 : Unplanned weight loss in past 3-6 months < 5%"))
				return By.xpath("//*[@id='md-radio-nutrition_list-1']");
			
			else if (section.equalsIgnoreCase("1 : Unplanned weight loss in past 3-6 months 5-10%"))
				return By.xpath("//*[@id='md-radio-nutrition_list-2']");
			
			else if (section.equalsIgnoreCase("2 : Unplanned weight loss in past 3-6 months > 10%"))
				return By.xpath("//*[@id='md-radio-nutrition_list-3']");
			
			else if (section.equalsIgnoreCase("99 : BMI"))
				return By.xpath("//*[@id='md-radio-nutrition_list-4']");
			
			else if (section.equalsIgnoreCase("2 : Patient/ client acutely ill or no nutritional intake > 5 days"))
				return By.xpath("//*[@id='md-radio-nutrition_list-5']");

			else
				return By.xpath("");
		}
		public static By getRadioOptionBySuction_machine_working(String section) {
			radioSuction_machine_working = section;
			if (section.equalsIgnoreCase("Yes"))
				return By.xpath("//*[@id='md-radio-pressure_checked1']//label");
			else if (section.equalsIgnoreCase("No"))
				return By.xpath("//*[@id='md-radio-pressure_checked2']//label");
			else
				return By.xpath("");
		}
		public static By getRadioOptionByBattery_charged(String section) {
			radioBattery_charged = section;
			if (section.equalsIgnoreCase("Yes"))
				return By.xpath("//*[@id='md-radio-battery1']//label");
			else if (section.equalsIgnoreCase("No"))
				return By.xpath("//*[@id='md-radio-battery2']//label");
			else
				return By.xpath("");
		}
		public static By getRadioOptionByType_of_suctioning(String section) {
			radioType_of_suctioning = section;
			if (section.equalsIgnoreCase("Oral suctioning"))
				return By.xpath("//*[@id='suction_type1']");
			else if (section.equalsIgnoreCase("Oropharyngeal suctioning"))
				return By.xpath("//*[@id='suction_type2']");
			else if (section.equalsIgnoreCase("Nasopharyngeal suctioning"))
				return By.xpath("//*[@id='suction_type3']");
			else
				return By.xpath("");
		}
		public static By getRadioOptionByAmount(String section) {
			radioAmount = section;
			if (section.equalsIgnoreCase("Scant"))
				return By.xpath("//*[@id='md-radio-amount5505-1']//label");
			else if (section.equalsIgnoreCase("Moderate"))
				return By.xpath("//*[@id='md-radio-amount5505-2']//label");
			else if (section.equalsIgnoreCase("Copious"))
				return By.xpath("//*[@id='md-radio-amount5505-3']//label");
			else
				return By.xpath("");
		}
		public static By getRadioOptionByColor(String section) {
			radioColor = section;
			if (section.equalsIgnoreCase("Clear"))
				return By.xpath("//*[@id='md-radio-color5505-1']//label");
			else if (section.equalsIgnoreCase("White"))
				return By.xpath("//*[@id='md-radio-color5505-2']//label");
			else if (section.equalsIgnoreCase("Yellow"))
				return By.xpath("//*[@id='md-radio-color5505-3']//label");
			else if (section.equalsIgnoreCase("Green"))
				return By.xpath("//*[@id='md-radio-color5505-4']//label");
			else if (section.equalsIgnoreCase("Rust/Brown"))
				return By.xpath("//*[@id='md-radio-color5505-5']//label");
			else if (section.equalsIgnoreCase("Blood-tinged"))
				return By.xpath("//*[@id='md-radio-color5505-6']//label");
			else
				return By.xpath("");
		}
		public static By getRadioOptionByConsistency(String section) {
			radioConsistency = section;
			if (section.equalsIgnoreCase("Thin"))
				return By.xpath("//*[@id='md-radio-consistency5505-1']//label");
			else if (section.equalsIgnoreCase("Frothy"))
				return By.xpath("//*[@id='md-radio-consistency5505-2']//label");
			else if (section.equalsIgnoreCase("Thick"))
				return By.xpath("//*[@id='md-radio-consistency5505-3']//label");
			else
				return By.xpath("");
		}
		public static By getRadioOptionByOdour(String section) {
			radioOdour = section;
			if (section.equalsIgnoreCase("None"))
				return By.xpath("//*[@id='md-radio-odour5505-1']//label");
			else if (section.equalsIgnoreCase("Foul"))
				return By.xpath("//*[@id='md-radio-odour5505-2']//label");
			else
				return By.xpath("");
		}
		public static By getRadioOptionBySuctioning_container_cleaned(String section) {
			radioSuctioning_container = section;
			if (section.equalsIgnoreCase("Yes"))
				return By.xpath("//*[@id='md-radio-container_clean1']//label");
			else if (section.equalsIgnoreCase("No"))
				return By.xpath("//*[@id='md-radio-container_clean2']//label");
			else
				return By.xpath("");
		}
		public static By getRadioOptionByNon_invasive_ventilation(String section) {
			radioNon_invasive_ventilation = section;
			if (section.equalsIgnoreCase("CPAP"))
				return By.xpath("//div[@id='md-radio-ventilation-1']//label");
			else if (section.equalsIgnoreCase("BiPAP"))
				return By.xpath("//div[@id='md-radio-ventilation-2']//label");
			else
				return By.xpath("");
		}
		public static By getRadioOptionByOxygen_in_situ(String section) {
			radioOxygen_in_situ = section;
			if (section.equalsIgnoreCase("Yes"))
				return By.xpath("//div[@id='md-radio-oxygen1']//label");
			else if (section.equalsIgnoreCase("No"))
				return By.xpath("//div[@id='md-radio-oxygen1']//label");
			else
				return By.xpath("");
		}
		public static By getRadioOptionByHumidifier_Check(String section) {
			radioHumidifier_Check = section;
			if (section.equalsIgnoreCase("Yes"))
				return By.xpath("//div[@id='md-radio-humidifier1']//label");
			else if (section.equalsIgnoreCase("No"))
				return By.xpath("//div[@id='md-radio-humidifier2']//label");
			else
				return By.xpath("");
		}
		public static By getRadioOptionByAir_filter_cleaned(String section) {
			radioAir_filter_cleaned = section;
			if (section.equalsIgnoreCase("Yes"))
				return By.xpath("//div[@id='md-radio-air_filter1']//label");
			else if (section.equalsIgnoreCase("No"))
				return By.xpath("//div[@id='md-radio-air_filter2']//label");
			else
				return By.xpath("");
		}
		public static By getRadioOptionByMask_tubing_cleaned(String section) {
			radioMask_tubing_cleaned = section;
			if (section.equalsIgnoreCase("Yes"))
				return By.xpath("//div[@id='md-radio-mask_cleaned1']//label");
			else if (section.equalsIgnoreCase("No"))
				return By.xpath("//div[@id='md-radio-mask_cleaned2']//label");
			else
				return By.xpath("");
		}
		public static By getRadioOptionByCough_Assist(String section) {
			radioCough_Assist = section;
			if (section.equalsIgnoreCase("Manual"))
				return By.xpath("//*[@id='md-radio-cough_assist-1']//label");
			else if (section.equalsIgnoreCase("Automatic"))
				return By.xpath("//*[@id='md-radio-cough_assist-2']//label");
			else
				return By.xpath("");
		}
		public static By getRadioOptionByAir_filter_cleaned_Cough_Assist(String section) {
			radioAir_filter_cleaned_Cough_Assist = section;
			if (section.equalsIgnoreCase("Yes"))
				return By.xpath("//*[@id='md-radio-cough_air_filter1']//label");
			else if (section.equalsIgnoreCase("No"))
				return By.xpath("//*[@id='md-radio-cough_air_filter2']//label");
			else
				return By.xpath("");
		}
		public static By getRadioOptionByMask_tubing_cleaned_Cough_Assist(String section) {
			radioMask_tubing_cleaned_Cough_Assist = section;
			if (section.equalsIgnoreCase("Yes"))
				return By.xpath("//*[@id='md-radio-cough_mask_cleaned1']//label");
			else if (section.equalsIgnoreCase("No"))
				return By.xpath("//*[@id='md-radio-cough_mask_cleaned2']//label");
			else
				return By.xpath("");
		}
	}
		
}
