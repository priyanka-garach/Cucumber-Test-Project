package pixalere.scripts;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;

import cucumber.api.Format;
import pixalere.pageObjectJavaUtils.JavaUtils;
import pixalere.pageObjectUtils.LocatorUtils.GlobalPageLocators;
import pixalere.pageObjectUtils.LocatorUtils.OTLocators;
import pixalere.pageObjectUtils.LocatorUtils.SeatingMobilityLocator;
import pixalere.pageObjectUtils.LocatorUtils.TracheostomyLocators;
import pixalere.pageObjectUtils.PixalereCommonUtils;
import pixalere.pageObjectUtils.PixalereStringPool;

public class PixalereScripts extends PixalereCommonUtils {

	public static List<String> SeatingAndMobility_Radio = new ArrayList<>();
	
	public static String Special_Delivery_Instructions;
	public static String first_areaofconcern;
	public static String secondareaof_concern;
	public static String PixalereTestsAdmin;

	public static String Minute_Ventilation1;
	public static String PRESSURE_Tracheostomy1;
	public static String Volume_Tidal_Exhaled1;

	public static String VarFP1001;
	public static String VarMP1549;
	public static String VarCCN;
	public static String YearLHIN;
	public static String addinfoLHIN1;
	public static String addinfoLHIN2;
	public static String Equipment_Source;
	public static String Case_Coordinator;
	public static String Primary_nurse_contact_info;

	public static String Weight_10;

	public static String Visit_Date;
	public static String Assessment_Initiated_Comments;
	public static String Diagnosis_History_of_Presenting_Concern;
	public static String Client_SDM_Stated_Goal;
	public static String Past_Medical_History;
	public static String Investigations_followup_clinically_relevant;
	public static String Investigations_Date;
	public static String Difficulties_report;
	public static String PT_scope_of_practice;
	public static String Posture_Assessed_comment;
	public static String Edema_Location;
	public static String Pain_Date;
	public static String Palliating_Factors_List;
	public static String Aggravating_Factors_List;
	public static String Date_of_MSK_Assessment;
	public static String Musculoskeletal_Status_comments;
	public static String Respiratory_comments;
	public static String Neurological_comments;
	public static String Cognition_comments;

	public static String Bed_Mobility_comment;
	public static String Chair_Repositioning_comment;
	public static String Transfers_comment;
	public static String Weight_Bearing_Status_comment;
	public static String Ambulation_comment;
	public static String TUG_Time;
	public static String Aid_used;
	public static String second_sit_stand_Test;
	public static String Balance_Assessed_comments;

	public static String Analysis_Comments;
	public static String Previous_Funding_Comments;
	public static String client_Weight;
	public static String Hip_width;
	public static String Popliteal_fossa_heal;
	public static String Rationale;
	public static String Handle_height;
	
	public static String CLIENT_SUMMARY_Special_Instructions;
	public static String pt_modified_exercise;
	public static String Document_Name_for_Document_Upload1;

	public static String SM1;
	public static String SM2;
	public static String SM3;
	public static String SM4;
	public static String SM5;
	public static String SM6;
	public static String SM7;
	public static String SM8;
	public static String SM9;
	public static String SM10;
	public static String SM11;
	public static String SM12;
	public static String SM13;
	public static String SM14;
	public static String SM15;
	public static String SM16;
	public static String FMSM1=null;
	public static String FMSM2=null;
	public static String FMSM3=null;
	public static String FMSM4=null;
	public static String FMSM5=null;
	public static String FMSM6=null;
	public static String FMSM7=null;
	public static String FMSM8=null;
	public static String FMSM9=null;
	public static String FMSM10=null;
	public static String FMSM11=null;
	public static String FMSM12=null;
	public static String FMSM13=null;
	public static String FMSM14=null;
	public static String FMSM15=null;
	public static String FMSM16=null;
	public static String FMSM17=null;
	public static String FMSM18=null;
	public static String FMSM19=null;
	
	//Pt client consent
	public static String Specify_Proposed_Health_Services;
	public static String Service_Consent_Obtained_comments;
	public static String Other_comment_Family_friends_caregivers;
	public static String Other_comment_Medical_Contacts;
	public static String Consent_vendors;
	public static String Other_comment_Consent_Obtained;
	public static String Alternate_Contact_Name_Phone_Number;
	public static String Back_up_plan;
	public static String Back_up_plan_comments;
	public static String SDM_Name_consent;
	public static String Other_relationship_comment;
	public static String Date_client_consent;
	public static String Lock_Box_Required_comment;
	public static String Effective_Date_client_consent;
	public static String Additional_Comments_Prevention_Best_Practices;

	public static List<String> list_SM1 = new ArrayList<>();
	
	public static List<String> list_SM2 = new ArrayList<>();
	public static List<String> list_SM3 = new ArrayList<>();
	public static List<String> list_SM4 = new ArrayList<>();
	public static List<String> list_SM5 = new ArrayList<>();
	public static List<String> list_SM6 = new ArrayList<>();
	public static List<String> list_SM7 = new ArrayList<>();
	public static List<String> list_SM8 = new ArrayList<>();
	public static List<String> list_SM9 = new ArrayList<>();
	public static List<String> list_SM10 = new ArrayList<>();
	public static List<String> list_SM11 = new ArrayList<>();
	
	public static List<String> list_SM12 = new ArrayList<>();
	
	public static List<String> list_SM13 = new ArrayList<>();
	
	public static List<String> list_SM14 = new ArrayList<>();
	
	public static List<String> list_SM15 = new ArrayList<>();
	public static List<String> list_SM16 = new ArrayList<>();
	public static List<String> list_SM17 = new ArrayList<>();
	public static List<String> list_SM18 = new ArrayList<>();
	public static List<String> list_SM19 = new ArrayList<>();
	public static List<String> list_SM20 = new ArrayList<>();
	public static List<String> list_SM21 = new ArrayList<>();
	

	public static String TIME_PT;
	public static String AID_USED_TUG;
	public static String FIMData1;
	public static String CAMPTCOMMENTS1;
	public static String RecommendationsDataSPT1;
	public static String RecommendationDate1;
	public static String HoldAST1;
	public static String SideAST1;
	public static String RepeatAST1;
	public static String SideAST2;
	public static String SideAST3;
	public static String SideAST4;
	public static String SideAST5;
	public static String SideAST6;
	public static String HoldAST2;
	public static String HoldAST3;
	public static String HoldAST4;
	public static String HoldAST5;
	public static String RepeatAST2;
	public static String RepeatAST3;
	public static String RepeatAST4;
	public static String RepeatAST5;
	public static String ExcersizeName;
	public static String ExcersizeComments;
	public static String ExcersizeHandoutDate1;
	public static String Client_SDM_Goal;
	public static String Comments_Tinneti1;
	public static String cam_tool_comment1;

	public static String MD_NP_contact_info1;
	public static String Client_Caregiver_Requests1;
	public static String Caseload_District1;
	public static String Special_precautions1;
	public static String Secondary_nurse_contact_info1;
	public static String Last_enteral_tube_change1;
	public static String Day_MicKEY_balloon_reinflation1;
	public static String Careofsite1;
	public static String Times_of_feeds1;
	public static String Number_of_treatment1;
	public static String Therapy_hours1;

	public static String Information_for_scale_provided1;
	public static String Worst_Possible_Pain_101;
	public static String Worst_Possible_Pain_9;
	public static String Worst_Possible_Pain_8;
	public static String Moderate_Pain_51;
	public static String Moderate_Pain_4;
	public static String Moderate_Pain_3;
	public static String Words_used_for_pain1;
	public static String discomfortpain_triggers_for_your_child1;
	public static String initial_interventions_in_the_past1;
	public static String the_child_doing_when_you_noticed_the_pain1;
	public static String Medications_for_Pain_Pharmacological1;
	public static String Cooling_spray_Physical_Environmental1;
	public static String Massage_for_Physical_Environmental;
	public static String Repositioning_for_Physical_Environmental;
	public static String Distraction_Psychological_Behavioral1;
	public static String Medical_Devices_Intervention1;
	public static String Medical_Devices1;
	public static String Client_Specific_Intervention_Other1;
	public static String Please_document_MRP_recommendations1;

	public static String Aggravating_Factors1;
	public static String Comments_Pain_Profile1;

	public static String Adjuvant_Pain_Medication1;
	public static String Palliating_Factors1;
	public static String Aggravating_Factors_PPA1;
	public static String Intensity1;
	public static String Pharmacological_Intervention1;
	public static String Document_Type_Nursing;

	// Pain Assessment
	public static String day_onset;
	public static String month_onset;
	public static String day_last_BM;
	public static String month_last_BM;
	public static String drp_frequency;

	public static String OtherICAone1;
	public static String OtherICA21;
	public static String Symptom_Management1;
	public static String OtherICA31;
	public static String Cardiovascular_History_Comments1;
	public static String Respiratory_History_Comments1;
	public static String Eyes_Ears_Nose_Throat_History_Comments1;
	public static String Client_Perspective11;
	public static String Client_Perspective21;
	public static String Client_Perspective31;
	public static String Client_Perspective41;
	public static String Client_Perspective51;

	public static String Ankle_Dorsiflexion1;
	public static String Ankle_Plantarflexion1;
	public static String Knee_Flexion1;
	public static String Knee_Extension1;
	public static String Hip_Flexion1;
	public static String Hip_Abduction1;
	public static String Hip_Extension1;
	public static String Wrist_Flexion1;
	public static String Wrist_Extension1;
	public static String Elbow_Flexion1;
	public static String Elbow_Extension1;
	public static String Elbow_Supination1;
	public static String Elbow_Pronation1;
	public static String Shoulder_Abduction1;
	public static String Shoulder_External_Rotation1;
	public static String Shoulder_Internal_Rotation1;
	public static String CSpine_Flexion1;
	public static String CSpine_Extension1;
	public static String CSpine_SideFlexion1;
	public static String CSpine_Rotation1;
	public static String LSpine_Flexion1;
	public static String LSpine_Extension1;
	public static String LSpine_SideFlexion1;
	public static String Other_JointMovement1;
	public static String Shoulder_Flexion1;
	public static String SDM_Name1;
	public static String FileUploadADP_Funding_Decision1;
	public static String ADP_Authorizer_Name1;
	public static String Date_ADP1;
	public static String Document_Name_for_Filter1;

	public static String Source_of_Info1;
	public static String Allergies_and_Reactions;
	public static String Primary_Diagnosis;
	public static String Custodial_Arrangements1;
	public static String Important_Past_Medical_Surgical_History1;
	public static String nursing_service1;
	public static String most_important1;
	public static String health_teaching1;
	public static String values_and_beliefs1;
	public static String concerns_or_issues1;
	public static String Daycare_Childcare1;
	public static String Siblings1;
	public static String Significant_Other_Relationships_Pets1;
	public static String Respiratory_History_Comments_PICAT1;
	public static String Respiratory_Assessment_Comments_PICAT1;
	public static String Cardiovascular_History_Comments_PICAT1;
	public static String Cardiovascular_Assessment_Comments_PICAT1;
	public static String Gastrointestinal_Assessment_Comments_PICAT1;
	public static String Skin_History_Comments_PICAT1;
	public static String Skin_Assessment_Comments_PICAT1;
	public static String Catheter_Size;
	public static String Care_Instructions;
	public static String Mental_Health_Concerns;
	public static String Genito_Urinary_Assessment_Comments_PICAT1;
	public static String Neurological_Assessment_Comments_PICAT1;
	public static String Neuromuscular_History_Comments_PICAT1;
	public static String Neuromuscular_Assessment_Comments_PICAT1;
	public static String Last_dental_appointment;
	public static String Oral_hygiene_practices;
	public static String Head_Eyes_Ears_Nose_Mouth_Throat;
	public static String Child_Behaviour;
	public static String Distractibility_Attention_span;
	public static String Behavioural_Safety_Comments_PICAT1;
	public static String Nutrition_Likes;
	public static String Nutrition_Dislikes;
	public static String Nutrition_Sensitivies;
	public static String Client_Care_Summary;
	public static String Bedtime_routine;
	public static String medical_devices;
	public static String Sleep_Rest_Comments_PICAT1;
	public static String School_participation_PICAT1;
	public static String Social_interactions_PICAT1;
	public static String Routine_activities_exercise_PICAT1;
	public static String Favourite_toys_security_object_hobbies_PICAT1;
	public static String MAHC_Details_Comments1;
	public static String Activity_to_be_Instructed1;
	public static String LearnerName1;
	public static String LearnerDate1;
	public static String EducationComment1;
	public static String MAHC_radio_1;
	public static String MAHC_radio_2;
	public static String MAHC_radio_3;
	public static String MAHC_radio_4;
	public static String MAHC_radio_5;
	public static String MAHC_radio_6;
	public static String MAHC_radio_7;
	public static String MAHC_radio_8;
	public static String MAHC_radio_9;
	public static String MAHC_radio_10;
	public static String MAHC_radio_11;
	public static String MAHC_radio_12;
	public static String Date_of_Visit_Tinneti1;

	// *D*////////////////////////
	public static String Year_Date_ALLA1;
	public static String Dorsalis_Pedis_mmHg_Right1;
	public static String Dorsalis_Pedis_mmHg_Left1;
	public static String Posterior_Tibial_mmHg_Right1;
	public static String Posterior_Tibial_mmHg_Left1;
	public static String Ankle_Brachial_Pressure_mmHg_Right1;
	public static String Ankle_Brachial_Pressure_mmHg_Left1;
	public static String Toe_Pressure_mmHg_Right1;
	public static String Toe_Pressure_mmHg_Left1;
	public static String Brachial_Pressure_mmHg_Right1;
	public static String Brachial_Pressure_mmHg_Left1;
	public static String Year_Date_TBI1;
	public static String Score_Right1;
	public static String Score_Left1;
	public static String Forearm_Measurement_cm_Left1;
	public static String Wrist_Measurement_cm_Left1;
	public static String Client_Needs_Goals_One1;
	public static String Client_Needs_Goals_Two1;
	public static String Client_Needs_Goals_Three1;
	public static String Service_Teaching_Plan_One1;
	public static String Service_Teaching_Plan_Two1;
	public static String Service_Teaching_Plan_Three1;
	public static String berbal1;
	public static String berbal2;
	public static String berbal3;
	public static String berbal4;
	public static String berbal5;
	public static String berbal6;
	public static String berbal7;
	public static String berbal8;
	public static String berbal9;
	public static String berbal10;
	public static String berbal11;
	public static String berbal12;
	public static String berbal13;
	public static String berbal14;
	public static String sitting1;
	public static String sitting2;
	public static String sitting3;
	public static String sitting4;
	public static String sitting5;
	public static String sitting6;
	public static String sitting7;
	public static String sitting8;
	public static String sitting9;
	public static String sitting10;
	public static String sitting11;
	public static String sitting12;
	public static String sitting13;
	public static String sitting14;
	public static String sitting15;
	public static String sitting16;
	public static String sitting17;
	public static String sitting18;
	public static String sitting19;
	public static String cam1;
	public static String cam2;
	public static String cam3;
	public static String cam4;
	public static String val;

	public static String ICAT_radio_1;
	public static String ICAT_radio_2;
	public static String ICAT_radio_3;
	public static String ICAT_radio_4;
	public static String ICAT_radio_5;
	public static String ICAT_radio_6;
	public static String ICAT_radio_7;
	public static String ICAT_radio_8;
	public static String ICAT_radio_9;
	public static String ICAT_radio_10;
	public static String ICAT_radio_11;
	public static String ICAT_radio_12;

	public static String radioSkinLeftfoot;
	public static String radioSkinRightfoot;
	public static String radioLeftfootnails;
	public static String radioRightfootnails;
	public static String radiodeformity_leftfoot;
	public static String radiodeformity_rightfoot;
	public static String radiofootwear_leftfoot;
	public static String radiofootwear_rightfoot;
	public static String radiotempcold_leftfoot;
	public static String radiotempcold_rightfoot;;
	public static String radiorangeofmotion_leftfoot;
	public static String radiorangeofmotion_rightfoot;
	public static String radiosensation_question_leftfoot;
	public static String radiosensation_question_rightfoot;
	public static String radiopedal_pulse_leftfoot;
	public static String radiopedal_pulse_rightfoot;
	public static String radiodependent_rubor_leftfoot;
	public static String radiodependent_rubor_rightfoot;
	public static String radioerythema_leftfoot;
	public static String radioerythema_rightfoot;
	public static String varDelete_inViewer;
	public static String Other_Service_Consent_Obtained1;
	public static String Comments_Service_Consent_Obtained1;
	public static String Alternate_Contact_Name1;
	public static String Backup_Plan1;
	public static String Comments_in_Virtual_Care_Consent1;
	public static String Email1;
	public static String Date_Guidelines1;
	public static String Date_Guidelines_Alternate1;
	public static String Lock_Box_Required1;
	public static String pt_teaching_agreement_comment1;
	public static String pt_teaching_agreement_comment0;
	public static String Suctioning_comment1;
	public static String Suctioning_Year1;
	public static String invasive_ventilation_Year1;
	public static String Cough_Assist_Year1;
	public static String score;
	public static String Year_Calender_Pain_Assessment;
	public static String date_of_Last_BM;
	public static String Intensity_Pain_Assessment;
	public static String acceptable_pain_Ass;
	public static String Chronic_Pain_Parameters_pain_Ass;
	public static String See_Progress_Notes;
	public static String HomeCommentsNursing1;
	public static String Regular_Pain_Medication1;
	public static String Breakthrough_Pain_Medication1;
	public static String Breakthrough_Frequency1;
	public static String Other_Education_Client_CareGiver1;
	public static String Show_Prevention_2022;

	public static String Balance_Gait;
	public static List<String> list_Cardiovascular_ICAN1 = new ArrayList<>();
	public static List<String> list_Respiratory_ICAN1 = new ArrayList<>();
	public static List<String> list_RespiratoryAssess_ICAN1 = new ArrayList<>();

	public static List<String> list_Eyes_Ears_Nose_Throat = new ArrayList<>();

	public static List<String> Neurological_Assessment = new ArrayList<>();
	public static List<String> Endocrine_Assessment = new ArrayList<>();
	public static List<String> Gastrointestinal_History = new ArrayList<>();
	public static List<String> Gastrointestinal_Assessment = new ArrayList<>();
	public static List<String> Genitourinary_History = new ArrayList<>();
	public static List<String> MAHC_Handouts_provided_field = new ArrayList<>();
	public static List<String> MAHC_ConsultsReferrals = new ArrayList<>();
	public static List<String> MAHC_prior_history_falls_MAHC = new ArrayList<>();
	public static List<String> MAHC_footwear__handsout_provided = new ArrayList<>();
	public static List<String> MAHC_Functional_Mobility_MAHC = new ArrayList<>();
	public static List<String> MAHC_pain_affecting_level_function_MAHC = new ArrayList<>();
	public static List<String> Type_Of_Assessment = new ArrayList<>();
	public static List<String> MAHC_Gait_Aid_Use_MAHC = new ArrayList<>();
	public static List<String> chk_quality_of_pain_ass = new ArrayList<>();
	public static List<String> chk_Accompanying_Symptom_pain_ass = new ArrayList<>();
	public static List<String> chk_Pharmacological_Intervention_pain = new ArrayList<>();

	public void chk_instruct_client_field(String value) {
		clickElement(By.xpath("//input[@id='modified_exercise']//following-sibling::label"));
		pt_modified_exercise = "Yes";
	}

	public void getBalance_Gait() {
		Balance_Gait = getElementText(By.xpath("//*[@id='balancegaitScore']"));
	}

/////////////////////////seating and mobility start///////////////////////////////////////
	public void selectradioAssessmentresults(String string) {
		SM9 = string;
		if (string.equalsIgnoreCase("No"))
			clickElementWithJQuery(By.xpath("(//*[contains(@id,'results_shared2')])[2]"));

		if (string.equalsIgnoreCase("Yes"))
			clickElementWithJQuery(By.xpath("(//*[contains(@id,'results_shared1')])[2]"));
	}

	public void selectradiodevicegoal(String string) {
		SM10 = string;

		if (string.equalsIgnoreCase("No"))
			clickElementWithJQuery(By.xpath("((//*[contains(@id,'goal_established2')])[2]"));

		if (string.equalsIgnoreCase("Yes"))
			clickElementWithJQuery(By.xpath("(//*[contains(@id,'goal_established1')])[2]"));
	}

	public void selectradioparticipation(String string) {
		SM11 = string;

		if (string.equalsIgnoreCase("No"))
			clickElementWithJQuery(By.xpath("(//*[contains(@name,'student_participation')])[2]"));

		if (string.equalsIgnoreCase("Yes"))
			clickElementWithJQuery(By.xpath("(//*[contains(@name,'student_participation')])[1]"));
	}

	public void selectradioadpeligibility(String string) {
		SM12 = string;

		if (string.equalsIgnoreCase("Client appears to meet ADP eligibility"))
			clickElementWithJQuery(By.xpath("(//*[contains(@name,'client_adp_eligible')])[1]"));

		if (string.equalsIgnoreCase("Client not eligible for ADP funding"))
			clickElementWithJQuery(By.xpath("(//*[contains(@name,'client_adp_eligible')])[2]"));
	}

	public void selectradioaccessadp(String string) {
		SM13 = string;

		if (string.equalsIgnoreCase("No"))
			clickElementWithJQuery(By.xpath("(//*[contains(@name,'prior_funding')])[2]"));

		if (string.equalsIgnoreCase("Yes"))
			clickElementWithJQuery(By.xpath("(//*[contains(@name,'prior_funding')])[1]"));
	}

	public void selectradiofundingaccessadp(String string) {
		SM14 = string;

		if (string.equalsIgnoreCase("None"))
			clickElementWithJQuery(By.xpath("(//*[contains(@name,'prior_funding_which')])[1]"));

		if (string.equalsIgnoreCase("Prior access to funding by ADP"))
			clickElementWithJQuery(By.xpath("(//*[contains(@name,'prior_funding_which')])[2]"));
	}

