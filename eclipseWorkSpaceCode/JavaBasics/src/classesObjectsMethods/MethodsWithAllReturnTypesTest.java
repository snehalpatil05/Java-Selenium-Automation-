package classesObjectsMethods;

public class MethodsWithAllReturnTypesTest {

	public static void main(String[] args) {
		
		MethodsWithAllReturnTypes obj = new MethodsWithAllReturnTypes();
		
		int num = 14;
		boolean status = obj.isEven(num);
		System.out.println("Return method from isEven method is "+status);
		if(status) {
			System.out.println(num+" is even");
		}else {
			System.out.println(num+" is odd");

		}
		
		System.out.println("------------------------------------------");
		
		String value = obj.toSmallerCase("NIHARIKA");
		System.out.println("The lower case value is: "+value);
		
		System.out.println("------------------------------------------");

		int age = obj.calculateAge(1995);
		System.out.println("Age is "+age);
	}

}
