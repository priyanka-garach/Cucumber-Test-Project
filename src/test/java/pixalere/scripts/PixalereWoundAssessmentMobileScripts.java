package pixalere.scripts;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;

import com.mashape.unirest.http.exceptions.UnirestException;

import dataProviders.ConfigFileReader;
import pixalere.pageObjectUtils.PixalereCommonUtils;
import pixalere.pageObjectUtils.PixalereStringPool;
import pixalere.pageObjectJavaUtils.JavaUtils;
import pixalere.pageObjectUtils.LocatorUtils.AssessmentPageLocators;
import pixalere.pageObjectUtils.LocatorUtils.ConsultsPageLocators;
import pixalere.pageObjectUtils.LocatorUtils.CustomizedLocators;
import pixalere.pageObjectUtils.LocatorUtils.PatientProfilePageLocators;
import pixalere.restAPI.PixalereRestApi;

public class PixalereWoundAssessmentMobileScripts extends PixalereCommonUtils {

	PixalereRestApi				apiScripts		= new PixalereRestApi();
	
	public void createPatientViaAPICall() throws UnirestException {
		apiScripts.getToken(ConfigFileReader.getProperties("physician.user.username"),
				ConfigFileReader.getProperties("physician.user.password"), ConfigFileReader.getProperties("sms.code"));
		apiScripts.getFacility();
		apiScripts.createNewPatient();
		apiScripts.addNewWound();
		apiScripts.addNewWoundAssessment();
	}
	
	public void verifyPatientOnConsultsFilter() {
		highLightElement(ConsultsPageLocators.ele_FirstPatientCell);
		String patientUI = getElementText(ConsultsPageLocators.ele_FirstPatientCell);
		System.out.println("actual patient Cell: "+patientUI);
		Assert.assertTrue(patientUI+" : not Contains :"+PixalereRestApi.lastName, patientUI.contains(PixalereRestApi.lastName));
	}
	
	public void clickOnConsultButton() {
		clickElement(ConsultsPageLocators.btn_FirstPatientConsultButton);
	}
	
	public void selectRadioOptionFromSection(String option) {
		clickElement(CustomizedLocators.getAssessmentRadioOptionByValue(option));
		waitInterval(1);
	}
	
	public void selectOptionFromSection(String option, String section) {
		switch (section) {
		
		case PixalereStringPool.CO_MORBIDITIES:
			clickElement(CustomizedLocators.getCoMorbiditiesElementByValue(option));
			break;
			
		case PixalereStringPool.FACTORS_THAT_AFFECT_WOUND_HEALING:
			clickElementWithJQuery(CustomizedLocators.getWoundHealingAffectedFactorElementByValue(option));
			break;
			
		case PixalereStringPool.WOUND_EDGE:
			clickElement(CustomizedLocators.getWoundEdgeElementByValue(option));
			break;
			
		case PixalereStringPool.PERI_WOUND_SKIN:
			clickElement(CustomizedLocators.getPeriWoundSkinElementByValue(option));
			break;
			
		case PixalereStringPool.PRIMARY_DIAGNOSIS:
			clickElement(CustomizedLocators.getPrimaryDiagnosisElementByValue(option));
			break;
			
		case PixalereStringPool.ICD10_CPT_CODES:
			for (String val : option.split(","))
				clickElement(CustomizedLocators.getCPTCodesElementByValue(val));
			break;
		}
		waitInterval(1);
	}
	
	public void enterTextAsPerSection(String section) {
		String inputVal = JavaUtils.getRandomString(10) + JavaUtils.getRandomNumber(5);
		System.out.println("inputVal: "+inputVal);
		
		switch(section) {
		
		case PixalereStringPool.PAST_MEDICAL_HISTORY:
			sendKeys(PatientProfilePageLocators.txt_PastMedicalHistoryInput, inputVal);
			break;
			
		case PixalereStringPool.PAST_MEDICAL_HISTORY_OTHER:
			sendKeys(PatientProfilePageLocators.txt_PastMedicalHistoryOtherInput, inputVal);
			break;
			
		case PixalereStringPool.ALLERGIES:
			sendKeys(PatientProfilePageLocators.txt_Allergies, inputVal);
			break;
			
		case PixalereStringPool.CURRENT_MEDICATIONS:
			sendKeys(PatientProfilePageLocators.txt_CurrentMedicationsInput, inputVal);
			break;
			
		case PixalereStringPool.OVERVIEW:
			sendKeys(ConsultsPageLocators.txt_OverviewTextareaInput, inputVal);
			break;
			
		case PixalereStringPool.WOUND_PARTS:
			sendKeys(ConsultsPageLocators.txt_WoundPartsTextareaInput, inputVal);
			break;
			
		case PixalereStringPool.RECOMMENDATIONS:
			sendKeys(AssessmentPageLocators.txt_RecommendationsTextareaInput, inputVal);
			break;
			
		case PixalereStringPool.FOLLOW_UP:
			sendKeys(AssessmentPageLocators.txt_FollowUpTextareaInput, inputVal);
			break;
			
		case PixalereStringPool.RESPONSE:
			sendKeys(AssessmentPageLocators.txt_ResponseTextareaInput, inputVal);
			break;
		}
	}
	
