package com.orangeHr.qa.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Utilities {	
	// when declared as final - none can change the value declared.
	public static final int IMPLICIT_WAIT_TIME = 20;  // whenever we use final keywork make the class name in all CAPS.
	public static final int PAGE_LOAD_TIME = 30;   

	public static String generateRandomUser() {
		Date date = new Date();
		String timeStamp = date.toString().replace(" ", "_").replace(":", "_");
		return "User_"+timeStamp;
	}

	public static String generateRandomEmailId() {
		Date date = new Date();
		String timeStamp = date.toString().replace(" ", "_").replace(":", "_");
		return "User_"+timeStamp+"@test.com";
	}

	public static Object[][] getTestDataFromExcelSheet(String sheetName) {

		//		1. Apache POI Common
		//		2. Apache POI API Based On OPC and OOXML Schemas
		//		3. Apache POI
		//		download these dependencies

		XSSFWorkbook workbook = null;		
		File filePath = new File(System.getProperty("user.dir")+"\\src\\main\\java\\com\\orangeHr\\qa\\testData\\TestData.xlsx"); 
		try {
			FileInputStream fis = new FileInputStream(filePath);
			workbook = new XSSFWorkbook(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}

		//		XSSFWorkbook workBook = new XSSFWorkbook();   // open the excel sheet - work book

		XSSFSheet sheet = workbook.getSheet(sheetName);// Opened the workbook / access the sheet using sheet name

		int rows= sheet.getLastRowNum();  // number of rows
		int columns=sheet.getRow(0).getLastCellNum();// number of columns

		//		System.out.println("Number of rows: "+rows);
		//		System.out.println("Number of columns: "+columns);
		Object[][] data = new Object[rows][columns];

		for(int i =0; i<rows; i++) {
			XSSFRow row=sheet.getRow(i+1);  // we are in 2nd row by avoiding 1st row because the 1st row is a header 
			for(int j=0; j<columns; j++) {
				XSSFCell cell = row.getCell(j); // we are accessing each cell
				CellType cellType = cell.getCellType();   // it identifies the data type of the cell data.

				switch(cellType) {
				case STRING:
					data[i][j]=cell.getStringCellValue();  // converting the cell value to the string
					break;	
				case NUMERIC:
					data[i][j]=Integer.toString((int)cell.getNumericCellValue());  // converting the cell value to the integer
					break;		
				case BOOLEAN:
					data[i][j]=cell.getBooleanCellValue();  // converting the cell value to the Boolean
					break;	
				case BLANK:
					data[i][j]="";  // assigning blank value to the cell
					break;	
				default:
					data[i][j]="";
				}
			}
		}
		return data;
	}
	
	public static Properties loadProperties(String filePath) {  // parameterized method

		Properties prop = new Properties(); // create obj of the Properties
		File file = new File(System.getProperty("user.dir")+"\\src\\main\\java\\com\\orangeHr\\qa\\"+filePath); 
		// Create obj for File - To store the file we need to give the file path
		try {
			FileInputStream fis = new FileInputStream(file);   // to read the data from the external file - config.properties
			prop.load(fis);      // all the data from config properties file will load here 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return prop; 
	}

//	public class ScreenshotUtility {
//
//		public static void takeScreenshot(WebDriver driver) {
//			TakesScreenshot screenshot = (TakesScreenshot)driver; 
//
//			File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
//
//			Random obj = new Random();
//			int randomNumber = obj.nextInt(1000);
//			System.out.println("RandomNumber: "+randomNumber);
//
//			try {
//				FileUtils.copyFile(srcFile, new File(System.getProperty("user.dir")+"\\ScreenShots\\"+testName+".png"));
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//
//		}
	
	//	public static JsonNode getJsonTestData() {
	//		JsonNode jsonNode = null;
	//		File filePath = new File(System.getProperty("user.dir")+"\\src\\main\\java\\com\\orangeHr\\qa\\testData\\TestData.json");
	//		
	//		ObjectMapper objMap = new ObjectMapper();
	//		// create a object for a ObjectMapper class
	//		try {
	//			objMap.readTree(filePath);
	//		} catch (IOException e) {
	//			e.printStackTrace();
	//		}
	//		return jsonNode;
	//	}

}
