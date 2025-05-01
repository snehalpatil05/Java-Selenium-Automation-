package oopsConcepts.myInterface.multipleInheritance;

public class MITaskInterfaceClass implements MIinterface1, MIinterface2 {

	@Override
	public void method3() {
		System.out.println("In Method3");		
	}

	@Override
	public void method1() {
		System.out.println("In Method1");	
	}

	@Override
	public void method2() {
		System.out.println("In Method2");		
	}
}
