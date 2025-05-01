package oopsConcepts.abstraction;

import org.testng.annotations.Test;

public class MyAbstractionTestClass {
	
	@Test
	public void testcase() {
		
		MyAbstractionChild2 obj = new MyAbstractionChild2();
		obj.method1();
		obj.method2();
		obj.method3();
		obj.method4();
		
	}

}
