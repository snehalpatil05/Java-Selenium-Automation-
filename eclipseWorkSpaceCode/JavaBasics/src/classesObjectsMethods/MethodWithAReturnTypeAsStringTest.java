package classesObjectsMethods;

public class MethodWithAReturnTypeAsStringTest {

	public static void main(String[] args) {
		
		MethodWithAReturnTypeAsString obj = new MethodWithAReturnTypeAsString();
		String message = obj.greetUser();
//		obj.greetUser();
		System.out.println(message);

//		System.out.println(obj.greetUser())

		obj.greetUser1();
		
		String var = obj.greetUser2("Aasha");
		System.out.println(var);
	}

}
