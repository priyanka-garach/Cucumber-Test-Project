package pixalere.scripts;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;

import pixalere.pageObjectUtils.LocatorUtils.AdvLimbLocator;
import pixalere.pageObjectUtils.LocatorUtils.BasicLowerLimbLocator;
import pixalere.pageObjectUtils.LocatorUtils.CustomizedLocators;
import pixalere.pageObjectUtils.PixalereCommonUtils;

public class PixalereAdvLowerLimbAssessmentScripts extends PixalereCommonUtils {

	public static String AdvlimbRight_Triphasic=null;
	public static String AdvlimbRight_Biphasic=null;
	public static String AdvlimbRight_Monophasic=null;
	public static String AdvlimbRight_Diminished=null;
	public static String AdvlimbRight_Present=null;
	public static String AdvlimbRight_Non_palpable=null;
	
	public static String AdvlimbLeft_Triphasic=null;
	public static String AdvlimbLeft_Biphasic=null;
	public static String AdvlimbLeft_Monophasic=null;
	public static String AdvlimbLeft_Diminished=null;
	public static String AdvlimbLeft_Present=null;
	public static String AdvlimbLeft_Non_palpable=null;
	 
	

	
	public static String AdvlimbRight_Lateral=null;
	public static String AdvlimbRight_3rd_digit=null;
	public static String AdvlimbRight_1st_MTH=null;
	public static String AdvlimbRight_5th_MTH=null;
	public static String AdvlimbRight_Heel=null;
	public static String AdvlimbRight_1st_digit=null;
	public static String AdvlimbRight_5th_digit=null;
	public static String AdvlimbRight_3rd_MTH=null;
	public static String AdvlimbRight_Medial=null;
	public static String AdvlimbRight_Dorsum=null;

/**/
	public static String AdvlimbLeft_Lateral=null;
	public static String AdvlimbLeft_3rd_digit=null;
	public static String AdvlimbLeft_1st_MTH=null;
	public static String AdvlimbLeft_5th_MTH=null;
	public static String AdvlimbLeft_Heel=null;
	public static String AdvlimbLeft_1st_digit=null;
	public static String AdvlimbLeft_5th_digit=null;
	public static String AdvlimbLeft_3rd_MTH=null;
	public static String AdvlimbLeft_Medial=null;
	public static String AdvlimbLeft_Dorsum=null;
/**/
	public static String AdvlimbRight_Champagne_bottle_shaped=null;
	public static String AdvlimbRight_Wasted_calf_muscle=null;
	public static String AdvlimbRight_None_of_the_above=null;
/**/
	public static String AdvlimbLeft_Champagne_bottle_shaped=null;
	public static String AdvlimbLeft_Wasted_calf_muscle=null;
	public static String AdvlimbLeft_None_of_the_above=null;
/**/
	public static String AdvlimbRight_FootConcerns1 = null;
	public static String AdvlimbRight_FootConcerns2 = null;
	public static String AdvlimbRight_FootConcerns3 = null;
	public static String AdvlimbRight_FootConcerns4 = null;
	public static String AdvlimbRight_FootConcerns5 = null;
	public static String AdvlimbRight_FootConcerns6 = null;
	public static String AdvlimbRight_FootConcerns7 = null;
	public static String AdvlimbRight_FootConcerns8 = null;
	public static String AdvlimbRight_FootConcerns9 = null;
	public static String AdvlimbRight_FootConcerns10 = null;
	public static String AdvlimbRight_FootConcerns11 = null;
	
/**/
	
	public static String AdvlimbLeft_FootConcerns1 = null;
	public static String AdvlimbLeft_FootConcerns2 = null;
	public static String AdvlimbLeft_FootConcerns3 = null;
	public static String AdvlimbLeft_FootConcerns4 = null;
	public static String AdvlimbLeft_FootConcerns5 = null;
	public static String AdvlimbLeft_FootConcerns6 = null;
	public static String AdvlimbLeft_FootConcerns7 = null;
	public static String AdvlimbLeft_FootConcerns8 = null;
	public static String AdvlimbLeft_FootConcerns9 = null;
	public static String AdvlimbLeft_FootConcerns10 = null;
	public static String AdvlimbLeft_FootConcerns11 = null;
	
	
/**/
	public static String AdvlimbRight_TN1 = null;
	public static String AdvlimbRight_TN2 = null;
	public static String AdvlimbRight_TN3 = null;
	public static String AdvlimbRight_TN4 = null;
	
/**/
	public static String AdvlimbLeft_TN1 = null;
	public static String AdvlimbLeft_TN2 = null;
	public static String AdvlimbLeft_TN3 = null;
	public static String AdvlimbLeft_TN4 = null;
/**/
	public static String AdvlimbRight_Dependent_rubor = null;
	public static String AdvlimbRight_Stasis_dermatitis = null;
	public static String AdvlimbRight_Varicosities = null;
	public static String AdvlimbRight_None_oftheabove_derm = null;
/**/
	public static String AdvlimbLeft_Dependent_rubor = null;
	public static String AdvlimbLeft_Stasis_dermatitis = null;
	public static String AdvlimbLeft_Varicosities = null;
/**/
	public static String AdvlimbRight_Rightpain1 = null;
	public static String AdvlimbRight_Rightpain2 = null;
	public static String AdvlimbRight_Rightpain3 = null;
	public static String AdvlimbRight_Rightpain4 = null;
	public static String AdvlimbRight_Rightpain5 = null;
	
	public static String AdvlimbRight_Leftpain1 = null;
	public static String AdvlimbRight_Leftpain2 = null;
	public static String AdvlimbRight_Leftpain3 = null;
	public static String AdvlimbRight_Leftpain4 = null;
	public static String AdvlimbRight_Leftpain5 = null;
	
	
	public static List<String> list_Right_Dorsalis_Pedis = new ArrayList<>();
	public static List<String> list_Left_Dorsalis_Pedis = new ArrayList<>();
	public static List<String> list_Right_mono = new ArrayList<>();
/**/public static List<String> list_Left_mono = new ArrayList<>();
	public static List<String> list_Right_llsf = new ArrayList<>();
	public static List<String> list_Left_llsf = new ArrayList<>();
	public static List<String> list_Right_foot_concerns = new ArrayList<>();
	public static List<String> list_Left_foot_concerns = new ArrayList<>();
	public static List<String> list_Left_Toe_Nails = new ArrayList<>();
	public static List<String> list_Right_Toe_Nails = new ArrayList<>();
	public static List<String> list_Left_Skin_Appe = new ArrayList<>();
	public static List<String> list_Right_Skin_Appe = new ArrayList<>();
	
	
	public static List<String> list_Right_derm = new ArrayList<>();
	public static List<String> list_Rigt_pain = new ArrayList<>();
	public static List<String> list_Left_pain = new ArrayList<>();
	public static List<String> list_Right_posterior_tribal= new ArrayList<>();
	public static List<String> list_Left_posterior_tribal= new ArrayList<>();
	
