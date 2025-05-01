package assignments;

public class ArrayAssignment4 {

	public static void main(String[] args) {
//Write a Java program to find the index of a grapes in an array  Array: {"apple", "banana", "cherry", "grapes", "orange"} 
//If the element is not found, return -1.
		
		String[] fruits = {"apple", "banana", "cherry", "grapes", "orange"};
		
		String toFind = "grapes";
		
		for(int i=0; i<fruits.length; i++) {
			if(fruits[i].equals(toFind)) {
				System.out.println(toFind+" is at the index "+i+" in the fruits array" );
			}		
		}

	}

}
