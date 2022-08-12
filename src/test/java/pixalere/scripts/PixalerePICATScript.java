package pixalere.scripts;

import java.util.ArrayList;
import java.util.List;

import pixalere.pageObjectUtils.LocatorUtils.CustomizedLocators;
import pixalere.pageObjectUtils.LocatorUtils.PICATLocators;
import pixalere.pageObjectUtils.PixalereCommonUtils;

public class PixalerePICATScript extends PixalereCommonUtils {

	public static List<String> Respiratory_Checkobx = new ArrayList<>();
	public static List<String> Cardiovascular_Checkobx = new ArrayList<>();
	public static List<String> Gastrointestinal_Checkobx = new ArrayList<>();
	public static List<String> Skin_Checkobx = new ArrayList<>();
	public static List<String> GenitoUrinarySexualDevelopment_Checkobx = new ArrayList<>();
	public static List<String> Neurological_Checkobx = new ArrayList<>();
	public static List<String> Neuromuscular_Checkbox = new ArrayList<>();
	public static List<String> Face_Checkbox = new ArrayList<>();
	public static List<String> Nutrition_Checkbox = new ArrayList<>();
	
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
	public void selectRadioOptionFromWeight_Changes(String section) {
		clickElement(CustomizedLocators.getRadioOptionByWeight_Changes(section));
	}
	public void selectRadioOptionFromInspection(String section) {
		clickElement(CustomizedLocators.getRadioOptionByInspection(section));
	}
	public void selectRadioOptionFromPalpation(String section) {
		clickElement(CustomizedLocators.getRadioOptionByPalpation(section));
	}
	public void selectRadioOptionFromAuscultation(String section) {
		clickElement(CustomizedLocators.getRadioOptionByAuscultation(section));
	}
	public void selectRadioOptionFromEnteralTubes(String section) {
		clickElement(CustomizedLocators.getRadioOptionByEnteralTubes(section));
	}
	public void selectRadioOptionFromStoma(String section) {
		clickElement(CustomizedLocators.getRadioOptionByStoma(section));
	}
	public void selectRadioOptionFromSkincolor(String section) {
		clickElement(CustomizedLocators.getRadioOptionBySkincolor(section));
	}
	public void selectRadioOptionFromSkintemperature(String section) {
		clickElement(CustomizedLocators.getRadioOptionBySkintemperature(section));
	}
	public void selectRadioOptionFromSkinmoisture(String section) {
		clickElement(CustomizedLocators.getRadioOptionBySkinmoisture(section));
	}
	public void selectRadioOptionFromSkinturgor(String section) {
		clickElement(CustomizedLocators.getRadioOptionBySkinturgor(section));
	}
	public void selectRadioOptionFromDiaperdermatitis(String section) {
		clickElement(CustomizedLocators.getRadioOptionByDiaperdermatitis(section));
	}
	public void selectRadioOptionFromErythema(String section) {
		clickElement(CustomizedLocators.getRadioOptionByErythema(section));
	}
	public void selectRadioOptionFromLesions(String section) {
		clickElement(CustomizedLocators.getRadioOptionByLesions(section));
	}
	public void selectRadioOptionFromBruises(String section) {
		clickElement(CustomizedLocators.getRadioOptionByBruises(section));
	}
	public void selectRadioOptionFromLacerations(String section) {
		clickElement(CustomizedLocators.getRadioOptionByLacerations(section));
	}
	public void selectRadioOptionFromPetechiae(String section) {
		clickElement(CustomizedLocators.getRadioOptionByPetechiae(section));
	}
	public void selectRadioOptionFromScars(String section) {
		clickElement(CustomizedLocators.getRadioOptionByScars(section));
	}
	public void selectRadioOptionFromBurns(String section) {
		clickElement(CustomizedLocators.getRadioOptionByBurns(section));
	}
	public void selectRadioOptionFromPressureinjuries(String section) {
		clickElement(CustomizedLocators.getRadioOptionByPressureinjuries(section));
	}
	public void selectRadioOptionFromVoidingwithoutdifficulty(String section) {
		clickElement(CustomizedLocators.getRadioOptionByVoidingwithoutdifficulty(section));
	}
	public void selectRadioOptionFromGenitalurinarymalformations(String section) {
		clickElement(CustomizedLocators.getRadioOptionByGenitalurinarymalformations(section));
	}
	public void selectRadioOptionFromNeurogenicBladder(String section) {
		clickElement(CustomizedLocators.getRadioOptionByNeurogenicBladder(section));
	}
	public void selectRadioOptionFromStomapresent(String section) {
		clickElement(CustomizedLocators.getRadioOptionByStomapresent(section));
	}
	public void selectRadioOptionFromCatherizationrequired(String section) {
		clickElement(CustomizedLocators.getRadioOptionByCatherizationrequired(section));
	}
	public void selectRadioOptionFromDischargepresent(String section) {
		clickElement(CustomizedLocators.getRadioOptionByDischargepresent(section));
	}
	public void selectRadioOptionFromFoulodor(String section) {
		clickElement(CustomizedLocators.getRadioOptionByFoulodor(section));
	}
	public void selectRadioOptionFromSkinintegrity(String section) {
		clickElement(CustomizedLocators.getRadioOptionBySkinintegrity(section));
	}
	public void selectRadioOptionFromSexualDevelopment(String section) {
		clickElement(CustomizedLocators.getRadioOptionBySexualDevelopment(section));
	}
	public void selectRadioOptionFromSeizures(String section) {
		clickElement(CustomizedLocators.getRadioOptionBySeizures(section));
	}
	public void selectRadioOptionFromPupilsEqualRoundReactive(String section) {
		clickElement(CustomizedLocators.getRadioOptionByPupilsEqualRoundReactive(section));
	}
	public void selectRadioOptionFromGait(String section) {
		clickElement(CustomizedLocators.getRadioOptionByGait(section));
	}
	public void selectRadioOptionFromOriented(String section) {
		clickElement(CustomizedLocators.getRadioOptionByOriented(section));
	}
	public void selectRadioOptionFromPainfulstimuli(String section) {
		clickElement(CustomizedLocators.getRadioOptionByPainfulstimuli(section));
	}
	public void selectRadioOptionFromCooperativefriendly(String section) {
		clickElement(CustomizedLocators.getRadioOptionByCooperativefriendly(section));
	}
	public void selectRadioOptionFromCrying(String section) {
		clickElement(CustomizedLocators.getRadioOptionByCrying(section));
	}
	public void selectRadioOptionFromMuscletone(String section) {
		clickElement(CustomizedLocators.getRadioOptionByMuscletone(section));
	}
	public void selectRadioOptionFromMusclestrength(String section) {
		clickElement(CustomizedLocators.getRadioOptionByMusclestrength(section));
	}
	public void selectRadioOptionFromCranial_facial_malformations(String section) {
		clickElement(CustomizedLocators.getRadioOptionByCranial_facial_malformations(section));
	}
	public void selectRadioOptionFromFontanellePalpable(String section) {
		clickElement(CustomizedLocators.getRadioOptionByFontanellePalpable(section));
	}
	public void selectRadioOptionFromIndicate(String section) {
		clickElement(CustomizedLocators.getRadioOptionByIndicate(section));
	}
	public void selectRadioOptionFromLumpsswelling(String section) {
		clickElement(CustomizedLocators.getRadioOptionByLumpsswelling(section));
	}
	public void selectRadioOptionFromAgitatedandoraggressive(String section) {
		clickElement(CustomizedLocators.getRadioOptionByAgitatedandoraggressive(section));
	}
	public void selectRadioOptionFromChildwander(String section) {
		clickElement(CustomizedLocators.getRadioOptionByChildwander(section));
	}
	public void selectRadioOptionFromRestraints(String section) {
		clickElement(CustomizedLocators.getRadioOptionByRestraints(section));
	}
	public void selectRadioOptionFromClientpain(String section) {
		clickElement(CustomizedLocators.getRadioOptionByClientpain(section));
	}
	public void selectRadioOptionFromOral_intake(String section) {
		clickElement(CustomizedLocators.getRadioOptionByOral_intake(section));
	}
	public void selectRadioOptionFromClienttakenaps(String section) {
		clickElement(CustomizedLocators.getRadioOptionByClienttakenaps(section));
	}
	public void selectRadioOptionFromSleepalone(String section) {
		clickElement(CustomizedLocators.getRadioOptionBySleepalone(section));
	}
	

