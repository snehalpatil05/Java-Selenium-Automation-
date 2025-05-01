package classesObjectsMethods;

public class StaticMethodTest {

	public static void main(String[] args) {
		
		StaticMethod obj = new StaticMethod();
		
		System.out.println(obj.i);
		System.out.println(StaticMethod.j);   // accessing the static method/variable using class name in a static way
		
		obj.method1();
		StaticMethod.method2();    // accessing the static method/variable using class name in a static way
		StaticMethod.method3();		// accessing the static method/variable using class name in a static way

	}

}
