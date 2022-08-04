package pixalere.pageObjectUtils;

import org.junit.Assert;
import org.openqa.selenium.By;

import dataProviders.ConfigFileReader;
import pixalere.pageObjectUtils.LocatorUtils.CustomizedLocators;
import pixalere.pageObjectUtils.LocatorUtils.GlobalPageLocators;
import pixalere.pageObjectUtils.LocatorUtils.HomePageLocators;
import pixalere.pageObjectUtils.LocatorUtils.LoginPageLocators;
import pixalere.pageObjectUtils.LocatorUtils.PatientAccountsPageLocators;
import pixalere.pageObjectUtils.LocatorUtils.PatientProfilePageLocators;
import pixalere.pageObjectUtils.LocatorUtils.PatientVitalSignsLocators;

public class PixalereCommonUtils extends SeleniumCommonUtils {

	public static String CINID;
	public static String PIXID;
	public static String PIXID_PT_Teaching;
	public static String Data_PT = ConfigFileReader.getProperties("user.Data_PT");
	public static boolean isNewUser = false;
	public static String focusChar;
	public static boolean isDermNumber = false;
	public static boolean isOstomyImage = false;

	/**
	 * Hit Browser Url.
	 * 
	 * @param url
	 */
	public void getUrl(String url) {
		getWebDriver().get(url);
	}

	/**
	 * verify Login creads popup displayed
	 * 
	 * @return true, is popup is displayed.
	 */
	public void verifyLoginPage() {
		waitUntilElementIsDisplayed(LoginPageLocators.ele_LoginPopup);
		Assert.assertTrue("Login popup is failed to Displayed..", isDisplayed(LoginPageLocators.ele_LoginPopup));
		highLightElement(LoginPageLocators.ele_LoginPopup);
	}

	/**
	 * Login in Pixalere
	 * 
	 * @param username
	 * @param password
	 */
	public void login(String username, String password) {
		sendKeys(LoginPageLocators.txt_Username, username);
		sendKeys(LoginPageLocators.txt_Password, password);
		clickElement(LoginPageLocators.btn_Login);
	}

	/**
	 * Login successfully verify.
	 * 
	 * @return true, if Login successfully in Pixalere.
	 */
	public void verifyLogin(String titleText) {
		waitUntilElementIsDisplayed(CustomizedLocators.getWelcomeTitleElement(titleText));
		Assert.assertTrue("Failed to Login in UWH..",
				isDisplayed(CustomizedLocators.getWelcomeTitleElement(titleText)));
		highLightElement(CustomizedLocators.getWelcomeTitleElement(titleText));
	}

	public void closeHomePagePopup() {
		clickElement(HomePageLocators.btn_HomePagePopupCloseButton);
	}

	public void verifyHomePage() {
		waitForCompletePageLoad();
		waitUntilElementIsDisplayed(HomePageLocators.img_HomePagePixalereLogoImage);
		waitUntilElementIsDisplayed(HomePageLocators.ele_HomePageTitle);
		Assert.assertTrue("Failed to Login in Pixalere..", isDisplayed(HomePageLocators.img_HomePagePixalereLogoImage));
		Assert.assertTrue("Failed to Close Home popup..", isDisplayed(HomePageLocators.ele_HomePageTitle));
		highLightElement(HomePageLocators.img_HomePagePixalereLogoImage);
		highLightElement(HomePageLocators.ele_HomePageTitle);
//		waitInterval(2);
	}

	/**
	 * Logout from Pixalere
	 */
	public void logOut() {
		clickLinkWithText(PixalereStringPool.LOGOUT);
//		waitUntilElementIsDisplayed(LoginPageLocators.ele_LoginPopup);
//		waitForCompletePageLoad();
//		waitInterval(2);
	}

