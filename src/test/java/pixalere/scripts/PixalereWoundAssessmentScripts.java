package pixalere.scripts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import pixalere.pageObjectJavaUtils.JavaUtils;
import pixalere.pageObjectUtils.LocatorUtils.AssessmentPageLocators;
import pixalere.pageObjectUtils.LocatorUtils.CustomizedLocators;
import pixalere.pageObjectUtils.LocatorUtils.NPWTPageLocators;
import pixalere.pageObjectUtils.LocatorUtils.PatientProfilePageLocators;
import pixalere.pageObjectUtils.LocatorUtils.TreatmentPageLocators;
import pixalere.pageObjectUtils.PixalereCommonUtils;
import pixalere.pageObjectUtils.PixalereStringPool;

public class PixalereWoundAssessmentScripts extends PixalereCommonUtils {
	
	private String addPainScaleValue;
	private String underminingAreaVal;
	private String locationStartVal;
	private String locationEndVal;
	private String sinusTractsVal;
	private String numberOfFistulasVal;
	private String length;
	private String width;
	private String depth;
	
	private Map<String, String> woundAssessmentMap = new HashMap<String, String>();
	

	public void enterInputAsPerKeyOnWoundProfilePage(String field) {
		if(isNewUser) {
			String inputVal = JavaUtils.getRandomString(10)+JavaUtils.getRandomNumber(5);
			System.out.println(field+": "+inputVal);
			
			switch (field) {
			case PixalereStringPool.CAUSE_HISTORY:
				sendKeys(AssessmentPageLocators.txt_WoundProfileCauseHistoryInput, inputVal);
				break;
				
			case PixalereStringPool.SURGICAL_PROCEDURE:
				sendKeys(AssessmentPageLocators.txt_WoundProfileSurgicalProcedureInput, inputVal);
				break;
				
			case PixalereStringPool.SURGEON:
				sendKeys(AssessmentPageLocators.txt_WoundProfileSurgeonInput, inputVal);
				break;
			}
		}
	}
	
	public void selectOstomyField(String option, String section) {
		if(isNewUser) {
			if(section.contains(PixalereStringPool.OSTOMY_TEACHING_GOALS))
				clickElement(AssessmentPageLocators.ele_TeachingGoalsLocator);
			clickDivButtonWithText(option);
		}
	}
	
	public void verifyLastUpdateTimeOnWoundProfilePage() {
		waitForCompletePageLoad();
		waitUntilElementIsDisplayed(AssessmentPageLocators.ele_LastUpdateDateLabel);
		highLightElement(AssessmentPageLocators.ele_LastUpdateDateLabel);
		String actualTime = getElementText(AssessmentPageLocators.ele_LastUpdateDateLabel).trim();
		Assert.assertTrue(actualTime+": notContains :"+PixalereCreateNewPatientAccountScripts.visitTime, actualTime.contains(PixalereCreateNewPatientAccountScripts.visitTime));
		waitInterval(1);
	}
	
	public void clickOnAbdomenCanvas() {
		if(isNewUser)
			clickElement(AssessmentPageLocators.ele_AbdomenCanvasLocator);
	}
	
	public void clickOnAbdomenImage() {
		if(isNewUser)
			clickElement(AssessmentPageLocators.img_AbdomenImageLocator);
	}
	
	public void clickOnBluemanImage() {
		int xPoint = Integer.parseInt(JavaUtils.getRandomNumber(2));
		int yPoint = Integer.parseInt(JavaUtils.getRandomNumber(2));
		
		waitInterval(2);
		new Actions(getWebDriver())
				.moveToElement(getWebDriver().findElement(AssessmentPageLocators.img_BluemenImageLocator), xPoint, yPoint)
				.click().build().perform();
		waitInterval(2);
	}
	
	public void getVisitDateTimeOnConfirmPopup() {
		waitForCompletePageLoad();
		String day = getDropdownSelectedOption(PatientProfilePageLocators.drp_ConfirmPopDayDropdown);
		String month = getDropdownSelectedOption(PatientProfilePageLocators.drp_ConfirmPopMonthDropdown);
		String year = getAttribute(PatientProfilePageLocators.txt_ConfirmPopYearInput, "value");
		PixalereCreateNewPatientAccountScripts.visitTime = JavaUtils.getDateInFormat(day+"/"+month+"/"+year, "d/MMM/yyyy", "d/MMM/yyyy");
		System.out.println("visitTime: "+PixalereCreateNewPatientAccountScripts.visitTime);
		waitInterval(1);
	}
	
