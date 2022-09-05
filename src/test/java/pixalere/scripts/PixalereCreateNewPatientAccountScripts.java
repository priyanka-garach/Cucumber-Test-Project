package pixalere.scripts;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import dataProviders.ConfigFileReader;
import pixalere.pageObjectJavaUtils.JavaUtils;
import pixalere.pageObjectUtils.LocatorUtils.AdvLimbLocator;
import pixalere.pageObjectUtils.LocatorUtils.AssessmentPageLocators;
import pixalere.pageObjectUtils.LocatorUtils.BasicLowerLimbLocator;
import pixalere.pageObjectUtils.LocatorUtils.CustomizedLocators;
import pixalere.pageObjectUtils.LocatorUtils.EmergencyPlanningLocators;
import pixalere.pageObjectUtils.LocatorUtils.GlobalPageLocators;
import pixalere.pageObjectUtils.LocatorUtils.HomePeritonealLocators;
import pixalere.pageObjectUtils.LocatorUtils.PCAPainPumpLocators;
import pixalere.pageObjectUtils.LocatorUtils.PTLocators;
import pixalere.pageObjectUtils.LocatorUtils.PatientAccountsPageLocators;
import pixalere.pageObjectUtils.LocatorUtils.PatientProfilePageLocators;
import pixalere.pageObjectUtils.LocatorUtils.PatientVitalSignsLocators;
import pixalere.pageObjectUtils.LocatorUtils.TracheostomyLocators;
import pixalere.pageObjectUtils.LocatorUtils.UpperLimbLocator;
import pixalere.pageObjectUtils.PixalereCommonUtils;
import pixalere.pageObjectUtils.PixalereStringPool;

public class PixalereCreateNewPatientAccountScripts extends PixalereCommonUtils {

	private static String allergies;
	private String lastName;

	private String firstName;
	private String dateOfBirth;
	private String treatmentLocation;
	private boolean isInsuranceBlockDisplayed = false;
	private boolean isWait = false;

	private String parentHandle;

	private String pastMedicalHistory;
	private String pastMedicalHistoryOther;
	private String currentMedications;
	public static String visitTime;

	private String diagnosticTestsValue;
	private String albuminValue;
	private String prealbuminValue;
	private String bloodGlucoseValue;
	private String bloodGlucoseTimeValue;
	private String pursScoreValue;

	public static String TempVitalSigns;
	public static String BpVitalSigns;
	public static String HeartRateVitalSigns;
	public static String RespiRateVitalSigns;
	public static String O2SatVitalSigns;
	public static String HeightVitalSigns;
	public static String WeightVitalSigns;
	public static String HeadcircumVitalSigns;
	public static String AbdimnlGirthVitalSigns;

	// PCA Pain Pump
	public static String SolNamePCAPainPump;
	public static String ResVolBagPCAPainPump;
	public static String DoseConcenPCAPainPump;
	public static String DoseHourPCAPainPump;
	public static String BolusDosePCAPainPump;
	public static String BolusDoseAllowedHourPCAPainPump;
	public static String AttemptsPCAPainPump;
	public static String GivenPCAPainPump;
	public static String var_DoseConcentration;
	public static String var_BolusConcentration;

	// HomePeritoneal
	public static String HomePeritoneal_TargetWeight;
	public static String HomePeritoneal_TargerBloodPressure;
	public static String HomePeritoneal_OtherRadio;
	public static String HomePeritoneal_OtherHomeP;
	public static String HomePeritoneal_DrainageAmt;
	public static String HomePeritoneal_Solution1;
	public static String HomePeritoneal_Insulin;
	public static String HomePeritoneal_Location;
	public static String HomePeritoneal_Measurement;
	public static String HomePeritoneal_DwellTime;

	public static String E_support;
	public static String E_contact;
	public static String Alternate_e_contact;
	public static String E_relationship;
	public static String Alternate_e_relationship;
	public static String E_phone;
	public static String Alternate_e_phone;
	public static String E_preparedness;
	public static String Emergency_comments;

	public static String Basic_LL_sleep_position;
	public static String Basic_LL_right_ankle_cm;
	public static String Basic_LL_right_ankle_mm;
	public static String Basic_LL_right_midcalf_measure_cm;
	public static String Basic_LL_right_midcalf_measure_mm;
	public static String Basic_LL_comments;
	public static String Basic_UL_comments;
	public static String Wrist_Measurement_cm_Left1;
	public static String Forearm_Measurement_cm_Left1;

	public static String LEFT_WRIST_MEASURE_CM_upper;
	public static String ForeARM_MIDCALF_MEASURE_CM_upper;

	public static String CareGiverMed1;
	public static String CareGiverMed2;
	public static String HomeCommentsNursing1;

	public static String Adv_Lower_Limb_var1;
	public static String Adv_Lower_Limb_var2;
	public static String Adv_Lower_Limb_var3;
	public static String Adv_Lower_Limb_var4;
	public static String Adv_Lower_Limb_var5;

	public static String PT_number1;

	public static String HomeComments1;

	public static String Type_Of_Ventilator1;
	public static String LEAK_HOME1;

	public static String vital_signs_drop_down;

	private List<String> bradenScoreList = new ArrayList<String>();

	public void clickOnSearchButton() {
		clickElement(PatientAccountsPageLocators.btn_SearchButton);
	}

	public void enterInputFieldAsPerKey(String inputField) {
		switch (inputField) {
		case PixalereStringPool.LAST_NAME:
			lastName = JavaUtils.getRandomString(3) + JavaUtils.getEpoch();
			System.out.println(PixalereStringPool.LAST_NAME + ": " + lastName);
			sendKeys(PatientAccountsPageLocators.txt_LastNameInput, lastName);
			break;

		case PixalereStringPool.CareGIVER_MEDICATION_ONE:
			CareGiverMed1 = JavaUtils.getRandomString(3);
			System.out.println(PixalereStringPool.CareGIVER_MEDICATION_ONE + ": " + CareGiverMed1);
			sendKeys(PatientAccountsPageLocators.txt_LastNameInput, CareGiverMed1);
			break;

		case PixalereStringPool.CareGIVER_MEDICATION_two:
			CareGiverMed2 = JavaUtils.getRandomString(3);
			System.out.println(PixalereStringPool.CareGIVER_MEDICATION_two + ": " + CareGiverMed2);
			sendKeys(PatientAccountsPageLocators.txt_LastNameInput, CareGiverMed2);
			break;

		case PixalereStringPool.TEMP:
			TempVitalSigns = JavaUtils.getRandomNumber(2) + "." + JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.TEMP + ": " + TempVitalSigns);
			clear(PatientVitalSignsLocators.txt_TemperatureInput);
			sendKeys(PatientVitalSignsLocators.txt_TemperatureInput, TempVitalSigns);
			break;

		case PixalereStringPool.BP:
			BpVitalSigns = "120/" + JavaUtils.getRandomNumber(2);
			System.out.println(PixalereStringPool.BP + ": " + BpVitalSigns);
			clear(PatientVitalSignsLocators.txt_bloodPressInput);
			sendKeys(PatientVitalSignsLocators.txt_bloodPressInput, BpVitalSigns);
			break;

		case PixalereStringPool.HeartRate:
			HeartRateVitalSigns = JavaUtils.getRandomNumber(2);
			System.out.println(PixalereStringPool.HeartRate + ": " + HeartRateVitalSigns);
			clear(PatientVitalSignsLocators.txt_HeartRateInput);
			sendKeys(PatientVitalSignsLocators.txt_HeartRateInput, HeartRateVitalSigns);
			break;

		case PixalereStringPool.RespiRate:
			RespiRateVitalSigns = JavaUtils.getRandomNumber(2);
			System.out.println(PixalereStringPool.RespiRate + ": " + RespiRateVitalSigns);
			clear(PatientVitalSignsLocators.txt_RespiRateInput);
			sendKeys(PatientVitalSignsLocators.txt_RespiRateInput, RespiRateVitalSigns);
			break;

		case PixalereStringPool.O2SAT:
			O2SatVitalSigns = JavaUtils.getRandomNumber(2);
			System.out.println(PixalereStringPool.O2SAT + ": " + O2SatVitalSigns);
			clear(PatientVitalSignsLocators.txt_Osat);
			sendKeys(PatientVitalSignsLocators.txt_Osat, O2SatVitalSigns);
			break;

		case PixalereStringPool.HEIGHT_VITAL:
			HeightVitalSigns = JavaUtils.getRandomNumber(2);
			System.out.println(PixalereStringPool.HEIGHT_VITAL + ": " + HeightVitalSigns);
			clear(PatientVitalSignsLocators.txt_HeightInput);
			sendKeys(PatientVitalSignsLocators.txt_HeightInput, HeightVitalSigns);
			break;

		case PixalereStringPool.WEIGHT_VITAL:
			WeightVitalSigns = JavaUtils.getRandomNumber(2);
			System.out.println(PixalereStringPool.HEIGHT_VITAL + ": " + WeightVitalSigns);
			clear(PatientVitalSignsLocators.txt_WeightInput);
			sendKeys(PatientVitalSignsLocators.txt_WeightInput, WeightVitalSigns);
			break;

		case PixalereStringPool.HEADCIRCUM_VITAL:
			HeadcircumVitalSigns = JavaUtils.getRandomNumber(2) + "." + JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.HEADCIRCUM_VITAL + ": " + HeadcircumVitalSigns);
			clear(PatientVitalSignsLocators.txt_head_circumInput);
			sendKeys(PatientVitalSignsLocators.txt_head_circumInput, HeadcircumVitalSigns);
			break;

