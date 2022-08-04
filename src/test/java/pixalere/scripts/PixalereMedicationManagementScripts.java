package pixalere.scripts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import dataProviders.ConfigFileReader;
import pixalere.pageObjectJavaUtils.JavaUtils;
import pixalere.pageObjectUtils.LocatorUtils.CustomizedLocators;
import pixalere.pageObjectUtils.LocatorUtils.MedicationManagementPageLocators;
import pixalere.pageObjectUtils.LocatorUtils.PatientProfilePageLocators;
import pixalere.pageObjectUtils.PixalereCommonUtils;
import pixalere.pageObjectUtils.PixalereStringPool;

public class PixalereMedicationManagementScripts extends PixalereCommonUtils {
	
	private static Map<String, String> medicationRecordMap = new HashMap<String, String>();
	private List<String> solutionNameDropdownList = new ArrayList<String>();
	
	
	/*** eMar ***/
	
	public void verifyMedicationManagementSection(String section) {
		waitUntilElementIsDisplayed(CustomizedLocators.getMedicationManagementSectionByValue(section));
		highLightElement(CustomizedLocators.getMedicationManagementSectionByValue(section));
		waitInterval(1);
		Assert.assertTrue(section+": is failed to displayed..", isDisplayed(CustomizedLocators.getMedicationManagementSectionByValue(section)));
	}
	
	public void editMedicationInputField(String field, String...value) {
		String inputVal = null;
		if(value.length > 0)
			inputVal=value[0];
		else
			inputVal = JavaUtils.getRandomString(10)+JavaUtils.getRandomNumber(5);
		System.out.println("inputVal: "+inputVal);
		
		switch (field) {
		case PixalereStringPool.MEDICATION_NAME:
			clear(MedicationManagementPageLocators.txt_MedicationNameInput);
			sendKeys(MedicationManagementPageLocators.txt_MedicationNameInput, inputVal);
			break;
			
		case PixalereStringPool.DOSAGE:
			clear(MedicationManagementPageLocators.txt_DosageInput);
			sendKeys(MedicationManagementPageLocators.txt_DosageInput, inputVal);
			break;
			
		case PixalereStringPool.ROUTE:
			selectByVisibleText(MedicationManagementPageLocators.drp_RouteDropdown, inputVal);
			break;
			
		case PixalereStringPool.DOSE_FREQUENCY:
			selectByVisibleText(MedicationManagementPageLocators.drp_DoseFrequencyDropdown, inputVal);
			break;
			
		case PixalereStringPool.SPECIAL_INSTRUCTIONS:
			clear(MedicationManagementPageLocators.txt_SpecialInstructionsInput);
			sendKeys(MedicationManagementPageLocators.txt_SpecialInstructionsInput, inputVal);
			break;
			
		case PixalereStringPool.END_DATE:
			String day=null, month=null, year=null;
			day=getReturnDate("Days", "Next");
			month=getReturnDate("Month", "Next");
			year=getReturnDate("Year", "Next");
			
			selectByVisibleText(MedicationManagementPageLocators.drp_EndDateDaysCalendarDropdown, day);
			selectByVisibleText(MedicationManagementPageLocators.drp_EndDateMonthsCalendarDropdown, month);
			clear(MedicationManagementPageLocators.txt_EndDateYearsCalendarInput);
			sendKeys(MedicationManagementPageLocators.txt_EndDateYearsCalendarInput, year);
			inputVal = day+"/"+month+"/"+year;
			break;
			
		case PixalereStringPool.DATE_ORDERED:
			day=getReturnDate("Days", "Current");
			month=getReturnDate("Month", "Current");
			year=getReturnDate("Year", "Current");
			
			selectByVisibleText(MedicationManagementPageLocators.drp_DateOrderedDaysCalendarDropdown, day);
			selectByVisibleText(MedicationManagementPageLocators.drp_DateOrderedMonthsCalendarDropdown, month);
			clear(MedicationManagementPageLocators.txt_DateOrderedYearsCalendarInput);
			sendKeys(MedicationManagementPageLocators.txt_DateOrderedYearsCalendarInput, year);
			inputVal = day+"/"+month+"/"+year;
			break;
		}
		waitInterval(1);
		medicationRecordMap.put(field, inputVal);
		System.out.println("medicationRecordMap: "+medicationRecordMap);
	}
	
