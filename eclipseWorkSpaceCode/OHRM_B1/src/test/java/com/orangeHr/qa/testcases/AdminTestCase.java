package com.orangeHr.qa.testcases;

import java.time.Duration;
import java.util.Date;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
import com.orangeHr.qa.pages.AdminPage;
import com.orangeHr.qa.pages.HomePage;
import com.orangeHr.qa.pages.LoginPage;
import com.orangeHr.qa.utils.Utilities;

public class AdminTestCase extends BaseClass{
	WebDriver driver;
//	LoginPage loginPageObj;
//	HomePage homePageObj;
//	AdminPage adminPageObj;
//	WebDriverWait wait;
	
	
	// created the constructor for the Admin
	AdminTestCase(){
		super();
	}

//	Moving tearDown and the setUp method to Base class
//	@AfterMethod
//	public void tearDown() {
//		driver.quit();
//	}
//
//	@BeforeMethod
//	public void setUp() {
//		//		loadPropertiesFile();   // removed it from here and added in Base class - Base constructor
//		driver = initializeBrowser(configProp.getProperty("browser"));
//		loginPageObj = new LoginPage(driver);
//		homePageObj = new HomePage(driver);
//		adminPageObj = new AdminPage(driver);
//		
//	}

	// Navigate to Admin section

//	@Test(priority = 0)
	public void saveAdminWithValidData() throws InterruptedException {	
		JsonNode jsonData = jsonNode.get("VerifyAddUserFunctionality");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(configProp.getProperty("username"));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(configProp.getProperty("password"));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		// Add button
		driver.findElement(By.xpath("//button[text()=' Add ']")).click();
		
		// Select User Role
		driver.findElement(By.xpath("//div[label[text()='User Role']]//following-sibling::div/div/div/div[@class='oxd-select-text-input']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Admin')]")).click();

		// Enter Employee Name
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys(jsonData.get("hint").asText());
		driver.findElement(By.xpath("//span[text()='Orange  Test']")).click();

		// Select Status
		driver.findElement(By.xpath("//div[label[text()='Status']]//following-sibling::div//div[@class='oxd-select-text-input']")).click();
		driver.findElement(By.xpath("//span[text()='Enabled']")).click();

		// Enter Username
		String username = Utilities.generateRandomUser();
		driver.findElement(By.xpath("//div[label[text()='Username']]//following-sibling::div/input[@class='oxd-input oxd-input--active']")).sendKeys(username);

		// Enter Password
		driver.findElement(By.xpath("//div[label[text()='Password']]//following-sibling::div/input")).sendKeys(jsonData.get("password").asText());

		// Confirm Password
		driver.findElement(By.xpath("//div[label[text()='Confirm Password']]//following-sibling::div/input[@class='oxd-input oxd-input--active']")).sendKeys(jsonData.get("confirmPwd").asText());

		// Click Save Button
		driver.findElement(By.xpath("//button[text() = ' Save ']")).click();

		driver.findElement(By.xpath("//div[label[text()='Username']]//following-sibling::div/input[@class='oxd-input oxd-input--active']")).sendKeys(username);
		driver.findElement(By.xpath("//button[text()=' Search ']")).click();		

		boolean actualUserName =  driver.findElement(By.xpath("//div[contains(text(),'"+username+"')]")).isDisplayed();
		Assert.assertTrue(actualUserName, "Add user Functionality");			
	}

	@Test(priority = 1)
	public void verifyAddUserFunctionalityUsingJsonAndPageObjects() throws InterruptedException {	
		JsonNode jsonData =	jsonNode.get("VerifyAddUserFunctionality");

		String username = jsonData.get("username").asText();
		String password = jsonData.get("password").asText();
		loginPageObj.loginIntoOrangeHr(username, password);
		
		homePageObj.clickOnAdminLink();
		adminPageObj.clickOnAddButton(); 
		adminPageObj.clickOnSelectUserRole();
		Thread.sleep(1000);
		adminPageObj.clickOnAdminRole();
		adminPageObj.enterTypeForHint(jsonData.get("hint").asText());
		Thread.sleep(1000);
		adminPageObj.clickOnOrangeTest();
		adminPageObj.clickOnSelectStatus();
		Thread.sleep(1000);
		adminPageObj.clickOnSelectEnabled();
		String testUser = Utilities.generateRandomUser();
		adminPageObj.enterUserName (testUser);
		adminPageObj.enterPassword(jsonData.get("pwd").asText()); 
		adminPageObj.enterConfirmPwd(jsonData.get("confirmPwd").asText()); 
		adminPageObj.clickOnSaveButton();
		Thread.sleep(5000);

	}
	
//	@DataProvider(name="addUser")
//	public Object[][] getAddUserDataFromExcel(){
//		Object[][] data =Utilities.getTestDataFromExcelSheet("Add User Data");
//		return data;
//	}

//	@Test(priority=1, dataProvider = "addUser")
//	public void verifyAddUserFunctionalityWithDataProvider(String hint, String userName, String pwd,String confPwd) throws InterruptedException {	
//
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(configProp.getProperty("username"));
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(configProp.getProperty("password"));
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		driver.findElement(By.xpath("//span[text()='Admin']")).click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//		driver.findElement(By.xpath("//button[text()=' Add ']")).click();
//		driver.findElement(By.xpath("//div[label[text()='User Role']]//following-sibling::div/div/div/div[@class='oxd-select-text-input']")).click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//		driver.findElement(By.xpath("//span[contains(text(),'Admin')]")).click();
//		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys(testDataProp.getProperty("typeForHint"));
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//		driver.findElement(By.xpath("//span[text()='Orange  Test']")).click();
//		driver.findElement(By.xpath("//div[label[text()='Status']]//following-sibling::div//div[@class='oxd-select-text-input']")).click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//		driver.findElement(By.xpath("//span[text()='Enabled']")).click();
//		String username = Utilities.generateRandomUser();
//		driver.findElement(By.xpath("//div[label[text()='Username']]//following-sibling::div/input[@class='oxd-input oxd-input--active']")).sendKeys(username);
//		driver.findElement(By.xpath("//div[label[text()='Password']]//following-sibling::div/input")).sendKeys(testDataProp.getProperty("password"));
//		driver.findElement(By.xpath("//div[label[text()='Confirm Password']]//following-sibling::div/input[@class='oxd-input oxd-input--active']")).sendKeys(testDataProp.getProperty("confirmPassword"));
//		driver.findElement(By.xpath("//button[text() = ' Save ']")).click();
//
//	}

}
