package pixalere.scripts;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;

import pixalere.pageObjectJavaUtils.JavaUtils;
import pixalere.pageObjectUtils.LocatorUtils.OrdersPageLocators;
import pixalere.pageObjectUtils.PixalereCommonUtils;
import pixalere.pageObjectUtils.PixalereStringPool;

public class PixalereOrdersScripts extends PixalereCommonUtils {
	
	private static Map<String, String> orderRecordMap = new HashMap<String, String>();
	
	public void addOrderInputField(String field, String...value) {
		String inputVal = null;
		if(value.length > 0)
			inputVal=value[0];
		else
			inputVal = JavaUtils.getRandomString(10)+JavaUtils.getRandomNumber(5);
		System.out.println("inputVal: "+inputVal);
		
		switch (field) {
		case PixalereStringPool.PHYSICIAN_NAME:
			sendKeys(OrdersPageLocators.txt_PhysicianNameInput, inputVal);
			break;
			
		case PixalereStringPool.PROVIDERS_REPORT:
			sendKeys(OrdersPageLocators.txt_ProvidersReportInput, inputVal);
			break;
			
		case PixalereStringPool.REASON_FOR_MARKED_IN_ERROR:
			sendKeys(OrdersPageLocators.txt_FirstRecordErrorMarkedReasonInput, inputVal);
			break;
			
		case PixalereStringPool.TELEPHONE:
			sendKeys(OrdersPageLocators.txt_TelephoneInput, inputVal);
			inputVal = getAttribute(OrdersPageLocators.txt_TelephoneInput, "value");
			break;
			
		case PixalereStringPool.FAX:
			sendKeys(OrdersPageLocators.txt_FaxInput, inputVal);
			inputVal = getAttribute(OrdersPageLocators.txt_FaxInput, "value");
			break;
			
		case PixalereStringPool.ORDER_DATE:
			String day=null, month=null, year=null;
			day=JavaUtils.getReturnDate("Days", "Current");
			month=JavaUtils.getReturnDate("Month", "Current");
			year=JavaUtils.getReturnDate("Year", "Current");
			
			selectByVisibleText(OrdersPageLocators.drp_OrderDateDaysCalendarDropdown, day);
			selectByVisibleText(OrdersPageLocators.drp_OrderDateMonthsCalendarDropdown, month);
			clear(OrdersPageLocators.txt_OrderDateYearsCalendarInput);
			sendKeys(OrdersPageLocators.txt_OrderDateYearsCalendarInput, year);
			
			if(day.length()==1)
				day="0"+day;
			
			inputVal = day+"/"+month+"/"+year;
			break;
			
		case PixalereStringPool.ORDERS:
			sendKeys(OrdersPageLocators.txt_OrdersInput, inputVal);
			break;
		}
		waitInterval(1);
		orderRecordMap.put(field, inputVal);
		System.out.println("orderRecordMap: "+orderRecordMap);
	}
	
	public void clickOnFirstRecordDeleteButton(String button) {
		if(button.contains(PixalereStringPool.DELETE_MEDICAL_UPDATE_LETTER))
			clickElement(OrdersPageLocators.btn_FirstRecordDeleteMedicalUpdateLetterButton);
		else
			clickElement(OrdersPageLocators.btn_FirstRecordDeleteOrderButton);
	}
	
