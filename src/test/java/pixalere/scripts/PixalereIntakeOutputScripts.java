package pixalere.scripts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pixalere.pageObjectJavaUtils.JavaUtils;
import pixalere.pageObjectUtils.LocatorUtils.CustomizedLocators;
import pixalere.pageObjectUtils.LocatorUtils.IntakeOutputLocators;
import pixalere.pageObjectUtils.LocatorUtils.MedRatLocators;
import pixalere.pageObjectUtils.LocatorUtils.MedicationManagementPageLocators;
import pixalere.pageObjectUtils.PixalereCommonUtils;
import pixalere.pageObjectUtils.PixalereStringPool;

public class PixalereIntakeOutputScripts extends PixalereCommonUtils {
	
	private static Map<String, String> medicationRecordMap = new HashMap<String, String>();
	private List<String> solutionNameDropdownList = new ArrayList<String>();
	
	public static String IOEmesis;
	public static String IOFluid;
	public static String IOSolid;
	public static String IOH2O;
	public static String IO_Other;
	public static String IOWater;
	public static String IOFormula;
	public static String IOWaterBolus;
	public static String IOVolDel;
	public static String IOVolInfused;
	public static String IOFlushVol;
	public static String IOTotalVol;
	public static String IORate;
	public static String IOFormulaName;
	
	public static String IOVoidVOl;
	public static String IOWeTDiapers;
	public static String IOOstomy;
	public static String IODrain1;
	public static String IODrainLocation1;
	public static String IODrain2;
	public static String IODrainLocation2;
	public static String IODrain3;
	public static String IODrainLocation3;
	public static String IONumStool;
	
	private static WebDriver driver = null;
	public static String timeIO;
	public static String DayIO;
	public static String MonthIO;
	public static String YearIO;
	public static String MedRatDeletion;

	
	/*** eMar ***/
	
	public void saveIntakeOutput() {
		clickElement(By.xpath("//div[@id='saveEntries']"));	
		
		clickElement(By.xpath("//button[@id='confirm']"));
		System.out.println();
		
	}
	
	public void verifyMedicationManagementSection(String section) {
		waitUntilElementIsDisplayed(CustomizedLocators.getMedicationManagementSectionByValue(section));
		highLightElement(CustomizedLocators.getMedicationManagementSectionByValue(section));
		waitInterval(1);
		Assert.assertTrue(section+": is failed to displayed..", isDisplayed(CustomizedLocators.getMedicationManagementSectionByValue(section)));
	}
	
	
	
	public void selectIntakeOutputCheckobx(String field) {	
		if(field.contains("Fluid"))
			clickElementWithJQuery(IntakeOutputLocators.chk_fluid);
		
		else if(field.contains("Solid"))
			clickElementWithJQuery(IntakeOutputLocators.chk_solid);
		
		else if(field.contains("H2O"))
			clickElementWithJQuery(IntakeOutputLocators.chk_H2O);
		
		else if(field.contains("Other"))
			clickElementWithJQuery(IntakeOutputLocators.chk_other);
		
		else if(field.contains("Water"))
			clickElementWithJQuery(IntakeOutputLocators.chk_water);
		
		else
			System.out.println("Incorrect Input Entries for Checkbox");	
		
		System.out.println();
	}
	
	private String getReturnDate(String dateVal, String currentNext) {
		String date=null, day=null, month=null, year=null;
		
		if(currentNext.contains("Next")) {
			date = JavaUtils.getCurrentDate("d-MMM-yyyy");
			date = JavaUtils.addDaysInCustomDate(date, "d-MMM-yyyy", 1);
		}
		else
			date = JavaUtils.getCurrentDate("d-MMM-yyyy");
		System.out.println("Date: "+date);
		
		if(dateVal.contains("Days")) {
			day = date.split("-")[0].trim();
			System.out.println("day: "+day);
			return day;
		}
		else if(dateVal.contains("Month")) {
			month = date.split("-")[1].trim();
			System.out.println("month: "+month);
			return month;
		}
		else if(dateVal.contains("Year")) {
			year = date.split("-")[2].trim();
			System.out.println("year: "+year);
			return year;
		}
		else
			return date;
	}
	
	/*** BPMH ***/
		
