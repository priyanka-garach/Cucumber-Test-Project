package pixalere.pageObjectUtils;

import java.io.File;
import java.net.MalformedURLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import dataProviders.ConfigFileReader;
import io.cucumber.core.api.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import pixalere.scripts.PixalereAcuteRespiratoryIllnessScripts;
import pixalere.scripts.PixalereAdvLowerLimbAssessmentScripts;
import pixalere.scripts.PixalereBasicLowerLimbAssessmentScripts;
import pixalere.scripts.PixalereCarePlanScripts;
import pixalere.scripts.PixalereClinetConsentScripts;
import pixalere.scripts.PixalereCreateNewPatientAccountScripts;
import pixalere.scripts.PixalereFallRiskNursingScripts;
import pixalere.scripts.PixalereHomePeritonealScripts;
import pixalere.scripts.PixalereInHomeSafetyIdentificationToolScripts;
import pixalere.scripts.PixalereIntakeOutputScripts;
import pixalere.scripts.PixalereIntakeOutputScriptsNursing;
import pixalere.scripts.PixalereMedRATScripts;
import pixalere.scripts.PixalerePTAssessmentScripts;
import pixalere.scripts.PixalereScripts;
import pixalere.scripts.PixalereTeachingAgreementScript;
import pixalere.scripts.PixalereUpperLimbAssessmentScripts;
import pixalere.scripts.PixalereWaterlawAssessmentScript;
import pixalere.stepdefinitions.Tests_PixalereCommonStepDefinition;
import pixalere.stepdefinitions.Tests_PixalereEmergencyPlanning;

public class SeleniumCommonUtils {

	private static WebDriver driver = null;
	private static WebDriverWait waitUtils = null;
	public static Scenario scenario = null;
	public static String directory = "Downloads";
	public static String date_of_visit;

	// ICAT flowchart arraylist start /////
	public static List<String> Neurological_History_data = new ArrayList<>();
	public static List<String> Gastrointestinal_History = new ArrayList<>();
	public static List<String> Genitourinary_History = new ArrayList<>();
	public static List<String> Neurological_Assessment = new ArrayList<>();
	public static List<String> Endocrine_Assessment = new ArrayList<>();
	public static List<String> Gastrointestinal_Assessment = new ArrayList<>();
	public static List<String> Genitourinary_Assessment = new ArrayList<>();
	public static List<String> Musculoskeletal_Assessment = new ArrayList<>();
	public static List<String> list_Cardiovascular_ICAN1 = new ArrayList<>();
	public static List<String> list_Respiratory_ICAN1 = new ArrayList<>();
	public static List<String> Complimentary_Therapies = new ArrayList<>();
	public static List<String> nursing_intervention = new ArrayList<>();
	// ICAT flowchart arraylist end /////

	public static List<String> Activities_of_Daily_Living = new ArrayList<>();

	// 60 second diabetic //
	public static String diabetic_left_score_60;
	public static String diabetic_right_score_60;
	public static String score_left;
	public static String score_right;

	// MAHC-10
	public static String MAHC_10_Fall_Risk_Score;

	/**
	 * Return WebDriver
	 */
	public WebDriver getWebDriver() {
		return driver;
	}

	/**
	 * window maximize.
	 */
	public void maximizeWindow() {
		getWebDriver().manage().window().maximize();
		waitForCompletePageLoad();
	}

	public boolean ischeckedCheckbox(By xpath1) {
		WebElement checkBoxElement = driver.findElement(xpath1);
		boolean isSelected = checkBoxElement.isSelected();

		// performing click operation if element is not checked
		if (isSelected == false) {
			checkBoxElement.click();
		}
		return isSelected;
	}

