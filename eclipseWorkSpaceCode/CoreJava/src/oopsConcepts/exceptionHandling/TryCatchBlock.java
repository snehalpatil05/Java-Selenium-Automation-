package oopsConcepts.exceptionHandling;

public class TryCatchBlock {

public static void main(String[] args) {
		
		System.out.println("Start of Method");
		
		try {
			System.out.println("Start of the Try block");
			int i = 10;
			int k = i/0;   // this is the problematic code line.
			System.out.println(k);
			System.out.println("End of the Try Block");
			
		}catch (Exception e) { 					// in case of No abnormal code in Try block, the system will escape the Catch block.
			// e is the object of the Exception class.
			System.out.println("In the Catch Block");
			e.printStackTrace();
		}
		
		System.out.println("End of the method");
	}

}