	//Dharati start radio button Advace LL
	public static String Advance_LL1;
	public static String Advance_LL2;
	public static String Advance_LL3;
	public static String Advance_LL4;
	public static String Advance_LL5;
	public static String day1_ALB;
	public static String month1_ALB;
	public static String day2_ALB;
	public static String month2_ALB;
	public static String Advance_LL111;

		
	public void selectRadioOptionForAnkle_Vascular_Assessment_Initiated_ABI_Score_AdvLimb(String value) {
		Advance_LL2=value;
		String xpath1 = null;
		if (value.equalsIgnoreCase("Done by WCC/designate")) {
			xpath1 = String.format(AdvLimbLocator.radio_toe_brachial_index1 , value);
			clickElement(By.xpath(xpath1));
		} 
		else {
			xpath1 = String.format(AdvLimbLocator.radio_toe_brachial_index2 , value);
			clickElement(By.xpath(xpath1));
		} 
		
	}
	public void selectRadioOptionFor_Vascular_Assessment_Initiated_ABI_Score_field(String value) {
		Advance_LL3="";
		String xpath1 = null;
		if (value.equalsIgnoreCase("Yes")) {
			xpath1 = String.format(AdvLimbLocator.radio_Vascular_Assessment_Initiated_index1 , value);
			clickElement(By.xpath(xpath1));
		} 
		else {
			xpath1 = String.format(AdvLimbLocator.radio_Vascular_Assessment_Initiated_index2 , value);
			clickElement(By.xpath(xpath1));
		} 
	}
	
	public void selectRadioOptionForAnkle_Brachial_Index_field_AdvLimb(String value) {
		Advance_LL1 = "Done by WCC/designate";
		String xpath1 = null;
		if (value.equalsIgnoreCase("Done in Vascular Lab")) {
			xpath1 = String.format(AdvLimbLocator.radio_ankle_brachial_index2 , value);
			clickElement(By.xpath(xpath1));
		} 
		else {
			xpath1 = String.format(AdvLimbLocator.radio_ankle_brachial_index1 , value);
			clickElement(By.xpath(xpath1));
		} 
		
	}
	
	public void selectRadioOptionForVascular_Assessment_Initiated_ABI_Score_field_AdvLimb(String value) {
		Advance_LL111 = value ;
		String xpath1 = null;
		if (value.equalsIgnoreCase("Yes")) {
			xpath1 = String.format(AdvLimbLocator.referral_vascular_assessment1 , value);
			clickElement(By.xpath(xpath1));
		} 
		else {
			xpath1 = String.format(AdvLimbLocator.referral_vascular_assessment2 , value);
			clickElement(By.xpath(xpath1));
		} 
		
	}
	
	
	
	public void selectRadioOptionForRight_Stemmer_s_Sign_field_field_AdvLimb(String value) {
		
		Advance_LL4=value;
		String xpath1 = null;
		if (value.equalsIgnoreCase("Yes")) {
			xpath1 = String.format(AdvLimbLocator.radio_Stemmer_Sign_Right_yes, value);
			clickElement(By.xpath(xpath1));
		} 
		else {
			xpath1 = String.format(AdvLimbLocator.radio_Stemmer_Sign_Right_no , value);
			clickElement(By.xpath(xpath1));
		} 
		
	}
	
	public void selectRadioOptionForLeft_Stemmer_s_Sign_field_field_AdvLimb(String value) {
		Advance_LL5=value;
		String xpath1 = null;
		if (value.equalsIgnoreCase("Yes")) {
			xpath1 = String.format(AdvLimbLocator.radio_Stemmer_Sign_Left_yes, value);
			clickElement(By.xpath(xpath1));
		} 
		else {
			xpath1 = String.format(AdvLimbLocator.radio_Stemmer_Sign_Left_no , value);
			clickElement(By.xpath(xpath1));
		} 
		
	}
	
	
	public void selectRight_Concerns_Right_Pain_Assessment_CheckBox(String section) {
		if (section.contains("No pain")) {
			AdvlimbRight_Rightpain1 = "No pain";
			String xpath1 =String.format(AdvLimbLocator.chk_pain_ass_ri8, AdvlimbRight_Rightpain1);  
			clickElementWithJQuery(By.xpath(xpath1));
			list_Rigt_pain.add(AdvlimbRight_Rightpain1);
		}
		
		else if (section.contains("Intermittent")) {
			AdvlimbRight_Rightpain2 = "Intermittent";
			String xpath2 = String.format(AdvLimbLocator.chk_pain_ass_ri8, AdvlimbRight_Rightpain2);  
			clickElementWithJQuery(By.xpath(xpath2));
			list_Rigt_pain.add(AdvlimbRight_Rightpain2);
		}
		
		else if(section.contains("Pain at rest")){
			AdvlimbRight_Rightpain3 = "Pain at rest";
			String xpath2 = String.format(AdvLimbLocator.chk_pain_ass_ri8, AdvlimbRight_Rightpain3);  
			clickElementWithJQuery(By.xpath(xpath2));
			list_Rigt_pain.add(AdvlimbRight_Rightpain3);
		}
		
		else if(section.contains("Increase with elevation")){
			AdvlimbRight_Rightpain4 = "Increase with elevation";
			String xpath2 = String.format(AdvLimbLocator.chk_pain_ass_ri8, AdvlimbRight_Rightpain4);  
			clickElementWithJQuery(By.xpath(xpath2));
			list_Rigt_pain.add(AdvlimbRight_Rightpain4);
		}
		
		else {
			AdvlimbRight_Rightpain5 = "Ache";
			String xpath2 = String.format(AdvLimbLocator.chk_pain_ass_ri8, AdvlimbRight_Rightpain5);  
			clickElementWithJQuery(By.xpath(xpath2));
			list_Rigt_pain.add(AdvlimbRight_Rightpain5);
		}
	}
	
