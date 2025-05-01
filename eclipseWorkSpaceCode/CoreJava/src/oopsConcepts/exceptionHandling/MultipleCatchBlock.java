package oopsConcepts.exceptionHandling;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		System.out.println("Start of Method");

		try {
			System.out.println("Start of the Try block");

			int j = 10;
			int k = j/0;   // this is Arithmetic exception

			String[] name = {"Snehal", "Apeksha", "Pooja", "Shwetha", "Amrutha"};
			for(int i=0; i<=name.length; i++) {
				System.out.println("value of array index"+i+" is "+name[i]); 
			}
			System.out.println("End of the Try Block");

//		}catch (Exception e) { 	
//			System.out.println("In the Grandparent Exception Catch Block");
//			e.printStackTrace();
			// If we add Garnd-parent Exception class catch block at the top and rest all exception below, then the java throws an Compile error since the below mentioned is an unreachable code.

			
			
		}catch (ArrayIndexOutOfBoundsException e) { 	
			System.out.println("In the Array Index Out Of Bounds Exception Catch Block");
			e.printStackTrace();
//		}catch (ArithmeticException e) { 	
//			System.out.println("In the Arithmetic Exception Catch Block");
//			e.printStackTrace();
		}catch (NullPointerException e) { 	
			System.out.println("In the Null Pointer Exception Catch Block");
			e.printStackTrace();
		}catch (RuntimeException e) { 	// Arithmetic Exception is the child class of Runtime exception class.
			System.out.println("In the Runtime Exception Catch Block");
			e.printStackTrace();
		}catch (Exception e) { 	// Arithmetic Exception is the child class of Runtime exception class.
			System.out.println("In the Grandparent Exception Catch Block");
			e.printStackTrace();
		}

		System.out.println("End of the method");

	}

}