	public void verifyAlphaLatterOnBluemanImage() {
		waitUntilElementIsDisplayed(AssessmentPageLocators.img_BluemenImageAlphaLatterLocator);
		highLightElement(AssessmentPageLocators.img_BluemenImageAlphaLatterLocator);
		focusChar = getElementText(AssessmentPageLocators.img_BluemenImageAlphaLatterLocator).trim();
		System.out.println("focusChar: "+focusChar);
	}
	
	public void verifyNumericLatterOnBluemanImage() {
		isDermNumber=true;
		waitUntilElementIsDisplayed(AssessmentPageLocators.img_BluemenImageNumericLatterLocator);
		highLightElement(AssessmentPageLocators.img_BluemenImageNumericLatterLocator);
		String val = getAttribute(AssessmentPageLocators.img_BluemenImageNumericLatterLocator, "src");
		focusChar = val.split("Alphas/s")[1].split("_red")[0];
		System.out.println("focusChar: "+focusChar);
	}
	
	public void verifyOstomyImageOnBluemanImage() {
		isOstomyImage=true;
		waitUntilElementIsDisplayed(AssessmentPageLocators.img_BluemenImageOstomyImageLocator);
		highLightElement(AssessmentPageLocators.img_BluemenImageOstomyImageLocator);
		String val = getAttribute(AssessmentPageLocators.img_BluemenImageOstomyImageLocator, "src");
		focusChar = val.split("Alphas/ost")[1].split("_red")[0];
		System.out.println("focusChar: "+focusChar);
	}
	
	public void selectLatestAlphaCharFromAssessment() {
		clickElement(CustomizedLocators.getAlphaCharAssessmentByValue(focusChar));
	}
	
	public void selectLatestNumericCharFromAssessment() {
		clickElement(CustomizedLocators.getNumericCharAssessmentByValue(focusChar));
	}
	
	public void selectLatestOstomyImageCharFromAssessment() {
		clickElement(CustomizedLocators.getOstomyImageCharAssessmentByValue(focusChar));
	}
	
	public void selectAssessmentRadioOptionAsPerKey(String option, String section) {
		if(section.contains("Problem Identified"))
			section = "Etiology";
		
		if(!section.contains("Select a Product Category") && !section.contains(" - Wound A"))
			woundAssessmentMap.put(section, option);
		System.out.println("woundAssessmentMap: "+woundAssessmentMap);
		if(!section.contains(" - Wound A"))
			clickElement(CustomizedLocators.getAssessmentRadioOptionByValue(option));
		else
			clickElement(CustomizedLocators.getTreatmentRadioOptionByValue(option));
		waitIntervalByHalf(1);
	}
	
	public void selectProductCategoryForDerm(String option) {
		clickElement(CustomizedLocators.getProductCategoryByValue(option));
	}
	
	public void selectAssessmentRadioOptionAsPerKey2(String option, String section) {
		woundAssessmentMap.put(section, option);
		System.out.println("woundAssessmentMap: "+woundAssessmentMap);
		clickElement(CustomizedLocators.getAssessmentRadioDivOptionByValue(option));
	}
	
	public void clickOnAssessmentButtonAsPerKey(String button) {
		switch (button) {
		case PixalereStringPool.ADD_PAIN_SCALE:
			clickElement(AssessmentPageLocators.btn_AddPainScaleButton);
			break;
			
		case PixalereStringPool.LENGTH:
			clickElement(AssessmentPageLocators.btn_LengthButton);
			break;
			
		case PixalereStringPool.WIDTH:
			clickElement(AssessmentPageLocators.btn_WidthButton);
			break;
			
		case PixalereStringPool.DEPTH:
			clickElement(AssessmentPageLocators.btn_DepthButton);
			break;
			
		case PixalereStringPool.UNDERMINING_AREA:
			clickElement(AssessmentPageLocators.btn_UnderminingAreaButton);
			break;
			
		case PixalereStringPool.SINUS_TRACTS_AREA:
			clickElement(AssessmentPageLocators.btn_SinusTractsAreaButton);
			break;
			
		case PixalereStringPool.NUMBER_OF_FISTULAS:
			clickElement(AssessmentPageLocators.btn_NumberOfFistulasButton);
			break;
		}
	}
	
