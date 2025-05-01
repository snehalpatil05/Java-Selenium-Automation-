package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRegisterForm {
	
	boolean testResult = true;  // for the first issue
	String errorMessage = ""; // assigning empty value to the error Message.
	
	@Test
	public void method() {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html"); //to Navigate to URL
		driver.manage().window().maximize();
		
		try {
			driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Snehal");
		}catch (Exception e) {
			e.printStackTrace();
			testResult = false;
//			System.out.println("First name not present"); 
			errorMessage = errorMessage+"| First name not present";
		}

		try {
			driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Patil");
		}catch (Exception e) {
			e.printStackTrace();
			testResult = false;
//			System.out.println("Last name not present");
			errorMessage = errorMessage+"| Last name not present";
		}
		
		try {
			driver.findElement(By.xpath("//input[@placeholder='Middle Name']")).sendKeys("S");
		}catch (Exception e) {
			e.printStackTrace();
			testResult = false;
//			System.out.println("Middle name not present");
			errorMessage = errorMessage+"| Middle name not present";
		}
		
		try {
			driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Bengaluru, Karnataka - 560006");

		}catch (Exception e) {
			e.printStackTrace();
			testResult = false;
//			System.out.println("Address not present");
			errorMessage = errorMessage+"| Address name not present";

		}
		
		try {
			driver.findElement(By.xpath("//input[@type='email']")).sendKeys("snehal.patil@gmail.com");
		}catch (Exception e) {
			e.printStackTrace();
			testResult = false;
//			System.out.println("email not present");
			errorMessage = errorMessage+"| Email not present";

		}
		
		try {
			driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("1122334455");
		}catch (Exception e) {
			e.printStackTrace();
			testResult = false;
//			System.out.println("Phone number not present");
			errorMessage = errorMessage+"| Phone number not present";

		}
		
		try {
			driver.findElement(By.xpath("//input[@value='FeMale']")).click();
		}catch (Exception e) {
			e.printStackTrace();
			testResult = false;
//			System.out.println("Gender not present");
			errorMessage = errorMessage+"| Gender not present";
			
		}
		
		try {
			driver.findElement(By.xpath("//input[@value='cycling']")).click();
		}catch (Exception e) {
			e.printStackTrace();
			testResult = false;
//			System.out.println("cycling not present");
			errorMessage = errorMessage+"| Cycling not present";
		}
		
		try {
			driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
		}catch (Exception e) {
			e.printStackTrace();
			testResult = false;
//			System.out.println("Cricket not present");
			errorMessage = errorMessage+"| Cricket not present";
		}
		 
//		System.out.println("Status of the error message"+errorMessage); // in Automation we need to avoid SOP hence we use Assertion method
		
//		Assert.assertTrue(testResult); // used this to over come from the 1st issue // To access the different class method we can use the Static way without creating the object for this method.
		Assert.assertTrue(testResult, errorMessage); // used this to over come from the 2nd issue 
		
		System.out.println("Status of the test result"+testResult);

		driver.quit(); 	//will close all tabs at a time

	}
}