	public void performNumberOfFistulasSection() {
		clickElement(AssessmentPageLocators.btn_NumberOfFistulasButton);
		verifyModalPopup(PixalereStringPool.NUMBER_OF_fISTULAS);
		selectAndVerifyNumberOfFistulas("1");
		verifyFistulaTextareaAndEdit();
	}
	
	private void selectAndVerifyNumberOfFistulas(String value) {
		clickElement(CustomizedLocators.getNumberElementFromPopupAsPerKey(PixalereStringPool.NUMBER_OF_FISTULAS, value));
		
		waitUntilElementContainsText(AssessmentPageLocators.ele_NumberOfFistulasElement, value);
		highLightElement(AssessmentPageLocators.ele_NumberOfFistulasElement);
		String actualVal = getElementText(AssessmentPageLocators.ele_NumberOfFistulasElement).trim();
		System.out.println("actualVal: "+actualVal);
		Assert.assertTrue(actualVal +": != :"+value, actualVal.contains(value));
	}
	
	private void verifyFistulaTextareaAndEdit() {
		waitUntilElementIsDisplayed(AssessmentPageLocators.txt_Fistula1textareaInput);
		highLightElement(AssessmentPageLocators.txt_Fistula1textareaInput);
		Assert.assertTrue("Fistula1 Textarea failed to Displayed..", isDisplayed(AssessmentPageLocators.txt_Fistula1textareaInput));
		
		String val = JavaUtils.getRandomString(10)+JavaUtils.getRandomNumber(5);
		System.out.println("Fistula # 1: "+val);
		sendKeys(AssessmentPageLocators.txt_Fistula1textareaInput, val);
	}
	
	public void editWoundBedSection(String woundBedOptionList, String optionValueList, String optionBlock) {
		int index=0;
		for (String woundBed : woundBedOptionList.split(",")) {
			clickElement(CustomizedLocators.getWoundBedElementByValue(woundBed.trim()));
			new PixalereWoundAssessmentScripts().verifyDisplayedAreaBlock(optionBlock);
			clickElement(CustomizedLocators.getWoundBedPercentElementByValue(optionValueList.split(",")[index].trim()));
			index++;
			waitInterval(1);
		}
	}
	
	public void verifySelectedOptionListFromSection(String optionList) {
		waitUntilElementIsDisplayed(AssessmentPageLocators.css_DiagnosisSelectedProductList);
		int count = getListSize(AssessmentPageLocators.css_DiagnosisSelectedProductList);
		System.out.println("SelectedOption Count: "+count);
		
		highLightElement(AssessmentPageLocators.css_DiagnosisSelectedProductList);
		String actualVal = getElementText(getWebDriver().findElements(AssessmentPageLocators.css_DiagnosisSelectedProductList).get(count-1));
		System.out.println("actualVal: "+actualVal);
		
		for (String option : optionList.split(","))
			Assert.assertTrue(actualVal+" != "+option.trim(), actualVal.contains(option.trim()));
	}
	
	public void verifyWoundCareTreatmentOrderList(int expectedCount) {
		waitUntilElementIsDisplayed(ConsultsPageLocators.css_WoundCareTreatmentOrderList);
		highLightElement(ConsultsPageLocators.css_WoundCareTreatmentOrderList);
		int actualCount = getListSize(ConsultsPageLocators.css_WoundCareTreatmentOrderList);
		System.out.println("actualCount: "+actualCount);
		Assert.assertTrue(actualCount+" != "+expectedCount, actualCount == expectedCount);
	}
	
	public void enterValueInTimeSpentSection(String value) {
		sendKeys(ConsultsPageLocators.txt_TimeSpentInput, value);
	}
	
