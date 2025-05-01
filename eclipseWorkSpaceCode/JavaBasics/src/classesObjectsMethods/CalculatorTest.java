package classesObjectsMethods;

public class CalculatorTest {

	public static void main(String[] args) {

		Calculator obj = new Calculator();
		
		int a = 12;
		int b = 3;
		obj.add(a, b);
		obj.subtraction(a, b);
		obj.multiplication(a, b);
		obj.division(a, b);

	}

}
