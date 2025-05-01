package classesObjectsMethods;

public class StaticMethod {
	
	int i = 10;
	static int j = 20;
	
	public void method1() {						// Normal Method / instance / global method
		System.out.println("Normal method");
	}
	
	public static void method2() {				// Static Method
		System.out.println("Static method");   
	}
	
	public static void method3() {			// Static Method
		System.out.println("Static method 2");
	}

}
