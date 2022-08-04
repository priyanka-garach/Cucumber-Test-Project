package pixalere.scripts;

//import pixalere.pageObjectUtils.LocatorUtils.AcuteRespiratoryIllnessPageLocators;
import pixalere.pageObjectUtils.LocatorUtils.CustomizedLocators;
import pixalere.pageObjectUtils.LocatorUtils.HomePeritonealLocators;
import pixalere.pageObjectUtils.PixalereCommonUtils;

public class PixalereHomePeritonealScripts extends PixalereCommonUtils {

	public static String homedrpdrainage;
	public static String homedrpskinintegrity;
	
	public void selectRadioOptionFromSection_mfhome(String section) {
		clickElement_withJS(CustomizedLocators.getRadioOptionByHome_Modality(section));
		Wait_p(3);
		// System.out.println();
	}

	public void selectRadioOptionFromSection_efhome(String section) {
		// Wait_p(1);
		clickElement_withJS(CustomizedLocators.getRadioOptionByVitalSigns_efhome(section));
		// System.out.println();
	}

	public void selectRadioOptionFromSection_aaf(String section) {
		// Wait_p(1);
		clickElement_withJS(CustomizedLocators.getRadioOptionForAntibiotic_added(section));
		System.out.println();
	}

	public void selectRadioOptionFromSection_dsf(String section) {
		// Wait_p(1);
		clickElement_withJS(CustomizedLocators.getRadioOptionByHome_DialysateClear(section));
		// System.out.println();
	}

	public void selectRadioOptionFromSection_hf(String section) {
		// Wait_p(1);
		clickElement_withJS(CustomizedLocators.getRadioOptionByHome_heparin(section));
		// System.out.println();
	}

	public void selectDropdownValue_p(String dropdown, String value) {
		
		if (dropdown.equalsIgnoreCase("Skin Integrity around port site")) {
			homedrpskinintegrity = value;
			selectByVisibleText(HomePeritonealLocators.drp_SkinIntegrity, value);
		}

		else {
			homedrpdrainage = value;
			selectByVisibleText(HomePeritonealLocators.drp_drainage, value);
		}
		System.out.println();
	}

}
