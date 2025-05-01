package oopsConcepts.exceptionHandling;

public class MultipleExceptions {

	public static void main(String[] args) {
		System.out.println("Start of Method");

		try {
			System.out.println("Start of the Try block");

			int j = 10;
			int k = j/0;   // this is Arithmetic exception
			System.out.println(k);

			String[] name = {"Snehal", "Apeksha", "Pooja", "Shwetha", "Amrutha"};
			for(int i=0; i<=name.length; i++) {
				System.out.println("value of array index"+i+" is "+name[i]);  //ArrayIndexOutofBound Exception
				// in background it is creating an object for the respective class 
				// new ArrayIndexOutOfBound();
				// whenever the exception occurs. It Creates the object of the Child class - ArrayIndexOutOfBox() and assigning it in the reference variable 'e' of the Exception (parent class).
				// Exception e = new ArrayIndexOutOfBound();
			}
			System.out.println("End of the Try Block");

		}catch (Exception obj) { 	
			//if we add wrong exception class name, and the try block throws some other exception, the system will not execute the catch block. It just terminated at the try block's problematic code line.
			//	Hence it is better to use the parent class Exception which will handle all type of exception.
			// in case of No abnormal code in Try block, the system will escape the Catch block.
			// e is the object of the Exception class.
			System.out.println("In the Catch Block");
			obj.printStackTrace();
		}

		System.out.println("End of the method");

	}

}