	public void verifySavedOrderHistoryRecord() {
		waitForCompletePageLoad();
		String actualVal=null;
		for (String mapKey : orderRecordMap.keySet()) {
			String expectedVal = orderRecordMap.get(mapKey);
			System.out.println(mapKey+" expectedVal: "+expectedVal);
			
			switch (mapKey) {
			case PixalereStringPool.PHYSICIAN_NAME:
				scrollAndhighLightElement(OrdersPageLocators.ele_PhysicianNameHistoryFirstRecord);
				actualVal = getElementText(OrdersPageLocators.ele_PhysicianNameHistoryFirstRecord).trim();
				break;
				
			case PixalereStringPool.PROVIDERS_REPORT:
				highLightElement(OrdersPageLocators.ele_ProvidersReportHistoryFirstRecord);
				actualVal = getElementText(OrdersPageLocators.ele_ProvidersReportHistoryFirstRecord).trim();
				break;
				
			case PixalereStringPool.TELEPHONE:
				highLightElement(OrdersPageLocators.ele_TelephoneHistoryFirstRecord);
				actualVal = getElementText(OrdersPageLocators.ele_TelephoneHistoryFirstRecord).trim();
				break;
				
			case PixalereStringPool.FAX:
				highLightElement(OrdersPageLocators.ele_FaxHistoryFirstRecord);
				actualVal = getElementText(OrdersPageLocators.ele_FaxHistoryFirstRecord).trim();
				break;
				
			case PixalereStringPool.ORDER_DATE:
				highLightElement(OrdersPageLocators.ele_OrderDateHistoryFirstRecord);
				actualVal = getElementText(OrdersPageLocators.ele_OrderDateHistoryFirstRecord).trim();
				break;
				
			case PixalereStringPool.ORDERS:
				highLightElement(OrdersPageLocators.ele_ProvidersReportHistoryFirstRecord);
				actualVal = getElementText(OrdersPageLocators.ele_ProvidersReportHistoryFirstRecord).trim();
				break;
			}
			System.out.println(mapKey+"actualVal: "+actualVal);
			
			Assert.assertTrue(mapKey+": "+actualVal +" != "+expectedVal, actualVal.contains(expectedVal));
			waitInterval(1);
		}
	}
	
	public void verifyDeletedOrderHistoryRecord() {
		waitForCompletePageLoad();
		String actualVal=null;
		for (String mapKey : orderRecordMap.keySet()) {
			String expectedVal = orderRecordMap.get(mapKey);
			System.out.println(mapKey+" expectedVal: "+expectedVal);
			
			switch (mapKey) {
			case PixalereStringPool.PHYSICIAN_NAME:
				scrollAndhighLightElement(OrdersPageLocators.ele_PhysicianNameDeletedHistoryFirstRecord);
				actualVal = getElementText(OrdersPageLocators.ele_PhysicianNameDeletedHistoryFirstRecord).trim();
				break;
				
			case PixalereStringPool.PROVIDERS_REPORT:
				highLightElement(OrdersPageLocators.ele_ProvidersReportDeletedHistoryFirstRecord);
				actualVal = getElementText(OrdersPageLocators.ele_ProvidersReportDeletedHistoryFirstRecord).trim();
				break;
				
			case PixalereStringPool.TELEPHONE:
				highLightElement(OrdersPageLocators.ele_TelephoneDeletedHistoryFirstRecord);
				actualVal = getElementText(OrdersPageLocators.ele_TelephoneDeletedHistoryFirstRecord).trim();
				break;
				
			case PixalereStringPool.FAX:
				highLightElement(OrdersPageLocators.ele_FaxDeletedHistoryFirstRecord);
				actualVal = getElementText(OrdersPageLocators.ele_FaxDeletedHistoryFirstRecord).trim();
				break;
				
			case PixalereStringPool.ORDER_DATE:
				highLightElement(OrdersPageLocators.ele_OrderDateDeletedHistoryFirstRecord);
				actualVal = getElementText(OrdersPageLocators.ele_OrderDateDeletedHistoryFirstRecord).trim();
				break;
				
			case PixalereStringPool.ORDERS:
				highLightElement(OrdersPageLocators.ele_ProvidersReportDeletedHistoryFirstRecord);
				actualVal = getElementText(OrdersPageLocators.ele_ProvidersReportDeletedHistoryFirstRecord).trim();
				break;
				
			case PixalereStringPool.REASON_FOR_MARKED_IN_ERROR:
				highLightElement(OrdersPageLocators.ele_ReasonForMarkedInErrorHistoryFirstRecord);
				actualVal = getElementText(OrdersPageLocators.ele_ReasonForMarkedInErrorHistoryFirstRecord).trim();
				break;
			}
			System.out.println(mapKey+"actualVal: "+actualVal);
			
			Assert.assertTrue(mapKey+": "+actualVal +" != "+expectedVal, actualVal.contains(expectedVal));
			waitInterval(1);
		}
	}
}