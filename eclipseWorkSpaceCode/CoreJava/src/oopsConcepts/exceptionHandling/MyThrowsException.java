package oopsConcepts.exceptionHandling;

import java.io.IOException;

import org.testng.annotations.Test;

public class MyThrowsException {
	
	public void method() throws IOException { 
		throw new IOException("File Not Found");   
		// Checked Exception, hence it gives the validation to add the throw declaration, Since Java handles this type of exception in compile time.
	}
	
//	public void method1() throws IOException {
//		throw new ArithmeticException("Null Issue");   // Unchecked Exception, we need to handle using Try Catch method.
//	}
	
	@Test
	public void testCase() {
		try {
			method();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Regular Code");
	}
	
	
}



// throws works like if any calls the method if the same method want to handle the exception, it will handle using throws,
// If not it wishes to pass on to next method.
// Hence, Throws is like Passing the Parcel Game.
