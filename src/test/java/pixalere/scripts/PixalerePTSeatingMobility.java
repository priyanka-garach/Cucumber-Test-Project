package pixalere.scripts;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;

import pixalere.pageObjectUtils.PixalereCommonUtils;

public class PixalerePTSeatingMobility extends PixalereCommonUtils {
	
	public static String assessment_initiated;
	public static String Home_Access;
	public static String Basic_and_essential_use_of_home;
	public static String Equipment_in_place;
	public static String Physical_Cognition;
	public static String radio_Ambulation;
	public static String radio_three_wheel;
	public static String radio_Analysis_and_Recommendation_Provided;
	public static String radio_Confirmed_the_status_of_any_prior_funding_access_to_ADP;
	public static String ADP_Eligibility_Screened;
	public static String radio_data_Mobility_device_inspected_and_appears_to_be_in_working_order;
	public static String radio_SDM_and_Role_activities_for_vendor_in_relation;
	public static String InformedConsent;
	public static String radio_for_ADP_application_delivered_via;
	public static String ADP_Application_for_Funding_Completed;
	public static List<String> chk_for_Cognition = new ArrayList<>();
	public static List<String> chk_for_Supplementary_Funding = new ArrayList<>();
	public static List<String> chk_for_During_assessment = new ArrayList<>();
	public static List<String> chk_Analysis_and_Recommendation_Provided = new ArrayList<>();
	public static List<String> chk_Proposed_Health_Services_Discussed = new ArrayList<>();
	public static List<String> chk_Consent_obtained_from = new ArrayList<>();
	public static List<String> chk_Client_appears_to_meet_ADP_eligibility = new ArrayList<>();
	public static List<String> chk_for_rationale = new ArrayList<>();
	public static List<String> chk_for_client_portion = new ArrayList<>();
	public static List<String> chk_for_ADP_application_submitted_to = new ArrayList<>();
	
	
	public void verify_assesment_data() {
		assessment_initiated="Yes";
	}
	
	public void data_for_Assessment_data_obtained() {
		Home_Access = "House";
		clickElement(By.xpath("(//label[contains(@class,'home_label')])[1]"));
	}
	
	public void data_for_Assessment_data_obtained_basic() {
		Basic_and_essential_use_of_home = "Basic and essential use of home is functional/accessible for client with mobility device";
		clickElement(By.xpath("(//label[contains(@for,'access_difficulties')])[1]"));
	}
	
	public void data_for_Equipment_in_place(String s) {
		Equipment_in_place = s;
		clickElement(By.xpath("(//label[contains(@for,'equipment_chkb')])[2]"));
	}
	
	public void data_for_Physical_Cognition(String s) {
		Physical_Cognition = s;
		clickElement(By.xpath("(//label[contains(@for,'ot_cognition_assessed_master')])[2]"));
	}
	
	public void chk_for_Cognition(String string) {
		if(string.equalsIgnoreCase("Known diagnosis of dementia/mild cognitive impairment")) {
			clickElement(By.xpath("(//label[contains(@for,'ot_cognition_assessed')])[3]"));
			chk_for_Cognition.add(string);
		}
		
		if(string.contains("Perception")) {
			clickElement(By.xpath("(//label[contains(@for,'ot_cognition_assessed')])[9]"));
			chk_for_Cognition.add(string);
		}
	}
	
	public void chk_for_Supplementary_Funding_Availability(String string) {
		if(string.equalsIgnoreCase("ODSP/OW")) {
			clickElement(By.xpath("(//label[contains(@for,'income_assessed')])[1]"));
			chk_for_Supplementary_Funding.add(string);
		}
		
		if(string.contains("VAC")) {
			clickElement(By.xpath("(//label[contains(@for,'income_assessed')])[3]"));
			chk_for_Supplementary_Funding.add(string);
		}
		
		if(string.equalsIgnoreCase("Insurance")) {
			clickElement(By.xpath("(//label[contains(@for,'income_assessed')])[4]"));
			chk_for_Supplementary_Funding.add(string);
		}
		
		if(string.equalsIgnoreCase("WSIB")) {
			clickElement(By.xpath("(//label[contains(@for,'income_assessed')])[5]"));
			chk_for_Supplementary_Funding.add(string);
		}
		
	}
	
	public void radio_Analysis_and_Recommendation_Provided(String s) {
		radio_Analysis_and_Recommendation_Provided = "Yes";
	}
	
	public void radio_Ambulation(String s) {
		radio_Ambulation = "WFL - functional ambulation without aid";
		clickElement(By.xpath("(//label[contains(@for,'ambulation_stair')])[1]"));
	}
	
	public void radio_three_wheel(String string) {
		radio_three_wheel = string;
		clickElement(By.xpath("(//label[contains(@for,'scooter_type')])[1]"));
	}
	
	public void radio_ADP_Eligibility_Screened() {
		ADP_Eligibility_Screened = "Yes";
	}
	
	public void radio_Confirmed_the_status_of_any_prior_funding_access_to_ADP(String string) {
		radio_Confirmed_the_status_of_any_prior_funding_access_to_ADP = string;
		clickElement(By.xpath("(//label[contains(@for,'prior_funding')])[1]"));
	}
	
	public void radio_Confirmed_the_status(String string) {
		radio_Confirmed_the_status_of_any_prior_funding_access_to_ADP = string;
		clickElement(By.xpath("(//label[contains(@for,'prior_funding_which')])[1]"));
	}
	
