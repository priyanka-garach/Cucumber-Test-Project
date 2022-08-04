package pixalere.scripts;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import dataProviders.ConfigFileReader;
import pixalere.pageObjectJavaUtils.JavaUtils;
import pixalere.pageObjectUtils.PixalereCommonUtils;
import pixalere.pageObjectUtils.LocatorUtils.ChatPageLocators;
import pixalere.pageObjectUtils.LocatorUtils.CustomizedLocators;

public class PixalereChatModuleScripts extends PixalereCommonUtils {
	
	private String msgText;
	private String msgSenderUser;

	public void searchRecipientUserPatient(String userPatient, String field) {
		By searchType = field.contains("Recipients") ? ChatPageLocators.txt_SearchRecipientUserInput
				: ChatPageLocators.txt_SearchPatientInput;
		sendKeys(searchType, userPatient);
		waitUntilElementIsDisplayed(CustomizedLocators.getSearchedRecipientUserPatient(userPatient));
		waitIntervalByHalf(1);
		clickElement(CustomizedLocators.getSearchedRecipientUserPatient(userPatient));
		waitInterval(1);
	}
	
	public void verifySearchedUserPatient(String userPatient, String field) {
		By selectedType = field.contains("Recipients") ? ChatPageLocators.lbl_SearchedRecipientLabel
				: ChatPageLocators.lbl_SearchedPatientLabel;
		
		waitUntilElementIsDisplayed(selectedType);
		highLightElement(selectedType);
		String actualVal = getElementText(selectedType);
		System.out.println("Selected Recipient: "+actualVal);
		Assert.assertTrue(actualVal +" != "+userPatient, actualVal.contains(userPatient));
		waitIntervalByHalf(1);
	}
	
	public void removeUserPatientLabelFromPopup() {
		waitUntilElementIsDisplayed(ChatPageLocators.css_DeleteLabelButtonList);
		int counter=0;
		while(isDisplayed(ChatPageLocators.css_DeleteLabelButtonList)) {
			clickElement(ChatPageLocators.css_DeleteLabelButtonList);
			waitIntervalByHalf(1);
			counter++;
			
			if(counter > 2)
				break;
		}
	}
	
	public void verifyRecipientUserPatientFieldReset() {
		waitInterval(2);
		highLightElement(ChatPageLocators.txt_SearchRecipientUserInput);
		Assert.assertTrue("Search Recipient User is not displayed..", isDisplayed(ChatPageLocators.txt_SearchRecipientUserInput));
		Assert.assertTrue("Recipient User Label still not removed..", !isDisplayed(ChatPageLocators.lbl_SearchedRecipientLabel));
		
		highLightElement(ChatPageLocators.txt_SearchPatientInput);
		Assert.assertTrue("Search Patient is not displayed..", isDisplayed(ChatPageLocators.txt_SearchPatientInput));
		Assert.assertTrue("Patient Label still not removed..", !isDisplayed(ChatPageLocators.lbl_SearchedPatientLabel));
	}
	
	public void typeMessageFromSender() {
		msgText = JavaUtils.getRandomString(10)+JavaUtils.getEpoch();
		sendKeys(ChatPageLocators.txt_MessageChatModuleInput, msgText);
		waitInterval(1);
		msgSenderUser = ConfigFileReader.getProperties("chat.module.sender.user");
	}
	
	public void typeMessageFromReceiver() {
		msgText = JavaUtils.getRandomNumber(10)+JavaUtils.getEpoch();
		sendKeys(ChatPageLocators.txt_ReceiverMessageChatModuleInput, msgText);
		waitInterval(1);
		msgSenderUser = ConfigFileReader.getProperties("chat.module.receiver.user");
	}
	
	public void verifyChatHistoryEmpty() {
		waitUntilElementIsDisplayed(ChatPageLocators.lbl_NoMessageEntryLabel);
		waitInterval(1);
		highLightElement(ChatPageLocators.lbl_NoMessageEntryLabel);
		Assert.assertTrue("Chat history is not empty...", isDisplayed(ChatPageLocators.lbl_NoMessageEntryLabel));
	}
	
	public void verifyUnreadMessage(String user) {
		waitUntilElementIsDisplayed(ChatPageLocators.css_UnreadMessageDetailsList);
		waitIntervalByHalf(1);
		
		int i=0;
		String actualVal = null;
		for (WebElement msgTableID : getWebDriver().findElements(ChatPageLocators.css_UnreadMessageDetailsList)) {
			highLightElement(msgTableID);
			actualVal = msgTableID.getText();
			System.out.println("actualVal: "+actualVal);
			if(i==0)
				Assert.assertTrue(actualVal+": notContains :"+ConfigFileReader.getProperties("chat.module.patient"), actualVal.contains(ConfigFileReader.getProperties("chat.module.patient")));
			else if(i==1)
				System.out.println(actualVal+": notContains :"+JavaUtils.getCurrentDate("yyyy-MM-dd"));
//				Assert.assertTrue(actualVal+": notContains :"+JavaUtils.getCurrentDate("yyyy-MM-dd"), actualVal.contains(JavaUtils.getCurrentDate("yyyy-MM-dd")));
			else if(i==2)
				Assert.assertTrue(actualVal+": notContains :"+msgSenderUser, actualVal.contains(msgSenderUser));
			else if(i==3)
				Assert.assertTrue(actualVal+": notContains :"+msgText, actualVal.contains(msgText));
			i++;
		}
	}
	
	public void verifyLatestSentMessageInChatHistory() {
		waitUntilElementContainsText(ChatPageLocators.msg_LatestSentMessage, msgText);
		waitInterval(1);
		highLightElement(ChatPageLocators.msg_LatestSentMessage);
		String actualMsg = getElementText(ChatPageLocators.msg_LatestSentMessage).trim();
		System.out.println("Actual Sent Msg: "+actualMsg);
		Assert.assertTrue(actualMsg+": notContains :"+msgText, actualMsg.contains(msgText));
	}
	
	public void readLatestMessage() {
		clickElement(ChatPageLocators.btn_ViewUnreadMessageButton);
		
		waitUntilElementContainsText(ChatPageLocators.msg_LatestReceivedMessage, msgText);
		waitInterval(1);
		highLightElement(ChatPageLocators.msg_LatestReceivedMessage);
		String actualMsg = getElementText(ChatPageLocators.msg_LatestReceivedMessage).trim();
		System.out.println("Actual Sent Msg: "+actualMsg);
		Assert.assertTrue(actualMsg+": notContains :"+msgText, actualMsg.contains(msgText));
		waitInterval(1);
	}
}
