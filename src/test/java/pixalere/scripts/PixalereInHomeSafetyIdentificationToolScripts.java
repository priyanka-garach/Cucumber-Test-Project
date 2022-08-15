package pixalere.scripts;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;

import pixalere.pageObjectUtils.LocatorUtils.InHomeSafetyIdentificationTool;
import pixalere.pageObjectUtils.PixalereCommonUtils;

public class PixalereInHomeSafetyIdentificationToolScripts extends PixalereCommonUtils{
	public static List<String> HomeSafetyAssessment_Checkbox = new ArrayList<>();
	public static List<String> TrippingFallingfieldHSI_Checkbox = new ArrayList<>();
	public static List<String> Medication_Checkbox = new ArrayList<>();
	public static List<String> Other_Checkbox = new ArrayList<>();
	public static List<String> Fire_Checkbox = new ArrayList<>();
	public static List<String> FollowupPlan_Checkbox = new ArrayList<>();
	public static List<String> SafeSleep_Checkbox = new ArrayList<>();
	public static List<String> FallsPrevention_Checkbox = new ArrayList<>();
	public static List<String> PoisonChoking_Checkbox = new ArrayList<>();
	public static List<String> hazard_Checkbox = new ArrayList<>();
	
	public void selectCheckboxForHomeSafetyAssessment(String section) {
		if (section.contains("Client did not consent to home safety assessment")) {
			clickElementWithJQuery(InHomeSafetyIdentificationTool.chk_Client_safety_assessment);
			HomeSafetyAssessment_Checkbox.add(section);
		}
		else if(section.contains("School Client")) {
			clickElementWithJQuery(InHomeSafetyIdentificationTool.chk_School_Client);
			HomeSafetyAssessment_Checkbox.add(section);
		}
	}
	public void selectCheckboxForTrippingFallingfieldHSI(String section) {
		if (section.contains("Clutter")) {
			clickElementWithJQuery(InHomeSafetyIdentificationTool.chk_Clutter);
			TrippingFallingfieldHSI_Checkbox.add(section);
		}
		else if(section.contains("Cords")) {
			try {
			clickElementWithJQuery(InHomeSafetyIdentificationTool.chk_Cords);
			TrippingFallingfieldHSI_Checkbox.add(section);
			}catch(Exception e) {
				clickElementWithJQuery(InHomeSafetyIdentificationTool.chk_Cords);
				TrippingFallingfieldHSI_Checkbox.add(section);
			}
		}
	}
	public void selectCheckboxForMedication(String section) {
		if (section.contains("Unsafe disposal of sharps")) {
			clickElementWithJQuery(InHomeSafetyIdentificationTool.chk_Unsafe_disposal_of_sharps);
			Medication_Checkbox.add(section);
		}
		else if(section.contains("Improper storage of meds")) {
			clickElementWithJQuery(InHomeSafetyIdentificationTool.chk_Improper_storage_of_meds);
			Medication_Checkbox.add(section);
		}
	}
	public void selectCheckboxForOther(String section) {
		if (section.contains("Absence of food in home")) {
			clickElementWithJQuery(InHomeSafetyIdentificationTool.chk_Absence_of_food_in_home);
			Other_Checkbox.add(section);
		}
		else if(section.contains("Issue with medical equipment")) {
			clickElementWithJQuery(InHomeSafetyIdentificationTool.chk_Issue_with_medical_equipment);
			Other_Checkbox.add(section);
		}
		else if(section.contains("No phone")) {
			clickElementWithJQuery(InHomeSafetyIdentificationTool.chk_No_phone);
			Other_Checkbox.add(section);
		}
	}
	public void selectCheckboxForFire(String section) {
		if (section.contains("Frayed cords")) {
			clickElementWithJQuery(InHomeSafetyIdentificationTool.chk_Frayed_cords);
			Fire_Checkbox.add(section);
		}
		else if(section.contains("Oxygen present")) {
			clickElementWithJQuery(InHomeSafetyIdentificationTool.chk_Oxygen_present);
			Fire_Checkbox.add(section);
		}
		else if(section.contains("Lack of smoke detector")) {
			clickElementWithJQuery(InHomeSafetyIdentificationTool.chk_Lack_of_smoke_detector);
			Fire_Checkbox.add(section);
		}
	}
	public void selectCheckboxForFollowupPlan(String section) {
		if (section.contains("No safety issues identified - no action required")) {
			clickElementWithJQuery(InHomeSafetyIdentificationTool.chk_No_safety_issues_identified);
			FollowupPlan_Checkbox.add(section);
		}
		else if(section.contains("Client chooses to live at risk")) {
			clickElementWithJQuery(InHomeSafetyIdentificationTool.chk_Client_chooses_to_live_at_risk);
			FollowupPlan_Checkbox.add(section);
		}
		else if(section.contains("Safety issues addressed - no further action required")) {
			clickElementWithJQuery(InHomeSafetyIdentificationTool.chk_Safety_issues_addressed);
			FollowupPlan_Checkbox.add(section);
		}		
	}
	public void selectCheckboxForSafeSleep(String section) {
		if (section.contains("Non-adherence to RNAO Safe Sleep BPG")) {
			clickElementWithJQuery(InHomeSafetyIdentificationTool.chk_Non_adherence);
			SafeSleep_Checkbox.add(section);
		}
		else if(section.contains("Bunk beds in children < 5 years")) {
			clickElementWithJQuery(InHomeSafetyIdentificationTool.chk_Bunk_beds_in_children);
			SafeSleep_Checkbox.add(section);
		}
	}
	public void selectCheckboxForFallsPrevention(String section) {
		if (section.contains("Lack of safety belts on equipment")) {
			clickElementWithJQuery(InHomeSafetyIdentificationTool.chk_Lack_of_safety_belts_on_equipment);
			FallsPrevention_Checkbox.add(section);
		}
		else if(section.contains("Risk for falls from windows")) {
			clickElementWithJQuery(InHomeSafetyIdentificationTool.chk_Risk_for_falls_from_windows);
			FallsPrevention_Checkbox.add(section);
		}
		else if(section.contains("Lack of mechanical aids if weight > 35lb")) {
			clickElementWithJQuery(InHomeSafetyIdentificationTool.chk_Lack_of_mechanical_aids);
			FallsPrevention_Checkbox.add(section);
		}
	}
	public void selectCheckboxForPoisonChoking(String section) {
		if (section.contains("Developmentally unsafe food")) {
			clickElementWithJQuery(InHomeSafetyIdentificationTool.chk_Developmentally_unsafe_food);
			PoisonChoking_Checkbox.add(section);
		}
		else if(section.contains("Unsafe storage of hazardous material")) {
			clickElementWithJQuery(InHomeSafetyIdentificationTool.chk_Unsafe_storage_of_hazardous_material);
			PoisonChoking_Checkbox.add(section);
		}
	}
	public void selectCheckboxForhazard(String section) {
		if (section.contains("Kitchen")) {
			clickElementWithJQuery(InHomeSafetyIdentificationTool.chk_Kichen);
			hazard_Checkbox.add(section);
		}
		else if(section.contains("Living/family room")) {
			clickElementWithJQuery(InHomeSafetyIdentificationTool.chk_family_room);
			hazard_Checkbox.add(section);
		}
		else if(section.contains("Bathroom")) {
			clickElementWithJQuery(InHomeSafetyIdentificationTool.chk_Bathroom);
			hazard_Checkbox.add(section);
		}
		else if(section.contains("Bedroom(s)")) {
			clickElementWithJQuery(InHomeSafetyIdentificationTool.chk_Bedroom);
			hazard_Checkbox.add(section);
		}
		else if(section.contains("Hallway")) {
			clickElementWithJQuery(InHomeSafetyIdentificationTool.chk_Hallway);
			hazard_Checkbox.add(section);
		}
		else if(section.contains("Stairs")) {
			clickElementWithJQuery(InHomeSafetyIdentificationTool.chk_Stairs);
			hazard_Checkbox.add(section);
		}
		else if(section.contains("Outdoors")) {
			clickElementWithJQuery(InHomeSafetyIdentificationTool.chk_Outdoors);
			hazard_Checkbox.add(section);
		}
		else if(section.contains("Other")) {
			clickElementWithJQuery(InHomeSafetyIdentificationTool.chk_Other);
			hazard_Checkbox.add(section);
		}
		
	}
	public void clickOnSave() {
		clickElement(By.xpath("//div[@class='ui-dialog-buttonset']//button[contains(text(),'Save')]"));
	}
}
