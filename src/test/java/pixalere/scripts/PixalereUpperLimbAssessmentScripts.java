package pixalere.scripts;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;

import pixalere.pageObjectUtils.LocatorUtils.CustomizedLocators;
import pixalere.pageObjectUtils.LocatorUtils.UpperLimbLocator;
import pixalere.pageObjectUtils.PixalereCommonUtils;

public class PixalereUpperLimbAssessmentScripts extends PixalereCommonUtils {

	public static String Right_fingers1=null;
	public static String Right_fingers2=null;
	public static String Right_fingers3=null;
	public static String Right_fingers4=null;
	public static String Right_fingers5=null;
	public static String Right_fingers6=null;
	public static String Right_fingers7=null;
	
	public static String Left_fingers1=null;
	public static String Left_fingers2=null;
	public static String Left_fingers3=null;
	public static String Left_fingers4=null;
	public static String Left_fingers5=null;
	public static String Left_fingers6=null;
	public static String Left_fingers7=null;
	
	
	
	
	public static List<String> list_ri8_fingers_upperLimb = new ArrayList<>();
	public static List<String> list_left_fingers_upperLimb = new ArrayList<>();
	

	/*public void selectRadioOptionForLowerRightLegSkinColor(String value, String section) {
		clickElement(CustomizedLocators.getRadioOptionByLowerLegSkinColor(value, section));
	}*/
	
	public void selectRadioOptionForUpperHandSkinColor(String value, String section) {
		clickElement(CustomizedLocators.getRadioOptionByUpperHandSkinColor(value, section));
	}
	
	public void selectRadioOptionForUpperRightArmSkinColor(String value, String section) {
		clickElement(CustomizedLocators.getRadioOptionByUpperRightArmSkinColor(value, section));
	}
	public void selectRadioOptionForUpperFingersSkinSkinColor(String value, String section) {
		clickElement(CustomizedLocators.getRadioOptionByUpperFingersSkinColor(value, section));
		
	}
	public void selectRadioOptionForUpperArmSkinWarmth(String value, String section) {
		clickElement(CustomizedLocators.getRadioOptionByUpperArmSkinWarmth(value, section));
		
	}
	public void selectRadioOptionForUpperHandSkinWarmth(String value, String section) {
		clickElement(CustomizedLocators.getRadioOptionByUpperHandSkinWarmth(value, section));
		
	}
	public void selectRadioOptionForUpperFingersSkinWarmth(String value, String section) {
		clickElement(CustomizedLocators.getRadioOptionByUpperFingersSkinWarmth(value, section));
		
	}
	public void selectRadioOptionForRightElbowMotionfield(String value, String section) {
		clickElement(CustomizedLocators.getRadioOptionByUpperRightElbowMotionfield(value, section));
		
	}
	public void selectRadioOptionForRightWristMotionfield(String value, String section) {
		clickElement(CustomizedLocators.getRadioOptionByUpperRightWristMotionfield(value, section));	
	}
	public void selectRadioOptionForRightThumbMotionfield(String value, String section) {
		clickElement(CustomizedLocators.getRadioOptionByUpperRightThumbMotionfield(value, section));
	}
	
	
	public void selectRadioRightMissingLimbsorFingersCheckBox(String section) {
		
		if (section.contains("Fourth finger")) {	
			Right_fingers7 = "Fourth finger";
			String xpath2 = String.format(UpperLimbLocator.chk_right_missing_limbs_fingers, Right_fingers7);  
			clickElementWithJQuery(By.xpath(xpath2));
			list_ri8_fingers_upperLimb.add(Right_fingers7);	
		}
		
		else if (section.contains("Thumb")) {
			Right_fingers2 = "Thumb";
			String xpath2 = String.format(UpperLimbLocator.chk_right_missing_limbs_fingers, Right_fingers2);  
			clickElementWithJQuery(By.xpath(xpath2));
			list_ri8_fingers_upperLimb.add(Right_fingers2);
		}
		
		else if(section.contains("No amputations")){
			Right_fingers3 = "No amputations";
			String xpath2 = String.format(UpperLimbLocator.chk_right_missing_limbs_fingers, Right_fingers3);  
			clickElementWithJQuery(By.xpath(xpath2));
			list_ri8_fingers_upperLimb.add(Right_fingers3);
		}
		
		else if(section.contains("Arm below elbow")){
			Right_fingers4 = "Arm below elbow";
			String xpath2 = String.format(UpperLimbLocator.chk_right_missing_limbs_fingers, Right_fingers4);  
			clickElementWithJQuery(By.xpath(xpath2));
			list_ri8_fingers_upperLimb.add(Right_fingers4);
		}
		else if(section.contains("Hand all")){
			Right_fingers5 = "Hand all";
			String xpath2 = String.format(UpperLimbLocator.chk_right_missing_limbs_fingers, Right_fingers5);  
			clickElementWithJQuery(By.xpath(xpath2));
			list_ri8_fingers_upperLimb.add(Right_fingers5);
		}
		else if(section.contains("Second finger")){
			Right_fingers6 = "Second finger";
			String xpath2 = String.format(UpperLimbLocator.chk_right_missing_limbs_fingers, Right_fingers6);  
			clickElementWithJQuery(By.xpath(xpath2));
			list_ri8_fingers_upperLimb.add(Right_fingers6);
		}
		
		else{
			
		}
		
}
public void selectRadioLeftMissingLimbsorFingersCheckBox(String section) {
		
		if (section.contains("Fourth finger")) {
			Left_fingers7 = "Fourth finger";
			String xpath2 = String.format(UpperLimbLocator.chk_left_missing_limbs_fingers, Left_fingers7);  
			clickElementWithJQuery(By.xpath(xpath2));
			list_left_fingers_upperLimb.add(Left_fingers7);
		}
		
		else if (section.contains("Thumb")) {
			Left_fingers2 = "Thumb";
			String xpath2 = String.format(UpperLimbLocator.chk_left_missing_limbs_fingers, Left_fingers2);  
			clickElementWithJQuery(By.xpath(xpath2));
			list_left_fingers_upperLimb.add(Left_fingers2);
		}
		
		else if(section.contains("No amputations")){
			Left_fingers3 = "No amputations";
			String xpath2 = String.format(UpperLimbLocator.chk_left_missing_limbs_fingers, Left_fingers3);  
			clickElementWithJQuery(By.xpath(xpath2));
			list_left_fingers_upperLimb.add(Left_fingers3);
		}
		
		else if(section.contains("Arm below elbow")){
			Left_fingers4 = "Arm below elbow";
			String xpath2 = String.format(UpperLimbLocator.chk_left_missing_limbs_fingers, Left_fingers4);  
			clickElementWithJQuery(By.xpath(xpath2));
			list_left_fingers_upperLimb.add(Left_fingers4);
		}
		else if(section.contains("Hand all")){
			Left_fingers5 = "Hand all";
			String xpath2 = String.format(UpperLimbLocator.chk_left_missing_limbs_fingers, Left_fingers5);  
			clickElementWithJQuery(By.xpath(xpath2));
			list_left_fingers_upperLimb.add(Left_fingers5);
		}
		else if(section.contains("Second finger")){
			Left_fingers6 = "Second finger";
			String xpath2 = String.format(UpperLimbLocator.chk_left_missing_limbs_fingers, Left_fingers6);  
			clickElementWithJQuery(By.xpath(xpath2));
			list_left_fingers_upperLimb.add(Left_fingers6);
		}
		
		else{
			
		}
		
}
}
