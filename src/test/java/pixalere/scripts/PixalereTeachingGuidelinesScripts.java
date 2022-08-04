package pixalere.scripts;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import pixalere.pageObjectJavaUtils.JavaUtils;
import pixalere.pageObjectUtils.LocatorUtils.CustomizedLocators;
import pixalere.pageObjectUtils.LocatorUtils.TeachingGuidelinesPageLocators;
import pixalere.pageObjectUtils.PixalereCommonUtils;

public class PixalereTeachingGuidelinesScripts extends PixalereCommonUtils {
	
	private int selectionCounter=0, deSelectionCounter=0;
	private String otherEducationInput;
	
	public void selectAllInitiatedAndCompleted() {
		boolean flag=false;
		for (WebElement button : getWebDriver().findElements(TeachingGuidelinesPageLocators.btn_InitiatedCompletedButtonList)) {
			waitIntervalByHalf(1);
			clickElementOnCenter(button);
			selectionCounter++;
			System.out.println("selectionCounter: "+selectionCounter);
			flag=true;
			break;
		}
		if(flag)
			selectAllInitiatedAndCompleted();
	}
	
	public void selectAllUndoChartDone() {
		boolean flag=false;
		for (WebElement button : getWebDriver().findElements(TeachingGuidelinesPageLocators.btn_UndoChartDoneButtonList)) {
			waitIntervalByHalf(1);
			clickElementOnCenter(button);
			if(isDisplayed(By.cssSelector("button[aria-label='Close Beacon popover']"))) {
				clickElementOnCenter(button);
				clickElementWithJQuery(button);
			}
			deSelectionCounter++;
			System.out.println("deSelectionCounter: "+deSelectionCounter);
			flag=true;
			break;
		}
		if(flag)
			selectAllUndoChartDone();
	}
	
	public void editMedicationInputList() {
		waitUntilElementIsDisplayed(TeachingGuidelinesPageLocators.css_MedicationNameInputList);
		for (WebElement inputField : getWebDriver().findElements(TeachingGuidelinesPageLocators.css_MedicationNameInputList)) {
			waitInterval(1);
			String inputText = JavaUtils.getEpoch();
			System.out.println("inputText: "+inputText);
			sendKeys(inputField, inputText);
		}
	}
	
	public void clickOnAddOtherTeachingButton(String buttonText) {
		clickElementWithJQuery(CustomizedLocators.getButtonWithTextElement(buttonText));
	}
	
	public void editOtherEducationInput() {
		otherEducationInput = JavaUtils.getEpoch();
		System.out.println("otherEducationInput: "+otherEducationInput);
		waitUntilElementIsDisplayed(TeachingGuidelinesPageLocators.txt_OtherEducationInput);
		waitInterval(1);
		sendKeys(TeachingGuidelinesPageLocators.txt_OtherEducationInput, otherEducationInput);
	}
	
	public void verifyAddedOtherEducationField() {
		waitUntilElementIsDisplayed(TeachingGuidelinesPageLocators.txt_OtherEducationInputField);
		waitInterval(1);
		highLightElement(TeachingGuidelinesPageLocators.txt_OtherEducationInputField);
		String actualVal = getAttribute(TeachingGuidelinesPageLocators.txt_OtherEducationInputField, "value").trim();
		System.out.println("actualVal: "+actualVal);
		Assert.assertTrue(actualVal+": != :"+otherEducationInput, actualVal.contains(otherEducationInput));
	}
	
	public void verifyUndoChartDoneListVisible() {
		waitUntilElementIsDisplayed(TeachingGuidelinesPageLocators.btn_UndoChartDoneButtonList);
		waitInterval(1);
		Assert.assertTrue("Initiated and Completed List should not Displayed...", !isDisplayed(TeachingGuidelinesPageLocators.btn_InitiatedCompletedButtonList));
		Assert.assertTrue("Undo Chart Done List should Displayed...", isDisplayed(TeachingGuidelinesPageLocators.btn_UndoChartDoneButtonList));
		
		int actualCounter = getListSize(TeachingGuidelinesPageLocators.btn_UndoChartDoneButtonList);
		System.out.println("actualCounter: "+ actualCounter);
//		Assert.assertTrue(actualCounter == selectionCounter);
	}
	
	public void verifyInitiatedCompletedListVisible() {
		waitUntilElementIsDisplayed(TeachingGuidelinesPageLocators.btn_InitiatedCompletedButtonList);
		waitInterval(1);
		Assert.assertTrue("Initiated and Completed List should Displayed...", isDisplayed(TeachingGuidelinesPageLocators.btn_InitiatedCompletedButtonList));
		Assert.assertTrue("Undo Chart Done List should not Displayed...", !isDisplayed(TeachingGuidelinesPageLocators.btn_UndoChartDoneButtonList));
		
		int actualCounter = getListSize(TeachingGuidelinesPageLocators.btn_InitiatedCompletedButtonList);
		System.out.println("actualCounter: "+ actualCounter);
//		Assert.assertTrue(actualCounter == selectionCounter);
	}
	
//	public void verifySavedDataWithDetails() {
//		String actualVal=null;
//		String currentDate = JavaUtils.getCurrentDate("dd/MMM/yyyy");
//		System.out.println("currentDate: "+currentDate);
//		int counter=0;
//		for (WebElement label : getWebDriver().findElements(TeachingGuidelinesPageLocators.ele_InitiatedCompletedDetailsList)) {
//			actualVal =  getElementText(label);
//			clickElement(label);
//			System.out.println("actualVal: "+actualVal);
//			Assert.assertTrue(actualVal+": != :"+currentDate, actualVal.contains(currentDate));
//			Assert.assertTrue(actualVal+": != :"+ConfigFileReader.getProperties("chat.module.sender.user"), actualVal.contains(ConfigFileReader.getProperties("chat.module.sender.user")));
//			counter++;
//		}
//		Assert.assertTrue("Actual Counter: "+counter+": != :"+"Expected Counter: "+(selectionCounter-1), counter == (selectionCounter-1));
//	}
}
