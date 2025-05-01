package classesObjectsMethods;

public class Calculator {
	
	
	public void add(int a, int b) {
		int c=a+b;
		System.out.println("The sum of " +a+ " and " +b+ " is: "+c);
	}
	
	public void subtraction(int a, int b) {
		int subt=a-b;
		System.out.println("The difference of " +a+ " and " +b+ " is: "+subt);
	}
	
	public void multiplication(int a, int b) {
		int mul=a*b;
		System.out.println("The product of " +a+ " and " +b+ " is: "+mul);

	}
	
	public void division(int a, int b) {
		int div=a/b;
		System.out.println("The quotient of " +a+ " and " +b+ " is: "+div);

	}
}