	/**
	 * Login in Pixalere with given user.
	 * 
	 * @param user: admin
	 */
	public void loginInPixalere(String user) {
		if (user.contains("admin")) {
			login(ConfigFileReader.getProperties("admin.user.username"),
					ConfigFileReader.getProperties("admin.user.password"));
			verifyLogin(ConfigFileReader.getProperties("login.home.screen.popup.title"));
			closeHomePagePopup();
			verifyHomePage();
//			if(!ConfigFileReader.getProperties("existing.user").equalsIgnoreCase("true"))
			if (user.contains("New"))
				isNewUser = true;
			else if (user.contains("Existing"))
				isNewUser = false;
			else
				CINID = ConfigFileReader.getProperties("user.CIN");
		}

		else if (user.contains("physician")) {
			login(ConfigFileReader.getProperties("physician.user.username"),
					ConfigFileReader.getProperties("physician.user.password"));
			verifyOpenedPage(PixalereStringPool.MY_CONSULTS);
		}

		else if (user.contains("dermatologist")) {
			login(ConfigFileReader.getProperties("dermatologist.user.username"),
					ConfigFileReader.getProperties("user.password"));
			verifyOpenedPage(PixalereStringPool.MY_CONSULTS);
		}
		if (isDisplayed(By.id("popup_agree")))
			clickElement(By.id("popup_agree"));
	}

	public void loginInPixalere_p(String user) {
		if (user.contains("admin")) {
			login(ConfigFileReader.getProperties("admin.user.username_p"),
					ConfigFileReader.getProperties("admin.user.password_p"));
			// verifyLogin(ConfigFileReader.getProperties("login.home.screen.popup.title"));
			// closeHomePagePopup();
			// verifyHomePage();
//			if(!ConfigFileReader.getProperties("existing.user").equalsIgnoreCase("true"))
			if (user.contains("New"))
				isNewUser = true;
			else if (user.contains("Existing"))
				isNewUser = false;
			else {
				PIXID = ConfigFileReader.getProperties("user.PIXID");
				PIXID_PT_Teaching = ConfigFileReader.getProperties("user.PIXID_PT_Teaching");
			}
				
			if (isDisplayed(By.id("popup_agree")))
				clickElement(By.id("popup_agree"));
		}

//		else if(user.contains("physician")) {
//			login(ConfigFileReader.getProperties("physician.user.username"),
//					ConfigFileReader.getProperties("physician.user.password"));
//			verifyOpenedPage(PixalereStringPool.MY_CONSULTS);
//		}
//		
//		else if(user.contains("dermatologist")) {
//			login(ConfigFileReader.getProperties("dermatologist.user.username"),
//					ConfigFileReader.getProperties("user.password"));
//			verifyOpenedPage(PixalereStringPool.MY_CONSULTS);
//		}
	}

	public void verifyOpenedPage(String pageTitle) {
		waitForCompletePageLoad();
		waitUntilElementIsDisplayed(PatientProfilePageLocators.lbl_PatientProfilePageTitle);
		highLightElement(PatientProfilePageLocators.lbl_PatientProfilePageTitle);
		String actualVal = getElementText(PatientProfilePageLocators.lbl_PatientProfilePageTitle).trim();
		System.out.println("actualVal: " + actualVal);
		Assert.assertTrue(actualVal + " != " + pageTitle, actualVal.contains(pageTitle));
	}

	public void verifyOpenedPage_p(String pageTitle) {
		waitForCompletePageLoad();
		waitUntilElementIsDisplayed(PatientVitalSignsLocators.txt_getTitleVitalSigns);
		highLightElement(PatientVitalSignsLocators.txt_getTitleVitalSigns);
		String actualVal = getElementText(PatientVitalSignsLocators.txt_getTitleVitalSigns).trim();
		System.out.println("actualVal: " + actualVal);
		Assert.assertTrue(actualVal + " != " + pageTitle, actualVal.contains(pageTitle));
	}

	public void navigateToAdministrationPanelOption(String administrationOption) {
		String administration = null;
		String option = null;

		administration = administrationOption.split("->")[0].trim();
		if (administrationOption.contains("->"))
			option = administrationOption.split("->")[1].trim();

		clickElementWithJQuery(CustomizedLocators.getLinkWithTextElement(administration));
		waitInterval(2);

		if (option != null) {
			if (!isDisplayed(CustomizedLocators.getAdministrationLHPanelOption(option)))
				clickLinkWithText(administration);
			clickElement(CustomizedLocators.getAdministrationLHPanelOption(option));
		}
	}
	
