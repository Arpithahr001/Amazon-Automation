package com.qa.utility11;

	import java.io.FileInputStream;
	import java.io.IOException;

	import org.apache.poi.ss.usermodel.DataFormatter;
	import org.apache.poi.xssf.usermodel.XSSFCell;
	import org.apache.poi.xssf.usermodel.XSSFRow;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class ExcelUtility {
		public static FileInputStream Fileloc;
		public static XSSFWorkbook wbook;
		public static XSSFSheet wsheet;
		public static XSSFRow row;
		public static XSSFCell cell;

	//get rowcount;
		public static int getRowCount(String Xfile, String xSheet) throws IOException {
			Fileloc = new FileInputStream(Xfile);
			wbook = new XSSFWorkbook(Fileloc);
			wsheet = wbook.getSheet(xSheet);
			int rowCount = wsheet.getLastRowNum();
			wbook.close();
			Fileloc.close();
			return rowCount;
		}

	////get the cell count of each row
		public static int getCellCount(String Xfile, String xSheet, int rowNum) throws IOException {
			Fileloc = new FileInputStream(Xfile);
			wbook = new XSSFWorkbook(Fileloc);
			wsheet = wbook.getSheet(xSheet);
			row = wsheet.getRow(rowNum);
			int cellCount = row.getLastCellNum();
			wbook.close();
			Fileloc.close();
			return cellCount;
		}

	//get the value in each cell
		public static String getCellData(String Xfile, String xSheet, int rowNum, int cellNum) throws IOException {
			Fileloc = new FileInputStream(Xfile);
			wbook = new XSSFWorkbook(Fileloc);
			wsheet = wbook.getSheet(xSheet);
			row = wsheet.getRow(rowNum);
			cell = row.getCell(cellNum);
			DataFormatter formatter = new DataFormatter();
			String cellData = formatter.formatCellValue(cell);
			wbook.close();
			Fileloc.close();
			return cellData;
		}

	}
