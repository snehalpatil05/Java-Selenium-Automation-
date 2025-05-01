package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHover {
	
	@Test
	public void testCase() throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html"); //to Navigate to URL
		driver.manage().window().maximize();
		
		WebElement switchTo = driver.findElement(By.xpath("//a[text()='SwitchTo']"));
		WebElement windows = driver.findElement(By.xpath("//a[text()='Windows']"));
		
		Actions myActions = new Actions(driver);
		
//		1st approach: Direct way
//		myActions.moveToElement(switchTo).build().perform();
//		driver.findElement(By.xpath("//a[text()='Windows']")).click();
//		
//		2nd approach: Multiple steps
//		myActions.moveToElement(switchTo).build().perform();
//		myActions.click(windows).build().perform();
		
//		3rd approach: single step
		myActions.moveToElement(switchTo).click(windows).build().perform();
	}

}
