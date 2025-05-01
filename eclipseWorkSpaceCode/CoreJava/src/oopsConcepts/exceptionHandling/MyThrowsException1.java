package oopsConcepts.exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.testng.annotations.Test;

public class MyThrowsException1 {
	
	public void method() throws FileNotFoundException {  // we are handling this checked exception un the testCase method.
		FileInputStream obj = new FileInputStream("C:\\training\testdata.xls"); // Path for the excel file given
	}
	
	
	@Test
	public void testCase() {
		try {
			method();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("In catch Block");
			e.printStackTrace();
		}
		
		System.out.println("Regular Code");
	}
	
}
