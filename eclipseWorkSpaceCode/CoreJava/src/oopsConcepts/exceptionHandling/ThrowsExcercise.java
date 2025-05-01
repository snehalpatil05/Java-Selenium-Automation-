package oopsConcepts.exceptionHandling;

import java.io.IOException;
import java.sql.SQLException;

import org.testng.annotations.Test;

public class ThrowsExcercise {
	
	public void method1() throws IOException, SQLException {
		System.out.println("In Method1");
		method2();
		throw new IOException("Error observation in IO Operation");
	}
	
	public void method2() throws SQLException {
		System.out.println("In Method2");
		throw new SQLException("Error observation in SQL Operation");
	}
	
	@Test
	public void testcase() {
		
		try {
			method1();
		} catch (IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Regular code");
	}

}
