package com.orqangeHr.qa.testcases;

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
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.orqangeHr.qa.base.Base;
import com.orqangeHr.qa.utils.Utilities;

public class LoginTestCase extends Base{
	WebDriver driver;

	LoginTestCase(){
		super();
	}

	//setup --> login --> tearDown
	//setup--> invalid --> tearDown

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@BeforeMethod
	public void setup() {
		//		loadPropertiesFile(); removed it from here, and added in base constructor
		driver=initliazeBrowser(configProp.getProperty("browser"));
	}

	//reading data from dataprovider with hardcoded data
//	@DataProvider(name="validLoginCredentialData")
//	public Object[][] getDataFromExcel(){
//		Object[][] data = { {"admin","admin123"},
//							{"admin1","Admin1234567"},
//							{"admin2","Admin12345678"},
//		};
//		return data;
//	}
	
//	reading data from dataProvider with excel sheet
	@DataProvider(name="validLoginCredentialData")
	public Object[][] getLoginDataFromExcel(){
		Object[][] data =Utilities.getTestDataFromExcelSheet("LoginTestData");
		return data;
	}

	@Test(dataProvider = "validLoginCredentialData")
	public void loginWithValidCredentialUsingDataProvider(String username, String pwd)
	{	
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		boolean dropDownVisibleStatus =	driver.findElement(By.xpath("//li[@class='oxd-userdropdown']")).isDisplayed();
		Assert.assertTrue(dropDownVisibleStatus, "Login functionality failed :");
	}

//	@Test(priority=0)
	public void loginWithValidCredential()
	{	
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(configProp.getProperty("username"));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(configProp.getProperty("password"));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		boolean dropDownVisibleStatus =	driver.findElement(By.xpath("//li[@class='oxd-userdropdown']")).isDisplayed();
		Assert.assertTrue(dropDownVisibleStatus, "Login functionality failed :");
	}


//	@Test(priority=1)
	public void loginWithInValidCredentials()
	{
		String expectedInvalidCredMsg = testDataProp.getProperty("invalidCredentailMsg");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(testDataProp.getProperty("invalidUsername"));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Utilities.generateRandomUser());
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		String actaulInvalidCredMsg = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")).getText();		
		Assert.assertEquals(actaulInvalidCredMsg, expectedInvalidCredMsg, "Invalid Credential message validation: ");	
	}


}
