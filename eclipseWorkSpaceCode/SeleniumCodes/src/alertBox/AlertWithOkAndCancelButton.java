package alertBox;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertWithOkAndCancelButton {
	
	@Test
	public void method() throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html"); //to Navigate to URL
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(), 'Cancel')]")).click();
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.dismiss();
		
		String actualCancelMessage = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		String expectedCancelMessage = "You Pressed Cancel";
		Assert.assertEquals(actualCancelMessage, expectedCancelMessage);
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(3000);
		alert.accept();
		
		String actualOkMessage = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		String expectedOkMessage = "You pressed Ok";
		Assert.assertEquals(actualOkMessage, expectedOkMessage);
		
		driver.close();
	}
}