	public void selectValueFromPopup(String popupText) {
		
		switch (popupText) {
		
		case PixalereStringPool.PAIN_SCALE:
			addPainScaleValue=JavaUtils.getRandomNumber(1);
			System.out.println("addPainScaleValue: "+addPainScaleValue);
			clickElement(CustomizedLocators.getNumberElementFromPopupAsPerKey(PixalereStringPool.PAIN_SCALE, addPainScaleValue));
			woundAssessmentMap.put(PixalereStringPool.PAIN_SCALE.replace("-", " "), addPainScaleValue);
			System.out.println("woundAssessmentMap: "+woundAssessmentMap);
			break;
			
		case PixalereStringPool.NUMBER_OF_FISTULAS:
			numberOfFistulasVal="1";
			System.out.println("numberOfFistulasVal: "+numberOfFistulasVal);
			clickElement(CustomizedLocators.getNumberElementFromPopupAsPerKey(PixalereStringPool.NUMBER_OF_FISTULAS, numberOfFistulasVal));
			break;
		}
	}
	
	public void verifySelectedPainValue(String field) {
		String actualVal=null;
		
		switch (field) {
		case PixalereStringPool.PAIN_SCALE:
			waitUntilElementContainsText(AssessmentPageLocators.btn_AddPainScaleButton, addPainScaleValue);
			highLightElement(AssessmentPageLocators.btn_AddPainScaleButton);
			actualVal = getElementText(AssessmentPageLocators.btn_AddPainScaleButton).trim();
			System.out.println("actualVal: "+actualVal);
			Assert.assertTrue(actualVal +": != :"+addPainScaleValue, actualVal.contains(addPainScaleValue));
			break;

		case PixalereStringPool.NUMBER_OF_FISTULAS:
			waitUntilElementContainsText(AssessmentPageLocators.ele_NumberOfFistulasElement, numberOfFistulasVal);
			highLightElement(AssessmentPageLocators.ele_NumberOfFistulasElement);
			actualVal = getElementText(AssessmentPageLocators.ele_NumberOfFistulasElement).trim();
			System.out.println("actualVal: "+actualVal);
			Assert.assertTrue(actualVal +": != :"+numberOfFistulasVal, actualVal.contains(numberOfFistulasVal));
			break;
		}
	}
	
	public void enterTextboxInputField(String section) {
		By inputLocator = section.contains("Pain Comments") ? AssessmentPageLocators.txt_PainCommentsTextareaInput : AssessmentPageLocators.txt_WoundPartsTextareaInput;
		String inputString = JavaUtils.getRandomString(10)+JavaUtils.getRandomNumber(5);
		System.out.println("inputString: "+inputString);
		
		clear(inputLocator);
		sendKeys(inputLocator, inputString);
		
		woundAssessmentMap.put(section, inputString);
		System.out.println("woundAssessmentMap: "+woundAssessmentMap);
	}
	
	public void fillDermAssessmentTextarea(String section) {
		String inputString = JavaUtils.getRandomString(10);
		
		switch (section) {
		case PixalereStringPool.OTHER_SYMPTOMS:
			sendKeys(AssessmentPageLocators.txt_OtherSymptomsTextareaInput, inputString);
			break;
			
		case PixalereStringPool.NURSE_DIAGNOSIS:
			sendKeys(AssessmentPageLocators.txt_NurseDiagnosisTextareaInput, inputString);
			break;
			
		case PixalereStringPool.BIOPSY_YES:
			sendKeys(AssessmentPageLocators.txt_biopsyYesTextareaInput, inputString);
			break;
			
		case PixalereStringPool.TREATMENTS_TRIED:
			sendKeys(AssessmentPageLocators.txt_TreatmentsTriedTextareaInput, inputString);
			woundAssessmentMap.put(PixalereStringPool.TREATMENTS_TRIED, inputString);
			break;
			
		case PixalereStringPool.RECOMMENDATIONS:
			sendKeys(AssessmentPageLocators.txt_RecommendationsTextareaInput, inputString);
			woundAssessmentMap.put(PixalereStringPool.RECOMMENDATIONS, inputString);
			break;
			
		case PixalereStringPool.FOLLOW_UP:
			sendKeys(AssessmentPageLocators.txt_FollowUpTextareaInput, inputString);
			woundAssessmentMap.put(PixalereStringPool.FOLLOW_UP, inputString);
			break;
			
		case PixalereStringPool.SITE:
			sendKeys(AssessmentPageLocators.txt_SiteTextareaInput, inputString);
			woundAssessmentMap.put(PixalereStringPool.SITE, inputString);
			break;
			
		case PixalereStringPool.RESPONSE:
			sendKeys(AssessmentPageLocators.txt_ResponseTextareaInput, inputString);
			woundAssessmentMap.put(PixalereStringPool.RESPONSE, inputString);
			break;
			
		case PixalereStringPool.SELF_CARE_PROGRESS_COMMENTS:
			sendKeys(AssessmentPageLocators.txt_SelfCareProgressCommentsTextareaInput, inputString);
			break;
		}
		System.out.println("woundAssessmentMap: "+woundAssessmentMap);
	}
	
