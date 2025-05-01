package seleniumBasics;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TextValidation {
	
	@Test
	public void method() {
		String expectedTitle = "Automation Demo Site";
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html"); //to Navigate to URL
		driver.manage().window().maximize();
		
		String actualTitle = driver.findElement(By.xpath("//h1")).getText();
		System.out.println("Actual title from Ui:{"+actualTitle+"}");
		
//		if(expectedTitle.equals(actualTitle)) {
//			System.out.println("TestCase passed");
//		}else {
//			System.out.println("TestCase Failed");
//		}
		
		Assert.assertEquals(actualTitle, expectedTitle, "Validation of Page Title failed:");
		
		driver.quit();
	}
}
