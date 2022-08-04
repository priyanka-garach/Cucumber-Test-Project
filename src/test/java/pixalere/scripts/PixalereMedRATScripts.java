package pixalere.scripts;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;

import pixalere.pageObjectUtils.LocatorUtils.CustomizedLocators;
import pixalere.pageObjectUtils.LocatorUtils.MedRatLocators;
import pixalere.pageObjectUtils.PixalereCommonUtils;

public class PixalereMedRATScripts extends PixalereCommonUtils {
	
	public static List<String> MedRAT_checkbox = new ArrayList<>();

	public void selectRadioOptionFromSection_riskMedRAT(String section) {
		clickElement(CustomizedLocators.getRadioOptionByEmegency_risk_of_lifeMEDRAT(section));	
	}
	
	public void selectRadioOptionFromSection_clients_medication_Medrat(String section) {
		clickElement(CustomizedLocators.getRadioOptionByEmegency_clients_medication_Medrat(section));	
	}
	
	public void selectRadioOptionFromSection_clients_medication_adherence(String section) {
		clickElement(CustomizedLocators.getRadioOptionByEmegency_clients_medication_adherence_medrat(section));	
	}
	
	public void selectRadioOptionFromSection_clients_high_risk_medication(String section) {
		clickElement(CustomizedLocators.getRadioOptionByEmegency_clients_high_risk_medication_medrat(section));	
	}
	
	public void selectRadioOptionFromSection_clients_high_risk_medication_Based_on_the_information_above(String section) {
		CustomizedLocators.getRadioOptionByEmegency_Based_on_the_information_above_medrat(section);	
	}
	
	
	
	public void selectIntakeOutputCheckobx(String section) {
					
			if (section.contains("Impaired cognition")) {
				clickElementWithJQuery(MedRatLocators.chk_Impaired_cognition);
				MedRAT_checkbox.add(section);
			}
			else if (section.contains("Impaired vision, hearing, swallowing")) {
				clickElementWithJQuery(MedRatLocators.chk_Impaired_Vision_Hear_Swallow);
				MedRAT_checkbox.add(section);
			}
				
			else if(section.contains("Lacks necessary support")) {
				clickElementWithJQuery(MedRatLocators.chk_Lacks_necessary_support);
				MedRAT_checkbox.add(section);
			}
				
			
			else if(section.contains("Lower literacy or ESL issues")) {
				clickElementWithJQuery(MedRatLocators.chk_Lower_literacy_or_ESL_issuest);
				MedRAT_checkbox.add(section);
			}
				
			
			else if(section.contains("Side effects")) {
				clickElementWithJQuery(MedRatLocators.chk_Side_effects);
				MedRAT_checkbox.add(section);
			}
			
			else if(section.contains("Cost")) {
				clickElementWithJQuery(MedRatLocators.chk_Cost);
				MedRAT_checkbox.add(section);
			}
			
			else if(section.contains("Client's beliefs/expectations")) {
				clickElementWithJQuery(MedRatLocators.chk_Client_beliefs_expectations);
				MedRAT_checkbox.add("Client's beliefs/expectations");
			}
			
			else if(section.contains("Lacks basic understanding of medications")) {
				clickElementWithJQuery(MedRatLocators.chk_lacks_basic);
				MedRAT_checkbox.add(section);
			}
			
			else if(section.contains("Other")) {
				clickElementWithJQuery(MedRatLocators.chk_other);
				MedRAT_checkbox.add(section);
			}
			else {
				//clickElementWithJQuery(MedRatLocators.chk_Impaired_cognition);
			}
			
	}
	
	
	
	
	
	
	
}