		case PixalereStringPool.ABDOMNLGIRTH_VITAL:
			AbdimnlGirthVitalSigns = JavaUtils.getRandomNumber(2) + "." + JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.ABDOMNLGIRTH_VITAL + ": " + AbdimnlGirthVitalSigns);
			clear(PatientVitalSignsLocators.txt_abdominal_girth_Input);
			sendKeys(PatientVitalSignsLocators.txt_abdominal_girth_Input, AbdimnlGirthVitalSigns);
			break;

		// Tracheostomy

		case PixalereStringPool.Type_Of_Ventilator:
			Type_Of_Ventilator1 = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Type_Of_Ventilator + ": " + Type_Of_Ventilator1);
			clear(TracheostomyLocators.txt_ventilator_type);
			sendKeys(TracheostomyLocators.txt_ventilator_type, Type_Of_Ventilator1);
			break;

		case PixalereStringPool.LEAK_HOME:
			LEAK_HOME1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.LEAK_HOME + ": " + LEAK_HOME1);
			clear(TracheostomyLocators.txt_leak);
			sendKeys(TracheostomyLocators.txt_leak, LEAK_HOME1);
			break;

		// PCAPAin Pump

		case PixalereStringPool.SOLUTION_NAME_PCAPAINPUMP:
			System.out.println();
			SolNamePCAPainPump = "Solution" + JavaUtils.getRandomNumber(2);

			System.out.println(PixalereStringPool.SOLUTION_NAME_PCAPAINPUMP + ": " + SolNamePCAPainPump);

			Wait_p(2);
			// clear(PCAPainPumpLocators.txt_solutionName);
			try {
				sendKeys(PCAPainPumpLocators.txt_solutionName, SolNamePCAPainPump);
			} catch (Exception e) {
				sendKeys(PCAPainPumpLocators.txt_solutionName, SolNamePCAPainPump);
			}
			break;

		case PixalereStringPool.RESVOLUMEBAG:
			ResVolBagPCAPainPump = JavaUtils.getRandomNumber(2) + "." + JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.RESVOLUMEBAG + ": " + ResVolBagPCAPainPump);
			clear(PCAPainPumpLocators.txt_ReservoirVolBag);
			sendKeys(PCAPainPumpLocators.txt_ReservoirVolBag, ResVolBagPCAPainPump);
			break;

		case PixalereStringPool.DOSECONCEN:
			DoseConcenPCAPainPump = JavaUtils.getRandomNumber(2) + "." + JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.DOSECONCEN + ": " + DoseConcenPCAPainPump);
			clear(PCAPainPumpLocators.txt_DoseConcentration);
			sendKeys(PCAPainPumpLocators.txt_DoseConcentration, DoseConcenPCAPainPump);
			break;

		case PixalereStringPool.DOSE_HOUR:
			DoseHourPCAPainPump = JavaUtils.getRandomNumber(2) + "." + JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.DOSE_HOUR + ": " + DoseHourPCAPainPump);
			clear(PCAPainPumpLocators.txt_DoseHour);
			sendKeys(PCAPainPumpLocators.txt_DoseHour, DoseHourPCAPainPump);
			break;

		case PixalereStringPool.BOLUS_DOSE:
			BolusDosePCAPainPump = JavaUtils.getRandomNumber(2) + "." + JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.BOLUS_DOSE + ": " + BolusDosePCAPainPump);
			clear(PCAPainPumpLocators.txt_BolusDose);
			sendKeys(PCAPainPumpLocators.txt_BolusDose, BolusDosePCAPainPump);
			break;

		case PixalereStringPool.BOLUS_DOSE_ALLOWED_HOUR:
			BolusDoseAllowedHourPCAPainPump = JavaUtils.getRandomNumber(2) + "." + JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.BOLUS_DOSE_ALLOWED_HOUR + ": " + BolusDoseAllowedHourPCAPainPump);
			clear(PCAPainPumpLocators.txt_BolusDoseAllowed);
			sendKeys(PCAPainPumpLocators.txt_BolusDoseAllowed, BolusDoseAllowedHourPCAPainPump);
			break;

		case PixalereStringPool.ATTEMPTS:
			AttemptsPCAPainPump = JavaUtils.getRandomNumber(2) + "." + JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.ATTEMPTS + ": " + AttemptsPCAPainPump);
			clear(PCAPainPumpLocators.txt_BolusDoseAttempts);
			sendKeys(PCAPainPumpLocators.txt_BolusDoseAttempts, AttemptsPCAPainPump);
			break;

		case PixalereStringPool.GIVEN:
			GivenPCAPainPump = JavaUtils.getRandomNumber(2) + "." + JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.GIVEN + ": " + GivenPCAPainPump);
			clear(PCAPainPumpLocators.txt_BolusGiven);
			sendKeys(PCAPainPumpLocators.txt_BolusGiven, GivenPCAPainPump);
			break;

		// ---------------Home Peritoneal Flowchart
		// Page-------------------------------------------------------------------------------///////////////////////

		// input type
		case PixalereStringPool.TARGETWEIGHT:
			HomePeritoneal_TargetWeight = JavaUtils.getRandomNumber(2);
			System.out.println(PixalereStringPool.TARGETWEIGHT + ": " + HomePeritoneal_TargetWeight);
			clear(HomePeritonealLocators.txt_TargetWeight);
			waitInterval(10);
			clear(HomePeritonealLocators.txt_TargetWeight);
			waitInterval(10);
			sendKeys(HomePeritonealLocators.txt_TargetWeight, HomePeritoneal_TargetWeight);
			break;

		// input type
		case PixalereStringPool.OTHER_HOMEP:
			HomePeritoneal_OtherHomeP = JavaUtils.getRandomNumber(2) + "." + JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.OTHER_HOMEP + ": " + HomePeritoneal_OtherHomeP);
			clear(HomePeritonealLocators.txt_other);
			sendKeys(HomePeritonealLocators.txt_other, HomePeritoneal_OtherHomeP);
			break;

		case PixalereStringPool.TARGETBLOODPRESSURE:
			HomePeritoneal_TargerBloodPressure = JavaUtils.getRandomNumber(2) + "/" + JavaUtils.getRandomNumber(3);
			System.out.println(PixalereStringPool.TARGETBLOODPRESSURE + ": " + HomePeritoneal_TargerBloodPressure);
			clear(HomePeritonealLocators.txt_TargetBP);
			sendKeys(HomePeritonealLocators.txt_TargetBP, HomePeritoneal_TargerBloodPressure);
			break;

		case PixalereStringPool.OTHER_RADIO:
			HomePeritoneal_OtherRadio = JavaUtils.getRandomString(10);
			System.out.println(PixalereStringPool.OTHER_RADIO + ": " + HomePeritoneal_OtherRadio);
			clear(HomePeritonealLocators.txt_HomePeritoneal_OtherRadio);
			sendKeys(HomePeritonealLocators.txt_HomePeritoneal_OtherRadio, HomePeritoneal_OtherRadio);
			break;

		case PixalereStringPool.DRAINAGE_AMOUNT:
			HomePeritoneal_DrainageAmt = JavaUtils.getRandomNumber(2);
			System.out.println(PixalereStringPool.DRAINAGE_AMOUNT + ": " + HomePeritoneal_DrainageAmt);
			clear(HomePeritonealLocators.txt_drainageAmt);
			sendKeys(HomePeritonealLocators.txt_drainageAmt, HomePeritoneal_DrainageAmt);
			break;

		case PixalereStringPool.SOLUTION_USED:
			HomePeritoneal_Solution1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.SOLUTION_USED + ": " + HomePeritoneal_Solution1);
			clear(HomePeritonealLocators.txt_SolutionUsed_1);
			sendKeys(HomePeritonealLocators.txt_SolutionUsed_1, HomePeritoneal_Solution1);
			clear(HomePeritonealLocators.txt_SolutionUsed_2);
			sendKeys(HomePeritonealLocators.txt_SolutionUsed_2, HomePeritoneal_Solution1);
			clear(HomePeritonealLocators.txt_SolutionUsed_3);
			sendKeys(HomePeritonealLocators.txt_SolutionUsed_3, HomePeritoneal_Solution1);
			break;

		case PixalereStringPool.INSULIN_HOME:
			HomePeritoneal_Insulin = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.INSULIN_HOME + ": " + HomePeritoneal_Insulin);
			clear(HomePeritonealLocators.txt_Insulin_1);
			sendKeys(HomePeritonealLocators.txt_Insulin_1, HomePeritoneal_Insulin);
			clear(HomePeritonealLocators.txt_Insulin_2);
			sendKeys(HomePeritonealLocators.txt_Insulin_2, HomePeritoneal_Insulin);
			clear(HomePeritonealLocators.txt_Insulin_3);
			sendKeys(HomePeritonealLocators.txt_Insulin_3, HomePeritoneal_Insulin);
			break;

		case PixalereStringPool.LOCATION:
			HomePeritoneal_Location = JavaUtils.getRandomString(10);
			System.out.println(PixalereStringPool.LOCATION + ": " + HomePeritoneal_Location);
			clear(HomePeritonealLocators.txt_location);
			sendKeys(HomePeritonealLocators.txt_location, HomePeritoneal_Location);
			break;

		case PixalereStringPool.MEASUREMENT:
			HomePeritoneal_Measurement = JavaUtils.getRandomNumber(2);
			System.out.println(PixalereStringPool.MEASUREMENT + ": " + HomePeritoneal_Measurement);
			clear(HomePeritonealLocators.txt_measurement);
			sendKeys(HomePeritonealLocators.txt_measurement, HomePeritoneal_Measurement);
			break;

		case PixalereStringPool.DWELL_TIME:
			HomePeritoneal_DwellTime = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.DWELL_TIME + ": " + HomePeritoneal_DwellTime);
			clear(HomePeritonealLocators.txt_DwellTime);
			sendKeys(HomePeritonealLocators.txt_DwellTime, HomePeritoneal_DwellTime);
			break;

		//// *********** Emergency Panning ********************///

		case PixalereStringPool.E_SUPPORT:
			E_support = JavaUtils.getRandomString(7);
			System.out.println(PixalereStringPool.E_SUPPORT + ": " + E_support);
			clear(EmergencyPlanningLocators.txt_support);
			sendKeys(EmergencyPlanningLocators.txt_support, E_support);
			break;

		case PixalereStringPool.EMEMERGENCY_CONTACT:
			E_contact = JavaUtils.getRandomString(7);
			System.out.println(PixalereStringPool.EMEMERGENCY_CONTACT + ": " + E_contact);
			clear(EmergencyPlanningLocators.txt_emergency_contact);
			sendKeys(EmergencyPlanningLocators.txt_emergency_contact, E_contact);
			break;

		case PixalereStringPool.AlTERNATE_EMEMERGENCY_CONTACT:
			Alternate_e_contact = JavaUtils.getRandomString(10);
			System.out.println(PixalereStringPool.AlTERNATE_EMEMERGENCY_CONTACT + ": " + Alternate_e_contact);
			clear(EmergencyPlanningLocators.txt_alt_emergency_contact);
			sendKeys(EmergencyPlanningLocators.txt_alt_emergency_contact, Alternate_e_contact);
			break;

		case PixalereStringPool.EMEMERGENCY_RELATIONSHIP:
			E_relationship = JavaUtils.getRandomString(10);
			System.out.println(PixalereStringPool.EMEMERGENCY_RELATIONSHIP + ": " + E_relationship);
			clear(EmergencyPlanningLocators.txt_emergency_reltionship);
			sendKeys(EmergencyPlanningLocators.txt_emergency_reltionship, E_relationship);
			break;

		case PixalereStringPool.ALETRNATE_EMEMERGENCY_RELATIONSHIP:
			Alternate_e_relationship = JavaUtils.getRandomString(10);
			System.out.println(PixalereStringPool.ALETRNATE_EMEMERGENCY_RELATIONSHIP + ": " + Alternate_e_relationship);
			clear(EmergencyPlanningLocators.txt_alt_emergency_reltionship);
			sendKeys(EmergencyPlanningLocators.txt_alt_emergency_reltionship, Alternate_e_relationship);
			break;

		case PixalereStringPool.EMEMERGENCY_PHONE:
			E_phone = "465-454-7789";
			System.out.println(PixalereStringPool.EMEMERGENCY_PHONE + ": " + E_phone);
			clear(EmergencyPlanningLocators.txt_emergency_phone);
			sendKeys(EmergencyPlanningLocators.txt_emergency_phone, E_phone);
			break;

		case PixalereStringPool.ALETRNATE_EMEMERGENCY_PHONE:
			Alternate_e_phone = "465-454-7789";
			System.out.println(PixalereStringPool.ALETRNATE_EMEMERGENCY_PHONE + ": " + Alternate_e_phone);
			clear(EmergencyPlanningLocators.txt_alt_emergency_phone);
			sendKeys(EmergencyPlanningLocators.txt_alt_emergency_phone, Alternate_e_phone);
			break;

		case PixalereStringPool.E_Preparedness_plan:
			E_preparedness = JavaUtils.getRandomString(10);
			System.out.println(PixalereStringPool.E_Preparedness_plan + ": " + E_preparedness);
			clear(EmergencyPlanningLocators.txt_preparedness_plan);
			sendKeys(EmergencyPlanningLocators.txt_preparedness_plan, E_preparedness);
			break;

		case PixalereStringPool.E_COMMENTS:
			Emergency_comments = JavaUtils.getRandomString(10);
			System.out.println(PixalereStringPool.E_COMMENTS + ": " + Emergency_comments);
			clear(EmergencyPlanningLocators.txt_emergency_comments);
			sendKeys(EmergencyPlanningLocators.txt_emergency_comments, Emergency_comments);
			break;

