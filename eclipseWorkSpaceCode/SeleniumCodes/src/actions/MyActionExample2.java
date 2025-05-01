package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MyActionExample2 {

	@Test
	public void testCase() throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html"); //to Navigate to URL
		driver.manage().window().maximize();
		
		WebElement firstName = driver.findElement(By.xpath("//input[@ng-model='FirstName']"));
		
		Actions myActions = new Actions(driver);
		
//		myActions.moveToElement(firstName).keyDown(Keys.SHIFT).sendKeys("snehal").build().perform();
//		moveToElement() mouse hovering on the element but will not perform any action.
//		
//		myActions.contextClick(firstName).keyDown(Keys.SHIFT).sendKeys("snehal").keyUp(Keys.SHIFT).build().perform();
//		contextClick(firstName) will go and right click on the element we have passed.
		
		myActions.click(firstName).keyDown(Keys.SHIFT).sendKeys("snehal").keyUp(Keys.SHIFT).build().perform();
//		click() will click on the element we have passed.
		
		driver.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys("patil");

	}
}
