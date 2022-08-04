package pixalere.restAPI;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang.RandomStringUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Assert;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import dataProviders.ConfigFileReader;
import pixalere.pageObjectUtils.PixalereRestApiConstants;

public class PixalereRestApi {
	
	private String token, facilityId, patientId, woundId, dermId;
	public static String lastName;
	public static String etiology;
	public static int length, width, depth;
	public static String tunnelingPosition;
	public static int tunnelingMaximumDistance;
	public static String underminingStartingPosition, underminingPosition;
	public static int underminingMaximumDistance;
	public static String amount, color, odor;
	public static int pain;
	
	public static String problemIdentified, howLongPresent, diagnosis;
	public static String problemComesAndGoesOrAlwaysPresent, biopsyExplanation, triedTreatments, questions;
	public static Boolean hasBiopsiedBefore;
	public static List<String> symptoms = new ArrayList<String>();

	public void userLogin(String userName, String password) throws UnirestException {
		
		JSONObject payload = new JSONObject();
		payload.put("emailOrPhone", userName);
		payload.put("password", password);
		HttpResponse<JsonNode> jsonResponse = Unirest.post(PixalereRestApiConstants.BASE_URL_ + PixalereRestApiConstants.LOGIN_ENDPOINT_)
				.header("Content-Type", "application/json")
				.body(payload)
				.asJson();
//		assertEquals(RestApiConstants.SC_OK, jsonResponse.getStatus());
		Assert.assertEquals(PixalereRestApiConstants.SC_OK +" != "+jsonResponse.getStatus(), PixalereRestApiConstants.SC_OK, jsonResponse.getStatus());
		// extract fields from the object
		String message = jsonResponse.getBody().getObject().getString("message");
		assertEquals("Success", message);
	}
	