///***********************************************************************************************************************//
		// BAsic Lower Limb
		case PixalereStringPool.SLEEP_POSITION:
			Basic_LL_sleep_position = JavaUtils.getRandomString(10);
			System.out.println(PixalereStringPool.SLEEP_POSITION + ": " + Basic_LL_sleep_position);
			clear(BasicLowerLimbLocator.txt_sleep_position);
			sendKeys(BasicLowerLimbLocator.txt_sleep_position, Basic_LL_sleep_position);
			break;

		case PixalereStringPool.RIGHT_ANKLE_MEASURE_CM:
			Basic_LL_right_ankle_cm = JavaUtils.getRandomNumber(2);
			System.out.println(PixalereStringPool.RIGHT_ANKLE_MEASURE_CM + ": " + Basic_LL_right_ankle_cm);
			clear(BasicLowerLimbLocator.txt_right_ankle_cm);
			sendKeys(BasicLowerLimbLocator.txt_right_ankle_cm, Basic_LL_right_ankle_cm);
			break;

		case PixalereStringPool.RIGHT_ANKLE_MEASURE_MM:
			Basic_LL_right_ankle_mm = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.RIGHT_ANKLE_MEASURE_MM + ": " + Basic_LL_right_ankle_mm);
			clear(BasicLowerLimbLocator.txt_right_ankle_mm);
			sendKeys(BasicLowerLimbLocator.txt_right_ankle_mm, Basic_LL_right_ankle_mm);
			break;

		case PixalereStringPool.RIGHT_MIDCALF_MEASURE_CM:
			Basic_LL_right_midcalf_measure_cm = JavaUtils.getRandomNumber(2);
			System.out.println(PixalereStringPool.RIGHT_MIDCALF_MEASURE_CM + ": " + Basic_LL_right_midcalf_measure_cm);
			clear(BasicLowerLimbLocator.txt_right_midcalf_cm);
			sendKeys(BasicLowerLimbLocator.txt_right_midcalf_cm, Basic_LL_right_midcalf_measure_cm);
			break;

		case PixalereStringPool.RIGHT_MIDCALF_MEASURE_MM:
			Basic_LL_right_midcalf_measure_mm = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.RIGHT_MIDCALF_MEASURE_MM + ": " + Basic_LL_right_midcalf_measure_mm);
			clear(BasicLowerLimbLocator.txt_right_midcalf_mm);
			sendKeys(BasicLowerLimbLocator.txt_right_midcalf_mm, Basic_LL_right_midcalf_measure_mm);
			break;

		case PixalereStringPool.BASIC_LL_COMMENTS:
			Basic_LL_comments = JavaUtils.getRandomString(10);
			System.out.println(PixalereStringPool.BASIC_LL_COMMENTS + ": " + Basic_LL_comments);
			clear(BasicLowerLimbLocator.txt_limb_comments);
			sendKeys(BasicLowerLimbLocator.txt_limb_comments, Basic_LL_comments);
			break;

		case PixalereStringPool.BASIC_UL_COMMENTS:
			Basic_UL_comments = JavaUtils.getRandomString(10);
			System.out.println(PixalereStringPool.BASIC_UL_COMMENTS + ": " + Basic_UL_comments);
			clear(UpperLimbLocator.txt_upper_limb_comments);
			sendKeys(UpperLimbLocator.txt_upper_limb_comments, Basic_UL_comments);
			break;

		case PixalereStringPool.LEFT_WRIST_MEASURE_CM:
			LEFT_WRIST_MEASURE_CM_upper = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.LEFT_WRIST_MEASURE_CM + ": " + LEFT_WRIST_MEASURE_CM_upper);
			clear(UpperLimbLocator.txt_wrist_cm_right);
			sendKeys(UpperLimbLocator.txt_wrist_cm_right, LEFT_WRIST_MEASURE_CM_upper);
			clear(UpperLimbLocator.txt_wrist_cm_right1);
			sendKeys(UpperLimbLocator.txt_wrist_cm_right1, LEFT_WRIST_MEASURE_CM_upper);
			break;

		case PixalereStringPool.ForeARM_MIDCALF_MEASURE_CM:
			ForeARM_MIDCALF_MEASURE_CM_upper = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.ForeARM_MIDCALF_MEASURE_CM + ": " + ForeARM_MIDCALF_MEASURE_CM_upper);
			clear(UpperLimbLocator.txt_forearm_cm_right);
			sendKeys(UpperLimbLocator.txt_forearm_cm_right, ForeARM_MIDCALF_MEASURE_CM_upper);
			clear(UpperLimbLocator.txt_forearm_cm_right1);
			sendKeys(UpperLimbLocator.txt_forearm_cm_right1, ForeARM_MIDCALF_MEASURE_CM_upper);
			break;

		case PixalereStringPool.Wrist_Measurement_cm_Left:
			Wrist_Measurement_cm_Left1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Wrist_Measurement_cm_Left + ": " + Wrist_Measurement_cm_Left1);
			clear(UpperLimbLocator.txt_wrist_cm_left);
			sendKeys(UpperLimbLocator.txt_wrist_cm_left, Wrist_Measurement_cm_Left1);
			clear(UpperLimbLocator.txt_wrist_cm_left1);
			sendKeys(UpperLimbLocator.txt_wrist_cm_left1, Wrist_Measurement_cm_Left1);
			break;

		case PixalereStringPool.Forearm_Measurement_cm_Left:
			Forearm_Measurement_cm_Left1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Forearm_Measurement_cm_Left + ": " + Forearm_Measurement_cm_Left1);
			clear(UpperLimbLocator.txt_forearm_cm_left);
			sendKeys(UpperLimbLocator.txt_forearm_cm_left, Forearm_Measurement_cm_Left1);
			clear(UpperLimbLocator.txt_forearm_cm_left1);
			sendKeys(UpperLimbLocator.txt_forearm_cm_left1, Forearm_Measurement_cm_Left1);
			break;
		////////// Advanced Lower Limb Assessment
		////////// ---------------/////////////////////////////////////////////////////////////////

		case PixalereStringPool.DORSALIS_RIGHT_ADV_LIMB:
			Adv_Lower_Limb_var1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.DORSALIS_RIGHT_ADV_LIMB + ": " + Adv_Lower_Limb_var1);
			clear(AdvLimbLocator.txt_ankle_Dorsalis_Pedis);
			sendKeys(AdvLimbLocator.txt_ankle_Dorsalis_Pedis, Adv_Lower_Limb_var1);
			break;

		case PixalereStringPool.Posterior_Tibial_Right_ADV_LIMB:
			Adv_Lower_Limb_var2 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Posterior_Tibial_Right_ADV_LIMB + ": " + Adv_Lower_Limb_var2);
			clear(AdvLimbLocator.txt_right_tibial_pedis_ankle_brachial);
			sendKeys(AdvLimbLocator.txt_right_tibial_pedis_ankle_brachial, Adv_Lower_Limb_var2);
			break;

		case PixalereStringPool.Brachial_Pressure_Ankle_ADV_LIMB_Right:
			Adv_Lower_Limb_var3 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Brachial_Pressure_Ankle_ADV_LIMB_Right + ": " + Adv_Lower_Limb_var3);
			clear(AdvLimbLocator.txt_right_ankle_brachial);
			sendKeys(AdvLimbLocator.txt_right_ankle_brachial, Adv_Lower_Limb_var3);
			break;

		case PixalereStringPool.Toe_Pressure_Right_ADV_LIMB:
			Adv_Lower_Limb_var4 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Toe_Pressure_Right_ADV_LIMB + ": " + Adv_Lower_Limb_var4);
			clear(AdvLimbLocator.txt_right_toe_pressure);
			sendKeys(AdvLimbLocator.txt_right_toe_pressure, Adv_Lower_Limb_var4);
			break;

		case PixalereStringPool.Brachial_Pressure_Toe_Right_ADV_LIMB:
			Adv_Lower_Limb_var5 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.Brachial_Pressure_Toe_Right_ADV_LIMB + ": " + Adv_Lower_Limb_var5);
			clear(AdvLimbLocator.txt_right_brachial_pressure);
			sendKeys(AdvLimbLocator.txt_right_brachial_pressure, Adv_Lower_Limb_var5);
			break;

		////// PT-----------------------------------////////////////////////////////////////////////////////////////////

		case PixalereStringPool.PT_number:
			PT_number1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.PT_number + ": " + PT_number1);
			clear(PTLocators.txt_num);
			sendKeys(PTLocators.txt_num, PT_number1);
			break;

		////////////////////////////////// --------------------------------------------------------------///////////////////////////////////
		case PixalereStringPool.FIRST_NAME:
			firstName = JavaUtils.getRandomString(3) + JavaUtils.getEpoch();
			System.out.println(PixalereStringPool.FIRST_NAME + ": " + firstName);
			sendKeys(PatientAccountsPageLocators.txt_FirstNameInput, firstName);
			break;

		case PixalereStringPool.MIDDLE_NAME:
			String middleName = JavaUtils.getRandomString(3) + JavaUtils.getEpoch();
			System.out.println(PixalereStringPool.MIDDLE_NAME + ": " + middleName);
			sendKeys(PatientAccountsPageLocators.txt_MiddleNameInput, middleName);
			break;

		case PixalereStringPool.CIN:
			String cin1 = JavaUtils.getRandomString(2) + JavaUtils.getRandomNumber(1);
			System.out.println("cin1: " + cin1);
			sendKeys(PatientAccountsPageLocators.txt_CIN1Input, cin1);

			String cin2 = JavaUtils.getRandomString(2) + JavaUtils.getRandomNumber(2);
			System.out.println("cin2: " + cin2);
			sendKeys(PatientAccountsPageLocators.txt_CIN2Input, cin2);

			PixalereCommonUtils.CINID = cin1 + cin2;
			System.out.println(PixalereStringPool.CIN + ": " + PixalereCommonUtils.CINID);
			break;

		case PixalereStringPool.ALLERGIES:
			allergies = JavaUtils.getRandomString(10) + JavaUtils.getRandomNumber(5);
			System.out.println(PixalereStringPool.ALLERGIES + ": " + allergies);
			sendKeys(PatientAccountsPageLocators.txt_AllergiesInput, allergies);
			break;

		case PixalereStringPool.HOME_ADDRESS:
			String homeAddress = JavaUtils.getRandomString(10) + JavaUtils.getRandomNumber(5);
			System.out.println(PixalereStringPool.HOME_ADDRESS + ": " + homeAddress);
			sendKeys(PatientAccountsPageLocators.txt_HomeAddressInput, homeAddress);
			break;

		case PixalereStringPool.CITY:
			System.out.println(PixalereStringPool.CITY + ": " + ConfigFileReader.getProperties("patient.city"));
			sendKeys(PatientAccountsPageLocators.txt_CityInput, ConfigFileReader.getProperties("patient.city"));
			break;

		case PixalereStringPool.ZIP_CODE_POSTAL_CODE:
			System.out.println(PixalereStringPool.ZIP_CODE_POSTAL_CODE + ": "
					+ ConfigFileReader.getProperties("patient.postal.code"));
			sendKeys(PatientAccountsPageLocators.txt_PostalCodeInput,
					ConfigFileReader.getProperties("patient.postal.code"));
			break;

		case PixalereStringPool.STATE_PROVINCE:
			String stateProvince = ConfigFileReader.getProperties("patient.state");
			System.out.println(PixalereStringPool.STATE_PROVINCE + ": " + stateProvince);
			sendKeys(PatientAccountsPageLocators.txt_StateProvinceInput, stateProvince);
			break;

		case PixalereStringPool.PRIMARY_INSURANCE_CARRIER:
			String pic = JavaUtils.getRandomString(10);
			System.out.println(PixalereStringPool.PRIMARY_INSURANCE_CARRIER + ": " + pic);
			if (isDisplayed(PatientAccountsPageLocators.txt_PrimaryInsuranceCarrierInput)) {
				isInsuranceBlockDisplayed = true;
				sendKeys(PatientAccountsPageLocators.txt_PrimaryInsuranceCarrierInput, pic);
			} else
				isWait = true;
			break;

		case PixalereStringPool.PRIMARY_INSURANCE_POLICY_HOLDER_NAME:
			String piphn = JavaUtils.getRandomString(7);
			System.out.println(PixalereStringPool.PRIMARY_INSURANCE_POLICY_HOLDER_NAME + ": " + piphn);
			if (isInsuranceBlockDisplayed)
				sendKeys(PatientAccountsPageLocators.txt_PrimaryInsurancePolicyHolderNameInput, piphn);
			break;

		case PixalereStringPool.PRIMARY_INSURANCE_POLICY:
			String pip = JavaUtils.getRandomString(5) + JavaUtils.getRandomNumber(3);
			System.out.println(PixalereStringPool.PRIMARY_INSURANCE_POLICY + ": " + pip);
			if (isInsuranceBlockDisplayed)
				sendKeys(PatientAccountsPageLocators.txt_PrimaryInsurancePolicyInput, pip);
			break;

		case PixalereStringPool.PRIMARY_INSURANCE_GROUP:
			String pig = JavaUtils.getRandomString(5) + JavaUtils.getRandomNumber(3);
			System.out.println(PixalereStringPool.PRIMARY_INSURANCE_GROUP + ": " + pig);
			if (isInsuranceBlockDisplayed)
				sendKeys(PatientAccountsPageLocators.txt_PrimaryInsuranceGroupInput, pig);
			break;

		/// home child nursing

		case PixalereStringPool.HomeComments:
			HomeComments1 = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.HomeComments + ": " + HomeComments1);
			clear(AdvLimbLocator.txt_comment_hsi);
			sendKeys(AdvLimbLocator.txt_comment_hsi, HomeComments1);
			break;

		}
		if (!isWait)
			waitInterval(1);
	}

	public void selectDropdownValue(String dropdown, String value) {

		if (dropdown.contains(PixalereStringPool.TREATMENT_LOCATION)) {
			treatmentLocation = value;
			System.out.println(PixalereStringPool.TREATMENT_LOCATION + ": " + treatmentLocation);
		}
		selectByVisibleText(CustomizedLocators.getPatientAccountPageDropdownElement(dropdown), value);
	}

	public void selectDropdownValue_p(String dropdown, String value) {

		if (dropdown.equalsIgnoreCase("Site Appearance")) {
			selectByVisibleText(PCAPainPumpLocators.drp_siteAppearance, value);

		} else if (dropdown.equalsIgnoreCase("Lock Level")) {
			selectByVisibleText(PCAPainPumpLocators.drp_locklevel, value);
		} else if (dropdown.equalsIgnoreCase("Dose Concentration")) {
			selectByVisibleText(PCAPainPumpLocators.drp_DoseHour, value);
			var_DoseConcentration = value;
		}

		else if (dropdown.equalsIgnoreCase("Bolus dose")) {
			selectByVisibleText(PCAPainPumpLocators.drp_BolusDoseType, value);
			var_BolusConcentration = value;
		}

		else {
			vital_signs_drop_down = value;
			selectByVisibleText(PatientVitalSignsLocators.drp_bp, value);
		}
		System.out.println();
	}

	public void selectDropdownValue_search_cat(String value) {
		/*
		 * if(dropdown.contains(PixalereStringPool.TREATMENT_LOCATION)) {
		 * treatmentLocation=value;
		 * System.out.println(PixalereStringPool.TREATMENT_LOCATION+": "
		 * +treatmentLocation); }
		 */
		selectByVisibleText(GlobalPageLocators.txt_SearchPatientInputDropdown, value);

	}

	public void selectOTFromSerivceReferral(String value) {
		// String xpath1 =
		// String.format(GlobalPageLocators.select_from_ServiceReferreal, value);
		// clickElementWithJQuery(By.xpath(xpath1));
//		select_ByIndex(By.id("encounter"), 2);
		selectBycontainsText(By.xpath("//*[@id='encounter']//option"), "OT");
		// selectByVisibleText(By.xpath(String.format(GlobalPageLocators.select_from_ServiceReferreal,
		// value)), value);
		System.out.println();
	}

	public void selectPTFromSerivceReferral(String value) {
		select_ByIndex(By.id("encounter"), 2);
		// selectByVisibleText(By.id("encounter"), value);
		// selectByVisibleText(By.xpath(String.format(GlobalPageLocators.select_from_ServiceReferreal,
		// value)), value);
		System.out.println();

	}

	public void selectValue_from_Dasboard(String value) {
		// clickElementWithJQuery(By.xpath(String.format(GlobalPageLocators.search_patient,
		// value)));
		if (value.equalsIgnoreCase("Data_PT")) {
			clickLinkWithText(Data_PT);
			System.out.println();
		} else {
			clickLinkWithText(value);
		}

	}

	public void selectDateOfBirth(String year) {
		String day = JavaUtils.getCurrentDate("d");
		selectByVisibleText(PatientAccountsPageLocators.drp_DaysCalendarDropdown, day);
		System.out.println("day: " + day);

		String month = JavaUtils.getCurrentDate("MMM");
		selectByVisibleText(PatientAccountsPageLocators.drp_MonthsCalendarDropdown, month);
		System.out.println("month: " + month);

		sendKeys(PatientAccountsPageLocators.txt_YearsCalendarInput, year);
		System.out.println("year: " + year);

		dateOfBirth = JavaUtils.getDateInFormat(day + "/" + month + "/" + year, "d/MMM/yyyy", "dd/MMM/yyyy");
		System.out.println("dateOfBirth: " + dateOfBirth);
	}

	public void clickOnCreatePatientAccountButton() {
		scrollAndhighLightElement(PatientAccountsPageLocators.btn_CreatePatientAccountButton);
		clickElement(PatientAccountsPageLocators.btn_CreatePatientAccountButton);
	}

	public void verifyCreatedPatientAccountsDetails(String patientDetails) {
		String actualVal = null;
		for (String patientInfo : patientDetails.split(",")) {
			waitUntilElementIsDisplayed(CustomizedLocators.getPatientAccountDetailsByKey(patientInfo));
			highLightElement(CustomizedLocators.getPatientAccountDetailsByKey(patientInfo));
			actualVal = getElementText(CustomizedLocators.getPatientAccountDetailsByKey(patientInfo)).trim();
			System.out.println(patientInfo + " actualVal: " + actualVal);

			switch (patientInfo.trim()) {
			case PixalereStringPool.NAME:
				Assert.assertTrue(actualVal + ": notContains :" + firstName, actualVal.contains(firstName));
				Assert.assertTrue(actualVal + ": notContains :" + lastName, actualVal.contains(lastName));
				break;

			case PixalereStringPool.DATE_OF_BIRTH:
				Assert.assertEquals(actualVal + " != " + dateOfBirth, actualVal, dateOfBirth);
				break;

			case PixalereStringPool.ALLERGIES:
				Assert.assertTrue(actualVal + ": notContains :" + allergies, actualVal.contains(allergies));
				break;

			case PixalereStringPool.TREATMENT_LOCATION:
				Assert.assertTrue(actualVal + ": notContains :" + treatmentLocation,
						actualVal.contains(treatmentLocation));
				break;

			case PixalereStringPool.STATUS:
				Assert.assertTrue(actualVal + ": notContains :" + ConfigFileReader.getProperties("patient.status"),
						actualVal.contains(ConfigFileReader.getProperties("patient.status")));
				break;

			case PixalereStringPool.CIN:
				Assert.assertTrue(actualVal + ": notContains :" + PixalereCommonUtils.CINID,
						actualVal.contains(PixalereCommonUtils.CINID));
				break;
			}
		}

	}

	public void verifyPatientConsentMessage(String message) {
		waitUntilElementIsDisplayed(PatientAccountsPageLocators.msg_PatientConsentMessage);
		highLightElement(PatientAccountsPageLocators.msg_PatientConsentMessage);
		String actualMessage = getElementText(PatientAccountsPageLocators.msg_PatientConsentMessage).trim();
		System.out.println("Actual Consent Message: " + actualMessage);
		Assert.assertTrue(actualMessage + " != " + message, actualMessage.contains(message));
	}

	public void verifyOpenedConsentWindow() {
		parentHandle = getCurrentWindow();
		switchToWindow(2);
	}

	public void selectConsentOptionAndSave(String radioValue, String saveButton) {
		clickElement(CustomizedLocators.getConsentRadioButtonByValue(radioValue));
		clickButtonWithText(saveButton);
	}

	public void verifyConsentMessageOnWindowClose(String messageValidation) {
		switchToPreviousWindow(parentHandle);
		waitInterval(7);
		waitForCompletePageLoad();

		if (messageValidation.contains("disappear"))
			Assert.assertTrue("Message is failed to disappered... Value:Yes",
					!isDisplayed(PatientAccountsPageLocators.msg_PatientConsentMessage));
		else {
			waitUntilElementIsDisplayed(PatientAccountsPageLocators.msg_PatientConsentMessage);
			highLightElement(PatientAccountsPageLocators.msg_PatientConsentMessage);
			Assert.assertTrue("Message is failed to Displayed... Value:No",
					isDisplayed(PatientAccountsPageLocators.msg_PatientConsentMessage));
		}
	}

	public void editPatientProfileAsPerKey(String inputField) {
		switch (inputField) {

		case PixalereStringPool.PAST_MEDICAL_HISTORY:
			pastMedicalHistory = JavaUtils.getRandomString(12);
			System.out.println(PixalereStringPool.PAST_MEDICAL_HISTORY + ": " + pastMedicalHistory);
			clear(PatientProfilePageLocators.txt_PastMedicalHistoryInput);
			sendKeys(PatientProfilePageLocators.txt_PastMedicalHistoryInput, pastMedicalHistory);
			break;

		case PixalereStringPool.PAST_MEDICAL_HISTORY_OTHER:
			pastMedicalHistoryOther = JavaUtils.getRandomString(12);
			System.out.println(PixalereStringPool.PAST_MEDICAL_HISTORY_OTHER + ": " + pastMedicalHistoryOther);
			clear(PatientProfilePageLocators.txt_PastMedicalHistoryOtherInput);
			sendKeys(PatientProfilePageLocators.txt_PastMedicalHistoryOtherInput, pastMedicalHistoryOther);
			break;

		case PixalereStringPool.CURRENT_MEDICATIONS:
			currentMedications = JavaUtils.getRandomString(12);
			System.out.println(PixalereStringPool.CURRENT_MEDICATIONS + ": " + currentMedications);
			clear(PatientProfilePageLocators.txt_CurrentMedicationsInput);
			sendKeys(PatientProfilePageLocators.txt_CurrentMedicationsInput, currentMedications);
			break;
		}
		waitInterval(1);
	}

	public void verifyAllergiesValueOnResidentProfilePage() {
		String actualVal = getAttribute(PatientProfilePageLocators.txt_Allergies, "value").trim();
		System.out.println("Allergies ActualVal: " + actualVal);
		Assert.assertTrue(actualVal + "!= " + allergies, actualVal.equalsIgnoreCase(allergies));
	}

	public void selectAffectWoundHealingFactors(String affectWoundHealingString) {
		List<String> affectWoundHealingList = new ArrayList<String>();
		for (String affectFactor : affectWoundHealingString.split(","))
			affectWoundHealingList.add(affectFactor.trim());
		System.out.println("affectWoundHealingList: " + affectWoundHealingList);

		waitUntilElementIsDisplayed(PatientProfilePageLocators.css_AffectWoundHealingFactorList);
		for (WebElement affectedFactorWeb : getWebDriver()
				.findElements(PatientProfilePageLocators.css_AffectWoundHealingFactorList)) {
			if (affectWoundHealingList.contains(getElementText(affectedFactorWeb).trim())) {
				scrollAndhighLightElement(affectedFactorWeb);
				clickElement(affectedFactorWeb);
			}
		}
		waitInterval(1);
	}

	public void getVisitDateTimeOnConfirmPopup() {
		waitForCompletePageLoad();
		String day = getDropdownSelectedOption(PatientProfilePageLocators.drp_ConfirmPopDayDropdown);
		String month = getDropdownSelectedOption(PatientProfilePageLocators.drp_ConfirmPopMonthDropdown);
		String year = getAttribute(PatientProfilePageLocators.txt_ConfirmPopYearInput, "value");
		visitTime = JavaUtils.getDateInFormat(day + "/" + month + "/" + year, "d/MMM/yyyy", "dd/MMM/yyyy");
		System.out.println("visitTime: " + visitTime);
		waitInterval(1);
	}

	public void verifyResidentProfileDataSaved(String successMsg) {
		waitForCompletePageLoad();
		waitUntilElementIsDisplayed(PatientProfilePageLocators.msg_SuccessTextMessage);
		scrollAndhighLightElement(PatientProfilePageLocators.msg_SuccessTextMessage);
		String actualMessage = getElementText(PatientProfilePageLocators.msg_SuccessTextMessage).trim();
		System.out.println("actualMessage: " + actualMessage);
		Assert.assertTrue(actualMessage + " != " + successMsg, actualMessage.contains(successMsg));
		waitInterval(1);
	}

	public void verifyLastUpdateTime() {
		waitForCompletePageLoad();
		waitUntilElementIsDisplayed(PatientProfilePageLocators.ele_LastUpdateDateLabel);
		highLightElement(PatientProfilePageLocators.ele_LastUpdateDateLabel);
		String actualTime = getElementText(PatientProfilePageLocators.ele_LastUpdateDateLabel).trim();
		Assert.assertTrue(actualTime + ": notContains :" + visitTime, actualTime.contains(visitTime));
		waitInterval(1);
	}

	public void selectBradenScoreViseRadioValue(String bradenScoreValue) {
		waitForCompletePageLoad();
		scrollAndhighLightElement(CustomizedLocators.getBradenScoreRadioButtonByValue(bradenScoreValue));
		clickElementWithJQuery(CustomizedLocators.getBradenScoreRadioButtonByValue(bradenScoreValue));
		waitInterval(1);
		bradenScoreList.add(bradenScoreValue);
		System.out.println("bradenScoreList: " + bradenScoreList);
	}

	public void verifyTotalBradenScore(String expectedScore) {
		waitForCompletePageLoad();
		waitUntilElementIsDisplayed(PatientProfilePageLocators.txt_BradenScoreInput);
		highLightElement(PatientProfilePageLocators.txt_BradenScoreInput);
		String actualScore = getAttribute(PatientProfilePageLocators.txt_BradenScoreInput, "value").trim();
		System.out.println("actualScore: " + actualScore);
		Assert.assertTrue(actualScore + ": != :" + expectedScore, actualScore.equalsIgnoreCase(expectedScore));
	}

	public void editAdditionalCommentsTextarea() {
		sendKeys(PatientProfilePageLocators.txt_AdditionalCommentsInput,
				JavaUtils.getRandomString(10) + JavaUtils.getRandomNumber(5));
	}

	public void clickOnDiagnosticTests() {
		clickElement(PatientProfilePageLocators.btn_DiagnosticTestsButton);
	}

	public void selectRadioOptionFromDiagnosticTestsPopup(String radioValue) {
		clickElement(CustomizedLocators.getDiagnosticTestsRadioButtonByValue(radioValue));
		diagnosticTestsValue = radioValue;
		System.out.println("diagnosticTestsValue: " + diagnosticTestsValue);
	}

	public void selectCurrentDateFromCalendar() {
		clickElement(PatientProfilePageLocators.lnk_DiagnosticTestsCalendarCurrentDate);
	}

	public void verifySelectedDiagnosticTestsValue() {
		String actualVal = getElementText(PatientProfilePageLocators.css_DiagnosticTestsSelectedproductList).trim();
		highLightElement(PatientProfilePageLocators.css_DiagnosticTestsSelectedproductList);
		System.out.println("SelectedDiagnosticActualVal: " + actualVal);
		System.out.println("Actual CurrentDate: " + JavaUtils.getCurrentDate("dd-MMM-yyyy"));

		Assert.assertTrue(actualVal + ": != :" + diagnosticTestsValue, actualVal.contains(diagnosticTestsValue));
		Assert.assertTrue(actualVal + ": != :" + JavaUtils.getCurrentDate("dd-MMM-yyyy"),
				actualVal.contains(JavaUtils.getCurrentDate("dd-MMM-yyyy")));
	}

	public void clickOnAlbuminAndPrealbuminTestsOptions(String fieldOption) {
		try {
			clickElement(CustomizedLocators.getAlbuminAndPrealbuminTestsLocatorByOption(fieldOption));
		} catch (Throwable t) {
			System.out.println("Element Click Failure on scroll issue..");
			clickElementWithJQuery(CustomizedLocators.getAlbuminAndPrealbuminTestsLocatorByOption(fieldOption));
		}
	}

	public void enterNumericValueOnPopup(String popup) {
		String val = JavaUtils.getRandomNumber(1);
		System.out.println("Fill Value: " + val);
		clear(PatientProfilePageLocators.txt_AlbuminAndPrealbuminTestsPopupInput);
		sendKeys(PatientProfilePageLocators.txt_AlbuminAndPrealbuminTestsPopupInput, val);

		switch (popup) {
		case PixalereStringPool.ALBUMIN_G_L:
			albuminValue = val;
			System.out.println(PixalereStringPool.ALBUMIN_G_L + ": " + albuminValue);
			break;

		case PixalereStringPool.PREALBUMIN_MG_L:
			prealbuminValue = val;
			System.out.println(PixalereStringPool.PREALBUMIN_MG_L + ": " + prealbuminValue);
			break;

		case PixalereStringPool.BLOOD_GLUCOSE_MMOL_L:
			bloodGlucoseValue = val;
			System.out.println(PixalereStringPool.BLOOD_GLUCOSE_MMOL_L + ": " + bloodGlucoseValue);
			break;

		case PixalereStringPool.BLOOD_GLUCOSE_TIME:
			bloodGlucoseTimeValue = val;
			System.out.println(PixalereStringPool.BLOOD_GLUCOSE_TIME + ": " + bloodGlucoseTimeValue);
			break;

		case PixalereStringPool.PURS_SCORE:
			pursScoreValue = val;
			System.out.println(PixalereStringPool.PURS_SCORE + ": " + pursScoreValue);
			break;
		}
	}

	public void verifyNumericValueAsPerFieldOption(String fieldOption) {
		String actualVal = getElementText(
				CustomizedLocators.getAlbuminAndPrealbuminTestsSelectedNumericValue(fieldOption)).trim();
		highLightElement(CustomizedLocators.getAlbuminAndPrealbuminTestsSelectedNumericValue(fieldOption));
		System.out.println("SelectedActualVal: " + actualVal);

		switch (fieldOption) {
		case PixalereStringPool.ALBUMIN_G_L:
			Assert.assertTrue(actualVal + ": != :" + albuminValue, actualVal.contains(albuminValue));
			break;

		case PixalereStringPool.PREALBUMIN_MG_L:
			Assert.assertTrue(actualVal + ": != :" + prealbuminValue, actualVal.contains(prealbuminValue));
			break;

		case PixalereStringPool.BLOOD_GLUCOSE_MMOL_L:
			Assert.assertTrue(actualVal + ": != :" + bloodGlucoseValue, actualVal.contains(bloodGlucoseValue));
			break;

		case PixalereStringPool.BLOOD_GLUCOSE_TIME:
			Assert.assertTrue(actualVal + ": != :" + bloodGlucoseTimeValue, actualVal.contains(bloodGlucoseTimeValue));
			break;

		case PixalereStringPool.PURS_SCORE:
			Assert.assertTrue(actualVal + ": != :" + pursScoreValue, actualVal.contains(pursScoreValue));
			break;
		}
	}

	public void selectCurrentDateAsPerFieldOption(String fieldOption) {

		switch (fieldOption) {
		case PixalereStringPool.ALBUMIN_G_L:
			clickElement(PatientProfilePageLocators.btn_AlbuminSelectDate);
			break;

		case PixalereStringPool.PREALBUMIN_MG_L:
			clickElement(PatientProfilePageLocators.btn_PrealbuminSelectDate);
			break;

		case PixalereStringPool.BLOOD_GLUCOSE_MMOL_L:
			clickElement(PatientProfilePageLocators.btn_BloodGlucoseSelectDate);
			break;

		case PixalereStringPool.DATE_OF_SURGERY:
			if (isNewUser)
				clickElement(AssessmentPageLocators.btn_DateOfSurgerySelectDate);
			break;
		}

		if (isNewUser)
			clickElement(PatientProfilePageLocators.lnk_AlbuminAndPrealbuminTestsCalendarCurrentDate);
	}

	public void selectDateOfSurgery() {
		if (isNewUser) {
			String day = null, month = null, year = null;
			day = JavaUtils.getReturnDate("Days", "Current");
			month = JavaUtils.getReturnDate("Month", "Current");
			year = JavaUtils.getReturnDate("Year", "Current");

			selectByVisibleText(AssessmentPageLocators.drp_DateOfSurgeryDaysDropdown, day);
			selectByVisibleText(AssessmentPageLocators.drp_DateOfSurgeryMonthDropdown, month);
			clear(AssessmentPageLocators.txt_DateOfSurgeryYearInput);
			sendKeys(AssessmentPageLocators.txt_DateOfSurgeryYearInput, year);
		}
	}

	public void verifySelectedDateAsPerFieldOption(String fieldOption) {
		String actualDate = null;
		String expectedDate = JavaUtils.getCurrentDate("dd-MMM-yyyy");
		System.out.println("expectedDate: " + expectedDate);

		switch (fieldOption) {
		case PixalereStringPool.ALBUMIN_G_L:
			highLightElement(PatientProfilePageLocators.ele_AlbuminSelectedDate);
			actualDate = getElementText(PatientProfilePageLocators.ele_AlbuminSelectedDate).trim();
			System.out.println(PixalereStringPool.ALBUMIN_G_L + " Date: " + actualDate);
			break;

		case PixalereStringPool.PREALBUMIN_MG_L:
			highLightElement(PatientProfilePageLocators.ele_PrealbuminSelectedDate);
			actualDate = getElementText(PatientProfilePageLocators.ele_PrealbuminSelectedDate).trim();
			System.out.println(PixalereStringPool.PREALBUMIN_MG_L + " Date: " + actualDate);
			break;

		case PixalereStringPool.BLOOD_GLUCOSE_MMOL_L:
			highLightElement(PatientProfilePageLocators.ele_BloodGlucoseSelectedDate);
			actualDate = getElementText(PatientProfilePageLocators.ele_BloodGlucoseSelectedDate).trim();
			System.out.println(PixalereStringPool.BLOOD_GLUCOSE_MMOL_L + " Date: " + actualDate);
			break;

		case PixalereStringPool.DATE_OF_SURGERY:
			if (isNewUser) {
				highLightElement(AssessmentPageLocators.ele_DateOfSurgerySelectedDate);
				actualDate = getElementText(AssessmentPageLocators.ele_DateOfSurgerySelectedDate).trim();
				System.out.println(PixalereStringPool.DATE_OF_SURGERY + " Date: " + actualDate);
			}
			break;
		}
		if (isNewUser) {
			if (actualDate.contains("Sept"))
				actualDate = actualDate.replace("Sept", "Sep");
			Assert.assertTrue(actualDate + ": !=: " + expectedDate, actualDate.contains(expectedDate));
		}
	}

	/**
	 * 
	 * Create New Patient
	 * 
	 */
	public void createNewPatient() {

		if (isNewUser) {
			navigateToAdministrationPanelOption("Administration -> Patient Accounts");
			clickOnSearchButton();
			enterInputFieldAsPerKey(PixalereStringPool.LAST_NAME);
			enterInputFieldAsPerKey(PixalereStringPool.FIRST_NAME);
			enterInputFieldAsPerKey(PixalereStringPool.MIDDLE_NAME);
			selectDropdownValue("Gender", "Male");
			selectDateOfBirth("1990");
			enterInputFieldAsPerKey(PixalereStringPool.CIN);
			enterInputFieldAsPerKey(PixalereStringPool.ALLERGIES);
			enterInputFieldAsPerKey(PixalereStringPool.HOME_ADDRESS);
			enterInputFieldAsPerKey(PixalereStringPool.CITY);
			enterInputFieldAsPerKey(PixalereStringPool.STATE_PROVINCE);
			enterInputFieldAsPerKey(PixalereStringPool.ZIP_CODE_POSTAL_CODE);
			selectDropdownValue("Treatment Area", "PUG");
			selectDropdownValue("Treatment Location", "Pixalere User Group");

			if (isDisplayed(PatientAccountsPageLocators.txt_PrimaryInsuranceCarrierInput)) {
				sendKeys(PatientAccountsPageLocators.txt_PrimaryInsuranceCarrierInput, JavaUtils.getRandomString(10));
				sendKeys(PatientAccountsPageLocators.txt_PrimaryInsurancePolicyHolderNameInput,
						JavaUtils.getRandomString(7));
				sendKeys(PatientAccountsPageLocators.txt_PrimaryInsurancePolicyInput,
						JavaUtils.getRandomString(5) + JavaUtils.getRandomNumber(3));
				sendKeys(PatientAccountsPageLocators.txt_PrimaryInsuranceGroupInput,
						JavaUtils.getRandomString(5) + JavaUtils.getRandomNumber(3));
			}
			clickOnCreatePatientAccountButton();
		} else
			searchPatient();
		System.out.println("CINID: " + CINID);
	}

	/**
	 * 
	 * Accept Patient Consent
	 * 
	 */
	public void acceptPatientConsent() {
		if (isNewUser) {
			clickLinkWithText("click here");
			verifyOpenedConsentWindow();
			selectConsentOptionAndSave("Yes", "Save");
			verifyConsentMessageOnWindowClose("disappear");
		}
	}
}
