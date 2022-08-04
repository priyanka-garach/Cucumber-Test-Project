package pixalere.scripts;

import com.mashape.unirest.http.exceptions.UnirestException;

import dataProviders.ConfigFileReader;
import pixalere.pageObjectUtils.PixalereCommonUtils;
import pixalere.restAPI.PixalereRestApi;

public class PixalereDermAssessmentMobileScripts extends PixalereCommonUtils {

	PixalereRestApi				apiScripts		= new PixalereRestApi();
	
	public void createPatientViaAPICall() throws UnirestException {
		apiScripts.getToken(ConfigFileReader.getProperties("dermatologist.user.username"),
				ConfigFileReader.getProperties("user.password"), ConfigFileReader.getProperties("sms.code"));
		apiScripts.getFacility();
		apiScripts.createNewPatient();
		apiScripts.addNewDerm();
		apiScripts.addNewDermAssessment();
	}
}
