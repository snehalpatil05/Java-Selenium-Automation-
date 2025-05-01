package accessSpecifier.A;

public class MyPublicPrivateModifier {
	
	public int i = 10;
	private int j = 20;

	public void method1() {
		System.out.println("In Public Method1");
	}
	
	private void method2() {
		System.out.println("In Public Method2");
	}
	
	public static void main (String[] args) {
		
		MyPublicPrivateModifier obj = new MyPublicPrivateModifier();
		obj.method1();
		obj.method2();
		System.out.println(obj.i);
		System.out.println(obj.j);
	}
	
}
