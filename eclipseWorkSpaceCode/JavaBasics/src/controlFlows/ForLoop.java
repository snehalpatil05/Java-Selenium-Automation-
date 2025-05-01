package controlFlows;

public class ForLoop {

	public static void main(String[] args) {
		
		for(int i=1; i<10; i++) {
			
			System.out.println("Value of i is: "+i);
			
		}
		
		System.out.println("End of For Loop");

	}

}

// 1st iteration i=1, condition 1 <10 is true, so it prints the statement.And increases i value +1. i=2 now.
// 2nd iteration i=2, condition 2 <10 is true, so it prints the statement. And increases i value +1. i= 3 now.
// .
// .
// 9th iteration, i=9, condition 9 <10 is true, so it prints the statement. And increases i value +1. i= 10 now.
// 10th iteration, i=10, condition 10 <10 is false, so it comes out of the loop. 