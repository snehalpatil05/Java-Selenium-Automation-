package oopsConcepts.inheritance.polymorphism;

public class MethodOverridingParent {
		
	public void createUser(String name, int id) {
		System.out.println("Name from Parent class: "+name);
		System.out.println("User ID from Parent class: "+id);
	}
	
	public void deleteUser(int id) {
		System.out.println("Deleted user from Parent Class of the User ID: "+id);
	}
	
	public void updateUser(int id) {
		System.out.println("Updated user from Parent Class of the User ID: "+id);
	}

}
