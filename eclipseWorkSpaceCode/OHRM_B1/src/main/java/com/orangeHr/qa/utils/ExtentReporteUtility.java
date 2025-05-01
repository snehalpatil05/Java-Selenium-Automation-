package com.orangeHr.qa.utils;

import java.io.File;
import java.util.Properties;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReporteUtility {
	
	public static ExtentReports generateExtentReport() {
		
//		ExtentReports is a 3rd party library
		ExtentReports extentReport = new ExtentReports();
//		Extent report file path
		File filePath = new File(System.getProperty("user.dir")+"\\ExtentReport\\extentReport.html");
		ExtentSparkReporter spark = new ExtentSparkReporter(filePath);
		
		spark.config().setTheme(Theme.STANDARD);
		spark.config().setReportName("Automation Result");
		spark.config().setDocumentTitle("OHRM Automation");
		spark.config().setTimeStampFormat("dd/mm/yyy hh:mm:ss");

//Attaching the spark object to extentReport using attachReporter method
		extentReport.attachReporter(spark);
		
		Properties configProp = Utilities.loadProperties("configs\\configs.properties");
		extentReport.setSystemInfo("Application url", configProp.getProperty("url"));
		extentReport.setSystemInfo("Browser Name", configProp.getProperty("browser"));
		extentReport.setSystemInfo("Test user", configProp.getProperty("username"));
		extentReport.setSystemInfo("Test Password", configProp.getProperty("password"));
		extentReport.setSystemInfo("OS Name", System.getProperty("os.name"));
		extentReport.setSystemInfo("System Username", System.getProperty("user.name"));
		extentReport.setSystemInfo("Java Version", System.getProperty("java.version"));

		return extentReport;
	}

}
