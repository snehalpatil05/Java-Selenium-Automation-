package accessSpecifier.A;

public class MyProtectedAS {

	protected int x = 51;

	protected void method1() {
		System.out.println("I'm trying to access Protected Method1");
	}

	public static void main (String[] args) {

		MyProtectedAS obj = new MyProtectedAS();
		obj.method1();    
		System.out.println(obj.x);
	}

}

//I'm trying to access Protected method / variables in the same class.
