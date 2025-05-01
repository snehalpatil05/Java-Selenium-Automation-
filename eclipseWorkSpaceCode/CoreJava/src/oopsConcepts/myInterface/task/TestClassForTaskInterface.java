package oopsConcepts.myInterface.task;

import org.testng.annotations.Test;

import oopsConcepts.myInterface.MyInterface;
import oopsConcepts.myInterface.MyInterfaceChild;

public class TestClassForTaskInterface {
	
	@Test
	public void testcase() {
		
		MyTaskInterfaceClass obj = new MyTaskInterfaceClass();
		obj.method1();
		obj.method2();
		obj.method3();
	}

}