	public void selectMedicationCheckobx(String field) {
		if(field.contains(PixalereStringPool.AMBULATORY_PUMP))
			medicationRecordMap.put(field, "Yes");
		clickElement(CustomizedLocators.getMedicationCheckboxSectionByValue(field));
		System.out.println("medicationRecordMap: "+medicationRecordMap);
		waitInterval(1);
	}
	
	private String getReturnDate(String dateVal, String currentNext) {
		String date=null, day=null, month=null, year=null;
		
		if(currentNext.contains("Next")) {
			date = JavaUtils.getCurrentDate("d-MMM-yyyy");
			date = JavaUtils.addDaysInCustomDate(date, "d-MMM-yyyy", 1);
		}
		else
			date = JavaUtils.getCurrentDate("d-MMM-yyyy");
		System.out.println("Date: "+date);
		
		if(dateVal.contains("Days")) {
			day = date.split("-")[0].trim();
			System.out.println("day: "+day);
			return day;
		}
		else if(dateVal.contains("Month")) {
			month = date.split("-")[1].trim();
			System.out.println("month: "+month);
			return month;
		}
		else if(dateVal.contains("Year")) {
			year = date.split("-")[2].trim();
			System.out.println("year: "+year);
			return year;
		}
		else
			return date;
	}
	
	public void clickOnSaveMedicationButton() {
		clickElement(MedicationManagementPageLocators.btn_SaveMedicationButton);
	}
	
	public void clickOnLatestMedicationRecordButtonByValue(String value) {
		switch (value) {
		case "Edit":
			clickElement(MedicationManagementPageLocators.btn_CurrentMedicationsLatestEditButton);
			break;
			
		case "Given":
			clickElement(MedicationManagementPageLocators.btn_CurrentMedicationsLatestGivenButton);
			break;
			
		case "Hold":
			clickElement(MedicationManagementPageLocators.btn_CurrentMedicationsLatestHoldButton);
			break;
			
		case "Reactivate":
			clickElement(MedicationManagementPageLocators.btn_LatestHoldMedicationReactivateButton);
			break;
			
		case "Discontinue":
			clickElement(MedicationManagementPageLocators.btn_LatestHoldMedicationDiscontinueButton);
			break;
			
		case "Discontinue2":
			clickElement(MedicationManagementPageLocators.btn_CurrentMedicationLatestDiscontinueButton);
			break;
		}
	}
	
	public void verifySavedRecordInCurrentMedicationField() {
		waitForCompletePageLoad();
		boolean isScroll=false;
		for (String mapKey : medicationRecordMap.keySet()) {
			String expectedVal = medicationRecordMap.get(mapKey);
			System.out.println(mapKey+" expectedVal: "+expectedVal);
			
			if(!isScroll) {
				scrollAndhighLightElement(CustomizedLocators.getLatestCurrentMedicationRecordByValue(mapKey));
				isScroll=true;
			}
			highLightElement(CustomizedLocators.getLatestCurrentMedicationRecordByValue(mapKey));
			String actualVal = getElementText(CustomizedLocators.getLatestCurrentMedicationRecordByValue(mapKey));
			System.out.println(mapKey+" actualVal: "+actualVal);
			waitIntervalByHalf(1);
			
			if(!mapKey.contains("Date")) //Need to remove this line
				Assert.assertTrue(mapKey+": "+actualVal +" != "+expectedVal, actualVal.contains(expectedVal));
		}
		
		highLightElement(MedicationManagementPageLocators.lbl_LatestHighRiskMedicationLabel);
		Assert.assertTrue("Latest High Risk Medication Alert is not displayed...", isDisplayed(MedicationManagementPageLocators.lbl_LatestHighRiskMedicationLabel));
	}
	
