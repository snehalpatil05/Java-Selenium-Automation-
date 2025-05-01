package arrays;

public class ArrayModification {

	public static void main(String[] args) {
		
		int[] numbers = {10, 20, 30, 40, 50};
		
		for (int i : numbers) {
			System.out.println(i);
		}
		System.out.println("*******************************************");
		
		for (int i : numbers) {
			System.out.println(i*2);			
		}
	
		System.out.println("*******************************************");

		for (int i : numbers) {
			System.out.println("The modified value of array = "+i);
		}
		
		System.out.println("*******************************************");

		for(int i=0; i<numbers.length; i++) {
			numbers[i]*=2;
		}
		

		for (int i : numbers) {
			System.out.println("The modified value of array after multiplying by 2 is = "+i);

		}
	}

}
