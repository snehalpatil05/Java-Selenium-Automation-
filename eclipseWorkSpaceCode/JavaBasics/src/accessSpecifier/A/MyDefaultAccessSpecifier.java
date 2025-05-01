package accessSpecifier.A;

public class MyDefaultAccessSpecifier {
	
//	public int a = 15;
//	private int k = 20; 
	int i = 10;

	void method1() {
		System.out.println("In Default Method1");
	}
	
//	public void method2() {
//		System.out.println("In Default Method1");
//	}
//	
//	private void method3() {
//		System.out.println("In Default Method1");
//	}
	
	
	public static void main (String[] args) {
		
		MyDefaultAccessSpecifier obj = new MyDefaultAccessSpecifier();
		obj.method1();
		System.out.println(obj.i);
//		obj.method2();
//		obj.method3();
	}
	
}
