package arrays;

public class MyArray {

	public static void main(String[] args) {
		
//		int id1 = 1;
//		int id2 = 2;
//		int id3 = 3;
//		int id4 = 4;
//		int id5 = 5;
		
		// declaring the array of size 10.
		
		int[] id= new int[5];
		
// array name is id
// data type of array is int
// size of array is 5
		
		
		// how to insert value to the array
		
		id[0]= 1;
		id[1]= 2;
		id[2]= 3;
		id[3]= 4;
		id[4]= 5;
//		id[5]= 6; --> this line will cause error because array size is 5 and we are accessing the index of 5
		
		// to access the value of array, we need to use index
		
		System.out.println(id);
		System.out.println(id[0]);
		System.out.println(id[1]);

	}
}