	public void getToken(String userName, String password, String otp) throws UnirestException {
		
		userLogin(userName, password);
		
		JSONObject payload = new JSONObject();
		payload.put("emailOrPhone", userName);
		payload.put("smsOtpCode", otp);
		payload.put("deviceType", "ios");
		
		System.out.println("payload: "+payload);
		
		HttpResponse<JsonNode> jsonResponse = Unirest.post(PixalereRestApiConstants.BASE_URL_ + PixalereRestApiConstants.OTP_ENDPOINT_)
	    .header("Content-Type", "application/json")
	    .body(payload)
	    .asJson();		
		assertEquals(PixalereRestApiConstants.SC_OK, jsonResponse.getStatus());
		// extract fields from the object
		token = jsonResponse.getBody().getObject().getString("token");
		System.out.println("Token : " +token);
//		return token;
	}
	
	
	public void getFacility() throws UnirestException {
		
		JSONObject payload = new JSONObject();
		payload.put("startKey", PixalereRestApiConstants.EMPTY_STRING);
		payload.put("reverse", PixalereRestApiConstants.EMPTY_STRING);
		payload.put("limit", 20);
	
		HttpResponse<JsonNode> jsonResponse = Unirest.post(PixalereRestApiConstants.BASE_URL_ + PixalereRestApiConstants.FACILITY_ENDPOINT_)
	    .header("Content-Type", "application/json")
	    .header("x-woundyne-token", token)
	    .body(payload)
	    .asJson();
		assertEquals(PixalereRestApiConstants.SC_OK, jsonResponse.getStatus());
		//retrieving the facilityId of the first record
		JSONArray facilities = jsonResponse.getBody().getObject().getJSONArray("objects"); // gets the objects array from response
		JSONObject jsonObject = facilities.getJSONObject(0); // getting the objects at 0th index
		facilityId = jsonObject.getString("id");
//		return facilityId;		
	}
 
	
	public void createNewPatient() throws UnirestException {
		
//		getFacility();
		String randomString = RandomStringUtils.randomAlphabetic(4);
		JSONObject payload = new JSONObject();
		payload.put("firstName", "FirstPatient");
		payload.put("middleInitial", "M");
		payload.put("lastName", "AutoTestPatient"+randomString);
		payload.put("profileImage",PixalereRestApiConstants.EMPTY_STRING);
		payload.put("facilityId", facilityId);
		payload.put("dob", "2004-01-02");
		JSONObject arrayItem = new JSONObject();
		arrayItem.put("type", "face_sheet");
		arrayItem.put("name", "Face Sheet");
		arrayItem.put("data", PixalereRestApiConstants.IMAGE_BASE_URL);
		JSONArray array = new JSONArray();
		array.put(arrayItem);
		payload.put("images", array);	
		
		HttpResponse<JsonNode> jsonResponse = Unirest.post(PixalereRestApiConstants.BASE_URL_ + PixalereRestApiConstants.NEW_PATIENT_ENDPOINT_)
	    .header("Content-Type", "application/json")
	    .header("x-woundyne-token", token)
	    .body(payload)
	    .asJson();
		assertEquals(PixalereRestApiConstants.SC_OK, jsonResponse.getStatus());
		patientId = jsonResponse.getBody().getObject().getString("id");
		lastName = jsonResponse.getBody().getObject().getString("lastName");
		System.out.println("patientId : " +patientId);
		System.out.println("lastName : " +lastName);
//		return patientId;
	}
	
	
	public void addNewWound() throws UnirestException {
			
		JSONObject payload = new JSONObject();
		payload.put("id", PixalereRestApiConstants.EMPTY_STRING);
		payload.put("patientId", patientId);
		payload.put("name", PixalereRestApiConstants.EMPTY_STRING);
		payload.put("createdAt",PixalereRestApiConstants.EMPTY_STRING);
		payload.put("state", PixalereRestApiConstants.EMPTY_STRING);
		payload.put("type", "Wound");
		payload.put("etiology", "Arterial Ulcer");
		payload.put("location", "front");
		JSONObject arrayItem = new JSONObject();
		arrayItem.put("x", 0.49398707637080436);
		arrayItem.put("y", 0.06985388616668115);
		JSONArray array = new JSONArray();
		array.put(arrayItem);
		payload.put("points", array);		
		
		HttpResponse<JsonNode> jsonResponse = Unirest.post(PixalereRestApiConstants.BASE_URL_ + PixalereRestApiConstants.NEW_WOUND_ENDPOINT_)
	    .routeParam("patientId", patientId)
	    .header("Content-Type", "application/json")
	    .header("x-woundyne-token", token)
	    .body(payload)
	    .asJson();
		assertEquals(PixalereRestApiConstants.SC_OK, jsonResponse.getStatus());
		woundId = jsonResponse.getBody().getObject().getString("id");
		etiology = jsonResponse.getBody().getObject().getString("etiology");
		System.out.println("woundId : " +woundId);
	} 
	
	
	public void addNewWoundAssessment() throws UnirestException {
		
		JSONObject payload = new JSONObject();
		payload.put("depth", 3);
		payload.put("length", 1);
		payload.put("width", 2);
		payload.put("undermining",true);
		JSONObject arrayItem = new JSONObject();
		arrayItem.put("imageId", "");
		arrayItem.put("headX", 0.5467160260235822);
		arrayItem.put("headY", 0.4789735223750127);
		arrayItem.put("data", PixalereRestApiConstants.IMAGE_BASE_URL);
		arrayItem.put("toeX", 0.5383903785988137);
		arrayItem.put("toeY", 0.6067189852131686);
		JSONArray array = new JSONArray();
		array.put(arrayItem);
		payload.put("images", array);		
		payload.put("underminingFrom", "2:00");
		payload.put("underminingTo", "3:00");
		payload.put("underminingDistance", 4);
		payload.put("tunneling", true);
		payload.put("tunnelingDirection", "1:00");
		payload.put("tunnelingDistance", 2);
		payload.put("exudate", "Scant");
		payload.put("exudateColor", "Red");
		payload.put("exudateOdor", "Strong");
		payload.put("woundPain", 5);
		payload.put("notes", "Automation Test");
		
		HttpResponse<JsonNode> jsonResponse = Unirest.post(PixalereRestApiConstants.BASE_URL_ + PixalereRestApiConstants.NEW_WOUND_ASSESSMENT_ENDPOINT_)
	    .routeParam("patientId", patientId)
	    .routeParam("woundId", woundId)
	    .header("Content-Type", "application/json")
	    .header("x-woundyne-token", token)
	    .body(payload)
	    .asJson();
		assertEquals(PixalereRestApiConstants.SC_OK, jsonResponse.getStatus());
//		String assessmentId = jsonResponse.getBody().getObject().getString("id");
//		System.out.println("assessmentId : " +assessmentId);
		
		depth = jsonResponse.getBody().getObject().getInt("depth");
		System.out.println("depth: "+depth);
		
		length = jsonResponse.getBody().getObject().getInt("length");
		System.out.println("length: "+length);
		
		width = jsonResponse.getBody().getObject().getInt("width");
		System.out.println("width: "+width);
		
		amount = jsonResponse.getBody().getObject().getString("exudate");
		System.out.println("amount: "+amount);
		
		color = jsonResponse.getBody().getObject().getString("exudateColor");
		System.out.println("color: "+color);
		
		odor = jsonResponse.getBody().getObject().getString("exudateOdor");
		System.out.println("odor: "+odor);
		
		pain = jsonResponse.getBody().getObject().getInt("woundPain");
		System.out.println("pain: "+pain);
		
		tunnelingPosition = jsonResponse.getBody().getObject().getString("tunnelingDirection");
		System.out.println("tunnelingPosition: "+tunnelingPosition);
		
		tunnelingMaximumDistance = jsonResponse.getBody().getObject().getInt("tunnelingDistance");
		System.out.println("tunnelingMaximumDistance: "+tunnelingMaximumDistance);
		
		underminingStartingPosition = jsonResponse.getBody().getObject().getString("underminingFrom");
		System.out.println("underminingStartingPosition: "+underminingStartingPosition);
		
		underminingPosition = jsonResponse.getBody().getObject().getString("underminingTo");
		System.out.println("underminingPosition: "+underminingPosition);
		
		underminingMaximumDistance = jsonResponse.getBody().getObject().getInt("underminingDistance");
		System.out.println("underminingMaximumDistance: "+underminingMaximumDistance);
	}
	
public void searchPatient(String patientName) throws UnirestException {
		JSONObject payload = new JSONObject();
		payload.put("query", patientName);
		HttpResponse<JsonNode> jsonResponse = Unirest.post(PixalereRestApiConstants.BASE_URL_ + PixalereRestApiConstants.PATIENT_SEARCH_)
	    .header("Content-Type", "application/json")
	    .header("x-woundyne-token", token)
	    .body(payload)
	    .asJson();
		assertEquals(PixalereRestApiConstants.SC_OK, jsonResponse.getStatus());
		JSONArray patients = jsonResponse.getBody().getObject().getJSONArray("objects"); // gets the objects array from response
		JSONObject jsonObject = patients.getJSONObject(0); // getting the objects at 0th index
		patientId = jsonObject.getString("id");
		//patientId = jsonResponse.getBody().getObject().getString("id");
		System.out.println("searchedPatientId : " +patientId);
		
		lastName = patientName;
		System.out.println("lastName: " +lastName);
	}

public void addNewDerm() throws UnirestException {

	JSONObject payload = new JSONObject();
	payload.put("id", PixalereRestApiConstants.EMPTY_STRING);
	payload.put("patientId", patientId);
	payload.put("name", PixalereRestApiConstants.EMPTY_STRING);
	payload.put("createdAt",PixalereRestApiConstants.EMPTY_STRING);
	payload.put("state", PixalereRestApiConstants.EMPTY_STRING);
	payload.put("type", "Derm");
	payload.put("etiology", PixalereRestApiConstants.EMPTY_STRING);
	payload.put("location", PixalereRestApiConstants.EMPTY_STRING);
	JSONObject arrayItem = new JSONObject();
	//arrayItem.put("x", 0.49398707637080436);
	//arrayItem.put("y", 0.06985388616668115);
	JSONArray array = new JSONArray();
	array.put(arrayItem);
	payload.put("points", array);

	HttpResponse<JsonNode> jsonResponse = Unirest.post(PixalereRestApiConstants.BASE_URL_ + PixalereRestApiConstants.NEW_WOUND_ENDPOINT_)
			.routeParam("patientId", patientId)
			.header("Content-Type", "application/json")
			.header("x-woundyne-token", token)
			.body(payload)
			.asJson();
	assertEquals(PixalereRestApiConstants.SC_OK, jsonResponse.getStatus());
	dermId = jsonResponse.getBody().getObject().getString("id");
	//etiology = jsonResponse.getBody().getObject().getString("etiology");
	System.out.println("dermId : " +dermId);
}

