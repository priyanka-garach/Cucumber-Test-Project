package pixalere.scripts;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import pixalere.pageObjectJavaUtils.JavaUtils;
import pixalere.pageObjectUtils.LocatorUtils.AcuteRespiratoryIllnessPageLocators;
import pixalere.pageObjectUtils.LocatorUtils.CustomizedLocators;
import pixalere.pageObjectUtils.LocatorUtils.PalliativePageLocators;
import pixalere.pageObjectUtils.PixalereCommonUtils;
import pixalere.pageObjectUtils.PixalereStringPool;

public class PixalerePalliativeScripts extends PixalereCommonUtils {
	
	private List<String> ppsLevelList = Arrays.asList("100","90","80");
	private Map<String, String> assessmentToolMap = new HashMap<String, String>();
	
	/*** Palliative Performance Scale ***/
	
	public void selectPPSLevelAndVerifyInTable() {
		String column=null;
		String columnVal=null;
		waitInterval(2);
		
		for (String ppsValue : ppsLevelList) {
			clickElementWithJQuery(CustomizedLocators.getPPSLevelSelectElementByValue(ppsValue));
			waitInterval(2);
			
			waitUntilElementIsDisplayed(AcuteRespiratoryIllnessPageLocators.css_AcuteRespiratoryIllnessTableColumnList);
			scrollAndhighLightElement(AcuteRespiratoryIllnessPageLocators.css_AcuteRespiratoryIllnessTableColumnList);
			
			int index=1;
			for (WebElement tableColumn : getWebDriver().findElements(AcuteRespiratoryIllnessPageLocators.css_AcuteRespiratoryIllnessTableColumnList)) {
				column = tableColumn.getText();
				System.out.println("UI column: "+column);
				
				if(column.contains("PPS Level")) {
					highLightElement(tableColumn);
					highLightElement(CustomizedLocators.getAcuteRespiratoryIllnessTableValueAsPerIndex(index));
					columnVal = getElementText(CustomizedLocators.getAcuteRespiratoryIllnessTableValueAsPerIndex(index));
					System.out.println("UI actual columnVal: "+columnVal);
					
					Assert.assertTrue(columnVal+" != "+ppsValue, columnVal.contains(ppsValue));
					break;
				}
				index++;
			}
		}
	}
	
	public void verifyPPSRecordDeleted() {
		waitInterval(2);
		int index=1;
		String column=null, columnVal=null;
		waitUntilElementIsDisplayed(AcuteRespiratoryIllnessPageLocators.css_AcuteRespiratoryIllnessTableColumnList);
		scrollAndhighLightElement(AcuteRespiratoryIllnessPageLocators.css_AcuteRespiratoryIllnessTableColumnList);
		for (WebElement tableColumn : getWebDriver().findElements(AcuteRespiratoryIllnessPageLocators.css_AcuteRespiratoryIllnessTableColumnList)) {
			column = tableColumn.getText();
			System.out.println("UI column: "+column);
			
			if(column.contains("PPS Level")) {
				highLightElement(tableColumn);
				highLightElement(CustomizedLocators.getAcuteRespiratoryIllnessTableDeletedValueAsPerIndex(index));
				columnVal = getElementText(CustomizedLocators.getAcuteRespiratoryIllnessTableDeletedValueAsPerIndex(index));
				System.out.println("UI actual columnVal: "+columnVal);
				
				Assert.assertTrue(columnVal+" != "+ppsLevelList.get(ppsLevelList.size()-1), columnVal.contains(ppsLevelList.get(ppsLevelList.size()-1)));
				break;
			}
			index++;
		}
	}
	
	/*** Palliative Assessment Tool ***/
	
	public void editPPSStageInput(String ppsStageSection) {
		String inputText = JavaUtils.getRandomNumber(3);
		assessmentToolMap.put(ppsStageSection, inputText);
		System.out.println("assessmentToolMap: "+assessmentToolMap);
		sendKeys(PalliativePageLocators.txt_PPSStageInput, inputText);
	}
	
	public void selectOptionsFromAssessmentToolSection(String optionList, String section) {
		int index=0;
		for (String option : optionList.split(",")) {
			waitInterval(1);
			clickElementWithJQuery(CustomizedLocators.getPalliativeAssessmentToolOptionBySection(section, option));
			assessmentToolMap.put(section+index, option.trim());
			index++;
		}
		System.out.println("assessmentToolMap: "+assessmentToolMap);
	}
	