	public void selectradiospecificprocedure(String string) {
		SM15 = string;
		if (string.equalsIgnoreCase("File to be transferred to authorizer"))
			clickElementWithJQuery(By.xpath("//*[@id='file_procedure1']"));

		if (string.equalsIgnoreCase("File to remain with therapist while authorizer involved"))
			clickElementWithJQuery(By.xpath("//*[@id='file_procedure2']"));
	}

	public void selectclientsfunctionalmobilitygoals(String section) {
		if (section.contains("Walker")) {
			FMSM1 = "Walker";
			String xpath1 = String.format(SeatingMobilityLocator.chk_functionalmobility, FMSM1);
			clickElementWithJQuery(By.xpath(xpath1));
			list_SM1.add(FMSM1);
		}
		if (section.contains("Manual wheelchair")) {
			FMSM2 = "Manual wheelchair";
			String xpath1 = String.format(SeatingMobilityLocator.chk_functionalmobility, FMSM2);
			clickElementWithJQuery(By.xpath(xpath1));
			list_SM2.add(FMSM2);
		}
		if (section.contains("Power wheelchair")) {
			FMSM3 = "Power wheelchair";
			String xpath1 = String.format(SeatingMobilityLocator.chk_functionalmobility, FMSM3);
			clickElementWithJQuery(By.xpath(xpath1));
			list_SM3.add(FMSM3);
		}
		if (section.contains("Seating only")) {
			FMSM4 = "Seating only";
			String xpath1 = String.format(SeatingMobilityLocator.chk_functionalmobility, FMSM4);
			clickElementWithJQuery(By.xpath(xpath1));
			list_SM4.add(FMSM4);
		}
		if (section.contains("Power scooter")) {
			FMSM5 = "Power scooter";
			String xpath1 = String.format(SeatingMobilityLocator.chk_functionalmobility, FMSM5);
			clickElementWithJQuery(By.xpath(xpath1));
			list_SM5.add(FMSM5);
		}
	}

	public void selectADPeligibility(String section) {
		if (section.contains("Device(s) needed for ongoing")) {
			FMSM6 = "Device(s) needed for ongoing";
			String xpath1 = String.format(SeatingMobilityLocator.chk_ADPeligibility, FMSM6);
			clickElementWithJQuery(By.xpath(xpath1));
			list_SM6.add(FMSM6);
		}
		if (section.contains("Client unable to access the front door without the recommended device")) {
			FMSM7 = "Client unable to access the front door without the recommended device";
			String xpath1 = String.format(SeatingMobilityLocator.chk_ADPeligibility, FMSM7);
			clickElementWithJQuery(By.xpath(xpath1));
			list_SM7.add(FMSM7);
		}
		if (section.contains("The recommended device is the most basic device to meet the")) {
			FMSM8 = "The recommended device is the most basic device to meet the";
			String xpath1 = String.format(SeatingMobilityLocator.chk_ADPeligibility, FMSM8);
			clickElementWithJQuery(By.xpath(xpath1));
			list_SM8.add(FMSM8);
		}
		if (section.contains("Client has a valid Ontario Health Card")) {
			FMSM9 = "Client has a valid Ontario Health Card";
			String xpath1 = String.format(SeatingMobilityLocator.chk_ADPeligibility, FMSM9);
			clickElementWithJQuery(By.xpath(xpath1));
			list_SM9.add(FMSM9);
		}
		if (section.contains("Client is a permanent resident of Ontario")) {
			FMSM10 = "Client is a permanent resident of Ontario";
			String xpath1 = String.format(SeatingMobilityLocator.chk_ADPeligibility, FMSM10);
			clickElementWithJQuery(By.xpath(xpath1));
			list_SM10.add(FMSM10);
		}
		if (section.contains("Client is expected to use the recommended device for 6 months or greater")) {
			FMSM11 = "Client is expected to use the recommended device for 6 months or greater";
			String xpath1 = String.format(SeatingMobilityLocator.chk_ADPeligibility, FMSM11);
			clickElementWithJQuery(By.xpath(xpath1));
			list_SM11.add(FMSM11);
		}
	}

	public void selectADPConfirmed(String section) {
		if (section.contains("no longer meets basic mobility needs")) {
			FMSM12 = "no longer meets basic mobility needs";
			//String xpath1 =String.format(SeatingMobilityLocator.chk_ADPConfirmed, FMSM12);  
			//clickElementWithJQuery(By.xpath(xpath1));
			list_SM12.add(FMSM12);
		}
	}

	public void selectADPfunding(String section) {
		if (section.contains("Change of status")) {
			FMSM13 = "Change of status";
			String xpath1 = String.format(SeatingMobilityLocator.chk_ADPfunding, FMSM13);
			clickElementWithJQuery(By.xpath(xpath1));
			list_SM13.add(FMSM13);
		}
		if (section.contains("Change of size")) {
			FMSM14 = "Change of size";
			String xpath1 = String.format(SeatingMobilityLocator.chk_ADPfunding, FMSM14);
			clickElementWithJQuery(By.xpath(xpath1));
			list_SM14.add(FMSM14);
		}
		if (section.contains("Special circumstances")) {
			FMSM15 = "Special circumstances";
			String xpath1 = String.format(SeatingMobilityLocator.chk_ADPfunding, FMSM15);
			clickElementWithJQuery(By.xpath(xpath1));
			list_SM15.add(FMSM15);
		}
	}

	public void selectNameofauthorizer(String section) {
		if (section.contains(
				"Role and activities of ADP authorizer reviewed and client/SDM consents to involvement of ADP authorizer in service")) {
			FMSM16 = "Role and activities of ADP authorizer reviewed and client/SDM consents to involvement of ADP authorizer in service";
			String xpath1 = String.format(SeatingMobilityLocator.chk_Nameofauthorizer, FMSM16);
			clickElementWithJQuery(By.xpath(xpath1));
			list_SM16.add(FMSM16);
		}
		if (section.contains(
				"ADP authorizer to book visit with client/SDM to provide comprehensive mobility device assessment")) {
			FMSM17 = "ADP authorizer to book visit with client/SDM to provide comprehensive mobility device assessment";
			String xpath1 = String.format(SeatingMobilityLocator.chk_Nameofauthorizer, FMSM17);
			clickElementWithJQuery(By.xpath(xpath1));
			list_SM17.add(FMSM17);
		}

	}

	public void selectASC(String section) {
		if (section.contains("Assessment results/application status reviewed and considered in")) {
			FMSM18 = "Assessment results/application status reviewed and considered in";
			//String xpath1 = String.format(SeatingMobilityLocator.chk_ASC, FMSM18);
			//clickElementWithJQuery(By.xpath(xpath1));
			list_SM18.add(FMSM18);
		}
	}

////////////////////////////////////seating and mobility end////////////////////////////////////////////

	public void selectRdioforfieldPTCAM(String value, String section) {
		if (section.equalsIgnoreCase("Cognitive Changes and Fluctuating Course")) {
			if (value.equalsIgnoreCase("Yes"))
				clickElement(By.xpath("(//input[@name='cam_tool_evidence']//following-sibling::label)[1]"));

			else
				clickElement(By.xpath("(//input[@name='cam_tool_evidence']//following-sibling::label)[2]"));
		}

		if (section.equalsIgnoreCase("Inattention")) {
			if (value.equalsIgnoreCase("Yes"))
				clickElement(By.xpath("(//input[@name='cam_tool_does_client']//following-sibling::label)[1]"));

			else
				clickElement(By.xpath("(//input[@name='cam_tool_does_client']//following-sibling::label)[2]"));
		}

		if (section.equalsIgnoreCase("Disorganized Thinking")) {
			if (value.equalsIgnoreCase("Yes"))
				clickElement(By.xpath("(//input[@name='cam_tool_client_thinking']//following-sibling::label)[1]"));

			else
				clickElement(By.xpath("(//input[@name='cam_tool_client_thinking']//following-sibling::label)[2]"));
		}

		if (section.equalsIgnoreCase("Altered Level of Consciousness")) {
			if (value.equalsIgnoreCase("Yes"))
				clickElement(By.xpath("(//input[@name='cam_tool_client_overall']//following-sibling::label)[1]"));

			else
				clickElement(By.xpath("(//input[@name='cam_tool_client_overall']//following-sibling::label)[2]"));
		}

	}

	public void selectRdioforfieldPT(String value, String section) {
		if (section.contains("Sitting to standing")) {
			clickElement(By.xpath("//input[contains(@id,'sitting_to_standing_2')]//following-sibling::label"));
			berbal1 = value;
		}

		if (section.contains("StandingoneUnsupported1")) {
			clickElement(By.xpath("//input[contains(@id,'standing_unsupported_2')]//following-sibling::label"));
			berbal2 = value;
		}

		if (section.contains("Sitting with back unsupported but feet supported on floor or on a stool")) {
			clickElement(
					By.xpath("//input[contains(@id,'sitting_with_back_unsupported_2')]//following-sibling::label"));
			berbal14 = value;
		}

		if (section.contains("Standing to sitting")) {
			clickElement(By.xpath("//input[contains(@id,'standing_to_sitting_0')]//following-sibling::label"));
			berbal3 = value;
		}

		if (section.contains("Transfers")) {
			clickElement(By.xpath("//input[contains(@id,'transfers_3')]//following-sibling::label"));
			berbal4 = value;
		}
		if (section.contains("with eyes closed")) {
			clickElement(By.xpath(
					"//input[contains(@id,'standing_unsupported_witheyes_closed_3')]//following-sibling::label"));
			berbal5 = value;
		}
		if (section.contains("Reaching forward with outstretched arm while standing")) {
			clickElement(By.xpath(
					"//input[contains(@id,'standing_unsupported_withfeet_together_1')]//following-sibling::label"));
			berbal6 = value;
		}
		if (section.contains("Pick up object from the floor from a standing position")) {
			clickElement(By.xpath("//input[contains(@id,'pickup_objectfromthefloor_4')]//following-sibling::label"));
			berbal7 = value;
		}
		if (section.contains("Turn 360 degrees")) {
			clickElement(By.xpath("//input[contains(@id,'turn_360_degrees_2')]//following-sibling::label"));
			berbal8 = value;
		}
		if (section.contains("one foot in front")) {
			clickElement(By
					.xpath("//input[contains(@id,'standing_unsupported_onefootinfront_1')]//following-sibling::label"));
			berbal9 = value;
		}
		if (section.contains("Standing on one leg")) {
			clickElement(By.xpath("//input[contains(@id,'standing_on_one_leg_2')]//following-sibling::label"));
			berbal10 = value;
		}

		if (section.contains("with feet together")) {
			// clickElement(By.xpath("//input[contains(@id,'standing_unsupported_withfeet_together_2')]//following-sibling::label"));
			berbal11 = value;
		}
		if (section.contains("Turning to look behind over left and right shoulders")) {
			clickElement(By
					.xpath("//input[contains(@id,'turning_tolookbehindover_shoulders_3')]//following-sibling::label"));
			berbal12 = value;
		}
		if (section.contains("Place alternate foot on step or stool")) {
			clickElement(By.xpath("//input[contains(@id,'place_alternate_foot_on_1')]//following-sibling::label"));
			berbal13 = value;
		}

		if (section.equalsIgnoreCase("Sitting Balance")) {
			if (value.equalsIgnoreCase("Leans or slides in chair"))
				clickElement(By.xpath(String.format(
						"//label[normalize-space(text())='%s']//following::label[normalize-space(text())=''][1]",
						section)));
			else
				clickElement(By.xpath(String.format(
						"//label[normalize-space(text())='%s']//following::label[normalize-space(text())=''][3]",
						section)));
			sitting1 = value;
		}
		if (section.equalsIgnoreCase("Rises from chair")) {
			if (value.equalsIgnoreCase("Unable without help"))
				clickElement(By.xpath(String.format(
						"//label[normalize-space(text())='%s']//following::label[normalize-space(text())=''][1]",
						section)));
			else
				clickElement(By.xpath(String.format(
						"//label[normalize-space(text())='%s']//following::label[normalize-space(text())=''][3]",
						section)));
			sitting2 = value;
		}

		if (section.equalsIgnoreCase("Attempts to rise")) {
			if (value.equalsIgnoreCase("Unable without help"))
				clickElement(By.xpath(String.format(
						"//label[normalize-space(text())='%s']//following::label[normalize-space(text())=''][1]",
						section)));
			else
				clickElement(By.xpath(String.format(
						"//label[normalize-space(text())='%s']//following::label[normalize-space(text())=''][3]",
						section)));
			sitting3 = value;
		}

		if (section.equalsIgnoreCase("Immediate standing")) {
			if (value.equalsIgnoreCase("Steady but uses walker or other support"))
				clickElement(By.xpath(String.format(
						"//label[normalize-space(text())='Immediate standing balance (first 5 seconds)']//following::label[normalize-space(text())=''][2]",
						section)));
			else
				clickElement(By.xpath(String.format(
						"//label[normalize-space(text())='Immediate standing balance (first 5 seconds)']//following::label[normalize-space(text())=''][3]",
						section)));
			sitting4 = value;
		}

		if (section.equalsIgnoreCase("Standing balance")) {
			if (value.equalsIgnoreCase("Unsteady"))
				clickElement(By.xpath(String.format(
						"//label[normalize-space(text())='%s']//following::label[normalize-space(text())=''][1]",
						section)));
			else
				clickElement(By.xpath(String.format(
						"//label[normalize-space(text())='%s']//following::label[normalize-space(text())=''][3]",
						section)));
			sitting5 = value;
		}

		if (section.equalsIgnoreCase("Nudged")) {
			if (value.equalsIgnoreCase("Begins to fall"))
				clickElement(By.xpath(String.format(
						"//label[normalize-space(text())='Nudged (subject at max position with feet as close together as possible, examiner pushes lightly on subject’s sternum with palm of hand 3 times.']//following::label[normalize-space(text())=''][1]",
						section)));
			else
				clickElement(By.xpath(String.format(
						"//label[normalize-space(text())='Nudged (subject at max position with feet as close together as possible, examiner pushes lightly on subject’s sternum with palm of hand 3 times.']//following::label[normalize-space(text())=''][3]",
						section)));
			sitting6 = value;
		}

		if (section.equalsIgnoreCase("Eyes closed")) {
			if (value.equalsIgnoreCase("Unsteady"))
				clickElement(By.xpath(String.format(
						"//label[normalize-space(text())='Eyes closed (at maximum position #6)']//following::label[normalize-space(text())=''][1]",
						section)));
			else
				clickElement(By.xpath(String.format(
						"//label[normalize-space(text())='Eyes closed (at maximum position #6)']//following::label[normalize-space(text())=''][2]",
						section)));
			sitting7 = value;
		}

		if (section.equalsIgnoreCase("Turning 360 degrees")) {
			if (value.equalsIgnoreCase("Discontinuous steps"))
				clickElement(By.xpath(String.format(
						"//label[normalize-space(text())='%s']//following::label[normalize-space(text())=''][1]",
						section)));
			else
				clickElement(By.xpath(String.format(
						"//label[normalize-space(text())='%s']//following::label[normalize-space(text())=''][2]",
						section)));
			sitting8 = value;
		}

		if (section.equalsIgnoreCase("Sitting down")) {
			if (value.equalsIgnoreCase("Uses arms or not a smooth motion")) {
				clickElement(By.xpath(String.format(
						"//label[normalize-space(text())='%s']//following::label[normalize-space(text())=''][2]",
						section)));
				System.out.println();
			} else
				clickElement(By.xpath(String.format(
						"//label[normalize-space(text())='%s']//following::label[normalize-space(text())=''][3]",
						section)));
			sitting9 = value;
		}
		if (section.equalsIgnoreCase("Initiation of gait (immediately after told to “go”)")) {
			if (value.equalsIgnoreCase("No hesitancy")) {
				clickElement(By.xpath(String.format(
						"//label[normalize-space(text())='%s']//following::label[normalize-space(text())=''][2]",
						section)));
				System.out.println();
			} else
				clickElement(By.xpath(String.format(
						"//label[normalize-space(text())='%s']//following::label[normalize-space(text())=''][3]",
						section)));
			sitting19 = value;
		}

		if (section.equalsIgnoreCase("Step length (right)")) {
			if (value.equalsIgnoreCase("Right foot passes left stance foot"))
				clickElement(By.xpath(String.format(
						"//label[normalize-space(text())='%s']//following::label[normalize-space(text())=''][2]",
						section)));
			else
				clickElement(By.xpath(String.format(
						"//label[normalize-space(text())='%s']//following::label[normalize-space(text())=''][1]",
						section)));
			sitting10 = value;
		}

		if (section.equalsIgnoreCase("Step height (right)")) {
			if (value.equalsIgnoreCase("Right foot completely clears floor"))
				clickElement(By.xpath(String.format(
						"//label[normalize-space(text())='%s']//following::label[normalize-space(text())=''][2]",
						section)));
			else
				clickElement(By.xpath(String.format(
						"//label[normalize-space(text())='%s']//following::label[normalize-space(text())=''][1]",
						section)));
			sitting11 = value;
		}

		if (section.equalsIgnoreCase("Step length (left)")) {
			if (value.equalsIgnoreCase("Left foot passes right stance foot"))
				clickElement(By.xpath(String.format(
						"//label[normalize-space(text())='%s']//following::label[normalize-space(text())=''][2]",
						section)));
			else
				clickElement(By.xpath(String.format(
						"//label[normalize-space(text())='%s']//following::label[normalize-space(text())=''][1]",
						section)));
			sitting12 = value;
		}

		if (section.equalsIgnoreCase("Step height (left)")) {
			if (value.equalsIgnoreCase("Left foot completely clears floor"))
				clickElement(By.xpath(String.format(
						"//label[normalize-space(text())='%s']//following::label[normalize-space(text())=''][2]",
						section)));
			else
				clickElement(By.xpath(String.format(
						"//label[normalize-space(text())='%s']//following::label[normalize-space(text())=''][1]",
						section)));
			sitting13 = value;
		}

		if (section.equalsIgnoreCase("Step symmetry")) {
			if (value.equalsIgnoreCase("Right and left step appear equal"))
				clickElement(By.xpath(String.format(
						"//label[normalize-space(text())='%s']//following::label[normalize-space(text())=''][2]",
						section)));
			else
				clickElement(By.xpath(String.format(
						"//label[normalize-space(text())='%s']//following::label[normalize-space(text())=''][1]",
						section)));
			sitting14 = value;
		}
		if (section.equalsIgnoreCase("Step continuity")) {
			if (value.equalsIgnoreCase("Steps appear continuous"))
				clickElement(By.xpath(String.format(
						"//label[normalize-space(text())='%s']//following::label[normalize-space(text())=''][2]",
						section)));
			else
				clickElement(By.xpath(String.format(
						"//label[normalize-space(text())='%s']//following::label[normalize-space(text())=''][1]",
						section)));
			sitting15 = value;
		}

		if (section.equalsIgnoreCase("Path")) {
			if (value.equalsIgnoreCase("Marked deviation"))
				clickElement(By.xpath(String.format(
						"//label[normalize-space(text())='Path (estimated in relation to floor tiles, 12-inch diameter; observe excursion of 1 foot over about 10 feet of the course)']//following::label[normalize-space(text())=''][1]",
						section)));
			else
				clickElement(By.xpath(String.format(
						"//label[normalize-space(text())='Path (estimated in relation to floor tiles, 12-inch diameter; observe excursion of 1 foot over about 10 feet of the course)']//following::label[normalize-space(text())=''][3]",
						section)));
			sitting16 = value;
		}

		if (section.equalsIgnoreCase("Trunk")) {
			if (value.equalsIgnoreCase("Marked sway or uses walking aid"))
				clickElement(By.xpath(String.format(
						"//label[normalize-space(text())='%s']//following::label[normalize-space(text())=''][1]",
						section)));
			else
				clickElement(By.xpath(String.format(
						"//label[normalize-space(text())='%s']//following::label[normalize-space(text())=''][2]",
						section)));
			sitting17 = value;
		}

		if (section.equalsIgnoreCase("Walking Stance")) {
			if (value.equalsIgnoreCase("Heels apart")) {
				clickElement(By.xpath(String.format(
						"//label[normalize-space(text())='%s']//following::label[normalize-space(text())=''][1]",
						section)));
				System.out.println();
			} else
				clickElement(By.xpath(String.format(
						"//label[normalize-space(text())='%s']//following::label[normalize-space(text())=''][2]",
						section)));
			sitting18 = value;
		}
	}

	public void selectCheckboxForTypeOfAssessment(String section) {
		if (section.contains("Initial")) {
			clickElementWithJQuery(By.xpath("//label[@id='assess_type1_label' and contains(text(),'Initial')]"));
			Type_Of_Assessment.add(section);
		} else if (section.contains("Reassessment")) {
			clickElementWithJQuery(By.xpath("//label[@id='assess_type2_label' and contains(text(),'Reassessment')]"));
			Type_Of_Assessment.add(section);
		}
	}

	public void selectdropdownforINRS(String value) {
		selectByVisibleText(By.xpath("//select[@id='pain_score']"), value);
		score = value;
	}

	public void chk_quality_of_pain_ass(String value) {
		String xpath1 = String.format("//label[contains(@id,'qop') and contains(text(),'%s')]", value);
		clickElement(By.xpath(xpath1));
		chk_quality_of_pain_ass.add(value);
	}

	public void chk_Accompanying_Symptom_pain_ass(String value) {
		String xpath1 = String.format("//label[contains(@id,'acc_symptoms') and contains(text(),'%s')]", value);
		clickElementWithJQuery(By.xpath(xpath1));
		chk_Accompanying_Symptom_pain_ass.add(value);
	}

