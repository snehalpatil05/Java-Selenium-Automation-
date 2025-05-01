package oopsConcepts.constructors;

public class MyConstructor {
	
	int i;         //class variable
	String name;   //class variable

	
	MyConstructor(){   
		// Default Constructor
		// constructor  should not have any return type / No Access modifier / It is special type of method without return type.
		System.out.println("In Default constructor");
		this.i = 5;
		this.name = "Surekha";
		System.out.println("Name is "+name);
		System.out.println("The value of i is "+i);

	}
	
	MyConstructor(int k, String username){
		System.out.println("This is parameterized constructor");
		this.i = k;
		this.name = username;
		System.out.println("Name is "+name);
		System.out.println("The value of i is "+i);
	}
	
	public void method() {
		System.out.println(i);
		System.out.println(name);
	}

}
