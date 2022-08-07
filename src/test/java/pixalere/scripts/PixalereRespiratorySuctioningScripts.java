package pixalere.scripts;

import org.openqa.selenium.By;

import pixalere.pageObjectUtils.LocatorUtils.CustomizedLocators;
import pixalere.pageObjectUtils.PixalereCommonUtils;

public class PixalereRespiratorySuctioningScripts extends PixalereCommonUtils{

	public void selectRadioButtonBySuction_machine_working(String section) {
		clickElement(CustomizedLocators.getRadioOptionBySuction_machine_working(section));
	}
	public void selectRadioButtonByBattery_charged(String section) {
		clickElement(CustomizedLocators.getRadioOptionByBattery_charged(section));
	}
	public void selectRadioButtonByType_of_suctioning(String section) {
		clickElement(CustomizedLocators.getRadioOptionByType_of_suctioning(section));
	}
	public void selectRadioButtonByAmount(String section) {
		clickElement(CustomizedLocators.getRadioOptionByAmount(section));
	}
	public void selectRadioButtonByColor(String section) {
		clickElement(CustomizedLocators.getRadioOptionByColor(section));
	}
	public void selectRadioButtonByConsistency(String section) {
		clickElement(CustomizedLocators.getRadioOptionByConsistency(section));
	}
	public void selectRadioButtonByOdour(String section) {
		clickElement(CustomizedLocators.getRadioOptionByOdour(section));
	}
	public void selectRadioButtonBySuctioning_container_cleaned(String section) {
		clickElement(CustomizedLocators.getRadioOptionBySuctioning_container_cleaned(section));
	}
	public void selectDateFromSuctioning_Date(String section) {
		selectByVisibleText(By.xpath("//div[@class='col-lg-3 col-md-5 col-sm-6 col-12']//select[@id='backdated_day']"), section);
	}
	public void selectDateFromSuctioning_Month(String section) {
		selectByVisibleText(By.xpath("//div[@class='col-lg-3 col-md-5 col-sm-6 col-12']//select[@id='backdated_month']"), section);
	}
	public void selectRadioButtonByNon_invasive_ventilation(String section) {
		clickElement(CustomizedLocators.getRadioOptionByNon_invasive_ventilation(section));
	}
	public void selectRadioButtonByOxygen_in_situ(String section) {
		clickElement(CustomizedLocators.getRadioOptionByOxygen_in_situ(section));
	}
	public void selectRadioButtonByHumidifier_Check(String section) {
		clickElement(CustomizedLocators.getRadioOptionByHumidifier_Check(section));
	}
	public void selectRadioButtonByAir_filter_cleaned(String section) {
		clickElement(CustomizedLocators.getRadioOptionByAir_filter_cleaned(section));
	}
	public void selectRadioButtonByMask_tubing_cleaned(String section) {
		clickElement(CustomizedLocators.getRadioOptionByMask_tubing_cleaned(section));
	}
	public void selectDateFromNon_invasive_ventilation_Date(String section) {
		selectByVisibleText(By.xpath("//form[@id='form_vent']//select[@id='backdated_day']"), section);
	}
	public void selectDateFromNon_invasive_ventilation_Month(String section) {
		selectByVisibleText(By.xpath("//form[@id='form_vent']//select[@id='backdated_month']"), section);
	}
	public void selectRadioButtonByCough_Assist(String section) {
		clickElement(CustomizedLocators.getRadioOptionByCough_Assist(section));
	}
	public void selectRadioButtonByAir_filter_cleaned_Cough_Assist(String section) {
		clickElement(CustomizedLocators.getRadioOptionByAir_filter_cleaned_Cough_Assist(section));
	}
	public void selectRadioButtonByMask_tubing_cleaned_Cough_Assist(String section) {
		clickElement(CustomizedLocators.getRadioOptionByMask_tubing_cleaned_Cough_Assist(section));
	}
	public void selectDateFromCough_Assist_Date(String section) {
		selectByVisibleText(By.xpath("//form[@id='form_cough']//select[@id='backdated_day']"), section);
	}
	public void selectDateFromCough_Assist_Month(String section) {
		selectByVisibleText(By.xpath("//form[@id='form_cough']//select[@id='backdated_month']"), section);
	}
}
