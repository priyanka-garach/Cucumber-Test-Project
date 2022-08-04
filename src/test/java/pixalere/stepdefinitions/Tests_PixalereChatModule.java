package pixalere.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pixalere.scripts.PixalereChatModuleScripts;

public class Tests_PixalereChatModule extends PixalereChatModuleScripts {

	@When("I search {string} as {string} in Send Message popup")
	public void i_search_as_in_Send_Message_popup(String userPatient, String field) {
		searchRecipientUserPatient(userPatient, field);
	}

	@Then("{string} should display in {string} field")
	public void should_display_in_field(String userPatient, String field) {
		verifySearchedUserPatient(userPatient, field);
	}

	@When("I remove selected User and Patient from popup")
	public void i_remove_selected_User_and_Patient_from_popup() {
		removeUserPatientLabelFromPopup();
	}

	@Then("Selected field should reset")
	public void selected_field_should_reset() {
		verifyRecipientUserPatientFieldReset();
	}

	@When("Sender type message in Chat box")
	public void sender_type_message_in_Chat_box() {
		typeMessageFromSender();
	}

	@Then("Typed message should display in {string} field")
	public void typed_message_should_display_in_field(String string) {
		verifyLatestSentMessageInChatHistory();
	}
	
	@Then("No message entry display for other user")
	public void no_message_entry_display_for_other_user() {
		verifyChatHistoryEmpty();
	}
	
	@Then("Latest message should display in {string} user Chat panel")
	public void latest_message_should_display_in_Chat_panel(String user) {
		verifyUnreadMessage(user);
	}

	@Then("I read the message from {string} user")
	public void i_read_the_message_from_user(String user) {
		readLatestMessage();
	}
	
	@When("Receiver type message in Chat box")
	public void receiver_type_message_in_Chat_box() {
		typeMessageFromReceiver();
	}
}
