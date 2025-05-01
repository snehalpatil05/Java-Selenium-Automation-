package oopsConcepts.encapsulation;

import org.testng.annotations.Test;

public class TestCaseForUserCreationUsingEncapsulation {
	// create object for the user creation method
	CreateUserOperation createUser = new CreateUserOperation();

	@Test
	public void createUserWithCharOnly() {
	// create the object for the MyEncapsulation class & set the data for the fname and lname.
		MyEncapsulation obj = new MyEncapsulation();
		obj.setFname("Snehal");
		obj.setLname("Patil");
		createUser.createUser(obj);
	}

	@Test
	public void TestCase1() {
		System.out.println("-----------------------------------------");
	// create the object for the MyEncapsulation class & set the data for the fname and lname.
		MyEncapsulation obj = new MyEncapsulation();
		obj.setFname("Snehal");
		obj.setLname("Patil");
		obj.setMobile("15541214521");
		createUser.createUser(obj);
	}
	
	
	@Test
	public void TestCaseForTheNewFieldsIncluded() {
		System.out.println("-----------------------------------------");
	// create the object for the MyEncapsulation class & set the data for the fname and lname.
		MyEncapsulation obj = new MyEncapsulation();
		obj.setFname("Snehal");
		obj.setLname("Patil");
		obj.setMobile("15541214521");
		obj.setAddress("India");
		obj.setEmail("abc@gmail.com");
		obj.setAge(25);
		createUser.createUser(obj);
	}
	
}
