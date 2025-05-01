package oopsConcepts.abstraction;

public abstract class MyAbstractChildClass extends MyAbstractions{
	
	public abstract void method4(); // unimplemented method.
	
	@Override
	public void method3() {
		System.out.println("In Method 3");
		
	}

}
