package pixalere.pageObjectJavaUtils;

import java.io.File;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import java.util.Random;

import org.junit.Assert;

import dataProviders.ConfigFileReader;
import pixalere.pageObjectUtils.SeleniumCommonUtils;

public class JavaUtils {

	private static final String charList = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";

	public static String getRandomNumber(int digCount) {
		StringBuilder sb = new StringBuilder(digCount);
		for (int i = 0; i < digCount; i++)
			sb.append((char) ('0' + (new Random().nextInt(9) + 1)));
		return sb.toString();
	}

	public static String getRandomString(int charCount) {

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < charCount; i++) {
			int randomNum = Integer.parseInt(getRandomNumber(1));
			char ch = charList.charAt(randomNum);
			sb.append(ch);
		}
		return sb.toString();
	}

	public static void compareMapList(Map<String, String> map1, Map<String, String> map2) {
		Assert.assertTrue(map1.size() + " != " + map2.size(), map1.size() == map2.size());
		for (String key : map1.keySet()) {
			if (map1.get(key).trim().equalsIgnoreCase(map2.get(key).trim()))
				System.out.println("Key: " + key + "Value: " + map2.get(key));
			else
				Assert.assertTrue(map1 + " :not Equals To: " + map2, false);
		}
	}

	public static String getDateInFormat(String date, String format, String expectedFormat) {
		DateFormat df = new SimpleDateFormat(expectedFormat);

		Date d = null;
		try {
			d = new SimpleDateFormat(format).parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return df.format(d);
	}

	public static String getCurrentDate(String format) {
		DateFormat dateFormat = new SimpleDateFormat(format);
		Date date = new Date();
		return dateFormat.format(date);
	}

	public static String getEpoch() {
		return getCurrentDate("yyMMddHHmmss");
	}

	public static String addDaysInCustomDate(String customDate, String dateFormat, int days) {

		SimpleDateFormat format = new SimpleDateFormat(dateFormat);
		Calendar cal = Calendar.getInstance();

		try {
			cal.setTime(format.parse(customDate));
		} catch (ParseException e) {
			e.printStackTrace();
		}

		cal.add(Calendar.DAY_OF_MONTH, days);
		return format.format(cal.getTime());
	}

	public static String getPastDateByAddingDays(String customDate, String dateFormat, int days) {

		SimpleDateFormat format = new SimpleDateFormat(dateFormat);
		Calendar cal = Calendar.getInstance();

		try {
			cal.setTime(format.parse(customDate));
		} catch (ParseException e) {
			e.printStackTrace();
		}

		cal.add(Calendar.DATE, -days);
		return format.format(cal.getTime());
	}

	public static String getAlphaCharForNumber(int i) {
		i = i - 1;
		String letter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".substring(i, i + 1);
		System.out.println("letter: " + letter);
		return letter;
	}

	public static void waitUntilFileIsDownloaded(String fileName) {
		new SeleniumCommonUtils().waitInterval(7);
		File directoryPath = new File(ConfigFileReader.getProperties("download.path"));
		String file = null;

		boolean flag = false;
		for (String fileContent : directoryPath.list()) {
			if (fileContent.contains(fileName)) {
				flag = true;
				System.out.println("File is available in Download Folder.." + fileContent);
				file = fileContent.replace(".crdownload", ".pdf");
				break;
			} else
				flag = false;
		}

		if (!flag)
			Assert.assertTrue("File is failed to Download.." + fileName, false);
		else {
			File actualFile = new File(ConfigFileReader.getProperties("download.path") + file);
			int counter = 1;
			while (!actualFile.exists()) {
				new SeleniumCommonUtils().waitInterval(1);
				System.out.println("File is Downloading inprogress.." + file);
				counter++;

				if (counter > 180)
					Assert.assertTrue("File is failed to Download...", false);
			}

			if (actualFile.exists()) {
				System.out.println("File is Downloaded Successfully..");
				Assert.assertTrue(true);
			} else
				Assert.assertTrue("file is not proper downloaded in 180 secs..", false);

		}
	}

	public static String getReturnDate(String dateVal, String currentNext) {
		String date = null, day = null, month = null, year = null;

		if (currentNext.contains("Next")) {
			date = JavaUtils.getCurrentDate("d-MMM-yyyy");
			date = JavaUtils.addDaysInCustomDate(date, "d-MMM-yyyy", 1);
		} else
			date = JavaUtils.getCurrentDate("d-MMM-yyyy");
		System.out.println("Date: " + date);

		if (dateVal.contains("Days")) {
			day = date.split("-")[0].trim();
			System.out.println("day: " + day);
			return day;
		} else if (dateVal.contains("Month")) {
			month = date.split("-")[1].trim();
			System.out.println("month: " + month);
			return month;
		} else if (dateVal.contains("Year")) {
			year = date.split("-")[2].trim();
			System.out.println("year: " + year);
			return year;
		} else
			return date;
	}

	public static String getCurrentDateTime(String format) {
		DateFormat dateFormat = new SimpleDateFormat(format);
		Date date = new Date();
		String dateTime = dateFormat.format(date);
		return dateTime;
	}

	public static void main(String[] args) {
		String date = getCurrentDateTime("MM/dd/yyyy");
		System.out.println(date);
	}
}
