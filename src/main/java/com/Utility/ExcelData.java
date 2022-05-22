package com.Utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {
	
private XSSFWorkbook wb;
	
	public ExcelData() throws Exception {
		String excelpath= System.getProperty("user.dir")+"\\TestData\\Data.xlsx";
		File src = new File(excelpath);
		FileInputStream file = new FileInputStream(src);
		wb = new XSSFWorkbook(file);
		
	}
	
	public String getStringData(String sheetname, int row, int cell) {
		return wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
	}

}
