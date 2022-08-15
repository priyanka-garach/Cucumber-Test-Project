package pixalere.scripts;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;

import pixalere.pageObjectUtils.LocatorUtils.CustomizedLocators;
import pixalere.pageObjectUtils.LocatorUtils.PTAssessment;
import pixalere.pageObjectUtils.PixalereCommonUtils;

public class PixalerePTAssessmentScripts extends PixalereCommonUtils {

	public static List<String> AssessmentInitiated = new ArrayList<>();
	public static List<String> HomeAccessibility = new ArrayList<>();
	public static List<String> PostureAssessed = new ArrayList<>();
	public static List<String> Edema = new ArrayList<>();
	public static List<String> SkinIntegrity = new ArrayList<>();
	public static List<String> Quality = new ArrayList<>();
	public static List<String> PainFactors = new ArrayList<>();
	public static List<String> AssessmentInformation = new ArrayList<>();
	public static List<String> Mobility = new ArrayList<>();
	
	public void clickOnAssessmentTabs(String section) {
		if(section.contains("Assessment Initiated")) {
			clickElementWithJQuery(By.xpath("//a[@id='assessInitiated_arrow']//img"));
		}
		else if(section.contains("Home Accessibility & Social Situation Assessed")) {
			clickElementWithJQuery(By.xpath("//a[@id='homeAssess_arrow']//img"));
		}
		else if(section.contains("Medication Use Assessed")) {
			clickElementWithJQuery(By.xpath("//a[@id='medicationUsed_arrow']//img"));
		}
		else if(section.contains("Posture Assessed")) {
			clickElementWithJQuery(By.xpath("//a[@id='posture_arrow']//img"));
		}
		else if(section.contains("Edema/Skin Assessed")) {
			clickElementWithJQuery(By.xpath("//a[@id='skinAssessed_arrow']//img"));
		}		
		else if(section.contains("Pain Assessed")) {
			clickElementWithJQuery(By.xpath("//a[@id='painAssess_arrow']//img"));
		}
		else if(section.contains("Mobility Assessed")) {
			clickElementWithJQuery(By.xpath("//a[@id='mobilityAssess_arrow']//img"));
		}
		else if(section.contains("Stair use Assessed")) {
			clickElementWithJQuery(By.xpath("//a[@id='stairUsed_arrow']//img"));
		}
		else if(section.contains("Balance Assessed")) {
			clickElementWithJQuery(By.xpath("//a[@id='balanceAssess_arrow']//img"));
		}
		else if(section.contains("Musculoskeletal Status")) {
			clickElementWithJQuery(By.xpath("//a[@id='mskStatus_arrow']//img"));
		}
		else if(section.contains("Respiratory")) {
			clickElementWithJQuery(By.xpath("//a[@id='repiratory_arrow']//img"));
		}
		else if(section.contains("Neurological")) {
			clickElementWithJQuery(By.xpath("//a[@id='neurologicalLabel_arrow']//img"));
		}
		else if(section.contains("Cognition")) {
			clickElementWithJQuery(By.xpath("//a[@id='cognitionLabel_arrow']//img"));
		}
		else if(section.contains("Analysis & Recommendations")) {
			clickElementWithJQuery(By.xpath("//a[@id='analysisList_arrow']//img"));
		}
	}	
	public void selectRadioOptionForInitiating_service(String section) {
		clickElementWithJQuery(CustomizedLocators.getRadioOptionByInitiating_service(section));
	}
	public void selectRadioOptionForScope_of_service(String section) {
		clickElementWithJQuery(CustomizedLocators.getRadioOptionByScope_of_service(section));
	}
	public void selectRadioOptionForAcute_Respiratory_Screen(String section) {
		clickElementWithJQuery(CustomizedLocators.getRadioOptionByAcute_Respiratory_Screen(section));
	}
	public void selectRadioOptionForLHIN_referral(String section) {
		clickElementWithJQuery(CustomizedLocators.getRadioOptionByLHIN_referral(section));
	}
	public void selectRadioOptionForScope_of_practice(String section) {
		clickElementWithJQuery(CustomizedLocators.getRadioOptionByScope_of_practice(section));
	}
	public void selectRadioOptionForVerbal_consent(String section) {
		clickElementWithJQuery(CustomizedLocators.getRadioOptionByVerbal_consent(section));
	}
	public void selectRadioOptionForStudent_participating(String section) {
		clickElementWithJQuery(CustomizedLocators.getRadioOptionByStudent_participating(section));
	}
	public void selectRadioOptionForHousing(String section) {
		clickElementWithJQuery(CustomizedLocators.getRadioOptionByHousing(section));
	}
	public void selectRadioOptionForEvidence(String section) {
		clickElementWithJQuery(CustomizedLocators.getRadioOptionByEvidence(section));
	}
	public void selectRadioOptionForFunctionalAccessibility(String section) {
		clickElementWithJQuery(CustomizedLocators.getRadioOptionByFunctionalAccessibility(section));
	}
	public void selectRadioOptionForMedicationUse(String section) {
		clickElementWithJQuery(CustomizedLocators.getRadioOptionByMedicationUse(section));
	}
	public void selectRadioOptionForPostureAssessed(String section) {
		clickElementWithJQuery(CustomizedLocators.getRadioOptionByPostureAssessed(section));
	}
	public void selectRadioOptionForEdema(String section) {
		clickElementWithJQuery(CustomizedLocators.getRadioOptionByEdema(section));
	}
	public void selectRadioOptionForSkinIntegrity(String section) {
		clickElementWithJQuery(CustomizedLocators.getRadioOptionBySkinIntegrity(section));
	}
	public void selectRadioOptionForPainAssessment(String section) {
		clickElementWithJQuery(CustomizedLocators.getRadioOptionByPainAssessment(section));
	}
	public void selectRadioOptionForDuration(String section) {
		clickElementWithJQuery(CustomizedLocators.getRadioOptionByDuration(section));
	}
	public void selectRadioOptionForFrequency(String section) {
		clickElementWithJQuery(CustomizedLocators.getRadioOptionByFrequency(section));
	}
	public void selectRadioOptionForMSK(String section) {
		clickElementWithJQuery(CustomizedLocators.getRadioOptionByMSK(section));
	}
	public void selectRadioOptionForRespiratory(String section) {
		clickElementWithJQuery(CustomizedLocators.getRadioOptionByRespiratory(section));
	}
	public void selectRadioOptionForNeurological(String section) {
		clickElementWithJQuery(CustomizedLocators.getRadioOptionByNeurological(section));
	}
	public void selectRadioOptionForCognitiveFunctioning(String section) {
		clickElementWithJQuery(CustomizedLocators.getRadioOptionByCognitiveFunctioning(section));
	}
	public void selectRadioOptionForAffectiveFunctioning(String section) {
		clickElementWithJQuery(CustomizedLocators.getRadioOptionByAffectiveFunctioning(section));
	}
	public void selectRadioOptionForCognition(String section) {
		clickElementWithJQuery(CustomizedLocators.getRadioOptionByCognition(section));
	}
	public void selectRadioOptionForPTService(String section) {
		clickElementWithJQuery(CustomizedLocators.getRadioOptionByPTService(section));
	}
	public void selectRadioOptionForAssessmentresults(String section) {
		clickElementWithJQuery(CustomizedLocators.getRadioOptionByAssessmentresults(section));
	}
	public void selectRadioOptionForConversationcompleted(String section) {
		clickElementWithJQuery(CustomizedLocators.getRadioOptionByConversationcompleted(section));
	}
	public void selectRadioOptionForWelcomeBrochure(String section) {
		clickElementWithJQuery(CustomizedLocators.getRadioOptionByWelcomeBrochure(section));
	}
	public void selectRadioOptionForClientEmergency(String section) {
		clickElementWithJQuery(CustomizedLocators.getRadioOptionByClientEmergency(section));
	}
	public void selectRadioOptionForBedMobility(String section) {
		clickElementWithJQuery(CustomizedLocators.getRadioOptionByBedMobility(section));
	}
	public void selectRadioOptionForChairRipositioning(String section) {
		clickElementWithJQuery(CustomizedLocators.getRadioOptionByChairRipositioning(section));
	}
	public void selectRadioOptionForTransfers(String section) {
		clickElementWithJQuery(CustomizedLocators.getRadioOptionByTransfers(section));
	}
	public void selectRadioOptionForAmbulation(String section) {
		clickElementWithJQuery(CustomizedLocators.getRadioOptionByAmbulation(section));
	}
	public void selectRadioOptionForWeightBearingStatus(String section) {
		clickElementWithJQuery(CustomizedLocators.getRadioOptionByWeightBearingStatus(section));
	}
	public void selectRadioOptionForStairUseAssessed(String section) {
		clickElementWithJQuery(CustomizedLocators.getRadioOptionByStairUseAssessed(section));
	}
	public void selectRadioOptionForSittingBalance(String section) {
		clickElementWithJQuery(CustomizedLocators.getRadioOptionBySittingBalance(section));
	}
	public void selectRadioOptionForStandingBalance(String section) {
		clickElementWithJQuery(CustomizedLocators.getRadioOptionByStandingBalance(section));
	}
	
