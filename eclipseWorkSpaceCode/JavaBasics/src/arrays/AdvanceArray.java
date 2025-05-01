package arrays;

public class AdvanceArray {

	public static void main(String[] args) {
		
		int[] id = {11,12,13,14,15,16,17,18,19};
		
		int arraySize = id.length;
		System.out.println("Size of array is: "+arraySize);
		
		
		// how to read all the values from array
		
		for(int i=0; i<arraySize; i++) {
			System.out.println("Value of array index "+i+ " is "+id[i]);	
		}
		
		System.out.println("Execution completed");
	}

}