	public void chk_onPharmacological_Intervention_pain_ass(String value) {
		String xpath1 = String.format("//label[contains(@id,'non_pharma_inter') and contains(text(),'%s')]", value);
		clickElement(By.xpath(xpath1));
		chk_Pharmacological_Intervention_pain.add(value);
	}

	public void drp_frequency_pain_ass(String s) {
		drp_frequency = s;
		selectByVisibleText(By.id("frequency"), s);
	}

	public void day_one_pain_ass(String s) {
		day_onset = "0" + s;
		selectByVisibleText(By.id("onset_date_day"), s);
	}

	public void month_one_pain_ass(String s) {
		month_onset = s;
		selectByVisibleText(By.id("onset_date_month"), s);
	}

	public void day_one_pain_ass_last_BM(String s) {
		day_last_BM = "0" + s;
		selectByVisibleText(By.id("date_last_bm_day"), s);
	}

	public void month_one_pain_ass_last_BM(String s) {
		month_last_BM = s;
		selectByVisibleText(By.id("date_last_bm_month"), s);
	}

	public void selectdropdownforFIM(String value, String section) {
		String xpath1 = "//td[normalize-space(text())='%s']//following-sibling::td//select[@id='initials']";
		select_ByIndex(By.xpath(String.format(xpath1, section)), Integer.parseInt(value));
	}

	public void selectdropdownforSphincterFIM(String value, String section) {
		String xpath1 = "//td[normalize-space(text())='%s']//following-sibling::td//select[@id='initials']";
		select_ByIndex(By.xpath(String.format(xpath1, section)), Integer.parseInt(value));
	}

	public void var_Cardiovascular_History_data() {
		list_Cardiovascular_ICAN1.add("Chest pain");
		list_Cardiovascular_ICAN1.add("Fainting");
		list_Cardiovascular_ICAN1.add("Pacemaker");
		list_Cardiovascular_ICAN1.add("Fixed");
	}

	public void var_Respiratory_History_data() {
		list_Respiratory_ICAN1.add("Persistent Cough");
		list_Respiratory_ICAN1.add("Smoking");
		list_Respiratory_ICAN1.add("O2 Therapy");
		list_Respiratory_ICAN1.add("Non-Invasive");
		list_Respiratory_ICAN1.add("Tracheostomy");
	}

	/*
	 * public void var_Respiratory_Assessment_data() {
	 * list_RespiratoryAssess_ICAN1.add("Chest Sounds");
	 * list_RespiratoryAssess_ICAN1.add("Normal"); }
	 * 
	 * public void var_Eyes_Ears_Nose_Throat_data() {
	 * list_Eyes_Ears_Nose_Throat.add("Vision Aid");
	 * list_Eyes_Ears_Nose_Throat.add("Redness/Inflammation");
	 * list_Eyes_Ears_Nose_Throat.add("Discharge");
	 * list_Eyes_Ears_Nose_Throat.add("Ear Infection");
	 * list_Eyes_Ears_Nose_Throat.add("Frequent Sneezing");
	 * list_Eyes_Ears_Nose_Throat.add("Frequent Colds");
	 * list_Eyes_Ears_Nose_Throat.add("Epistaxis");
	 * list_Eyes_Ears_Nose_Throat.add("Hoarseness");
	 * list_Eyes_Ears_Nose_Throat.add("Coughing");
	 * list_Eyes_Ears_Nose_Throat.add("Swallowing problems");
	 * list_Eyes_Ears_Nose_Throat.add("Speech Problems"); }
	 */

	public void var_Neurological_History_data1() {

		/*
		 * Neurological_History_data.add("Gross Motor Deficit");
		 * Neurological_History_data.add("Fine Motor Deficit");
		 * Neurological_History_data.add("Fainting");
		 * Neurological_History_data.add("Tremors");
		 * Neurological_History_data.add("Seizures");
		 * Neurological_History_data.add("Spasticity");
		 */
	}

	public void var_Neurological_Assessment_data() {
		Neurological_Assessment.add("Orientation");
		Neurological_Assessment.add("Pupils equal and reactive to light and accomodation");
		Neurological_Assessment.add("Facial Symmetry");
		Neurological_Assessment.add("Communications");
		Neurological_Assessment.add("Speech");
		Neurological_Assessment.add("Behaviour");
		Neurological_Assessment.add("Spastic");
	}

	public void var_Endocrine_Assessment_data() {
		Endocrine_Assessment.add("Thyroid Symptoms");
		Endocrine_Assessment.add("Diabetes Mellitus symptoms");

	}

	public void var_Gastrointestinal_History_data() {
		Gastrointestinal_History.add("Mouth sores");
		Gastrointestinal_History.add("Difficulty chewing");
		Gastrointestinal_History.add("Risk of aspiration");
		Gastrointestinal_History.add("Indigestion");
		Gastrointestinal_History.add("Constipation");
	}

	public void var_Gastrointestinal_Assessment_data() {
		Gastrointestinal_Assessment.add("Appetite");
		Gastrointestinal_Assessment.add("Abdomen");
		Gastrointestinal_Assessment.add("Recent weight change");
	}

	public void var_Genitourinary_History() {
		Genitourinary_History.add("Urgency");
		Genitourinary_History.add("Hesitancy");
		Genitourinary_History.add("Retention");
		Genitourinary_History.add("Hematuria");
		Genitourinary_History.add("Pain");
	}

	public void var_Genitourinary_Assessment() {
		System.out.println();
	}

	public void var_Depression_Screening_Tool() {
		System.out.println();
	}

	public void var_verified_pain() {
		System.out.println();
	}

	public static File getLatestFilefromDir(String dirPath) {
		File dir = new File(dirPath);
		File[] files = dir.listFiles();
		if (files == null || files.length == 0) {
			return null;
		}
		File lastModifiedFile = files[0];
		for (int i = 1; i < files.length; i++) {
			if (lastModifiedFile.lastModified() < files[i].lastModified()) {
				lastModifiedFile = files[i];
			}
		}
		return lastModifiedFile;
	}

	public static void removeFolder(String file) {
		File rmFile = new File(file);
		File[] contents = rmFile.listFiles();
		if (contents != null) {
			for (File f : contents) {
				String deleteFile = f.toString();
				removeFolder(deleteFile);
			}
		}
		rmFile.delete();
	}

	public void var_verified_Cognition() {
		System.out.println();
	}

	public void var_Psychosocial_Assessment() {
		System.out.println();
	}

	public void var_Alternative_Complimentary_Therapies() {
		System.out.println();
	}

	public void selectradiofor60(String value, String section) {
		int ans = Integer.parseInt(value) + 1;
		if (section.contains("Left foot Derm")) {
			radioSkinLeftfoot = value;

			String xpath1 = "(//label[contains(@id,'skin_leftfoot')])[%s]";
			clickElement(By.xpath(String.format(xpath1, ans)));
		}

		if (section.contains("Right foot Derm")) {
			radioSkinRightfoot = value;
			String xpath1 = "(//label[contains(@id,'skin_rightfoot')])[%s]";
			clickElement(By.xpath(String.format(xpath1, ans)));
		}

		if (section.contains("Left foot Nails")) {
			radioLeftfootnails = value;
			String xpath1 = "(//label[contains(@id,'nails_leftfoot')])[%s]";
			clickElement(By.xpath(String.format(xpath1, ans)));
		}

		if (section.contains("Right foot Nails")) {
			radioRightfootnails = value;
			String xpath1 = "(//label[contains(@id,'nails_rightfoot')])[%s]";
			clickElement(By.xpath(String.format(xpath1, ans)));
		}

		if (section.contains("Left foot Deformity")) {
			radiodeformity_leftfoot = value;
			String xpath1 = "(//label[contains(@id,'deformity_leftfoot')])[%s]";
			clickElement(By.xpath(String.format(xpath1, ans)));
		}

		if (section.contains("Right foot Deformity")) {
			radiodeformity_rightfoot = value;
			String xpath1 = "(//label[contains(@id,'deformity_rightfoot')])[%s]";
			clickElement(By.xpath(String.format(xpath1, ans)));
		}

		if (section.contains("Left foot Footwear")) {
			radiofootwear_leftfoot = value;
			String xpath1 = "(//label[contains(@id,'footwear_leftfoot')])[%s]";
			clickElement(By.xpath(String.format(xpath1, ans)));
		}

		if (section.contains("Right foot Footwear")) {
			radiofootwear_rightfoot = value;
			String xpath1 = "(//label[contains(@id,'footwear_rightfoot')])[%s]";
			clickElement(By.xpath(String.format(xpath1, ans)));
		}

		if (section.contains("Left foot Temperature")) {
			radiotempcold_leftfoot = value;
			String xpath1 = "(//label[contains(@id,'tempcold_leftfoot')])[%s]";
			clickElement(By.xpath(String.format(xpath1, ans)));
		}

		if (section.contains("Right foot Temperature")) {
			radiotempcold_rightfoot = value;
			String xpath1 = "(//label[contains(@id,'tempcold_rightfoot')])[%s]";
			clickElement(By.xpath(String.format(xpath1, ans)));
		}

		if (section.contains("Left foot Range of Motion")) {
			radiorangeofmotion_leftfoot = value;
			String xpath1 = "(//label[contains(@id,'rangeofmotion_leftfoot')])[%s]";
			clickElement(By.xpath(String.format(xpath1, ans)));
		}
		if (section.contains("Right foot Range of Motion")) {
			radiorangeofmotion_rightfoot = value;
			String xpath1 = "(//label[contains(@id,'rangeofmotion_rightfoot')])[%s]";
			clickElement(By.xpath(String.format(xpath1, ans)));
		}
		if (section.contains("Left foot Ask 4 questions")) {
			radiosensation_question_leftfoot = value;
			String xpath1 = "(//label[contains(@id,'sensation_question_leftfoot')])[%s]";
			clickElement(By.xpath(String.format(xpath1, value)));
		}
		if (section.contains("Right foot Ask 4 questions")) {
			radiosensation_question_rightfoot = value;
			String xpath1 = "(//label[contains(@id,'sensation_question_rightfoot')])[%s]";
			clickElement(By.xpath(String.format(xpath1, value)));
		}
		if (section.contains("Left foot Pedal Pulses")) {
			radiopedal_pulse_leftfoot = value;
			String xpath1 = "(//label[contains(@id,'pedal_pulse_leftfoot')])[%s]";
			clickElement(By.xpath(String.format(xpath1, ans)));
		}
		if (section.contains("Right foot Pedal Pulses")) {
			radiopedal_pulse_rightfoot = value;
			String xpath1 = "(//label[contains(@id,'pedal_pulse_rightfoot')])[%s]";
			clickElement(By.xpath(String.format(xpath1, ans)));
		}
		if (section.contains("Left foot Dependent Rubor")) {
			radiodependent_rubor_leftfoot = value;
			String xpath1 = "(//label[contains(@id,'dependent_rubor_leftfoot')])[%s]";
			clickElement(By.xpath(String.format(xpath1, ans)));
		}
		if (section.contains("Right foot Dependent Rubor")) {
			radiodependent_rubor_rightfoot = value;
			String xpath1 = "(//label[contains(@id,'dependent_rubor_rightfoot')])[%s]";
			clickElement(By.xpath(String.format(xpath1, ans)));
		}
		if (section.contains("Left foot Erythema")) {
			radioerythema_leftfoot = value;
			String xpath1 = "(//label[contains(@id,'erythema_leftfoot')])[%s]";
			clickElement(By.xpath(String.format(xpath1, ans)));
		}
		if (section.contains("Right foot Erythema")) {
			radioerythema_rightfoot = value;
			String xpath1 = "(//label[contains(@id,'erythema_rightfoot')])[%s]";
			clickElement(By.xpath(String.format(xpath1, ans)));
		}

	}

	public void selectRdioforfieldTrachestomy(String string, String string2) {
		clickElement(By.xpath(String
				.format("(//label[normalize-space(text())='%s']//following-sibling::div//div//label)[1]", string2)));
	}

	public void selectchk_ConsultsReferrals_made_to_field_MACH(String string1) {
		String xpath1 = String.format("//label[contains(@for,'age_consult') and contains(text(),'%s')]", string1);
		clickElementWithJQuery(By.xpath(xpath1));
		MAHC_ConsultsReferrals.add(string1);
	}

	public void chk_FootFootwear_Concerns_field_MACH(String string) {
		String xpath1 = String.format("//label[contains(@id,'footwear_education') and normalize-space(text())='%s']",
				string);
		clickElementWithJQuery(By.xpath(xpath1));
		MAHC_footwear__handsout_provided.add(string);
	}

	public void get_MAHC_10_Fall_Risk_Score() {
		get_MAHC_10_Fall_Risk_Score_sel();
	}

	public void chk_Impaired_Functional_Mobility_handOuts(String string1) {
		String xpath1 = String.format("//label[contains(@id,'mobility_education') and normalize-space(text())='%s']",
				string1);
		clickElementWithJQuery(By.xpath(xpath1));
		MAHC_Functional_Mobility_MAHC.add(string1);
	}

	public void chk_Pain_affecting_level_of_function_handOuts(String string) {
		String xpath1 = String.format("//label[contains(@id,'pain_affect_education') and normalize-space(text())='%s']",
				string);
		clickElementWithJQuery(By.xpath(xpath1));
		MAHC_pain_affecting_level_function_MAHC.add(string);
	}

	public void chk_Gait_Aid_Use_field_handOuts(String string) {
		String xpath1 = String.format("//label[contains(@id,'gait_education') and normalize-space(text())='%s']",
				string);
		clickElementWithJQuery(By.xpath(xpath1));
		MAHC_Gait_Aid_Use_MAHC.add(string);
	}

	public void selectchk_Prior_history_of_falls_within_three_months_field_MACH(String string1) {
		String xpath1 = String
				.format("//label[contains(@id,'prior_history_education') and normalize-space(text())='%s']", string1);
		clickElementWithJQuery(By.xpath(xpath1));
		MAHC_prior_history_falls_MAHC.add(string1);
	}

	public void selectchk_provided_field_MACH(String string1) {
		String xpath1 = String.format("//label[contains(@id,'age_education') and contains(text(),'%s')]", string1);
		clickElementWithJQuery(By.xpath(xpath1));
		MAHC_Handouts_provided_field.add(string1);
	}

	// ICAT STARTS//
	public void selctradioeyesearsthroat_one(String string) {
		ICAT_radio_1 = string;
		if (string.equalsIgnoreCase("No"))
			clickElementWithJQuery(By.xpath(
					"(((//label[normalize-space(text())='Problem Identified?'])[1])/following-sibling::div//label)[2]"));

		if (string.equalsIgnoreCase("Yes"))
			clickElementWithJQuery(By.xpath(
					"(((//label[normalize-space(text())='Problem Identified?'])[1])/following-sibling::div//label)[1]"));

	}

	public void selctradioeyesearsthroat_two(String string) {
		ICAT_radio_2 = string;
		if (string.equalsIgnoreCase("No"))
			clickElementWithJQuery(By.xpath(
					"(((//label[normalize-space(text())='Problem Identified?'])[2])/following-sibling::div//label)[2]"));

		if (string.equalsIgnoreCase("Yes"))
			clickElementWithJQuery(By.xpath(
					"(((//label[normalize-space(text())='Problem Identified?'])[2])/following-sibling::div//label)[1]"));

	}

	public void selctradioeyesearsthroat_three(String string) {
		ICAT_radio_3 = string;
		if (string.equalsIgnoreCase("No"))
			clickElementWithJQuery(By.xpath(
					"(((//label[normalize-space(text())='Problem Identified?'])[3])/following-sibling::div//label)[2]"));

		if (string.equalsIgnoreCase("Yes"))
			clickElementWithJQuery(By.xpath(
					"(((//label[normalize-space(text())='Problem Identified?'])[3])/following-sibling::div//label)[1]"));

	}

	public void selctradioeyesearsthroat_four(String string) {
		ICAT_radio_4 = string;
		if (string.equalsIgnoreCase("No"))
			clickElementWithJQuery(By.xpath(
					"(((//label[normalize-space(text())='Problem Identified?'])[4])/following-sibling::div//label)[2]"));

		if (string.equalsIgnoreCase("Yes"))
			clickElementWithJQuery(By.xpath(
					"(((//label[normalize-space(text())='Problem Identified?'])[4])/following-sibling::div//label)[1]"));

	}

	public void selctradioeyesearsthroathd(String string) {
		ICAT_radio_5 = string;
		if (string.equalsIgnoreCase("No"))
			clickElementWithJQuery(
					By.xpath("((//label[normalize-space(text())='Hearing Device'])/following-sibling::div//label)[2]"));

		if (string.equalsIgnoreCase("Yes"))
			clickElementWithJQuery(
					By.xpath("((//label[normalize-space(text())='Hearing Device'])/following-sibling::div//label)[1]"));

	}

	public void selctradiodepressiontool(String value, String section) {
		String s1 = "(//tbody//tr//td[normalize-space(text())='%s']//following-sibling::td)[%s]";
		String xpath1 = String.format(s1, section, Integer.parseInt(value) + 1);
		clickElement(By.xpath(xpath1));

	}

	public void selectradiodepressiontoolone(String string) {
		ICAT_radio_10 = string;
		if (string.equalsIgnoreCase("No"))
			clickElementWithJQuery(By.xpath("(//*[contains(@name,'bothered_interest')])[2]"));

		if (string.equalsIgnoreCase("Yes"))
			clickElementWithJQuery(By.xpath("(//*[contains(@name,'bothered_interest')])[1]"));
	}

	public void selectradiodepressiontooltwo(String string) {
		ICAT_radio_11 = string;
		if (string.equalsIgnoreCase("No"))
			clickElementWithJQuery(By.xpath("(//*[contains(@name,'feeling_down')])[2]"));

		if (string.equalsIgnoreCase("Yes"))
			clickElementWithJQuery(By.xpath("(//*[contains(@name,'feeling_down')])[1]"));

	}

	public void selectradiodpain(String string) {
		ICAT_radio_12 = string;
		if (string.equalsIgnoreCase("No"))
			clickElementWithJQuery(By.xpath("(//*[contains(@id,'pain1_label')])"));

		if (string.equalsIgnoreCase("Yes"))
			clickElementWithJQuery(By.xpath("(//*[contains(@name,'pain2')])[1]"));

	}

	public void selctradiochronic(String string) {
		ICAT_radio_6 = string;
		if (string.equalsIgnoreCase("No"))
			clickElementWithJQuery(By.xpath("(//input[@name='chronic_d']/following-sibling::label)[2]"));

		if (string.equalsIgnoreCase("Yes"))
			clickElementWithJQuery(By.xpath("(//input[@name='chronic_d']/following-sibling::label)[1]"));

	}

	public void selctradiohomeselfmonitoring(String string) {
		ICAT_radio_7 = string;
		if (string.equalsIgnoreCase("No"))
			clickElementWithJQuery(By.xpath(
					"(//*[normalize-space(text())='Is the client home self-monitoring?']/following-sibling::div//label)[2]"));

		if (string.equalsIgnoreCase("Yes"))
			clickElementWithJQuery(By.xpath(
					"(//*[normalize-space(text())='Is the client home self-monitoring?']/following-sibling::div//label)[1]"));
	}

	public void selectradionotassessedbowlmovementregular(String string) {
		ICAT_radio_8 = string;
		if (string.equalsIgnoreCase("No"))
			clickElementWithJQuery(By.xpath(
					"(//*[normalize-space(text())='Bowel Movement Regular?']/following-sibling::div//label)[2]"));

		if (string.equalsIgnoreCase("Yes"))
			clickElementWithJQuery(By.xpath(
					"(//*[normalize-space(text())='Bowel Movement Regular?']/following-sibling::div//label)[1]"));
	}

	/*
	 * public void selectradiochangeinbowelpattern1 (String string) { ICAT_radio_9 =
	 * string; if(string.equalsIgnoreCase("No")) clickElementWithJQuery(By.
	 * xpath("(//*[normalize-space(text())='Change in Bowel Pattern?']/following-sibling::div//label)[2]"
	 * ));
	 * 
	 * if(string.equalsIgnoreCase("Yes")) clickElementWithJQuery(By.
	 * xpath("(//*[normalize-space(text())='Change in Bowel Pattern?']/following-sibling::div//label)[1]"
	 * )); }
	 */
	public void selectradiochangeinbowelpattern(String string) {
		ICAT_radio_9 = string;
		if (string.equalsIgnoreCase("No"))
			clickElementWithJQuery(By.xpath(
					"(//*[normalize-space(text())='Change in Bowel Pattern?']/following-sibling::div//label)[2]"));

		if (string.equalsIgnoreCase("Yes"))
			clickElementWithJQuery(By.xpath(
					"(//*[normalize-space(text())='Change in Bowel Pattern?']/following-sibling::div//label)[1]"));
	}

	public void var_Respiratory_Assessment_data() {
		list_RespiratoryAssess_ICAN1.add("Chest Sounds");
		list_RespiratoryAssess_ICAN1.add("Normal");
	}

	public void var_Eyes_Ears_Nose_Throat_data() {
		list_Eyes_Ears_Nose_Throat.add("Vision Aid");
		list_Eyes_Ears_Nose_Throat.add("Redness/Inflammation");
		list_Eyes_Ears_Nose_Throat.add("Discharge");
		list_Eyes_Ears_Nose_Throat.add("Ear Infection");
		list_Eyes_Ears_Nose_Throat.add("Frequent Sneezing");
		list_Eyes_Ears_Nose_Throat.add("Frequent Colds");
		list_Eyes_Ears_Nose_Throat.add("Epistaxis");
		list_Eyes_Ears_Nose_Throat.add("Hoarseness");
		list_Eyes_Ears_Nose_Throat.add("Coughing");
		list_Eyes_Ears_Nose_Throat.add("Swallowing problems");
		list_Eyes_Ears_Nose_Throat.add("Speech Problems");
	}

	// ICAT STOP//

