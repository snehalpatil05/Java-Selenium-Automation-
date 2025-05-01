package oopsConcepts.inheritance.singleInheritance;

import oopsConcepts.inheritance.multiLevelInheritance.GrandChildClass;

public class TestInheritance {

	public static void main(String[] args) {
		
		
//		ParentClass parentObj = new ParentClass();
//		System.out.println(parentObj.i);
//		parentObj.method1();
//		parentObj.method2();
		
//		ChildClass childObj = new ChildClass();   // single level inheritance
//		System.out.println(childObj.j);		
//		System.out.println(childObj.i);
//		childObj.method1();
//		childObj.method2();
//		childObj.method3();
		
		
		GrandChildClass grandChildObj = new GrandChildClass();  // multi-level inheritance (Child class inherited Parent class, grandchild class inherited the Child class)
		grandChildObj.method1();
		grandChildObj.method2();
		grandChildObj.method3();
		grandChildObj.method4();
		grandChildObj.method5();
				

	}

}
