package selectDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SearchAndSelect1 {
	
	@Test
	public void method() throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html"); 
		driver.manage().window().maximize();
		
		Thread.sleep(3000);

//		span[@id='select2-country-container']
//		span[@role='presentation']
//		driver.findElement(By.xpath("//span[@id='select2-country-container']")).click();
		
		driver.findElement(By.xpath("//span[@role='presentation']")).click();		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("India");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//li[@role='treeitem']")).click();
		Thread.sleep(3000);


		driver.close();

		
	}
}