	public void selectRdioforfieldMAHC(String string, String section) {

		if (section.contains("Prior history of falls within 3 months")) {
			clickElementWithJQuery(By.xpath("(//input[@name='prior_history']/following-sibling::label)[1]"));
			MAHC_radio_1 = string;
		}

		if (section.contains("Incontinence")) {
			clickElementWithJQuery(By.xpath("(//input[@name='incontinence']/following-sibling::label)[2]"));
			MAHC_radio_2 = string;
		}

		if (section.contains("Visual Impairment")) {
			clickElementWithJQuery(By.xpath("(//input[@name='impairment']/following-sibling::label)[1]"));
			MAHC_radio_3 = string;
		}

		if (section.contains("Impaired Functional Mobility")) {
			clickElementWithJQuery(By.xpath("(//input[@name='mobility']/following-sibling::label)[1]"));
			MAHC_radio_4 = string;
		}

		if (section.contains("Environmental Hazards")) {
			clickElementWithJQuery(By.xpath("(//input[@name='env_hazard']/following-sibling::label)[2]"));
			MAHC_radio_5 = string;
		}

		if (section.contains("Poly Pharmacy")) {
			clickElementWithJQuery(By.xpath("(//input[@name='pharmacy']/following-sibling::label)[2]"));
			MAHC_radio_6 = string;
		}

		if (section.contains(" ")) {
			clickElementWithJQuery(By.xpath("(//input[@name='pain_affect']/following-sibling::label)[1]"));
			MAHC_radio_7 = string;
		}

		if (section.contains("Cognitive Impairment")) {
			clickElementWithJQuery(By.xpath("(//input[@name='cognitive']/following-sibling::label)[2]"));
			MAHC_radio_8 = string;
		}

		if (section.contains("Decreased Hearing Acuity")) {
			clickElementWithJQuery(By.xpath("(//input[@name='hearing']/following-sibling::label)[2]"));
			MAHC_radio_9 = string;
		}
		if (section.contains("Dizziness/Light-headedness")) {
			clickElementWithJQuery(By.xpath("(//input[@name='hearing']/following-sibling::label)[2]"));
			MAHC_radio_10 = string;
		}
		if (section.contains("Gait Aid Use")) {
			clickElementWithJQuery(By.xpath("(//input[@name='gait']/following-sibling::label)[1]"));
			MAHC_radio_11 = string;
		}
		if (section.contains("Foot/Footwear Concerns")) {
			clickElementWithJQuery(By.xpath("(//input[@name='footwear']/following-sibling::label)[1]"));
			MAHC_radio_12 = string;
		}
	}

	public void selectRelation(String section) {

		selectByVisibleText(By.xpath("//select[@id='relationship']"), section);
		val = section;
	}

	public void drp_of_Document_Type(String section) {

		selectByVisibleText(By.xpath("//select[@name='document_type']"), section);
		Document_Type_Nursing = section;
	}

	public void selectRdioforfieldPainAssessment(String value, String section) {
		if (section.contains("Acceptable")) {
			acceptable_pain_Ass = value;
			clickElement(By.xpath("(//label[contains(@id,'acceptable')])[1]"));
		}

		if (section.contains("Chronic Pain Parameters Unchanged")) {
			Chronic_Pain_Parameters_pain_Ass = value;
			clickElement(By.xpath("(//label[contains(@id,'chronic_unchanged')])[1]"));
		}

		if (section.contains("See Progress Notes")) {
			See_Progress_Notes = value;
			clickElement(By.xpath("(//label[contains(@id,'see_progress')])[1]"));
		}

	}

	public void selectRdioforfieldCAM(String value, String section) {
		if (section.contains("Cognitive Changes and Fluctuating Course")) {
			clickElement(By.xpath("(//label[contains(@id,'cam_tool_')])[1]"));
			cam1 = value;
		}
		if (section.contains("Inattention")) {
			clickElement(By.xpath("(//label[contains(@id,'cam_tool_')])[2]"));
			cam2 = value;
		}
		if (section.contains("Disorganized Thinking")) {
			clickElement(By.xpath("(//label[contains(@id,'cam_tool_')])[3]"));
			cam3 = value;
		}
		if (section.contains("Altered Level of Consciousness")) {
			clickElement(By.xpath("(//label[contains(@id,'cam_tool_')])[4]"));
			cam4 = value;
		}
		if (section.contains("Have you felt depressed or down"))
			clickElement(By.xpath("(//label[contains(@id,'felt_depressed_yn1')])"));

		if (section.contains("Changes in your normal sleeping pattern"))
			clickElement(By.xpath("//label[contains(@id,'change_sleeping_pattern_yn1_label')]"));

		if (section.contains("Withdrawal from previously enjoyed activities or socializing"))
			clickElement(By.xpath("//label[contains(@id,'withdrawal_socializing_yn1_label')]"));

		if (section.contains("experienced feelings of intense"))
			clickElement(By.xpath("//label[contains(@id,'intense_guilt_yn1_label')]"));

		if (section.contains("An increase in drug/alcohol use"))
			clickElement(By.xpath("//label[contains(@id,'increase_alcohol_yn1_label')]"));
	}

	public void selectRadioButton_SeatingAndMobility(String s) {
		if(s.contains("Assessment results shared with client")) {
			clickElementWithJQuery(By.xpath("//*[@id='md-radio-results_shared1']//label"));
			SeatingAndMobility_Radio.add(s);
		}
		else if(s.contains("Mobility device goal")) {
			clickElementWithJQuery(By.xpath("//*[@id='md-radio-goal_established1']//label"));
			SeatingAndMobility_Radio.add(s);
		}
		else if(s.contains("Student participation in service")) {
			clickElementWithJQuery(By.xpath("//*[@id='md-radio-student_participation2']//label"));
			SeatingAndMobility_Radio.add(s);
		}
		else if(s.contains("Assistive Devices Program")) {
			clickElementWithJQuery(By.xpath("//div[@id='md-radio-discussed_assistive_devices_program1']//label"));
			SeatingAndMobility_Radio.add(s);
		}
		else if(s.contains("Screen for ADP")) {
			clickElementWithJQuery(By.xpath("//div[@id='md-radio-eligibility_screen_completed1']//label"));
			SeatingAndMobility_Radio.add(s);
		}
		else if(s.contains("Client appears to meet ADP eligibility")) {
			clickElementWithJQuery(By.xpath("//div[@id='md-radio-client_adp_eligible1']//label"));
			SeatingAndMobility_Radio.add(s);
		}
		else if(s.contains("Confirmed the status")) {
			clickElementWithJQuery(By.xpath("//div[@id='md-radio-prior_funding1']//label"));
			SeatingAndMobility_Radio.add(s);
		}
		else if(s.contains("None")) {
			clickElementWithJQuery(By.xpath("//div[@id='md-radio-prior_funding_which_1']//label"));
			SeatingAndMobility_Radio.add(s);
		}
		else if(s.contains("Skin Integrity")) {
			clickElementWithJQuery(By.xpath("//div[@id='md-radio-skin_integrity_assessed-1']//label"));
			SeatingAndMobility_Radio.add(s);
		}
		else if(s.contains("Walker type")) {
			clickElementWithJQuery(By.xpath("//div[@class='md-radio']//label[@for='walker_type1']"));
			SeatingAndMobility_Radio.add(s);
		}
		
	}

	public void enterInputFieldAsPerKeyfromScripts(String inputField) {
		switch (inputField) {
		case PixalereStringPool.Special_Delivery_Instructions:
			Special_Delivery_Instructions = JavaUtils.getRandomNumber(2);
			System.out.println(PixalereStringPool.Special_Delivery_Instructions + ": " + Special_Delivery_Instructions);
			clear(OTLocators.delivery_inst_edit);
			sendKeys(OTLocators.delivery_inst_edit, Special_Delivery_Instructions);
			break;

		case PixalereStringPool.first_areaofconcern:
			first_areaofconcern = JavaUtils.getRandomNumber(2);
			System.out.println(PixalereStringPool.first_areaofconcern + ": " + first_areaofconcern);
			clear(OTLocators.con_edit1);
			sendKeys(OTLocators.con_edit1, first_areaofconcern);
			break;

		case PixalereStringPool.secondareaof_concern:
			secondareaof_concern = JavaUtils.getRandomNumber(2);
			System.out.println(PixalereStringPool.secondareaof_concern + ": " + secondareaof_concern);
			clear(OTLocators.con_edit2);
			sendKeys(OTLocators.con_edit2, secondareaof_concern);
			break;

		case PixalereStringPool.PixalereTestsAdmin:
			PixalereTestsAdmin = JavaUtils.getRandomNumber(2);
			System.out.println(PixalereStringPool.PixalereTestsAdmin + ": " + PixalereTestsAdmin);
			clear(OTLocators.signature_canvas);
			sendKeys(OTLocators.signature_canvas, PixalereTestsAdmin);
			break;

		case PixalereStringPool.VarFP1001:
			VarFP1001 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.VarFP1001 + ": " + VarFP1001);
			String xpath1 = String.format(OTLocators.LHINSuppliesNorders, "FP1001");
			clear(By.xpath(xpath1));
			sendKeys(By.xpath(xpath1), VarFP1001);
			break;

		case PixalereStringPool.VarMP1549:
			VarMP1549 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.PixalereTestsAdmin + ": " + VarMP1549);
			String xpath2 = String.format(OTLocators.LHINSuppliesNorders, "MP1549");
			clear(By.xpath(xpath2));
			sendKeys(By.xpath(xpath2), VarMP1549);
			break;

		case PixalereStringPool.VarCCN:
			VarCCN = JavaUtils.getRandomNumber(10);
			System.out.println(PixalereStringPool.PixalereTestsAdmin + ": " + VarCCN);
			clear(By.id("contactno"));
			sendKeys(By.id("contactno"), VarCCN);
			break;

		case PixalereStringPool.YearLHIN:
			YearLHIN = "2022";
			System.out.println(PixalereStringPool.YearLHIN + ": " + YearLHIN);
			clear(OTLocators.yearLHIN);
			sendKeys(OTLocators.yearLHIN, YearLHIN);
			break;

		case PixalereStringPool.addinfoLHIN1:
			addinfoLHIN1 = JavaUtils.getRandomString(10);
			System.out.println(PixalereStringPool.addinfoLHIN1 + ": " + addinfoLHIN1);
			clear(By.id("addinfo_"));
			sendKeys(By.id("addinfo_"), addinfoLHIN1);
			break;

		case PixalereStringPool.addinfoLHIN2:
			addinfoLHIN2 = JavaUtils.getRandomString(10);
			System.out.println(PixalereStringPool.addinfoLHIN2 + ": " + addinfoLHIN2);
			clear(By.id("addinfo_"));
			sendKeys(By.id("addinfo_"), addinfoLHIN2);
			break;

		case PixalereStringPool.CLIENT_SUMMARY_Special_Instructions:
			CLIENT_SUMMARY_Special_Instructions = JavaUtils.getRandomString(10);
			System.out.println(PixalereStringPool.CLIENT_SUMMARY_Special_Instructions + ": "
					+ CLIENT_SUMMARY_Special_Instructions);
			clear(By.id("special_instruction"));
			sendKeys(By.id("special_instruction"), CLIENT_SUMMARY_Special_Instructions);
			break;

