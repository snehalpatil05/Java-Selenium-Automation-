package assignments;

public class ArrayAssignment3 {

	public static void main(String[] args) {
		//		Write a Java program to count how many times a 2 appears in an array{1, 2, 3, 2, 4, 2, 5} 

		int[] numbers = {1, 2, 3, 2, 4, 2, 5};
		int check=2;
		int count=0;

		for(int i=0; i<numbers.length; i++) {
			if(numbers[i]==check) count++;
			}
		
//		
//        for (int num : numbers) {
//            if (num == check) count++;
//        }
		
		
        System.out.println(check+" appears " + count + " times.");

	}

}
