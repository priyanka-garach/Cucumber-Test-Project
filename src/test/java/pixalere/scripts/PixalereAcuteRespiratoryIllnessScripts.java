package pixalere.scripts;

import pixalere.pageObjectJavaUtils.JavaUtils;
import pixalere.pageObjectUtils.LocatorUtils.AcuteRespiratoryIllnessPageLocators;
import pixalere.pageObjectUtils.LocatorUtils.CustomizedLocators;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import pixalere.pageObjectUtils.PixalereCommonUtils;

public class PixalereAcuteRespiratoryIllnessScripts extends PixalereCommonUtils {

	public static String VitalSigns3;
	public static String VitalSigns4;
	public static String VitalSigns5;
	public static String VitalSigns6;
	public static String VitalSigns7;
	public static String VitalSigns8;
	
	public void checkUncheckNoSymptomsNoted() {
		clickElement(AcuteRespiratoryIllnessPageLocators.chk_NoSymptomsNotedCheckbox);
	}
	
	public void verifyFieldsVisibility(String visibility) {
		waitInterval(1);
		if(visibility.contains("disabled"))
			Assert.assertTrue("All Fields should Disable...", !isDisplayed(AcuteRespiratoryIllnessPageLocators.txt_TemperatureInput));
		else {
			highLightElement(AcuteRespiratoryIllnessPageLocators.txt_TemperatureInput);
			Assert.assertTrue("All Fields should Enable...", isDisplayed(AcuteRespiratoryIllnessPageLocators.txt_TemperatureInput));
		}
	}
	
	public void enterTemperatureField(String tempInCelsius) {
		sendKeys(AcuteRespiratoryIllnessPageLocators.txt_TemperatureInput, tempInCelsius);
	}
	
	public void selectRadioOptionforTemperature(String section) {
		clickElement(CustomizedLocators.selectRadioOptionforTemperature(section));
	}
	
	public void selectRadioOptionFromSection(String section) {
		clickElement(CustomizedLocators.getRadioOptionByAcuteRespiratoryIllnessSection(section));
	}
	
	public void selectRadioOptionFromSection_p(String section) {
		Wait_p(5);
		clickElement(CustomizedLocators.getRadioOptionByAcuteRespiratoryIllnessSection_p(section));
	}
	
	public void selectRadioOptionFromSection_bp(String section) {
		//Wait_p(5);
		clickElement(CustomizedLocators.getRadioOptionByVitalSigns_bloodpressure(section));
		//verify(section);
		//System.out.println();
		
	}
	
	public void selectRadioOptionFromSection_pt(String section) {
		VitalSigns3 = section;
		clickElement(CustomizedLocators.getRadioOptionByVitalSigns_pulseType(section));
		//System.out.println();
		
	}
	public void selectRadioOptionFromSection_ccf(String section) {
		clickElement(CustomizedLocators.getRadioOptionByPCAPainPump_cassete_ccf(section));		
	}
	
	public void selectRadioOptionFromSection_tcf(String section) {
		clickElement(CustomizedLocators.getRadioOptionByPCAPainPump_tubing_tcf(section));		
	}
	
	public void selectRadioOptionFromSection_scf(String section) {
		clickElement(CustomizedLocators.getRadioOptionByPCAPainPump_sitechange_scf(section));		
	}
	
	public void selectRadioOptionFromSection_routePCA(String section) {
		clickElement(CustomizedLocators.getRadioOptionByPCAPainPump_RoutePCA(section));		
	}
	
	
	
	
	
	public void selectRadioOptionFromSection_ptf(String section) {
		VitalSigns4 = section;
		clickElement(CustomizedLocators.getRadioOptionByVitalSigns_perTypefield(section));		
	}
	
	public void selectRadioOptionFromSection_brf(String section) {
		//Wait_p(5);
		clickElement(CustomizedLocators.getRadioOptionByVitalSigns_brf(section));		
	}
	
	
	public void selectRadioOptionFromSection_pnf(String section) {
		if(section.equalsIgnoreCase("Client")) {
			VitalSigns5 = section;
		}
		
		if(section.equalsIgnoreCase("Yes")) {
			VitalSigns6 = section;
		}
		
		if(section.equalsIgnoreCase("Alert")) {
			VitalSigns7 = section;
		}
		
		clickElement(CustomizedLocators.getRadioOptionByVitalSigns_perTypefield(section));		
	}
	
	
	
	public void verifySavedValue(String section, String value) {
		waitInterval(2);
		int index=1;
		String column=null, columnVal=null;
		waitUntilElementIsDisplayed(AcuteRespiratoryIllnessPageLocators.css_AcuteRespiratoryIllnessTableColumnList);
		scrollAndhighLightElement(AcuteRespiratoryIllnessPageLocators.css_AcuteRespiratoryIllnessTableColumnList);
		for (WebElement tableColumn : getWebDriver().findElements(AcuteRespiratoryIllnessPageLocators.css_AcuteRespiratoryIllnessTableColumnList)) {
			column = tableColumn.getText();
			System.out.println("UI column: "+column);
			
			if(column.contains(section)) {
				highLightElement(tableColumn);
				highLightElement(CustomizedLocators.getAcuteRespiratoryIllnessTableValueAsPerIndex(index));
				columnVal = getElementText(CustomizedLocators.getAcuteRespiratoryIllnessTableValueAsPerIndex(index));
				System.out.println("UI actual columnVal: "+columnVal);
				
				Assert.assertTrue(columnVal+" != "+value, columnVal.contains(value));
				break;
			}
			index++;
		}
	}
	
	public void clickOnDeleteSavedRecordButton() {
		clickElementWithJQuery(AcuteRespiratoryIllnessPageLocators.btn_DeleteRecordButton);
	}
	
	public void editDeleteRecordReason() {
		sendKeys(AcuteRespiratoryIllnessPageLocators.txt_DeleteReasonTextarea, JavaUtils.getRandomString(10));
	}
	
	public void verifySavedRecordDeleted(String section, String value) {
		waitInterval(2);
		int index=1;
		String column=null, columnVal=null;
		waitUntilElementIsDisplayed(AcuteRespiratoryIllnessPageLocators.css_AcuteRespiratoryIllnessTableColumnList);
		scrollAndhighLightElement(AcuteRespiratoryIllnessPageLocators.css_AcuteRespiratoryIllnessTableColumnList);
		for (WebElement tableColumn : getWebDriver().findElements(AcuteRespiratoryIllnessPageLocators.css_AcuteRespiratoryIllnessTableColumnList)) {
			column = tableColumn.getText();
			System.out.println("UI column: "+column);
			
			if(column.contains(section)) {
				highLightElement(tableColumn);
				highLightElement(CustomizedLocators.getAcuteRespiratoryIllnessTableDeletedValueAsPerIndex(index));
				columnVal = getElementText(CustomizedLocators.getAcuteRespiratoryIllnessTableDeletedValueAsPerIndex(index));
				System.out.println("UI actual columnVal: "+columnVal);
				
				Assert.assertTrue(columnVal+" != "+value, columnVal.contains(value));
				break;
			}
			index++;
		}
	}
}
