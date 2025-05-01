package com.orqangeHr.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.orqangeHr.qa.utils.Utilities;

public class Base {
	WebDriver driver;
	public Properties configProp;
	public Properties testDataProp;

	public Base(){
		configProp = loadProperties("configs\\config.properties");
		testDataProp = loadProperties("testData\\testData.properties");	
	}

	public WebDriver initliazeBrowser(String browserName) {
		if(browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}else if(browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}else {
			System.out.println("No such browser");
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Utilities.IMPLICIT_WAIT_TIME));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Utilities.PAGE_LOAD_TIME));
		driver.get(configProp.getProperty("url"));
		return driver;

	}

//	public void loadConfigPropertiesFile() {
//
//		configProp = new Properties();
//		File filePath = new File(System.getProperty("user.dir")+"\\src\\main\\java\\com\\orqangeHr\\qa\\configs\\config.properties");
//		try {
//			FileInputStream fis = new FileInputStream(filePath);
//			configProp.load(fis);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
//
//
//	}
//	
//	public void loadTestDataPropertiesFile() {
//
//		testDataProp = new Properties();
//		File filePath = new File(System.getProperty("user.dir")+"\\src\\main\\java\\com\\orqangeHr\\qa\\testData\\testData.properties");
//		try {
//			FileInputStream fis = new FileInputStream(filePath);
//			testDataProp.load(fis);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
//
//	}
	
	public Properties loadProperties(String filePath) {
		
		Properties prop = new Properties();
		File file = new File(System.getProperty("user.dir")+"\\src\\main\\java\\com\\orqangeHr\\qa\\"+filePath);
		try {
			FileInputStream fis = new FileInputStream(file);
			prop.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return prop;
	}

}
