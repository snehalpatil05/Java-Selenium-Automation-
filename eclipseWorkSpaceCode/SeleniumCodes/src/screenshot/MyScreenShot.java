package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyScreenShot {
	@Test
	public void testCase() throws InterruptedException, IOException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html"); //to Navigate to URL
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys("Snehal");
		
		ScreenshotUtility.takeScreenshot(driver);
		
//		2 liner Code To take a screenshot:
//		TakesScreenshot screenshot = (TakesScreenshot)driver;  //typecasting
//		
//		File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
//
//		Random obj = new Random();
//		int randomNumber = obj.nextInt(1000);
//		System.out.println("RandomNumber: "+randomNumber);
//		
//		Storing the screenshot taken in a Destination folder file.		
//		FileUtils.copyFile(srcFile, new File("C:\\Users\\SnehalPatil\\eclipse-workspace\\SeleniumCodes\\ScreenShotsTaken\\ScreenShot"+randomNumber+".png"));
   	
	}
}

// FileUtils is from ApachePOI 
// https://mvnrepository.com/artifact/commons-io/commons-io/2.18.0
//Download the Jar file to support FileUtils and configure it to the buildpath.