package seleniumBasics;

import org.testng.annotations.Test;

public class MyTesting {
	
	@Test  // it is TestNG annotation, from TestNG
	public void testCase1() {
		System.out.println("TC1 passed");
	}
// Whenever we add @Test annotation to any method, that method will be executed in TestNG
	@Test
	public void testCase2() {
		System.out.println("TC2 passed");
		int k = 10/0;
	}
	
	@Test
	public void testCase3() {
		System.out.println("TC3 passed");
	}
	
	@Test
	public void testCase4() {
		System.out.println("TC4 passed");
	}
	
	@Test
	public void testCase5() {
		System.out.println("TC5 passed");
	}

}


//TestNG Advantages:
//1. Creates the Report for - Passed, failed, skipped and logs for the failure TCs
//2. No Need of Main Method
//3. It gives us proper infrastructure
