package pixalere.scripts;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;

import pixalere.pageObjectJavaUtils.JavaUtils;
import pixalere.pageObjectUtils.LocatorUtils.CarePlanLocators;
import pixalere.pageObjectUtils.PixalereCommonUtils;
import pixalere.pageObjectUtils.PixalereStringPool;

public class PixalereCarePlanScripts extends PixalereCommonUtils {

	public static String CarePlan_problem_num;
	public static String IOFluid;
	public static String CarePlan_Nursing_Diagnosis;
	public static String CarePlan_Interventions_Routine;
	public static String CarePlanOutcomes;
	public static String Edit_CarePlan_Nursing_Diagnosis;
	public static String Edit_CarePlan_Interventions_Routine;
	public static String Edit_CarePlanOutcomes;
	public static List<String> DiabetesTeachingList = new ArrayList<String>();

	public void selectRdioOptionCarePlan(String section) {
		if (section.contains("Yes"))
			clickElement(By.xpath("//label[@id='goals_met1_label']"));

		else
			clickElement(
					By.xpath("(//label[@id='goals_met1_label']//following::div[@id='md-radio-goals_met2'])//label"));

	}

	public void complteed_button_click(String pattern) {
		String s1 = "((//*[@id=\"form\"]//tbody//td//b[contains(text(),'%s')]//following::div)[1])//button";
		String xpath1 = String.format(s1, pattern);
		clickElement(By.xpath(xpath1));
		waitInterval(5);
		DiabetesTeachingList.add(pattern);
	}
	
	public void complteed_button_click1(String pattern) {
		//convert undo to normal button
				call_diabetiesteachGuidelines(pattern);
				
	}
	

	public void complteed_button_click2(String pattern) {
				
		String s1 = "((//*[@id=\"form\"]//tbody//td//b[contains(text(),'%s')]//following::div)[1])//button";
		String xpath1 = String.format(s1, pattern);
		waitInterval(5);
		clickElement(By.xpath(xpath1));
		waitInterval(5);
		DiabetesTeachingList.add(pattern);
	}

	public void enterInputFieldAsPerKey(String inputField) {
		switch (inputField) {
		case PixalereStringPool.PROBLEM_No_CarePlan:
			CarePlan_problem_num = JavaUtils.getRandomNumber(2);
			System.out.println(PixalereStringPool.PROBLEM_No_CarePlan + ": " + CarePlan_problem_num);
			clear(CarePlanLocators.txt_problem_num);
			sendKeys(CarePlanLocators.txt_problem_num, CarePlan_problem_num);
			break;

		case PixalereStringPool.NURSING_DIAGNOSIS_CarePlan:
			CarePlan_Nursing_Diagnosis = JavaUtils.getRandomString(8);
			System.out.println(PixalereStringPool.NURSING_DIAGNOSIS_CarePlan + ": " + CarePlan_Nursing_Diagnosis);
			clear(CarePlanLocators.txt_nursing_diagnosis);
			sendKeys(CarePlanLocators.txt_nursing_diagnosis, CarePlan_Nursing_Diagnosis);
			break;

		case PixalereStringPool.INTERVENTIONS_ROUTINE_CarePlan:
			CarePlan_Interventions_Routine = JavaUtils.getRandomString(8);
			System.out
					.println(PixalereStringPool.INTERVENTIONS_ROUTINE_CarePlan + ": " + CarePlan_Interventions_Routine);
			clear(CarePlanLocators.txt_interventions_routine);
			sendKeys(CarePlanLocators.txt_interventions_routine, CarePlan_Interventions_Routine);
			break;

		case PixalereStringPool.EXPECTED_OUTCOMES_REEVALUATION_DATE_CarePlan:
			CarePlanOutcomes = JavaUtils.getRandomString(8);
			System.out
					.println(PixalereStringPool.EXPECTED_OUTCOMES_REEVALUATION_DATE_CarePlan + ": " + CarePlanOutcomes);
			clear(CarePlanLocators.txt_outcomes);
			sendKeys(CarePlanLocators.txt_outcomes, CarePlanOutcomes);
			break;

		case PixalereStringPool.Edit_NURSING_DIAGNOSIS_CarePlan:
			Edit_CarePlan_Nursing_Diagnosis = JavaUtils.getRandomString(8);
			System.out.println(
					PixalereStringPool.Edit_NURSING_DIAGNOSIS_CarePlan + ": " + Edit_CarePlan_Nursing_Diagnosis);
			clear(CarePlanLocators.txtedit_nursing_diagnosis);
			waitInterval(10);
			clear(CarePlanLocators.txtedit_nursing_diagnosis);
			waitInterval(10);
			sendKeys(CarePlanLocators.txtedit_nursing_diagnosis, Edit_CarePlan_Nursing_Diagnosis);
			break;

		case PixalereStringPool.Edit_INTERVENTIONS_ROUTINE_CarePlan:
			Edit_CarePlan_Interventions_Routine = JavaUtils.getRandomString(8);
			System.out.println(PixalereStringPool.Edit_INTERVENTIONS_ROUTINE_CarePlan + ": "
					+ Edit_CarePlan_Interventions_Routine);
			clear(CarePlanLocators.txtedit_interventions_routine);
			sendKeys(CarePlanLocators.txtedit_interventions_routine, Edit_CarePlan_Interventions_Routine);
			break;

		case PixalereStringPool.Edit_EXPECTED_OUTCOMES_REEVALUATION_DATE_CarePlan:
			Edit_CarePlanOutcomes = JavaUtils.getRandomString(8);
			System.out.println(PixalereStringPool.Edit_EXPECTED_OUTCOMES_REEVALUATION_DATE_CarePlan + ": "
					+ Edit_CarePlanOutcomes);
			clear(CarePlanLocators.txtedit_outcomes);
			sendKeys(CarePlanLocators.txtedit_outcomes, Edit_CarePlanOutcomes);
			break;

		}
	}
}
