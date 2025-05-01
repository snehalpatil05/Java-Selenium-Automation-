package seleniumAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EnterTextInIframeDemoSite {
		
	@Test
	public void testCase() throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html"); //to Navigate to URL
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.switchTo().frame("SingleFrame");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Snehal Patil");
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//		driver.close();
		
	}
}
