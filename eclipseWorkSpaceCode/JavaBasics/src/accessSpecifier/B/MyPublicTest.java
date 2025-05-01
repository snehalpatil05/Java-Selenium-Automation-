package accessSpecifier.B;

import accessSpecifier.A.MyPublicPrivateModifier;

public class MyPublicTest {

	public static void main(String[] args) {
		MyPublicPrivateModifier obj = new MyPublicPrivateModifier();
		System.out.println(obj.i);
		obj.method1();

	}

}
