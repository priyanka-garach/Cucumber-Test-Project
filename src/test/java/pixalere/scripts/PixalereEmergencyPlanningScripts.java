package pixalere.scripts;
import org.openqa.selenium.By;

import pixalere.pageObjectUtils.PixalereCommonUtils;
import pixalere.pageObjectUtils.LocatorUtils.CustomizedLocators;

public class PixalereEmergencyPlanningScripts extends PixalereCommonUtils {

	public void selectRadioOptionFromSection_risk(String section) {
		//Wait_p(1);
		clickElement(CustomizedLocators.getRadioOptionByEmegency_risk_of_life(section));
		System.out.println();		
	}
	
	public void selectRadioOptionFromSection_liveAlone(String section) {
		//Wait_p(1);
		clickElement(CustomizedLocators.getRadioOptionByEmegency_liveAlone(section));
		//System.out.println();		
	}
	
	public void selectRadioOptionFromSection_E_planning_field(String section) {
		clickElement(CustomizedLocators.getRadioOptionByEmegency_E_panning(section));
	}
	
	
}
