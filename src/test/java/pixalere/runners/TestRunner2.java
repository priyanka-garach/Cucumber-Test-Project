package pixalere.runners;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import pixalere.pageObjectUtils.SeleniumCommonUtils;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "classpath:pixalere/features/NursingForms/PixalereDailySchedule.feature" }, glue = {
		"classpath:pixalere.stepdefinitions" }, plugin = { "pretty", "json:target/cucumber.json" })

public class TestRunner2 extends AbstractTestNGCucumberTests {

	@AfterClass
	public static void tearDown() {
		new SeleniumCommonUtils().tearDown();
		SeleniumCommonUtils.generateReport();
	}
}