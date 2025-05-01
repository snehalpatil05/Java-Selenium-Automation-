package variables;

public class StringMethods {

	public static void main(String[] args) {
		String s1 = "Java";  
// since String is a class, s1 is a reference variable for the String Class.
		String s2 = "selenium";
		
// Concatenation Operator:
		
		System.out.println("Value of s1 is "+s1);
		
		
		int i = 10;
		int j = 20;
		
		System.out.println(i+j);  //Addition of 2 integers
		System.out.println(s1+" "+i); // combining string and integer
		String s5 = (s1+" "+s2); // combining 2 strings
		System.out.println(s5);
		
//		String Methods:
		String result = s1.toLowerCase(); // return type is string for the toUppercase() method.
		System.out.println(result);
		
		System.out.println(s2.toUpperCase());
		
//		boolean isEqual = s1.equals(s2);
//		System.out.println(isEqual);
		
		String s3 = "Java";
		String s4 = new String("Java");
		
//		System.out.println(s1==s3);  // True
//		System.out.println(s1.equals(s3)); // True
//		
//		System.out.println(s1==s4);			// False
//		System.out.println(s1.equals(s4));  // True
		
// == -> operator verifies if both the strings referring to the same memory location
// equals() -> it will check if both string has same value.
		
		System.out.println(s3.replace("a", "i"));
		System.out.println(s3.length());
		
//		String var[] = s5.split("a");  //split with a letter
//		for (String string : var) {
//			System.out.println(string);
//		}
		
//		String var[] = s5.split(" "); //split from a space
//		for (String string : var) {
//			System.out.println(string);
//		}
		
		String var[] = s5.split(" ");  //split based on index value of String array
		System.out.println(var[0]);
		System.out.println(var[1]);		
		

	}

}
