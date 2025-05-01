package arrays;

public class ArrayWithForEachLoop {

	public static void main(String[] args) {
		
		String[] name = {"Snehal", "Apeksha", "Pooja", "Shwetha", "Amrutha"};
		
		//for loop
//		for(int i=0; i<name.length; i++) {
//			System.out.println("value of array index"+i+" is "+name[i]);
//		}
		
		
		// foreach loop
		for (String var : name) {
			System.out.println("value is " +var);
		}
		
		System.out.println("ForEach loop completed");
	}

}