	public void radio_for_Client_their_representative_is_aware_of_the_client_portion_to_be_paid(String string) {
		radio_Confirmed_the_status_of_any_prior_funding_access_to_ADP = string;
		clickElement(By.xpath("(//label[contains(@for,'client_portion_radio')])[1]"));
	}
	
	public void radio_SDM_and_Role_activities_for_vendor_in_relation() {
		radio_SDM_and_Role_activities_for_vendor_in_relation = "Yes";
	}
	
	public void radio_data_Mobility_device_inspected_and_appears_to_be_in_working_order() {
		radio_data_Mobility_device_inspected_and_appears_to_be_in_working_order = "Yes";
	}
	
	public void radio_for_ADP_application_delivered_via(String string) {
		clickElement(By.xpath("(//label[contains(@for,'app_delivered')])[2]"));
		radio_for_ADP_application_delivered_via = string;
	}
	
	
	public void chk_Client_appears_to_meet_ADP_eligibility() {
		chk_Client_appears_to_meet_ADP_eligibility.add("Device(s) needed for ongoing, daily use.");
		chk_Client_appears_to_meet_ADP_eligibility.add("Device(s) needed to permit entry/exit from home.");
		chk_Client_appears_to_meet_ADP_eligibility.add("Device(s) primarily needed for basic mobility within client’s residence.");
		chk_Client_appears_to_meet_ADP_eligibility.add("Client has a valid Ontario Health Card.");
		chk_Client_appears_to_meet_ADP_eligibility.add("Client is a permanent resident of Ontario.");
		chk_Client_appears_to_meet_ADP_eligibility.add("Client has a long term disability and anticipated need for the device >6 months.");
	}
	
	public void chk_for_rationale(String string) {
		if(string.equalsIgnoreCase("Change of status")) {
			clickElement(By.xpath("(//label[contains(@for,'reply_adp_funding')])[1]"));
			chk_for_rationale.add(string);
		}
		
		if(string.equalsIgnoreCase("Change of size")) {
			clickElement(By.xpath("(//label[contains(@for,'reply_adp_funding')])[2]"));
			chk_for_rationale.add(string);
		}
		
		if(string.equalsIgnoreCase("Equipment worn beyond repair")) {
			clickElement(By.xpath("(//label[contains(@for,'reply_adp_funding')])[3]"));
			chk_for_rationale.add(string);
		}
		
		if(string.equalsIgnoreCase("Special circumstances")) {
			clickElement(By.xpath("(//label[contains(@for,'reply_adp_funding')])[4]"));
			chk_for_rationale.add(string);
		}
	
	}
	
	public void chk_Analysis_and_Recommendation_Provided(String string) {
		if(string.equalsIgnoreCase("Power scooter")) {
			clickElement(By.xpath("(//label[contains(@for,'analysis')])[6]"));
			chk_Analysis_and_Recommendation_Provided.add(string);
		}
		
		if(string.contains("Client is not able to propel manual wheelchair a functional distance")) {
			clickElement(By.xpath("(//label[contains(@for,'analysis')])[8]"));
			chk_Analysis_and_Recommendation_Provided.add("Client is not able to propel manual wheelchair a functional distance");
		}
		
		if(string.contains("Client has adequate cognitive, self-regulatory, visual and perceptual skills to recommend power mobility")) {
			clickElement(By.xpath("(//label[contains(@for,'analysis')])[9]"));
			chk_Analysis_and_Recommendation_Provided.add("Client has adequate cognitive, self-regulatory, visual and perceptual skills to recommend power mobility");
		}
	}
	
	public void chk_for_During_assessment(String string) {
		if(string.equalsIgnoreCase("Transfers")) {
			clickElement(By.xpath("(//label[contains(@for,'observations')])[4]"));
			chk_for_During_assessment.add(string);
		}
	}
	
	public void chk_Proposed_Health_Services_Discussed() {
		chk_Proposed_Health_Services_Discussed.add("Provide mobility device recommendations");
		chk_Proposed_Health_Services_Discussed.add("Trial equipment");
		chk_Proposed_Health_Services_Discussed.add("Educate/train on safe equipment use");
		chk_Proposed_Health_Services_Discussed.add("Funding applications");
		chk_Proposed_Health_Services_Discussed.add("Follow-up service/contact upon receipt of ADP funding decision");
		chk_Proposed_Health_Services_Discussed.add("RABQ-Risks, alternatives, benefits of this service discussed. Risks of not receiving service discussed. Questions addressed.");
	}
	
	public void chk_Consent_obtained_from() {
		chk_Consent_obtained_from.add("Client");
		chk_Consent_obtained_from.add("Verbally");
	}
	
	public void chk_for_client_portion(String string) {
		if(string.equalsIgnoreCase("ODSP")) {
			clickElement(By.xpath("(//label[contains(@for,'client_funding_portion')])[3]"));
			chk_for_client_portion.add(string);
		}
		
		if(string.equalsIgnoreCase("ACSD")) {
			clickElement(By.xpath("(//label[contains(@for,'client_funding_portion')])[4]"));
			chk_for_client_portion.add(string);
		}
	}
	
	public void chk_for_ADP_application_submitted_to(String string) {
		chk_for_ADP_application_submitted_to.add(string);
	}
	
	public void verify_data_for_ADP_Application_for_Funding_Completed() {
		InformedConsent = "ADP, Vendor";
		ADP_Application_for_Funding_Completed = "Yes";
	}
	

}