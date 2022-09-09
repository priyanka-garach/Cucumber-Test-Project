package pixalere.scripts;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;

import pixalere.pageObjectUtils.LocatorUtils.ClienConsentLocator;
import pixalere.pageObjectUtils.PixalereCommonUtils;

public class PixalereMobilityAssessmentScripts extends PixalereCommonUtils {
	
	public static String chk_or_Family_friends_caregivers;
	public static String chk_for_Medical_Contacts;
	public static String chk_to_use_electronic;
	public static String Notice_of_Information_Practices_provided_to_clientSDM;
	public static String Risk_for_alternatives_and_benefits;
	public static String Your_service_funder;
	public static String virtual_care_with_telephone;
	public static String virtual_care_with_video;
	public static String regarding_virtual_care_with_video_Client_SDM_provided_informed_consent;
	public static String the_Service_Provider_have_completed_this_consent_discussion_with_the_clientSDM;
	public static String pt_regarding_virtual_care_with_no_video_Client_SDM_provided_informed_consent;
	public static String pt_regarding_virtual_care_with_video_Client_SDM_provided_informed_consent;
	
	public static List<String> chk_Proposed_Health_Services_Discussed = new ArrayList<String>();   
	public static List<String> chk_Client_not_interested_in_virtual_care_by_telephone_because = new ArrayList<String>();
	public static List<String> chk_Consent_obtained_from = new ArrayList<String>();
	public static List<String> chk_realtionship = new ArrayList<String>();
	
	public void chk_click_on_Proposed_Health_Services_Discussed(String section) {
		if (section.equalsIgnoreCase("As per that described by goals/care plan")) {
			String xpath1 = String.format(ClienConsentLocator.chk_proposedHealth, section);
			clickElement(By.xpath(xpath1));
			chk_Proposed_Health_Services_Discussed.add(section);
		}
		if (section.equalsIgnoreCase("Other")) {
			clickElement(By.xpath("(//label[contains(text(),'Other')])[2]"));
			chk_Proposed_Health_Services_Discussed.add(section);
		}
	}
	
	public void chk_or_Family_friends_caregivers(String string) {
		clickElementWithJQuery(ClienConsentLocator.chk_consent_contacts);
		chk_or_Family_friends_caregivers = string;
	}
	
	public void chk_for_Medical_Contacts(String string) {
		clickElementWithJQuery(ClienConsentLocator.chk_for_Medical_Contacts);
		chk_for_Medical_Contacts = string;
	}
	
	public void chk_for_Virtual_Care_Consent(String string) {
		clickElementWithJQuery(ClienConsentLocator.chk_for_Consent_to_use_electronic);
		chk_to_use_electronic = "Yes";
	}
	
	public void chk_for_use_electronic(String string) {
		clickElementWithJQuery(ClienConsentLocator.chk_for_Consent_to_use_electronic);
		chk_to_use_electronic = "Yes";
	}
	
	public void chk_Client_not_interested_in_virtual_care_by_telephone_because(String string) {
		String xpath1 = String.format(ClienConsentLocator.chk_is_not_inetrested_telephone, string);
		clickElementWithJQuery(By.xpath(xpath1));
		chk_Client_not_interested_in_virtual_care_by_telephone_because.add(string);
	}
	
	public void chk_checkbox_for_Consent_obtained_from(String string) {
		chk_Consent_obtained_from.add("Verbally");
		String xpath1 = String.format(ClienConsentLocator.chk_consent_obtained_from, string);
		clickElementWithJQuery(By.xpath(xpath1));
		chk_Consent_obtained_from.add(string);
	}
	
	public void chk_for_Relationship(String string) {
		String xpath1 = String.format(ClienConsentLocator.chk_relationship, string);
		clickElementWithJQuery(By.xpath(xpath1));
		chk_realtionship.add(string);
	}
	
	public void chk_for_Lock_Box_Required(String string) {
		clickElement(By.xpath("//*[@id='lock_box_label']"));
	}
	
	public void radio_Risk_for_alternatives_and_benefits_of_service_discussed(String string) {
		Risk_for_alternatives_and_benefits = string;
		if(string.equalsIgnoreCase("Yes")) {
		clickElement(By.xpath("(//label[contains(@for,'questions_addressed')])[1]"));
		}
		else {
			clickElement(By.xpath("(//label[contains(@for,'questions_addressed')])[2]"));
		}
	}
	
	public void radio_for_Notice_of_Information_Practices_provided_to_clientSDM(String string) {
		Notice_of_Information_Practices_provided_to_clientSDM = string;
		if(string.equalsIgnoreCase("Yes")) {
			clickElement(By.xpath("(//label[contains(@for,'vha_health_information_condition')])[1]"));
		}else {
			clickElement(By.xpath("(//label[contains(@for,'vha_health_information_condition')])[2]"));
		}
	}
	
	public void radio_for_Your_service_funder(String string) {
		Your_service_funder = string;
		if(string.equalsIgnoreCase("LHIN")) {
			clickElement(By.xpath("(//label[contains(@for,'your_service_funder')])[1]"));
		}else {
			clickElement(By.xpath("(//label[contains(@for,'your_service_funder')])[2]"));
		}
	}
	
	public void radio_click_radio_Client_is_aware_of_the_option_of_virtual_care_with_telephone(String string) {
		virtual_care_with_telephone = string;
		if(string.equalsIgnoreCase("Aware but not interested")) {
			clickElement(By.xpath("(//label[contains(@for,'e_consent_tel')])[2]"));
		}else {
			clickElement(By.xpath("(//label[contains(@for,'e_consent_tel')])[1]"));
		}
	}
	
	public void radio_Client_is_aware_of_the_option_of_virtual_care_with_video(String string) {
		virtual_care_with_video = string;
		if(string.equalsIgnoreCase("Aware but not interested")) {
			clickElement(By.xpath("(//label[contains(@for,'e_consent_video')])[2]"));
		}else {
			clickElement(By.xpath("(//label[contains(@for,'e_consent_video')])[1]"));
		}
	}
	
	public void radio_regarding_virtual_care_with_video_Client_SDM_provided_informed_consent(String string){
		regarding_virtual_care_with_video_Client_SDM_provided_informed_consent = string;
		clickElement(By.xpath("(//label[contains(@for,'video_consent1')])[1]"));
	}
	
	public void radio_pt_reviewed_regarding_virtual_care_with_video_Client_SDM_provided_informed_consent(String string){
		pt_regarding_virtual_care_with_no_video_Client_SDM_provided_informed_consent = string;
		if(string.equalsIgnoreCase("Yes")) {
			clickElement(By.xpath("(//label[contains(@for,'telephone_consent')])[1]"));
		}
		else
		{
			clickElement(By.xpath("(//label[contains(@for,'telephone_consent')])[2]"));
		}
	}
	
	public void radio_regarding_virtual_care_with_novideo_Client_SDM_provided_informed_consent(String string){
		pt_regarding_virtual_care_with_video_Client_SDM_provided_informed_consent = string;
		clickElement(By.xpath("(//label[contains(@for,'video_consent')])[1]"));
	}
	
	public void radio_I_the_Service_Provider_have_completed_this_consent_discussion_with_the_clientSDM(String string) {
		the_Service_Provider_have_completed_this_consent_discussion_with_the_clientSDM = string;
		highLightElement(By.xpath("(//label[contains(@for,'e_consent_video')])[1]"));
	}
	
	

}