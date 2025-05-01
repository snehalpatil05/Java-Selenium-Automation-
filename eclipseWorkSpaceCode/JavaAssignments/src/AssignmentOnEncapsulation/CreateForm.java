package AssignmentOnEncapsulation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateForm {
	
	public void createFormWith3Fields(String fname, String lname, String address) {
		
		System.out.println("Enter FirstName"+ fname);
		System.out.println("Enter LastName"+ lname);
		System.out.println("Enter the address"+ address);
	}
	
	public void createAutomationForm(FormEncapsulation obj) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html"); //to Navigate to URL
		driver.manage().window().maximize();
		
		
		if(obj.getFname()!= null) {
			driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(obj.getFname());
			System.out.println("Enter the FirstName: "+obj.getFname());
		}
		
		if(obj.getLname()!= null) {
			driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(obj.getLname());
			System.out.println("Enter the LastName: "+obj.getLname());
		}
		
		if(obj.getAddress()!= null) {
			driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys(obj.getAddress());
			System.out.println("Enter the Address: "+ obj.getAddress());
		}
		
		if(obj.getEmailAddress()!= null) {
			driver.findElement(By.xpath("//input[@type='email']")).sendKeys(obj.getEmailAddress());
			System.out.println("Enter the Email Address: "+obj.getEmailAddress());
		}
		
		if(obj.getPhone()!= null) {
			driver.findElement(By.xpath("//input[@type='tel']")).sendKeys(obj.getPhone());
			System.out.println("Enter the Phone: "+obj.getPhone());
		}
		
		if(obj.getGender()!= null) {
			driver.findElement(By.xpath("//input[@value='FeMale']")).click();
			System.out.println("Gender: "+obj.getGender());
		}

		if(obj.getHobbies()!= null) {
			driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
			System.out.println("Hobbies: "+obj.getHobbies());
		}
		
//		if(obj.getLanguage()!= null) {
//			driver.findElement(By.xpath("//a[contains(text(), 'Hindi')]")).click();
//			System.out.println("Selected Language: "+obj.getLanguage());
//		}
		
//		if(obj.getSkills()!= null) {
//			driver.findElement(By.xpath("//select[@id='Skills']")).click();
//			driver.findElement(By.xpath("//select/option[@value='Android']")).click();
//			System.out.println("Selected Skill: "+obj.getSkills());
//		}
		
//		if(obj.getCountry()!= null) {
//			driver.findElement(By.xpath("//select[@id='countries']")).click();
//			System.out.println("Country: "+obj.getCountry());
//		}

//		if(obj.getSelectCountry()!= null) {
//			driver.findElement(By.xpath("//span[@role='presentation']")).click();				
//			driver.findElement(By.xpath("//input[@type='search']")).sendKeys(obj.getSelectCountry());
//			driver.findElement(By.xpath("//li[@role='treeitem']")).click();
//			System.out.println("Selected Country from the dropdown: "+obj.getSelectCountry());
//		}

//		if(obj.getDateOfBirth()!= 0) {
//			driver.findElement(By.xpath("//select[@id='yearbox']")).click();	
//			driver.findElement(By.xpath("//option[contains(text(),'1994')]")).click();	
//				
//			driver.findElement(By.xpath("//select[@placeholder='Month']")).click();
//			driver.findElement(By.xpath("//option[@value='June']")).click();
//			
//			driver.findElement(By.xpath("//select[@id='daybox']")).click();	
//			driver.findElement(By.xpath("//option[@value='11']")).click();	
//			
//			System.out.println("Date of Birth is: "+obj.getDateOfBirth());
//		}
		
		if(obj.getPassword()!= null) {
			driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys(obj.getPassword());
			System.out.println("Entered Password: "+obj.getPassword());
		}

		if(obj.getConfirmPassword()!= null) {
			driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys(obj.getConfirmPassword());
			System.out.println("Confirmed Password: "+obj.getConfirmPassword());
		}
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.close();
		
	}

}
