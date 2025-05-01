package com.orqangeHr.qa.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Utilities {
	
	public static final int IMPLICIT_WAIT_TIME=15;
	public static final int PAGE_LOAD_TIME=20;
	
	public static String generateRandomUser() {
		Date date = new Date();
		String timeStamp = date.toString().replace(" ", "_").replace(":", "_");
		return "User_"+timeStamp;
	}
	
	public static String generateRandomEmail() {
		Date date = new Date();
		String timeStamp = date.toString().replace(" ", "_").replace(":", "_");
		return "User_"+timeStamp+"@test.com";
	}
	
	
	public static  Object[][] getTestDataFromExcelSheet(String sheetName) {
//		1. "Apache POI Common" from  org.apache.poi » poi
//		2. "Apache POI API Based On OPC and OOXML Schemas" from  org.apache.poi » poi-ooxml
//		3. "poi-ooxml-schemas" from org.apache.poi » poi-ooxml-schemas
		XSSFWorkbook workBook = null;
		
		File filePath = new File(System.getProperty("user.dir")+"\\src\\main\\java\\com\\orqangeHr\\qa\\testData\\TestData.xlsx");
		
		try {
			FileInputStream fis = new FileInputStream(filePath);
			workBook = new XSSFWorkbook(fis); //Opened workbook
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		XSSFSheet sheet =	workBook.getSheet(sheetName); //Opened worksheet using sheet name
		
		int rows = sheet.getLastRowNum(); //number of rows
		 int columns =  sheet.getRow(0).getLastCellNum(); //number of columns
		 
//		 System.out.println("Number of rows : "+rows);
//		 System.out.println("Number of columns : "+columns);
		 Object[][] data = new Object[rows][columns];
		 
		 for(int i = 0; i<rows;i++) {
			 XSSFRow row = sheet.getRow(i+1); //we are in 2nd row by avoiding 1st row bcoz it is a headers
			 for(int j=0;j<columns;j++) {
				 XSSFCell  cell= row.getCell(j); //we are accessing each cell
				 CellType cellType = cell.getCellType(); //it identifies the datatype of cell value
				 
				 switch(cellType){
				 case STRING:  
					 data[i][j] = cell.getStringCellValue();
					 break;
				 case NUMERIC:
					 data[i][j] = Integer.toString((int)cell.getNumericCellValue());
					 break;
				 case BOOLEAN:
					 data[i][j] = cell.getBooleanCellValue();
					 break;
				 case BLANK:
					 data[i][j]="";
				 default:
					 data[i][j]="";
				 }
			 }
		 }
		return data;
		 
		 
		 
	}
	

}