		case PixalereStringPool.TIME_PT:
			TIME_PT = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.TIME_PT + ": " + TIME_PT);
			clear(By.id("time"));
			sendKeys(By.id("time"), TIME_PT);
			break;

		case PixalereStringPool.AID_USED_TUG:
			AID_USED_TUG = JavaUtils.getRandomString(10);
			System.out.println(PixalereStringPool.AID_USED_TUG + ": " + AID_USED_TUG);
			clear(By.id("aid_used"));
			sendKeys(By.id("aid_used"), AID_USED_TUG);
			break;

		case PixalereStringPool.FIMData:
			FIMData1 = JavaUtils.getRandomString(10);
			System.out.println(PixalereStringPool.FIMData + ": " + FIMData1);
			clear(By.id("dataObtained"));
			sendKeys(By.id("dataObtained"), FIMData1);
			break;

		case PixalereStringPool.CAMPTCOMMENTS:
			CAMPTCOMMENTS1 = JavaUtils.getRandomString(10);
			System.out.println(PixalereStringPool.CAMPTCOMMENTS + ": " + CAMPTCOMMENTS1);
			clear(By.id("dataObtained"));
			sendKeys(By.id("dataObtained"), CAMPTCOMMENTS1);
			break;

		case PixalereStringPool.RecommendationDate:
			RecommendationDate1 = "05/05/2022";
			System.out.println(PixalereStringPool.RecommendationDate + ": " + RecommendationDate1);
			clear(By.id("date"));
			sendKeys_date(By.id("date"), RecommendationDate1);
			break;

		case PixalereStringPool.RecommendationsDataSPT:
			RecommendationsDataSPT1 = JavaUtils.getRandomString(500);
			System.out.println(PixalereStringPool.RecommendationsDataSPT + ": " + RecommendationsDataSPT1);
			clear(By.id("lettercontentDiv"));
			sendKeys(By.id("lettercontentDiv"), RecommendationsDataSPT1);
			break;

		case PixalereStringPool.HoldAST1:
			HoldAST1 = "2";
			System.out.println(PixalereStringPool.HoldAST1 + ": " + HoldAST1);
			clear(By.xpath("//input[@name='qtyHold'][1]"));
			sendKeys(By.xpath("//input[@name='qtyHold'][1]"), HoldAST1);
			break;

		case PixalereStringPool.SideAST1:
			SideAST1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.SideAST1 + ": " + SideAST1);
			clear(By.xpath("//input[@name='qtySide'][1]"));
			sendKeys(By.xpath("//input[@name='qtySide'][1]"), SideAST1);
			break;

		case PixalereStringPool.RepeatAST1:
			RepeatAST1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.RepeatAST1 + ": " + RepeatAST1);
			clear(By.xpath("//input[@name='qtyRepeat'][1]"));
			sendKeys(By.xpath("//input[@name='qtyRepeat'][1]"), RepeatAST1);
			break;

		/////////////////

		case PixalereStringPool.HoldAST2:
			HoldAST2 = "2";
			System.out.println(PixalereStringPool.HoldAST2 + ": " + HoldAST2);
			clear(By.xpath("(//input[@name='qtyHold'])[2]"));
			sendKeys(By.xpath("(//input[@name='qtyHold'])[2]"), HoldAST2);
			break;

		case PixalereStringPool.SideAST2:
			SideAST2 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.SideAST2 + ": " + SideAST2);
			clear(By.xpath("(//input[@name='qtySide'])[2]"));
			sendKeys(By.xpath("(//input[@name='qtySide'])[2]"), SideAST2);
			break;

		case PixalereStringPool.RepeatAST2:
			RepeatAST2 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.RepeatAST2 + ": " + RepeatAST2);
			clear(By.xpath("(//input[@name='qtyRepeat'])[2]"));
			sendKeys(By.xpath("(//input[@name='qtyRepeat'])[2]"), RepeatAST2);
			break;

		/////////////////

		case PixalereStringPool.HoldAST3:
			HoldAST3 = "2";
			System.out.println(PixalereStringPool.HoldAST3 + ": " + HoldAST3);
			clear(By.xpath("(//input[@name='qtyHold'])[3]"));
			sendKeys(By.xpath("(//input[@name='qtyHold'])[3]"), HoldAST3);
			break;

		case PixalereStringPool.SideAST3:
			SideAST3 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.SideAST3 + ": " + SideAST3);
			clear(By.xpath("(//input[@name='qtySide'])[3]"));
			sendKeys(By.xpath("(//input[@name='qtySide'])[3]"), SideAST3);
			break;

		case PixalereStringPool.RepeatAST3:
			RepeatAST3 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.RepeatAST3 + ": " + RepeatAST3);
			clear(By.xpath("(//input[@name='qtyRepeat'])[3]"));
			sendKeys(By.xpath("(//input[@name='qtyRepeat'])[3]"), RepeatAST3);
			break;

		////////////////

		case PixalereStringPool.HoldAST4:
			HoldAST4 = "2";
			System.out.println(PixalereStringPool.HoldAST4 + ": " + HoldAST4);
			clear(By.xpath("(//input[@name='qtyHold'])[4]"));
			sendKeys(By.xpath("(//input[@name='qtyHold'])[4]"), HoldAST4);
			break;

		case PixalereStringPool.SideAST4:
			SideAST4 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.SideAST4 + ": " + SideAST4);
			clear(By.xpath("(//input[@name='qtySide'])[4]"));
			sendKeys(By.xpath("(//input[@name='qtySide'])[4]"), SideAST4);
			break;

		case PixalereStringPool.RepeatAST4:
			RepeatAST4 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.RepeatAST4 + ": " + RepeatAST4);
			clear(By.xpath("(//input[@name='qtyRepeat'])[4]"));
			sendKeys(By.xpath("(//input[@name='qtyRepeat'])[4]"), RepeatAST4);
			break;

		//////////////////////

		case PixalereStringPool.HoldAST5:
			HoldAST5 = "2";
			System.out.println(PixalereStringPool.HoldAST5 + ": " + HoldAST5);
			clear(By.xpath("(//input[@name='qtyHold'])[5]"));
			sendKeys(By.xpath("(//input[@name='qtyHold'])[5]"), HoldAST5);
			break;

		case PixalereStringPool.SideAST5:
			SideAST5 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.SideAST5 + ": " + SideAST5);
			clear(By.xpath("(//input[@name='qtySide'])[5]"));
			sendKeys(By.xpath("(//input[@name='qtySide'])[5]"), SideAST5);
			break;

		case PixalereStringPool.RepeatAST5:
			RepeatAST5 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.RepeatAST5 + ": " + RepeatAST5);
			clear(By.xpath("(//input[@name='qtyRepeat'])[5]"));
			sendKeys(By.xpath("(//input[@name='qtyRepeat'])[5]"), RepeatAST5);
			break;

		case PixalereStringPool.ExcersizeHandoutDate:
			ExcersizeHandoutDate1 = "05/05/2022";
			System.out.println(PixalereStringPool.ExcersizeHandoutDate + ": " + ExcersizeHandoutDate1);
			clear(By.id("visit_date"));
			sendKeys_date(By.id("visit_date"), ExcersizeHandoutDate1);
			break;

		case PixalereStringPool.ExcersizeProgName:
			ExcersizeName = JavaUtils.getRandomString(10);
			System.out.println(PixalereStringPool.ExcersizeProgName + ": " + ExcersizeName);
			clear(By.xpath("//input[@id='exerciseName']"));
			sendKeys(By.xpath("//input[@id='exerciseName']"), ExcersizeName);
			break;

		case PixalereStringPool.ExcersizeComments:
			ExcersizeComments = JavaUtils.getRandomString(10);
			System.out.println(PixalereStringPool.ExcersizeComments + ": " + ExcersizeComments);
			clear(By.xpath("//*[@id='addcomments']"));
			sendKeys(By.xpath("//*[@id='addcomments']"), ExcersizeComments);
			break;

		case PixalereStringPool.Client_SDM_GOAL_PTAssessment:
			Client_SDM_Goal = JavaUtils.getRandomString(10);
			System.out.println(PixalereStringPool.Client_SDM_GOAL_PTAssessment + ": " + Client_SDM_Goal);
			clear(By.xpath("//*[@id='sdm_stated_goal']"));
			sendKeys(By.xpath("//*[@id='sdm_stated_goal']"), Client_SDM_Goal);
			break;

		case PixalereStringPool.MD_NP_contact_info:
			MD_NP_contact_info1 = JavaUtils.getRandomString(10);
			System.out.println(PixalereStringPool.MD_NP_contact_info + ": " + MD_NP_contact_info1);
			clear(By.xpath("//*[@id='md_np_contact_info']"));
			sendKeys(By.xpath("//*[@id='md_np_contact_info']"), MD_NP_contact_info1);
			break;

		case PixalereStringPool.Client_Caregiver_Requests:
			Client_Caregiver_Requests1 = JavaUtils.getRandomString(10);
			System.out.println(PixalereStringPool.Client_Caregiver_Requests + ": " + Client_Caregiver_Requests1);
			clear(By.xpath("//*[@id='caregiver_requests']"));
			sendKeys(By.xpath("//*[@id='caregiver_requests']"), Client_Caregiver_Requests1);
			break;

		case PixalereStringPool.Caseload_District:
			Caseload_District1 = JavaUtils.getRandomString(10);
			System.out.println(PixalereStringPool.Caseload_District + ": " + Caseload_District1);
			clear(By.xpath("//*[@id='caseload_district']"));
			sendKeys(By.xpath("//*[@id='caseload_district']"), Caseload_District1);
			break;

		case PixalereStringPool.Special_precautions:
			Special_precautions1 = JavaUtils.getRandomString(10);
			System.out.println(PixalereStringPool.Special_precautions + ": " + Special_precautions1);
			clear(By.xpath("//*[@id='special_precautions']"));
			sendKeys(By.xpath("//*[@id='special_precautions']"), Special_precautions1);
			break;

		case PixalereStringPool.Secondary_nurse_contact_info:
			Secondary_nurse_contact_info1 = JavaUtils.getRandomString(10);
			System.out.println(PixalereStringPool.Secondary_nurse_contact_info + ": " + Secondary_nurse_contact_info1);
			clear(By.xpath("//*[@id='secondary_nurses']"));
			sendKeys(By.xpath("//*[@id='secondary_nurses']"), Secondary_nurse_contact_info1);
			break;

		case PixalereStringPool.Last_enteral_tube_change:
			Last_enteral_tube_change1 = JavaUtils.getRandomString(10);
			System.out.println(PixalereStringPool.Last_enteral_tube_change + ": " + Last_enteral_tube_change1);
			clear(By.xpath("//*[@id='last_change']"));
			sendKeys(By.xpath("//*[@id='last_change']"), Last_enteral_tube_change1);
			break;

		case PixalereStringPool.Day_MicKEY_balloon_reinflation:
			Day_MicKEY_balloon_reinflation1 = JavaUtils.getRandomString(10);
			System.out.println(
					PixalereStringPool.Day_MicKEY_balloon_reinflation + ": " + Day_MicKEY_balloon_reinflation1);
			clear(By.xpath("//*[@id='day_of_mickey_balloon_reinflation']"));
			sendKeys(By.xpath("//*[@id='day_of_mickey_balloon_reinflation']"), Day_MicKEY_balloon_reinflation1);
			break;

		case PixalereStringPool.Care_of_site:
			Careofsite1 = JavaUtils.getRandomString(10);
			System.out.println(PixalereStringPool.Care_of_site + ": " + Careofsite1);
			clear(By.xpath("//*[@id='care_of_site']"));
			sendKeys(By.xpath("//*[@id='care_of_site']"), Careofsite1);
			break;

		case PixalereStringPool.Times_of_feeds:
			Times_of_feeds1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Times_of_feeds + ": " + Times_of_feeds1);
			clear(By.xpath("//*[@id='times_of_feed']"));
			sendKeys(By.xpath("//*[@id='times_of_feed']"), Times_of_feeds1);
			break;

		case PixalereStringPool.Number_of_treatment:
			Number_of_treatment1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Number_of_treatment + ": " + Number_of_treatment1);
			clear(By.xpath("//*[@name='treatment_num']"));
			sendKeys(By.xpath("//*[@name='treatment_num']"), Number_of_treatment1);
			break;

		case PixalereStringPool.Therapy_hours:
			Therapy_hours1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Therapy_hours + ": " + Therapy_hours1);
			clear(By.xpath("//*[@name='therapy_hours']"));
			sendKeys(By.xpath("//*[@name='therapy_hours']"), Therapy_hours1);
			break;

		case PixalereStringPool.Information_for_scale_provided:
			Information_for_scale_provided1 = JavaUtils.getRandomNumber(1);
			System.out.println(
					PixalereStringPool.Information_for_scale_provided + ": " + Information_for_scale_provided1);
			clear(By.xpath("//*[@id='scale_info']"));
			sendKeys(By.xpath("//*[@id='scale_info']"), Information_for_scale_provided1);
			break;

		case PixalereStringPool.Worst_Possible_Pain_10:
			Worst_Possible_Pain_101 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Worst_Possible_Pain_10 + ": " + Worst_Possible_Pain_101);
			clear(By.xpath("//*[@id='pain_10']"));
			sendKeys(By.xpath("//*[@id='pain_10']"), Worst_Possible_Pain_101);
			break;
		case PixalereStringPool.Worst_Possible_Pain_9:
			Worst_Possible_Pain_9 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Worst_Possible_Pain_9 + ": " + Worst_Possible_Pain_9);
			clear(By.xpath("//*[@id='pain_9']"));
			sendKeys(By.xpath("//*[@id='pain_9']"), Worst_Possible_Pain_9);
			break;
		case PixalereStringPool.Worst_Possible_Pain_8:
			Worst_Possible_Pain_8 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Worst_Possible_Pain_8 + ": " + Worst_Possible_Pain_8);
			clear(By.xpath("//*[@id='pain_8']"));
			sendKeys(By.xpath("//*[@id='pain_8']"), Worst_Possible_Pain_8);
			break;

		case PixalereStringPool.Moderate_Pain_5:
			Moderate_Pain_51 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Moderate_Pain_5 + ": " + Moderate_Pain_51);
			clear(By.xpath("//*[@id='pain_5']"));
			sendKeys(By.xpath("//*[@id='pain_5']"), Moderate_Pain_51);
			break;
		case PixalereStringPool.Moderate_Pain_4:
			Moderate_Pain_4 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Moderate_Pain_4 + ": " + Moderate_Pain_4);
			clear(By.xpath("//*[@id='pain_4']"));
			sendKeys(By.xpath("//*[@id='pain_4']"), Moderate_Pain_4);
			break;
		case PixalereStringPool.Moderate_Pain_3:
			Moderate_Pain_3 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Moderate_Pain_3 + ": " + Moderate_Pain_3);
			clear(By.xpath("//*[@id='pain_3']"));
			sendKeys(By.xpath("//*[@id='pain_3']"), Moderate_Pain_3);
			break;

		case PixalereStringPool.Words_used_for_pain:
			Words_used_for_pain1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Words_used_for_pain + ": " + Words_used_for_pain1);
			clear(By.xpath("//*[@id='pain']"));
			sendKeys(By.xpath("//*[@id='pain']"), Words_used_for_pain1);
			break;

		case PixalereStringPool.discomfortpain_triggers_for_your_child:
			discomfortpain_triggers_for_your_child1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.discomfortpain_triggers_for_your_child + ": "
					+ discomfortpain_triggers_for_your_child1);
			clear(By.xpath("//*[@id='pain_trigger']"));
			sendKeys(By.xpath("//*[@id='pain_trigger']"), discomfortpain_triggers_for_your_child1);
			break;

		case PixalereStringPool.initial_interventions_in_the_past:
			initial_interventions_in_the_past1 = JavaUtils.getRandomNumber(1);
			System.out.println(
					PixalereStringPool.initial_interventions_in_the_past + ": " + initial_interventions_in_the_past1);
			clear(By.xpath("//*[@id='init_intervation']"));
			sendKeys(By.xpath("//*[@id='init_intervation']"), initial_interventions_in_the_past1);
			break;

		case PixalereStringPool.the_child_doing_when_you_noticed_the_pain:
			the_child_doing_when_you_noticed_the_pain1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.the_child_doing_when_you_noticed_the_pain + ": "
					+ the_child_doing_when_you_noticed_the_pain1);
			clear(By.xpath("//*[@id='notice_pain']"));
			sendKeys(By.xpath("//*[@id='notice_pain']"), the_child_doing_when_you_noticed_the_pain1);
			break;

		case PixalereStringPool.Medications_for_Pain_Pharmacological:
			Medications_for_Pain_Pharmacological1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Medications_for_Pain_Pharmacological + ": "
					+ Medications_for_Pain_Pharmacological1);
			clear(By.xpath(
					"//*[contains(text(),'Medications for Pain')]/following-sibling::td//input[contains(@id,'family')]"));
			sendKeys(By.xpath(
					"//*[contains(text(),'Medications for Pain')]/following-sibling::td//input[contains(@id,'family')]"),
					Medications_for_Pain_Pharmacological1);
			break;

		case PixalereStringPool.Cooling_spray_Physical_Environmental:
			Cooling_spray_Physical_Environmental1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Cooling_spray_Physical_Environmental + ": "
					+ Cooling_spray_Physical_Environmental1);
			clear(By.xpath("//input[@id='family_20398']"));
			sendKeys(By.xpath("//input[@id='family_20398']"), Cooling_spray_Physical_Environmental1);
			break;
		case PixalereStringPool.Massage_for_Physical_Environmental:
			Massage_for_Physical_Environmental = JavaUtils.getRandomNumber(1);
			System.out.println(
					PixalereStringPool.Massage_for_Physical_Environmental + ": " + Massage_for_Physical_Environmental);
			clear(By.xpath("//input[@id='family_20401']"));
			sendKeys(By.xpath("//input[@id='family_20401']"), Massage_for_Physical_Environmental);
			break;
		case PixalereStringPool.Repositioning_for_Physical_Environmental:
			Repositioning_for_Physical_Environmental = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Repositioning_for_Physical_Environmental + ": "
					+ Repositioning_for_Physical_Environmental);
			clear(By.xpath("//input[@id='family_20404']"));
			sendKeys(By.xpath("//input[@id='family_20404']"), Repositioning_for_Physical_Environmental);
			break;

		case PixalereStringPool.Distraction_Psychological_Behavioral:
			Distraction_Psychological_Behavioral1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Distraction_Psychological_Behavioral + ": "
					+ Distraction_Psychological_Behavioral1);
			clear(By.xpath("//*[contains(text(),'Distraction')]/following-sibling::td//input[contains(@id,'family')]"));
			sendKeys(
					By.xpath(
							"//*[contains(text(),'Distraction')]/following-sibling::td//input[contains(@id,'family')]"),
					Distraction_Psychological_Behavioral1);
			break;

		case PixalereStringPool.Medical_Devices:
			Medical_Devices1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Medical_Devices + ": " + Medical_Devices1);
			clear(By.xpath(
					"//*[contains(text(),'Medical Devices')]/following-sibling::td//input[contains(@id,'family')]"));
			sendKeys(By.xpath(
					"//*[contains(text(),'Medical Devices')]/following-sibling::td//input[contains(@id,'family')]"),
					Medical_Devices1);
			break;

		case PixalereStringPool.Client_Specific_Intervention_Other:
			Client_Specific_Intervention_Other1 = JavaUtils.getRandomNumber(1);
			System.out.println(
					PixalereStringPool.Client_Specific_Intervention_Other + ": " + Client_Specific_Intervention_Other1);
			clear(By.xpath(
					"//*[contains(text(),'Client Specific Intervention')]/following-sibling::td//input[contains(@id,'family')]"));
			sendKeys(By.xpath(
					"//*[contains(text(),'Client Specific Intervention')]/following-sibling::td//input[contains(@id,'family')]"),
					Client_Specific_Intervention_Other1);
			break;

		case PixalereStringPool.Please_document_MRP_recommendations:
			Please_document_MRP_recommendations1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Please_document_MRP_recommendations + ": "
					+ Please_document_MRP_recommendations1);
			clear(By.xpath(
					"//*[contains(text(),'Notify/Consult MRP')]/following-sibling::td//input[contains(@id,'family')]"));
			sendKeys(By.xpath(
					"//*[contains(text(),'Notify/Consult MRP')]/following-sibling::td//input[contains(@id,'family')]"),
					Please_document_MRP_recommendations1);
			break;

		case PixalereStringPool.Aggravating_Factors:
			Aggravating_Factors1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Aggravating_Factors + ": " + Aggravating_Factors1);
			clear(By.xpath("//*[@name='aggra_factors']"));
			sendKeys(By.xpath("//*[@name='aggra_factors']"), Aggravating_Factors1);
			break;

		case PixalereStringPool.Regular_Pain_Medication:
			Regular_Pain_Medication1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Regular_Pain_Medication + ": " + Regular_Pain_Medication1);
			clear(By.xpath("//*[@name='pain_meds']"));
			sendKeys(By.xpath("//*[@name='pain_meds']"), Regular_Pain_Medication1);
			break;

		case PixalereStringPool.Breakthrough_Pain_Medication:
			Breakthrough_Pain_Medication1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Breakthrough_Pain_Medication + ": " + Breakthrough_Pain_Medication1);
			clear(By.xpath("//*[@name='breakthr_pain_meds']"));
			sendKeys(By.xpath("//*[@name='breakthr_pain_meds']"), Breakthrough_Pain_Medication1);
			break;

		case PixalereStringPool.Breakthrough_Frequency:
			Breakthrough_Frequency1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Breakthrough_Frequency + ": " + Breakthrough_Frequency1);
			clear(By.xpath("//*[@name='breakthr_freq']"));
			sendKeys(By.xpath("//*[@name='breakthr_freq']"), Breakthrough_Frequency1);
			break;

		case PixalereStringPool.Comments_Pain_Profile:
			Comments_Pain_Profile1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Comments_Pain_Profile + ": " + Comments_Pain_Profile1);
			clear(By.xpath("//*[@id='adl_comments']"));
			sendKeys(By.xpath("//*[@id='adl_comments']"), Comments_Pain_Profile1);
			break;

		case PixalereStringPool.Adjuvant_Pain_Medication:
			Adjuvant_Pain_Medication1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Adjuvant_Pain_Medication + ": " + Adjuvant_Pain_Medication1);
			clear(By.xpath("//*[@name='adj_pain_meds']"));
			sendKeys(By.xpath("//*[@name='adj_pain_meds']"), Adjuvant_Pain_Medication1);
			break;

		case PixalereStringPool.Palliating_Factors:
			Palliating_Factors1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Palliating_Factors + ": " + Palliating_Factors1);
			clear(By.xpath("//*[@name='palliating_factors']"));
			sendKeys(By.xpath("//*[@name='palliating_factors']"), Palliating_Factors1);
			break;

		case PixalereStringPool.Aggravating_Factors_PPA:
			Aggravating_Factors_PPA1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Comments_Pain_Profile + ": " + Aggravating_Factors_PPA1);
			clear(By.xpath("//*[@name='pf_comments']"));
			sendKeys(By.xpath("//*[@name='pf_comments']"), Aggravating_Factors_PPA1);
			break;

		case PixalereStringPool.Intensity:
			Intensity1 = "8";
			System.out.println(PixalereStringPool.Intensity + ": " + Intensity1);
			clear(By.xpath("//*[@id='intensity']"));
			sendKeys(By.xpath("//*[@id='intensity']"), Intensity1);
			break;

		case PixalereStringPool.Pharmacological_Intervention:
			Pharmacological_Intervention1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Pharmacological_Intervention + ": " + Pharmacological_Intervention1);
			clear(By.xpath("//*[@name='pharmacological']"));
			sendKeys(By.xpath("//*[@name='pharmacological']"), Pharmacological_Intervention1);
			break;

		case PixalereStringPool.OtherICAone:
			OtherICAone1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.OtherICAone + ": " + OtherICAone1);
			clear(By.xpath("//*[@name='primary_diagnosis_other']"));
			sendKeys(By.xpath("//*[@name='primary_diagnosis_other']"), OtherICAone1);
			break;

		case PixalereStringPool.OtherICA2:
			OtherICA21 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.OtherICA2 + ": " + OtherICA21);
			clear(By.xpath("//*[@name='comorbidities_other']"));
			sendKeys(By.xpath("//*[@name='comorbidities_other']"), OtherICA21);
			break;

		case PixalereStringPool.Symptom_Management:
			Symptom_Management1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Symptom_Management + ": " + Symptom_Management1);
			clear(By.xpath("//*[@name='symptom']"));
			sendKeys(By.xpath("//*[@name='symptom']"), Symptom_Management1);
			break;

		case PixalereStringPool.OtherICA3:
			OtherICA31 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.OtherICA3 + ": " + OtherICA31);
			clear(By.xpath("//*[@name='symptom_other']"));
			sendKeys(By.xpath("//*[@name='symptom_other']"), OtherICA31);
			break;

		case PixalereStringPool.Cardiovascular_History_Comments:
			Cardiovascular_History_Comments1 = JavaUtils.getRandomNumber(1);
			System.out.println(
					PixalereStringPool.Cardiovascular_History_Comments + ": " + Cardiovascular_History_Comments1);
			clear(By.xpath("//*[@name='cardio_comments']"));
			sendKeys(By.xpath("//*[@name='cardio_comments']"), Cardiovascular_History_Comments1);
			break;

		case PixalereStringPool.Respiratory_History_Comments:
			Respiratory_History_Comments1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Respiratory_History_Comments + ": " + Respiratory_History_Comments1);
			clear(By.xpath("//*[@name='resphist_comments']"));
			sendKeys(By.xpath("//*[@name='resphist_comments']"), Respiratory_History_Comments1);
			break;

		case PixalereStringPool.Eyes_Ears_Nose_Throat_History_Comments:
			Eyes_Ears_Nose_Throat_History_Comments1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Eyes_Ears_Nose_Throat_History_Comments + ": "
					+ Eyes_Ears_Nose_Throat_History_Comments1);
			clear(By.xpath("//*[@name='eent_comments']"));
			sendKeys(By.xpath("//*[@name='eent_comments']"), Eyes_Ears_Nose_Throat_History_Comments1);
			break;

		case PixalereStringPool.Client_Perspective1:
			Client_Perspective11 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Client_Perspective1 + ": " + Client_Perspective11);
			clear(By.xpath("//*[@name='reason_for_nursing']"));
			sendKeys(By.xpath("//*[@name='reason_for_nursing']"), Client_Perspective11);
			break;

		case PixalereStringPool.Client_Perspective2:
			Client_Perspective21 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Client_Perspective2 + ": " + Client_Perspective21);
			clear(By.xpath("//*[@name='important_health']"));
			sendKeys(By.xpath("//*[@name='important_health']"), Client_Perspective21);
			break;

		case PixalereStringPool.Client_Perspective3:
			Client_Perspective31 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Client_Perspective3 + ": " + Client_Perspective31);
			clear(By.xpath("//*[@name='teaching_needs']"));
			sendKeys(By.xpath("//*[@name='teaching_needs']"), Client_Perspective31);
			break;

		case PixalereStringPool.Client_Perspective4:
			Client_Perspective41 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Client_Perspective4 + ": " + Client_Perspective41);
			clear(By.xpath("//*[@name='teaching_needs']"));
			sendKeys(By.xpath("//*[@name='teaching_needs']"), Client_Perspective41);
			break;

		case PixalereStringPool.Client_Perspective5:
			Client_Perspective51 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Client_Perspective5 + ": " + Client_Perspective51);
			clear(By.xpath("//*[@name='values']"));
			sendKeys(By.xpath("//*[@name='values']"), Client_Perspective51);
			break;

		case PixalereStringPool.Ankle_Dorsiflexion:
			Ankle_Dorsiflexion1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Ankle_Dorsiflexion + ": " + Ankle_Dorsiflexion1);
			clear(By.xpath("((//*[@id='jointMovement']//tr)[1])//td[3]//input"));
			sendKeys(By.xpath("((//*[@id='jointMovement']//tr)[1])//td[3]//input"), Ankle_Dorsiflexion1);
			break;

		case PixalereStringPool.Ankle_Plantarflexion:
			Ankle_Plantarflexion1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Ankle_Plantarflexion + ": " + Ankle_Plantarflexion1);
			clear(By.xpath("((//*[@id='jointMovement']//tr)[2])//td[3]//input"));
			sendKeys(By.xpath("((//*[@id='jointMovement']//tr)[2])//td[3]//input"), Ankle_Plantarflexion1);
			break;

		case PixalereStringPool.Knee_Flexion:
			Knee_Flexion1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Knee_Flexion + ": " + Knee_Flexion1);
			clear(By.xpath("((//*[@id='jointMovement']//tr)[3])//td[3]//input"));
			sendKeys(By.xpath("((//*[@id='jointMovement']//tr)[3])//td[3]//input"), Knee_Flexion1);
			break;

		case PixalereStringPool.Knee_Extension:
			Knee_Extension1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Knee_Extension + ": " + Knee_Extension1);
			clear(By.xpath("((//*[@id='jointMovement']//tr)[4])//td[4]//input"));
			sendKeys(By.xpath("((//*[@id='jointMovement']//tr)[4])//td[4]//input"), Knee_Extension1);
			break;

		case PixalereStringPool.Hip_Flexion:
			Hip_Flexion1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Hip_Flexion + ": " + Hip_Flexion1);
			clear(By.xpath("((//*[@id='jointMovement']//tr)[5])//td[5]//input"));
			sendKeys(By.xpath("((//*[@id='jointMovement']//tr)[5])//td[5]//input"), Hip_Flexion1);
			break;

		case PixalereStringPool.Hip_Abduction:
			Hip_Abduction1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Hip_Abduction + ": " + Hip_Abduction1);
			clear(By.xpath("((//*[@id='jointMovement']//tr)[6])//td[6]//input"));
			sendKeys(By.xpath("((//*[@id='jointMovement']//tr)[6])//td[6]//input"), Hip_Abduction1);
			break;

		case PixalereStringPool.Hip_Extension:
			Hip_Extension1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Hip_Extension + ": " + Hip_Extension1);
			clear(By.xpath("((//*[@id='jointMovement']//tr)[7])//td[7]//input"));
			sendKeys(By.xpath("((//*[@id='jointMovement']//tr)[7])//td[7]//input"), Hip_Extension1);
			break;

		case PixalereStringPool.Wrist_Flexion:
			Wrist_Flexion1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Wrist_Flexion + ": " + Wrist_Flexion1);
			clear(By.xpath("((//*[@id='jointMovement']//tr)[8])//td[8]//input"));
			sendKeys(By.xpath("((//*[@id='jointMovement']//tr)[8])//td[8]//input"), Wrist_Flexion1);
			break;

		case PixalereStringPool.Wrist_Extension:
			Wrist_Extension1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Wrist_Extension + ": " + Wrist_Extension1);
			clear(By.xpath("((//*[@id='jointMovement']//tr)[9])//td[9]//input"));
			sendKeys(By.xpath("((//*[@id='jointMovement']//tr)[9])//td[9]//input"), Wrist_Extension1);
			break;

		case PixalereStringPool.Elbow_Flexion:
			Elbow_Flexion1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Elbow_Flexion + ": " + Elbow_Flexion1);
			clear(By.xpath("((//*[@id='jointMovement']//tr)[10])//td[10]//input"));
			sendKeys(By.xpath("((//*[@id='jointMovement']//tr)[10])//td[10]//input"), Elbow_Flexion1);
			break;

		case PixalereStringPool.Elbow_Extension:
			Elbow_Extension1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Elbow_Extension + ": " + Elbow_Extension1);
			clear(By.xpath("((//*[@id='jointMovement']//tr)[11])//td[3]//input"));
			sendKeys(By.xpath("((//*[@id='jointMovement']//tr)[11])//td[3]//input"), Elbow_Extension1);
			break;

		case PixalereStringPool.Elbow_Supination:
			Elbow_Supination1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Elbow_Supination + ": " + Elbow_Supination1);
			clear(By.xpath("((//*[@id='jointMovement']//tr)[12])//td[3]//input"));
			sendKeys(By.xpath("((//*[@id='jointMovement']//tr)[12])//td[3]//input"), Elbow_Supination1);
			break;

		case PixalereStringPool.Elbow_Pronation:
			Elbow_Pronation1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Elbow_Pronation + ": " + Elbow_Pronation1);
			clear(By.xpath("((//*[@id='jointMovement']//tr)[13])//td[3]//input"));
			sendKeys(By.xpath("((//*[@id='jointMovement']//tr)[13])//td[3]//input"), Elbow_Pronation1);
			break;

		case PixalereStringPool.Shoulder_Flexion:
			Shoulder_Flexion1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Shoulder_Flexion + ": " + Shoulder_Flexion1);
			clear(By.xpath("((//*[@id='jointMovement']//tr)[14])//td[3]//input"));
			sendKeys(By.xpath("((//*[@id='jointMovement']//tr)[14])//td[3]//input"), Shoulder_Flexion1);
			break;

		case PixalereStringPool.Shoulder_Abduction:
			Shoulder_Abduction1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Shoulder_Abduction + ": " + Shoulder_Abduction1);
			clear(By.xpath("((//*[@id='jointMovement']//tr)[15])//td[3]//input"));
			sendKeys(By.xpath("((//*[@id='jointMovement']//tr)[15])//td[3]//input"), Shoulder_Abduction1);
			break;

		case PixalereStringPool.Shoulder_External_Rotation:
			Shoulder_External_Rotation1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Shoulder_External_Rotation + ": " + Shoulder_External_Rotation1);
			clear(By.xpath("((//*[@id='jointMovement']//tr)[16])//td[3]//input"));
			sendKeys(By.xpath("((//*[@id='jointMovement']//tr)[16])//td[3]//input"), Shoulder_External_Rotation1);
			break;

		case PixalereStringPool.Shoulder_Internal_Rotation:
			Shoulder_Internal_Rotation1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Shoulder_Internal_Rotation + ": " + Shoulder_Internal_Rotation1);
			clear(By.xpath("((//*[@id='jointMovement']//tr)[17])//td[3]//input"));
			sendKeys(By.xpath("((//*[@id='jointMovement']//tr)[17])//td[3]//input"), Shoulder_Internal_Rotation1);
			break;

		case PixalereStringPool.CSpine_Flexion:
			CSpine_Flexion1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.CSpine_Flexion + ": " + CSpine_Flexion1);
			clear(By.xpath("((//*[@id='jointMovement']//tr)[18])//td[3]//input"));
			sendKeys(By.xpath("((//*[@id='jointMovement']//tr)[18])//td[3]//input"), CSpine_Flexion1);
			break;

		case PixalereStringPool.CSpine_Extension:
			CSpine_Extension1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.CSpine_Extension + ": " + CSpine_Extension1);
			clear(By.xpath("((//*[@id='jointMovement']//tr)[19])//td[8]//input"));
			sendKeys(By.xpath("((//*[@id='jointMovement']//tr)[19])//td[8]//input"), CSpine_Extension1);
			break;

		case PixalereStringPool.CSpine_SideFlexion:
			CSpine_SideFlexion1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.CSpine_SideFlexion + ": " + CSpine_SideFlexion1);
			clear(By.xpath("((//*[@id='jointMovement']//tr)[20])//td[6]//input"));
			sendKeys(By.xpath("((//*[@id='jointMovement']//tr)[20])//td[6]//input"), CSpine_SideFlexion1);
			break;

		case PixalereStringPool.CSpine_Rotation:
			CSpine_Rotation1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.CSpine_Rotation + ": " + CSpine_Rotation1);
			clear(By.xpath("((//*[@id='jointMovement']//tr)[21])//td[3]//input"));
			sendKeys(By.xpath("((//*[@id='jointMovement']//tr)[21])//td[3]//input"), CSpine_Rotation1);
			break;

		case PixalereStringPool.LSpine_Flexion:
			LSpine_Flexion1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.LSpine_Flexion + ": " + LSpine_Flexion1);
			clear(By.xpath("((//*[@id='jointMovement']//tr)[22])//td[5]//input"));
			sendKeys(By.xpath("((//*[@id='jointMovement']//tr)[22])//td[5]//input"), LSpine_Flexion1);
			break;

		case PixalereStringPool.LSpine_Extension:
			LSpine_Extension1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.LSpine_Extension + ": " + LSpine_Extension1);
			clear(By.xpath("((//*[@id='jointMovement']//tr)[23])//td[3]//input"));
			sendKeys(By.xpath("((//*[@id='jointMovement']//tr)[23])//td[3]//input"), LSpine_Extension1);
			break;

		case PixalereStringPool.LSpine_SideFlexion:
			LSpine_SideFlexion1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.LSpine_SideFlexion + ": " + LSpine_SideFlexion1);
			clear(By.xpath("((//*[@id='jointMovement']//tr)[24])//td[3]//input"));
			sendKeys(By.xpath("((//*[@id='jointMovement']//tr)[24])//td[3]//input"), LSpine_SideFlexion1);
			break;

		case PixalereStringPool.Other_JointMovement:
			Other_JointMovement1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Other_JointMovement + ": " + Other_JointMovement1);
			clear(By.xpath("((//*[@id='jointMovement']//tr)[25])//td[3]//input"));
			sendKeys(By.xpath("((//*[@id='jointMovement']//tr)[25])//td[3]//input"), Other_JointMovement1);
			break;

		case PixalereStringPool.SDM_Name:
			SDM_Name1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.SDM_Name + ": " + SDM_Name1);
			clear(By.xpath("//*[@id='sdm_name']"));
			sendKeys(By.xpath("//*[@id='sdm_name']"), SDM_Name1);
			break;

		case PixalereStringPool.FileUploadADP_Funding_Decision:
			FileUploadADP_Funding_Decision1 = System.getProperty("user.dir") + File.separator + "lib" + File.separator
					+ "MOHLTC_ADP_Application.pdf";
			System.out.println(
					PixalereStringPool.FileUploadADP_Funding_Decision + ": " + FileUploadADP_Funding_Decision1);
			// clear(By.xpath("//*[@id='document']"));
			sendKeys_isElementPresent(By.xpath("//*[@id='document']"), FileUploadADP_Funding_Decision1);
			break;

		case PixalereStringPool.ADP_Authorizer_Name:
			ADP_Authorizer_Name1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.ADP_Authorizer_Name + ": " + ADP_Authorizer_Name1);
			clear(By.xpath("//*[@id='name']"));
			sendKeys(By.xpath("//*[@id='name']"), ADP_Authorizer_Name1);
			break;

		case PixalereStringPool.Date_ADP:
			Date_ADP1 = "05/05/2022";
			System.out.println(PixalereStringPool.Date_ADP + ": " + Date_ADP1);
			// clear(By.xpath("//*[@id='adp_date']"));
			sendKeys_date(By.xpath("//*[@id='adp_date']"), Date_ADP1);
			break;

		case PixalereStringPool.Document_Name_for_Filter:
			Document_Name_for_Filter1 = "MOHLTC_ADP_Application";
			System.out.println(PixalereStringPool.Document_Name_for_Filter + ": " + Document_Name_for_Filter1);
			clear(By.xpath("(//*[@name='document'])[2]"));
			sendKeys(By.xpath("(//*[@name='document'])[2]"), Document_Name_for_Filter1);
			break;

		////////// PICAT child nursing ////////////////

		case PixalereStringPool.concerns_or_issues:
			concerns_or_issues1 = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.concerns_or_issues + ": " + concerns_or_issues1);
			clear(By.xpath("//textarea[@id='concerns']"));
			sendKeys(By.xpath("//textarea[@id='concerns']"), concerns_or_issues1);
			break;
		case PixalereStringPool.values_and_beliefs:
			values_and_beliefs1 = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.values_and_beliefs + ": " + values_and_beliefs1);
			clear(By.xpath("//textarea[@id='values']"));
			sendKeys(By.xpath("//textarea[@id='values']"), values_and_beliefs1);
			break;
		case PixalereStringPool.health_teaching:
			health_teaching1 = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.health_teaching + ": " + health_teaching1);
			clear(By.xpath("//textarea[@id='health_teaching']"));
			sendKeys(By.xpath("//textarea[@id='health_teaching']"), health_teaching1);
			break;
		case PixalereStringPool.most_important:
			most_important1 = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.most_important + ": " + most_important1);
			clear(By.xpath("//textarea[@id='imp_child_health']"));
			sendKeys(By.xpath("//textarea[@id='imp_child_health']"), most_important1);
			break;
		case PixalereStringPool.nursing_service:
			nursing_service1 = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.nursing_service + ": " + nursing_service1);
			clear(By.xpath("//*[@id='nursing_reason']"));
			sendKeys(By.xpath("//*[@id='nursing_reason']"), nursing_service1);
			break;
		case PixalereStringPool.Source_of_Info:
			Source_of_Info1 = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Source_of_Info + ": " + Source_of_Info1);
			clear(By.xpath("(//*[@id='source_of_info'])"));
			sendKeys(By.xpath("(//*[@id='source_of_info'])"), Source_of_Info1);
			break;
		case PixalereStringPool.Allergies_and_Reactions:
			Allergies_and_Reactions = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Allergies_and_Reactions + ": " + Allergies_and_Reactions);
			clear(By.xpath("//textarea[@id='allergies']"));
			sendKeys(By.xpath("//textarea[@id='allergies']"), Allergies_and_Reactions);
			break;
		case PixalereStringPool.Primary_Diagnosis:
			Primary_Diagnosis = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Primary_Diagnosis + ": " + Primary_Diagnosis);
			clear(By.xpath("//textarea[@id='primary_diagnosis']"));
			sendKeys(By.xpath("//textarea[@id='primary_diagnosis']"), Primary_Diagnosis);
			break;

		case PixalereStringPool.Custodial_Arrangements:
			Custodial_Arrangements1 = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Custodial_Arrangements + ": " + Custodial_Arrangements1);
			clear(By.xpath("(//*[@id='custodial'])"));
			sendKeys(By.xpath("(//*[@id='custodial'])"), Custodial_Arrangements1);
			break;

		case PixalereStringPool.Important_Past_Medical_Surgical_History:
			Important_Past_Medical_Surgical_History1 = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Important_Past_Medical_Surgical_History + ": "
					+ Important_Past_Medical_Surgical_History1);
			clear(By.xpath("//textarea[@id='secondary_diagnosis']"));
			sendKeys(By.xpath("//textarea[@id='secondary_diagnosis']"), Important_Past_Medical_Surgical_History1);
			break;

		case PixalereStringPool.Daycare_Childcare:
			Daycare_Childcare1 = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Daycare_Childcare + ": " + Daycare_Childcare1);
			clear(By.xpath("(//*[@id='daycare'])"));
			sendKeys(By.xpath("(//*[@id='daycare'])"), Daycare_Childcare1);
			break;

		case PixalereStringPool.Siblings:
			Siblings1 = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Siblings + ": " + Siblings1);
			clear(By.xpath("(//*[@id='siblings'])"));
			sendKeys(By.xpath("(//*[@id='siblings'])"), Siblings1);
			break;

		case PixalereStringPool.Significant_Other_Relationships_Pets:
			Significant_Other_Relationships_Pets1 = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Significant_Other_Relationships_Pets + ": "
					+ Significant_Other_Relationships_Pets1);
			clear(By.xpath("(//*[@id='pets'])"));
			sendKeys(By.xpath("(//*[@id='pets'])"), Significant_Other_Relationships_Pets1);
			break;

		case PixalereStringPool.Respiratory_History_Comments_PICAT:
			Respiratory_History_Comments_PICAT1 = JavaUtils.getRandomString(5);
			System.out.println(
					PixalereStringPool.Respiratory_History_Comments_PICAT + ": " + Respiratory_History_Comments_PICAT1);
			clear(By.xpath("(//*[@id='resp_history_comment'])"));
			sendKeys(By.xpath("(//*[@id='resp_history_comment'])"), Respiratory_History_Comments_PICAT1);
			break;

		case PixalereStringPool.Respiratory_Assessment_Comments_PICAT:
			Respiratory_Assessment_Comments_PICAT1 = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Respiratory_Assessment_Comments_PICAT + ": "
					+ Respiratory_Assessment_Comments_PICAT1);
			clear(By.xpath("(//*[@id='resp_assess_comment'])"));
			sendKeys(By.xpath("(//*[@id='resp_assess_comment'])"), Respiratory_Assessment_Comments_PICAT1);
			break;

		case PixalereStringPool.Cardiovascular_History_Comments_PICAT:
			Cardiovascular_History_Comments_PICAT1 = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Cardiovascular_History_Comments_PICAT + ": "
					+ Cardiovascular_History_Comments_PICAT1);
			clear(By.xpath("(//*[@id='cardiovascular_history_comment'])"));
			sendKeys(By.xpath("(//*[@id='cardiovascular_history_comment'])"), Cardiovascular_History_Comments_PICAT1);
			break;

		case PixalereStringPool.Cardiovascular_Assessment_Comments_PICAT:
			Cardiovascular_Assessment_Comments_PICAT1 = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Cardiovascular_Assessment_Comments_PICAT + ": "
					+ Cardiovascular_Assessment_Comments_PICAT1);
			clear(By.xpath("(//*[@id='cardiovascular_assess_comment'])"));
			sendKeys(By.xpath("(//*[@id='cardiovascular_assess_comment'])"), Cardiovascular_Assessment_Comments_PICAT1);
			break;

		case PixalereStringPool.Gastrointestinal_Assessment_Comments_PICAT:
			Gastrointestinal_Assessment_Comments_PICAT1 = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Gastrointestinal_Assessment_Comments_PICAT + ": "
					+ Gastrointestinal_Assessment_Comments_PICAT1);
			clear(By.xpath("(//*[@id='gastro_assess_comment'])"));
			sendKeys(By.xpath("(//*[@id='gastro_assess_comment'])"), Gastrointestinal_Assessment_Comments_PICAT1);
			break;

		case PixalereStringPool.Skin_History_Comments_PICAT:
			Skin_History_Comments_PICAT1 = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Skin_History_Comments_PICAT + ": " + Skin_History_Comments_PICAT1);
			clear(By.xpath("(//*[@id='skin_history_comment'])"));
			sendKeys(By.xpath("(//*[@id='skin_history_comment'])"), Skin_History_Comments_PICAT1);
			break;

		case PixalereStringPool.Skin_Assessment_Comments_PICAT:
			Skin_Assessment_Comments_PICAT1 = JavaUtils.getRandomString(5);
			System.out.println(
					PixalereStringPool.Skin_Assessment_Comments_PICAT + ": " + Skin_Assessment_Comments_PICAT1);
			clear(By.xpath("(//*[@id='skin_assess_comment'])"));
			sendKeys(By.xpath("(//*[@id='skin_assess_comment'])"), Skin_Assessment_Comments_PICAT1);
			break;

		case PixalereStringPool.Catheter_Size:
			Catheter_Size = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Catheter_Size + ": " + Catheter_Size);
			clear(By.xpath("//*[@name='genito_catheter_size']"));
			sendKeys(By.xpath("//*[@name='genito_catheter_size']"), Catheter_Size);
			break;
		case PixalereStringPool.Care_Instructions:
			Care_Instructions = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Care_Instructions + ": " + Care_Instructions);
			clear(By.xpath("//textarea[@id='care_instructions']"));
			sendKeys(By.xpath("//textarea[@id='care_instructions']"), Care_Instructions);
			break;
		case PixalereStringPool.Genito_Urinary_Assessment_Comments_PICAT:
			Genito_Urinary_Assessment_Comments_PICAT1 = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Genito_Urinary_Assessment_Comments_PICAT + ": "
					+ Genito_Urinary_Assessment_Comments_PICAT1);
			clear(By.xpath("(//*[@id='genito_assess_comment'])"));
			sendKeys(By.xpath("(//*[@id='genito_assess_comment'])"), Genito_Urinary_Assessment_Comments_PICAT1);
			break;
		case PixalereStringPool.Mental_Health_Concerns:
			Mental_Health_Concerns = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Mental_Health_Concerns + ": " + Mental_Health_Concerns);
			clear(By.xpath("//textarea[@id='mental_health_concerns']"));
			sendKeys(By.xpath("//textarea[@id='mental_health_concerns']"), Mental_Health_Concerns);
			break;

		case PixalereStringPool.Neurological_Assessment_Comments_PICAT:
			Neurological_Assessment_Comments_PICAT1 = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Neurological_Assessment_Comments_PICAT + ": "
					+ Neurological_Assessment_Comments_PICAT1);
			clear(By.xpath("(//*[@id='nuerological_assess_comment'])"));
			sendKeys(By.xpath("(//*[@id='nuerological_assess_comment'])"), Neurological_Assessment_Comments_PICAT1);
			break;

		case PixalereStringPool.Neuromuscular_History_Comments_PICAT:
			Neuromuscular_History_Comments_PICAT1 = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Neuromuscular_History_Comments_PICAT + ": "
					+ Neuromuscular_History_Comments_PICAT1);
			clear(By.xpath("(//*[@id='nueromuscular_history_comment'])"));
			sendKeys(By.xpath("(//*[@id='nueromuscular_history_comment'])"), Neuromuscular_History_Comments_PICAT1);
			break;

		case PixalereStringPool.Neuromuscular_Assessment_Comments_PICAT:
			Neuromuscular_Assessment_Comments_PICAT1 = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Neuromuscular_Assessment_Comments_PICAT + ": "
					+ Neuromuscular_Assessment_Comments_PICAT1);
			clear(By.xpath("//textarea[@id='nueromuscular_assess_comment']"));
			sendKeys(By.xpath("//textarea[@id='nueromuscular_assess_comment']"),
					Neuromuscular_Assessment_Comments_PICAT1);
			break;
		case PixalereStringPool.Last_dental_appointment:
			Last_dental_appointment = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Last_dental_appointment + ": " + Last_dental_appointment);
			clear(By.xpath("//textarea[@name='last_dental_appointment']"));
			sendKeys(By.xpath("//textarea[@name='last_dental_appointment']"), Last_dental_appointment);
			break;
		case PixalereStringPool.Oral_hygiene_practices:
			Oral_hygiene_practices = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Oral_hygiene_practices + ": " + Oral_hygiene_practices);
			clear(By.xpath("//textarea[@id='oral_hygeine']"));
			sendKeys(By.xpath("//textarea[@id='oral_hygeine']"), Oral_hygiene_practices);
			break;
		case PixalereStringPool.Head_Eyes_Ears_Nose_Mouth_Throat:
			Head_Eyes_Ears_Nose_Mouth_Throat = JavaUtils.getRandomString(5);
			System.out.println(
					PixalereStringPool.Head_Eyes_Ears_Nose_Mouth_Throat + ": " + Head_Eyes_Ears_Nose_Mouth_Throat);
			clear(By.xpath("//textarea[@id='head_history_comment']"));
			sendKeys(By.xpath("//textarea[@id='head_history_comment']"), Head_Eyes_Ears_Nose_Mouth_Throat);
			break;
		case PixalereStringPool.Child_Behaviour:
			Child_Behaviour = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Child_Behaviour + ": " + Child_Behaviour);
			clear(By.xpath("//textarea[@id='child_behaviour']"));
			sendKeys(By.xpath("//textarea[@id='child_behaviour']"), Child_Behaviour);
			break;
		case PixalereStringPool.Distractibility_Attention_span:
			Distractibility_Attention_span = JavaUtils.getRandomString(5);
			System.out
					.println(PixalereStringPool.Distractibility_Attention_span + ": " + Distractibility_Attention_span);
			clear(By.xpath("//textarea[@id='child_behaviour']"));
			sendKeys(By.xpath("//textarea[@id='child_behaviour']"), Distractibility_Attention_span);
			break;

		case PixalereStringPool.Behavioural_Safety_Comments_PICAT:
			Behavioural_Safety_Comments_PICAT1 = JavaUtils.getRandomString(5);
			System.out.println(
					PixalereStringPool.Behavioural_Safety_Comments_PICAT + ": " + Behavioural_Safety_Comments_PICAT1);
			clear(By.xpath("//textarea[@id='behaviour_comment']"));
			sendKeys(By.xpath("//textarea[@id='behaviour_comment']"), Behavioural_Safety_Comments_PICAT1);
			break;
		case PixalereStringPool.Nutrition_Likes:
			Nutrition_Likes = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Nutrition_Likes + ": " + Nutrition_Likes);
			clear(By.xpath("//textarea[@id='likes']"));
			sendKeys(By.xpath("//textarea[@id='likes']"), Nutrition_Likes);
			break;
		case PixalereStringPool.Nutrition_Dislikes:
			Nutrition_Dislikes = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Nutrition_Dislikes + ": " + Nutrition_Dislikes);
			clear(By.xpath("//textarea[@id='dislikes']"));
			sendKeys(By.xpath("//textarea[@id='dislikes']"), Nutrition_Dislikes);
			break;
		case PixalereStringPool.Nutrition_Sensitivies:
			Nutrition_Sensitivies = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Nutrition_Sensitivies + ": " + Nutrition_Sensitivies);
			clear(By.xpath("//textarea[@id='intolerances']"));
			sendKeys(By.xpath("//textarea[@id='intolerances']"), Nutrition_Sensitivies);
			break;
		case PixalereStringPool.Client_Care_Summary:
			Client_Care_Summary = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Client_Care_Summary + ": " + Client_Care_Summary);
			clear(By.xpath("//textarea[@id='restrictions']"));
			sendKeys(By.xpath("//textarea[@id='restrictions']"), Client_Care_Summary);
			break;
		case PixalereStringPool.Bedtime_routine:
			Bedtime_routine = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Bedtime_routine + ": " + Bedtime_routine);
			clear(By.xpath("//textarea[@id='bedtime_routine']"));
			sendKeys(By.xpath("//textarea[@id='bedtime_routine']"), Bedtime_routine);
			break;
		case PixalereStringPool.medical_devices:
			medical_devices = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.medical_devices + ": " + medical_devices);
			clear(By.xpath("//textarea[@id='sleeping_aid']"));
			sendKeys(By.xpath("//textarea[@id='sleeping_aid']"), medical_devices);
			break;

		case PixalereStringPool.Sleep_Rest_Comments_PICAT:
			Sleep_Rest_Comments_PICAT1 = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Sleep_Rest_Comments_PICAT + ": " + Sleep_Rest_Comments_PICAT1);
			clear(By.xpath("//textarea[@id='rest_comment']"));
			sendKeys(By.xpath("//textarea[@id='rest_comment']"), Sleep_Rest_Comments_PICAT1);
			break;

		case PixalereStringPool.School_participation_PICAT:
			School_participation_PICAT1 = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.School_participation_PICAT + ": " + School_participation_PICAT1);
			clear(By.xpath("//textarea[@id='school_participation']"));
			sendKeys(By.xpath("//textarea[@id='school_participation']"), School_participation_PICAT1);
			break;

		case PixalereStringPool.Social_interactions_PICAT:
			Social_interactions_PICAT1 = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Social_interactions_PICAT + ": " + Social_interactions_PICAT1);
			clear(By.xpath("//textarea[@id='social_interactions']"));
			sendKeys(By.xpath("//textarea[@id='social_interactions']"), Social_interactions_PICAT1);
			break;

		case PixalereStringPool.Routine_activities_exercise_PICAT:
			Routine_activities_exercise_PICAT1 = JavaUtils.getRandomString(5);
			System.out.println(
					PixalereStringPool.Routine_activities_exercise_PICAT + ": " + Routine_activities_exercise_PICAT1);
			clear(By.xpath("//textarea[@id='routine_activities']"));
			sendKeys(By.xpath("//textarea[@id='routine_activities']"), Routine_activities_exercise_PICAT1);
			break;

		case PixalereStringPool.Favourite_toys_security_object_hobbies_PICAT:
			Favourite_toys_security_object_hobbies_PICAT1 = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Favourite_toys_security_object_hobbies_PICAT + ": "
					+ Favourite_toys_security_object_hobbies_PICAT1);
			clear(By.xpath("//textarea[@id='favourite_toys']"));
			sendKeys(By.xpath("//textarea[@id='favourite_toys']"), Favourite_toys_security_object_hobbies_PICAT1);
			break;
