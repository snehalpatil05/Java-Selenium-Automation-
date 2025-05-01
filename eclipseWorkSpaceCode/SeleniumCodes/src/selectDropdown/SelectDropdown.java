package selectDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SelectDropdown {
	
	@Test
	public void method() throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html"); 
		driver.manage().window().maximize();
		
		
//		driver.findElement(By.xpath("//select[@id='Skills']")).click();
//		Thread.sleep(3000);
// Whenever the Select dropdown has the Select html tag, we have one more way to find the element.
		
		driver.findElement(By.xpath("//select/option[@value='Android']")).click();
//		we can also use the Xpath as //option[text()='Android']

	}
}
