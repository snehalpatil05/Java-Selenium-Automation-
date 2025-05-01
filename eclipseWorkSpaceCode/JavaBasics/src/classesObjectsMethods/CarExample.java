package classesObjectsMethods;

public class CarExample {
	
	String company = "Toyota"; //default value of string is null
	int modalNo; //default value of int is 0
	boolean status; // boolean is false
	
	CarExample(){ // constructor
		System.out.println("I am in default constructor");
		company = "Nano";
		modalNo = 2024;
	}
	
	public void method1() {
		System.out.println("I am in method1");
		System.out.println("Drive the car of comany "+company+" of modal number "+modalNo);
	}
}


//constructor is a special type of method that is called automatically when object is created.
//It's primary purpose of constructor is to initialize the newly created object.
//Constructor name is similar to class name and it will not have return type.
