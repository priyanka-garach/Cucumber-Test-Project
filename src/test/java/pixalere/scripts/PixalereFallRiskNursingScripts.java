package pixalere.scripts;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;

import pixalere.pageObjectJavaUtils.JavaUtils;
import pixalere.pageObjectUtils.PixalereCommonUtils;
import pixalere.pageObjectUtils.PixalereStringPool;

public class PixalereFallRiskNursingScripts extends PixalereCommonUtils {

	public static String chk_Education_FallRisk;
	public static String chk_Education_Cogntive_impairment;
	
	public static List<String> DiabetesTeachingList = new ArrayList<String>();

	public void chk_Education_FallRisk(String value) {
		chk_Education_FallRisk = value;
		clickElement_withJS(By.xpath("//td[contains(text(),'History of Fall')]//following-sibling::td//label[contains(@for,'edu')]"));
	}
	
	public void chk_Education_Cogntive_impairment(String value) {
		chk_Education_Cogntive_impairment = value;
		clickElement_withJS(By.xpath("//td[contains(text(),'Cogntive impairment')]//following-sibling::td//label[contains(@for,'edu')]"));
	}
	
	public void chk_Education_Taking_4_or_more_medications(String value) {
		chk_Education_Cogntive_impairment = value;
		clickElement_withJS(By.xpath("//td[contains(text(),'Taking 4 or more medications')]//following-sibling::td//label[contains(@for,'edu')]"));
	}
	
	public void enterInputFieldAsPerKey(String inputField) {
		switch (inputField) {
		case PixalereStringPool.PROBLEM_No_CarePlan:
			//CarePlan_problem_num = JavaUtils.getRandomNumber(2);
			/*System.out.println(PixalereStringPool.PROBLEM_No_CarePlan + ": " + CarePlan_problem_num);
			clear(CarePlanLocators.txt_problem_num);
			sendKeys(CarePlanLocators.txt_problem_num, CarePlan_problem_num);
			break;*/

	

		}
	}
}