	public void editAssessmentToolSectionComments(String commentSection) {
		waitInterval(1);
		String commentText = JavaUtils.getRandomString(10);
		assessmentToolMap.put(commentSection, commentText);
		System.out.println("assessmentToolMap: "+assessmentToolMap);
		
		switch (commentSection) {
		case PixalereStringPool.DISEASE_MANAGEMENT_COMM:
			sendKeys(PalliativePageLocators.txt_DiseaseManagementCommentsInput, commentText);
			break;
			
		case PixalereStringPool.PHYSICAL_COMM:
			sendKeys(PalliativePageLocators.txt_PhysicalCommentsInput, commentText);
			break;
			
		case PixalereStringPool.PSYCHOLOGICAL_COMM:
			sendKeys(PalliativePageLocators.txt_PsychologicalCommentsInput, commentText);
			break;
			
		case PixalereStringPool.SOCIAL_COMM:
			sendKeys(PalliativePageLocators.txt_SocialCommentsInput, commentText);
			break;
			
		case PixalereStringPool.SPIRITUAL_COMM:
			sendKeys(PalliativePageLocators.txt_SpiritualCommentsInput, commentText);
			break;
			
		case PixalereStringPool.PRACTICAL_COMM:
			sendKeys(PalliativePageLocators.txt_PracticalCommentsInput, commentText);
			break;
			
		case PixalereStringPool.END_OF_LIFE_COMM:
			sendKeys(PalliativePageLocators.txt_EndOfLifeCommentsInput, commentText);
			break;
			
		case PixalereStringPool.LOSS_AND_GRIEF_COMM:
			sendKeys(PalliativePageLocators.txt_LossAndGriefCommentsInput, commentText);
			break;
		}
	}
	
	public void verifyPalliativeAssessmentDetailsOnViewer() {
		waitForCompletePageLoad();
		
		for (String mapKey : assessmentToolMap.keySet()) {
			String expectedVal = assessmentToolMap.get(mapKey);
			System.out.println(mapKey+" expectedVal: "+expectedVal);
			
			if(mapKey.endsWith("0"))
				mapKey=mapKey.replace("0", "");
			else if(mapKey.endsWith("1"))
				mapKey=mapKey.replace("1", "");
			
			scrollAndhighLightElement(CustomizedLocators.getPalliativeAssessmentLatestValueOnViewerByKey(mapKey));
			((JavascriptExecutor) getWebDriver()).executeScript("arguments[0].setAttribute('style', 'border: 4px solid black;');", getWebDriver().findElement(CustomizedLocators.getPalliativeAssessmentLatestValueOnViewerByKey(mapKey)));
			String actualVal = getElementText(CustomizedLocators.getPalliativeAssessmentLatestValueOnViewerByKey(mapKey));
			System.out.println(mapKey+" actualVal: "+actualVal);
			waitIntervalByHalf(1);
			Assert.assertTrue(mapKey+": "+actualVal +" != "+expectedVal, actualVal.contains(expectedVal));
		}
	}
	
	
	/*** ESAS ***/
	
	public void selectAdministeredByOption(String option, String section) {
		clickElement(PalliativePageLocators.sel_AdministeredByFirstRadioButton);
		assessmentToolMap.put(section, option);
		System.out.println("assessmentToolMap: "+assessmentToolMap);
	}
	
	public void selectRadioValueAsPerESAS(String radioValue, String esasSection) {
		switch (esasSection) {
		case PixalereStringPool.PAIN:
			clickElement(CustomizedLocators.getPainESASByRadioOption(radioValue));
			assessmentToolMap.put(esasSection, radioValue);
			break;
			
		case PixalereStringPool.TIREDNESS:
			clickElement(CustomizedLocators.getTirednessESASByRadioOption(radioValue));
//			assessmentToolMap.put(esasSection, radioValue);
			break;
			
		case PixalereStringPool.NAUSEA:
			clickElement(CustomizedLocators.getNauseaESASByRadioOption(radioValue));
			break;
			
		case PixalereStringPool.DEPRESSION:
			clickElement(CustomizedLocators.getDepressionESASByRadioOption(radioValue));
			break;
			
		case PixalereStringPool.ANXIETY:
			clickElement(CustomizedLocators.getAnxietyESASByRadioOption(radioValue));
			break;
			
		case PixalereStringPool.DROWSINESS:
			clickElement(CustomizedLocators.getDrowsinessESASByRadioOption(radioValue));
			break;
			
		case PixalereStringPool.LACK_OF_APPETITE:
			clickElement(CustomizedLocators.getLackOfAppetiteESASByRadioOption(radioValue));
			break;
			
		case PixalereStringPool.FEELING_OF_WELL_BEING:
			clickElement(CustomizedLocators.getFeelingOfWellBeingESASByRadioOption(radioValue));
			assessmentToolMap.put(esasSection, radioValue);
			break;
			
		case PixalereStringPool.SHORTNESS_BREATH:
			clickElement(CustomizedLocators.getShortnessBreathESASByRadioOption(radioValue));
			assessmentToolMap.put(esasSection, radioValue);
			break;
			
		case PixalereStringPool.OTHER_TEST:
			clickElement(CustomizedLocators.getOtherESASByRadioOption(radioValue));
			assessmentToolMap.put(esasSection, radioValue);
			break;
		}
		System.out.println("assessmentToolMap: "+assessmentToolMap);
		waitInterval(1);
	}
	
	public void addOtherInput(String otherInput) {
		sendKeys(PalliativePageLocators.txt_OtherInput, otherInput);
	}
}
