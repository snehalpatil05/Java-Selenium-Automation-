package controlFlows;

public class DecrementOperator {

	public static void main(String[] args) {
		
		int x = 5;
		int y = --x; // x-1 // Pre Decrement Operator
		System.out.println("value of x is : "+x); //4
		System.out.println("value of y is : "+y); //4
		
		
		int a = 5;
		int b = a--; // a-1 Post Decrement Operator
		System.out.println("value of a is : "+a); //4
		System.out.println("value of b is : "+b); //5
		
		int l = 10;
		int m = --l; // x-1 // l = 9, m=9
		int n = l--; // n=9, l=8
		System.out.println("value of l is : "+l); // 
		System.out.println("value of m is : "+m); // 
		System.out.println("value of n is : "+n); // 

	}

}
