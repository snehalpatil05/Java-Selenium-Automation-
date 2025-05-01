package oopsConcepts.inheritance.polymorphism;

public class MethodOverloading {
	
	public boolean createUser(String name, int userId) { //Method Overloading is not dependent on return type.
		System.out.println("Name: "+name);
		System.out.println("User ID: "+userId);
		return false;
	}
	
	
	public boolean createUser(String name, int userId, String email) {
		System.out.println("Name: "+name);
		System.out.println("User ID: "+userId);
		System.out.println("Email ID: "+email);
		return true;
	}

	public void createUser(int userId, String name) {
		System.out.println("Name: "+name);
		System.out.println("User ID: "+userId);
	}
	
	public void createUser(int userId) {
		System.out.println("User ID: "+userId);
	}
	
	public void createUser(String name) {
		System.out.println("Name: "+name);
	}
	
	public void createUser() {
		System.out.println("Name: "+"Rinky");
		System.out.println("User ID: "+"001");
	}
}


//Method Overloading depends on 4 factors:
//1. datatype
//2. Number of parameters
//3. signature (Sequence of parameters)
//4. Method Overloading is not dependent on return type.