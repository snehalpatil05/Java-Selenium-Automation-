package classesObjectsMethods;

public class ReturnType {
	
//	public void add() {
//		int a = 10;
//		int b = 5;
//		int c = a+b;
//		System.out.println("Sum of "+a+ " and "+b+" is "+c);
//	}
//	
//	public void add(int a, int b) {
//		int c=a+b;
//		System.out.println("Sum of "+a+ " and "+b+" is "+c);
//	}
	
	public int add(int a, int b) {
		int c=a+b;
		return c;
	}
	
	public int subtraction(int a, int b) {
		int subt=a-b;
		return subt;
	}
	
	public int multiplication(int a, int b) {
		int mul=a*b;
		return mul;
	}
	
	public int division(int a, int b) {
		int div=a/b;
		return div;
	}

	

}
