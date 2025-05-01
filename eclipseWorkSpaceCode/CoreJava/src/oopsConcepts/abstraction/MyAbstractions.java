package oopsConcepts.abstraction;

public abstract class MyAbstractions { 			//declaring abstract class
	
	public void method1() { 		// non abstract method
		System.out.println("This is a Non Abstract Method");
	}
	
	public abstract void method2(); //unimplemented method
	// declaring a method without body or without code and with abstract keyword -> it is called abstract methods
	
	public abstract void method3();
}



// we can have abstract method only in a class.
// we can have only non abstract method only in a abstract class.
// we can have non abstract and abstract method in a abstract class.
// if class is not having abstract keyword, we can't have abstract method in the same class.
// Can I create object for abstract class? - NO.
// Where we can implement the Abstract methods? - In Child Class using Inheritance  using extends keyword.
// In Child class, can we have Abstract methods? - Yes, Class should be an Abstract is the condition.