package oopsConcepts.inheritance.multiLevelInheritance;

public class TestInheritance {

	public static void main(String[] args) {
		
		
//		ParentClass parentObj = new ParentClass();
//		System.out.println(parentObj.i);
//		parentObj.method1();
//		parentObj.method2();
		
		ChildClass childObj = new ChildClass();
		System.out.println(childObj.j);
		childObj.method3();
		
		System.out.println(childObj.i);
		childObj.method1();
		childObj.method2();
		childObj.method3();
		

	}

}
