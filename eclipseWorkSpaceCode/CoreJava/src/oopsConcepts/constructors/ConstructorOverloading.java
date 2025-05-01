package oopsConcepts.constructors;

public class ConstructorOverloading {
	
	int i;
	String name;
	
	
	ConstructorOverloading(){ 
		System.out.println("In Default constructor");
	}
	
	ConstructorOverloading(int k, String name){ 
		System.out.println("In Parameterized constructor with int and String");
	}
	
	ConstructorOverloading(String name, int k){ 
		System.out.println("In Parameterized constructor with String and int");
	}
	
	ConstructorOverloading(String name){ 
		System.out.println("In Parameterized constructor with String");
	}
	
	ConstructorOverloading(int m){
		System.out.println("In Parameterized constructor with int");
	}
	
	ConstructorOverloading(String uname, String pwd){ 
		System.out.println("In Parameterized constructor with 2 string parameters");
	}

}



// Constructor Overloading depends on 3 factors:
//1. datatype
//2. Number of parameters
//3. signature (Sequence of parameters)