	public void selectAssessmentInitiatedCheckbox(String section) {
		if(section.contains("Investigations/follow-up clinically relevant")) {
			clickElementWithJQuery(PTAssessment.chk_Investigations);
			AssessmentInitiated.add(section);
		}
		else if(section.contains("Activities avoided for fear of falling")) {
			clickElementWithJQuery(PTAssessment.chk_Activity_avoided);
			AssessmentInitiated.add(section);
		}
		else if(section.contains("↓ Hearing (that impacts falls safety)")) {
			clickElementWithJQuery(PTAssessment.chk_Hearing);
			AssessmentInitiated.add(section);
		}
		else if(section.contains("Foot problems")) {
			clickElementWithJQuery(PTAssessment.chk_Foot_Problem);
			AssessmentInitiated.add(section);
		}
		else if(section.contains("Dizziness/ lightheadedness")) {
			clickElementWithJQuery(PTAssessment.chk_Dizziness);
			AssessmentInitiated.add(section);
		}
		else if(section.contains("Blood pressure out of normal range")) {
			clickElementWithJQuery(PTAssessment.chk_Blood_pressure);
			AssessmentInitiated.add(section);
		}
		
	}
	
	public void selectHomeAccessibilityCheckbox(String section) {
		if(section.contains("Partner")) {
			clickElementWithJQuery(PTAssessment.chk_Partner);
			HomeAccessibility.add(section);
		}
		else if(section.contains("Family")) {
			clickElementWithJQuery(PTAssessment.chk_Family);
			HomeAccessibility.add(section);
		}
		else if(section.contains("Partner/family")) {
			clickElementWithJQuery(PTAssessment.chk_family);
			HomeAccessibility.add(section);
		}
		else if(section.contains("Private caregiver")) {
			clickElementWithJQuery(PTAssessment.chk_Private_caregiver);
			HomeAccessibility.add(section);
		}
		
	}
	public void selectPostureAssessedCheckbox(String section) {
		if(section.contains("Scoliosis")) {
			clickElementWithJQuery(PTAssessment.chk_Scoliosis);
			PostureAssessed.add(section);
		}
		else if(section.contains("Kyphosis")) {
			clickElementWithJQuery(PTAssessment.chk_Kyphosis);
			PostureAssessed.add(section);
		}
		else if(section.contains("Lordosis")) {
			clickElementWithJQuery(PTAssessment.chk_Lordosis);
			PostureAssessed.add(section);
		}
		else if(section.contains("Pelvic tilt")) {
			clickElementWithJQuery(PTAssessment.chk_Pelvic_tilt);
			PostureAssessed.add(section);
		}
	}
	public void selectEdemaCheckbox(String section) {
			if(section.contains("Moderate")) {
				clickElementWithJQuery(PTAssessment.chk_Moderate);
				Edema.add(section);
			}
			else if(section.contains("Pitting")) {
				clickElementWithJQuery(PTAssessment.chk_Pitting);
				Edema.add(section);
			}
	}
	public void selectSkinIntegrityCheckbox(String section) {
		if(section.contains("Set personal reminder to complete Braden")) {
			clickElementWithJQuery(PTAssessment.chk_Set_personal_reminder);
			SkinIntegrity.add(section);
		}
		else if(section.contains("Incision")) {
			clickElementWithJQuery(PTAssessment.chk_Incision);
			SkinIntegrity.add(section);
		}
		else if(section.contains("↑ Risk for skin breakdown")) {
			clickElementWithJQuery(PTAssessment.chk_Risk_for_skin);
			SkinIntegrity.add(section);
		}
		else if(section.contains("Unrelieved pressure")) {
			clickElementWithJQuery(PTAssessment.chk_Unrelieved_pressure);
			SkinIntegrity.add(section);
		}
		else if(section.contains("Inability to weight shift")) {
			clickElementWithJQuery(PTAssessment.chk_Inability_to_weight_shift);
			SkinIntegrity.add(section);
		}
		else if(section.contains("Moisture")) {
			clickElementWithJQuery(PTAssessment.chk_Moisture);
			SkinIntegrity.add(section);
		}
		else if(section.contains("Immobility")) {
			clickElementWithJQuery(PTAssessment.chk_Immobility);
			SkinIntegrity.add(section);
		}
		else if(section.contains("History of skin breakdown")) {
			clickElementWithJQuery(PTAssessment.chk_History_of_skin_breakdown);
			SkinIntegrity.add(section);
		}
	}
	public void selectQualityCheckbox(String section) {
		if(section.contains("Aching")) {
			clickElementWithJQuery(PTAssessment.chk_Aching);
			Quality.add(section);
		}
		else if(section.contains("Sharp")) {
			clickElementWithJQuery(PTAssessment.chk_Sharp);
			Quality.add(section);
		}
		else if(section.contains("Burning")) {
			clickElementWithJQuery(PTAssessment.chk_Burning);
			Quality.add(section);
		}
		else if(section.contains("Pressure")) {
			clickElementWithJQuery(PTAssessment.chk_Pressure);
			Quality.add(section);
		}
		else if(section.contains("Radiating")) {
			clickElementWithJQuery(PTAssessment.chk_Radiating);
			Quality.add(section);
		}
		else if(section.contains("Shooting")) {
			clickElementWithJQuery(PTAssessment.chk_Shooting);
			Quality.add(section);
		}
	}
	public void selectPainFactorsCheckbox(String section) {
		if(section.contains("Sleep and rest")) {
			clickElementWithJQuery(PTAssessment.chk_Sleep_and_rest);
			PainFactors.add(section);
		}
		else if(section.contains("Emotions")) {
			clickElementWithJQuery(PTAssessment.chk_Emotions);
			PainFactors.add(section);
		}
		else if(section.contains("Social activities")) {
			clickElementWithJQuery(PTAssessment.chk_Social_activities);
			PainFactors.add(section);
		}
		else if(section.contains("Concentration")) {
			clickElementWithJQuery(PTAssessment.chk_Concentration);
			PainFactors.add(section);
		}
		else if(section.contains("Appetite")) {
			clickElementWithJQuery(PTAssessment.chk_Appetite);
			PainFactors.add(section);
		}
		else if(section.contains("Intimacy")) {
			clickElementWithJQuery(PTAssessment.chk_Intimacy);
			PainFactors.add(section);
		}
		else if(section.contains("Work")) {
			clickElementWithJQuery(PTAssessment.chk_Work);
			PainFactors.add(section);
		}
		else if(section.contains("Mobility")) {
			clickElementWithJQuery(PTAssessment.chk_Mobility);
			PainFactors.add(section);
		}
		else if(section.contains("Palliating Factors")) {
			clickElementWithJQuery(PTAssessment.chk_Palliating_Factors);
			PainFactors.add(section);
		}
		else if(section.contains("Aggravating Factors")) {
			clickElementWithJQuery(PTAssessment.chk_Aggravating_Factors);
			PainFactors.add(section);
		}
	}
	public void selectAssessmentInformationCheckbox(String section) {
		if(section.contains("Referral source")) {
			clickElementWithJQuery(PTAssessment.chk_Referral_source);
			AssessmentInformation.add(section);
		}
		else if(section.contains("Client")) {
			clickElementWithJQuery(PTAssessment.chk_Client);
			AssessmentInformation.add(section);
		}
		else if(section.contains("One or more MAHC factors")) {
			clickElementWithJQuery(PTAssessment.chk_MAHC_factors);
			AssessmentInformation.add(section);
		}
		else if(section.contains("HEP provided")) {
			clickElementWithJQuery(PTAssessment.chk_HEP_provided);
			AssessmentInformation.add(section);
		}
	}
	public void selectMobilityFromCheckbox(String section) {
		if(section.contains("TUG (Time Up and Go)")) {
			clickElementWithJQuery(PTAssessment.chk_TUG);
			Mobility.add(section);
		}
		else if(section.contains("U_Rollator")) {
			clickElementWithJQuery(PTAssessment.chk_U_Rollator);
			Mobility.add(section);
		}
		else if(section.contains("R_Single point cane")) {
			clickElementWithJQuery(PTAssessment.chk_R_Single_point_cane);
			Mobility.add(section);
		}
		else if(section.contains("D_Quad cane")) {
			clickElementWithJQuery(PTAssessment.chk_D_Quad_cane);
			Mobility.add(section);
		}
		else if(section.contains("U_Bed Rails")) {
			clickElementWithJQuery(PTAssessment.chk_U_Bed_Rails);
			Mobility.add(section);
		}
		else if(section.contains("R_Transfer Board")) {
			clickElementWithJQuery(PTAssessment.chk_R_Transfer_Board);
			Mobility.add(section);
		}
		else if(section.contains("D_Furniture Risers")) {
			clickElementWithJQuery(PTAssessment.chk_D_Furniture_Risers);
			Mobility.add(section);
		}
		else if(section.contains("D_Toilet safety arms")) {
			clickElementWithJQuery(PTAssessment.chk_D_Toilet_safety_arms);
			Mobility.add(section);
		}
		else if(section.contains("U_Grab bars")) {
			clickElementWithJQuery(PTAssessment.chk_U_Grab_bars);
			Mobility.add(section);
		}
		else if(section.contains("R_Tub rail")) {
			clickElementWithJQuery(PTAssessment.chk_R_Tub_rail);
			Mobility.add(section);
		}
		else if(section.contains("D_Stairglide")) {
			clickElementWithJQuery(PTAssessment.chk_D_Stairglide);
			Mobility.add(section);
		}
		else if(section.contains("R_Supervision on stairs")) {
			clickElementWithJQuery(PTAssessment.chk_R_Supervision_on_stairs);
			Mobility.add(section);
		}
		else if(section.contains("U_Assistance on stairs x1")) {
			clickElementWithJQuery(PTAssessment.chk_U_Assistance_on_stairs_x1);
			Mobility.add(section);
		}
		else if(section.contains("30 seconds Sit-stand")) {
			clickElementWithJQuery(PTAssessment.chk_30_seconds_Sit_stand);
			Mobility.add(section);
		}
		else if(section.contains("30 second sit-stand Test")) {
			clickElementWithJQuery(PTAssessment.chk_30_second_sit_stand_Test);
			Mobility.add(section);
		}
	}
}