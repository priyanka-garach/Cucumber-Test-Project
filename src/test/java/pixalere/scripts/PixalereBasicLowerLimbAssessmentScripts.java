package pixalere.scripts;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;

import pixalere.pageObjectUtils.LocatorUtils.BasicLowerLimbLocator;
import pixalere.pageObjectUtils.LocatorUtils.CustomizedLocators;
import pixalere.pageObjectUtils.PixalereCommonUtils;

public class PixalereBasicLowerLimbAssessmentScripts extends PixalereCommonUtils {

	public static String Right_no_amputations = null;
	public static String Right_leg_bk = null;
	public static String Right_foot_ball = null;
	public static String Right_second_toe = null;
	public static String Right_fourth_toe = null;
	public static String Right_leg_ak = null;
	public static String Right_foot_partial = null;
	public static String Right_great_toe = null;
	public static String Right_third_toe = null;
	public static String Right_fifth_toe = null;

	public static String Left_no_amputations = null;
	public static String Left_leg_bk = null;
	public static String Left_foot_ball = null;
	public static String Left_second_toe = null;
	public static String Left_fourth_toe = null;
	public static String Left_leg_ak = null;
	public static String Left_foot_partial = null;
	public static String Left_great_toe = null;
	public static String Left_third_toe = null;
	public static String Left_fifth_toe = null;

	public static String Right_dry_flaky = null;
	public static String Right_Rash_present = null;
	public static String Right_Weepy = null;

	public static String Left_dry_flaky = null;
	public static String Left_Rash_present = null;
	public static String Left_Weepy = null;

	public static String Right_Burning = null;
	public static String Right_Crawling = null;
	public static String Left_Crawling = null;
	public static String Left_Burning = null;

	public static String Right_No_pain = null;
	public static String Left_No_pain = null;

	public static List<String> list = new ArrayList<>();
	public static List<String> listLeftMissingLimbsorToes = new ArrayList<>();
	public static List<String> list_Right_Derm_Assessment = new ArrayList<>();
	public static List<String> list_Left_Derm_Assessment = new ArrayList<>();

	public static List<String> list_Right_Monofilament_Testing = new ArrayList<>();
	public static List<String> list_Left_Monofilament_Testing = new ArrayList<>();

	public static List<String> list_Right_Pain_Assessment_field = new ArrayList<>();
	public static List<String> list_Left_Pain_Assessment_field = new ArrayList<>();

	public void selectRadioOptionForLowerRightLegSkinColor(String value, String section) {
		clickElement(CustomizedLocators.getRadioOptionByLowerLegSkinColor(value, section));
	}

	public void selectRadioOptionForFootSkinColor(String value, String section) {
		clickElement(CustomizedLocators.getRadioOptionByFootSkinColor(value, section));
	}

	public void selectRadioOptionForToesSkinColor(String value, String section) {
		clickElement(CustomizedLocators.getRadioOptionByToesSkinColor(value, section));
	}

	public void selectRadioOptionForLowerLegSkinWarmth(String value, String section) {
		clickElement(CustomizedLocators.getRadioOptionByLowerLegSkinWarmth(value, section));
	}

	public void selectRadioOptionForFootSkinWarmth(String value, String section) {
		clickElement(CustomizedLocators.getRadioOptionByFootSkinWarmth(value, section));
	}

	public void selectRadioOptionForToesSkinWarmth(String value, String section) {
		clickElement(CustomizedLocators.getRadioOptionByToesSkinWarmth(value, section));
	}

	public void selectRadioOptionForDorsalisPedisPulsesbyPalpationfield(String value, String section) {
		clickElement(CustomizedLocators.getRadioOptionByDorsalisPedisPulsesbyPalpationfield(value, section));
	
	}

	public void selectRadioOptionForPosteriorTibialPulsesbyPalpationfield(String value, String section) {
		clickElement(CustomizedLocators.getRadioOptionByPosteriorTibialPulsesbyPalpationfield(value, section));	
	}

	public void selectradioLess_than_equaltoThreesecsCapillaryRefillfield(String value) {
		clickElement(CustomizedLocators.getRadioOptionByLess_than_equaltoThreesecsCapillaryRefillfield(value));
	}