	public void verifyLastDoseGivenOnRecord() {
		waitInterval(1);
		String lastDoseGivenOnExpectedVal = medicationRecordMap.get(PixalereStringPool.END_DATE);
		System.out.println("lastDoseGivenOnExpectedVal: "+lastDoseGivenOnExpectedVal);
		
		highLightElement(CustomizedLocators.getLatestCurrentMedicationRecordByValue(PixalereStringPool.LAST_DOSE_GIVEN_ON));
		String lastDoseGivenOnActualVal = getElementText(CustomizedLocators.getLatestCurrentMedicationRecordByValue(PixalereStringPool.LAST_DOSE_GIVEN_ON)).trim();
		System.out.println("lastDoseGivenOnActualVal: "+lastDoseGivenOnActualVal);
		
		Assert.assertTrue(lastDoseGivenOnActualVal+" != "+lastDoseGivenOnExpectedVal, lastDoseGivenOnActualVal.contains(lastDoseGivenOnExpectedVal));
	}
	
	public void verifyGivenMedicationSuccessMessage() {
		waitForCompletePageLoad();
		waitUntilElementIsDisplayed(PatientProfilePageLocators.msg_SuccessTextMessage);
		scrollAndhighLightElement(PatientProfilePageLocators.msg_SuccessTextMessage);
		
		String actualMessage = getElementText(PatientProfilePageLocators.msg_SuccessTextMessage).trim();
		System.out.println("actualMessage: "+actualMessage);
		
		Assert.assertTrue(actualMessage+" != "+medicationRecordMap.get(PixalereStringPool.MEDICATION_NAME), actualMessage.contains(medicationRecordMap.get(PixalereStringPool.MEDICATION_NAME)));
		Assert.assertTrue(actualMessage+" != "+medicationRecordMap.get(PixalereStringPool.END_DATE), actualMessage.contains(medicationRecordMap.get(PixalereStringPool.END_DATE)));
		waitInterval(1);
	}
	
	public void verifyMedicationRecordOnHold() {
		scrollAndhighLightElement(CustomizedLocators.getLatestHoldMedicationRecordByValue(PixalereStringPool.MEDICATION_NAME));
		String actualVal = getElementText(CustomizedLocators.getLatestHoldMedicationRecordByValue(PixalereStringPool.MEDICATION_NAME));
		System.out.println(PixalereStringPool.MEDICATION_NAME+" actualVal: "+actualVal);
		waitIntervalByHalf(1);
		Assert.assertTrue(actualVal+" != "+medicationRecordMap.get(PixalereStringPool.MEDICATION_NAME), actualVal.contains(medicationRecordMap.get(PixalereStringPool.MEDICATION_NAME)));
		
		highLightElement(MedicationManagementPageLocators.lbl_LatestMedicationOnHoldLabel);
		Assert.assertTrue("Medication On Hold Label is not display..", isDisplayed(MedicationManagementPageLocators.lbl_LatestMedicationOnHoldLabel));
		
		if(isDisplayed(CustomizedLocators.getLatestCurrentMedicationRecordByValue(PixalereStringPool.MEDICATION_NAME))) {
			scrollAndhighLightElement(CustomizedLocators.getLatestCurrentMedicationRecordByValue(PixalereStringPool.MEDICATION_NAME));
			actualVal = getElementText(CustomizedLocators.getLatestCurrentMedicationRecordByValue(PixalereStringPool.MEDICATION_NAME));
			Assert.assertTrue(actualVal+" :ShouldNotEqualsTo: "+medicationRecordMap.get(PixalereStringPool.MEDICATION_NAME), !actualVal.contains(medicationRecordMap.get(PixalereStringPool.MEDICATION_NAME)));
		}
	}
	
