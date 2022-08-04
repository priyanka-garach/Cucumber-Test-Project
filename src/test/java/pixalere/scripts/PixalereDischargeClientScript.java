package pixalere.scripts;

import pixalere.pageObjectUtils.LocatorUtils.DischargeClient;
import pixalere.pageObjectUtils.PixalereCommonUtils;

public class PixalereDischargeClientScript extends PixalereCommonUtils{
	
	public void selectDropdownValue_Reason(String value) {
		selectByVisibleText(DischargeClient.drp_reason, value);
	}
	public void selectDropdownValue_date(String value) {
		selectByVisibleText(DischargeClient.drp_day, value);		
	}
	public void selectDropdownValue_month(String value) {
		selectByVisibleText(DischargeClient.drp_month, value);
	}
	public void enterYear(String value) {
		sendKeys(DischargeClient.drp_year, value);
	}
	public void clickonDischarge()
	{
		clickElement(DischargeClient.button_discharge_client);
	}

}