	public void verifyPatientAfterCallDetails(String expectedStatus) {
		verifyPatientOnConsultsFilter();
		verifyPatientStatus(expectedStatus);
		verifyDownloadPDFButton();
	}
	
	private void verifyPatientStatus(String expectedStatus) {
		waitUntilElementContainsText(ConsultsPageLocators.ele_FirstPatientStatusCell, expectedStatus);
		highLightElement(ConsultsPageLocators.ele_FirstPatientStatusCell);
		String expectedVal = getElementText(ConsultsPageLocators.ele_FirstPatientStatusCell).trim();
		System.out.println("expectedVal: "+expectedVal);
		Assert.assertTrue(expectedVal +" != "+expectedStatus, expectedVal.contains(expectedStatus));
	}
	
	private void verifyDownloadPDFButton() {
		highLightElement(ConsultsPageLocators.btn_FirstPatientDownloadPDFButton);
		Assert.assertTrue("Download PDF button is failed to Displayed...", isDisplayed(ConsultsPageLocators.btn_FirstPatientDownloadPDFButton));
	}
	
	public void downloadFileAndVerify() {
		clickElement(ConsultsPageLocators.btn_FirstPatientDownloadPDFButton);
		JavaUtils.waitUntilFileIsDownloaded("report_"+JavaUtils.getCurrentDate("yyyy-MM-dd"));
	}
	