	public void addNewDermAssessment() throws UnirestException {

		JSONObject payload = new JSONObject();
		payload.put("skinProblem", "Pigmentary problem");
		payload.put("howLongPresent", "1 - 4 weeks");
		payload.put("problemComesAndGoesOrAlwaysPresent", "Always present");
	
//		JSONObject arrayItem = new JSONObject();
//		arrayItem.put("Bleeding");
//		arrayItem.put("Getting Darker");
//		arrayItem.put("Burning");
//		arrayItem.put("Appearance");
//		JSONArray array = new JSONArray();
//		array.put(arrayItem);
		payload.put("symptoms", Arrays.asList("Bleeding","Getting Darker","Burning","Appearance"));
	
		payload.put("otherSymptoms", "Other symptoms");
	
//		JSONObject arrayItem = new JSONObject();
//		arrayItem.put("Fever");
//		arrayItem.put("Fatigue");
//		arrayItem.put("Mouth Sores");
//		arrayItem.put("Shortness of Breath");
//		JSONArray array = new JSONArray();
//		array.put(arrayItem);
		payload.put("additionalSymptoms", Arrays.asList("Fever","Fatigue","Mouth Sores","Shortness of Breath"));
	
		payload.put("diagnosis", "Preliminary diagnosis");
		payload.put("hasBiopsiedBefore", true);
		payload.put("biopsyExplanation", "Yes explain");
		payload.put("triedTreatments", "Treatment tried");
		payload.put("questions", "Ugent answer");
	
		JSONObject arrayItem = new JSONObject();
		arrayItem.put("imageId", "");
		arrayItem.put("headX", "");
		arrayItem.put("headY", "");
		arrayItem.put("data", PixalereRestApiConstants.IMAGE_BASE_URL);
		arrayItem.put("toeX", "");
		arrayItem.put("toeY", "");
		JSONArray array = new JSONArray();
		array.put(arrayItem);
		payload.put("images", array);
	
		HttpResponse<JsonNode> jsonResponse = Unirest.post(PixalereRestApiConstants.BASE_URL_ + PixalereRestApiConstants.NEW_DERM_ASSESSMENT_ENDPOINT_)
				.routeParam("patientId", patientId)
//				.routeParam("woundId", woundId)
				.routeParam("woundId", dermId)
				.header("Content-Type", "application/json")
				.header("x-woundyne-token", token)
				.body(payload)
				.asJson();
		assertEquals(PixalereRestApiConstants.SC_OK, jsonResponse.getStatus());
	//	String assessmentId = jsonResponse.getBody().getObject().getString("id");
	//	System.out.println("assessmentId : " +assessmentId);
	
	
		problemIdentified = jsonResponse.getBody().getObject().getString("skinProblem");
		System.out.println("problemIdentified: "+problemIdentified);
	
		howLongPresent = jsonResponse.getBody().getObject().getString("howLongPresent");
		System.out.println("howLongPresent: "+howLongPresent);
	
		problemComesAndGoesOrAlwaysPresent = jsonResponse.getBody().getObject().getString("problemComesAndGoesOrAlwaysPresent");
		System.out.println("problemComesAndGoesOrAlwaysPresent: "+problemComesAndGoesOrAlwaysPresent);
	
	//////////////////////////////
	
		JSONArray symptom = jsonResponse.getBody().getObject().getJSONArray("symptoms"); // gets the objects array from response
		//JSONObject jsonObject = symptoms.getJSONObject(0); // getting the objects at 0th index
		//facilityId = jsonObject.getString("id");

		for(int i=0;i<symptom.length();i++)
		{
	//		symptoms.add(symptom.get(i));
			symptoms.add(symptom.getString(i));
	
		}
		System.out.println("symptoms: "+symptoms);
	
		diagnosis = jsonResponse.getBody().getObject().getString("diagnosis");
		System.out.println("diagnosis: "+diagnosis);
	
		hasBiopsiedBefore = jsonResponse.getBody().getObject().getBoolean("hasBiopsiedBefore");
		System.out.println("hasBiopsiedBefore: "+hasBiopsiedBefore);
	
		biopsyExplanation = jsonResponse.getBody().getObject().getString("biopsyExplanation");
		System.out.println("biopsyExplanation: "+biopsyExplanation);
	
		triedTreatments = jsonResponse.getBody().getObject().getString("triedTreatments");
		System.out.println("triedTreatments: "+triedTreatments);
	
		questions = jsonResponse.getBody().getObject().getString("questions");
		System.out.println("questions: "+questions);
	}


	public static void main(String[] args) throws UnirestException {
		PixalereRestApi api = new PixalereRestApi();
//		api.getToken("achal", "Tatva@123", "121212");
//		api.getFacility();
//		api.createNewPatient();
		
		/*** For Wound Call ***/
//		api.addNewWound();
//		api.addNewWoundAssessment();
		
		/*** For Derm Call ***/
//		api.addNewDerm();
//		api.addNewDermAssessment();
	}
}