	public void addMedicationRecordForBPMH(String field, String...value) {
		String inputVal = null;
		if(value.length > 0)
			inputVal=value[0];
		else
			inputVal = JavaUtils.getRandomString(10)+JavaUtils.getRandomNumber(5);
		System.out.println("inputVal: "+inputVal);
		
		switch (field) {
		case PixalereStringPool.MEDICATION_NAME:
			clear(MedicationManagementPageLocators.txt_BPMHMedicationNameInput);
			sendKeys(MedicationManagementPageLocators.txt_BPMHMedicationNameInput, inputVal);
			break;
			
		case PixalereStringPool.DOSE:
			clear(MedicationManagementPageLocators.txt_BPMHDoseInput);
			sendKeys(MedicationManagementPageLocators.txt_BPMHDoseInput, inputVal);
			break;
			
		case PixalereStringPool.ROUTE:
			selectByVisibleText(MedicationManagementPageLocators.drp_BPMHRouteDropdown, inputVal);
			break;
			
		case PixalereStringPool.FREQUENCY:
			selectByVisibleText(MedicationManagementPageLocators.drp_BPMHFrequencyDropdown, inputVal);
			break;
			
			
		}
		waitInterval(1);
		medicationRecordMap.put(field, inputVal);
		System.out.println("medicationRecordMap: "+medicationRecordMap);
	}
	
	public void selectMultiCheckList(String field, String checkList) {
		medicationRecordMap.put(field, checkList);
		for (String checkbox : checkList.split(",")) {
			waitIntervalByHalf(1);
			clickElementWithJQuery(CustomizedLocators.getLabelElementByValue(checkbox.trim()));
		}
	}
	
	public void selectRadioOption(String field, String radioVal) {
		waitIntervalByHalf(1);
		clickElement(CustomizedLocators.getRadioLabelElementByValue(radioVal));
		
		medicationRecordMap.put(field, radioVal);
		System.out.println("medicationRecordMap: "+medicationRecordMap);
	}
	
	public void selectRadioOptionFromSection_io_emesis(String section) {
		clickElement(CustomizedLocators.getRadioOptionFor_io_emesis(section));
	}

	public void selectRadioOptionFromSection_io_enteral(String section) {
		clickElement(CustomizedLocators.getRadioOptionFor_io_enteral(section));
	}
	
	public void selectRadioOptionFromSection_io_TubeType_field(String section) {
		clickElement(CustomizedLocators.getRadioOptionFor_io_TypeField(section));
	}
	
	public void selectRadioOptionFromSection_io_SafetyCheck_field(String section) {
		clickElement(CustomizedLocators.getRadioOptionFor_io_SafetyCheck(section));
	}
	
	public void selectRadioOptionFromSection_io_TubePlacementVerified_field(String section) {
		clickElement(CustomizedLocators.getRadioOptionFor_io_TubePlacement(section));
	}
	
	public void selectRadioOptionFromSection_io_Void_field(String section) {
		clickElement(CustomizedLocators.getRadioOptionFor_io_voidfield(section));
	}
	
	public void selectRadioOptionFromSection_io_stool_field(String section) {
		clickElement(CustomizedLocators.getRadioOptionFor_io_stoolfield(section));
	}
	
	public void selectRadioOptionFromSection_io_stool_Consistency_field(String section) {
		clickElement(CustomizedLocators.getRadioOptionFor_io_stool_consistency_field(section));
	}
		
	public void selectRadioOptionFromSection_io_ostomy_field(String section) {
		clickElement(CustomizedLocators.getRadioOptionFor_io_ostomyfield(section));
	}
	
	public void selectRadioOptionFromSection_io_drain_field(String section) {
		clickElement(CustomizedLocators.getRadioOptionFor_io_drainfield(section));
	}
	
	public void selectRadioOptionFromSection_io_drain_type1_field(String section) {
		clickElement(CustomizedLocators.getRadioOptionFor_io_drainType1field(section));
	}
	
	public void selectRadioOptionFromSection_io_drain_type2_field(String section) {
		clickElement(CustomizedLocators.getRadioOptionFor_io_drainType2field(section));
	}
	
