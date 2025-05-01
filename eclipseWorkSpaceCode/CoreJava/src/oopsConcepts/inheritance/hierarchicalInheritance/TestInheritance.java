package oopsConcepts.inheritance.hierarchicalInheritance;

public class TestInheritance {

	public static void main(String[] args) {
	
		ParentClassA parentObj = new ParentClassA();
		parentObj.method1();

		ChildClassB childBObj = new ChildClassB();
		childBObj.method2();
		
		ChildClassC childCObj = new ChildClassC();
		childCObj.method3();
		
		GrandChildClassBD grandChildOfB1 = new GrandChildClassBD();
//		grandChildOfB1.method1();
//		grandChildOfB1.method2();
		grandChildOfB1.method4();
		
		GrandChildClassBE grandChildOfB2 = new GrandChildClassBE();
//		grandChildOfB2.method1();
//		grandChildOfB2.method2();
		grandChildOfB2.method5();
		
		GrandChildClassCF grandChildOfC1 = new GrandChildClassCF();
//		grandChildOfC1.method1();
//		grandChildOfC1.method3();
		grandChildOfC1.method6();
		
		GrandChildClassCG grandChildOfC2 = new GrandChildClassCG();
//		grandChildOfC2.method1();
//		grandChildOfC2.method3();
		grandChildOfC2.method7();
		
		GrandChildClassCH grandChildOfC3 = new GrandChildClassCH();
//		grandChildOfC3.method1();
//		grandChildOfC3.method3();
		grandChildOfC3.method8();			
		
	}

}
