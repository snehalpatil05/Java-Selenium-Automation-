package variables;

public class MyInstanceAndStaticVariablesTest {

	public static void main(String[] args) {
		MyInstanceAndStaticVariables obj = new MyInstanceAndStaticVariables();
		obj.method();
		
		MyInstanceAndStaticVariables obj1 = new MyInstanceAndStaticVariables();
		obj1.method();
		
		obj1.method();
		
		
		//without creating a object we can call static variable in a static way 
		System.out.println(MyInstanceAndStaticVariables.abc);

	}

}