	public void selectRight_Concerns_Left_Pain_Assessment_CheckBox(String section) {
		if (section.contains("No pain")) {
			AdvlimbRight_Leftpain1 = "No pain";
			String xpath1 =String.format(AdvLimbLocator.chk_pain_ass_left, AdvlimbRight_Leftpain1);  
			clickElementWithJQuery(By.xpath(xpath1));
			list_Left_pain.add(AdvlimbRight_Leftpain1);
		}
		
		else if (section.contains("Intermittent")) {
			AdvlimbRight_Leftpain2 = "Intermittent";
			String xpath2 = String.format(AdvLimbLocator.chk_pain_ass_left, AdvlimbRight_Leftpain2);  
			clickElementWithJQuery(By.xpath(xpath2));
			list_Left_pain.add(AdvlimbRight_Leftpain2);
		}
		
		else if(section.contains("Pain at rest")){
			AdvlimbRight_Leftpain3 = "Pain at rest";
			String xpath2 = String.format(AdvLimbLocator.chk_pain_ass_left, AdvlimbRight_Leftpain3);  
			clickElementWithJQuery(By.xpath(xpath2));
			list_Left_pain.add(AdvlimbRight_Leftpain3);
		}
		
		else if(section.contains("Increase with elevation")){
			AdvlimbRight_Leftpain4 = "Increase with elevation";
			String xpath2 = String.format(AdvLimbLocator.chk_pain_ass_left, AdvlimbRight_Leftpain4);  
			clickElementWithJQuery(By.xpath(xpath2));
			list_Left_pain.add(AdvlimbRight_Leftpain4);
		}
		
		else {
			AdvlimbRight_Leftpain5 = "Ache";
			String xpath2 = String.format(AdvLimbLocator.chk_pain_ass_left, AdvlimbRight_Leftpain5);  
			clickElementWithJQuery(By.xpath(xpath2));
			list_Left_pain.add(AdvlimbRight_Leftpain5);
		}
	}
	
	public void selectRight_Concerns_Left_Derm_Assessment_field_ALB_CheckBox(String section) {
		if (section.contains("Dependent rubor")) {
			AdvlimbRight_Dependent_rubor = "Dependent rubor";
			String xpath1 =String.format(AdvLimbLocator.chk_derm_ass_ri8, AdvlimbRight_Dependent_rubor);  
			clickElementWithJQuery(By.xpath(xpath1));
			list_Right_derm.add(AdvlimbRight_Dependent_rubor);
		}
		
		else if (section.contains("Stasis dermatitis")) {
			AdvlimbRight_Stasis_dermatitis = "Stasis dermatitis";
			String xpath2 = String.format(AdvLimbLocator.chk_derm_ass_ri8, AdvlimbRight_Stasis_dermatitis);  
			clickElementWithJQuery(By.xpath(xpath2));
			list_Right_derm.add(AdvlimbRight_Stasis_dermatitis);
		}
		
		else if(section.contains("Varicosities")){
			AdvlimbRight_Varicosities = "Varicosities";
			String xpath2 = String.format(AdvLimbLocator.chk_derm_ass_ri8, AdvlimbRight_Varicosities);  
			clickElementWithJQuery(By.xpath(xpath2));
			list_Right_derm.add(AdvlimbRight_Varicosities);
		}
		
		else {
			AdvlimbRight_None_oftheabove_derm = "None of the above";
			String xpath2 = String.format(AdvLimbLocator.chk_derm_ass_ri8, AdvlimbRight_None_oftheabove_derm);  
			clickElementWithJQuery(By.xpath(xpath2));
			list_Right_derm.add(AdvlimbRight_None_oftheabove_derm);
		}
	}
	
	public void selectRightDorsalisPedisAdvLimbCheckBox(String section)
	{
		if (section.contains("Triphasic")) {
			AdvlimbRight_Triphasic = "Triphasic";
			String xpath1 =String.format(AdvLimbLocator.chk_right_dorsalis_pedis, AdvlimbRight_Triphasic);  
			clickElementWithJQuery(By.xpath(xpath1));
			list_Right_Dorsalis_Pedis.add(AdvlimbRight_Triphasic);
		}
		
		else if (section.contains("Biphasic")) {
			AdvlimbRight_Biphasic = "Biphasic";
			String xpath2 = String.format(AdvLimbLocator.chk_right_dorsalis_pedis, AdvlimbRight_Biphasic);  
			clickElementWithJQuery(By.xpath(xpath2));
			list_Right_Dorsalis_Pedis.add(AdvlimbRight_Biphasic);
		}
		
		else if(section.contains("Monophasic")){
			AdvlimbRight_Monophasic = "Monophasic";
			String xpath2 = String.format(AdvLimbLocator.chk_right_dorsalis_pedis, AdvlimbRight_Monophasic);  
			clickElementWithJQuery(By.xpath(xpath2));
			list_Right_Dorsalis_Pedis.add(AdvlimbRight_Monophasic);
		}
		
		else if(section.contains("Diminished")){
			AdvlimbRight_Diminished = "Diminished";
			String xpath2 = String.format(AdvLimbLocator.chk_right_dorsalis_pedis, AdvlimbRight_Diminished);  
			clickElementWithJQuery(By.xpath(xpath2));
			list_Right_Dorsalis_Pedis.add(AdvlimbRight_Diminished);
		}
		else if(section.contains("Present")){
			AdvlimbRight_Present = "Present";
			String xpath2 = String.format(AdvLimbLocator.chk_right_dorsalis_pedis, AdvlimbRight_Present);  
			clickElementWithJQuery(By.xpath(xpath2));
			list_Right_Dorsalis_Pedis.add(AdvlimbRight_Present);
		}
		else{
			AdvlimbRight_Non_palpable = "Non-palpable";
			String xpath2 = String.format(AdvLimbLocator.chk_right_dorsalis_pedis, AdvlimbRight_Non_palpable);  
			clickElementWithJQuery(By.xpath(xpath2));
			list_Right_Dorsalis_Pedis.add(AdvlimbRight_Non_palpable);
		}
	}
	
