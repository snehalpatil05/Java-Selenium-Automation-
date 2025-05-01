package oopsConcepts.inheritance.polymorphism;

public class MethodOverridingChild extends MethodOverridingParent{
	
	public void createUser(String name, int id) {
		System.out.println("Name from Child class: "+name);
		System.out.println("User ID from Child class: "+id);
	}
	
	public void deleteUser(int id) {
		System.out.println("Deleted user from Child Class of the User ID: "+id);
	}

}