	public void navigateToAdministrationPanelOptionNAMDR(String administrationOption) {
		//clickLinkWithText(administrationOption);
		clickElement(By.xpath("//a[@id='adpmobilityChecklist']"));
	}

	public void verifyActiveScreen(String activeScreen) {
		waitUntilElementContainsText(PatientAccountsPageLocators.tab_ActiveScreen, activeScreen);
		highLightElement(PatientAccountsPageLocators.tab_ActiveScreen);
		String uiActiveScreenText = getElementText(PatientAccountsPageLocators.tab_ActiveScreen);
		System.out.println("uiActiveScreenText: " + uiActiveScreenText);
		Assert.assertTrue(uiActiveScreenText + " != " + activeScreen, uiActiveScreenText.contains(activeScreen));
	}

	public void setPatientAsExistingUser() {
		CINID = ConfigFileReader.getProperties("user.CIN");
		System.out.println("CINID: " + CINID);
	}

	public void searchPatient() {
		sendKeys(GlobalPageLocators.txt_SearchPatientInput, CINID);
		clickElement(By.xpath(String.format(GlobalPageLocators.lnk_SearchedPatientLink, CINID)));
	}

	public void searchPatient_p() {
		PIXID = PIXID.replaceAll("\\s", "");
		sendKeys(GlobalPageLocators.txt_SearchPatientInput, PIXID);

		clickElement(GlobalPageLocators.btn_SearchBuutton);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickElement(By.xpath(String.format(GlobalPageLocators.lnk_SearchedPatientLink, PIXID)));

	}
	
	public void searchPatient_pp() {
		PIXID_PT_Teaching = PIXID_PT_Teaching.replaceAll("\\s", "");
		sendKeys(GlobalPageLocators.txt_SearchPatientInput, PIXID_PT_Teaching);

		clickElement(GlobalPageLocators.btn_SearchBuutton);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickElement(By.xpath(String.format(GlobalPageLocators.lnk_SearchedPatientLink, PIXID_PT_Teaching)));

	}

	public void clickLinkWithText(String hyperLink) {
		clickElement(CustomizedLocators.getLinkWithTextElement(hyperLink));
	}

	public void clickButtonWithText(String buttonText) {
		clickElement(CustomizedLocators.getButtonWithTextElement(buttonText));
	}

	public void clickDivButtonWithText(String divButtonText) {
		clickElement(CustomizedLocators.getDivButtonWithTextElement(divButtonText));
	}

	public void clickOnInputButtonWithText(String inputButtonText) {
		clickElement(CustomizedLocators.getInputButtonWithTextElement(inputButtonText));
	}

	public void clickOnInputButtonWithTextOnPopup(String inputButtonText) {
		clickElement(CustomizedLocators.getInputButtonWithTextOnPopupElement(inputButtonText));
	}

	public void clickOnButtonWithTextOnPopup(String buttonText) {
		clickElement(CustomizedLocators.getButtonWithTextElementOnPopup(buttonText));
	}

	public void verifyPopup(String popupText) {
		waitForCompletePageLoad();
		waitUntilElementIsDisplayed(GlobalPageLocators.pop_PopupLabel);
		highLightElement(GlobalPageLocators.pop_PopupLabel);
		String actualPopupText = getElementText(GlobalPageLocators.pop_PopupLabel).trim();
		Assert.assertTrue(actualPopupText + " != " + popupText, actualPopupText.contains(popupText));
	}

	public void verifyModalPopup(String popupText) {
		waitForCompletePageLoad();
		waitUntilElementIsDisplayed(CustomizedLocators.getWelcomeTitleElement(popupText));
		highLightElement(CustomizedLocators.getWelcomeTitleElement(popupText));
		String actualPopupText = getElementText(CustomizedLocators.getWelcomeTitleElement(popupText)).trim();
		Assert.assertTrue(actualPopupText + " != " + popupText, actualPopupText.contains(popupText));
	}

	public void verifyPopupClosed(String popupText) {
		waitForCompletePageLoad();
		waitUntilElementIsInvisible(GlobalPageLocators.pop_PopupLabel);
		Assert.assertTrue("Popup is failed to Closed...", !isDisplayed(GlobalPageLocators.pop_PopupLabel));
	}
}
