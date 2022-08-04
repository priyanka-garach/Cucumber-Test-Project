package pixalere.scripts;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;

import pixalere.pageObjectUtils.LocatorUtils.CustomizedLocators;
import pixalere.pageObjectUtils.LocatorUtils.TeachingAgreementPT;
import pixalere.pageObjectUtils.PixalereCommonUtils;

public class PixalereTeachingAgreementScript extends PixalereCommonUtils {
	public static List<String> TeachingAgreement_Checkbox = new ArrayList<>();
	
	public void selectRadioOptionFromSection_Activities_Assigned(String section) {
		clickElement(CustomizedLocators.getRadioOptionByActivities_Assigned(section));
	}
	public void selectRadioOptionFromSection_modification_plan(String section) {
		clickElement(CustomizedLocators.getRadioOptionBymodification_plan(section));
	}
	public void selectRadioOptionFromSection_service_provider(String section) {
		clickElement(CustomizedLocators.getRadioOptionByservice_provider(section));
	}
	public void selectRadioOptionFromSection_Education_received(String section) {
		clickElement(CustomizedLocators.getRadioOptionByEducation_received(section));
	}
	public void selectRadioOptionFromSection_alternatives_and_benefits(String section) {
		clickElement(CustomizedLocators.getRadioOptionByalternatives_and_benefits(section));
	}
	public void selectRadioOptionFromSection_PSW_providing(String section) {
		clickElement(CustomizedLocators.getRadioOptionByPSW_providing(section));
	}
	public void selectRadioOptionFromSection_demonstrated_understanding(String section) {
		clickElement(CustomizedLocators.getRadioOptionBydemonstrated_understanding(section));
	}
	public void selectRadioOptionFromSection_Service_Supervisor(String section) {
		clickElement(CustomizedLocators.getRadioOptionByService_Supervisor(section));
	}
	public void selectPSWfromLearner(String section) {
		selectByVisibleText(TeachingAgreementPT.drp_learner, section);
	}
	public void selectVHAfromemployee(String section) {
		selectByVisibleText(TeachingAgreementPT.drp_employee, section);
	}
	public void clickonsave() {
		clickElement(By.id("saveEntries"));
	}
	public void selectActivityCheckbox(String section) {
		if (section.contains("Activity to be Instructed")) {
			clickElementWithJQuery(TeachingAgreementPT.Activity_to_be_Instructed);
			TeachingAgreement_Checkbox.add(section);
		}
		else if(section.contains("Breathing exercises")) {
			clickElement(TeachingAgreementPT.chk_Breathing_exercises);
			TeachingAgreement_Checkbox.add(section);
		}
		else if(section.contains("Ambulation")) {
			clickElement(TeachingAgreementPT.chk_Ambulation);
			TeachingAgreement_Checkbox.add(section);
		}
		else if(section.contains("Stairs")) {
			clickElement(TeachingAgreementPT.chk_Stairs);
			TeachingAgreement_Checkbox.add(section);
		}
		else if(section.contains("Bathroom safety")) {
			clickElement(TeachingAgreementPT.chk_Bathroom_safety);
			TeachingAgreement_Checkbox.add(section);
		}
		else if(section.contains("Transfers")) {
			clickElement(TeachingAgreementPT.chk_Transfers);
			TeachingAgreement_Checkbox.add(section);
		}
		else if(section.contains("Transfer board")) {
			clickElement(TeachingAgreementPT.chk_Transfer_board);
			TeachingAgreement_Checkbox.add(section);
		}
		else if(section.contains("Stair glide transfer")) {
			clickElement(TeachingAgreementPT.chk_Stair_glide_transfer);
			TeachingAgreement_Checkbox.add(section);
		}
		else if(section.contains("Sit to stand lift")) {
			clickElement(TeachingAgreementPT.chk_Sit_to_stand_lift);
			TeachingAgreement_Checkbox.add(section);
		}
		else if(section.contains("Chair to chair")) {
			clickElement(TeachingAgreementPT.chk_Chair_to_chair);
			TeachingAgreement_Checkbox.add(section);
		}
		else if(section.contains("Toilet seat transfer")) {
			clickElement(TeachingAgreementPT.chk_Toilet_seat_transfer);
			TeachingAgreement_Checkbox.add(section);
		}
		else if(section.contains("Bath tub transfer")) {
			clickElement(TeachingAgreementPT.chk_Bath_tub_transfer);
			TeachingAgreement_Checkbox.add(section);
		}
		else if(section.contains("Lift handout provided")) {
			clickElement(TeachingAgreementPT.chk_Lift_handout_provided);
			TeachingAgreement_Checkbox.add(section);
		}
		else if(section.contains("Exercise sheets provided")) {
			clickElement(TeachingAgreementPT.chk_Exercise_sheets_provided);
			TeachingAgreement_Checkbox.add(section);
		}
		else if(section.contains("Client/SDM Consent Obtained")) {
			clickElement(TeachingAgreementPT.Consent_Obtained);
			TeachingAgreement_Checkbox.add(section);
		}
		else if(section.contains("Client")) {
			clickElement(TeachingAgreementPT.chk_Client);
			TeachingAgreement_Checkbox.add(section);
		}
		else if(section.contains("With Use of Interpreter")) {
			clickElement(TeachingAgreementPT.chk_With_Use_of_Interpreter);
			TeachingAgreement_Checkbox.add(section);
		}
		else if(section.contains("Verbally")) {
			clickElement(TeachingAgreementPT.chk_Verbally);
			TeachingAgreement_Checkbox.add(section);
		}
		
		else if(section.contains("Learner Acknowledgement of Education")) {
			clickElement(TeachingAgreementPT.LearnerAcknowledgementofEducation);
			TeachingAgreement_Checkbox.add(section);
		}
		else if(section.contains("Education Completed by Service Provider")) {
			clickElement(TeachingAgreementPT.EducationCompletedbyServiceProvider);
			TeachingAgreement_Checkbox.add(section);
		}
	}

}
