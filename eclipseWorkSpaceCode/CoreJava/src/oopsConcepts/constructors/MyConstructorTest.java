package oopsConcepts.constructors;

public class MyConstructorTest {

	public static void main(String[] args) {
		
//		MyConstructor obj = new MyConstructor();  // Object for the constructor is invoked
//		obj.method1();

		MyConstructor obj = new MyConstructor();
		System.out.println("----------------------------");
		MyConstructor obj1 = new MyConstructor(2, "Sourabh");
		System.out.println("----------------------------");
		obj.method();
	}

}
