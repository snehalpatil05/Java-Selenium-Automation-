package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyiFrame {
	
	@Test
	public void testCase() throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html"); //to Navigate to URL
		driver.manage().window().maximize();
		
		
//		driver.switchTo().frame("SingleFrame");  // iFrame name attribute
//		driver.switchTo().frame("singleframe"); // iFrame id attribute
//		driver.switchTo().frame(0); // By iFrame index value
		
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Snehal Patil");
		
		
		WebElement iFrameElement = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		driver.switchTo().frame(iFrameElement);

		driver.close();
		
	}
}
