package oopsConcepts.exceptionHandling;

public class TryCatchFinally {

	public static void main(String[] args) {
		System.out.println("Start of Method");

		try {
			System.out.println("Start of the Try block");

			int j = 10;
			int k = j/0; //Arithmetic exception is thrown here
			System.out.println(k);

			System.out.println("End of the Try Block");

		}catch (Exception e) { 	
			System.out.println("In the Catch Block");
			e.printStackTrace();
		}finally {
			System.out.println("In the finally block");
		}

		System.out.println("End of the method");
	}

}
