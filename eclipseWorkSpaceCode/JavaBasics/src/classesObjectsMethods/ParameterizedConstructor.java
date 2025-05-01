package classesObjectsMethods;

public class ParameterizedConstructor {
	
	String company = null; //default value of string is null
	int modalNo; //default value of int is 0
	boolean status; // boolean is false
	
	ParameterizedConstructor(){ //default constructor
		System.out.println("I am in default constructor");
		company = "Nano";
		modalNo = 2024;
	}
	
	ParameterizedConstructor(String companyName){ //this is parameterized constructor
		System.out.println("I am in parameterized constructor");
		company = companyName;
		modalNo = 2024;
	}
	
	public void method1() {
		System.out.println("I am in method1");
		System.out.println("Drive the car of comany "+company+" of modal number "+modalNo);
	}
}