	public void selectradioLess_than_equaltoThreesecsCapillaryRefillfield_Two(String value) {
		clickElement(CustomizedLocators.getRadioOptionByLess_than_equaltoThreesecsCapillaryRefillfield_Two(value));
	}

	public void selectRadioOptionForKneeRange_Motion_field(String value, String section) {
		clickElement(CustomizedLocators.getRadioOptionByLess_KneeRange_Motion_field(value, section));
	}

	public void selectRadioOptionForAnkleRange_Motion_field(String value, String section) {
		clickElement(CustomizedLocators.getRadioOptionByLess_AnkleRange_Motion_field(value, section));
	}

	public void selectRadioOptionForEdema_Location(String value, String section) {
		clickElement(CustomizedLocators.getRadioOptionByEdema_Location(value, section));
	
	}

	public void selectRadioOptionForEdema_Severity_field(String value, String section) {
		clickElement(CustomizedLocators.getRadioOptionByEdema_severity_field(value, section));
		
	}

	public void selectRightMissingLimbsorToesCheckBox(String section) {

		if (section.contains("No amputations")) {
			Right_no_amputations = "No amputations";
			String xpath1 = String.format(BasicLowerLimbLocator.chk_right_missing_limbs_toes, Right_no_amputations);
			clickElementWithJQuery(By.xpath(xpath1));
			list.add(Right_no_amputations);
		}

		else if (section.contains("Leg b/k")) {
			Right_leg_bk = "Leg b/k";
			String xpath2 = String.format(BasicLowerLimbLocator.chk_right_missing_limbs_toes, Right_leg_bk);
			clickElementWithJQuery(By.xpath(xpath2));
			list.add(Right_leg_bk);
		}

		else if (section.contains("Foot all")) {
			Right_foot_ball = "Foot all";
			String xpath2 = String.format(BasicLowerLimbLocator.chk_right_missing_limbs_toes, Right_foot_ball);
			clickElementWithJQuery(By.xpath(xpath2));
			list.add(Right_foot_ball);
		}

		else if (section.contains("Second toe")) {
			Right_second_toe = "Second toe";
			String xpath2 = String.format(BasicLowerLimbLocator.chk_right_missing_limbs_toes, Right_second_toe);
			clickElementWithJQuery(By.xpath(xpath2));
			list.add(Right_second_toe);
		} else if (section.contains("Fourth toe")) {
			Right_fourth_toe = "Fourth toe";
			String xpath2 = String.format(BasicLowerLimbLocator.chk_right_missing_limbs_toes, Right_fourth_toe);
			clickElementWithJQuery(By.xpath(xpath2));
			list.add(Right_fourth_toe);
		} else if (section.contains("Leg a/k")) {
			Right_leg_ak = "Leg a/k";
			String xpath2 = String.format(BasicLowerLimbLocator.chk_right_missing_limbs_toes, Right_leg_ak);
			clickElementWithJQuery(By.xpath(xpath2));
			list.add(Right_leg_ak);
		}

		else if (section.contains("Foot partial")) {
			Right_foot_partial = "Foot partial";
			String xpath2 = String.format(BasicLowerLimbLocator.chk_right_missing_limbs_toes, Right_foot_partial);
			clickElementWithJQuery(By.xpath(xpath2));
			list.add(Right_foot_partial);
		} else if (section.contains("Great toe")) {
			Right_great_toe = "Great toe";
			String xpath2 = String.format(BasicLowerLimbLocator.chk_right_missing_limbs_toes, Right_great_toe);
			clickElementWithJQuery(By.xpath(xpath2));
			list.add(Right_great_toe);
		} else if (section.contains("Third toe")) {
			Right_third_toe = "Third toe";
			String xpath2 = String.format(BasicLowerLimbLocator.chk_right_missing_limbs_toes, Right_third_toe);
			clickElementWithJQuery(By.xpath(xpath2));
			list.add(Right_third_toe);
		}

		else {
			Right_fifth_toe = "Fifth toe";
			String xpath2 = String.format(BasicLowerLimbLocator.chk_right_missing_limbs_toes, Right_fifth_toe);
			clickElementWithJQuery(By.xpath(xpath2));
			list.add(Right_fifth_toe);
		}

	}

