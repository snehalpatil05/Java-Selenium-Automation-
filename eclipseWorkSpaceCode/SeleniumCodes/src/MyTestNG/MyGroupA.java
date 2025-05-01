package MyTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class MyGroupA {
	
	@Test(groups = { "smoke" })
	public void test1(){
		System.out.println("I m in smoke test 1");
	}
	
	@Test(groups = { "smoke","fundTrasfer" })
	public void test2(){
		System.out.println("I m in smoke & fT test 2");
	}
	
	@Test(groups = { "Regression", "smoke" })
	public void test3(){
		System.out.println("I m in smoke & regression test 3");
	}
	
	@Test(groups = { "Regression" })
	public void test4(){
		System.out.println("I m in regression test 4");
	}

}