	public void selectRightmonofilamentTestingfieldCheckBox(String section) {
		if (section.contains("Lateral")) {
			AdvlimbRight_Lateral = "Lateral";
			String xpath1 =String.format(AdvLimbLocator.chk_monofilament_testing_right, AdvlimbRight_Lateral);  
			clickElementWithJQuery(By.xpath(xpath1));
			list_Right_mono.add(AdvlimbRight_Lateral);
		}
		
		else if (section.contains("3rd digit")) {
			AdvlimbRight_3rd_digit = "3rd digit";
			String xpath2 = String.format(AdvLimbLocator.chk_monofilament_testing_right, AdvlimbRight_3rd_digit);  
			clickElementWithJQuery(By.xpath(xpath2));
			list_Right_mono.add(AdvlimbRight_3rd_digit);
		}
		
		else if(section.contains("1st MTH")){
			AdvlimbRight_1st_MTH = "1st MTH";
			String xpath2 = String.format(AdvLimbLocator.chk_monofilament_testing_right, AdvlimbRight_1st_MTH);  
			clickElementWithJQuery(By.xpath(xpath2));
			list_Right_mono.add(AdvlimbRight_1st_MTH);
		}
		
		else if(section.contains("5th MTH")){
			AdvlimbRight_5th_MTH = "5th MTH";
			String xpath2 = String.format(AdvLimbLocator.chk_monofilament_testing_right, AdvlimbRight_5th_MTH);  
			clickElementWithJQuery(By.xpath(xpath2));
			list_Right_mono.add(AdvlimbRight_5th_MTH);
		}
		else if(section.contains("Heel")){
			AdvlimbRight_Heel = "Heel";
			String xpath2 = String.format(AdvLimbLocator.chk_monofilament_testing_right, AdvlimbRight_Heel);  
			clickElementWithJQuery(By.xpath(xpath2));
			list_Right_mono.add(AdvlimbRight_Heel);
		}
		else if(section.contains("1st digit")){
			AdvlimbRight_1st_digit = "1st digit";
			String xpath2 = String.format(AdvLimbLocator.chk_monofilament_testing_right, AdvlimbRight_1st_digit);  
			clickElementWithJQuery(By.xpath(xpath2));
			list_Right_mono.add(AdvlimbRight_1st_digit);
		}
		else if(section.contains("5th digit")){
			AdvlimbRight_5th_digit = "5th digit";
			String xpath2 = String.format(AdvLimbLocator.chk_monofilament_testing_right, AdvlimbRight_5th_digit);  
			clickElementWithJQuery(By.xpath(xpath2));
			list_Right_mono.add(AdvlimbRight_5th_digit);
		}
		else if(section.contains("3rd MTH")){
			AdvlimbRight_3rd_MTH = "3rd MTH";
			String xpath2 = String.format(AdvLimbLocator.chk_monofilament_testing_right, AdvlimbRight_3rd_MTH);  
			clickElementWithJQuery(By.xpath(xpath2));
			list_Right_mono.add(AdvlimbRight_3rd_MTH);
		}
		else if(section.contains("Medial")){
			AdvlimbRight_Medial = "Medial";
			String xpath2 = String.format(AdvLimbLocator.chk_monofilament_testing_right, AdvlimbRight_Medial);  
			clickElementWithJQuery(By.xpath(xpath2));
			list_Right_mono.add(AdvlimbRight_Medial);
		}
		else{
			AdvlimbRight_Dorsum = "Dorsum";
			String xpath2 = String.format(AdvLimbLocator.chk_monofilament_testing_right, AdvlimbRight_Dorsum);  
			clickElementWithJQuery(By.xpath(xpath2));
			list_Right_mono.add(AdvlimbRight_Dorsum);
		}
	}

	public void selectRight_Concerns_Foot_fieldAdvLimbCheckBox(String section)
	{
		if (section.contains("Bunion")) {
			AdvlimbRight_FootConcerns1 = "Bunion(s)";
			String xpath1 =String.format(AdvLimbLocator.chk_foot_concerns_ri8,AdvlimbRight_FootConcerns1);  
			clickElementWithJQuery(By.xpath(xpath1));
			list_Right_foot_concerns.add(AdvlimbRight_FootConcerns1);
		}
		
		else if (section.contains("Plantar wart")) {
			AdvlimbRight_FootConcerns2 = "Plantar wart(s)";
			String xpath2 = String.format(AdvLimbLocator.chk_foot_concerns_ri8, AdvlimbRight_FootConcerns2);  
			clickElementWithJQuery(By.xpath(xpath2));
			list_Right_foot_concerns.add(AdvlimbRight_FootConcerns2);
		}
		
		else if(section.contains("Hammertoe")){
			AdvlimbRight_FootConcerns3 = "Hammertoe(s)";
			String xpath2 = String.format(AdvLimbLocator.chk_foot_concerns_ri8, AdvlimbRight_FootConcerns3);  
			clickElementWithJQuery(By.xpath(xpath2));
			list_Right_foot_concerns.add(AdvlimbRight_FootConcerns3);
		}
		
		else if(section.contains("Cracks between toes")){
			AdvlimbRight_FootConcerns4 = "Cracks between toes";
			String xpath2 = String.format(AdvLimbLocator.chk_foot_concerns_ri8, AdvlimbRight_FootConcerns4);  
			clickElementWithJQuery(By.xpath(xpath2));
			list_Right_foot_concerns.add(AdvlimbRight_FootConcerns4);
		}
		else if(section.contains("Acute Charcot")){
			AdvlimbRight_FootConcerns5 = "Acute Charcot";
			String xpath2 = String.format(AdvLimbLocator.chk_foot_concerns_ri8, AdvlimbRight_FootConcerns5);  
			clickElementWithJQuery(By.xpath(xpath2));
			list_Right_foot_concerns.add(AdvlimbRight_FootConcerns5);
		}
		else if(section.contains("Callus")){
			AdvlimbRight_FootConcerns6 = "Callus(es)";
			String xpath2 = String.format(AdvLimbLocator.chk_foot_concerns_ri8, AdvlimbRight_FootConcerns6);  
			clickElementWithJQuery(By.xpath(xpath2));
			list_Right_foot_concerns.add(AdvlimbRight_FootConcerns6);
		}
		else if(section.contains("Corn")){
			AdvlimbRight_FootConcerns7 = "Corn(s)";
			String xpath2 = String.format(AdvLimbLocator.chk_foot_concerns_ri8, AdvlimbRight_FootConcerns7);  
			clickElementWithJQuery(By.xpath(xpath2));
			list_Right_foot_concerns.add(AdvlimbRight_FootConcerns7);
		}
		else if(section.contains("Dropped MTH")){
			AdvlimbRight_FootConcerns8 = "Dropped MTH(s)";
			String xpath2 = String.format(AdvLimbLocator.chk_foot_concerns_ri8, AdvlimbRight_FootConcerns8);  
			clickElementWithJQuery(By.xpath(xpath2));
			list_Right_foot_concerns.add(AdvlimbRight_FootConcerns8);
		}
		else if(section.contains("Crossed toes")){
			AdvlimbRight_FootConcerns9 = "Crossed toes";
			String xpath2 = String.format(AdvLimbLocator.chk_foot_concerns_ri8, AdvlimbRight_FootConcerns9);  
			clickElementWithJQuery(By.xpath(xpath2));
			list_Right_foot_concerns.add(AdvlimbRight_FootConcerns9);
		}
		/*else if(section.contains("Abnormal skin dryness")){
			AdvlimbRight_FootConcerns10 = "Abnormal skin dryness";
			String xpath2 = String.format(AdvLimbLocator.chk_foot_concerns_ri8, AdvlimbRight_FootConcerns10);  
			clickElementWithJQuery(By.xpath(xpath2));
			list_Right_foot_concerns.add(AdvlimbRight_FootConcerns10);}*/
		
		else{
			AdvlimbRight_FootConcerns11 = "Chronic Charcot";
			String xpath2 = String.format(AdvLimbLocator.chk_foot_concerns_ri8, AdvlimbRight_FootConcerns11);  
			clickElementWithJQuery(By.xpath(xpath2));
			list_Right_foot_concerns.add(AdvlimbRight_FootConcerns11);
		}
}
	
