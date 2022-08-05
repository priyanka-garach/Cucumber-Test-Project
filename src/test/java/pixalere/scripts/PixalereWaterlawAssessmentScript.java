package pixalere.scripts;

import java.util.ArrayList;
import java.util.List;

import pixalere.pageObjectUtils.LocatorUtils.CustomizedLocators;
import pixalere.pageObjectUtils.LocatorUtils.WaterlowLocators;
import pixalere.pageObjectUtils.PixalereCommonUtils;

public class PixalereWaterlawAssessmentScript extends PixalereCommonUtils {
	public static List<String> Tissue_Malnutrition_Checkbox = new ArrayList<>();
	public static List<String> Neurological_Deficit_Checkbox1 = new ArrayList<>();
	public static List<String> Surgery_Trauma_Checkbox1 = new ArrayList<>();
	public static List<String> WaterAssessment_Checkbox = new ArrayList<>();
	
	
	public void selectRadioOptionFromSection_Incontinence(String section) {
		clickElement(CustomizedLocators.getRadioOptionByIncontinence(section));
	}
	public void selectRadioOptionFromSection_Skin_Type_Visual_Risk_Area(String section) {
		clickElement(CustomizedLocators.getRadioOptionBySkin_Type_Visual_Risk_Area(section));
	}
	public void selectRadioOptionFromSection_Mobility(String section) {
		clickElement(CustomizedLocators.getRadioOptionByMobility(section));
	}
	public void selectRadioOptionFromSection_Nutrition_Element(String section) {
		clickElement(CustomizedLocators.getRadioOptionByNutrition_Element(section));
	}
	public void selectSpecialRisksTissueMalnutritionCheckbox(String section) {
		if (section.contains("0 : Terminal Cahexia")) {
			clickElementWithJQuery(WaterlowLocators.chk_Terminal_Cahexia);
			Tissue_Malnutrition_Checkbox.add(section);
		}
		else if (section.contains("8 : Multiple organ failure/terminal cachexia")) {
			clickElementWithJQuery(WaterlowLocators.chk_Multiple_organ_failure);
			Tissue_Malnutrition_Checkbox.add(section);
		}
		else if (section.contains("5 : Single organ failure e.g. cardiac, renal, respiratory")) {
			clickElementWithJQuery(WaterlowLocators.chk_Single_organ_failure);
			Tissue_Malnutrition_Checkbox.add(section);
		}
		else if (section.contains("5 : Peripheral vascular disease")) {
			clickElementWithJQuery(WaterlowLocators.chk_Peripheral_vascular_disease);
			Tissue_Malnutrition_Checkbox.add(section);
		}
		else if (section.contains("2 : Anaemia = Hb < 8")) {
			clickElementWithJQuery(WaterlowLocators.chk_Anaemia);
			Tissue_Malnutrition_Checkbox.add(section);
		}
		else if (section.contains("1 : Smoking")) {
			clickElementWithJQuery(WaterlowLocators.chk_Smoking);
			Tissue_Malnutrition_Checkbox.add(section);
		}
	}
	public void selectSpecialRisksNeurologicalDeficitCheckbox(String section) {
		if (section.contains("0 : Not Applicable")) {
			clickElementWithJQuery(WaterlowLocators.chk_Not_Applicable_Neurological);
			WaterAssessment_Checkbox.add(section);
		}
		else if (section.contains("1 : Diabetes")) {
			clickElementWithJQuery(WaterlowLocators.chk_Diabetes);
			WaterAssessment_Checkbox.add(section);
		}
		else if (section.contains("1 : MS")) {
			clickElementWithJQuery(WaterlowLocators.chk_MS);
			Neurological_Deficit_Checkbox1.add(section);
		}
		else if (section.contains("1 : CVA")) {
			clickElementWithJQuery(WaterlowLocators.chk_CVA);
			Neurological_Deficit_Checkbox1.add(section);
		}
		else if (section.contains("1 : Motor")) {
			clickElementWithJQuery(WaterlowLocators.chk_Motor);
			Neurological_Deficit_Checkbox1.add(section);
		}
		else if (section.contains("1 : Sensory")) {
			clickElementWithJQuery(WaterlowLocators.chk_Sensory);
			Neurological_Deficit_Checkbox1.add(section);
		}
		else if (section.contains("1 : Paraplegia")) {
			clickElementWithJQuery(WaterlowLocators.chk_Paraplegia);
			Neurological_Deficit_Checkbox1.add(section);
		}
	}
		public void selectSpecialRisksSurgeryTraumaCheckbox(String section) {
			if (section.contains("0 : Not Applicable")) {
				clickElementWithJQuery(WaterlowLocators.chk_Not_Applicable_Surgery);
				Surgery_Trauma_Checkbox1.add(section);
			}
			else if (section.contains("8 : On table > 6 hours")) {
				clickElementWithJQuery(WaterlowLocators.chk_On_table_6_hours);
				Surgery_Trauma_Checkbox1.add(section);
			}
			else if (section.contains("5 : Orthopaedic/ below waist/spinal (up to 48 hours post op)")) {
				clickElementWithJQuery(WaterlowLocators.chk_Orthopaedic);
				Surgery_Trauma_Checkbox1.add(section);
			}
			else if (section.contains("5 : On table > 2 hours (up to 48 hours post op)")) {
				clickElementWithJQuery(WaterlowLocators.chk_On_table_2_hours);
				Surgery_Trauma_Checkbox1.add(section);
			}
	}
		public void selectMedicationCheckbox(String section) {
			if (section.contains("0 : High Dose Steroid Use")) {
				clickElementWithJQuery(WaterlowLocators.chk_High_Dose_Steroid_Use);
				WaterAssessment_Checkbox.add(section);
			}
			else if (section.contains("1 : Cytotoxic")) {
				clickElementWithJQuery(WaterlowLocators.chk_Cytotoxic);
				WaterAssessment_Checkbox.add(section);
			}
			else if (section.contains("1 : Anti-inflammatory")) {
				clickElementWithJQuery(WaterlowLocators.chk_Anti_inflammatory);
				WaterAssessment_Checkbox.add(section);
			}
			else if (section.contains("1 : Long term/high dose steroid")) {
				clickElementWithJQuery(WaterlowLocators.chk_Long_term_Steroid_Use);
				WaterAssessment_Checkbox.add(section);
			}
		}
}
