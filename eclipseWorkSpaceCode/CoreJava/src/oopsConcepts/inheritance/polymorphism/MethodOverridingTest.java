package oopsConcepts.inheritance.polymorphism;

public class MethodOverridingTest {

	public static void main(String[] args) {
		
		MethodOverridingParent parentObj = new MethodOverridingParent();
		parentObj.createUser("Swapna", 410);
		parentObj.deleteUser(001);
		
		MethodOverridingChild childObj = new MethodOverridingChild();
		childObj.createUser("Rima", 501);
		childObj.deleteUser(002);
		childObj.updateUser(001);
	}

}


// with the Method overriding we can't access the methods of the parent class 
//through the child class though we have inherited the parent class at child class.
