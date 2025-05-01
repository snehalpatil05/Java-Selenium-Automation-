package oopsConcepts.myInterface;

import org.testng.annotations.Test;

public class MyInterfaceTest {
	
	@Test
	public void testcase() {
		
		MyInterfaceChild obj = new MyInterfaceChild();
		obj.method1();
		obj.method2();
		obj.method3();
		MyInterface.method4();
		
	}
}	

