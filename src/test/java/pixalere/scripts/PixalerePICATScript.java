package pixalere.scripts;

import java.util.ArrayList;
import java.util.List;

import pixalere.pageObjectUtils.LocatorUtils.CustomizedLocators;
import pixalere.pageObjectUtils.LocatorUtils.PICATLocators;
import pixalere.pageObjectUtils.PixalereCommonUtils;

public class PixalerePICATScript extends PixalereCommonUtils {

	public static List<String> PICAT_checkbox = new ArrayList<>();

	public void selectRadioOptionFromSection_Immunization_up_to_date(String section) {
		clickElement(CustomizedLocators.getRadioOptionByImmunization_up_to_date(section));
	}

	public void selectRadioOptionFromSection_Admission_goals_discharge_planning_discussed(String section) {
		clickElement(CustomizedLocators.getRadioOptionByAdmission_goals_discharge_planning(section));
	}
	public void selectRadioOptionFromSection_Pacemaker_Present(String section) {
		clickElement(CustomizedLocators.getRadioOptionByPacemaker_Present(section));
	}
	public void selectRadioOptionFromSection_Pacemaker_Present_Type(String section) {
		clickElement(CustomizedLocators.getRadioOptionByPacemaker_Present_Type(section));
	}
	public void selectRadioOptionFromSection_Extremities_warm(String section) {
		clickElement(CustomizedLocators.getRadioOptionByExtremities_warm(section));
	}
	public void selectRadioOptionFromSection_Cap_refill(String section) {
		clickElement(CustomizedLocators.getRadioOptionByCap_refill(section));
	}
	public void selectRadioOptionFromSection_Cyanosis_Present(String section) {
		clickElement(CustomizedLocators.getRadioOptionByCyanosis_Present(section));
	}
	public void selectRadioOptionFromSection_Edema_noted(String section) {
		clickElement(CustomizedLocators.getRadioOptionByEdema_noted(section));
	}
	public void selectRadioOptionFromSection_Presence_of_Central(String section) {
		clickElement(CustomizedLocators.getRadioOptionByPresence_of_Central(section));
	}
	public void selectRadioOptionFromSection_Murmurs(String section) {
		clickElement(CustomizedLocators.getRadioOptionByMurmurs(section));
	}