	public void selectRespiratoryCheckobx(String section) {
					
		if (section.contains("Cough")) {
			clickElementWithJQuery(PICATLocators.chk_Cough);
			Respiratory_Checkobx.add(section);
		} 
		else if (section.contains("Signs of respiratory distress")) {
			clickElementWithJQuery(PICATLocators.chk_respiratory_distress);
			Respiratory_Checkobx.add(section);
		}

		else if (section.contains("Snoring")) {
			clickElementWithJQuery(PICATLocators.chk_snoring);
			Respiratory_Checkobx.add(section);
		}

		else if (section.contains("Smoking")) {
			clickElementWithJQuery(PICATLocators.chk_smoking);
			Respiratory_Checkobx.add(section);
		}
		else if (section.contains("O2 Therapy")) {
			clickElementWithJQuery(PICATLocators.chk_O2Therapy);
			Respiratory_Checkobx.add(section);
		}
		else if (section.contains("Ventillation")) {
			clickElementWithJQuery(PICATLocators.chk_Ventillation);
			Respiratory_Checkobx.add(section);
		}
		else if (section.contains("Tracheostomy")) {
			clickElementWithJQuery(PICATLocators.chk_Tracheostomy);
			Respiratory_Checkobx.add(section);
		}
		else if (section.contains("Suctioning")) {
			clickElementWithJQuery(PICATLocators.chk_Suctioning);
			Respiratory_Checkobx.add(section);
		}
		else if (section.contains("Chest Physiotherapy")) {
			clickElementWithJQuery(PICATLocators.chk_chest_physiotherapy);
			Respiratory_Checkobx.add(section);
		} 
		else if (section.contains("Amount(L/min)")) {
			clickElementWithJQuery(PICATLocators.chk_Amount);
			Respiratory_Checkobx.add(section);
		}
		else if (section.contains("Delivery")) {
			clickElementWithJQuery(PICATLocators.chk_Delivery);
			Respiratory_Checkobx.add(section);
		}
		else if (section.contains("BIPAP (BI-Level Positive Airway Pressure)")) {
			clickElementWithJQuery(PICATLocators.chk_BIPAP);
			Respiratory_Checkobx.add(section);
		}
		else if (section.contains("CPAP (Continuous Positive Airway Pressure)")) {
			clickElementWithJQuery(PICATLocators.chk_CPAP);
			Respiratory_Checkobx.add(section);
		}
		else if (section.contains("Ventilator")) {
			clickElementWithJQuery(PICATLocators.chk_vantilator);
			Respiratory_Checkobx.add(section);
		}
		else if (section.contains("Size")) {
			clickElementWithJQuery(PICATLocators.chk_size);
			Respiratory_Checkobx.add(section);
		}
		else if (section.contains("Type")) {
			clickElementWithJQuery(PICATLocators.chk_type);
			Respiratory_Checkobx.add(section);
		}
		else if (section.contains("Oral Frequency & other details")) {
			clickElementWithJQuery(PICATLocators.chk_oralfrequency);
			Respiratory_Checkobx.add(section);
		}
		else if (section.contains("Oropharyngeal Frequency & other details")) {
			clickElementWithJQuery(PICATLocators.chk_Oralpharyngeal);
			Respiratory_Checkobx.add(section);
		}
		else if (section.contains("Nasopharyngeal Frequency & other details")) {
			clickElementWithJQuery(PICATLocators.chk_nasopharyngeal);
			Respiratory_Checkobx.add(section);
		}
		else if (section.contains("Tracheal Frequency & other details")) {
			clickElementWithJQuery(PICATLocators.chk_Tracheal);
			Respiratory_Checkobx.add(section);
		}
		else if (section.contains("Percussion / Postural drainage")) {
			clickElementWithJQuery(PICATLocators.chk_Percussion);
			Respiratory_Checkobx.add(section);
		}
		else if (section.contains("Cough assist")) {
			clickElementWithJQuery(PICATLocators.chk_Cough_assist);
			Respiratory_Checkobx.add(section);
		}
		else if (section.contains("PEP (Position Expiry Pressure)")) {
			clickElementWithJQuery(PICATLocators.chk_PEP);
			Respiratory_Checkobx.add(section);
		}
		else if (section.contains("Other")) {
			clickElementWithJQuery(PICATLocators.chk_OTHER);
			Respiratory_Checkobx.add(section);
		}
		else if (section.contains("Nasal Cannula")) {
			clickElementWithJQuery(PICATLocators.chk_Nasal_Cannula);
			Respiratory_Checkobx.add(section);
		}
		else if (section.contains("Nasal Prongs (L/Min)")) {
			clickElementWithJQuery(PICATLocators.chk_Nasal_Prongs);
			Respiratory_Checkobx.add(section);
		}
		else if (section.contains("Mask")) {
			clickElementWithJQuery(PICATLocators.chk_mask);
			Respiratory_Checkobx.add(section);
		}
		else if (section.contains("Continuuous")) {
			clickElementWithJQuery(PICATLocators.chk_Continuuous);
			Respiratory_Checkobx.add(section);
		}
		else if (section.contains("Intermittent")) {
			clickElementWithJQuery(PICATLocators.chk_Intermittent);
			Respiratory_Checkobx.add(section);
		}
		else if (section.contains("Low Flow")) {
			clickElementWithJQuery(PICATLocators.chk_Low_Flow);
			Respiratory_Checkobx.add(section);
		}
		else if (section.contains("Blow By")) {
			clickElementWithJQuery(PICATLocators.chk_Blow_By);
			Respiratory_Checkobx.add(section);
		}
		else if (section.contains("Not Assessed")) {
			clickElementWithJQuery(PICATLocators.chk_Not_Assessed);
			Respiratory_Checkobx.add(section);
		}
		else if (section.contains("Inspection")) {
			clickElementWithJQuery(PICATLocators.chk_Inspection);
			Respiratory_Checkobx.add(section);
		}
		else if (section.contains("No symptons of respiratory stress")) {
			clickElementWithJQuery(PICATLocators.chk_respiratory_stress);
			Respiratory_Checkobx.add(section);
		}
		else if (section.contains("Nasal Flaring")) {
			clickElementWithJQuery(PICATLocators.chk_Nasal_Flaring);
			Respiratory_Checkobx.add(section);
		}
		else if (section.contains("Grunting")) {
			clickElementWithJQuery(PICATLocators.chk_grunting);
			Respiratory_Checkobx.add(section);
		}
		else if (section.contains("Cyanosis")) {
			clickElementWithJQuery(PICATLocators.chk_cyanosis);
			Respiratory_Checkobx.add(section);
		}
		else if (section.contains("Clubbing")) {
			clickElementWithJQuery(PICATLocators.chk_Clubbing);
			Respiratory_Checkobx.add(section);
		}
		else if (section.contains("Strider")) {
			clickElementWithJQuery(PICATLocators.chk_Strider);
			Respiratory_Checkobx.add(section);
		}
		else if (section.contains("Retractions")) {
			clickElementWithJQuery(PICATLocators.chk_Retractions);
			Respiratory_Checkobx.add(section);
		}
		else if (section.contains("Suprasternal")) {
			clickElementWithJQuery(PICATLocators.chk_Suprasternal);
			Respiratory_Checkobx.add(section);
		}
		else if (section.contains("Substernal")) {
			clickElementWithJQuery(PICATLocators.chk_Substernal);
			Respiratory_Checkobx.add(section);
		}
		else if (section.contains("Intercostal")) {
			clickElementWithJQuery(PICATLocators.chk_Intercostal);
			Respiratory_Checkobx.add(section);
		}
		else if (section.contains("Auscultation")) {
			clickElementWithJQuery(PICATLocators.chk_Auscultation);
			Respiratory_Checkobx.add(section);
		}
		else if (section.contains("Air entry")) {
			clickElementWithJQuery(PICATLocators.chk_Air_entry);
			Respiratory_Checkobx.add(section);
		}
		else if (section.contains("Satisfactory")) {
			clickElementWithJQuery(PICATLocators.chk_Satisfactory);
			Respiratory_Checkobx.add(section);
		}
		else if (section.contains("Reduced")) {
			clickElementWithJQuery(PICATLocators.chk_Reduced);
			Respiratory_Checkobx.add(section);
		}
		else if (section.contains("Breath Sounds")) {
			clickElementWithJQuery(PICATLocators.chk_Breath_Sounds);
			Respiratory_Checkobx.add(section);
		}
		else if (section.contains("Clear")) {
			clickElementWithJQuery(PICATLocators.chk_Clear);
			Respiratory_Checkobx.add(section);
		}
		else if (section.contains("Adventitious")) {
			clickElementWithJQuery(PICATLocators.chk_Adventitious);
			Respiratory_Checkobx.add(section);
		}
		else if (section.contains("Crackles: Fines")) {
			clickElementWithJQuery(PICATLocators.chk_Crackle_fine);
			Respiratory_Checkobx.add(section);
		}
		else if (section.contains("Crackles: Coarse")) {
			clickElementWithJQuery(PICATLocators.chk_Crackle_course);
			Respiratory_Checkobx.add(section);
		}
		else if (section.contains("Wheezes high pitched")) {
			clickElementWithJQuery(PICATLocators.chk_high_pitched);
			Respiratory_Checkobx.add(section);
		}
		else if (section.contains("Wheezes low pitched")) {
			clickElementWithJQuery(PICATLocators.chk_low_pitched);
			Respiratory_Checkobx.add(section);
		}
		else if (section.contains("Transmitted upper airways sounds")) {
			clickElementWithJQuery(PICATLocators.chk_airways_sounds);
			Respiratory_Checkobx.add(section);
		}
		else {
			clickElementWithJQuery(PICATLocators.chk_noreportedconcern_Respiratory);
			Respiratory_Checkobx.add(section);
		}

	}
	public void selectCardiovascularCheckobx(String section) {
		if (section.contains("Fatigue")) {
			clickElementWithJQuery(PICATLocators.chk_Fatigue);
			Cardiovascular_Checkobx.add(section);
		} 
		else if (section.contains("Murmurs")) {
			clickElementWithJQuery(PICATLocators.chk_Murmurs);
			Cardiovascular_Checkobx.add(section);
		}
		else if (section.contains("Arrhythmias")) {
			clickElementWithJQuery(PICATLocators.chk_Arrhythmias);
			Cardiovascular_Checkobx.add(section);
		}
		else if (section.contains("Cardiac Surgery")) {
			clickElementWithJQuery(PICATLocators.chk_Cardiac_Surgery);
			Cardiovascular_Checkobx.add(section);
		}
		else if (section.contains("Thrombus")) {
			clickElementWithJQuery(PICATLocators.chk_Thrombus);
			Cardiovascular_Checkobx.add(section);
		}
		else if (section.contains("Stroke")) {
			clickElementWithJQuery(PICATLocators.chk_Stroke);
			Cardiovascular_Checkobx.add(section);
		}
		else {
			clickElementWithJQuery(PICATLocators.chk_No_Reported_Concerns_Cardiovascular);
			Cardiovascular_Checkobx.add(section);
		}
	}
	public void selectGastrointestinalCheckobx(String section) {
		if (section.contains("Pain Management")) {
			clickElementWithJQuery(PICATLocators.chk_Pain_Management);
			Gastrointestinal_Checkobx.add(section);
		} 
		else if (section.contains("Nutrition and Patient Education")) {
			clickElementWithJQuery(PICATLocators.chk_Nutrition_and_Patient);
			Gastrointestinal_Checkobx.add(section);
		}
		else if (section.contains("Nausea")) {
			clickElementWithJQuery(PICATLocators.chk_Nausea);
			Gastrointestinal_Checkobx.add(section);
		}
		else if (section.contains("Vomiting")) {
			clickElementWithJQuery(PICATLocators.chk_Vomiting);
			Gastrointestinal_Checkobx.add(section);
		}
		else if (section.contains("Toilet trained")) {
			clickElementWithJQuery(PICATLocators.chk_Toilet_trained);
			Gastrointestinal_Checkobx.add(section);
		}
		else if (section.contains("Constipation")) {
			clickElementWithJQuery(PICATLocators.chk_Constipation);
			Gastrointestinal_Checkobx.add(section);
		}
		else if (section.contains("Diarrhea")) {
			clickElementWithJQuery(PICATLocators.chk_Diarrhea);
			Gastrointestinal_Checkobx.add(section);
		}
	}
	public void selectSkinCheckbox(String section) {
		if(section.contains("Dry")) {
			clickElementWithJQuery(PICATLocators.chk_dry);
			Skin_Checkobx.add(section);
		}
		else if(section.contains("Cool")) {
			clickElementWithJQuery(PICATLocators.chk_cool);
			Skin_Checkobx.add(section);
		}
		else if(section.contains("Pale")) {
			clickElementWithJQuery(PICATLocators.chk_pale);
			Skin_Checkobx.add(section);
		}
		else if(section.contains("Flushed")) {
			clickElementWithJQuery(PICATLocators.chk_flush);
			Skin_Checkobx.add(section);
		}
		else if(section.contains("Turgor Brisk")) {
			clickElementWithJQuery(PICATLocators.chk_Turgor_Brisk);
			Skin_Checkobx.add(section);
		}
		else if(section.contains("Pink")) {
			clickElementWithJQuery(PICATLocators.chk_pink);
			Skin_Checkobx.add(section);
		}
	}
	public void selectGenitoUrinarySexualDevelopmentCheckbox(String section) {
		if(section.contains("Yes")) {
			clickElementWithJQuery(PICATLocators.chk_Toilet_Trained);
			GenitoUrinarySexualDevelopment_Checkobx.add(section);
		}
		else if(section.contains("Clean Intermittent Catheterization")) {
			clickElementWithJQuery(PICATLocators.chk_Clean_Intermittent_Catheterization);
			GenitoUrinarySexualDevelopment_Checkobx.add(section);
		}
		else if(section.contains("Indwelling")) {
			clickElementWithJQuery(PICATLocators.chk_Indwelling);
			GenitoUrinarySexualDevelopment_Checkobx.add(section);
		}
	}
	public void selectNeurologicalcheckbox(String section) {
		if(section.contains("Fine Motor Deficit")) {
			clickElementWithJQuery(PICATLocators.chk_Fine_Motor_Deficit);
			Neurological_Checkobx.add(section);
		}
		else if(section.contains("Dizziness")) {
			clickElementWithJQuery(PICATLocators.chk_Dizziness);
			Neurological_Checkobx.add(section);
		}
		else if(section.contains("Headache")) {
			clickElementWithJQuery(PICATLocators.chk_Headache);
			Neurological_Checkobx.add(section);
		}
		else if(section.contains("Head Injury")) {
			clickElementWithJQuery(PICATLocators.chk_Head_Injury);
			Neurological_Checkobx.add(section);
		}
		else if(section.contains("VP Shunt")) {
			clickElementWithJQuery(PICATLocators.chk_VP_Shunt);
			Neurological_Checkobx.add(section);
		}
	}
	public void selectNeuromuscularcheckbox(String section) {
		if(section.contains("Partial ROM")) {
			clickElementWithJQuery(PICATLocators.chk_Partial_ROM);
			Neuromuscular_Checkbox.add(section);
		}
		else if(section.contains("Hypotonia present")) {
			clickElementWithJQuery(PICATLocators.chk_Hypotonia_present);
			Neuromuscular_Checkbox.add(section);
		}
		else if(section.contains("Wheelchair")) {
			clickElementWithJQuery(PICATLocators.chk_Wheelchair);
			Neuromuscular_Checkbox.add(section);
		}
		else if(section.contains("Walker")) {
			clickElementWithJQuery(PICATLocators.chk_Walker);
			Neuromuscular_Checkbox.add(section);
		}
		else if(section.contains("Crutches")) {
			clickElementWithJQuery(PICATLocators.chk_Crutches);
			Neuromuscular_Checkbox.add(section);
		}
		else if(section.contains("Splints/Braces")) {
			clickElementWithJQuery(PICATLocators.chk_Splints);
			Neuromuscular_Checkbox.add(section);
		}
		else if(section.contains("Passive ROM observed")) {
			clickElementWithJQuery(PICATLocators.chk_Passive_ROM_observed);
			Neuromuscular_Checkbox.add(section);
		}
		else if(section.contains("Contractures present")) {
			clickElementWithJQuery(PICATLocators.chk_Contractures_present);
			Neuromuscular_Checkbox.add(section);
		}
		else if(section.contains("Weakness present")) {
			clickElementWithJQuery(PICATLocators.chk_Weakness);
			Neuromuscular_Checkbox.add(section);
		}
		else if(section.contains("Muscle wasting")) {
			clickElementWithJQuery(PICATLocators.chk_Muscle);
			Neuromuscular_Checkbox.add(section);
		}
	}
	
