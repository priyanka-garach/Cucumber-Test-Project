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
	public static String drp_History_of_Fall;
	public static String drp_Cogntive_impairment;
	public static String drp_Taking_four_more_medications;
	public static String Details_for_History_of_Fall;
	public static String Details_for_Cogntive_impairment;
	public static String Details_for_Taking_4_or_more_medications;
	
	
	public static List<String> chk_Referrals_for_History_of_Fall_FallRisk = new ArrayList<String>();
	public static List<String> chk_Referrals_for_Cogntive_impairment_FallRisk = new ArrayList<String>();
	public static List<String> chk_Referrals_rx_four_Taking_or_more_medications_FallRisk = new ArrayList<String>();
	 

	public void chk_Education_FallRisk(String value) {
		chk_Education_FallRisk = value;
		clickElementWithJQuery(By.xpath("(//td[contains(text(),'History of Fall')]/parent::*//td//input//following-sibling::label)[1]"));
		clickElementWithJQuery(By.xpath("//td[contains(text(),'History of Fall')]//following-sibling::td//label[contains(@for,'edu')]"));
	}
	
	public void chk_Education_Cogntive_impairment(String value) {
		chk_Education_Cogntive_impairment = value;
		clickElementWithJQuery(By.xpath("(//td[contains(text(),'Cogntive impairment')]/parent::*//td//input//following-sibling::label)[1]"));
		clickElementWithJQuery(By.xpath("//td[contains(text(),'Cogntive impairment')]//following-sibling::td//label[contains(@for,'edu')]"));
	}
	
	public void chk_Education_Taking_4_or_more_medications(String value) {
		Wait_p(2);
		chk_Education_Cogntive_impairment = value;
		clickElementWithJQuery(By.xpath("(//td[contains(text(),'Taking 4 or more medications')]/parent::*//td//input//following-sibling::label)[1]"));
		Wait_p(2);
		clickElementWithJQuery(By.xpath("//td[contains(text(),'Taking 4 or more medications')]//following-sibling::td//label[contains(@for,'edu')]"));
	}
	
	public void chk_Referrals_rx_for_History_of_Fall_FallRisk(String value) {
		clickElementWithJQuery(By.xpath("//td[contains(text(),'History of Fall')]//following::td[3]//input//following-sibling::label"));
		chk_Referrals_for_History_of_Fall_FallRisk.add(value);
	}
	
	public void chk_Referrals_rx_for_Cogntive_impairment_FallRisk(String value) {
		Wait_p(2);
		clickElementWithJQuery(By.xpath("//td[contains(text(),'Cogntive impairment')]//following::td[3]//input//following-sibling::label"));
		chk_Referrals_for_Cogntive_impairment_FallRisk.add(value);
	}
	
	public void chk_Referrals_rx_four_Taking_or_more_medications_FallRisk(String value) {
		Wait_p(2);
		clickElementWithJQuery(By.xpath("//td[contains(text(),'Taking 4 or more medications')]//following::td[3]//input//following-sibling::label"));
		chk_Referrals_rx_four_Taking_or_more_medications_FallRisk.add(value);
	}
	
	public void drp_History_of_Fall(String value) {
		drp_History_of_Fall = value;
		int ans = Integer.parseInt(drp_History_of_Fall);
		select_ByIndex(By.xpath("(//*[contains(@id,'handouts')])[1]"), ans-1);
	}
	
	public void drp_Cogntive_impairment(String value) {
		drp_Cogntive_impairment = value;
		int ans = Integer.parseInt(drp_Cogntive_impairment);
		select_ByIndex(By.xpath("(//*[contains(@id,'handouts')])[5]"), ans-1);
	}
	
	public void drp_Taking_four_more_medications(String value) {
		drp_Taking_four_more_medications = value;
		int ans = Integer.parseInt(drp_Taking_four_more_medications);
		select_ByIndex(By.xpath("(//*[contains(@id,'handouts')])[7]"), ans-1);
	}
	
	public void enterInputFieldAsPerKeyFallRisk(String inputField) {
		switch (inputField) {
		case PixalereStringPool.Details_for_History_of_Fall:
			Details_for_History_of_Fall = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Details_for_History_of_Fall + ": " + Details_for_History_of_Fall);
			clear(By.xpath("//td[contains(text(),'History of Fall')]//following::td[4]//*"));
			sendKeys(By.xpath("//td[contains(text(),'History of Fall')]//following::td[4]//*"), Details_for_History_of_Fall);
			break;

		case PixalereStringPool.Details_for_Cogntive_impairment:
			Details_for_Cogntive_impairment = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Details_for_Cogntive_impairment + ": " + Details_for_Cogntive_impairment);
			clear(By.xpath("//td[contains(text(),'Cogntive impairment')]//following::td[4]//*"));
			sendKeys(By.xpath("//td[contains(text(),'Cogntive impairment')]//following::td[4]//*"), Details_for_Cogntive_impairment);
			break;
			
		case PixalereStringPool.Details_for_Taking_4_or_more_medications:
			Details_for_Taking_4_or_more_medications = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.Details_for_Taking_4_or_more_medications + ": " + Details_for_Taking_4_or_more_medications);
			clear(By.xpath("//td[contains(text(),'Taking 4 or more medications')]//following::td[4]//*"));
			sendKeys(By.xpath("//td[contains(text(),'Taking 4 or more medications')]//following::td[4]//*"), Details_for_Taking_4_or_more_medications);
			break;

		}
	}
}