	public void enterNumericValueAsPerPopup(String numericVal, String popupText) {
		clickElementOnCenter(getWebDriver().findElement(CustomizedLocators.getPopupInputButtonByNumericValue(numericVal, popupText)));
		
		switch (popupText) {
		case PixalereStringPool.UNDERMINING_AREA:
			underminingAreaVal=numericVal;
			System.out.println("underminingAreaVal: "+underminingAreaVal);
			woundAssessmentMap.put(PixalereStringPool.UNDERMINING_DEPTH, underminingAreaVal);
			break;
			
		case PixalereStringPool.SINUS_TRACTS:
			sinusTractsVal=numericVal;
			System.out.println("sinusTractsVal: "+sinusTractsVal);
			woundAssessmentMap.put(PixalereStringPool.SINUS_TRACTS_DEPTH, sinusTractsVal);
			break;
		}
		System.out.println("woundAssessmentMap: "+woundAssessmentMap);
	}
	
	public void clickOnNextButtonFromPopup() {
		clickElement(AssessmentPageLocators.btn_AssessmentTabNumericPopupNextButton);
	}
	
	public void verifyDisplayedAreaBlock(String blockTitle) {
		waitUntilElementIsDisplayed(CustomizedLocators.getDisplayedAreaBlockOnPopup(blockTitle));
		highLightElement(CustomizedLocators.getDisplayedAreaBlockOnPopup(blockTitle));
		String actualBlockText = getElementText(CustomizedLocators.getDisplayedAreaBlockOnPopup(blockTitle)).trim();
		Assert.assertTrue(actualBlockText+" != "+blockTitle, actualBlockText.contains(blockTitle));
	}
	
	public void selectRadioOptionAsPerLocation(String locationList, String section) {
		String val = JavaUtils.getRandomNumber(1);
		for (String location : locationList.split(",")) {
			if(location.trim().contains(PixalereStringPool.LOCATION_START)) {
				locationStartVal=val;
				System.out.println("locationStartVal: "+locationStartVal);
				clickElement(CustomizedLocators.getLocationStartLocatorByValue(locationStartVal));
			}
			else {
				locationEndVal=val;
				System.out.println("locationEndVal: "+locationEndVal);
				clickElement(CustomizedLocators.getLocationEndLocatorByValue(locationEndVal));
			}
		}
		woundAssessmentMap.put(section, val);
		System.out.println("woundAssessmentMap: "+woundAssessmentMap);
	}
	
	public void verifySectionValuesAsPerKey(String section) {
		String actualVal=null;
		
		switch (section) {
		case PixalereStringPool.UNDERMINING_DEPTH:
			waitUntilElementContainsText(AssessmentPageLocators.btn_UnderminingAreaButton, underminingAreaVal);
			highLightElement(AssessmentPageLocators.btn_UnderminingAreaButton);
			actualVal = getElementText(AssessmentPageLocators.btn_UnderminingAreaButton).trim();
			Assert.assertTrue(actualVal +": != :"+underminingAreaVal, actualVal.contains(underminingAreaVal));
			
			Assert.assertTrue("Location Start field is failed to displayed...", isDisplayed(AssessmentPageLocators.btn_LocationStartButton));
			highLightElement(AssessmentPageLocators.btn_LocationStartButton);
			actualVal = getElementText(AssessmentPageLocators.btn_LocationStartButton).trim();
			Assert.assertTrue(actualVal +": != :"+locationStartVal, actualVal.contains(locationStartVal));
			
			Assert.assertTrue("Location End field is failed to displayed...", isDisplayed(AssessmentPageLocators.btn_LocationEndButton));
			highLightElement(AssessmentPageLocators.btn_LocationEndButton);
			actualVal = getElementText(AssessmentPageLocators.btn_LocationEndButton).trim();
			Assert.assertTrue(actualVal +": != :"+locationEndVal, actualVal.contains(locationEndVal));
			break;
			
		case PixalereStringPool.SINUS_TRACTS:
			waitUntilElementContainsText(AssessmentPageLocators.btn_SinusTractsAreaButton, sinusTractsVal);
			highLightElement(AssessmentPageLocators.btn_SinusTractsAreaButton);
			actualVal = getElementText(AssessmentPageLocators.btn_SinusTractsAreaButton).trim();
			Assert.assertTrue(actualVal +": != :"+sinusTractsVal, actualVal.contains(sinusTractsVal));
			
			Assert.assertTrue("Sinus Location Start field is failed to displayed...", isDisplayed(AssessmentPageLocators.btn_SinusLocationStartButton));
			highLightElement(AssessmentPageLocators.btn_SinusLocationStartButton);
			actualVal = getElementText(AssessmentPageLocators.btn_SinusLocationStartButton).trim();
			Assert.assertTrue(actualVal +": != :"+locationStartVal, actualVal.contains(locationStartVal));
			break;
		}
	}
	
