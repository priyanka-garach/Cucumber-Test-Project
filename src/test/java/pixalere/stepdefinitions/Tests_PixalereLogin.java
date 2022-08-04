package pixalere.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pixalere.scripts.PixalereLoginScripts;

public class Tests_PixalereLogin extends PixalereLoginScripts {

	@Then("^I verify Pixalere Login page is displayed$")
	public void i_verify_Pixalere_Login_page_is_displayed() throws Throwable {
		verifyLoginPage();
	}
	
	@When("^I entered ([^\"]*) and ([^\"]*) and click on Continue button$")
	public void i_entered_and_and_click_on_Continue_button(String username, String password) throws Throwable {
		login(username, password);
	}
	
	@Then("I should get logged in and shown {string} popup")
	public void i_should_get_logged_in_and_shown_popup(String titleText) {
		verifyLogin(titleText);
	}

	@When("I close popup Window")
	public void i_close_popup_Window() {
		closeHomePagePopup();
	}

	@Then("I should be shown the Home Screen")
	public void i_should_be_shown_the_Home_Screen() {
		verifyHomePage();
	}
	

	@Then("I Logout from Pixalere")
	public void i_Logout_from_Pixalere() {
		logOut();
	}
}