	public void verifyWoundValueWithAPICalls(String section) {
		String actualVal=null;
		switch (section) {
		
		case PixalereStringPool.PAIN:
			scrollAndhighLightElement(ConsultsPageLocators.ele_PainElement);
			actualVal = getElementText(ConsultsPageLocators.ele_PainElement).trim();
			System.out.println("Pain Actual Val: "+actualVal);
			Assert.assertTrue(actualVal+" != "+PixalereRestApi.pain, Integer.parseInt(actualVal) == PixalereRestApi.pain);
			break;
			
		case PixalereStringPool.MEASUREMENTS:
			for (String measurement : Arrays.asList(PixalereStringPool.LENGTH, PixalereStringPool.WIDTH, PixalereStringPool.DEPTH)) {
				scrollAndhighLightElement(CustomizedLocators.getMeasurementElementByValue(measurement.trim()));
				actualVal = getElementText(CustomizedLocators.getMeasurementElementByValue(measurement.trim())).split("\\.")[0].trim();
				System.out.println("Measurement Val: "+actualVal);
				
				if(measurement.equalsIgnoreCase(PixalereStringPool.LENGTH))
					Assert.assertTrue(Integer.parseInt(actualVal)+" != "+PixalereRestApi.length, Integer.parseInt(actualVal) == PixalereRestApi.length);
				else if(measurement.equalsIgnoreCase(PixalereStringPool.WIDTH))
					Assert.assertTrue(Integer.parseInt(actualVal)+" != "+PixalereRestApi.width, Integer.parseInt(actualVal) == PixalereRestApi.width);
				else
					Assert.assertTrue(Integer.parseInt(actualVal)+" != "+PixalereRestApi.depth,Integer.parseInt(actualVal) == PixalereRestApi.depth);
			}
			break;
			
		case PixalereStringPool.UNDERMINING_DEPTH_CM:
			
			for (String measurement : Arrays.asList(PixalereStringPool.LOCATION_START, PixalereStringPool.LOCATION_END, PixalereStringPool.UNDERMINING_DEPTH)) {
				
				switch (measurement) {
				case PixalereStringPool.LOCATION_START:
					scrollAndhighLightElement(ConsultsPageLocators.ele_UnderminingLocationStartElement);
					actualVal = getElementText(ConsultsPageLocators.ele_UnderminingLocationStartElement).split("\\.")[0].trim();
					System.out.println(PixalereStringPool.LOCATION_START+" actualVal: "+actualVal);
					Assert.assertTrue(actualVal+" != "+PixalereRestApi.underminingStartingPosition.split(":")[0].trim(), actualVal.contains(PixalereRestApi.underminingStartingPosition.split(":")[0].trim()));
					break;
					
				case PixalereStringPool.LOCATION_END:
					scrollAndhighLightElement(ConsultsPageLocators.ele_UnderminingLocationEndElement);
					actualVal = getElementText(ConsultsPageLocators.ele_UnderminingLocationEndElement).split("\\.")[0].trim();
					System.out.println(PixalereStringPool.LOCATION_END+" actualVal: "+actualVal);
					Assert.assertTrue(actualVal+" != "+PixalereRestApi.underminingPosition.split(":")[0].trim(), actualVal.contains(PixalereRestApi.underminingPosition.split(":")[0].trim()));
					break;
					
				case PixalereStringPool.UNDERMINING_DEPTH:
					scrollAndhighLightElement(ConsultsPageLocators.ele_UnderminingLocationDepthElement);
					actualVal = getElementText(ConsultsPageLocators.ele_UnderminingLocationDepthElement).split("\\.")[0].trim();
					System.out.println(PixalereStringPool.UNDERMINING_DEPTH+" actualVal: "+actualVal);
					Assert.assertTrue(actualVal+" != "+PixalereRestApi.underminingMaximumDistance, Integer.parseInt(actualVal) == PixalereRestApi.underminingMaximumDistance);
					break;
				}
			}
			break;
			
		case PixalereStringPool.SINUS_TRACTS:
			
			for (String measurement : Arrays.asList(PixalereStringPool.LOCATION_START, PixalereStringPool.LOCATION_END)) {
				switch (measurement) {
				
				case PixalereStringPool.LOCATION_START:
					scrollAndhighLightElement(ConsultsPageLocators.ele_SinusLocationStartElement);
					actualVal = getElementText(ConsultsPageLocators.ele_SinusLocationStartElement).trim();
					System.out.println(PixalereStringPool.LOCATION_START+" actualVal: "+actualVal);
					Assert.assertTrue(actualVal+" != "+PixalereRestApi.tunnelingPosition.split(":")[0].trim(), actualVal.contains(PixalereRestApi.tunnelingPosition.split(":")[0].trim()));
					break;

				case PixalereStringPool.LOCATION_END:
					scrollAndhighLightElement(ConsultsPageLocators.ele_SinusLocationEndElement);
					actualVal = getElementText(ConsultsPageLocators.ele_SinusLocationEndElement).split("\\.")[0].trim();
					System.out.println(PixalereStringPool.LOCATION_END+" actualVal: "+actualVal);
					Assert.assertTrue(actualVal+" != "+PixalereRestApi.tunnelingMaximumDistance, Integer.parseInt(actualVal) == PixalereRestApi.tunnelingMaximumDistance);
					break;
				}
			}
			break;
			
		case PixalereStringPool.NURSE_DIAGNOSIS:
			scrollAndhighLightElement(AssessmentPageLocators.txt_NurseDiagnosisTextareaInput);
			actualVal = getElementText(AssessmentPageLocators.txt_NurseDiagnosisTextareaInput).trim();
			System.out.println(PixalereStringPool.NURSE_DIAGNOSIS+": "+actualVal);
			Assert.assertTrue(actualVal+" != "+PixalereRestApi.diagnosis, actualVal.contains(PixalereRestApi.diagnosis));
			break;
			
		case PixalereStringPool.BIOPSY_YES:
			scrollAndhighLightElement(AssessmentPageLocators.txt_biopsyYesTextareaInput);
			actualVal = getElementText(AssessmentPageLocators.txt_biopsyYesTextareaInput).trim();
			System.out.println(PixalereStringPool.BIOPSY_YES+": "+actualVal);
			Assert.assertTrue(actualVal+" != "+PixalereRestApi.biopsyExplanation, actualVal.contains(PixalereRestApi.biopsyExplanation));
			break;
			
		case PixalereStringPool.TREATMENTS_TRIED:
			scrollAndhighLightElement(AssessmentPageLocators.txt_TreatmentsTriedTextareaInput);
			actualVal = getElementText(AssessmentPageLocators.txt_TreatmentsTriedTextareaInput).trim();
			System.out.println(PixalereStringPool.TREATMENTS_TRIED+": "+actualVal);
			Assert.assertTrue(actualVal+" != "+PixalereRestApi.triedTreatments, actualVal.contains(PixalereRestApi.triedTreatments));
			break;
			
		case PixalereStringPool.SITE:
			scrollAndhighLightElement(AssessmentPageLocators.txt_SiteTextareaInput);
			actualVal = getElementText(AssessmentPageLocators.txt_SiteTextareaInput).trim();
			System.out.println(PixalereStringPool.SITE+": "+actualVal);
			Assert.assertTrue(actualVal+" != "+PixalereRestApi.questions, actualVal.contains(PixalereRestApi.questions));
			break;
		}
		waitIntervalByHalf(1);
	}
}
