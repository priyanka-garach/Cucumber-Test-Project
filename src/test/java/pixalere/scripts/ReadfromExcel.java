package pixalere.scripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.URI;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;

public class ReadfromExcel {
	public static HSSFWorkbook workbook;
	public static HSSFSheet sheet;
	public static HSSFCell cell;
	public static HSSFRow row;

	public static void main(String[] args) {
		/*String pt_id = getUnusedPatientId(
				"D:\\PIxalere\\pixalere_dp\\src\\Patients.xls", "Patients");
		System.out.println(pt_id); */
		
		String pt_id = getUnusedPatientId("pt_patients_for_Automation.xls", "pt_patients_for_Automation");
		System.out.println(pt_id);
		
		String ot_id = getUnusedPatientId("ot_patients_for_Automation.xls",
				"ot_patients_for_Automation");
		System.out.println(ot_id);

			}

	private static String getUnusedPatientId(String fileName, String sheetName) {
		String result = "";
		int rows = getRowCount(fileName, sheetName);
		for (int i = 1; i <= rows; i++) {
			String status = getCellData(fileName, sheetName, i, 2);
			if (!status.equalsIgnoreCase("Used")) {
				result = getCellData(fileName, sheetName, i, 0);
				System.out.println("#### Unused Patient Id : " + result + " ####");
				setCellData(fileName, sheetName, i, 2, "Used");
				break;
			}
		}
		return result;
	}

	public static void setCellData(String fileName, String sheetName, int RowNum, int ColNum, String Results) {
		File file = new File(fileName);
		try {
			int rows = getRowCount(fileName, sheetName);
			if (rows < RowNum)
				cell = sheet.createRow(RowNum).createCell(ColNum);
			else
				cell = sheet.getRow(RowNum).createCell(ColNum);
			cell.setCellValue(Results);
			FileOutputStream Outputstream = new FileOutputStream(file.getAbsolutePath());
			workbook.write(Outputstream);
			Outputstream.flush();
			Outputstream.close();
			System.out.println(
					"==============================================================================================");
			System.out.println("Row : " + RowNum + "| Column : " + ColNum + " | Updated Content : " + Results);
			System.out.println(
					"==============================================================================================");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings({ "deprecation" })
	public static String getCellData(String fileName, String sheetName, int RowNum, int ColNum) {
		String cellData;
		// DataFormatter dataFormatter = new DataFormatter();
		try {
			setExcelFile(fileName, sheetName);
			cell = sheet.getRow(RowNum).getCell(ColNum);
			if (cell.getCellType() == CellType.NUMERIC)
				cellData = String.valueOf((int) cell.getNumericCellValue());
			else if (cell.getCellType() == CellType.BOOLEAN)
				cellData = String.valueOf(cell.getBooleanCellValue());
			// else if (HSSFDateUtil.isCellDateFormatted(cell))
			// cellData = dataFormatter.formatCellValue(cell);
			else
				cellData = cell.getStringCellValue();
			return cellData;
		} catch (Exception e) {
			return "";
		}
	}

	public static int getRowCount(String fileName, String sheetName) {
		try {
			setExcelFile(fileName, sheetName);
			int RowCount = sheet.getLastRowNum();
			return RowCount;
		} catch (Exception e) {
			return 0;
		}
	}

	public static void setExcelFile(String fileName, String sheetName) {
		File file = new File(fileName);
		try {
			FileInputStream ExcelFile = new FileInputStream(file.getAbsolutePath());
			workbook = new HSSFWorkbook(ExcelFile);
			sheet = workbook.getSheet(sheetName);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
