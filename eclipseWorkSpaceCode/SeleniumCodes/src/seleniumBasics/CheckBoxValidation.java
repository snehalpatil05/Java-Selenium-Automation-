package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckBoxValidation {
	
	@Test
	public void method() {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html"); //to Navigate to URL
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Snehal");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Patil");
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Bengaluru, Karnataka - 560006"); 
		
		// Check-box status check
		boolean status = driver.findElement(By.xpath("//input[@value='Cricket']")).isSelected();
		
		if(status) {
			System.out.println("Already the checkbox is selected");
		}else {
			driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
		}
		
		driver.findElement(By.xpath("//input[@value='Movies']")).click();
		
		driver.quit();
	}
}
