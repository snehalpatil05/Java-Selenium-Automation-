package oopsConcepts.myInterface.multipleInheritance;

import org.testng.annotations.Test;

import oopsConcepts.myInterface.MyInterface;
import oopsConcepts.myInterface.MyInterfaceChild;

public class TestClassForMIinterface {
	
	@Test
	public void testcase() {
		
		MITaskInterfaceClass obj = new MITaskInterfaceClass();
		obj.method1();
		obj.method2();
		obj.method3();
	}

}
