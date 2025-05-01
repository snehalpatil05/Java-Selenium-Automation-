package oopsConcepts.myInterface;

public interface MyInterface {

// Interface itself is an Abstract by default.
//	No need to declare Abstract explicitly.
		
	public void method1();		//abstract Method
	public void method2();		//abstract Method
	
	public default void method3() {
		System.out.println("In Method 3");
		
	}
	
	public static void method4() {
		System.out.println("In Method 4");
		
	}
	
//	public void method5() {   // this is not allowed
//		System.out.println("In Method 5);
//		
//	}

	
}


// Can I Implement Methods in Interface ? -> Yes, but method should be either static or default.
// We cannot create object for the abstract class in interface? -> No
//	Where we can implement the Abstract methods declared in Interface? - In Child Class using Inheritance using implements keyword.