	public void verifyFistulaTextareaAndEdit() {
		waitUntilElementIsDisplayed(AssessmentPageLocators.txt_Fistula1textareaInput);
		highLightElement(AssessmentPageLocators.txt_Fistula1textareaInput);
		Assert.assertTrue("Fistula1 Textarea failed to Displayed..", isDisplayed(AssessmentPageLocators.txt_Fistula1textareaInput));
		
		String val = JavaUtils.getRandomString(10)+JavaUtils.getRandomNumber(5);
		sendKeys(AssessmentPageLocators.txt_Fistula1textareaInput, val);
		
		woundAssessmentMap.put(PixalereStringPool.FISTULA, val);
		System.out.println("woundAssessmentMap: "+woundAssessmentMap);
	}
	
	public void selectOptionFromSection(String option, String section) {
		if(!option.contains("Nil")) {
			if(section.contains("Select a Product(s)"))
				woundAssessmentMap.put("Products"+JavaUtils.getRandomNumber(1), option);
			else {
				if(!section.contains(PixalereStringPool.EXUDATE_CHARACTERISTICS))
					woundAssessmentMap.put(section, option);
			}
		}
		System.out.println("woundAssessmentMap: "+woundAssessmentMap);
		
		switch (section) {
		
		case PixalereStringPool.EXUDATE_CHARACTERISTICS:
			clickElement(CustomizedLocators.getExudateCharacteristicsElementByValue(option));
			waitIntervalByHalf(1);
			break;
			
		case PixalereStringPool.ODOUR:
			clickElement(CustomizedLocators.getOdourElementByValue(option));
			break;
			
		case PixalereStringPool.WOUND_EDGE:
			clickElement(CustomizedLocators.getWoundEdgeElementByValue(option));
			break;
			
		case PixalereStringPool.PERI_WOUND_SKIN:
			clickElement(CustomizedLocators.getPeriWoundSkinElementByValue(option));
			break;
			
		case PixalereStringPool.SELECT_PRODUCT:
			clickElement(CustomizedLocators.getSelectProductElementByValue(option));
			break;
			
		case PixalereStringPool.CURRENT_SYMPTOMS:
			clickElement(CustomizedLocators.getSymptomsElementByValue(option));
			break;
			
		case PixalereStringPool.REVIEW_OF_SYSTEMS:
			clickElement(CustomizedLocators.getSymptomsElementByValue(option));
			break;
			
		case PixalereStringPool.PROFILE:
			clickElement(CustomizedLocators.getProfileElementByValue(option));
			break;
			
		case PixalereStringPool.APPEARANCE:
			clickElement(CustomizedLocators.getAppearanceElementByValue(option));
			break;
			
		case PixalereStringPool.ABDOMINAL_CONTOUR:
			clickElement(CustomizedLocators.getAbdominalContourElementByValue(option));
			break;
			
		case PixalereStringPool.CONCERNS_FOR_POUCHING:
			clickElement(CustomizedLocators.getConcernsForPouchingElementByValue(option));
			break;
			
		case PixalereStringPool.MUCOCUTANEOUS_MARGIN:
			clickElement(CustomizedLocators.getMucocutaneousMarginElementByValue(option));
			break;
			
		case PixalereStringPool.PERI_OSTOMY_SKIN:
			clickElement(CustomizedLocators.getPeriOstomySkinElementByValue(option));
			break;
			
		case PixalereStringPool.FISTULA_DRAINAGE:
			clickElement(CustomizedLocators.getFistulaDrainageElementByValue(option));
			break;
			
		case PixalereStringPool.PERI_FISTULA_SKIN:
			clickElement(CustomizedLocators.getPeriFistulaSkinElementByValue(option));
			break;
			
		case PixalereStringPool.URINE_COLOUR:
			clickElement(CustomizedLocators.getUrineColourElementByValue(option));
			break;
			
		case PixalereStringPool.URINE_TYPE:
			clickElement(CustomizedLocators.getUrineTypeElementByValue(option));
			break;
			
		case PixalereStringPool.SELF_CARE_PROGRESS:
			clickElement(CustomizedLocators.getSelfCareProgressElementByValue(option));
			break;
			
		case PixalereStringPool.STOOL_COLOUR:
			clickElement(CustomizedLocators.getStoolColourElementByValue(option));
			break;
			
		case PixalereStringPool.STOOL_CONSISTANCY:
			clickElement(CustomizedLocators.getStoolConsistancyElementByValue(option));
			break;
		}
		waitInterval(1);
	}
	