	public void verifyReactivatedMedicationRecordOnTop() {
		scrollAndhighLightElement(CustomizedLocators.getLatestCurrentMedicationRecordByValue(PixalereStringPool.MEDICATION_NAME));
		String actualVal = getElementText(CustomizedLocators.getLatestCurrentMedicationRecordByValue(PixalereStringPool.MEDICATION_NAME));
		System.out.println(PixalereStringPool.MEDICATION_NAME+" actualVal: "+actualVal);
		waitIntervalByHalf(1);
		Assert.assertTrue(actualVal+" != "+medicationRecordMap.get(PixalereStringPool.MEDICATION_NAME), actualVal.contains(medicationRecordMap.get(PixalereStringPool.MEDICATION_NAME)));
		
		if(isDisplayed(CustomizedLocators.getLatestHoldMedicationRecordByValue(PixalereStringPool.MEDICATION_NAME))) {
			scrollAndhighLightElement(CustomizedLocators.getLatestHoldMedicationRecordByValue(PixalereStringPool.MEDICATION_NAME));
			actualVal = getElementText(CustomizedLocators.getLatestHoldMedicationRecordByValue(PixalereStringPool.MEDICATION_NAME));
			Assert.assertTrue(actualVal+" :ShouldNotEqualsTo: "+medicationRecordMap.get(PixalereStringPool.MEDICATION_NAME), !actualVal.contains(medicationRecordMap.get(PixalereStringPool.MEDICATION_NAME)));
		}
	}
	
	public void verifyMedicationRecordDeleted() {
		waitInterval(1);
		String actualVal=null;
		boolean isDeleted=false;
		for (WebElement deletedRecord : getWebDriver().findElements(By.xpath("//div[@class='portlet-body']//div[contains(@class, 'med_deleted')]//label[contains(text(), '"+PixalereStringPool.MEDICATION_NAME+"')]//following-sibling::div//p[text()]"))) {
			scrollAndhighLightElement(deletedRecord);
			waitInterval(1);
			actualVal = deletedRecord.getText();
			if(actualVal.contains(medicationRecordMap.get(PixalereStringPool.MEDICATION_NAME))) {
				System.out.println(actualVal+" Record is Deleted successfully...");
				isDeleted=true;
				break;
			}
		}
		Assert.assertTrue(medicationRecordMap.get(PixalereStringPool.MEDICATION_NAME)+" Record is failed to delete..", isDeleted);
		
		if(isDisplayed(CustomizedLocators.getLatestHoldMedicationRecordByValue(PixalereStringPool.MEDICATION_NAME))) {
			scrollAndhighLightElement(CustomizedLocators.getLatestHoldMedicationRecordByValue(PixalereStringPool.MEDICATION_NAME));
			actualVal = getElementText(CustomizedLocators.getLatestHoldMedicationRecordByValue(PixalereStringPool.MEDICATION_NAME));
			Assert.assertTrue(actualVal+" :ShouldNotEqualsTo: "+medicationRecordMap.get(PixalereStringPool.MEDICATION_NAME), !actualVal.contains(medicationRecordMap.get(PixalereStringPool.MEDICATION_NAME)));
		}
		
		if(isDisplayed(CustomizedLocators.getLatestCurrentMedicationRecordByValue(PixalereStringPool.MEDICATION_NAME))) {
			scrollAndhighLightElement(CustomizedLocators.getLatestCurrentMedicationRecordByValue(PixalereStringPool.MEDICATION_NAME));
			actualVal = getElementText(CustomizedLocators.getLatestCurrentMedicationRecordByValue(PixalereStringPool.MEDICATION_NAME));
			Assert.assertTrue(actualVal+" :ShouldNotEqualsTo: "+medicationRecordMap.get(PixalereStringPool.MEDICATION_NAME), !actualVal.contains(medicationRecordMap.get(PixalereStringPool.MEDICATION_NAME)));
		}
	}
	
	
	/*** BPMH ***/
	
