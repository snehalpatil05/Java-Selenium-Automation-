package selectDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectByIndex {
	
	
	@Test
	public void method() throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html"); 
		driver.manage().window().maximize();
		
		
		Thread.sleep(5000);
		
// Whenever the Select dropdown has the Select html tag, we have one more way to find the element.

		WebElement skillsDropdown = driver.findElement(By.xpath("//select[@id='Skills']"));
		Select select = new Select(skillsDropdown);
		// created an Select class object
		
		select.selectByIndex(5); //it selects the API value.
		Thread.sleep(5000);
//		String selectValue = driver.findElement(By.xpath("//select[@type='text']")).getText();
//		System.out.println("Actual Selected Value from UI is : {"+selectValue+"}");
		
//		The value selected in the dropdown will be fetched from this method
		WebElement selectedValue = select.getFirstSelectedOption();
		String actualSelectedValue = selectedValue.getText();
		System.out.println("Actual selected value is in UI is: "+actualSelectedValue);
		driver.close();
		
	}
}