	public void selectFaceCheckbox(String section) {
		if(section.contains("Changes in vision/limitations in vision")) {
			clickElementWithJQuery(PICATLocators.chk_Vision_Limmitation);
			Face_Checkbox.add(section);
		}
		else if(section.contains("Use of visual aids and devices")) {
			clickElementWithJQuery(PICATLocators.chk_visual_aids_and_devices);
			Face_Checkbox.add(section);
		}
		else if(section.contains("Glasses")) {
			clickElementWithJQuery(PICATLocators.chk_Glasses);
			Face_Checkbox.add(section);
		}
		else if(section.contains("Contact lenses")) {
			clickElementWithJQuery(PICATLocators.chk_Contact_lenses);
			Face_Checkbox.add(section);
		}
		else if(section.contains("History of earaches")) {
			clickElementWithJQuery(PICATLocators.chk_History_of_earaches);
			Face_Checkbox.add(section);
		}
		else if(section.contains("Tinnitus")) {
			clickElementWithJQuery(PICATLocators.chk_Tinnitus);
			Face_Checkbox.add(section);
		}
		else if(section.contains("Myringotomy tubes")) {
			clickElementWithJQuery(PICATLocators.chk_Myringotomy_tubes);
			Face_Checkbox.add(section);
		}
		else if(section.contains("Sinus pain")) {
			clickElementWithJQuery(PICATLocators.chk_Sinus_pain);
			Face_Checkbox.add(section);
		}
		else if(section.contains("History of epitaxis")) {
			clickElementWithJQuery(PICATLocators.chk_History_of_epitaxis);
			Face_Checkbox.add(section);
		}
		else if(section.contains("Excessive drooling")) {
			clickElementWithJQuery(PICATLocators.chk_Excessive_drooling);
			Face_Checkbox.add(section);
		}
		else if(section.contains("Oral aversion")) {
			clickElementWithJQuery(PICATLocators.chk_Oral_aversion);
			Face_Checkbox.add(section);
		}
		else if(section.contains("Redness,swelling noted to eyes")) {
			clickElementWithJQuery(PICATLocators.chk_Redness_swelling_noted_eyes);
			Face_Checkbox.add(section);
		}
		else if(section.contains("Left")) {
			clickElementWithJQuery(PICATLocators.chk_Left);
			Face_Checkbox.add(section);
		}
		else if(section.contains("Watery eyes")) {
			clickElementWithJQuery(PICATLocators.chk_Watery_eyes);
			Face_Checkbox.add(section);
		}
		else if(section.contains("Left Watery eyes")) {
			clickElementWithJQuery(PICATLocators.chk_Left_Watery_eyes);
			Face_Checkbox.add(section);
		}
		else if(section.contains("Discharge")) {
			clickElementWithJQuery(PICATLocators.chk_Discharge);
			Face_Checkbox.add(section);
		}
		else if(section.contains("Right")) {
			clickElementWithJQuery(PICATLocators.chk_Right);
			Face_Checkbox.add(section);
		}
		else if(section.contains("Gum hypertrophy")) {
			clickElementWithJQuery(PICATLocators.chk_Gum_hypertrophy);
			Face_Checkbox.add(section);
		}
		else if(section.contains("Atypical dentition")) {
			clickElementWithJQuery(PICATLocators.chk_Atypical_dentition);
			Face_Checkbox.add(section);
		}
	}
	public void selectNutritionCheckbox(String section) {
		if(section.contains("Pureed")) {
			clickElementWithJQuery(PICATLocators.chk_Pureed);
			Nutrition_Checkbox.add(section);
		}
		else if(section.contains("Finger Food")) {
			clickElementWithJQuery(PICATLocators.chk_Finger_Food);
			Nutrition_Checkbox.add(section);
		}
		else if(section.contains("Breast milk")) {
			clickElementWithJQuery(PICATLocators.chk_Breast_milk);
			Nutrition_Checkbox.add(section);
		}
		else if(section.contains("Formula")) {
			clickElementWithJQuery(PICATLocators.chk_Formula);
			Nutrition_Checkbox.add(section);
		}
		else if(section.contains("Assist")) {
			clickElementWithJQuery(PICATLocators.chk_Assist);
			Nutrition_Checkbox.add(section);
		}
		else if(section.contains("Table")) {
			clickElementWithJQuery(PICATLocators.chk_Table);
			Nutrition_Checkbox.add(section);
		}
		else if(section.contains("Bottle")) {
			clickElementWithJQuery(PICATLocators.chk_Bottle);
			Nutrition_Checkbox.add(section);
		}
		else if(section.contains("Uses finger")) {
			clickElementWithJQuery(PICATLocators.chk_Uses_finger);
			Nutrition_Checkbox.add(section);
		}
		else if(section.contains("Difficulty chewing")) {
			clickElementWithJQuery(PICATLocators.chk_Difficulty_chewing);
			Nutrition_Checkbox.add(section);
		}
		else if(section.contains("Requires cueing")) {
			clickElementWithJQuery(PICATLocators.chk_Requires_cueing);
			Nutrition_Checkbox.add(section);
		}
	}
}

