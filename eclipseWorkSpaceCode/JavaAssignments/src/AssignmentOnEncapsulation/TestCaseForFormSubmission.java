package AssignmentOnEncapsulation;

import org.testng.annotations.Test;

public class TestCaseForFormSubmission {
	// create object for the form creation method
	CreateForm form = new CreateForm();
		
	@Test
	public void TestCaseForTheNewFieldsIncluded() {

		// create the object for the FormEncapsulation class
		FormEncapsulation obj = new FormEncapsulation();
		obj.setFname("Snehal");
		obj.setLname("Patil");
		obj.setAddress("INDIA");
		obj.setEmailAddress("snehal@gmail.com");
		obj.setPhone("9988776655");
		obj.setGender("Female");
		obj.setHobbies("Cricket");
		obj.setPassword("Password123");
		obj.setConfirmPassword("Password123");
		form.createAutomationForm(obj);
		
	}
	
}
