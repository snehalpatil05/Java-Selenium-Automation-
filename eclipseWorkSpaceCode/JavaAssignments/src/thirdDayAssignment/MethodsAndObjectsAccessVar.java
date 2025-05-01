package thirdDayAssignment;

public class MethodsAndObjectsAccessVar {
	String accessibleByAll = "TV"; //global variable
	
	public void cook() {
		// TODO Auto-generated method stub
		String var = "Prepare Food in the kitchen"; //Local or Private variable
		System.out.println("cooking");
	}
	
	public void worship() {
		// TODO Auto-generated method stub
		String var = "Worship god at temple";  //Local or Private variable
		System.out.println("praying");
	}
 

	public static void main(String[] args) {   //main door is called main method in Java
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to Java Automation");
		
		MethodsAndObjectsAccessVar obj = new MethodsAndObjectsAccessVar(); //key to enter main door / Main Method
		System.out.println(obj.accessibleByAll);
		obj.cook();
		obj.worship();
		

	}

}