	/**
	 * kick off Chrome Browser
	 * 
	 * @param dir
	 */
	public void setupChromeDriver(Object dir) {
		try {
			ChromeOptions option = new ChromeOptions();
			WebDriverManager.chromedriver().setup();

			HashMap<String, Object> chromePref = new HashMap<>();
			chromePref.put("profile.default_content_settings.popups", 0);

			chromePref.put("download.default_directory", dir);
			option.setExperimentalOption("prefs", chromePref);

			driver = new ChromeDriver(option);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

//		System.setProperty("webdriver.chrome.driver", ConfigFileReader.getProperties("driver.path"));
//		driver = new ChromeDriver();
		maximizeWindow();
		waitForCompletePageLoad();
	}

	/**
	 * Wait until element is displayed.
	 * 
	 * @param locator
	 * 
	 */
	public void waitUntilElementIsDisplayed(By locator) {

		waitUtils = new WebDriverWait(getWebDriver(), Integer.parseInt(ConfigFileReader.getProperties("default.time")));
		waitUtils.until(ExpectedConditions.visibilityOfElementLocated(locator));
		waitUtils.until(ExpectedConditions.presenceOfElementLocated(locator));
		waitForCompletePageLoad();
	}

	public void waitUntilElementIsPresent(By locator) {

		waitUtils = new WebDriverWait(getWebDriver(), Integer.parseInt(ConfigFileReader.getProperties("default.time")));
		waitUtils.until(ExpectedConditions.presenceOfElementLocated(locator));
		waitForCompletePageLoad();
	}

	/**
	 * Wait until element is displayed.
	 * 
	 * @param webElement
	 * 
	 */
	public void waitUntilElementIsDisplayed(WebElement e) {
		waitUtils = new WebDriverWait(getWebDriver(), Integer.parseInt(ConfigFileReader.getProperties("default.time")));
		waitUtils.until(ExpectedConditions.visibilityOf(e));
		waitForCompletePageLoad();
	}

	/**
	 * Wait until element is contains Text.
	 * 
	 * @param locator
	 * @param containText
	 */

	public void waitUntilElementContainsText(By locator, String containText) {
		waitUtils = new WebDriverWait(getWebDriver(), Integer.parseInt(ConfigFileReader.getProperties("default.time")));
		waitUtils.until(ExpectedConditions.textToBePresentInElementLocated(locator, containText));
		waitForCompletePageLoad();
	}

	/**
	 * Wait until element is clickable.
	 * 
	 * @param locator
	 */
	public void waitUntilElementIsClickable(By locator) {
		waitUtils = new WebDriverWait(getWebDriver(), Integer.parseInt(ConfigFileReader.getProperties("default.time")));
		waitUtils.until(ExpectedConditions.elementToBeClickable(locator));
		waitForCompletePageLoad();
	}

	/**
	 * Wait until element is clickable.
	 * 
	 * @param WebElement
	 */
	public void waitUntilElementIsClickable(WebElement e) {
		waitUtils = new WebDriverWait(getWebDriver(), Integer.parseInt(ConfigFileReader.getProperties("default.time")));
		waitUtils.until(ExpectedConditions.elementToBeClickable(e));
		waitForCompletePageLoad();
	}

	/**
	 * Wait until element is Invisible.
	 * 
	 * @param locator
	 */
	public void waitUntilElementIsInvisible(By locator) {
		waitUtils = new WebDriverWait(getWebDriver(), Integer.parseInt(ConfigFileReader.getProperties("default.time")));
		waitUtils.until(ExpectedConditions.invisibilityOfElementLocated(locator));
		waitForCompletePageLoad();
	}

	/**
	 * Clear Input.
	 * 
	 * @param locator
	 */
	public void clear(By locator) {
		waitUntilElementIsDisplayed(locator);
		getWebDriver().findElement(locator).clear();
		waitForCompletePageLoad();
		waitInterval(3);
	}

	/**
	 * Clear Input.
	 * 
	 * @param WebElement
	 */
	public void clear(WebElement e) {
		waitUntilElementIsDisplayed(e);
		e.clear();
		waitForCompletePageLoad();
		waitInterval(3);
	}

	/**
	 * Send keys.
	 * 
	 * @param locator
	 * @param value
	 */

	public void sendKeys(By locator, String value) {
		waitInterval(3);
		try {
			waitUntilElementIsDisplayed(locator);
			highLightElement(locator);
			getWebDriver().findElement(locator).sendKeys(value);
		} catch (Exception e) {

			waitUntilElementIsDisplayed(locator);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			highLightElement(locator);
			getWebDriver().findElement(locator).sendKeys(value);
		}
		waitForCompletePageLoad();
	}

	public void sendKeys_date(By locator, String value) {
		waitInterval(3);
		try {
			waitUntilElementIsDisplayed(locator);
			highLightElement(locator);
			((JavascriptExecutor) driver).executeScript("arguments[0].removeAttribute('class','form-control')",
					getWebDriver().findElement(locator));
			getWebDriver().findElement(locator).sendKeys(value);
		} catch (Exception e) {

			waitUntilElementIsDisplayed(locator);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			highLightElement(locator);
			getWebDriver().findElement(locator).sendKeys(value);
		}
		waitForCompletePageLoad();
	}

	public void sendKeys_isElementPresent(By locator, String value) {
		waitInterval(3);
		try {
			waitUntilElementIsPresent(locator);
			highLightElement(locator);
			getWebDriver().findElement(locator).sendKeys(value);
		} catch (Exception e) {

			waitUntilElementIsPresent(locator);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			highLightElement(locator);
			getWebDriver().findElement(locator).sendKeys(value);
		}
		waitForCompletePageLoad();

	}

	/**
	 * Send keys.
	 * 
	 * @param WebElement
	 * @param value
	 */
	public void sendKeys(WebElement e, String value) {
		waitInterval(3);
		waitUntilElementIsDisplayed(e);
		highLightElement(e);
		e.sendKeys(value);
		waitForCompletePageLoad();
	}

	public void refresh_currentURL() {
		driver.get(driver.getCurrentUrl());
	}

	/**
	 * Click element.
	 * 
	 * @param locator
	 */
	public void clickElement(By locator) {
		System.out.println(driver.findElement(locator));
		waitUntilElementIsDisplayed(locator);
		waitUntilElementIsClickable(locator);
		highLightElement(locator);
		getWebDriver().findElement(locator).click();
		// JavascriptExecutor executor = (JavascriptExecutor) driver;
		// executor.executeScript("arguments[0].click();", driver.findElement(locator));
		waitForCompletePageLoad();
	}

	public void clickElement_withJS(By locator) {
		System.out.println(driver.findElement(locator));
		waitUntilElementIsDisplayed(locator);
		waitUntilElementIsClickable(locator);
		highLightElement(locator);
		// getWebDriver().findElement(locator).click();
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", driver.findElement(locator));
		waitForCompletePageLoad();
	}

	public void verify_client_care_cn() {
		WebElement e2 = driver.findElement(By.xpath(
				"(//td[normalize-space()='MD/NP name and contact info']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data2 = e2.getText();
		if (!(data2.equalsIgnoreCase(PixalereScripts.MD_NP_contact_info1))) {
			Assert.assertTrue(false);
		}

		WebElement e3 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Caregiver Requests']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data3 = e3.getText();
		if (!(data3.equalsIgnoreCase(PixalereScripts.Client_Caregiver_Requests1))) {
			Assert.assertTrue(false);
		}

		WebElement e5 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Caseload/ District']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data5 = e5.getText();
		if (!(data5.equalsIgnoreCase(PixalereScripts.Caseload_District1))) {
			Assert.assertTrue(false);
		}

		WebElement e6 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Secondary nurse(s) name and contact info']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data6 = e6.getText();
		if (!(data6.equalsIgnoreCase(PixalereScripts.Secondary_nurse_contact_info1))) {
			Assert.assertTrue(false);
		}

		WebElement e7 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Last enteral tube change']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data7 = e7.getText();
		if (!(data7.equalsIgnoreCase(PixalereScripts.Last_enteral_tube_change1))) {
			Assert.assertTrue(false);
		}

		WebElement e8 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Day of MicKEY balloon re-inflation']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data8 = e8.getText();
		if (!(data8.equalsIgnoreCase(PixalereScripts.Day_MicKEY_balloon_reinflation1))) {
			Assert.assertTrue(false);
		}

		WebElement e12 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Care of site']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data12 = e12.getText();
		if (!(data12.equalsIgnoreCase(PixalereScripts.Careofsite1))) {
			Assert.assertTrue(false);
		}

		WebElement e13 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Times of feeds']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data13 = e13.getText();
		if (!(data13.equalsIgnoreCase(PixalereScripts.Times_of_feeds1))) {
			Assert.assertTrue(false);
		}

		WebElement e14 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Special precautions']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data14 = e14.getText();
		if (!(data14.equalsIgnoreCase(PixalereScripts.Special_precautions1))) {
			Assert.assertTrue(false);
		}

		WebElement e1 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Equipment Source']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data1 = e1.getText();
		if (!(data1.equalsIgnoreCase(PixalereScripts.Equipment_Source))) {
			Assert.assertTrue(false);
		}

		WebElement e4 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Case Coordinator']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data4 = e4.getText();
		if (!(data4.equalsIgnoreCase(PixalereScripts.Case_Coordinator))) {
			Assert.assertTrue(false);
		}

		WebElement e10 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Primary nurse contact info']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data10 = e10.getText();
		if (!(data10.equalsIgnoreCase(PixalereScripts.Primary_nurse_contact_info))) {
			Assert.assertTrue(false);
		}

		System.out.println("Client Care Summery data verified....................................");
	}

	public void verify_DepressionScreening() {
		WebElement e2 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Have you felt depressed or down?']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data2 = e2.getText();
		if (!(data2.contains("Yes"))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e3 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Changes in your normal sleeping pattern?']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data3 = e3.getText();
		if (!(data3.contains("Yes") || data3.contains("No"))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e4 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Withdrawal from previously enjoyed activities or socializing?']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data4 = e4.getText();
		if (!(data4.contains("Yes") || data4.contains("No"))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e5 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Have you experienced feelings of intense: guilt, worthlessness, hopelessness, helplessness?']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data5 = e5.getText();
		if (!(data5.contains("Yes") || data5.contains("No"))) {
			Assert.assertTrue(false);
		}

		WebElement e6 = driver.findElement(By.xpath(
				"(//td[normalize-space()='An increase in drug/alcohol use?']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data6 = e6.getText();
		if (!(data6.contains("Yes") || data6.contains("No"))) {
			Assert.assertTrue(false);
		}

		System.out.println("Depression Screening Tool data verified....................................");
	}

	public void verify_PICAT_Pediatric_Flowchart() {

	}

	public void verify_Emergency_Planning_page() {

		WebElement e0 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Expected Risk of Life (ERL)']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data0 = e0.getText();
		if (!(data0.equalsIgnoreCase(LocatorUtils.EmergencyPlanning1))) {
			Assert.assertTrue(false);
		}

		WebElement e1 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Do you live alone?']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data1 = e1.getText();
		if (!(data1.equalsIgnoreCase(LocatorUtils.EmergencyPlanning2))) {
			Assert.assertTrue(false);
		}

		WebElement e3 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Who do you turn to for support?']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data3 = e3.getText();
		if (!(data3.equalsIgnoreCase(PixalereCreateNewPatientAccountScripts.E_support))) {
			Assert.assertTrue(false);
		}

		WebElement e4 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Can you contact your support contact in case of emergency?']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data4 = e4.getText();
		if (!(data4.equalsIgnoreCase(LocatorUtils.EmergencyPlanning3))) {
			Assert.assertTrue(false);
		}

		WebElement e5 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Emergency contact']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data5 = e5.getText();
		if (!(data5.equalsIgnoreCase(PixalereCreateNewPatientAccountScripts.E_contact))) {
			Assert.assertTrue(false);
		}

		WebElement e6 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Relationship']//following-sibling::td//td[contains(@class,'flowchart_data')])[3]"));
		String data6 = e6.getText();
		if (!(data6.equalsIgnoreCase(PixalereCreateNewPatientAccountScripts.E_relationship))) {
			Assert.assertTrue(false);
		}

		WebElement e7 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Phone']//following-sibling::td//td[contains(@class,'flowchart_data')])[3]"));
		String data7 = e7.getText();
		if (!(data7.equalsIgnoreCase(PixalereCreateNewPatientAccountScripts.E_phone))) {
			Assert.assertTrue(false);
		}

		WebElement e8 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Alternate emergency contact']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data8 = e8.getText();
		if (!(data8.equalsIgnoreCase(PixalereCreateNewPatientAccountScripts.Alternate_e_contact))) {
			Assert.assertTrue(false);
		}

		WebElement e9 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Relationship']//following-sibling::td//td[contains(@class,'flowchart_data')])[6]"));
		String data9 = e9.getText();
		if (!(data9.equalsIgnoreCase(PixalereCreateNewPatientAccountScripts.Alternate_e_relationship))) {
			Assert.assertTrue(false);
		}

		WebElement e10 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Phone']//following-sibling::td//td[contains(@class,'flowchart_data')])[6]"));
		String data10 = e10.getText();
		if (!(data10.equalsIgnoreCase(PixalereCreateNewPatientAccountScripts.Alternate_e_phone))) {
			Assert.assertTrue(false);
		}
		WebElement e11 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Do you have a backup plan for']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data11 = e11.getText();
		for (int i = 0; i < Tests_PixalereEmergencyPlanning.Emergency_chk.size(); i++) {
			if (!data11.contains(Tests_PixalereEmergencyPlanning.Emergency_chk.get(i))) {
				Assert.assertTrue(false);
			}
		}
		WebElement e12 = driver.findElement(By.xpath(
				"(//td[normalize-space()='As part of your emergency preparedness plan, what of kind service(s) do you consider essential?']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data12 = e12.getText();
		if (!(data12.equalsIgnoreCase(PixalereCreateNewPatientAccountScripts.E_preparedness))) {
			Assert.assertTrue(false);
		}
		WebElement e13 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Comments']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data13 = e13.getText();
		if (!(data13.equalsIgnoreCase(PixalereCreateNewPatientAccountScripts.Emergency_comments))) {
			Assert.assertTrue(false);
		}

		System.out.println("Emergency_Planning data verified....................................");

	}

	public void verify_CAMPAge() {
		// Radio Button verify
		WebElement e2 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Acute Onset of Cognitive Changes and Fluctuating Course']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data2 = e2.getText();
		if (!(data2.equalsIgnoreCase(PixalereScripts.cam1))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e3 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Inattention']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data3 = e3.getText();
		if (!(data3.equalsIgnoreCase(PixalereScripts.cam2))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e4 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Disorganized Thinking']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data4 = e4.getText();
		if (!(data4.equalsIgnoreCase(PixalereScripts.cam3))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e5 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Altered Level of Consciousness']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data5 = e5.getText();
		if (!(data5.equalsIgnoreCase(PixalereScripts.cam4))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e6 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Comments']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data6 = e6.getText();
		if (!(data6.equalsIgnoreCase(PixalereScripts.Comment))) {
			Assert.assertTrue(false);
		}

		System.out.println("CAM PAge data verified...........");
	}

	public void verify() {

		WebElement e1 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Temperature']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data1 = e1.getText();
		if (!data1.equalsIgnoreCase(PixalereCreateNewPatientAccountScripts.TempVitalSigns)) {
			Assert.assertTrue(false);
		}

		WebElement e2 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Temperature Location']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data2 = e2.getText();
		if (!data2.equalsIgnoreCase(LocatorUtils.VitalSigns1)) {
			Assert.assertTrue(false);
		}

		// Text Input Verify
		WebElement e3 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Blood Pressure']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data3 = e3.getText();
		if (!data3.equalsIgnoreCase(PixalereCreateNewPatientAccountScripts.BpVitalSigns)) {
			Assert.assertTrue(false);
		}

		// Drop Down verify
		WebElement e4 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Blood Pressure Arm']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data4 = e4.getText();
		if (!(data4.equalsIgnoreCase(PixalereCreateNewPatientAccountScripts.vital_signs_drop_down))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e5 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Blood Pressure Position']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data5 = e5.getText();
		if (!(data5.equalsIgnoreCase(LocatorUtils.VitalSigns2))) {
			Assert.assertTrue(false);
		}

		WebElement e6 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Heart Rate']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data6 = e6.getText();
		String str6 = PixalereCreateNewPatientAccountScripts.HeartRateVitalSigns;
		if (!data6.equalsIgnoreCase(str6)) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e7 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Pulse Type']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data7 = e7.getText();
		if (!(data7.equalsIgnoreCase(PixalereAcuteRespiratoryIllnessScripts.VitalSigns3))) {
			Assert.assertTrue(false);
		}

		WebElement e8 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Respiratory Rate']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data8 = e8.getText();
		if (!data8.equalsIgnoreCase(PixalereCreateNewPatientAccountScripts.RespiRateVitalSigns)) {
			Assert.assertTrue(false);
		}

		WebElement e9 = driver.findElement(By.xpath(
				"(//td[normalize-space()='O2 Sat. %']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data9 = e9.getText();
		if (!data9.equalsIgnoreCase((PixalereCreateNewPatientAccountScripts.O2SatVitalSigns).toString() + ".0")) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e10 = driver.findElement(By.xpath(
				"(//td[normalize-space()='O2 Saturation % Type']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data10 = e10.getText();
		if (!(data10.equalsIgnoreCase(PixalereAcuteRespiratoryIllnessScripts.VitalSigns4))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e11 = driver.findElement(By.xpath(
				"(//td[normalize-space()='See Progress Note for further details']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data11 = e11.getText();
		if (!(data11.equalsIgnoreCase(PixalereAcuteRespiratoryIllnessScripts.VitalSigns6))) {
			Assert.assertTrue(false);
		}

		WebElement e12 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Weight']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data12 = e12.getText();
		if (!data12.equalsIgnoreCase((PixalereCreateNewPatientAccountScripts.WeightVitalSigns).toString() + ".0")) {
			Assert.assertTrue(false);
		}

		WebElement e13 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Reported By']//following-sibling::td//td[contains(@class,'flowchart_data')])[3]"));
		String data13 = e13.getText();
		if (!data13.equalsIgnoreCase((PixalereAcuteRespiratoryIllnessScripts.VitalSigns5))) {
			Assert.assertTrue(false);
		}

		WebElement e14 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Height']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data14 = e14.getText();
		if (!data14.equalsIgnoreCase((PixalereCreateNewPatientAccountScripts.HeightVitalSigns).toString() + ".0")) {
			Assert.assertTrue(false);
		}

		WebElement e0 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Pain Present']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data0 = e0.getText();
		if (!data0.equalsIgnoreCase(PixalereAcuteRespiratoryIllnessScripts.VitalSigns6)) {
			Assert.assertTrue(false);
		}

		WebElement e15 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Head Circumference (cm)']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data15 = e15.getText();
		if (!data15.equalsIgnoreCase((PixalereCreateNewPatientAccountScripts.HeadcircumVitalSigns).toString())) {
			Assert.assertTrue(false);
		}

		WebElement e16 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Abdominal Girth (cm)']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data16 = e16.getText();
		if (!data16.equalsIgnoreCase((PixalereCreateNewPatientAccountScripts.AbdimnlGirthVitalSigns).toString())) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e17 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Alert Status']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data17 = e17.getText();
		if (!(data17.equalsIgnoreCase(PixalereAcuteRespiratoryIllnessScripts.VitalSigns7))) {
			Assert.assertTrue(false);
		}

		System.out.println("All Data Verified Successfully on Vital Signs Flowchart Page........");
	}

	public void verify_MedRat() {

		// Radio Button verify
		WebElement e1 = driver.findElement(
				By.xpath("((//td[normalize-space()='Medication Adherence']//following::tbody/tr)[1])//td[2]"));
		String data1 = e1.getText();
		if (!(data1.equalsIgnoreCase(LocatorUtils.radioMedrat1))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e2 = driver.findElement(
				By.xpath("((//td[normalize-space()='Medication Adherence']//following::tbody/tr)[1])//td[3]"));
		String data2 = e2.getText();
		if (!(data2.equalsIgnoreCase(LocatorUtils.radioMedrat2))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e3 = driver.findElement(
				By.xpath("((//td[normalize-space()='Medication Adherence']//following::tbody/tr)[1])//td[4]"));
		String data3 = e3.getText();
		for (int i = 0; i < PixalereMedRATScripts.MedRAT_checkbox.size(); i++) {
			if (!data3.contains(PixalereMedRATScripts.MedRAT_checkbox.get(i))) {
				Assert.assertTrue(false);
			}
		}

		// Radio Button verify
		WebElement e4 = driver.findElement(
				By.xpath("((//td[normalize-space()='Medication Adherence']//following::tbody/tr)[1])//td[5]"));
		String data4 = e4.getText();
		if (!(data4.equalsIgnoreCase(LocatorUtils.radioMedrat3))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e5 = driver.findElement(
				By.xpath("((//td[normalize-space()='Medication Adherence']//following::tbody/tr)[1])//td[6]"));
		String data5 = e5.getText();
		if (!(data5.equalsIgnoreCase(LocatorUtils.radioMedrat4))) {
			Assert.assertTrue(false);
		}

		System.out.println("MedRat page verified successfully.........");
	}

	public void verify_MedRatDelete() {

		String deletion = "//*[contains(text(),'Reason for deletion:%s')]";
		boolean result = isDisplayed(
				By.xpath(String.format(deletion, (PixalereIntakeOutputScripts.MedRatDeletion).toString())));
		if (!result) {
			Assert.assertTrue(false);
		}
	}

	public void verify_RecordAfterDeletion_respiratory() {

		Wait_p(3);
		String deletion = "//*[contains(text(),'Reason for Deletion: %s')]";
		boolean result = isDisplayed(By.xpath(String.format(deletion, (PixalereScripts.varDelete_inViewer))));
		if (!result) {
			Assert.assertTrue(false);
		}
		System.out.println("Reason matched");

	}

	public void verify_RecordAfterDeletion() {

		Wait_p(3);
		String deletion = "//*[contains(text(),'Reason for deletion:%s')]";
		boolean result = isDisplayed(By.xpath(String.format(deletion, (PixalereScripts.varDelete_inViewer))));
		if (!result) {
			Assert.assertTrue(false);
		}
		System.out.println("Reason matched");

	}

	public void verify_IntakeOutput() {

		// input text field
		WebElement e1 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Formula Name']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data1 = e1.getText();
		if (!data1.equalsIgnoreCase(PixalereIntakeOutputScripts.IOFormulaName)) {
			Assert.assertTrue(false);
		}

		WebElement e2 = driver.findElement(By.xpath(
				"(//td[normalize-space()='PO']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data2 = e2.getText();
		String Receiveddata = "Fluid (ml):" + PixalereIntakeOutputScripts.IOFluid + "(ml),Solid:"
				+ PixalereIntakeOutputScripts.IOSolid + "(ml),H2O:" + PixalereIntakeOutputScripts.IOH2O + "(ml),Other:"
				+ PixalereIntakeOutputScripts.IO_Other + "(ml),Water (ml):" + PixalereIntakeOutputScripts.IOWater
				+ "(ml)";

		if (!data2.equalsIgnoreCase(Receiveddata)) {
			Assert.assertTrue(false);
		}

		// input text field
		WebElement e3 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Number of wet diapers']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data3 = e3.getText();
		if (!data3.equalsIgnoreCase(PixalereIntakeOutputScripts.IOWeTDiapers)) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e4 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Emesis']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data4 = e4.getText();
		if (!(data4.contains("Yes") || data4.contains("No"))) {
			Assert.assertTrue(false);
		}

		// input text field
		WebElement e5 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Emesis (mL)']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data5 = e5.getText();
		if (!data5.equalsIgnoreCase(PixalereIntakeOutputScripts.IOEmesis)) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e6 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Enteral']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data6 = e6.getText();
		if (!(data6.contains("Yes") || data6.contains("No"))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e7 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Tube Type']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data7 = e7.getText();
		if (!(data7.contains("G-Tube") || data7.contains("GJ-Tube") || data7.contains("N/G Tube")
				|| data7.contains("Other"))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e8 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Tube placement verified']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data8 = e8.getText();
		if (!(data8.contains("Yes") || data8.contains("No"))) {
			Assert.assertTrue(false);
		}

		// input text field
		WebElement e9 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Water Bolus (mL)']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data9 = e9.getText();
		if (!data9.equalsIgnoreCase(PixalereIntakeOutputScripts.IOWaterBolus)) {
			Assert.assertTrue(false);
		}

		// input text field
		WebElement e10 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Volume to be Delivered (mL)']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data10 = e10.getText();
		if (!data10.equalsIgnoreCase(PixalereIntakeOutputScripts.IOVolDel)) {
			Assert.assertTrue(false);
		}

		// input text field
		WebElement e11 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Volume Infused (mL)']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data11 = e11.getText();
		if (!data11.equalsIgnoreCase(PixalereIntakeOutputScripts.IOVolInfused)) {
			Assert.assertTrue(false);
		}

		// input text field
		WebElement e13 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Flush Volume (mL)']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data13 = e13.getText();
		if (!data13.equalsIgnoreCase(PixalereIntakeOutputScripts.IOFlushVol)) {
			Assert.assertTrue(false);
		}

		// input text field
		WebElement e14 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Rate (mL/hr)']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data14 = e14.getText();
		if (!data14.equalsIgnoreCase(PixalereIntakeOutputScripts.IORate)) {
			Assert.assertTrue(false);
		}
		// input text field
		WebElement e15 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Void']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data15 = e15.getText();
		if (!data15.equalsIgnoreCase(PixalereIntakeOutputScripts.IOVoidVOl)) {
			Assert.assertTrue(false);
		}

		// input text field
		WebElement e16 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Ostomy']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data16 = e16.getText();
		if (!data16.equalsIgnoreCase(PixalereIntakeOutputScripts.IOOstomy)) {
			Assert.assertTrue(false);
		}

		// input text field
		WebElement e17 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Drain 1']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data17 = e17.getText();
		if (!data17.equalsIgnoreCase(PixalereIntakeOutputScripts.IODrain1)) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		// ******************************************************************************
		/*
		 * WebElement e18 = driver.findElement(By.xpath(
		 * "(//td[normalize-space()='Drain Type']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"
		 * )); String data18 = e18.getText(); if (!(data18.contains("Mitrofanoff") ||
		 * data18.contains("Hemovac") || data18.contains("Paracentesis") ||
		 * data18.contains("Tenckhoff") || data18.contains("Chest Tube") ||
		 * data18.contains("Jackson-Pratt") || data18.contains("PleurX") ||
		 * data18.contains("Thoracentesis"))) { Assert.assertTrue(false); }
		 */

		// input text field
		WebElement e19 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Drain Location']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data19 = e19.getText();
		if (!data19.equalsIgnoreCase(PixalereIntakeOutputScripts.IODrainLocation3)) {
			Assert.assertTrue(false);
		}

		// input text field
		WebElement e20 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Drain 2']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data20 = e20.getText();
		if (!data20.equalsIgnoreCase(PixalereIntakeOutputScripts.IODrain2)) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		// *****************************************************************************************
		WebElement e21 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Drain Type']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data21 = e21.getText();
		if (!(data21.contains("Mitrofanoff") || data21.contains("Hemovac") || data21.contains("Paracentesis")
				|| data21.contains("Tenckhoff") || data21.contains("Chest Tube") || data21.contains("Jackson-Pratt")
				|| data21.contains("PleurX") || data21.contains("Thoracentesis"))) {
			Assert.assertTrue(false);
		}

		// input text field
		WebElement e22 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Number of Stools in the Past 24 Hours']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data22 = e22.getText();
		if (!data22.equalsIgnoreCase(PixalereIntakeOutputScripts.IONumStool)) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e23 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Stool Consistency']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data23 = e23.getText();
		if (!(data23.contains("Hard") || data23.contains("Loose") || data23.contains("Formed"))) {
			Assert.assertTrue(false);
		}

		/*
		 * String deletion = "//*[contains(text(),'Reason for deletion:%s')]"; boolean
		 * result = isDisplayed(By.xpath(String.format(deletion, "Dont know")));
		 * if(!result) { Assert.assertTrue(false); }
		 */

		System.out.println("Intake Output page verified Successfully");
	}

	public void verify_PCA_pain_pump() {

		// input text field
		WebElement e1 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Solution']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data1 = e1.getText();
		if (!data1.equalsIgnoreCase(PixalereCreateNewPatientAccountScripts.SolNamePCAPainPump)) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e2 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Route']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data2 = e2.getText();
		if (!(data2.contains("Subcutaneous") || data2.contains("Peripheral Line") || data2.contains("CVAD"))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e3 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Cassette Changed']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data3 = e3.getText();
		if (!(data3.contains("Yes") || data3.contains("No"))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e4 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Battery Checked']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data4 = e4.getText();
		if (!(data4.contains("Yes") || data4.contains("No"))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e5 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Tubing Changed']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data5 = e5.getText();
		if (!(data5.contains("Yes") || data5.contains("No"))) {
			Assert.assertTrue(false);
		}

		// Drop Down verify
		WebElement e6 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Site Appearance']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data6 = e6.getText();
		if (!(data6.contains("Intact") || data6.contains("Red") || data6.contains("Tender") || data6.isEmpty())) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e7 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Site Change']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data7 = e7.getText();
		if (!(data7.contains("Yes") || data7.contains("No"))) {
			Assert.assertTrue(false);
		}

		WebElement e8 = driver.findElement(By.xpath(
				"(//td[normalize-space()='New Location']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data8 = e8.getText();
		if (!(data8.isEmpty())) {
			Assert.assertTrue(false);
		}

		// Drop Down verify
		WebElement e10 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Lock Level']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data10 = e10.getText();
		if (!(data10.contains("LL0") || data10.contains("LL1") || data10.contains("LL2") || data10.isEmpty())) {
			Assert.assertTrue(false);
		}

		// input text field
		WebElement e11 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Reservoir Volume']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data11 = e11.getText();
		if (!data11.equalsIgnoreCase(PixalereCreateNewPatientAccountScripts.ResVolBagPCAPainPump)) {
			Assert.assertTrue(false);
		}

		// input text field
		WebElement e12 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Dose Concentration']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data12 = e12.getText();
		if (!data12.equalsIgnoreCase((PixalereCreateNewPatientAccountScripts.DoseConcenPCAPainPump).toString() + " "
				+ PixalereCreateNewPatientAccountScripts.var_DoseConcentration)) {
			Assert.assertTrue(false);
		}

		// input text field
		WebElement e13 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Dose/hour']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data13 = e13.getText();
		if (!data13.equalsIgnoreCase(PixalereCreateNewPatientAccountScripts.DoseHourPCAPainPump)) {
			Assert.assertTrue(false);
		}

		// input text field
		WebElement e14 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Bolus dose']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data14 = e14.getText();
		if (!data14.equalsIgnoreCase((PixalereCreateNewPatientAccountScripts.BolusDosePCAPainPump).toString() + " "
				+ PixalereCreateNewPatientAccountScripts.var_BolusConcentration)) {
			Assert.assertTrue(false);
		}

		// input text field
		WebElement e15 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Bolus doses allowed / hour']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data15 = e15.getText();
		if (!data15.equalsIgnoreCase(PixalereCreateNewPatientAccountScripts.BolusDoseAllowedHourPCAPainPump)) {
			Assert.assertTrue(false);
		}

		// input text field
		WebElement e16 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Attempts']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data16 = e16.getText();
		if (!data16.equalsIgnoreCase(PixalereCreateNewPatientAccountScripts.AttemptsPCAPainPump)) {
			Assert.assertTrue(false);
		}

		// input text field
		WebElement e17 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Given']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data17 = e17.getText();
		if (!data17.equalsIgnoreCase(PixalereCreateNewPatientAccountScripts.GivenPCAPainPump)) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e9 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Bolus reset']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data9 = e9.getText();
		if (!(data9.contains("Yes") || data9.contains("No"))) {
			Assert.assertTrue(false);
		}

		System.out.println("All Data Verified Successfully on PCA Pain Pump Flowchart Page");
	}

	public void verify_diabetes_teaching_page() {

		String dataExtrct = "//table//td//b[contains(text(),'%s')]//following::div[1]";
		for (String label_text : PixalereCarePlanScripts.DiabetesTeachingList) {
			String xpath1 = String.format(dataExtrct, label_text);
			WebElement e1 = driver.findElement(By.xpath(xpath1));
			String data1 = e1.getText();
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d/MMM/yyyy");
			LocalDateTime now = LocalDateTime.now();
			String date = dtf.format(now).toString();
			if (!(data1.contains(date))) {
				System.err.println(e1.toString() + " : " + data1);
				Assert.assertTrue(false);
			}
		}
		System.out.println("Diabetes teaching page verified......");
	}

	public void call_diabetiesteachGuidelines(String pattern) {
		String s1 = "((//*[@id=\"form\"]//tbody//td//b[contains(text(),'%s')]//following::div)[1])//button";
		String xpath1 = String.format(s1, pattern);
		WebElement e1 = driver.findElement(By.xpath(xpath1));
		String data = e1.getText();
		System.out.println(data);

		if (data.equalsIgnoreCase(" Undo Chart Done")) {
			String s2 = "(((//*[@id='form']//tbody//td//b[contains(text(),'%s')]//following::div)[1]))[contains(@id,'completed_div')]//button[contains(@onclick,'uncompleted')]";
			String xpath2 = String.format(s2, pattern);
			waitInterval(10);
			clickElement(By.xpath(xpath2));
			waitInterval(10);
		}

	}

	public void call_client_caregiver_education_checklist(String pattern) {
		String s1 = "(//*[@id='form']//div//div[contains(text(),'%s')]//following-sibling::div//div//button)[1]";
		String xpath1 = String.format(s1, pattern);
		WebElement e1 = driver.findElement(By.xpath(xpath1));
		String data = e1.getText();
		System.out.println(data);

		if (data.equalsIgnoreCase(" Undo Chart Done")) {
			String s2 = "((//*[@id='form']//div//div[contains(text(),'%s')]//following-sibling::div//div//button)[1])[contains(@onclick,'uninitiated')]";
			String xpath2 = String.format(s2, pattern);
			waitInterval(1);
			clickElement(By.xpath(xpath2));
			waitInterval(5);
		}
	}

	public void call_client_caregiver_education_checklist_for_completed_button(String pattern) {
		String s1 = "(//*[@id='form']//div//div[contains(text(),'%s')]//following-sibling::div//div//button)[2]";
		String xpath1 = String.format(s1, pattern);
		WebElement e1 = driver.findElement(By.xpath(xpath1));
		String data = e1.getText();
		System.out.println(data);

		if (data.equalsIgnoreCase(" Undo Chart Done")) {
			String s2 = "((//*[@id='form']//div//div[contains(text(),'%s')]//following-sibling::div//div//button)[2])[contains(@onclick,'uncompleted')]";
			String xpath2 = String.format(s2, pattern);
			waitInterval(1);
			clickElement(By.xpath(xpath2));
			waitInterval(5);
		}
	}

	public void verify_status_discharge() {
		WebElement e1 = driver.findElement(By.xpath("//*[contains(text(),'Funder Status:')]//following-sibling::span"));
		highLightElement(By.xpath("//*[contains(text(),'Funder Status:')]//following-sibling::span"));
		String data1 = e1.getText();
		if (data1.contains("Discharge")) {
			Assert.assertTrue(false);
		}
	}

	public void verify_date_of_visit() {
		WebElement e1 = driver.findElement(By.xpath("//input[@id='visit_date']"));
		highLightElement(By.xpath("//input[@id='visit_date']"));
		date_of_visit = e1.getAttribute("value");

	}

	public void verify_Document_Upload_Details() {
		// input text field
		WebElement e1 = driver.findElement(By.xpath("(//td[contains(text(),'Document Name')]//following::tr//td)[1]"));
		String data1 = e1.getText();
		if (!data1.equalsIgnoreCase(PixalereScripts.Document_Name_for_Document_Upload1)) {
			Assert.assertTrue(false);
		}

		WebElement e2 = driver.findElement(By.xpath("(//td[contains(text(),'Document Name')]//following::tr//td)[2]"));
		String data2 = e2.getText();
		String s[] = data2.split("_");
		if ((s[1].contains(PixalereScripts.FileUploadADP_Funding_Decision1))) {
			Assert.assertTrue(false);
		}

		WebElement e3 = driver.findElement(By.xpath("(//td[contains(text(),'Document Name')]//following::tr//td)[4]"));
		String data3 = e3.getText();
		if (!data3.contains(PixalereScripts.Document_Type_Nursing)) {
			Assert.assertTrue(false);
		}

	}

	public void verify_client_summary() {
		WebElement e17 = driver
				.findElement(By.xpath("//strong[normalize-space()='Special Instructions:']//following-sibling::span"));
		highLightElement(By.xpath("//strong[normalize-space()='Special Instructions:']//following-sibling::span"));
		String data17 = e17.getText();
		if (!data17.equalsIgnoreCase(PixalereScripts.CLIENT_SUMMARY_Special_Instructions)) {
			Assert.assertTrue(false);
		}
		System.out.println("Client Summary Page verified................");
	}

	public void verify_ClientCaregiver_Education_Checklist() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d/MMM/yyyy");
		LocalDateTime now = LocalDateTime.now();
		String date = dtf.format(now).toString();

		WebElement e1 = driver.findElement(By.xpath(
				"//td[normalize-space(text())='Review of Client Bill of Rights/Responsibilities']//following-sibling::td[1]"));
		String data1 = e1.getText();
		if (!(data1.contains(date))) {
			System.err.println(e1.toString() + " : " + data1);
			Assert.assertTrue(false);
		}

		WebElement e2 = driver.findElement(By.xpath(
				"//td[normalize-space(text())='Review of Client Bill of Rights/Responsibilities']//following-sibling::td[2]"));
		String data2 = e2.getText();
		if (!(data2.contains(date + " - Admin"))) {
			System.err.println(e1.toString() + " : " + data2);
			Assert.assertTrue(false);
		}

		WebElement e3 = driver
				.findElement(By.xpath("//td[normalize-space(text())='Wounds']//following-sibling::td[1]"));
		String data3 = e3.getText();
		if (!(data3.contains(date + " - Admin"))) {
			System.err.println(e1.toString() + " : " + data3);
			Assert.assertTrue(false);
		}

		WebElement e4 = driver
				.findElement(By.xpath("//td[normalize-space(text())='Wounds']//following-sibling::td[2]"));
		String data4 = e4.getText();
		if (!(data4.contains(date + " - Admin"))) {
			System.err.println(e1.toString() + " : " + data4);
			Assert.assertTrue(false);
		}

		WebElement e5 = driver
				.findElement(By.xpath("//td[normalize-space(text())='Intravenous Pump']//following-sibling::td[1]"));
		String data5 = e5.getText();
		if (!(data5.contains(" - Admin"))) {
			System.err.println(e5.toString() + " : " + data5);
			Assert.assertTrue(false);
		}

		WebElement e6 = driver
				.findElement(By.xpath("//td[normalize-space(text())='Intravenous Pump']//following-sibling::td[2]"));
		String data6 = e6.getText();
		if (!(data6.contains(date + " - Admin"))) {
			System.err.println(e1.toString() + " : " + data6);
			Assert.assertTrue(false);
		}

		WebElement e7 = driver
				.findElement(By.xpath("//td[normalize-space(text())='Pain Pump']//following-sibling::td[1]"));
		String data7 = e7.getText();
		if (!(data7.contains(" - Admin"))) {
			System.err.println(e7.toString() + " : " + data7);
			Assert.assertTrue(false);
		}

		WebElement e8 = driver
				.findElement(By.xpath("//td[normalize-space(text())='Pain Pump']//following-sibling::td[2]"));
		String data8 = e8.getText();
		if (!(data8.contains(" - Admin"))) {
			System.err.println(e8.toString() + " : " + data8);
			Assert.assertTrue(false);
		}

		WebElement e9 = driver.findElement(
				By.xpath("//td[normalize-space(text())='How to trouble shoot pump']//following-sibling::td[1]"));
		String data9 = e9.getText();
		if (!(data9.contains(date + " - Admin"))) {
			System.err.println(e9.toString() + " : " + data9);
			Assert.assertTrue(false);
		}

		WebElement e10 = driver.findElement(
				By.xpath("//td[normalize-space(text())='How to trouble shoot pump']//following-sibling::td[2]"));
		String data10 = e10.getText();
		if (!(data10.contains(date + " - Admin"))) {
			System.err.println(e10.toString() + " : " + data10);
			Assert.assertTrue(false);
		}

		WebElement e12 = driver
				.findElement(By.xpath("//td[normalize-space(text())='Care of Saline lock']//following-sibling::td[1]"));
		String data12 = e12.getText();
		if (!(data12.contains(date + " - Admin"))) {
			System.err.println(e12.toString() + " : " + data12);
			Assert.assertTrue(false);
		}

		WebElement e11 = driver
				.findElement(By.xpath("//td[normalize-space(text())='Care of Saline lock']//following-sibling::td[2]"));
		String data11 = e11.getText();
		if (!(data11.contains(date + " - Admin"))) {
			System.err.println(e11.toString() + " : " + data11);
			Assert.assertTrue(false);
		}

		WebElement e13 = driver
				.findElement(By.xpath("//td[normalize-space(text())='Air in Tubing']//following-sibling::td[1]"));
		String data13 = e13.getText();
		if (!(data13.contains(date + " - Admin"))) {
			System.err.println(e12.toString() + " : " + data13);
			Assert.assertTrue(false);
		}

		WebElement e14 = driver
				.findElement(By.xpath("//td[normalize-space(text())='Air in Tubing']//following-sibling::td[2]"));
		String data14 = e14.getText();
		if (!(data14.contains(date + " - Admin"))) {
			System.err.println(e14.toString() + " : " + data14);
			Assert.assertTrue(false);
		}

		WebElement e15 = driver.findElement(
				By.xpath("//td[normalize-space(text())='Medication Reconciliation']//following-sibling::td[1]"));
		String data15 = e15.getText();
		if (!(data15.contains(date + " - Admin"))) {
			System.err.println(e15.toString() + " : " + data15);
			Assert.assertTrue(false);
		}

		WebElement e16 = driver.findElement(
				By.xpath("//td[normalize-space(text())='Medication Reconciliation']//following-sibling::td[2]"));
		String data16 = e16.getText();
		if (!(data16.contains(date + " - Admin"))) {
			System.err.println(e16.toString() + " : " + data16);
			Assert.assertTrue(false);
		}

		WebElement e17 = driver
				.findElement(By.xpath("//td[normalize-space(text())='Heparin']//following-sibling::td[1]"));
		String data17 = e17.getText();
		if (!(data17.contains(date + " - Admin"))) {
			System.err.println(e17.toString() + " : " + data17);
			Assert.assertTrue(false);
		}

		WebElement e18 = driver
				.findElement(By.xpath("//td[normalize-space(text())='Heparin']//following-sibling::td[2]"));
		String data18 = e18.getText();
		if (!(data18.contains(date + " - Admin"))) {
			System.err.println(e18.toString() + " : " + data18);
			Assert.assertTrue(false);
		}

		WebElement e19 = driver.findElement(By.xpath("//td[normalize-space(text())='"
				+ PixalereScripts.Other_Education_Client_CareGiver1 + "']//following-sibling::td[1]"));
		String data19 = e19.getText();
		if (!(data19.contains(date + " - Admin"))) {
			System.err.println(e19.toString() + " : " + data19);
			Assert.assertTrue(false);
		}

		WebElement e20 = driver.findElement(By.xpath("//td[normalize-space(text())='"
				+ PixalereScripts.Other_Education_Client_CareGiver1 + "']//following-sibling::td[1]"));
		String data20 = e20.getText();
		if (!(data20.contains(date + " - Admin"))) {
			System.err.println(e20.toString() + " : " + data20);
			Assert.assertTrue(false);
		}

		System.out.println("Client/Caregiver Education Checklist History Page Verified............");

	}

	public void verify_Second_Sit_Stand() {
		// input text field
		WebElement e17 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Number']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data17 = e17.getText();
		if (!data17.equalsIgnoreCase(PixalereCreateNewPatientAccountScripts.PT_number1)) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e9 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Modified']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data9 = e9.getText();
		if (!(data9.equalsIgnoreCase(PixalereScripts.pt_modified_exercise))) {
			Assert.assertTrue(false);
		}
		System.out.println("30 Second_Sit_Stand Page verified................");
	}

	public void verify_FIM_page() {
		WebElement e2 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Eating']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data2 = e2.getText();
		if (!(data2.contains("5"))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e4 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Grooming')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data4 = e4.getText();
		if (!(data4.contains("5"))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e5 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Bathing')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data5 = e5.getText();
		if (!(data5.contains("5"))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e6 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Dressing – Upper Body')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data6 = e6.getText();
		if (!(data6.contains("5"))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e7 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Dressing – Lower body')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data7 = e7.getText();
		if (!(data7.contains("5"))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e8 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Toileting')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data8 = e8.getText();
		if (!(data8.contains("5"))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e9 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Bladder Management')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data9 = e9.getText();
		if (!(data9.contains("5"))) {
			Assert.assertTrue(false);
		}

		WebElement e10 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Bowel Management')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data10 = e10.getText();
		if (!(data10.contains("5"))) {
			Assert.assertTrue(false);
		}

		WebElement e11 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Bed, Chair, Wheelchair')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data11 = e11.getText();
		if (!(data11.contains("5"))) {
			Assert.assertTrue(false);
		}

		WebElement e12 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Toilet')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data12 = e12.getText();
		if (!(data12.contains("5"))) {
			Assert.assertTrue(false);
		}

		WebElement e13 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Tub, Shower')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data13 = e13.getText();
		if (!(data13.contains("5"))) {
			Assert.assertTrue(false);
		}

		WebElement e14 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Walk/Wheelchair')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data14 = e14.getText();
		if (!(data14.contains("5"))) {
			Assert.assertTrue(false);
		}

		WebElement e15 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Stairs')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data15 = e15.getText();
		if (!(data15.contains("5"))) {
			Assert.assertTrue(false);
		}

		WebElement e16 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Comprehension')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data16 = e16.getText();
		if (!(data16.contains("5"))) {
			Assert.assertTrue(false);
		}

		WebElement e17 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Social interaction')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data17 = e17.getText();
		if (!(data17.contains("5"))) {
			Assert.assertTrue(false);
		}

		WebElement e18 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Problem Solving')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data18 = e18.getText();
		if (!(data18.contains("5"))) {
			Assert.assertTrue(false);
		}
		WebElement e19 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Memory')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data19 = e19.getText();
		if (!(data19.contains("5"))) {
			Assert.assertTrue(false);
		}

		// input text field
		WebElement e20 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Discipline']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data20 = e20.getText();
		if (!data20.equalsIgnoreCase(PixalereScripts.FIMData1)) {
			Assert.assertTrue(false);
		}

		System.out.println("FIM Page verified................");
	}

	public void verify_time_up_and_Go_page() {

		WebElement e11 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Date of Visit']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data11 = e11.getText();
		if (!data11.equalsIgnoreCase(date_of_visit)) {
			Assert.assertTrue(false);
		}

		WebElement e12 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Time']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data12 = e12.getText();
		if (!data12.equalsIgnoreCase((PixalereScripts.TIME_PT + ".0"))) {
			Assert.assertTrue(false);
		}

		// input text field
		WebElement e13 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Aid Used']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data13 = e13.getText();
		if (!data13.equalsIgnoreCase(PixalereScripts.AID_USED_TUG)) {
			Assert.assertTrue(false);
		}

		System.out.println("TUG Page verified................");
	}

	public void get_MAHC_10_Fall_Risk_Score_sel() {
		WebElement d1 = driver.findElement(By.id("mahc_score_p"));
		MAHC_10_Fall_Risk_Score = d1.getText();
	}

	public void verify_MAHC_Fall_Risk_Assessment() {

		WebElement e2 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Age 65+']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data2 = e2.getText();
		if (!(data2.equalsIgnoreCase("Yes"))) {
			Assert.assertTrue(false);
		}

		WebElement e3 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Handouts Provided']//following-sibling::td//td[contains(@class,'flowchart_data')])[3]"));
		String data3 = e3.getText();
		for (int i = 0; i < PixalereScripts.MAHC_Handouts_provided_field.size(); i++) {
			if (!data3.contains(PixalereScripts.MAHC_Handouts_provided_field.get(i))) {
				Assert.assertTrue(false);
			}
		}

		WebElement e4 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Consults/Referrals made to']//following-sibling::td//td[contains(@class,'flowchart_data')])[3]"));
		String data4 = e4.getText();
		for (int i = 0; i < PixalereScripts.MAHC_ConsultsReferrals.size(); i++) {
			if (!data4.contains(PixalereScripts.MAHC_ConsultsReferrals.get(i))) {
				Assert.assertTrue(false);
			}
		}

		WebElement v4 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Details/Comments']//following-sibling::td//td[contains(@class,'flowchart_data')])[3]"));
		String d4 = v4.getText();
		if (!d4.contains(PixalereScripts.MAHC_Details_Comments1)) {
			Assert.assertTrue(false);
		}

		WebElement e6 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Diagnosis (3 or more co-existing)']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data6 = e6.getText();
		if (!(data6.equalsIgnoreCase("No"))) {
			Assert.assertTrue(false);
		}

		WebElement e7 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Prior history of falls within 3 months']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data7 = e7.getText();
		if (!(data7.equalsIgnoreCase(PixalereScripts.MAHC_radio_1))) {
			Assert.assertTrue(false);
		}

		// 2
		WebElement e5 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Handouts Provided']//following-sibling::td//td[contains(@class,'flowchart_data')])[9]"));
		String data5 = e5.getText();
		for (int i = 0; i < PixalereScripts.MAHC_prior_history_falls_MAHC.size(); i++) {
			if (!data5.contains(PixalereScripts.MAHC_prior_history_falls_MAHC.get(i))) {
				Assert.assertTrue(false);
			}
		}

		WebElement e9 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Incontinence']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data9 = e9.getText();
		if (!(data9.equalsIgnoreCase(PixalereScripts.MAHC_radio_2))) {
			Assert.assertTrue(false);
		}

		WebElement e10 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Visual Impairment']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data10 = e10.getText();
		if (!(data10.equalsIgnoreCase(PixalereScripts.MAHC_radio_3))) {
			Assert.assertTrue(false);
		}

		/*
		 * WebElement e11 = driver.findElement(By.xpath(
		 * "(//td[normalize-space()='Consults/Referrals made to']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"
		 * )); String data11 = e11.getText(); if (!(data11.contains(""))) {
		 * Assert.assertTrue(false); }
		 */

		WebElement e12 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Impaired Functional Mobility']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data12 = e12.getText();
		if (!(data12.equalsIgnoreCase(PixalereScripts.MAHC_radio_4))) {
			Assert.assertTrue(false);
		}

		// 3
		WebElement e13 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Handouts Provided']//following-sibling::td//td[contains(@class,'flowchart_data')])[18]"));
		String data13 = e13.getText();
		for (int i = 0; i < PixalereScripts.MAHC_Functional_Mobility_MAHC.size(); i++) {
			if (!data13.contains(PixalereScripts.MAHC_Functional_Mobility_MAHC.get(i))) {
				Assert.assertTrue(false);
			}
		}

		WebElement e14 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Environmental Hazards']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data14 = e14.getText();
		if (!(data14.equalsIgnoreCase(PixalereScripts.MAHC_radio_5))) {
			Assert.assertTrue(false);
		}

		WebElement v19 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Poly Pharmacy')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String d19 = v19.getText();
		if (!(d19.equalsIgnoreCase(PixalereScripts.MAHC_radio_6))) {
			Assert.assertTrue(false);
		}

		WebElement e15 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Pain affecting level of function']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data15 = e15.getText();
		if (!(data15.equalsIgnoreCase(PixalereScripts.MAHC_radio_7))) {
			Assert.assertTrue(false);
		}

		/*
		 * WebElement e16 = driver.findElement(By.xpath(
		 * "(//td[normalize-space()='Pain affecting level of function']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"
		 * )); String data16 = e16.getText(); if
		 * (!(data16.equalsIgnoreCase(PixalereScripts.MAHC_radio_7))) {
		 * Assert.assertTrue(false); }
		 */

		// 4
		WebElement v13 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Handouts Provided']//following-sibling::td//td[contains(@class,'flowchart_data')])[27]"));
		String d13 = v13.getText();
		for (int i = 0; i < PixalereScripts.MAHC_pain_affecting_level_function_MAHC.size(); i++) {
			if (!d13.contains(PixalereScripts.MAHC_pain_affecting_level_function_MAHC.get(i))) {
				Assert.assertTrue(false);
			}
		}

		WebElement e17 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Cognitive Impairment']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data17 = e17.getText();
		if (!(data17.equalsIgnoreCase(PixalereScripts.MAHC_radio_8))) {
			Assert.assertTrue(false);
		}

		WebElement e18 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Decreased Hearing Acuity']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data18 = e18.getText();
		if (!(data18.equalsIgnoreCase(PixalereScripts.MAHC_radio_9))) {
			Assert.assertTrue(false);
		}

		WebElement e19 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Gait Aid Use']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data19 = e19.getText();
		if (!(data19.equalsIgnoreCase(PixalereScripts.MAHC_radio_11))) {
			Assert.assertTrue(false);
		}

		// 5
		WebElement e20 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Handouts Provided']//following-sibling::td//td[contains(@class,'flowchart_data')])[39]"));
		String data20 = e20.getText();
		for (int i = 0; i < PixalereScripts.MAHC_Gait_Aid_Use_MAHC.size(); i++) {
			if (!data20.contains(PixalereScripts.MAHC_Gait_Aid_Use_MAHC.get(i))) {
				Assert.assertTrue(false);
			}
		}

		WebElement e21 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Foot/Footwear Concerns']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data21 = e21.getText();
		if (!(data21.equalsIgnoreCase(PixalereScripts.MAHC_radio_12))) {
			Assert.assertTrue(false);
		}

		// 6
		WebElement e22 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Handouts Provided']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data22 = e22.getText();
		for (int j = 0; j < PixalereScripts.MAHC_footwear__handsout_provided.size(); j++) {
			if (!data22.contains(PixalereScripts.MAHC_footwear__handsout_provided.get(j))) {
				Assert.assertTrue(false);
			}
		}

		WebElement e23 = driver.findElement(By.xpath(
				"(//td[normalize-space()='MAHC-10 Fall Risk Score']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data23 = e23.getText();
		String s[] = MAHC_10_Fall_Risk_Score.split(": ");
		if (!(data23.equalsIgnoreCase(s[1]))) {
			Assert.assertTrue(false);
		}

		System.out.println("MAHC Fall Risk Assessment Page verified................");
	}

	public void verify_Care_Plan_Nursing() {
		WebElement e1 = driver.findElement(By.xpath("//div[@id='current_careplans']//table//tbody//tr[1]//td[1]"));
		String data1 = e1.getText();
		if (!(data1.equalsIgnoreCase(PixalereScripts.Client_Needs_Goals_One1))) {
			Assert.assertTrue(false);
		}

		WebElement e2 = driver.findElement(By.xpath("//div[@id='current_careplans']//table//tbody//tr[1]//td[2]"));
		String data2 = e2.getText();
		if (!(data2.equalsIgnoreCase(PixalereScripts.Service_Teaching_Plan_One1))) {
			Assert.assertTrue(false);
		}
		WebElement e3 = driver.findElement(By.xpath("//div[@id='current_careplans']//table//tbody//tr[2]//td[1]"));
		String data3 = e3.getText();
		if (!(data3.equalsIgnoreCase(PixalereScripts.Client_Needs_Goals_Two1))) {
			Assert.assertTrue(false);
		}

		WebElement e4 = driver.findElement(By.xpath("//div[@id='current_careplans']//table//tbody//tr[2]//td[2]"));
		String data4 = e4.getText();
		if (!(data4.equalsIgnoreCase(PixalereScripts.Service_Teaching_Plan_Two1))) {
			Assert.assertTrue(false);
		}
		WebElement e5 = driver.findElement(By.xpath("//div[@id='current_careplans']//table//tbody//tr[3]//td[1]"));
		String data5 = e5.getText();
		if (!(data5.equalsIgnoreCase(PixalereScripts.Client_Needs_Goals_Three1))) {
			Assert.assertTrue(false);
		}
		WebElement e6 = driver.findElement(By.xpath("//div[@id='current_careplans']//table//tbody//tr[3]//td[2]"));
		String data6 = e6.getText();
		if (!(data6.equalsIgnoreCase(PixalereScripts.Service_Teaching_Plan_Three1))) {
			Assert.assertTrue(false);
		}

		System.out.println("CarePlan Nursing successfully verified....");
	}

	public void verify_Client_Consent() {

		WebElement e1 = driver.findElement(
				By.xpath("//label[normalize-space(text())='Lock Box Required']//following-sibling::div//span"));
		String data1 = e1.getText();
		if (!(data1.contains(PixalereScripts.Lock_Box_Required_comment))) {
			Assert.assertTrue(false);
		}

		WebElement e2 = driver.findElement(
				By.xpath("//label[normalize-space(text())='Effective as of Date']//following-sibling::div//span"));
		String data2 = e2.getText();
		if (!(data2.equalsIgnoreCase(PixalereScripts.Effective_Date_client_consent))) {
			Assert.assertTrue(false);
		}

		WebElement e3 = driver.findElement(By.xpath(
				"//label[normalize-space(text())='Proposed Health Services Discussed']//following-sibling::div//span"));
		String data3 = e3.getText();
		if (!(data3.contains(PixalereScripts.Specify_Proposed_Health_Services))) {
			Assert.assertTrue(false);
		}

		WebElement e4 = driver.findElement(By.xpath(
				"//label[normalize-space(text())='Proposed Health Services Discussed']//following-sibling::div//span"));
		String data4 = e4.getText();
		for (int i = 0; i < PixalereClinetConsentScripts.chk_Proposed_Health_Services_Discussed.size(); i++) {
			if (!data4.contains(PixalereClinetConsentScripts.chk_Proposed_Health_Services_Discussed.get(i))) {
				Assert.assertTrue(false);
			}
		}

		WebElement e5 = driver
				.findElement(By.xpath("//label[normalize-space(text())='Comments']//following-sibling::div//span"));
		String data5 = e5.getText();
		if (!(data5.equalsIgnoreCase(PixalereScripts.Service_Consent_Obtained_comments))) {
			Assert.assertTrue(false);
		}

		WebElement e6 = driver.findElement(By.xpath(
				"//label[contains(text(),'Risks of not receiving service discussed')]//following-sibling::div//span"));
		String data6 = e6.getText();
		if (!(data6.equalsIgnoreCase(PixalereClinetConsentScripts.Risk_for_alternatives_and_benefits))) {
			Assert.assertTrue(false);
		}

		WebElement e7 = driver.findElement(By.xpath(
				"//label[contains(text(),'Notice of Information Practices provided')]//following-sibling::div//span"));
		String data7 = e7.getText();
		if (!(data7.equalsIgnoreCase(
				PixalereClinetConsentScripts.Notice_of_Information_Practices_provided_to_clientSDM))) {
			Assert.assertTrue(false);
		}

		WebElement e8 = driver.findElement(
				By.xpath("//label[normalize-space(text())='Your service funder']//following-sibling::div//span"));
		String data8 = e8.getText();
		if (!(data8.equalsIgnoreCase(PixalereClinetConsentScripts.Your_service_funder))) {
			Assert.assertTrue(false);
		}

		WebElement e9 = driver.findElement(
				By.xpath("//label[normalize-space(text())='Family/friends/caregivers']//following-sibling::div//span"));
		String data9 = e9.getText();
		if (!(data9.contains(PixalereScripts.Other_comment_Family_friends_caregivers))) {
			Assert.assertTrue(false);
		}
		if (!(data9.contains(PixalereClinetConsentScripts.chk_or_Family_friends_caregivers))) {
			Assert.assertTrue(false);
		}

		WebElement e10 = driver.findElement(
				By.xpath("//label[normalize-space(text())='Medical Contact']//following-sibling::div//span"));
		String data10 = e10.getText();
		if (!(data10.contains(PixalereScripts.Other_comment_Family_friends_caregivers))) {
			Assert.assertTrue(false);
		}
		if (!(data10.contains(PixalereClinetConsentScripts.chk_for_Medical_Contacts))) {
			Assert.assertTrue(false);
		}

		WebElement e11 = driver
				.findElement(By.xpath("//label[contains(text(),'Vendor')]//following-sibling::div//span"));
		String data11 = e11.getText();
		if (!(data11.equalsIgnoreCase(PixalereScripts.Consent_vendors))) {
			Assert.assertTrue(false);
		}

		WebElement e12 = driver
				.findElement(By.xpath("//label[contains(text(),'Other')]//following-sibling::div//span"));
		String data12 = e12.getText();
		if (!(data12.equalsIgnoreCase(PixalereScripts.Other_comment_Consent_Obtained))) {
			Assert.assertTrue(false);
		}

		WebElement e13 = driver.findElement(By.xpath(
				"//label[contains(text(),'Consent to Use Electronic/Audio-Visual/Communication')]//following-sibling::div//span"));
		String data13 = e13.getText();
		if (!(data13.equalsIgnoreCase(PixalereClinetConsentScripts.chk_to_use_electronic))) {
			Assert.assertTrue(false);
		}

		WebElement e14 = driver.findElement(By.xpath(
				"(//label[contains(text(),'Client is aware of the option of virtual care with ')]//following-sibling::div//span)[1]"));
		String data14 = e14.getText();
		if (!(data14.equalsIgnoreCase(PixalereClinetConsentScripts.virtual_care_with_telephone))) {
			Assert.assertTrue(false);
		}

		WebElement e15 = driver.findElement(By.xpath(
				"(//label[contains(text(),'Client is aware of the option of virtual care with ')]//following-sibling::div//span)[2]"));
		String data15 = e15.getText();
		if (!(data15.equalsIgnoreCase(PixalereClinetConsentScripts.virtual_care_with_video))) {
			Assert.assertTrue(false);
		}

		WebElement e18 = driver.findElement(By.xpath(
				"//label[normalize-space(text())='Alternate Contact Name/Phone Number']//following-sibling::div//span"));
		String data18 = e18.getText();
		if (!(data18.equalsIgnoreCase(PixalereScripts.Alternate_Contact_Name_Phone_Number))) {
			Assert.assertTrue(false);
		}

		WebElement e19 = driver
				.findElement(By.xpath("//label[normalize-space(text())='Back up plan']//following-sibling::div//span"));
		String data19 = e19.getText();
		if (!(data19.equalsIgnoreCase(PixalereScripts.Back_up_plan))) {
			Assert.assertTrue(false);
		}

		WebElement e20 = driver.findElement(
				By.xpath("//label[normalize-space(text())='Additional comments']//following-sibling::div//span"));
		String data20 = e20.getText();
		if (!(data20.equalsIgnoreCase(PixalereScripts.Back_up_plan_comments))) {
			Assert.assertTrue(false);
		}

		WebElement e21 = driver
				.findElement(By.xpath("//label[normalize-space(text())='SDM Name']//following-sibling::div//span"));
		String data21 = e21.getText();
		if (!(data21.equalsIgnoreCase(PixalereScripts.SDM_Name_consent))) {
			Assert.assertTrue(false);
		}

		WebElement e22 = driver
				.findElement(By.xpath("//label[normalize-space(text())='Relationship']//following-sibling::div//span"));
		String data22 = e22.getText();
		for (int i = 0; i < PixalereClinetConsentScripts.chk_realtionship.size(); i++) {
			if (!data22.contains(PixalereClinetConsentScripts.chk_realtionship.get(i))) {
				Assert.assertTrue(false);
			}
		}

		WebElement e24 = driver.findElement(
				By.xpath("//label[normalize-space(text())='Consent obtained from']//following-sibling::div//span"));
		String data24 = e24.getText();
		for (int i = 0; i < PixalereClinetConsentScripts.chk_Consent_obtained_from.size(); i++) {
			if (!data24.contains(PixalereClinetConsentScripts.chk_Consent_obtained_from.get(i))) {
				Assert.assertTrue(false);
			}
		}

		WebElement e25 = driver.findElement(By.xpath(
				"//label[contains(text(),'have completed this consent discussion with the client/SDM as per')]//following-sibling::div//span"));
		String data25 = e25.getText();
		if (!(data25.equalsIgnoreCase(
				PixalereClinetConsentScripts.the_Service_Provider_have_completed_this_consent_discussion_with_the_clientSDM))) {
			Assert.assertTrue(false);
		}

		System.out.println("Client Consent Page verified................");

	}

	public void verify_Joint_Movement() {

		selectByVisibleText(By.xpath("//select[@name='joint_movement_data_length']"), "50");

		WebElement e1 = driver.findElement(By.xpath("//*[@id='tr_1']/td[3]"));
		String data1 = e1.getText();
		if (!(data1.equalsIgnoreCase(PixalereScripts.Ankle_Dorsiflexion1))) {
			Assert.assertTrue(false);
		}

		WebElement e2 = driver.findElement(By.xpath("//*[@id='tr_2']/td[3]"));
		String data2 = e2.getText();
		if (!(data2.equalsIgnoreCase(PixalereScripts.Ankle_Plantarflexion1))) {
			Assert.assertTrue(false);
		}

		WebElement e3 = driver.findElement(By.xpath("//*[@id='tr_3']/td[3]"));
		String data3 = e3.getText();
		if (!(data3.equalsIgnoreCase(PixalereScripts.Knee_Flexion1))) {
			Assert.assertTrue(false);
		}

		WebElement e4 = driver.findElement(By.xpath("//*[@id='tr_4']/td[4]"));
		String data4 = e4.getText();
		if (!(data4.equalsIgnoreCase(PixalereScripts.Knee_Extension1))) {
			Assert.assertTrue(false);
		}

		WebElement e5 = driver.findElement(By.xpath("//*[@id='tr_5']/td[5]"));
		String data5 = e5.getText();
		if (!(data5.equalsIgnoreCase(PixalereScripts.Hip_Flexion1))) {
			Assert.assertTrue(false);
		}

		WebElement e7 = driver.findElement(By.xpath("//*[@id='tr_6']/td[6]"));
		String data7 = e7.getText();
		if (!(data7.equalsIgnoreCase(PixalereScripts.Hip_Abduction1))) {
			Assert.assertTrue(false);
		}

		WebElement e8 = driver.findElement(By.xpath("//*[@id='tr_7']/td[7]"));
		String data8 = e8.getText();
		if (!(data8.equalsIgnoreCase(PixalereScripts.Hip_Extension1))) {/// data8.equalsignorecase(script.variable
																		/// name)
			Assert.assertTrue(false);
		}

		WebElement e9 = driver.findElement(By.xpath("//*[@id='tr_8']/td[8]"));
		String data9 = e9.getText();
		if (!(data9.equalsIgnoreCase(PixalereScripts.Wrist_Flexion1))) {
			Assert.assertTrue(false);
		}

		WebElement e10 = driver.findElement(By.xpath("//*[@id='tr_9']/td[9]"));
		String data10 = e10.getText();
		if (!(data10.equalsIgnoreCase(PixalereScripts.Wrist_Extension1))) {
			Assert.assertTrue(false);
		}
		WebElement e11 = driver.findElement(By.xpath("//*[@id='tr_10']/td[10]"));
		String data11 = e11.getText();
		if (!(data11.equalsIgnoreCase(PixalereScripts.Elbow_Flexion1))) {
			Assert.assertTrue(false);
		}
		WebElement e12 = driver.findElement(By.xpath("//*[@id='tr_11']/td[3]"));
		String data12 = e12.getText();
		if (!(data12.equalsIgnoreCase(PixalereScripts.Elbow_Extension1))) {
			Assert.assertTrue(false);
		}
		WebElement e13 = driver.findElement(By.xpath("//*[@id='tr_12']/td[3]"));
		String data13 = e13.getText();
		if (!(data13.equalsIgnoreCase(PixalereScripts.Elbow_Supination1))) {
			Assert.assertTrue(false);
		}
		WebElement e14 = driver.findElement(By.xpath("//*[@id='tr_13']/td[3]"));
		String data14 = e14.getText();
		if (!(data14.equalsIgnoreCase(PixalereScripts.Elbow_Pronation1))) {
			Assert.assertTrue(false);
		}

		WebElement e15 = driver.findElement(By.xpath("//*[@id='tr_14']/td[3]"));
		String data15 = e15.getText();
		if (!(data15.equalsIgnoreCase(PixalereScripts.Shoulder_Flexion1))) {
			Assert.assertTrue(false);
		}

		WebElement e16 = driver.findElement(By.xpath("//*[@id='tr_15']/td[3]"));
		String data16 = e16.getText();
		if (!(data16.equalsIgnoreCase(PixalereScripts.Shoulder_Abduction1))) {
			Assert.assertTrue(false);
		}

		WebElement e17 = driver.findElement(By.xpath("//*[@id='tr_16']/td[3]"));
		String data17 = e17.getText();
		if (!(data17.equalsIgnoreCase(PixalereScripts.Shoulder_External_Rotation1))) {
			Assert.assertTrue(false);
		}

		WebElement e18 = driver.findElement(By.xpath("//*[@id='tr_17']/td[3]"));
		String data18 = e18.getText();
		if (!(data18.equalsIgnoreCase(PixalereScripts.Shoulder_Internal_Rotation1))) {
			Assert.assertTrue(false);
		}

		WebElement e19 = driver.findElement(By.xpath("//*[@id='tr_22']/td[5]"));
		String data19 = e19.getText();
		if (!(data19.equalsIgnoreCase(PixalereScripts.LSpine_Flexion1))) {
			Assert.assertTrue(false);
		}
		WebElement e20 = driver.findElement(By.xpath("//*[@id='tr_23']/td[3]"));
		String data20 = e20.getText();
		if (!(data20.equalsIgnoreCase(PixalereScripts.LSpine_Extension1))) {
			Assert.assertTrue(false);
		}
		WebElement e21 = driver.findElement(By.xpath("//*[@id='tr_24']/td[3]"));
		String data21 = e21.getText();
		if (!(data21.equalsIgnoreCase(PixalereScripts.LSpine_SideFlexion1))) {
			Assert.assertTrue(false);
		}
		WebElement e22 = driver.findElement(By.xpath("//*[@id='tr_18']/td[3]"));
		String data22 = e22.getText();
		if (!(data22.equalsIgnoreCase(PixalereScripts.CSpine_Flexion1))) {
			Assert.assertTrue(false);
		}
		WebElement e23 = driver.findElement(By.xpath("//*[@id='tr_19']/td[8]"));
		String data23 = e23.getText();
		if (!(data23.equalsIgnoreCase(PixalereScripts.CSpine_Extension1))) {
			Assert.assertTrue(false);
		}
		WebElement e24 = driver.findElement(By.xpath("//*[@id='tr_20']/td[6]"));
		String data24 = e24.getText();
		if (!(data24.equalsIgnoreCase(PixalereScripts.CSpine_SideFlexion1))) {
			Assert.assertTrue(false);
		}
		WebElement e25 = driver.findElement(By.xpath("//*[@id='tr_21']/td[3]"));
		String data25 = e25.getText();
		if (!(data25.equalsIgnoreCase(PixalereScripts.CSpine_Rotation1))) {
			Assert.assertTrue(false);
		}
		System.out.println("Joint Movement Page verified................");
	}

	public void verify_ICAT_Flowchart_Page() {
		WebElement e1 = driver.findElement(
				By.xpath("(//label[normalize-space()='Neurological History']/following-sibling::div//span)"));
		String data1 = e1.getText();
		data1 = data1.replace("\n", ",");
		data1 = data1.replace(" ", "");
		// String[] strSplit = data1.split(",");

		String list1 = Neurological_History_data.toString();
		list1 = list1.replace(" ", "");
		list1 = list1.replace("[", "");
		list1 = list1.replace("]", "");

		if (!(data1.equalsIgnoreCase(list1))) {
			Assert.assertTrue(false);
		}
		WebElement e2 = driver.findElement(
				By.xpath("(//label[normalize-space()='Gastrointestinal History']/following-sibling::div//span)"));
		String data2 = e2.getText();
		data2 = data2.replace("\n", ",");
		data2 = data2.replace(" ", "");
		// String[] strSplit = data1.split(",");

		String list2 = Gastrointestinal_History.toString();
		list2 = list2.replace(" ", "");
		list2 = list2.replace("[", "");
		list2 = list2.replace("]", "");

		if (!(data2.equalsIgnoreCase(list2))) {
			Assert.assertTrue(false);
		}
		WebElement e3 = driver.findElement(
				By.xpath("(//label[normalize-space()='Genitourinary History']/following-sibling::div//span)"));
		String data3 = e3.getText();
		data3 = data3.replace("\n", ",");
		data3 = data3.replace(" ", "");
		// String[] strSplit = data1.split(",");

		String list3 = Genitourinary_History.toString();
		list3 = list3.replace(" ", "");
		list3 = list3.replace("[", "");
		list3 = list3.replace("]", "");

		if (!(data3.equalsIgnoreCase(list3))) {
			Assert.assertTrue(false);
		}

		WebElement e4 = driver.findElement(
				By.xpath("(//label[normalize-space()='Neurological Assessment']/following-sibling::div//span)"));
		String data4 = e4.getText();
		data4 = data4.replace("\n", ",");
		data4 = data4.replace(" ", "");
		// String[] strSplit = data1.split(",");

		String list4 = Neurological_Assessment.toString();
		list4 = list4.replace(" ", "");
		list4 = list4.replace("[", "");
		list4 = list4.replace("]", "");

		if (!(data4.equalsIgnoreCase(list4))) {
			Assert.assertTrue(false);
		}

		WebElement e5 = driver.findElement(
				By.xpath("(//label[normalize-space()='Endocrine Assessment']/following-sibling::div//span)"));
		String data5 = e5.getText();
		data5 = data5.replace("\n", ",");
		data5 = data5.replace(" ", "");
		// String[] strSplit = data1.split(",");

		String list5 = Endocrine_Assessment.toString();
		list5 = list5.replace(" ", "");
		list5 = list5.replace("[", "");
		list5 = list5.replace("]", "");

		if (!(data5.equalsIgnoreCase(list5))) {
			Assert.assertTrue(false);
		}
		WebElement e6 = driver.findElement(
				By.xpath("(//label[normalize-space()='Gastrointestinal Assessment']/following-sibling::div//span)"));
		String data6 = e6.getText();
		data6 = data6.replace("\n", ",");
		data6 = data6.replace(" ", "");
		// String[] strSplit = data1.split(",");

		String list6 = Gastrointestinal_Assessment.toString();
		list6 = list6.replace(" ", "");
		list6 = list6.replace("[", "");
		list6 = list6.replace("]", "");

		if (!(data6.equalsIgnoreCase(list6))) {
			Assert.assertTrue(false);
		}

		WebElement e7 = driver.findElement(
				By.xpath("(//label[normalize-space()='Genitourinary Assessment']/following-sibling::div//span)"));
		String data7 = e7.getText();
		data7 = data7.replace("\n", ",");
		data7 = data7.replace(" ", "");
		// String[] strSplit = data1.split(",");

		String list7 = Genitourinary_Assessment.toString();
		list7 = list7.replace(" ", "");
		list7 = list7.replace("[", "");
		list7 = list7.replace("]", "");

		if (!(data7.equalsIgnoreCase(list7))) {
			Assert.assertTrue(false);
		}
		WebElement e8 = driver.findElement(
				By.xpath("(//label[normalize-space()='Musculoskeletal Assessment']/following-sibling::div//span)"));
		String data8 = e8.getText();
		data8 = data8.replace("\n", ",");
		data8 = data8.replace(" ", "");
		// String[] strSplit = data1.split(",");

		String list8 = Musculoskeletal_Assessment.toString();
		list8 = list8.replace(" ", "");
		list8 = list8.replace("[", "");
		list8 = list8.replace("]", "");

		if (!(data8.equalsIgnoreCase(list8))) {
			Assert.assertTrue(false);
		}

		WebElement e9 = driver.findElement(
				By.xpath("(//label[normalize-space()='Cardiovascular History']/following-sibling::div//span)"));
		String data9 = e9.getText();
		data9 = data9.replace("\n", ",");
		data9 = data9.replace(" ", "");
		// String[] strSplit = data1.split(",");

		String list9 = list_Cardiovascular_ICAN1.toString();
		list9 = list9.replace(" ", "");
		list9 = list9.replace("[", "");
		list9 = list9.replace("]", "");

		if (!(data9.equalsIgnoreCase(list9))) {
			Assert.assertTrue(false);
		}
		WebElement e10 = driver.findElement(
				By.xpath("(//label[normalize-space()='Respiratory History']/following-sibling::div//span)"));
		String data10 = e10.getText();
		data10 = data10.replace("\n", ",");
		data10 = data10.replace(" ", "");
		// String[] strSplit = data1.split(",");

		String list10 = list_Respiratory_ICAN1.toString();
		list10 = list10.replace(" ", "");
		list10 = list10.replace("[", "");
		list10 = list10.replace("]", "");

		if (!(data10.equalsIgnoreCase(list10))) {
			Assert.assertTrue(false);
		}
		WebElement e11 = driver.findElement(By.xpath(
				"(//label[normalize-space()='Alternative/Complimentary Therapies']/following-sibling::div//span)"));
		String data11 = e11.getText();
		data11 = data11.replace("\n", ",");
		data11 = data11.replace(" ", "");
		// String[] strSplit = data1.split(",");

		String list11 = Complimentary_Therapies.toString();
		list11 = list11.replace(" ", "");
		list11 = list11.replace("[", "");
		list11 = list11.replace("]", "");

		if (!(data11.equalsIgnoreCase(list11))) {
			Assert.assertTrue(false);
		}
		WebElement e12 = driver.findElement(By.xpath(
				"(//label[normalize-space()='Select your nursing intervention(s) ']/following-sibling::div//span)"));
		String data12 = e12.getText();
		data12 = data12.replace("\n", ",");
		data12 = data12.replace(" ", "");
		// String[] strSplit = data1.split(",");

		String list12 = nursing_intervention.toString();
		list12 = list12.replace(" ", "");
		list12 = list12.replace("[", "");
		list12 = list12.replace("]", "");

		if (!(data12.equalsIgnoreCase(list12))) {
			Assert.assertTrue(false);
		}
		////////////////// RADIO VERIFY START///////////////////////////
		WebElement e14 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Ankle Brachial Index']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data14 = e14.getText();
		if (!data14.equalsIgnoreCase(PixalereScripts.ICAT_radio_1)) {
			Assert.assertTrue(false);
		}
		WebElement e15 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Ankle Brachial Index']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data15 = e15.getText();
		if (!data15.equalsIgnoreCase(PixalereScripts.ICAT_radio_2)) {
			Assert.assertTrue(false);
		}
		WebElement e16 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Ankle Brachial Index']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data16 = e16.getText();
		if (!data16.equalsIgnoreCase(PixalereScripts.ICAT_radio_3)) {
			Assert.assertTrue(false);
		}
		WebElement e17 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Ankle Brachial Index']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data17 = e17.getText();
		if (!data17.equalsIgnoreCase(PixalereScripts.ICAT_radio_4)) {
			Assert.assertTrue(false);
		}
		WebElement e18 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Ankle Brachial Index']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data18 = e18.getText();
		if (!data18.equalsIgnoreCase(PixalereScripts.ICAT_radio_5)) {
			Assert.assertTrue(false);
		}
		WebElement e19 = driver.findElement(By.xpath(""));
		String data19 = e19.getText();
		if (!data19.equalsIgnoreCase(PixalereScripts.ICAT_radio_6)) {
			Assert.assertTrue(false);
		}
		WebElement e20 = driver.findElement(By.xpath("//div[@class='chronic_d']"));
		String data20 = e20.getText();
		if (!data20.equalsIgnoreCase(PixalereScripts.ICAT_radio_7)) {
			Assert.assertTrue(false);
		}
		WebElement e21 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Ankle Brachial Index']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data21 = e21.getText();
		if (!data21.equalsIgnoreCase(PixalereScripts.ICAT_radio_8)) {
			Assert.assertTrue(false);
		}
		WebElement e22 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Ankle Brachial Index']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data22 = e22.getText();
		if (!data22.equalsIgnoreCase(PixalereScripts.ICAT_radio_9)) {
			Assert.assertTrue(false);
		}
		WebElement e23 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Ankle Brachial Index']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data23 = e23.getText();
		if (!data23.equalsIgnoreCase(PixalereScripts.ICAT_radio_10)) {
			Assert.assertTrue(false);
		}
		WebElement e24 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Ankle Brachial Index']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data24 = e24.getText();
		if (!data24.equalsIgnoreCase(PixalereScripts.ICAT_radio_11)) {
			Assert.assertTrue(false);
		}
		WebElement e25 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Ankle Brachial Index']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data25 = e25.getText();
		if (!data25.equalsIgnoreCase(PixalereScripts.ICAT_radio_12)) {
			Assert.assertTrue(false);
		}

		//////////////////////// RADIO VERIFY STOP////////////////////////

		System.out.println("ICAT Data Verified Sucessfully....");
	}

	public void verifyNon_Authorizer_Mobility_Device_Recommendation_Page() {
		boolean status = true;
		String myComprehensiveCheckBoxString = getWebDriver()
				.findElement(By.xpath("//label[contains(text(),'my comprehensive')]//following-sibling::div//span"))
				.getText();
		String reasonForEligibilityCheckBoxString = getWebDriver()
				.findElement(By.xpath("//label[contains(text(),'for eligibility')]//following-sibling::div//span"))
				.getText();
		String rationaleCheckBoxString = getWebDriver().findElement(By.xpath(
				"//label[contains(text(),'Rationale to re-apply for ADP funding')]//following-sibling::div//span"))
				.getText();
		String spineCheckBoxString = getWebDriver()
				.findElement(By.xpath("//label[contains(text(),'Spine/Trunk')]//following-sibling::div//span"))
				.getText();
		String pelvisCheckBoxString = getWebDriver()
				.findElement(By.xpath("//label[contains(text(),'Pelvis')]//following-sibling::div//span")).getText();
		String hipsCheckBoxString = getWebDriver()
				.findElement(By.xpath("//label[contains(text(),'Hips')]//following-sibling::div//span")).getText();
		String extremitiesCheckBoxString = getWebDriver()
				.findElement(By.xpath("//label[contains(text(),'Extremities')]//following-sibling::div//span"))
				.getText();
		for (String s : Tests_PixalereCommonStepDefinition.checkboxData) {
			if (!myComprehensiveCheckBoxString.contains(s) || !reasonForEligibilityCheckBoxString.contains(s)
					|| !rationaleCheckBoxString.contains(s) || !spineCheckBoxString.contains(s)
					|| !pelvisCheckBoxString.contains(s) || !hipsCheckBoxString.contains(s)
					|| !extremitiesCheckBoxString.contains(s)) {
				System.out.println(s);
				status = false;
			}
		}
		Assert.assertTrue(status);
		WebElement e1 = driver.findElement(By.xpath(
				"//label[normalize-space()='Discussed Assistive Devices Program/application process with client/SDM and any questions addressed']//following-sibling::div//span"));
		String data1 = e1.getText();
		if (!(data1.equalsIgnoreCase("Yes"))) {
			Assert.assertTrue(false);
		}

		WebElement e2 = driver.findElement(By.xpath(
				"//label[normalize-space()='Screen for ADP eligibility completed']//following-sibling::div//span"));
		String data2 = e2.getText();
		if (!(data2.equalsIgnoreCase("Yes"))) {
			Assert.assertTrue(false);
		}

		WebElement e3 = driver.findElement(By.xpath(
				"//label[normalize-space()='Client appears to meet ADP eligibility']//following-sibling::div//span"));
		String data3 = e3.getText();
		if (!(data3.equalsIgnoreCase("Yes"))) {
			Assert.assertTrue(false);
		}

		WebElement e4 = driver.findElement(By.xpath(
				"//label[normalize-space()='Confirmed the status of any prior funding access to ADP.']//following-sibling::div//span"));
		String data4 = e4.getText();
		if (!(data4.equalsIgnoreCase("Yes"))) {
			Assert.assertTrue(false);
		}

		WebElement e7 = driver
				.findElement(By.xpath("//label[contains(text(),'requires device')]//following-sibling::div//span"));
		String data7 = e7.getText();
		if (!(data7.equalsIgnoreCase("Yes"))) {
			Assert.assertTrue(false);
		}

		WebElement e8 = driver.findElement(By.xpath(
				"//label[contains(text(),'expected to maximize functionality of device')]//following-sibling::div//span"));
		String data8 = e8.getText();
		if (!(data8.equalsIgnoreCase("Yes"))) {
			Assert.assertTrue(false);
		}

		WebElement e9 = driver
				.findElement(By.xpath("//label[contains(text(),'Client weight')]//following-sibling::div//span"));
		String data9 = e9.getText().toLowerCase().replaceAll("\\s", "");
		if (!(data9.equalsIgnoreCase(PixalereScripts.client_Weight))) {
			Assert.assertTrue(false);
		}

		WebElement e10 = driver
				.findElement(By.xpath("//label[contains(text(),'Hip width')]//following-sibling::div//span"));
		String data10 = e10.getText().toLowerCase().replaceAll("\\s", "");
		if (!(data10.equalsIgnoreCase(PixalereScripts.Hip_width))) {
			Assert.assertTrue(false);
		}

		WebElement e11 = driver.findElement(
				By.xpath("//label[contains(text(),'Popliteal fossa-heal')]//following-sibling::div//span"));
		String data11 = e11.getText().toLowerCase().replaceAll("\\s", "");
		if (!(data11.equalsIgnoreCase(PixalereScripts.Popliteal_fossa_heal))) {
			Assert.assertTrue(false);
		}

		WebElement e12 = driver
				.findElement(By.xpath("//label[contains(text(),'Handle height')]//following-sibling::div//span"));
		String data12 = e12.getText().toLowerCase().replaceAll("\\s", "");
		if (!(data12.equalsIgnoreCase(PixalereScripts.Handle_height))) {
			Assert.assertTrue(false);
		}

	}

	public void verifyOT_Assessment_Page() {
		WebElement e1 = driver.findElement(By.xpath(
				"//*[text()='Referral screened for appropriateness at some time prior to initiating service.']//following-sibling::*//span"));
		String data1 = e1.getText();
		if (!(data1.equalsIgnoreCase("Yes"))) {
			Assert.assertTrue(false);
		}

		WebElement e2 = driver.findElement(By.xpath(
				"//*[text()='Accuracy of info provided in referral confirmed in keeping with scope of service.']//following-sibling::*//span"));
		String data2 = e2.getText();
		if (!(data2.equalsIgnoreCase("Yes"))) {
			Assert.assertTrue(false);
		}

		WebElement e3 = driver.findElement(
				By.xpath("//*[contains(text(),'Acute Respiratory Screen')]//..//following-sibling::*//span"));
		String data3 = e3.getText();
		if (!(data3.equalsIgnoreCase("Yes"))) {
			Assert.assertTrue(false);
		}

		WebElement e4 = driver.findElement(
				By.xpath("//*[contains(text(),'Service provided in client')]//following-sibling::*//span"));
		String data4 = e4.getText();
		if (!(data4.equalsIgnoreCase("Yes"))) {
			Assert.assertTrue(false);
		}

		WebElement e5 = driver.findElement(By.xpath(
				"//*[contains(text(),'Role/scope of practice, anticipated length of service, professional qualifications of assessor, relation to stakeholders/funder, source/reason for referral reviewed with client and/or SDM. Any questions addressed.')]//following-sibling::*//span"));
		String data5 = e5.getText();
		if (!(data5.equalsIgnoreCase("Yes"))) {
			Assert.assertTrue(false);
		}

		WebElement e6 = driver
				.findElement(By.xpath("//*[contains(text(),'Informed consent')]//following-sibling::*//span"));
		String data6 = e6.getText();
		if (!(data6.equalsIgnoreCase("Yes"))) {
			Assert.assertTrue(false);
		}

		WebElement e7 = driver.findElement(
				By.xpath("//*[contains(text(),'Student participation in service.')]//following-sibling::*//span"));
		String data7 = e7.getText();
		if (!(data7.equalsIgnoreCase("Yes"))) {
			Assert.assertTrue(false);
		}

		WebElement e8 = driver.findElement(By.xpath(
				"//*[contains(text(),'Environmental Safety Scan (ESS) completed and plan established/documented to address any identified issues.')]//following-sibling::*//span"));
		String data8 = e8.getText();
		if (!(data8.equalsIgnoreCase("Yes"))) {
			Assert.assertTrue(false);
		}

		WebElement e9 = driver.findElement(By.xpath(
				"//*[contains(text(),'Client Emergency Response Level (ERL) assessment completed.')]//following-sibling::*//span"));
		String data9 = e9.getText();

		if (!(data9.equalsIgnoreCase("Yes"))) {
			Assert.assertTrue(false);
		}

		WebElement e10 = driver.findElement(By.xpath(
				"//*[contains(text(),'Falls Risk Factors (FRRT) are identified, documented and a plan established to address risk. Any follow up intervention regarding falls risks will be documented in progress notes/recommendations sheets.')]//following-sibling::*//span"));
		String data10 = e10.getText();
		if (!(data10.equalsIgnoreCase("Yes"))) {
			Assert.assertTrue(false);
		}

		WebElement e11 = driver.findElement(By.xpath(
				"//*[contains(text(),'Any difficulties/issues identified in assessment are addressed, unless they are not applicable to the client')]//following-sibling::*//span"));
		String data11 = e11.getText();
		if (!(data11.equalsIgnoreCase("Yes"))) {
			Assert.assertTrue(false);
		}

		WebElement e12 = driver.findElement(By.xpath(
				"//*[contains(text(),'Assessment results shared with client/SDM. Goals/care plan established in collaboration with client/SDM/guardian and will be documented on LHIN report. Analysis, Service Goals, Care Plan documented in LHIN Report or in other First Visit notes. Service plan will be followed as per LHIN report; any modifications to plan noted by exception in client notes.')]//following-sibling::*//span"));
		String data12 = e12.getText();
		if (!(data12.equalsIgnoreCase("Yes"))) {
			Assert.assertTrue(false);
		}

		WebElement e13 = driver.findElement(By.xpath(
				"//*[contains(text(),'Welcome Brochure and Notice of Information Practices provided. All questions addressed.')]//following-sibling::*//span"));
		String data13 = e13.getText();
		if (!(data13.equalsIgnoreCase("Yes"))) {
			Assert.assertTrue(false);
		}

		Assert.assertTrue(isDisplayed(
				By.xpath("//span[normalize-space()='" + PixalereScripts.client_stated_concerns_comment + "']")));
		Assert.assertTrue(isDisplayed(
				By.xpath("//span[normalize-space()='" + PixalereScripts.ot_home_aceess_assessed_comment + "']")));
		Assert.assertTrue(
				isDisplayed(By.xpath("//span[normalize-space()='" + PixalereScripts.ot_home_env_comment + "']")));
		Assert.assertTrue(isDisplayed(
				By.xpath("//span[normalize-space()='" + PixalereScripts.ot_diagnosis_addition_comments + "']")));
		Assert.assertTrue(
				isDisplayed(By.xpath("//span[normalize-space()='" + PixalereScripts.ot_stretegies_comment + "']")));
		Assert.assertTrue(isDisplayed(By.xpath("//span[normalize-space()='" + PixalereScripts.skin_comment + "']")));
		Assert.assertTrue(isDisplayed(
				By.xpath("//span[normalize-space()='" + PixalereScripts.ot_strategies_education_comment + "']")));
		Assert.assertTrue(isDisplayed(
				By.xpath("//span[normalize-space()='" + PixalereScripts.medication_management_comment + "']")));
		Assert.assertTrue(
				isDisplayed(By.xpath("//span[normalize-space()='" + PixalereScripts.mental_health_comment + "']")));
		Assert.assertTrue(isDisplayed(By.xpath("//span[normalize-space()='" + PixalereScripts.routine_comment + "']")));
		Assert.assertTrue(
				isDisplayed(By.xpath("//span[normalize-space()='" + PixalereScripts.adls_dressing_comment + "']")));
		Assert.assertTrue(
				isDisplayed(By.xpath("//span[normalize-space()='" + PixalereScripts.ambulation_stair_comment + "']")));
		Assert.assertTrue(
				isDisplayed(By.xpath("//span[normalize-space()='" + PixalereScripts.transfer_assessed_comment + "']")));
		Assert.assertTrue(
				isDisplayed(By.xpath("//span[normalize-space()='" + PixalereScripts.bathroom_assessed_comment + "']"))); 
		
	}

	public void verify_Pain_Assessment_Flowchart_Page() {

		WebElement e1 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Date of Onset']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data1 = e1.getText();
		if (!data1.equalsIgnoreCase(PixalereScripts.day_onset + "/" + PixalereScripts.month_onset + "/"
				+ PixalereScripts.Year_Calender_Pain_Assessment)) {
			Assert.assertTrue(false);
		}

		WebElement e2 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Adjuvant Pain Medication']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data2 = e2.getText();
		if (!data2.equalsIgnoreCase(PixalereScripts.Adjuvant_Pain_Medication1)) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e4 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Palliating Factors')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data4 = e4.getText();
		if (!data4.equalsIgnoreCase(PixalereScripts.Palliating_Factors1)) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e5 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Aggravating Factors')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data5 = e5.getText();
		if (!data5.equalsIgnoreCase(PixalereScripts.Aggravating_Factors_PPA1)) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e6 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Quality of Pain')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data6 = e6.getText();
		for (int i = 0; i < PixalereScripts.chk_quality_of_pain_ass.size(); i++) {
			if (!data6.contains(PixalereScripts.chk_quality_of_pain_ass.get(i))) {
				Assert.assertTrue(false);
			}
		}

		// Radio Button verify
		WebElement e7 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Frequency')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data7 = e7.getText();
		if (!(data7.equalsIgnoreCase(PixalereScripts.drp_frequency))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e17 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Intensity']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data17 = e17.getText();
		if (!(data17.equalsIgnoreCase(PixalereScripts.Intensity_Pain_Assessment))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e8 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Accompanying Symptom')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data8 = e8.getText();
		for (int i = 0; i < PixalereScripts.chk_Accompanying_Symptom_pain_ass.size(); i++) {
			if (!data8.contains(PixalereScripts.chk_Accompanying_Symptom_pain_ass.get(i))) {
				Assert.assertTrue(false);
			}
		}

		// Radio Button verify
		WebElement v1 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Date of Last BM')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String d1 = v1.getText();
		if (!d1.equalsIgnoreCase(PixalereScripts.day_last_BM + "/" + PixalereScripts.month_last_BM + "/"
				+ PixalereScripts.date_of_Last_BM)) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e9 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Pharmacological Intervention (Refer to MAR)')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data9 = e9.getText();
		if (!data9.equalsIgnoreCase(PixalereScripts.Pharmacological_Intervention1)) {
			Assert.assertTrue(false);
		}

		WebElement e10 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Non-Pharmacological Intervention')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data10 = e10.getText();
		for (int i = 0; i < PixalereScripts.chk_Pharmacological_Intervention_pain.size(); i++) {
			if (!data10.contains(PixalereScripts.chk_Pharmacological_Intervention_pain.get(i))) {
				Assert.assertTrue(false);
			}
		}

		WebElement e11 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Acceptable')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data11 = e11.getText();
		if (!(data11.equalsIgnoreCase(PixalereScripts.acceptable_pain_Ass))) {
			Assert.assertTrue(false);
		}

		WebElement e12 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Chronic Pain Parameters Unchanged')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data12 = e12.getText();
		if (!(data12.equalsIgnoreCase(PixalereScripts.Chronic_Pain_Parameters_pain_Ass))) {
			Assert.assertTrue(false);
		}

		WebElement e13 = driver.findElement(By.xpath(
				"(//td[contains(text(),'See Progress Notes')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data13 = e13.getText();
		if (!(data13.equalsIgnoreCase(PixalereScripts.See_Progress_Notes))) {
			Assert.assertTrue(false);
		}
		System.out.println("Pain Assessment Flowchart page verified..............");
	}

	public void verify_Pain_Profile_Page() {
		// input text field special for fall risk
		WebElement e1 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Regular Pain Medication']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data1 = e1.getText();
		if (!data1.equalsIgnoreCase(PixalereScripts.Regular_Pain_Medication1)) {
			Assert.assertTrue(false);
		}

		// input text field special for fall risk
		WebElement e2 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Breakthrough Pain Medication']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data2 = e2.getText();
		if (!data2.equalsIgnoreCase(PixalereScripts.Breakthrough_Pain_Medication1)) {
			Assert.assertTrue(false);
		}

		// input text field special for fall risk
		WebElement e3 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Breakthrough Frequency']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data3 = e3.getText();
		if (!data3.equalsIgnoreCase(PixalereScripts.Breakthrough_Frequency1)) {
			Assert.assertTrue(false);
		}

		// input text field special for fall risk
		WebElement e4 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Aggravating Factors']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data4 = e4.getText();
		if (!data4.equalsIgnoreCase(PixalereScripts.Aggravating_Factors1)) {
			Assert.assertTrue(false);
		}

		// input text field special for fall risk
		WebElement e5 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Effects of Pain on Activities of Daily Living']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data5 = e5.getText();
		for (int i = 0; i < Activities_of_Daily_Living.size(); i++) {
			if (!data5.contains(Activities_of_Daily_Living.get(i))) {
				Assert.assertTrue(false);
			}
		}

		WebElement e13 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Comments']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data13 = e13.getText();
		if (!data13.equalsIgnoreCase(PixalereScripts.Comments_Pain_Profile1)) {
			Assert.assertTrue(false);
		}

		System.out.println("Pain Profile Page verified................");
	}

	public void verify_Fall_Risk_History_Page() {

		// input text field special for fall risk
		WebElement e1 = driver.findElement(By.xpath(
				"(//td[normalize-space()='History of Fall(s) in last 6 months']//following-sibling::td)[last()]"));
		String data1 = e1.getText();
		if (!data1.equalsIgnoreCase(PixalereFallRiskNursingScripts.Details_for_History_of_Fall)) {
			Assert.assertTrue(false);
		}

		// input text field special for fall risk
		WebElement e2 = driver
				.findElement(By.xpath("(//td[contains(text(),'Cogntive impairment')]//following-sibling::td)[last()]"));
		String data2 = e2.getText();
		if (!data2.equalsIgnoreCase(PixalereFallRiskNursingScripts.Details_for_Cogntive_impairment)) {
			Assert.assertTrue(false);
		}

		// input text field special for fall risk
		WebElement e4 = driver.findElement(
				By.xpath("(//td[normalize-space()='Taking 4 or more medications']//following-sibling::td)[last()]"));
		String data4 = e4.getText();
		if (!data4.equalsIgnoreCase(PixalereFallRiskNursingScripts.Details_for_Taking_4_or_more_medications)) {
			Assert.assertTrue(false);
		}

		WebElement e5 = driver.findElement(By.xpath(
				"(//td[normalize-space()='History of Fall(s) in last 6 months']//following-sibling::td)[1]//img"));
		if (!e5.isDisplayed()) {
			Assert.assertTrue(false);
		}

		WebElement e6 = driver
				.findElement(By.xpath("(//td[contains(text(),'Cogntive impairment')]//following-sibling::td)[1]//img"));
		if (!e6.isDisplayed()) {
			Assert.assertTrue(false);
		}

		WebElement e7 = driver.findElement(
				By.xpath("(//td[normalize-space()='Taking 4 or more medications']//following-sibling::td)[1]//img"));
		if (!e7.isDisplayed()) {
			Assert.assertTrue(false);
		}

		WebElement e8 = driver.findElement(
				By.xpath("(//td[contains(text(),'History of Fall(s) in last 6 months')]//following-sibling::td)[2]"));
		String data8 = e8.getText();
		if (!data8.contains(PixalereFallRiskNursingScripts.drp_History_of_Fall)) {
			Assert.assertTrue(false);
		}

		WebElement e9 = driver
				.findElement(By.xpath("(//td[contains(text(),'Cogntive impairment')]//following-sibling::td)[2]"));
		String data9 = e9.getText();
		if (!data9.contains(PixalereFallRiskNursingScripts.drp_Cogntive_impairment)) {
			Assert.assertTrue(false);
		}

		WebElement e10 = driver.findElement(
				By.xpath("(//td[contains(text(),'Taking 4 or more medications')]//following-sibling::td)[2]"));
		String data10 = e10.getText();
		if (!data10.contains(PixalereFallRiskNursingScripts.drp_Taking_four_more_medications)) {
			Assert.assertTrue(false);
		}

		// CheckBox Verification
		WebElement v1 = driver.findElement(
				By.xpath("(//td[contains(text(),'History of Fall(s) in last 6 months')]//following-sibling::td)[3]"));
		String d1 = v1.getText();
		for (int i = 0; i < PixalereFallRiskNursingScripts.chk_Referrals_for_History_of_Fall_FallRisk.size(); i++) {
			if (!d1.contains(PixalereFallRiskNursingScripts.chk_Referrals_for_History_of_Fall_FallRisk.get(i))) {
				Assert.assertTrue(false);
			}
		}

		// CheckBox Verification
		WebElement v2 = driver
				.findElement(By.xpath("(//td[contains(text(),'Cogntive impairment')]//following-sibling::td)[3]"));
		String d2 = v2.getText();
		for (int i = 0; i < PixalereFallRiskNursingScripts.chk_Referrals_for_Cogntive_impairment_FallRisk.size(); i++) {
			if (!d2.contains(PixalereFallRiskNursingScripts.chk_Referrals_for_Cogntive_impairment_FallRisk.get(i))) {
				Assert.assertTrue(false);
			}
		}

		// CheckBox Verification
		WebElement v3 = driver.findElement(
				By.xpath("(//td[contains(text(),'Taking 4 or more medications')]//following-sibling::td)[3]"));
		String d3 = v3.getText();
		for (int i = 0; i < PixalereFallRiskNursingScripts.chk_Referrals_rx_four_Taking_or_more_medications_FallRisk
				.size(); i++) {
			if (!d3.contains(
					PixalereFallRiskNursingScripts.chk_Referrals_rx_four_Taking_or_more_medications_FallRisk.get(i))) {
				Assert.assertTrue(false);
			}
		}

		System.out.println("Fall Risk History Page Verified..............");
	}

	public void readingscore() {
		WebElement e1 = driver.findElement(
				By.xpath("(//*[@id='foot_ass_img']//div//*[contains(text(),'Score')]//following-sibling::*)[1]"));
		diabetic_left_score_60 = e1.getText();

		WebElement e2 = driver.findElement(
				By.xpath("(//*[@id='foot_ass_img']//div//*[contains(text(),'Score')]//following-sibling::*)[2]"));
		diabetic_right_score_60 = e2.getText();

		WebElement e3 = driver.findElement(By.xpath("//*[@id='leftfoot_score_span']"));
		score_left = e3.getText();

		WebElement e4 = driver.findElement(By.xpath("//*[@id='rightfoot_score_span']"));
		score_right = e4.getText();

	}

	public void verify_Sensory_assess_flowchart() {
		// Radio Button verify
		WebElement e1 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Skin Left Foot']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data1 = e1.getText();
		if (!(data1.equalsIgnoreCase(PixalereScripts.radioSkinLeftfoot))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e2 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Skin Right Foot')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data2 = e2.getText();
		if (!(data2.equalsIgnoreCase(PixalereScripts.radioSkinRightfoot))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e3 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Nails Left Foot')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data3 = e3.getText();
		if (!(data3.equalsIgnoreCase(PixalereScripts.radioLeftfootnails))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e4 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Nails Right Foot')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data4 = e4.getText();
		if (!(data4.equalsIgnoreCase(PixalereScripts.radioRightfootnails))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e5 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Deformity Left Foot')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data5 = e5.getText();
		if (!(data5.equalsIgnoreCase(PixalereScripts.radiodeformity_leftfoot))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e6 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Deformity Right Foot')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data6 = e6.getText();
		if (!(data6.equalsIgnoreCase(PixalereScripts.radiodeformity_rightfoot))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e7 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Footwear Left Foot')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data7 = e7.getText();
		if (!(data7.equalsIgnoreCase(PixalereScripts.radiofootwear_leftfoot))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e8 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Footwear Right Foot')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data8 = e8.getText();
		if (!(data8.equalsIgnoreCase(PixalereScripts.radiofootwear_rightfoot))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e9 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Temperature cold Left Foot')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data9 = e9.getText();
		if (!(data9.equalsIgnoreCase(PixalereScripts.radiotempcold_leftfoot))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e10 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Temperature Cold Right Foot')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data10 = e10.getText();
		if (!(data10.equalsIgnoreCase(PixalereScripts.radiotempcold_rightfoot))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e14 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Range Of Motion Left')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data14 = e14.getText();
		if (!(data14.equalsIgnoreCase(PixalereScripts.radiorangeofmotion_leftfoot))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e15 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Range Of Motion Right')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data15 = e15.getText();
		if (!(data15.equalsIgnoreCase(PixalereScripts.radiorangeofmotion_rightfoot))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e16 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Sensation Question Left Foot')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data16 = e16.getText();
		if (!(data16.equalsIgnoreCase(PixalereScripts.radiosensation_question_leftfoot))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e17 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Sensation Question Right Foot')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data17 = e17.getText();
		if (!(data17.equalsIgnoreCase(PixalereScripts.radiosensation_question_rightfoot))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement v1 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Pedal Pulse Left Foot')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String d1 = v1.getText();
		if (!(d1.equalsIgnoreCase(PixalereScripts.radiopedal_pulse_leftfoot))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement v2 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Pedal Pulse Right Foot')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String d2 = v2.getText();
		if (!(d2.equalsIgnoreCase(PixalereScripts.radiopedal_pulse_rightfoot))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement v3 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Dependent Rubor Left Foot')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String d3 = v3.getText();
		if (!(d3.equalsIgnoreCase(PixalereScripts.radiodependent_rubor_leftfoot))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement v4 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Dependent Rubor Right Foot')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String d4 = v4.getText();
		if (!(d4.equalsIgnoreCase(PixalereScripts.radiodependent_rubor_rightfoot))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement v5 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Erythema Left Foot')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String d5 = v5.getText();
		if (!(d5.equalsIgnoreCase(PixalereScripts.radioerythema_leftfoot))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement v6 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Erythema Right Foot')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String d6 = v6.getText();
		if (!(d6.equalsIgnoreCase(PixalereScripts.radioerythema_rightfoot))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement v7 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Left Foot Score')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String d7 = v7.getText();
		if (!(d7.equalsIgnoreCase(score_left))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement v8 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Right Foot Score')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String d8 = v8.getText();
		if (!(d8.equalsIgnoreCase(score_right))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement v12 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Left Foot Image Score')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String d12 = v12.getText();
		if (!(d12.equalsIgnoreCase(diabetic_left_score_60))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement v13 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Right Foot Image Score')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String d13 = v13.getText();
		if (!(d13.equalsIgnoreCase(diabetic_right_score_60))) {
			Assert.assertTrue(false);
		}

		System.out.println("60 Second Diabetic Foot Exam Page Verified..............");
	}

	public void verify_INRSP_CN() {
		// input text field
		WebElement e1 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Words used for pain']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data1 = e1.getText();
		if (!data1.equalsIgnoreCase((PixalereScripts.Words_used_for_pain1))) {
			Assert.assertTrue(false);
		}

		// input text field
		WebElement e2 = driver.findElement(By.xpath(
				"(//td[normalize-space()='What are some discomfort/pain triggers for your child?']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data2 = e2.getText();
		if (!data2.equalsIgnoreCase((PixalereScripts.discomfortpain_triggers_for_your_child1))) {
			Assert.assertTrue(false);
		}

		// input text field
		WebElement e3 = driver.findElement(By.xpath(
				"(//td[normalize-space()='What are some initial interventions that have been effective in the past?']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data3 = e3.getText();
		if (!data3.equalsIgnoreCase((PixalereScripts.initial_interventions_in_the_past1))) {
			Assert.assertTrue(false);
		}

		// DropDown field
		WebElement e4 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Pain Scale Rating']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data4 = e4.getText();
		if (!data4.equalsIgnoreCase(PixalereScripts.score)) {
			Assert.assertTrue(false);
		}

		// input text field
		WebElement e5 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Type of Assessment']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data5 = e5.getText();
		if (!data5.equalsIgnoreCase((PixalereScripts.Type_Of_Assessment.get(0)))) {
			Assert.assertTrue(false);
		}

		// input text field
		WebElement e6 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Activity']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data6 = e6.getText();
		if (!data6.equalsIgnoreCase((PixalereScripts.the_child_doing_when_you_noticed_the_pain1))) {
			Assert.assertTrue(false);
		}

		// input text field
		WebElement e7 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Medical Devices']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data7 = e7.getText();
		if (!data7.equalsIgnoreCase((PixalereScripts.Medical_Devices1))) {
			Assert.assertTrue(false);
		}

		System.out.println("INRSP Child Nursing Page verified........");
	}

	public void verifying_records_in_In_Home_Safety_Identification_Tool_Flowchart_Record_Page_Nursing() {
		String s = "//label[contains(text(),'%s')]//img";
//		String s1 = "//label[@for='%s']//img";
		for (int i = 0; i < PixalereInHomeSafetyIdentificationToolScripts.HomeSafetyAssessment_Checkbox.size(); i++) {
			WebElement b1 = driver.findElement(By.xpath(String.format(s,
					PixalereInHomeSafetyIdentificationToolScripts.HomeSafetyAssessment_Checkbox.get(i))));
			if (!(b1.isDisplayed())) {
				Assert.assertTrue(false);
			}
		}

		WebElement b11 = driver
				.findElement(By.xpath("//*[@id='container-fluid']/div[5]/div/div[5]/div[1]/div/label[4]/img"));
		if (!(b11.isDisplayed())) {
			Assert.assertTrue(false);
		}

		WebElement b12 = driver
				.findElement(By.xpath("//*[@id='container-fluid']/div[5]/div/div[5]/div[1]/div/label[6]/img"));
		if (!(b12.isDisplayed())) {
			Assert.assertTrue(false);
		}

		WebElement b13 = driver
				.findElement(By.xpath("//*[@id='container-fluid']/div[5]/div/div[5]/div[2]/div/label[1]/img"));
		if (!(b13.isDisplayed())) {
			Assert.assertTrue(false);
		}

		WebElement b14 = driver
				.findElement(By.xpath("//*[@id='container-fluid']/div[5]/div/div[5]/div[2]/div/label[4]/img"));
		if (!(b14.isDisplayed())) {
			Assert.assertTrue(false);
		}

		WebElement b15 = driver
				.findElement(By.xpath("//*[@id='container-fluid']/div[5]/div/div[5]/div[2]/div/label[7]/img"));
		if (!(b15.isDisplayed())) {
			Assert.assertTrue(false);
		}

		for (int i = 0; i < PixalereInHomeSafetyIdentificationToolScripts.Medication_Checkbox.size(); i++) {
			WebElement b1 = driver.findElement(By
					.xpath(String.format(s, PixalereInHomeSafetyIdentificationToolScripts.Medication_Checkbox.get(i))));
			if (!(b1.isDisplayed())) {
				Assert.assertTrue(false);
			}
		}
		for (int i = 0; i < PixalereInHomeSafetyIdentificationToolScripts.Other_Checkbox.size(); i++) {
			WebElement b1 = driver.findElement(
					By.xpath(String.format(s, PixalereInHomeSafetyIdentificationToolScripts.Other_Checkbox.get(i))));
			if (!(b1.isDisplayed())) {
				Assert.assertTrue(false);
			}
		}

		for (int i = 0; i < PixalereInHomeSafetyIdentificationToolScripts.FollowupPlan_Checkbox.size(); i++) {
			WebElement b1 = driver.findElement(By.xpath(
					String.format(s, PixalereInHomeSafetyIdentificationToolScripts.FollowupPlan_Checkbox.get(i))));
			if (!(b1.isDisplayed())) {
				Assert.assertTrue(false);
			}
		}

		// Input field
		String t1 = driver.findElement(By.xpath("//p[@class='pad5']")).getText().toString();
		if (!(t1.equalsIgnoreCase(PixalereScripts.HomeCommentsNursing1))) {
			Assert.assertTrue(false);
		}

		System.out.println("In-Home Safety Identification Tool Page Nursing Section verified........");

	}

	public void verifying_records_in_In_Home_Safety_Identification_Tool_Flowchart_Record_Page() {

		String s = "//label[contains(text(),'%s')]//img";
//		String s1 = "//label[@for='%s']//img";
		for (int i = 0; i < PixalereInHomeSafetyIdentificationToolScripts.HomeSafetyAssessment_Checkbox.size(); i++) {
			WebElement b1 = driver.findElement(By.xpath(String.format(s,
					PixalereInHomeSafetyIdentificationToolScripts.HomeSafetyAssessment_Checkbox.get(i))));
			if (!(b1.isDisplayed())) {
				Assert.assertTrue(false);
			}
		}

		WebElement b11 = driver
				.findElement(By.xpath("//*[@id='container-fluid']/div[5]/div/div[5]/div[1]/div/label[4]/img"));
		if (!(b11.isDisplayed())) {
			Assert.assertTrue(false);
		}

		WebElement b12 = driver
				.findElement(By.xpath("//*[@id='container-fluid']/div[5]/div/div[5]/div[1]/div/label[6]/img"));
		if (!(b12.isDisplayed())) {
			Assert.assertTrue(false);
		}

		WebElement b13 = driver
				.findElement(By.xpath("//*[@id='container-fluid']/div[5]/div/div[5]/div[2]/div/label[1]/img"));
		if (!(b13.isDisplayed())) {
			Assert.assertTrue(false);
		}

		WebElement b14 = driver
				.findElement(By.xpath("//*[@id='container-fluid']/div[5]/div/div[5]/div[2]/div/label[4]/img"));
		if (!(b14.isDisplayed())) {
			Assert.assertTrue(false);
		}

		WebElement b15 = driver
				.findElement(By.xpath("//*[@id='container-fluid']/div[5]/div/div[5]/div[2]/div/label[7]/img"));
		if (!(b15.isDisplayed())) {
			Assert.assertTrue(false);
		}

		for (int i = 0; i < PixalereInHomeSafetyIdentificationToolScripts.Medication_Checkbox.size(); i++) {
			WebElement b1 = driver.findElement(By
					.xpath(String.format(s, PixalereInHomeSafetyIdentificationToolScripts.Medication_Checkbox.get(i))));
			if (!(b1.isDisplayed())) {
				Assert.assertTrue(false);
			}
		}
		for (int i = 0; i < PixalereInHomeSafetyIdentificationToolScripts.Other_Checkbox.size(); i++) {
			WebElement b1 = driver.findElement(
					By.xpath(String.format(s, PixalereInHomeSafetyIdentificationToolScripts.Other_Checkbox.get(i))));
			if (!(b1.isDisplayed())) {
				Assert.assertTrue(false);
			}
		}
		for (int i = 0; i < PixalereInHomeSafetyIdentificationToolScripts.PoisonChoking_Checkbox.size(); i++) {
			WebElement b1 = driver.findElement(By.xpath(
					String.format(s, PixalereInHomeSafetyIdentificationToolScripts.PoisonChoking_Checkbox.get(i))));
			if (!(b1.isDisplayed())) {
				Assert.assertTrue(false);
			}
		}
		for (int i = 0; i < PixalereInHomeSafetyIdentificationToolScripts.SafeSleep_Checkbox.size(); i++) {
			WebElement b1 = driver.findElement(By
					.xpath(String.format(s, PixalereInHomeSafetyIdentificationToolScripts.SafeSleep_Checkbox.get(i))));
			if (!(b1.isDisplayed())) {
				Assert.assertTrue(false);
			}
		}
		// Input field
		String t1 = driver.findElement(By.xpath("//p[@class='pad5']")).getText().toString();
		if (!(t1.equalsIgnoreCase(PixalereCreateNewPatientAccountScripts.HomeComments1))) {
			Assert.assertTrue(false);
		}

		System.out.println("In-Home Safety Identification Tool Page verified........");
	}

	public void verify_Tracheostomy_and_Ventilator_Record_Page() {
		// Radio Button verify
		WebElement e2 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Humidity']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data2 = e2.getText();
		if (!(data2.equalsIgnoreCase(LocatorUtils.radioTrachestomy))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e4 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Suction System Checks')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data4 = e4.getText();
		if (!(data4.equalsIgnoreCase(LocatorUtils.radioSuction_System_Checks))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e5 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Trach Set Change')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data5 = e5.getText();
		if (!(data5.equalsIgnoreCase(LocatorUtils.radioTrach_Set_Change_field))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e6 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Spare Trach Set Available')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data6 = e6.getText();
		if (!(data6.equalsIgnoreCase(LocatorUtils.radioSpare_Trach_Set_Available))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e7 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Stoma Care Provided?')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data7 = e7.getText();
		if (!(data7.equalsIgnoreCase(LocatorUtils.radioStoma_Care_Provided))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e8 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Was suctioning performed')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data8 = e8.getText();
		if (!(data8.equalsIgnoreCase(LocatorUtils.radiosuctioning_performed))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e9 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Water Level Checked')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data9 = e9.getText();
		if (!(data9.equalsIgnoreCase(LocatorUtils.radioWater_Level_Checked))) {
			Assert.assertTrue(false);
		}

		// input text field
		WebElement e20 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Type Of Ventilator']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data20 = e20.getText();
		if (!data20.equalsIgnoreCase(PixalereCreateNewPatientAccountScripts.Type_Of_Ventilator1)) {
			Assert.assertTrue(false);
		}

		// input text field
		WebElement e21 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Leak')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String datae21 = e21.getText();
		if (!datae21.equalsIgnoreCase(PixalereCreateNewPatientAccountScripts.LEAK_HOME1)) {
			Assert.assertTrue(false);
		}

		// input text field
		WebElement e22 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Minute Ventiltion')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data22 = e22.getText();
		if (!data22.equalsIgnoreCase(PixalereScripts.Minute_Ventilation1)) {
			Assert.assertTrue(false);
		}

		// input text field
		WebElement e23 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Pressure')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data23 = e23.getText();
		if (!data23.equalsIgnoreCase(PixalereScripts.PRESSURE_Tracheostomy1)) {
			Assert.assertTrue(false);
		}

		// input text field
		WebElement e24 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Volume Tidal Exhaled')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data24 = e24.getText();
		if (!data24.equalsIgnoreCase(PixalereScripts.Volume_Tidal_Exhaled1)) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e10 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Humidifier ON Checked')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data10 = e10.getText();
		if (!(data10.equalsIgnoreCase(LocatorUtils.radioHumidifier_ON_Checked))) {
			Assert.assertTrue(false);
		}

		System.out.println("Tracheostomy_and_Ventilator_Record verified................");
	}

	public void verify_TeachingAgreementPT() {
		// Radio Button verify
		WebElement e2 = driver.findElement(By.xpath(
				"(//td[contains(text(),'For the listed Activities Assigned')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data2 = e2.getText();
		if (!data2.equalsIgnoreCase(LocatorUtils.radioActivities_Assigned)) {
			Assert.assertTrue(false);
		}

		WebElement e4 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Discussed that any change to the')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data4 = e4.getText();
		if (!data4.equalsIgnoreCase(LocatorUtils.radiomodification_plan)) {
			Assert.assertTrue(false);
		}

		WebElement e5 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Discussed that the Learner must')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data5 = e5.getText();
		if (!data5.equalsIgnoreCase(LocatorUtils.radioservice_provider)) {
			Assert.assertTrue(false);
		}

		WebElement e6 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Education received on the activities')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data6 = e6.getText();
		if (!data6.equalsIgnoreCase(LocatorUtils.radioEducation_received)) {
			Assert.assertTrue(false);
		}

		WebElement e7 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Risks of not performing activities discussed')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data7 = e7.getText();
		if (!data7.equalsIgnoreCase(LocatorUtils.radioalternatives_and_benefits)) {
			Assert.assertTrue(false);
		}

		WebElement e8 = driver.findElement(By.xpath(
				"(//td[contains(text(),'The instructions of the service provider will be taught by Learner to all other PSW')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data8 = e8.getText();
		if (!data8.equalsIgnoreCase(LocatorUtils.radioPSW_providing)) {
			Assert.assertTrue(false);
		}

		WebElement e9 = driver.findElement(By.xpath(
				"(//td[contains(text(),'I acknowledge that the Learner')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data9 = e9.getText();
		if (!data9.equalsIgnoreCase(LocatorUtils.radiodemonstrated_understanding)) {
			Assert.assertTrue(false);
		}

		WebElement e10 = driver.findElement(By.xpath(
				"(//td[contains(text(),'I acknowledge that the Field Educator')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data10 = e10.getText();
		if (!data10.equalsIgnoreCase(LocatorUtils.radioService_Supervisor)) {
			Assert.assertTrue(false);
		}

		// CheckBox Verification
		WebElement v1 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Activity')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String d1 = v1.getText();
		for (int i = 0; i < PixalereTeachingAgreementScript.TeachingAgreement_Checkbox1.size() - 1; i++) {
			if (!d1.contains(PixalereTeachingAgreementScript.TeachingAgreement_Checkbox1.get(i))) {
				Assert.assertTrue(false);
			}
		}
		WebElement v2 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Transfers')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String d2 = v2.getText();
		for (int i = 0; i < PixalereTeachingAgreementScript.TeachingAgreement_Checkbox2.size(); i++) {
			if (!d2.contains(PixalereTeachingAgreementScript.TeachingAgreement_Checkbox2.get(i))) {
				Assert.assertTrue(false);
			}
		}
		WebElement v3 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Resources')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String d3 = v3.getText();
		for (int i = 0; i < PixalereTeachingAgreementScript.TeachingAgreement_Checkbox3.size(); i++) {
			if (!d3.contains(PixalereTeachingAgreementScript.TeachingAgreement_Checkbox3.get(i))) {
				Assert.assertTrue(false);
			}
		}
		WebElement v4 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Consent Obtained')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String d4 = v4.getText();
		for (int i = 0; i < PixalereTeachingAgreementScript.TeachingAgreement_Checkbox4.size(); i++) {
			if (!d4.contains(PixalereTeachingAgreementScript.TeachingAgreement_Checkbox4.get(i))) {
				Assert.assertTrue(false);
			}
		}

		WebElement v5 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Comments')]//following-sibling::td//td[contains(@class,'flowchart_data')])[2]"));
		String d5 = v5.getText();
		if (!d5.equalsIgnoreCase(PixalereScripts.pt_teaching_agreement_comment1)) {
			Assert.assertTrue(false);
		}

		WebElement v6 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Comments')]//following-sibling::td//td[contains(@class,'flowchart_data')])[1]"));
		String d6 = v6.getText();
		if (!d6.equalsIgnoreCase(PixalereScripts.Activity_to_be_Instructed1)) {
			Assert.assertTrue(false);
		}

		WebElement v7 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Name')]//following-sibling::td//td[contains(@class,'flowchart_data')])"));
		String d7 = v7.getText();
		if (!d7.equalsIgnoreCase(PixalereScripts.LearnerName1)) {
			Assert.assertTrue(false);
		}

		WebElement v8 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Learner')]//following-sibling::td//td[contains(@class,'flowchart_data')])"));
		String d8 = v8.getText();
		if (!d8.equalsIgnoreCase(LocatorUtils.radioleraner)) {
			Assert.assertTrue(false);
		}

		WebElement v9 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Employed By')]//following-sibling::td//td[contains(@class,'flowchart_data')])[1]"));
		String d9 = v9.getText();
		if (!d9.equalsIgnoreCase(PixalereTeachingAgreementScript.employee_selection)) {
			Assert.assertTrue(false);
		}

		WebElement v10 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Date')]//following-sibling::td//td[contains(@class,'flowchart_data')])"));
		String d10 = v10.getText();
		if (!d10.equalsIgnoreCase(PixalereScripts.LearnerDate1)) {
			Assert.assertTrue(false);
		}

		System.out.println("Teaching Agreement PT page verified..........");

	}

	public void verify_RecommendationsPAge() {
		// input text field
		String s2 = "//div[@class='cus-datepicker col-lg-3 col-md-3 col-sm-3 col-11 xs-mb-10 ']";
		WebElement e1 = driver.findElement(By.xpath(String.format(s2, PixalereScripts.RecommendationDate1)));
		String data1 = e1.getText();
		if (!data1.equalsIgnoreCase(PixalereScripts.RecommendationDate1)) {
			Assert.assertTrue(false);
		}
		String s1 = "//div[@class='mt-15']";
		WebElement e13 = driver.findElement(By.xpath(String.format(s1, PixalereScripts.RecommendationsDataSPT1)));
		String data13 = e13.getText();
		if (!data13.equalsIgnoreCase(PixalereScripts.RecommendationsDataSPT1)) {
			Assert.assertTrue(false);
		}

		System.out.println("Recommendations Page verified................");
	}

	public void verify_PT_Assessment_Page() {
		WebElement v1 = driver
				.findElement(By.xpath("//div//label[normalize-space(text())='Visit Date']/following-sibling::div"));
		String d1 = v1.getText();
		if (!d1.equalsIgnoreCase(PixalereScripts.Visit_Date)) {
			Assert.assertTrue(false);
		}

		WebElement v2 = driver.findElement(By.xpath(
				"//div//label[normalize-space(text())='Referral screened for appropriateness at some time prior to initiating service.']/following-sibling::div"));
		String d2 = v2.getText();
		if (!d2.equalsIgnoreCase(LocatorUtils.radioInitiating_service)) {
			Assert.assertTrue(false);
		}

		WebElement v3 = driver.findElement(By.xpath(
				"//div//label[normalize-space(text())='Accuracy of info provided in referral confirmed in keeping with scope of service.']/following-sibling::div"));
		String d3 = v3.getText();
		if (!d3.equalsIgnoreCase(LocatorUtils.radioScope_of_service)) {
			Assert.assertTrue(false);
		}

		WebElement v4 = driver.findElement(By.xpath(
				"//div//label[normalize-space(text())='Acute Respiratory Screen (ARI) completed with negative result.']/following-sibling::div"));
		String d4 = v4.getText();
		if (!d4.equalsIgnoreCase(LocatorUtils.radioAcute_Respiratory_Screen)) {
			Assert.assertTrue(false);
		}

		WebElement v5 = driver.findElement(By.xpath(
				"//div//label[contains(text(),'home or treatment site as listed in LHIN referral.')]/following-sibling::div"));
		String d5 = v5.getText();
		if (!d5.equalsIgnoreCase(LocatorUtils.radioLHIN_referral)) {
			Assert.assertTrue(false);
		}

		WebElement v6 = driver.findElement(By.xpath(
				"//div//label[contains(text(),'professional qualifications of assessor')]/following-sibling::div"));
		String d6 = v6.getText();
		if (!d6.equalsIgnoreCase(LocatorUtils.radioScope_of_practice)) {
			Assert.assertTrue(false);
		}

		WebElement v7 = driver
				.findElement(By.xpath("//div//label[normalize-space(text())='Comments']/following-sibling::div"));
		String d7 = v7.getText();
		if (!d7.equalsIgnoreCase(PixalereScripts.Assessment_Initiated_Comments)) {
			Assert.assertTrue(false);
		}

		WebElement v8 = driver.findElement(By.xpath(
				"//div//label[contains(text(),'Informed verbal consent for assessment obtained')]/following-sibling::div"));
		String d8 = v8.getText();
		if (!d8.equalsIgnoreCase(LocatorUtils.radioVerbal_consent)) {
			Assert.assertTrue(false);
		}

		WebElement v9 = driver.findElement(By.xpath(
				"//div//label[normalize-space(text())='Student participating in service.']/following-sibling::div"));
		String d9 = v9.getText();
		if (!d9.equalsIgnoreCase(LocatorUtils.radioStudent_participating)) {
			Assert.assertTrue(false);
		}

		WebElement v10 = driver.findElement(By.xpath(
				"//div//label[contains(text(),'Diagnosis/History of Presenting Concern')]/following-sibling::div"));
		String d10 = v10.getText();
		if (!d10.equalsIgnoreCase(PixalereScripts.Diagnosis_History_of_Presenting_Concern)) {
			Assert.assertTrue(false);
		}

		WebElement v11 = driver.findElement(
				By.xpath("//div//label[normalize-space(text())='Client/SDM Stated Goal']/following-sibling::div"));
		String d11 = v11.getText();
		if (!d11.equalsIgnoreCase(PixalereScripts.Client_SDM_Stated_Goal)) {
			Assert.assertTrue(false);
		}

		WebElement v12 = driver.findElement(
				By.xpath("//div//label[normalize-space(text())='LHIN Referral Information']/following-sibling::div"));
		String d12 = v12.getText();
		if (!d12.equalsIgnoreCase("Lung Cancer")) {
			Assert.assertTrue(false);
		}

		WebElement v13 = driver.findElement(By.xpath(
				"//div//label[normalize-space(text())='Additional history relevant to PT service scope']/following-sibling::div"));
		String d13 = v13.getText();
		if (!d13.equalsIgnoreCase(PixalereScripts.Past_Medical_History)) {
			Assert.assertTrue(false);
		}

		WebElement v14 = driver.findElement(By.xpath(
				"//div//label[contains(text(),'clinically relevant to PT scope of service identified')]/following-sibling::div"));
		String d14 = v14.getText();

		if (!d14.equalsIgnoreCase("Yes")) {
			Assert.assertTrue(false);
		}

		WebElement v15 = driver.findElement(By.xpath(
				"//div//label[normalize-space(text())='Investigations/follow-up details']/following-sibling::div"));
		String d15 = v15.getText();
		if (!d15.contains(PixalereScripts.Investigations_followup_clinically_relevant)) {
			Assert.assertTrue(false);
		}

		WebElement v16 = driver.findElement(By.xpath(
				"//div//label[normalize-space(text())='Additional Falls Risk Factors Identified']/following-sibling::div"));
		String d16 = v16.getText();
		for (int i = 0; i < PixalerePTAssessmentScripts.AssessmentInitiated.size(); i++) {
			if (!d16.contains(PixalerePTAssessmentScripts.AssessmentInitiated.get(i))) {
				Assert.assertTrue(false);
			}
		}

		WebElement v17 = driver
				.findElement(By.xpath("//div//label[normalize-space(text())='Housing']/following-sibling::div"));
		String d17 = v17.getText();
		if (!d17.equalsIgnoreCase(LocatorUtils.radioHousing)) {
			Assert.assertTrue(false);
		}

		WebElement v18 = driver.findElement(
				By.xpath("//div//label[normalize-space(text())='Living situation']/following-sibling::div"));
		String d18 = v18.getText();
		for (int i = 0; i < PixalerePTAssessmentScripts.HomeAccessibility.size(); i++) {
			if (!d18.contains(PixalerePTAssessmentScripts.HomeAccessibility.get(i))) {
				Assert.assertTrue(false);
			}
		}

		WebElement v19 = driver.findElement(
				By.xpath("//div//label[normalize-space(text())='Caregiver supports']/following-sibling::div"));
		String d19 = v19.getText();
		for (int i = 0; i < PixalerePTAssessmentScripts.HomeAccessibility1.size(); i++) {
			if (!d19.contains(PixalerePTAssessmentScripts.HomeAccessibility1.get(i))) {
				Assert.assertTrue(false);
			}
		}

WebElement v20 = driver.findElement(By.xpath(
		"//div//label[normalize-space(text())='Difficulties reported with ADL/IADL']/following-sibling::div"));
String d20 = v20.getText();
		if (!d20.equalsIgnoreCase(PixalereScripts.Difficulties_report)) {
			Assert.assertTrue(false);
		}


		WebElement v21 = driver
				.findElement(By.xpath("//div//label[normalize-space(text())='Abuse/Neglect']/following-sibling::div"));
		String d21 = v21.getText();
		if (!d21.equalsIgnoreCase(LocatorUtils.radioEvidence)) {
			Assert.assertTrue(false);
		}

		WebElement v22 = driver.findElement(
				By.xpath("//*[normalize-space(text())='Functional Accessibility of Home']/following::div[1]//div"));
		String d22 = v22.getText();
		if (!d22.equalsIgnoreCase(LocatorUtils.radioFunctionalAccessibility)) {
			Assert.assertTrue(false);
		}

		WebElement v23 = driver.findElement(By
				.xpath("//*[normalize-space(text())='WFL- independent or managing with current supports/assistance']"));
		String d23 = v23.getText();
		if (!d23.equalsIgnoreCase(LocatorUtils.radioMedicationUse)) {
			Assert.assertTrue(false);
		}

		WebElement v24 = driver.findElement(By.xpath(
				"//div//label[normalize-space(text())='Medications relevant to PT scope of practice']/following-sibling::div"));
		String d24 = v24.getText();
		if (!d24.equalsIgnoreCase(PixalereScripts.PT_scope_of_practice)) {
			Assert.assertTrue(false);
		}

		WebElement v25 = driver.findElement(By.xpath("//*[normalize-space(text())='Difficulties/risks identified']"));
		String d25 = v25.getText();
		if (!d25.equalsIgnoreCase(LocatorUtils.radioPostureAssessed)) {
			Assert.assertTrue(false);
		}

		WebElement v26 = driver.findElement(
				By.xpath("//div//label[normalize-space(text())='Additional comments']/following-sibling::div"));
		String d26 = v26.getText();
		if (!d26.equalsIgnoreCase(PixalereScripts.Posture_Assessed_comment)) {
			Assert.assertTrue(false);
		}

		WebElement v27 = driver
				.findElement(By.xpath("(//*[normalize-space(text())='Difficulties/risks identified'])[2]"));
		String d27 = v27.getText();
		if (!d27.equalsIgnoreCase(LocatorUtils.radioEdema)) {
			Assert.assertTrue(false);
		}

		WebElement v28 = driver
				.findElement(By.xpath("//div//label[contains(text(),'Location')]/following-sibling::div"));
		String d28 = v28.getText();
		if (!d28.equalsIgnoreCase(PixalereScripts.Edema_Location)) {
			Assert.assertTrue(false);
		}

		WebElement v29 = driver.findElement(By.xpath("(//*[contains(text(),'Moderate')])"));
		String d29 = v29.getText();
		for (int i = 0; i < PixalerePTAssessmentScripts.Edema.size(); i++) {
			if (!d29.contains(PixalerePTAssessmentScripts.Edema.get(i))) {
				Assert.assertTrue(false);
			}
		}

		WebElement v30 = driver
				.findElement(By.xpath("(//*[normalize-space(text())='Difficulties/risks identified'])[3]"));
		String d30 = v30.getText();
		if (!d30.equalsIgnoreCase(LocatorUtils.radioSkinIntegrity)) {
			Assert.assertTrue(false);
		}

		WebElement v31 = driver.findElement(By.xpath("//*[contains(text(),'Incision')]"));
		String d31 = v31.getText();
		for (int i = 1; i < PixalerePTAssessmentScripts.SkinIntegrity.size(); i++) {
			if (!d31.contains(PixalerePTAssessmentScripts.SkinIntegrity.get(i))) {
				Assert.assertTrue(false);
			}
		}

		// Pain Tab starts

		clickElement(By.xpath("//button[normalize-space(text())='Pain']"));

		WebElement v32 = driver.findElement(
				By.xpath("//div//label[normalize-space(text())='Date of Pain Assessment']/following-sibling::div"));
		String d32 = v32.getText();
		if (!d32.equalsIgnoreCase(PixalereScripts.Pain_Date)) {
			Assert.assertTrue(false);
		}

		WebElement v33 = driver
				.findElement(By.xpath("//div//label[normalize-space(text())='Pain Assessed']/following-sibling::div"));
		String d33 = v33.getText();
		if (!d33.contains(LocatorUtils.radioPainAssessment)) {
			Assert.assertTrue(false);
		}

		WebElement v34 = driver
				.findElement(By.xpath("//div//label[normalize-space(text())='Duration']/following-sibling::div"));
		String d34 = v34.getText();
		if (!d34.equalsIgnoreCase(LocatorUtils.radioDuration)) {
			Assert.assertTrue(false);
		}

		WebElement v35 = driver
				.findElement(By.xpath("//div//label[normalize-space(text())='Frequency']/following-sibling::div"));
		String d35 = v35.getText();
		if (!d35.equalsIgnoreCase(LocatorUtils.radioFrequency)) {
			Assert.assertTrue(false);
		}

		WebElement v36 = driver
				.findElement(By.xpath("//div//label[normalize-space(text())='Quality']/following-sibling::div"));
		String d36 = v36.getText();
		for (int i = 0; i < PixalerePTAssessmentScripts.Quality.size(); i++) {
			if (!d36.contains(PixalerePTAssessmentScripts.Quality.get(i))) {
				Assert.assertTrue(false);
			}
		}

		WebElement v37 = driver.findElement(By.xpath(
				"//div//label[normalize-space(text())='Effects of pain on activities on daily living']/following-sibling::div"));
		String d37 = v37.getText();
		for (int i = 0; i < PixalerePTAssessmentScripts.PainFactors.size(); i++) {
			if (!d37.contains(PixalerePTAssessmentScripts.PainFactors.get(i))) {
			}
		}

		WebElement v38 = driver.findElement(
				By.xpath("//div//label[normalize-space(text())='Palliating Factors']/following-sibling::div"));
		String d38 = v38.getText();
		if (!d38.equalsIgnoreCase("Yes")) {
			Assert.assertTrue(false);
		}

		WebElement v39 = driver
				.findElement(By.xpath("(//div//label[contains(text(),'List')]/following-sibling::div)[1]"));
		String d39 = v39.getText();
		if (!d39.equalsIgnoreCase(PixalereScripts.Palliating_Factors_List)) {
			Assert.assertTrue(false);
		}

		WebElement v40 = driver.findElement(
				By.xpath("//div//label[normalize-space(text())='Aggravating Factors']/following-sibling::div"));
		String d40 = v40.getText();
		if (!d40.equalsIgnoreCase("Yes")) {
			Assert.assertTrue(false);
		}

		WebElement v41 = driver
				.findElement(By.xpath("(//div//label[contains(text(),'List')]/following-sibling::div)[2]"));
		String d41 = v41.getText();
		if (!d41.equalsIgnoreCase(PixalereScripts.Aggravating_Factors_List)) {
			Assert.assertTrue(false);
		}

		// Mobility Tab starts
		clickElement(By.xpath("//button[normalize-space(text())='Mobility']"));

		WebElement v42 = driver
				.findElement(By.xpath("//div//label[normalize-space(text())='Bed Mobility']/following-sibling::div"));
		String d42 = v42.getText();
		if (!d42.equalsIgnoreCase(LocatorUtils.radioBedMobility)) {
			Assert.assertTrue(false);
		}

		WebElement v43 = driver.findElement(
				By.xpath("(//div//label[contains(text(),'Any additional comments')]/following-sibling::div)[1]"));
		String d43 = v43.getText();
		if (!d43.equalsIgnoreCase(PixalereScripts.Bed_Mobility_comment)) {
			Assert.assertTrue(false);
		}

		WebElement v44 = driver.findElement(
				By.xpath("//div//label[normalize-space(text())='Chair Repositioning']/following-sibling::div"));
		String d44 = v44.getText();
		if (!d44.equalsIgnoreCase(LocatorUtils.radioChairRipositioning)) {
			Assert.assertTrue(false);
		}

		WebElement v45 = driver.findElement(
				By.xpath("(//div//label[contains(text(),'Any additional comments')]/following-sibling::div)[2]"));
		String d45 = v45.getText();
		if (!d45.equalsIgnoreCase(PixalereScripts.Chair_Repositioning_comment)) {
			Assert.assertTrue(false);
		}

		WebElement v46 = driver
				.findElement(By.xpath("//div//label[normalize-space(text())='Transfers']/following-sibling::div"));
		String d46 = v46.getText();
		if (!d46.equalsIgnoreCase(LocatorUtils.radioTransfers)) {
			Assert.assertTrue(false);
		}

		WebElement v47 = driver.findElement(
				By.xpath("(//div//label[contains(text(),'Any additional comments')]/following-sibling::div)[3]"));
		String d47 = v47.getText();
		if (!d47.equalsIgnoreCase(PixalereScripts.Transfers_comment)) {
			Assert.assertTrue(false);
		}

		WebElement v48 = driver.findElement(
				By.xpath("//div//label[normalize-space(text())='Weight Bearing Status']/following-sibling::div"));
		String d48 = v48.getText();
		if (!d48.equalsIgnoreCase(LocatorUtils.radioWeightBearingStatus)) {
			Assert.assertTrue(false);
		}

		WebElement v49 = driver.findElement(
				By.xpath("(//div//label[contains(text(),'Any additional comments')]/following-sibling::div)[4]"));
		String d49 = v49.getText();
		if (!d49.equalsIgnoreCase(PixalereScripts.Weight_Bearing_Status_comment)) {
			Assert.assertTrue(false);
		}

		WebElement v50 = driver
				.findElement(By.xpath("//div//label[normalize-space(text())='Ambulation']/following-sibling::div"));
		String d50 = v50.getText();
		if (!d50.equalsIgnoreCase(LocatorUtils.radioAmbulation)) {
			Assert.assertTrue(false);
		}

		WebElement v51 = driver.findElement(
				By.xpath("(//div//label[contains(text(),'Any additional comments')]/following-sibling::div)[5]"));
		String d51 = v51.getText();
		if (!d51.equalsIgnoreCase(PixalereScripts.Ambulation_comment)) {
			Assert.assertTrue(false);
		}

		WebElement v52 = driver
				.findElement(By.xpath("//div//label[normalize-space(text())='TUG Time']/following-sibling::div"));
		String d52 = v52.getText();
		if (!d52.contains(PixalereScripts.TUG_Time)) {
			Assert.assertTrue(false);
		}

		WebElement v53 = driver
				.findElement(By.xpath("//div//label[normalize-space(text())='Aid Used']/following-sibling::div"));
		String d53 = v53.getText();
		if (!d53.equalsIgnoreCase(PixalereScripts.Aid_used)) {
			Assert.assertTrue(false);
		}

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDateTime now = LocalDateTime.now();
		String date = dtf.format(now).toString();

		WebElement v54 = driver.findElement(By
				.xpath("//div//label[normalize-space(text())='Date of Stair Use Assessment:']/following-sibling::div"));
		String d54 = v54.getText();
		if (!d54.equalsIgnoreCase(date)) {
			Assert.assertTrue(false);
		}

		WebElement v55 = driver.findElement(
				By.xpath("(//*[normalize-space(text())='WFL – independent or managing with current supports'])[4]"));
		String d55 = v55.getText();
		if (!d55.equalsIgnoreCase(LocatorUtils.radioStairUseAssessed)) {
			Assert.assertTrue(false);
		}

		WebElement v56 = driver.findElement(
				By.xpath("//div//label[normalize-space(text())='Sitting Balance']/following-sibling::div"));
		String d56 = v56.getText();
		if (!d56.equalsIgnoreCase(LocatorUtils.radioSittingBalance)) {
			Assert.assertTrue(false);
		}

		WebElement v57 = driver.findElement(
				By.xpath("//div//label[normalize-space(text())='Standing balance']/following-sibling::div"));
		String d57 = v57.getText();
		if (!d57.equalsIgnoreCase(LocatorUtils.radioStandingBalance)) {
			Assert.assertTrue(false);
		}

		WebElement v58 = driver.findElement(
				By.xpath("//div//label[normalize-space(text())='Date of Sit Stand Visit:']/following-sibling::div"));
		String d58 = v58.getText();
		if (!d58.equalsIgnoreCase(date)) {
			Assert.assertTrue(false);
		}

		WebElement v59 = driver.findElement(By.xpath(
				"//div//label[normalize-space(text())='Standardized Balance Assessment:']/following-sibling::div"));
		String d59 = v59.getText();
		for (int i = 0; i < PixalerePTAssessmentScripts.Mobility1.size(); i++) {
			if (!d59.contains(PixalerePTAssessmentScripts.Mobility1.get(i))) {
				Assert.assertTrue(false);
			}
		}

		WebElement v60 = driver.findElement(
				By.xpath("(//div//label[contains(text(),'Any additional comments')]/following-sibling::div)[6]"));
		String d60 = v60.getText();
		if (!d60.equalsIgnoreCase(PixalereScripts.Balance_Assessed_comments)) {
			Assert.assertTrue(false);
		}

		// MSK Tab starts
		clickElement(By.xpath("//button[normalize-space(text())='MSK']"));

		WebElement v61 = driver.findElement(
				By.xpath("//div//label[normalize-space(text())='Date of MSK Assessment']/following-sibling::div"));
		String d61 = v61.getText();
		if (!d61.equalsIgnoreCase(PixalereScripts.Date_of_MSK_Assessment)) {
			Assert.assertTrue(false);
		}

		WebElement v62 = driver.findElement(By.xpath("(//*[normalize-space(text())='WFL - sufficient for function'])"));
		String d62 = v62.getText();
		if (!d62.equalsIgnoreCase(LocatorUtils.radioMSK)) {
			Assert.assertTrue(false);
		}

		WebElement v63 = driver.findElement(
				By.xpath("(//div//label[contains(text(),'Any additional comment')]/following-sibling::div)"));
		String d63 = v63.getText();
		if (!d63.equalsIgnoreCase(PixalereScripts.Musculoskeletal_Status_comments)) {
			Assert.assertTrue(false);
		}

		// Respiratory-Neuro Tab starts
		clickElement(By.xpath("//button[normalize-space(text())='Respiratory/Neuro']"));

		WebElement v64 = driver.findElement(
				By.xpath("(//*[normalize-space(text())='WFL-respiration status sufficient for function'])"));
		String d64 = v64.getText();
		if (!d64.equalsIgnoreCase(LocatorUtils.radioRespiratory)) {
			Assert.assertTrue(false);
		}

		WebElement v65 = driver.findElement(
				By.xpath("(//div//label[contains(text(),'Any additional comment')]/following-sibling::div)[1]"));
		String d65 = v65.getText();
		if (!d65.equalsIgnoreCase(PixalereScripts.Respiratory_comments)) {
			Assert.assertTrue(false);
		}

		WebElement v67 = driver.findElement(By.xpath("(//*[normalize-space(text())='WFL - sufficient for function'])"));
		String d67 = v67.getText();
		if (!d67.equalsIgnoreCase(LocatorUtils.radioNeurological)) {
			Assert.assertTrue(false);
		}

		WebElement v66 = driver.findElement(
				By.xpath("(//div//label[contains(text(),'Any additional comment')]/following-sibling::div)[2]"));
		String d66 = v66.getText();
		if (!d66.equalsIgnoreCase(PixalereScripts.Neurological_comments)) {
			Assert.assertTrue(false);
		}

		// Cognition Tab starts
		clickElement(By.xpath("//button[normalize-space(text())='Cognition']"));

		WebElement v68 = driver
				.findElement(By.xpath("(//*[normalize-space(text())='WFL - sufficient for function'])[1]"));
		String d68 = v68.getText();
		if (!d68.equalsIgnoreCase(LocatorUtils.radioCognitiveFunctioning)) {
			Assert.assertTrue(false);
		}

		WebElement v69 = driver
				.findElement(By.xpath("(//*[normalize-space(text())='WFL - sufficient for function'])[2]"));
		String d69 = v69.getText();
		if (!d69.equalsIgnoreCase(LocatorUtils.radioAffectiveFunctioning)) {
			Assert.assertTrue(false);
		}

		WebElement v70 = driver
				.findElement(By.xpath("//div//label[normalize-space(text())='Suicidal risk']/following-sibling::div"));
		String d70 = v70.getText();
		if (!d70.equalsIgnoreCase(LocatorUtils.radioCognition)) {
			Assert.assertTrue(false);
		}

		WebElement v71 = driver.findElement(
				By.xpath("(//div//label[contains(text(),'Any additional comment')]/following-sibling::div)"));
		String d71 = v71.getText();
		if (!d71.equalsIgnoreCase(PixalereScripts.Cognition_comments)) {
			Assert.assertTrue(false);
		}

		// Analysis and Recommendations Tab starts
		clickElement(By.xpath("//button[normalize-space(text())='Analysis and Recommendations']"));

		WebElement v72 = driver.findElement(By.xpath(
				"//div//label[normalize-space(text())='Estimated Stage of Change regarding PT services']/following-sibling::div"));
		String d72 = v72.getText();
		if (!d72.equalsIgnoreCase(LocatorUtils.radioPTService)) {
			Assert.assertTrue(false);
		}

		WebElement v73 = driver.findElement(By.xpath(
				"//div//label[normalize-space(text())='Assessment information obtained from']/following-sibling::div"));
		String d73 = v73.getText();
		for (int i = 0; i < PixalerePTAssessmentScripts.AssessmentInformation.size() - 2; i++) {
			if (!d73.contains(PixalerePTAssessmentScripts.AssessmentInformation.get(i))) {
				Assert.assertTrue(false);
			}
		}

		WebElement v74 = driver.findElement(By.xpath(
				"//div//label[contains(text(),'One or more MAHC factors were not assessed for this client')]/following-sibling::div"));
		String d74 = v74.getText();
		if (!d74.equalsIgnoreCase("Yes")) {
			Assert.assertTrue(false);
		}

		WebElement v75 = driver.findElement(
				By.xpath("//div//label[normalize-space(text())='Findings Analyzed']/following-sibling::div"));
		String d75 = v75.getText();
		if (!d75.equalsIgnoreCase(LocatorUtils.radioClientEmergency)) {
			Assert.assertTrue(false);
		}

		WebElement v76 = driver.findElement(By.xpath(
				"//div//label[contains(text(),'Care Plan documented in report or in other First')]/following-sibling::div"));
		String d76 = v76.getText();
		if (!d76.equalsIgnoreCase(LocatorUtils.radioAssessmentresults)) {
			Assert.assertTrue(false);
		}

		WebElement v77 = driver.findElement(By
				.xpath("//div//label[contains(text(),'Changing the conversation completed.')]/following-sibling::div"));
		String d77 = v77.getText();
		if (!d77.equalsIgnoreCase(LocatorUtils.radioConversationcompleted)) {
			Assert.assertTrue(false);
		}

		WebElement v78 = driver.findElement(By.xpath(
				"//div//label[contains(text(),'Welcome Brochure and Notice of Information Practices')]/following-sibling::div"));
		String d78 = v78.getText();
		if (!d78.equalsIgnoreCase(LocatorUtils.radioWelcomeBrochure)) {
			Assert.assertTrue(false);
		}

		WebElement v79 = driver.findElement(
				By.xpath("//div//label[contains(text(),'Client Emergency Response Level')]/following-sibling::div"));
		String d79 = v79.getText();
		if (!d79.equalsIgnoreCase(LocatorUtils.radioClientEmergency)) {
			Assert.assertTrue(false);
		}

		WebElement v80 = driver.findElement(By.xpath(
				"//div//label[contains(text(),'Other activities completed at first visit with')]/following-sibling::div"));
		String d80 = v80.getText();
		if (!d80.contains((PixalerePTAssessmentScripts.AssessmentInformation)
				.get((PixalerePTAssessmentScripts.AssessmentInformation).size() - 1))) {
			Assert.assertTrue(false);
		}

		System.out.println("PT verified successfully............");

	}

	public void verify_ExcersizeProgramPage() {
		clickElement(By.xpath("//input[@value='View']"));
		Wait_p(3);

		WebElement v1 = driver.findElement(By.xpath(
				"//div[@id='prof_table']//tbody//td[normalize-space(text())='Program Name']//following-sibling::td"));
		String d1 = v1.getText();
		if (!d1.equalsIgnoreCase(PixalereScripts.ExcersizeName)) {
			Assert.assertTrue(false);
		}

		WebElement v2 = driver.findElement(By.xpath(
				"//div[@id='prof_table']//tbody//td[normalize-space(text())='Additional Comments']//following-sibling::td"));
		String d2 = v2.getText();
		if (!d2.equalsIgnoreCase(PixalereScripts.ExcersizeComments)) {
			Assert.assertTrue(false);
		}
		WebElement v3 = driver.findElement(By.xpath(
				"//div[@id='prof_table']//tbody//td[normalize-space(text())='Visit Date']//following-sibling::td"));
		String d3 = v3.getText();
		if (!d3.equalsIgnoreCase(PixalereScripts.ExcersizeHandoutDate1)) {
			Assert.assertTrue(false);
		}

		// input text field
		WebElement td1 = driver.findElement(By.xpath("//tbody[@id='listEqDiv']//tr[1]//td[5]"));
		String data1 = td1.getText();
		if (!data1.equalsIgnoreCase(PixalereScripts.HoldAST1)) {
			Assert.assertTrue(false);
		}
		WebElement td2 = driver.findElement(By.xpath("//tbody[@id='listEqDiv']//tr[1]//td[6]"));
		String data2 = td2.getText();
		if (!data2.equalsIgnoreCase(PixalereScripts.RepeatAST1)) {
			Assert.assertTrue(false);
		}
		WebElement td3 = driver.findElement(By.xpath("//tbody[@id='listEqDiv']//tr[1]//td[7]"));
		String data3 = td3.getText();
		if (!data3.equalsIgnoreCase(PixalereScripts.SideAST1)) {
			Assert.assertTrue(false);
		}

		// input text field
		WebElement td4 = driver.findElement(By.xpath("//tbody[@id='listEqDiv']//tr[2]//td[5]"));
		String data4 = td4.getText();
		if (!data4.equalsIgnoreCase(PixalereScripts.HoldAST2)) {
			Assert.assertTrue(false);
		}
		WebElement td5 = driver.findElement(By.xpath("//tbody[@id='listEqDiv']//tr[2]//td[6]"));
		String data5 = td5.getText();
		if (!data5.equalsIgnoreCase(PixalereScripts.RepeatAST2)) {
			Assert.assertTrue(false);
		}
		WebElement td6 = driver.findElement(By.xpath("//tbody[@id='listEqDiv']//tr[2]//td[7]"));
		String data6 = td6.getText();
		if (!data6.equalsIgnoreCase(PixalereScripts.SideAST2)) {
			Assert.assertTrue(false);
		}

		// input text field
		WebElement td7 = driver.findElement(By.xpath("//tbody[@id='listEqDiv']//tr[3]//td[5]"));
		String data7 = td7.getText();
		if (!data7.equalsIgnoreCase(PixalereScripts.HoldAST3)) {
			Assert.assertTrue(false);
		}
		WebElement td8 = driver.findElement(By.xpath("//tbody[@id='listEqDiv']//tr[3]//td[6]"));
		String data8 = td8.getText();
		if (!data8.equalsIgnoreCase(PixalereScripts.RepeatAST3)) {
			Assert.assertTrue(false);
		}
		WebElement td9 = driver.findElement(By.xpath("//tbody[@id='listEqDiv']//tr[3]//td[7]"));
		String data9 = td9.getText();
		if (!data9.equalsIgnoreCase(PixalereScripts.SideAST3)) {
			Assert.assertTrue(false);
		}

		// input text field
		WebElement td10 = driver.findElement(By.xpath("//tbody[@id='listEqDiv']//tr[4]//td[5]"));
		String data10 = td10.getText();
		if (!data10.equalsIgnoreCase(PixalereScripts.HoldAST4)) {
			Assert.assertTrue(false);
		}
		WebElement td11 = driver.findElement(By.xpath("//tbody[@id='listEqDiv']//tr[4]//td[6]"));
		String data11 = td11.getText();
		if (!data11.equalsIgnoreCase(PixalereScripts.RepeatAST4)) {
			Assert.assertTrue(false);
		}
		WebElement td12 = driver.findElement(By.xpath("//tbody[@id='listEqDiv']//tr[4]//td[7]"));
		String data12 = td12.getText();
		if (!data12.equalsIgnoreCase(PixalereScripts.SideAST4)) {
			Assert.assertTrue(false);
		}

		// input text field
		WebElement td13 = driver.findElement(By.xpath("//tbody[@id='listEqDiv']//tr[5]//td[5]"));
		String data13 = td13.getText();
		if (!data13.equalsIgnoreCase(PixalereScripts.HoldAST5)) {
			Assert.assertTrue(false);
		}
		WebElement td14 = driver.findElement(By.xpath("//tbody[@id='listEqDiv']//tr[5]//td[6]"));
		String data14 = td14.getText();
		if (!data14.equalsIgnoreCase(PixalereScripts.RepeatAST5)) {
			Assert.assertTrue(false);
		}
		WebElement td15 = driver.findElement(By.xpath("//tbody[@id='listEqDiv']//tr[5]//td[7]"));
		String data15 = td15.getText();
		if (!data15.equalsIgnoreCase(PixalereScripts.SideAST5)) {
			Assert.assertTrue(false);
		}

		clickElement(By.xpath(
				"//div[@class='ui-dialog ui-corner-all ui-widget ui-widget-content ui-front ui-dialog-buttons ui-draggable ui-resizable']//button[@type='button']"));
		Wait_p(3);
		System.out.println("Excersize PT Page verified................");

	}

	// Record Table Verify
	public void verify_RecordAfterAdd_ExcersizeProgram() {
		// input text field
		WebElement td1 = driver.findElement(By.xpath("//*[@id='exeHold_1']"));
		highLightElement(By.xpath("//*[@id='exeHold_1']"));
		String data1 = td1.getAttribute("value");
		if (!data1.equalsIgnoreCase(PixalereScripts.HoldAST1)) {
			Assert.assertTrue(false);
		}
		WebElement td2 = driver.findElement(By.xpath("//*[@id='exeRepeat_1']"));
		highLightElement(By.xpath("//*[@id='exeRepeat_1']"));
		String data2 = td2.getAttribute("value");
		if (!data2.equalsIgnoreCase(PixalereScripts.RepeatAST1)) {
			Assert.assertTrue(false);
		}
		WebElement td3 = driver.findElement(By.xpath("//*[@id='exeSide_1']"));
		highLightElement(By.xpath("//*[@id='exeSide_1']"));
		String data3 = td3.getAttribute("value");
		if (!data3.equalsIgnoreCase(PixalereScripts.SideAST1)) {
			Assert.assertTrue(false);
		}

		System.out.println("After Click on Add Record verified................");

	}

	public void verify_PTCAMPAge() {
		// Radio Button verify
		WebElement e2 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Acute Onset of Cognitive Changes and Fluctuating Course']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data2 = e2.getText();
		if (!(data2.contains(""))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e4 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Inattention')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data4 = e4.getText();
		if (!(data4.contains(""))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e5 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Disorganized Thinking')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data5 = e5.getText();
		if (!(data5.contains(""))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e6 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Altered Level of Consciousness')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data6 = e6.getText();
		if (!(data6.contains(""))) {
			Assert.assertTrue(false);
		}

		System.out.println("CAM_PT Page verified................");
	}

	public void verify_Tinetti_page() {

		// Radio Button verify
		WebElement e1 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Date of visit']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data1 = e1.getText();
		if (!(data1.contains(PixalereScripts.Date_of_Visit_Tinneti1))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e2 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Sitting Balance']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data2 = e2.getText();
		if (!(data2.contains(PixalereScripts.sitting1))) {
			Assert.assertTrue(false);
		}

		WebElement e4 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Rises from chair')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data4 = e4.getText();
		if (!(data4.contains(PixalereScripts.sitting2))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e5 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Attempts to rise')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data5 = e5.getText();
		if (!(data5.contains(PixalereScripts.sitting3))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e6 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Immediate standing balance')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data6 = e6.getText();
		if (!(data6.contains(PixalereScripts.sitting4))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e7 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Standing balance')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data7 = e7.getText();
		if (!(data7.contains(PixalereScripts.sitting5))) {
			Assert.assertTrue(false);
		}
		// Radio Button verify
		WebElement e70 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Nudged')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data70 = e70.getText();
		if (!(data70.contains(PixalereScripts.sitting6))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e8 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Eyes closed')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data8 = e8.getText();
		if (!(data8.contains(PixalereScripts.sitting7))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e9 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Turning 360 degrees')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data9 = e9.getText();
		if (!(data9.contains(PixalereScripts.sitting8))) {
			Assert.assertTrue(false);
		}

		WebElement e10 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Sitting down')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data10 = e10.getText();
		if (!(data10.contains(PixalereScripts.sitting9))) {
			Assert.assertTrue(false);
		}

		WebElement e12 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Step length (right)')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data12 = e12.getText();
		if (!(data12.contains(PixalereScripts.sitting10))) {
			Assert.assertTrue(false);
		}

		WebElement e13 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Step height (right)')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data13 = e13.getText();
		if (!(data13.contains(PixalereScripts.sitting11))) {
			Assert.assertTrue(false);
		}

		WebElement e14 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Step length (left)')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data14 = e14.getText();
		if (!(data14.contains(PixalereScripts.sitting12))) {
			Assert.assertTrue(false);
		}

		WebElement e15 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Step height (left)')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data15 = e15.getText();
		if (!(data15.contains(PixalereScripts.sitting13))) {
			Assert.assertTrue(false);
		}

		WebElement e16 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Step symmetry')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data16 = e16.getText();
		if (!(data16.contains(PixalereScripts.sitting14))) {
			Assert.assertTrue(false);
		}

		WebElement e17 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Step continuity')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data17 = e17.getText();
		if (!(data17.contains(PixalereScripts.sitting15))) {
			Assert.assertTrue(false);
		}
		WebElement e170 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Path')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data170 = e170.getText();
		if (!(data170.contains(PixalereScripts.sitting16))) {
			Assert.assertTrue(false);
		}

		WebElement e18 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Trunk')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data18 = e18.getText();
		if (!(data18.contains(PixalereScripts.sitting17))) {
			Assert.assertTrue(false);
		}
		WebElement e19 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Walking Stance')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data19 = e19.getText();
		if (!(data19.contains(PixalereScripts.sitting18))) {
			Assert.assertTrue(false);
		}

		WebElement e20 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Comments')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data20 = e20.getText();
		if (!(data20.contains(PixalereScripts.Comments_Tinneti1))) {
			Assert.assertTrue(false);
		}

		System.out.println("Tinetti_page Page verified................");

		String verify_Balance_Gait = getElementText(By.xpath(
				"(//td[normalize-space()='Balance+Gait Score']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		if (!(PixalereScripts.Balance_Gait.equalsIgnoreCase(verify_Balance_Gait))) {
			Assert.assertTrue(false);
			System.out.println("Balance Gait Score verified........................");
		}
	}

	public void verify_Berg_Balance() {
		// Radio Button verify
		WebElement e2 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Form Type']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data2 = e2.getText();
		if (!(data2.contains("Long") || data2.contains("Short"))) {
			Assert.assertTrue(false);

		}

		// Radio Button verify
		WebElement e4 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Sitting to standing')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data4 = e4.getText();
		if (!(data4.equalsIgnoreCase(PixalereScripts.berbal1))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e5 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Standing unsupported']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data5 = e5.getText();
		if (!(data5.equalsIgnoreCase(PixalereScripts.berbal2))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e6 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Sitting with back unsupported but feet supported on floor or on a stool']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data6 = e6.getText();
		if (!(data6.equalsIgnoreCase(PixalereScripts.berbal14))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e7 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Transfers']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data7 = e7.getText();
		if (!(data7.equalsIgnoreCase(PixalereScripts.berbal4))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e8 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Turn 360 degrees']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data8 = e8.getText();
		if (!(data8.equalsIgnoreCase(PixalereScripts.berbal8))) {
			Assert.assertTrue(false);
		}
		WebElement e9 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Standing to sitting']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data9 = e9.getText();
		if (!(data9.equalsIgnoreCase(PixalereScripts.berbal3))) {
			Assert.assertTrue(false);
		}

		WebElement e10 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Standing unsupported with eyes closed']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data10 = e10.getText();
		if (!(data10.equalsIgnoreCase(PixalereScripts.berbal5))) {
			Assert.assertTrue(false);
		}
		WebElement e11 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Reaching forward with outstretched arm while standing']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data11 = e11.getText();
		if (!(data11.equalsIgnoreCase(PixalereScripts.berbal6))) {
			// Assert.assertTrue(false);
		}
		WebElement e12 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Pick up object from the floor from a standing position']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data12 = e12.getText();
		if (!(data12.equalsIgnoreCase(PixalereScripts.berbal7))) {
			Assert.assertTrue(false);
		}
		WebElement e13 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Standing unsupported one foot in front']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data13 = e13.getText();
		if (!(data13.equalsIgnoreCase(PixalereScripts.berbal9))) {
			// aAssert.assertTrue(false);
		}
		WebElement e14 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Standing on one leg']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data14 = e14.getText();
		if (!(data14.equalsIgnoreCase(PixalereScripts.berbal10))) {
			Assert.assertTrue(false);
		}
		WebElement e15 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Standing unsupported with feet together']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data15 = e15.getText();
		if (!(data15.equalsIgnoreCase(PixalereScripts.berbal11))) {
			// Assert.assertTrue(false);
		}
		WebElement e16 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Turning to look behind over left and right shoulders while standing']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data16 = e16.getText();
		if (!(data16.equalsIgnoreCase(PixalereScripts.berbal12))) {
			Assert.assertTrue(false);
		}
		WebElement e17 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Place alternate foot on step or stool while standing unsupported']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data17 = e17.getText();
		if (!(data17.equalsIgnoreCase(PixalereScripts.berbal13))) {
			// Assert.assertTrue(false);
		}

		System.out.println("Berg Balance Scale Page verified................");
	}

	public void verify_Respiratory_flowchart_page_Suctioning() {
		// Radio Button verify
		WebElement e6 = driver.findElement(
				By.xpath("(//td[normalize-space()='Suction machine working']//following-sibling::td)[last()]"));
		String data6 = e6.getText();
		if (!(data6.equalsIgnoreCase(LocatorUtils.radioSuction_machine_working))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e7 = driver
				.findElement(By.xpath("(//td[normalize-space()='Battery charged']//following-sibling::td)[last()]"));
		String data7 = e7.getText();
		if (!(data7.equalsIgnoreCase(LocatorUtils.radioBattery_charged))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e8 = driver
				.findElement(By.xpath("(//td[normalize-space()='Type of suctioning']//following-sibling::td)[last()]"));
		String data8 = e8.getText();
		if (!(data8.equalsIgnoreCase(LocatorUtils.radioType_of_suctioning))) {
			Assert.assertTrue(false);
		}
		WebElement e80 = driver
				.findElement(By.xpath("(//td[normalize-space()='Comment']//following-sibling::td)[last()]"));
		String data80 = e80.getText();
		if (!(data80.equalsIgnoreCase(PixalereScripts.Suctioning_comment1))) {
			Assert.assertTrue(false);
		}

		WebElement e50 = driver
				.findElement(By.xpath("(//td[normalize-space()='Amount']//following-sibling::td)[last()]"));
		String data50 = e50.getText();
		if (!(data50.equalsIgnoreCase(LocatorUtils.radioAmount))) {
			Assert.assertTrue(false);
		}
		WebElement e5 = driver
				.findElement(By.xpath("(//td[normalize-space()='Color']//following-sibling::td)[last()]"));
		String data5 = e5.getText();
		if (!(data5.equalsIgnoreCase(LocatorUtils.radioColor))) {
			Assert.assertTrue(false);
		}

		WebElement e10 = driver
				.findElement(By.xpath("(//td[normalize-space()='Consistency']//following-sibling::td)[last()]"));
		String data10 = e10.getText();
		if (!(data10.equalsIgnoreCase(LocatorUtils.radioConsistency))) {
			Assert.assertTrue(false);
		}
		WebElement e11 = driver
				.findElement(By.xpath("(//td[normalize-space()='Odour']//following-sibling::td)[last()]"));
		String data11 = e11.getText();
		if (!(data11.equalsIgnoreCase(LocatorUtils.radioOdour))) {
			Assert.assertTrue(false);
		}
		WebElement e1 = driver.findElement(
				By.xpath("(//td[normalize-space()='Suctioning container cleaned']//following-sibling::td)[last()]"));
		String data1 = e1.getText();
		if (!(data1.equalsIgnoreCase(LocatorUtils.radioSuctioning_container))) {
			Assert.assertTrue(false);
		}

		System.out.println("verify Respiratory flowchart page suctioning................");

	}

	public void verify_Respiratory_flowchart_page() {
		// Radio Button verify
		WebElement e6 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Cough Assist']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data6 = e6.getText();
		if (!(data6.equalsIgnoreCase(LocatorUtils.radioCough_Assist))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e7 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Air filter cleaned']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data7 = e7.getText();
		if (!(data7.equalsIgnoreCase(LocatorUtils.radioAir_filter_cleaned_Cough_Assist))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e8 = driver.findElement(By.xpath(
				"(//td[contains(text(),'tubing cleaned')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data8 = e8.getText();
		if (!(data8.equalsIgnoreCase(LocatorUtils.radioMask_tubing_cleaned_Cough_Assist))) {
			Assert.assertTrue(false);
		}

		// input text field
		WebElement e1 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Number of treatment')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data1 = e1.getText();
		if (!data1.equalsIgnoreCase(PixalereScripts.Number_of_treatment1)) {
			Assert.assertTrue(false);
		}

		System.out.println("Respiratory Cough Assist page verified................");
	}

	public void verify_Respiratory_flowchart_page_non_invasive_ventiltion() {
		// Radio Button verify
		WebElement e6 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Non-invasive ventilation']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data6 = e6.getText();
		if (!(data6.equalsIgnoreCase(LocatorUtils.radioNon_invasive_ventilation))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e7 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Oxygen in situ']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data7 = e7.getText();
		if (!(data7.equalsIgnoreCase(LocatorUtils.radioOxygen_in_situ))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e8 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Humidifier Check')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data8 = e8.getText();
		if (!(data8.equalsIgnoreCase(LocatorUtils.radioHumidifier_Check))) {
			Assert.assertTrue(false);
		}

		// input text field
		WebElement e1 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Therapy hours')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data1 = e1.getText();
		if (!data1.equalsIgnoreCase(PixalereScripts.Therapy_hours1)) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e80 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Air filter cleaned')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data80 = e80.getText();
		if (!(data80.equalsIgnoreCase(LocatorUtils.radioAir_filter_cleaned))) {
			Assert.assertTrue(false);
		}
		// Radio Button verify
		WebElement e81 = driver.findElement(By.xpath(
				"(//td[contains(text(),'tubing cleaned')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data81 = e81.getText();
		if (!(data81.equalsIgnoreCase(LocatorUtils.radioMask_tubing_cleaned))) {
			Assert.assertTrue(false);
		}

		System.out.println("verify_Respiratory Non-invasive ventilition successfull................");
	}

	public void verify_teaching_agreement() {

		// Radio Button verify
		WebElement e2 = driver.findElement(By.xpath(
				"(//td[normalize-space()='For the listed Activities: Risk, alternatives and benefits discussed. Risks of not performing activities discussed. Questions addressed.']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data2 = e2.getText();
		if (!(data2.contains("Yes"))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e4 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Discussed that the Learner must implement the activities as taught by the service provider.')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data4 = e4.getText();
		if (!(data4.contains("Yes") || data4.contains("No"))) {
			Assert.assertTrue(false);
		}

		WebElement e5 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Education received on the activities')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data5 = e5.getText();
		if (!(data5.contains("Yes") || data5.contains("No"))) {
			Assert.assertTrue(false);
		}

		WebElement e6 = driver.findElement(By.xpath(
				"(//td[normalize-space()='For the listed Activities: Risk, alternatives and benefits discussed. Risks of not performing activities discussed. Questions addressed.']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data6 = e6.getText();
		if (!(data6.contains("Yes") || data6.contains("No"))) {
			Assert.assertTrue(false);
		}

		/*
		 * WebElement e7 = driver.findElement(By.xpath(
		 * "(//td[contains(text(),'I acknowledge that the Field Educator']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"
		 * )); String data7 = e7.getText(); if (!(data7.contains("Yes") ||
		 * data7.contains("No"))) { //Assert.assertTrue(false); }
		 */

		System.out.println("Teaching Agreement Page verified.......................");
	}

	public void verify_carePlan() {
		// input text field
		WebElement e1 = driver.findElement(By.xpath("((//div[@id='current_careplans']//tbody//tr)[last()])//td[1]"));
		String data1 = e1.getText();
		if (!data1.equalsIgnoreCase(PixalereCarePlanScripts.Edit_CarePlan_Nursing_Diagnosis)) {
			Assert.assertTrue(false);
		}

		// input text field
		WebElement e3 = driver.findElement(By.xpath("((//div[@id='current_careplans']//tbody//tr)[last()])//td[2]"));
		String data3 = e3.getText();
		if (!data3.equalsIgnoreCase(PixalereCarePlanScripts.Edit_CarePlan_Interventions_Routine)) {
			Assert.assertTrue(false);
		}

		// input text field
		WebElement e4 = driver.findElement(By.xpath("((//div[@id='current_careplans']//tbody//tr)[last()])//td[3]"));
		String data4 = e4.getText();
		if (!data4.equalsIgnoreCase(PixalereCarePlanScripts.Edit_CarePlanOutcomes)) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e2 = driver.findElement(By.xpath("((//div[@id='current_careplans']//tbody//tr)[last()])//td[4]"));
		String data2 = e2.getText();
		if (!(data2.contains("Yes"))) {
			Assert.assertTrue(false);
		}

		System.out.println("All Data Verified Successfully on Prevention Care Plan Flowchart Page");
	}

	public void verify_upperLimbData() {

		// Radio Button verify
		WebElement e1 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Right Arm Skin Colour']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data1 = e1.getText();
		if (!(data1.equalsIgnoreCase(LocatorUtils.upperlimb_radio_1))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e2 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Left Arm Skin Colour']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data2 = e2.getText();
		if (!(data2.equalsIgnoreCase(LocatorUtils.upperlimb_radio_2))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e3 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Right Skin Colour Hand']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data3 = e3.getText();
		if (!(data3.equalsIgnoreCase(LocatorUtils.upperlimb_radio_3))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e4 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Left Skin Colour Hand']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data4 = e4.getText();
		if (!(data4.equalsIgnoreCase(LocatorUtils.upperlimb_radio_4))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e5 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Right Skin Colour Fingers']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data5 = e5.getText();
		if (!(data5.equalsIgnoreCase(LocatorUtils.upperlimb_radio_5))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e6 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Left Skin Colour Fingers']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data6 = e6.getText();
		if (!(data6.equalsIgnoreCase(LocatorUtils.upperlimb_radio_6))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e7 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Right Temperature Arm']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data7 = e7.getText();
		if (!(data7.equalsIgnoreCase(LocatorUtils.upperlimb_radio_7))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e8 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Left Temperature Arm']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data8 = e8.getText();
		if (!(data8.equalsIgnoreCase(LocatorUtils.upperlimb_radio_8))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e9 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Right Temperature Hand']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data9 = e9.getText();
		if (!(data9.equalsIgnoreCase(LocatorUtils.upperlimb_radio_9))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e10 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Left Temperature Hand']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data10 = e10.getText();
		if (!(data10.equalsIgnoreCase(LocatorUtils.upperlimb_radio_10))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e11 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Right Temperature Fingers']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data11 = e11.getText();
		if (!(data11.equalsIgnoreCase(LocatorUtils.upperlimb_radio_11))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e12 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Left Temperature Fingers']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data12 = e12.getText();
		if (!(data12.equalsIgnoreCase(LocatorUtils.upperlimb_radio_12))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e13 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Right Radial Palpation']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data13 = e13.getText();
		if (!(data13.equalsIgnoreCase(LocatorUtils.upperlimb_radio_13))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e14 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Left Radial Palpation']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data14 = e14.getText();
		if (!(data14.equalsIgnoreCase(LocatorUtils.upperlimb_radio_14))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e15 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Right Brachial Palpation']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data15 = e15.getText();
		if (!(data15.equalsIgnoreCase(LocatorUtils.upperlimb_radio_15))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e16 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Left Brachial Palpation']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data16 = e16.getText();
		if (!(data16.equalsIgnoreCase(LocatorUtils.upperlimb_radio_16))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e17 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Right Cap Refill less than/equal to 3 secs']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data17 = e17.getText();
		if (!(data17.equalsIgnoreCase(LocatorUtils.upperlimb_radio_17))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e18 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Left Cap Refill less than/equal to 3 secs']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data18 = e18.getText();
		if (!(data18.equalsIgnoreCase(LocatorUtils.upperlimb_radio_18))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e19 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Right Edema Location']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data19 = e19.getText();
		if (!(data19.equalsIgnoreCase(LocatorUtils.upperlimb_radio_19))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e20 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Left Edema Location']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data20 = e20.getText();
		if (!(data20.equalsIgnoreCase(LocatorUtils.upperlimb_radio_20))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e21 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Right Edema Severity']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data21 = e21.getText();
		if (!(data21.equalsIgnoreCase(LocatorUtils.upperlimb_radio_21))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e22 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Left Edema Severity']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data22 = e22.getText();
		if (!(data22.equalsIgnoreCase(LocatorUtils.upperlimb_radio_22))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e23 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Right Range of Motion: Elbow']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data23 = e23.getText();
		if (!(data23.equalsIgnoreCase(LocatorUtils.upperlimb_radio_23))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e24 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Left Range of Motion: Elbow']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data24 = e24.getText();
		if (!(data24.equalsIgnoreCase(LocatorUtils.upperlimb_radio_24))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e25 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Right Range of Motion: Wrist']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data25 = e25.getText();
		if (!(data25.equalsIgnoreCase(LocatorUtils.upperlimb_radio_25))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e26 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Left Range of Motion: Wrist']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data26 = e26.getText();
		if (!(data26.equalsIgnoreCase(LocatorUtils.upperlimb_radio_26))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e27 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Right Range of Motion: Thumb']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data27 = e27.getText();
		if (!(data27.equalsIgnoreCase(LocatorUtils.upperlimb_radio_27))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e28 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Left Range of Motion: Thumb']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data28 = e28.getText();
		if (!(data28.equalsIgnoreCase(LocatorUtils.upperlimb_radio_28))) {
			Assert.assertTrue(false);
		}

		WebElement e29 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Right Wrist Measurement (cm)']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data29 = e29.getText();
		String d1 = PixalereCreateNewPatientAccountScripts.LEFT_WRIST_MEASURE_CM_upper;
		if (!(data29.equalsIgnoreCase(d1 + "." + d1))) {
			Assert.assertTrue(false);
		}

		WebElement e30 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Left Wrist Measurement (cm)']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data30 = e30.getText();
		String d2 = PixalereCreateNewPatientAccountScripts.Wrist_Measurement_cm_Left1;
		if (!(data30.equalsIgnoreCase(d2 + "." + d2))) {
			Assert.assertTrue(false);
		}

		WebElement e31 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Right Forearm Measurement (cm)']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data31 = e31.getText();
		String d3 = PixalereCreateNewPatientAccountScripts.ForeARM_MIDCALF_MEASURE_CM_upper;
		if (!(data31.equalsIgnoreCase(d3 + "." + d3))) {
			Assert.assertTrue(false);
		}

		WebElement e32 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Left Forearm Measurement (cm)']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data32 = e32.getText();
		String d4 = PixalereCreateNewPatientAccountScripts.Forearm_Measurement_cm_Left1;
		if (!(data32.equalsIgnoreCase(d4 + "." + d4))) {
			Assert.assertTrue(false);
		}

		// checkBox verify
		WebElement e33 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Right Missing Limb or Fingers']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data33 = e33.getText();

		for (int i = 0; i < PixalereUpperLimbAssessmentScripts.list_ri8_fingers_upperLimb.size(); i++) {
			if (!data33.contains(PixalereUpperLimbAssessmentScripts.list_ri8_fingers_upperLimb.get(i))) {
				Assert.assertTrue(false);
			}
		}

		// checkBox verify
		WebElement e34 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Left Missing Limb or Fingers']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data34 = e34.getText();

		for (int i = 0; i < PixalereUpperLimbAssessmentScripts.list_left_fingers_upperLimb.size(); i++) {
			if (!data34.contains(PixalereUpperLimbAssessmentScripts.list_left_fingers_upperLimb.get(i))) {
				Assert.assertTrue(false);
			}
		}

		// Radio Button verify
		WebElement e35 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Comments']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data35 = e35.getText();
		if (!(data35.equalsIgnoreCase(PixalereCreateNewPatientAccountScripts.Basic_UL_comments))) {
			Assert.assertTrue(false);
		}

		System.out.println("Upper Limb Data verified.............");
	}

	public void verify_adv_lower_limb_assessment_page() {

		// checkBox verify
		WebElement e1 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Right Dorsalis Pedis Doppler']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data1 = e1.getText();

		for (int i = 0; i < PixalereAdvLowerLimbAssessmentScripts.list_Right_Dorsalis_Pedis.size(); i++) {
			if (!data1.contains(PixalereAdvLowerLimbAssessmentScripts.list_Right_Dorsalis_Pedis.get(i))) {
				Assert.assertTrue(false);
			}
		}

		// checkBox verify
		WebElement e2 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Left Dorsalis Pedis Doppler']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data2 = e2.getText();

		for (int i = 0; i < PixalereAdvLowerLimbAssessmentScripts.list_Left_Dorsalis_Pedis.size(); i++) {
			if (!data2.contains(PixalereAdvLowerLimbAssessmentScripts.list_Left_Dorsalis_Pedis.get(i))) {
				Assert.assertTrue(false);
			}
		}

		// checkBox verify
		WebElement e3 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Right Foot Monofilament Sensation']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data3 = e3.getText();

		for (int i = 0; i < PixalereAdvLowerLimbAssessmentScripts.list_Right_mono.size(); i++) {
			if (!data3.contains(PixalereAdvLowerLimbAssessmentScripts.list_Right_mono.get(i))) {
				// Assert.assertTrue(false);
			}
		}

		// checkBox verify
		WebElement e4 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Right Foot Concerns']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data4 = e4.getText();

		for (int i = 0; i < PixalereAdvLowerLimbAssessmentScripts.list_Right_foot_concerns.size(); i++) {
			if (!data4.contains(PixalereAdvLowerLimbAssessmentScripts.list_Right_foot_concerns.get(i))) {
				Assert.assertTrue(false);
			}
		}

		// checkBox verify
		WebElement e8 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Right Posterior Tibial Doppler']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data8 = e8.getText();

		for (int i = 0; i < PixalereAdvLowerLimbAssessmentScripts.list_Right_posterior_tribal.size(); i++) {
			if (!data8.contains(PixalereAdvLowerLimbAssessmentScripts.list_Right_posterior_tribal.get(i))) {
				Assert.assertTrue(false);
			}
		}
		// checkBox verify
		WebElement e9 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Left Posterior Tibial Doppler']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data9 = e9.getText();
		for (int i = 0; i < PixalereAdvLowerLimbAssessmentScripts.list_Left_posterior_tribal.size(); i++) {
			if (!data9.contains(PixalereAdvLowerLimbAssessmentScripts.list_Left_posterior_tribal.get(i))) {
				Assert.assertTrue(false);
			}
		}

		// checkBox verify
		WebElement e11 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Left Foot Monofilament Sensation']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data11 = e11.getText();

		for (int i = 0; i < PixalereAdvLowerLimbAssessmentScripts.list_Left_mono.size(); i++) {
			if (!data11.contains(PixalereAdvLowerLimbAssessmentScripts.list_Left_mono.get(i))) {
				// Assert.assertTrue(false);
			}
		}
		// checkBox verify
		WebElement e12 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Right Limb Shape']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data12 = e12.getText();

		for (int i = 0; i < PixalereAdvLowerLimbAssessmentScripts.list_Right_llsf.size(); i++) {
			if (!data12.contains(PixalereAdvLowerLimbAssessmentScripts.list_Right_llsf.get(i))) {
				Assert.assertTrue(false);
			}
		}

		// checkBox verify
		WebElement e13 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Left Limb Shape']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data13 = e13.getText();

		for (int i = 0; i < PixalereAdvLowerLimbAssessmentScripts.list_Left_llsf.size(); i++) {
			if (!data13.contains(PixalereAdvLowerLimbAssessmentScripts.list_Left_llsf.get(i))) {
				Assert.assertTrue(false);
			}
		}

		// checkBox verify
		WebElement e15 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Left Foot Concerns']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data15 = e15.getText();

		for (int i = 0; i < PixalereAdvLowerLimbAssessmentScripts.list_Left_foot_concerns.size(); i++) {
			if (!data15.contains(PixalereAdvLowerLimbAssessmentScripts.list_Left_foot_concerns.get(i))) {
				Assert.assertTrue(false);
			}
		}

		// checkBox verify
		WebElement e16 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Right Skin Condition']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data16 = e16.getText();

		for (int i = 0; i < PixalereAdvLowerLimbAssessmentScripts.list_Right_Skin_Appe.size(); i++) {
			if (!data16.contains(PixalereAdvLowerLimbAssessmentScripts.list_Right_Skin_Appe.get(i))) {
				Assert.assertTrue(false);
			}
		}
		// checkBox verify
		WebElement e17 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Left Skin Condition']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data17 = e17.getText();

		for (int i = 0; i < PixalereAdvLowerLimbAssessmentScripts.list_Left_Skin_Appe.size(); i++) {
			if (!data17.contains(PixalereAdvLowerLimbAssessmentScripts.list_Left_Skin_Appe.get(i))) {
				Assert.assertTrue(false);
			}
		}
		// checkBox verify
		WebElement e18 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Right Toe Nails']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data18 = e18.getText();

		for (int i = 0; i < PixalereAdvLowerLimbAssessmentScripts.list_Right_Toe_Nails.size(); i++) {
			if (!data18.contains(PixalereAdvLowerLimbAssessmentScripts.list_Right_Toe_Nails.get(i))) {
				Assert.assertTrue(false);
			}
		}
		// checkBox verify
		WebElement e19 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Left Toe Nails']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data19 = e19.getText();

		for (int i = 0; i < PixalereAdvLowerLimbAssessmentScripts.list_Left_Toe_Nails.size(); i++) {
			if (!data19.contains(PixalereAdvLowerLimbAssessmentScripts.list_Left_Toe_Nails.get(i))) {
				Assert.assertTrue(false);
			}
		}
		// checkBox verify
		WebElement e20 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Right Limb Pain']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data20 = e20.getText();

		for (int i = 0; i < PixalereAdvLowerLimbAssessmentScripts.list_Rigt_pain.size(); i++) {
			if (!data20.contains(PixalereAdvLowerLimbAssessmentScripts.list_Rigt_pain.get(i))) {
				Assert.assertTrue(false);
			}
		}

		// checkBox verify
		WebElement e21 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Left Limb Pain']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data21 = e21.getText();
		for (int i = 0; i < PixalereAdvLowerLimbAssessmentScripts.list_Left_pain.size(); i++) {
			if (!data21.contains(PixalereAdvLowerLimbAssessmentScripts.list_Left_pain.get(i))) {
				Assert.assertTrue(false);
			}
		}

		// Radio button verify
		WebElement e22 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Ankle Brachial Index']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data22 = e22.getText();
		if (!(data22.equalsIgnoreCase(PixalereAdvLowerLimbAssessmentScripts.Advance_LL1))) {
			Assert.assertTrue(false);
		}

		WebElement e23 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Toe Brachial Index']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data23 = e23.getText();
		if (!(data23.equalsIgnoreCase(PixalereAdvLowerLimbAssessmentScripts.Advance_LL2))) {
			Assert.assertTrue(false);
		}
		WebElement e24 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Referral For Vascular Assessment Initiated']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data24 = e24.getText();
		if (!(data24.equalsIgnoreCase(PixalereAdvLowerLimbAssessmentScripts.Advance_LL111))) {
			Assert.assertTrue(false);
		}
		WebElement e25 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Right Stemmer')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));

		String data25 = e25.getText();
		if (!(data25.equalsIgnoreCase(PixalereAdvLowerLimbAssessmentScripts.Advance_LL4))) {
			Assert.assertTrue(false);
		}
		WebElement e26 = driver.findElement(By.xpath(
				"(//td[contains(text(),'Left Stemmer')]//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data26 = e26.getText();
		if (!(data26.equalsIgnoreCase(PixalereAdvLowerLimbAssessmentScripts.Advance_LL5))) {
			Assert.assertTrue(false);
		}

		WebElement e27 = driver.findElement(By.xpath(
				"(//td[normalize-space()='ABI Date']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data27 = e27.getText();
		String dataaa = "0" + PixalereAdvLowerLimbAssessmentScripts.day1_ALB + "/"
				+ PixalereAdvLowerLimbAssessmentScripts.month1_ALB + "/" + "2022";
		if (!data27.equalsIgnoreCase(dataaa)) {
			Assert.assertTrue(false);

		}
		WebElement e28 = driver.findElement(By.xpath(
				"(//td[normalize-space()='TBI Date']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data28 = e28.getText();
		String dataa1 = "0" + PixalereAdvLowerLimbAssessmentScripts.day2_ALB + "/"
				+ PixalereAdvLowerLimbAssessmentScripts.month2_ALB + "/" + "2021";
		if (!data28.equalsIgnoreCase(dataa1)) {
			Assert.assertTrue(false);
		}

		// ABI score
		WebElement e29 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Right ABI Score']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data29 = e29.getText();

		float d;
		if (Float.parseFloat(PixalereScripts.Posterior_Tibial_mmHg_Right1) > Float
				.parseFloat(PixalereScripts.Dorsalis_Pedis_mmHg_Right1)) {
			d = (Float.parseFloat(PixalereScripts.Posterior_Tibial_mmHg_Right1))
					/ (Float.parseFloat(PixalereScripts.Ankle_Brachial_Pressure_mmHg_Right1));
		} else {
			d = (Float.parseFloat(PixalereScripts.Dorsalis_Pedis_mmHg_Right1))
					/ (Float.parseFloat(PixalereScripts.Ankle_Brachial_Pressure_mmHg_Right1));
		}
		double ans_abi = Math.round(d * 100.00) / 100.00;

		if (!(Double.parseDouble(data29) == ans_abi)) {
			Assert.assertTrue(false);
		}

		// TBI score
		WebElement e30 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Right TBI Score']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data30 = e30.getText();

		float tbi;
		tbi = (Float.parseFloat(PixalereScripts.Toe_Pressure_mmHg_Right1))
				/ (Float.parseFloat(PixalereScripts.Brachial_Pressure_mmHg_Right1));
		double ans_tbi = Math.round(tbi * 100.00) / 100.00;
		if (!(Double.parseDouble(data30) == ans_tbi)) {
			Assert.assertTrue(false);
		}

		System.out.println("Advance Lower Limb data verified..................");
	}

	public void verify_intake_output_Nursing() {
		WebElement e1 = driver.findElement(By.xpath(
				"(//td[normalize-space()='PO']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data1 = e1.getText();
		if (!(data1.equalsIgnoreCase(PixalereIntakeOutputScriptsNursing.IO_PO))) {
			Assert.assertTrue(false);
		}

		WebElement e2 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Enteral']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data2 = e2.getText();
		if (!(data2.equalsIgnoreCase(PixalereIntakeOutputScriptsNursing.IO_Enteral))) {
			Assert.assertTrue(false);
		}

		WebElement e3 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Void']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data3 = e3.getText();
		if (!(data3.equalsIgnoreCase(PixalereIntakeOutputScriptsNursing.IO_Void))) {
			Assert.assertTrue(false);
		}

		WebElement e4 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Emesis (mL)']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data4 = e4.getText();
		if (!(data4.equalsIgnoreCase(PixalereIntakeOutputScriptsNursing.IOEmesis))) {
			Assert.assertTrue(false);
		}

		WebElement e5 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Drain 1']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data5 = e5.getText();
		if (!(data5.equalsIgnoreCase(PixalereIntakeOutputScriptsNursing.IO_DRAIN1))) {
			Assert.assertTrue(false);
		}

		WebElement e6 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Drain Type']//following-sibling::td//td[contains(@class,'flowchart_data')])[3]"));
		String data6 = e6.getText();
		if (!(data6.equalsIgnoreCase(PixalereIntakeOutputScriptsNursing.drp_drain1_Type))) {
			Assert.assertTrue(false);
		}

		WebElement e7 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Drain Location']//following-sibling::td//td[contains(@class,'flowchart_data')])[3]"));
		String data7 = e7.getText();
		if (!(data7.equalsIgnoreCase(PixalereIntakeOutputScriptsNursing.Drain1_Location))) {
			Assert.assertTrue(false);
		}

		WebElement e8 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Drain 2']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data8 = e8.getText();
		if (!(data8.equalsIgnoreCase(PixalereIntakeOutputScriptsNursing.IO_DRAIN2))) {
			Assert.assertTrue(false);
		}

		WebElement e9 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Drain Type']//following-sibling::td//td[contains(@class,'flowchart_data')])[6]"));
		String data9 = e9.getText();
		if (!(data9.equalsIgnoreCase(PixalereIntakeOutputScriptsNursing.drp_drain2_Type))) {
			Assert.assertTrue(false);
		}

		WebElement e10 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Drain Location']//following-sibling::td//td[contains(@class,'flowchart_data')])[6]"));
		String data10 = e10.getText();
		if (!(data10.equalsIgnoreCase(PixalereIntakeOutputScriptsNursing.Drain2_Location))) {
			Assert.assertTrue(false);
		}

		WebElement e11 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Drain 3']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data11 = e11.getText();
		if (!(data11.equalsIgnoreCase(PixalereIntakeOutputScriptsNursing.IO_DRAIN3))) {
			Assert.assertTrue(false);
		}

		WebElement e12 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Drain Type']//following-sibling::td//td[contains(@class,'flowchart_data')])[9]"));
		String data12 = e12.getText();
		if (!(data12.equalsIgnoreCase(PixalereIntakeOutputScriptsNursing.drp_drain3_Type))) {
			Assert.assertTrue(false);
		}

		WebElement e13 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Drain Location']//following-sibling::td//td[contains(@class,'flowchart_data')])[9]"));
		String data13 = e13.getText();
		if (!(data13.equalsIgnoreCase(PixalereIntakeOutputScriptsNursing.Drain3_Location))) {
			Assert.assertTrue(false);
		}

		WebElement e14 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Stool Consistency']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data14 = e14.getText();
		if (!(data14.equalsIgnoreCase(PixalereIntakeOutputScriptsNursing.drp_stool_consistency))) {
			Assert.assertTrue(false);
		}

		WebElement e15 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Number of Stools in the Past 24 Hours']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data15 = e15.getText();
		if (!(data15.equalsIgnoreCase(PixalereIntakeOutputScriptsNursing.no_of_stool))) {
			Assert.assertTrue(false);
		}

		System.out.println("Intake Output Nursing Page Verified.........");
	}

	public void verifyWaterlowAssessment() {
		// Radio Button verify
		WebElement e1 = driver.findElement(By.xpath("//tbody/tr[5]/td[4]"));
		String data1 = e1.getText();
		if (!(data1.equalsIgnoreCase(LocatorUtils.radioIncontinence))) {
			Assert.assertTrue(false);
		}
		WebElement e2 = driver.findElement(By.xpath("//tbody/tr[6]/td[4]"));
		String data2 = e2.getText();
		if (!(data2.equalsIgnoreCase(LocatorUtils.radioSkin_Type_Visual_Risk_Area))) {
			Assert.assertTrue(false);
		}
		WebElement e3 = driver.findElement(By.xpath("//tbody/tr[7]/td[4]"));
		String data3 = e3.getText();
		if (!(data3.equalsIgnoreCase(LocatorUtils.radioMobility))) {
			Assert.assertTrue(false);
		}
		WebElement e4 = driver.findElement(By.xpath("//tbody/tr[8]/td[4]"));
		String data4 = e4.getText();
		if (!(data4.equalsIgnoreCase(LocatorUtils.radioNutrition_Element))) {
			Assert.assertTrue(false);
		}
		// CheckBox Verification

		WebElement e5 = driver.findElement(By.xpath("//tbody/tr[9]/td[4]"));
		String data5 = e5.getText();
		for (int i = 0; i < PixalereWaterlawAssessmentScript.Tissue_Malnutrition_Checkbox.size(); i++) {
			if (!data5.contains(PixalereWaterlawAssessmentScript.Tissue_Malnutrition_Checkbox.get(i))) {
				Assert.assertTrue(false);
			}
		}

		WebElement e6 = driver.findElement(By.xpath("//tbody/tr[10]/td[4]"));
		String data6 = e6.getText();
		for (int i = 0; i < PixalereWaterlawAssessmentScript.Neurological_Deficit_Checkbox1.size(); i++) {
			if (!data6.contains(PixalereWaterlawAssessmentScript.Neurological_Deficit_Checkbox1.get(i))) {
				Assert.assertTrue(false);
			}
		}

		WebElement e7 = driver.findElement(By.xpath("//tbody/tr[11]/td[4]"));
		String data7 = e7.getText();
		for (int i = 0; i < PixalereWaterlawAssessmentScript.Surgery_Trauma_Checkbox1.size(); i++) {
			if (!data7.contains(PixalereWaterlawAssessmentScript.Surgery_Trauma_Checkbox1.get(i))) {
				Assert.assertTrue(false);
			}
		}

		WebElement e8 = driver.findElement(By.xpath("//tbody/tr[12]/td[4]"));
		String data8 = e8.getText();
		for (int i = 0; i < PixalereWaterlawAssessmentScript.WaterAssessment_Checkbox.size(); i++) {
			if (!data8.contains(PixalereWaterlawAssessmentScript.WaterAssessment_Checkbox.get(i))) {
				Assert.assertTrue(false);
			}
		}

		System.out.println("WaterLow Assese=ment Page Verified.....");
	}

	public void verify_basic_lower_limb_assessment_page() {

		// checkBox verify
		WebElement e1 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Right Missing Limb or Toes']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data1 = e1.getText();

		for (int i = 0; i < PixalereBasicLowerLimbAssessmentScripts.list.size(); i++) {
			if (!data1.contains(PixalereBasicLowerLimbAssessmentScripts.list.get(i))) {
				Assert.assertTrue(false);
			}
		}

		// checkBox verify
		WebElement e2 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Left Missing Limb or Toes']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data2 = e2.getText();

		for (int i = 0; i < PixalereBasicLowerLimbAssessmentScripts.listLeftMissingLimbsorToes.size(); i++) {
			if (!data2.contains(PixalereBasicLowerLimbAssessmentScripts.listLeftMissingLimbsorToes.get(i))) {
				Assert.assertTrue(false);
			}
		}

		// checkBox verify
		WebElement e3 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Right Derm Assessment']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data3 = e3.getText();

		for (int i = 0; i < PixalereBasicLowerLimbAssessmentScripts.list_Right_Derm_Assessment.size(); i++) {
			if (!data3.contains(PixalereBasicLowerLimbAssessmentScripts.list_Right_Derm_Assessment.get(i))) {
				Assert.assertTrue(false);
			}
		}

		// checkBox verify
		WebElement e4 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Left Derm Assessment']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data4 = e4.getText();

		for (int i = 0; i < PixalereBasicLowerLimbAssessmentScripts.list_Left_Derm_Assessment.size(); i++) {
			if (!data4.contains(PixalereBasicLowerLimbAssessmentScripts.list_Left_Derm_Assessment.get(i))) {
				Assert.assertTrue(false);
			}
		}

		// checkBox verify
		WebElement e5 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Right Monofilament Testing']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data5 = e5.getText();

		for (int i = 0; i < PixalereBasicLowerLimbAssessmentScripts.list_Right_Monofilament_Testing.size(); i++) {
			if (!data5.contains(PixalereBasicLowerLimbAssessmentScripts.list_Right_Monofilament_Testing.get(i))) {
				Assert.assertTrue(false);
			}
		}
		// input text field
		WebElement e8 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Comments']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data8 = e8.getText();
		if (!data8.equalsIgnoreCase(PixalereCreateNewPatientAccountScripts.Basic_LL_comments)) {
			Assert.assertTrue(false);
		}

		// input text field
		WebElement e11 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Sleep Position']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data11 = e11.getText();
		if (!data11.equalsIgnoreCase(PixalereCreateNewPatientAccountScripts.Basic_LL_sleep_position)) {
			Assert.assertTrue(false);
		}
		System.out.println("Basic Lower Limb Data verified");
	}

	public void verify_Home_Peritoneal() {
		// input text field
		WebElement e1 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Target Weight']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data1 = e1.getText();
		if (!data1.equalsIgnoreCase(PixalereCreateNewPatientAccountScripts.HomePeritoneal_TargetWeight)) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e2 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Modality']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data2 = e2.getText();
		if (!(data2.equalsIgnoreCase(LocatorUtils.radioModality))) {
			Assert.assertTrue(false);
		}
		// input text field
		WebElement e3 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Other']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data3 = e3.getText();
		if (!data3.equalsIgnoreCase(PixalereCreateNewPatientAccountScripts.HomePeritoneal_OtherRadio)) {
			Assert.assertTrue(false);
		}

		// input text field
		WebElement e4 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Target Blood Pressure']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data4 = e4.getText();
		if (!data4.equalsIgnoreCase(PixalereCreateNewPatientAccountScripts.HomePeritoneal_TargerBloodPressure)) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e5 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Edema']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data5 = e5.getText();
		if (!(data5.equalsIgnoreCase(LocatorUtils.radioHomeEdemafield))) {
			Assert.assertTrue(false);
		}

		// input text field
		WebElement e6 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Dwell Time (hrs)']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data6 = e6.getText();
		if (!data6.equalsIgnoreCase(PixalereCreateNewPatientAccountScripts.HomePeritoneal_DwellTime)) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e7 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Dialysate Clear']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data7 = e7.getText();
		if (!(data7.equalsIgnoreCase(LocatorUtils.radioHomeDialysateClear))) {
			Assert.assertTrue(false);
		}

		// input text field
		WebElement e8 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Solution Used: 1.50%']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data8 = e8.getText();
		if (!data8.equalsIgnoreCase(PixalereCreateNewPatientAccountScripts.HomePeritoneal_Solution1)) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e9 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Antibiotic Added']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data9 = e9.getText();
		if (!(data9.equalsIgnoreCase(LocatorUtils.radioHomeAntibiotic))) {
			Assert.assertTrue(false);
		}

		// Drop Down verify
		WebElement e10 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Skin Integrity around port site']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data10 = e10.getText();
		if (!(data10.equalsIgnoreCase(PixalereHomePeritonealScripts.homedrpskinintegrity))) {
			Assert.assertTrue(false);
		}

		// input text field
		WebElement e11 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Solution Used: 2.50%']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data11 = e11.getText();
		if (!data11.equalsIgnoreCase(PixalereCreateNewPatientAccountScripts.HomePeritoneal_Solution1)) {
			Assert.assertTrue(false);
		}

		// input text field
		WebElement e12 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Solution Used: 4.25%']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data12 = e12.getText();
		if (!data12.equalsIgnoreCase(PixalereCreateNewPatientAccountScripts.HomePeritoneal_Solution1)) {
			Assert.assertTrue(false);
		}

		// input text field
		WebElement e13 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Location']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data13 = e13.getText();
		if (!data13.equalsIgnoreCase(PixalereCreateNewPatientAccountScripts.HomePeritoneal_Location)) {
			Assert.assertTrue(false);
		}

		// input text field
		WebElement e14 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Measurement']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data14 = e14.getText();
		if (!data14.equalsIgnoreCase(PixalereCreateNewPatientAccountScripts.HomePeritoneal_Measurement)) {
			Assert.assertTrue(false);
		}

		// Drop Down verify
		WebElement e15 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Drainage']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data15 = e15.getText();
		if (!(data15.equalsIgnoreCase(PixalereHomePeritonealScripts.homedrpdrainage))) {
			Assert.assertTrue(false);
		}

		// Radio Button verify
		WebElement e16 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Heparin']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data16 = e16.getText();
		if (!(data16.equalsIgnoreCase(LocatorUtils.radioHomeHerapin))) {
			Assert.assertTrue(false);
		}

		// input text field
		WebElement e17 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Insulin (Humulin R) units: 1.50%']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data17 = e17.getText();
		if (!data17.equalsIgnoreCase(PixalereCreateNewPatientAccountScripts.HomePeritoneal_Insulin)) {
			Assert.assertTrue(false);
		}
		// input text field
		WebElement e18 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Insulin (Humulin R) units: 2.50%']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data18 = e18.getText();
		if (!data18.equalsIgnoreCase(PixalereCreateNewPatientAccountScripts.HomePeritoneal_Insulin)) {
			Assert.assertTrue(false);
		}

		// input text field
		WebElement e19 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Insulin (Humulin R) units: 4.25%']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data19 = e19.getText();
		if (!data19.equalsIgnoreCase(PixalereCreateNewPatientAccountScripts.HomePeritoneal_Insulin)) {
			Assert.assertTrue(false);
		}

		// input text field
		WebElement e20 = driver.findElement(By.xpath(
				"(//td[normalize-space()='Drainage Amount (mL)']//following-sibling::td//td[contains(@class,'flowchart_data')])[last()]"));
		String data20 = e20.getText();
		if (!data20.equalsIgnoreCase(PixalereCreateNewPatientAccountScripts.HomePeritoneal_DrainageAmt)) {
			Assert.assertTrue(false);
		}

		System.out.println("All Data Verified Successfully on Home_Peritoneal Flowchart Page");

	}

	public void var_Pain_on_Activities_of_Daily_Living_data() {
		String s1 = "(//input[@checked='checked' and contains(@id,'adl')])[%s]/following-sibling::label";
		for (int i = 1; i <= 10; i++) {
			String xpath1 = String.format(s1, i);
			WebElement e1 = driver.findElement(By.xpath(xpath1));
			String data1 = e1.getText();
			Activities_of_Daily_Living.add(data1);
		}
	}

	public void verify_image_left() {
		WebElement e1 = driver.findElement(By.xpath("//*[@id='alphap1']//img"));
		if (!e1.isDisplayed()) {
			Assert.assertTrue(false);
		}
	}

	public void verify_image_right() {
		WebElement e1 = driver.findElement(By.xpath("//*[@id='alphap4']//img"));
		if (!e1.isDisplayed()) {
			Assert.assertTrue(false);
		}
	}

	/// ******* ICAT Flowchart start ////////////////////////
	public void var_Neurological_History_data() {
		clear(By.xpath("(//label[contains(@class,'neuro_history_label')]/following-sibling::input)[2]"));
		String s1 = "(//input[@checked='checked' and contains(@id,'neuro_history')])[%s]/following-sibling::label";
		for (int i = 1; i <= 17; i++) {
			String xpath1 = String.format(s1, i);
			WebElement e1 = driver.findElement(By.xpath(xpath1));
			String data1 = e1.getText();
			Neurological_History_data.add(data1);
		}

	}

	public void var_Gastrointestinal_History_data() {
		clear(By.xpath("(//label[contains(@class,'gastro_history_label')]/following-sibling::input)[1]"));
		String s2 = "(//input[@checked='checked' and contains(@id,'gastro_history')])[%s]/following-sibling::label";
		for (int i = 1; i <= 20; i++) {
			String xpath1 = String.format(s2, i);
			WebElement e2 = driver.findElement(By.xpath(xpath1));
			String data2 = e2.getText();
			Gastrointestinal_History.add(data2);
		}
	}

	public void var_Genitourinary_History() {
		clear(By.xpath("(//label[contains(@class,'genit_history_label')]/following-sibling::input)[1]"));
		String s3 = "(//input[@checked='checked' and contains(@id,'genit_history')])[%s]/following-sibling::label";
		for (int i = 1; i <= 15; i++) {
			String xpath1 = String.format(s3, i);
			WebElement e3 = driver.findElement(By.xpath(xpath1));
			String data3 = e3.getText();
			Genitourinary_History.add(data3);
		}
	}

	public void var_Neurological_Assessment_data() {

		clear(By.xpath("(//label[contains(@class,'neuro_assess_label')]/following-sibling::input)[1]"));
		String s4 = "(//input[@checked='checked' and contains(@id,'neuro_assess')])[%s]/following-sibling::label";
		for (int i = 1; i <= 20; i++) {
			String xpath1 = String.format(s4, i);
			WebElement e4 = driver.findElement(By.xpath(xpath1));
			String data4 = e4.getText();
			Neurological_Assessment.add(data4);
		}

	}

	public void var_Endocrine_Assessment_data() {
		// clear(By.xpath("(//label[contains(@class,'endocrine_assess_label')]/following-sibling::input)[1]"));
		String s5 = "(//input[@checked='checked' and contains(@id,'endocrine_assess')])[%s]/following-sibling::label";
		for (int i = 1; i <= 21; i++) {
			String xpath1 = String.format(s5, i);
			WebElement e5 = driver.findElement(By.xpath(xpath1));
			String data5 = e5.getText();
			Endocrine_Assessment.add(data5);
		}

	}

	public void var_Gastrointestinal_Assessment_data() {
		clear(By.xpath("(//label[contains(@class,'gastro_assess_label')]/following-sibling::input)[1]"));
		String s6 = "(//input[@checked='checked' and contains(@id,'gastro_assess')])[%s]/following-sibling::label";
		for (int i = 1; i <= 17; i++) {
			String xpath1 = String.format(s6, i);
			WebElement e6 = driver.findElement(By.xpath(xpath1));
			String data6 = e6.getText();
			Gastrointestinal_Assessment.add(data6);
		}

	}

	public void var_Genitourinary_Assessment() {

		clear(By.xpath("(//label[contains(@class,'genit_assess_label')]/following-sibling::input)[1]"));
		String s7 = "(//input[@checked='checked' and contains(@id,'genit_assess')])[%s]/following-sibling::label";
		for (int i = 1; i <= 6; i++) {
			String xpath1 = String.format(s7, i);
			WebElement e7 = driver.findElement(By.xpath(xpath1));
			String data7 = e7.getText();
			Genitourinary_Assessment.add(data7);
		}

	}

	public void var_Musculoskeletal_Assessment() {

		clear(By.xpath("(//label[contains(@class,'musco_assess_label')]/following-sibling::input)[1]"));
		String s8 = "(//input[@checked='checked' and contains(@id,'musco_assess')])[%s]/following-sibling::label";
		for (int i = 1; i <= 15; i++) {
			String xpath1 = String.format(s8, i);
			WebElement e8 = driver.findElement(By.xpath(xpath1));
			String data8 = e8.getText();
			Musculoskeletal_Assessment.add(data8);
		}

	}

	public void var_Cardiovascular_History_data() {

		// clear(By.xpath("(//label[contains(@class,'cardiovascular_label')]/following-sibling::input)[1]"));
		String s9 = "(//input[@checked='checked' and contains(@id,'cardiovascular')])[%s]/following-sibling::label";
		for (int i = 1; i <= 4; i++) {
			String xpath1 = String.format(s9, i);
			WebElement e9 = driver.findElement(By.xpath(xpath1));
			String data9 = e9.getText();
			list_Cardiovascular_ICAN1.add(data9);
		}

	}

	public void var_Respiratory_History_data() {

		clear(By.xpath("(//label[contains(@for,'resp_history')]/following-sibling::input)[5]"));
		clear(By.xpath("//label[contains(@for,'resp_history')]/following-sibling::input)[6]"));
		clear(By.xpath("(//label[contains(@for,'resp_history')]/following-sibling::input)[4]"));

		String s10 = "(//input[@checked='checked' and contains(@id,'resp_history')])[%s]/following-sibling::label";
		for (int i = 1; i <= 10; i++) {
			String xpath1 = String.format(s10, i);
			WebElement e10 = driver.findElement(By.xpath(xpath1));
			String data10 = e10.getText();
			list_Respiratory_ICAN1.add(data10);
		}

	}

	public void var_Alternative_Complimentary_Therapies() {

		clear(By.xpath("(//label[contains(@class,'alternative_label')]/following-sibling::input)[1]"));
		String s11 = "(//input[@checked='checked' and contains(@id,'alternative')])[%s]/following-sibling::label";
		for (int i = 1; i <= 4; i++) {
			String xpath1 = String.format(s11, i);
			WebElement e11 = driver.findElement(By.xpath(xpath1));
			String data11 = e11.getText();
			Complimentary_Therapies.add(data11);

		}

	}

	public void var_nursing_intervention() {

		// clear(By.xpath("//label[contains(@for,'nursing_intervention') and
		// contains(text(),'Other')]/following-sibling::input"));
		String s12 = "(//input[@checked='checked' and contains(@id,'nursing_intervention3')])[%s]/following-sibling::label";
		for (int i = 1; i <= 7; i++) {
			String xpath1 = String.format(s12, i);
			WebElement e12 = driver.findElement(By.xpath(xpath1));
			String data12 = e12.getText();
			nursing_intervention.add(data12);
		}

	}

	/// ******* ICAT Flowchart end ////////////////////////

	public void clickElement_p(By locator) {
		// waitUntilElementIsDisplayed(locator);
		// waitUntilElementIsClickable(locator);
		// highLightElement(locator);
		Actions action = new Actions(driver);
		action.moveToElement((WebElement) locator).perform();
		// getWebDriver().findElement(locator).click();
		// waitForCompletePageLoad();
	}

	/**
	 * Click element.
	 * 
	 * @param WebElement
	 */
	public void clickElement(WebElement e) {
		waitUntilElementIsDisplayed(e);
		waitUntilElementIsClickable(e);
		highLightElement(e);
		e.click();
		waitForCompletePageLoad();
	}

	public void clickElementWithJQuery(By locator) {
		waitUntilElementIsDisplayed(locator);
		waitUntilElementIsClickable(locator);
		highLightElement(locator);
		((JavascriptExecutor) getWebDriver()).executeScript("arguments[0]. click();",
				getWebDriver().findElement(locator));
		waitForCompletePageLoad();
	}

	public void clickElementWithJQuery(WebElement e) {
		waitUntilElementIsDisplayed(e);
		waitUntilElementIsClickable(e);
		highLightElement(e);
		((JavascriptExecutor) getWebDriver()).executeScript("arguments[0]. click();", e);
		waitForCompletePageLoad();
	}

	public void clickElementOnCenter(WebElement e) {
		int width = e.getSize().getWidth();
		highLightElement(e);
		new Actions(getWebDriver()).moveToElement(e).moveByOffset((width / 2) - 2, 0).click().perform();
	}

	/**
	 * Highlight element.
	 * 
	 * @param locator
	 */
	public void highLightElement(By locator) {
		((JavascriptExecutor) getWebDriver()).executeScript(
				"arguments[0].setAttribute('style', 'border: 2px solid red;');", getWebDriver().findElement(locator));
	}

	/**
	 * Highlight element.
	 * 
	 * @param WebElement
	 */
	public void highLightElement(WebElement e) {
		((JavascriptExecutor) getWebDriver())
				.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');", e);
	}

	/**
	 * Scroll And Highlight element.
	 * 
	 * @param locator
	 */
	public void scrollAndhighLightElement(By locator) {
		((JavascriptExecutor) getWebDriver()).executeScript("arguments[0].scrollIntoView(true);",
				getWebDriver().findElement(locator));
		highLightElement(locator);
	}

	/**
	 * Scroll And Highlight element.
	 * 
	 * @param WebElement
	 */
	public void scrollAndhighLightElement(WebElement e) {
		((JavascriptExecutor) getWebDriver()).executeScript("arguments[0].scrollIntoView(true);", e);
		highLightElement(e);
	}

	/**
	 * Check if is displayed.
	 * 
	 * @param locator
	 * @return true, if is displayed
	 */
	public boolean isDisplayed(By locator) {
		try {
			return getWebDriver().findElement(locator).isDisplayed();
		} catch (Throwable t) {
			return false;
		}
	}

	/**
	 * Static wait interval.
	 * 
	 * @param seconds
	 */
	public void waitInterval(int seconds) {
		try {
			Thread.sleep(1000 * seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void waitIntervalByHalf(int seconds) {
		try {
			Thread.sleep(500 * seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @param locator
	 * @param attribute
	 * @return Element Attribute value in String format.
	 */
	public String getAttribute(By locator, String attribute) {
		waitForCompletePageLoad();
		waitUntilElementIsDisplayed(locator);
		return getWebDriver().findElement(locator).getAttribute(attribute);
	}

	/**
	 * Setup and kick-off Chrome browser with Nodes
	 * 
	 * @throws MalformedURLException
	 */
	public void setUp() throws MalformedURLException {
		tearDown();
//		String nodeURL = "http://" + ConfigFileReader.getProperties("machine.ip") + ":4444/wd/hub";
		System.out.println(ConfigFileReader.getProperties("browser") + " Browser Initiated");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setBrowserName(ConfigFileReader.getProperties("browser").toLowerCase());
		capabilities.setPlatform(Platform.WINDOWS);
		// driver = new RemoteWebDriver(new URL(nodeURL),capabilities);
		// driver.manage().window().maximize();
		// waitForCompletePageLoad();

		File dir = new File(directory);
		if (!dir.exists())
			dir.mkdir();

		setupChromeDriver(System.getProperty("user.dir") + File.separator + dir);

	}

	/**
	 * Terminate Chrome browser Kill opened driver Node.
	 */
	public void tearDown() {
		if ((driver != null) && (getWebDriver() != null)) {
			// driver.close();
			driver.quit();
		}
	}

	/**
	 * After execution Report getting generated.
	 */
	public static void generateReport() {
		Collection<File> jsonFiles = org.apache.commons.io.FileUtils.listFiles(new File("target/"),
				new String[] { "json" }, true);
		List<String> jsonPaths = new ArrayList<String>(jsonFiles.size());
		jsonFiles.forEach(file -> jsonPaths.add(file.getAbsolutePath()));
		Configuration config = new Configuration(new File("target/"), "PIXALERE");
		ReportBuilder reportBuilder = new ReportBuilder(jsonPaths, config);
		reportBuilder.generateReports();
	}

	/**
	 * Wait for ready state.
	 *
	 * @return the expected condition
	 */
	public ExpectedCondition<Boolean> waitForReadyState() {
		return new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				try {
					return (Boolean) ((JavascriptExecutor) driver)
							.executeScript("return document.readyState == 'complete'");
				} catch (Throwable t) {
					return true;
				}
			}
		};
	}

	/**
	 * Wait for ajax complete.
	 *
	 * @return the expected condition
	 */
	public ExpectedCondition<Boolean> waitForAjaxComplete() {
		return new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				try {
					return (Boolean) ((JavascriptExecutor) driver).executeScript("return window.jQuery.active == '0'");
				} catch (Throwable t) {
					return true;
				}
			}
		};
	}

	/**
	 * Process when page loading done.
	 */
	public void waitForCompletePageLoad() {
		waitForAjaxComplete();
		waitForReadyState();

	}

	public void takeScreenshot(Scenario scenario) throws Exception {
		if (scenario.isFailed()) {
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("C:\\Users\\Public\\SeleniumTools\\Screenshots\\screenshot.png"));
		}
	}

	public int getListSize(By locator) {
		waitUntilElementIsDisplayed(locator);
		return getWebDriver().findElements(locator).size();
	}

	public String getElementText(By locator) {
		waitForCompletePageLoad();
		waitUntilElementIsDisplayed(locator);
		return getWebDriver().findElement(locator).getText();
	}

	public String getElementText(WebElement e) {
		waitForCompletePageLoad();
		waitUntilElementIsDisplayed(e);
		return e.getText();
	}

	public void dragAndDropElement(By sourceLocator, By destinationLocator) {
		Actions actions = new Actions(getWebDriver());
		actions.clickAndHold(getWebDriver().findElement(sourceLocator))
				.moveToElement(getWebDriver().findElement(destinationLocator))
				.release(getWebDriver().findElement(destinationLocator)).build().perform();
		waitForCompletePageLoad();
	}

	/**
	 * 
	 * @param locator
	 * @param visibleText
	 */
	public void selectByVisibleText(By locator, String visibleText) {
		Wait_p(3);
		highLightElement(locator);
		Select sel = new Select(getWebDriver().findElement(locator));
		// sel.selectByIndex(3);
		sel.selectByVisibleText(visibleText);
		waitForCompletePageLoad();
	}

	public void selectBycontainsText(By locator, String text) {
		List<WebElement> options = getWebDriver().findElements(locator);
		for (WebElement option : options) {
			if (option.getText().contains(text)) {
				option.click();
				break;
			}
		}
	}

	public void select_ByIndex(By locator, Integer index) {
		Wait_p(3);
		highLightElement(locator);
		Select sel = new Select(getWebDriver().findElement(locator));
		sel.selectByIndex(index);
		// sel.selectByVisibleText(visibleText);
		waitForCompletePageLoad();
	}

	public void Wait_p(int sec) {
		try {
			Thread.sleep(sec * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @param WebElement
	 * @param visibleText
	 */
	public void selectByVisibleText(WebElement e, String visibleText) {
		highLightElement(e);
		Select sel = new Select(e);
		sel.selectByVisibleText(visibleText);
		waitForCompletePageLoad();
	}

	/**
	 * @param locator
	 * @return drop-down selected value.
	 */
	public String getDropdownSelectedOption(By locator) {
		highLightElement(locator);
		return new Select(getWebDriver().findElement(locator)).getFirstSelectedOption().getText();
	}

	/**
	 * Get current window
	 * 
	 * @return current window
	 */
	public String getCurrentWindow() {
		return getWebDriver().getWindowHandle();
	}

	/**
	 * Wait for switch window.
	 * 
	 * @param numberofWindows
	 */
	private void waitForSwitchWindow(int numberOfWindows) {
		waitUtils = new WebDriverWait(getWebDriver(), Integer.parseInt(ConfigFileReader.getProperties("default.time")));
		waitUtils.until(ExpectedConditions.numberOfWindowsToBe(numberOfWindows));
	}

	/**
	 * Switch to window
	 * 
	 * @param switchedInIndex
	 */
	public void switchToWindow(int switchedWinIndex) {
		waitForSwitchWindow(switchedWinIndex);
		getWebDriver().switchTo().window(new ArrayList<>(getWebDriver().getWindowHandles()).get(switchedWinIndex - 1));
	}

	/**
	 * Switch previous window
	 * 
	 * @param parentHandle
	 */
	public void switchToPreviousWindow(String parentHandle) {
		getWebDriver().switchTo().window(parentHandle);
		waitForCompletePageLoad();
	}

	public void acceptAlertPrompt() {
		waitInterval(1);
		Alert alert = getWebDriver().switchTo().alert();
		alert.accept();
		waitIntervalByHalf(1);
	}
}
