package oopsConcepts.exceptionHandling;

public class MyIndexOutOfBound {

	public static void main(String[] args) {
		
		System.out.println("Start of Method");
		String[] name = {"Snehal", "Apeksha", "Pooja", "Shwetha", "Amrutha"};
		
		for(int i=0; i<=name.length; i++) {
			System.out.println("value of array index"+i+" is "+name[i]);
		}
		
		System.out.println("End of Method");

	}

}