	public void clickOnAdmissionRadioButton() {
		clickElement(MedicationManagementPageLocators.sel_AdmissionRadioButton);
	}
	
	public void addMedicationRecordForBPMH(String field, String...value) {
		String inputVal = null;
		if(value.length > 0)
			inputVal=value[0];
		else
			inputVal = JavaUtils.getRandomString(10)+JavaUtils.getRandomNumber(5);
		System.out.println("inputVal: "+inputVal);
		
		switch (field) {
		case PixalereStringPool.MEDICATION_NAME:
			clear(MedicationManagementPageLocators.txt_BPMHMedicationNameInput);
			sendKeys(MedicationManagementPageLocators.txt_BPMHMedicationNameInput, inputVal);
			break;
			
		case PixalereStringPool.DOSE:
			clear(MedicationManagementPageLocators.txt_BPMHDoseInput);
			sendKeys(MedicationManagementPageLocators.txt_BPMHDoseInput, inputVal);
			break;
			
		case PixalereStringPool.ROUTE:
			selectByVisibleText(MedicationManagementPageLocators.drp_BPMHRouteDropdown, inputVal);
			break;
			
		case PixalereStringPool.FREQUENCY:
			selectByVisibleText(MedicationManagementPageLocators.drp_BPMHFrequencyDropdown, inputVal);
			break;
		}
		waitInterval(1);
		medicationRecordMap.put(field, inputVal);
		System.out.println("medicationRecordMap: "+medicationRecordMap);
	}
	
	public void selectMultiCheckList(String field, String checkList) {
		medicationRecordMap.put(field, checkList);
		for (String checkbox : checkList.split(",")) {
			waitIntervalByHalf(1);
			clickElementWithJQuery(CustomizedLocators.getLabelElementByValue(checkbox.trim()));
		}
	}
	
	public void selectRadioOption(String field, String radioVal) {
		waitIntervalByHalf(1);
		clickElement(CustomizedLocators.getRadioLabelElementByValue(radioVal));
		
		medicationRecordMap.put(field, radioVal);
		System.out.println("medicationRecordMap: "+medicationRecordMap);
	}
	
	public void selectRadioLabelOption(String labelOption) {
		waitInterval(1);
		clickElement(CustomizedLocators.getLabelElementByValue(labelOption));
	}
	
	public void clickOnInputCheckOption(String option) {
		waitIntervalByHalf(1);
		clickElementWithJQuery(CustomizedLocators.getInputCheckElementByOption(option));
		
		medicationRecordMap.put(option, "Yes");
		medicationRecordMap.put("Nurse", ConfigFileReader.getProperties("chat.module.sender.user"));
		System.out.println("medicationRecordMap: "+medicationRecordMap);
	}
	
	public void verifySavedDataOnBPMHTable() {
		waitInterval(2);
		int index=1, count=0;
		String column=null, columnVal=null;
		waitUntilElementIsDisplayed(MedicationManagementPageLocators.css_TableColumnList);
		scrollAndhighLightElement(MedicationManagementPageLocators.css_TableColumnList);
		
		for (WebElement tableColumn : getWebDriver().findElements(MedicationManagementPageLocators.css_TableColumnList)) {
			waitInterval(1);
			column = tableColumn.getText();
			System.out.println("UI column: "+column);
			
			if(medicationRecordMap.keySet().contains(column)) {
				count++;
				scrollAndhighLightElement(tableColumn);
				waitIntervalByHalf(1);
				scrollAndhighLightElement(CustomizedLocators.getTableColumnValueAsPerIndex(index));
				columnVal = getElementText(CustomizedLocators.getTableColumnValueAsPerIndex(index));
				System.out.println("UI actual columnVal: "+columnVal);
				Assert.assertTrue(columnVal+" != "+medicationRecordMap.get(column), columnVal.contains(medicationRecordMap.get(column)));
			}
			index++;
		}
		Assert.assertTrue(medicationRecordMap.size()+": != :"+count, medicationRecordMap.size() == count);
	}
	