	public void selectRadioOptionFromSection_io_drain_type3_field(String section) {
		clickElement(CustomizedLocators.getRadioOptionFor_io_drainType3field(section));
	}
	
	
	
	
	
		
	
	
	/*** Infusions ***/
	public void enterInputFieldAsPerKey(String inputField) {
		switch (inputField)
		{
		case PixalereStringPool.EMESIS:
			IOEmesis = JavaUtils.getRandomNumber(2);
			System.out.println(PixalereStringPool.EMESIS+": "+IOEmesis);
			clear(IntakeOutputLocators.txt_emesis_yes_ml);
			sendKeys(IntakeOutputLocators.txt_emesis_yes_ml, IOEmesis);
			break;
			
		case PixalereStringPool.FLUID:
			IOFluid = JavaUtils.getRandomNumber(2);
			System.out.println(PixalereStringPool.FLUID+": "+IOFluid);
			clear(IntakeOutputLocators.txt_fluid);
			sendKeys(IntakeOutputLocators.txt_fluid, IOFluid);
			break;
			
		case PixalereStringPool.IO_SOLID:
			IOSolid = JavaUtils.getRandomNumber(2);
			System.out.println(PixalereStringPool.IO_SOLID+": "+IOSolid);
			clear(IntakeOutputLocators.txt_solid);
			sendKeys(IntakeOutputLocators.txt_solid, IOSolid);
			break;
		
		case PixalereStringPool.H2O:
			IOH2O = JavaUtils.getRandomNumber(2);
			System.out.println(PixalereStringPool.H2O+": "+ IOH2O);
			clear(IntakeOutputLocators.txt_H2O);
			sendKeys(IntakeOutputLocators.txt_H2O, IOH2O);
			break;
			
		case PixalereStringPool.IO_OTHER:
			IO_Other = JavaUtils.getRandomNumber(2);
			System.out.println(PixalereStringPool.IO_OTHER+": "+ IO_Other);
			clear(IntakeOutputLocators.txt_other);
			sendKeys(IntakeOutputLocators.txt_other, IO_Other);
			break;
			
		case PixalereStringPool.IO_WATER:
			IOWater = JavaUtils.getRandomNumber(2);
			System.out.println(PixalereStringPool.IO_WATER+": "+ IOWater);
			clear(IntakeOutputLocators.txt_water);
			sendKeys(IntakeOutputLocators.txt_water, IOWater);
			break;
			
		case PixalereStringPool.IO_FORMULA:
			IOFormula = JavaUtils.getRandomNumber(2);
			System.out.println(PixalereStringPool.IO_FORMULA+": "+ IOFormula);
			clear(IntakeOutputLocators.txt_Formula);
			sendKeys(IntakeOutputLocators.txt_Formula, IOFormula);
			break;
			
		case PixalereStringPool.IO_WATER_BOLUS:
			IOWaterBolus = JavaUtils.getRandomNumber(2);
			System.out.println(PixalereStringPool.IO_WATER_BOLUS+": "+ IOWaterBolus);
			clear(IntakeOutputLocators.txt_Water_Bolus);
			sendKeys(IntakeOutputLocators.txt_Water_Bolus, IOWaterBolus);
			break;
		
		case PixalereStringPool.IO_VOL_DELIVERED:
			IOVolDel = JavaUtils.getRandomNumber(2);
			System.out.println(PixalereStringPool.IO_VOL_DELIVERED+": "+ IOVolDel);
			clear(IntakeOutputLocators.txt_Vol_Delivered);
			sendKeys(IntakeOutputLocators.txt_Vol_Delivered, IOVolDel);
			break;
			
		case PixalereStringPool.IO_VOL_INFUSED:
			IOVolInfused = JavaUtils.getRandomNumber(2);
			System.out.println(PixalereStringPool.IO_VOL_INFUSED+": "+ IOVolInfused);
			clear(IntakeOutputLocators.txt_Vol_Infused);
			sendKeys(IntakeOutputLocators.txt_Vol_Infused, IOVolInfused);
			break;
			
		case PixalereStringPool.IO_FLUSH_VOL:
			IOFlushVol = JavaUtils.getRandomNumber(2);
			System.out.println(PixalereStringPool.IO_FLUSH_VOL+": "+ IOFlushVol);
			clear(IntakeOutputLocators.txt_Flush_Vol);
			sendKeys(IntakeOutputLocators.txt_Flush_Vol, IOFlushVol);
			break;
			
		/*case PixalereStringPool.IO_TOTAL_VOL:
			IOTotalVol = JavaUtils.getRandomNumber(2);
			System.out.println(PixalereStringPool.IO_TOTAL_VOL+": "+ IOTotalVol);
			clear(IntakeOutputLocators.txt_total_vol);
			sendKeys(IntakeOutputLocators.txt_total_vol, IOTotalVol);
			break; */
			
		case PixalereStringPool.IO_RATE:
			IORate = JavaUtils.getRandomNumber(2);
			System.out.println(PixalereStringPool.IO_RATE+": "+ IORate);
			clear(IntakeOutputLocators.txt_rate);
			sendKeys(IntakeOutputLocators.txt_rate, IORate);
			break;
			
		case PixalereStringPool.IO_FORMULA_NAME:
			IOFormulaName = JavaUtils.getRandomNumber(2);
			System.out.println(PixalereStringPool.IO_FORMULA_NAME+": "+ IOFormulaName);
			clear(IntakeOutputLocators.txt_formula_name);
			sendKeys(IntakeOutputLocators.txt_formula_name, IOFormulaName);
			break;
			
		case PixalereStringPool.IO_VOID_VOL:
			IOVoidVOl = JavaUtils.getRandomNumber(2);
			System.out.println(PixalereStringPool.IO_VOID_VOL+": "+ IOVoidVOl);
			clear(IntakeOutputLocators.txt_void_vol);
			sendKeys(IntakeOutputLocators.txt_void_vol, IOVoidVOl);
			break;
			
		case PixalereStringPool.IO_No_of_WET_Diapers:
			IOWeTDiapers = JavaUtils.getRandomNumber(2);
			System.out.println(PixalereStringPool.IO_No_of_WET_Diapers+": "+ IOWeTDiapers);
			clear(IntakeOutputLocators.txt_number_of_wet_diapers);
			sendKeys(IntakeOutputLocators.txt_number_of_wet_diapers, IOWeTDiapers);
			break;
			
		case PixalereStringPool.IO_OSTOMY:
			IOOstomy = JavaUtils.getRandomNumber(2);
			System.out.println(PixalereStringPool.IO_OSTOMY+": "+ IOOstomy);
			clear(IntakeOutputLocators.txt_ostomy);
			sendKeys(IntakeOutputLocators.txt_ostomy, IOOstomy);
			break;
			
		case PixalereStringPool.IO_DRAIN1:
			IODrain1 = JavaUtils.getRandomNumber(2);
			System.out.println(PixalereStringPool.IO_DRAIN1+": "+ IODrain1);
			clear(IntakeOutputLocators.txt_drain1);
			sendKeys(IntakeOutputLocators.txt_drain1, IODrain1);
			break;
			
		case PixalereStringPool.IO_DRAIN_LOCATION1:
			IODrainLocation1 = JavaUtils.getRandomString(8);
			System.out.println(PixalereStringPool.IO_DRAIN_LOCATION1+": "+ IODrainLocation1);
			clear(IntakeOutputLocators.txt_drain_location1);
			sendKeys(IntakeOutputLocators.txt_drain_location1, IODrainLocation1);
			break;
			
		case PixalereStringPool.IO_DRAIN2:
			IODrain2 = JavaUtils.getRandomNumber(2);
			System.out.println(PixalereStringPool.IO_DRAIN2+": "+ IODrain2);
			clear(IntakeOutputLocators.txt_drain2);
			sendKeys(IntakeOutputLocators.txt_drain2, IODrain2);
			break;
			
		case PixalereStringPool.IO_DRAIN_LOCATION2:
			IODrainLocation2 = JavaUtils.getRandomString(8);
			System.out.println(PixalereStringPool.IO_DRAIN_LOCATION2+": "+ IODrainLocation2);
			clear(IntakeOutputLocators.txt_drain_location2);
			sendKeys(IntakeOutputLocators.txt_drain_location2, IODrainLocation2);
			break;
			
		case PixalereStringPool.IO_DRAIN3:
			IODrain3 = JavaUtils.getRandomNumber(2);
			System.out.println(PixalereStringPool.IO_DRAIN3+": "+ IODrain3);
			clear(IntakeOutputLocators.txt_drain3);
			sendKeys(IntakeOutputLocators.txt_drain3, IODrain3);
			break;
			
		case PixalereStringPool.IO_DRAIN_LOCATION3:
			IODrainLocation3 = JavaUtils.getRandomString(8);
			System.out.println(PixalereStringPool.IO_DRAIN_LOCATION3+": "+ IODrainLocation3);
			clear(IntakeOutputLocators.txt_drain_location3);
			sendKeys(IntakeOutputLocators.txt_drain_location3, IODrainLocation3);
			break;
			
		case PixalereStringPool.IO_Number_of_Stool:
			IONumStool = JavaUtils.getRandomNumber(2);
			System.out.println(PixalereStringPool.IO_Number_of_Stool+": "+ IONumStool);
			clear(IntakeOutputLocators.txt_stool_num);
			sendKeys(IntakeOutputLocators.txt_stool_num, IONumStool);
			break;
	
		case PixalereStringPool.MedRatDelete:
			MedRatDeletion = JavaUtils.getRandomString(5);
			System.out.println(PixalereStringPool.MedRatDelete+": "+ MedRatDeletion);
			clear(MedRatLocators.txt_reason_delete);
			sendKeys(MedRatLocators.txt_reason_delete, MedRatDeletion);
			break;
			
			
			
		}
	
	
	

	
	
	}
	

}