	public void selectLeft_Concerns_Foot_fieldAdvLimbCheckBox(String section)
	{
		if (section.contains("Bunion")) {
			AdvlimbLeft_FootConcerns1 = "Bunion(s)";
			String xpath1 =String.format(AdvLimbLocator.chk_foot_concerns_li8,AdvlimbLeft_FootConcerns1);  
			clickElementWithJQuery(By.xpath(xpath1));
			list_Left_foot_concerns.add(AdvlimbLeft_FootConcerns1);
		}
		
		else if (section.contains("Plantar wart")) {
			AdvlimbLeft_FootConcerns2 = "Plantar wart(s)";
			String xpath2 = String.format(AdvLimbLocator.chk_foot_concerns_li8, AdvlimbLeft_FootConcerns2);  
			clickElementWithJQuery(By.xpath(xpath2));
			list_Left_foot_concerns.add(AdvlimbLeft_FootConcerns2);
		}
		
		else if(section.contains("Hammertoe")){
			AdvlimbLeft_FootConcerns3 = "Hammertoe(s)";
			String xpath2 = String.format(AdvLimbLocator.chk_foot_concerns_li8, AdvlimbLeft_FootConcerns3);  
			clickElementWithJQuery(By.xpath(xpath2));
			list_Left_foot_concerns.add(AdvlimbLeft_FootConcerns3);
		}
		
		else if(section.contains("Cracks between toes")){
			AdvlimbLeft_FootConcerns4 = "Cracks between toes";
			String xpath2 = String.format(AdvLimbLocator.chk_foot_concerns_li8, AdvlimbLeft_FootConcerns4);  
			clickElementWithJQuery(By.xpath(xpath2));
			list_Left_foot_concerns.add(AdvlimbLeft_FootConcerns4);
		}
		else if(section.contains("Acute Charcot")){
			AdvlimbLeft_FootConcerns5 = "Acute Charcot";
			String xpath2 = String.format(AdvLimbLocator.chk_foot_concerns_li8, AdvlimbLeft_FootConcerns5);  
			clickElementWithJQuery(By.xpath(xpath2));
			list_Left_foot_concerns.add(AdvlimbLeft_FootConcerns5);
		}
		else if(section.contains("Callus")){
			AdvlimbLeft_FootConcerns6 = "Callus(es)";
			String xpath2 = String.format(AdvLimbLocator.chk_foot_concerns_li8, AdvlimbLeft_FootConcerns6);  
			clickElementWithJQuery(By.xpath(xpath2));
			list_Left_foot_concerns.add(AdvlimbLeft_FootConcerns6);
		}
		else if(section.contains("Corn")){
			AdvlimbLeft_FootConcerns7 = "Corn(s)";
			String xpath2 = String.format(AdvLimbLocator.chk_foot_concerns_li8, AdvlimbLeft_FootConcerns7);  
			clickElementWithJQuery(By.xpath(xpath2));
			list_Left_foot_concerns.add(AdvlimbLeft_FootConcerns7);
		}
		else if(section.contains("Dropped MTH")){
			AdvlimbLeft_FootConcerns8 = "Dropped MTH(s)";
			String xpath2 = String.format(AdvLimbLocator.chk_foot_concerns_li8, AdvlimbLeft_FootConcerns8);  
			clickElementWithJQuery(By.xpath(xpath2));
			list_Left_foot_concerns.add(AdvlimbLeft_FootConcerns8);
		}
		else if(section.contains("Crossed toes")){
			AdvlimbLeft_FootConcerns9 = "Crossed toes";
			String xpath2 = String.format(AdvLimbLocator.chk_foot_concerns_li8, AdvlimbLeft_FootConcerns9);  
			clickElementWithJQuery(By.xpath(xpath2));
			list_Left_foot_concerns.add(AdvlimbLeft_FootConcerns9);
		}
		/*else if(section.contains("Abnormal skin dryness")){
			AdvlimbLeft_FootConcerns10 = "Abnormal skin dryness";
			String xpath2 = String.format(AdvLimbLocator.chk_foot_concerns_li8, AdvlimbLeft_FootConcerns10);  
			clickElementWithJQuery(By.xpath(xpath2));
			list_Left_foot_concerns.add(AdvlimbLeft_FootConcerns10);
		}*/
		else{
			AdvlimbLeft_FootConcerns11 = "Chronic Charcot";
			String xpath2 = String.format(AdvLimbLocator.chk_foot_concerns_li8, AdvlimbLeft_FootConcerns11);  
			clickElementWithJQuery(By.xpath(xpath2));
			list_Left_foot_concerns.add(AdvlimbLeft_FootConcerns11);
		}
			
	}
	
	public void selectDayALB(String string) {
		day2_ALB=string;
		select_ByIndex(By.id("toe_brachial_day"), Integer.parseInt(string) );
	}
	
	public void selectMonthALB(String string) {
		month2_ALB=string;
		selectByVisibleText(By.id("toe_brachial_month"), string);
	}
	public void selectDay_ABALB(String string) {
		day1_ALB = string;
		
		select_ByIndex(By.id("ankle_brachial_day"), Integer.parseInt(string) );
	}
	public void selectMonth_ABALB(String string) {
		month1_ALB = string;
		selectByVisibleText(By.id("ankle_brachial_month"), string);
	}
	
