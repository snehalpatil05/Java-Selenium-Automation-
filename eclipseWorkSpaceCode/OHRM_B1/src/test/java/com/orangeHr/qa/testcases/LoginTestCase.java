package com.orangeHr.qa.testcases;

import java.time.Duration;
import java.util.Date;
import java.util.Properties;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.fasterxml.jackson.databind.JsonNode;
import com.orangeHr.qa.base.BaseClass;
import com.orangeHr.qa.pages.HomePage;
import com.orangeHr.qa.pages.LoginPage;
import com.orangeHr.qa.utils.Utilities;

public class LoginTestCase extends BaseClass{

	WebDriver driver;	
//	LoginPage loginPageObj;
//	HomePage homePageObj;
//	WebDriverWait wait;
	
	LoginTestCase(){
		super();
	}	
	// setUp --> LoginWithValidCredentials--> tearDown
	// setUp --> LoginWithInValidCredentials--> tearDown

//	Moving tearDown and the setUp method to Base class
//	@AfterMethod
//	public void tearDown() {
//		driver.quit();
//	}
//
//	@BeforeMethod
//	public void setUp() {
//		//		loadPropertiesFile(); // removed it from here and added in Base class - Base constructor
//		driver = initializeBrowser(configProp.getProperty("browser"));
//		loginPageObj = new LoginPage(driver);
//		homePageObj = new HomePage(driver);
//	}

	//	// Reading data from dataprovider with hardcoded data	
	//		@DataProvider(name="validLoginCredentialData")   // it provides the data to test
	//		public Object[][] getDataFromExcel(){ 				// created 2 Dimensional obj
	//			Object[][] data = { {"Admin" , "admin123"},  
	//								{"Admin1", "admin1234567"}, 
	//								{"Admin2", "admin12345678"},
	//			};
	//			return data;
	//		}

	// Reading data from data provider with Excel sheet data	
//	@DataProvider(name="validLoginCredentialData")   // it provides the data to test
//	public Object[][] getLoginDataFromExcel(){ 				// created 2 Dimensional obj
//		Object[][] data = Utilities.getTestDataFromExcelSheet("Login Test Data");
//		return data;
//	}

//	@Test(dataProvider="validLoginCredentialData")
//	public void loginWithValidCredentialUsingDataProvider(String username, String password) {
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		boolean dropdownVisibleStatus = driver.findElement(By.xpath("//li[@class='oxd-userdropdown']")).isDisplayed();
//		Assert.assertTrue(dropdownVisibleStatus, "Login Functionality Failed :");
//	}

	//JSON FILE
//	@Test
//	public void loginWithValidCredentialUsingJsonFile(String username, String password) {
//
//		JsonNode jsonData = jsonNode.get("loginWithValidCredentialUsingJsonFile");
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(jsonData.get("username").asText());
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(jsonData.get("password").asText());
//		driver.findElement(By.xpath("//button[@type='submit']")).click();

//		boolean dropdownVisibleStatus = homePageObj.isAccountDropdownVisible();
//		Assert.assertTrue(dropdownVisibleStatus, jsonData.get("assertionMsg").asText());
//	}
	
	//	@Test(priority=0)
//	public void loginWithValidCredential() {
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(configProp.getProperty("username"));
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(configProp.getProperty("password"));
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		boolean dropdownVisibleStatus = driver.findElement(By.xpath("//li[@class='oxd-userdropdown']")).isDisplayed();
//		Assert.assertTrue(dropdownVisibleStatus, "Login Functionality Failed :");
//	}


	// Property File
	//	@Test(priority=1)
//	public void loginWithInValidCredentials() {
//		String expectedInValidationMessage = testDataProp.getProperty("invalidCredentailMsg");
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(testDataProp.getProperty("invalidUsername"));
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Utilities.generateRandomUser());
//		driver.findElement(By.xpath("//button[@type='submit']")).click();		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//
//		String actualInValidationMessage =  driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")).getText();
//		Assert.assertEquals(actualInValidationMessage, expectedInValidationMessage, "Invalid Credential message validation: ");
//	}

	// JSON FILE
//	@Test(priority=1)
//	public void loginWithInValidCredentialUsingJsonFile() {
//		JsonNode jsonData = jsonNode.get("loginWithInValidCredentialUsingJsonFile");
//
//		String expectedInValidationMessage = jsonData.get("invalidMsg").asText();
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(jsonData.get("username").asText());
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(jsonData.get("password").asText());
//		driver.findElement(By.xpath("//button[@type='submit']")).click();		
//		
//		String username = jsonData.get("username").asText();
//		String password = jsonData.get("password").asText();
//		loginPageObj.loginIntoOrangeHr(username, password);
//
//		String actualInValidationMessage =  loginPageObj.getInvalidCredentialMsg();
//		Assert.assertEquals(actualInValidationMessage, expectedInValidationMessage, jsonData.get("assertionFailedMsg").asText());
//	}
	
	
	
//	PAGE OBJECT MODEL 
	
	@Test(priority=0)
	public void loginWithValidCredentialUsingJsonFileAndPageObject() {

		JsonNode jsonData = jsonNode.get("loginWithValidCredentialUsingJsonFile");
		
		String username = jsonData.get("username").asText();
		String password = jsonData.get("password").asText();
		loginPageObj.loginIntoOrangeHr(username, password);

		boolean dropdownVisibleStatus = homePageObj.isAccountDropdownVisible();
		Assert.assertTrue(dropdownVisibleStatus, jsonData.get("assertionMsg").asText());
	}
	
	@Test(priority=1)
	public void loginWithInValidCredentialUsingJsonFileAndPageObject() {
		JsonNode jsonData = jsonNode.get("loginWithInValidCredentialUsingJsonFile");

		String expectedInValidationMessage = jsonData.get("invalidMsg").asText();		
		String username = jsonData.get("username").asText();
		String password = jsonData.get("password").asText();
		loginPageObj.loginIntoOrangeHr(username, password);

		String actualInValidationMessage =  loginPageObj.getInvalidCredentialMsg();
		Assert.assertEquals(actualInValidationMessage, expectedInValidationMessage, jsonData.get("assertionFailedMsg").asText());
	}
}


