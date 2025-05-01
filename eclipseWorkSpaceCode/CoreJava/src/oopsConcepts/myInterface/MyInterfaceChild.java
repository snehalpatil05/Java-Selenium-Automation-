package oopsConcepts.myInterface;

public class MyInterfaceChild implements MyInterface {

	@Override
	public void method1() {
		System.out.println("In method 1");
		
	}

	@Override
	public void method2() {
		System.out.println("In method 2");		
	}
	
//	public void testcase() {		// we cannot create object for interface
//		MyInterface obj = new MyInterface();
//	}
	

}
