package wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MyExplicitWait {
	
	@Test
	public void testCase() {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/"); //to Navigate to URL
		driver.manage().window().maximize();
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(35)); // explicit wait is applicable for the search field only.
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//textarea[@name='q']")));
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // implicit wait is applicable for all the elements 
		
		driver.findElement(By.xpath("//textarea[@name='p']")).sendKeys("Java");  //wrong xpath
		
		
//		VisibilityOf-Element:
		
//		WebElement element = driver.findElement(By.xpath("//textarea[@name='q']")); 
//		wait.until(ExpectedConditions.visibilityOf(element));
		
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(35));
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='lJ9FBc']//input[@name='btnK']")));
	
//		driver.findElement(By.xpath("//div[@class='lJ9FBc']//input[@name='btnK']")).click();
	}	
}