	public void selectRespiratoryCheckobx(String section) {
					
		if (section.contains("Cough")) {
			clickElementWithJQuery(PICATLocators.chk_Cough);
			PICAT_checkbox.add(section);
		} 
		else if (section.contains("Signs of respiratory distress")) {
			clickElementWithJQuery(PICATLocators.chk_respiratory_distress);
			PICAT_checkbox.add(section);
		}

		else if (section.contains("Snoring")) {
			clickElementWithJQuery(PICATLocators.chk_snoring);
			PICAT_checkbox.add(section);
		}

		else if (section.contains("Smoking")) {
			clickElementWithJQuery(PICATLocators.chk_smoking);
			PICAT_checkbox.add(section);
		}
		else if (section.contains("O2 Therapy")) {
			clickElementWithJQuery(PICATLocators.chk_O2Therapy);
			PICAT_checkbox.add(section);
		}
		else if (section.contains("Ventillation")) {
			clickElementWithJQuery(PICATLocators.chk_Ventillation);
			PICAT_checkbox.add(section);
		}
		else if (section.contains("Tracheostomy")) {
			clickElementWithJQuery(PICATLocators.chk_Tracheostomy);
			PICAT_checkbox.add(section);
		}
		else if (section.contains("Suctioning")) {
			clickElementWithJQuery(PICATLocators.chk_Suctioning);
			PICAT_checkbox.add(section);
		}
		else if (section.contains("Chest Physiotherapy")) {
			clickElementWithJQuery(PICATLocators.chk_chest_physiotherapy);
			PICAT_checkbox.add(section);
		} 
		else if (section.contains("Amount(L/min)")) {
			clickElementWithJQuery(PICATLocators.chk_Amount);
			PICAT_checkbox.add(section);
		}
		else if (section.contains("Delivery")) {
			clickElementWithJQuery(PICATLocators.chk_Delivery);
			PICAT_checkbox.add(section);
		}
		else if (section.contains("BIPAP (BI-Level Positive Airway Pressure)")) {
			clickElementWithJQuery(PICATLocators.chk_BIPAP);
			PICAT_checkbox.add(section);
		}
		else if (section.contains("CPAP (Continuous Positive Airway Pressure)")) {
			clickElementWithJQuery(PICATLocators.chk_CPAP);
			PICAT_checkbox.add(section);
		}
		else if (section.contains("Ventilator")) {
			clickElementWithJQuery(PICATLocators.chk_vantilator);
			PICAT_checkbox.add(section);
		}
		else if (section.contains("Size")) {
			clickElementWithJQuery(PICATLocators.chk_size);
			PICAT_checkbox.add(section);
		}
		else if (section.contains("Type")) {
			clickElementWithJQuery(PICATLocators.chk_type);
			PICAT_checkbox.add(section);
		}
		else if (section.contains("Oral Frequency & other details")) {
			clickElementWithJQuery(PICATLocators.chk_oralfrequency);
			PICAT_checkbox.add(section);
		}
		else if (section.contains("Oropharyngeal Frequency & other details")) {
			clickElementWithJQuery(PICATLocators.chk_Oralpharyngeal);
			PICAT_checkbox.add(section);
		}
		else if (section.contains("Nasopharyngeal Frequency & other details")) {
			clickElementWithJQuery(PICATLocators.chk_nasopharyngeal);
			PICAT_checkbox.add(section);
		}
		else if (section.contains("Tracheal Frequency & other details")) {
			clickElementWithJQuery(PICATLocators.chk_Tracheal);
			PICAT_checkbox.add(section);
		}
		else if (section.contains("Percussion / Postural drainage")) {
			clickElementWithJQuery(PICATLocators.chk_Percussion);
			PICAT_checkbox.add(section);
		}
		else if (section.contains("Cough assist")) {
			clickElementWithJQuery(PICATLocators.chk_Cough_assist);
			PICAT_checkbox.add(section);
		}
		else if (section.contains("PEP (Position Expiry Pressure)")) {
			clickElementWithJQuery(PICATLocators.chk_PEP);
			PICAT_checkbox.add(section);
		}
		else if (section.contains("Other")) {
			clickElementWithJQuery(PICATLocators.chk_OTHER);
			PICAT_checkbox.add(section);
		}
		else if (section.contains("Nasal Cannula")) {
			clickElementWithJQuery(PICATLocators.chk_Nasal_Cannula);
			PICAT_checkbox.add(section);
		}
		else if (section.contains("Nasal Prongs (L/Min)")) {
			clickElementWithJQuery(PICATLocators.chk_Nasal_Prongs);
			PICAT_checkbox.add(section);
		}
		else if (section.contains("Mask")) {
			clickElementWithJQuery(PICATLocators.chk_mask);
			PICAT_checkbox.add(section);
		}
		else if (section.contains("Continuuous")) {
			clickElementWithJQuery(PICATLocators.chk_Continuuous);
			PICAT_checkbox.add(section);
		}
		else if (section.contains("Intermittent")) {
			clickElementWithJQuery(PICATLocators.chk_Intermittent);
			PICAT_checkbox.add(section);
		}
		else if (section.contains("Low Flow")) {
			clickElementWithJQuery(PICATLocators.chk_Low_Flow);
			PICAT_checkbox.add(section);
		}
		else if (section.contains("Blow By")) {
			clickElementWithJQuery(PICATLocators.chk_Blow_By);
			PICAT_checkbox.add(section);
		}
		else if (section.contains("Not Assessed")) {
			clickElementWithJQuery(PICATLocators.chk_Not_Assessed);
			PICAT_checkbox.add(section);
		}
		else if (section.contains("Inspection")) {
			clickElementWithJQuery(PICATLocators.chk_Inspection);
			PICAT_checkbox.add(section);
		}
		else if (section.contains("No symptons of respiratory stress")) {
			clickElementWithJQuery(PICATLocators.chk_respiratory_stress);
			PICAT_checkbox.add(section);
		}
		else if (section.contains("Nasal Flaring")) {
			clickElementWithJQuery(PICATLocators.chk_Nasal_Flaring);
			PICAT_checkbox.add(section);
		}
		else if (section.contains("Grunting")) {
			clickElementWithJQuery(PICATLocators.chk_grunting);
			PICAT_checkbox.add(section);
		}
		else if (section.contains("Cyanosis")) {
			clickElementWithJQuery(PICATLocators.chk_cyanosis);
			PICAT_checkbox.add(section);
		}
		else if (section.contains("Clubbing")) {
			clickElementWithJQuery(PICATLocators.chk_Clubbing);
			PICAT_checkbox.add(section);
		}
		else if (section.contains("Strider")) {
			clickElementWithJQuery(PICATLocators.chk_Strider);
			PICAT_checkbox.add(section);
		}
		else if (section.contains("Retractions")) {
			clickElementWithJQuery(PICATLocators.chk_Retractions);
			PICAT_checkbox.add(section);
		}
		else if (section.contains("Suprasternal")) {
			clickElementWithJQuery(PICATLocators.chk_Suprasternal);
			PICAT_checkbox.add(section);
		}
		else if (section.contains("Substernal")) {
			clickElementWithJQuery(PICATLocators.chk_Substernal);
			PICAT_checkbox.add(section);
		}
		else if (section.contains("Intercostal")) {
			clickElementWithJQuery(PICATLocators.chk_Intercostal);
			PICAT_checkbox.add(section);
		}
		else if (section.contains("Auscultation")) {
			clickElementWithJQuery(PICATLocators.chk_Auscultation);
			PICAT_checkbox.add(section);
		}
		else if (section.contains("Air entry")) {
			clickElementWithJQuery(PICATLocators.chk_Air_entry);
			PICAT_checkbox.add(section);
		}
		else if (section.contains("Satisfactory")) {
			clickElementWithJQuery(PICATLocators.chk_Satisfactory);
			PICAT_checkbox.add(section);
		}
		else if (section.contains("Reduced")) {
			clickElementWithJQuery(PICATLocators.chk_Reduced);
			PICAT_checkbox.add(section);
		}
		else if (section.contains("Breath Sounds")) {
			clickElementWithJQuery(PICATLocators.chk_Breath_Sounds);
			PICAT_checkbox.add(section);
		}
		else if (section.contains("Clear")) {
			clickElementWithJQuery(PICATLocators.chk_Clear);
			PICAT_checkbox.add(section);
		}
		else if (section.contains("Adventitious")) {
			clickElementWithJQuery(PICATLocators.chk_Adventitious);
			PICAT_checkbox.add(section);
		}
		else if (section.contains("Crackles: Fines")) {
			clickElementWithJQuery(PICATLocators.chk_Crackle_fine);
			PICAT_checkbox.add(section);
		}
		else if (section.contains("Crackles: Coarse")) {
			clickElementWithJQuery(PICATLocators.chk_Crackle_course);
			PICAT_checkbox.add(section);
		}
		else if (section.contains("Wheezes high pitched")) {
			clickElementWithJQuery(PICATLocators.chk_high_pitched);
			PICAT_checkbox.add(section);
		}
		else if (section.contains("Wheezes low pitched")) {
			clickElementWithJQuery(PICATLocators.chk_low_pitched);
			PICAT_checkbox.add(section);
		}
		else if (section.contains("Transmitted upper airways sounds")) {
			clickElementWithJQuery(PICATLocators.chk_airways_sounds);
			PICAT_checkbox.add(section);
		}
		else {
			clickElementWithJQuery(PICATLocators.chk_noreportedconcern_Respiratory);
			PICAT_checkbox.add(section);
		}

	}
	public void selectCardiovascularCheckobx(String section) {
		if (section.contains("Fatigue")) {
			clickElementWithJQuery(PICATLocators.chk_Fatigue);
			PICAT_checkbox.add(section);
		} 
		else if (section.contains("Murmurs")) {
			clickElementWithJQuery(PICATLocators.chk_Murmurs);
			PICAT_checkbox.add(section);
		}
		else if (section.contains("Arrhythmias")) {
			clickElementWithJQuery(PICATLocators.chk_Arrhythmias);
			PICAT_checkbox.add(section);
		}
		else if (section.contains("Cardiac Surgery")) {
			clickElementWithJQuery(PICATLocators.chk_Cardiac_Surgery);
			PICAT_checkbox.add(section);
		}
		else if (section.contains("Thrombus")) {
			clickElementWithJQuery(PICATLocators.chk_Thrombus);
			PICAT_checkbox.add(section);
		}
		else if (section.contains("Stroke")) {
			clickElementWithJQuery(PICATLocators.chk_Stroke);
			PICAT_checkbox.add(section);
		}
		else {
			clickElementWithJQuery(PICATLocators.chk_No_Reported_Concerns_Cardiovascular);
			PICAT_checkbox.add(section);
		}
	}
	public void selectGastrointestinalCheckobx(String section) {
		if (section.contains("Fatigue")) {
			clickElementWithJQuery(PICATLocators.chk_Fatigue);
			PICAT_checkbox.add(section);
		} 
		else if (section.contains("Murmurs")) {
			clickElementWithJQuery(PICATLocators.chk_Murmurs);
			PICAT_checkbox.add(section);
		}
		else if (section.contains("Murmurs")) {
			clickElementWithJQuery(PICATLocators.chk_Murmurs);
			PICAT_checkbox.add(section);
		}
		else if (section.contains("Murmurs")) {
			clickElementWithJQuery(PICATLocators.chk_Murmurs);
			PICAT_checkbox.add(section);
		}
		else if (section.contains("Murmurs")) {
			clickElementWithJQuery(PICATLocators.chk_Murmurs);
			PICAT_checkbox.add(section);
		}
		else if (section.contains("Murmurs")) {
			clickElementWithJQuery(PICATLocators.chk_Murmurs);
			PICAT_checkbox.add(section);
		}
		else if (section.contains("Murmurs")) {
			clickElementWithJQuery(PICATLocators.chk_Murmurs);
			PICAT_checkbox.add(section);
		}
		else if (section.contains("Murmurs")) {
			clickElementWithJQuery(PICATLocators.chk_Murmurs);
			PICAT_checkbox.add(section);
		}
		else if (section.contains("Murmurs")) {
			clickElementWithJQuery(PICATLocators.chk_Murmurs);
			PICAT_checkbox.add(section);
		}
		else if (section.contains("Murmurs")) {
			clickElementWithJQuery(PICATLocators.chk_Murmurs);
			PICAT_checkbox.add(section);
		}
		else if (section.contains("Murmurs")) {
			clickElementWithJQuery(PICATLocators.chk_Murmurs);
			PICAT_checkbox.add(section);
		}
		else if (section.contains("Murmurs")) {
			clickElementWithJQuery(PICATLocators.chk_Murmurs);
			PICAT_checkbox.add(section);
		}
		else if (section.contains("Murmurs")) {
			clickElementWithJQuery(PICATLocators.chk_Murmurs);
			PICAT_checkbox.add(section);
		}
		else if (section.contains("Murmurs")) {
			clickElementWithJQuery(PICATLocators.chk_Murmurs);
			PICAT_checkbox.add(section);
		}
	}
}

