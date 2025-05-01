package classesObjectsMethods;

public class ReturnTypeTest {

	public static void main(String[] args) {

		ReturnType obj = new ReturnType();
//		obj.add();
//		obj.add(25, 11);
		
		int a = 12;
		int b = 3;
		int result = obj.add(a, b);
		System.out.println("Sum of "+a+ " and "+b+ " is "+ result);
		
		int subtraction_result = obj.subtraction(a, b);
		System.out.println("The difference of "+a+ " and "+b+ " is "+ subtraction_result);
		
		int multiplication_result = obj.multiplication(a, b);
		System.out.println("The product of "+a+ " and "+b+ " is "+ multiplication_result);

		int division_result = obj.division(a, b);
		System.out.println("The quotient of "+a+ " and "+b+ " is "+ division_result);

	}

}