//		PICAT END
		case PixalereStringPool.Year_Date_ALLA:
			Year_Date_ALLA1 = "2022";
			System.out.println(PixalereStringPool.Year_Date_ALLA + ": " + Year_Date_ALLA1);
			clear(By.xpath("(//*[@id='ankle_brachial_year'])"));
			sendKeys(By.xpath("(//*[@id='ankle_brachial_year'])"), Year_Date_ALLA1);
			break;

		case PixalereStringPool.Dorsalis_Pedis_mmHg_Right:
			Dorsalis_Pedis_mmHg_Right1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Dorsalis_Pedis_mmHg_Right + ": " + Dorsalis_Pedis_mmHg_Right1);
			clear(By.xpath("(//*[@id='right_dorsalis_pedis_ankle_brachial'])"));
			sendKeys(By.xpath("(//*[@id='right_dorsalis_pedis_ankle_brachial'])"), Dorsalis_Pedis_mmHg_Right1);
			break;
		case PixalereStringPool.Dorsalis_Pedis_mmHg_Left:
			Dorsalis_Pedis_mmHg_Left1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Dorsalis_Pedis_mmHg_Left + ": " + Dorsalis_Pedis_mmHg_Left1);
			clear(By.xpath("(//*[@id='left_dorsalis_pedis_ankle_brachial'])"));
			sendKeys(By.xpath("(//*[@id='left_dorsalis_pedis_ankle_brachial'])"), Dorsalis_Pedis_mmHg_Left1);
			break;

		case PixalereStringPool.Posterior_Tibial_mmHg_Right:
			Posterior_Tibial_mmHg_Right1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Posterior_Tibial_mmHg_Right + ": " + Posterior_Tibial_mmHg_Right1);
			clear(By.xpath("(//*[@id='right_tibial_pedis_ankle_brachial'])"));
			sendKeys(By.xpath("(//*[@id='right_tibial_pedis_ankle_brachial'])"), Posterior_Tibial_mmHg_Right1);
			break;

		case PixalereStringPool.Posterior_Tibial_mmHg_Left:
			Posterior_Tibial_mmHg_Left1 = JavaUtils.getRandomNumber(2);
			System.out.println(PixalereStringPool.Posterior_Tibial_mmHg_Left + ": " + Posterior_Tibial_mmHg_Left1);
			clear(By.xpath("(//*[@id='left_tibial_pedis_ankle_brachial'])"));
			sendKeys(By.xpath("(//*[@id='left_tibial_pedis_ankle_brachial'])"), Posterior_Tibial_mmHg_Left1);
			break;

		case PixalereStringPool.Ankle_Brachial_Pressure_mmHg_Right:
			Ankle_Brachial_Pressure_mmHg_Right1 = JavaUtils.getRandomNumber(2);
			System.out.println(
					PixalereStringPool.Ankle_Brachial_Pressure_mmHg_Right + ": " + Ankle_Brachial_Pressure_mmHg_Right1);
			clear(By.xpath("(//*[@id='right_ankle_brachial'])"));
			sendKeys(By.xpath("(//*[@id='right_ankle_brachial'])"), Ankle_Brachial_Pressure_mmHg_Right1);
			break;

		case PixalereStringPool.Ankle_Brachial_Pressure_mmHg_Left:
			Ankle_Brachial_Pressure_mmHg_Left1 = JavaUtils.getRandomNumber(2);
			System.out.println(
					PixalereStringPool.Ankle_Brachial_Pressure_mmHg_Left + ": " + Ankle_Brachial_Pressure_mmHg_Left1);
			clear(By.xpath("(//*[@id='left_ankle_brachial'])"));
			sendKeys(By.xpath("(//*[@id='left_ankle_brachial'])"), Ankle_Brachial_Pressure_mmHg_Left1);
			break;

		case PixalereStringPool.Toe_Pressure_mmHg_Right:
			Toe_Pressure_mmHg_Right1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Toe_Pressure_mmHg_Right + ": " + Toe_Pressure_mmHg_Right1);
			clear(By.xpath("(//*[@id='right_toe_pressure'])"));
			sendKeys(By.xpath("(//*[@id='right_toe_pressure'])"), Toe_Pressure_mmHg_Right1);
			break;

		case PixalereStringPool.Toe_Pressure_mmHg_Left:
			Toe_Pressure_mmHg_Left1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Toe_Pressure_mmHg_Left + ": " + Toe_Pressure_mmHg_Left1);
			clear(By.xpath("(//*[@id='left_toe_pressure'])"));
			sendKeys(By.xpath("(//*[@id='left_toe_pressure'])"), Toe_Pressure_mmHg_Left1);
			break;

		case PixalereStringPool.Brachial_Pressure_mmHg_Right:
			Brachial_Pressure_mmHg_Right1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Brachial_Pressure_mmHg_Right + ": " + Brachial_Pressure_mmHg_Right1);
			clear(By.xpath("(//*[@id='right_brachial_pressure'])"));
			sendKeys(By.xpath("(//*[@id='right_brachial_pressure'])"), Brachial_Pressure_mmHg_Right1);
			break;

		case PixalereStringPool.Brachial_Pressure_mmHg_Left:
			Brachial_Pressure_mmHg_Left1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Brachial_Pressure_mmHg_Left + ": " + Brachial_Pressure_mmHg_Left1);
			clear(By.xpath("(//*[@id='left_brachial_pressure'])"));
			sendKeys(By.xpath("(//*[@id='left_brachial_pressure'])"), Brachial_Pressure_mmHg_Left1);
			break;
		case PixalereStringPool.Year_Date_TBI:
			Year_Date_TBI1 = "2021";
			System.out.println(PixalereStringPool.Year_Date_TBI + ": " + Year_Date_TBI1);
			clear(By.xpath("(//*[@id='toe_brachial_year'])"));
			sendKeys(By.xpath("(//*[@id='toe_brachial_year'])"), Year_Date_TBI1);
			break;

		case PixalereStringPool.Score_Right:
			Score_Right1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Score_Right + ": " + Score_Right1);
			clear(By.xpath("(//*[@name='right_digit_total'])"));
			sendKeys(By.xpath("(//*[@name='right_digit_total'])"), Score_Right1);
			break;

		case PixalereStringPool.Score_Left:
			Score_Left1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Score_Left + ": " + Score_Left1);
			clear(By.xpath("//*[@name='left_digit_total']"));
			sendKeys(By.xpath("//*[@name='left_digit_total']"), Score_Left1);
			break;

		case PixalereStringPool.Wrist_Measurement_cm_Left:
			Wrist_Measurement_cm_Left1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Wrist_Measurement_cm_Left + ": " + Wrist_Measurement_cm_Left1);
			clear(By.xpath("//*[@name='left_wrist_cm']"));
			sendKeys(By.xpath("//*[@name='left_wrist_cm']"), Wrist_Measurement_cm_Left1);
			break;

		case PixalereStringPool.Forearm_Measurement_cm_Left:
			Forearm_Measurement_cm_Left1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Forearm_Measurement_cm_Left + ": " + Forearm_Measurement_cm_Left1);
			clear(By.xpath("//*[@name='left_elbow_cm']"));
			sendKeys(By.xpath("//*[@name='left_elbow_cm']"), Forearm_Measurement_cm_Left1);
			break;

		case PixalereStringPool.Client_Needs_Goals_One:
			Client_Needs_Goals_One1 = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Client_Needs_Goals_One + ": " + Client_Needs_Goals_One1);
			clear(By.xpath("(//*[@id='client_needs'])"));
			sendKeys(By.xpath("(//*[@id='client_needs'])"), Client_Needs_Goals_One1);
			break;
		case PixalereStringPool.Client_Needs_Goals_Two:
			Client_Needs_Goals_Two1 = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Client_Needs_Goals_Two + ": " + Client_Needs_Goals_Two1);
			clear(By.xpath("(//*[@id='client_needs2'])"));
			sendKeys(By.xpath("(//*[@id='client_needs2'])"), Client_Needs_Goals_Two1);
			break;
		case PixalereStringPool.Client_Needs_Goals_Three:
			Client_Needs_Goals_Three1 = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Client_Needs_Goals_Three + ": " + Client_Needs_Goals_Three1);
			clear(By.xpath("(//*[@id='client_needs3'])"));
			sendKeys(By.xpath("(//*[@id='client_needs3'])"), Client_Needs_Goals_Three1);
			break;
		case PixalereStringPool.Service_Teaching_Plan_One:
			Service_Teaching_Plan_One1 = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Service_Teaching_Plan_One + ": " + Service_Teaching_Plan_One1);
			clear(By.xpath("(//*[@id='service_plan'])"));
			sendKeys(By.xpath("(//*[@id='service_plan'])"), Service_Teaching_Plan_One1);
			break;
		case PixalereStringPool.Service_Teaching_Plan_Two:
			Service_Teaching_Plan_Two1 = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Service_Teaching_Plan_Two + ": " + Service_Teaching_Plan_Two1);
			clear(By.xpath("(//*[@id='service_plan2'])"));
			sendKeys(By.xpath("(//*[@id='service_plan2'])"), Service_Teaching_Plan_Two1);
			break;
		case PixalereStringPool.Service_Teaching_Plan_Three:
			Service_Teaching_Plan_Three1 = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Service_Teaching_Plan_Three + ": " + Service_Teaching_Plan_Three1);
			clear(By.xpath("(//*[@id='service_plan3'])"));
			sendKeys(By.xpath("(//*[@id='service_plan3'])"), Service_Teaching_Plan_Three1);
			break;

		case PixalereStringPool.MAHC_Details_Comments:
			MAHC_Details_Comments1 = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.MAHC_Details_Comments + ": " + MAHC_Details_Comments1);
			clear(By.xpath("(//*[@id='age_comments'])"));
			sendKeys(By.xpath("(//*[@id='age_comments'])"), MAHC_Details_Comments1);
			break;
		case PixalereStringPool.Activity_to_be_Instructed:
			Activity_to_be_Instructed1 = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Activity_to_be_Instructed + ": " + Activity_to_be_Instructed1);
			clear(By.xpath("(//*[@id='activity_comments'])"));
			sendKeys(By.xpath("(//*[@id='activity_comments'])"), Activity_to_be_Instructed1);
			break;
		case PixalereStringPool.LearnerName:
			LearnerName1 = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.LearnerName + ": " + LearnerName1);
			clear(By.xpath("(//*[@id='learner_name1'])"));
			sendKeys(By.xpath("(//*[@id='learner_name1'])"), LearnerName1);
			break;
		case PixalereStringPool.LearnerDate:
			LearnerDate1 = "08/03/2022";
			System.out.println(PixalereStringPool.LearnerDate + ": " + LearnerDate1);
			clear(By.xpath("(//*[@id='learner_date1'])"));
			sendKeys(By.xpath("(//*[@id='learner_date1'])"), LearnerDate1);
			break;
		case PixalereStringPool.EducationComment:
			EducationComment1 = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.EducationComment + ": " + EducationComment1);
			clear(By.xpath("(//*[@id='education_comments'])"));
			sendKeys(By.xpath("(//*[@id='education_comments'])"), EducationComment1);
			break;

		case PixalereStringPool.Reason_of_Delete_in_Viewer:
			varDelete_inViewer = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Reason_of_Delete_in_Viewer + ": " + varDelete_inViewer);
			clear(GlobalPageLocators.txt_reason_delete);
			sendKeys(GlobalPageLocators.txt_reason_delete, varDelete_inViewer);
			break;
		case PixalereStringPool.Other_Service_Consent_Obtained:
			Other_Service_Consent_Obtained1 = JavaUtils.getRandomString(5);
			System.out.println(
					PixalereStringPool.Other_Service_Consent_Obtained + ": " + Other_Service_Consent_Obtained1);
			clear(By.xpath("//*[@id='other19037_2']"));
			sendKeys(By.xpath("//*[@id='other19037_2']"), Other_Service_Consent_Obtained1);
			break;
		case PixalereStringPool.Comments_Service_Consent_Obtained:
			Comments_Service_Consent_Obtained1 = JavaUtils.getRandomString(5);
			System.out.println(
					PixalereStringPool.Comments_Service_Consent_Obtained + ": " + Comments_Service_Consent_Obtained1);
			clear(By.xpath("//*[@id='services_consent_comments2']"));
			sendKeys(By.xpath("//*[@id='services_consent_comments2']"), Comments_Service_Consent_Obtained1);
			break;
		case PixalereStringPool.Alternate_Contact_Name:
			Alternate_Contact_Name1 = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Alternate_Contact_Name + ": " + Alternate_Contact_Name1);
			clear(By.xpath("//*[@id='virtual_alternate_cntc']"));
			sendKeys(By.xpath("//*[@id='virtual_alternate_cntc']"), Alternate_Contact_Name1);
			break;
		case PixalereStringPool.Backup_Plan:
			Backup_Plan1 = JavaUtils.getRandomString(50);
			System.out.println(PixalereStringPool.Backup_Plan + ": " + Backup_Plan1);
			clear(By.xpath("//*[@id='virtual_backup']"));
			sendKeys(By.xpath("//*[@id='virtual_backup']"), Backup_Plan1);
			break;
		case PixalereStringPool.Comments_in_Virtual_Care_Consent:
			Comments_in_Virtual_Care_Consent1 = JavaUtils.getRandomString(250);
			System.out.println(
					PixalereStringPool.Comments_in_Virtual_Care_Consent + ": " + Comments_in_Virtual_Care_Consent1);
			clear(By.xpath("//*[@id='virtual_service_text']"));
			sendKeys(By.xpath("//*[@id='virtual_service_text']"), Comments_in_Virtual_Care_Consent1);
			break;
		case PixalereStringPool.Email:
			Email1 = "QA@gmail.com";
			System.out.println(PixalereStringPool.Email + ": " + Email1);
			clear(By.xpath("//*[@name='add_email_address']"));
			sendKeys(By.xpath("//*[@name='add_email_address']"), Email1);
			break;
		case PixalereStringPool.Date_Guidelines:
			Date_Guidelines1 = "08/06/2022";
			System.out.println(PixalereStringPool.Date_Guidelines + ": " + Date_Guidelines1);
			Wait_p(2);
			clear(By.xpath("//*[@name='visit_date']"));
			sendKeys(By.xpath("//*[@name='visit_date']"), Date_Guidelines1);
			break;
		case PixalereStringPool.Date_Guidelines_Alternate:
			Date_Guidelines_Alternate1 = "06/08/2022";
			System.out.println(PixalereStringPool.Date_Guidelines_Alternate + ": " + Date_Guidelines_Alternate1);
			clear(By.xpath("//*[@id='effective_date']"));
			sendKeys(By.xpath("//*[@id='effective_date']"), Date_Guidelines_Alternate1);
			break;

		case PixalereStringPool.Lock_Box_Required:
			Lock_Box_Required1 = JavaUtils.getRandomString(25);
			System.out.println(PixalereStringPool.Lock_Box_Required + ": " + Lock_Box_Required1);
			clear(By.xpath("//*[@id='lock_box_other']"));
			sendKeys(By.xpath("//*[@id='lock_box_other']"), Lock_Box_Required1);
			break;

		case PixalereStringPool.pt_teaching_agreement_comment:
			pt_teaching_agreement_comment1 = JavaUtils.getRandomString(10);
			System.out
					.println(PixalereStringPool.pt_teaching_agreement_comment + ": " + pt_teaching_agreement_comment1);
			clear(By.xpath("//*[@id='education_comments']"));
			sendKeys(By.xpath("//*[@id='education_comments']"), pt_teaching_agreement_comment1);
			break;

		case PixalereStringPool.pt1_ta_comment_activity_to_be_instructed:
			pt_teaching_agreement_comment0 = JavaUtils.getRandomString(10);
			System.out.println(PixalereStringPool.pt1_ta_comment_activity_to_be_instructed + ": "
					+ pt_teaching_agreement_comment0);
			clear(By.xpath("//*[@id='activity_comments']"));
			sendKeys(By.xpath("//*[@id='activity_comments']"), pt_teaching_agreement_comment0);
			break;

		case PixalereStringPool.Date_of_Visit_Tinneti:
			Date_of_Visit_Tinneti1 = "08/06/2022";
			System.out.println(PixalereStringPool.Date_of_Visit_Tinneti + ": " + Date_of_Visit_Tinneti1);
			Wait_p(2);
			clear(By.xpath("//*[@name='visit_date']"));
			sendKeys(By.xpath("//*[@name='visit_date']"), Date_of_Visit_Tinneti1);
			break;

		case PixalereStringPool.Comments_Tinneti:
			Comments_Tinneti1 = JavaUtils.getRandomString(10);
			System.out.println(PixalereStringPool.Comments_Tinneti + ": " + Comments_Tinneti1);
			clear(By.xpath("//*[@name='otherComments']"));
			sendKeys(By.xpath("//*[@name='otherComments']"), Comments_Tinneti1);
			break;

		case PixalereStringPool.cam_tool_comment:
			cam_tool_comment1 = JavaUtils.getRandomString(10);
			System.out.println(PixalereStringPool.cam_tool_comment + ": " + cam_tool_comment1);
			clear(By.xpath("//*[@id='cam_tool_comment']"));
			sendKeys(By.xpath("//*[@id='cam_tool_comment']"), cam_tool_comment1);

		case PixalereStringPool.Suctioning_comment:
			Suctioning_comment1 = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Suctioning_comment + ": " + Suctioning_comment1);
			clear(By.xpath("//*[@id='suction_comment']"));
			sendKeys(By.xpath("//*[@id='suction_comment']"), Suctioning_comment1);
			break;
		case PixalereStringPool.Suctioning_Year:
			Suctioning_Year1 = "2019";
			System.out.println(PixalereStringPool.Suctioning_Year + ": " + Suctioning_Year1);
			clear(By.xpath("//div[@class='col-lg-3 col-md-5 col-sm-6 col-12']//input[@id='backdated_year']"));
			sendKeys(By.xpath("//div[@class='col-lg-3 col-md-5 col-sm-6 col-12']//input[@id='backdated_year']"),
					Suctioning_Year1);
			break;
		case PixalereStringPool.invasive_ventilation_Year:
			invasive_ventilation_Year1 = "2018";
			System.out.println(PixalereStringPool.invasive_ventilation_Year + ": " + invasive_ventilation_Year1);
			clear(By.xpath("//form[@id='form_vent']//input[@id='backdated_year']"));
			sendKeys(By.xpath("//form[@id='form_vent']//input[@id='backdated_year']"), invasive_ventilation_Year1);
			break;
		case PixalereStringPool.Cough_Assist_Year:
			Cough_Assist_Year1 = "2017";
			System.out.println(PixalereStringPool.Cough_Assist_Year + ": " + Cough_Assist_Year1);
			clear(By.xpath("//form[@id='form_cough']//input[@id='backdated_year']"));
			sendKeys(By.xpath("//form[@id='form_cough']//input[@id='backdated_year']"), Cough_Assist_Year1);
			break;
		case PixalereStringPool.Minute_Ventilation:
			Minute_Ventilation1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Minute_Ventilation + ": " + Minute_Ventilation1);
			clear(TracheostomyLocators.txt_ventiltion);
			sendKeys(TracheostomyLocators.txt_ventiltion, Minute_Ventilation1);
			break;

		case PixalereStringPool.PRESSURE_Tracheostomy:
			PRESSURE_Tracheostomy1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.PRESSURE_Tracheostomy + ": " + PRESSURE_Tracheostomy1);
			clear(TracheostomyLocators.txt_pressure);
			sendKeys(TracheostomyLocators.txt_pressure, PRESSURE_Tracheostomy1);
			break;

		case PixalereStringPool.Volume_Tidal_Exhaled:
			Volume_Tidal_Exhaled1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Volume_Tidal_Exhaled + ": " + Volume_Tidal_Exhaled1);
			clear(TracheostomyLocators.txt_tidal_exhaled);
			sendKeys(TracheostomyLocators.txt_tidal_exhaled, Volume_Tidal_Exhaled1);
			break;

		case PixalereStringPool.Equipment_Source:
			Equipment_Source = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Equipment_Source + ": " + Equipment_Source);
			clear(By.xpath("//*[@id='equipment_source']"));
			sendKeys(By.xpath("//*[@id='equipment_source']"), Equipment_Source);
			break;

		case PixalereStringPool.Case_Coordinator:
			Case_Coordinator = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Case_Coordinator + ": " + Case_Coordinator);
			clear(By.xpath("//*[@id='case_coordinator']"));
			sendKeys(By.xpath("//*[@id='case_coordinator']"), Case_Coordinator);
			break;

		case PixalereStringPool.Primary_nurse_contact_info:
			Primary_nurse_contact_info = "Elim2@vha.ca";
			System.out.println(PixalereStringPool.Primary_nurse_contact_info + ": " + Primary_nurse_contact_info);
			clear(By.xpath("//*[@id='primary_nurse']"));
			sendKeys(By.xpath("//*[@id='primary_nurse']"), Primary_nurse_contact_info);
			break;

		case PixalereStringPool.Weight_10:
			Weight_10 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Weight_10 + ": " + Weight_10);

			clear(By.xpath("//textarea[@id='weight_gain']"));
			sendKeys(By.xpath("//textarea[@id='weight_gain']"), Weight_10);
			break;

