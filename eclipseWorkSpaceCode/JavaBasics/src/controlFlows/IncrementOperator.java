package controlFlows;

public class IncrementOperator {

	public static void main(String[] args) {
//		
//		int x = 5;
//		int y = ++x; // x+1
//		System.out.println("value of x is : "+x); //6
//		System.out.println("value of y is : "+y); //6
//		
//		int a = 5;
//		int b = a++; // a+1
//		System.out.println("value of a is : "+a); //6
//		System.out.println("value of b is : "+b); //5
//		
//		
//		int l = 5;
//		int m = ++l; // x+1
//		int n = l++;
//		System.out.println("value of l is : "+l); // 7
//		System.out.println("value of m is : "+m); // 6
//		System.out.println("value of n is : "+n); // 6
		
		
		        int array_variable[] = new int[10];
		        for (int i = 0; i < 10; ++i) {
		            array_variable[i] = i;
		            System.out.print(array_variable[i] + " ");
		            i++;
		        }
		    }
		}
		



//++x : pre increment
//x++ : post increment