	public void clickOnEditLatestRecord() {
		waitInterval(1);
		scrollAndhighLightElement(MedicationManagementPageLocators.btn_TableLastRecordEditButton);
		clickElementWithJQuery(MedicationManagementPageLocators.btn_TableLastRecordEditButton);
	}
	
	public void selectActionAndDate(String actionName) {
		waitInterval(1);
		clickElement(CustomizedLocators.getLabelElementByValue(actionName));
		
		selectByVisibleText(MedicationManagementPageLocators.drp_CopyFaxedDaysCalendarDropdown, getReturnDate("Days", "Current"));
		selectByVisibleText(MedicationManagementPageLocators.drp_CopyFaxedMonthsCalendarDropdown, getReturnDate("Month", "Next"));
		clear(MedicationManagementPageLocators.txt_CopyFaxedYearsCalendarInput);
		sendKeys(MedicationManagementPageLocators.txt_CopyFaxedYearsCalendarInput, getReturnDate("Year", "Next"));
	}
	
	public void verifyLastUpdatedDateWithUserOnBPMH() {
		waitForCompletePageLoad();
		waitUntilElementIsDisplayed(MedicationManagementPageLocators.ele_LastUpdateDateLabel);
		String actualVal = getElementText(MedicationManagementPageLocators.ele_LastUpdateDateLabel).trim();
		System.out.println("actualVal: "+actualVal);
		
		String currentDate = JavaUtils.getDateInFormat(getReturnDate("Date", "Current"), "d-MMM-yyyy", "d/MMM/yyyy");
		System.out.println("currentDate: "+currentDate);
		Assert.assertTrue(actualVal+": != :"+currentDate, actualVal.contains(currentDate));
		Assert.assertTrue(actualVal+": != :"+ConfigFileReader.getProperties("chat.module.sender.user"), actualVal.contains(ConfigFileReader.getProperties("chat.module.sender.user")));
	}
	
	
	/*** Infusions ***/
	