	public void selectRightDermAssessmentfieldCheckBox(String section) {

		if (section.contains("Dryflaky")) {
			Right_dry_flaky = "Dry/flaky";
			String xpath1 = String.format(BasicLowerLimbLocator.chk_derm_assess_right, Right_dry_flaky);
			clickElementWithJQuery(By.xpath(xpath1));
			list_Right_Derm_Assessment.add(Right_dry_flaky);
		} else if (section.contains("Rash present")) {
			Right_Rash_present = "Rash present";
			String xpath1 = String.format(BasicLowerLimbLocator.chk_derm_assess_right, Right_Rash_present);
			clickElementWithJQuery(By.xpath(xpath1));
			list_Right_Derm_Assessment.add(Right_Rash_present);

		} else {
			Right_Weepy = "Weepy";
			String xpath1 = String.format(BasicLowerLimbLocator.chk_derm_assess_right, Right_Weepy);
			clickElementWithJQuery(By.xpath(xpath1));
			list_Right_Derm_Assessment.add(Right_Weepy);
		}
	}

	public void selectLeftDermAssessmentfieldCheckBox(String section) {

		if (section.contains("Dryflaky")) {
			Left_dry_flaky = "Dry/flaky";
			String xpath1 = String.format(BasicLowerLimbLocator.chk_derm_assess_left, Left_dry_flaky);
			clickElementWithJQuery(By.xpath(xpath1));
			list_Left_Derm_Assessment.add(Left_dry_flaky);

		} else if (section.contains("Rash present")) {
			Left_Rash_present = "Rash present";
			String xpath1 = String.format(BasicLowerLimbLocator.chk_derm_assess_left, Left_Rash_present);
			clickElementWithJQuery(By.xpath(xpath1));
			list_Left_Derm_Assessment.add(Left_Rash_present);

		} else {
			Left_Weepy = "Weepy";
			String xpath1 = String.format(BasicLowerLimbLocator.chk_derm_assess_left, Left_Weepy);
			clickElementWithJQuery(By.xpath(xpath1));
			list_Left_Derm_Assessment.add(Left_Weepy);
		}
	}

	public void selectRight_Monofilament_Testing_fieldCheckBox(String section) {

		if (section.contains("Burning")) {
			Right_Burning = "Burning";
			String xpath1 = String.format(BasicLowerLimbLocator.chk_monofilament_testing_right, Right_Burning);
			clickElementWithJQuery(By.xpath(xpath1));
			list_Right_Monofilament_Testing.add(Right_Burning);

		} else {
			Right_Crawling = "Crawling";
			String xpath1 = String.format(BasicLowerLimbLocator.chk_monofilament_testing_right, Right_Crawling);
			clickElementWithJQuery(By.xpath(xpath1));
			list_Left_Monofilament_Testing.add(Right_Crawling);
		}

	}

	public void selectLeft_Sensation_Assessment_fieldCheckBox(String section) {
		if (section.contains("Burning")) {
			Left_Burning = "Burning";
			String xpath1 = String.format(BasicLowerLimbLocator.chk_monofilament_testing_left, Left_Burning);
			clickElementWithJQuery(By.xpath(xpath1));
			list_Right_Monofilament_Testing.add(Left_Burning);

		} else {
			Left_Crawling = "Crawling";
			String xpath1 = String.format(BasicLowerLimbLocator.chk_monofilament_testing_left, Left_Crawling);
			clickElementWithJQuery(By.xpath(xpath1));
			list_Left_Monofilament_Testing.add(Left_Crawling);
		}
	}

