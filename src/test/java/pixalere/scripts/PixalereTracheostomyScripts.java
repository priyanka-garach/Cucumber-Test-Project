package pixalere.scripts;

import pixalere.pageObjectUtils.LocatorUtils.CustomizedLocators;
import pixalere.pageObjectUtils.PixalereCommonUtils;

public class PixalereTracheostomyScripts extends PixalereCommonUtils{

	public void selectRdioforfieldTrachestomy(String section) {
		clickElement(CustomizedLocators.getRadioOptionByTrachestomy(section));
	}
	public void selectRadioOptionFromSection_Suction_System_Checks(String section) {
		clickElement(CustomizedLocators.getRadioOptionBySuction_System_Checks(section));
	}
	public void selectRadioOptionFromSection_Trach_Set_Change_field(String section) {
		clickElement(CustomizedLocators.getRadioOptionByTrach_Set_Change_field(section));
	}
	public void selectRadioOptionFromSection_Spare_Trach_Set_Available(String section) {
		clickElement(CustomizedLocators.getRadioOptionBySpare_Trach_Set_Available(section));
	}
	public void selectRadioOptionFromSection_Stoma_Care_Provided_field(String section) {
		clickElement(CustomizedLocators.getRadioOptionByStoma_Care_Provided_field(section));
	}
	public void selectRadioOptionFromSection_suctioning_performed_field(String section) {
		clickElement(CustomizedLocators.getRadioOptionBysuctioning_performed_field(section));
	}
	public void selectRadioOptionFromSection_client_ventilator_field(String section) {
		clickElement(CustomizedLocators.getRadioOptionByclient_ventilator_field(section));
	}
	public void selectRadioOptionFromSection_Water_Level_Checked_field(String section) {
		clickElement(CustomizedLocators.getRadioOptionByWater_Level_Checked_field(section));
	}
	public void selectRadioOptionFromSection_Humidifier_ON_Checked_field(String section) {
		clickElement(CustomizedLocators.getRadioOptionByHumidifier_ON_Checked_field(section));
	}
}
