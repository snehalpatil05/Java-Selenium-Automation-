package com.orqangeHr.qa.testcases;

import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

public class AdminTestCase extends Base {
	
	WebDriver driver;
	
	AdminTestCase(){
		super();
	}
	

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@BeforeMethod
	public void setup() {
		driver=initliazeBrowser(configProp.getProperty("browser"));
	}
	
//	@Test(priority=1)
	public void verifyAddUserFunctionality() throws InterruptedException {	
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(configProp.getProperty("username"));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(configProp.getProperty("password"));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.xpath("//button[text()=' Add ']")).click();
		List <WebElement> dropdowns = driver.findElements(By.xpath("//div[@class='oxd-select-wrapper']"));
		dropdowns.get(0).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@role='option']/span[text()='Admin']")).click();	
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys(testDataProp.getProperty("typeForHint"));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Orange  Test']")).click();	
		dropdowns.get(1).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@role='option']/span[text()='Enabled']")).click();
		String testUser = Utilities.generateRandomUser();
		driver.findElement(By.xpath("//div[label[text()='Username']]//following-sibling::div/input")).sendKeys(testUser);
		driver.findElement(By.xpath("//div[label[text()='Password']]//following-sibling::div/input[@type='password']")).sendKeys(testDataProp.getProperty("password"));
		driver.findElement(By.xpath("//div[label[text()='Confirm Password']]//following-sibling::div/input[@type='password']")).sendKeys(testDataProp.getProperty("confirmPassword"));	
		driver.findElement(By.xpath("//button[text()=' Save ']")).click();
		driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--focus']")).sendKeys(testUser);
//		driver.findElement(By.xpath("//div[label[text()='Username']]//following-sibling::div/input")).sendKeys(testUser);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		boolean status = driver.findElement(By.xpath("//div[contains(text(),'"+testUser+"')]")).isDisplayed();
		Assert.assertTrue(status, "Add user functionality");
	}
	
	@DataProvider(name="addUser")
	public Object[][] getAddUserDataFromExcel(){
		Object[][] data =Utilities.getTestDataFromExcelSheet("AddUserData");
		return data;
	}
	
	@Test(priority=1, dataProvider = "addUser")
	public void verifyAddUserFunctionalityWithDataProvider(String hint, String userName, String pwd,String confPwd) throws InterruptedException {	
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(configProp.getProperty("username"));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(configProp.getProperty("password"));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.xpath("//button[text()=' Add ']")).click();
		List <WebElement> dropdowns = driver.findElements(By.xpath("//div[@class='oxd-select-wrapper']"));
		dropdowns.get(0).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@role='option']/span[text()='Admin']")).click();	
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys(hint);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Orange  Test']")).click();	
		dropdowns.get(1).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@role='option']/span[text()='Enabled']")).click();
		String testUser = Utilities.generateRandomUser();
		driver.findElement(By.xpath("//div[label[text()='Username']]//following-sibling::div/input")).sendKeys(userName);
		driver.findElement(By.xpath("//div[label[text()='Password']]//following-sibling::div/input[@type='password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//div[label[text()='Confirm Password']]//following-sibling::div/input[@type='password']")).sendKeys(confPwd);	
		driver.findElement(By.xpath("//button[text()=' Save ']")).click();
		Thread.sleep(5000);
//		driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--focus']")).sendKeys(userName);
//		driver.findElement(By.xpath("//div[label[text()='Username']]//following-sibling::div/input")).sendKeys(testUser);
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		boolean status = driver.findElement(By.xpath("//div[contains(text(),'"+testUser+"')]")).isDisplayed();
//		Assert.assertTrue(status, "Add user functionality");
	}
	
	

	
	

}
