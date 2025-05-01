package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleiFrame {
	
	@Test
	public void testCase() throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html"); //to Navigate to URL
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[text() = 'Iframe with in an Iframe']")).click();
		WebElement parentiFrameElement = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(parentiFrameElement);
//		driver.switchTo.frame(0); // For the nested iFrame index is not supported.
		
		String parentiFrameText = driver.findElement(By.xpath("//h5")).getText();
		System.out.println(parentiFrameText);
		
		WebElement ChildiFrameElement = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(ChildiFrameElement);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Snehal Patil");

		driver.switchTo().defaultContent();  // it moves the control from frame to main frame
//		driver.switchTo().parentFrame(); // it moves the control from child frame to parent frame

		driver.close();
		

	}

}
