package pixalere.scripts;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import dataProviders.ConfigFileReader;
import pixalere.pageObjectJavaUtils.JavaUtils;
import pixalere.pageObjectUtils.LocatorUtils.CustomizedLocators;
import pixalere.pageObjectUtils.LocatorUtils.PatientAccountsPageLocators;
import pixalere.pageObjectUtils.LocatorUtils.ProgressNotePageLocators;
import pixalere.pageObjectUtils.PixalereCommonUtils;

public class PixalereProgressNotesScripts extends PixalereCommonUtils {
	
	private String progressNotesText;
	
	public void enterProgressNoteInputField() {
		progressNotesText = JavaUtils.getRandomString(10)+"_"+JavaUtils.getEpoch();
		System.out.println("progressNotesText: "+progressNotesText);
		sendKeys(ProgressNotePageLocators.txt_ProgressNoteTextareaInput, progressNotesText);
		waitInterval(1);
	}
	
	public void verifyProgressNoteField(String isDisplay) {
		
		if(!isDisplay.contains("Not")) {
			String progressNote=null;
			Assert.assertTrue("Saved Progress Note Details should display..", isDisplayed(ProgressNotePageLocators.lbl_ProgressNoteLatestResultDetailsLabel));
			Assert.assertTrue("Saved Progress Note should display..", isDisplayed(ProgressNotePageLocators.lbl_ProgressNoteLatestResultTextLabel));
			
			highLightElement(ProgressNotePageLocators.lbl_ProgressNoteLatestResultDetailsLabel);
			highLightElement(ProgressNotePageLocators.lbl_ProgressNoteLatestResultTextLabel);
			progressNote = getElementText(ProgressNotePageLocators.lbl_ProgressNoteLatestResultDetailsLabel);
			System.out.println("progressNoteDetails: "+progressNote);
			Assert.assertTrue(progressNote+": notContains :"+ConfigFileReader.getProperties("chat.module.sender.user"), progressNote.contains(ConfigFileReader.getProperties("chat.module.sender.user")));
//			Assert.assertTrue(progressNote+": notContains :"+JavaUtils.getCurrentDate("d/MMM/yyyy"), progressNote.contains(JavaUtils.getCurrentDate("d/MMM/yyyy")));
			
			progressNote = getElementText(ProgressNotePageLocators.lbl_ProgressNoteLatestResultTextLabel);
			System.out.println("progressNote: "+progressNote);
			Assert.assertTrue(progressNote+": notContains :"+progressNotesText, progressNote.contains(progressNotesText));
		}
		else {
			Assert.assertTrue("Saved Progress Note Details should not display..", !isDisplayed(ProgressNotePageLocators.lbl_ProgressNoteLatestResultDetailsLabel));
			Assert.assertTrue("Saved Progress Note should not display..", !isDisplayed(ProgressNotePageLocators.lbl_ProgressNoteLatestResultTextLabel));
		}
	}
	
	public void setStartEndDateFilter(String time) {
		String date=null, day=null, month=null, year=null;
		
		date = JavaUtils.getCurrentDate("d-MMM-yyyy");
		System.out.println("Current Date: "+date);
		
		if(time.contains("Next")) {
			date = JavaUtils.addDaysInCustomDate(date, "d-MMM-yyyy", 1);
			System.out.println("Next Date: "+date);
		}
		
		day = date.split("-")[0].trim();
		month = date.split("-")[1].trim();
		year = date.split("-")[2].trim();
		System.out.println("day: "+day);
		System.out.println("month: "+month);
		System.out.println("year: "+year);
		
		for (WebElement datePicker : getWebDriver().findElements(PatientAccountsPageLocators.drp_DaysCalendarDropdown))
			selectByVisibleText(datePicker, day);
		
		for (WebElement datePicker : getWebDriver().findElements(PatientAccountsPageLocators.drp_MonthsCalendarDropdown))
			selectByVisibleText(datePicker, month);
		
		for (WebElement datePicker : getWebDriver().findElements(PatientAccountsPageLocators.txt_YearsCalendarInput)) {
			clear(datePicker);
			sendKeys(datePicker, year);
		}
		
		clickOnInputButtonWithText("Search");
		waitForCompletePageLoad();
		scrollAndhighLightElement(CustomizedLocators.getInputButtonWithTextElement("Search"));
		waitInterval(2);
	}
}
