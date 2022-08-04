package pixalere.scripts;
import org.openqa.selenium.By;

import pixalere.pageObjectJavaUtils.JavaUtils;
import pixalere.pageObjectUtils.PixalereCommonUtils;
import pixalere.pageObjectUtils.PixalereStringPool;
import pixalere.pageObjectUtils.LocatorUtils.CarePlanLocators;
import pixalere.pageObjectUtils.LocatorUtils.IntakeOutputLocators;

public class PixalereClientCareGiverEducation extends PixalereCommonUtils {

	public static String CarePlan_problem_num;
	
	
	
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
