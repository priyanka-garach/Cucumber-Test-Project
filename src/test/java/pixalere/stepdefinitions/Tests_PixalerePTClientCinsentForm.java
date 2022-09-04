package pixalere.stepdefinitions;
import org.openqa.selenium.By;

import io.cucumber.java.en.When;
import pixalere.scripts.PixalereClinetConsentScripts;

public class Tests_PixalerePTClientCinsentForm extends PixalereClinetConsentScripts {
	@When("I click on {string} arrow Button")
	public void i_click_on_arrow_Button(String string) {
		String path = "//*[normalize-space(text())='%s']//parent::*//parent::*//parent::*//div//img[1]"; 
	    clickElement_withJS(By.xpath(String.format(path, string)));
	}

	@When("I click checkbox {string} for Proposed Health Services Discussed")
	public void i_click_checkbox_for_Proposed_Health_Services_Discussed(String string) {
	    chk_click_on_Proposed_Health_Services_Discussed(string);
	}
	
	@When("I click radio {string} Risk for alternatives and benefits of service discussed")
	public void i_click_radio_Risk_for_alternatives_and_benefits_of_service_discussed(String string) {
	    radio_Risk_for_alternatives_and_benefits_of_service_discussed(string);
	}

	@When("I click radio {string} for Notice of Information Practices provided to client SDM")
	public void i_click_radio_for_Notice_of_Information_Practices_provided_to_client_SDM(String string) {
	    radio_for_Notice_of_Information_Practices_provided_to_clientSDM(string);
	}

	@When("I click radio {string} for Your service funder")
	public void i_click_radio_for_Your_service_funder(String string) {
	    radio_for_Your_service_funder(string);
	}

	@When("I tick {string} for Family friends caregivers")
	public void i_tick_for_Family_friends_caregivers(String string) {
		chk_or_Family_friends_caregivers(string);
	}

	@When("I tick {string} for Medical Contacts")
	public void i_tick_for_Medical_Contacts(String string) {
	  chk_for_Medical_Contacts(string);
	}

	@When("I tick {string} for Virtual Care Consent")
	public void i_tick_for_Virtual_Care_Consent(String string) {
	    chk_for_Virtual_Care_Consent(string);
	}

	@When("I click radio {string} Client is aware of the option of virtual care with telephone")
	public void i_click_radio_Client_is_aware_of_the_option_of_virtual_care_with_telephone(String string) {
	   radio_click_radio_Client_is_aware_of_the_option_of_virtual_care_with_telephone(string);
	}

	@When("I click checkbox {string} for Client not interested in virtual care by telephone because")
	public void i_click_checkbox_for_Client_not_interested_in_virtual_care_by_telephone_because(String string) {
	   chk_Client_not_interested_in_virtual_care_by_telephone_because(string);
	}

	@When("I click radio {string} Client is aware of the option of virtual care with video")
	public void i_click_radio_Client_is_aware_of_the_option_of_virtual_care_with_video(String string) {
	   radio_Client_is_aware_of_the_option_of_virtual_care_with_video(string);
	}

	@When("I click radio {string} regarding virtual care with video. Client SDM provided informed consent.")
	public void i_click_radio_regarding_virtual_care_with_video_Client_SDM_provided_informed_consent(String string) {
	   radio_regarding_virtual_care_with_video_Client_SDM_provided_informed_consent(string);
	}
	
	@When("I click radio {string} regarding virtual care with novideo. Client SDM provided informed consent.")
	public void i_click_radio_regarding_virtual_care_with_novideo_Client_SDM_provided_informed_consent(String string) {
	   radio_regarding_virtual_care_with_novideo_Client_SDM_provided_informed_consent(string);
	}

	@When("I click checkbox {string} for Consent obtained from")
	public void i_click_checkbox_for_Consent_obtained_from(String string) {
	    chk_checkbox_for_Consent_obtained_from(string);
	}

	@When("I click checkbox {string} for Relationship")
	public void i_click_checkbox_for_Relationship(String string) {
	    chk_for_Relationship(string);
	}

	@When("I click radio {string} I the Service Provider have completed this consent discussion with the clientSDM")
	public void i_click_radio_I_the_Service_Provider_have_completed_this_consent_discussion_with_the_clientSDM(String string) {
	   radio_I_the_Service_Provider_have_completed_this_consent_discussion_with_the_clientSDM(string);
	}

	@When("I click checkbox {string} for Lock Box Required")
	public void i_click_checkbox_for_Lock_Box_Required(String string) {
	   chk_for_Lock_Box_Required(string);
	}
}
