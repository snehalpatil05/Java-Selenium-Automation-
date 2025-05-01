package seleniumBasics;

public class ExampleSeleniumCode {
	
	public void testCase1() {
		System.out.println("TC1 passed");
	}
	
	public void testCase2() {
		System.out.println("TC2 passed");
	}
	
	public void testCase3() {
		System.out.println("TC3 passed");
	}
	
	public void testCase4() {
		System.out.println("TC4 passed");
	}
	
	public void testCase5() {
		System.out.println("TC5 passed");
		int k = 10/0;
	}

	public static void main(String[] args) {
		
		ExampleSeleniumCode obj = new ExampleSeleniumCode();
		try {
			obj.testCase1();
		}catch (Exception e){
			e.printStackTrace();
		}
		obj.testCase2();
		obj.testCase3();
		obj.testCase4();
		obj.testCase5();
	}
}
