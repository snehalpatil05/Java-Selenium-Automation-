package accessSpecifier.A;

public class MyPublicPrivateModifierTest {

	public static void main(String[] args) {
		
		MyPublicPrivateModifier obj = new MyPublicPrivateModifier();
		
		System.out.println(obj.i);
		obj.method1();
	}

}

// public variables can be accessed from different class within the same package.

// Private variables can be accessed only within the same class.