	public void editQuantityField(String inputText) {
		sendKeys(TreatmentPageLocators.txt_QuantityInput, inputText);
	}
	
	public void clickOnEachHyperLink(String section) {
		if(!isNewUser) {
			clickElement(TreatmentPageLocators.ele_AlphaCharProductTitle2);
			if(!section.contains("Fecal Stoma")) {
				if(!isDermNumber)
					clickElement(TreatmentPageLocators.ele_AlphaCharProductLocator);
				else
					clickElement(TreatmentPageLocators.ele_NumericCharProductLocator);
			}
		}
		clickElement(TreatmentPageLocators.lnk_EachHyperLink);
	}
	
	public void verifyTreatmentElementsByAlphaSection(String value1, String value2, String quantity) {
		waitUntilElementIsDisplayed(CustomizedLocators.getWoundAAssessmentElementByValue(value1));
		highLightElement(CustomizedLocators.getWoundAAssessmentElementByValue(value1));
		Assert.assertTrue(value1+" is not displayed...", isDisplayed(CustomizedLocators.getWoundAAssessmentElementByValue(value1)));
		
		waitUntilElementIsDisplayed(CustomizedLocators.getWoundAAssessmentElementByValue(value2));
		highLightElement(CustomizedLocators.getWoundAAssessmentElementByValue(value2));
		Assert.assertTrue(value2+" is not displayed...", isDisplayed(CustomizedLocators.getWoundAAssessmentElementByValue(value2)));
	
		Assert.assertTrue(getListSize(CustomizedLocators.getICNumberSizeByValue(quantity)) +": != :"+2, getListSize(CustomizedLocators.getICNumberSizeByValue(quantity)) == 2);
	}
	
	public void enterProgressNoteTextareaInput() {
		sendKeys(TreatmentPageLocators.txt_ProgressNoteTextareaInput, JavaUtils.getRandomString(20)+JavaUtils.getRandomString(10));
	}
	
	public void selectCaretypeValue() {
		waitUntilElementIsDisplayed(NPWTPageLocators.css_CaretypeButtonList);
		for (WebElement Caretype : getWebDriver().findElements(NPWTPageLocators.css_CaretypeButtonList))
			clickElement(Caretype);
	}
	
	public void selectOptionAsPerField(String fieldAndOption) {
		String field = fieldAndOption.split("->")[0].trim();
		String option = fieldAndOption.split("->")[1].trim();
		System.out.println(field+": "+option);
		
		waitUntilElementIsDisplayed(CustomizedLocators.getNPWTPageRadioButtonByValue(option));
		for (WebElement radioVal : getWebDriver().findElements(CustomizedLocators.getNPWTPageRadioButtonByValue(option))) {
			clickElement(radioVal);
		}
		waitInterval(1);
	}
	
