package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentWaysToLocateElements {
	
	public void testcase() {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html"); //to Navigate to URL
		driver.manage().window().maximize();
		
		// by ID
		driver.findElement(By.id("demo1")).getText();
		driver.findElement(By.id("Checkbox1")).click();
		
		//by ClassName - only preferred when there is a unique class
		driver.findElement(By.className("btn btn-danger")).click();
		
		//by tag name - only preferred when there is a unique html tag name
		driver.findElement(By.tagName("h1")).getText();
		
		//by name -only preferred when there is a unique name attribute 
		driver.findElement(By.name("username")).sendKeys("Snehal");
		
		// by LinkText - link text refers to the text associated with the anchor html tag 
		// link text is applicable only for anchor tag text (<a>Register</a>).
		driver.findElement(By.linkText("Register")).click();
		
		// by PartialLinkText - this refers to the text associated with the anchor html tag 
		// PartialLinkText is also applicable only for anchor tag text (<a>Register</a>).
		driver.findElement(By.partialLinkText("Practice")).click();

		//by Css selector
		driver.findElement(By.cssSelector("input#checkbox1")).click();  			//("tagname#idValue")
		driver.findElement(By.cssSelector("button.btn btn-danger")).click();		//("tagname.ClassValue")
		driver.findElement(By.cssSelector("input[name=username]")).click();			//("tagname[attribute=value]")
		
	}

}
