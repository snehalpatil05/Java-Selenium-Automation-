package wait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyImplicitWait {
	
	@Test
	public void testCase() {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/"); //to Navigate to URL
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));    		// implicit wait
//		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);    		// Deprecated Method
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Selenium");
		driver.close();
		
	}
}


// with Implicit Wait for right Xpath -> 4.39s
// with Implicit Wait for wrong Xpath -> 8.9s
// with thread -> 9.5s
// without thread -> 6s
// timeout -> if element exists, perform the operation.
//			if the element is not displayed, wait for the element till max timeout.


//Where and all the Implicit wait is applicable -> we feed the Implicit wait to the driver hence,
//wherever we are using "driver." there everywhere Implicit wait is applicable until Driver.close() gets executed.