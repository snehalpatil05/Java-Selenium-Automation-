//package com.orangeHr.qa.testcases;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//
//public class KamalAdminTestCase {
//	WebDriver driver;
//	
//	public void saveAdminWithValidData() {
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(configProp.getProperty("username"));
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(configProp.getProperty("password"));
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		driver.findElement(By.xpath("//div[@role='option']/span[text()='Admin']")).click();	
//		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys(testDataProp.getProperty("typeForHint"));
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//span[text()='Orange  Test']")).click();	
//		dropdowns.get(1).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//div[@role='option']/span[text()='Enabled']")).click();
//		String testUser = Utilities.generateRandomUser();
//		driver.findElement(By.xpath("//div[label[text()='Username']]//following-sibling::div/input")).sendKeys(testUser);
//		driver.findElement(By.xpath("//div[label[text()='Password']]//following-sibling::div/input[@type='password']")).sendKeys(testDataProp.getProperty("password"));
//		driver.findElement(By.xpath("//div[label[text()='Confirm Password']]//following-sibling::div/input[@type='password']")).sendKeys(testDataProp.getProperty("confirmPassword"));	
//		driver.findElement(By.xpath("//button[text()=' Save ']")).click();
//		driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--focus']")).sendKeys(testUser);
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		boolean status = driver.findElement(By.xpath("//div[contains(text(),'"+testUser+"')]")).isDisplayed();
//		Assert.assertTrue(status, "Add user functionality");
//	}
//}