	public void selectRight_Left_Pain_Assessment_fieldCheckBox(String value, String section) {
		if (section.contains("Right")) {
			if (value.contains("No pain")) {
				Right_No_pain = "No pain";
				String xpath1 = String.format(BasicLowerLimbLocator.chk_pain_assessment_right, Right_No_pain);
				clickElementWithJQuery(By.xpath(xpath1));
				list_Right_Pain_Assessment_field.add(Right_No_pain);
			}
		}

		if (section.contains("Left")) {
			if (value.contains("No pain")) {
				Left_No_pain = "No pain";
				String xpath1 = String.format(BasicLowerLimbLocator.chk_pain_assessment_left, Left_No_pain);
				clickElementWithJQuery(By.xpath(xpath1));
				list_Left_Pain_Assessment_field.add(Left_No_pain);
			}
		}

	}

	public void selectLeftMissingLimbsorToesCheckBox(String section) {

		if (section.contains("No amputations")) {
			Left_no_amputations = "No amputations";
			String xpath1 = String.format(BasicLowerLimbLocator.chk_left_missing_limbs_toes, Right_no_amputations);
			clickElementWithJQuery(By.xpath(xpath1));
			listLeftMissingLimbsorToes.add(Right_no_amputations);
		}

		else if (section.contains("Leg b/k")) {
			Left_leg_bk = "Leg b/k";
			String xpath2 = String.format(BasicLowerLimbLocator.chk_left_missing_limbs_toes, Right_leg_bk);
			clickElementWithJQuery(By.xpath(xpath2));
			listLeftMissingLimbsorToes.add(Right_leg_bk);
		}

		else if (section.contains("Foot all")) {
			Left_foot_ball = "Foot all";
			String xpath2 = String.format(BasicLowerLimbLocator.chk_left_missing_limbs_toes, Right_foot_ball);
			clickElementWithJQuery(By.xpath(xpath2));
			listLeftMissingLimbsorToes.add(Right_foot_ball);
		}

		else if (section.contains("Second toe")) {
			Left_second_toe = "Second toe";
			String xpath2 = String.format(BasicLowerLimbLocator.chk_left_missing_limbs_toes, Left_second_toe);
			clickElementWithJQuery(By.xpath(xpath2));
			listLeftMissingLimbsorToes.add(Left_second_toe);
		} else if (section.contains("Fourth toe")) {
			Left_fourth_toe = "Fourth toe";
			String xpath2 = String.format(BasicLowerLimbLocator.chk_left_missing_limbs_toes, Left_fourth_toe);
			clickElementWithJQuery(By.xpath(xpath2));
			listLeftMissingLimbsorToes.add(Left_fourth_toe);
		} else if (section.contains("Leg a/k")) {
			Left_leg_ak = "Leg a/k";
			String xpath2 = String.format(BasicLowerLimbLocator.chk_left_missing_limbs_toes, Left_leg_ak);
			clickElementWithJQuery(By.xpath(xpath2));
			listLeftMissingLimbsorToes.add(Left_leg_ak);
		}

		else if (section.contains("Foot partial")) {
			Left_foot_partial = "Foot partial";
			String xpath2 = String.format(BasicLowerLimbLocator.chk_left_missing_limbs_toes, Left_foot_partial);
			clickElementWithJQuery(By.xpath(xpath2));
			listLeftMissingLimbsorToes.add(Left_foot_partial);
		} else if (section.contains("Great toe")) {
			Left_great_toe = "Great toe";
			String xpath2 = String.format(BasicLowerLimbLocator.chk_left_missing_limbs_toes, Left_great_toe);
			clickElementWithJQuery(By.xpath(xpath2));
			listLeftMissingLimbsorToes.add(Left_great_toe);
		} else if (section.contains("Third toe")) {
			Left_third_toe = "Third toe";
			String xpath2 = String.format(BasicLowerLimbLocator.chk_left_missing_limbs_toes, Left_third_toe);
			clickElementWithJQuery(By.xpath(xpath2));
			listLeftMissingLimbsorToes.add(Left_third_toe);
		}

		else {
			Left_fifth_toe = "Fifth toe";
			String xpath2 = String.format(BasicLowerLimbLocator.chk_left_missing_limbs_toes, Left_fifth_toe);
			clickElementWithJQuery(By.xpath(xpath2));
			listLeftMissingLimbsorToes.add(Left_fifth_toe);
		}

	}

}
