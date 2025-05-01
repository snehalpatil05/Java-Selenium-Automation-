package oopsConcepts.exceptionHandling;

import org.testng.annotations.Test;

public class MyThrow {
	
	public boolean amazonLogin(){
//		User enters the user name and password
//		return true;
		return false; // if the login failed we shouldn't allow the user to search the items.
	}
	
	@Test
	public void searchItems() {
		
		boolean loginStatus = amazonLogin();
		if(loginStatus) {
			System.out.println("Login Successfull");
		}else {
			System.out.println("Login Failed");
			throw new ArithmeticException("Login Failed! you can not proceed further");
		}
		System.out.println("Search for shoes");		
	}
}

// Throw keyword is used to throw exception explicitly.
// When you want to stop your code execution
