package accessSpecifier.B;

import accessSpecifier.A.MyDefaultAccessSpecifier;

public class MyDefaultAccessSpecifierTest2 {

	public static void main(String[] args) {
		
		MyDefaultAccessSpecifier obj = new MyDefaultAccessSpecifier();
//		obj.method1(); // we can't access default method or variable from different package.
		
	}

}
