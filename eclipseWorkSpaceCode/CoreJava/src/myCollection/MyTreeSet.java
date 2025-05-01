package myCollection;

import java.util.Set;
import java.util.TreeSet;

public class MyTreeSet {

	public static void main(String[] args) {

		Set<String> mySet = new TreeSet<String>();
		mySet.add("C");
		mySet.add("z");
		mySet.add("c");
		mySet.add("a");
		mySet.add("p");
		mySet.add("P");
		mySet.add("12");
		
		for (String item : mySet) {
			System.out.println(item);
		}
	}
}


// Is insertion order maintained in HashMap? -> No
// Prints data is ascending order and is case sensitive.
// if any integer is given as string, that will be printed first.
// upper case will be prioritized first 
// Duplicates are not allowed.