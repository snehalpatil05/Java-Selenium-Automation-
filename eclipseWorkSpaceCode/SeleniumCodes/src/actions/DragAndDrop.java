package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop {
	
	@Test
	public void testCase() throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html"); //to Navigate to URL
		driver.manage().window().maximize();
		
		WebElement srcElement = driver.findElement(By.id("draggable"));
		WebElement destinationElement = driver.findElement(By.id("droppable"));
		
		Actions myActions = new Actions(driver);
		myActions.dragAndDrop(srcElement, destinationElement).build().perform();
		// while using action class we have to use Build() and perform() along with Action class.
		
	}
}
