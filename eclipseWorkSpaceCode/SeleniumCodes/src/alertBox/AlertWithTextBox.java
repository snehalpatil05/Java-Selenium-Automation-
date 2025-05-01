package alertBox;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertWithTextBox {
	
	@Test
	public void method() throws InterruptedException {
		String expectedTitle = "Automation Demo Site";
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html"); //to Navigate to URL
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(), 'Textbox')]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Thread.sleep(3000);
		
		Alert alert = driver.switchTo().alert();
		
		alert.sendKeys("Good day!");
		alert.accept();
		
		String expectedAlertMessage = "Hello Good! How are you today";
		String actualAlertMessage = driver.findElement(By.xpath("//p[@id='demo1']")).getText();
		Assert.assertEquals(actualAlertMessage, expectedAlertMessage);
		
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		alert.dismiss();
		
		driver.close();
	}
}