	public void selectchkLeftPosterioirTibialALB(String section)
	{
		/**************************////
		if (section.contains("Triphasic")) {
			AdvlimbLeft_Triphasic = "Triphasic";
			String xpath1 =String.format(AdvLimbLocator.chk_left_posterior_tibal, AdvlimbLeft_Triphasic);  
			clickElementWithJQuery(By.xpath(xpath1));
			list_Left_posterior_tribal.add(AdvlimbLeft_Triphasic);
		}
		
		else if (section.contains("Biphasic")) {
			AdvlimbLeft_Biphasic = "Biphasic";
			String xpath2 = String.format(AdvLimbLocator.chk_left_posterior_tibal, AdvlimbLeft_Biphasic);  
			clickElementWithJQuery(By.xpath(xpath2));
			list_Left_posterior_tribal.add(AdvlimbLeft_Biphasic);
		}
		
		else if(section.contains("Monophasic")){
			AdvlimbLeft_Monophasic = "Monophasic";
			String xpath2 = String.format(AdvLimbLocator.chk_left_posterior_tibal, AdvlimbLeft_Monophasic);  
			clickElementWithJQuery(By.xpath(xpath2));
			list_Left_posterior_tribal.add(AdvlimbLeft_Monophasic);
		}
		
		else if(section.contains("Diminished")){
			AdvlimbLeft_Diminished = "Diminished";
			String xpath2 = String.format(AdvLimbLocator.chk_left_posterior_tibal, AdvlimbLeft_Diminished);  
			clickElementWithJQuery(By.xpath(xpath2));
			list_Left_posterior_tribal.add(AdvlimbLeft_Diminished);
		}
		else if(section.contains("Present")){
			AdvlimbLeft_Present = "Present";
			String xpath2 = String.format(AdvLimbLocator.chk_left_posterior_tibal, AdvlimbLeft_Present);  
			clickElementWithJQuery(By.xpath(xpath2));
			list_Left_posterior_tribal.add(AdvlimbLeft_Present);
		}
		else{
			AdvlimbLeft_Non_palpable = "Non-palpable";
			String xpath2 = String.format(AdvLimbLocator.chk_left_posterior_tibal, AdvlimbLeft_Non_palpable);  
			clickElementWithJQuery(By.xpath(xpath2));
			list_Left_posterior_tribal.add(AdvlimbLeft_Non_palpable);
		}
		
	}
	public void selectchkRightPosterioirTibialALB(String section) { 
		/**************************////
		if (section.contains("Triphasic")) {
			AdvlimbLeft_Triphasic = "Triphasic";
			String xpath1 =String.format(AdvLimbLocator.chk_right_posterior_tibal, AdvlimbLeft_Triphasic);  
			clickElementWithJQuery(By.xpath(xpath1));
			list_Right_posterior_tribal.add(AdvlimbLeft_Triphasic);
		}
		
		else if (section.contains("Biphasic")) {
			AdvlimbLeft_Biphasic = "Biphasic";
			String xpath2 = String.format(AdvLimbLocator.chk_right_posterior_tibal, AdvlimbLeft_Biphasic);  
			clickElementWithJQuery(By.xpath(xpath2));
			list_Right_posterior_tribal.add(AdvlimbLeft_Biphasic);
		}
		
		else if(section.contains("Monophasic")){
			AdvlimbLeft_Monophasic = "Monophasic";
			String xpath2 = String.format(AdvLimbLocator.chk_right_posterior_tibal, AdvlimbLeft_Monophasic);  
			clickElementWithJQuery(By.xpath(xpath2));
			list_Right_posterior_tribal.add(AdvlimbLeft_Monophasic);
		}
		
		else if(section.contains("Diminished")){
			AdvlimbLeft_Diminished = "Diminished";
			String xpath2 = String.format(AdvLimbLocator.chk_right_posterior_tibal, AdvlimbLeft_Diminished);  
			clickElementWithJQuery(By.xpath(xpath2));
			list_Right_posterior_tribal.add(AdvlimbLeft_Diminished);
		}
		else if(section.contains("Present")){
			AdvlimbLeft_Present = "Present";
			String xpath2 = String.format(AdvLimbLocator.chk_right_posterior_tibal, AdvlimbLeft_Present);  
			clickElementWithJQuery(By.xpath(xpath2));
			list_Right_posterior_tribal.add(AdvlimbLeft_Present);
		}
		else{
			AdvlimbLeft_Non_palpable = "Non-palpable";
			String xpath2 = String.format(AdvLimbLocator.chk_right_posterior_tibal, AdvlimbLeft_Non_palpable);  
			clickElementWithJQuery(By.xpath(xpath2));
			list_Right_posterior_tribal.add(AdvlimbLeft_Non_palpable);
		}
	
	}
		
