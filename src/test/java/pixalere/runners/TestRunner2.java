package pixalere.runners;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import pixalere.pageObjectUtils.SeleniumCommonUtils;

@RunWith(Cucumber.class)
//@CucumberOptions(features = {"src/test/java/pixalere/features"},
//		glue= {"pixalere.stepdefinitions"},
//		tags = {"@test1"},
//		plugin = {"json:target/cucumber.json"},
//		monochrome = true,
//		dryRun = false
//)

@CucumberOptions(features = { "classpath:pixalere/features/OTUpdated/PixalereOTAssessment.feature" }, glue = {
		"classpath:pixalere.stepdefinitions" }, plugin = { "pretty", "json:target/cucumber.json" })

public class TestRunner2 extends AbstractTestNGCucumberTests {

	@AfterClass
	public static void tearDown() {
		new SeleniumCommonUtils().tearDown();
		SeleniumCommonUtils.generateReport();
	}
}