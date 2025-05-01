package com.orangeHr.qa.base;

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
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.orangeHr.qa.pages.AdminPage;
import com.orangeHr.qa.pages.HomePage;
import com.orangeHr.qa.pages.LoginPage;
import com.orangeHr.qa.utils.Utilities;

public class BaseClass {	
	private static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>() ;
	public Properties configProp;  // declared globally
	public Properties testDataProp; 
	public JsonNode jsonNode;
	public HomePage homePageObj;
	public AdminPage adminPageObj;
	public LoginPage loginPageObj;

	//created a constructor 
	public BaseClass() {
		configProp = loadProperties("configs\\configs.properties");
		testDataProp= loadProperties("testData\\testData.properties");
		jsonNode = getJsonTestData();
	}
	
	@AfterMethod
	public void tearDown() {
//		driver.quit();
		getDriver().quit();
		driver.remove();
		// clears the thread local variables, cleaning the driver objects
	}

	public static WebDriver getDriver() {
			return driver.get();
	}
	
	@BeforeMethod
	public void setUp() {
		//		loadPropertiesFile();   // removed it from here and added in Base class - Base constructor
		WebDriver webDriver = initializeBrowser(configProp.getProperty("browser"));
		driver.set(webDriver);
		this.loginPageObj = new LoginPage(webDriver);
		this.homePageObj = new HomePage(webDriver);
		this.adminPageObj = new AdminPage(webDriver);
		
	}

	public WebDriver initializeBrowser(String browserName) {
		//		loadPropertiesFile(); // no need of calling this line here.
		WebDriver driver = null;
		if(browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else if (browserName.equalsIgnoreCase("edge")) {
			driver = new FirefoxDriver();
		}else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new EdgeDriver();
		}else {
			System.out.println("No such browser found");
		}
		
		driver.get(configProp.getProperty("url"));
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Utilities.IMPLICIT_WAIT_TIME));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Utilities.PAGE_LOAD_TIME));

		return driver;		
	}

	//	public void loadTestPropertiesFile() {
	//		
	//		configProp = new Properties(); // create obj of the Properties
	//		File filePath = new File(System.getProperty("user.dir")+"\\src\\main\\java\\com\\orangeHr\\qa\\configs\\configs.properties"); 
	//		// Create obj for File - To store the file we need to give the file path
	//		System.out.println("Path of my Project is: "+System.getProperty("user.dir")+"\\src\\main\\java\\com\\orangeHr\\qa\\configs\\configs.properties");
	//		try {
	//			FileInputStream fis = new FileInputStream(filePath);   // to read the data from the external file - config.properties
	//			configProp.load(fis);      // all the data from config properties file will load here 
	//		} catch (Exception e) {
	//			e.printStackTrace();
	//		} 
	//	}
	//	
	//	public void loadTestDataPropertiesFile() {
	//		
	//		testDataProp = new Properties(); // create obj of the Properties
	//		File filePath = new File(System.getProperty("user.dir")+"\\src\\main\\java\\com\\orangeHr\\qa\\testData\\testData.properties"); 
	//		// Create obj for File - To store the file we need to give the file path
	//		try {
	//			FileInputStream fis = new FileInputStream(filePath);   // to read the data from the external file - config.properties
	//			testDataProp.load(fis);      // all the data from config properties file will load here 
	//		} catch (Exception e) {
	//			e.printStackTrace();
	//		} 
	//	}

	//	Re-factored the above 2 load properties in one as below:

	public Properties loadProperties(String filePath) {  // parameterized method

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


	public JsonNode getJsonTestData() {
		JsonNode jsonNode = null;
		File filePath = new File(System.getProperty("user.dir")+"\\src\\main\\java\\com\\orangeHr\\qa\\testData\\testData.json");

		ObjectMapper objMap = new ObjectMapper();
		// create a object for a ObjectMapper class
		try {
			jsonNode = objMap.readTree(filePath);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return jsonNode;
	}

}