	public void addMedicationRecordForInfusions(String field, String...value) {
		String inputVal = null;
		if(value.length > 0)
			inputVal=value[0];
		else
			inputVal = JavaUtils.getRandomString(10)+JavaUtils.getRandomNumber(5);
		System.out.println("inputVal: "+inputVal);
		
		switch (field) {
		case PixalereStringPool.SOLUTION_NAME:
			clear(MedicationManagementPageLocators.txt_SolutionNameInput);
			sendKeys(MedicationManagementPageLocators.txt_SolutionNameInput, inputVal);
			solutionNameDropdownList.add(inputVal);
			break;
			
		case PixalereStringPool.SOLUTION_TYPE:
			clickElement(MedicationManagementPageLocators.sel_SolutionTypeFirstRadioButton);
			solutionNameDropdownList.add(inputVal);
			break;
			
		case PixalereStringPool.METHOD:
			clickElement(MedicationManagementPageLocators.sel_MethodFirstRadioButton);
			break;
			
		case PixalereStringPool.SITE_LOCATION:
			clear(MedicationManagementPageLocators.txt_SiteLocationInput);
			sendKeys(MedicationManagementPageLocators.txt_SiteLocationInput, inputVal);
			break;
			
		case PixalereStringPool.LOCATION_CHANGE:
			clickElement(MedicationManagementPageLocators.sel_LocationChangeYesRadioButton);
			break;
			
		case PixalereStringPool.CANNULA:
			clear(MedicationManagementPageLocators.txt_CannulaInput);
			sendKeys(MedicationManagementPageLocators.txt_CannulaInput, inputVal);
			break;
			
		case PixalereStringPool.CENTRAL_LINE:
			clear(MedicationManagementPageLocators.txt_CentralLineInput);
			sendKeys(MedicationManagementPageLocators.txt_CentralLineInput, inputVal);
			break;
			
		case PixalereStringPool.PICC:
			clear(MedicationManagementPageLocators.txt_PICCInput);
			sendKeys(MedicationManagementPageLocators.txt_PICCInput, inputVal);
			break;
			
		case PixalereStringPool.OCCLUSION_ASSESSED:
			scrollAndhighLightElement(MedicationManagementPageLocators.sel_OcclusionAssessedYesRadioButton);
			clickElementWithJQuery(MedicationManagementPageLocators.sel_OcclusionAssessedYesRadioButton);
			break;
			
		case PixalereStringPool.OCCLUSION_DETECTED:
			clickElementWithJQuery(MedicationManagementPageLocators.sel_OcclusionDetectedYesRadioButton);
			break;
			
		case PixalereStringPool.OCCLUSION_QUALITY:
			selectByVisibleText(MedicationManagementPageLocators.drp_OcclusionQualityDropdown, inputVal);
			break;
			
		case PixalereStringPool.OCCLUSION_SOURCE:
			selectByVisibleText(MedicationManagementPageLocators.drp_OcclusionSourceDropdown, inputVal);
			break;
			
		case PixalereStringPool.NORMAL_SALINE:
			clear(MedicationManagementPageLocators.txt_NormalSalineInput);
			sendKeys(MedicationManagementPageLocators.txt_NormalSalineInput, inputVal);
			break;
			
		case PixalereStringPool.VOLUME_TBD:
			clear(MedicationManagementPageLocators.txt_VolumeTBDInput);
			sendKeys(MedicationManagementPageLocators.txt_VolumeTBDInput, inputVal);
			break;
			
		case PixalereStringPool.VOLUME_INFUSED:
			clear(MedicationManagementPageLocators.txt_VolumeInfusedInput);
			sendKeys(MedicationManagementPageLocators.txt_VolumeInfusedInput, inputVal);
			break;
			
		case PixalereStringPool.RES_VOLUME:
			clear(MedicationManagementPageLocators.txt_ResVolumeInput);
			sendKeys(MedicationManagementPageLocators.txt_ResVolumeInput, inputVal);
			break;
			
		case PixalereStringPool.DOSES_GIVEN:
			selectByVisibleText(MedicationManagementPageLocators.drp_DosesGivenDropdown, inputVal);
			break;
			
		case PixalereStringPool.BATTERY_CHECKED:
			clickElementWithJQuery(MedicationManagementPageLocators.sel_BatteryCheckedFirstRadioButton);
			break;
			
		case PixalereStringPool.BATTERY_CHANGED:
			clickElementWithJQuery(MedicationManagementPageLocators.sel_BatteryChangedFirstRadioButton);
			break;
			
		case PixalereStringPool.TUBING_CHANGE:
			clickElementWithJQuery(MedicationManagementPageLocators.sel_TubingChangeFirstRadioButton);
			break;
			
		case PixalereStringPool.DRESSING_CHANGE:
			clickElementWithJQuery(MedicationManagementPageLocators.sel_DressingChangeFirstRadioButton);
			break;
			
		case PixalereStringPool.BAG_CHANGE:
			clickElementWithJQuery(MedicationManagementPageLocators.sel_BagChangeFirstRadioButton);
			break;
			
		case PixalereStringPool.CAP_CHANGE:
			clickElementWithJQuery(MedicationManagementPageLocators.sel_CapChangeFirstRadioButton);
			break;
			
		case PixalereStringPool.PORT_A_CATH_CHANGED:
			clickElementWithJQuery(MedicationManagementPageLocators.sel_PortACathChangedRadioButton);
			break;
			
		case PixalereStringPool.PORT_A_CATH_GAUGE:
			clear(MedicationManagementPageLocators.txt_PortACatchGaugeInput);
			sendKeys(MedicationManagementPageLocators.txt_PortACatchGaugeInput, inputVal);
			break;
			
		case PixalereStringPool.HEPARIN_LOCK:
			clickElementWithJQuery(MedicationManagementPageLocators.sel_HeparinLockRadioButton);
			break;
		}
		waitInterval(1);
		medicationRecordMap.put(field, inputVal);
		System.out.println("medicationRecordMap: "+medicationRecordMap);
	}
	
