package alertBox;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertWithOkButton {
	
	@Test
	public void method() throws InterruptedException {
		String expectedTitle = "Automation Demo Site";
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html"); //to Navigate to URL
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Thread.sleep(3000);
		
		Alert alert = driver.switchTo().alert();
//		String expectedAlertMessage = "I am an alert box!";
		String expectedAlertMessage = "I am Not in alert box!";
		String actualAlertMessage = alert.getText();
		
		alert.accept();
//		Assert.assertEquals(expectedAlertMessage, ActualAlertMessage);
		Assert.assertEquals(actualAlertMessage, expectedAlertMessage);
		
		driver.close();
	}
}