	public void editNPWTInputFieldAsPerKey(String field) {
		String inputVal = JavaUtils.getRandomString(10)+JavaUtils.getRandomNumber(5);
		System.out.println("inputVal: "+inputVal);
		
		switch (field) {
		case PixalereStringPool.NPWT_MACHINE_SERIAL:
			for (WebElement NPWT : getWebDriver().findElements(NPWTPageLocators.css_NPWTMachineSerialInputList))
				sendKeys(NPWT, inputVal);
			break;
			
		case PixalereStringPool.NPWT_VENDOR_CONFIRMATION:
			for (WebElement NPWT : getWebDriver().findElements(NPWTPageLocators.css_NPWTVendorConfirmationInputList))
				sendKeys(NPWT, inputVal);
			break;
		}
		waitInterval(1);
	}
	
	public void selectNPWTDatePickerCalenderAsPerKey(String field) {
		
		switch (field) {
		case PixalereStringPool.NPWT_START_DATE:
			for (WebElement dateElement : getWebDriver().findElements(NPWTPageLocators.css_NPWTStartDateList)) {
				clickElementWithJQuery(dateElement);
				clickElement(PatientProfilePageLocators.lnk_AlbuminAndPrealbuminTestsCalendarCurrentDate);
			}
			break;
			
		case PixalereStringPool.NPWT_END_DATE:
			for (WebElement dateElement : getWebDriver().findElements(NPWTPageLocators.css_NPWTEndDateList)) {
				clickElementWithJQuery(dateElement);
				clickElement(PatientProfilePageLocators.lnk_AlbuminAndPrealbuminTestsCalendarCurrentDate);
			}
			break;
		}
		waitInterval(1);
	}
	
	public void verifySelectedDateAsPerFieldOption(String fieldOption) {
		String actualDate=null;
		String expectedDate = JavaUtils.getCurrentDate("dd-MMM-yyyy");
		System.out.println("expectedDate: "+expectedDate);
		
		switch (fieldOption) {
		case PixalereStringPool.NPWT_START_DATE:
			highLightElement(NPWTPageLocators.css_NPWTStartDateList);
			actualDate = getElementText(NPWTPageLocators.css_NPWTStartDateList).trim();
			System.out.println(PixalereStringPool.NPWT_START_DATE+": "+actualDate);
			break;
			
		case PixalereStringPool.NPWT_END_DATE:
			highLightElement(NPWTPageLocators.css_NPWTEndDateList);
			actualDate = getElementText(NPWTPageLocators.css_NPWTEndDateList).trim();
			System.out.println(PixalereStringPool.NPWT_END_DATE+": "+actualDate);
			break;
		}
		if(actualDate.contains("Sept"))
			actualDate = actualDate.replace("Sept", "Sep");
		Assert.assertTrue(actualDate+": !=: "+expectedDate, actualDate.contains(expectedDate));
	}
	
	public void editWoundBedSection(String woundBedOptionList, String section, String optionValueList, String optionBlock) {
		
		String val = woundBedOptionList.split(",")[0].trim() + ": " + optionValueList.split(",")[0].trim() + "%, "
				+ woundBedOptionList.split(",")[1].trim() + ": " + optionValueList.split(",")[1].trim() + "%, "
				+ woundBedOptionList.split(",")[2].trim() + ": " + optionValueList.split(",")[2].trim() + "%";
		woundAssessmentMap.put(section, val);
		System.out.println("woundAssessmentMap: "+woundAssessmentMap);
		
		int index=0;
		for (String woundBed : woundBedOptionList.split(",")) {
			clickElement(CustomizedLocators.getWoundBedElementByValue(woundBed.trim()));
			verifyDisplayedAreaBlock(optionBlock);
			clickElement(CustomizedLocators.getWoundBedPercentElementByValue(optionValueList.split(",")[index].trim()));
			index++;
			waitInterval(1);
		}
	}
	
	public void verifyIsEnabledExudateCharacteristicsList(String exudateCharacteristicsOptionList, String isEnabled) {
		
		for (String option : exudateCharacteristicsOptionList.split(",")) {
			Assert.assertTrue(option+": != :"+isEnabled, isEnabled.contains("disabled")
					? isDisplayed(CustomizedLocators.getExudateCharacteristicsElementDisabledValue(option.trim()))
					: !isDisplayed(CustomizedLocators.getExudateCharacteristicsElementDisabledValue(option.trim())));
			
			if(isEnabled.contains("disabled"))
				highLightElement(CustomizedLocators.getExudateCharacteristicsElementDisabledValue(option.trim()));
		}
	}
	
