package oopsConcepts.encapsulation;

public class CreateUserOperation {  // createForm
	
	public void createUser(String fname, String lname, String mobile) {
		
		System.out.println("Enter FirstName"+ fname);
		System.out.println("Enter LastName"+ lname);
		System.out.println("Enter mobile"+ mobile);
		System.out.println("Click on Submit");
		System.out.println("Validation");
	}

//	public void createUser(String fname, String lname, String mobile, String address) {
//		
//		System.out.println("Enter FirstName"+ fname);
//		System.out.println("Enter LastName"+ lname);
//		System.out.println("Enter mobile"+ mobile);
//		System.out.println("Enter Address"+ address);
//		System.out.println("Click on Submit");
//		System.out.println("Validation");
//	}

	public void createUser(MyEncapsulation obj) { //createAutomationForm
		
		if(obj.getFname()!= null) {
			//selenium code to enter the first name
			System.out.println("Enter the FirstName"+obj.getFname());
		}
		
		if(obj.getLname()!= null) {
			//selenium code to enter the first name
			System.out.println("Enter the LastName"+obj.getLname());
		}
		
		if(obj.getMobile()!= null) {
			//selenium code to enter the first name
			System.out.println("Enter the Mobile"+obj.getMobile());
		}
		
		if(obj.getAddress()!= null) {
			//selenium code to enter the first name
			System.out.println("Enter the Address"+obj.getAddress());
		}
		
		if(obj.getEmail()!= null) {
			//selenium code to enter the first name
			System.out.println("Enter the Email"+obj.getEmail());
		}
		
		if(obj.getAge()!= 0) {
			//selenium code to enter the first name
			System.out.println("Enter age"+obj.getAge());
		}
		
		System.out.println("Click on Submit");
		System.out.println("Check the validation");
	}

}