	public void selectLeftDorsalisPedisAdvLimbCheckBox(String section)
	{
		if (section.contains("Triphasic")) {
			AdvlimbLeft_Triphasic = "Triphasic";
			String xpath1 =String.format(AdvLimbLocator.chk_left_dorsalis_pedis, AdvlimbLeft_Triphasic);  
			clickElementWithJQuery(By.xpath(xpath1));
			list_Left_Dorsalis_Pedis.add(AdvlimbLeft_Triphasic);
		}
		
		else if (section.contains("Biphasic")) {
			AdvlimbLeft_Biphasic = "Biphasic";
			String xpath2 = String.format(AdvLimbLocator.chk_left_dorsalis_pedis, AdvlimbLeft_Biphasic);  
			clickElementWithJQuery(By.xpath(xpath2));
			list_Left_Dorsalis_Pedis.add(AdvlimbLeft_Biphasic);
		}
		
		else if(section.contains("Monophasic")){
			AdvlimbLeft_Monophasic = "Monophasic";
			String xpath2 = String.format(AdvLimbLocator.chk_left_dorsalis_pedis, AdvlimbLeft_Monophasic);  
			clickElementWithJQuery(By.xpath(xpath2));
			list_Left_Dorsalis_Pedis.add(AdvlimbLeft_Monophasic);
		}
		
		else if(section.contains("Diminished")){
			AdvlimbLeft_Diminished = "Diminished";
			String xpath2 = String.format(AdvLimbLocator.chk_left_dorsalis_pedis, AdvlimbLeft_Diminished);  
			clickElementWithJQuery(By.xpath(xpath2));
			list_Left_Dorsalis_Pedis.add(AdvlimbLeft_Diminished);
		}
		else if(section.contains("Present")){
			AdvlimbLeft_Present = "Present";
			String xpath2 = String.format(AdvLimbLocator.chk_left_dorsalis_pedis, AdvlimbLeft_Present);  
			clickElementWithJQuery(By.xpath(xpath2));
			list_Left_Dorsalis_Pedis.add(AdvlimbLeft_Present);
		}
		else{
			AdvlimbLeft_Non_palpable = "Non-palpable";
			String xpath2 = String.format(AdvLimbLocator.chk_left_dorsalis_pedis, AdvlimbLeft_Non_palpable);  
			clickElementWithJQuery(By.xpath(xpath2));
			list_Left_Dorsalis_Pedis.add(AdvlimbLeft_Non_palpable);
		}
	}

public void selectchkLeft_Monofilament_Testing_field_ALB(String section) {
	if (section.contains("Lateral")) {
		AdvlimbLeft_Lateral = "Lateral";
		String xpath1 =String.format(AdvLimbLocator.chk_monofilament_testing_left, AdvlimbLeft_Lateral);  
		clickElementWithJQuery(By.xpath(xpath1));
		list_Left_mono .add(AdvlimbLeft_Lateral);
	}
	
	else if (section.contains("3rd digit")) {
		AdvlimbLeft_3rd_digit = "3rd digit";
		String xpath2 = String.format(AdvLimbLocator.chk_monofilament_testing_left, AdvlimbLeft_3rd_digit);  
		clickElementWithJQuery(By.xpath(xpath2));
		list_Left_mono .add(AdvlimbLeft_3rd_digit);
	}
	
	else if(section.contains("1st MTH")){
		AdvlimbLeft_1st_MTH = "1st MTH";
		String xpath2 = String.format(AdvLimbLocator.chk_monofilament_testing_left, AdvlimbLeft_1st_MTH);  
		clickElementWithJQuery(By.xpath(xpath2));
		list_Left_mono .add(AdvlimbLeft_1st_MTH);
	}
	
	else if(section.contains("5th MTH")){
		AdvlimbLeft_5th_MTH = "5th MTH";
		String xpath2 = String.format(AdvLimbLocator.chk_monofilament_testing_left, AdvlimbLeft_5th_MTH);  
		clickElementWithJQuery(By.xpath(xpath2));
		list_Left_mono .add(AdvlimbLeft_5th_MTH);
	}
	else if(section.contains("Heel")){
		AdvlimbLeft_Heel = "Heel";
		String xpath2 = String.format(AdvLimbLocator.chk_monofilament_testing_left, AdvlimbLeft_Heel);  
		clickElementWithJQuery(By.xpath(xpath2));
		list_Left_mono .add(AdvlimbLeft_Heel);
	}
	else if(section.contains("1st digit")){
		AdvlimbLeft_1st_digit = "1st digit";
		String xpath2 = String.format(AdvLimbLocator.chk_monofilament_testing_left, AdvlimbLeft_1st_digit);  
		clickElementWithJQuery(By.xpath(xpath2));
		list_Left_mono .add(AdvlimbLeft_1st_digit);
	}
	else if(section.contains("5th digit")){
		AdvlimbLeft_5th_digit = "5th digit";
		String xpath2 = String.format(AdvLimbLocator.chk_monofilament_testing_left, AdvlimbLeft_5th_digit);  
		clickElementWithJQuery(By.xpath(xpath2));
		list_Left_mono .add(AdvlimbLeft_5th_digit);
	}
	else if(section.contains("3rd MTH")){
		AdvlimbLeft_3rd_MTH = "3rd MTH";
		String xpath2 = String.format(AdvLimbLocator.chk_monofilament_testing_left, AdvlimbLeft_3rd_MTH);  
		clickElementWithJQuery(By.xpath(xpath2));
		list_Left_mono .add(AdvlimbLeft_3rd_MTH);
	}
	else if(section.contains("Medial")){
		AdvlimbLeft_Medial = "Medial";
		String xpath2 = String.format(AdvLimbLocator.chk_monofilament_testing_left, AdvlimbLeft_Medial);  
		clickElementWithJQuery(By.xpath(xpath2));
		list_Left_mono .add(AdvlimbLeft_Medial);
	}
	else{
		AdvlimbLeft_Dorsum = "Dorsum";
		String xpath2 = String.format(AdvLimbLocator.chk_monofilament_testing_left, AdvlimbLeft_Dorsum);  
		clickElementWithJQuery(By.xpath(xpath2));
		list_Left_mono.add(AdvlimbLeft_Dorsum);
	}
}
public void selectRight_Limb_Shape_field_ALB(String section) {
	if (section.contains("Champagne-bottle shaped")) {
		AdvlimbRight_Champagne_bottle_shaped = "Champagne-bottle shaped";
		String xpath1 =String.format(AdvLimbLocator.chk_limpshaped_testing_right, AdvlimbRight_Champagne_bottle_shaped);  
		clickElementWithJQuery(By.xpath(xpath1));
		list_Right_llsf.add(AdvlimbRight_Champagne_bottle_shaped);
	}
	else if (section.contains("Wasted calf muscle")) {
		AdvlimbRight_Wasted_calf_muscle = "Wasted calf muscle";
		String xpath2 = String.format(AdvLimbLocator.chk_limpshaped_testing_right, AdvlimbRight_Wasted_calf_muscle);  
		clickElementWithJQuery(By.xpath(xpath2));
		list_Right_llsf.add(AdvlimbRight_Wasted_calf_muscle);
	}
	
	else {
		AdvlimbRight_None_of_the_above = "None of the above";
		String xpath2 = String.format(AdvLimbLocator.chk_limpshaped_testing_right, AdvlimbRight_None_of_the_above);  
		clickElementWithJQuery(By.xpath(xpath2));
		list_Right_llsf.add(AdvlimbRight_None_of_the_above);
	}
}
	
public void selectLeft_Limb_Shape_field_ALB(String section) {
	if (section.contains("Champagne-bottle shaped")) {
		AdvlimbLeft_Champagne_bottle_shaped = "Champagne-bottle shaped";
		String xpath1 =String.format(AdvLimbLocator.chk_limpshaped_testing_left, AdvlimbLeft_Champagne_bottle_shaped);  
		clickElementWithJQuery(By.xpath(xpath1));
		list_Left_llsf.add(AdvlimbLeft_Champagne_bottle_shaped);
	}
	else if (section.contains("Wasted calf muscle")) {
		AdvlimbLeft_Wasted_calf_muscle = "Wasted calf muscle";
		String xpath2 = String.format(AdvLimbLocator.chk_limpshaped_testing_left, AdvlimbLeft_Wasted_calf_muscle);  
		clickElementWithJQuery(By.xpath(xpath2));
		list_Left_llsf.add(AdvlimbLeft_Wasted_calf_muscle);
	}
	
	else {
		AdvlimbLeft_None_of_the_above = "None of the above";
		String xpath2 = String.format(AdvLimbLocator.chk_limpshaped_testing_left, AdvlimbLeft_None_of_the_above);  
		clickElementWithJQuery(By.xpath(xpath2));
		list_Left_llsf.add(AdvlimbLeft_None_of_the_above);
}
}
public void selectRight_Toe_Nails_fieldAdvLimbCheckBox(String section)
{
	if (section.contains("Incorrect length short")) {
		AdvlimbRight_TN1 = "Incorrect length short";
		String xpath1 =String.format(AdvLimbLocator.chk_toe_nails_ri8,AdvlimbRight_TN1);  
		clickElementWithJQuery(By.xpath(xpath1));
		list_Right_Toe_Nails.add(AdvlimbRight_TN1);
	}
	
	else if (section.contains("Discoloured")) {
		AdvlimbRight_TN2= "Discoloured";
		String xpath2 = String.format(AdvLimbLocator.chk_toe_nails_ri8, AdvlimbRight_TN2);  
		clickElementWithJQuery(By.xpath(xpath2));
		list_Right_Toe_Nails.add(AdvlimbRight_TN2);
	}
	
	else if(section.contains("Fungal infection")){
		AdvlimbRight_TN3 = "Fungal infection";
		String xpath2 = String.format(AdvLimbLocator.chk_toe_nails_ri8, AdvlimbRight_TN3);  
		clickElementWithJQuery(By.xpath(xpath2));
		list_Right_Toe_Nails.add(AdvlimbRight_TN3);
	}
	
	else {
		AdvlimbRight_TN4 = "Ridged";
		String xpath2 = String.format(AdvLimbLocator.chk_toe_nails_ri8, AdvlimbRight_TN4);  
		clickElementWithJQuery(By.xpath(xpath2));
		list_Right_Toe_Nails.add(AdvlimbRight_TN4);
	}
}
public void selectLeft_Toe_Nails_fieldAdvLimbCheckBox(String section)
{
	if (section.contains("Incorrect length short")) {
		AdvlimbLeft_TN1 = "Incorrect length short";
		String xpath1 =String.format(AdvLimbLocator.chk_toe_nails_li8,AdvlimbLeft_TN1);  
		clickElementWithJQuery(By.xpath(xpath1));
		list_Left_Toe_Nails.add(AdvlimbLeft_TN1);
	}
	
	else if (section.contains("Discoloured")) {
		AdvlimbLeft_TN2 = "Discoloured";
		String xpath2 = String.format(AdvLimbLocator.chk_toe_nails_li8, AdvlimbLeft_TN2);  
		clickElementWithJQuery(By.xpath(xpath2));
		list_Left_Toe_Nails.add(AdvlimbLeft_TN2);
	}
	
	else if(section.contains("Fungal infection")){
		AdvlimbLeft_TN3 = "Fungal infection";
		String xpath2 = String.format(AdvLimbLocator.chk_toe_nails_li8, AdvlimbLeft_TN3);  
		clickElementWithJQuery(By.xpath(xpath2));
		list_Left_Toe_Nails.add(AdvlimbLeft_TN3);
	}
	
	else {
		AdvlimbLeft_TN4 = "Ridged";
		String xpath2 = String.format(AdvLimbLocator.chk_toe_nails_li8, AdvlimbLeft_TN4);  
		clickElementWithJQuery(By.xpath(xpath2));
		list_Left_Toe_Nails.add(AdvlimbLeft_TN4);
	}
}
public void selectLeft_Skin_Appearance_Advanced_fieldAdvLimbCheckBox(String section) {
	if (section.contains("Dependent rubor")) {
		AdvlimbLeft_Dependent_rubor = "Dependent rubor";
		String xpath1 =String.format(AdvLimbLocator.chk_SkinAppearance_testing_left,AdvlimbLeft_Dependent_rubor);  
		clickElementWithJQuery(By.xpath(xpath1));
		list_Left_Skin_Appe.add(AdvlimbLeft_Dependent_rubor);
	}
	
	else if (section.contains("Stasis dermatitis")) {
		AdvlimbLeft_Stasis_dermatitis = "Stasis dermatitis";
		String xpath2 = String.format(AdvLimbLocator.chk_SkinAppearance_testing_left, AdvlimbLeft_Stasis_dermatitis);  
		clickElementWithJQuery(By.xpath(xpath2));
		list_Left_Skin_Appe.add(AdvlimbLeft_Stasis_dermatitis);
	}
	
	else {
		AdvlimbLeft_Varicosities = "Varicosities";
		String xpath2 = String.format(AdvLimbLocator.chk_SkinAppearance_testing_left, AdvlimbLeft_Varicosities);  
		clickElementWithJQuery(By.xpath(xpath2));
		list_Left_Skin_Appe.add(AdvlimbLeft_Varicosities);
	}
}
public void selectRight_Skin_Appearance_Advanced_fieldAdvLimbCheckBox(String section) {
	if (section.contains("Dependent rubor")) {
		AdvlimbRight_Dependent_rubor = "Dependent rubor";
		String xpath1 =String.format(AdvLimbLocator.chk_SkinAppearance_testing_right,AdvlimbRight_Dependent_rubor);  
		clickElementWithJQuery(By.xpath(xpath1));
		list_Right_Skin_Appe.add(AdvlimbRight_Dependent_rubor);
	}
	
	else if (section.contains("Stasis dermatitis")) {
		AdvlimbRight_Stasis_dermatitis = "Stasis dermatitis";
		String xpath2 = String.format(AdvLimbLocator.chk_SkinAppearance_testing_right, AdvlimbRight_Stasis_dermatitis);  
		clickElementWithJQuery(By.xpath(xpath2));
		list_Right_Skin_Appe.add(AdvlimbRight_Stasis_dermatitis);
	}
	
	else {
		AdvlimbRight_Varicosities = "Varicosities";
		String xpath2 = String.format(AdvLimbLocator.chk_SkinAppearance_testing_right, AdvlimbRight_Varicosities);  
		clickElementWithJQuery(By.xpath(xpath2));
		list_Right_Skin_Appe.add(AdvlimbRight_Varicosities);
	}
}

}
