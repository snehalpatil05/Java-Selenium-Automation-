package fileUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UploadingFile {
	
	@Test
	public void testCase() throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.freefileconvert.com/"); //to Navigate to URL
		driver.manage().window().maximize();
				
		driver.findElement(By.xpath("//input[@id='first_file']")).sendKeys("C:\\Users\\SnehalPatil\\Desktop\\Text1.txt");
		// input tag & attribute should have type = "file"
		
	}
}
