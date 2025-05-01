package assignments;

public class ArrayAssignment5 {

	public static void main(String[] args) {
// Write a Java program to reverse the elements of an array {10, 20, 30, 40, 50} - 
// output should be 50, 40, 30, 20, 10

		int[] myArray = {10, 20, 30, 40, 50};

		for(int i=myArray.length-1; i>=0; i--) {
			System.out.print(myArray[i]);
			if (i != 0) {  
				System.out.print(", ");  // Print comma only between numbers
			}

		}		
	}

}
