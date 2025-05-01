package classesObjectsMethods;

public class BasicsOfClassAndObjectTest {

	public static void main(String[] args) {
		
		// how to create object.
		// Step1: Declare reference variable //		here "obj" is the reference variable.

		BasicsOfClassAndObject obj1;
		
		// Step2: create the object using new Keyword along with the constructor
		
		obj1 = new BasicsOfClassAndObject();
		
		// constructor is also a method / class name along with parentheses
		// When method name is similar to class name, it is called as constructor.
		//	combining step1 & step2
		
		BasicsOfClassAndObject obj2 = new BasicsOfClassAndObject();
		System.out.println(obj1.i);
		System.out.println(obj1.name);
		obj1.method1();
		
		
	}

}


//ClassName refVar = New ClassName();
// ClassName --> Name of the Class
// refVar --> The reference variable that points to the object, it will have the address of the object
// new --> allocates the memory for the object in heap memory
// className(); --> it calls the constructor to initialize the object

