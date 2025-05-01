package myCollection;

import java.util.ArrayList;

public class MyArrayList {
	
	public static void main(String[] args) {
		
		String[] var = {"a", "b"}; //size is fixed
//		var[2] = "test";
		
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("Snehal");
		myList.add("Sourabh");
		myList.add("Surekha");
		myList.add("Surekha");
		
		for (String name : myList) {
			System.out.println("Value is: "+name);
		}
		
		System.out.println("------------------------------------");
		myList.add(0, "Ela"); 
//		myList.remove(1);
		myList.remove("Surekha");
		
		for (String name : myList) {
			System.out.println("Updated value is: "+name);
		}
		System.out.println(myList.contains("Puja"));
	}
}


// 0 - Snehal
// 1 - Sourabh
// 2 - Surekha


//0 - Ela
//1 - Snehal
//2 - Sourabh
//3 - Surekha

//0 - Ela
//1 - Sourabh
//2 - Surekha


// Array list Allows duplicate values
// In case of duplicate values  - while removing the recent one gets removed.
// Order of insertion is maintained

