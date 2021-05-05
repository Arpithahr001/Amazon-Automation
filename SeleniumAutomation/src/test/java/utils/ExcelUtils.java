package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

class ExcelUtils {
	static String projectPath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	public static void main(String[] args) {
		//getRowCount();
		getCellData();
		
	}
	public static void getRowCount() {
		XSSFWorkbook workbook;
		try {
			String projectPath = System.getProperty("user.dir");
		 workbook = new XSSFWorkbook(projectPath+"\\excel\\data1.xlsx");
		sheet=workbook.getSheet("Sheet1");
		int rowcount=sheet.getPhysicalNumberOfRows();
		System.out.println(rowcount);
		}catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		
	}
	public static void getCellData() {
		try {
			String projectPath = System.getProperty("user.dir");
			 workbook = new XSSFWorkbook(projectPath+"\\excel\\data1.xlsx");
			sheet=workbook.getSheet("Sheet1");
		 
		String cellData=sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(cellData);
		}catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}

}
}