	public void enterNumericValueOnPopup(String popup) {
		String val = JavaUtils.getRandomNumber(1);
		System.out.println("Fill Value: "+val);
		clear(PatientProfilePageLocators.txt_AlbuminAndPrealbuminTestsPopupInput);
		sendKeys(PatientProfilePageLocators.txt_AlbuminAndPrealbuminTestsPopupInput, val);
		
		woundAssessmentMap.put(popup, val);
		System.out.println("woundAssessmentMap: "+woundAssessmentMap);
		
		switch (popup) {
		
		case PixalereStringPool.LENGTH:
			length=val;
			System.out.println(PixalereStringPool.LENGTH+": "+length);
			break;
			
		case PixalereStringPool.WIDTH:
			width=val;
			System.out.println(PixalereStringPool.WIDTH+": "+width);
			break;
			
		case PixalereStringPool.DEPTH:
			depth=val;
			System.out.println(PixalereStringPool.DEPTH+": "+depth);
			break;
		
		}
	}
	
	public void verifyNumericValueAsPerFieldOption(String fieldOption) {
		String actualVal = getElementText(CustomizedLocators.getAlbuminAndPrealbuminTestsSelectedNumericValue(fieldOption)).trim();
		highLightElement(CustomizedLocators.getAlbuminAndPrealbuminTestsSelectedNumericValue(fieldOption));
		System.out.println("SelectedActualVal: "+actualVal);
		
		switch (fieldOption) {
		
		case PixalereStringPool.LENGTH:
			Assert.assertTrue(actualVal +": != :"+length, actualVal.contains(length));
			break;
			
		case PixalereStringPool.WIDTH:
			Assert.assertTrue(actualVal +": != :"+width, actualVal.contains(width));
			break;
			
		case PixalereStringPool.DEPTH:
			Assert.assertTrue(actualVal +": != :"+depth, actualVal.contains(depth));
			break;
		}
	}
	
	public void verifyWoundAssessmentDetailsOnViewer() {
		waitForCompletePageLoad();
		clickElement(CustomizedLocators.getViewerAssessmentByAlphaChar());
		
		for (String mapKey : woundAssessmentMap.keySet()) {
			String expectedVal = woundAssessmentMap.get(mapKey);
			System.out.println(mapKey+" expectedVal: "+expectedVal);
			
			if(mapKey.contains("Products"))
				mapKey="Products";
			
			scrollAndhighLightElement(CustomizedLocators.getWoundAssessmentValueLocatorOnViewerByKey(mapKey));
			((JavascriptExecutor) getWebDriver()).executeScript("arguments[0].setAttribute('style', 'border: 4px solid black;');", getWebDriver().findElement(CustomizedLocators.getWoundAssessmentValueLocatorOnViewerByKey(mapKey)));
			String actualVal = getElementText(CustomizedLocators.getWoundAssessmentValueLocatorOnViewerByKey(mapKey));
			System.out.println(mapKey+" actualVal: "+actualVal);
			waitIntervalByHalf(1);
			Assert.assertTrue(mapKey+": "+actualVal +" != "+expectedVal, actualVal.contains(expectedVal));
		}
	}
	
	public void selectDiagnosisSection(String alphabet, String optionSelectionList) {
		clickElement(CustomizedLocators.getDiagnosisAlphabet(alphabet));
		waitUntilElementIsDisplayed(CustomizedLocators.getSelectedDiagnosisAlphabet(alphabet));
		
		List<String> optionList = new ArrayList<String>(Arrays.asList(optionSelectionList.split(",")));
		
		for (String option : optionList) {
			clickElement(CustomizedLocators.getAssessmentRadioOptionByValue(option.trim()));
			waitIntervalByHalf(1);
		}
		
		Assert.assertTrue(getListSize(AssessmentPageLocators.css_DiagnosisSelectedProductList) == optionList.size());
		for (WebElement value : getWebDriver().findElements(AssessmentPageLocators.css_DiagnosisSelectedProductList)) {
			highLightElement(value);
			Assert.assertTrue(optionList.contains(value.getText()));
		}
	}
	
	public void selectAssessmentTab(String assessmentTab) {
		clickElementWithJQuery(CustomizedLocators.getLinkWithTextElement(assessmentTab));
	}
	
	public void selectmmXDimensions() {
		clickElementWithJQuery(AssessmentPageLocators.ele_mmXDimensionsButton);
		clickElementWithJQuery(AssessmentPageLocators.ele_mmX0DimensionsOption);
	}
}
