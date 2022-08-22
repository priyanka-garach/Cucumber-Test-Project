package pixalere.scripts;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;

import pixalere.pageObjectJavaUtils.JavaUtils;
import pixalere.pageObjectUtils.LocatorUtils.CarePlanLocators;
import pixalere.pageObjectUtils.PixalereCommonUtils;
import pixalere.pageObjectUtils.PixalereStringPool;

public class PixalereClientCareGiverEducation extends PixalereCommonUtils {

	public static String CarePlan_problem_num;
	
	public static List<String> CareGiverInitiatedList  = new ArrayList<>();
	public static List<String> CareGiverCompleteList = new ArrayList<>();
	
	
	public void initiated_button_click2(String pattern) {

		String s1 = "((//*[@id='form']//div//div[contains(text(),'%s')]//following-sibling::div//div//button)[1])[contains(@onclick,'initiated')]";
		String xpath1 = String.format(s1, pattern);
		waitInterval(3);
		clickElement(By.xpath(xpath1));
		waitInterval(3);
		CareGiverInitiatedList.add(pattern);

	}
	
	public void completed_button_click2(String pattern) {

		String s1 = "((//*[@id='form']//div//div[contains(text(),'%s')]//following-sibling::div//div//button)[2])[contains(@onclick,'completed')]";
		String xpath1 = String.format(s1, pattern);
		waitInterval(3);
		clickElement(By.xpath(xpath1));
		waitInterval(3);
		CareGiverCompleteList.add(pattern);
	}
	
	public void enterInputFieldAsPerKey(String inputField) {
		switch (inputField)
		{
		case PixalereStringPool.PROBLEM_No_CarePlan:
			CarePlan_problem_num = JavaUtils.getRandomNumber(2);
			System.out.println(PixalereStringPool.PROBLEM_No_CarePlan+": "+CarePlan_problem_num);
			clear(CarePlanLocators.txt_problem_num);
			sendKeys(CarePlanLocators.txt_problem_num, CarePlan_problem_num);
			break;
			
			
		}
	}
}
