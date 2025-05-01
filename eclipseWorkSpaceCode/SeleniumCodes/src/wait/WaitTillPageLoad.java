package wait;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WaitTillPageLoad {
	
	@Test
	public void testCase() throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html"); //to Navigate to URL
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10)); //Timeout till all the elements on the page / the page is completely loads.
		
		driver.findElement(By.xpath("//a[normalize-space()='WebTable']")).click();
		
		Thread.sleep(2000);
		driver.navigate().back();  // Navigate to Previous page
		
		Thread.sleep(2000);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//a[text()='Home']")).click();
		
		Thread.sleep(2000);
		driver.navigate().forward(); // Navigate to Next page
		driver.close();
		
	}

}


// pageLoadTimeout is only applicable for the respective page only.
// if we navigate to any other / new page, the same pageLoadTimeout is not applicable. 
// Every new page new PageLoadTimeout should be added.