//			PT Assessment
		case PixalereStringPool.Visit_Date:
			Visit_Date = "15/05/2022";
			System.out.println(PixalereStringPool.Visit_Date + ": " + Visit_Date);
			clear(By.xpath("//input[@id='visit_date_init_12']"));
			sendKeys(By.xpath("//input[@id='visit_date_init_12']"), Visit_Date);
			break;
		case PixalereStringPool.Assessment_Initiated_Comments:
			Assessment_Initiated_Comments = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Assessment_Initiated_Comments + ": " + Assessment_Initiated_Comments);
			clear(By.xpath("//textarea[@id='scope_practice_text']"));
			sendKeys(By.xpath("//textarea[@id='scope_practice_text']"), Assessment_Initiated_Comments);
			break;
		case PixalereStringPool.Diagnosis_History_of_Presenting_Concern:
			Diagnosis_History_of_Presenting_Concern = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Diagnosis_History_of_Presenting_Concern + ": "
					+ Diagnosis_History_of_Presenting_Concern);
			clear(By.xpath("//textarea[@id='diagnosis_history']"));
			sendKeys(By.xpath("//textarea[@id='diagnosis_history']"), Diagnosis_History_of_Presenting_Concern);
			break;
		case PixalereStringPool.Client_SDM_Stated_Goal:
			Client_SDM_Stated_Goal = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Client_SDM_Stated_Goal + ": " + Client_SDM_Stated_Goal);
			clear(By.xpath("//textarea[@id='sdm_stated_goal']"));
			sendKeys(By.xpath("//textarea[@id='sdm_stated_goal']"), Client_SDM_Stated_Goal);
			break;
		case PixalereStringPool.Past_Medical_History:
			Past_Medical_History = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Past_Medical_History + ": " + Past_Medical_History);
			clear(By.xpath("//textarea[@id='past_medical_history']"));
			sendKeys(By.xpath("//textarea[@id='past_medical_history']"), Past_Medical_History);
			break;
		case PixalereStringPool.Investigations_followup_clinically_relevant:
			Investigations_followup_clinically_relevant = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Investigations_followup_clinically_relevant + ": "
					+ Investigations_followup_clinically_relevant);
			clear(By.xpath("//input[@id='investigation_text1']"));
			sendKeys(By.xpath("//input[@id='investigation_text1']"), Investigations_followup_clinically_relevant);
			break;
		case PixalereStringPool.Investigations_Date:
			Investigations_Date = "15/05/2021";
			System.out.println(PixalereStringPool.Investigations_Date + ": " + Investigations_Date);
			clear(By.xpath("//input[@id='followup_date1']"));
			sendKeys(By.xpath("//input[@id='followup_date1']"), Investigations_Date);
			break;
		case PixalereStringPool.Difficulties_report:
			Difficulties_report = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Difficulties_report + ": " + Difficulties_report);
			clear(By.xpath("//input[@id='home_adl_text']"));
			sendKeys(By.xpath("//input[@id='home_adl_text']"), Difficulties_report);
			break;
		case PixalereStringPool.PT_scope_of_practice:
			PT_scope_of_practice = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.PT_scope_of_practice + ": " + PT_scope_of_practice);
			clear(By.xpath("//textarea[@id='med_list_meds']"));
			sendKeys(By.xpath("//textarea[@id='med_list_meds']"), PT_scope_of_practice);
			break;
		case PixalereStringPool.Posture_Assessed_comment:
			Posture_Assessed_comment = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Posture_Assessed_comment + ": " + Posture_Assessed_comment);
			clear(By.xpath("//textarea[@id='posture_additional_comments']"));
			sendKeys(By.xpath("//textarea[@id='posture_additional_comments']"), Posture_Assessed_comment);
			break;
		case PixalereStringPool.Edema_Location:
			Edema_Location = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Edema_Location + ": " + Edema_Location);
			clear(By.xpath("//input[@id='edema_location']"));
			sendKeys(By.xpath("//input[@id='edema_location']"), Edema_Location);
			break;
		case PixalereStringPool.Pain_Date:
			Pain_Date = "15/05/2021";
			System.out.println(PixalereStringPool.Pain_Date + ": " + Pain_Date);
			clear(By.xpath("//input[@id='visit_date']"));
			sendKeys(By.xpath("//input[@id='visit_date']"), Pain_Date);
			break;
		case PixalereStringPool.Palliating_Factors_List:
			Palliating_Factors_List = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Palliating_Factors_List + ": " + Palliating_Factors_List);
			clear(By.xpath("//textarea[@id='palliative_other_p11']"));
			sendKeys(By.xpath("//textarea[@id='palliative_other_p11']"), Palliating_Factors_List);
			break;
		case PixalereStringPool.Aggravating_Factors_List:
			Aggravating_Factors_List = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Aggravating_Factors_List + ": " + Aggravating_Factors_List);
			clear(By.xpath("//textarea[@id='aggravating_other_p11']"));
			sendKeys(By.xpath("//textarea[@id='aggravating_other_p11']"), Aggravating_Factors_List);
			break;
		case PixalereStringPool.Date_of_MSK_Assessment:
			Date_of_MSK_Assessment = "08/15/2022";
			System.out.println(PixalereStringPool.Date_of_MSK_Assessment + ": " + Date_of_MSK_Assessment);
			clear(By.xpath("//input[@id='visit_date']"));
			sendKeys(By.xpath("//input[@id='visit_date']"), Date_of_MSK_Assessment);
			break;
		case PixalereStringPool.Musculoskeletal_Status_comments:
			Musculoskeletal_Status_comments = JavaUtils.getRandomString(5);
			System.out.println(
					PixalereStringPool.Musculoskeletal_Status_comments + ": " + Musculoskeletal_Status_comments);
			clear(By.xpath("//textarea[@id='msk_additional_comments1']"));
			sendKeys(By.xpath("//textarea[@id='msk_additional_comments1']"), Musculoskeletal_Status_comments);
			break;
		case PixalereStringPool.Respiratory_comments:
			Respiratory_comments = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Respiratory_comments + ": " + Respiratory_comments);
			clear(By.xpath("//textarea[@id='resp_additional']"));
			sendKeys(By.xpath("//textarea[@id='resp_additional']"), Respiratory_comments);
			break;
		case PixalereStringPool.Neurological_comments:
			Neurological_comments = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Neurological_comments + ": " + Neurological_comments);
			clear(By.xpath("//textarea[@id='neuro_additional_comments']"));
			sendKeys(By.xpath("//textarea[@id='neuro_additional_comments']"), Neurological_comments);
			break;
		case PixalereStringPool.Cognition_comments:
			Cognition_comments = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Cognition_comments + ": " + Cognition_comments);
			clear(By.xpath("//textarea[@id='cog_function_additional']"));
			sendKeys(By.xpath("//textarea[@id='cog_function_additional']"), Cognition_comments);
			break;

		case PixalereStringPool.Year_Calender_Pain_Assessment:
			Year_Calender_Pain_Assessment = "2022";
			System.out.println(PixalereStringPool.Year_Calender_Pain_Assessment + ": " + Year_Calender_Pain_Assessment);
			clear(By.xpath("//*[@id='onset_date_year']"));
			sendKeys(By.xpath("//*[@id='onset_date_year']"), Year_Calender_Pain_Assessment);
			break;

		case PixalereStringPool.date_of_Last_BM:
			date_of_Last_BM = "2022";
			System.out.println(PixalereStringPool.date_of_Last_BM + ": " + date_of_Last_BM);
			clear(By.xpath("//*[@id='date_last_bm_year']"));
			sendKeys(By.xpath("//*[@id='date_last_bm_year']"), date_of_Last_BM);
			break;

		case PixalereStringPool.Intensity_Pain_Assessment:
			Intensity_Pain_Assessment = "5";
			System.out.println(PixalereStringPool.Intensity_Pain_Assessment + ": " + Intensity_Pain_Assessment);
			clear(By.xpath("//*[@name='intensity']"));
			sendKeys(By.xpath("//*[@name='intensity']"), Intensity_Pain_Assessment);
			break;
		case PixalereStringPool.Bed_Mobility_comment:
			Bed_Mobility_comment = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Bed_Mobility_comment + ": " + Bed_Mobility_comment);
			clear(By.xpath("//textarea[@id='bed_additional_comments']"));
			sendKeys(By.xpath("//textarea[@id='bed_additional_comments']"), Bed_Mobility_comment);
			break;
		case PixalereStringPool.Chair_Repositioning_comment:
			Chair_Repositioning_comment = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Chair_Repositioning_comment + ": " + Chair_Repositioning_comment);
			clear(By.xpath("//textarea[@id='chair_additional_comments']"));
			sendKeys(By.xpath("//textarea[@id='chair_additional_comments']"), Chair_Repositioning_comment);
			break;
		case PixalereStringPool.Transfers_comment:
			Transfers_comment = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Transfers_comment + ": " + Transfers_comment);
			clear(By.xpath("//textarea[@id='transfer_additional_comments']"));
			sendKeys(By.xpath("//textarea[@id='transfer_additional_comments']"), Transfers_comment);
			break;
		case PixalereStringPool.Weight_Bearing_Status_comment:
			Weight_Bearing_Status_comment = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Weight_Bearing_Status_comment + ": " + Weight_Bearing_Status_comment);
			clear(By.xpath("//textarea[@id='weight_bear_additional_comments']"));
			sendKeys(By.xpath("//textarea[@id='weight_bear_additional_comments']"), Weight_Bearing_Status_comment);
			break;
		case PixalereStringPool.Ambulation_comment:
			Ambulation_comment = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Ambulation_comment + ": " + Ambulation_comment);
			clear(By.xpath("//textarea[@id='ambulation_additional_comments']"));
			sendKeys(By.xpath("//textarea[@id='ambulation_additional_comments']"), Ambulation_comment);
			break;
		case PixalereStringPool.TUG_Time:
			TUG_Time = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.TUG_Time + ": " + TUG_Time);
			clear(By.xpath("//input[@id='tug_score']"));
			sendKeys(By.xpath("//input[@id='tug_score']"), TUG_Time);
			break;
		case PixalereStringPool.Aid_used:
			Aid_used = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Aid_used + ": " + Aid_used);
			clear(By.xpath("//textarea[@id='aid_used']"));
			sendKeys(By.xpath("//textarea[@id='aid_used']"), Aid_used);
			break;

		case PixalereStringPool.second_sit_stand_Test:
			second_sit_stand_Test = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.second_sit_stand_Test + ": " + second_sit_stand_Test);
			clear(By.xpath("//input[@id='other21376']"));
			sendKeys(By.xpath("//input[@id='other21376']"), second_sit_stand_Test);
			break;
		case PixalereStringPool.Balance_Assessed_comments:
			Balance_Assessed_comments = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.second_sit_stand_Test + ": " + Balance_Assessed_comments);
			clear(By.xpath("//textarea[@id='balance_additional_comments2']"));
			sendKeys(By.xpath("//textarea[@id='balance_additional_comments2']"), Balance_Assessed_comments);
			break;

		/// home nursing

		case PixalereStringPool.HomeCommentsNursing:
			HomeCommentsNursing1 = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.HomeCommentsNursing + ": " + HomeCommentsNursing1);
			clear(By.xpath("//*[@name='ped_comment']"));
			sendKeys(By.xpath("//*[@name='ped_comment']"), HomeCommentsNursing1);
			break;

		case PixalereStringPool.Other_Education_Client_CareGiver:
			Other_Education_Client_CareGiver1 = JavaUtils.getRandomString(5);
			System.out.println(
					PixalereStringPool.Other_Education_Client_CareGiver + ": " + Other_Education_Client_CareGiver1);
			clear(By.xpath("//*[@id='other_name']"));
			sendKeys(By.xpath("//*[@id='other_name']"), Other_Education_Client_CareGiver1);
			break;

		case PixalereStringPool.Document_Name_for_Document_Upload:
			Document_Name_for_Document_Upload1 = JavaUtils.getRandomString(5);
			System.out.println(
					PixalereStringPool.Document_Name_for_Document_Upload + ": " + Document_Name_for_Document_Upload1);
			clear(By.xpath("//*[@id='name']"));
			sendKeys(By.xpath("//*[@id='name']"), Document_Name_for_Document_Upload1);
			break;

		case PixalereStringPool.Analysis_Comments:
			Analysis_Comments = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Analysis_Comments + ": " + Analysis_Comments);
			clear(By.xpath("//textarea[@id='analysis_comment']"));
			sendKeys(By.xpath("//textarea[@id='analysis_comment']"), Analysis_Comments);
			break;
		case PixalereStringPool.Previous_Funding_Comments:
			Previous_Funding_Comments = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Previous_Funding_Comments + ": " + Previous_Funding_Comments);
			clear(By.xpath("//textarea[@id='prior_funding_section_comments']"));
			sendKeys(By.xpath("//textarea[@id='prior_funding_section_comments']"), Previous_Funding_Comments);
			break;
		case PixalereStringPool.client_Weight:
			client_Weight = JavaUtils.getRandomNumber(2);
			System.out.println(PixalereStringPool.client_Weight + ": " + client_Weight);
			clear(By.xpath("//input[@name='weight']"));
			sendKeys(By.xpath("//input[@name='weight']"), client_Weight);
			break;
		case PixalereStringPool.Hip_width:
			Hip_width = JavaUtils.getRandomNumber(3);
			System.out.println(PixalereStringPool.Hip_width + ": " + Hip_width);
			clear(By.xpath("//input[@name='hip']"));
			sendKeys(By.xpath("//input[@name='hip']"), Hip_width);
			break;
		case PixalereStringPool.Popliteal_fossa_heal:
			Popliteal_fossa_heal = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Popliteal_fossa_heal + ": " + Popliteal_fossa_heal);
			clear(By.xpath("//input[@name='popliteal']"));
			sendKeys(By.xpath("//input[@name='popliteal']"), Popliteal_fossa_heal);
			break;
		case PixalereStringPool.Rationale:
			Rationale = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Rationale + ": " + Rationale);
			clear(By.xpath("//textarea[@id='walker_rationale_for_type']"));
			sendKeys(By.xpath("//textarea[@id='walker_rationale_for_type']"), Rationale);
			break;
		case PixalereStringPool.Handle_height:
			Handle_height = JavaUtils.getRandomNumber(2);
			System.out.println(PixalereStringPool.Handle_height + ": " + Handle_height);
			clear(By.xpath("//input[@id='walker_handle_height']"));
			sendKeys(By.xpath("//input[@id='walker_handle_height']"), Handle_height);
			break;
			
		case PixalereStringPool.Specify_Proposed_Health_Services:
			Specify_Proposed_Health_Services = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Specify_Proposed_Health_Services + ": " + Specify_Proposed_Health_Services);
			clear(By.xpath("//input[contains(@class,'proposed_health_services')]"));
			sendKeys(By.xpath("//input[contains(@class,'proposed_health_services')]"), Specify_Proposed_Health_Services);
			break;
			
		case PixalereStringPool.Service_Consent_Obtained_comments:
			Service_Consent_Obtained_comments = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Service_Consent_Obtained_comments + ": " + Service_Consent_Obtained_comments);
			clear(By.xpath("(//*[contains(@id,'services_consent_comments')])"));
			sendKeys(By.xpath("(//*[contains(@id,'services_consent_comments')])"), Service_Consent_Obtained_comments);
			break;
			
		case PixalereStringPool.Other_comment_Family_friends_caregivers:
			Wait_p(2);
			Other_comment_Family_friends_caregivers = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Other_comment_Family_friends_caregivers + ": " + Other_comment_Family_friends_caregivers);
			clear(By.xpath(("(//*[normalize-space(text())='Family/friends/caregivers:']//following::input)[2]")));
			sendKeys(By.xpath("(//*[normalize-space(text())='Family/friends/caregivers:']//following::input)[2]"), Other_comment_Family_friends_caregivers);
			break;
			
		case PixalereStringPool.Other_comment_Medical_Contacts:
			Other_comment_Medical_Contacts = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Other_comment_Medical_Contacts + ": " + Other_comment_Medical_Contacts);
			clear(By.xpath("(//*[normalize-space(text())='Medical Contacts:']//following::div[1]//input)[2]"));
			sendKeys(By.xpath("(//*[normalize-space(text())='Medical Contacts:']//following::div[1]//input)[2]"), Other_comment_Family_friends_caregivers);
			break;
			
		case PixalereStringPool.Consent_vendors:
			Consent_vendors = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Consent_vendors + ": " + Consent_vendors);
			clear(By.xpath("(//*[@id='vendors'])"));
			sendKeys(By.xpath("(//*[@id='vendors'])"), Consent_vendors);
			break;
			
		case PixalereStringPool.Other_comment_Consent_Obtained:
			Other_comment_Consent_Obtained = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Other_comment_Consent_Obtained + ": " + Other_comment_Consent_Obtained);
			clear(By.xpath("(//*[@id='other_text'])"));
			sendKeys(By.xpath("(//*[@id='other_text'])"), Other_comment_Consent_Obtained);
			break;
			
		case PixalereStringPool.Alternate_Contact_Name_Phone_Number:
			Alternate_Contact_Name_Phone_Number = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Alternate_Contact_Name_Phone_Number + ": " + Alternate_Contact_Name_Phone_Number);
			clear(By.xpath("(//*[@id='virtual_alternate_cntc'])"));
			sendKeys(By.xpath("(//*[@id='virtual_alternate_cntc'])"), Alternate_Contact_Name_Phone_Number);
			break;
			
		case PixalereStringPool.Back_up_plan:
			Back_up_plan = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Back_up_plan + ": " + Back_up_plan);
			clear(By.xpath("(//*[@id='virtual_backup'])"));
			sendKeys(By.xpath("(//*[@id='virtual_backup'])"), Back_up_plan);
			break;
			
		case PixalereStringPool.Back_up_plan_comments:
			Back_up_plan_comments = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Back_up_plan_comments + ": " + Back_up_plan_comments);
			clear(By.xpath("(//*[@id='virtual_service_text'])"));
			sendKeys(By.xpath("(//*[@id='virtual_service_text'])"), Back_up_plan_comments);
			break;
			
		case PixalereStringPool.SDM_Name_consent:
			SDM_Name_consent = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.SDM_Name_consent + ": " + SDM_Name_consent);
			clear(By.xpath("(//*[@id='sdm_name'])"));
			sendKeys(By.xpath("(//*[@id='sdm_name'])"), SDM_Name_consent);
			break;
			
		case PixalereStringPool.Other_relationship_comment:
			Other_relationship_comment = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Other_relationship_comment + ": " + Other_relationship_comment);
			clear(By.xpath("(//*[contains(@id,'relationship_other')])"));
			sendKeys(By.xpath("(//*[contains(@id,'relationship_other')])"), Other_relationship_comment);
			break;
			
		case PixalereStringPool.Date_client_consent:
			Date_client_consent = "05/05/2022";
			System.out.println(PixalereStringPool.Date_client_consent + ": " + Date_client_consent);
			clear(By.xpath("(//*[@id='visit_date_16'])"));
			sendKeys(By.xpath("(//*[@id='visit_date_16'])"), Date_client_consent);
			break;
			
		case PixalereStringPool.Lock_Box_Required_comment:
			Lock_Box_Required_comment = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Lock_Box_Required_comment + ": " + Lock_Box_Required_comment);
			clear(By.xpath("(//*[@id='lock_box_other'])"));
			sendKeys(By.xpath("(//*[@id='lock_box_other'])"), Lock_Box_Required_comment);
			break;
			
		case PixalereStringPool.Effective_Date_client_consent:
			Effective_Date_client_consent = "05/05/2022";
			System.out.println(PixalereStringPool.Lock_Box_Required_comment + ": " + Effective_Date_client_consent);
			clear(By.xpath("(//*[@id='effective_date'])"));
			sendKeys(By.xpath("(//*[@id='effective_date'])"), Effective_Date_client_consent);
			break;
			
		case PixalereStringPool.Additional_Comments_Prevention_Best_Practices:
			Additional_Comments_Prevention_Best_Practices = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Additional_Comments_Prevention_Best_Practices + ": " + Additional_Comments_Prevention_Best_Practices);
			clear(By.xpath("(//*[@id='comments'])"));
			sendKeys(By.xpath("(//*[@id='comments'])"), Additional_Comments_Prevention_Best_Practices);
			break;
			
		case PixalereStringPool.Show_Prevention_2022:
			Show_Prevention_2022 = "2022";
			System.out.println(PixalereStringPool.Show_Prevention_2022 + ": " + Show_Prevention_2022);
			clear(By.xpath("(//*[@id='reassessment_date_year'])"));
			sendKeys(By.xpath("(//*[@id='reassessment_date_year'])"), Show_Prevention_2022);
			break;
			
			
	
		}
	}
}