	public void selectRadioTextButton(String field, String value) {
		selectRadioLabelOption(value);
		medicationRecordMap.put(field, value);
	}
	
	public void verifySolutionNameDropdown() {
		waitInterval(1);
		clickElement(MedicationManagementPageLocators.drp_SolutionNameDropdown);
		highLightElement(MedicationManagementPageLocators.opt_SolutionNameDropdownOption);
		for (String val : solutionNameDropdownList)
			Assert.assertTrue("SolutionName not contains: "+val, getElementText(MedicationManagementPageLocators.opt_SolutionNameDropdownOption).contains(val));
	}
	
	public void verifyAlertMessage(String alertMsg, String field) {
		By alertMsgElement = field.contains(PixalereStringPool.HEPARIN_LOCK)
				? MedicationManagementPageLocators.msg_HeparinLockAlertMessage
				: MedicationManagementPageLocators.msg_RednessAlertMessage;
		
		waitUntilElementIsDisplayed(alertMsgElement);
		highLightElement(alertMsgElement);
		waitInterval(1);
		Assert.assertTrue(field +"message is failed to verify..", getElementText(alertMsgElement).contains(alertMsg));
	}
	
	public void verifyDropdownVisibility() {
		waitUntilElementIsDisplayed(MedicationManagementPageLocators.drp_OcclusionQualityDropdown);
		
		highLightElement(MedicationManagementPageLocators.drp_OcclusionQualityDropdown);
		Assert.assertTrue(PixalereStringPool.OCCLUSION_QUALITY+" is failed to visible...", isDisplayed(MedicationManagementPageLocators.drp_OcclusionQualityDropdown));
		
		highLightElement(MedicationManagementPageLocators.drp_OcclusionSourceDropdown);
		Assert.assertTrue(PixalereStringPool.OCCLUSION_SOURCE+" is failed to visible...", isDisplayed(MedicationManagementPageLocators.drp_OcclusionSourceDropdown));
		waitInterval(1);
	}
	
	public void verifyInputFieldVisibility() {
		waitUntilElementIsDisplayed(MedicationManagementPageLocators.txt_PortACatchGaugeInput);
		highLightElement(MedicationManagementPageLocators.txt_PortACatchGaugeInput);
		Assert.assertTrue(PixalereStringPool.PORT_A_CATH_GAUGE+" is failed to visible...", isDisplayed(MedicationManagementPageLocators.txt_PortACatchGaugeInput));
		waitInterval(1);
	}
	
	public void verifyInfusionsDataEntryDetailsOnViewer(String isTrue) {
		waitForCompletePageLoad();
		
		for (String mapKey : medicationRecordMap.keySet()) {
			String expectedVal = medicationRecordMap.get(mapKey);
			System.out.println(mapKey+" expectedVal: "+expectedVal);
			
			By viewerValueElement = isTrue.contains("Yes")
					? CustomizedLocators.getInfusionsTableLatestValueOnViewerByKey(mapKey)
					: CustomizedLocators.getInfusionsTableLatestValueDeletedOnViewerByKey(mapKey);
			
			scrollAndhighLightElement(viewerValueElement);
			((JavascriptExecutor) getWebDriver()).executeScript("arguments[0].setAttribute('style', 'border: 4px solid black;');", getWebDriver().findElement(viewerValueElement));
			String actualVal = getElementText(viewerValueElement).trim();
			System.out.println(mapKey+" actualVal: "+actualVal);
			waitIntervalByHalf(1);
			Assert.assertTrue(mapKey+": "+actualVal +" != "+expectedVal, actualVal.contains(expectedVal));
		}
	}
	
	public void deleteLatestRecordFromInfusionsTable() {
		clickElement(MedicationManagementPageLocators.btn_LatestInfusionsRecordDeleteButton);
		waitIntervalByHalf(1);
	}
}
