package pixalere.scripts;

import org.openqa.selenium.By;

import pixalere.pageObjectJavaUtils.JavaUtils;
import pixalere.pageObjectUtils.PixalereCommonUtils;
import pixalere.pageObjectUtils.PixalereStringPool;

public class PixalereIntakeOutputScriptsNursing extends PixalereCommonUtils {

	public static String IO_PO;
	public static String IO_Enteral;
	public static String IO_Void;
	public static String IOEmesis;
	public static String IO_DRAIN1;
	public static String IO_DRAIN2;
	public static String IO_DRAIN3;
	public static String Drain1_Location;
	public static String Drain2_Location;
	public static String Drain3_Location;
	public static String no_of_stool;
	public static String drp_drain1_Type;
	public static String drp_drain2_Type;
	public static String drp_drain3_Type;	
	public static String drp_stool_consistency;
	
	
	public void drp_select_Drain1_Type(String string1) {
		drp_drain1_Type = string1;
		selectByVisibleText(By.id("drain1_type"), string1);
	}
	
	public void drp_select_Drain2_Type(String string2) {
		drp_drain2_Type = string2;
		selectByVisibleText(By.id("drain2_type"), string2);
	}
	
	public void drp_select_Drain3_Type(String string3) {
		drp_drain3_Type = string3;
		selectByVisibleText(By.id("drain3_type"), string3);
	}
	
	public void drp_select_for_Stool_Consistency(String string3) {
		drp_stool_consistency = string3;
		selectByVisibleText(By.id("stool_consistency"), string3);
	}
	
	/*** Infusions ***/
	public void enterInputFieldAsPerKeyIntakeOutput(String inputField) {
		switch (inputField)
		{
		
		case PixalereStringPool.PO:
			IO_PO = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.PO+": "+IO_PO);
			clear(By.xpath("//*[@id='po']"));
			sendKeys(By.xpath("//*[@id='po']"), IO_PO);
			break;
			
		case PixalereStringPool.ENTERAL:
			IO_Enteral = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.ENTERAL+": "+ IO_Enteral);
			clear(By.id("enteral"));
			sendKeys(By.id("enteral"), IO_Enteral);
			break;
			
		case PixalereStringPool.VOID:
			IO_Void = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.VOID+": "+ IO_Void);
			clear(By.id("voided"));
			sendKeys(By.id("voided"), IO_Void);
			break;
			
		case PixalereStringPool.EMESIS:
			IOEmesis = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.EMESIS+": "+IOEmesis);
			clear(By.id("emesis"));
			sendKeys(By.id("emesis"), IOEmesis);
			break;
			
		case PixalereStringPool.IO_DRAIN1:
			IO_DRAIN1 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.IO_DRAIN1+": "+ IO_DRAIN1);
			clear(By.id("drain1"));
			sendKeys(By.id("drain1"), IO_DRAIN1);
			break;
	
		case PixalereStringPool.IO_DRAIN2:
			IO_DRAIN2 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.IO_DRAIN1+": "+ IO_DRAIN2);
			clear(By.id("drain2"));
			sendKeys(By.id("drain2"), IO_DRAIN2);
			break;
			
		case PixalereStringPool.IO_DRAIN3:
			IO_DRAIN3 = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.IO_DRAIN3 +": "+ IO_DRAIN3);
			clear(By.id("drain3"));
			sendKeys(By.id("drain3"), IO_DRAIN3);
			break;
			
		case PixalereStringPool.Drain1_Location:
			Drain1_Location = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.IO_DRAIN3 +": "+ Drain1_Location);
			clear(By.id("drain1_location"));
			sendKeys(By.id("drain1_location"), Drain1_Location);
			break;
			
		case PixalereStringPool.Drain2_Location:
			Drain2_Location = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.IO_DRAIN3 +": "+ Drain2_Location);
			clear(By.id("drain2_location"));
			sendKeys(By.id("drain2_location"), Drain2_Location);
			break;
			
		case PixalereStringPool.Drain3_Location:
			Drain3_Location = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.IO_DRAIN3 +": "+ Drain3_Location);
			clear(By.id("drain3_location"));
			sendKeys(By.id("drain3_location"), Drain3_Location);
			break;
			
		case PixalereStringPool.no_of_stool:
			no_of_stool = JavaUtils.getRandomNumber(1);
			System.out.println(PixalereStringPool.no_of_stool +": "+ no_of_stool);
			clear(By.id("stool_num"));
			sendKeys(By.id("stool_num"), no_of_stool);
			break;
			
		}

	}

}
