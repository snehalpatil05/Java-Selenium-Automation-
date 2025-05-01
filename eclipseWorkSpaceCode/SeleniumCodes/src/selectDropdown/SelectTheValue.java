package selectDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectTheValue {
	
	
	@Test
	public void method() throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html"); 
		driver.manage().window().maximize();
		
		
		Thread.sleep(5000);
		
//		WebElement firstNameElement = driver.findElement(By.xpath("//input[@ng-model='First Name']"));
//		firstNameElement.sendKeys("Snehal");
//		WebElement lastNameElement = driver.findElement(By.xpath("//input[@ng-model='Last Name']"));
//		lastNameElement.sendKeys("Pail");
		
// Whenever the Select dropdown has the Select html tag, we have one more way to find the element.

		WebElement skillsDropdown = driver.findElement(By.xpath("//select[@id='Skills']"));
		Select select = new Select(skillsDropdown);
		// created an Select class object
		
		select.selectByValue("C++"); // selectByValue() refers to the option tag which has the Attribute value
		
		driver.close();
		
	}
}

